package com.zerobase.cms.user.client;

import com.zerobase.cms.user.client.mailgun.SendMailForm;
import feign.Response;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "mailgun", url = "https://api.mailgun.net/v3")
@Qualifier("mailgun")
public interface MailgunClient {

    @PostMapping("sandbox0857f28f2d8546aa86f941920ccd5c7e.mailgun.org/messages")
    ResponseEntity<String> sendEmail(@SpringQueryMap SendMailForm from);
}
