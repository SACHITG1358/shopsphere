package com.sachit.shopsphere.Repository;

import com.sachit.shopsphere.Entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminDao extends JpaRepository<Admin,Integer> {

	// Finding an admin by admin's company id
    public Admin findByAdminCompanyId(String adminCompanyId);
}
