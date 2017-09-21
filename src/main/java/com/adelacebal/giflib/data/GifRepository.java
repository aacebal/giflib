package com.adelacebal.giflib.data;

import com.adelacebal.giflib.model.Gif;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Component
public class GifRepository {
    private static final List<Gif> ALL_GIFTS = Arrays.asList(
            new Gif("android-explosion", LocalDate.of(2017, 9, 18), "Adel Acebal", true),
            new Gif("ben-and-mike", LocalDate.of(2017, 9, 18), "Adel Acebal", true),
            new Gif("book-dominos", LocalDate.of(2017, 9, 18), "Adel Acebal", true),
            new Gif("compiler-bot", LocalDate.of(2017, 9, 18), "Adel Acebal", true),
            new Gif("cowboy-coder", LocalDate.of(2017, 9, 18), "Adel Acebal", true),
            new Gif("infinite-andrew", LocalDate.of(2017, 9, 18), "Adel Acebal", true),
            new Gif("rainbow-giphy", LocalDate.of(2017, 9, 18), "Adel Acebal", true)
    );

    public Gif findByName(String name) {
        for (Gif gif : ALL_GIFTS) {
            if (gif.getName().equals(name)) {
                return gif;
            }
        }
        return null;
    }
}
