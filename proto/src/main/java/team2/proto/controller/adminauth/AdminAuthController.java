package team2.proto.controller.adminauth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import team2.proto.dto.adminauth.AdminAuthRequestDTO;
import team2.proto.service.adminauth.AdminAuthService;

import java.util.List;

@Controller
@RequestMapping("/api/admin")
public class AdminAuthController {

    @Autowired
    private AdminAuthService service;

    @GetMapping("/authlist")
    public ResponseEntity<List<AdminAuthRequestDTO>> getList() {

        return null;
    }

    @PutMapping("/authlist/{authNo}")
    public ResponseEntity<Void> auth() {
        return null;
    }
}
