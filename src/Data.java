import java.text.SimpleDateFormat;
import java.util.Date;

public class Data {
	public String pegaHorario() {
		Date data = new Date();
		SimpleDateFormat formatar = new SimpleDateFormat("HH:mm:ss");
		String dataFormatada = formatar.format(data);
		return dataFormatada;
	}
}