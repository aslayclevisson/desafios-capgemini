package application.q2;

/** Classe para lan�ar exce��es personalizadas
 * @author Aslay Clevisson*/

public class ProgramException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public ProgramException(String msg) {
		super(msg);
	}
}
