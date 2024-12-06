package com.xworkz.collection1.runner;

import com.xworkz.collection1.dto.CollegeDTO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CollegeDTORunner {

    public static void main(String[] args) {
        CollegeDTO collegeDTO = new CollegeDTO();
        Collection<CollegeDTO> collection = new ArrayList<>();

        collection.add(new CollegeDTO("Indian Institute of Science",50000,4000,500,"Jamsetji Tata" ));
        collection.add(new CollegeDTO("Christ University",200000,25000,1000,"St.Kuriakose Elias Chavara" ));
        collection.add(new CollegeDTO("BMS College of Engineering",200000,6000,300,"B.M.Sreenivasaiah" ));
        collection.add(new CollegeDTO("RV College of Engineering",250000,8000,400,"Rashtreeya Sikshana Samithi Trust" ));
        collection.add(new CollegeDTO("Mount Carmel College",150000,5000,200,"Sisters of the CSST Order" ));
        collection.add(new CollegeDTO("National Law School of India University",200000,500,50," Bar Council of India" ));
        collection.add(new CollegeDTO("St. Joseph's College",120000,8000,300,"Society of Jesus" ));
        collection.add(new CollegeDTO("PES University",400000,10000,500,"Dr. M. R. Doreswamy" ));
        collection.add(new CollegeDTO("Jain University",300000,15000,700,"Sri Dayananda Sagar"));
        collection.add(new CollegeDTO("Acharya Institute of Technology",250000,10000,400,"Dr. B. Premnath Reddy"));
        collection.add(new CollegeDTO("Atria Institute of Technology",200000,4000,200,"Atria Education Society"));
        collection.add(new CollegeDTO("Amrita School of Engineering",350000,5000,300,"Mata Amritanandamayi Math"));
        collection.add(new CollegeDTO("Alliance University",350000,7500,500,"Alliance Business School"));
        collection.add(new CollegeDTO("MS Ramaiah Institute of Technology",250000,10000,10000," Dr. MS Ramaiah"));
        collection.add(new CollegeDTO("Bangalore Institute of Technology",200000,5500,250,"Vokkaligara Sangha"));
        collection.add(new CollegeDTO("Presidency University",200000,6000,400,"Presidency Group of Institutions"));
        collection.add(new CollegeDTO("Oxford College of Engineering",250000,5000,250," Sri S. Narasa Raju"));
        collection.add(new CollegeDTO("New Horizon College of Engineering",150000,7000,300,"Dr. Mohan Manghnani"));
        collection.add(new CollegeDTO("Dayananda Sagar College of Engineering",300000,10000,500,"R. Dayananda Sagar"));

        collection.stream().filter(dto->dto.getName().startsWith("A")).forEach(dto-> System.out.println(dto));

        List<String> upperCaseName=collection.
                stream().
                map(dto->dto.getName().toUpperCase())
                .collect(Collectors.toList());
        System.out.println(" College names in upper case : "+ upperCaseName);

        List<String> lowerCaseName=collection.
                stream().


                map(dto->dto.getName().toLowerCase())
                .collect(Collectors.toList());
        System.out.println(" College names in lower case : "+ lowerCaseName);


    }


}
