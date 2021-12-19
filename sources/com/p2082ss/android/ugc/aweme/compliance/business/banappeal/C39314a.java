package com.p2082ss.android.ugc.aweme.compliance.business.banappeal;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39240a;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39241b;
import com.p2082ss.android.ugc.aweme.compliance.common.C39608b;
import java.util.List;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.business.banappeal.a */
public final class C39314a {

    /* renamed from: a */
    public static final C39314a f92804a = new C39314a();

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.banappeal.a$b */
    public static final class C39316b<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C39316b f92806a = new C39316b();

        static {
            Covode.recordClassIndex(46995);
        }

        C39316b() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    private C39314a() {
    }

    static {
        Covode.recordClassIndex(46993);
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.banappeal.a$a */
    public static final class C39315a<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C39315a f92805a = new C39315a();

        static {
            Covode.recordClassIndex(46994);
        }

        C39315a() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C39240a aVar = (C39240a) obj;
            if (aVar.status_code == 0 && aVar.getBanInfos() != null) {
                List<C39241b> banInfos = aVar.getBanInfos();
                if (banInfos == null) {
                    C89219l.m154715b();
                }
                C89219l.m154721d(banInfos, "");
                C39608b.f93371b.mo69031a(banInfos);
            }
        }
    }
}
