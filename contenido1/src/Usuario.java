public class Usuario {
    private String name;
    private String email;

    // constructor
    public  Usuario(String name, String email){
        this.name = name;
        this.email = email;
    }

    public void mostrarInformacion (){
        System.out.println(name + " - " + email);
    }
}
