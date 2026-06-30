package com.sachit.shopsphere.Service;

import com.sachit.shopsphere.DTO.AdminRegisterDTO;
import com.sachit.shopsphere.DTO.AdminUpdateDTO;
import com.sachit.shopsphere.DTO.UpdatePasswordDTO;
import com.sachit.shopsphere.Entity.Admin;
import com.sachit.shopsphere.Exception.AdminException;
import com.sachit.shopsphere.Exception.CustomerException;

import java.util.List;

public interface AdminService {

    public Admin addAdmin(AdminRegisterDTO adminRegDto)throws AdminException;

    public Admin updateAdmin(AdminUpdateDTO adminUpdtDto, String key)throws AdminException;

    public Admin getAdminById(Integer adminId) throws AdminException;

    public Admin deleteAdminById(Integer adminId) throws AdminException;

    public List<Admin>allAdmin()throws AdminException;
    
    public String updatePassword(UpdatePasswordDTO dto) throws AdminException;
}
