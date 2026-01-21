public class Main {
    public static void main(String[] args) {

        UsuarioRepository repository = new UsuarioRepository();
        UsuarioService service = new UsuarioService(repository);
        UsuarioController controller = new UsuarioController(service);

        controller.criarUsuario(1, "Kaique", "kaique@gmail.com");
        controller.criarUsuario(2, "Ana", "ana@gmail.com");
        controller.criarUsuario(1, "Duplicado", "dup@gmail.com");

        controller.listarUsuarios();

        controller.desativarUsuario(2);
        controller.desativarUsuario(99);
    }
}
