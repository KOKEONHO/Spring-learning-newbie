package gdsc.shine.springlearningsimple.domain.user.application;

import org.springframework.stereotype.Service;

import gdsc.shine.springlearningsimple.domain.user.repository.UserRepository;

@Service
public class UserService {

	private final UserRepository userRepository;

	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
}
