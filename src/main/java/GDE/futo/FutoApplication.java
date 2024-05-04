package GDE.futo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;


@SpringBootApplication
public class FutoApplication {

	public static ArrayList<Result> results = new ArrayList<>();
	public static ArrayList<Runner> runners = new ArrayList<>();
	public static ArrayList<Competition> competitions = new ArrayList<>();

	public static void main(String[] args) {
		SpringApplication.run(FutoApplication.class, args);
	}

	/*	CsvImporter.fillDatabase();
		CsvImporter.loadData();*/

}
