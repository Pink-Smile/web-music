package com.buct.music.dao;

import com.buct.music.domin.Song;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Jeffrey
 * @version 2021/01/04 09:36
 */

@Mapper
@Repository
public interface SongMapper {
    // 增加歌曲
    int insert(Song song);

    // 更新歌曲
    int update(Song song);

    // 删除歌曲
    int delete(long id);

    // 根据id查找某个歌曲
    Song selectByPrimaryKey(long id);

    // 查询所有歌曲
    List<Song> selectAllSongs();

    // 根据歌曲名字模糊查询
    List<Song> selectByName(String name);

    // 根据歌手名字查询
    List<Song> selectBySinger(String name);
}
