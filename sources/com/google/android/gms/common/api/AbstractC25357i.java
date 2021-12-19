package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import androidx.p025c.C0484a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.C25335a;
import com.google.android.gms.common.api.internal.AbstractC25449e;
import com.google.android.gms.common.api.internal.AbstractC25462m;
import com.google.android.gms.common.api.internal.AbstractC25465p;
import com.google.android.gms.common.api.internal.C25380aq;
import com.google.android.gms.common.api.internal.C25412bv;
import com.google.android.gms.common.api.internal.C25424cf;
import com.google.android.gms.common.api.internal.C25432cm;
import com.google.android.gms.common.api.internal.C25446d;
import com.google.android.gms.common.api.internal.C25457i;
import com.google.android.gms.common.internal.C25539d;
import com.google.android.gms.common.internal.C25565r;
import com.google.android.gms.signin.AbstractC26544d;
import com.google.android.gms.signin.C26541a;
import com.google.android.gms.signin.C26543c;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.google.android.gms.common.api.i */
public abstract class AbstractC25357i {

    /* renamed from: a */
    static final Set<AbstractC25357i> f60132a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: com.google.android.gms.common.api.i$b */
    public interface AbstractC25359b extends AbstractC25449e {
        static {
            Covode.recordClassIndex(30756);
        }
    }

    /* renamed from: com.google.android.gms.common.api.i$c */
    public interface AbstractC25360c extends AbstractC25462m {
        static {
            Covode.recordClassIndex(30757);
        }
    }

    /* renamed from: a */
    public abstract void mo41520a(ActivityC0945e eVar);

    /* renamed from: a */
    public abstract void mo41521a(AbstractC25360c cVar);

    /* renamed from: a */
    public abstract void mo41523a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* renamed from: b */
    public abstract void mo41527b(AbstractC25360c cVar);

    /* renamed from: e */
    public abstract void mo41531e();

    /* renamed from: f */
    public abstract void mo41532f();

    /* renamed from: g */
    public abstract boolean mo41533g();

    /* renamed from: a */
    public static Set<AbstractC25357i> m48756a() {
        Set<AbstractC25357i> set = f60132a;
        synchronized (set) {
        }
        return set;
    }

    /* renamed from: b */
    public Context mo41525b() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public Looper mo41529c() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: d */
    public void mo41530d() {
        throw new UnsupportedOperationException();
    }

    static {
        Covode.recordClassIndex(30754);
    }

    /* renamed from: com.google.android.gms.common.api.i$a */
    public static final class C25358a {

        /* renamed from: a */
        public final Set<Scope> f60133a = new HashSet();

        /* renamed from: b */
        public final Set<Scope> f60134b = new HashSet();

        /* renamed from: c */
        public final Map<C25335a<?>, C25335a.AbstractC25339d> f60135c = new C0484a();

        /* renamed from: d */
        private Account f60136d;

        /* renamed from: e */
        private int f60137e;

        /* renamed from: f */
        private View f60138f;

        /* renamed from: g */
        private String f60139g;

        /* renamed from: h */
        private String f60140h;

        /* renamed from: i */
        private final Map<C25335a<?>, C25539d.C25541b> f60141i = new C0484a();

        /* renamed from: j */
        private boolean f60142j = false;

        /* renamed from: k */
        private final Context f60143k;

        /* renamed from: l */
        private C25457i f60144l;

        /* renamed from: m */
        private int f60145m = -1;

        /* renamed from: n */
        private AbstractC25360c f60146n;

        /* renamed from: o */
        private Looper f60147o;

        /* renamed from: p */
        private GoogleApiAvailability f60148p = GoogleApiAvailability.getInstance();

        /* renamed from: q */
        private C25335a.AbstractC25336a<? extends AbstractC26544d, C26541a> f60149q = C26543c.f62635a;

        /* renamed from: r */
        private final ArrayList<AbstractC25359b> f60150r = new ArrayList<>();

        /* renamed from: s */
        private final ArrayList<AbstractC25360c> f60151s = new ArrayList<>();

        /* renamed from: t */
        private boolean f60152t = false;

        static {
            Covode.recordClassIndex(30755);
        }

        /* renamed from: a */
        public final AbstractC25357i mo41537a() {
            boolean z;
            boolean z2;
            MethodCollector.m26663i(8731);
            C25565r.m49325b(!this.f60135c.isEmpty(), "must call addApi() to add at least one API");
            C26541a aVar = C26541a.f62625a;
            if (this.f60135c.containsKey(C26543c.f62636b)) {
                aVar = (C26541a) this.f60135c.get(C26543c.f62636b);
            }
            C25539d dVar = new C25539d(this.f60136d, this.f60133a, this.f60141i, this.f60137e, this.f60138f, this.f60139g, this.f60140h, aVar, false);
            C25335a<?> aVar2 = null;
            Map<C25335a<?>, C25539d.C25541b> map = dVar.f60588d;
            C0484a aVar3 = new C0484a();
            C0484a aVar4 = new C0484a();
            ArrayList arrayList = new ArrayList();
            Iterator<C25335a<?>> it = this.f60135c.keySet().iterator();
            while (true) {
                boolean z3 = false;
                if (it.hasNext()) {
                    C25335a<?> next = it.next();
                    C25335a.AbstractC25339d dVar2 = this.f60135c.get(next);
                    if (map.get(next) != null) {
                        z3 = true;
                    }
                    aVar3.put(next, Boolean.valueOf(z3));
                    C25432cm cmVar = new C25432cm(next, z3);
                    arrayList.add(cmVar);
                    C25335a.AbstractC25343f a = next.mo41482a().mo41299a(this.f60143k, this.f60147o, dVar, (Object) dVar2, (AbstractC25359b) cmVar, (AbstractC25360c) cmVar);
                    aVar4.put(next.mo41483b(), a);
                    if (a.mo41414c()) {
                        if (aVar2 == null) {
                            aVar2 = next;
                        } else {
                            String str = next.f60112b;
                            String str2 = aVar2.f60112b;
                            IllegalStateException illegalStateException = new IllegalStateException(new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length()).append(str).append(" cannot be used with ").append(str2).toString());
                            MethodCollector.m26664o(8731);
                            throw illegalStateException;
                        }
                    }
                } else {
                    if (aVar2 != null) {
                        if (this.f60136d == null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        z = true;
                        C25565r.m49322a(z2, "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead", aVar2.f60112b);
                        C25565r.m49322a(this.f60133a.equals(this.f60134b), "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", aVar2.f60112b);
                    } else {
                        z = true;
                    }
                    C25380aq aqVar = new C25380aq(this.f60143k, new ReentrantLock(), this.f60147o, dVar, this.f60148p, this.f60149q, aVar3, this.f60150r, this.f60151s, aVar4, this.f60145m, C25380aq.m48853a(aVar4.values(), z), arrayList);
                    synchronized (AbstractC25357i.f60132a) {
                        try {
                            AbstractC25357i.f60132a.add(aqVar);
                        } finally {
                            MethodCollector.m26664o(8731);
                        }
                    }
                    if (this.f60145m >= 0) {
                        C25424cf.m48987b(this.f60144l).mo41652a(this.f60145m, aqVar, this.f60146n);
                    }
                    return aqVar;
                }
            }
        }

        /* renamed from: a */
        public final C25358a mo41536a(AbstractC25359b bVar) {
            C25565r.m49315a(bVar, "Listener must not be null");
            this.f60150r.add(bVar);
            return this;
        }

        /* renamed from: a */
        public final C25358a mo41535a(C25335a<? extends AbstractC25349c> aVar) {
            C25565r.m49315a(aVar, "Api must not be null");
            this.f60135c.put(aVar, null);
            List<Scope> a = aVar.f60111a.mo41327a(null);
            this.f60134b.addAll(a);
            this.f60133a.addAll(a);
            return this;
        }

        public C25358a(Context context) {
            this.f60143k = context;
            this.f60147o = context.getMainLooper();
            this.f60139g = context.getPackageName();
            this.f60140h = context.getClass().getName();
        }

        /* renamed from: a */
        public final C25358a mo41534a(ActivityC0945e eVar, AbstractC25360c cVar) {
            C25457i iVar = new C25457i(eVar);
            C25565r.m49325b(true, "clientId must be non-negative");
            this.f60145m = 0;
            this.f60146n = cVar;
            this.f60144l = iVar;
            return this;
        }
    }

    /* renamed from: a */
    public <C extends C25335a.AbstractC25343f> C mo41517a(C25335a.C25338c<C> cVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public <A extends C25335a.AbstractC25337b, T extends C25446d.AbstractC25447a<? extends AbstractC25485p, A>> T mo41526b(T t) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public <A extends C25335a.AbstractC25337b, R extends AbstractC25485p, T extends C25446d.AbstractC25447a<R, A>> T mo41518a(T t) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public void mo41528b(C25412bv bvVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public void mo41519a(int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public void mo41522a(C25412bv bvVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public boolean mo41524a(AbstractC25465p pVar) {
        throw new UnsupportedOperationException();
    }
}
