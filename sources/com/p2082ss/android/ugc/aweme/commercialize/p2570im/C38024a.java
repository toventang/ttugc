package com.p2082ss.android.ugc.aweme.commercialize.p2570im;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.router.route.BaseRoute;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.commercialize.p2570im.ChatCheckLoginActivity;
import com.p2082ss.android.ugc.aweme.p2479ck.AbstractC36109j;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.IIMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56245a;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56252e;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56254g;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.profile.api.C63431e;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.commercialize.im.a */
public final class C38024a extends BaseRoute implements AbstractC36109j {

    /* renamed from: a */
    public static final C38024a f89849a = new C38024a();

    private C38024a() {
    }

    static {
        Covode.recordClassIndex(45486);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.im.a$a */
    public static final class C38025a {

        /* renamed from: a */
        public final IIMService f89850a = IMService.createIIMServicebyMonsterPlugin(false);

        /* renamed from: b */
        public IMUser f89851b;

        /* renamed from: c */
        public final Context f89852c;

        /* renamed from: d */
        public final String f89853d;

        /* renamed from: e */
        public final String f89854e;

        /* renamed from: f */
        public final C56252e f89855f;

        static {
            Covode.recordClassIndex(45487);
        }

        /* renamed from: b */
        private final void m77089b() {
            C63431e.m115024a();
            C63431e.m115025a(new HandlerC38026a(this, Looper.getMainLooper()), this.f89853d);
        }

        /* renamed from: a */
        public final void mo66300a() {
            String str;
            if (this.f89850a != null && (str = this.f89853d) != null && str.length() != 0) {
                m77089b();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.commercialize.im.a$a$a */
        public static final class HandlerC38026a extends Handler {

            /* renamed from: a */
            final /* synthetic */ C38025a f89856a;

            static {
                Covode.recordClassIndex(45488);
            }

            public final void handleMessage(Message message) {
                C89219l.m154721d(message, "");
                Object obj = message.obj;
                if (obj != null && (obj instanceof User)) {
                    this.f89856a.mo66301a(IMUser.fromUser((User) obj));
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            HandlerC38026a(C38025a aVar, Looper looper) {
                super(looper);
                this.f89856a = aVar;
            }
        }

        /* renamed from: a */
        public final synchronized void mo66301a(IMUser iMUser) {
            MethodCollector.m26663i(7885);
            this.f89851b = iMUser;
            if (iMUser != null) {
                C56254g gVar = new C56254g();
                gVar.ext = this.f89854e;
                IIMService iIMService = this.f89850a;
                if (iIMService != null) {
                    iIMService.startChat(C56245a.C56247b.m102214a(this.f89852c, this.f89851b).mo93266a(this.f89855f).mo93267a(gVar).f128281a);
                    MethodCollector.m26664o(7885);
                    return;
                }
            }
            MethodCollector.m26664o(7885);
        }

        public C38025a(Context context, String str, String str2, C56252e eVar) {
            C89219l.m154721d(context, "");
            this.f89852c = context;
            this.f89853d = str;
            this.f89854e = str2;
            this.f89855f = eVar;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2479ck.AbstractC36109j
    /* renamed from: c */
    public final boolean mo63242c(String str) {
        return mo63240a((Activity) null, str);
    }

    @Override // com.bytedance.router.route.IRoute
    public final void open(Context context) {
        Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
        mo63240a((Activity) context, getUrl());
    }

    /* renamed from: b */
    public static final String m77086b(String str) {
        if (!m77085a(str)) {
            return null;
        }
        return Uri.parse(str).getQueryParameter("uid");
    }

    /* renamed from: a */
    public static final boolean m77085a(String str) {
        String str2;
        if (str == null) {
            return false;
        }
        Uri parse = Uri.parse(str);
        String str3 = null;
        if (parse != null) {
            str2 = parse.getHost();
        } else {
            str2 = null;
        }
        if (C89361p.m154872a("chatting", str2, true)) {
            if (parse != null) {
                str3 = parse.getPath();
            }
            if (C89361p.m154872a("/message", str3, true)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m77084a(Context context, Uri uri) {
        String str;
        String str2;
        C89219l.m154721d(context, "");
        C89219l.m154721d(uri, "");
        C56252e eVar = null;
        if (uri != null) {
            str = uri.getHost();
        } else {
            str = null;
        }
        if (C89361p.m154872a("chatting", str, true)) {
            if (uri != null) {
                str2 = uri.getPath();
            } else {
                str2 = null;
            }
            if (C89361p.m154872a("/message", str2, true)) {
                String queryParameter = uri.getQueryParameter("uid");
                String queryParameter2 = uri.getQueryParameter("ext");
                String queryParameter3 = uri.getQueryParameter("cid");
                String queryParameter4 = uri.getQueryParameter("log_extra");
                if (!(queryParameter3 == null || queryParameter3.length() == 0)) {
                    eVar = new C56252e(queryParameter4, queryParameter3);
                }
                m77083a(context, queryParameter, queryParameter2, eVar);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.content.Context] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.p2082ss.android.ugc.aweme.p2479ck.AbstractC36109j
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo63240a(android.app.Activity r3, java.lang.String r4) {
        /*
            r2 = this;
            r1 = 0
            if (r4 == 0) goto L_0x0009
            int r0 = r4.length()
            if (r0 != 0) goto L_0x000a
        L_0x0009:
            return r1
        L_0x000a:
            android.net.Uri r1 = android.net.Uri.parse(r4)
            if (r3 == 0) goto L_0x001a
        L_0x0010:
            java.lang.String r0 = ""
            p4600h.p4611f.p4613b.C89219l.m154716b(r1, r0)
            boolean r0 = m77084a(r3, r1)
            return r0
        L_0x001a:
            android.content.Context r3 = com.bytedance.ies.ugc.appcontext.C17867d.m33078a()
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.commercialize.p2570im.C38024a.mo63240a(android.app.Activity, java.lang.String):boolean");
    }

    /* renamed from: a */
    public static final void m77083a(Context context, String str, String str2, C56252e eVar) {
        C89219l.m154721d(context, "");
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        if (g.isLogin()) {
            new C38025a(context, str, str2, eVar).mo66300a();
        } else {
            ChatCheckLoginActivity.C38018a.m77080a(context, str, str2, eVar);
        }
    }
}
