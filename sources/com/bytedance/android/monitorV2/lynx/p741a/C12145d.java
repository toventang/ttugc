package com.bytedance.android.monitorV2.lynx.p741a;

import com.bytedance.android.monitorV2.lynx.p741a.C12137a;
import com.bytedance.android.monitorV2.p737i.C12115b;
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

/* renamed from: com.bytedance.android.monitorV2.lynx.a.d */
public final class C12145d {

    /* renamed from: a */
    static final Map<LynxView, C12137a> f29189a = new WeakHashMap();

    /* renamed from: b */
    public static final C12145d f29190b = new C12145d();

    private C12145d() {
    }

    static {
        Covode.recordClassIndex(13874);
    }

    /* renamed from: com.bytedance.android.monitorV2.lynx.a.d$a */
    static final class C12146a extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C12137a f29191a;

        static {
            Covode.recordClassIndex(13875);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12146a(C12137a aVar) {
            super(0);
            this.f29191a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            int i;
            C12115b.m21583b("LynxViewChecker_LynxBlankData_Template", this.f29191a.mo19505a());
            if (this.f29191a.f29163g != null) {
                StringBuilder sb = new StringBuilder();
                List<C12137a.C12138a> list = this.f29191a.f29163g;
                C89219l.m154709a((Object) list, "");
                Iterator<T> it = list.iterator();
                loop0:
                while (true) {
                    i = 0;
                    while (it.hasNext()) {
                        sb.append(new StringBuilder().append((Object) it.next()).append(' ').toString());
                        i++;
                        if (i >= 6) {
                            C12115b.m21583b("LynxViewChecker_LynxBlankData_Element", sb.toString());
                            C89361p.m154858a(sb);
                        }
                    }
                    break loop0;
                }
                if (i != 0) {
                    C12115b.m21583b("LynxViewChecker_LynxBlankData_Element", sb.toString());
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static void m21686a(LynxView lynxView, C12137a.C12138a aVar) {
        C89219l.m154719c(lynxView, "");
        C89219l.m154719c(aVar, "");
        C12137a aVar2 = f29189a.get(lynxView);
        if (aVar2 != null) {
            aVar2.mo19506a(aVar);
        }
    }
}
