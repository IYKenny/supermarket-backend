package emmy.ne.binarysupermarket.services;

import emmy.ne.binarysupermarket.models.User;


public interface IUserService {

    User create(User user);

    boolean isNotUnique(User user);

    void validateNewRegistration(User user);

    User getLoggedInUser();

}