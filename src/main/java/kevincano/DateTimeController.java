package kevincano;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.text.SimpleDateFormat;

@Controller
public class DateTimeController {

	@RequestMapping("")
	public String index(Model model) {
		
		model.addAttribute("name", "Kevin");
		
		return"index.jsp";
	}
	@RequestMapping("/date")
	public String date(Model model) {
		Date date = new Date();
		SimpleDateFormat ft = new SimpleDateFormat("EEEE, 'the' dd 'of' MMMM, yyyy");
		model.addAttribute("displayDate",ft.format(date));
		return"date.jsp";
	}
	@RequestMapping("/time")
	public String time(Model model) {
		Date date = new Date();
		SimpleDateFormat ft = new SimpleDateFormat("hh:mm a");
		model.addAttribute("displayDate",ft.format(date));
		return"time.jsp";
	}
	
}
