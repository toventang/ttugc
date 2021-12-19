package com.p2082ss.android.ugc.aweme.mvtheme;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.mvtheme.MvNetFileBean */
public final class MvNetFileBean implements Parcelable, Serializable {
    public static final Parcelable.Creator<MvNetFileBean> CREATOR = new C61284a();
    @AbstractC27891c(mo46611a = "photo_path")

    /* renamed from: a */
    private final String f139177a;
    @AbstractC27891c(mo46611a = "algorithm")

    /* renamed from: b */
    private final String f139178b;
    @AbstractC27891c(mo46611a = "filePath")

    /* renamed from: c */
    private final String f139179c;
    @AbstractC27891c(mo46611a = "jsonParams")

    /* renamed from: d */
    private final String f139180d;

    static {
        Covode.recordClassIndex(71902);
    }

    public static /* synthetic */ MvNetFileBean copy$default(MvNetFileBean mvNetFileBean, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mvNetFileBean.f139177a;
        }
        if ((i & 2) != 0) {
            str2 = mvNetFileBean.f139178b;
        }
        if ((i & 4) != 0) {
            str3 = mvNetFileBean.f139179c;
        }
        if ((i & 8) != 0) {
            str4 = mvNetFileBean.f139180d;
        }
        return mvNetFileBean.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.f139177a;
    }

    public final String component2() {
        return this.f139178b;
    }

    public final String component3() {
        return this.f139179c;
    }

    public final String component4() {
        return this.f139180d;
    }

    public final MvNetFileBean copy(String str, String str2, String str3, String str4) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        return new MvNetFileBean(str, str2, str3, str4);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MvNetFileBean)) {
            return false;
        }
        MvNetFileBean mvNetFileBean = (MvNetFileBean) obj;
        return C89219l.m154714a(this.f139177a, mvNetFileBean.f139177a) && C89219l.m154714a(this.f139178b, mvNetFileBean.f139178b) && C89219l.m154714a(this.f139179c, mvNetFileBean.f139179c) && C89219l.m154714a(this.f139180d, mvNetFileBean.f139180d);
    }

    public final int hashCode() {
        String str = this.f139177a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f139178b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f139179c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f139180d;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "MvNetFileBean(photonPath=" + this.f139177a + ", algorithm=" + this.f139178b + ", filePath=" + this.f139179c + ", jsonParams=" + this.f139180d + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeString(this.f139177a);
        parcel.writeString(this.f139178b);
        parcel.writeString(this.f139179c);
        parcel.writeString(this.f139180d);
    }

    public final String getAlgorithm() {
        return this.f139178b;
    }

    public final String getFilePath() {
        return this.f139179c;
    }

    public final String getJsonParams() {
        return this.f139180d;
    }

    public final String getPhotonPath() {
        return this.f139177a;
    }

    /* renamed from: com.ss.android.ugc.aweme.mvtheme.MvNetFileBean$a */
    public static class C61284a implements Parcelable.Creator<MvNetFileBean> {
        static {
            Covode.recordClassIndex(71903);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ MvNetFileBean[] newArray(int i) {
            return new MvNetFileBean[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ MvNetFileBean createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new MvNetFileBean(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }
    }

    public MvNetFileBean(String str, String str2, String str3, String str4) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        this.f139177a = str;
        this.f139178b = str2;
        this.f139179c = str3;
        this.f139180d = str4;
    }
}
