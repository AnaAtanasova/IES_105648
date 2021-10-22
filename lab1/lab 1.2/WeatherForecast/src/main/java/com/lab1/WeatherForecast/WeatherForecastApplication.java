package com.lab1.WeatherForecast;

import com.lab1.WeatherForecast.models.IpmaCityForecast;
import com.lab1.WeatherForecast.services.IpmaService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.logging.Logger;

@SpringBootApplication
public class WeatherForecastApplication {
	private static final int CITY_ID_AVEIRO = 1010500;
	/*
    loggers provide a better alternative to System.out.println
    https://rules.sonarsource.com/java/tag/bad-practice/RSPEC-106
     */
	private static final Logger logger = Logger.getLogger(WeatherForecastApplication.class.getName());

	public static void main(String[] args) {
		SpringApplication.run(WeatherForecastApplication.class, args);
		Retrofit retrofit = new Retrofit.Builder()
				.baseUrl("http://api.ipma.pt/open-data/")
				.addConverterFactory(GsonConverterFactory.create())
				.build();

		IpmaService service = retrofit.create(IpmaService.class);
		Call<IpmaCityForecast> callSync = service.getForecastForACity(CITY_ID_AVEIRO);

		try {
			Response<IpmaCityForecast> apiResponse = callSync.execute();
			IpmaCityForecast forecast = apiResponse.body();

			if (forecast != null) {
				logger.info( "max temp for today: " + forecast.getData().
						listIterator().next().getTMax());
			} else {
				logger.info( "No results!");
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
