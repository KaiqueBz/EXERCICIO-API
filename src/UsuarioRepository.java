public class UsuarioRepository {

    private Usuario[] usuarios = new Usuario[10];
    private int total = 0;

    public void salvar(Usuario usuario) {
        if (total < usuarios.length) {
            usuarios[total] = usuario;
            total++;
        }
    }

    public Usuario buscarPorId(int id) {
        for (int i = 0; i < total; i++) {
            if (usuarios[i].getId() == id) {
                return usuarios[i];
            }
        }
        return null;
    }

    public Usuario[] listarTodos() {
        Usuario[] resultado = new Usuario[total];
        for (int i = 0; i < total; i++) {
            resultado[i] = usuarios[i];
        }
        return resultado;
    }
}
