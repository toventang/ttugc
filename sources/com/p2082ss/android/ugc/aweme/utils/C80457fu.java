package com.p2082ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.utils.fu */
public final class C80457fu implements Serializable {
    public static final C80458a Companion = new C80458a((byte) 0);

    /* renamed from: a */
    private final AbstractC89244h f180034a = C89250i.m154773a((AbstractC89171a) C80459b.f180035a);

    static {
        Covode.recordClassIndex(93725);
    }

    /* renamed from: a */
    private final Map<String, Object> m139464a() {
        return (Map) this.f180034a.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.fu$a */
    public static final class C80458a {
        static {
            Covode.recordClassIndex(93726);
        }

        private C80458a() {
        }

        public /* synthetic */ C80458a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.fu$b */
    static final class C80459b extends AbstractC89220m implements AbstractC89171a<Map<String, Object>> {

        /* renamed from: a */
        public static final C80459b f180035a = new C80459b();

        static {
            Covode.recordClassIndex(93727);
        }

        C80459b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Map<String, Object> invoke() {
            return new LinkedHashMap();
        }
    }

    public final <T> T get(String str) {
        C89219l.m154721d(str, "");
        T t = (T) m139464a().get(str);
        if (!(t instanceof Object)) {
            return null;
        }
        return t;
    }

    public final <T> T get(Class<T> cls) {
        C89219l.m154721d(cls, "");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return null;
        }
        T t = (T) m139464a().get("com.ss.android.ugc.aweme.utils.ParamsBundle:".concat(String.valueOf(canonicalName)));
        if (!(t instanceof Object)) {
            return null;
        }
        return t;
    }

    public final <T> T get(Class<T> cls, T t) {
        C89219l.m154721d(cls, "");
        T t2 = (T) get(cls);
        return t2 == null ? t : t2;
    }

    public final <T> void put(String str, T t) {
        C89219l.m154721d(str, "");
        m139464a().put(str, t);
    }

    public final <T> void put(Class<T> cls, T t) {
        C89219l.m154721d(cls, "");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            m139464a().put("com.ss.android.ugc.aweme.utils.ParamsBundle:".concat(String.valueOf(canonicalName)), t);
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can't be the key of ParamBundle");
    }

    public final <T> T get(String str, T t) {
        C89219l.m154721d(str, "");
        T t2 = (T) get(str);
        return t2 == null ? t : t2;
    }
}
