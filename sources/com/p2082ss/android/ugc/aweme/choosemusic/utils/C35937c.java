package com.p2082ss.android.ugc.aweme.choosemusic.utils;

import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.utils.c */
public final class C35937c {
    static {
        Covode.recordClassIndex(43179);
    }

    /* renamed from: a */
    public static String m73325a(int i) {
        return i == 0 ? "popular_song" : i == 3 ? "song_category" : i == 2 ? "search_result" : "";
    }

    /* renamed from: b */
    public static List<MusicModel> m73327b(List<Music> list) {
        ArrayList arrayList = new ArrayList();
        for (Music music : list) {
            if (music != null) {
                MusicModel convertToMusicModel = music.convertToMusicModel();
                convertToMusicModel.setChallengeUserCount(music.getUserCount());
                convertToMusicModel.setChallengeMusic(true);
                convertToMusicModel.setDataType(0);
                arrayList.add(convertToMusicModel);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static List<MusicModel> m73326a(List<Music> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Music music : list) {
            if (music != null) {
                arrayList.add(music.convertToMusicModel());
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static MusicModel m73324a(List<MusicModel> list, String str) {
        if (C13603b.m24435a((Collection) list)) {
            return null;
        }
        for (MusicModel musicModel : list) {
            if (musicModel != null && C13627m.m24499a(musicModel.getMusicId(), str)) {
                return musicModel;
            }
        }
        return null;
    }
}
