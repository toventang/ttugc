package com.benchmark.collection.service;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.benchmark.AbstractC2432c;
import com.benchmark.AbstractC2468d;
import com.benchmark.collection.AbstractC2440c;
import com.benchmark.collection.C2439b;
import com.benchmark.p117a.C2413a;
import com.benchmark.p117a.C2415c;
import com.benchmark.p119c.C2436b;
import com.benchmark.tools.C2530l;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import java.io.File;
import java.util.concurrent.Callable;

/* renamed from: com.benchmark.collection.service.a */
public final class C2464a {

    /* renamed from: h */
    private static C2464a f7396h;

    /* renamed from: a */
    public AbstractC2432c f7397a;

    /* renamed from: b */
    public Context f7398b;

    /* renamed from: c */
    public ServiceConnectionC2466b f7399c;

    /* renamed from: d */
    public BinderC2465a f7400d = new BinderC2465a(this, (byte) 0);

    /* renamed from: e */
    public AbstractC2440c.AbstractC2441a f7401e;

    /* renamed from: f */
    public ByteBenchProcessInterface f7402f;

    /* renamed from: g */
    public volatile boolean f7403g = false;

    static {
        Covode.recordClassIndex(2819);
    }

    /* renamed from: a */
    public static synchronized C2464a m7305a() {
        C2464a aVar;
        synchronized (C2464a.class) {
            MethodCollector.m26663i(7102);
            if (f7396h == null) {
                f7396h = new C2464a();
            }
            aVar = f7396h;
            MethodCollector.m26664o(7102);
        }
        return aVar;
    }

    /* renamed from: com.benchmark.collection.service.a$a */
    public class BinderC2465a extends AbstractC2468d.AbstractBinderC2469a {
        static {
            Covode.recordClassIndex(2820);
        }

        private BinderC2465a() {
        }

        @Override // com.benchmark.AbstractC2468d
        /* renamed from: a */
        public final void mo6844a(String str) {
            if (C2415c.f7252a != null) {
                C2415c.f7252a.mo6979a(new RuntimeException(str));
            }
        }

        /* synthetic */ BinderC2465a(C2464a aVar, byte b) {
            this();
        }

        @Override // com.benchmark.AbstractC2468d
        /* renamed from: a */
        public final void mo6845a(String str, String str2) {
            C2413a.m7258a(str, str2);
        }

        @Override // com.benchmark.AbstractC2468d
        /* renamed from: a */
        public final void mo6843a(int i, String str) {
            if (C2464a.this.f7401e != null) {
                C2464a.this.f7401e.mo6806a(i, str);
            }
        }

        @Override // com.benchmark.AbstractC2468d
        /* renamed from: a */
        public final void mo6842a(int i, int i2, String str) {
            if (C2464a.this.f7401e != null) {
                C2464a.this.f7401e.mo6805a(i, i2, str);
            }
        }
    }

    /* renamed from: com.benchmark.collection.service.a$b */
    public class ServiceConnectionC2466b implements ServiceConnection {

        /* renamed from: a */
        public String f7405a;

        /* renamed from: b */
        public int f7406b;

        /* renamed from: c */
        public String f7407c;

        /* renamed from: e */
        private BinderC2465a f7409e;

        static {
            Covode.recordClassIndex(2821);
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            C2464a.this.f7397a = null;
            if (C2464a.this.f7401e != null) {
                C2464a.this.f7401e.mo6805a(104, -1, "onServiceDisconnected");
            }
        }

        public ServiceConnectionC2466b(BinderC2465a aVar) {
            this.f7409e = aVar;
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            AbstractC2432c aVar;
            C2464a aVar2 = C2464a.this;
            if (iBinder == null) {
                aVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.benchmark.IBTCManager");
                if (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC2432c)) {
                    aVar = new AbstractC2432c.AbstractBinderC2433a.C2434a(iBinder);
                } else {
                    aVar = (AbstractC2432c) queryLocalInterface;
                }
            }
            aVar2.f7397a = aVar;
            if (C2464a.this.f7397a != null) {
                C2530l.m7415a(new Callable<Void>() {
                    /* class com.benchmark.collection.service.C2464a.ServiceConnectionC2466b.CallableC24671 */

                    static {
                        Covode.recordClassIndex(2822);
                    }

                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public Void call() {
                        if (C2464a.this.f7397a == null) {
                            return null;
                        }
                        try {
                            if (ServiceConnectionC2466b.this.f7405a == null) {
                                return null;
                            }
                            C2464a.this.f7397a.mo6799a(ServiceConnectionC2466b.this.f7406b, ServiceConnectionC2466b.this.f7407c, ServiceConnectionC2466b.this.f7405a, C2464a.this.f7400d);
                            return null;
                        } catch (RemoteException e) {
                            C2415c.m7261a(e);
                            return null;
                        }
                    }
                }, C2530l.f7652a);
            } else if (C2464a.this.f7401e != null) {
                C2464a.this.f7401e.mo6805a(101, -1, "init start failed");
            }
        }
    }

    /* renamed from: a */
    public final int mo6841a(AbstractC2440c.AbstractC2441a aVar) {
        String str;
        Context context = C2436b.f7319m.f7320a;
        this.f7398b = context;
        if (context == null) {
            return -1;
        }
        this.f7402f = new ByteBenchProcessInterface();
        String str2 = "";
        if (!C2439b.f7341a.f7342b.f7338e) {
            try {
                Context context2 = this.f7398b;
                if (C58016d.f132221b == null || !C58016d.f132224e) {
                    C58016d.f132221b = context2.getCacheDir();
                }
                File file = C58016d.f132221b;
                if (file != null) {
                    str = file.getPath();
                } else {
                    str = str2;
                }
                Context context3 = this.f7398b;
                if (C58016d.f132220a == null || !C58016d.f132224e) {
                    C58016d.f132220a = context3.getExternalCacheDir();
                }
                File file2 = C58016d.f132220a;
                if (file2 != null) {
                    str2 = file2.getPath();
                }
            } catch (Exception unused) {
                return -104;
            }
        } else {
            str = str2;
            str2 = str;
        }
        int init = this.f7402f.init(C2439b.f7341a.f7342b.f7336c, str, str2, this.f7398b.getApplicationInfo().nativeLibraryDir, this.f7398b);
        if (init < 0) {
            return init;
        }
        this.f7402f.setByteBenchCallback(this.f7400d);
        this.f7401e = aVar;
        return 0;
    }
}
