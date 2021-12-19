package com.bytedance.android.monitor.lynx.p715a;

import com.bytedance.android.monitor.lynx.p715a.C11958a;
import com.bytedance.android.monitor.p710h.C11937b;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.LynxView;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.android.monitor.lynx.a.d */
public final class C11966d {

    /* renamed from: a */
    static final Map<LynxView, C11958a> f28614a = new WeakHashMap();

    /* renamed from: b */
    public static final C11966d f28615b = new C11966d();

    private C11966d() {
    }

    static {
        Covode.recordClassIndex(13692);
    }

    /* renamed from: com.bytedance.android.monitor.lynx.a.d$a */
    static final class C11967a extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C11958a f28616a;

        static {
            Covode.recordClassIndex(13693);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11967a(C11958a aVar) {
            super(0);
            this.f28616a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            int i;
            C11937b.m21063b("LynxBlankData_Template", this.f28616a.mo19166a());
            if (this.f28616a.f28588g != null) {
                StringBuilder sb = new StringBuilder();
                List<C11958a.C11959a> list = this.f28616a.f28588g;
                C89219l.m154709a((Object) list, "");
                Iterator<T> it = list.iterator();
                loop0:
                while (true) {
                    i = 0;
                    while (it.hasNext()) {
                        sb.append(new StringBuilder().append((Object) it.next()).append(' ').toString());
                        i++;
                        if (i >= 6) {
                            C11937b.m21063b("LynxBlankData_Element", sb.toString());
                            C89361p.m154858a(sb);
                        }
                    }
                    break loop0;
                }
                if (i != 0) {
                    C11937b.m21063b("LynxBlankData_Element", sb.toString());
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static void m21134a(LynxView lynxView, C11958a.C11959a aVar) {
        C89219l.m154719c(lynxView, "");
        C89219l.m154719c(aVar, "");
        C11958a aVar2 = f28614a.get(lynxView);
        if (aVar2 != null) {
            aVar2.mo19167a(aVar);
        }
    }
}
