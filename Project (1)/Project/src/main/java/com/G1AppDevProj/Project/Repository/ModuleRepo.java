package com.G1AppDevProj.Project.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.G1AppDevProj.Project.Entity.Module;


@Repository
public interface ModuleRepo extends JpaRepository<Module, Integer> {
    // You can add custom query methods if needed
}
