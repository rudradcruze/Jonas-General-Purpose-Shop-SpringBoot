package bd.edu.diu.cis.library.service;

import bd.edu.diu.cis.library.dto.AdminDto;
import bd.edu.diu.cis.library.model.Admin;

public interface AdminService {
    Admin findByUsername(String username);

    Admin save(AdminDto adminDto);
}
