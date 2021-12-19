package com.bytedance.jedi.ext.adapter;

import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1194h;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.jedi.ext.adapter.j */
public final class C20671j {

    /* renamed from: a */
    public static final C20672a f48881a = new C20672a((byte) 0);

    /* renamed from: b */
    private final C1175ad.AbstractC1177b f48882b;

    /* renamed from: c */
    private final C1194h f48883c;

    static {
        Covode.recordClassIndex(24207);
    }

    /* renamed from: com.bytedance.jedi.ext.adapter.j$a */
    public static final class C20672a {
        static {
            Covode.recordClassIndex(24208);
        }

        private C20672a() {
        }

        public /* synthetic */ C20672a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C20671j m38922a(C1175ad.AbstractC1177b bVar, C1194h hVar) {
            C89219l.m154719c(bVar, "");
            C89219l.m154719c(hVar, "");
            return new C20671j(bVar, hVar);
        }
    }

    public C20671j(C1175ad.AbstractC1177b bVar, C1194h hVar) {
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(hVar, "");
        this.f48882b = bVar;
        this.f48883c = hVar;
    }

    /* renamed from: a */
    public final <VM extends AbstractC1174ac> VM mo33923a(String str, Class<VM> cls) {
        VM vm;
        MethodCollector.m26663i(7810);
        C89219l.m154719c(str, "");
        C89219l.m154719c(cls, "");
        C1194h hVar = this.f48883c;
        C89219l.m154719c(str, "");
        VM vm2 = (VM) hVar.mo4010a().get(str);
        if (!cls.isInstance(vm2)) {
            synchronized (cls) {
                try {
                    vm = (VM) this.f48882b.mo3261a(cls);
                } catch (Throwable th) {
                    MethodCollector.m26664o(7810);
                    throw th;
                }
            }
            C1194h hVar2 = this.f48883c;
            C89219l.m154709a((Object) vm, "");
            C89219l.m154719c(str, "");
            C89219l.m154719c(vm, "");
            AbstractC1174ac put = hVar2.mo4010a().put(str, vm);
            if (put != null) {
                put.onCleared();
            }
            C89219l.m154709a((Object) vm, "");
            MethodCollector.m26664o(7810);
            return vm;
        } else if (vm2 != null) {
            MethodCollector.m26664o(7810);
            return vm2;
        } else {
            C89388w wVar = new C89388w("null cannot be cast to non-null type");
            MethodCollector.m26664o(7810);
            throw wVar;
        }
    }
}
