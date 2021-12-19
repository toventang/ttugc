package com.p2082ss.android.ugc.aweme.lego.p3395e;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58252n;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58262u;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.lego.p3390a.AbstractC58142d;
import com.p2082ss.android.ugc.aweme.lego.p3394d.C58205b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.lego.e.c */
public final class C58219c {

    /* renamed from: a */
    public final Map<String, AbstractC58262u> f132570a = new ConcurrentHashMap();

    /* renamed from: b */
    public final Map<String, AbstractC58262u> f132571b = new ConcurrentHashMap();

    /* renamed from: c */
    public final Map<EnumC58151ae, List<String>> f132572c = new HashMap();

    /* renamed from: d */
    private Context f132573d;

    static {
        Covode.recordClassIndex(68286);
    }

    /* renamed from: a */
    public final void mo95685a(Context context) {
        C89219l.m154721d(context, "");
        this.f132573d = context;
        for (EnumC58151ae aeVar : EnumC58151ae.values()) {
            this.f132572c.put(aeVar, new ArrayList());
        }
    }

    /* renamed from: a */
    public final boolean mo95686a(EnumC58151ae aeVar) {
        C89219l.m154721d(aeVar, "");
        List<String> list = this.f132572c.get(aeVar);
        if (list == null) {
            C89219l.m154715b();
        }
        if (!list.isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final List<String> mo95688c(EnumC58151ae aeVar) {
        ArrayList arrayList;
        MethodCollector.m26663i(5792);
        C89219l.m154721d(aeVar, "");
        synchronized (this.f132572c) {
            try {
                List<String> list = this.f132572c.get(aeVar);
                if (list == null) {
                    C89219l.m154715b();
                }
                arrayList = new ArrayList(list);
                List<String> list2 = this.f132572c.get(aeVar);
                if (list2 == null) {
                    C89219l.m154715b();
                }
                list2.clear();
            } finally {
                MethodCollector.m26664o(5792);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public final String mo95687b(EnumC58151ae aeVar) {
        MethodCollector.m26663i(5790);
        C89219l.m154721d(aeVar, "");
        synchronized (this.f132572c) {
            try {
                List<String> list = this.f132572c.get(aeVar);
                if (list == null) {
                    C89219l.m154715b();
                }
                if (!list.isEmpty()) {
                    List<String> list2 = this.f132572c.get(aeVar);
                    if (list2 == null) {
                        C89219l.m154715b();
                    }
                    return list2.remove(0);
                }
                MethodCollector.m26664o(5790);
                return null;
            } finally {
                MethodCollector.m26664o(5790);
            }
        }
    }

    /* renamed from: a */
    public final AbstractC58262u mo95684a(String str) {
        AbstractC58262u uVar;
        MethodCollector.m26663i(5667);
        C89219l.m154721d(str, "");
        AbstractC58262u uVar2 = this.f132571b.get(str);
        if (uVar2 == null) {
            C89219l.m154715b();
        }
        AbstractC58262u uVar3 = uVar2;
        synchronized (uVar3) {
            try {
                if (!this.f132570a.containsKey(str)) {
                    if (C58205b.f132531a || C58205b.m105117a(uVar3)) {
                        AbstractC58142d dVar = C58221f.f132583g;
                        if (dVar != null) {
                            dVar.mo95650a(uVar3);
                        }
                        Context context = this.f132573d;
                        if (context == null) {
                            C89219l.m154710a("context");
                        }
                        uVar3.mo28600a(context);
                        List<AbstractC58252n> j = uVar3.mo28610j();
                        if (j != null && j.size() > 0) {
                            C58221f.C58225d e = C58221f.m105153e();
                            for (T t : j) {
                                C89219l.m154716b(t, "");
                                e.mo95704a(t);
                            }
                            e.mo95706a();
                        }
                        AbstractC58142d dVar2 = C58221f.f132583g;
                        if (dVar2 != null) {
                            dVar2.mo95651b(uVar3);
                        }
                    }
                    this.f132570a.put(str, uVar3);
                }
                AbstractC58262u uVar4 = this.f132570a.get(str);
                if (uVar4 == null) {
                    C89219l.m154715b();
                }
                uVar = uVar4;
            } finally {
                MethodCollector.m26664o(5667);
            }
        }
        return uVar;
    }
}
