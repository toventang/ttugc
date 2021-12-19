package com.p2082ss.android.ugc.aweme.watermark;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.services.AsyncAVService;
import com.p2082ss.android.ugc.aweme.services.IExternalService;
import com.p2082ss.android.ugc.aweme.services.watermark.IWaterMarkService;
import com.p2082ss.android.ugc.aweme.watermark.p4236a.AbstractC81475a;
import com.p2082ss.android.ugc.aweme.watermark.p4236a.C81476b;
import com.p2082ss.android.ugc.aweme.watermark.p4236a.C81480d;
import com.p2082ss.android.ugc.aweme.watermark.p4236a.C81485h;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.watermark.WaterMarkServiceImpl */
public final class WaterMarkServiceImpl implements IWaterMarkService {

    /* renamed from: a */
    public static final C81470a f182126a = new C81470a((byte) 0);

    static {
        Covode.recordClassIndex(94842);
    }

    /* renamed from: com.ss.android.ugc.aweme.watermark.WaterMarkServiceImpl$a */
    public static final class C81470a {
        static {
            Covode.recordClassIndex(94843);
        }

        private C81470a() {
        }

        public /* synthetic */ C81470a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.watermark.WaterMarkServiceImpl$b */
    public static final class C81471b implements IExternalService.ServiceLoadCallback {

        /* renamed from: a */
        final /* synthetic */ WaterMarkServiceImpl f182127a;

        static {
            Covode.recordClassIndex(94844);
        }

        @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onDismiss() {
            IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
        }

        @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onFailed() {
            IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
        }

        @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onOK() {
            IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C81471b(WaterMarkServiceImpl waterMarkServiceImpl) {
            this.f182127a = waterMarkServiceImpl;
        }

        @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onLoad(AsyncAVService asyncAVService, long j) {
            C89219l.m154721d(asyncAVService, "");
            WaterMarkServiceImpl.m141253a().mo125182a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.watermark.WaterMarkServiceImpl$c */
    public static final class C81472c implements IExternalService.ServiceLoadCallback {

        /* renamed from: a */
        final /* synthetic */ WaterMarkServiceImpl f182128a;

        /* renamed from: b */
        final /* synthetic */ C81506p f182129b;

        static {
            Covode.recordClassIndex(94845);
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
            AbstractC81509s sVar = this.f182129b.f182241g;
            if (sVar != null) {
                sVar.mo125228b(-114);
            }
        }

        C81472c(WaterMarkServiceImpl waterMarkServiceImpl, C81506p pVar) {
            this.f182128a = waterMarkServiceImpl;
            this.f182129b = pVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onLoad(AsyncAVService asyncAVService, long j) {
            C89219l.m154721d(asyncAVService, "");
            WaterMarkServiceImpl.m141253a().mo125185b(this.f182129b);
            WaterMarkServiceImpl.m141253a().mo125184b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.watermark.WaterMarkServiceImpl$d */
    public static final class C81473d implements IExternalService.ServiceLoadCallback {

        /* renamed from: a */
        final /* synthetic */ WaterMarkServiceImpl f182130a;

        /* renamed from: b */
        final /* synthetic */ C81506p f182131b;

        static {
            Covode.recordClassIndex(94846);
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
            AbstractC81509s sVar = this.f182131b.f182241g;
            if (sVar != null) {
                sVar.mo125228b(-114);
            }
        }

        C81473d(WaterMarkServiceImpl waterMarkServiceImpl, C81506p pVar) {
            this.f182130a = waterMarkServiceImpl;
            this.f182131b = pVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onLoad(AsyncAVService asyncAVService, long j) {
            C89219l.m154721d(asyncAVService, "");
            WaterMarkServiceImpl.m141253a().mo125183a(this.f182131b);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.watermark.IWaterMarkService
    public final void cancelWaterMark() {
        AVExternalServiceImpl.m113114a().asyncServiceWithOutPanel("WaterMark", new C81471b(this));
    }

    /* renamed from: a */
    public static AbstractC81475a m141253a() {
        if (C63244g.m114602a().mo73288p().mo125209d()) {
            return (C81480d) C81485h.f182184b.getValue();
        }
        return (C81476b) C81485h.f182183a.getValue();
    }

    /* renamed from: b */
    public static IWaterMarkService m141254b() {
        MethodCollector.m26663i(6389);
        Object a = C81908b.m141854a(IWaterMarkService.class, false);
        if (a != null) {
            IWaterMarkService iWaterMarkService = (IWaterMarkService) a;
            MethodCollector.m26664o(6389);
            return iWaterMarkService;
        }
        if (C81908b.f183359eC == null) {
            synchronized (IWaterMarkService.class) {
                try {
                    if (C81908b.f183359eC == null) {
                        C81908b.f183359eC = new WaterMarkServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(6389);
                    throw th;
                }
            }
        }
        WaterMarkServiceImpl waterMarkServiceImpl = (WaterMarkServiceImpl) C81908b.f183359eC;
        MethodCollector.m26664o(6389);
        return waterMarkServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.watermark.IWaterMarkService
    public final synchronized void prepareDataForI18n(C81506p pVar) {
        MethodCollector.m26663i(6388);
        C89219l.m154721d(pVar, "");
        AVExternalServiceImpl.m113114a().asyncServiceWithOutPanel("WaterMark", new C81472c(this, pVar));
        MethodCollector.m26664o(6388);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.watermark.IWaterMarkService
    public final synchronized void waterMark(C81506p pVar) {
        MethodCollector.m26663i(6224);
        C89219l.m154721d(pVar, "");
        AVExternalServiceImpl.m113114a().asyncServiceWithOutPanel("WaterMark", new C81473d(this, pVar));
        MethodCollector.m26664o(6224);
    }
}
