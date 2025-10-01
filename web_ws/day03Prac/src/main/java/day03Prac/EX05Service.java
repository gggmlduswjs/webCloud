package day03Prac;

public class EX05Service {
    
    public String[] getResult(int su1) {
        
        String[] list = new String[su1];
        
        for(int i = 0; i < su1; i++) {
            String stars = "";
            
            for(int j = 0; j <= i; j++) {
                stars += "★";
            }
            list[i] = stars;
        }
        
        return list;
    }
    
    public static void main(String[] args) {
        EX05Service service = new EX05Service();
        String[] list = service.getResult(20);
        
        for(int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }
}
