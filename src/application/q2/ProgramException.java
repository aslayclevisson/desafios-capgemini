package application.q2;

/** Classe para lançar exceções personalizadas
 * @author Aslay Clevisson*/

public class ProgramException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public ProgramException(String msg) {
		super(msg);
	}
}
