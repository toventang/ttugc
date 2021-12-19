package okhttp3;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.C90022aa;
import okhttp3.internal.C90084c;

/* renamed from: okhttp3.n */
public final class C90188n {

    /* renamed from: b */
    static final /* synthetic */ boolean f204835b = true;

    /* renamed from: a */
    final Deque<C90022aa.C90024a> f204836a = new ArrayDeque();

    /* renamed from: c */
    private int f204837c = 64;

    /* renamed from: d */
    private int f204838d = 5;

    /* renamed from: e */
    private Runnable f204839e;

    /* renamed from: f */
    private ExecutorService f204840f;

    /* renamed from: g */
    private final Deque<C90022aa.C90024a> f204841g = new ArrayDeque();

    /* renamed from: h */
    private final Deque<C90022aa> f204842h = new ArrayDeque();

    static {
        Covode.recordClassIndex(106361);
    }

    public C90188n() {
    }

    /* renamed from: e */
    private synchronized int m156751e() {
        int size;
        MethodCollector.m26663i(6014);
        size = this.f204841g.size() + this.f204842h.size();
        MethodCollector.m26664o(6014);
        return size;
    }

    /* renamed from: c */
    public final synchronized List<AbstractC90049e> mo145017c() {
        List<AbstractC90049e> unmodifiableList;
        MethodCollector.m26663i(6012);
        ArrayList arrayList = new ArrayList();
        for (C90022aa.C90024a aVar : this.f204836a) {
            arrayList.add(C90022aa.this);
        }
        unmodifiableList = Collections.unmodifiableList(arrayList);
        MethodCollector.m26664o(6012);
        return unmodifiableList;
    }

    /* renamed from: d */
    public final synchronized List<AbstractC90049e> mo145018d() {
        List<AbstractC90049e> unmodifiableList;
        MethodCollector.m26663i(6013);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f204842h);
        for (C90022aa.C90024a aVar : this.f204841g) {
            arrayList.add(C90022aa.this);
        }
        unmodifiableList = Collections.unmodifiableList(arrayList);
        MethodCollector.m26664o(6013);
        return unmodifiableList;
    }

    /* renamed from: a */
    public final synchronized ExecutorService mo145012a() {
        ExecutorService executorService;
        MethodCollector.m26663i(5731);
        if (this.f204840f == null) {
            this.f204840f = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), C90084c.m156412a("OkHttp Dispatcher", false));
        }
        executorService = this.f204840f;
        MethodCollector.m26664o(5731);
        return executorService;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo145016b() {
        int i;
        boolean z;
        MethodCollector.m26663i(5733);
        if (f204835b || !Thread.holdsLock(this)) {
            ArrayList arrayList = new ArrayList();
            synchronized (this) {
                try {
                    Iterator<C90022aa.C90024a> it = this.f204836a.iterator();
                    while (it.hasNext()) {
                        C90022aa.C90024a next = it.next();
                        if (this.f204841g.size() >= this.f204837c) {
                            break;
                        } else if (m156750b(next) < this.f204838d) {
                            it.remove();
                            arrayList.add(next);
                            this.f204841g.add(next);
                        }
                    }
                    if (m156751e() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                } finally {
                    MethodCollector.m26664o(5733);
                }
            }
            int size = arrayList.size();
            for (i = 0; i < size; i++) {
                C90022aa.C90024a aVar = (C90022aa.C90024a) arrayList.get(i);
                ExecutorService a = mo145012a();
                if (C90022aa.C90024a.f204094b || !Thread.holdsLock(C90022aa.this.f204086a.f204905c)) {
                    try {
                        a.execute(aVar);
                    } catch (RejectedExecutionException e) {
                        InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                        interruptedIOException.initCause(e);
                        C90022aa.this.f204089d.callFailed(C90022aa.this, interruptedIOException);
                        aVar.f204095a.onFailure(C90022aa.this, interruptedIOException);
                        C90022aa.this.f204086a.f204905c.mo145013a(aVar);
                    } catch (Throwable th) {
                        C90022aa.this.f204086a.f204905c.mo145013a(aVar);
                        MethodCollector.m26664o(5733);
                        throw th;
                    }
                } else {
                    AssertionError assertionError = new AssertionError();
                    MethodCollector.m26664o(5733);
                    throw assertionError;
                }
            }
            return z;
        }
        AssertionError assertionError2 = new AssertionError();
        MethodCollector.m26664o(5733);
        throw assertionError2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo145013a(C90022aa.C90024a aVar) {
        m156749a(this.f204841g, aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo145015b(C90022aa aaVar) {
        m156749a(this.f204842h, aaVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo145014a(C90022aa aaVar) {
        MethodCollector.m26663i(5735);
        this.f204842h.add(aaVar);
        MethodCollector.m26664o(5735);
    }

    public C90188n(ExecutorService executorService) {
        this.f204840f = executorService;
    }

    /* renamed from: b */
    private int m156750b(C90022aa.C90024a aVar) {
        int i = 0;
        for (C90022aa.C90024a aVar2 : this.f204841g) {
            if (!C90022aa.this.f204091f && aVar2.mo144716a().equals(aVar.mo144716a())) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: a */
    private <T> void m156749a(Deque<T> deque, T t) {
        Runnable runnable;
        MethodCollector.m26663i(5871);
        synchronized (this) {
            try {
                if (deque.remove(t)) {
                    runnable = this.f204839e;
                } else {
                    AssertionError assertionError = new AssertionError("Call wasn't in-flight!");
                    MethodCollector.m26664o(5871);
                    throw assertionError;
                }
            } finally {
                MethodCollector.m26664o(5871);
            }
        }
        if (!mo145016b() && runnable != null) {
            runnable.run();
        }
    }
}
