package br.com.starter.application.useCase.user;

import br.com.starter.domain.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
@RequiredArgsConstructor
public class DeleteUserUseCase {
    private final UserService userService;

    public boolean execute(UUID userId) {
        return userService.deleteById(userId);
    }
}
