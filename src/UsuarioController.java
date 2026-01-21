public class UsuarioController {

    private UsuarioService service;

    public UsuarioController(UsuarioService service) {
        this.service = service;
    }

    public void criarUsuario(int id, String nome, String email) {
        Usuario usuario = new Usuario(id, nome, email);
        boolean criado = service.criarUsuario(usuario);

        if (criado) {
            System.out.println("201 CREATED - Usuário criado");
        } else {
            System.out.println("409 CONFLICT - Usuário já existe");
        }
    }

    public void listarUsuarios() {
        Usuario[] usuarios = service.listarUsuarios();

        for (Usuario u : usuarios) {
            System.out.println(
                    "ID: " + u.getId() +
                            " | Nome: " + u.getNome() +
                            " | Email: " + u.getEmail() +
                            " | Ativo: " + u.isAtivo()
            );
        }
    }

    public void desativarUsuario(int id) {
        boolean sucesso = service.desativarUsuario(id);

        if (sucesso) {
            System.out.println("Usuário desativado");
        } else {
            System.out.println("Usuário não encontrado");
        }
    }
}
