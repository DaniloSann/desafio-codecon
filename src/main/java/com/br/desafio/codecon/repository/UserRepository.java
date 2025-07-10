package com.br.desafio.codecon.repository;

import com.br.desafio.codecon.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
//     Filtro: score >= 900 e active = true
    List<User> findByScoreGreaterThanEqualAndActiveTrue(int score);

    @Query(value = """
    SELECT country, COUNT(*) AS superuser_count
    FROM tb_users
    WHERE score >= 900 AND active = true
    GROUP BY country
    ORDER BY superuser_count DESC
    LIMIT 5
    """, nativeQuery = true)
    List<Object[]> findTop5CountriesWithMostSuperusers();
}
