/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.classhierarchies;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;


/**
 *
 * @author CGouslin2026
 */
public class ClassHierarchies {
    
    

    public static void main(String[] args) {
        
        // create Scanner
    
        Scanner scan = new Scanner(System.in);
        
        
        // initialize countries
        
        Country finland = new Country("Finland", "white and blue", "cold and rainy/snowy", "Suomenlinna Sea Fortress", "Helsinki", "Europe", "Norway, Sweden, and Russia", "F");
        Country argentina = new Country("Argentina", "Light blue and white", "Varied, but mostly temperate; cold winters in some areas", "Perito Moreno Glacier", "Buenos Aires", "South America", "Chile, Bolivia, Paraguay, Brazil, Uruguay", "A");
        Country japan = new Country("Japan", "White and red", "Varied, ranging from cold winters to subtropical", "Mount Fuji", "Tokyo", "Asia", "Nothing", "J");
        Country usa = new Country("United States", "red, white, and blue", "varied (temperate, arid, tropical, polar)", "Statue of Liberty", "Washington, D.C.", "North America", "Canada and Mexico", "U");
        Country canada = new Country("Canada", "red and white", "cold and temperate", "Niagara Falls", "Ottawa", "North America", "United States", "C");
        Country brazil = new Country("Brazil", "green, yellow, blue, and white", "tropical and subtropical", "Christ the Redeemer", "Brasília", "South America", "Argentina, Bolivia, Colombia, Guyana, Paraguay, Peru, Suriname, Uruguay, and Venezuela", "B");
        Country australia = new Country("Australia", "blue, red, and white", "varied (desert, tropical, temperate)", "Sydney Opera House", "Canberra", "Australia", "None", "A");
        Country china = new Country("China", "red and yellow", "varied (tropical, arid, temperate, subarctic)", "Great Wall of China", "Beijing", "Asia", "14 countries including India, Russia, and Mongolia", "C");
        Country india = new Country("India", "orange, white, green, and blue", "tropical and temperate", "Taj Mahal", "New Delhi", "Asia", "Pakistan, China, Nepal, Bhutan, Bangladesh, and Myanmar", "I");
        Country russia = new Country("Russia", "white, blue, and red", "varied (subarctic, continental, temperate)", "Saint Basil's Cathedral", "Moscow", "Europe/Asia", "14 countries including China, Ukraine, and Mongolia", "R");
        Country france = new Country("France", "blue, white, and red", "temperate and Mediterranean", "Eiffel Tower", "Paris", "Europe", "Belgium, Luxembourg, Germany, Switzerland, Italy, Spain, Andorra, and Monaco", "F");
        Country germany = new Country("Germany", "black, red, and yellow", "temperate", "Brandenburg Gate", "Berlin", "Europe", "Denmark, Poland, Czech Republic, Austria, Switzerland, France, Luxembourg, Belgium, and Netherlands", "G");
        Country italy = new Country("Italy", "green, white, and red", "Mediterranean", "Colosseum", "Rome", "Europe", "France, Switzerland, Austria, and Slovenia", "I");
        Country spain = new Country("Spain", "red and yellow", "Mediterranean and oceanic", "Sagrada Familia", "Madrid", "Europe", "Portugal, France, Andorra, and Gibraltar", "S");
        Country south_korea = new Country("South Korea", "red, blue, white, and black", "temperate", "Gyeongbokgung Palace", "Seoul", "Asia", "North Korea", "S");
        Country mexico = new Country("Mexico", "green, white, and red", "varied (desert, tropical, temperate)", "Chichen Itza", "Mexico City", "North America", "United States, Guatemala, and Belize", "M");
        Country egypt = new Country("Egypt", "red, white, black, and gold", "desert", "Pyramids of Giza", "Cairo", "Africa", "Libya, Sudan, and Israel", "E");
        Country south_africa = new Country("South Africa", "red, blue, green, yellow, black, and white", "varied (Mediterranean, desert, subtropical)", "Table Mountain", "Pretoria", "Africa", "Namibia, Botswana, Zimbabwe, Mozambique, Eswatini, and Lesotho", "S");
        Country thailand = new Country("Thailand", "red, white, and blue", "tropical", "Grand Palace", "Bangkok", "Asia", "Myanmar, Laos, Cambodia, and Malaysia", "T");
        Country turkey = new Country("Turkey", "red and white", "Mediterranean and continental", "Hagia Sophia", "Ankara", "Europe/Asia", "Greece, Bulgaria, Georgia, Armenia, Iran, Iraq, and Syria", "T");
        Country indonesia = new Country("Indonesia", "red and white", "tropical", "Borobudur", "Jakarta", "Asia", "Papua New Guinea, East Timor, and Malaysia", "I");
        Country norway = new Country("Norway", "red, white, and blue", "cold and temperate", "Geirangerfjord", "Oslo", "Europe", "Sweden, Finland, and Russia", "N");
        Country sweden = new Country("Sweden", "blue and yellow", "cold and temperate", "Vasa Museum", "Stockholm", "Europe", "Norway and Finland", "S");
        Country portugal = new Country("Portugal", "green and red", "Mediterranean and oceanic", "Belém Tower", "Lisbon", "Europe", "Spain", "P");
        Country vietnam = new Country("Vietnam", "red and yellow", "tropical", "Ha Long Bay", "Hanoi", "Asia", "China, Laos, and Cambodia", "V");
        Country saudi_arabia = new Country("Saudi Arabia", "green and white", "desert", "Masjid al-Haram", "Riyadh", "Asia", "Jordan, Iraq, Kuwait, Bahrain, Qatar, UAE, Oman, and Yemen", "S");
        Country philippines = new Country("Philippines", "blue, red, white, and yellow", "tropical", "Chocolate Hills", "Manila", "Asia", "None (island nation)", "P");
        Country greece = new Country("Greece", "blue and white", "Mediterranean", "Acropolis of Athens", "Athens", "Europe", "Albania, North Macedonia, Bulgaria, and Turkey", "G");
        Country new_zealand = new Country("New Zealand", "blue, red, and white", "temperate", "Milford Sound", "Wellington", "Oceania", "None (island nation)", "N");
        Country peru = new Country("Peru", "red and white", "varied (coastal desert, Andean highlands, Amazon rainforest)", "Machu Picchu", "Lima", "South America", "Ecuador, Colombia, Brazil, Bolivia, and Chile", "P");
        Country ukraine = new Country("Ukraine", "blue and yellow", "temperate", "Saint Sophia's Cathedral", "Kyiv", "Europe", "Belarus, Russia, Poland, Slovakia, Hungary, Romania, and Moldova", "U");
        Country netherlands = new Country("Netherlands", "red, white, and blue", "temperate", "Keukenhof Gardens", "Amsterdam", "Europe", "Belgium and Germany", "N");
        Country belgium = new Country("Belgium", "black, yellow, and red", "temperate", "Grand Place", "Brussels", "Europe", "France, Germany, Luxembourg, and Netherlands", "B");
        Country switzerland = new Country("Switzerland", "red and white", "temperate and alpine", "Matterhorn", "Bern", "Europe", "France, Germany, Austria, and Italy", "S");
        Country austria = new Country("Austria", "red and white", "temperate", "Schönbrunn Palace", "Vienna", "Europe", "Germany, Czech Republic, Slovakia, Hungary, Slovenia, Italy, Switzerland, and Liechtenstein", "A");
        Country poland = new Country("Poland", "white and red", "temperate", "Wawel Castle", "Warsaw", "Europe", "Germany, Czech Republic, Slovakia, Ukraine, Belarus, Lithuania, and Russia", "P");
        Country denmark = new Country("Denmark", "red and white", "temperate", "The Little Mermaid statue", "Copenhagen", "Europe", "Germany", "D");
        Country ireland = new Country("Ireland", "green, white, and orange", "temperate maritime", "Cliffs of Moher", "Dublin", "Europe", "United Kingdom", "I");
        Country scotland = new Country("Scotland", "blue and white", "temperate maritime", "Edinburgh Castle", "Edinburgh", "Europe", "United Kingdom", "S");
        Country cuba = new Country("Cuba", "blue, white, and red", "tropical", "Old Havana", "Havana", "North America", "None (island nation)", "C");
        Country chile = new Country("Chile", "red, white, and blue", "varied (desert, Mediterranean, oceanic, polar)", "Easter Island", "Santiago", "South America", "Peru, Bolivia, and Argentina", "C");
        Country colombia = new Country("Colombia", "yellow, blue, and red", "tropical and highland", "Salt Cathedral of Zipaquirá", "Bogotá", "South America", "Venezuela, Brazil, Peru, Ecuador, and Panama", "C");
        Country iran = new Country("Iran", "green, white, and red", "arid and semi-arid", "Persepolis", "Tehran", "Asia", "Iraq, Turkey, Armenia, Azerbaijan, Turkmenistan, Afghanistan, and Pakistan", "I");
        Country iraq = new Country("Iraq", "red, white, black, and green", "desert", "Ziggurat of Ur", "Baghdad", "Asia", "Turkey, Syria, Jordan, Saudi Arabia, Kuwait, and Iran", "I");
        Country pakistan = new Country("Pakistan", "green and white", "varied (desert, mountainous, and coastal)", "Badshahi Mosque", "Islamabad", "Asia", "India, Afghanistan, Iran, and China", "P");
        Country kazakhstan = new Country("Kazakhstan", "blue and yellow", "continental", "Baikonur Cosmodrome", "Astana", "Asia", "Russia, China, Kyrgyzstan, Uzbekistan, and Turkmenistan", "K");
        Country mongolia = new Country("Mongolia", "red, blue, and yellow", "continental", "Genghis Khan Statue Complex", "Ulaanbaatar", "Asia", "Russia and China", "M");
        Country malaysia = new Country("Malaysia", "red, white, blue, and yellow", "tropical", "Petronas Towers", "Kuala Lumpur", "Asia", "Thailand, Indonesia, and Brunei", "M");
        Country singapore = new Country("Singapore", "red and white", "tropical", "Marina Bay Sands", "Singapore", "Asia", "None (island nation)", "S");
        Country nigeria = new Country("Nigeria", "green and white", "tropical", "Zuma Rock", "Abuja", "Africa", "Benin, Niger, Chad, and Cameroon", "N");
        Country algeria = new Country("Algeria", "green, white, and red", "desert and Mediterranean", "Casbah of Algiers", "Algiers", "Africa", "Tunisia, Libya, Niger, Mali, Mauritania, Western Sahara, Morocco", "A");
        Country angola = new Country("Angola", "red, black, and yellow", "tropical and semi-arid", "Fortaleza de São Miguel", "Luanda", "Africa", "Namibia, Democratic Republic of the Congo, Zambia", "A");
        Country bangladesh = new Country("Bangladesh", "green and red", "tropical", "Sundarbans Mangrove Forest", "Dhaka", "Asia", "India and Myanmar", "B");
        Country bolivia = new Country("Bolivia", "red, yellow, and green", "varied (tropical lowlands, highland Andes)", "Salar de Uyuni", "Sucre", "South America", "Brazil, Paraguay, Argentina, Chile, Peru", "B");
        Country cambodia = new Country("Cambodia", "blue, red, and white", "tropical", "Angkor Wat", "Phnom Penh", "Asia", "Thailand, Laos, Vietnam", "C");
        Country cameroon = new Country("Cameroon", "green, red, and yellow", "tropical", "Mount Cameroon", "Yaoundé", "Africa", "Nigeria, Chad, Central African Republic, Equatorial Guinea, Gabon, Republic of the Congo", "C");
        Country costa_rica = new Country("Costa Rica", "blue, white, and red", "tropical", "Arenal Volcano", "San José", "North America", "Nicaragua, Panama", "C");
        Country croatia = new Country("Croatia", "red, white, and blue", "Mediterranean and continental", "Plitvice Lakes National Park", "Zagreb", "Europe", "Slovenia, Hungary, Serbia, Bosnia and Herzegovina, Montenegro", "C");
        Country ecuador = new Country("Ecuador", "yellow, blue, and red", "varied (coastal, highland, and rainforest)", "Galápagos Islands", "Quito", "South America", "Colombia, Peru", "E");
        Country ethiopia = new Country("Ethiopia", "green, yellow, and red", "tropical highland and semi-arid", "Lalibela Rock-Hewn Churches", "Addis Ababa", "Africa", "Eritrea, Djibouti, Somalia, Kenya, South Sudan, Sudan", "E");
        Country ghana = new Country("Ghana", "red, yellow, green, and black", "tropical", "Cape Coast Castle", "Accra", "Africa", "Ivory Coast, Burkina Faso, Togo", "G");
        Country guatemala = new Country("Guatemala", "blue and white", "tropical and highland", "Tikal", "Guatemala City", "North America", "Mexico, Belize, Honduras, El Salvador", "G");
        Country honduras = new Country("Honduras", "blue and white", "tropical", "Copán Ruins", "Tegucigalpa", "North America", "Guatemala, El Salvador, Nicaragua", "H");
        Country israel = new Country("Israel", "blue and white", "Mediterranean and arid", "Western Wall", "Jerusalem", "Asia", "Lebanon, Syria, Jordan, Egypt", "I");
        Country jamaica = new Country("Jamaica", "black, green, and yellow", "tropical", "Dunn’s River Falls", "Kingston", "North America", "None (island nation)", "J");
        Country madagascar = new Country("Madagascar", "red, white, and green", "tropical", "Avenue of the Baobabs", "Antananarivo", "Africa", "None (island nation)", "M");
        Country morocco = new Country("Morocco", "red and green", "Mediterranean and desert", "Chefchaouen", "Rabat", "Africa", "Algeria, Western Sahara", "M");
        Country venezuela = new Country("Venezuela", "yellow, blue, and red", "tropical", "Angel Falls", "Caracas", "South America", "Colombia, Brazil, Guyana", "V");
        Country yemen = new Country("Yemen", "red, white, and black", "desert", "Old City of Sana'a", "Sana'a", "Asia", "Saudi Arabia, Oman", "Y");
        Country afghanistan = new Country("Afghanistan", "black, red, and green", "arid and mountainous", "Band-e Amir National Park", "Kabul", "Asia", "Pakistan, Iran, Turkmenistan, Uzbekistan, Tajikistan, China", "A");
        Country armenia = new Country("Armenia", "red, blue, and orange", "continental and highland", "Garni Temple", "Yerevan", "Asia", "Turkey, Georgia, Azerbaijan, Iran", "A");
        Country azerbaijan = new Country("Azerbaijan", "blue, red, and green", "continental and semi-arid", "Maiden Tower", "Baku", "Asia", "Russia, Georgia, Armenia, Iran", "A");
        Country bahrain = new Country("Bahrain", "red and white", "desert", "Bahrain Fort", "Manama", "Asia", "None (island nation)", "B");
        Country belarus = new Country("Belarus", "red, green, and white", "continental", "Mir Castle", "Minsk", "Europe", "Latvia, Lithuania, Poland, Russia, Ukraine", "B");
        Country bhutan = new Country("Bhutan", "orange, yellow, and white", "mountainous and temperate", "Paro Taktsang (Tiger's Nest Monastery)", "Thimphu", "Asia", "China, India", "B");
        Country bosnia = new Country("Bosnia", "blue, yellow, and white", "continental and Mediterranean", "Stari Most", "Sarajevo", "Europe", "Croatia, Serbia, Montenegro", "B");
        Country botswana = new Country("Botswana", "blue, black, and white", "semi-arid and savanna", "Okavango Delta", "Gaborone", "Africa", "Namibia, Zimbabwe, Zambia, South Africa", "B");
        Country burkina_faso = new Country("Burkina Faso", "red, green, and yellow", "tropical savanna", "Sindou Peaks", "Ouagadougou", "Africa", "Mali, Niger, Benin, Togo, Ghana, Ivory Coast", "B");
        Country burundi = new Country("Burundi", "red, green, and white", "tropical highland", "Lake Tanganyika", "Gitega", "Africa", "Rwanda, Tanzania, Democratic Republic of the Congo", "B");
        Country chad = new Country("Chad", "blue, yellow, and red", "desert and semi-arid", "Lakes of Ounianga", "N'Djamena", "Africa", "Libya, Sudan, Central African Republic, Cameroon, Nigeria, Niger", "C");
        Country comoros = new Country("Comoros", "green, white, blue, yellow, and red", "tropical", "Mount Karthala", "Moroni", "Africa", "None (island nation)", "C");
        Country djibouti = new Country("Djibouti", "blue, green, white, and red", "desert", "Lake Assal", "Djibouti", "Africa", "Eritrea, Ethiopia, Somalia", "D");
        Country dominican_republic = new Country("Dominican Republic", "blue, white, and red", "tropical", "Pico Duarte", "Santo Domingo", "North America", "Haiti", "D");
        Country el_salvador = new Country("El Salvador", "blue and white", "tropical", "Santa Ana Volcano", "San Salvador", "North America", "Guatemala, Honduras", "E");
        Country eritrea = new Country("Eritrea", "red, green, blue, and yellow", "desert and coastal", "Dahlak Archipelago", "Asmara", "Africa", "Sudan, Ethiopia, Djibouti", "E");
        Country fiji = new Country("Fiji", "blue, white, red, and yellow", "tropical", "Mamanuca Islands", "Suva", "Oceania", "None (island nation)", "F");
        Country gabon = new Country("Gabon", "green, yellow, and blue", "tropical", "Loango National Park", "Libreville", "Africa", "Equatorial Guinea, Cameroon, Republic of the Congo", "G");
        Country georgia = new Country("Georgia", "white and red", "varied (mountainous, coastal, and continental)", "Gergeti Trinity Church", "Tbilisi", "Europe/Asia", "Russia, Azerbaijan, Armenia, Turkey", "G");
        Country guinea = new Country("Guinea", "red, yellow, and green", "tropical", "Mount Nimba", "Conakry", "Africa", "Guinea-Bissau, Senegal, Mali, Ivory Coast, Liberia, Sierra Leone", "G");
        Country iceland = new Country("Iceland", "blue, red, and white", "subarctic and oceanic", "Blue Lagoon", "Reykjavik", "Europe", "None (island nation)", "I");
        Country kyrgyzstan = new Country("Kyrgyzstan", "red and yellow", "mountainous and continental", "Issyk-Kul Lake", "Bishkek", "Asia", "Kazakhstan, Uzbekistan, Tajikistan, China", "K");
        Country laos = new Country("Laos", "red, blue, and white", "tropical and mountainous", "Pha That Luang", "Vientiane", "Asia", "China, Vietnam, Cambodia, Thailand, Myanmar", "L");
        Country lebanon = new Country("Lebanon", "red, white, and green", "Mediterranean", "Baalbek", "Beirut", "Asia", "Syria, Israel", "L");
        Country lesotho = new Country("Lesotho", "blue, white, and green", "mountainous and temperate", "Sani Pass", "Maseru", "Africa", "Completely surrounded by South Africa", "L");
        Country liberia = new Country("Liberia", "red, white, and blue", "tropical", "Providence Island", "Monrovia", "Africa", "Sierra Leone, Guinea, Ivory Coast", "L");
        Country luxembourg = new Country("Luxembourg", "red, white, and blue", "temperate", "Vianden Castle", "Luxembourg City", "Europe", "Belgium, Germany, France", "L");
        Country malawi = new Country("Malawi", "black, red, green", "tropical", "Lake Malawi", "Lilongwe", "Africa", "Tanzania, Mozambique, Zambia", "M");
        Country malta = new Country("Malta", "red and white", "Mediterranean", "Hypogeum of Ħal Saflieni", "Valletta", "Europe", "None (island nation)", "M");
        Country mauritania = new Country("Mauritania", "green and yellow", "desert", "Banc d'Arguin National Park", "Nouakchott", "Africa", "Western Sahara, Algeria, Mali, Senegal", "M");
        Country mauritius = new Country("Mauritius", "red, blue, yellow, and green", "tropical", "Le Morne Brabant", "Port Louis", "Africa", "None (island nation)", "M");
        Country moldova = new Country("Moldova", "blue, yellow, and red", "continental", "Orheiul Vechi", "Chisinau", "Europe", "Romania, Ukraine", "M");
        Country montenegro = new Country("Montenegro", "red, yellow, and gold", "Mediterranean and continental", "Bay of Kotor", "Podgorica", "Europe", "Croatia, Bosnia and Herzegovina, Serbia, Kosovo, Albania", "M");
        Country mozambique = new Country("Mozambique", "green, yellow, black, white, and red", "tropical", "Bazaruto Archipelago", "Maputo", "Africa", "Tanzania, Malawi, Zambia, Zimbabwe, South Africa, Eswatini", "M");
        Country myanmar = new Country("Myanmar", "yellow, green, and red", "tropical", "Bagan Temples", "Naypyidaw", "Asia", "India, Bangladesh, China, Laos, Thailand", "M");
        Country namibia = new Country("Namibia", "blue, red, green, white, and yellow", "desert and semi-arid", "Namib Desert", "Windhoek", "Africa", "Angola, Zambia, Botswana, South Africa", "N");
        Country nepal = new Country("Nepal", "red, blue, and white", "mountainous", "Mount Everest", "Kathmandu", "Asia", "China, India", "N");
        Country nicaragua = new Country("Nicaragua", "blue and white", "tropical", "Ometepe Island", "Managua", "North America", "Honduras, Costa Rica", "N");
        Country niger = new Country("Niger", "orange, white, and green", "desert and semi-arid", "Aïr Mountains", "Niamey", "Africa", "Algeria, Libya, Chad, Nigeria, Benin, Burkina Faso, Mali", "N");
        Country north_macedonia = new Country("North Macedonia", "red and yellow", "continental and Mediterranean", "Lake Ohrid", "Skopje", "Europe", "Serbia, Kosovo, Bulgaria, Greece, Albania", "N");
        Country oman = new Country("Oman", "red, white, and green", "desert", "Wadi Shab", "Muscat", "Asia", "United Arab Emirates, Saudi Arabia, Yemen", "O");
        Country panama = new Country("Panama", "red, white, and blue", "tropical", "Panama Canal", "Panama City", "North America", "Costa Rica, Colombia", "P");
        Country papua_new_guinea = new Country("Papua New Guinea", "black, red, yellow, and white", "tropical", "Kokoda Track", "Port Moresby", "Oceania", "Indonesia", "P");
        Country paraguay = new Country("Paraguay", "red, white, and blue", "tropical and subtropical", "Iguazu Falls", "Asunción", "South America", "Argentina, Brazil, Bolivia", "P");
        Country qatar = new Country("Qatar", "maroon and white", "desert", "The Pearl-Qatar", "Doha", "Asia", "Saudi Arabia", "Q");
        Country romania = new Country("Romania", "blue, yellow, and red", "temperate", "Bran Castle", "Bucharest", "Europe", "Ukraine, Moldova, Bulgaria, Serbia, Hungary", "R");
        Country senegal = new Country("Senegal", "green, yellow, and red", "tropical", "Lake Retba", "Dakar", "Africa", "Mauritania, Mali, Guinea, Guinea-Bissau, The Gambia", "S");
        Country serbia = new Country("Serbia", "red, blue, and white", "continental", "Kalemegdan Fortress", "Belgrade", "Europe", "Hungary, Romania, Bulgaria, North Macedonia, Montenegro, Bosnia, Croatia", "S");
        Country sierra_leone = new Country("Sierra Leone", "green, white, and blue", "tropical", "Tiwai Island", "Freetown", "Africa", "Guinea, Liberia", "S");
        Country slovakia = new Country("Slovakia", "white, blue, and red", "temperate", "Spiš Castle", "Bratislava", "Europe", "Czech Republic, Austria, Poland, Ukraine, Hungary", "S");
        Country slovenia = new Country("Slovenia", "white, blue, and red", "temperate", "Lake Bled", "Ljubljana", "Europe", "Italy, Austria, Hungary, Croatia", "S");
        Country sudan = new Country("Sudan", "red, white, black, and green", "desert", "Meroë Pyramids", "Khartoum", "Africa", "Egypt, Libya, Chad, Central African Republic, South Sudan, Ethiopia, Eritrea", "S");
        Country zimbabwe = new Country("Zimbabwe", "green, yellow, red, and black", "tropical savanna", "Victoria Falls", "Harare", "Africa", "Zambia, Mozambique, South Africa, Botswana", "Z");  
        Country albania = new Country("Albania", "red and black", "Mediterranean", "Butrint", "Tirana", "Europe", "Montenegro, Kosovo, North Macedonia, Greece", "A");
        Country andorra = new Country("Andorra", "blue, yellow, and red", "temperate", "Grandvalira", "Andorra la Vella", "Europe", "France, Spain", "A");
        Country antigua_and_barbuda = new Country("Antigua and Barbuda", "red, blue, and yellow", "tropical", "Nelson's Dockyard", "St. John's", "North America", "None (island nation)", "A");
        Country bahamas = new Country("Bahamas", "blue, yellow, and black", "tropical", "Blue Hole", "Nassau", "North America", "None (island nation)", "B");
        Country barbados = new Country("Barbados", "blue, yellow, and black", "tropical", "Harrison's Cave", "Bridgetown", "North America", "None (island nation)", "B");
        Country belize = new Country("Belize", "blue and yellow", "tropical", "Great Blue Hole", "Belmopan", "North America", "Mexico, Guatemala", "B");
        Country benin = new Country("Benin", "green, yellow, and red", "tropical", "Pendjari National Park", "Porto-Novo", "Africa", "Togo, Burkina Faso, Niger, Nigeria", "B");        
        Country brunei = new Country("Brunei", "yellow, black, and white", "tropical", "Sultan Omar Ali Saifuddien Mosque", "Bandar Seri Begawan", "Asia", "Malaysia", "B");
        Country bulgaria = new Country("Bulgaria", "blue, yellow, and red", "temperate", "Rila Monastery", "Sofia", "Europe", "Romania, Serbia, North Macedonia, Greece, Turkey", "B");
        Country cabo_verde = new Country("Cabo Verde", "blue, yellow, and red", "tropical", "Praia", "Praia", "Africa", "None (island nation)", "C");

        
        // select random country
        
        Country randCountry = Country.getRandomCountry();
        
        // select chosen difficulty
        
        System.out.println("Please choose a difficulty\n\n - Easy\n - Medium\n - Hard\n");
        String diffChosen = "Easy";
        
        // prevent errors with while loop
        int x = 1;
        diffChosen = scan.nextLine();
        while (x == 1) {            
            
            // check if diffChosen is valid
            
            if (diffChosen.equalsIgnoreCase("Easy") || diffChosen.equalsIgnoreCase("Medium") || diffChosen.equalsIgnoreCase("Hard")){
                x = 0;
            } else {
                System.out.println("\nERROR\nPlease choose a valid difficulty");
                diffChosen = scan.nextLine();
            }
        }
        
        // initialize game (chosen difficulty, random country)
        Game game = new Game(diffChosen, randCountry);  
        
        //start game
        game.start();
    }
}

//////////////////////////////////////////// game //////////////////////////////////////////////////////

class Game {
    
    // initialize
    
    private String difficulty;
    private Country country; 
    
    // constructor
    
    public Game(String inDifficulty, Country inCountry){
        difficulty = inDifficulty;
        country = inCountry;
    }
    
    // run game
    
    public void start(){
        
        System.out.println("The game has started on " + difficulty + " mode\n");
        
        if (difficulty.equalsIgnoreCase("Hard")){
            
            // print hints based on difficulty
            
            System.out.println(Hard.getHardHints(country));
            
        } else if (difficulty.equalsIgnoreCase("Medium")){
            
            System.out.println(Medium.getHardHints(country));
            System.out.println(Medium.getMediumHints(country));   
            
        } else {
            
            System.out.println(Easy.getHardHints(country));
            System.out.println(Easy.getMediumHints(country)); 
            System.out.println(Easy.getEasyHints(country));
        }
        
        // create answer input loop and check for win
        // create loop variables
        
        Scanner scan2 = new Scanner(System.in);
        String answer = "";
        final int MAX_GUESSES = 5;
        int guessCount = 0;
        
        while (true) {
          System.out.println("\nInput answer:");
          answer = scan2.nextLine();
          
          if (answer.equalsIgnoreCase(country.getName())){
             System.out.println("\nYOU WIN");
             System.exit(0);
                       
          } else {
              System.out.println("\nWrong answer");
              guessCount++;
          } 
          
          // check for loss
          
          if (guessCount >= MAX_GUESSES){
              
              System.out.println("YOU LOSE\nThe correct answer is: " + country.getName());
              System.exit(0);
          }
              
        }
        
    }
}



/////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Hard {
    
    // print hints for hard method
    
    public static String getHardHints(Country inCountry){
        
        String result = "The flag colors of the country are " + inCountry.getFlagColors() + "\nThe climate of the country is " + inCountry.getClimate();                
        return result;
    }    
    
}


class Medium extends Hard {
    
    // print medium hints method
    
    public static String getMediumHints(Country inCountry){
        
        String result = "A landmark in the country is " + inCountry.getLandmark() + "\nThe capital of the country is " + inCountry.getCapital();
      return result;       
    }
    
}


class Easy extends Medium {
    
    // print easy hints
    
    public static String getEasyHints(Country inCountry){
        
        String result = "The continent the country is on is " + inCountry.getContinent() + "\nThe country borders " + inCountry.getBordering() + "\nThe first letter of the country is " + inCountry.getFirstLetter();
        return result;        
    }
    
}

//////////////////////////////////////////////////// country /////////////////////////////////////////////////


class Country {
    
    // create static list
    
    private static List<Country> allCountries = new ArrayList<>();
    
    // method to retrieve country at random (create random class)
    
    static Country getRandomCountry(){    
        Random rand = new Random();
        int randIndex = rand.nextInt(allCountries.size() - 1);
        return allCountries.get(randIndex);
    }
    
        
    
    // initialize
    
    private String name;
    private String flagColors;
    private String climate;
    private String landmark;
    private String capital;
    private String continent;
    private String bordering;     
    private String firstLetter;       
    
            
    // constructor
    
    public Country(String inName, String inFlagColors, String inClimate, String inLandmark, String inCapital, String inContinent, String inBordering, String inFirstLetter){
        name = inName;
        flagColors = inFlagColors;
        climate = inClimate;
        landmark = inLandmark;
        capital = inCapital;
        continent = inContinent;
        bordering = inBordering;  
        firstLetter = inFirstLetter;
        // add to static list
        allCountries.add(this);
    }
    
    // accessors
    
    public String getName(){
        return name;        
    }
    
    public String getFlagColors(){
        return flagColors;
    }
    
    public String getClimate(){
        return climate;
    }
    
    public String getLandmark(){
        return landmark;
    }
    
    public String getCapital(){
        return capital;
    }
    
    public String getContinent(){
        return continent;
    }
    
    public String getBordering(){
        return bordering;
    }
    
    public String getFirstLetter(){
        return firstLetter;
    }
    
}
