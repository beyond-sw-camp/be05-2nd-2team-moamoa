package team2.proto.service.adminauth;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import team2.proto.dto.adminauth.AdminAuthRequestDTO;
import team2.proto.repository.auth.AdminAuthRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AdminAuthServiceImp implements AdminAuthService {

    private final AdminAuthRepository adminAuthRepository;


    @Transactional
    @Override
    public List<AdminAuthRequestDTO> getAllAuthList() {

        return null;
    }
}
