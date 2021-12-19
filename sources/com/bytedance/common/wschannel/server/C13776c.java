package com.bytedance.common.wschannel.server;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.wschannel.C13749g;
import com.bytedance.common.wschannel.client.AbstractServiceC13713a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.push.downgrade.C65713d;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bytedance.common.wschannel.server.c */
public final class C13776c {

    /* renamed from: a */
    final AbstractC13778b f33512a;

    /* renamed from: b */
    public final Class<? extends AbstractServiceC13713a> f33513b;

    /* renamed from: com.bytedance.common.wschannel.server.c$b */
    public interface AbstractC13778b {
        static {
            Covode.recordClassIndex(15826);
        }

        /* renamed from: a */
        void mo22186a();

        /* renamed from: a */
        void mo22187a(Intent intent);
    }

    static {
        Covode.recordClassIndex(15824);
    }

    /* renamed from: com.bytedance.common.wschannel.server.c$c */
    class C13779c implements AbstractC13778b {

        /* renamed from: a */
        public final Context f33516a;

        /* renamed from: b */
        public Messenger f33517b;

        /* renamed from: c */
        public ServiceConnection f33518c;

        /* renamed from: d */
        public boolean f33519d = false;

        /* renamed from: e */
        public final Object f33520e = new Object();

        /* renamed from: f */
        final AtomicInteger f33521f = new AtomicInteger(0);

        /* renamed from: h */
        private final LinkedBlockingDeque<Intent> f33523h = new LinkedBlockingDeque<>();

        /* renamed from: i */
        private final Runnable f33524i = new Runnable() {
            /* class com.bytedance.common.wschannel.server.C13776c.C13779c.RunnableC137801 */

            static {
                Covode.recordClassIndex(15828);
            }

            public final void run() {
                MethodCollector.m26663i(12660);
                synchronized (C13779c.this.f33520e) {
                    try {
                        if (C13779c.this.f33519d) {
                            C13779c.this.f33519d = false;
                        }
                    } finally {
                        MethodCollector.m26664o(12660);
                    }
                }
            }
        };

        /* renamed from: j */
        private final Runnable f33525j = new Runnable() {
            /* class com.bytedance.common.wschannel.server.C13776c.C13779c.RunnableC137812 */

            static {
                Covode.recordClassIndex(15829);
            }

            /* JADX WARNING: Can't wrap try/catch for region: R(6:2|3|(1:7)|8|9|10) */
            /* JADX WARNING: Code restructure failed: missing block: B:13:0x0039, code lost:
                r0 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:15:0x003b, code lost:
                com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(9647);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:16:0x003e, code lost:
                throw r0;
             */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x002b */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r4 = this;
                    r3 = 9647(0x25af, float:1.3518E-41)
                    com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r3)
                    com.bytedance.common.wschannel.server.c$c r0 = com.bytedance.common.wschannel.server.C13776c.C13779c.this
                    java.lang.Object r2 = r0.f33520e
                    monitor-enter(r2)
                    com.bytedance.common.wschannel.server.c$c r0 = com.bytedance.common.wschannel.server.C13776c.C13779c.this     // Catch:{ all -> 0x002b }
                    android.content.ServiceConnection r0 = r0.f33518c     // Catch:{ all -> 0x002b }
                    if (r0 == 0) goto L_0x002b
                    com.bytedance.common.wschannel.server.c$c r0 = com.bytedance.common.wschannel.server.C13776c.C13779c.this     // Catch:{ all -> 0x002b }
                    android.content.Context r1 = r0.f33516a     // Catch:{ all -> 0x002b }
                    com.bytedance.common.wschannel.server.c$c r0 = com.bytedance.common.wschannel.server.C13776c.C13779c.this     // Catch:{ all -> 0x002b }
                    com.bytedance.common.wschannel.server.c r0 = com.bytedance.common.wschannel.server.C13776c.this     // Catch:{ all -> 0x002b }
                    java.lang.Class<? extends com.bytedance.common.wschannel.client.a> r0 = r0.f33513b     // Catch:{ all -> 0x002b }
                    boolean r0 = com.bytedance.common.wschannel.p921e.C13747d.m24782a(r1, r0)     // Catch:{ all -> 0x002b }
                    if (r0 == 0) goto L_0x002b
                    com.bytedance.common.wschannel.server.c$c r0 = com.bytedance.common.wschannel.server.C13776c.C13779c.this     // Catch:{ all -> 0x002b }
                    android.content.Context r1 = r0.f33516a     // Catch:{ all -> 0x002b }
                    com.bytedance.common.wschannel.server.c$c r0 = com.bytedance.common.wschannel.server.C13776c.C13779c.this     // Catch:{ all -> 0x002b }
                    android.content.ServiceConnection r0 = r0.f33518c     // Catch:{ all -> 0x002b }
                    r1.unbindService(r0)     // Catch:{ all -> 0x002b }
                L_0x002b:
                    com.bytedance.common.wschannel.server.c$c r0 = com.bytedance.common.wschannel.server.C13776c.C13779c.this     // Catch:{ all -> 0x0039 }
                    r1 = 0
                    r0.f33518c = r1     // Catch:{ all -> 0x0039 }
                    com.bytedance.common.wschannel.server.c$c r0 = com.bytedance.common.wschannel.server.C13776c.C13779c.this     // Catch:{ all -> 0x0039 }
                    r0.f33517b = r1     // Catch:{ all -> 0x0039 }
                    monitor-exit(r2)     // Catch:{ all -> 0x0039 }
                    com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
                    return
                L_0x0039:
                    r0 = move-exception
                    monitor-exit(r2)
                    com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.server.C13776c.C13779c.RunnableC137812.run():void");
            }
        };

        static {
            Covode.recordClassIndex(15827);
        }

        /* renamed from: c */
        public final void mo22189c() {
            C13749g.m24785a();
            C13749g.f33386a.removeCallbacks(this.f33524i);
        }

        /* renamed from: d */
        public final void mo22190d() {
            try {
                C13749g.m24785a();
                C13749g.f33386a.removeCallbacks(this.f33525j);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* renamed from: f */
        private void m24860f() {
            mo22189c();
            C13749g.m24785a();
            C13749g.f33386a.postDelayed(this.f33524i, TimeUnit.SECONDS.toMillis(7));
        }

        /* renamed from: e */
        private void m24859e() {
            Logger.debug();
            try {
                m24856a(this.f33516a, new Intent(this.f33516a, C13776c.this.f33513b));
            } catch (Throwable unused) {
            }
            try {
                this.f33518c = new ServiceConnectionC13782a(this, (byte) 0);
                m24857a(this.f33516a, new Intent(this.f33516a, C13776c.this.f33513b), this.f33518c);
                m24860f();
                this.f33519d = true;
            } catch (Throwable unused2) {
                mo22189c();
                this.f33519d = false;
            }
        }

        /* renamed from: g */
        private synchronized void m24861g() {
            MethodCollector.m26663i(10111);
            mo22190d();
            C13749g.m24785a();
            C13749g.f33386a.postDelayed(this.f33525j, TimeUnit.SECONDS.toMillis(10));
            MethodCollector.m26664o(10111);
        }

        @Override // com.bytedance.common.wschannel.server.C13776c.AbstractC13778b
        /* renamed from: a */
        public final void mo22186a() {
            MethodCollector.m26663i(9951);
            if (this.f33523h.size() <= 0 || this.f33517b != null) {
                MethodCollector.m26664o(9951);
                return;
            }
            synchronized (this.f33520e) {
                try {
                    if (this.f33523h.size() > 0 && this.f33517b == null) {
                        m24859e();
                    }
                } finally {
                    MethodCollector.m26664o(9951);
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
            r2.f33517b = null;
            r2.f33523h.offerFirst(r1);
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:0:0x0000 */
        /* JADX WARNING: Removed duplicated region for block: B:3:0x0008 A[Catch:{ all -> 0x0023 }] */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo22188b() {
            /*
                r2 = this;
            L_0x0000:
                java.util.concurrent.LinkedBlockingDeque<android.content.Intent> r0 = r2.f33523h     // Catch:{ all -> 0x0023 }
                java.lang.Object r0 = r0.peek()     // Catch:{ all -> 0x0023 }
                if (r0 == 0) goto L_0x0020
                java.util.concurrent.LinkedBlockingDeque<android.content.Intent> r0 = r2.f33523h     // Catch:{ all -> 0x0023 }
                java.lang.Object r1 = r0.poll()     // Catch:{ all -> 0x0023 }
                android.content.Intent r1 = (android.content.Intent) r1     // Catch:{ all -> 0x0023 }
                if (r1 != 0) goto L_0x0013
                goto L_0x0017
            L_0x0013:
                r2.m24858b(r1)     // Catch:{ DeadObjectException -> 0x0018, all -> 0x0000 }
                goto L_0x0000
            L_0x0017:
                return
            L_0x0018:
                r0 = 0
                r2.f33517b = r0
                java.util.concurrent.LinkedBlockingDeque<android.content.Intent> r0 = r2.f33523h
                r0.offerFirst(r1)
            L_0x0020:
                r2.m24861g()
            L_0x0023:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.server.C13776c.C13779c.mo22188b():void");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.bytedance.common.wschannel.server.c$c$a */
        public class ServiceConnectionC13782a implements ServiceConnection {
            static {
                Covode.recordClassIndex(15830);
            }

            private ServiceConnectionC13782a() {
            }

            public final void onServiceDisconnected(ComponentName componentName) {
                MethodCollector.m26663i(9790);
                Logger.debug();
                synchronized (C13779c.this.f33520e) {
                    if (componentName == null) {
                        MethodCollector.m26664o(9790);
                        return;
                    }
                    try {
                        C13779c.this.f33517b = null;
                        C13779c.this.f33518c = null;
                        C13779c.this.f33519d = false;
                        C13779c.this.mo22190d();
                        C13779c.this.mo22189c();
                    } finally {
                        MethodCollector.m26664o(9790);
                    }
                }
            }

            /* synthetic */ ServiceConnectionC13782a(C13779c cVar, byte b) {
                this();
            }

            public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                MethodCollector.m26663i(9936);
                Logger.debug();
                synchronized (C13779c.this.f33520e) {
                    try {
                        C13779c.this.mo22189c();
                        if (componentName != null) {
                            if (iBinder != null) {
                                try {
                                    C13779c.this.f33517b = new Messenger(iBinder);
                                    C13779c.this.mo22188b();
                                } catch (Throwable unused) {
                                }
                                C13779c.this.f33519d = false;
                                MethodCollector.m26664o(9936);
                            }
                        }
                    } finally {
                        MethodCollector.m26664o(9936);
                    }
                }
            }
        }

        /* renamed from: b */
        private void m24858b(Intent intent) {
            if (intent != null) {
                Logger.debug();
                Messenger messenger = this.f33517b;
                Message message = new Message();
                message.what = 10123;
                message.getData().putParcelable("DATA_INTENT", intent);
                if (messenger != null) {
                    messenger.send(message);
                }
            }
        }

        @Override // com.bytedance.common.wschannel.server.C13776c.AbstractC13778b
        /* renamed from: a */
        public final void mo22187a(Intent intent) {
            MethodCollector.m26663i(9949);
            if (intent == null) {
                MethodCollector.m26664o(9949);
                return;
            }
            if (Logger.debug()) {
                intent.putExtra("msg_count", this.f33521f.addAndGet(1));
            }
            synchronized (this.f33520e) {
                try {
                    mo22190d();
                    this.f33523h.offer(intent);
                    if (this.f33517b != null) {
                        mo22188b();
                    } else if (!this.f33519d) {
                        m24859e();
                    } else {
                        return;
                    }
                    MethodCollector.m26664o(9949);
                } finally {
                    MethodCollector.m26664o(9949);
                }
            }
        }

        C13779c(Context context) {
            this.f33516a = context;
        }

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003d */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static android.content.ComponentName m24856a(android.content.Context r9, android.content.Intent r10) {
            /*
            // Method dump skipped, instructions count: 114
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.server.C13776c.C13779c.m24856a(android.content.Context, android.content.Intent):android.content.ComponentName");
        }

        /* renamed from: a */
        private static boolean m24857a(Context context, Intent intent, ServiceConnection serviceConnection) {
            if (context == null || !(context instanceof Context)) {
                return context.bindService(intent, serviceConnection, 1);
            }
            if (C65713d.m117625a(context, intent)) {
                return true;
            }
            return context.bindService(intent, serviceConnection, 1);
        }
    }

    /* renamed from: a */
    public final void mo22185a(Intent intent) {
        this.f33512a.mo22187a(intent);
    }

    /* renamed from: com.bytedance.common.wschannel.server.c$a */
    class C13777a implements AbstractC13778b {

        /* renamed from: b */
        private final Context f33515b;

        static {
            Covode.recordClassIndex(15825);
        }

        @Override // com.bytedance.common.wschannel.server.C13776c.AbstractC13778b
        /* renamed from: a */
        public final void mo22186a() {
        }

        @Override // com.bytedance.common.wschannel.server.C13776c.AbstractC13778b
        /* renamed from: a */
        public final void mo22187a(Intent intent) {
            try {
                intent.setComponent(new ComponentName(this.f33515b, C13776c.this.f33513b));
                m24851a(this.f33515b, intent);
            } catch (Throwable unused) {
            }
        }

        C13777a(Context context) {
            this.f33515b = context;
        }

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003d */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static android.content.ComponentName m24851a(android.content.Context r9, android.content.Intent r10) {
            /*
            // Method dump skipped, instructions count: 114
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.server.C13776c.C13777a.m24851a(android.content.Context, android.content.Intent):android.content.ComponentName");
        }
    }

    public C13776c(Context context, Class<? extends AbstractServiceC13713a> cls) {
        if (Build.VERSION.SDK_INT < 26 || context.getApplicationInfo().targetSdkVersion < 26) {
            this.f33512a = new C13777a(context);
        } else {
            this.f33512a = new C13779c(context);
        }
        this.f33513b = cls;
    }
}
