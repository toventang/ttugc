package com.bytedance.ies.xbridge.base.runtime.depend;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.model.p1341b.C18742c;
import java.util.List;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

public interface IHostRouterDepend {
    static {
        Covode.recordClassIndex(21143);
    }

    boolean closeView(C18742c cVar, EnumC18483e eVar, String str, boolean z);

    boolean openSchema(C18742c cVar, String str, Map<String, ? extends Object> map, EnumC18483e eVar, Context context);

    AbstractC18464a provideRouteOpenExceptionHandler(C18742c cVar);

    List<AbstractC18464a> provideRouteOpenHandlerList(C18742c cVar);

    /* renamed from: com.bytedance.ies.xbridge.base.runtime.depend.IHostRouterDepend$a */
    public static final class C18458a {
        static {
            Covode.recordClassIndex(21144);
        }

        /* renamed from: a */
        public static boolean m34335a(IHostRouterDepend iHostRouterDepend, C18742c cVar, String str, Map<String, ? extends Object> map, EnumC18483e eVar) {
            Context context;
            C89219l.m154719c(str, "");
            C89219l.m154719c(map, "");
            C89219l.m154719c(eVar, "");
            List<AbstractC18464a> provideRouteOpenHandlerList = iHostRouterDepend.provideRouteOpenHandlerList(cVar);
            AbstractC18464a provideRouteOpenExceptionHandler = iHostRouterDepend.provideRouteOpenExceptionHandler(cVar);
            T t = null;
            T t2 = null;
            for (T t3 : provideRouteOpenHandlerList) {
                if (t2 == null) {
                    t = t3;
                } else {
                    t2.f44094a = t3;
                }
                t3.f44095b = provideRouteOpenExceptionHandler;
                t2 = t3;
            }
            boolean z = false;
            if (t == null) {
                return false;
            }
            do {
                if (t.mo29603a().contains(EnumC18483e.ALL) || t.mo29603a().contains(eVar)) {
                    if (cVar != null) {
                        try {
                            context = (Context) cVar.mo29769a(Context.class);
                        } catch (Throwable unused) {
                            t = t.f44095b;
                            continue;
                        }
                    } else {
                        context = null;
                    }
                    z = t.mo29604a(str, map, context);
                    if (z) {
                        break;
                    }
                    t = t.f44094a;
                    continue;
                } else {
                    t = t.f44094a;
                    continue;
                }
            } while (t != null);
            return z;
        }
    }
}
