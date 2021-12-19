package com.p2082ss.android.ugc.gamora.recorder.choosemusic.recommend.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.ugc.effectplatform.model.C86837b;
import java.util.List;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.recommend.model.RecommendMusic */
public final class RecommendMusic extends C86837b {
    public static final C83620a Companion = new C83620a((byte) 0);
    public static final RecommendMusic EMPTY = new RecommendMusic(C89086z.INSTANCE);
    @AbstractC27891c(mo46611a = "music_list")
    private List<MusicInfoAndEffectUseCount> musicList;

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.gamora.recorder.choosemusic.recommend.model.RecommendMusic */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecommendMusic copy$default(RecommendMusic recommendMusic, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = recommendMusic.musicList;
        }
        return recommendMusic.copy(list);
    }

    public final List<MusicInfoAndEffectUseCount> component1() {
        return this.musicList;
    }

    public final RecommendMusic copy(List<MusicInfoAndEffectUseCount> list) {
        return new RecommendMusic(list);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof RecommendMusic) && C89219l.m154714a(this.musicList, ((RecommendMusic) obj).musicList);
        }
        return true;
    }

    public final int hashCode() {
        List<MusicInfoAndEffectUseCount> list = this.musicList;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.C86837b
    public final String toString() {
        return "RecommendMusic(musicList=" + this.musicList + ")";
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.recommend.model.RecommendMusic$a */
    public static final class C83620a {
        static {
            Covode.recordClassIndex(97509);
        }

        private C83620a() {
        }

        public /* synthetic */ C83620a(byte b) {
            this();
        }
    }

    public final List<MusicInfoAndEffectUseCount> getMusicList() {
        return this.musicList;
    }

    static {
        Covode.recordClassIndex(97508);
    }

    public final void setMusicList(List<MusicInfoAndEffectUseCount> list) {
        this.musicList = list;
    }

    public RecommendMusic(List<MusicInfoAndEffectUseCount> list) {
        this.musicList = list;
    }
}
