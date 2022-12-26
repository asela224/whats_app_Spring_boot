package lk.leco.whats_app.model;

import org.springframework.stereotype.Component;

@Component
public class MessageRequest {
	private String whatsAppNumber;
	private String messageTemplate;

	public String getWhatsAppNumber() {
		return whatsAppNumber;
	}

	public void setWhatsAppNumber(String whatsAppNumber) {
		this.whatsAppNumber = whatsAppNumber;
	}

	public String getMessageTemplate() {
		return messageTemplate;
	}

	public void setMessageTemplate(String messageTemplate) {
		this.messageTemplate = messageTemplate;
	}

	public MessageRequest() {
		super();
	}

}
