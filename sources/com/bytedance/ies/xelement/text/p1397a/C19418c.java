package com.bytedance.ies.xelement.text.p1397a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xelement.text.a.c */
public final class C19418c implements AbstractC19417b {

    /* renamed from: b */
    public static C19418c f46009b;

    /* renamed from: c */
    public static final C19419a f46010c = new C19419a((byte) 0);

    /* renamed from: a */
    public AbstractC19417b f46011a;

    static {
        Covode.recordClassIndex(22228);
    }

    /* renamed from: com.bytedance.ies.xelement.text.a.c$a */
    public static final class C19419a {
        static {
            Covode.recordClassIndex(22229);
        }

        private C19419a() {
        }

        /* renamed from: a */
        public static C19418c m36225a() {
            MethodCollector.m26663i(3289);
            if (C19418c.f46009b == null) {
                synchronized (C19418c.class) {
                    try {
                        if (C19418c.f46009b == null) {
                            C19418c.f46009b = new C19418c((byte) 0);
                        }
                    } catch (Throwable th) {
                        MethodCollector.m26664o(3289);
                        throw th;
                    }
                }
            }
            C19418c cVar = C19418c.f46009b;
            if (cVar == null) {
                C89219l.m154707a();
            }
            MethodCollector.m26664o(3289);
            return cVar;
        }

        public /* synthetic */ C19419a(byte b) {
            this();
        }
    }

    private C19418c() {
    }

    public /* synthetic */ C19418c(byte b) {
        this();
    }

    /* renamed from: a */
    public final void mo30986a(AbstractC19417b bVar) {
        C89219l.m154719c(bVar, "");
        this.f46011a = bVar;
    }

    @Override // com.bytedance.ies.xelement.text.p1397a.AbstractC19417b
    /* renamed from: a */
    public final Drawable mo30985a(Context context, String str) {
        AbstractC19417b bVar = this.f46011a;
        if (bVar == null) {
            C89219l.m154710a("adapter");
        }
        return bVar.mo30985a(context, str);
    }
}
