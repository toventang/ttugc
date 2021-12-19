package com.bytedance.ies.xbridge;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.model.p1341b.C18742c;
import com.bytedance.ies.xbridge.model.p1342c.AbstractC18744a;
import com.bytedance.ies.xbridge.model.params.AbstractC18749a;
import java.util.Map;

/* renamed from: com.bytedance.ies.xbridge.b */
public interface AbstractC18400b {

    /* renamed from: c */
    public static final C18403c f43990c = C18403c.f43993a;

    /* renamed from: com.bytedance.ies.xbridge.b$b */
    public interface AbstractC18402b {
        static {
            Covode.recordClassIndex(21074);
        }

        /* renamed from: a */
        void mo13405a(Map<String, Object> map);
    }

    /* renamed from: com.bytedance.ies.xbridge.b$d */
    public interface AbstractC18404d {
        static {
            Covode.recordClassIndex(21076);
        }

        /* renamed from: a */
        void mo13406a(String str, AbstractC18754n nVar);
    }

    static {
        Covode.recordClassIndex(21072);
    }

    /* renamed from: a */
    void mo29430a(C18742c cVar);

    /* renamed from: a */
    void mo7340a(AbstractC18754n nVar, AbstractC18402b bVar, EnumC18483e eVar);

    /* renamed from: b */
    String mo7341b();

    /* renamed from: c */
    EnumC18401a mo7346c();

    /* renamed from: d */
    Class<? extends AbstractC18749a> mo29415d();

    /* renamed from: e */
    Class<? extends AbstractC18744a> mo29416e();

    /* renamed from: f */
    void mo29431f();

    /* renamed from: com.bytedance.ies.xbridge.b$a */
    public enum EnumC18401a {
        PUBLIC("public"),
        PRIVATE("private"),
        PROTECT("protect"),
        SECURE("secure");
        

        /* renamed from: b */
        private final String f43992b;

        public final String getValue() {
            return this.f43992b;
        }

        static {
            Covode.recordClassIndex(21073);
        }

        private EnumC18401a(String str) {
            this.f43992b = str;
        }
    }

    /* renamed from: com.bytedance.ies.xbridge.b$c */
    public static final class C18403c {

        /* renamed from: a */
        static final /* synthetic */ C18403c f43993a = new C18403c();

        private C18403c() {
        }

        static {
            Covode.recordClassIndex(21075);
        }
    }
}
