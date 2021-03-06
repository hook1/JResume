package com.softserveinc.ita.jresume.business.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softserveinc.ita.jresume.common.dto.SoftServeUserInformationDTO;
import com.softserveinc.ita.jresume.common.dto.UserDTO;
import com.softserveinc.ita.jresume.common.entity.User;
import com.softserveinc.ita.jresume.common.mapper.UserMapper;
import com.softserveinc.ita.jresume.persistence.dao.impl.UserDAO;

/**
 * Class for working with User.
 * 
 * @author Andriy Zykhor
 */
@Service
public class UserService {
    
    /** UserDAO for access to data storage. */
    @Autowired
    private UserDAO userDao;
    
    /** UserMapper for map between DTO and entity. */
    @Autowired
    private UserMapper userMapper;
    
    /**
     * SoftServeUserInformationService to operate with SoftServeUserInformation
     * objects.
     */
    @Autowired
    private SoftServeUserInformationService softServeUserInformationService;
    
    /**
     * Create a new user.
     * 
     * @param user
     *            to be created.
     */
    public final void create(final User user) {
        userDao.create(user);
        softServeUserInformationService.edit(new SoftServeUserInformationDTO(),
                user);
    }
    
    /**
     * Update information user.
     * 
     * @param currentUser
     *            object user to be updated.
     * @param updatedUser
     *            object userDto with updated information.
     * @return updated user.
     */
    public final User update(final User currentUser,
            final UserDTO updatedUser) {
        if (updatedUser.getFirstName() != null
                && !updatedUser.getFirstName().equals("")) {
            currentUser.setFirstName(updatedUser.getFirstName());
        }
        if (updatedUser.getLastName() != null
                && !updatedUser.getLastName().equals("")) {
            currentUser.setLastName(updatedUser.getLastName());
        }
        if (updatedUser.getPassword() != null
                && updatedUser.getPassword().equals("")) {
            currentUser.setPassword(updatedUser.getPassword());
        }
        return userDao.update(currentUser);
    }
    
    /**
     * Delete user from data storage.
     * 
     * @param user
     *            the user to be deleted.
     */
    public final void delete(final User user) {
        userDao.delete(user);
    }
    
    /**
     * Find all users.
     * 
     * @return a list of all users.
     */
    public final List<User> findAll() {
        return userDao.findAll();
    }
    
    /**
     * Find user associated with this email.
     * 
     * @param email
     *            email of the user
     * @return the user associated with this email
     */
    public final User findByEmail(final String email) {
        return userDao.findByEmail(email);
    }
    
    /**
     * Find userDto associated with this email.
     * 
     * @param email
     *            email of the user
     * @return the userDto associated with this email.
     */
    public final UserDTO findDtoByEmail(final String email) {
        return userMapper.toDto(userDao.findByEmail(email));
    }
    
}
