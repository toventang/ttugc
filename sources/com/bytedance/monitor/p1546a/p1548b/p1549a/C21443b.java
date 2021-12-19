package com.bytedance.monitor.p1546a.p1548b.p1549a;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.monitor.p1546a.p1548b.AbstractC21453f;
import com.bytedance.monitor.p1546a.p1548b.AbstractRunnableC21452e;
import com.bytedance.monitor.p1546a.p1548b.C21448c;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.monitor.a.b.a.b */
public final class C21443b extends ScheduledThreadPoolExecutor implements AbstractC21446c {

    /* renamed from: a */
    public boolean f50839a;

    /* renamed from: b */
    public AbstractC21453f f50840b;

    /* renamed from: c */
    public ExecutorService f50841c;

    /* renamed from: d */
    public ThreadPoolExecutor f50842d;

    /* renamed from: e */
    public int f50843e;

    /* renamed from: f */
    private final Map<Integer, List<ScheduledFuture<?>>> f50844f = new ConcurrentHashMap();

    /* renamed from: g */
    private final Map<ScheduledFuture<?>, Pair<Integer, Boolean>> f50845g = new ConcurrentHashMap();

    /* renamed from: h */
    private C21445a f50846h;

    static {
        Covode.recordClassIndex(25066);
    }

    /* access modifiers changed from: protected */
    public final void terminated() {
        super.terminated();
    }

    /* renamed from: a */
    public final boolean mo35045a() {
        AbstractC21453f fVar;
        return this.f50839a && (fVar = this.f50840b) != null && fVar.mo35056a();
    }

    /* renamed from: b */
    private boolean m40264b() {
        if (this.f50843e > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: com.bytedance.monitor.a.b.a.b$a */
    public class C21445a {

        /* renamed from: a */
        public Runnable f50849a;

        /* renamed from: b */
        public Thread f50850b;

        /* renamed from: c */
        public long f50851c = System.currentTimeMillis();

        /* renamed from: d */
        public int f50852d;

        static {
            Covode.recordClassIndex(25068);
        }

        /* renamed from: a */
        public final boolean mo35053a() {
            if (System.currentTimeMillis() - this.f50851c > ((long) this.f50852d)) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public final void mo35054b() {
            Runnable runnable = this.f50849a;
            if (runnable != null && (runnable instanceof FutureTask)) {
                boolean cancel = ((FutureTask) runnable).cancel(true);
                if (C21443b.this.mo35045a()) {
                    C21443b.this.mo35044a("TimeSensitive + mCancelOverTimeTaskRunnable run ------------ cancel FutureTask, canceled?".concat(String.valueOf(cancel)));
                }
            }
        }

        public C21445a(Runnable runnable, Thread thread, int i) {
            this.f50849a = runnable;
            this.f50850b = thread;
            this.f50852d = i;
        }
    }

    /* renamed from: c */
    private void m40265c() {
        C21445a aVar = this.f50846h;
        if (aVar != null && aVar.mo35053a()) {
            this.f50846h.mo35054b();
            this.f50846h = null;
        }
    }

    /* renamed from: a */
    public final void mo35044a(String str) {
        C21448c.m40282a(this.f50840b, str);
    }

    public C21443b(ThreadFactory threadFactory) {
        super(1, threadFactory);
    }

    /* renamed from: a */
    private static String m40260a(Runnable runnable) {
        if (runnable instanceof AbstractRunnableC21452e) {
            return ((AbstractRunnableC21452e) runnable).mo20277a();
        }
        if (runnable == null) {
            return "null";
        }
        return runnable.toString();
    }

    @Override // com.bytedance.monitor.p1546a.p1548b.p1549a.AbstractC21446c
    /* renamed from: b */
    public final void mo35040b(AbstractRunnableC21452e eVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f50842d;
        if (threadPoolExecutor != null) {
            threadPoolExecutor.remove(eVar);
        }
        if (!m40266c(eVar) && mo35045a()) {
            mo35044a("z-debug-removeTask " + C21448c.m40281a(eVar) + ", remove failed");
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.ExecutorService
    public final Future<?> submit(Runnable runnable) {
        if (this.f50841c == null) {
            return super.submit(runnable);
        }
        if (mo35045a()) {
            mo35044a("submit task to outer-executor: " + m40260a(runnable));
        }
        return this.f50841c.submit(runnable);
    }

    /* renamed from: c */
    private boolean m40266c(AbstractRunnableC21452e eVar) {
        boolean z;
        boolean z2 = false;
        if (eVar == null) {
            return false;
        }
        int hashCode = eVar.hashCode();
        List<ScheduledFuture<?>> list = this.f50844f.get(Integer.valueOf(hashCode));
        StringBuilder sb = new StringBuilder("z-debug scheduledFutures in ?");
        if (list != null) {
            z = true;
        } else {
            z = false;
        }
        mo35044a(sb.append(z).toString());
        if (list != null && !list.isEmpty()) {
            if (mo35045a()) {
                mo35044a("z-debug-removeTask from mTaskFutureMap" + C21448c.m40281a(eVar));
                mo35044a("z-debug scheduledFutures size:" + list.size());
            }
            for (ScheduledFuture<?> scheduledFuture : list) {
                if (!scheduledFuture.isCancelled()) {
                    if (scheduledFuture.cancel(true)) {
                        z2 = true;
                    }
                    m40261a(Integer.valueOf(hashCode), scheduledFuture);
                }
            }
        }
        return z2;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Callable<T> callable) {
        if (this.f50841c == null) {
            return super.submit(callable);
        }
        if (mo35045a()) {
            mo35044a("submit task to outer-executor: ".concat(String.valueOf(callable)));
        }
        return this.f50841c.submit(callable);
    }

    @Override // com.bytedance.monitor.p1546a.p1548b.p1549a.AbstractC21446c
    /* renamed from: a */
    public final void mo35034a(AbstractRunnableC21452e eVar) {
        if (mo35045a()) {
            mo35044a("post " + C21448c.m40281a(eVar));
        }
        submit(eVar);
        m40265c();
        if (this.f50841c == null && mo35045a()) {
            mo35044a("current task count: " + getQueue().size());
        }
    }

    /* access modifiers changed from: protected */
    public final void beforeExecute(Thread thread, Runnable runnable) {
        m40263a(true, runnable, thread);
        super.beforeExecute(thread, runnable);
    }

    /* renamed from: a */
    private void m40261a(Integer num, ScheduledFuture scheduledFuture) {
        boolean z;
        List<ScheduledFuture<?>> list = this.f50844f.get(num);
        if (list != null) {
            z = list.remove(scheduledFuture);
            if (list.isEmpty()) {
                this.f50844f.remove(num);
            }
        } else {
            z = false;
        }
        this.f50845g.remove(scheduledFuture);
        if (mo35045a()) {
            mo35044a("z-debug removeMapRecord: " + scheduledFuture + ", removed: " + z);
        }
    }

    /* access modifiers changed from: protected */
    public final void afterExecute(Runnable runnable, Throwable th) {
        ScheduledFuture scheduledFuture;
        Pair<Integer, Boolean> pair;
        super.afterExecute(runnable, th);
        m40263a(false, runnable, (Thread) null);
        if ((runnable instanceof ScheduledFuture) && (pair = this.f50845g.get((scheduledFuture = (ScheduledFuture) runnable))) != null && pair.first != null) {
            int intValue = ((Integer) pair.first).intValue();
            Boolean bool = (Boolean) pair.second;
            if (bool != null && !bool.booleanValue()) {
                if (mo35045a()) {
                    mo35044a("z-debug postDelay or scheduled task: " + runnable + ", taskHashCode: " + intValue + ", in map? " + this.f50844f.containsKey(Integer.valueOf(intValue)));
                }
                m40261a(Integer.valueOf(intValue), scheduledFuture);
            }
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Runnable runnable, T t) {
        if (this.f50841c == null) {
            return super.submit(runnable, t);
        }
        if (mo35045a()) {
            mo35044a("submit task to outer-executor: " + m40260a(runnable));
        }
        return this.f50841c.submit(runnable, t);
    }

    @Override // com.bytedance.monitor.p1546a.p1548b.p1549a.AbstractC21446c
    /* renamed from: a */
    public final void mo35035a(AbstractRunnableC21452e eVar, long j) {
        if (eVar != null) {
            if (mo35045a()) {
                mo35044a("postDelayed " + C21448c.m40281a(eVar));
            }
            m40262a(schedule(eVar, j, TimeUnit.MILLISECONDS), eVar.hashCode(), false);
            m40265c();
        }
    }

    /* renamed from: a */
    private void m40263a(boolean z, Runnable runnable, Thread thread) {
        if (m40264b()) {
            if (z) {
                this.f50846h = new C21445a(runnable, thread, this.f50843e);
            } else {
                this.f50846h = null;
            }
        }
    }

    /* renamed from: a */
    private void m40262a(ScheduledFuture<?> scheduledFuture, int i, boolean z) {
        List<ScheduledFuture<?>> list = this.f50844f.get(Integer.valueOf(i));
        if (list == null) {
            list = new CopyOnWriteArrayList<>();
            this.f50844f.put(Integer.valueOf(i), list);
        }
        list.add(scheduledFuture);
        this.f50845g.put(scheduledFuture, new Pair<>(Integer.valueOf(i), Boolean.valueOf(z)));
        if (mo35045a()) {
            mo35044a("z-debug saveToMap -current task count: " + getQueue().size() + ", thread-count; " + getActiveCount());
            mo35044a("z-debug saveToMap >>>>>> mTaskFutureMap size: " + this.f50844f.size() + ", mFutureTaskMap size: " + this.f50845g.size());
            mo35044a("z-debug saveToMap >>>>>> sameHashCodeFutures size: " + list.size());
        }
    }

    @Override // com.bytedance.monitor.p1546a.p1548b.p1549a.AbstractC21446c
    /* renamed from: a */
    public final void mo35036a(AbstractRunnableC21452e eVar, long j, long j2) {
        if (eVar != null) {
            if (mo35045a()) {
                mo35044a("scheduleWithFixedDelay " + C21448c.m40281a(eVar) + ", initialDelay: " + j + ", delayInMillis: " + j2 + "\n task count: " + getQueue().size());
            }
            m40266c(eVar);
            m40262a(scheduleWithFixedDelay(eVar, j, j2, TimeUnit.MILLISECONDS), eVar.hashCode(), true);
            m40265c();
        }
    }
}
