package com.sachit.shopsphere.Service;

import com.sachit.shopsphere.DTO.CustomerRegisterDTO;
import com.sachit.shopsphere.DTO.CustomerUpdateDTO;
import com.sachit.shopsphere.DTO.UpdatePasswordDTO;
import com.sachit.shopsphere.Entity.Customer;
import com.sachit.shopsphere.Exception.CustomerException;

import java.util.List;

public interface CustomerService {

    public Customer addCustomer(CustomerRegisterDTO customerRegisterDTO)throws CustomerException;

    public Customer viewCustomerById(Integer customerId) throws CustomerException;

    public Customer updateCustomer(CustomerUpdateDTO customerUpdtDto, String key)throws CustomerException;

    public Customer deleteCustomerById(Integer customerId) throws CustomerException;

    public List<Customer> viewAllConsumer() throws CustomerException;
    
    public String updatePassword(UpdatePasswordDTO dto) throws CustomerException;

}
