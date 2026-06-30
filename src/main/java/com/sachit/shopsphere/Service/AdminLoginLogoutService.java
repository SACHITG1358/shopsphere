package com.sachit.shopsphere.Service;

import com.sachit.shopsphere.DTO.AdminLogInDTO;
import com.sachit.shopsphere.Exception.LoginLogoutException;


public interface AdminLoginLogoutService {

	// Admin login
    public String logIntoAccount(AdminLogInDTO adminLoginDto) throws LoginLogoutException;

    // Admin logout
    public String logOutFromAccount(Integer adminId, String adminKey) throws LoginLogoutException;
}
