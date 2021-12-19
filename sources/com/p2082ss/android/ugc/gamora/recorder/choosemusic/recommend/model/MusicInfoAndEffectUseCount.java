package com.p2082ss.android.ugc.gamora.recorder.choosemusic.recommend.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.recommend.model.MusicInfoAndEffectUseCount */
public final class MusicInfoAndEffectUseCount {
    @AbstractC27891c(mo46611a = "music_id")
    private final long musicId;
    @AbstractC27891c(mo46611a = "music_info")
    private final Music musicInfo;
    @AbstractC27891c(mo46611a = "effect_use_count")
    private final long useCount;

    static {
        Covode.recordClassIndex(97507);
    }

    /* renamed from: com_ss_android_ugc_gamora_recorder_choosemusic_recommend_model_MusicInfoAndEffectUseCount_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m143958x7642d92b(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static /* synthetic */ MusicInfoAndEffectUseCount copy$default(MusicInfoAndEffectUseCount musicInfoAndEffectUseCount, long j, long j2, Music music, int i, Object obj) {
        if ((i & 1) != 0) {
            j = musicInfoAndEffectUseCount.musicId;
        }
        if ((i & 2) != 0) {
            j2 = musicInfoAndEffectUseCount.useCount;
        }
        if ((i & 4) != 0) {
            music = musicInfoAndEffectUseCount.musicInfo;
        }
        return musicInfoAndEffectUseCount.copy(j, j2, music);
    }

    public final long component1() {
        return this.musicId;
    }

    public final long component2() {
        return this.useCount;
    }

    public final Music component3() {
        return this.musicInfo;
    }

    public final MusicInfoAndEffectUseCount copy(long j, long j2, Music music) {
        C89219l.m154721d(music, "");
        return new MusicInfoAndEffectUseCount(j, j2, music);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MusicInfoAndEffectUseCount)) {
            return false;
        }
        MusicInfoAndEffectUseCount musicInfoAndEffectUseCount = (MusicInfoAndEffectUseCount) obj;
        return this.musicId == musicInfoAndEffectUseCount.musicId && this.useCount == musicInfoAndEffectUseCount.useCount && C89219l.m154714a(this.musicInfo, musicInfoAndEffectUseCount.musicInfo);
    }

    public final int hashCode() {
        int com_ss_android_ugc_gamora_recorder_choosemusic_recommend_model_MusicInfoAndEffectUseCount_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = ((m143958x7642d92b(this.musicId) * 31) + m143958x7642d92b(this.useCount)) * 31;
        Music music = this.musicInfo;
        return com_ss_android_ugc_gamora_recorder_choosemusic_recommend_model_MusicInfoAndEffectUseCount_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (music != null ? music.hashCode() : 0);
    }

    public final String toString() {
        return "MusicInfoAndEffectUseCount(musicId=" + this.musicId + ", useCount=" + this.useCount + ", musicInfo=" + this.musicInfo + ")";
    }

    public final long getMusicId() {
        return this.musicId;
    }

    public final Music getMusicInfo() {
        return this.musicInfo;
    }

    public final long getUseCount() {
        return this.useCount;
    }

    public MusicInfoAndEffectUseCount(long j, long j2, Music music) {
        C89219l.m154721d(music, "");
        this.musicId = j;
        this.useCount = j2;
        this.musicInfo = music;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MusicInfoAndEffectUseCount(long j, long j2, Music music, int i, C89214g gVar) {
        this((i & 1) != 0 ? -1 : j, (i & 2) != 0 ? 0 : j2, music);
    }
}
