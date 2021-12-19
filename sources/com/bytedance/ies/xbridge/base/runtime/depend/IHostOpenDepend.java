package com.bytedance.ies.xbridge.base.runtime.depend;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.model.p1341b.C18742c;
import p4600h.C89391z;

public interface IHostOpenDepend {

    /* renamed from: com.bytedance.ies.xbridge.base.runtime.depend.IHostOpenDepend$b */
    public interface AbstractC18455b {
        static {
            Covode.recordClassIndex(21139);
        }

        /* renamed from: a */
        void mo29558a(C18454a aVar);
    }

    /* renamed from: com.bytedance.ies.xbridge.base.runtime.depend.IHostOpenDepend$c */
    public interface AbstractC18456c {
        static {
            Covode.recordClassIndex(21140);
        }

        /* renamed from: a */
        void mo29559a(String str);

        /* renamed from: b */
        void mo29560b(String str);
    }

    /* renamed from: com.bytedance.ies.xbridge.base.runtime.depend.IHostOpenDepend$d */
    public interface AbstractC18457d {
        static {
            Covode.recordClassIndex(21141);
        }

        /* renamed from: a */
        void mo29561a();

        /* renamed from: b */
        void mo29562b();

        /* renamed from: c */
        void mo29563c();
    }

    static {
        Covode.recordClassIndex(21137);
    }

    C89391z getGeckoInfo(String str, String str2, AbstractC18455b bVar);

    void scanCode(C18742c cVar, boolean z, AbstractC18456c cVar2);

    C89391z updateGecko(String str, String str2, AbstractC18457d dVar, boolean z);

    /* renamed from: com.bytedance.ies.xbridge.base.runtime.depend.IHostOpenDepend$a */
    public static final class C18454a {

        /* renamed from: a */
        public Long f44090a;

        /* renamed from: b */
        public String f44091b;

        /* renamed from: c */
        public final boolean f44092c;

        static {
            Covode.recordClassIndex(21138);
        }

        public C18454a(boolean z) {
            this.f44092c = z;
        }
    }
}
