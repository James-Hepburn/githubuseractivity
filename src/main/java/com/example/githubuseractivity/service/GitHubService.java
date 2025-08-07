package com.example.githubuseractivity.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GitHubService {
    private RestTemplate restTemplate = new RestTemplate ();

    public String getUserEvents (String username) {
        String url = "https://api.github.com/users/" + username + "/events";

        try {
            ResponseEntity <String> response = restTemplate.getForEntity (url, String.class);
            return response.getBody ();
        } catch (Exception e) {
            return null;
        }
    }
}