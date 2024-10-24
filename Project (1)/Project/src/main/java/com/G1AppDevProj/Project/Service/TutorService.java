package com.G1AppDevProj.Project.Service;

import com.G1AppDevProj.Project.Entity.Tutor;
import com.G1AppDevProj.Project.Repository.TutorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TutorService {

    private final TutorRepo tutorRepository;

    @Autowired
    public TutorService(TutorRepo tutorRepository) {
        this.tutorRepository = tutorRepository;
    }

    // Create
    public Tutor createTutor(Tutor tutor) {
        return tutorRepository.save(tutor);
    }

    // Find by ID
    public Optional<Tutor> findTutorById(int id) {
        return tutorRepository.findById(id);
    }

    // Find All
    public List<Tutor> findAllTutors() {
        return tutorRepository.findAll();
    }

    // Update
    public Tutor updateTutor(int id, Tutor updatedTutor) {
        Optional<Tutor> existingTutor = tutorRepository.findById(id);
        if (existingTutor.isPresent()) {
            Tutor tutor = existingTutor.get();
            tutor.setTutorName(updatedTutor.getTutorName());
            tutor.setEmail(updatedTutor.getEmail());
            return tutorRepository.save(tutor);
        }
        return null;
    }

    // Delete
    public boolean deleteTutor(int id) {
        if (tutorRepository.existsById(id)) {
            tutorRepository.deleteById(id);
            return true;
        }
        return false;
    }
}