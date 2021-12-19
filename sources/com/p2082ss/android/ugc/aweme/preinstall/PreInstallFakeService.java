package com.p2082ss.android.ugc.aweme.preinstall;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.preinstall.brand.ITranssonicService;
import com.p2082ss.android.ugc.aweme.preinstall.brand.TranssonicFakeService;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.preinstall.PreInstallFakeService */
public final class PreInstallFakeService implements IPreInstallService {
    private final AbstractC89244h transsonicFakeService$delegate = C89250i.m154773a((AbstractC89171a) C63305a.f143689a);

    static {
        Covode.recordClassIndex(74584);
    }

    private final ITranssonicService getTranssonicFakeService() {
        return (ITranssonicService) this.transsonicFakeService$delegate.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.preinstall.IPreInstallService
    public final void initOnAppCreate(Context context, C63306a aVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(aVar, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.preinstall.PreInstallFakeService$a */
    static final class C63305a extends AbstractC89220m implements AbstractC89171a<TranssonicFakeService> {

        /* renamed from: a */
        public static final C63305a f143689a = new C63305a();

        static {
            Covode.recordClassIndex(74585);
        }

        C63305a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TranssonicFakeService invoke() {
            return new TranssonicFakeService();
        }
    }
}
