package test.artemchupika.service;

import java.time.LocalDate;
import java.util.List;
import test.artemchupika.model.dto.request.SaveUserDto;
import test.artemchupika.model.dto.request.UserUpdatePartialDto;
import test.artemchupika.model.dto.response.UserResponseDto;

public interface UserService {
    UserResponseDto createUser(SaveUserDto newUserDto);

    List<UserResponseDto> getUsersByBirthDateRange(LocalDate from, LocalDate to);

    UserResponseDto updateUser(Long id, SaveUserDto userUpdateDto);

    UserResponseDto updatePartialUser(Long id, UserUpdatePartialDto userUpdatePartialDto);

    void deleteUser(Long id);
}
