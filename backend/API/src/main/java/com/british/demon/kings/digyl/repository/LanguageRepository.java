package com.british.demon.kings.digyl.repository;

import com.british.demon.kings.digyl.dtos.Language;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import java.util.List;

@Repository
public class LanguageRepository {

    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Persistence");
    private EntityManager getEntityManager() {
        return entityManagerFactory.createEntityManager();
    }

    @PersistenceContext
    EntityManager entityManager;

    @Transactional
    public List<Language> getLanguages() {
        entityManager = getEntityManager();
        StoredProcedureQuery getLanguagesStoredProcedureQuery = entityManager
                .createNamedStoredProcedureQuery("");

        getLanguagesStoredProcedureQuery.execute();

        List<Language> languages = getLanguagesStoredProcedureQuery.getResultList();

        return languages;
    }
}
