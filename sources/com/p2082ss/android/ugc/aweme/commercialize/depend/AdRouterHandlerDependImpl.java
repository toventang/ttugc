package com.p2082ss.android.ugc.aweme.commercialize.depend;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.agilelogger.ALog;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.app.C33722d;
import com.p2082ss.android.ugc.aweme.app.application.C33657b;
import com.p2082ss.android.ugc.aweme.bullet.p2410ab.C34961c;
import com.p2082ss.android.ugc.aweme.commercialize.util.adrouter.C38565b;
import com.p2082ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend;
import com.p2082ss.android.ugc.aweme.commercialize.util.adrouter.p2619a.AbstractC38555a;
import com.p2082ss.android.ugc.aweme.commercialize.utils.AbstractC38757n;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38767w;
import com.p2082ss.android.ugc.aweme.commercialize.utils.p2621a.p2622a.C38613a;
import com.p2082ss.android.ugc.aweme.commercialize.utils.p2623b.C38673e;
import com.p2082ss.android.ugc.aweme.p2479ck.C36125t;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import org.json.JSONObject;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.depend.AdRouterHandlerDependImpl */
public final class AdRouterHandlerDependImpl implements IAdRouterHandlerDepend {

    /* renamed from: com.ss.android.ugc.aweme.commercialize.depend.AdRouterHandlerDependImpl$c */
    final /* synthetic */ class C37654c implements AbstractC38757n.AbstractC38758a {

        /* renamed from: a */
        private final /* synthetic */ AbstractC89172b f89022a;

        static {
            Covode.recordClassIndex(45084);
        }

        C37654c(AbstractC89172b bVar) {
            this.f89022a = bVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.utils.AbstractC38757n.AbstractC38758a
        public final /* synthetic */ void sendLog(boolean z) {
            C89219l.m154716b(this.f89022a.invoke(Boolean.valueOf(z)), "");
        }
    }

    static {
        Covode.recordClassIndex(45081);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend
    /* renamed from: a */
    public final String mo65600a() {
        return "snssdk" + C33657b.f79853a;
    }

    /* renamed from: b */
    public static IAdRouterHandlerDepend m75926b() {
        MethodCollector.m26663i(8866);
        Object a = C81908b.m141854a(IAdRouterHandlerDepend.class, false);
        if (a != null) {
            IAdRouterHandlerDepend iAdRouterHandlerDepend = (IAdRouterHandlerDepend) a;
            MethodCollector.m26664o(8866);
            return iAdRouterHandlerDepend;
        }
        if (C81908b.f183180aj == null) {
            synchronized (IAdRouterHandlerDepend.class) {
                try {
                    if (C81908b.f183180aj == null) {
                        C81908b.f183180aj = new AdRouterHandlerDependImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(8866);
                    throw th;
                }
            }
        }
        AdRouterHandlerDependImpl adRouterHandlerDependImpl = (AdRouterHandlerDependImpl) C81908b.f183180aj;
        MethodCollector.m26664o(8866);
        return adRouterHandlerDependImpl;
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.depend.AdRouterHandlerDependImpl$a */
    public static final class C37652a extends C37675h {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f89020a;

        static {
            Covode.recordClassIndex(45082);
        }

        C37652a(AbstractC89172b bVar) {
            this.f89020a = bVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.util.adrouter.p2619a.AbstractC38555a
        /* renamed from: a */
        public final void mo65609a(boolean z, C38565b bVar) {
            C89219l.m154721d(bVar, "");
            super.mo65609a(z, bVar);
            AbstractC89172b bVar2 = this.f89020a;
            if (bVar2 != null) {
                bVar2.invoke(Boolean.valueOf(z));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.depend.AdRouterHandlerDependImpl$b */
    public static final class C37653b extends C38613a {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f89021a;

        static {
            Covode.recordClassIndex(45083);
        }

        C37653b(AbstractC89172b bVar) {
            this.f89021a = bVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.util.adrouter.p2619a.AbstractC38555a
        /* renamed from: a */
        public final void mo65609a(boolean z, C38565b bVar) {
            C89219l.m154721d(bVar, "");
            super.mo65609a(z, bVar);
            AbstractC89172b bVar2 = this.f89021a;
            if (bVar2 != null) {
                bVar2.invoke(Boolean.valueOf(z));
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend
    /* renamed from: b */
    public final AbstractC38555a mo65606b(AbstractC89172b<? super Boolean, C89391z> bVar) {
        return new C37653b(bVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend
    /* renamed from: c */
    public final AbstractC38555a mo65608c(AbstractC89172b<? super Boolean, C89391z> bVar) {
        return new C37652a(bVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend
    /* renamed from: a */
    public final void mo65601a(AbstractC89172b<? super Boolean, C89391z> bVar) {
        C89219l.m154721d(bVar, "");
        C38767w.m78630a(new C37654c(bVar));
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend
    /* renamed from: b */
    public final boolean mo65607b(String str) {
        C89219l.m154721d(str, "");
        return C36125t.m73598a(C36125t.m73591a(), str);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend
    /* renamed from: a */
    public final void mo65602a(String str) {
        C89219l.m154721d(str, "");
        C38673e.m78470a(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend
    /* renamed from: a */
    public final boolean mo65605a(Context context, String str, String str2) {
        return C33722d.C33723a.m69045a(context, str, (String) null, false);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend
    /* renamed from: a */
    public final void mo65603a(String str, JSONObject jSONObject, String str2, String str3) {
        C89219l.m154721d(str, "");
        if (C34961c.f82469a) {
            C89219l.m154721d(str, "");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend
    /* renamed from: a */
    public final boolean mo65604a(Context context, String str, Uri uri, C38565b bVar) {
        C89219l.m154721d(context, "");
        ALog.m59865d("commerce_jump", "【filterUrl】 = " + str + " 【market】 special handle");
        C89219l.m154721d(context, "");
        if (uri == null) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        intent.addFlags(268435456);
        C84349a.m145093a(intent, context);
        context.startActivity(intent);
        return true;
    }
}
