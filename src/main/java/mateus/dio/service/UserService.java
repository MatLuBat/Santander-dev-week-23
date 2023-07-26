package mateus.dio.service;
import mateus.dio.domain.model.User;
public interface UserService {

    User findById(Long id);

    User create(User userToCreate);

}
