package pl.wsb.fitnesstracker.user.internal;

import org.springframework.stereotype.Component;
import pl.wsb.fitnesstracker.user.api.User;
import pl.wsb.fitnesstracker.user.api.UserDto;
import pl.wsb.fitnesstracker.user.api.UserSummaryDto;

/**
 * Mapper responsible for converting between User entity and its DTO representations.
 */
@Component
class UserMapper {

    UserDto toDto(User user) {
        return new UserDto(
                user.getId(),
                user.getFirstName(),
                user.getLastName(),
                user.getBirthdate(),
                user.getEmail()
        );
    }

    UserSummaryDto toSummaryDto(User user) {
        return new UserSummaryDto(
                user.getId(),
                user.getFirstName(),
                user.getLastName()
        );
    }

    User toEntity(UserDto dto) {
        return new User(
                dto.firstName(),
                dto.lastName(),
                dto.birthdate(),
                dto.email()
        );
    }
}