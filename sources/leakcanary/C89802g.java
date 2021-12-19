package leakcanary;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.lang.ref.ReferenceQueue;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;
import p4645m.C89863a;

/* renamed from: leakcanary.g */
public final class C89802g {

    /* renamed from: a */
    private final Set<AbstractC89804h> f203645a = new LinkedHashSet();

    /* renamed from: b */
    private final Map<String, KeyedWeakReference> f203646b = new LinkedHashMap();

    /* renamed from: c */
    private final ReferenceQueue<Object> f203647c = new ReferenceQueue<>();

    /* renamed from: d */
    private final AbstractC89794b f203648d;

    /* renamed from: e */
    private final Executor f203649e;

    /* renamed from: f */
    private final AbstractC89171a<Boolean> f203650f;

    static {
        Covode.recordClassIndex(105897);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: leakcanary.g$a */
    public static final class RunnableC89803a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C89802g f203651a;

        /* renamed from: b */
        final /* synthetic */ String f203652b;

        static {
            Covode.recordClassIndex(105898);
        }

        RunnableC89803a(C89802g gVar, String str) {
            this.f203651a = gVar;
            this.f203652b = str;
        }

        public final void run() {
            this.f203651a.mo144367a(this.f203652b);
        }
    }

    /* renamed from: b */
    private final void m155898b() {
        while (true) {
            KeyedWeakReference keyedWeakReference = (KeyedWeakReference) this.f203647c.poll();
            if (keyedWeakReference != null) {
                this.f203646b.remove(keyedWeakReference.getKey());
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public final synchronized int mo144364a() {
        MethodCollector.m26663i(9934);
        m155898b();
        Map<String, KeyedWeakReference> map = this.f203646b;
        if (map.isEmpty()) {
            MethodCollector.m26664o(9934);
            return 0;
        }
        int i = 0;
        for (Map.Entry<String, KeyedWeakReference> entry : map.entrySet()) {
            if (entry.getValue().getRetainedUptimeMillis() != -1) {
                i++;
            }
        }
        MethodCollector.m26664o(9934);
        return i;
    }

    /* renamed from: a */
    public final synchronized void mo144366a(Object obj) {
        MethodCollector.m26663i(10254);
        C89219l.m154719c(obj, "");
        m155897a(obj, "");
        MethodCollector.m26664o(10254);
    }

    /* renamed from: a */
    public final synchronized void mo144367a(String str) {
        MethodCollector.m26663i(5468);
        m155898b();
        KeyedWeakReference keyedWeakReference = this.f203646b.get(str);
        if (keyedWeakReference != null) {
            keyedWeakReference.setRetainedUptimeMillis(this.f203648d.mo144358a());
            Iterator<T> it = this.f203645a.iterator();
            while (it.hasNext()) {
                it.next().onObjectRetained();
            }
        }
        MethodCollector.m26664o(5468);
    }

    /* renamed from: b */
    public final synchronized void mo144369b(Object obj) {
        MethodCollector.m26663i(10410);
        C89219l.m154719c(obj, "");
        Map<String, KeyedWeakReference> map = this.f203646b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, KeyedWeakReference> entry : map.entrySet()) {
            Object obj2 = entry.getValue().get();
            if (obj2 != null && C89219l.m154714a(obj2, obj)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (String str : linkedHashMap.keySet()) {
            this.f203646b.remove(str);
        }
        MethodCollector.m26664o(10410);
    }

    /* renamed from: a */
    public final synchronized void mo144365a(long j) {
        MethodCollector.m26663i(5466);
        Map<String, KeyedWeakReference> map = this.f203646b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, KeyedWeakReference> entry : map.entrySet()) {
            if (entry.getValue().getWatchUptimeMillis() <= j) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (KeyedWeakReference keyedWeakReference : linkedHashMap.values()) {
            keyedWeakReference.clear();
        }
        this.f203646b.keySet().removeAll(linkedHashMap.keySet());
        MethodCollector.m26664o(5466);
    }

    /* renamed from: a */
    public final synchronized void mo144368a(AbstractC89804h hVar) {
        MethodCollector.m26663i(9935);
        C89219l.m154719c(hVar, "");
        this.f203645a.add(hVar);
        MethodCollector.m26664o(9935);
    }

    /* renamed from: a */
    private synchronized void m155897a(Object obj, String str) {
        String str2;
        String str3;
        MethodCollector.m26663i(10408);
        C89219l.m154719c(obj, "");
        C89219l.m154719c(str, "");
        if (!this.f203650f.invoke().booleanValue()) {
            MethodCollector.m26664o(10408);
            return;
        }
        m155898b();
        String uuid = UUID.randomUUID().toString();
        C89219l.m154709a((Object) uuid, "");
        KeyedWeakReference keyedWeakReference = new KeyedWeakReference(obj, uuid, str, this.f203648d.mo144358a(), this.f203647c);
        C89863a.AbstractC89864a aVar = C89863a.f203762a;
        if (aVar != null) {
            StringBuilder sb = new StringBuilder("Watching ");
            if (obj instanceof Class) {
                str2 = obj.toString();
            } else {
                str2 = "instance of " + obj.getClass().getName();
            }
            StringBuilder append = sb.append(str2);
            if (str.length() > 0) {
                str3 = " named ".concat(String.valueOf(str));
            } else {
                str3 = "";
            }
            aVar.mo144406a(append.append(str3).append(" with key ").append(uuid).toString());
        }
        this.f203646b.put(uuid, keyedWeakReference);
        this.f203649e.execute(new RunnableC89803a(this, uuid));
        MethodCollector.m26664o(10408);
    }

    public C89802g(AbstractC89794b bVar, Executor executor, AbstractC89171a<Boolean> aVar) {
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(executor, "");
        C89219l.m154719c(aVar, "");
        this.f203648d = bVar;
        this.f203649e = executor;
        this.f203650f = aVar;
    }
}
