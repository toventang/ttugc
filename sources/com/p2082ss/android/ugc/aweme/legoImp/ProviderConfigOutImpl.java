package com.p2082ss.android.ugc.aweme.legoImp;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.musicprovider.C84158e;
import com.p2082ss.android.ugc.musicprovider.interfaces.IProviderConfigOut;

/* renamed from: com.ss.android.ugc.aweme.legoImp.ProviderConfigOutImpl */
public final class ProviderConfigOutImpl implements IProviderConfigOut {
    static {
        Covode.recordClassIndex(68351);
    }

    @Override // com.p2082ss.android.ugc.musicprovider.interfaces.IProviderConfigOut
    /* renamed from: a */
    public final C84158e.AbstractC84159a mo95712a() {
        return C58279b.f132729a;
    }

    @Override // com.p2082ss.android.ugc.musicprovider.interfaces.IProviderConfigOut
    /* renamed from: b */
    public final C84158e.AbstractC84159a mo95713b() {
        return C58278a.f132728a;
    }

    @Override // com.p2082ss.android.ugc.musicprovider.interfaces.IProviderConfigOut
    /* renamed from: c */
    public final Context mo95714c() {
        return C17867d.m33078a();
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.ProviderConfigOutImpl$a */
    static final class C58278a implements C84158e.AbstractC84159a {

        /* renamed from: a */
        public static final C58278a f132728a = new C58278a();

        static {
            Covode.recordClassIndex(68352);
        }

        C58278a() {
        }

        @Override // com.p2082ss.android.ugc.musicprovider.C84158e.AbstractC84159a
        /* renamed from: a */
        public final String mo95715a() {
            return AVExternalServiceImpl.m113114a().configService().cacheConfig().musicDir() + "cache/";
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.ProviderConfigOutImpl$b */
    static final class C58279b implements C84158e.AbstractC84159a {

        /* renamed from: a */
        public static final C58279b f132729a = new C58279b();

        static {
            Covode.recordClassIndex(68353);
        }

        C58279b() {
        }

        @Override // com.p2082ss.android.ugc.musicprovider.C84158e.AbstractC84159a
        /* renamed from: a */
        public final String mo95715a() {
            return AVExternalServiceImpl.m113114a().configService().cacheConfig().musicDir() + "download/";
        }
    }

    /* renamed from: d */
    public static IProviderConfigOut m105245d() {
        MethodCollector.m26663i(2236);
        Object a = C81908b.m141854a(IProviderConfigOut.class, false);
        if (a != null) {
            IProviderConfigOut iProviderConfigOut = (IProviderConfigOut) a;
            MethodCollector.m26664o(2236);
            return iProviderConfigOut;
        }
        if (C81908b.f183287ck == null) {
            synchronized (IProviderConfigOut.class) {
                try {
                    if (C81908b.f183287ck == null) {
                        C81908b.f183287ck = new ProviderConfigOutImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(2236);
                    throw th;
                }
            }
        }
        ProviderConfigOutImpl providerConfigOutImpl = (ProviderConfigOutImpl) C81908b.f183287ck;
        MethodCollector.m26664o(2236);
        return providerConfigOutImpl;
    }
}
