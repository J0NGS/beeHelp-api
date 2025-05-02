package br.com.starter.application.useCase.user;

import br.com.starter.application.api.user.dto.UserRegistrationRequest;
import br.com.starter.domain.user.User;
import br.com.starter.domain.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
@Component
@RequiredArgsConstructor
public class CreateUserUseCase {
    private final UserService userService;

    public User execute(UserRegistrationRequest request) {
        return userService.create(request);
    }
}
