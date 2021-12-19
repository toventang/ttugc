package com.bytedance.ies.p1208im.core.p1226g;

import android.os.Message;
import android.os.SystemClock;
import android.util.LruCache;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.p1208im.core.api.C17415a;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17427b;
import com.bytedance.ies.p1208im.core.api.p1214d.AbstractC17449b;
import com.bytedance.ies.p1208im.core.api.p1215e.C17453a;
import com.bytedance.ies.p1208im.core.api.p1216f.C17456b;
import com.bytedance.ies.p1208im.core.p1209a.C17397a;
import com.bytedance.ies.p1208im.core.p1226g.C17573a;
import com.bytedance.p1399im.core.internal.p1427b.p1428a.C19930x;
import com.bytedance.p1399im.core.p1404a.C19489e;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.bytedance.p1399im.core.p1408d.C19656k;
import java.util.Map;
import java.util.Set;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.im.core.g.c */
public final class C17583c {

    /* renamed from: a */
    public static final C17583c f42044a = new C17583c();

    /* renamed from: b */
    private static final AbstractC89244h f42045b = C89250i.m154773a((AbstractC89171a) C17586c.f42050a);

    /* renamed from: c */
    private static final AbstractC89244h f42046c = C89250i.m154773a((AbstractC89171a) C17584a.f42048a);

    /* renamed from: d */
    private static final AbstractC89244h f42047d = C89250i.m154773a((AbstractC89171a) C17585b.f42049a);

    /* renamed from: a */
    public static HandlerC17580b m32614a() {
        return (HandlerC17580b) f42045b.getValue();
    }

    /* renamed from: b */
    public static C17573a m32618b() {
        return (C17573a) f42046c.getValue();
    }

    /* renamed from: d */
    private static LruCache<String, C17456b> m32620d() {
        return (LruCache) f42047d.getValue();
    }

    private C17583c() {
    }

    /* renamed from: com.bytedance.ies.im.core.g.c$b */
    static final class C17585b extends AbstractC89220m implements AbstractC89171a<LruCache<String, C17456b>> {

        /* renamed from: a */
        public static final C17585b f42049a = new C17585b();

        static {
            Covode.recordClassIndex(20074);
        }

        C17585b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ LruCache<String, C17456b> invoke() {
            return new LruCache(30);
        }
    }

    /* renamed from: com.bytedance.ies.im.core.g.c$c */
    static final class C17586c extends AbstractC89220m implements AbstractC89171a<HandlerC17580b> {

        /* renamed from: a */
        public static final C17586c f42050a = new C17586c();

        static {
            Covode.recordClassIndex(20075);
        }

        C17586c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ HandlerC17580b invoke() {
            return new HandlerC17580b();
        }
    }

    /* renamed from: com.bytedance.ies.im.core.g.c$a */
    static final class C17584a extends AbstractC89220m implements AbstractC89171a<C17573a> {

        /* renamed from: a */
        public static final C17584a f42048a = new C17584a();

        static {
            Covode.recordClassIndex(20073);
        }

        C17584a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C17573a invoke() {
            return new C17573a(C17583c.m32614a());
        }
    }

    /* renamed from: c */
    public static void m32619c() {
        C17415a.m32255b().mo27838c("MsgSender", "onSDKLogout");
        m32618b().mo28013c();
        m32614a().mo28022b();
    }

    static {
        Covode.recordClassIndex(20072);
    }

    /* renamed from: b */
    private static C17456b m32617b(C19538ai aiVar) {
        C89219l.m154721d(aiVar, "");
        return m32620d().get(aiVar.getUuid());
    }

    /* renamed from: a */
    public final C17456b mo28024a(C19538ai aiVar) {
        C89219l.m154721d(aiVar, "");
        C17456b b = m32617b(aiVar);
        if (b != null) {
            return b;
        }
        C17456b bVar = new C17456b();
        m32616a(aiVar, bVar);
        return bVar;
    }

    /* renamed from: a */
    public static void m32615a(C17587d dVar) {
        boolean z;
        Boolean bool;
        MethodCollector.m26663i(10112);
        C89219l.m154721d(dVar, "");
        C17415a.m32255b().mo27836b("MsgSender", "sendMessage: ".concat(String.valueOf(dVar)));
        boolean z2 = false;
        if (!C17453a.m32409b(dVar.f42053a) || !C17453a.m32408a(dVar.f42054b)) {
            MethodCollector.m26664o(10112);
            return;
        }
        if (dVar.f42058f == null) {
            dVar.f42058f = new C17456b();
        }
        dVar.f42062j = SystemClock.uptimeMillis();
        C17397a aVar = C17397a.f41738b;
        String str = dVar.f42053a;
        if (str == null) {
            C89219l.m154715b();
        }
        C19638h a = aVar.mo27720a(str);
        if (a == null || a.isTemp()) {
            String str2 = dVar.f42053a;
            if (str2 == null) {
                C89219l.m154715b();
            }
            if (AbstractC17427b.C17428a.m32311c(str2) <= 0) {
                z = true;
            } else {
                z = false;
            }
            HandlerC17580b a2 = m32614a();
            C89219l.m154721d(dVar, "");
            AbstractC17449b b = C17415a.m32255b();
            StringBuilder append = new StringBuilder("enqueue[").append(dVar.f42053a).append("]: ").append(dVar).append(", ");
            if (a != null) {
                bool = Boolean.valueOf(a.isTemp());
            } else {
                bool = null;
            }
            b.mo27836b("MsgSender_MQ", append.append(bool).toString());
            Map<String, Set<C17587d>> a3 = a2.mo28019a();
            String str3 = dVar.f42053a;
            if (str3 == null) {
                C89219l.m154715b();
            }
            a2.mo28021a(a3, str3, dVar);
            if (a != null && a.isTemp()) {
                dVar.mo28026a(a);
            }
            C17415a.m32255b().mo27827a("MsgSender_MQ", "bookTimeOut[" + dVar.f42053a + "]: " + dVar);
            Message message = new Message();
            message.what = dVar.f42063k;
            message.obj = dVar.f42053a;
            a2.sendMessageDelayed(message, 10000);
            C17573a b2 = m32618b();
            String str4 = dVar.f42053a;
            if (str4 == null) {
                C89219l.m154715b();
            }
            C89219l.m154721d(str4, "");
            C17415a.m32255b().mo27836b("MsgSender_CQ", "enqueue before[" + str4 + "]: " + b2.mo28009b().size());
            synchronized (b2.mo28009b()) {
                try {
                    if (!b2.mo28009b().containsKey(str4)) {
                        b2.f42030a++;
                        int i = b2.f42030a;
                        b2.mo28009b().put(str4, Integer.valueOf(i));
                        C17415a.m32255b().mo27827a("MsgSender_CQ", "bookTimeOut[" + str4 + "]: " + i);
                        Message message2 = new Message();
                        message2.what = i;
                        message2.obj = str4;
                        b2.mo28000a().sendMessageDelayed(message2, 10000);
                        z2 = true;
                    }
                } finally {
                    MethodCollector.m26664o(10112);
                }
            }
            C17415a.m32255b().mo27836b("MsgSender_CQ", "enqueue after[" + str4 + "]: " + b2.mo28009b().size() + ", " + z2);
            if (z2) {
                if (z) {
                    try {
                        long parseLong = Long.parseLong(str4);
                        C19930x.m37536a();
                        C19930x.m37538a(1, str4, parseLong, C19489e.AbstractC19490a.f46181b, new C17573a.C17579e(b2, str4));
                        MethodCollector.m26664o(10112);
                        return;
                    } catch (NumberFormatException unused) {
                        C17415a.m32255b().mo27838c("MsgSender_CQ", "invalid conversationId: ".concat(String.valueOf(str4)));
                        MethodCollector.m26664o(10112);
                        return;
                    }
                } else {
                    C17415a.m32255b().mo27827a("MsgSender_CQ", "create[" + str4 + ']');
                    C17397a.f41738b.mo27730b(String.valueOf(C19656k.m36718a(str4)), new C17573a.C17575b(b2, str4));
                }
            }
            return;
        }
        dVar.mo28027a(a, false);
        MethodCollector.m26664o(10112);
    }

    /* renamed from: a */
    public static void m32616a(C19538ai aiVar, C17456b bVar) {
        C89219l.m154721d(aiVar, "");
        C89219l.m154721d(bVar, "");
        m32620d().put(aiVar.getUuid(), bVar);
    }
}
