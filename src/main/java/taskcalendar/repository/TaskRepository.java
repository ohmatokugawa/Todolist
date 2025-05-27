//Warstwa dostępu do bazy danych dla SpringBoot
package taskcalendar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import taskcalendar.model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}