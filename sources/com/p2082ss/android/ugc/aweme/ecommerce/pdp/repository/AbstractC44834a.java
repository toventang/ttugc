package com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommerce.p2819ab.C43327j;
import com.p2082ss.android.ugc.aweme.ecommerce.p2819ab.C43328k;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.C44890b;
import p4560f.p4561a.AbstractC88979t;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.repository.a */
public interface AbstractC44834a {

    /* renamed from: d_ */
    public static final C44835a f104568d_ = C44835a.f104569a;

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.repository.a$b */
    public static final class C44836b {
        static {
            Covode.recordClassIndex(53222);
        }
    }

    static {
        Covode.recordClassIndex(53220);
    }

    /* renamed from: a */
    C44867d mo75949a(IPdpStarter.PdpEnterParam pdpEnterParam, boolean z, int i, boolean z2, Boolean bool);

    /* renamed from: a */
    AbstractC88979t<C44890b> mo75950a(IPdpStarter.PdpEnterParam pdpEnterParam);

    /* renamed from: a */
    void mo75951a(String str);

    /* renamed from: b */
    void mo75952b(IPdpStarter.PdpEnterParam pdpEnterParam);

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.repository.a$a */
    public static final class C44835a {

        /* renamed from: a */
        static final /* synthetic */ C44835a f104569a = new C44835a();

        /* renamed from: b */
        private static final C44844b f104570b = C44844b.f104578b;

        private C44835a() {
        }

        static {
            Covode.recordClassIndex(53221);
        }

        /* renamed from: a */
        public static AbstractC44834a m87545a() {
            if (C43327j.m86446a() != C43327j.f101118a || C43328k.m86447a()) {
                return C44854c.f104598c;
            }
            return C44844b.f104578b;
        }
    }
}
