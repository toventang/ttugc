package androidx.work.impl;

import android.content.Context;
import android.os.Build;
import androidx.work.AbstractC1599f;
import androidx.work.AbstractC1600g;
import androidx.work.AbstractC1718k;
import androidx.work.C1591b;
import androidx.work.C1597e;
import androidx.work.C1603i;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.p073b.AbstractC1634b;
import androidx.work.impl.p073b.AbstractC1645h;
import androidx.work.impl.p073b.AbstractC1657k;
import androidx.work.impl.p073b.C1642g;
import androidx.work.impl.utils.C1706b;
import androidx.work.impl.utils.p075a.C1705c;
import androidx.work.impl.utils.p076b.AbstractC1707a;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* renamed from: androidx.work.impl.h */
public final class RunnableC1689h implements Runnable {

    /* renamed from: a */
    static final String f5441a = AbstractC1600g.m5318a("WorkerWrapper");

    /* renamed from: b */
    C1642g f5442b;

    /* renamed from: c */
    ListenableWorker f5443c;

    /* renamed from: d */
    ListenableWorker.AbstractC1584a f5444d = new ListenableWorker.AbstractC1584a.C1585a();

    /* renamed from: e */
    public C1705c<Boolean> f5445e = new C1705c<>();

    /* renamed from: f */
    AbstractFutureC27655q<ListenableWorker.AbstractC1584a> f5446f = null;

    /* renamed from: g */
    volatile boolean f5447g;

    /* renamed from: h */
    private Context f5448h;

    /* renamed from: i */
    private String f5449i;

    /* renamed from: j */
    private List<AbstractC1680c> f5450j;

    /* renamed from: k */
    private WorkerParameters.C1589a f5451k;

    /* renamed from: l */
    private C1591b f5452l;

    /* renamed from: m */
    private AbstractC1707a f5453m;

    /* renamed from: n */
    private WorkDatabase f5454n;

    /* renamed from: o */
    private AbstractC1645h f5455o;

    /* renamed from: p */
    private AbstractC1634b f5456p;

    /* renamed from: q */
    private AbstractC1657k f5457q;

    /* renamed from: r */
    private List<String> f5458r;

    /* renamed from: s */
    private String f5459s;

    static {
        Covode.recordClassIndex(1854);
    }

    /* renamed from: c */
    private void m5543c() {
        C1603i.EnumC1604a d = this.f5455o.mo5439d(this.f5449i);
        if (d == C1603i.EnumC1604a.RUNNING) {
            AbstractC1600g.m5317a();
            C1764a.m5928a("Status for %s is RUNNING;not doing any work and rescheduling for later execution", new Object[]{this.f5449i});
            m5542a(true);
            return;
        }
        AbstractC1600g.m5317a();
        C1764a.m5928a("Status for %s is %s; not doing any work", new Object[]{this.f5449i, d});
        m5542a(false);
    }

    /* renamed from: d */
    private boolean m5544d() {
        this.f5454n.mo5091e();
        try {
            boolean z = true;
            if (this.f5455o.mo5439d(this.f5449i) == C1603i.EnumC1604a.ENQUEUED) {
                this.f5455o.mo5428a(C1603i.EnumC1604a.RUNNING, this.f5449i);
                this.f5455o.mo5435b(this.f5449i);
            } else {
                z = false;
            }
            this.f5454n.mo5093g();
            return z;
        } finally {
            this.f5454n.mo5092f();
        }
    }

    /* renamed from: e */
    private void m5545e() {
        this.f5454n.mo5091e();
        try {
            m5541a(this.f5449i);
            this.f5455o.mo5433a(this.f5449i, ((ListenableWorker.AbstractC1584a.C1585a) this.f5444d).f5175a);
            this.f5454n.mo5093g();
        } finally {
            this.f5454n.mo5092f();
            m5542a(false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo5473b() {
        boolean z = false;
        if (!this.f5447g) {
            return false;
        }
        AbstractC1600g.m5317a();
        C1764a.m5928a("Work interrupted for %s", new Object[]{this.f5459s});
        C1603i.EnumC1604a d = this.f5455o.mo5439d(this.f5449i);
        if (d != null && !d.isFinished()) {
            z = true;
        }
        m5542a(z);
        return true;
    }

    /* renamed from: f */
    private void m5546f() {
        this.f5454n.mo5091e();
        try {
            this.f5455o.mo5428a(C1603i.EnumC1604a.ENQUEUED, this.f5449i);
            this.f5455o.mo5432a(this.f5449i, System.currentTimeMillis());
            if (Build.VERSION.SDK_INT < 23) {
                this.f5455o.mo5436b(this.f5449i, -1);
            }
            this.f5454n.mo5093g();
        } finally {
            this.f5454n.mo5092f();
            m5542a(true);
        }
    }

    /* renamed from: g */
    private void m5547g() {
        this.f5454n.mo5091e();
        try {
            this.f5455o.mo5432a(this.f5449i, System.currentTimeMillis());
            this.f5455o.mo5428a(C1603i.EnumC1604a.ENQUEUED, this.f5449i);
            this.f5455o.mo5437c(this.f5449i);
            if (Build.VERSION.SDK_INT < 23) {
                this.f5455o.mo5436b(this.f5449i, -1);
            }
            this.f5454n.mo5093g();
        } finally {
            this.f5454n.mo5092f();
            m5542a(false);
        }
    }

    /* renamed from: h */
    private void m5548h() {
        this.f5454n.mo5091e();
        try {
            this.f5455o.mo5428a(C1603i.EnumC1604a.SUCCEEDED, this.f5449i);
            this.f5455o.mo5433a(this.f5449i, ((ListenableWorker.AbstractC1584a.C1587c) this.f5444d).f5176a);
            long currentTimeMillis = System.currentTimeMillis();
            for (String str : this.f5456p.mo5413b(this.f5449i)) {
                if (this.f5455o.mo5439d(str) == C1603i.EnumC1604a.BLOCKED && this.f5456p.mo5412a(str)) {
                    AbstractC1600g.m5317a();
                    C1764a.m5928a("Setting status to enqueued for %s", new Object[]{str});
                    this.f5455o.mo5428a(C1603i.EnumC1604a.ENQUEUED, str);
                    this.f5455o.mo5432a(str, currentTimeMillis);
                }
            }
            this.f5454n.mo5093g();
        } finally {
            this.f5454n.mo5092f();
            m5542a(false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo5472a() {
        if (this.f5453m.mo5504b() == Thread.currentThread()) {
            boolean z = false;
            if (!mo5473b()) {
                try {
                    this.f5454n.mo5091e();
                    C1603i.EnumC1604a d = this.f5455o.mo5439d(this.f5449i);
                    if (d == null) {
                        m5542a(false);
                        z = true;
                    } else if (d == C1603i.EnumC1604a.RUNNING) {
                        ListenableWorker.AbstractC1584a aVar = this.f5444d;
                        if (aVar instanceof ListenableWorker.AbstractC1584a.C1587c) {
                            AbstractC1600g.m5317a();
                            C1764a.m5928a("Worker result SUCCESS for %s", new Object[]{this.f5459s});
                            if (this.f5442b.mo5419a()) {
                                m5547g();
                            } else {
                                m5548h();
                            }
                        } else if (aVar instanceof ListenableWorker.AbstractC1584a.C1586b) {
                            AbstractC1600g.m5317a();
                            C1764a.m5928a("Worker result RETRY for %s", new Object[]{this.f5459s});
                            m5546f();
                        } else {
                            AbstractC1600g.m5317a();
                            C1764a.m5928a("Worker result FAILURE for %s", new Object[]{this.f5459s});
                            if (this.f5442b.mo5419a()) {
                                m5547g();
                            } else {
                                m5545e();
                            }
                        }
                        z = this.f5455o.mo5439d(this.f5449i).isFinished();
                    } else if (!d.isFinished()) {
                        m5546f();
                    }
                    this.f5454n.mo5093g();
                } finally {
                    this.f5454n.mo5092f();
                }
            }
            List<AbstractC1680c> list = this.f5450j;
            if (list != null) {
                if (z) {
                    for (AbstractC1680c cVar : list) {
                        cVar.mo5443a(this.f5449i);
                    }
                }
                C1681d.m5529a(this.f5452l, this.f5454n, this.f5450j);
                return;
            }
            return;
        }
        throw new IllegalStateException("Needs to be executed on the Background executor thread.");
    }

    public final void run() {
        C1597e a;
        List<String> a2 = this.f5457q.mo5442a(this.f5449i);
        this.f5458r = a2;
        StringBuilder append = new StringBuilder("Work [ id=").append(this.f5449i).append(", tags={ ");
        boolean z = true;
        for (String str : a2) {
            if (z) {
                z = false;
            } else {
                append.append(", ");
            }
            append.append(str);
        }
        append.append(" } ]");
        this.f5459s = append.toString();
        if (!mo5473b()) {
            this.f5454n.mo5091e();
            try {
                C1642g a3 = this.f5455o.mo5429a(this.f5449i);
                this.f5442b = a3;
                if (a3 == null) {
                    AbstractC1600g.m5317a();
                    C1764a.m5928a("Didn't find WorkSpec for id %s", new Object[]{this.f5449i});
                    m5542a(false);
                } else if (a3.f5307b != C1603i.EnumC1604a.ENQUEUED) {
                    m5543c();
                    this.f5454n.mo5093g();
                    AbstractC1600g.m5317a();
                    C1764a.m5928a("%s is not in ENQUEUED state. Nothing more to do.", new Object[]{this.f5442b.f5308c});
                    this.f5454n.mo5092f();
                } else {
                    if (this.f5442b.mo5419a() || this.f5442b.mo5420b()) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if ((Build.VERSION.SDK_INT >= 23 || this.f5442b.f5313h == this.f5442b.f5314i || this.f5442b.f5319n != 0) && currentTimeMillis < this.f5442b.mo5421c()) {
                            AbstractC1600g.m5317a();
                            C1764a.m5928a("Delaying execution for %s because it is being executed before schedule.", new Object[]{this.f5442b.f5308c});
                            m5542a(true);
                            this.f5454n.mo5092f();
                            return;
                        }
                    }
                    this.f5454n.mo5093g();
                    this.f5454n.mo5092f();
                    if (this.f5442b.mo5419a()) {
                        a = this.f5442b.f5310e;
                    } else {
                        AbstractC1599f a4 = AbstractC1599f.m5315a(this.f5442b.f5309d);
                        if (a4 == null) {
                            AbstractC1600g.m5317a();
                            C1764a.m5928a("Could not create Input Merger %s", new Object[]{this.f5442b.f5309d});
                            m5545e();
                            return;
                        }
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(this.f5442b.f5310e);
                        arrayList.addAll(this.f5455o.mo5441e(this.f5449i));
                        a = a4.mo5334a(arrayList);
                    }
                    WorkerParameters workerParameters = new WorkerParameters(UUID.fromString(this.f5449i), a, this.f5458r, this.f5451k, this.f5442b.f5316k, this.f5452l.f5191a, this.f5453m, this.f5452l.f5192b);
                    if (this.f5443c == null) {
                        this.f5443c = AbstractC1718k.m5622a(this.f5448h, this.f5442b.f5308c, workerParameters);
                    }
                    ListenableWorker listenableWorker = this.f5443c;
                    if (listenableWorker == null) {
                        AbstractC1600g.m5317a();
                        C1764a.m5928a("Could not create Worker %s", new Object[]{this.f5442b.f5308c});
                        m5545e();
                    } else if (listenableWorker.f5174d) {
                        AbstractC1600g.m5317a();
                        C1764a.m5928a("Received an already-used Worker %s; WorkerFactory should return new instances", new Object[]{this.f5442b.f5308c});
                        m5545e();
                    } else {
                        this.f5443c.f5174d = true;
                        if (!m5544d()) {
                            m5543c();
                        } else if (!mo5473b()) {
                            final C1705c cVar = new C1705c();
                            this.f5453m.mo5502a().execute(new Runnable() {
                                /* class androidx.work.impl.RunnableC1689h.RunnableC16901 */

                                static {
                                    Covode.recordClassIndex(1855);
                                }

                                public final void run() {
                                    try {
                                        AbstractC1600g.m5317a();
                                        C1764a.m5928a("Starting work for %s", new Object[]{RunnableC1689h.this.f5442b.f5308c});
                                        RunnableC1689h hVar = RunnableC1689h.this;
                                        hVar.f5446f = hVar.f5443c.mo5335a();
                                        cVar.mo5482a((AbstractFutureC27655q) RunnableC1689h.this.f5446f);
                                    } catch (Throwable th) {
                                        cVar.mo5484a(th);
                                    }
                                }
                            });
                            final String str2 = this.f5459s;
                            cVar.mo5481a(new Runnable() {
                                /* class androidx.work.impl.RunnableC1689h.RunnableC16912 */

                                static {
                                    Covode.recordClassIndex(1856);
                                }

                                public final void run() {
                                    try {
                                        ListenableWorker.AbstractC1584a aVar = (ListenableWorker.AbstractC1584a) cVar.get();
                                        if (aVar == null) {
                                            AbstractC1600g.m5317a();
                                            C1764a.m5928a("%s returned a null result. Treating it as a failure.", new Object[]{RunnableC1689h.this.f5442b.f5308c});
                                        } else {
                                            AbstractC1600g.m5317a();
                                            C1764a.m5928a("%s returned a %s result.", new Object[]{RunnableC1689h.this.f5442b.f5308c, aVar});
                                            RunnableC1689h.this.f5444d = aVar;
                                        }
                                    } catch (CancellationException e) {
                                        AbstractC1600g.m5317a();
                                        C1764a.m5928a("%s was cancelled", new Object[]{str2});
                                        new Throwable[1][0] = e;
                                    } catch (InterruptedException | ExecutionException e2) {
                                        AbstractC1600g.m5317a();
                                        C1764a.m5928a("%s failed because it threw an exception/error", new Object[]{str2});
                                        new Throwable[1][0] = e2;
                                    } catch (Throwable th) {
                                        RunnableC1689h.this.mo5472a();
                                        throw th;
                                    }
                                    RunnableC1689h.this.mo5472a();
                                }
                            }, this.f5453m.mo5505c());
                        }
                    }
                }
            } finally {
                this.f5454n.mo5092f();
            }
        }
    }

    /* renamed from: a */
    private void m5541a(String str) {
        for (String str2 : this.f5456p.mo5413b(str)) {
            m5541a(str2);
        }
        if (this.f5455o.mo5439d(str) != C1603i.EnumC1604a.CANCELLED) {
            this.f5455o.mo5428a(C1603i.EnumC1604a.FAILED, str);
        }
    }

    RunnableC1689h(C1692a aVar) {
        this.f5448h = aVar.f5465a;
        this.f5453m = aVar.f5467c;
        this.f5449i = aVar.f5470f;
        this.f5450j = aVar.f5471g;
        this.f5451k = aVar.f5472h;
        this.f5443c = aVar.f5466b;
        this.f5452l = aVar.f5468d;
        WorkDatabase workDatabase = aVar.f5469e;
        this.f5454n = workDatabase;
        this.f5455o = workDatabase.mo5366i();
        this.f5456p = this.f5454n.mo5367j();
        this.f5457q = this.f5454n.mo5368k();
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    private void m5542a(boolean z) {
        try {
            this.f5454n.mo5091e();
            if (this.f5454n.mo5366i().mo5430a().isEmpty()) {
                C1706b.m5599a(this.f5448h, RescheduleReceiver.class, false);
            }
            this.f5454n.mo5093g();
            this.f5454n.mo5092f();
            this.f5445e.mo5483a(Boolean.valueOf(z));
        } catch (Throwable th) {
            this.f5454n.mo5092f();
            throw th;
        }
    }

    /* renamed from: androidx.work.impl.h$a */
    public static class C1692a {

        /* renamed from: a */
        Context f5465a;

        /* renamed from: b */
        ListenableWorker f5466b;

        /* renamed from: c */
        AbstractC1707a f5467c;

        /* renamed from: d */
        C1591b f5468d;

        /* renamed from: e */
        WorkDatabase f5469e;

        /* renamed from: f */
        String f5470f;

        /* renamed from: g */
        List<AbstractC1680c> f5471g;

        /* renamed from: h */
        WorkerParameters.C1589a f5472h = new WorkerParameters.C1589a();

        static {
            Covode.recordClassIndex(1857);
        }

        public C1692a(Context context, C1591b bVar, AbstractC1707a aVar, WorkDatabase workDatabase, String str) {
            Context applicationContext = context.getApplicationContext();
            if (C58003a.f132201c && applicationContext == null) {
                applicationContext = C58003a.f132199a;
            }
            this.f5465a = applicationContext;
            this.f5467c = aVar;
            this.f5468d = bVar;
            this.f5469e = workDatabase;
            this.f5470f = str;
        }
    }
}
