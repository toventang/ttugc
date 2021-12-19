package androidx.core.app;

import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.PowerManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: androidx.core.app.f */
public abstract class AbstractServiceC0583f extends Service {
    static final HashMap<ComponentName, AbstractC0592h> sClassWorkEnqueuer = new HashMap<>();
    static final Object sLock = new Object();
    final ArrayList<C0587d> mCompatQueue;
    AbstractC0592h mCompatWorkEnqueuer;
    AsyncTaskC0584a mCurProcessor;
    boolean mDestroyed;
    public boolean mInterruptIfStopped;
    AbstractC0585b mJobImpl;
    public boolean mStopped;

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.f$b */
    public interface AbstractC0585b {
        static {
            Covode.recordClassIndex(663);
        }

        /* renamed from: a */
        IBinder mo2584a();

        /* renamed from: b */
        AbstractC0588e mo2585b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.f$e */
    public interface AbstractC0588e {
        static {
            Covode.recordClassIndex(666);
        }

        /* renamed from: a */
        Intent mo2590a();

        /* renamed from: b */
        void mo2591b();
    }

    /* access modifiers changed from: protected */
    public abstract void onHandleWork(Intent intent);

    public boolean onStopCurrentWork() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.f$d */
    public final class C0587d implements AbstractC0588e {

        /* renamed from: a */
        final Intent f2465a;

        /* renamed from: b */
        final int f2466b;

        static {
            Covode.recordClassIndex(665);
        }

        @Override // androidx.core.app.AbstractServiceC0583f.AbstractC0588e
        /* renamed from: a */
        public final Intent mo2590a() {
            return this.f2465a;
        }

        @Override // androidx.core.app.AbstractServiceC0583f.AbstractC0588e
        /* renamed from: b */
        public final void mo2591b() {
            AbstractServiceC0583f.this.stopSelf(this.f2466b);
        }

        C0587d(Intent intent, int i) {
            this.f2465a = intent;
            this.f2466b = i;
        }
    }

    /* renamed from: androidx.core.app.f$f  reason: invalid class name */
    static final class jobJobServiceEngineC0589f extends JobServiceEngine implements AbstractC0585b {

        /* renamed from: a */
        final AbstractServiceC0583f f2468a;

        /* renamed from: b */
        final Object f2469b = new Object();

        /* renamed from: c */
        JobParameters f2470c;

        static {
            Covode.recordClassIndex(667);
        }

        /* renamed from: androidx.core.app.f$f$a */
        final class C0590a implements AbstractC0588e {

            /* renamed from: a */
            final JobWorkItem f2471a;

            static {
                Covode.recordClassIndex(668);
            }

            @Override // androidx.core.app.AbstractServiceC0583f.AbstractC0588e
            /* renamed from: a */
            public final Intent mo2590a() {
                return this.f2471a.getIntent();
            }

            @Override // androidx.core.app.AbstractServiceC0583f.AbstractC0588e
            /* renamed from: b */
            public final void mo2591b() {
                synchronized (jobJobServiceEngineC0589f.this.f2469b) {
                    if (jobJobServiceEngineC0589f.this.f2470c != null) {
                        jobJobServiceEngineC0589f.this.f2470c.completeWork(this.f2471a);
                    }
                }
            }

            C0590a(JobWorkItem jobWorkItem) {
                this.f2471a = jobWorkItem;
            }
        }

        @Override // androidx.core.app.AbstractServiceC0583f.AbstractC0585b
        /* renamed from: a */
        public final IBinder mo2584a() {
            return getBinder();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0011, code lost:
            r2.getIntent().setExtrasClassLoader(r4.f2468a.getClassLoader());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
            return new androidx.core.app.AbstractServiceC0583f.jobJobServiceEngineC0589f.C0590a(r4, r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
            return null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x000f, code lost:
            if (r2 == null) goto L_0x0024;
         */
        @Override // androidx.core.app.AbstractServiceC0583f.AbstractC0585b
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final androidx.core.app.AbstractServiceC0583f.AbstractC0588e mo2585b() {
            /*
                r4 = this;
                java.lang.Object r3 = r4.f2469b
                monitor-enter(r3)
                android.app.job.JobParameters r1 = r4.f2470c     // Catch:{ all -> 0x0025 }
                r0 = 0
                if (r1 != 0) goto L_0x000a
                monitor-exit(r3)     // Catch:{ all -> 0x0025 }
                return r0
            L_0x000a:
                android.app.job.JobWorkItem r2 = r1.dequeueWork()     // Catch:{ all -> 0x0025 }
                monitor-exit(r3)     // Catch:{ all -> 0x0025 }
                if (r2 == 0) goto L_0x0024
                android.content.Intent r1 = r2.getIntent()
                androidx.core.app.f r0 = r4.f2468a
                java.lang.ClassLoader r0 = r0.getClassLoader()
                r1.setExtrasClassLoader(r0)
                androidx.core.app.f$f$a r0 = new androidx.core.app.f$f$a
                r0.<init>(r2)
                return r0
            L_0x0024:
                return r0
            L_0x0025:
                r0 = move-exception
                monitor-exit(r3)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.AbstractServiceC0583f.jobJobServiceEngineC0589f.mo2585b():androidx.core.app.f$e");
        }

        jobJobServiceEngineC0589f(AbstractServiceC0583f fVar) {
            super(fVar);
            this.f2468a = fVar;
        }

        public final boolean onStartJob(JobParameters jobParameters) {
            this.f2470c = jobParameters;
            this.f2468a.ensureProcessorRunningLocked(false);
            return true;
        }

        public final boolean onStopJob(JobParameters jobParameters) {
            boolean doStopCurrentWork = this.f2468a.doStopCurrentWork();
            synchronized (this.f2469b) {
                this.f2470c = null;
            }
            return doStopCurrentWork;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.f$c */
    public static final class C0586c extends AbstractC0592h {

        /* renamed from: a */
        boolean f2460a;

        /* renamed from: b */
        boolean f2461b;

        /* renamed from: f */
        private final Context f2462f;

        /* renamed from: g */
        private final PowerManager.WakeLock f2463g;

        /* renamed from: h */
        private final PowerManager.WakeLock f2464h;

        static {
            Covode.recordClassIndex(664);
        }

        @Override // androidx.core.app.AbstractServiceC0583f.AbstractC0592h
        /* renamed from: a */
        public final void mo2586a() {
            synchronized (this) {
                this.f2460a = false;
            }
        }

        @Override // androidx.core.app.AbstractServiceC0583f.AbstractC0592h
        /* renamed from: b */
        public final void mo2588b() {
            synchronized (this) {
                if (!this.f2461b) {
                    this.f2461b = true;
                    this.f2464h.acquire(600000);
                    this.f2463g.release();
                }
            }
        }

        @Override // androidx.core.app.AbstractServiceC0583f.AbstractC0592h
        /* renamed from: c */
        public final void mo2589c() {
            synchronized (this) {
                if (this.f2461b) {
                    if (this.f2460a) {
                        this.f2463g.acquire(60000);
                    }
                    this.f2461b = false;
                    this.f2464h.release();
                }
            }
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.core.app.AbstractServiceC0583f.AbstractC0592h
        /* renamed from: a */
        public final void mo2587a(Intent intent) {
            Intent intent2 = new Intent(intent);
            intent2.setComponent(this.f2475c);
            if (m2204a(this.f2462f, intent2) != null) {
                synchronized (this) {
                    if (!this.f2460a) {
                        this.f2460a = true;
                        if (!this.f2461b) {
                            this.f2463g.acquire(60000);
                        }
                    }
                }
            }
        }

        C0586c(Context context, ComponentName componentName) {
            super(componentName);
            Context applicationContext = context.getApplicationContext();
            if (C58003a.f132201c && applicationContext == null) {
                applicationContext = C58003a.f132199a;
            }
            this.f2462f = applicationContext;
            PowerManager powerManager = (PowerManager) m2205a(context, "power");
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
            this.f2463g = newWakeLock;
            newWakeLock.setReferenceCounted(false);
            PowerManager.WakeLock newWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
            this.f2464h = newWakeLock2;
            newWakeLock2.setReferenceCounted(false);
        }

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003d */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static android.content.ComponentName m2204a(android.content.Context r9, android.content.Intent r10) {
            /*
            // Method dump skipped, instructions count: 114
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.AbstractServiceC0583f.C0586c.m2204a(android.content.Context, android.content.Intent):android.content.ComponentName");
        }

        /* renamed from: a */
        private static Object m2205a(Context context, String str) {
            Object systemService;
            if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
                if (!C58027i.f132247b && "connectivity".equals(str)) {
                    try {
                        new C21708b().mo35361a();
                        C58027i.f132247b = true;
                        return context.getSystemService(str);
                    } catch (Throwable unused) {
                    }
                }
                return context.getSystemService(str);
            } else if (!C58027i.f132246a) {
                return context.getSystemService(str);
            } else {
                synchronized (ClipboardManager.class) {
                    systemService = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(systemService, new C58027i.HandlerC58028a((Handler) declaredField.get(systemService)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                }
                return systemService;
            }
        }
    }

    static {
        Covode.recordClassIndex(661);
    }

    public AbstractServiceC0583f() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.mCompatQueue = null;
        } else {
            this.mCompatQueue = new ArrayList<>();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean doStopCurrentWork() {
        AsyncTaskC0584a aVar = this.mCurProcessor;
        if (aVar != null) {
            aVar.cancel(this.mInterruptIfStopped);
        }
        this.mStopped = true;
        return onStopCurrentWork();
    }

    public void onDestroy() {
        super.onDestroy();
        ArrayList<C0587d> arrayList = this.mCompatQueue;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.mDestroyed = true;
                this.mCompatWorkEnqueuer.mo2589c();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public AbstractC0588e dequeueWork() {
        AbstractC0585b bVar = this.mJobImpl;
        if (bVar != null) {
            return bVar.mo2585b();
        }
        synchronized (this.mCompatQueue) {
            if (this.mCompatQueue.size() <= 0) {
                return null;
            }
            return this.mCompatQueue.remove(0);
        }
    }

    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.mJobImpl = new jobJobServiceEngineC0589f(this);
            this.mCompatWorkEnqueuer = null;
            return;
        }
        this.mJobImpl = null;
        this.mCompatWorkEnqueuer = getWorkEnqueuer(this, new ComponentName(this, getClass()), false, 0);
    }

    /* access modifiers changed from: package-private */
    public void processorFinished() {
        ArrayList<C0587d> arrayList = this.mCompatQueue;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.mCurProcessor = null;
                ArrayList<C0587d> arrayList2 = this.mCompatQueue;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    ensureProcessorRunningLocked(false);
                } else if (!this.mDestroyed) {
                    this.mCompatWorkEnqueuer.mo2589c();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.f$a */
    public final class AsyncTaskC0584a extends AsyncTask<Void, Void, Void> {
        static {
            Covode.recordClassIndex(662);
        }

        AsyncTaskC0584a() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public final /* synthetic */ void onCancelled(Void r2) {
            AbstractServiceC0583f.this.processorFinished();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public final /* synthetic */ void onPostExecute(Void r2) {
            AbstractServiceC0583f.this.processorFinished();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object[]] */
        /* access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public final /* synthetic */ Void doInBackground(Void[] voidArr) {
            while (true) {
                AbstractC0588e dequeueWork = AbstractServiceC0583f.this.dequeueWork();
                if (dequeueWork == null) {
                    return null;
                }
                AbstractServiceC0583f.this.onHandleWork(dequeueWork.mo2590a());
                dequeueWork.mo2591b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.f$h */
    public static abstract class AbstractC0592h {

        /* renamed from: c */
        final ComponentName f2475c;

        /* renamed from: d */
        boolean f2476d;

        /* renamed from: e */
        int f2477e;

        static {
            Covode.recordClassIndex(670);
        }

        /* renamed from: a */
        public void mo2586a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo2587a(Intent intent);

        /* renamed from: b */
        public void mo2588b() {
        }

        /* renamed from: c */
        public void mo2589c() {
        }

        AbstractC0592h(ComponentName componentName) {
            this.f2475c = componentName;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo2594a(int i) {
            if (!this.f2476d) {
                this.f2476d = true;
                this.f2477e = i;
            } else if (this.f2477e != i) {
                throw new IllegalArgumentException("Given job ID " + i + " is different than previous " + this.f2477e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.f$g */
    public static final class C0591g extends AbstractC0592h {

        /* renamed from: a */
        private final JobInfo f2473a;

        /* renamed from: b */
        private final JobScheduler f2474b;

        static {
            Covode.recordClassIndex(669);
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.core.app.AbstractServiceC0583f.AbstractC0592h
        /* renamed from: a */
        public final void mo2587a(Intent intent) {
            this.f2474b.enqueue(this.f2473a, new JobWorkItem(intent));
        }

        /* renamed from: a */
        private static Object m2218a(Context context, String str) {
            Object systemService;
            if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
                if (!C58027i.f132247b && "connectivity".equals(str)) {
                    try {
                        new C21708b().mo35361a();
                        C58027i.f132247b = true;
                        return context.getSystemService(str);
                    } catch (Throwable unused) {
                    }
                }
                return context.getSystemService(str);
            } else if (!C58027i.f132246a) {
                return context.getSystemService(str);
            } else {
                synchronized (ClipboardManager.class) {
                    systemService = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(systemService, new C58027i.HandlerC58028a((Handler) declaredField.get(systemService)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                }
                return systemService;
            }
        }

        C0591g(Context context, ComponentName componentName, int i) {
            super(componentName);
            mo2594a(i);
            this.f2473a = new JobInfo.Builder(i, this.f2475c).setOverrideDeadline(0).build();
            Context applicationContext = context.getApplicationContext();
            if (C58003a.f132201c && applicationContext == null) {
                applicationContext = C58003a.f132199a;
            }
            this.f2474b = (JobScheduler) m2218a(applicationContext, "jobscheduler");
        }
    }

    public IBinder onBind(Intent intent) {
        AbstractC0585b bVar = this.mJobImpl;
        if (bVar != null) {
            return bVar.mo2584a();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void ensureProcessorRunningLocked(boolean z) {
        if (this.mCurProcessor == null) {
            this.mCurProcessor = new AsyncTaskC0584a();
            AbstractC0592h hVar = this.mCompatWorkEnqueuer;
            if (hVar != null && z) {
                hVar.mo2588b();
            }
            this.mCurProcessor.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        if (this.mCompatQueue == null) {
            return 2;
        }
        this.mCompatWorkEnqueuer.mo2586a();
        synchronized (this.mCompatQueue) {
            ArrayList<C0587d> arrayList = this.mCompatQueue;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new C0587d(intent, i2));
            ensureProcessorRunningLocked(true);
        }
        return 3;
    }

    public static void enqueueWork(Context context, Class<?> cls, int i, Intent intent) {
        enqueueWork(context, new ComponentName(context, cls), i, intent);
    }

    public static void enqueueWork(Context context, ComponentName componentName, int i, Intent intent) {
        if (intent != null) {
            synchronized (sLock) {
                AbstractC0592h workEnqueuer = getWorkEnqueuer(context, componentName, true, i);
                workEnqueuer.mo2594a(i);
                workEnqueuer.mo2587a(intent);
            }
            return;
        }
        throw new IllegalArgumentException("work must not be null");
    }

    static AbstractC0592h getWorkEnqueuer(Context context, ComponentName componentName, boolean z, int i) {
        HashMap<ComponentName, AbstractC0592h> hashMap = sClassWorkEnqueuer;
        AbstractC0592h hVar = hashMap.get(componentName);
        if (hVar == null) {
            if (Build.VERSION.SDK_INT < 26) {
                hVar = new C0586c(context, componentName);
            } else if (z) {
                hVar = new C0591g(context, componentName, i);
            } else {
                throw new IllegalArgumentException("Can't be here without a job id");
            }
            hashMap.put(componentName, hVar);
        }
        return hVar;
    }
}
