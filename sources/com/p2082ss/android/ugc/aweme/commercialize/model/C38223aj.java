package com.p2082ss.android.ugc.aweme.commercialize.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.model.aj */
public final class C38223aj implements Serializable {

    /* renamed from: a */
    private final String f90303a;

    /* renamed from: b */
    private long f90304b;

    /* renamed from: c */
    private final AwemeRawAd f90305c;

    static {
        Covode.recordClassIndex(45707);
    }

    /* renamed from: com_ss_android_ugc_aweme_commercialize_model_OpenAppBackLogParams_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m77590x177dfd26(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static /* synthetic */ C38223aj copy$default(C38223aj ajVar, String str, long j, AwemeRawAd awemeRawAd, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ajVar.f90303a;
        }
        if ((i & 2) != 0) {
            j = ajVar.f90304b;
        }
        if ((i & 4) != 0) {
            awemeRawAd = ajVar.f90305c;
        }
        return ajVar.copy(str, j, awemeRawAd);
    }

    public final String component1() {
        return this.f90303a;
    }

    public final long component2() {
        return this.f90304b;
    }

    public final AwemeRawAd component3() {
        return this.f90305c;
    }

    public final C38223aj copy(String str, long j, AwemeRawAd awemeRawAd) {
        C89219l.m154721d(str, "");
        return new C38223aj(str, j, awemeRawAd);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38223aj)) {
            return false;
        }
        C38223aj ajVar = (C38223aj) obj;
        return C89219l.m154714a(this.f90303a, ajVar.f90303a) && this.f90304b == ajVar.f90304b && C89219l.m154714a(this.f90305c, ajVar.f90305c);
    }

    public final int hashCode() {
        String str = this.f90303a;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + m77590x177dfd26(this.f90304b)) * 31;
        AwemeRawAd awemeRawAd = this.f90305c;
        if (awemeRawAd != null) {
            i = awemeRawAd.hashCode();
        }
        return hashCode + i;
    }

    public final AwemeRawAd getAwemeRawAd() {
        return this.f90305c;
    }

    public final long getStartTime() {
        return this.f90304b;
    }

    public final String getTag() {
        return this.f90303a;
    }

    public final String toJson() {
        String b = new C27910f().mo46674b(this);
        C89219l.m154716b(b, "");
        return b;
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.model.aj$a */
    public static final class C38224a {

        /* renamed from: a */
        public String f90306a = "";

        /* renamed from: b */
        public long f90307b;

        /* renamed from: c */
        public AwemeRawAd f90308c;

        static {
            Covode.recordClassIndex(45708);
        }

        /* renamed from: a */
        public final C38223aj mo66652a() {
            return new C38223aj(this.f90306a, this.f90307b, this.f90308c, null);
        }

        /* renamed from: a */
        public final C38224a mo66649a(long j) {
            this.f90307b = j;
            return this;
        }

        /* renamed from: a */
        public final C38224a mo66650a(AwemeRawAd awemeRawAd) {
            this.f90308c = awemeRawAd;
            return this;
        }

        /* renamed from: a */
        public final C38224a mo66651a(String str) {
            C89219l.m154721d(str, "");
            this.f90306a = str;
            return this;
        }
    }

    public final String toString() {
        return "tag=" + this.f90303a + ", startTime=" + this.f90304b + ", awemeRawAd=" + this.f90305c;
    }

    public final void setStartTime(long j) {
        this.f90304b = j;
    }

    private C38223aj(String str, long j, AwemeRawAd awemeRawAd) {
        this.f90303a = str;
        this.f90304b = j;
        this.f90305c = awemeRawAd;
    }

    public /* synthetic */ C38223aj(String str, long j, AwemeRawAd awemeRawAd, C89214g gVar) {
        this(str, j, awemeRawAd);
    }
}
