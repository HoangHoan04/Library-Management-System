/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.AccountDAO;
import DTO.AccountDTO;

/**
 *
 * @author hieun
 */
public class AccountBUS {
    
    private final AccountDAO accountDAO = new AccountDAO();
    
    public boolean createAccount(AccountDTO account) {
        return accountDAO.add(account) > 0; 
    }
    
    public boolean updateStatusOfAccount(int id, String status) {
        return accountDAO.editStatus(id, status) > 0;
    }
    
    public boolean checkLogIn(String username, String password) {
        return accountDAO.checkLogIn(username, password);
    }
    
    public AccountDTO getAccountByUsername(String username) {
        return accountDAO.getByUsername(username); 
    }
    
    public boolean searchAccount(String username) { 
        return accountDAO.searchAccount(username); 
    }
} 
