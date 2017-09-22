package com.adelacebal.giflib.data;

import com.adelacebal.giflib.model.Gif;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class GifRepository {
    private static final List<Gif> ALL_GIFTS = Arrays.asList(
            new Gif("android-explosion", 3, LocalDate.of(2017, 9, 18), "Adel Acebal", true),
            new Gif("ben-and-mike",2, LocalDate.of(2015, 2, 6), "Ivelise Sola", false),
            new Gif("book-dominos", 1, LocalDate.of(2016, 5, 16), "Olga Suarez", true),
            new Gif("compiler-bot", 1, LocalDate.of(2013, 9, 24), "Alain Acebal", true),
            new Gif("cowboy-coder",2, LocalDate.of(2009, 12, 2), "Isidro Suarez", false),
            new Gif("infinite-andrew",2,  LocalDate.of(2017, 2, 5), "Ana Valdez", true),
            new Gif("rainbow.giphy",1,  LocalDate.of(2015, 12, 19), "Alain Reina", false)
    );

    public Gif findByName(String name) {
        for (Gif gif : ALL_GIFTS) {
            if (gif.getName().equals(name)) {
                return gif;
            }
        }
        return null;
    }

    public List<Gif> findByCategoryId(int id) {
        List<Gif> gifs = new ArrayList<>();
        for (Gif gif : ALL_GIFTS) {
            if (gif.getCategoryId() == id) {
                gifs.add(gif);
            }
        }
        return gifs;
    }

    public List<Gif> getAllGifs() {
        return ALL_GIFTS;
    }
}
