package com.p2082ss.android.ugc.aweme.external.p2915a;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import android.view.SurfaceHolder;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.C43243dt;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.services.AsyncAVService;
import com.p2082ss.android.ugc.aweme.services.IExternalService;
import com.p2082ss.android.ugc.aweme.services.external.ability.IAVCameraService;
import com.p2082ss.android.ugc.aweme.services.external.ability.IAVEffectService;
import com.p2082ss.android.ugc.aweme.services.external.ability.IAVInfoService;
import com.p2082ss.android.ugc.aweme.services.external.ability.IAVLoaderService;
import com.p2082ss.android.ugc.aweme.services.external.ability.IAVProcessService;
import com.p2082ss.android.ugc.aweme.services.external.ability.IAVTransformService;
import com.p2082ss.android.ugc.aweme.services.external.ability.IAbilityService;
import com.p2082ss.android.ugc.aweme.services.external.ability.IQRCodeScanner;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import dmt.p4542av.video.p4546c.C88243b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.external.a.e */
public final class C47092e implements IAbilityService {

    /* renamed from: a */
    private final AbstractC89244h f109669a = C89250i.m154773a((AbstractC89171a) C47097c.f109681a);

    /* renamed from: b */
    private final AbstractC89244h f109670b = C89250i.m154773a((AbstractC89171a) C47098d.f109682a);

    /* renamed from: c */
    private final AbstractC89244h f109671c = C89250i.m154773a((AbstractC89171a) C47103g.f109686a);

    /* renamed from: d */
    private final AbstractC89244h f109672d = C89250i.m154773a((AbstractC89171a) C47102f.f109685a);

    /* renamed from: com.ss.android.ugc.aweme.external.a.e$a */
    public static final class C47093a {

        /* renamed from: a */
        public AbstractC89171a<C89391z> f109673a;

        /* renamed from: b */
        public AbstractC89171a<C89391z> f109674b;

        /* renamed from: c */
        boolean f109675c;

        /* renamed from: d */
        public final String f109676d = "So decompress: AbilityServiceImpl";

        static {
            Covode.recordClassIndex(55697);
        }

        /* renamed from: com.ss.android.ugc.aweme.external.a.e$a$a */
        public static final class C47094a implements IExternalService.ServiceLoadCallback {

            /* renamed from: a */
            final /* synthetic */ C47093a f109677a;

            static {
                Covode.recordClassIndex(55698);
            }

            @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onDismiss() {
                IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
            }

            @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onOK() {
                IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
            }

            @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onFailed() {
                AbstractC89171a<C89391z> aVar = this.f109677a.f109673a;
                if (aVar != null) {
                    aVar.invoke();
                }
                RuntimeException runtimeException = new RuntimeException("AbilityService, decompress fail");
                C73991bj.m130128a(this.f109677a.f109676d + ", " + runtimeException.getMessage() + ", " + Log.getStackTraceString(runtimeException));
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C47094a(C47093a aVar) {
                this.f109677a = aVar;
            }

            @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onLoad(AsyncAVService asyncAVService, long j) {
                C89219l.m154721d(asyncAVService, "");
                AbstractC89171a<C89391z> aVar = this.f109677a.f109674b;
                if (aVar != null) {
                    aVar.invoke();
                }
                RuntimeException runtimeException = new RuntimeException("AbilityService, decompress success");
                C73991bj.m130128a(this.f109677a.f109676d + ", " + runtimeException.getMessage() + ", " + Log.getStackTraceString(runtimeException));
            }
        }

        /* renamed from: a */
        public final void mo79416a() {
            C47094a aVar = new C47094a(this);
            if (this.f109675c) {
                AVExternalServiceImpl.m113114a().asyncService("AbilityService", aVar);
            } else {
                AVExternalServiceImpl.m113114a().asyncServiceWithOutPanel("AbilityService", aVar);
            }
        }

        /* renamed from: a */
        public final C47093a mo79415a(AbstractC89171a<C89391z> aVar) {
            C89219l.m154721d(aVar, "");
            this.f109674b = aVar;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.a.e$b */
    public static final class C47095b implements IAVCameraService {
        static {
            Covode.recordClassIndex(55699);
        }

        /* renamed from: com.ss.android.ugc.aweme.external.a.e$b$a */
        public static final class C47096a implements IExternalService.ServiceLoadCallback {

            /* renamed from: a */
            final /* synthetic */ Context f109678a;

            /* renamed from: b */
            final /* synthetic */ SurfaceHolder f109679b;

            /* renamed from: c */
            final /* synthetic */ IAVCameraService.IAVCameraReadyCallback f109680c;

            static {
                Covode.recordClassIndex(55700);
            }

            @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onDismiss() {
                IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
            }

            @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onOK() {
                IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
            }

            @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onFailed() {
                this.f109680c.finish(null);
            }

            @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onLoad(AsyncAVService asyncAVService, long j) {
                C89219l.m154721d(asyncAVService, "");
                C88243b.C88244a aVar = C88243b.f200282d;
                Application application = C63238c.f143574a;
                C89219l.m154716b(application, "");
                aVar.mo142775a(application).mo142774b();
                this.f109680c.finish(new C43243dt(this.f109678a, this.f109679b));
            }

            C47096a(Context context, SurfaceHolder surfaceHolder, IAVCameraService.IAVCameraReadyCallback iAVCameraReadyCallback) {
                this.f109678a = context;
                this.f109679b = surfaceHolder;
                this.f109680c = iAVCameraReadyCallback;
            }
        }

        C47095b() {
        }

        @Override // com.p2082ss.android.ugc.aweme.services.external.ability.IAVCameraService
        public final void getScanner(boolean z, Context context, SurfaceHolder surfaceHolder, IAVCameraService.IAVCameraReadyCallback<IQRCodeScanner> iAVCameraReadyCallback) {
            C89219l.m154721d(context, "");
            C89219l.m154721d(surfaceHolder, "");
            C89219l.m154721d(iAVCameraReadyCallback, "");
            AVExternalServiceImpl.m113114a().asyncServiceWithOutPanel("scaner", new C47096a(context, surfaceHolder, iAVCameraReadyCallback));
        }
    }

    static {
        Covode.recordClassIndex(55696);
    }

    /* renamed from: com.ss.android.ugc.aweme.external.a.e$e */
    public static final class C47099e implements IAVLoaderService {
        static {
            Covode.recordClassIndex(55703);
        }

        C47099e() {
        }

        /* renamed from: com.ss.android.ugc.aweme.external.a.e$e$b */
        static final class C47101b extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ IAVLoaderService.ILoaderCallback f109684a;

            static {
                Covode.recordClassIndex(55705);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C47101b(IAVLoaderService.ILoaderCallback iLoaderCallback) {
                super(0);
                this.f109684a = iLoaderCallback;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                this.f109684a.finish(false);
                return C89391z.f203057a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.external.a.e$e$a */
        static final class C47100a extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ IAVLoaderService.ILoaderCallback f109683a;

            static {
                Covode.recordClassIndex(55704);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C47100a(IAVLoaderService.ILoaderCallback iLoaderCallback) {
                super(0);
                this.f109683a = iLoaderCallback;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                C88243b.C88244a aVar = C88243b.f200282d;
                Application application = C63238c.f143574a;
                C89219l.m154716b(application, "");
                aVar.mo142775a(application).mo142774b();
                this.f109683a.finish(true);
                return C89391z.f203057a;
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.services.external.ability.IAVLoaderService
        public final void setLoaderOnly() {
            C88243b.C88244a aVar = C88243b.f200282d;
            Application application = C63238c.f143574a;
            C89219l.m154716b(application, "");
            aVar.mo142775a(application).mo142774b();
        }

        @Override // com.p2082ss.android.ugc.aweme.services.external.ability.IAVLoaderService
        public final void setLoader(IAVLoaderService.ILoaderCallback<Boolean> iLoaderCallback) {
            C89219l.m154721d(iLoaderCallback, "");
            C47093a aVar = new C47093a();
            aVar.f109675c = false;
            C47093a a = aVar.mo79415a(new C47100a(iLoaderCallback));
            a.f109673a = new C47101b(iLoaderCallback);
            a.mo79416a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.a.e$c */
    static final class C47097c extends AbstractC89220m implements AbstractC89171a<C47052a> {

        /* renamed from: a */
        public static final C47097c f109681a = new C47097c();

        static {
            Covode.recordClassIndex(55701);
        }

        C47097c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C47052a invoke() {
            return new C47052a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.a.e$d */
    static final class C47098d extends AbstractC89220m implements AbstractC89171a<C47063b> {

        /* renamed from: a */
        public static final C47098d f109682a = new C47098d();

        static {
            Covode.recordClassIndex(55702);
        }

        C47098d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C47063b invoke() {
            return new C47063b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.a.e$f */
    static final class C47102f extends AbstractC89220m implements AbstractC89171a<C47076c> {

        /* renamed from: a */
        public static final C47102f f109685a = new C47102f();

        static {
            Covode.recordClassIndex(55706);
        }

        C47102f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C47076c invoke() {
            return new C47076c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.a.e$g */
    static final class C47103g extends AbstractC89220m implements AbstractC89171a<C47083d> {

        /* renamed from: a */
        public static final C47103g f109686a = new C47103g();

        static {
            Covode.recordClassIndex(55707);
        }

        C47103g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C47083d invoke() {
            return new C47083d();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.ability.IAbilityService
    public final IAVCameraService cameraService() {
        return new C47095b();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.ability.IAbilityService
    public final IAVLoaderService libraryLoaderService() {
        return new C47099e();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.ability.IAbilityService
    public final IAVEffectService effectService() {
        return (C47052a) this.f109669a.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.ability.IAbilityService
    public final IAVInfoService infoService() {
        return (C47063b) this.f109670b.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.ability.IAbilityService
    public final IAVProcessService processService() {
        return (C47076c) this.f109672d.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.ability.IAbilityService
    public final IAVTransformService transformService() {
        return (C47083d) this.f109671c.getValue();
    }
}
