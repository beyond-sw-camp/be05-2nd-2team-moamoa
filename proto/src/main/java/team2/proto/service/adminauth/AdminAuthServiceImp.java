package team2.proto.service.adminauth;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import team2.proto.repository.auth.AdminAuthRepository;

@Service
@RequiredArgsConstructor
public class AdminAuthServiceImp implements AdminAuthService {

    private final AdminAuthRepository adminAuthRepository;


}
