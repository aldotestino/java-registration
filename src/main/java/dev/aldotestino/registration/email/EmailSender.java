package dev.aldotestino.registration.email;

public interface EmailSender {
    void send(String to, String email);
}
