package pratice.springSecurity.repository;

import pratice.springSecurity.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
        Role findByName(String name);
}
