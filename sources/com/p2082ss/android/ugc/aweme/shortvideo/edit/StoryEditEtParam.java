package com.p2082ss.android.ugc.aweme.shortvideo.edit;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.StoryEditEtParam */
public final class StoryEditEtParam implements Parcelable, Serializable {
    public static final Parcelable.Creator<StoryEditEtParam> CREATOR = new C70778a();

    /* renamed from: a */
    private final String f158463a;

    /* renamed from: b */
    private final String f158464b;

    /* renamed from: c */
    private final String f158465c;

    /* renamed from: d */
    private final String f158466d;

    /* renamed from: e */
    private final boolean f158467e;

    /* renamed from: f */
    private final int f158468f;

    static {
        Covode.recordClassIndex(83260);
    }

    /* renamed from: com_ss_android_ugc_aweme_shortvideo_edit_StoryEditEtParam_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m124992x19e5ee03(int i) {
        return i;
    }

    public static /* synthetic */ StoryEditEtParam copy$default(StoryEditEtParam storyEditEtParam, String str, String str2, String str3, String str4, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = storyEditEtParam.f158463a;
        }
        if ((i2 & 2) != 0) {
            str2 = storyEditEtParam.f158464b;
        }
        if ((i2 & 4) != 0) {
            str3 = storyEditEtParam.f158465c;
        }
        if ((i2 & 8) != 0) {
            str4 = storyEditEtParam.f158466d;
        }
        if ((i2 & 16) != 0) {
            z = storyEditEtParam.f158467e;
        }
        if ((i2 & 32) != 0) {
            i = storyEditEtParam.f158468f;
        }
        return storyEditEtParam.copy(str, str2, str3, str4, z, i);
    }

    public final String component1() {
        return this.f158463a;
    }

    public final String component2() {
        return this.f158464b;
    }

    public final String component3() {
        return this.f158465c;
    }

    public final String component4() {
        return this.f158466d;
    }

    public final boolean component5() {
        return this.f158467e;
    }

    public final int component6() {
        return this.f158468f;
    }

    public final StoryEditEtParam copy(String str, String str2, String str3, String str4, boolean z, int i) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        return new StoryEditEtParam(str, str2, str3, str4, z, i);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryEditEtParam)) {
            return false;
        }
        StoryEditEtParam storyEditEtParam = (StoryEditEtParam) obj;
        return C89219l.m154714a(this.f158463a, storyEditEtParam.f158463a) && C89219l.m154714a(this.f158464b, storyEditEtParam.f158464b) && C89219l.m154714a(this.f158465c, storyEditEtParam.f158465c) && C89219l.m154714a(this.f158466d, storyEditEtParam.f158466d) && this.f158467e == storyEditEtParam.f158467e && this.f158468f == storyEditEtParam.f158468f;
    }

    public final int hashCode() {
        String str = this.f158463a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f158464b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f158465c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f158466d;
        if (str4 != null) {
            i = str4.hashCode();
        }
        int i2 = (hashCode3 + i) * 31;
        boolean z = this.f158467e;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        return ((i2 + i3) * 31) + m124992x19e5ee03(this.f158468f);
    }

    public final String toString() {
        return "StoryEditEtParam(shootPage=" + this.f158463a + ", shootTabName=" + this.f158464b + ", contentSource=" + this.f158465c + ", contentType=" + this.f158466d + ", isMultiContent=" + this.f158467e + ", clipCount=" + this.f158468f + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeString(this.f158463a);
        parcel.writeString(this.f158464b);
        parcel.writeString(this.f158465c);
        parcel.writeString(this.f158466d);
        parcel.writeInt(this.f158467e ? 1 : 0);
        parcel.writeInt(this.f158468f);
    }

    public final int getClipCount() {
        return this.f158468f;
    }

    public final String getContentSource() {
        return this.f158465c;
    }

    public final String getContentType() {
        return this.f158466d;
    }

    public final String getShootPage() {
        return this.f158463a;
    }

    public final String getShootTabName() {
        return this.f158464b;
    }

    public final boolean isMultiContent() {
        return this.f158467e;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.StoryEditEtParam$a */
    public static class C70778a implements Parcelable.Creator<StoryEditEtParam> {
        static {
            Covode.recordClassIndex(83261);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ StoryEditEtParam[] newArray(int i) {
            return new StoryEditEtParam[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ StoryEditEtParam createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new StoryEditEtParam(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt());
        }
    }

    public StoryEditEtParam(String str, String str2, String str3, String str4, boolean z, int i) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        this.f158463a = str;
        this.f158464b = str2;
        this.f158465c = str3;
        this.f158466d = str4;
        this.f158467e = z;
        this.f158468f = i;
    }
}
