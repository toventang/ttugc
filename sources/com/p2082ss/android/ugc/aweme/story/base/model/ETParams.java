package com.p2082ss.android.ugc.aweme.story.base.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.base.model.ETParams */
public final class ETParams implements Parcelable, Serializable {
    public static final Parcelable.Creator<ETParams> CREATOR = new C76630a();

    /* renamed from: a */
    private final String f171966a;

    /* renamed from: b */
    private final String f171967b;

    /* renamed from: c */
    private final String f171968c;

    /* renamed from: d */
    private final long f171969d;

    /* renamed from: e */
    private final long f171970e;

    /* renamed from: f */
    private final float f171971f;

    static {
        Covode.recordClassIndex(89617);
    }

    public ETParams() {
        this(null, null, null, 0, 0, 0.0f, 63, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_story_base_model_ETParams_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m134219xc9808050(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static /* synthetic */ ETParams copy$default(ETParams eTParams, String str, String str2, String str3, long j, long j2, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eTParams.f171966a;
        }
        if ((i & 2) != 0) {
            str2 = eTParams.f171967b;
        }
        if ((i & 4) != 0) {
            str3 = eTParams.f171968c;
        }
        if ((i & 8) != 0) {
            j = eTParams.f171969d;
        }
        if ((i & 16) != 0) {
            j2 = eTParams.f171970e;
        }
        if ((i & 32) != 0) {
            f = eTParams.f171971f;
        }
        return eTParams.copy(str, str2, str3, j, j2, f);
    }

    public final String component1() {
        return this.f171966a;
    }

    public final String component2() {
        return this.f171967b;
    }

    public final String component3() {
        return this.f171968c;
    }

    public final long component4() {
        return this.f171969d;
    }

    public final long component5() {
        return this.f171970e;
    }

    public final float component6() {
        return this.f171971f;
    }

    public final ETParams copy(String str, String str2, String str3, long j, long j2, float f) {
        return new ETParams(str, str2, str3, j, j2, f);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ETParams)) {
            return false;
        }
        ETParams eTParams = (ETParams) obj;
        return C89219l.m154714a(this.f171966a, eTParams.f171966a) && C89219l.m154714a(this.f171967b, eTParams.f171967b) && C89219l.m154714a(this.f171968c, eTParams.f171968c) && this.f171969d == eTParams.f171969d && this.f171970e == eTParams.f171970e && Float.compare(this.f171971f, eTParams.f171971f) == 0;
    }

    public final int hashCode() {
        String str = this.f171966a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f171967b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f171968c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((((((hashCode2 + i) * 31) + m134219xc9808050(this.f171969d)) * 31) + m134219xc9808050(this.f171970e)) * 31) + m134218xc9808050(this.f171971f);
    }

    public final String toString() {
        return "ETParams(shootWay=" + this.f171966a + ", enterMethod=" + this.f171967b + ", recordWay=" + this.f171968c + ", startTime=" + this.f171969d + ", compileTime=" + this.f171970e + ", zoom=" + this.f171971f + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeString(this.f171966a);
        parcel.writeString(this.f171967b);
        parcel.writeString(this.f171968c);
        parcel.writeLong(this.f171969d);
        parcel.writeLong(this.f171970e);
        parcel.writeFloat(this.f171971f);
    }

    public final long getCompileTime() {
        return this.f171970e;
    }

    public final String getEnterMethod() {
        return this.f171967b;
    }

    public final String getRecordWay() {
        return this.f171968c;
    }

    public final String getShootWay() {
        return this.f171966a;
    }

    public final long getStartTime() {
        return this.f171969d;
    }

    public final float getZoom() {
        return this.f171971f;
    }

    /* renamed from: com.ss.android.ugc.aweme.story.base.model.ETParams$a */
    public static class C76630a implements Parcelable.Creator<ETParams> {
        static {
            Covode.recordClassIndex(89618);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ETParams[] newArray(int i) {
            return new ETParams[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ETParams createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new ETParams(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readFloat());
        }
    }

    /* renamed from: com_ss_android_ugc_aweme_story_base_model_ETParams_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m134218xc9808050(float f) {
        return Float.floatToIntBits(f);
    }

    public ETParams(String str, String str2, String str3, long j, long j2, float f) {
        this.f171966a = str;
        this.f171967b = str2;
        this.f171968c = str3;
        this.f171969d = j;
        this.f171970e = j2;
        this.f171971f = f;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ETParams(String str, String str2, String str3, long j, long j2, float f, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) == 0 ? str3 : null, (i & 8) != 0 ? 0 : j, (i & 16) == 0 ? j2 : 0, (i & 32) != 0 ? -1.0f : f);
    }
}
