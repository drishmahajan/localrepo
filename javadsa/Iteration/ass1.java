public class ass1 {
    public static void main(String[] args) {
        StringBuilder full = new StringBuilder();
            for(String i:args){           
           full.append(Character.toUpperCase(i.charAt(0))).append(i.substring(1).toLowerCase()).append(" ");
    }
    String fullName = full.toString().trim();
    System.out.println("Proper Case Full Name: " + fullName);
            }  
}
        
