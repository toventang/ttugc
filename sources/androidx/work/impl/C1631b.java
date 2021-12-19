package androidx.work.impl;

import android.content.Context;
import androidx.work.AbstractC1600g;
import androidx.work.C1591b;
import androidx.work.WorkerParameters;
import androidx.work.impl.RunnableC1689h;
import androidx.work.impl.utils.p075a.C1705c;
import androidx.work.impl.utils.p076b.AbstractC1707a;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/* renamed from: androidx.work.impl.b */
public final class C1631b implements AbstractC1607a {

    /* renamed from: a */
    private static final String f5279a = AbstractC1600g.m5318a("Processor");

    /* renamed from: b */
    private Context f5280b;

    /* renamed from: c */
    private C1591b f5281c;

    /* renamed from: d */
    private AbstractC1707a f5282d;

    /* renamed from: e */
    private WorkDatabase f5283e;

    /* renamed from: f */
    private Map<String, RunnableC1689h> f5284f = new HashMap();

    /* renamed from: g */
    private List<AbstractC1680c> f5285g;

    /* renamed from: h */
    private Set<String> f5286h;

    /* renamed from: i */
    private final List<AbstractC1607a> f5287i;

    /* renamed from: j */
    private final Object f5288j;

    static {
        Covode.recordClassIndex(1787);
    }

    /* renamed from: androidx.work.impl.b$a */
    static class RunnableC1632a implements Runnable {

        /* renamed from: a */
        private AbstractC1607a f5289a;

        /* renamed from: b */
        private String f5290b;

        /* renamed from: c */
        private AbstractFutureC27655q<Boolean> f5291c;

        static {
            Covode.recordClassIndex(1788);
        }

        public final void run() {
            boolean z;
            try {
                z = this.f5291c.get().booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                z = true;
            }
            this.f5289a.mo5376a(this.f5290b, z);
        }

        RunnableC1632a(AbstractC1607a aVar, String str, AbstractFutureC27655q<Boolean> qVar) {
            this.f5289a = aVar;
            this.f5290b = str;
            this.f5291c = qVar;
        }
    }

    /* renamed from: a */
    public final void mo5405a(AbstractC1607a aVar) {
        synchronized (this.f5288j) {
            this.f5287i.add(aVar);
        }
    }

    /* renamed from: b */
    public final void mo5408b(AbstractC1607a aVar) {
        synchronized (this.f5288j) {
            this.f5287i.remove(aVar);
        }
    }

    /* renamed from: c */
    public final boolean mo5410c(String str) {
        boolean containsKey;
        synchronized (this.f5288j) {
            containsKey = this.f5284f.containsKey(str);
        }
        return containsKey;
    }

    /* renamed from: b */
    public final boolean mo5409b(String str) {
        boolean contains;
        synchronized (this.f5288j) {
            contains = this.f5286h.contains(str);
        }
        return contains;
    }

    /* renamed from: a */
    public final boolean mo5406a(String str) {
        synchronized (this.f5288j) {
            AbstractC1600g.m5317a();
            C1764a.m5928a("Processor stopping %s", new Object[]{str});
            RunnableC1689h remove = this.f5284f.remove(str);
            if (remove != null) {
                remove.f5447g = true;
                remove.mo5473b();
                if (remove.f5446f != null) {
                    remove.f5446f.cancel(true);
                }
                if (remove.f5443c != null) {
                    remove.f5443c.mo5336b();
                }
                AbstractC1600g.m5317a();
                C1764a.m5928a("WorkerWrapper stopped for %s", new Object[]{str});
                return true;
            }
            AbstractC1600g.m5317a();
            C1764a.m5928a("WorkerWrapper could not be found for %s", new Object[]{str});
            return false;
        }
    }

    @Override // androidx.work.impl.AbstractC1607a
    /* renamed from: a */
    public final void mo5376a(String str, boolean z) {
        synchronized (this.f5288j) {
            this.f5284f.remove(str);
            AbstractC1600g.m5317a();
            C1764a.m5928a("%s %s executed; reschedule = %s", new Object[]{getClass().getSimpleName(), str, Boolean.valueOf(z)});
            for (AbstractC1607a aVar : this.f5287i) {
                aVar.mo5376a(str, z);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo5407a(String str, WorkerParameters.C1589a aVar) {
        synchronized (this.f5288j) {
            if (this.f5284f.containsKey(str)) {
                AbstractC1600g.m5317a();
                C1764a.m5928a("Work %s is already enqueued for processing", new Object[]{str});
                return false;
            }
            RunnableC1689h.C1692a aVar2 = new RunnableC1689h.C1692a(this.f5280b, this.f5281c, this.f5282d, this.f5283e, str);
            aVar2.f5471g = this.f5285g;
            if (aVar != null) {
                aVar2.f5472h = aVar;
            }
            RunnableC1689h hVar = new RunnableC1689h(aVar2);
            C1705c<Boolean> cVar = hVar.f5445e;
            cVar.mo5481a(new RunnableC1632a(this, str, cVar), this.f5282d.mo5502a());
            this.f5284f.put(str, hVar);
            this.f5282d.mo5505c().execute(hVar);
            AbstractC1600g.m5317a();
            C1764a.m5928a("%s: processing %s", new Object[]{getClass().getSimpleName(), str});
            return true;
        }
    }

    public C1631b(Context context, C1591b bVar, AbstractC1707a aVar, WorkDatabase workDatabase, List<AbstractC1680c> list) {
        this.f5280b = context;
        this.f5281c = bVar;
        this.f5282d = aVar;
        this.f5283e = workDatabase;
        this.f5285g = list;
        this.f5286h = new HashSet();
        this.f5287i = new ArrayList();
        this.f5288j = new Object();
    }
}
