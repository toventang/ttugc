package com.p2082ss.android.ugc.aweme.shortvideo.stitch;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams */
public final class StitchParams implements Parcelable, Serializable {
    public static final Parcelable.Creator<StitchParams> CREATOR = new C73118a();
    @AbstractC27891c(mo46611a = "video_segment", mo46612b = {"a"})

    /* renamed from: a */
    private EditVideoSegment f164175a;
    @AbstractC27891c(mo46611a = "video_path", mo46612b = {"b"})

    /* renamed from: b */
    private String f164176b;
    @AbstractC27891c(mo46611a = "music", mo46612b = {"c"})

    /* renamed from: c */
    private C69905c f164177c;
    @AbstractC27891c(mo46611a = "music_path", mo46612b = {"d"})

    /* renamed from: d */
    private String f164178d;
    @AbstractC27891c(mo46611a = "music_start", mo46612b = {"e"})

    /* renamed from: e */
    private int f164179e;
    @AbstractC27891c(mo46611a = "is_pgc_music", mo46612b = {"f"})

    /* renamed from: f */
    private boolean f164180f;
    @AbstractC27891c(mo46611a = "music_id", mo46612b = {"g"})

    /* renamed from: g */
    private String f164181g;
    @AbstractC27891c(mo46611a = "from_user", mo46612b = {"h"})

    /* renamed from: h */
    private User f164182h;
    @AbstractC27891c(mo46611a = "aweme_id", mo46612b = {"i"})

    /* renamed from: i */
    private String f164183i;
    @AbstractC27891c(mo46611a = "chain", mo46612b = {"j"})

    /* renamed from: j */
    private String f164184j;
    @AbstractC27891c(mo46611a = "duration", mo46612b = {"k"})

    /* renamed from: k */
    private long f164185k;
    @AbstractC27891c(mo46611a = "concat_video_path", mo46612b = {"l"})

    /* renamed from: l */
    private String f164186l;
    @AbstractC27891c(mo46611a = "concat_audio_path", mo46612b = {"m"})

    /* renamed from: m */
    private String f164187m;
    @AbstractC27891c(mo46611a = "enable_mic", mo46612b = {"n"})

    /* renamed from: n */
    private boolean f164188n;
    @AbstractC27891c(mo46611a = "is_muted", mo46612b = {"o"})

    /* renamed from: o */
    private boolean f164189o;
    @AbstractC27891c(mo46611a = "startTime", mo46612b = {"p"})

    /* renamed from: p */
    private long f164190p;
    @AbstractC27891c(mo46611a = "endTime", mo46612b = {"q"})

    /* renamed from: q */
    private long f164191q;

    static {
        Covode.recordClassIndex(85828);
    }

    public StitchParams() {
        this(null, null, null, null, 0, false, null, null, null, null, 0, null, null, false, false, 0, 0, 131071, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_shortvideo_stitch_StitchParams_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m129124x1727de14(int i) {
        return i;
    }

    /* renamed from: com_ss_android_ugc_aweme_shortvideo_stitch_StitchParams_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m129125x1727de14(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static /* synthetic */ StitchParams copy$default(StitchParams stitchParams, EditVideoSegment editVideoSegment, String str, C69905c cVar, String str2, int i, boolean z, String str3, User user, String str4, String str5, long j, String str6, String str7, boolean z2, boolean z3, long j2, long j3, int i2, Object obj) {
        String str8 = str3;
        boolean z4 = z;
        int i3 = i;
        EditVideoSegment editVideoSegment2 = editVideoSegment;
        String str9 = str;
        C69905c cVar2 = cVar;
        String str10 = str2;
        String str11 = str6;
        String str12 = str7;
        User user2 = user;
        String str13 = str4;
        String str14 = str5;
        long j4 = j;
        long j5 = j3;
        boolean z5 = z3;
        long j6 = j2;
        boolean z6 = z2;
        if ((i2 & 1) != 0) {
            editVideoSegment2 = stitchParams.f164175a;
        }
        if ((i2 & 2) != 0) {
            str9 = stitchParams.f164176b;
        }
        if ((i2 & 4) != 0) {
            cVar2 = stitchParams.f164177c;
        }
        if ((i2 & 8) != 0) {
            str10 = stitchParams.f164178d;
        }
        if ((i2 & 16) != 0) {
            i3 = stitchParams.f164179e;
        }
        if ((i2 & 32) != 0) {
            z4 = stitchParams.f164180f;
        }
        if ((i2 & 64) != 0) {
            str8 = stitchParams.f164181g;
        }
        if ((i2 & 128) != 0) {
            user2 = stitchParams.f164182h;
        }
        if ((i2 & 256) != 0) {
            str13 = stitchParams.f164183i;
        }
        if ((i2 & 512) != 0) {
            str14 = stitchParams.f164184j;
        }
        if ((i2 & 1024) != 0) {
            j4 = stitchParams.f164185k;
        }
        if ((i2 & 2048) != 0) {
            str11 = stitchParams.f164186l;
        }
        if ((i2 & 4096) != 0) {
            str12 = stitchParams.f164187m;
        }
        if ((i2 & 8192) != 0) {
            z6 = stitchParams.f164188n;
        }
        if ((i2 & 16384) != 0) {
            z5 = stitchParams.f164189o;
        }
        if ((32768 & i2) != 0) {
            j6 = stitchParams.f164190p;
        }
        if ((i2 & 65536) != 0) {
            j5 = stitchParams.f164191q;
        }
        return stitchParams.copy(editVideoSegment2, str9, cVar2, str10, i3, z4, str8, user2, str13, str14, j4, str11, str12, z6, z5, j6, j5);
    }

    public final EditVideoSegment component1() {
        return this.f164175a;
    }

    public final String component10() {
        return this.f164184j;
    }

    public final long component11() {
        return this.f164185k;
    }

    public final String component12() {
        return this.f164186l;
    }

    public final String component13() {
        return this.f164187m;
    }

    public final boolean component14() {
        return this.f164188n;
    }

    public final boolean component15() {
        return this.f164189o;
    }

    public final long component16() {
        return this.f164190p;
    }

    public final long component17() {
        return this.f164191q;
    }

    public final String component2() {
        return this.f164176b;
    }

    public final C69905c component3() {
        return this.f164177c;
    }

    public final String component4() {
        return this.f164178d;
    }

    public final int component5() {
        return this.f164179e;
    }

    public final boolean component6() {
        return this.f164180f;
    }

    public final String component7() {
        return this.f164181g;
    }

    public final User component8() {
        return this.f164182h;
    }

    public final String component9() {
        return this.f164183i;
    }

    public final StitchParams copy(EditVideoSegment editVideoSegment, String str, C69905c cVar, String str2, int i, boolean z, String str3, User user, String str4, String str5, long j, String str6, String str7, boolean z2, boolean z3, long j2, long j3) {
        return new StitchParams(editVideoSegment, str, cVar, str2, i, z, str3, user, str4, str5, j, str6, str7, z2, z3, j2, j3);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StitchParams)) {
            return false;
        }
        StitchParams stitchParams = (StitchParams) obj;
        return C89219l.m154714a(this.f164175a, stitchParams.f164175a) && C89219l.m154714a(this.f164176b, stitchParams.f164176b) && C89219l.m154714a(this.f164177c, stitchParams.f164177c) && C89219l.m154714a(this.f164178d, stitchParams.f164178d) && this.f164179e == stitchParams.f164179e && this.f164180f == stitchParams.f164180f && C89219l.m154714a(this.f164181g, stitchParams.f164181g) && C89219l.m154714a(this.f164182h, stitchParams.f164182h) && C89219l.m154714a(this.f164183i, stitchParams.f164183i) && C89219l.m154714a(this.f164184j, stitchParams.f164184j) && this.f164185k == stitchParams.f164185k && C89219l.m154714a(this.f164186l, stitchParams.f164186l) && C89219l.m154714a(this.f164187m, stitchParams.f164187m) && this.f164188n == stitchParams.f164188n && this.f164189o == stitchParams.f164189o && this.f164190p == stitchParams.f164190p && this.f164191q == stitchParams.f164191q;
    }

    public final int hashCode() {
        EditVideoSegment editVideoSegment = this.f164175a;
        int i = 0;
        int hashCode = (editVideoSegment != null ? editVideoSegment.hashCode() : 0) * 31;
        String str = this.f164176b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        C69905c cVar = this.f164177c;
        int hashCode3 = (hashCode2 + (cVar != null ? cVar.hashCode() : 0)) * 31;
        String str2 = this.f164178d;
        int hashCode4 = (((hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + m129124x1727de14(this.f164179e)) * 31;
        boolean z = this.f164180f;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode4 + i3) * 31;
        String str3 = this.f164181g;
        int hashCode5 = (i6 + (str3 != null ? str3.hashCode() : 0)) * 31;
        User user = this.f164182h;
        int hashCode6 = (hashCode5 + (user != null ? user.hashCode() : 0)) * 31;
        String str4 = this.f164183i;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f164184j;
        int hashCode8 = (((hashCode7 + (str5 != null ? str5.hashCode() : 0)) * 31) + m129125x1727de14(this.f164185k)) * 31;
        String str6 = this.f164186l;
        int hashCode9 = (hashCode8 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.f164187m;
        if (str7 != null) {
            i = str7.hashCode();
        }
        int i7 = (hashCode9 + i) * 31;
        boolean z2 = this.f164188n;
        if (z2) {
            z2 = true;
        }
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = z2 ? 1 : 0;
        int i11 = (i7 + i8) * 31;
        if (!this.f164189o) {
            i2 = 0;
        }
        return ((((i11 + i2) * 31) + m129125x1727de14(this.f164190p)) * 31) + m129125x1727de14(this.f164191q);
    }

    public final String toString() {
        return "StitchParams(videoSegment=" + this.f164175a + ", videoPath=" + this.f164176b + ", music=" + this.f164177c + ", musicPath=" + this.f164178d + ", musicStart=" + this.f164179e + ", isPGCMusic=" + this.f164180f + ", musicId=" + this.f164181g + ", fromUser=" + this.f164182h + ", awemeId=" + this.f164183i + ", chain=" + this.f164184j + ", duration=" + this.f164185k + ", concatVideoPath=" + this.f164186l + ", concatAudioPath=" + this.f164187m + ", enableMic=" + this.f164188n + ", isMuted=" + this.f164189o + ", startTime=" + this.f164190p + ", endTime=" + this.f164191q + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeParcelable(this.f164175a, i);
        parcel.writeString(this.f164176b);
        parcel.writeSerializable(this.f164177c);
        parcel.writeString(this.f164178d);
        parcel.writeInt(this.f164179e);
        parcel.writeInt(this.f164180f ? 1 : 0);
        parcel.writeString(this.f164181g);
        parcel.writeSerializable(this.f164182h);
        parcel.writeString(this.f164183i);
        parcel.writeString(this.f164184j);
        parcel.writeLong(this.f164185k);
        parcel.writeString(this.f164186l);
        parcel.writeString(this.f164187m);
        parcel.writeInt(this.f164188n ? 1 : 0);
        parcel.writeInt(this.f164189o ? 1 : 0);
        parcel.writeLong(this.f164190p);
        parcel.writeLong(this.f164191q);
    }

    public final String getAwemeId() {
        return this.f164183i;
    }

    public final String getChain() {
        return this.f164184j;
    }

    public final String getConcatAudioPath() {
        return this.f164187m;
    }

    public final String getConcatVideoPath() {
        return this.f164186l;
    }

    public final long getDuration() {
        return this.f164185k;
    }

    public final boolean getEnableMic() {
        return this.f164188n;
    }

    public final long getEndTime() {
        return this.f164191q;
    }

    public final User getFromUser() {
        return this.f164182h;
    }

    public final C69905c getMusic() {
        return this.f164177c;
    }

    public final String getMusicId() {
        return this.f164181g;
    }

    public final String getMusicPath() {
        return this.f164178d;
    }

    public final int getMusicStart() {
        return this.f164179e;
    }

    public final long getStartTime() {
        return this.f164190p;
    }

    public final String getVideoPath() {
        return this.f164176b;
    }

    public final EditVideoSegment getVideoSegment() {
        return this.f164175a;
    }

    public final boolean isMuted() {
        return this.f164189o;
    }

    public final boolean isPGCMusic() {
        return this.f164180f;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams$a */
    public static class C73118a implements Parcelable.Creator<StitchParams> {
        static {
            Covode.recordClassIndex(85829);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ StitchParams[] newArray(int i) {
            return new StitchParams[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ StitchParams createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new StitchParams((EditVideoSegment) parcel.readParcelable(StitchParams.class.getClassLoader()), parcel.readString(), (C69905c) parcel.readSerializable(), parcel.readString(), parcel.readInt(), parcel.readInt() != 0, parcel.readString(), (User) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readLong(), parcel.readLong());
        }
    }

    public final void setAwemeId(String str) {
        this.f164183i = str;
    }

    public final void setChain(String str) {
        this.f164184j = str;
    }

    public final void setConcatAudioPath(String str) {
        this.f164187m = str;
    }

    public final void setConcatVideoPath(String str) {
        this.f164186l = str;
    }

    public final void setDuration(long j) {
        this.f164185k = j;
    }

    public final void setEnableMic(boolean z) {
        this.f164188n = z;
    }

    public final void setEndTime(long j) {
        this.f164191q = j;
    }

    public final void setFromUser(User user) {
        this.f164182h = user;
    }

    public final void setMusic(C69905c cVar) {
        this.f164177c = cVar;
    }

    public final void setMusicId(String str) {
        this.f164181g = str;
    }

    public final void setMusicPath(String str) {
        this.f164178d = str;
    }

    public final void setMusicStart(int i) {
        this.f164179e = i;
    }

    public final void setMuted(boolean z) {
        this.f164189o = z;
    }

    public final void setPGCMusic(boolean z) {
        this.f164180f = z;
    }

    public final void setStartTime(long j) {
        this.f164190p = j;
    }

    public final void setVideoPath(String str) {
        this.f164176b = str;
    }

    public final void setVideoSegment(EditVideoSegment editVideoSegment) {
        this.f164175a = editVideoSegment;
    }

    public StitchParams(EditVideoSegment editVideoSegment, String str, C69905c cVar, String str2, int i, boolean z, String str3, User user, String str4, String str5, long j, String str6, String str7, boolean z2, boolean z3, long j2, long j3) {
        this.f164175a = editVideoSegment;
        this.f164176b = str;
        this.f164177c = cVar;
        this.f164178d = str2;
        this.f164179e = i;
        this.f164180f = z;
        this.f164181g = str3;
        this.f164182h = user;
        this.f164183i = str4;
        this.f164184j = str5;
        this.f164185k = j;
        this.f164186l = str6;
        this.f164187m = str7;
        this.f164188n = z2;
        this.f164189o = z3;
        this.f164190p = j2;
        this.f164191q = j3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StitchParams(EditVideoSegment editVideoSegment, String str, C69905c cVar, String str2, int i, boolean z, String str3, User user, String str4, String str5, long j, String str6, String str7, boolean z2, boolean z3, long j2, long j3, int i2, C89214g gVar) {
        this((i2 & 1) != 0 ? null : editVideoSegment, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : cVar, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? 0 : i, (i2 & 32) != 0 ? false : z, (i2 & 64) != 0 ? null : str3, (i2 & 128) != 0 ? null : user, (i2 & 256) != 0 ? null : str4, (i2 & 512) != 0 ? null : str5, (i2 & 1024) != 0 ? 0 : j, (i2 & 2048) != 0 ? null : str6, (i2 & 4096) != 0 ? null : str7, (i2 & 8192) != 0 ? true : z2, (i2 & 16384) != 0 ? false : z3, (32768 & i2) != 0 ? 0 : j2, (i2 & 65536) != 0 ? 0 : j3);
    }
}
