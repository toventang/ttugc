package com.bytedance.ies.p1208im.core.p1221b;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.C17415a;
import com.bytedance.ies.p1208im.core.api.p1210a.AbstractC17417b;
import com.bytedance.ies.p1208im.core.api.p1210a.C17418c;
import com.bytedance.ies.p1208im.core.api.p1210a.EnumC17416a;
import com.bytedance.ies.p1208im.core.api.p1214d.AbstractC17449b;
import com.bytedance.ies.p1208im.core.api.p1215e.C17453a;
import com.bytedance.ies.p1208im.core.api.p1216f.C17458d;
import com.bytedance.ies.p1208im.core.p1222c.C17503g;
import com.bytedance.ies.p1208im.core.p1227h.C17594a;
import com.bytedance.p1399im.core.p1408d.C19672u;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.im.core.b.e */
public final class HandlerC17488e extends Handler implements AbstractC17417b {

    /* renamed from: a */
    static volatile boolean f41861a;

    /* renamed from: b */
    static volatile boolean f41862b = true;

    /* renamed from: c */
    public static final HandlerC17488e f41863c = new HandlerC17488e();

    /* renamed from: d */
    private static volatile int f41864d;

    /* renamed from: e */
    private static volatile boolean f41865e;

    /* renamed from: f */
    private static final AbstractC89244h f41866f = C89250i.m154773a((AbstractC89171a) C17489a.f41867a);

    /* renamed from: g */
    private static CopyOnWriteArraySet<AbstractC17485b> m32472g() {
        return (CopyOnWriteArraySet) f41866f.getValue();
    }

    /* renamed from: com.bytedance.ies.im.core.b.e$a */
    static final class C17489a extends AbstractC89220m implements AbstractC89171a<CopyOnWriteArraySet<AbstractC17485b>> {

        /* renamed from: a */
        public static final C17489a f41867a = new C17489a();

        static {
            Covode.recordClassIndex(19978);
        }

        C17489a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ CopyOnWriteArraySet<AbstractC17485b> invoke() {
            return new CopyOnWriteArraySet();
        }
    }

    private HandlerC17488e() {
        super(Looper.getMainLooper());
    }

    /* renamed from: e */
    public final void mo27917e() {
        f41864d = 0;
        removeMessages(1);
    }

    static {
        Covode.recordClassIndex(19977);
    }

    /* renamed from: a */
    public final void mo27913a() {
        if (!f41865e) {
            f41865e = true;
            C17415a.m32255b().mo27836b("TokenManager", "init");
            f41862b = true;
            mo27918f();
        }
    }

    /* renamed from: c */
    public static String m32471c() {
        if (!C17415a.m32258e().mo27822a()) {
            C17415a.m32255b().mo27836b("TokenManager", "getToken not login");
            return "";
        }
        String a = C17594a.m32638a();
        String c = C17415a.m32258e().mo27824c();
        if (c == null) {
            c = "";
        }
        C17415a.m32255b().mo27836b("TokenManager", "getToken: " + a + ", " + c + ", " + C17503g.m32484a());
        if (a.length() > 0) {
            return a;
        }
        if (C17503g.m32484a()) {
            return c;
        }
        return "";
    }

    /* renamed from: b */
    public final void mo27915b() {
        String a = C17594a.m32638a();
        C17415a.m32255b().mo27836b("TokenManager", "ensure: " + f41865e + ", " + f41862b + ", " + a + ' ' + C17415a.m32258e().mo27824c());
        if (!f41865e) {
            mo27913a();
        }
        if (a.length() == 0) {
            mo27918f();
        }
    }

    /* renamed from: d */
    public final void mo27916d() {
        C17415a.m32255b().mo27836b("TokenManager", "retryTokenTask: " + f41861a + ", " + f41864d);
        if (!f41861a && f41864d < 10) {
            f41864d++;
            removeMessages(1);
            sendEmptyMessageDelayed(1, ((long) f41864d) * 3000);
        }
    }

    /* renamed from: f */
    public final void mo27918f() {
        if (C17415a.m32258e().mo27826e()) {
            C17415a.m32255b().mo27836b("TokenManager", "doFetchTask forbid by ftc");
            return;
        }
        C17415a.m32258e();
        C17415a.m32255b().mo27836b("TokenManager", "doFetchTask start: " + f41861a + ", " + C17415a.m32258e().mo27822a());
        if (!f41861a) {
            if (!C17415a.m32258e().mo27822a()) {
                mo27917e();
                mo27914a("");
                return;
            }
            f41861a = true;
            C17415a.m32256c().mo27843a(f41862b, C17453a.m32406a(C17490b.f41868a, C17491c.f41869a));
        }
    }

    /* renamed from: a */
    public static void m32469a(AbstractC17485b bVar) {
        C89219l.m154721d(bVar, "");
        m32472g().add(bVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.im.core.b.e$c */
    public static final class C17491c extends AbstractC89220m implements AbstractC89172b<C19672u, C89391z> {

        /* renamed from: a */
        public static final C17491c f41869a = new C17491c();

        static {
            Covode.recordClassIndex(19980);
        }

        C17491c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C19672u uVar) {
            C17415a.m32255b().mo27838c("TokenManager", "doFetchTask onError=".concat(String.valueOf(uVar)));
            HandlerC17488e.f41861a = false;
            HandlerC17488e.f41863c.mo27916d();
            return C89391z.f203057a;
        }
    }

    public final void handleMessage(Message message) {
        C89219l.m154721d(message, "");
        removeMessages(1);
        C17415a.m32255b().mo27836b("TokenManager", "handleMessage: " + f41864d);
        if (message.what == 1) {
            mo27918f();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.im.core.b.e$b */
    public static final class C17490b extends AbstractC89220m implements AbstractC89172b<C17458d, C89391z> {

        /* renamed from: a */
        public static final C17490b f41868a = new C17490b();

        static {
            Covode.recordClassIndex(19979);
        }

        C17490b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C17458d dVar) {
            String imToken;
            C17458d dVar2 = dVar;
            C17415a.m32255b().mo27836b("TokenManager", "doFetchTask onResult=".concat(String.valueOf(dVar2)));
            HandlerC17488e.f41862b = false;
            if (dVar2 == null || (imToken = dVar2.getImToken()) == null || imToken.length() == 0) {
                HandlerC17488e.f41861a = false;
                HandlerC17488e.f41863c.mo27916d();
            } else {
                HandlerC17488e eVar = HandlerC17488e.f41863c;
                if (dVar2 == null) {
                    C89219l.m154715b();
                }
                String imToken2 = dVar2.getImToken();
                if (imToken2 == null) {
                    imToken2 = "";
                }
                eVar.mo27914a(imToken2);
                HandlerC17488e.f41863c.mo27917e();
                HandlerC17488e.f41861a = false;
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo27914a(String str) {
        String a = C17594a.m32638a();
        C17594a.m32639a(str);
        if (!C89219l.m154714a((Object) a, (Object) str)) {
            m32470a(a, str);
        }
        C17415a.m32255b().mo27836b("TokenManager", "updateLocalToken: " + a + ", " + str);
    }

    /* renamed from: a */
    private static void m32470a(String str, String str2) {
        Iterator<T> it = m32472g().iterator();
        while (it.hasNext()) {
            it.next().mo27912a(str, str2);
        }
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1210a.AbstractC17417b
    /* renamed from: a */
    public final void mo27788a(EnumC17416a aVar, C17418c cVar) {
        String str;
        C89219l.m154721d(aVar, "");
        AbstractC17449b b = C17415a.m32255b();
        StringBuilder append = new StringBuilder("onAccountChange: ").append(aVar).append(", ");
        if (cVar != null) {
            str = cVar.f41775a;
        } else {
            str = null;
        }
        b.mo27836b("TokenManager", append.append(str).toString());
        mo27914a("");
        if (aVar == EnumC17416a.LOGIN || aVar == EnumC17416a.SWITCH) {
            f41862b = true;
            mo27918f();
        }
    }
}
