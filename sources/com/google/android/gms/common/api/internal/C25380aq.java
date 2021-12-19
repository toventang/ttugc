package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.AbstractC25357i;
import com.google.android.gms.common.api.AbstractC25485p;
import com.google.android.gms.common.api.C25335a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C25446d;
import com.google.android.gms.common.internal.C25539d;
import com.google.android.gms.common.internal.C25545h;
import com.google.android.gms.common.internal.C25565r;
import com.google.android.gms.signin.AbstractC26544d;
import com.google.android.gms.signin.C26541a;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.locks.Lock;

/* renamed from: com.google.android.gms.common.api.internal.aq */
public final class C25380aq extends AbstractC25357i implements AbstractC25401bk {

    /* renamed from: b */
    final Lock f60213b;

    /* renamed from: c */
    final Queue<C25446d.AbstractC25447a<?, ?>> f60214c = new LinkedList();

    /* renamed from: d */
    final Map<C25335a.C25338c<?>, C25335a.AbstractC25343f> f60215d;

    /* renamed from: e */
    Set<Scope> f60216e = new HashSet();

    /* renamed from: f */
    Set<C25412bv> f60217f = null;

    /* renamed from: g */
    final C25416bz f60218g;

    /* renamed from: h */
    private boolean f60219h;

    /* renamed from: i */
    private final C25545h f60220i;

    /* renamed from: j */
    private AbstractC25400bj f60221j;

    /* renamed from: k */
    private final int f60222k;

    /* renamed from: l */
    private final Context f60223l;

    /* renamed from: m */
    private final Looper f60224m;

    /* renamed from: n */
    private volatile boolean f60225n;

    /* renamed from: o */
    private long f60226o = 120000;

    /* renamed from: p */
    private long f60227p = 5000;

    /* renamed from: q */
    private final HandlerC25381ar f60228q;

    /* renamed from: r */
    private final GoogleApiAvailability f60229r;

    /* renamed from: s */
    private C25399bi f60230s;

    /* renamed from: t */
    private final C25539d f60231t;

    /* renamed from: u */
    private final Map<C25335a<?>, Boolean> f60232u;

    /* renamed from: v */
    private final C25335a.AbstractC25336a<? extends AbstractC26544d, C26541a> f60233v;

    /* renamed from: w */
    private final C25461l f60234w = new C25461l();

    /* renamed from: x */
    private final ArrayList<C25432cm> f60235x;

    /* renamed from: y */
    private Integer f60236y = null;

    /* renamed from: z */
    private final C25545h.AbstractC25546a f60237z;

    static {
        Covode.recordClassIndex(30779);
    }

    /* renamed from: c */
    private static String m48856c(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED";
    }

    @Override // com.google.android.gms.common.api.AbstractC25357i
    /* renamed from: b */
    public final Context mo41525b() {
        return this.f60223l;
    }

    @Override // com.google.android.gms.common.api.AbstractC25357i
    /* renamed from: c */
    public final Looper mo41529c() {
        return this.f60224m;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25401bk
    /* renamed from: a */
    public final void mo41586a(ConnectionResult connectionResult) {
        MethodCollector.m26663i(9686);
        if (!this.f60229r.isPlayServicesPossiblyUpdating(this.f60223l, connectionResult.f60082b)) {
            mo41588i();
        }
        if (!this.f60225n) {
            C25545h hVar = this.f60220i;
            C25565r.m49319a(hVar.f60617h, "onConnectionFailure must only be called on the Handler thread");
            hVar.f60617h.removeMessages(1);
            synchronized (hVar.f60618i) {
                try {
                    ArrayList arrayList = new ArrayList(hVar.f60613d);
                    int i = hVar.f60615f.get();
                    int size = arrayList.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            break;
                        }
                        Object obj = arrayList.get(i2);
                        i2++;
                        AbstractC25357i.AbstractC25360c cVar = (AbstractC25357i.AbstractC25360c) obj;
                        if (hVar.f60614e && hVar.f60615f.get() == i) {
                            if (hVar.f60613d.contains(cVar)) {
                                cVar.mo41581a(connectionResult);
                            }
                        }
                    }
                } finally {
                    MethodCollector.m26664o(9686);
                }
            }
            this.f60220i.mo41815a();
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC25357i
    /* renamed from: a */
    public final boolean mo41524a(AbstractC25465p pVar) {
        AbstractC25400bj bjVar = this.f60221j;
        return bjVar != null && bjVar.mo41602a(pVar);
    }

    @Override // com.google.android.gms.common.api.AbstractC25357i
    /* renamed from: a */
    public final void mo41522a(C25412bv bvVar) {
        this.f60213b.lock();
        try {
            if (this.f60217f == null) {
                this.f60217f = new HashSet();
            }
            this.f60217f.add(bvVar);
        } finally {
            this.f60213b.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC25357i
    /* renamed from: a */
    public final void mo41523a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("mContext=").println(this.f60223l);
        printWriter.append((CharSequence) str).append("mResuming=").print(this.f60225n);
        printWriter.append(" mWorkQueue.size()=").print(this.f60214c.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.f60218g.f60308c.size());
        AbstractC25400bj bjVar = this.f60221j;
        if (bjVar != null) {
            bjVar.mo41601a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC25357i
    /* renamed from: d */
    public final void mo41530d() {
        AbstractC25400bj bjVar = this.f60221j;
        if (bjVar != null) {
            bjVar.mo41607e();
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC25357i
    /* renamed from: g */
    public final boolean mo41533g() {
        AbstractC25400bj bjVar = this.f60221j;
        if (bjVar == null || !bjVar.mo41606d()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo41587h() {
        this.f60220i.f60614e = true;
        this.f60221j.mo41597a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final boolean mo41588i() {
        if (!this.f60225n) {
            return false;
        }
        this.f60225n = false;
        this.f60228q.removeMessages(2);
        this.f60228q.removeMessages(1);
        C25399bi biVar = this.f60230s;
        if (biVar != null) {
            biVar.mo41619a();
            this.f60230s = null;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final String mo41590k() {
        StringWriter stringWriter = new StringWriter();
        mo41523a("", null, new PrintWriter(stringWriter), null);
        return stringWriter.toString();
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final boolean mo41589j() {
        this.f60213b.lock();
        try {
            Set<C25412bv> set = this.f60217f;
            if (set == null) {
                this.f60213b.unlock();
                return false;
            }
            boolean z = !set.isEmpty();
            this.f60213b.unlock();
            return z;
        } catch (Throwable th) {
            this.f60213b.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC25357i
    /* renamed from: e */
    public final void mo41531e() {
        this.f60213b.lock();
        try {
            boolean z = false;
            if (this.f60222k >= 0) {
                if (this.f60236y != null) {
                    z = true;
                }
                C25565r.m49321a(z, "Sign-in mode should have been set explicitly by auto-manage.");
            } else {
                Integer num = this.f60236y;
                if (num == null) {
                    this.f60236y = Integer.valueOf(m48853a((Iterable<C25335a.AbstractC25343f>) this.f60215d.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            mo41519a(this.f60236y.intValue());
        } finally {
            this.f60213b.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC25357i
    /* renamed from: f */
    public final void mo41532f() {
        this.f60213b.lock();
        try {
            this.f60218g.mo41637a();
            AbstractC25400bj bjVar = this.f60221j;
            if (bjVar != null) {
                bjVar.mo41604b();
            }
            C25461l lVar = this.f60234w;
            for (C25459k<?> kVar : lVar.f60451a) {
                kVar.f60448a = null;
            }
            lVar.f60451a.clear();
            for (C25446d.AbstractC25447a<?, ?> aVar : this.f60214c) {
                aVar.mo41540a((AbstractC25419ca) null);
                aVar.mo41539a();
            }
            this.f60214c.clear();
            if (this.f60221j != null) {
                mo41588i();
                this.f60220i.mo41815a();
                this.f60213b.unlock();
            }
        } finally {
            this.f60213b.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC25357i
    /* renamed from: a */
    public final void mo41521a(AbstractC25357i.AbstractC25360c cVar) {
        this.f60220i.mo41816a(cVar);
    }

    @Override // com.google.android.gms.common.api.AbstractC25357i
    /* renamed from: a */
    public final <C extends C25335a.AbstractC25343f> C mo41517a(C25335a.C25338c<C> cVar) {
        C c = (C) this.f60215d.get(cVar);
        C25565r.m49315a(c, "Appropriate Api was not requested.");
        return c;
    }

    /* renamed from: a */
    static /* synthetic */ void m48854a(C25380aq aqVar) {
        aqVar.f60213b.lock();
        try {
            if (aqVar.f60225n) {
                aqVar.mo41587h();
            }
        } finally {
            aqVar.f60213b.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC25357i
    /* renamed from: b */
    public final void mo41527b(AbstractC25357i.AbstractC25360c cVar) {
        MethodCollector.m26663i(9681);
        C25545h hVar = this.f60220i;
        C25565r.m49314a(cVar);
        synchronized (hVar.f60618i) {
            try {
                if (!hVar.f60613d.remove(cVar)) {
                    String.valueOf(String.valueOf(cVar)).length();
                }
            } finally {
                MethodCollector.m26664o(9681);
            }
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC25357i
    /* renamed from: a */
    public final <A extends C25335a.AbstractC25337b, R extends AbstractC25485p, T extends C25446d.AbstractC25447a<R, A>> T mo41518a(T t) {
        boolean z;
        String str;
        if (t.f60401a != null) {
            z = true;
        } else {
            z = false;
        }
        C25565r.m49325b(z, "This task can not be enqueued (it's probably a Batch or malformed)");
        boolean containsKey = this.f60215d.containsKey(t.f60401a);
        if (t.f60402b != null) {
            str = t.f60402b.f60112b;
        } else {
            str = "the API";
        }
        C25565r.m49325b(containsKey, new StringBuilder(String.valueOf(str).length() + 65).append("GoogleApiClient is not configured to use ").append(str).append(" required for this call.").toString());
        this.f60213b.lock();
        try {
            AbstractC25400bj bjVar = this.f60221j;
            if (bjVar == null) {
                this.f60214c.add(t);
                return t;
            }
            T t2 = (T) bjVar.mo41596a(t);
            this.f60213b.unlock();
            return t2;
        } finally {
            this.f60213b.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC25357i
    /* renamed from: b */
    public final void mo41528b(C25412bv bvVar) {
        this.f60213b.lock();
        try {
            Set<C25412bv> set = this.f60217f;
            if (set == null) {
                Log.wtf("GoogleApiClientImpl", "Attempted to remove pending transform when no transforms are registered.", new Exception());
            } else if (!set.remove(bvVar)) {
                Log.wtf("GoogleApiClientImpl", "Failed to remove pending transform - this may lead to memory leaks!", new Exception());
            } else if (!mo41589j()) {
                this.f60221j.mo41608f();
            }
        } finally {
            this.f60213b.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC25357i
    /* renamed from: a */
    public final void mo41519a(int i) {
        this.f60213b.lock();
        boolean z = true;
        if (!(i == 3 || i == 1 || i == 2)) {
            z = false;
        }
        try {
            C25565r.m49325b(z, new StringBuilder(33).append("Illegal sign-in mode: ").append(i).toString());
            m48855b(i);
            mo41587h();
        } finally {
            this.f60213b.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC25357i
    /* renamed from: b */
    public final <A extends C25335a.AbstractC25337b, T extends C25446d.AbstractC25447a<? extends AbstractC25485p, A>> T mo41526b(T t) {
        boolean z;
        String str;
        if (t.f60401a != null) {
            z = true;
        } else {
            z = false;
        }
        C25565r.m49325b(z, "This task can not be executed (it's probably a Batch or malformed)");
        boolean containsKey = this.f60215d.containsKey(t.f60401a);
        if (t.f60402b != null) {
            str = t.f60402b.f60112b;
        } else {
            str = "the API";
        }
        C25565r.m49325b(containsKey, new StringBuilder(String.valueOf(str).length() + 65).append("GoogleApiClient is not configured to use ").append(str).append(" required for this call.").toString());
        this.f60213b.lock();
        try {
            if (this.f60221j == null) {
                throw new IllegalStateException("GoogleApiClient is not connected yet.");
            } else if (this.f60225n) {
                this.f60214c.add(t);
                while (!this.f60214c.isEmpty()) {
                    C25446d.AbstractC25447a<?, ?> remove = this.f60214c.remove();
                    this.f60218g.mo41638a(remove);
                    remove.mo41682b(Status.f60102c);
                }
                return t;
            } else {
                T t2 = (T) this.f60221j.mo41603b(t);
                this.f60213b.unlock();
                return t2;
            }
        } finally {
            this.f60213b.unlock();
        }
    }

    /* renamed from: b */
    private final void m48855b(int i) {
        Integer num = this.f60236y;
        if (num == null) {
            this.f60236y = Integer.valueOf(i);
        } else if (num.intValue() != i) {
            String c = m48856c(i);
            String c2 = m48856c(this.f60236y.intValue());
            throw new IllegalStateException(new StringBuilder(String.valueOf(c).length() + 51 + String.valueOf(c2).length()).append("Cannot use sign-in mode: ").append(c).append(". Mode was already set to ").append(c2).toString());
        }
        if (this.f60221j == null) {
            boolean z = false;
            boolean z2 = false;
            for (C25335a.AbstractC25343f fVar : this.f60215d.values()) {
                if (fVar.mo41494i()) {
                    z = true;
                }
                if (fVar.mo41414c()) {
                    z2 = true;
                }
            }
            int intValue = this.f60236y.intValue();
            if (intValue != 1) {
                if (intValue == 2 && z) {
                    if (this.f60219h) {
                        this.f60221j = new C25438cs(this.f60223l, this.f60213b, this.f60224m, this.f60229r, this.f60215d, this.f60231t, this.f60232u, this.f60233v, this.f60235x, this, true);
                        return;
                    } else {
                        this.f60221j = C25433cn.m49012a(this.f60223l, this, this.f60213b, this.f60224m, this.f60229r, this.f60215d, this.f60231t, this.f60232u, this.f60233v, this.f60235x);
                        return;
                    }
                }
            } else if (!z) {
                throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
            } else if (z2) {
                throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            if (!this.f60219h || z2) {
                this.f60221j = new C25386aw(this.f60223l, this, this.f60213b, this.f60224m, this.f60229r, this.f60215d, this.f60231t, this.f60232u, this.f60233v, this.f60235x, this);
            } else {
                this.f60221j = new C25438cs(this.f60223l, this.f60213b, this.f60224m, this.f60229r, this.f60215d, this.f60231t, this.f60232u, this.f60233v, this.f60235x, this, false);
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25401bk
    /* renamed from: a */
    public final void mo41585a(Bundle bundle) {
        boolean z;
        MethodCollector.m26663i(9684);
        while (!this.f60214c.isEmpty()) {
            mo41526b(this.f60214c.remove());
        }
        C25545h hVar = this.f60220i;
        C25565r.m49319a(hVar.f60617h, "onConnectionSuccess must only be called on the Handler thread");
        synchronized (hVar.f60618i) {
            try {
                boolean z2 = true;
                if (!hVar.f60616g) {
                    z = true;
                } else {
                    z = false;
                }
                C25565r.m49320a(z);
                hVar.f60617h.removeMessages(1);
                hVar.f60616g = true;
                if (hVar.f60612c.size() != 0) {
                    z2 = false;
                }
                C25565r.m49320a(z2);
                ArrayList arrayList = new ArrayList(hVar.f60611b);
                int i = hVar.f60615f.get();
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    AbstractC25357i.AbstractC25359b bVar = (AbstractC25357i.AbstractC25359b) obj;
                    if (!hVar.f60614e || !hVar.f60610a.mo41583g() || hVar.f60615f.get() != i) {
                        break;
                    } else if (!hVar.f60612c.contains(bVar)) {
                        bVar.mo34348a(bundle);
                    }
                }
                hVar.f60612c.clear();
                hVar.f60616g = false;
            } finally {
                MethodCollector.m26664o(9684);
            }
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC25357i
    /* renamed from: a */
    public final void mo41520a(ActivityC0945e eVar) {
        C25457i iVar = new C25457i(eVar);
        if (this.f60222k >= 0) {
            C25424cf.m48987b(iVar).mo41651a(this.f60222k);
            return;
        }
        throw new IllegalStateException("Called stopAutoManage but automatic lifecycle management is not enabled.");
    }

    /* renamed from: a */
    public static int m48853a(Iterable<C25335a.AbstractC25343f> iterable, boolean z) {
        boolean z2 = false;
        boolean z3 = false;
        for (C25335a.AbstractC25343f fVar : iterable) {
            if (fVar.mo41494i()) {
                z2 = true;
            }
            if (fVar.mo41414c()) {
                z3 = true;
            }
        }
        if (!z2) {
            return 3;
        }
        if (!z3 || !z) {
            return 1;
        }
        return 2;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25401bk
    /* renamed from: a */
    public final void mo41584a(int i, boolean z) {
        MethodCollector.m26663i(9688);
        if (i == 1 && !z && !this.f60225n) {
            this.f60225n = true;
            if (this.f60230s == null) {
                try {
                    GoogleApiAvailability googleApiAvailability = this.f60229r;
                    Context applicationContext = this.f60223l.getApplicationContext();
                    if (C58003a.f132201c) {
                        if (applicationContext == null) {
                            applicationContext = C58003a.f132199a;
                        }
                    }
                    this.f60230s = googleApiAvailability.zaa(applicationContext, new C25384au(this));
                } catch (SecurityException unused) {
                }
            }
            HandlerC25381ar arVar = this.f60228q;
            arVar.sendMessageDelayed(arVar.obtainMessage(1), this.f60226o);
            HandlerC25381ar arVar2 = this.f60228q;
            arVar2.sendMessageDelayed(arVar2.obtainMessage(2), this.f60227p);
        }
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.f60218g.f60308c.toArray(C25416bz.f60307b)) {
            basePendingResult.mo41546c(C25416bz.f60306a);
        }
        C25545h hVar = this.f60220i;
        C25565r.m49319a(hVar.f60617h, "onUnintentionalDisconnection must only be called on the Handler thread");
        hVar.f60617h.removeMessages(1);
        synchronized (hVar.f60618i) {
            try {
                hVar.f60616g = true;
                ArrayList arrayList = new ArrayList(hVar.f60611b);
                int i2 = hVar.f60615f.get();
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    AbstractC25357i.AbstractC25359b bVar = (AbstractC25357i.AbstractC25359b) obj;
                    if (!hVar.f60614e || hVar.f60615f.get() != i2) {
                        break;
                    } else if (hVar.f60611b.contains(bVar)) {
                        bVar.mo34349b(i);
                    }
                }
                hVar.f60612c.clear();
                hVar.f60616g = false;
            } finally {
                MethodCollector.m26664o(9688);
            }
        }
        this.f60220i.mo41815a();
        if (i == 2) {
            mo41587h();
        }
    }

    public C25380aq(Context context, Lock lock, Looper looper, C25539d dVar, GoogleApiAvailability googleApiAvailability, C25335a.AbstractC25336a<? extends AbstractC26544d, C26541a> aVar, Map<C25335a<?>, Boolean> map, List<AbstractC25357i.AbstractC25359b> list, List<AbstractC25357i.AbstractC25360c> list2, Map<C25335a.C25338c<?>, C25335a.AbstractC25343f> map2, int i, int i2, ArrayList<C25432cm> arrayList) {
        MethodCollector.m26663i(9526);
        C25379ap apVar = new C25379ap(this);
        this.f60237z = apVar;
        this.f60223l = context;
        this.f60213b = lock;
        this.f60219h = false;
        this.f60220i = new C25545h(looper, apVar);
        this.f60224m = looper;
        this.f60228q = new HandlerC25381ar(this, looper);
        this.f60229r = googleApiAvailability;
        this.f60222k = i;
        if (i >= 0) {
            this.f60236y = Integer.valueOf(i2);
        }
        this.f60232u = map;
        this.f60215d = map2;
        this.f60235x = arrayList;
        this.f60218g = new C25416bz(map2);
        for (AbstractC25357i.AbstractC25359b bVar : list) {
            C25545h hVar = this.f60220i;
            C25565r.m49314a(bVar);
            synchronized (hVar.f60618i) {
                try {
                    if (hVar.f60611b.contains(bVar)) {
                        String.valueOf(String.valueOf(bVar)).length();
                    } else {
                        hVar.f60611b.add(bVar);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(9526);
                    throw th;
                }
            }
            if (hVar.f60610a.mo41583g()) {
                hVar.f60617h.sendMessage(hVar.f60617h.obtainMessage(1, bVar));
            }
        }
        for (AbstractC25357i.AbstractC25360c cVar : list2) {
            this.f60220i.mo41816a(cVar);
        }
        this.f60231t = dVar;
        this.f60233v = aVar;
        MethodCollector.m26664o(9526);
    }
}
