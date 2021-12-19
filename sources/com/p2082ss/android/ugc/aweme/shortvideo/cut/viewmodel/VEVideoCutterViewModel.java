package com.p2082ss.android.ugc.aweme.shortvideo.cut.viewmodel;

import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.VEVideoCutterViewModel */
public final class VEVideoCutterViewModel extends AbstractC1174ac {

    /* renamed from: a */
    private final AbstractC89244h f157908a = C89250i.m154773a((AbstractC89171a) C70575a.f157909a);

    static {
        Covode.recordClassIndex(83038);
    }

    /* renamed from: a */
    public final C1213t<C70576a> mo111335a() {
        return (C1213t) this.f157908a.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.VEVideoCutterViewModel$a */
    static final class C70575a extends AbstractC89220m implements AbstractC89171a<C1213t<C70576a>> {

        /* renamed from: a */
        public static final C70575a f157909a = new C70575a();

        static {
            Covode.recordClassIndex(83039);
        }

        C70575a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<C70576a> invoke() {
            return new C1213t();
        }
    }

    /* renamed from: a */
    public final void mo111336a(C70576a aVar) {
        C89219l.m154721d(aVar, "");
        mo111335a().setValue(aVar);
    }
}
