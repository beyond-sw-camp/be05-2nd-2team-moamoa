package team2.proto.service.adminauth;

import team2.proto.dto.adminauth.AdminAuthRequestDTO;
import team2.proto.dto.adminauth.AdminAuthResponseDTO;

import java.util.List;

public interface AdminAuthService {

    public List<AdminAuthRequestDTO> getAllAuthList();

}
