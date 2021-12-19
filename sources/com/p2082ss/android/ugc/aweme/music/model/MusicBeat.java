package com.p2082ss.android.ugc.aweme.music.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.music.model.MusicBeat */
public final class MusicBeat implements Serializable {
    @AbstractC27891c(mo46611a = "man_made_beats")
    private final String manMadeBeats;
    @AbstractC27891c(mo46611a = "max_video_num")
    private final Integer maxVideoNum;
    @AbstractC27891c(mo46611a = "min_video_num")
    private final Integer minVideoNum;
    @AbstractC27891c(mo46611a = "onset_cnn")
    private final String onset_cnn;
    @AbstractC27891c(mo46611a = StringSet.type)
    private final Integer type;

    static {
        Covode.recordClassIndex(71400);
    }

    public static /* synthetic */ MusicBeat copy$default(MusicBeat musicBeat, Integer num, Integer num2, String str, Integer num3, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = musicBeat.minVideoNum;
        }
        if ((i & 2) != 0) {
            num2 = musicBeat.maxVideoNum;
        }
        if ((i & 4) != 0) {
            str = musicBeat.manMadeBeats;
        }
        if ((i & 8) != 0) {
            num3 = musicBeat.type;
        }
        if ((i & 16) != 0) {
            str2 = musicBeat.onset_cnn;
        }
        return musicBeat.copy(num, num2, str, num3, str2);
    }

    public final Integer component1() {
        return this.minVideoNum;
    }

    public final Integer component2() {
        return this.maxVideoNum;
    }

    public final String component3() {
        return this.manMadeBeats;
    }

    public final Integer component4() {
        return this.type;
    }

    public final String component5() {
        return this.onset_cnn;
    }

    public final MusicBeat copy(Integer num, Integer num2, String str, Integer num3, String str2) {
        return new MusicBeat(num, num2, str, num3, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MusicBeat)) {
            return false;
        }
        MusicBeat musicBeat = (MusicBeat) obj;
        return C89219l.m154714a(this.minVideoNum, musicBeat.minVideoNum) && C89219l.m154714a(this.maxVideoNum, musicBeat.maxVideoNum) && C89219l.m154714a(this.manMadeBeats, musicBeat.manMadeBeats) && C89219l.m154714a(this.type, musicBeat.type) && C89219l.m154714a(this.onset_cnn, musicBeat.onset_cnn);
    }

    public final int hashCode() {
        Integer num = this.minVideoNum;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Integer num2 = this.maxVideoNum;
        int hashCode2 = (hashCode + (num2 != null ? num2.hashCode() : 0)) * 31;
        String str = this.manMadeBeats;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        Integer num3 = this.type;
        int hashCode4 = (hashCode3 + (num3 != null ? num3.hashCode() : 0)) * 31;
        String str2 = this.onset_cnn;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        return "MusicBeat(minVideoNum=" + this.minVideoNum + ", maxVideoNum=" + this.maxVideoNum + ", manMadeBeats=" + this.manMadeBeats + ", type=" + this.type + ", onset_cnn=" + this.onset_cnn + ")";
    }

    public final String getManMadeBeats() {
        return this.manMadeBeats;
    }

    public final Integer getMaxVideoNum() {
        return this.maxVideoNum;
    }

    public final Integer getMinVideoNum() {
        return this.minVideoNum;
    }

    public final String getOnset_cnn() {
        return this.onset_cnn;
    }

    public final Integer getType() {
        return this.type;
    }

    public MusicBeat(Integer num, Integer num2, String str, Integer num3, String str2) {
        this.minVideoNum = num;
        this.maxVideoNum = num2;
        this.manMadeBeats = str;
        this.type = num3;
        this.onset_cnn = str2;
    }
}
