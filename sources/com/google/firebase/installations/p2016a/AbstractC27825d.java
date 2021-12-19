package com.google.firebase.installations.p2016a;

import com.bytedance.covode.number.Covode;
import com.google.firebase.installations.p2016a.C27820a;
import com.google.firebase.installations.p2016a.C27823c;

/* renamed from: com.google.firebase.installations.a.d */
public abstract class AbstractC27825d {

    /* renamed from: a */
    public static AbstractC27825d f65371a = m55649m().mo46498a();

    /* renamed from: com.google.firebase.installations.a.d$a */
    public static abstract class AbstractC27826a {
        static {
            Covode.recordClassIndex(33415);
        }

        /* renamed from: a */
        public abstract AbstractC27826a mo46495a(long j);

        /* renamed from: a */
        public abstract AbstractC27826a mo46496a(C27823c.EnumC27824a aVar);

        /* renamed from: a */
        public abstract AbstractC27826a mo46497a(String str);

        /* renamed from: a */
        public abstract AbstractC27825d mo46498a();

        /* renamed from: b */
        public abstract AbstractC27826a mo46499b(long j);

        /* renamed from: b */
        public abstract AbstractC27826a mo46500b(String str);

        /* renamed from: c */
        public abstract AbstractC27826a mo46501c(String str);

        /* renamed from: d */
        public abstract AbstractC27826a mo46502d(String str);
    }

    /* renamed from: a */
    public abstract String mo46484a();

    /* renamed from: b */
    public abstract C27823c.EnumC27824a mo46485b();

    /* renamed from: c */
    public abstract String mo46486c();

    /* renamed from: d */
    public abstract String mo46487d();

    /* renamed from: e */
    public abstract long mo46488e();

    /* renamed from: f */
    public abstract long mo46490f();

    /* renamed from: g */
    public abstract String mo46491g();

    /* renamed from: h */
    public abstract AbstractC27826a mo46492h();

    /* renamed from: i */
    public final boolean mo46508i() {
        if (mo46485b() == C27823c.EnumC27824a.REGISTERED) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final boolean mo46509j() {
        if (mo46485b() == C27823c.EnumC27824a.REGISTER_ERROR) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public final boolean mo46510k() {
        if (mo46485b() == C27823c.EnumC27824a.UNREGISTERED) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(33414);
    }

    /* renamed from: m */
    public static AbstractC27826a m55649m() {
        return new C27820a.C27821a().mo46499b(0).mo46496a(C27823c.EnumC27824a.ATTEMPT_MIGRATION).mo46495a(0);
    }

    /* renamed from: l */
    public final boolean mo46511l() {
        if (mo46485b() == C27823c.EnumC27824a.NOT_GENERATED || mo46485b() == C27823c.EnumC27824a.ATTEMPT_MIGRATION) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final AbstractC27825d mo46507a(String str) {
        return mo46492h().mo46502d(str).mo46496a(C27823c.EnumC27824a.REGISTER_ERROR).mo46498a();
    }
}
