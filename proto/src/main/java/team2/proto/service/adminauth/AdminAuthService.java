package team2.proto.service.adminauth;

import team2.proto.dto.adminauth.AdminAuthResponseDTO;

public interface AdminAuthService {

    AdminAuthResponseDTO getList(Long id);
}
