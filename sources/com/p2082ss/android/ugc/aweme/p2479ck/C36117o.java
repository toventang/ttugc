package com.p2082ss.android.ugc.aweme.p2479ck;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.services.AsyncAVService;
import com.p2082ss.android.ugc.aweme.services.IExternalService;
import com.p2082ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.RecordConfig;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ck.o */
public final class C36117o implements IInterceptor {

    /* renamed from: g */
    public static final C36118a f85317g = new C36118a((byte) 0);

    /* renamed from: a */
    public String f85318a;

    /* renamed from: b */
    public String f85319b;

    /* renamed from: c */
    public String f85320c;

    /* renamed from: d */
    public String f85321d;

    /* renamed from: e */
    public String f85322e;

    /* renamed from: f */
    public String f85323f;

    static {
        Covode.recordClassIndex(43370);
    }

    /* renamed from: com.ss.android.ugc.aweme.ck.o$a */
    public static final class C36118a {
        static {
            Covode.recordClassIndex(43371);
        }

        private C36118a() {
        }

        public /* synthetic */ C36118a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ck.o$b */
    public static final class C36119b implements IExternalService.ServiceLoadCallback {

        /* renamed from: a */
        final /* synthetic */ C36117o f85324a;

        /* renamed from: b */
        final /* synthetic */ Context f85325b;

        /* renamed from: c */
        final /* synthetic */ Class f85326c;

        /* renamed from: d */
        final /* synthetic */ RouteIntent f85327d;

        static {
            Covode.recordClassIndex(43372);
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

        /* renamed from: com.ss.android.ugc.aweme.ck.o$b$a */
        public static final class C36120a extends SimpleServiceLoadCallback {

            /* renamed from: a */
            final /* synthetic */ Context f85328a;

            /* renamed from: b */
            final /* synthetic */ RecordConfig.Builder f85329b;

            static {
                Covode.recordClassIndex(43373);
            }

            C36120a(Context context, RecordConfig.Builder builder) {
                this.f85328a = context;
                this.f85329b = builder;
            }

            @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onLoad(AsyncAVService asyncAVService, long j) {
                C89219l.m154721d(asyncAVService, "");
                asyncAVService.uiService().recordService().startRecord(this.f85328a, this.f85329b.build());
            }
        }

        /* renamed from: a */
        private static void m73581a(Context context, Intent intent) {
            C84349a.m145093a(intent, context);
            context.startActivity(intent);
        }

        @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onLoad(AsyncAVService asyncAVService, long j) {
            C89219l.m154721d(asyncAVService, "");
            if (this.f85325b instanceof Activity) {
                m73581a(this.f85325b, C36117o.m73580a(new Intent(this.f85325b, this.f85326c), this.f85327d));
                return;
            }
            this.f85324a.f85318a = C36132v.m73608b(this.f85327d.getOriginUrl(), "sticker_id");
            this.f85324a.f85319b = C36132v.m73608b(this.f85327d.getOriginUrl(), StringSet.type);
            this.f85324a.f85320c = C36132v.m73608b(this.f85327d.getOriginUrl(), "shoot_way");
            this.f85324a.f85321d = C36132v.m73608b(this.f85327d.getOriginUrl(), "enter_from");
            this.f85324a.f85322e = C36132v.m73608b(this.f85327d.getOriginUrl(), "enter_method");
            this.f85324a.f85323f = C36132v.m73608b(this.f85327d.getOriginUrl(), "session_id");
            if (this.f85324a.f85319b == null || this.f85324a.f85318a == null || this.f85324a.f85320c == null || this.f85324a.f85321d == null || this.f85324a.f85322e == null || !C89219l.m154714a((Object) this.f85324a.f85319b, (Object) "use_sticker")) {
                Context context = this.f85325b;
                if (context == null) {
                    context = C17867d.m33078a();
                }
                Intent intent = new Intent(this.f85325b, this.f85326c);
                intent.addFlags(268435456);
                m73581a(context, intent);
                return;
            }
            Context context2 = this.f85325b;
            if (context2 == null) {
                context2 = C17867d.m33078a();
            }
            C39162r.m79460a("shoot", new C33744d().mo59983a("shoot_way", this.f85324a.f85320c).mo59983a("enter_from", this.f85324a.f85321d).mo59983a("enter_method", this.f85324a.f85322e).f79943a);
            RecordConfig.Builder showStickerPanel = new RecordConfig.Builder().showStickerPanel(false);
            String str = this.f85324a.f85318a;
            if (str == null) {
                C89219l.m154715b();
            }
            RecordConfig.Builder enterFrom = showStickerPanel.autoUseSticker(str).shootWay(this.f85324a.f85320c).sharedARSessionId(this.f85324a.f85323f).enterFrom(this.f85324a.f85321d);
            IExternalService a = AVExternalServiceImpl.m113114a();
            String str2 = this.f85324a.f85322e;
            if (str2 == null) {
                C89219l.m154715b();
            }
            a.asyncService(context2, str2, new C36120a(context2, enterFrom));
        }

        C36119b(C36117o oVar, Context context, Class cls, RouteIntent routeIntent) {
            this.f85324a = oVar;
            this.f85325b = context;
            this.f85326c = cls;
            this.f85327d = routeIntent;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
        if (r4 != null) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004c, code lost:
        if (r4 != null) goto L_0x000d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    @Override // com.bytedance.router.interceptor.IInterceptor
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean matchInterceptRules(com.bytedance.router.RouteIntent r4) {
        /*
            r3 = this;
            r2 = 0
            if (r4 == 0) goto L_0x004b
            android.net.Uri r0 = r4.getUri()
            if (r0 == 0) goto L_0x004b
            java.lang.String r1 = r0.getHost()
        L_0x000d:
            android.net.Uri r0 = r4.getUri()
            if (r0 == 0) goto L_0x004f
            java.lang.String r0 = r0.getPath()
        L_0x0017:
            java.lang.String r1 = p4600h.p4611f.p4613b.C89219l.m154704a(r1, r0)
            java.lang.String r0 = "studio/task/create"
            boolean r0 = p4600h.p4611f.p4613b.C89219l.m154714a(r1, r0)
            if (r0 != 0) goto L_0x0045
            if (r4 == 0) goto L_0x0047
            android.net.Uri r0 = r4.getUri()
            if (r0 == 0) goto L_0x0047
            java.lang.String r1 = r0.getHost()
        L_0x002f:
            android.net.Uri r0 = r4.getUri()
            if (r0 == 0) goto L_0x0039
            java.lang.String r2 = r0.getPath()
        L_0x0039:
            java.lang.String r1 = p4600h.p4611f.p4613b.C89219l.m154704a(r1, r2)
            java.lang.String r0 = "studio/create"
            boolean r0 = p4600h.p4611f.p4613b.C89219l.m154714a(r1, r0)
            if (r0 == 0) goto L_0x0051
        L_0x0045:
            r0 = 1
            return r0
        L_0x0047:
            r1 = r2
            if (r4 == 0) goto L_0x0039
            goto L_0x002f
        L_0x004b:
            r1 = r2
            if (r4 == 0) goto L_0x004f
            goto L_0x000d
        L_0x004f:
            r0 = r2
            goto L_0x0017
        L_0x0051:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p2479ck.C36117o.matchInterceptRules(com.bytedance.router.RouteIntent):boolean");
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        C89219l.m154721d(routeIntent, "");
        AVExternalServiceImpl.m113114a().asyncService("RecordPermissionInterceptor", new C36119b(this, context, AVExternalServiceImpl.m113114a().classnameService().getVideoRecordPermissionActivityClass(), routeIntent));
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0062, code lost:
        if (r0 == null) goto L_0x0064;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.Intent m73580a(android.content.Intent r7, com.bytedance.router.RouteIntent r8) {
        /*
        // Method dump skipped, instructions count: 107
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p2479ck.C36117o.m73580a(android.content.Intent, com.bytedance.router.RouteIntent):android.content.Intent");
    }
}
