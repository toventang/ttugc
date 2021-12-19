package com.google.firebase.iid;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.common.internal.C25565r;
import com.google.android.gms.common.stats.C25588a;
import com.google.android.gms.common.util.p1939a.ThreadFactoryC25597b;
import com.google.android.gms.internal.p1947f.C25735a;
import com.google.android.gms.internal.p1947f.HandlerC25738d;
import com.google.android.gms.p1940d.AbstractC25631h;
import com.google.android.gms.p1940d.C25622ac;
import com.google.android.gms.p1940d.C25632i;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.iid.x */
public final class C27809x {

    /* renamed from: c */
    private static C27809x f65325c;

    /* renamed from: a */
    public final Context f65326a;

    /* renamed from: b */
    public final ScheduledExecutorService f65327b;

    /* renamed from: d */
    private ServiceConnectionC27810a f65328d = new ServiceConnectionC27810a(this, (byte) 0);

    /* renamed from: e */
    private int f65329e = 1;

    static {
        Covode.recordClassIndex(33397);
    }

    /* renamed from: com.google.firebase.iid.x$e */
    public static class C27814e extends Exception {

        /* renamed from: a */
        private final int f65342a;

        static {
            Covode.recordClassIndex(33402);
        }

        public final int getErrorCode() {
            return this.f65342a;
        }

        public C27814e(int i, String str) {
            super(str);
            this.f65342a = i;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.iid.x$a */
    public class ServiceConnectionC27810a implements ServiceConnection {

        /* renamed from: a */
        int f65330a;

        /* renamed from: b */
        final Messenger f65331b;

        /* renamed from: c */
        C27811b f65332c;

        /* renamed from: d */
        final Queue<AbstractC27813d<?>> f65333d;

        /* renamed from: e */
        final SparseArray<AbstractC27813d<?>> f65334e;

        static {
            Covode.recordClassIndex(33398);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo46457a() {
            C27809x.this.f65327b.execute(new RunnableC27757ab(this));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public final synchronized void mo46463c() {
            MethodCollector.m26663i(13390);
            if (this.f65330a == 1) {
                mo46459a(1, "Timed out while binding");
            }
            MethodCollector.m26664o(13390);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final synchronized void mo46462b() {
            MethodCollector.m26663i(13328);
            if (this.f65330a == 2 && this.f65333d.isEmpty() && this.f65334e.size() == 0) {
                this.f65330a = 3;
                C25588a.m49390a();
                C27809x.this.f65326a.unbindService(this);
            }
            MethodCollector.m26664o(13328);
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            C27809x.this.f65327b.execute(new RunnableC27758ac(this));
        }

        private ServiceConnectionC27810a() {
            this.f65331b = new Messenger(new HandlerC25738d(Looper.getMainLooper(), new C27816y(this)));
            this.f65333d = new ArrayDeque();
            this.f65334e = new SparseArray<>();
        }

        /* renamed from: a */
        private void m55599a(C27814e eVar) {
            for (AbstractC27813d<?> dVar : this.f65333d) {
                dVar.mo46468a(eVar);
            }
            this.f65333d.clear();
            for (int i = 0; i < this.f65334e.size(); i++) {
                this.f65334e.valueAt(i).mo46468a(eVar);
            }
            this.f65334e.clear();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final synchronized void mo46458a(int i) {
            MethodCollector.m26663i(13391);
            AbstractC27813d<?> dVar = this.f65334e.get(i);
            if (dVar != null) {
                this.f65334e.remove(i);
                dVar.mo46468a(new C27814e(3, "Timed out waiting for response"));
                mo46462b();
            }
            MethodCollector.m26664o(13391);
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
            r2 = r7.getData();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x002c, code lost:
            if (r2.getBoolean("unsupported", false) == false) goto L_0x003d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x002e, code lost:
            r4.mo46468a(new com.google.firebase.iid.C27809x.C27814e(4, "Not supported by GmsCore"));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0039, code lost:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(13203);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x003c, code lost:
            return true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
            r4.mo46466a(r2);
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo46460a(android.os.Message r7) {
            /*
                r6 = this;
                r5 = 13203(0x3393, float:1.8501E-41)
                com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r5)
                int r1 = r7.arg1
                monitor-enter(r6)
                android.util.SparseArray<com.google.firebase.iid.x$d<?>> r0 = r6.f65334e     // Catch:{ all -> 0x0041 }
                java.lang.Object r4 = r0.get(r1)     // Catch:{ all -> 0x0041 }
                com.google.firebase.iid.x$d r4 = (com.google.firebase.iid.C27809x.AbstractC27813d) r4     // Catch:{ all -> 0x0041 }
                r3 = 1
                if (r4 != 0) goto L_0x0018
                monitor-exit(r6)     // Catch:{ all -> 0x0041 }
                com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r5)
                return r3
            L_0x0018:
                android.util.SparseArray<com.google.firebase.iid.x$d<?>> r0 = r6.f65334e
                r0.remove(r1)
                r6.mo46462b()
                monitor-exit(r6)
                android.os.Bundle r2 = r7.getData()
                java.lang.String r1 = "unsupported"
                r0 = 0
                boolean r0 = r2.getBoolean(r1, r0)
                if (r0 == 0) goto L_0x003d
                com.google.firebase.iid.x$e r2 = new com.google.firebase.iid.x$e
                r1 = 4
                java.lang.String r0 = "Not supported by GmsCore"
                r2.<init>(r1, r0)
                r4.mo46468a(r2)
            L_0x0039:
                com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r5)
                return r3
            L_0x003d:
                r4.mo46466a(r2)
                goto L_0x0039
            L_0x0041:
                r0 = move-exception
                monitor-exit(r6)
                com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r5)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C27809x.ServiceConnectionC27810a.mo46460a(android.os.Message):boolean");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final synchronized boolean mo46461a(AbstractC27813d<?> dVar) {
            boolean z;
            MethodCollector.m26663i(13069);
            int i = this.f65330a;
            if (i == 0) {
                this.f65333d.add(dVar);
                if (this.f65330a == 0) {
                    z = true;
                } else {
                    z = false;
                }
                C25565r.m49320a(z);
                this.f65330a = 1;
                Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                intent.setPackage("com.google.android.gms");
                C25588a.m49390a();
                if (!C25588a.m49392b(C27809x.this.f65326a, intent, this, 1)) {
                    mo46459a(0, "Unable to bind to service");
                } else {
                    C27809x.this.f65327b.schedule(new RunnableC27817z(this), 30, TimeUnit.SECONDS);
                }
                MethodCollector.m26664o(13069);
                return true;
            } else if (i == 1) {
                this.f65333d.add(dVar);
                MethodCollector.m26664o(13069);
                return true;
            } else if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        IllegalStateException illegalStateException = new IllegalStateException(new StringBuilder(26).append("Unknown state: ").append(this.f65330a).toString());
                        MethodCollector.m26664o(13069);
                        throw illegalStateException;
                    }
                }
                MethodCollector.m26664o(13069);
                return false;
            } else {
                this.f65333d.add(dVar);
                mo46457a();
                MethodCollector.m26664o(13069);
                return true;
            }
        }

        /* synthetic */ ServiceConnectionC27810a(C27809x xVar, byte b) {
            this();
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C27809x.this.f65327b.execute(new RunnableC27756aa(this, iBinder));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final synchronized void mo46459a(int i, String str) {
            MethodCollector.m26663i(13267);
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                String valueOf = String.valueOf(str);
                if (valueOf.length() != 0) {
                    "Disconnected: ".concat(valueOf);
                } else {
                    new String("Disconnected: ");
                }
            }
            int i2 = this.f65330a;
            if (i2 == 0) {
                IllegalStateException illegalStateException = new IllegalStateException();
                MethodCollector.m26664o(13267);
                throw illegalStateException;
            } else if (i2 == 1 || i2 == 2) {
                this.f65330a = 4;
                C25588a.m49390a();
                C27809x.this.f65326a.unbindService(this);
                m55599a(new C27814e(i, str));
                MethodCollector.m26664o(13267);
            } else if (i2 == 3) {
                this.f65330a = 4;
                MethodCollector.m26664o(13267);
            } else if (i2 == 4) {
                MethodCollector.m26664o(13267);
            } else {
                IllegalStateException illegalStateException2 = new IllegalStateException(new StringBuilder(26).append("Unknown state: ").append(this.f65330a).toString());
                MethodCollector.m26664o(13267);
                throw illegalStateException2;
            }
        }
    }

    /* renamed from: a */
    public final synchronized int mo46454a() {
        int i;
        MethodCollector.m26663i(13059);
        i = this.f65329e;
        this.f65329e = i + 1;
        MethodCollector.m26664o(13059);
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.iid.x$d */
    public static abstract class AbstractC27813d<T> {

        /* renamed from: a */
        final int f65338a;

        /* renamed from: b */
        final C25632i<T> f65339b = new C25632i<>();

        /* renamed from: c */
        final int f65340c;

        /* renamed from: d */
        final Bundle f65341d;

        static {
            Covode.recordClassIndex(33401);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo46466a(Bundle bundle);

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract boolean mo46467a();

        public String toString() {
            int i = this.f65340c;
            int i2 = this.f65338a;
            return new StringBuilder(55).append("Request { what=").append(i).append(" id=").append(i2).append(" oneWay=").append(mo46467a()).append("}").toString();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo46468a(C27814e eVar) {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                String valueOf = String.valueOf(this);
                String valueOf2 = String.valueOf(eVar);
                String.valueOf(valueOf).length();
                String.valueOf(valueOf2).length();
            }
            this.f65339b.mo41893a(eVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo46469a(T t) {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                String valueOf = String.valueOf(this);
                String valueOf2 = String.valueOf(t);
                String.valueOf(valueOf).length();
                String.valueOf(valueOf2).length();
            }
            this.f65339b.mo41894a(t);
        }

        AbstractC27813d(int i, int i2, Bundle bundle) {
            this.f65338a = i;
            this.f65340c = i2;
            this.f65341d = bundle;
        }
    }

    /* renamed from: com.google.firebase.iid.x$f */
    static class C27815f extends AbstractC27813d<Bundle> {
        static {
            Covode.recordClassIndex(33403);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.firebase.iid.C27809x.AbstractC27813d
        /* renamed from: a */
        public final boolean mo46467a() {
            return false;
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.firebase.iid.C27809x.AbstractC27813d
        /* renamed from: a */
        public final void mo46466a(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle("data");
            if (bundle2 == null) {
                bundle2 = Bundle.EMPTY;
            }
            mo46469a((Object) bundle2);
        }

        C27815f(int i, Bundle bundle) {
            super(i, 1, bundle);
        }
    }

    /* renamed from: a */
    public final AbstractC25631h<Bundle> mo46455a(Bundle bundle) {
        return mo46456a(new C27815f(mo46454a(), bundle));
    }

    /* renamed from: com.google.firebase.iid.x$c */
    public static class C27812c extends AbstractC27813d<Void> {
        static {
            Covode.recordClassIndex(33400);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.firebase.iid.C27809x.AbstractC27813d
        /* renamed from: a */
        public final boolean mo46467a() {
            return true;
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.firebase.iid.C27809x.AbstractC27813d
        /* renamed from: a */
        public final void mo46466a(Bundle bundle) {
            if (bundle.getBoolean("ack", false)) {
                mo46469a((Object) null);
            } else {
                mo46468a(new C27814e(4, "Invalid response to one way request"));
            }
        }

        public C27812c(int i, Bundle bundle) {
            super(i, 2, bundle);
        }
    }

    /* renamed from: a */
    public static synchronized C27809x m55595a(Context context) {
        C27809x xVar;
        synchronized (C27809x.class) {
            MethodCollector.m26663i(13057);
            if (f65325c == null) {
                f65325c = new C27809x(context, C25735a.f60859a.mo41966a(new ThreadFactoryC25597b("MessengerIpcClient")));
            }
            xVar = f65325c;
            MethodCollector.m26664o(13057);
        }
        return xVar;
    }

    /* renamed from: com.google.firebase.iid.x$b */
    static class C27811b {

        /* renamed from: a */
        final Messenger f65336a;

        /* renamed from: b */
        final FirebaseIidMessengerCompat f65337b;

        static {
            Covode.recordClassIndex(33399);
        }

        C27811b(IBinder iBinder) {
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if ("android.os.IMessenger".equals(interfaceDescriptor)) {
                this.f65336a = new Messenger(iBinder);
                this.f65337b = null;
            } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
                this.f65337b = new FirebaseIidMessengerCompat(iBinder);
                this.f65336a = null;
            } else {
                String valueOf = String.valueOf(interfaceDescriptor);
                if (valueOf.length() != 0) {
                    "Invalid interface descriptor: ".concat(valueOf);
                } else {
                    new String("Invalid interface descriptor: ");
                }
                throw new RemoteException();
            }
        }
    }

    /* renamed from: a */
    public final synchronized <T> AbstractC25631h<T> mo46456a(AbstractC27813d<T> dVar) {
        C25622ac<TResult> acVar;
        MethodCollector.m26663i(13058);
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String.valueOf(String.valueOf(dVar)).length();
        }
        if (!this.f65328d.mo46461a((AbstractC27813d<?>) dVar)) {
            ServiceConnectionC27810a aVar = new ServiceConnectionC27810a(this, (byte) 0);
            this.f65328d = aVar;
            aVar.mo46461a((AbstractC27813d<?>) dVar);
        }
        acVar = dVar.f65339b.f60753a;
        MethodCollector.m26664o(13058);
        return acVar;
    }

    private C27809x(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f65327b = scheduledExecutorService;
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        this.f65326a = applicationContext;
    }
}
