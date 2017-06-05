package DAO;

public class DAOTabelas {
    public static String consultaExemplo = "SELECT * FROM dia_horario;";    //exemplo
    public static String consultaUsuarios = "SELECT login, permissao FROM usuarios NATURAL JOIN usuario_permissao NATURAL JOIN permissoes;";
    public static String consultaEquipes = "SELECT equipe, projeto, lider FROM equipes NATURAL JOIN projetos INNER JOIN usuarios ON projetos.id_lider = usuarios.id_usuario;";
    public static String consultaReuniaoes = "SELECT reuniao, data_reuniao, horario_inicio FROM reunioes;";
    public static String consultaMembros = "SELECT login, nome, avaliado FROM membros NATURAL JOIN usuarios;";
    public static String consultaProjetos = "SELECT projeto, login FROM projetos INNER JOIN usuarios ON projetos.id_lider = usuarios.id_usuario;"; 
}
