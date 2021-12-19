package com.p2082ss.android.ugc.aweme.app.accountsdk;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC34400b;
import com.p2082ss.android.ugc.aweme.account.AccountInitServiceImpl;
import com.p2082ss.android.ugc.aweme.app.services.DownloadService;
import com.p2082ss.android.ugc.aweme.app.services.Feed0VVManagerService;
import com.p2082ss.android.ugc.aweme.app.services.IDownloadService;
import com.p2082ss.android.ugc.aweme.app.services.IFeed0VVManagerService;
import com.p2082ss.android.ugc.aweme.app.services.IPushLaunchPageAssistantService;
import com.p2082ss.android.ugc.aweme.app.services.IRegionService;
import com.p2082ss.android.ugc.aweme.app.services.IWebViewService;
import com.p2082ss.android.ugc.aweme.app.services.PushLaunchPageAssistantService;
import com.p2082ss.android.ugc.aweme.app.services.RegionService;
import com.p2082ss.android.ugc.aweme.app.services.WebviewService;
import com.p2082ss.android.ugc.aweme.framework.services.ServiceProvider;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.app.accountsdk.a */
public final class C33571a implements AbstractC34400b {
    static {
        Covode.recordClassIndex(40461);
    }

    /* renamed from: com.ss.android.ugc.aweme.app.accountsdk.a$a */
    static final class C33572a<T> implements ServiceProvider {

        /* renamed from: a */
        public static final C33572a f79741a = new C33572a();

        static {
            Covode.recordClassIndex(40462);
        }

        C33572a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.framework.services.ServiceProvider
        public final Object get() {
            return new WebviewService();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.accountsdk.a$b */
    static final class C33573b<T> implements ServiceProvider {

        /* renamed from: a */
        public static final C33573b f79742a = new C33573b();

        static {
            Covode.recordClassIndex(40463);
        }

        C33573b() {
        }

        @Override // com.p2082ss.android.ugc.aweme.framework.services.ServiceProvider
        public final Object get() {
            return new RegionService();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.accountsdk.a$c */
    static final class C33574c<T> implements ServiceProvider {

        /* renamed from: a */
        public static final C33574c f79743a = new C33574c();

        static {
            Covode.recordClassIndex(40464);
        }

        C33574c() {
        }

        @Override // com.p2082ss.android.ugc.aweme.framework.services.ServiceProvider
        public final Object get() {
            return new Feed0VVManagerService();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.accountsdk.a$d */
    static final class C33575d<T> implements ServiceProvider {

        /* renamed from: a */
        public static final C33575d f79744a = new C33575d();

        static {
            Covode.recordClassIndex(40465);
        }

        C33575d() {
        }

        @Override // com.p2082ss.android.ugc.aweme.framework.services.ServiceProvider
        public final Object get() {
            return new PushLaunchPageAssistantService();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.accountsdk.a$e */
    static final class C33576e<T> implements ServiceProvider {

        /* renamed from: a */
        public static final C33576e f79745a = new C33576e();

        static {
            Covode.recordClassIndex(40466);
        }

        C33576e() {
        }

        @Override // com.p2082ss.android.ugc.aweme.framework.services.ServiceProvider
        public final Object get() {
            return new DownloadService();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC34400b
    /* renamed from: a */
    public final <T> ServiceProvider<T> mo59922a(Class<T> cls) {
        C89219l.m154721d(cls, "");
        if (C89219l.m154714a(cls, IWebViewService.class)) {
            C33572a aVar = C33572a.f79741a;
            Objects.requireNonNull(aVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.framework.services.ServiceProvider<T>");
            return aVar;
        } else if (C89219l.m154714a(cls, IRegionService.class)) {
            C33573b bVar = C33573b.f79742a;
            Objects.requireNonNull(bVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.framework.services.ServiceProvider<T>");
            return bVar;
        } else if (C89219l.m154714a(cls, IFeed0VVManagerService.class)) {
            C33574c cVar = C33574c.f79743a;
            Objects.requireNonNull(cVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.framework.services.ServiceProvider<T>");
            return cVar;
        } else if (C89219l.m154714a(cls, IPushLaunchPageAssistantService.class)) {
            C33575d dVar = C33575d.f79744a;
            Objects.requireNonNull(dVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.framework.services.ServiceProvider<T>");
            return dVar;
        } else if (!C89219l.m154714a(cls, IDownloadService.class)) {
            return AccountInitServiceImpl.m65573a().mo57393a(cls);
        } else {
            C33576e eVar = C33576e.f79745a;
            Objects.requireNonNull(eVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.framework.services.ServiceProvider<T>");
            return eVar;
        }
    }
}
