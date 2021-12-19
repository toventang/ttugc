package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.common.C25497c;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C25353g;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.AbstractC25547i;
import com.google.android.gms.common.internal.AbstractC25555n;
import com.google.android.gms.common.internal.AbstractC25557o;
import com.google.android.gms.internal.p1946e.HandlerC25734g;
import com.p2082ss.android.ugc.aweme.experiment.C46849dr;
import com.p2082ss.android.ugc.aweme.p2389bh.C34831a;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.common.internal.c */
public abstract class AbstractC25526c<T extends IInterface> {

    /* renamed from: a */
    private static final Feature[] f60541a = new Feature[0];

    /* renamed from: q */
    public static final String[] f60542q = {"service_esmobile", "service_googleme"};

    /* renamed from: A */
    private int f60543A;

    /* renamed from: B */
    private final int f60544B;

    /* renamed from: C */
    private final String f60545C;

    /* renamed from: b */
    int f60546b;

    /* renamed from: c */
    long f60547c;

    /* renamed from: d */
    public final Context f60548d;

    /* renamed from: e */
    public final Looper f60549e;

    /* renamed from: f */
    final Handler f60550f;

    /* renamed from: g */
    final Object f60551g;

    /* renamed from: h */
    AbstractC25557o f60552h;

    /* renamed from: i */
    protected AbstractC25529c f60553i;

    /* renamed from: j */
    final ArrayList<AbstractC25533g<?>> f60554j;

    /* renamed from: k */
    final AbstractC25527a f60555k;

    /* renamed from: l */
    final AbstractC25528b f60556l;

    /* renamed from: m */
    ConnectionResult f60557m;

    /* renamed from: n */
    boolean f60558n;

    /* renamed from: o */
    public volatile zza f60559o;

    /* renamed from: p */
    protected AtomicInteger f60560p;

    /* renamed from: r */
    private long f60561r;

    /* renamed from: s */
    private int f60562s;

    /* renamed from: t */
    private long f60563t;

    /* renamed from: u */
    private C25516ai f60564u;

    /* renamed from: v */
    private final AbstractC25547i f60565v;

    /* renamed from: w */
    private final C25497c f60566w;

    /* renamed from: x */
    private final Object f60567x;

    /* renamed from: y */
    private T f60568y;

    /* renamed from: z */
    private ServiceConnectionC25536j f60569z;

    /* renamed from: com.google.android.gms.common.internal.c$a */
    public interface AbstractC25527a {
        static {
            Covode.recordClassIndex(30930);
        }

        /* renamed from: a */
        void mo41798a();

        /* renamed from: a */
        void mo41799a(int i);
    }

    /* renamed from: com.google.android.gms.common.internal.c$b */
    public interface AbstractC25528b {
        static {
            Covode.recordClassIndex(30931);
        }

        /* renamed from: a */
        void mo41800a(ConnectionResult connectionResult);
    }

    /* renamed from: com.google.android.gms.common.internal.c$c */
    public interface AbstractC25529c {
        static {
            Covode.recordClassIndex(30932);
        }

        /* renamed from: a */
        void mo41579a(ConnectionResult connectionResult);
    }

    /* renamed from: com.google.android.gms.common.internal.c$e */
    public interface AbstractC25531e {
        static {
            Covode.recordClassIndex(30934);
        }

        /* renamed from: a */
        void mo41617a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo41411a(IBinder iBinder);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo41412a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract String mo41413b();

    /* renamed from: c */
    public boolean mo41414c() {
        return false;
    }

    /* renamed from: i */
    public boolean mo41787i() {
        return false;
    }

    /* renamed from: n */
    public Account mo41791n() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public boolean mo41797t() {
        return false;
    }

    /* renamed from: e */
    public int mo41416e() {
        return C25497c.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    /* renamed from: o */
    public Feature[] mo41792o() {
        return f60541a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public Set<Scope> mo41795r() {
        return Collections.EMPTY_SET;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo41783a(int i, int i2, T t) {
        synchronized (this.f60567x) {
            if (this.f60543A != i) {
                return false;
            }
            m49219a(i2, t);
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006e, code lost:
        mo41777a(8, null, null, r5.f60560p.get());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007a, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo41781a(com.google.android.gms.common.internal.AbstractC25551l r6, java.util.Set<com.google.android.gms.common.api.Scope> r7) {
        /*
        // Method dump skipped, instructions count: 143
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.AbstractC25526c.mo41781a(com.google.android.gms.common.internal.l, java.util.Set):void");
    }

    /* renamed from: a */
    public final void mo41782a(String str, PrintWriter printWriter) {
        int i;
        T t;
        AbstractC25557o oVar;
        synchronized (this.f60567x) {
            i = this.f60543A;
            t = this.f60568y;
        }
        synchronized (this.f60551g) {
            oVar = this.f60552h;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        if (i == 1) {
            printWriter.print("DISCONNECTED");
        } else if (i == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (i == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (i == 4) {
            printWriter.print("CONNECTED");
        } else if (i != 5) {
            printWriter.print("UNKNOWN");
        } else {
            printWriter.print("DISCONNECTING");
        }
        printWriter.append(" mService=");
        if (t == null) {
            printWriter.append("null");
        } else {
            printWriter.append((CharSequence) mo41413b()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(t.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (oVar == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(oVar.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.f60561r > 0) {
            PrintWriter append = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j = this.f60561r;
            String format = simpleDateFormat.format(new Date(this.f60561r));
            append.println(new StringBuilder(String.valueOf(format).length() + 21).append(j).append(" ").append(format).toString());
        }
        if (this.f60547c > 0) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i2 = this.f60546b;
            if (i2 == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i2 != 2) {
                printWriter.append((CharSequence) String.valueOf(i2));
            } else {
                printWriter.append("CAUSE_NETWORK_LOST");
            }
            PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j2 = this.f60547c;
            String format2 = simpleDateFormat.format(new Date(this.f60547c));
            append2.println(new StringBuilder(String.valueOf(format2).length() + 21).append(j2).append(" ").append(format2).toString());
        }
        if (this.f60563t > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) C25353g.m48741a(this.f60562s));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j3 = this.f60563t;
            String format3 = simpleDateFormat.format(new Date(this.f60563t));
            append3.println(new StringBuilder(String.valueOf(format3).length() + 21).append(j3).append(" ").append(format3).toString());
        }
    }

    /* renamed from: d */
    public Intent mo41415d() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public Bundle mo41793p() {
        return new Bundle();
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.google.android.gms.common.internal.c$g */
    public abstract class AbstractC25533g<TListener> {

        /* renamed from: a */
        private TListener f60574a;

        /* renamed from: b */
        private boolean f60575b;

        static {
            Covode.recordClassIndex(30936);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo41803a(TListener tlistener);

        /* renamed from: d */
        public final void mo41807d() {
            synchronized (this) {
                this.f60574a = null;
            }
        }

        /* renamed from: c */
        public final void mo41806c() {
            mo41807d();
            synchronized (AbstractC25526c.this.f60554j) {
                AbstractC25526c.this.f60554j.remove(this);
            }
        }

        /* renamed from: b */
        public final void mo41805b() {
            TListener tlistener;
            synchronized (this) {
                tlistener = this.f60574a;
                if (this.f60575b) {
                    String.valueOf(String.valueOf(this)).length();
                }
            }
            if (tlistener != null) {
                try {
                    mo41803a(tlistener);
                } catch (RuntimeException e) {
                    throw e;
                }
            }
            synchronized (this) {
                this.f60575b = true;
            }
            mo41806c();
        }

        public AbstractC25533g(TListener tlistener) {
            this.f60574a = tlistener;
        }
    }

    /* renamed from: u */
    private final String mo43683u() {
        String str = this.f60545C;
        if (str == null) {
            return this.f60548d.getClass().getName();
        }
        return str;
    }

    /* renamed from: v */
    private final boolean mo43684v() {
        boolean z;
        synchronized (this.f60567x) {
            if (this.f60543A == 3) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: g */
    public final boolean mo41785g() {
        boolean z;
        synchronized (this.f60567x) {
            if (this.f60543A == 4) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: k */
    public final Feature[] mo41789k() {
        zza zza = this.f60559o;
        if (zza == null) {
            return null;
        }
        return zza.f60649b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.google.android.gms.common.internal.c$k */
    public final class C25537k extends AbstractC25532f {
        static {
            Covode.recordClassIndex(30940);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.common.internal.AbstractC25526c.AbstractC25532f
        /* renamed from: a */
        public final boolean mo41804a() {
            AbstractC25526c.this.f60553i.mo41579a(ConnectionResult.f60081a);
            return true;
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.common.internal.AbstractC25526c.AbstractC25532f
        /* renamed from: a */
        public final void mo41802a(ConnectionResult connectionResult) {
            AbstractC25526c.this.f60553i.mo41579a(connectionResult);
            AbstractC25526c.this.mo41778a(connectionResult);
        }

        public C25537k(int i) {
            super(i, null);
        }
    }

    static {
        Covode.recordClassIndex(30929);
    }

    /* renamed from: h */
    public final boolean mo41786h() {
        boolean z;
        synchronized (this.f60567x) {
            int i = this.f60543A;
            if (i == 2 || i == 3) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: j */
    public final String mo41788j() {
        C25516ai aiVar;
        if (mo41785g() && (aiVar = this.f60564u) != null) {
            return aiVar.f60533b;
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    /* renamed from: f */
    public final void mo41784f() {
        this.f60560p.incrementAndGet();
        synchronized (this.f60554j) {
            int size = this.f60554j.size();
            for (int i = 0; i < size; i++) {
                this.f60554j.get(i).mo41807d();
            }
            this.f60554j.clear();
        }
        synchronized (this.f60551g) {
            this.f60552h = null;
        }
        m49219a(1, (IInterface) null);
    }

    /* renamed from: m */
    public final void mo41790m() {
        int isGooglePlayServicesAvailable = this.f60566w.isGooglePlayServicesAvailable(this.f60548d, mo41416e());
        if (isGooglePlayServicesAvailable != 0) {
            m49219a(1, (IInterface) null);
            this.f60553i = (AbstractC25529c) C25565r.m49315a(new C25530d(), "Connection progress callbacks cannot be null.");
            Handler handler = this.f60550f;
            handler.sendMessage(handler.obtainMessage(3, this.f60560p.get(), isGooglePlayServicesAvailable, null));
            return;
        }
        mo41779a(new C25530d());
    }

    /* renamed from: q */
    public final T mo41794q() {
        boolean z;
        T t;
        synchronized (this.f60567x) {
            if (this.f60543A == 5) {
                throw new DeadObjectException();
            } else if (mo41785g()) {
                if (this.f60568y != null) {
                    z = true;
                } else {
                    z = false;
                }
                C25565r.m49321a(z, "Client is connected but service is null");
                t = this.f60568y;
            } else {
                throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
            }
        }
        return t;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final boolean mo41796s() {
        if (this.f60558n || TextUtils.isEmpty(mo41413b()) || TextUtils.isEmpty(null)) {
            return false;
        }
        try {
            Class.forName(mo41413b());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.google.android.gms.common.internal.c$l */
    public final class C25538l extends AbstractC25532f {

        /* renamed from: a */
        private final IBinder f60583a;

        static {
            Covode.recordClassIndex(30941);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: com.google.android.gms.common.internal.c */
        /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: com.google.android.gms.common.internal.c */
        /* JADX WARN: Multi-variable type inference failed */
        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.common.internal.AbstractC25526c.AbstractC25532f
        /* renamed from: a */
        public final boolean mo41804a() {
            try {
                String interfaceDescriptor = this.f60583a.getInterfaceDescriptor();
                if (!AbstractC25526c.this.mo41413b().equals(interfaceDescriptor)) {
                    String.valueOf(AbstractC25526c.this.mo41413b()).length();
                    String.valueOf(interfaceDescriptor).length();
                    return false;
                }
                IInterface a = AbstractC25526c.this.mo41411a(this.f60583a);
                if (a == null) {
                    return false;
                }
                if (!AbstractC25526c.this.mo41783a(2, 4, a) && !AbstractC25526c.this.mo41783a(3, 4, a)) {
                    return false;
                }
                AbstractC25526c.this.f60557m = null;
                if (AbstractC25526c.this.f60555k != null) {
                    AbstractC25526c.this.f60555k.mo41798a();
                }
                return true;
            } catch (RemoteException unused) {
                return false;
            }
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.common.internal.AbstractC25526c.AbstractC25532f
        /* renamed from: a */
        public final void mo41802a(ConnectionResult connectionResult) {
            if (AbstractC25526c.this.f60556l != null) {
                AbstractC25526c.this.f60556l.mo41800a(connectionResult);
            }
            AbstractC25526c.this.mo41778a(connectionResult);
        }

        public C25538l(int i, IBinder iBinder, Bundle bundle) {
            super(i, bundle);
            this.f60583a = iBinder;
        }
    }

    /* renamed from: com.google.android.gms.common.internal.c$d */
    public class C25530d implements AbstractC25529c {
        static {
            Covode.recordClassIndex(30933);
        }

        public C25530d() {
        }

        @Override // com.google.android.gms.common.internal.AbstractC25526c.AbstractC25529c
        /* renamed from: a */
        public final void mo41579a(ConnectionResult connectionResult) {
            if (C46849dr.m90163a()) {
                C40780g.m82241a().execute(new C34831a.RunnableC34834b(this, connectionResult));
            } else {
                mo41801b(connectionResult);
            }
        }

        /* renamed from: b */
        public void mo41801b(ConnectionResult connectionResult) {
            if (connectionResult.mo41434b()) {
                AbstractC25526c cVar = AbstractC25526c.this;
                cVar.mo41781a((AbstractC25551l) null, cVar.mo41795r());
            } else if (AbstractC25526c.this.f60556l != null) {
                AbstractC25526c.this.f60556l.mo41800a(connectionResult);
            }
        }
    }

    /* renamed from: com.google.android.gms.common.internal.c$h */
    final class HandlerC25534h extends HandlerC25734g {
        static {
            Covode.recordClassIndex(30937);
        }

        /* renamed from: a */
        private static void m49266a(Message message) {
            ((AbstractC25533g) message.obj).mo41806c();
        }

        /* renamed from: b */
        private static boolean m49267b(Message message) {
            if (message.what == 2 || message.what == 1 || message.what == 7) {
                return true;
            }
            return false;
        }

        public final void handleMessage(Message message) {
            ConnectionResult connectionResult;
            ConnectionResult connectionResult2;
            if (AbstractC25526c.this.f60560p.get() != message.arg1) {
                if (m49267b(message)) {
                    m49266a(message);
                }
            } else if ((message.what == 1 || message.what == 7 || message.what == 4 || message.what == 5) && !AbstractC25526c.this.mo41786h()) {
                m49266a(message);
            } else if (message.what == 4) {
                AbstractC25526c.this.f60557m = new ConnectionResult(message.arg2);
                if (!AbstractC25526c.this.mo41796s() || AbstractC25526c.this.f60558n) {
                    if (AbstractC25526c.this.f60557m != null) {
                        connectionResult2 = AbstractC25526c.this.f60557m;
                    } else {
                        connectionResult2 = new ConnectionResult(8);
                    }
                    AbstractC25526c.this.f60553i.mo41579a(connectionResult2);
                    AbstractC25526c.this.mo41778a(connectionResult2);
                    return;
                }
                AbstractC25526c.this.m49219a((AbstractC25526c) 3, (int) null);
            } else if (message.what == 5) {
                if (AbstractC25526c.this.f60557m != null) {
                    connectionResult = AbstractC25526c.this.f60557m;
                } else {
                    connectionResult = new ConnectionResult(8);
                }
                AbstractC25526c.this.f60553i.mo41579a(connectionResult);
                AbstractC25526c.this.mo41778a(connectionResult);
            } else {
                PendingIntent pendingIntent = null;
                if (message.what == 3) {
                    if (message.obj instanceof PendingIntent) {
                        pendingIntent = (PendingIntent) message.obj;
                    }
                    ConnectionResult connectionResult3 = new ConnectionResult(message.arg2, pendingIntent);
                    AbstractC25526c.this.f60553i.mo41579a(connectionResult3);
                    AbstractC25526c.this.mo41778a(connectionResult3);
                } else if (message.what == 6) {
                    AbstractC25526c.this.m49219a((AbstractC25526c) 5, (int) null);
                    if (AbstractC25526c.this.f60555k != null) {
                        AbstractC25526c.this.f60555k.mo41799a(message.arg2);
                    }
                    AbstractC25526c cVar = AbstractC25526c.this;
                    cVar.f60546b = message.arg2;
                    cVar.f60547c = System.currentTimeMillis();
                    AbstractC25526c.this.mo41783a(5, 1, null);
                } else if (message.what == 2 && !AbstractC25526c.this.mo41785g()) {
                    m49266a(message);
                } else if (m49267b(message)) {
                    ((AbstractC25533g) message.obj).mo41805b();
                } else {
                    Log.wtf("GmsClient", new StringBuilder(45).append("Don't know how to handle message: ").append(message.what).toString(), new Exception());
                }
            }
        }

        public HandlerC25534h(Looper looper) {
            super(looper);
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m49220a(AbstractC25526c cVar) {
        int i;
        if (cVar.mo43684v()) {
            i = 5;
            cVar.f60558n = true;
        } else {
            i = 4;
        }
        Handler handler = cVar.f60550f;
        handler.sendMessage(handler.obtainMessage(i, cVar.f60560p.get(), 16));
    }

    /* renamed from: com.google.android.gms.common.internal.c$j */
    public final class ServiceConnectionC25536j implements ServiceConnection {

        /* renamed from: a */
        private final int f60580a;

        static {
            Covode.recordClassIndex(30939);
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            MethodCollector.m26663i(8501);
            synchronized (AbstractC25526c.this.f60551g) {
                try {
                    AbstractC25526c.this.f60552h = null;
                } catch (Throwable th) {
                    MethodCollector.m26664o(8501);
                    throw th;
                }
            }
            AbstractC25526c.this.f60550f.sendMessage(AbstractC25526c.this.f60550f.obtainMessage(6, this.f60580a, 1));
            MethodCollector.m26664o(8501);
        }

        public ServiceConnectionC25536j(int i) {
            this.f60580a = i;
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            AbstractC25557o aVar;
            MethodCollector.m26663i(8212);
            if (iBinder == null) {
                AbstractC25526c.m49220a(AbstractC25526c.this);
                MethodCollector.m26664o(8212);
                return;
            }
            synchronized (AbstractC25526c.this.f60551g) {
                try {
                    AbstractC25526c cVar = AbstractC25526c.this;
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof AbstractC25557o)) {
                        aVar = new AbstractC25557o.AbstractBinderC25558a.C25559a(iBinder);
                    } else {
                        aVar = (AbstractC25557o) queryLocalInterface;
                    }
                    cVar.f60552h = aVar;
                } catch (Throwable th) {
                    MethodCollector.m26664o(8212);
                    throw th;
                }
            }
            AbstractC25526c.this.mo41776a(0, this.f60580a);
            MethodCollector.m26664o(8212);
        }
    }

    /* renamed from: com.google.android.gms.common.internal.c$f */
    abstract class AbstractC25532f extends AbstractC25533g<Boolean> {

        /* renamed from: a */
        private final int f60571a;

        /* renamed from: b */
        private final Bundle f60572b;

        static {
            Covode.recordClassIndex(30935);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo41802a(ConnectionResult connectionResult);

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract boolean mo41804a();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.common.internal.AbstractC25526c.AbstractC25533g
        /* renamed from: a */
        public final /* synthetic */ void mo41803a(Boolean bool) {
            if (bool == null) {
                AbstractC25526c.this.m49219a((AbstractC25526c) 1, (int) null);
                return;
            }
            int i = this.f60571a;
            PendingIntent pendingIntent = null;
            if (i != 0) {
                if (i != 10) {
                    AbstractC25526c.this.m49219a((AbstractC25526c) 1, (int) null);
                    Bundle bundle = this.f60572b;
                    if (bundle != null) {
                        pendingIntent = (PendingIntent) bundle.getParcelable("pendingIntent");
                    }
                    mo41802a(new ConnectionResult(this.f60571a, pendingIntent));
                    return;
                }
                AbstractC25526c.this.m49219a((AbstractC25526c) 1, (int) null);
                throw new IllegalStateException(C1764a.m5928a("A fatal developer error has occurred. Class name: %s. Start service action: %s. Service Descriptor: %s. ", new Object[]{getClass().getSimpleName(), AbstractC25526c.this.mo41412a(), AbstractC25526c.this.mo41413b()}));
            } else if (!mo41804a()) {
                AbstractC25526c.this.m49219a((AbstractC25526c) 1, (int) null);
                mo41802a(new ConnectionResult(8, null));
            }
        }

        protected AbstractC25532f(int i, Bundle bundle) {
            super(true);
            this.f60571a = i;
            this.f60572b = bundle;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo41778a(ConnectionResult connectionResult) {
        this.f60562s = connectionResult.f60082b;
        this.f60563t = System.currentTimeMillis();
    }

    /* renamed from: a */
    public final void mo41779a(AbstractC25529c cVar) {
        this.f60553i = (AbstractC25529c) C25565r.m49315a(cVar, "Connection progress callbacks cannot be null.");
        m49219a(2, (IInterface) null);
    }

    /* renamed from: a */
    public final void mo41780a(AbstractC25531e eVar) {
        eVar.mo41617a();
    }

    /* renamed from: com.google.android.gms.common.internal.c$i */
    public static final class BinderC25535i extends AbstractC25555n.AbstractBinderC25556a {

        /* renamed from: a */
        private AbstractC25526c f60578a;

        /* renamed from: b */
        private final int f60579b;

        static {
            Covode.recordClassIndex(30938);
        }

        public BinderC25535i(AbstractC25526c cVar, int i) {
            this.f60578a = cVar;
            this.f60579b = i;
        }

        @Override // com.google.android.gms.common.internal.AbstractC25555n
        /* renamed from: a */
        public final void mo41770a(int i, Bundle bundle) {
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        }

        @Override // com.google.android.gms.common.internal.AbstractC25555n
        /* renamed from: a */
        public final void mo41771a(int i, IBinder iBinder, Bundle bundle) {
            C25565r.m49315a(this.f60578a, "onPostInitComplete can be called only once per call to getRemoteService");
            this.f60578a.mo41777a(i, iBinder, bundle, this.f60579b);
            this.f60578a = null;
        }

        @Override // com.google.android.gms.common.internal.AbstractC25555n
        /* renamed from: a */
        public final void mo41772a(int i, IBinder iBinder, zza zza) {
            C25565r.m49315a(this.f60578a, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            C25565r.m49314a(zza);
            this.f60578a.f60559o = zza;
            mo41771a(i, iBinder, zza.f60648a);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo41776a(int i, int i2) {
        Handler handler = this.f60550f;
        handler.sendMessage(handler.obtainMessage(7, i2, -1, new C25537k(i)));
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private final void m49219a(int i, T t) {
        boolean z;
        boolean z2;
        String str;
        C25516ai aiVar;
        boolean z3 = false;
        if (i == 4) {
            z = true;
        } else {
            z = false;
        }
        if (t != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z == z2) {
            z3 = true;
        }
        C25565r.m49324b(z3);
        synchronized (this.f60567x) {
            this.f60543A = i;
            this.f60568y = t;
            if (i != 1) {
                if (i == 2 || i == 3) {
                    if (!(this.f60569z == null || (aiVar = this.f60564u) == null)) {
                        String str2 = aiVar.f60532a;
                        String str3 = this.f60564u.f60533b;
                        String.valueOf(str2).length();
                        String.valueOf(str3).length();
                        AbstractC25547i iVar = this.f60565v;
                        String str4 = this.f60564u.f60532a;
                        String str5 = this.f60564u.f60533b;
                        int i2 = this.f60564u.f60534c;
                        ServiceConnectionC25536j jVar = this.f60569z;
                        mo43683u();
                        iVar.mo41818a(str4, str5, i2, jVar, this.f60564u.f60535d);
                        this.f60560p.incrementAndGet();
                    }
                    this.f60569z = new ServiceConnectionC25536j(this.f60560p.get());
                    C25516ai aiVar2 = new C25516ai("com.google.android.gms", mo41412a(), mo41797t());
                    this.f60564u = aiVar2;
                    if (!aiVar2.f60535d || mo41416e() >= 17895000) {
                        AbstractC25547i iVar2 = this.f60565v;
                        String str6 = this.f60564u.f60532a;
                        String str7 = this.f60564u.f60533b;
                        int i3 = this.f60564u.f60534c;
                        ServiceConnectionC25536j jVar2 = this.f60569z;
                        mo43683u();
                        if (!iVar2.mo41758a(new AbstractC25547i.C25548a(str6, str7, i3, this.f60564u.f60535d), jVar2)) {
                            String str8 = this.f60564u.f60532a;
                            String str9 = this.f60564u.f60533b;
                            String.valueOf(str8).length();
                            String.valueOf(str9).length();
                            mo41776a(16, this.f60560p.get());
                        }
                    } else {
                        String valueOf = String.valueOf(this.f60564u.f60532a);
                        if (valueOf.length() != 0) {
                            str = "Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(valueOf);
                        } else {
                            str = new String("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ");
                        }
                        throw new IllegalStateException(str);
                    }
                } else if (i == 4) {
                    this.f60561r = System.currentTimeMillis();
                }
            } else if (this.f60569z != null) {
                AbstractC25547i iVar3 = this.f60565v;
                String str10 = this.f60564u.f60532a;
                String str11 = this.f60564u.f60533b;
                int i4 = this.f60564u.f60534c;
                ServiceConnectionC25536j jVar3 = this.f60569z;
                mo43683u();
                iVar3.mo41818a(str10, str11, i4, jVar3, this.f60564u.f60535d);
                this.f60569z = null;
            }
        }
    }

    public AbstractC25526c(Context context, Looper looper, AbstractC25527a aVar, AbstractC25528b bVar) {
        this(context, looper, AbstractC25547i.m49290a(context), C25497c.getInstance(), 93, (AbstractC25527a) C25565r.m49314a(aVar), (AbstractC25528b) C25565r.m49314a(bVar), null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo41777a(int i, IBinder iBinder, Bundle bundle, int i2) {
        Handler handler = this.f60550f;
        handler.sendMessage(handler.obtainMessage(1, i2, -1, new C25538l(i, iBinder, bundle)));
    }

    protected AbstractC25526c(Context context, Looper looper, AbstractC25547i iVar, C25497c cVar, int i, AbstractC25527a aVar, AbstractC25528b bVar, String str) {
        this.f60567x = new Object();
        this.f60551g = new Object();
        this.f60554j = new ArrayList<>();
        this.f60543A = 1;
        this.f60557m = null;
        this.f60558n = false;
        this.f60559o = null;
        this.f60560p = new AtomicInteger(0);
        this.f60548d = (Context) C25565r.m49315a(context, "Context must not be null");
        this.f60549e = (Looper) C25565r.m49315a(looper, "Looper must not be null");
        this.f60565v = (AbstractC25547i) C25565r.m49315a(iVar, "Supervisor must not be null");
        this.f60566w = (C25497c) C25565r.m49315a(cVar, "API availability must not be null");
        this.f60550f = new HandlerC25534h(looper);
        this.f60544B = i;
        this.f60555k = aVar;
        this.f60556l = bVar;
        this.f60545C = str;
    }
}
