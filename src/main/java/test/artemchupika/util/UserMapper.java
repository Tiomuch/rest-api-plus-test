package test.artemchupika.util;

import org.mapstruct.Mapper;
import test.artemchupika.configuration.MapperConfig;
import test.artemchupika.model.User;
import test.artemchupika.model.dto.request.SaveUserDto;
import test.artemchupika.model.dto.response.UserResponseDto;

@Mapper(config = MapperConfig.class)
public interface UserMapper {
    User toModel(SaveUserDto saveUserDto);

    UserResponseDto toDto(User user);
}
