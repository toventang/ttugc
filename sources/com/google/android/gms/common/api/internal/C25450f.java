package com.google.android.gms.common.api.internal;

import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.p025c.C0484a;
import androidx.p025c.C0486b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.AbstractC25357i;
import com.google.android.gms.common.api.AbstractC25477j;
import com.google.android.gms.common.api.C25335a;
import com.google.android.gms.common.api.C25354h;
import com.google.android.gms.common.api.C25490u;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C25459k;
import com.google.android.gms.common.internal.AbstractC25526c;
import com.google.android.gms.common.internal.AbstractC25551l;
import com.google.android.gms.common.internal.C25550k;
import com.google.android.gms.common.internal.C25560p;
import com.google.android.gms.common.internal.C25565r;
import com.google.android.gms.common.internal.C25566s;
import com.google.android.gms.common.util.C25600b;
import com.google.android.gms.internal.p1945d.HandlerC25727g;
import com.google.android.gms.p1940d.AbstractC25631h;
import com.google.android.gms.p1940d.C25632i;
import com.google.android.gms.signin.AbstractC26544d;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.common.api.internal.f */
public final class C25450f implements Handler.Callback {

    /* renamed from: a */
    public static final Status f60403a = new Status(4, "Sign-out occurred while this API call was in progress.");

    /* renamed from: b */
    static final Status f60404b = new Status(4, "The user must be signed in to make this API call.");

    /* renamed from: f */
    static final Object f60405f = new Object();

    /* renamed from: p */
    private static C25450f f60406p;

    /* renamed from: c */
    long f60407c = 5000;

    /* renamed from: d */
    long f60408d = 120000;

    /* renamed from: e */
    long f60409e = 10000;

    /* renamed from: g */
    final Context f60410g;

    /* renamed from: h */
    final GoogleApiAvailability f60411h;

    /* renamed from: i */
    final C25550k f60412i;

    /* renamed from: j */
    public final AtomicInteger f60413j = new AtomicInteger(1);

    /* renamed from: k */
    public final AtomicInteger f60414k = new AtomicInteger(0);

    /* renamed from: l */
    final Map<C25390b<?>, C25451a<?>> f60415l = new ConcurrentHashMap(5, 0.75f, 1);

    /* renamed from: m */
    C25474x f60416m = null;

    /* renamed from: n */
    final Set<C25390b<?>> f60417n = new C0486b();

    /* renamed from: o */
    public final Handler f60418o;

    /* renamed from: q */
    private final Set<C25390b<?>> f60419q = new C0486b();

    /* renamed from: com.google.android.gms.common.api.internal.f$a */
    public class C25451a<O extends C25335a.AbstractC25339d> implements AbstractC25357i.AbstractC25360c, AbstractC25434co {

        /* renamed from: a */
        public final C25335a.AbstractC25343f f60420a;

        /* renamed from: b */
        final Set<C25426cg> f60421b = new HashSet();

        /* renamed from: c */
        public final Map<C25459k.C25460a<?>, C25403bm> f60422c = new HashMap();

        /* renamed from: d */
        public final int f60423d;

        /* renamed from: e */
        final BinderC25408br f60424e;

        /* renamed from: f */
        boolean f60425f;

        /* renamed from: g */
        final List<C25453c> f60426g = new ArrayList();

        /* renamed from: i */
        private final Queue<AbstractC25404bn> f60428i = new LinkedList();

        /* renamed from: j */
        private final C25335a.AbstractC25337b f60429j;

        /* renamed from: k */
        private final C25390b<O> f60430k;

        /* renamed from: l */
        private final C25441cv f60431l;

        /* renamed from: m */
        private ConnectionResult f60432m = null;

        static {
            Covode.recordClassIndex(30850);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final boolean mo41696a(boolean z) {
            C25565r.m49318a(C25450f.this.f60418o);
            if (!this.f60420a.mo41492g() || this.f60422c.size() != 0) {
                return false;
            }
            if (this.f60431l.mo41666a()) {
                if (z) {
                    m49094j();
                }
                return false;
            }
            this.f60420a.mo41491f();
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo41695a(C25453c cVar) {
            Feature[] a;
            if (this.f60426g.remove(cVar)) {
                C25450f.this.f60418o.removeMessages(15, cVar);
                C25450f.this.f60418o.removeMessages(16, cVar);
                Feature feature = cVar.f60440b;
                ArrayList arrayList = new ArrayList(this.f60428i.size());
                for (AbstractC25404bn bnVar : this.f60428i) {
                    if ((bnVar instanceof AbstractC25382as) && (a = ((AbstractC25382as) bnVar).mo41592a((C25451a<?>) this)) != null && C25600b.m49403a(a, feature)) {
                        arrayList.add(bnVar);
                    }
                }
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    AbstractC25404bn bnVar2 = (AbstractC25404bn) obj;
                    this.f60428i.remove(bnVar2);
                    bnVar2.mo41623a(new C25490u(feature));
                }
            }
        }

        /* renamed from: i */
        public final boolean mo41704i() {
            return this.f60420a.mo41494i();
        }

        /* renamed from: e */
        public final void mo41700e() {
            C25565r.m49318a(C25450f.this.f60418o);
            this.f60432m = null;
        }

        /* renamed from: f */
        public final ConnectionResult mo41701f() {
            C25565r.m49318a(C25450f.this.f60418o);
            return this.f60432m;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public final void mo41702g() {
            if (this.f60425f) {
                C25450f.this.f60418o.removeMessages(11, this.f60430k);
                C25450f.this.f60418o.removeMessages(9, this.f60430k);
                this.f60425f = false;
            }
        }

        /* renamed from: j */
        private final void m49094j() {
            C25450f.this.f60418o.removeMessages(12, this.f60430k);
            C25450f.this.f60418o.sendMessageDelayed(C25450f.this.f60418o.obtainMessage(12, this.f60430k), C25450f.this.f60409e);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo41692a() {
            mo41700e();
            m49092c(ConnectionResult.f60081a);
            mo41702g();
            Iterator<C25403bm> it = this.f60422c.values().iterator();
            while (it.hasNext()) {
                if (m49089a(it.next().f60277a.f60453b) != null) {
                    it.remove();
                }
            }
            mo41698c();
            m49094j();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final void mo41697b() {
            mo41700e();
            this.f60425f = true;
            this.f60431l.mo41668c();
            C25450f.this.f60418o.sendMessageDelayed(Message.obtain(C25450f.this.f60418o, 9, this.f60430k), C25450f.this.f60407c);
            C25450f.this.f60418o.sendMessageDelayed(Message.obtain(C25450f.this.f60418o, 11, this.f60430k), C25450f.this.f60408d);
            C25450f.this.f60412i.f60630a.clear();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public final void mo41698c() {
            ArrayList arrayList = new ArrayList(this.f60428i);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                AbstractC25404bn bnVar = (AbstractC25404bn) obj;
                if (!this.f60420a.mo41492g()) {
                    return;
                }
                if (m49091b(bnVar)) {
                    this.f60428i.remove(bnVar);
                }
            }
        }

        /* renamed from: d */
        public final void mo41699d() {
            C25565r.m49318a(C25450f.this.f60418o);
            mo41693a(C25450f.f60403a);
            this.f60431l.mo41667b();
            for (C25459k.C25460a aVar : (C25459k.C25460a[]) this.f60422c.keySet().toArray(new C25459k.C25460a[this.f60422c.size()])) {
                mo41694a(new C25423ce(aVar, new C25632i()));
            }
            m49092c(new ConnectionResult(4));
            if (this.f60420a.mo41492g()) {
                this.f60420a.mo41488a(new C25395be(this));
            }
        }

        /* renamed from: h */
        public final void mo41703h() {
            C25565r.m49318a(C25450f.this.f60418o);
            if (!this.f60420a.mo41492g() && !this.f60420a.mo41493h()) {
                int a = C25450f.this.f60412i.mo41823a(C25450f.this.f60410g, this.f60420a);
                if (a != 0) {
                    mo41581a(new ConnectionResult(a, null));
                    return;
                }
                C25452b bVar = new C25452b(this.f60420a, this.f60430k);
                if (this.f60420a.mo41494i()) {
                    this.f60424e.mo41627a(bVar);
                }
                this.f60420a.mo41487a(bVar);
            }
        }

        /* renamed from: c */
        private final void m49093c(AbstractC25404bn bnVar) {
            bnVar.mo41622a(this.f60431l, mo41704i());
            try {
                bnVar.mo41624c(this);
            } catch (DeadObjectException unused) {
                mo34349b(1);
                this.f60420a.mo41491f();
            }
        }

        @Override // com.google.android.gms.common.api.internal.AbstractC25449e
        /* renamed from: a */
        public final void mo34348a(Bundle bundle) {
            if (Looper.myLooper() == C25450f.this.f60418o.getLooper()) {
                mo41692a();
            } else {
                C25450f.this.f60418o.post(new RunnableC25391ba(this));
            }
        }

        @Override // com.google.android.gms.common.api.internal.AbstractC25449e
        /* renamed from: b */
        public final void mo34349b(int i) {
            if (Looper.myLooper() == C25450f.this.f60418o.getLooper()) {
                mo41697b();
            } else {
                C25450f.this.f60418o.post(new RunnableC25393bc(this));
            }
        }

        /* renamed from: b */
        private final boolean m49090b(ConnectionResult connectionResult) {
            MethodCollector.m26663i(10162);
            synchronized (C25450f.f60405f) {
                try {
                    if (C25450f.this.f60416m == null || !C25450f.this.f60417n.contains(this.f60430k)) {
                        MethodCollector.m26664o(10162);
                        return false;
                    }
                    C25450f.this.f60416m.mo41656b(connectionResult, this.f60423d);
                    return true;
                } finally {
                    MethodCollector.m26664o(10162);
                }
            }
        }

        /* renamed from: c */
        private final void m49092c(ConnectionResult connectionResult) {
            for (C25426cg cgVar : this.f60421b) {
                String str = null;
                if (C25560p.m49308a(connectionResult, ConnectionResult.f60081a)) {
                    str = this.f60420a.mo41495j();
                }
                cgVar.mo41655a(this.f60430k, connectionResult, str);
            }
            this.f60421b.clear();
        }

        /* renamed from: a */
        private final Feature m49089a(Feature[] featureArr) {
            if (!(featureArr == null || featureArr.length == 0)) {
                Feature[] k = this.f60420a.mo41496k();
                if (k == null) {
                    k = new Feature[0];
                }
                C0484a aVar = new C0484a(k.length);
                for (Feature feature : k) {
                    aVar.put(feature.f60086a, Long.valueOf(feature.mo41439a()));
                }
                for (Feature feature2 : featureArr) {
                    if (!aVar.containsKey(feature2.f60086a) || ((Long) aVar.get(feature2.f60086a)).longValue() < feature2.mo41439a()) {
                        return feature2;
                    }
                }
            }
            return null;
        }

        /* renamed from: b */
        private final boolean m49091b(AbstractC25404bn bnVar) {
            if (!(bnVar instanceof AbstractC25382as)) {
                m49093c(bnVar);
                return true;
            }
            AbstractC25382as asVar = (AbstractC25382as) bnVar;
            Feature a = m49089a(asVar.mo41592a((C25451a<?>) this));
            if (a == null) {
                m49093c(bnVar);
                return true;
            }
            if (asVar.mo41593b(this)) {
                C25453c cVar = new C25453c(this.f60430k, a, (byte) 0);
                int indexOf = this.f60426g.indexOf(cVar);
                if (indexOf >= 0) {
                    C25453c cVar2 = this.f60426g.get(indexOf);
                    C25450f.this.f60418o.removeMessages(15, cVar2);
                    C25450f.this.f60418o.sendMessageDelayed(Message.obtain(C25450f.this.f60418o, 15, cVar2), C25450f.this.f60407c);
                } else {
                    this.f60426g.add(cVar);
                    C25450f.this.f60418o.sendMessageDelayed(Message.obtain(C25450f.this.f60418o, 15, cVar), C25450f.this.f60407c);
                    C25450f.this.f60418o.sendMessageDelayed(Message.obtain(C25450f.this.f60418o, 16, cVar), C25450f.this.f60408d);
                    ConnectionResult connectionResult = new ConnectionResult(2, null);
                    if (!m49090b(connectionResult)) {
                        C25450f.this.mo41688a(connectionResult, this.f60423d);
                    }
                }
            } else {
                asVar.mo41623a(new C25490u(a));
            }
            return false;
        }

        @Override // com.google.android.gms.common.api.internal.AbstractC25462m
        /* renamed from: a */
        public final void mo41581a(ConnectionResult connectionResult) {
            C25565r.m49318a(C25450f.this.f60418o);
            BinderC25408br brVar = this.f60424e;
            if (brVar != null) {
                brVar.mo41626a();
            }
            mo41700e();
            C25450f.this.f60412i.f60630a.clear();
            m49092c(connectionResult);
            if (connectionResult.f60082b == 4) {
                mo41693a(C25450f.f60404b);
            } else if (this.f60428i.isEmpty()) {
                this.f60432m = connectionResult;
            } else if (!m49090b(connectionResult) && !C25450f.this.mo41688a(connectionResult, this.f60423d)) {
                if (connectionResult.f60082b == 18) {
                    this.f60425f = true;
                }
                if (this.f60425f) {
                    C25450f.this.f60418o.sendMessageDelayed(Message.obtain(C25450f.this.f60418o, 9, this.f60430k), C25450f.this.f60407c);
                    return;
                }
                String str = this.f60430k.f60260b.f60112b;
                String valueOf = String.valueOf(connectionResult);
                mo41693a(new Status(17, new StringBuilder(String.valueOf(str).length() + 63 + String.valueOf(valueOf).length()).append("API: ").append(str).append(" is not available on this device. Connection failed with: ").append(valueOf).toString()));
            }
        }

        /* renamed from: a */
        public final void mo41693a(Status status) {
            C25565r.m49318a(C25450f.this.f60418o);
            for (AbstractC25404bn bnVar : this.f60428i) {
                bnVar.mo41621a(status);
            }
            this.f60428i.clear();
        }

        /* renamed from: a */
        public final void mo41694a(AbstractC25404bn bnVar) {
            C25565r.m49318a(C25450f.this.f60418o);
            if (!this.f60420a.mo41492g()) {
                this.f60428i.add(bnVar);
                ConnectionResult connectionResult = this.f60432m;
                if (connectionResult == null || !connectionResult.mo41433a()) {
                    mo41703h();
                } else {
                    mo41581a(this.f60432m);
                }
            } else if (m49091b(bnVar)) {
                m49094j();
            } else {
                this.f60428i.add(bnVar);
            }
        }

        public C25451a(C25354h<O> hVar) {
            C25335a.AbstractC25343f a = hVar.mo41507a(C25450f.this.f60418o.getLooper(), this);
            this.f60420a = a;
            if (a instanceof C25566s) {
                this.f60429j = ((C25566s) a).f60636a;
            } else {
                this.f60429j = a;
            }
            this.f60430k = hVar.f60121d;
            this.f60431l = new C25441cv();
            this.f60423d = hVar.f60123f;
            if (a.mo41494i()) {
                this.f60424e = hVar.mo41508a(C25450f.this.f60410g, C25450f.this.f60418o);
            } else {
                this.f60424e = null;
            }
        }

        @Override // com.google.android.gms.common.api.internal.AbstractC25434co
        /* renamed from: a */
        public final void mo41599a(ConnectionResult connectionResult, C25335a<?> aVar, boolean z) {
            if (Looper.myLooper() == C25450f.this.f60418o.getLooper()) {
                mo41581a(connectionResult);
            } else {
                C25450f.this.f60418o.post(new RunnableC25392bb(this, connectionResult));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.common.api.internal.f$b */
    public class C25452b implements AbstractC25409bs, AbstractC25526c.AbstractC25529c {

        /* renamed from: a */
        final C25335a.AbstractC25343f f60433a;

        /* renamed from: b */
        final C25390b<?> f60434b;

        /* renamed from: c */
        boolean f60435c;

        /* renamed from: e */
        private AbstractC25551l f60437e;

        /* renamed from: f */
        private Set<Scope> f60438f;

        static {
            Covode.recordClassIndex(30851);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo41705a() {
            AbstractC25551l lVar;
            if (this.f60435c && (lVar = this.f60437e) != null) {
                this.f60433a.mo41489a(lVar, this.f60438f);
            }
        }

        @Override // com.google.android.gms.common.internal.AbstractC25526c.AbstractC25529c
        /* renamed from: a */
        public final void mo41579a(ConnectionResult connectionResult) {
            C25450f.this.f60418o.post(new RunnableC25397bg(this, connectionResult));
        }

        @Override // com.google.android.gms.common.api.internal.AbstractC25409bs
        /* renamed from: b */
        public final void mo41629b(ConnectionResult connectionResult) {
            C25451a<?> aVar = C25450f.this.f60415l.get(this.f60434b);
            C25565r.m49318a(C25450f.this.f60418o);
            aVar.f60420a.mo41491f();
            aVar.mo41581a(connectionResult);
        }

        @Override // com.google.android.gms.common.api.internal.AbstractC25409bs
        /* renamed from: a */
        public final void mo41628a(AbstractC25551l lVar, Set<Scope> set) {
            if (lVar == null || set == null) {
                Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                mo41629b(new ConnectionResult(4));
                return;
            }
            this.f60437e = lVar;
            this.f60438f = set;
            mo41705a();
        }

        public C25452b(C25335a.AbstractC25343f fVar, C25390b<?> bVar) {
            this.f60433a = fVar;
            this.f60434b = bVar;
        }
    }

    /* renamed from: c */
    public final void mo41690c() {
        Handler handler = this.f60418o;
        handler.sendMessage(handler.obtainMessage(3));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.common.api.internal.f$c */
    public static class C25453c {

        /* renamed from: a */
        final C25390b<?> f60439a;

        /* renamed from: b */
        final Feature f60440b;

        static {
            Covode.recordClassIndex(30852);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f60439a, this.f60440b});
        }

        public final String toString() {
            return C25560p.m49307a(this).mo41827a("key", this.f60439a).mo41827a("feature", this.f60440b).toString();
        }

        public final boolean equals(Object obj) {
            if (obj != null && (obj instanceof C25453c)) {
                C25453c cVar = (C25453c) obj;
                if (!C25560p.m49308a(this.f60439a, cVar.f60439a) || !C25560p.m49308a(this.f60440b, cVar.f60440b)) {
                    return false;
                }
                return true;
            }
            return false;
        }

        private C25453c(C25390b<?> bVar, Feature feature) {
            this.f60439a = bVar;
            this.f60440b = feature;
        }

        /* synthetic */ C25453c(C25390b bVar, Feature feature, byte b) {
            this(bVar, feature);
        }
    }

    static {
        Covode.recordClassIndex(30849);
    }

    /* renamed from: a */
    public static C25450f m49077a() {
        C25450f fVar;
        MethodCollector.m26663i(9841);
        synchronized (f60405f) {
            try {
                C25565r.m49315a(f60406p, "Must guarantee manager is non-null before using getInstance");
                fVar = f60406p;
            } finally {
                MethodCollector.m26664o(9841);
            }
        }
        return fVar;
    }

    /* renamed from: b */
    public static void m49080b() {
        MethodCollector.m26663i(9843);
        synchronized (f60405f) {
            try {
                C25450f fVar = f60406p;
                if (fVar != null) {
                    fVar.f60414k.incrementAndGet();
                    Handler handler = fVar.f60418o;
                    handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
                }
            } finally {
                MethodCollector.m26664o(9843);
            }
        }
    }

    /* renamed from: b */
    private static Context m49079b(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    /* renamed from: a */
    public final void mo41686a(C25354h<?> hVar) {
        Handler handler = this.f60418o;
        handler.sendMessage(handler.obtainMessage(7, hVar));
    }

    /* renamed from: a */
    public static C25450f m49078a(Context context) {
        C25450f fVar;
        MethodCollector.m26663i(9693);
        synchronized (f60405f) {
            try {
                if (f60406p == null) {
                    HandlerThread handlerThread = new HandlerThread("GoogleApiHandler", 9);
                    handlerThread.start();
                    f60406p = new C25450f(m49079b(context), handlerThread.getLooper(), GoogleApiAvailability.getInstance());
                }
                fVar = f60406p;
            } finally {
                MethodCollector.m26664o(9693);
            }
        }
        return fVar;
    }

    /* renamed from: b */
    private final void m49081b(C25354h<?> hVar) {
        C25390b<O> bVar = hVar.f60121d;
        C25451a<?> aVar = this.f60415l.get(bVar);
        if (aVar == null) {
            aVar = new C25451a<>(hVar);
            this.f60415l.put(bVar, aVar);
        }
        if (aVar.mo41704i()) {
            this.f60419q.add(bVar);
        }
        aVar.mo41703h();
    }

    /* renamed from: a */
    public final AbstractC25631h<Map<C25390b<?>, String>> mo41685a(Iterable<? extends AbstractC25477j<?>> iterable) {
        C25426cg cgVar = new C25426cg(iterable);
        Handler handler = this.f60418o;
        handler.sendMessage(handler.obtainMessage(2, cgVar));
        return cgVar.f60328b.f60753a;
    }

    /* renamed from: a */
    public final void mo41687a(C25474x xVar) {
        MethodCollector.m26663i(9999);
        synchronized (f60405f) {
            try {
                if (this.f60416m != xVar) {
                    this.f60416m = xVar;
                    this.f60417n.clear();
                }
                this.f60417n.addAll(xVar.f60466b);
            } finally {
                MethodCollector.m26664o(9999);
            }
        }
    }

    public final boolean handleMessage(Message message) {
        Status status;
        long j = 300000;
        switch (message.what) {
            case 1:
                if (((Boolean) message.obj).booleanValue()) {
                    j = 10000;
                }
                this.f60409e = j;
                this.f60418o.removeMessages(12);
                for (C25390b<?> bVar : this.f60415l.keySet()) {
                    Handler handler = this.f60418o;
                    handler.sendMessageDelayed(handler.obtainMessage(12, bVar), this.f60409e);
                }
                break;
            case 2:
                C25426cg cgVar = (C25426cg) message.obj;
                Iterator<C25390b<?>> it = cgVar.f60327a.keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else {
                        C25390b<?> next = it.next();
                        C25451a<?> aVar = this.f60415l.get(next);
                        if (aVar == null) {
                            cgVar.mo41655a(next, new ConnectionResult(13), null);
                            break;
                        } else if (aVar.f60420a.mo41492g()) {
                            cgVar.mo41655a(next, ConnectionResult.f60081a, aVar.f60420a.mo41495j());
                        } else if (aVar.mo41701f() != null) {
                            cgVar.mo41655a(next, aVar.mo41701f(), null);
                        } else {
                            C25565r.m49318a(C25450f.this.f60418o);
                            aVar.f60421b.add(cgVar);
                            aVar.mo41703h();
                        }
                    }
                }
            case 3:
                for (C25451a<?> aVar2 : this.f60415l.values()) {
                    aVar2.mo41700e();
                    aVar2.mo41703h();
                }
                break;
            case 4:
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
            case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                C25402bl blVar = (C25402bl) message.obj;
                C25451a<?> aVar3 = this.f60415l.get(blVar.f60276c.f60121d);
                if (aVar3 == null) {
                    m49081b(blVar.f60276c);
                    aVar3 = this.f60415l.get(blVar.f60276c.f60121d);
                }
                if (!aVar3.mo41704i() || this.f60414k.get() == blVar.f60275b) {
                    aVar3.mo41694a(blVar.f60274a);
                    break;
                } else {
                    blVar.f60274a.mo41621a(f60403a);
                    aVar3.mo41699d();
                    break;
                }
                break;
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                int i = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                Iterator<C25451a<?>> it2 = this.f60415l.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        C25451a<?> next2 = it2.next();
                        if (next2.f60423d == i) {
                            String errorString = this.f60411h.getErrorString(connectionResult.f60082b);
                            String str = connectionResult.f60084d;
                            next2.mo41693a(new Status(17, new StringBuilder(String.valueOf(errorString).length() + 69 + String.valueOf(str).length()).append("Error resolution was canceled by the user, original error message: ").append(errorString).append(": ").append(str).toString()));
                            break;
                        }
                    } else {
                        Log.wtf("GoogleApiManager", new StringBuilder(76).append("Could not find API instance ").append(i).append(" while trying to fail enqueued calls.").toString(), new Exception());
                        break;
                    }
                }
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                if (m49079b(this.f60410g) instanceof Application) {
                    ComponentCallbacks2C25417c.m48960a((Application) m49079b(this.f60410g));
                    ComponentCallbacks2C25417c.f60311a.mo41639a(new C25389az(this));
                    ComponentCallbacks2C25417c cVar = ComponentCallbacks2C25417c.f60311a;
                    if (!cVar.f60313c.get()) {
                        int i2 = Build.VERSION.SDK_INT;
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        if (!cVar.f60313c.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                            cVar.f60312b.set(true);
                        }
                    }
                    if (!cVar.f60312b.get()) {
                        this.f60409e = 300000;
                        break;
                    }
                }
                break;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                m49081b((C25354h) message.obj);
                break;
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                if (this.f60415l.containsKey(message.obj)) {
                    C25451a<?> aVar4 = this.f60415l.get(message.obj);
                    C25565r.m49318a(C25450f.this.f60418o);
                    if (aVar4.f60425f) {
                        aVar4.mo41703h();
                        break;
                    }
                }
                break;
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                for (C25390b<?> bVar2 : this.f60419q) {
                    this.f60415l.remove(bVar2).mo41699d();
                }
                this.f60419q.clear();
                break;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                if (this.f60415l.containsKey(message.obj)) {
                    C25451a<?> aVar5 = this.f60415l.get(message.obj);
                    C25565r.m49318a(C25450f.this.f60418o);
                    if (aVar5.f60425f) {
                        aVar5.mo41702g();
                        if (C25450f.this.f60411h.isGooglePlayServicesAvailable(C25450f.this.f60410g) == 18) {
                            status = new Status(8, "Connection timed out while waiting for Google Play services update to complete.");
                        } else {
                            status = new Status(8, "API failed to connect while resuming due to an unknown error.");
                        }
                        aVar5.mo41693a(status);
                        aVar5.f60420a.mo41491f();
                        break;
                    }
                }
                break;
            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                if (this.f60415l.containsKey(message.obj)) {
                    this.f60415l.get(message.obj).mo41696a(true);
                    break;
                }
                break;
            case ABRConfig.ABR_SELECT_SCENE:
                C25475y yVar = (C25475y) message.obj;
                C25390b<?> bVar3 = yVar.f60468a;
                if (!this.f60415l.containsKey(bVar3)) {
                    yVar.f60469b.mo41894a((Boolean) false);
                    break;
                } else {
                    yVar.f60469b.mo41894a(Boolean.valueOf(this.f60415l.get(bVar3).mo41696a(false)));
                    break;
                }
            case 15:
                C25453c cVar2 = (C25453c) message.obj;
                if (this.f60415l.containsKey(cVar2.f60439a)) {
                    C25451a<?> aVar6 = this.f60415l.get(cVar2.f60439a);
                    if (aVar6.f60426g.contains(cVar2) && !aVar6.f60425f) {
                        if (!aVar6.f60420a.mo41492g()) {
                            aVar6.mo41703h();
                            break;
                        } else {
                            aVar6.mo41698c();
                            break;
                        }
                    }
                }
                break;
            case 16:
                C25453c cVar3 = (C25453c) message.obj;
                if (this.f60415l.containsKey(cVar3.f60439a)) {
                    this.f60415l.get(cVar3.f60439a).mo41695a(cVar3);
                    break;
                }
                break;
            default:
                int i3 = message.what;
                return false;
        }
        return true;
    }

    /* renamed from: b */
    public final void mo41689b(ConnectionResult connectionResult, int i) {
        if (!mo41688a(connectionResult, i)) {
            Handler handler = this.f60418o;
            handler.sendMessage(handler.obtainMessage(5, i, 0, connectionResult));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final PendingIntent mo41684a(C25390b<?> bVar, int i) {
        AbstractC26544d dVar;
        C25451a<?> aVar = this.f60415l.get(bVar);
        if (aVar == null || aVar.f60424e == null || (dVar = aVar.f60424e.f60284b) == null) {
            return null;
        }
        return PendingIntent.getActivity(this.f60410g, i, dVar.mo41415d(), 134217728);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo41688a(ConnectionResult connectionResult, int i) {
        return this.f60411h.zaa(this.f60410g, connectionResult, i);
    }

    private C25450f(Context context, Looper looper, GoogleApiAvailability googleApiAvailability) {
        this.f60410g = context;
        HandlerC25727g gVar = new HandlerC25727g(looper, this);
        this.f60418o = gVar;
        this.f60411h = googleApiAvailability;
        this.f60412i = new C25550k(googleApiAvailability);
        gVar.sendMessage(gVar.obtainMessage(6));
    }
}
