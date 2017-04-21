package social_light.repository.manager;

import org.springframework.data.jpa.repository.JpaRepository;
import social_light.entity.domain.TestTable;


public interface TestTableRepository extends JpaRepository<TestTable,Long> {
}
