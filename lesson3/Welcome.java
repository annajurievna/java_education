package lesson3.task1;

public class Welcome {
	public static void main(String[] args){
		sayWelcome("italian");
		sayWelcome("Idish");	
	}
	
	public static Language ReturnLanguage(String language) {
		for (Language lang : Language.values()) {
	        if (lang.name().equals(language)) {
	            return lang;
	        }
	    }
		return Language.english;
	}
	
	public static void sayWelcome(String lang) {
			Language lg = ReturnLanguage(lang);
			switch(lg){
			case english:
	            System.out.println("Welcome");
	            break;
	        case czech:
	            System.out.println("Vitejte");
	            break;
	        case danish:
	            System.out.println("Velkomst");
	            break;
	        case dutch:
	            System.out.println("Welkom");
	            break;
	        case swedish:
	            System.out.println("Valkommen");
	            break;
	        case spanish:
	            System.out.println("Bienvenido");
	            break;
	        case polish:
	            System.out.println("Witamy");
	            break;  
	        case lithuanian:
	            System.out.println("Laukiamas'");
	            break;
	        case latvian:
	            System.out.println("Gaidits");
	            break;
	        case italian:
	            System.out.println("Benvenuto");
	            break; 
	        case irish:
	            System.out.println("Failte");
	            break;
	        case german:
	            System.out.println("Willkommen");
	            break;
	        case french:
	            System.out.println("Bienvenue");
	            break;  
	        case flemish:
	            System.out.println("Welgekomen");
	            break;
	        case finnish:
	            System.out.println("Tervetuloa");
	            break;
	        case estonian:
	            System.out.println("Tere tulemast");
	            break;   
	        case welsh:
	            System.out.println("Croeso'");
	            break;   
			default: 
				System.out.println("Welcome");
				break;
			}
	}

}

enum Language {
	english,
	czech,
	danish,
	dutch,
	estonian,
	finnish,
	flemish,
	french,
	german,
	irish,
	italian,
	latvian,
	lithuanian,
	polish,
	spanish,
	swedish,
	welsh
}
