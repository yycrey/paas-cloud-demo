package paas.rey.service;

public interface MailService {

  void sendSimpleMail(String to, String subject, String content);
}
