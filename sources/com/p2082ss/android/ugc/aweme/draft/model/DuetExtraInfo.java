package com.p2082ss.android.ugc.aweme.draft.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.draft.model.DuetExtraInfo */
public final class DuetExtraInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<DuetExtraInfo> CREATOR = new C43219a();
    @AbstractC27891c(mo46611a = "duet_video_path")

    /* renamed from: a */
    private final String f100728a;
    @AbstractC27891c(mo46611a = "duet_audio_path")

    /* renamed from: b */
    private final String f100729b;
    @AbstractC27891c(mo46611a = "duet_video_width")

    /* renamed from: c */
    private final int f100730c;
    @AbstractC27891c(mo46611a = "duet_video_height")

    /* renamed from: d */
    private final int f100731d;
    @AbstractC27891c(mo46611a = "duet_layout_mode")

    /* renamed from: e */
    private final String f100732e;
    @AbstractC27891c(mo46611a = "duet_layout_direction")

    /* renamed from: f */
    private final int f100733f;

    static {
        Covode.recordClassIndex(51419);
    }

    public DuetExtraInfo() {
        this(null, null, 0, 0, null, 0, 63, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_draft_model_DuetExtraInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m86195xc81aa46b(int i) {
        return i;
    }

    public static /* synthetic */ DuetExtraInfo copy$default(DuetExtraInfo duetExtraInfo, String str, String str2, int i, int i2, String str3, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = duetExtraInfo.f100728a;
        }
        if ((i4 & 2) != 0) {
            str2 = duetExtraInfo.f100729b;
        }
        if ((i4 & 4) != 0) {
            i = duetExtraInfo.f100730c;
        }
        if ((i4 & 8) != 0) {
            i2 = duetExtraInfo.f100731d;
        }
        if ((i4 & 16) != 0) {
            str3 = duetExtraInfo.f100732e;
        }
        if ((i4 & 32) != 0) {
            i3 = duetExtraInfo.f100733f;
        }
        return duetExtraInfo.copy(str, str2, i, i2, str3, i3);
    }

    public final String component1() {
        return this.f100728a;
    }

    public final String component2() {
        return this.f100729b;
    }

    public final int component3() {
        return this.f100730c;
    }

    public final int component4() {
        return this.f100731d;
    }

    public final String component5() {
        return this.f100732e;
    }

    public final int component6() {
        return this.f100733f;
    }

    public final DuetExtraInfo copy(String str, String str2, int i, int i2, String str3, int i3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        return new DuetExtraInfo(str, str2, i, i2, str3, i3);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DuetExtraInfo)) {
            return false;
        }
        DuetExtraInfo duetExtraInfo = (DuetExtraInfo) obj;
        return C89219l.m154714a(this.f100728a, duetExtraInfo.f100728a) && C89219l.m154714a(this.f100729b, duetExtraInfo.f100729b) && this.f100730c == duetExtraInfo.f100730c && this.f100731d == duetExtraInfo.f100731d && C89219l.m154714a(this.f100732e, duetExtraInfo.f100732e) && this.f100733f == duetExtraInfo.f100733f;
    }

    public final int hashCode() {
        String str = this.f100728a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f100729b;
        int hashCode2 = (((((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + m86195xc81aa46b(this.f100730c)) * 31) + m86195xc81aa46b(this.f100731d)) * 31;
        String str3 = this.f100732e;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((hashCode2 + i) * 31) + m86195xc81aa46b(this.f100733f);
    }

    public final String toString() {
        return "DuetExtraInfo(duetVideoPath=" + this.f100728a + ", duetAudioPath=" + this.f100729b + ", duetVideoWidth=" + this.f100730c + ", duetVideoHeight=" + this.f100731d + ", duetLayoutMode=" + this.f100732e + ", duetLayoutDirection=" + this.f100733f + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeString(this.f100728a);
        parcel.writeString(this.f100729b);
        parcel.writeInt(this.f100730c);
        parcel.writeInt(this.f100731d);
        parcel.writeString(this.f100732e);
        parcel.writeInt(this.f100733f);
    }

    public final String getDuetAudioPath() {
        return this.f100729b;
    }

    public final int getDuetLayoutDirection() {
        return this.f100733f;
    }

    public final String getDuetLayoutMode() {
        return this.f100732e;
    }

    public final int getDuetVideoHeight() {
        return this.f100731d;
    }

    public final String getDuetVideoPath() {
        return this.f100728a;
    }

    public final int getDuetVideoWidth() {
        return this.f100730c;
    }

    /* renamed from: com.ss.android.ugc.aweme.draft.model.DuetExtraInfo$a */
    public static class C43219a implements Parcelable.Creator<DuetExtraInfo> {
        static {
            Covode.recordClassIndex(51420);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ DuetExtraInfo[] newArray(int i) {
            return new DuetExtraInfo[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DuetExtraInfo createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new DuetExtraInfo(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt());
        }
    }

    public DuetExtraInfo(String str, String str2, int i, int i2, String str3, int i3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        this.f100728a = str;
        this.f100729b = str2;
        this.f100730c = i;
        this.f100731d = i2;
        this.f100732e = str3;
        this.f100733f = i3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ DuetExtraInfo(java.lang.String r9, java.lang.String r10, int r11, int r12, java.lang.String r13, int r14, int r15, p4600h.p4611f.p4613b.C89214g r16) {
        /*
            r8 = this;
            r7 = r14
            r2 = r9
            r4 = r11
            r3 = r10
            r5 = r12
            r0 = r15 & 1
            java.lang.String r6 = ""
            if (r0 == 0) goto L_0x000c
            r2 = r6
        L_0x000c:
            r0 = r15 & 2
            if (r0 == 0) goto L_0x0011
            r3 = r6
        L_0x0011:
            r1 = r15 & 4
            r0 = 0
            if (r1 == 0) goto L_0x0017
            r4 = 0
        L_0x0017:
            r0 = r15 & 8
            if (r0 == 0) goto L_0x001c
            r5 = 0
        L_0x001c:
            r0 = r15 & 16
            if (r0 == 0) goto L_0x002a
        L_0x0020:
            r0 = r15 & 32
            if (r0 == 0) goto L_0x0025
            r7 = 0
        L_0x0025:
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return
        L_0x002a:
            r6 = r13
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.draft.model.DuetExtraInfo.<init>(java.lang.String, java.lang.String, int, int, java.lang.String, int, int, h.f.b.g):void");
    }
}
