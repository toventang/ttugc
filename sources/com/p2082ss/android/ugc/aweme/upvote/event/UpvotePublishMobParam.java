package com.p2082ss.android.ugc.aweme.upvote.event;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.upvote.event.UpvotePublishMobParam */
public final class UpvotePublishMobParam implements Parcelable {
    public static final Parcelable.Creator<UpvotePublishMobParam> CREATOR = new C79897a();

    /* renamed from: a */
    public String f179137a;

    /* renamed from: b */
    public String f179138b;

    /* renamed from: c */
    public String f179139c;

    /* renamed from: d */
    public String f179140d;

    /* renamed from: e */
    public String f179141e;

    static {
        Covode.recordClassIndex(93122);
    }

    public UpvotePublishMobParam() {
        this(null, null, null, null, null, 31);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpvotePublishMobParam)) {
            return false;
        }
        UpvotePublishMobParam upvotePublishMobParam = (UpvotePublishMobParam) obj;
        return C89219l.m154714a(this.f179137a, upvotePublishMobParam.f179137a) && C89219l.m154714a(this.f179138b, upvotePublishMobParam.f179138b) && C89219l.m154714a(this.f179139c, upvotePublishMobParam.f179139c) && C89219l.m154714a(this.f179140d, upvotePublishMobParam.f179140d) && C89219l.m154714a(this.f179141e, upvotePublishMobParam.f179141e);
    }

    public final int hashCode() {
        String str = this.f179137a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f179138b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f179139c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f179140d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f179141e;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        return "UpvotePublishMobParam(enterFrom=" + this.f179137a + ", enterMethod=" + this.f179138b + ", groupId=" + this.f179139c + ", authorId=" + this.f179140d + ", followStatus=" + this.f179141e + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeString(this.f179137a);
        parcel.writeString(this.f179138b);
        parcel.writeString(this.f179139c);
        parcel.writeString(this.f179140d);
        parcel.writeString(this.f179141e);
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.event.UpvotePublishMobParam$a */
    public static class C79897a implements Parcelable.Creator<UpvotePublishMobParam> {
        static {
            Covode.recordClassIndex(93123);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ UpvotePublishMobParam[] newArray(int i) {
            return new UpvotePublishMobParam[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ UpvotePublishMobParam createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new UpvotePublishMobParam(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }
    }

    /* renamed from: a */
    public final void mo123403a(String str) {
        C89219l.m154721d(str, "");
        this.f179138b = str;
    }

    public UpvotePublishMobParam(String str, String str2, String str3, String str4, String str5) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        C89219l.m154721d(str5, "");
        this.f179137a = str;
        this.f179138b = str2;
        this.f179139c = str3;
        this.f179140d = str4;
        this.f179141e = str5;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ UpvotePublishMobParam(java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, int r12) {
        /*
            r6 = this;
            r4 = r10
            r3 = r9
            r2 = r8
            r1 = r7
            r0 = r12 & 1
            java.lang.String r5 = ""
            if (r0 == 0) goto L_0x000b
            r1 = r5
        L_0x000b:
            r0 = r12 & 2
            if (r0 == 0) goto L_0x0010
            r2 = r5
        L_0x0010:
            r0 = r12 & 4
            if (r0 == 0) goto L_0x0015
            r3 = r5
        L_0x0015:
            r0 = r12 & 8
            if (r0 == 0) goto L_0x001a
            r4 = r5
        L_0x001a:
            r0 = r12 & 16
            if (r0 == 0) goto L_0x0023
        L_0x001e:
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return
        L_0x0023:
            r5 = r11
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.upvote.event.UpvotePublishMobParam.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):void");
    }
}
