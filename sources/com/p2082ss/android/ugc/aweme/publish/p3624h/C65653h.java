package com.p2082ss.android.ugc.aweme.publish.p3624h;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.publish.AbstractC65678k;
import com.p2082ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.AbstractC65597g;
import com.p2082ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.C65539c;
import com.p2082ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.C65567d;
import com.p2082ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.C65602k;
import com.p2082ss.android.ugc.aweme.shortvideo.upload.UploadSpeedInfo;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.publish.h.h */
final class C65653h implements AbstractC65678k {

    /* renamed from: a */
    private final AbstractC89244h f147986a = C89250i.m154773a((AbstractC89171a) C65654a.f147987a);

    static {
        Covode.recordClassIndex(77144);
    }

    /* renamed from: e */
    private final AbstractC65597g m117487e() {
        return (AbstractC65597g) this.f147986a.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.publish.AbstractC65678k
    /* renamed from: a */
    public final void mo104819a() {
        m117487e().mo104705a();
    }

    @Override // com.p2082ss.android.ugc.aweme.publish.AbstractC65678k
    /* renamed from: c */
    public final void mo104821c() {
        m117487e().mo104707c();
    }

    @Override // com.p2082ss.android.ugc.aweme.publish.AbstractC65678k
    /* renamed from: b */
    public final UploadSpeedInfo mo104820b() {
        return m117487e().mo104706b();
    }

    @Override // com.p2082ss.android.ugc.aweme.publish.AbstractC65678k
    /* renamed from: d */
    public final boolean mo104822d() {
        return m117487e().mo104708d();
    }

    /* renamed from: com.ss.android.ugc.aweme.publish.h.h$a */
    static final class C65654a extends AbstractC89220m implements AbstractC89171a<AbstractC65597g> {

        /* renamed from: a */
        public static final C65654a f147987a = new C65654a();

        static {
            Covode.recordClassIndex(77145);
        }

        C65654a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC65597g invoke() {
            int a = C65602k.m117392a();
            if (a == 0) {
                return new C65567d();
            }
            if (a == 1) {
                return new C65539c();
            }
            throw new IllegalArgumentException("speed test argument not supported");
        }
    }
}
