package helpers;

//import java.io.File;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class LocalReport {

    public static void main (String[] args){
        String ruta = "D:\\JBMovile\\jb_movile\\build\\reports\\cucumber\\";
        File report= new File(ruta+"JBReport");

        List<String> jsonFiles= new ArrayList<>();
        jsonFiles.add(ruta+"report.json");

        Configuration configuration= new Configuration(report,"JBMovile");
        configuration.setBuildNumber("v0001");
        configuration.addClassifications("SO","Android");
        configuration.addClassifications("Owner","axel");
        configuration.addClassifications("Branch","Develop");

        ReportBuilder reportBuilder= new ReportBuilder(jsonFiles,configuration);
        reportBuilder.generateReports();


    }

    }

