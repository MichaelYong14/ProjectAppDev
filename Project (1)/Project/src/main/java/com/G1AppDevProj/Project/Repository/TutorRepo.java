package com.G1AppDevProj.Project.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.G1AppDevProj.Project.Entity.Tutor;


@Repository
public interface TutorRepo extends JpaRepository<Tutor, Integer> {
    // You can add custom query methods if needed
}
