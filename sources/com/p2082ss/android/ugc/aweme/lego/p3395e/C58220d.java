package com.p2082ss.android.ugc.aweme.lego.p3395e;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58084a;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58252n;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.lego.C58235l;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.lego.p3390a.AbstractC58142d;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.lego.e.d */
public final class C58220d {

    /* renamed from: a */
    public final Map<EnumC58151ae, List<AbstractC58252n>> f132574a = new ConcurrentHashMap();

    /* renamed from: b */
    private Context f132575b;

    /* renamed from: c */
    private final Map<EnumC58151ae, List<AbstractC58252n>> f132576c = new ConcurrentHashMap();

    static {
        Covode.recordClassIndex(68287);
    }

    /* renamed from: a */
    public final boolean mo95692a() {
        MethodCollector.m26663i(5087);
        boolean z = false;
        if (!C58235l.m105174b()) {
            MethodCollector.m26664o(5087);
            return false;
        }
        synchronized (this.f132574a) {
            try {
                List<AbstractC58252n> list = this.f132574a.get(EnumC58151ae.BOOT_FINISH);
                if (list == null) {
                    C89219l.m154715b();
                }
                if (!list.isEmpty()) {
                    List<AbstractC58252n> list2 = this.f132574a.get(EnumC58151ae.BOOT_FINISH);
                    if (list2 == null) {
                        C89219l.m154715b();
                    }
                    List<AbstractC58252n> list3 = list2;
                    ArrayList arrayList = new ArrayList();
                    for (T t : list3) {
                        if ((t instanceof AbstractC58084a) && t.mo28604d() == 2) {
                            arrayList.add(t);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        list3.removeAll(arrayList);
                        list3.addAll(0, arrayList);
                        z = true;
                    }
                }
            } finally {
                MethodCollector.m26664o(5087);
            }
        }
        return z;
    }

    /* renamed from: a */
    public final boolean mo95693a(EnumC58151ae aeVar) {
        C89219l.m154721d(aeVar, "");
        List<AbstractC58252n> list = this.f132574a.get(aeVar);
        if (list == null) {
            C89219l.m154715b();
        }
        if (!list.isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo95690a(Context context) {
        C89219l.m154721d(context, "");
        this.f132575b = context;
        EnumC58151ae[] values = EnumC58151ae.values();
        for (EnumC58151ae aeVar : values) {
            this.f132574a.put(aeVar, new ArrayList());
            this.f132576c.put(aeVar, new ArrayList());
        }
    }

    /* renamed from: b */
    public final AbstractC58264w mo95694b(EnumC58151ae aeVar) {
        MethodCollector.m26663i(5075);
        C89219l.m154721d(aeVar, "");
        synchronized (this.f132574a) {
            try {
                List<AbstractC58252n> list = this.f132574a.get(aeVar);
                if (list == null) {
                    C89219l.m154715b();
                }
                if (!list.isEmpty()) {
                    List<AbstractC58252n> list2 = this.f132574a.get(aeVar);
                    if (list2 == null) {
                        C89219l.m154715b();
                    }
                    AbstractC58252n remove = list2.remove(0);
                    synchronized (this.f132576c) {
                        try {
                            Map<EnumC58151ae, List<AbstractC58252n>> map = this.f132576c;
                            if (remove != null) {
                                List<AbstractC58252n> list3 = map.get(((AbstractC58264w) remove).mo28601b());
                                if (list3 == null) {
                                    C89219l.m154715b();
                                }
                                list3.add(remove);
                            } else {
                                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.lego.LegoTask");
                                MethodCollector.m26664o(5075);
                                throw nullPointerException;
                            }
                        } finally {
                            MethodCollector.m26664o(5075);
                        }
                    }
                    return (AbstractC58264w) remove;
                }
                MethodCollector.m26664o(5075);
                return null;
            } finally {
                MethodCollector.m26664o(5075);
            }
        }
    }

    /* renamed from: c */
    public final AbstractC58264w mo95696c(EnumC58151ae aeVar) {
        MethodCollector.m26663i(5081);
        C89219l.m154721d(aeVar, "");
        synchronized (this.f132574a) {
            try {
                List<AbstractC58252n> list = this.f132574a.get(aeVar);
                if (list == null) {
                    C89219l.m154715b();
                }
                if (!list.isEmpty()) {
                    List<AbstractC58252n> list2 = this.f132574a.get(aeVar);
                    if (list2 == null) {
                        C89219l.m154715b();
                    }
                    return (AbstractC58264w) list2.get(0);
                }
                MethodCollector.m26664o(5081);
                return null;
            } finally {
                MethodCollector.m26664o(5081);
            }
        }
    }

    /* renamed from: a */
    public final void mo95691a(AbstractC58264w wVar) {
        MethodCollector.m26663i(5052);
        C89219l.m154721d(wVar, "");
        List<AbstractC58252n> list = this.f132574a.get(wVar.mo28601b());
        if (list == null) {
            C89219l.m154715b();
        }
        if (list.contains(wVar)) {
            synchronized (this.f132574a) {
                try {
                    List<AbstractC58252n> list2 = this.f132574a.get(wVar.mo28601b());
                    if (list2 == null) {
                        C89219l.m154715b();
                    }
                    list2.remove(wVar);
                } finally {
                    MethodCollector.m26664o(5052);
                }
            }
            synchronized (this.f132576c) {
                try {
                    List<AbstractC58252n> list3 = this.f132576c.get(wVar.mo28601b());
                    if (list3 == null) {
                        C89219l.m154715b();
                    }
                    if (!list3.contains(wVar)) {
                        List<AbstractC58252n> list4 = this.f132576c.get(wVar.mo28601b());
                        if (list4 == null) {
                            C89219l.m154715b();
                        }
                        list4.add(wVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        List<AbstractC58252n> list5 = this.f132576c.get(wVar.mo28601b());
        if (list5 == null) {
            C89219l.m154715b();
        }
        if (list5.contains(wVar)) {
            AbstractC58142d dVar = C58221f.f132583g;
            if (dVar != null) {
                dVar.mo95650a(wVar);
            }
            mo95695b(wVar);
            AbstractC58142d dVar2 = C58221f.f132583g;
            if (dVar2 != null) {
                dVar2.mo95651b(wVar);
                MethodCollector.m26664o(5052);
                return;
            }
        }
        MethodCollector.m26664o(5052);
    }

    /* renamed from: b */
    public final void mo95695b(AbstractC58264w wVar) {
        MethodCollector.m26663i(5064);
        C89219l.m154721d(wVar, "");
        synchronized (wVar) {
            try {
                List<AbstractC58252n> list = this.f132576c.get(wVar.mo28601b());
                if (list == null) {
                    C89219l.m154715b();
                }
                if (list.contains(wVar)) {
                    AbstractC58142d dVar = C58221f.f132583g;
                    if (dVar != null) {
                        dVar.mo95650a(wVar);
                    }
                    Context context = this.f132575b;
                    if (context == null) {
                        C89219l.m154710a("context");
                    }
                    wVar.mo28600a(context);
                    List<AbstractC58252n> j = wVar.mo28610j();
                    if (j != null) {
                        C58221f.C58225d e = C58221f.m105153e();
                        for (T t : j) {
                            C89219l.m154716b(t, "");
                            e.mo95704a(t);
                        }
                        e.mo95706a();
                    }
                    AbstractC58142d dVar2 = C58221f.f132583g;
                    if (dVar2 != null) {
                        dVar2.mo95651b(wVar);
                    }
                    synchronized (this.f132576c) {
                        try {
                            List<AbstractC58252n> list2 = this.f132576c.get(wVar.mo28601b());
                            if (list2 == null) {
                                C89219l.m154715b();
                            }
                            list2.remove(wVar);
                        } catch (Throwable th) {
                            MethodCollector.m26664o(5064);
                            throw th;
                        }
                    }
                }
            } finally {
                MethodCollector.m26664o(5064);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.lego.n> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final List<AbstractC58252n> mo95689a(EnumC58151ae aeVar, List<? extends AbstractC58252n> list) {
        MethodCollector.m26663i(5096);
        C89219l.m154721d(aeVar, "");
        C89219l.m154721d(list, "");
        synchronized (this.f132574a) {
            try {
                for (AbstractC58252n nVar : list) {
                    List<AbstractC58252n> list2 = this.f132574a.get(aeVar);
                    if (list2 == null) {
                        C89219l.m154715b();
                    }
                    list2.remove(nVar);
                }
                synchronized (this.f132576c) {
                    try {
                        List<AbstractC58252n> list3 = this.f132576c.get(aeVar);
                        if (list3 == null) {
                            C89219l.m154715b();
                        }
                        list3.addAll(list);
                    } finally {
                        MethodCollector.m26664o(5096);
                    }
                }
            } finally {
                MethodCollector.m26664o(5096);
            }
        }
        return list;
    }
}
