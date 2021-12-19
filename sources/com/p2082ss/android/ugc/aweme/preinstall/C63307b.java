package com.p2082ss.android.ugc.aweme.preinstall;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p2082ss.android.ugc.aweme.preinstall.brand.ITranssonicService;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.preinstall.b */
public final class C63307b implements IPreInstallService {

    /* renamed from: a */
    public static final AbstractC89244h f143691a = C89250i.m154773a((AbstractC89171a) C63309b.f143695a);

    /* renamed from: b */
    public static final C63307b f143692b = new C63307b();

    /* renamed from: c */
    private static final AbstractC89244h f143693c = C89250i.m154773a((AbstractC89171a) C63308a.f143694a);

    private C63307b() {
    }

    /* renamed from: com.ss.android.ugc.aweme.preinstall.b$a */
    static final class C63308a extends AbstractC89220m implements AbstractC89171a<IPreInstallService> {

        /* renamed from: a */
        public static final C63308a f143694a = new C63308a();

        static {
            Covode.recordClassIndex(74588);
        }

        C63308a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ IPreInstallService invoke() {
            Object service = ServiceManager.get().getService(IPreInstallService.class);
            C89219l.m154716b(service, "");
            return service;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.preinstall.b$b */
    static final class C63309b extends AbstractC89220m implements AbstractC89171a<ITranssonicService> {

        /* renamed from: a */
        public static final C63309b f143695a = new C63309b();

        static {
            Covode.recordClassIndex(74589);
        }

        C63309b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ITranssonicService invoke() {
            Object service = ServiceManager.get().getService(ITranssonicService.class);
            C89219l.m154716b(service, "");
            return service;
        }
    }

    static {
        Covode.recordClassIndex(74587);
    }

    @Override // com.p2082ss.android.ugc.aweme.preinstall.IPreInstallService
    public final void initOnAppCreate(Context context, C63306a aVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(aVar, "");
        ((IPreInstallService) f143693c.getValue()).initOnAppCreate(context, aVar);
    }
}
