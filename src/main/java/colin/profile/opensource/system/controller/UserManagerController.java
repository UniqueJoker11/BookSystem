package colin.profile.opensource.system.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import colin.profile.opensource.system.service.UserManagerService;

@Controller
public class UserManagerController {

	@Resource
	private UserManagerService userService;

	@ResponseBody
	@RequestMapping(value = "listAllUserinfo.action", method = RequestMethod.POST)
	public Object listAllUserinfo() {
		return userService.listAllUserInfoService();
	}
}
