package exetrycatch;
public class ExeTryCatch {
    
    public static void aumentarLetra(){
    String teste = "xidade";
    
    try
    {
        //System.out.println(teste.toUpperCase());
        System.out.println(teste.charAt(3));
    }
    catch(NullPointerException e)
    {
        System.out.println(e);
        System.out.println("String não pode ser nula");
    }
    catch(Exception e)
    {
        System.out.println("Erro"+e.getMessage());
    }
    finally
    {
        System.out.println("Catapimbas");
    }
    }
    public static void main(String[] args) {
       aumentarLetra();
        System.out.println("FIM!");
    }
    
}
