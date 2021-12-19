package com.p2082ss.android.ugc.aweme.account.util;

import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import java.lang.reflect.Type;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.account.util.i */
public final class C33039i {

    /* renamed from: a */
    public static final C33039i f78583a = new C33039i();

    /* renamed from: b */
    private static final boolean f78584b = false;

    /* renamed from: c */
    private static final AbstractC89244h f78585c = C89250i.m154773a((AbstractC89171a) C33040a.f78586a);

    /* renamed from: a */
    public static C27910f m67673a() {
        return (C27910f) f78585c.getValue();
    }

    private C33039i() {
    }

    /* renamed from: com.ss.android.ugc.aweme.account.util.i$a */
    static final class C33040a extends AbstractC89220m implements AbstractC89171a<C27910f> {

        /* renamed from: a */
        public static final C33040a f78586a = new C33040a();

        static {
            Covode.recordClassIndex(39847);
        }

        C33040a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C27910f invoke() {
            return new C27910f();
        }
    }

    static {
        Covode.recordClassIndex(39846);
    }

    /* renamed from: a */
    public static <T> T m67674a(String str, Class<T> cls) {
        return (T) m67673a().mo46670a(str, (Class) cls);
    }

    /* renamed from: a */
    public static <T> T m67675a(String str, Type type) {
        return (T) m67673a().mo46671a(str, type);
    }
}
