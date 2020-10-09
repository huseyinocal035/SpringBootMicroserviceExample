package huseyin.ocal.usersmicroservice.services;

import huseyin.ocal.usersmicroservice.dto.UserDto;
import huseyin.ocal.usersmicroservice.entities.User;
import huseyin.ocal.usersmicroservice.repository.UsersRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.UUID;

@Service
public class UsersServiceImpl implements UsersService {

    UsersRepository usersRepository;

    @Autowired
    public UsersServiceImpl(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @Override
    public UserDto createUser(UserDto userDto) {
        userDto.setUserId(UUID.randomUUID().toString());

        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

        User user = modelMapper.map(userDto, User.class);
        user.setEncryptedPassword("test");

        usersRepository.save(user);

        UserDto returnValue = modelMapper.map(user, UserDto.class);

        return returnValue;
    }
}
