package com.p2082ss.android.ugc.aweme.lego.p3395e;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58259r;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.lego.EnumC58147aa;
import com.p2082ss.android.ugc.aweme.lego.p3390a.AbstractC58142d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.lego.e.b */
public final class C58218b {

    /* renamed from: a */
    private Context f132568a;

    /* renamed from: b */
    private final Map<EnumC58147aa, List<AbstractC58259r>> f132569b = new HashMap();

    static {
        Covode.recordClassIndex(68285);
    }

    /* renamed from: a */
    public final void mo95679a(Context context) {
        C89219l.m154721d(context, "");
        this.f132568a = context;
        for (EnumC58147aa aaVar : EnumC58147aa.values()) {
            this.f132569b.put(aaVar, new ArrayList());
        }
    }

    /* renamed from: a */
    private final void m105122a(AbstractC58259r rVar) {
        MethodCollector.m26663i(4606);
        synchronized (this.f132569b) {
            try {
                List<AbstractC58259r> list = this.f132569b.get(rVar.mo58051b());
                if (list == null) {
                    C89219l.m154715b();
                }
                list.remove(rVar);
            } finally {
                MethodCollector.m26664o(4606);
            }
        }
    }

    /* renamed from: b */
    public final AbstractC58259r mo95683b(EnumC58147aa aaVar) {
        MethodCollector.m26663i(4649);
        C89219l.m154721d(aaVar, "");
        synchronized (this.f132569b) {
            try {
                List<AbstractC58259r> list = this.f132569b.get(aaVar);
                if (list == null) {
                    C89219l.m154715b();
                }
                if (!list.isEmpty()) {
                    List<AbstractC58259r> list2 = this.f132569b.get(aaVar);
                    if (list2 == null) {
                        C89219l.m154715b();
                    }
                    return list2.get(0);
                }
                MethodCollector.m26664o(4649);
                return null;
            } finally {
                MethodCollector.m26664o(4649);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo95682a(EnumC58147aa aaVar) {
        C89219l.m154721d(aaVar, "");
        List<AbstractC58259r> list = this.f132569b.get(aaVar);
        if (list == null) {
            C89219l.m154715b();
        }
        if (!list.isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo95680a(EnumC58147aa aaVar, AbstractC58259r rVar) {
        MethodCollector.m26663i(4622);
        C89219l.m154721d(aaVar, "");
        C89219l.m154721d(rVar, "");
        synchronized (this.f132569b) {
            try {
                List<AbstractC58259r> list = this.f132569b.get(aaVar);
                if (list == null) {
                    C89219l.m154715b();
                }
                list.add(rVar);
            } finally {
                MethodCollector.m26664o(4622);
            }
        }
    }

    /* renamed from: a */
    public final void mo95681a(AbstractC58259r rVar, boolean z) {
        MethodCollector.m26663i(4598);
        C89219l.m154721d(rVar, "");
        synchronized (rVar) {
            try {
                List<AbstractC58259r> list = this.f132569b.get(rVar.mo58051b());
                if (list == null) {
                    C89219l.m154715b();
                }
                if (list.contains(rVar)) {
                    m105122a(rVar);
                    AbstractC58142d dVar = C58221f.f132583g;
                    if (dVar != null) {
                        dVar.mo95650a(rVar);
                    }
                    Context context = this.f132568a;
                    if (context == null) {
                        C89219l.m154710a("context");
                    }
                    rVar.mo58050a(context, z);
                    AbstractC58142d dVar2 = C58221f.f132583g;
                    if (dVar2 != null) {
                        dVar2.mo95651b(rVar);
                    }
                }
            } finally {
                MethodCollector.m26664o(4598);
            }
        }
    }
}
