package com.p2082ss.android.ugc.aweme.publish.p3624h;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.p2082ss.android.ugc.aweme.publish.AbstractC65678k;
import com.p2082ss.android.ugc.aweme.publish.AbstractC65681n;
import com.p2082ss.android.ugc.aweme.publish.core.uploader.engine.C65526a;
import com.p2082ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.C65533a;
import com.p2082ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.C65536b;
import com.p2082ss.android.ugc.aweme.publish.p3619f.C65616g;
import com.p2082ss.android.ugc.aweme.publish.p3625i.AbstractC65668b;
import com.p2082ss.android.ugc.aweme.publish.p3625i.p3627b.AbstractC65670a;
import com.p2082ss.android.ugc.aweme.publish.p3625i.p3628c.AbstractC65673a;
import com.p2082ss.android.ugc.aweme.shortvideo.TTUploaderService;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.publish.h.m */
final class C65662m implements AbstractC65681n {

    /* renamed from: a */
    private final AbstractC89244h f147988a = C89250i.m154773a((AbstractC89171a) C65663a.f147990a);

    /* renamed from: b */
    private final AbstractC89244h f147989b = C89250i.m154773a((AbstractC89171a) C65664b.f147991a);

    static {
        Covode.recordClassIndex(77153);
    }

    /* renamed from: com.ss.android.ugc.aweme.publish.h.m$a */
    static final class C65663a extends AbstractC89220m implements AbstractC89171a<TTUploaderService> {

        /* renamed from: a */
        public static final C65663a f147990a = new C65663a();

        static {
            Covode.recordClassIndex(77154);
        }

        C65663a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TTUploaderService invoke() {
            return new TTUploaderService();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.publish.h.m$b */
    static final class C65664b extends AbstractC89220m implements AbstractC89171a<C65653h> {

        /* renamed from: a */
        public static final C65664b f147991a = new C65664b();

        static {
            Covode.recordClassIndex(77155);
        }

        C65664b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C65653h invoke() {
            return new C65653h();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.publish.AbstractC65681n
    /* renamed from: c */
    public final AbstractC65668b mo104832c() {
        return new C65526a();
    }

    @Override // com.p2082ss.android.ugc.aweme.publish.AbstractC65681n
    /* renamed from: d */
    public final AbstractC65673a mo104833d() {
        return new C65536b();
    }

    @Override // com.p2082ss.android.ugc.aweme.publish.AbstractC65681n
    /* renamed from: e */
    public final AbstractC65670a mo104834e() {
        return new C65533a();
    }

    @Override // com.p2082ss.android.ugc.aweme.publish.AbstractC65681n
    /* renamed from: a */
    public final AbstractC65678k mo104830a() {
        return (C65653h) this.f147989b.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.publish.AbstractC65681n
    /* renamed from: b */
    public final AbstractFutureC27655q<C65616g> mo104831b() {
        AbstractFutureC27655q<C65616g> a = ((TTUploaderService) this.f147988a.getValue()).mo110066a();
        C89219l.m154716b(a, "");
        return a;
    }
}
