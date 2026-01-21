public class UsuarioService {

    private UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    public boolean criarUsuario(Usuario usuario) {
        Usuario existente = repository.buscarPorId(usuario.getId());

        if (existente != null) {
            return false; // já existe
        }

        repository.salvar(usuario);
        return true;
    }

    public Usuario[] listarUsuarios() {
        return repository.listarTodos();
    }

    public boolean desativarUsuario(int id) {
        Usuario usuario = repository.buscarPorId(id);

        if (usuario == null) {
            return false;
        }

        usuario.desativar();
        return true;
    }
}
