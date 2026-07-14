package com.mycompany.fidecompro.servicios;

import com.mycompany.fidecompro.Usuario;
import com.mycompany.fidecompro.excepciones.CredencialesInvalidasExcepcion;
import com.mycompany.fidecompro.excepciones.UsuarioDuplicadoException;
import java.util.ArrayList;

public class GestorUsuarios {

    private ArrayList<Usuario> usuarios;

    public GestorUsuarios() {

        usuarios = new ArrayList<>();

        Usuario administrador = new Usuario(
                1,
                "Administrador general",
                "admin",
                "1234",
                "Administrador"
        );

        usuarios.add(administrador);
    }

    public void agregarUsuario(Usuario nuevoUsuario)
            throws UsuarioDuplicadoException {

        for (Usuario usuarioRegistrado : usuarios) {

            if (usuarioRegistrado.getUsuario()
                    .equalsIgnoreCase(nuevoUsuario.getUsuario())) {

                throw new UsuarioDuplicadoException(
                        "Ya existe un usuario con ese nombre de acceso."
                );
            }
        }

        usuarios.add(nuevoUsuario);
    }

    public ArrayList<Usuario> obtenerUsuarios() {
        return usuarios;
    }

    public Usuario validarInicioSesion(
            String nombreUsuario,
            String contrasena)
            throws CredencialesInvalidasExcepcion {

        for (Usuario usuario : usuarios) {

            boolean usuarioCorrecto =
                    usuario.getUsuario()
                            .equalsIgnoreCase(nombreUsuario);

            boolean contrasenaCorrecta =
                    usuario.getContrasena()
                            .equals(contrasena);

            if (usuarioCorrecto && contrasenaCorrecta) {
                return usuario;
            }
        }

        throw new CredencialesInvalidasExcepcion(
                "Usuario o contraseña incorrectos."
        );
    }
}