package com.p2082ss.android.ugc.aweme.commercialize.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;

/* renamed from: com.ss.android.ugc.aweme.commercialize.model.p */
public final class C38249p implements Serializable {
    public static final C38250a Companion = new C38250a((byte) 0);
    public static final C38249p DEFAULT_DISABLE_VERSION = new C38249p(0, 0, 0, 7, null);
    public static final C38249p DEFAULT_ONLINE_VERSION = new C38249p(0, 0, 0, 7, null);
    public static final C38249p DEFAULT_TEST_VERSION = new C38249p(12, 9, 6);
    @AbstractC27891c(mo46611a = "visit_ad_max_interval")

    /* renamed from: a */
    private final long f90377a;
    @AbstractC27891c(mo46611a = "visit_ad_min_interval")

    /* renamed from: b */
    private final long f90378b;
    @AbstractC27891c(mo46611a = "request_period")

    /* renamed from: c */
    private final long f90379c;

    public C38249p() {
        this(0, 0, 0, 7, null);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.model.p$a */
    public static final class C38250a {
        static {
            Covode.recordClassIndex(45734);
        }

        private C38250a() {
        }

        public /* synthetic */ C38250a(byte b) {
            this();
        }
    }

    public final long getRequestPeriod() {
        return this.f90379c;
    }

    public final long getVisitAdMaxInterval() {
        return this.f90377a;
    }

    public final long getVisitAdMinInterval() {
        return this.f90378b;
    }

    static {
        Covode.recordClassIndex(45733);
    }

    public C38249p(long j, long j2, long j3) {
        this.f90377a = j;
        this.f90378b = j2;
        this.f90379c = j3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C38249p(long j, long j2, long j3, int i, C89214g gVar) {
        this((i & 1) != 0 ? 120 : j, (i & 2) != 0 ? 90 : j2, (i & 4) != 0 ? 60 : j3);
    }
}
