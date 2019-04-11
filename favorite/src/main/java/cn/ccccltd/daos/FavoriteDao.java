package cn.ccccltd.daos;

import cn.ccccltd.beans.Favorite;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;


/**
 *  配置类DAO
 * 
 * @author ccccltd
 *
 */
public interface FavoriteDao extends PagingAndSortingRepository<Favorite, Long> {
    List<Favorite> findAllByObjType(int type);

    Favorite findByUserIdAndObjTypeAndObjId(long userId, int objType, long objId);

    int countByObjTypeAndObjId(int objType, long objId);

    // @Query(value = "select t from Config t where t.name like %?1% or t.value like %?1% or t.description like %?1%", nativeQuery = false)
	// Page<Config> findAllByKeyword(String keyword, Pageable pageable);
}