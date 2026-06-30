package com.sachit.shopsphere.Service;

import com.sachit.shopsphere.DTO.CustomerLogInDTO;
import com.sachit.shopsphere.Exception.LoginLogoutException;

import javax.security.auth.login.LoginException;

public interface CustomerLoginLogoutService {

    public String customerLogin(CustomerLogInDTO dto) throws LoginLogoutException;

    public String customerLogout(Integer userId, String key) throws LoginLogoutException;
}
