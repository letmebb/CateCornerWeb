package org.dullnull.Controller;

import org.dullnull.Entity.User;
import org.dullnull.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller()
public class UserController extends BaseController {

	@Autowired
	UserService userService;

	@RequestMapping(value = "/register.action", method = RequestMethod.POST)
	public String register(String user_tele, String user_pass, String user_name, String user_email) {
		User user = new User();
		user.setUser_email(user_email);
		user.setUser_name(user_name);
		user.setUser_pass(user_pass);
		user.setUser_tele(user_tele);
		userService.add(user);
		return "success";
	}

	/*
	 * @RequestMapping(value = "register.action", method = RequestMethod.POST)
	 * public void register() { String user_tele = "18611125025"; String
	 * user_pass = "123123"; String user_name = "kindling"; String user_email =
	 * "ls_kindlign@163.com"; User user = new User();
	 * user.setUser_email(user_email); user.setUser_name(user_name);
	 * user.setUser_pass(user_pass); user.setUser_tele(user_tele);
	 * userService.add(user); }
	 */
}
