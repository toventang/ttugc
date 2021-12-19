package com.p2082ss.android.ugc.aweme.shortvideo;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ExtraSession */
public final class ExtraSession implements Parcelable {
    public static final Parcelable.Creator<ExtraSession> CREATOR = new C69731a();

    /* renamed from: a */
    public String f155705a;

    /* renamed from: b */
    public String f155706b;

    /* renamed from: c */
    public String f155707c;

    /* renamed from: d */
    public String f155708d;

    /* renamed from: e */
    public String f155709e;

    /* renamed from: f */
    public String f155710f;

    static {
        Covode.recordClassIndex(82119);
    }

    public ExtraSession(byte b) {
        this();
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExtraSession)) {
            return false;
        }
        ExtraSession extraSession = (ExtraSession) obj;
        return C89219l.m154714a(this.f155705a, extraSession.f155705a) && C89219l.m154714a(this.f155706b, extraSession.f155706b) && C89219l.m154714a(this.f155707c, extraSession.f155707c) && C89219l.m154714a(this.f155708d, extraSession.f155708d) && C89219l.m154714a(this.f155709e, extraSession.f155709e) && C89219l.m154714a(this.f155710f, extraSession.f155710f);
    }

    public final int hashCode() {
        String str = this.f155705a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f155706b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f155707c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f155708d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f155709e;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f155710f;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return hashCode5 + i;
    }

    public final String toString() {
        return "ExtraSession(mainBusinessData=" + this.f155705a + ", socialData=" + this.f155706b + ", commerceData=" + this.f155707c + ", ugData=" + this.f155708d + ", techData=" + this.f155709e + ", globalData=" + this.f155710f + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeString(this.f155705a);
        parcel.writeString(this.f155706b);
        parcel.writeString(this.f155707c);
        parcel.writeString(this.f155708d);
        parcel.writeString(this.f155709e);
        parcel.writeString(this.f155710f);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ExtraSession$a */
    public static class C69731a implements Parcelable.Creator<ExtraSession> {
        static {
            Covode.recordClassIndex(82120);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ExtraSession[] newArray(int i) {
            return new ExtraSession[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ExtraSession createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new ExtraSession(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }
    }

    private /* synthetic */ ExtraSession() {
        this(null, null, null, null, null, null);
    }

    public ExtraSession(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f155705a = str;
        this.f155706b = str2;
        this.f155707c = str3;
        this.f155708d = str4;
        this.f155709e = str5;
        this.f155710f = str6;
    }
}
