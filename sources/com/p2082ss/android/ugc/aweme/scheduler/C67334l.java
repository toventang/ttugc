package com.p2082ss.android.ugc.aweme.scheduler;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.scheduler.RunnableC67311i;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72685x;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.C72678q;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4602b.C89090a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.scheduler.l */
public final class C67334l {

    /* renamed from: a */
    private final C67288b f150889a;

    /* renamed from: b */
    private final LinkedHashMap<String, RunnableC67311i.C67312a> f150890b = new LinkedHashMap<>();

    /* renamed from: c */
    private RunnableC67311i.C67312a f150891c;

    /* renamed from: d */
    private final int f150892d;

    /* renamed from: e */
    private final int f150893e;

    /* renamed from: f */
    private final boolean f150894f;

    /* renamed from: g */
    private final boolean f150895g;

    static {
        Covode.recordClassIndex(78957);
    }

    /* renamed from: b */
    private synchronized boolean m119281b() {
        MethodCollector.m26663i(6861);
        Collection<RunnableC67311i.C67312a> values = this.f150890b.values();
        C89219l.m154716b(values, "");
        ArrayList arrayList = new ArrayList();
        for (T t : values) {
            if (true ^ (t.f150840b instanceof AbstractC72685x.C72686a)) {
                arrayList.add(t);
            }
        }
        if (arrayList.size() >= this.f150892d) {
            MethodCollector.m26664o(6861);
            return true;
        }
        MethodCollector.m26664o(6861);
        return false;
    }

    /* renamed from: a */
    public final synchronized void mo106180a() {
        MethodCollector.m26663i(7462);
        Collection<RunnableC67311i.C67312a> values = this.f150890b.values();
        C89219l.m154716b(values, "");
        ArrayList arrayList = new ArrayList();
        for (T t : values) {
            if (t.f150840b instanceof AbstractC72685x.C72686a) {
                arrayList.add(t);
            }
        }
        for (RunnableC67311i.C67312a aVar : C89070n.m154567c(C89070n.m154553a((Iterable) arrayList, (Comparator) new C67335a()), this.f150893e)) {
            this.f150890b.remove(aVar.f150839a);
        }
        MethodCollector.m26664o(7462);
    }

    /* renamed from: c */
    public final synchronized void mo106183c(String str) {
        MethodCollector.m26663i(7463);
        C89219l.m154721d(str, "");
        this.f150890b.remove(str);
        MethodCollector.m26664o(7463);
    }

    /* renamed from: a */
    public final synchronized RunnableC67311i.C67312a mo106178a(String str) {
        MethodCollector.m26663i(7002);
        if (str == null) {
            RunnableC67311i.C67312a aVar = this.f150891c;
            MethodCollector.m26664o(7002);
            return aVar;
        }
        RunnableC67311i.C67312a aVar2 = this.f150890b.get(str);
        RunnableC67311i.C67312a aVar3 = this.f150891c;
        if (aVar2 == null) {
            m119280a(str, aVar3);
            MethodCollector.m26664o(7002);
            return aVar3;
        } else if (!(aVar2.f150840b instanceof AbstractC72685x.C72686a) || aVar3 == null) {
            MethodCollector.m26664o(7002);
            return aVar2;
        } else {
            m119280a(str, aVar3);
            MethodCollector.m26664o(7002);
            return aVar3;
        }
    }

    /* renamed from: b */
    public final synchronized List<RunnableC67311i.C67312a> mo106182b(String str) {
        MethodCollector.m26663i(7307);
        if (str == null) {
            Set<Map.Entry<String, RunnableC67311i.C67312a>> entrySet = this.f150890b.entrySet();
            C89219l.m154716b(entrySet, "");
            ArrayList arrayList = new ArrayList(C89070n.m154526a(entrySet, 10));
            Iterator<T> it = entrySet.iterator();
            while (it.hasNext()) {
                Object value = it.next().getValue();
                C89219l.m154716b(value, "");
                arrayList.add((RunnableC67311i.C67312a) value);
            }
            ArrayList arrayList2 = arrayList;
            MethodCollector.m26664o(7307);
            return arrayList2;
        }
        RunnableC67311i.C67312a aVar = this.f150890b.get(str);
        RunnableC67311i.C67312a aVar2 = this.f150891c;
        if (aVar == null) {
            if (aVar2 != null) {
                m119280a(str, aVar2);
                List<RunnableC67311i.C67312a> a = C89070n.m154516a(aVar2);
                MethodCollector.m26664o(7307);
                return a;
            }
            C89086z zVar = C89086z.INSTANCE;
            MethodCollector.m26664o(7307);
            return zVar;
        } else if (!(aVar.f150840b instanceof AbstractC72685x.C72686a) || aVar2 == null) {
            List<RunnableC67311i.C67312a> a2 = C89070n.m154516a(aVar);
            MethodCollector.m26664o(7307);
            return a2;
        } else {
            m119280a(str, aVar2);
            List<RunnableC67311i.C67312a> a3 = C89070n.m154516a(aVar2);
            MethodCollector.m26664o(7307);
            return a3;
        }
    }

    /* renamed from: a */
    public final synchronized boolean mo106181a(RunnableC67311i.C67312a aVar) {
        MethodCollector.m26663i(6710);
        C89219l.m154721d(aVar, "");
        if (m119281b()) {
            C67296h.m119240b("RunningTaskFull startNewFailed cancelLast:" + this.f150895g);
            if (this.f150895g) {
                Collection<RunnableC67311i.C67312a> values = this.f150890b.values();
                C89219l.m154716b(values, "");
                ArrayList<RunnableC67311i.C67312a> arrayList = new ArrayList();
                for (T t : values) {
                    if (!(t.f150840b instanceof AbstractC72685x.C72686a)) {
                        arrayList.add(t);
                    }
                }
                for (RunnableC67311i.C67312a aVar2 : arrayList) {
                    RunnableC67311i iVar = aVar2.f150843e;
                    if (iVar != null) {
                        iVar.mo106147b();
                    }
                }
            } else {
                MethodCollector.m26664o(6710);
                return false;
            }
        }
        this.f150890b.put(aVar.f150839a, aVar);
        this.f150891c = aVar;
        MethodCollector.m26664o(6710);
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.scheduler.l$a */
    public static final class C67335a<T> implements Comparator {
        static {
            Covode.recordClassIndex(78958);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C89090a.m154604a(Long.valueOf(t.f150842d), Long.valueOf(t2.f150842d));
        }
    }

    /* renamed from: a */
    private static void m119280a(String str, RunnableC67311i.C67312a aVar) {
        String str2;
        StringBuilder append = new StringBuilder("PublishScheduler | RedirectRecord oldId:").append(str).append(" newId:");
        if (aVar != null) {
            str2 = aVar.f150839a;
        } else {
            str2 = null;
        }
        C73991bj.m130128a(append.append(str2).toString());
    }

    /* renamed from: a */
    public final synchronized RunnableC67311i.C67312a mo106179a(String str, C72678q qVar, AbstractC67333k kVar) {
        MethodCollector.m26663i(7159);
        C89219l.m154721d(str, "");
        C89219l.m154721d(qVar, "");
        if (kVar == null) {
            kVar = this.f150889a;
        }
        RunnableC67311i.C67312a a = mo106178a(str);
        if (a != null) {
            if (kVar.mo106120a(qVar, a.f150844f)) {
                MethodCollector.m26664o(7159);
                return a;
            }
            C73991bj.m130128a("PublishScheduler | Find unequal creationId src:" + qVar.f162929b + " result:" + a.f150844f.f162929b);
        }
        MethodCollector.m26664o(7159);
        return null;
    }

    public C67334l(int i, int i2, boolean z, boolean z2) {
        this.f150892d = i;
        this.f150893e = i2;
        this.f150894f = z;
        this.f150895g = z2;
        this.f150889a = new C67288b(z);
    }
}
