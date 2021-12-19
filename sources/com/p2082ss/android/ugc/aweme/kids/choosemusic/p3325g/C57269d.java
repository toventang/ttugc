package com.p2082ss.android.ugc.aweme.kids.choosemusic.p3325g;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.kids.choosemusic.g.d */
public final class C57269d {
    static {
        Covode.recordClassIndex(67174);
    }

    /* renamed from: a */
    public static List<MusicModel> m103831a(List<Music> list) {
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

    /* renamed from: b */
    public static List<MusicModel> m103832b(List<Music> list) {
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
}
