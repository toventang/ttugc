package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.IInterface;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.AbstractC25357i;
import com.google.android.gms.common.api.C25335a.AbstractC25339d;
import com.google.android.gms.common.api.internal.AbstractC25449e;
import com.google.android.gms.common.api.internal.AbstractC25462m;
import com.google.android.gms.common.internal.AbstractC25526c;
import com.google.android.gms.common.internal.AbstractC25551l;
import com.google.android.gms.common.internal.C25539d;
import com.google.android.gms.common.internal.C25565r;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.gms.common.api.a */
public final class C25335a<O extends AbstractC25339d> {

    /* renamed from: a */
    public final AbstractC25336a<?, O> f60111a;

    /* renamed from: b */
    public final String f60112b;

    /* renamed from: c */
    private final AbstractC25346i<?, O> f60113c = null;

    /* renamed from: d */
    private final C25344g<?> f60114d;

    /* renamed from: e */
    private final C25347j<?> f60115e;

    /* renamed from: com.google.android.gms.common.api.a$b */
    public interface AbstractC25337b {
        static {
            Covode.recordClassIndex(30734);
        }
    }

    /* renamed from: com.google.android.gms.common.api.a$c */
    public static class C25338c<C extends AbstractC25337b> {
        static {
            Covode.recordClassIndex(30735);
        }
    }

    /* renamed from: com.google.android.gms.common.api.a$d */
    public interface AbstractC25339d {

        /* renamed from: com.google.android.gms.common.api.a$d$a */
        public interface AbstractC25340a extends AbstractC25348b, AbstractC25349c {
            static {
                Covode.recordClassIndex(30737);
            }

            /* renamed from: a */
            Account mo41485a();
        }

        /* renamed from: com.google.android.gms.common.api.a$d$b */
        public interface AbstractC25341b extends AbstractC25348b {
            static {
                Covode.recordClassIndex(30738);
            }

            /* renamed from: a */
            GoogleSignInAccount mo41486a();
        }

        static {
            Covode.recordClassIndex(30736);
        }
    }

    /* renamed from: com.google.android.gms.common.api.a$f */
    public interface AbstractC25343f extends AbstractC25337b {
        static {
            Covode.recordClassIndex(30740);
        }

        /* renamed from: a */
        void mo41487a(AbstractC25526c.AbstractC25529c cVar);

        /* renamed from: a */
        void mo41488a(AbstractC25526c.AbstractC25531e eVar);

        /* renamed from: a */
        void mo41489a(AbstractC25551l lVar, Set<Scope> set);

        /* renamed from: a */
        void mo41490a(String str, PrintWriter printWriter);

        /* renamed from: c */
        boolean mo41414c();

        /* renamed from: d */
        Intent mo41415d();

        /* renamed from: e */
        int mo41416e();

        /* renamed from: f */
        void mo41491f();

        /* renamed from: g */
        boolean mo41492g();

        /* renamed from: h */
        boolean mo41493h();

        /* renamed from: i */
        boolean mo41494i();

        /* renamed from: j */
        String mo41495j();

        /* renamed from: k */
        Feature[] mo41496k();

        /* renamed from: l */
        Set<Scope> mo41497l();
    }

    /* renamed from: com.google.android.gms.common.api.a$g */
    public static final class C25344g<C extends AbstractC25343f> extends C25338c<C> {
        static {
            Covode.recordClassIndex(30741);
        }
    }

    /* renamed from: com.google.android.gms.common.api.a$h */
    public interface AbstractC25345h<T extends IInterface> extends AbstractC25337b {
        static {
            Covode.recordClassIndex(30742);
        }

        /* renamed from: a */
        String mo41498a();

        /* renamed from: b */
        String mo41499b();

        /* renamed from: c */
        T mo41500c();
    }

    /* renamed from: com.google.android.gms.common.api.a$i */
    public static abstract class AbstractC25346i<T extends AbstractC25345h<? extends IInterface>, O> extends AbstractC25342e<T, O> {
        static {
            Covode.recordClassIndex(30743);
        }
    }

    /* renamed from: com.google.android.gms.common.api.a$j */
    public static final class C25347j<C extends AbstractC25345h<? extends IInterface>> extends C25338c<C> {
        static {
            Covode.recordClassIndex(30744);
        }
    }

    static {
        Covode.recordClassIndex(30732);
    }

    /* renamed from: a */
    public final AbstractC25336a<?, O> mo41482a() {
        boolean z;
        if (this.f60111a != null) {
            z = true;
        } else {
            z = false;
        }
        C25565r.m49321a(z, "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
        return this.f60111a;
    }

    /* renamed from: b */
    public final C25338c<?> mo41483b() {
        C25344g<?> gVar = this.f60114d;
        if (gVar != null) {
            return gVar;
        }
        throw new IllegalStateException("This API was constructed with null client keys. This should not be possible.");
    }

    /* renamed from: com.google.android.gms.common.api.a$e */
    public static abstract class AbstractC25342e<T extends AbstractC25337b, O> {
        static {
            Covode.recordClassIndex(30739);
        }

        /* renamed from: a */
        public List<Scope> mo41327a(O o) {
            return Collections.emptyList();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.google.android.gms.common.api.a$a<C extends com.google.android.gms.common.api.a$f, O extends com.google.android.gms.common.api.a$d> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.google.android.gms.common.api.a$g<C extends com.google.android.gms.common.api.a$f> */
    /* JADX WARN: Multi-variable type inference failed */
    public <C extends AbstractC25343f> C25335a(String str, AbstractC25336a<C, O> aVar, C25344g<C> gVar) {
        C25565r.m49315a(aVar, "Cannot construct an Api with a null ClientBuilder");
        C25565r.m49315a(gVar, "Cannot construct an Api with a null ClientKey");
        this.f60112b = str;
        this.f60111a = aVar;
        this.f60114d = gVar;
        this.f60115e = null;
    }

    /* renamed from: com.google.android.gms.common.api.a$a */
    public static abstract class AbstractC25336a<T extends AbstractC25343f, O> extends AbstractC25342e<T, O> {
        static {
            Covode.recordClassIndex(30733);
        }

        /* renamed from: a */
        public T mo41299a(Context context, Looper looper, C25539d dVar, O o, AbstractC25357i.AbstractC25359b bVar, AbstractC25357i.AbstractC25360c cVar) {
            return mo41484a(context, looper, dVar, (Object) o, (AbstractC25449e) bVar, (AbstractC25462m) cVar);
        }

        /* renamed from: a */
        public T mo41484a(Context context, Looper looper, C25539d dVar, O o, AbstractC25449e eVar, AbstractC25462m mVar) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }
}
