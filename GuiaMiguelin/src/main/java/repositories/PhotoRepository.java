package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import domain.Photo;

@Repository
public interface PhotoRepository extends JpaRepository<Photo, Integer>{
//	@Query("select p from Single s join s.photos p where s.id=?1 and p.isAvatar=true")
//	Photo getAvatar(Integer singleId);
//	
//	@Query("select p from Place s join s.photos p where s.id=?1 and p.isAvatar=true")
//	Photo getAvatarPlace(Integer singleId);
//	
}

