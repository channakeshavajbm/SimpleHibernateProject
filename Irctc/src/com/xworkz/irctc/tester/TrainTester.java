
import com.xworkz.irctc.tester;
import com.xworkz.irctc.dao.TrainDAO;
import com.xworkz.irctc.dto.TrainDTO;

public class TrainTester {

	public static void main(String[] args) {

		TrainDTO dto = new TrainDTO();
		dto.setTid(1);
		dto.setTname("shathabdi");
		dto.setTnumber(18);
		dto.setType("fast");
		dto.setNoOfCoaches(25);

		TrainDAO dao = new TrainDAO();
		dao.save(dto);

	}

}
