package easy;

public class Test009ShuffleTheName {
	
    public static String nameShuffle(String s) {
        
    	String pocetak = s.substring(0,1);
    	System.out.println(pocetak);
    	
    	String kraj = s.substring(s.length()-1);
    	System.out.println(kraj);
    	
    	String sredina = s.substring(1, s.length()-1);
    	System.out.println(sredina);

    	s = kraj  + sredina + pocetak;

    return s;	
    }
    	
    	
    	
    

	public static void main(String[] args) {
		
		System.out.println(nameShuffle("Donald Trump"));

	}

}
