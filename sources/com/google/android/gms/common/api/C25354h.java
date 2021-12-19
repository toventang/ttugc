package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.AbstractC25357i;
import com.google.android.gms.common.api.C25335a;
import com.google.android.gms.common.api.C25335a.AbstractC25339d;
import com.google.android.gms.common.api.internal.AbstractC25458j;
import com.google.android.gms.common.api.internal.AbstractC25466q;
import com.google.android.gms.common.api.internal.AbstractC25468s;
import com.google.android.gms.common.api.internal.BinderC25408br;
import com.google.android.gms.common.api.internal.C25363a;
import com.google.android.gms.common.api.internal.C25390b;
import com.google.android.gms.common.api.internal.C25396bf;
import com.google.android.gms.common.api.internal.C25402bl;
import com.google.android.gms.common.api.internal.C25420cb;
import com.google.android.gms.common.api.internal.C25422cd;
import com.google.android.gms.common.api.internal.C25446d;
import com.google.android.gms.common.api.internal.C25450f;
import com.google.android.gms.common.api.internal.C25474x;
import com.google.android.gms.common.internal.C25539d;
import com.google.android.gms.common.internal.C25565r;
import com.google.android.gms.p1940d.AbstractC25631h;
import com.google.android.gms.p1940d.C25632i;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.util.Collections;
import java.util.Set;

/* renamed from: com.google.android.gms.common.api.h */
public class C25354h<O extends C25335a.AbstractC25339d> implements AbstractC25477j<O> {

    /* renamed from: a */
    public final Context f60118a;

    /* renamed from: b */
    public final C25335a<O> f60119b;

    /* renamed from: c */
    public final O f60120c;

    /* renamed from: d */
    public final C25390b<O> f60121d;

    /* renamed from: e */
    public final Looper f60122e;

    /* renamed from: f */
    public final int f60123f;

    /* renamed from: g */
    public final AbstractC25357i f60124g;

    /* renamed from: h */
    protected final C25450f f60125h;

    /* renamed from: i */
    private final AbstractC25466q f60126i;

    static {
        Covode.recordClassIndex(30751);
    }

    @Override // com.google.android.gms.common.api.AbstractC25477j
    /* renamed from: c */
    public final C25390b<O> mo41513c() {
        return this.f60121d;
    }

    /* renamed from: com.google.android.gms.common.api.h$a */
    public static class C25355a {

        /* renamed from: a */
        public static final C25355a f60127a = new C25356a().mo41516a();

        /* renamed from: b */
        public final AbstractC25466q f60128b;

        /* renamed from: c */
        public final Looper f60129c;

        /* renamed from: com.google.android.gms.common.api.h$a$a */
        public static class C25356a {

            /* renamed from: a */
            private AbstractC25466q f60130a;

            /* renamed from: b */
            private Looper f60131b;

            static {
                Covode.recordClassIndex(30753);
            }

            /* renamed from: a */
            public final C25355a mo41516a() {
                if (this.f60130a == null) {
                    this.f60130a = new C25363a();
                }
                if (this.f60131b == null) {
                    this.f60131b = Looper.getMainLooper();
                }
                return new C25355a(this.f60130a, this.f60131b, (byte) 0);
            }

            /* renamed from: a */
            public final C25356a mo41514a(Looper looper) {
                C25565r.m49315a(looper, "Looper must not be null.");
                this.f60131b = looper;
                return this;
            }

            /* renamed from: a */
            public final C25356a mo41515a(AbstractC25466q qVar) {
                C25565r.m49315a(qVar, "StatusExceptionMapper must not be null.");
                this.f60130a = qVar;
                return this;
            }
        }

        static {
            Covode.recordClassIndex(30752);
        }

        private C25355a(AbstractC25466q qVar, Looper looper) {
            this.f60128b = qVar;
            this.f60129c = looper;
        }

        /* synthetic */ C25355a(AbstractC25466q qVar, Looper looper, byte b) {
            this(qVar, looper);
        }
    }

    /* renamed from: a */
    private C25539d.C25540a mo41298a() {
        Account account;
        Set<Scope> emptySet;
        GoogleSignInAccount a;
        GoogleSignInAccount a2;
        C25539d.C25540a aVar = new C25539d.C25540a();
        O o = this.f60120c;
        if (!(o instanceof C25335a.AbstractC25339d.AbstractC25341b) || (a2 = ((C25335a.AbstractC25339d.AbstractC25341b) o).mo41486a()) == null) {
            O o2 = this.f60120c;
            if (o2 instanceof C25335a.AbstractC25339d.AbstractC25340a) {
                account = ((C25335a.AbstractC25339d.AbstractC25340a) o2).mo41485a();
            } else {
                account = null;
            }
        } else {
            account = a2.mo41361a();
        }
        aVar.f60596a = account;
        O o3 = this.f60120c;
        if (!(o3 instanceof C25335a.AbstractC25339d.AbstractC25341b) || (a = ((C25335a.AbstractC25339d.AbstractC25341b) o3).mo41486a()) == null) {
            emptySet = Collections.emptySet();
        } else {
            emptySet = a.mo41362b();
        }
        C25539d.C25540a a3 = aVar.mo41811a(emptySet);
        a3.f60598c = this.f60118a.getClass().getName();
        a3.f60597b = this.f60118a.getPackageName();
        return a3;
    }

    /* renamed from: a */
    public final <A extends C25335a.AbstractC25337b, T extends C25446d.AbstractC25447a<? extends AbstractC25485p, A>> T mo41509a(T t) {
        return (T) m48743a(0, t);
    }

    /* renamed from: b */
    public final <A extends C25335a.AbstractC25337b, T extends C25446d.AbstractC25447a<? extends AbstractC25485p, A>> T mo41511b(T t) {
        return (T) m48743a(1, t);
    }

    /* renamed from: a */
    private static Context m48742a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    /* renamed from: b */
    public final <TResult, A extends C25335a.AbstractC25337b> AbstractC25631h<TResult> mo41512b(AbstractC25468s<A, TResult> sVar) {
        return m48745a(1, sVar);
    }

    /* renamed from: a */
    public final <TResult, A extends C25335a.AbstractC25337b> AbstractC25631h<TResult> mo41510a(AbstractC25468s<A, TResult> sVar) {
        return m48745a(0, sVar);
    }

    /* renamed from: a */
    public C25335a.AbstractC25343f mo41507a(Looper looper, C25450f.C25451a<O> aVar) {
        return this.f60119b.mo41482a().mo41299a(this.f60118a, looper, mo41298a().mo41812a(), this.f60120c, (AbstractC25357i.AbstractC25359b) aVar, (AbstractC25357i.AbstractC25360c) aVar);
    }

    /* renamed from: a */
    private final <A extends C25335a.AbstractC25337b, T extends C25446d.AbstractC25447a<? extends AbstractC25485p, A>> T m48743a(int i, T t) {
        t.mo41548e();
        C25450f fVar = this.f60125h;
        fVar.f60418o.sendMessage(fVar.f60418o.obtainMessage(4, new C25402bl(new C25420cb(i, t), fVar.f60414k.get(), this)));
        return t;
    }

    /* renamed from: a */
    private final <TResult, A extends C25335a.AbstractC25337b> AbstractC25631h<TResult> m48745a(int i, AbstractC25468s<A, TResult> sVar) {
        C25632i iVar = new C25632i();
        C25450f fVar = this.f60125h;
        fVar.f60418o.sendMessage(fVar.f60418o.obtainMessage(4, new C25402bl(new C25422cd(i, sVar, iVar, this.f60126i), fVar.f60414k.get(), this)));
        return iVar.f60753a;
    }

    /* renamed from: a */
    public BinderC25408br mo41508a(Context context, Handler handler) {
        return new BinderC25408br(context, handler, mo41298a().mo41812a());
    }

    public C25354h(Context context, C25335a<O> aVar, Looper looper) {
        C25565r.m49315a(context, "Null context is not permitted.");
        C25565r.m49315a(aVar, "Api must not be null.");
        C25565r.m49315a(looper, "Looper must not be null.");
        Context a = m48742a(context);
        this.f60118a = a;
        this.f60119b = aVar;
        this.f60120c = null;
        this.f60122e = looper;
        this.f60121d = new C25390b<>(aVar);
        this.f60124g = new C25396bf(this);
        C25450f a2 = C25450f.m49078a(a);
        this.f60125h = a2;
        this.f60123f = a2.f60413j.getAndIncrement();
        this.f60126i = new C25363a();
    }

    public C25354h(Activity activity, C25335a<O> aVar, O o, AbstractC25466q qVar) {
        this(activity, (C25335a) aVar, (C25335a.AbstractC25339d) o, new C25355a.C25356a().mo41515a(qVar).mo41514a(activity.getMainLooper()).mo41516a());
    }

    public C25354h(Activity activity, C25335a<O> aVar, O o, C25355a aVar2) {
        C25565r.m49315a(activity, "Null activity is not permitted.");
        C25565r.m49315a(aVar, "Api must not be null.");
        C25565r.m49315a(aVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = activity.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        this.f60118a = applicationContext;
        this.f60119b = aVar;
        this.f60120c = o;
        this.f60122e = aVar2.f60129c;
        C25390b<O> a = C25390b.m48910a(aVar, o);
        this.f60121d = a;
        this.f60124g = new C25396bf(this);
        C25450f a2 = C25450f.m49078a(applicationContext);
        this.f60125h = a2;
        this.f60123f = a2.f60413j.getAndIncrement();
        this.f60126i = aVar2.f60128b;
        if (!(activity instanceof GoogleApiActivity)) {
            AbstractC25458j a3 = C25474x.m48794a(activity);
            C25474x xVar = (C25474x) a3.mo41670a("ConnectionlessLifecycleHelper", C25474x.class);
            xVar = xVar == null ? new C25474x(a3) : xVar;
            xVar.f60467c = a2;
            C25565r.m49315a(a, "ApiKey cannot be null");
            xVar.f60466b.add(a);
            a2.mo41687a(xVar);
        }
        a2.mo41686a((C25354h<?>) this);
    }

    public C25354h(Context context, C25335a<O> aVar, O o, C25355a aVar2) {
        C25565r.m49315a(context, "Null context is not permitted.");
        C25565r.m49315a(aVar, "Api must not be null.");
        C25565r.m49315a(aVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context a = m48742a(context);
        this.f60118a = a;
        this.f60119b = aVar;
        this.f60120c = o;
        this.f60122e = aVar2.f60129c;
        this.f60121d = C25390b.m48910a(aVar, o);
        this.f60124g = new C25396bf(this);
        C25450f a2 = C25450f.m49078a(a);
        this.f60125h = a2;
        this.f60123f = a2.f60413j.getAndIncrement();
        this.f60126i = aVar2.f60128b;
        a2.mo41686a((C25354h<?>) this);
    }

    public C25354h(Context context, C25335a<O> aVar, O o, AbstractC25466q qVar) {
        this(context, aVar, o, new C25355a.C25356a().mo41515a(qVar).mo41516a());
    }

    public C25354h(Context context, C25335a<O> aVar, O o, Looper looper, AbstractC25466q qVar) {
        this(context, aVar, o, new C25355a.C25356a().mo41514a(looper).mo41515a(qVar).mo41516a());
    }
}
