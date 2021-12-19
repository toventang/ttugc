package com.bytedance.helios.sdk.p1095c;

import com.bytedance.covode.number.Covode;
import com.bytedance.crash.entity.C13866d;
import com.bytedance.crash.p932j.C13913i;
import com.bytedance.helios.api.p1088b.AbstractC15305c;
import com.bytedance.helios.api.p1088b.AbstractC15308f;
import com.bytedance.helios.api.p1088b.C15322p;
import com.bytedance.helios.api.p1090c.C15326b;
import com.bytedance.helios.p1085a.p1086a.C15290c;
import com.bytedance.helios.p1085a.p1086a.C15293f;
import com.bytedance.helios.sdk.HeliosEnvImpl;
import com.bytedance.helios.sdk.p1105g.C15475b;
import com.bytedance.helios.sdk.utils.C15484f;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.helios.sdk.c.c */
public final class C15384c implements AbstractC15305c {

    /* renamed from: a */
    public static final C15385a f37521a = new C15385a((byte) 0);

    static {
        Covode.recordClassIndex(17636);
    }

    /* renamed from: com.bytedance.helios.sdk.c.c$a */
    public static final class C15385a {
        static {
            Covode.recordClassIndex(17637);
        }

        private C15385a() {
        }

        public /* synthetic */ C15385a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.helios.sdk.c.c$b */
    static final class RunnableC15386b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C15326b f37522a;

        static {
            Covode.recordClassIndex(17638);
        }

        RunnableC15386b(C15326b bVar) {
            this.f37522a = bVar;
        }

        public final void run() {
            throw this.f37522a.f37403b;
        }
    }

    @Override // com.bytedance.helios.api.p1088b.AbstractC15305c
    /* renamed from: a */
    public final void mo24824a(AbstractC15308f fVar) {
        String name;
        C89219l.m154719c(fVar, "");
        C15326b bVar = (C15326b) fVar;
        C15322p pVar = C15475b.f37716b;
        if (pVar != null && pVar.f37391c) {
            Thread currentThread = Thread.currentThread();
            C89219l.m154709a((Object) currentThread, "");
            String name2 = currentThread.getName();
            Map map = bVar.f37405d;
            if (map == null) {
                map = new LinkedHashMap();
            }
            map.put("Label", bVar.f37404c);
            StackTraceElement stackTraceElement = new StackTraceElement(getClass().getName(), "", "", 0);
            String b = C15293f.m28202b(bVar.f37403b);
            String str = bVar.f37404c;
            Thread thread = bVar.f37402a;
            if (!(thread == null || (name = thread.getName()) == null)) {
                name2 = name;
            }
            C13866d a = C13866d.m25085a(stackTraceElement, b, str, name2, true, "EnsureNotReachHere", "helios_log_type");
            C89219l.m154709a((Object) a, "");
            for (Map.Entry entry : map.entrySet()) {
                a.mo22350c((String) entry.getKey(), (String) entry.getValue());
            }
            a.mo22340a("Label", bVar.f37404c);
            a.mo22340a("EventType", "HeliosException");
            C13913i.m25188a(a);
            C15484f.m28492a(bVar.f37404c, (String) null, "e", bVar.f37403b);
            C15484f.m28491a(bVar.f37404c, map.toString(), "e", 8);
            C15373a.m28279b();
            if (HeliosEnvImpl.INSTANCE.isOffLineEnv()) {
                C15290c.m28197a().post(new RunnableC15386b(bVar));
            }
        }
    }
}
