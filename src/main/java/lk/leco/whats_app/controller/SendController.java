package lk.leco.whats_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.leco.whats_app.model.MessageRequest;
import lk.leco.whats_app.service.MessageSendingService;

@RestController
@RequestMapping("/")
@CrossOrigin
public class SendController {

	@Autowired
	MessageSendingService messageSendingService;

	@PostMapping("send")

	public String sendTo(@RequestBody MessageRequest messageRequest) {

		return messageSendingService.messageSender(messageRequest);

	}
}