package com.google.android.gms.auth.api.signin;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.auth.api.C25253a;
import com.google.android.gms.auth.api.signin.internal.C25302b;
import com.google.android.gms.auth.api.signin.internal.C25309i;
import com.google.android.gms.auth.api.signin.internal.C25311k;
import com.google.android.gms.auth.api.signin.internal.RunnableC25306f;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.AbstractC25357i;
import com.google.android.gms.common.api.AbstractC25485p;
import com.google.android.gms.common.api.C25335a;
import com.google.android.gms.common.api.C25354h;
import com.google.android.gms.common.api.C25480l;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC25466q;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.C25363a;
import com.google.android.gms.common.internal.C25562q;
import com.google.android.gms.common.internal.C25565r;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.p1940d.AbstractC25631h;

public class GoogleSignInClient extends C25354h<GoogleSignInOptions> {

    /* renamed from: i */
    private static final C25291b f59991i = new C25291b((byte) 0);

    /* renamed from: j */
    private static int f59992j = C25290a.f59993a;

    /* renamed from: com.google.android.gms.auth.api.signin.GoogleSignInClient$b */
    static class C25291b implements C25562q.AbstractC25563a<C25294b, GoogleSignInAccount> {
        static {
            Covode.recordClassIndex(30675);
        }

        private C25291b() {
        }

        /* synthetic */ C25291b(byte b) {
            this();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.common.api.p] */
        @Override // com.google.android.gms.common.internal.C25562q.AbstractC25563a
        /* renamed from: a */
        public final /* synthetic */ GoogleSignInAccount mo41368a(C25294b bVar) {
            return bVar.f60030b;
        }
    }

    /* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
    /* renamed from: com.google.android.gms.auth.api.signin.GoogleSignInClient$a */
    public static final class C25290a {

        /* renamed from: a */
        public static final int f59993a = 1;

        /* renamed from: b */
        public static final int f59994b = 2;

        /* renamed from: c */
        public static final int f59995c = 3;

        /* renamed from: d */
        public static final int f59996d = 4;

        /* renamed from: e */
        private static final /* synthetic */ int[] f59997e = {1, 2, 3, 4};

        static {
            Covode.recordClassIndex(30674);
        }
    }

    static {
        Covode.recordClassIndex(30673);
    }

    /* renamed from: a */
    public final synchronized int mo41298a() {
        int i;
        MethodCollector.m26663i(9955);
        if (f59992j == C25290a.f59993a) {
            Context context = this.f60118a;
            GoogleApiAvailability instance = GoogleApiAvailability.getInstance();
            int isGooglePlayServicesAvailable = instance.isGooglePlayServicesAvailable(context, 12451000);
            if (isGooglePlayServicesAvailable == 0) {
                f59992j = C25290a.f59996d;
            } else if (instance.getErrorResolutionIntent(context, isGooglePlayServicesAvailable, null) != null || DynamiteModule.m49542a(context, "com.google.android.gms.auth.api.fallback") == 0) {
                f59992j = C25290a.f59994b;
            } else {
                f59992j = C25290a.f59995c;
            }
        }
        i = f59992j;
        MethodCollector.m26664o(9955);
        return i;
    }

    /* renamed from: b */
    public final AbstractC25631h<Void> mo41367b() {
        boolean z;
        BasePendingResult b;
        AbstractC25357i iVar = this.f60124g;
        Context context = this.f60118a;
        if (mo41298a() == C25290a.f59995c) {
            z = true;
        } else {
            z = false;
        }
        C25309i.f60056a.mo41461a("Revoking access", new Object[0]);
        String a = C25302b.m48642a(context).mo41401a("refreshToken");
        C25309i.m48667a(context);
        if (!z) {
            b = iVar.mo41526b(new C25311k(iVar));
        } else if (a == null) {
            Status status = new Status(4);
            C25565r.m49315a(status, "Result must not be null");
            C25565r.m49325b(!status.mo41384D_().mo41477c(), "Status code must not be SUCCESS");
            b = new C25480l.C25481a(status);
            b.mo41542a((AbstractC25485p) status);
        } else {
            RunnableC25306f fVar = new RunnableC25306f(a);
            new Thread(fVar).start();
            b = fVar.f60053a;
        }
        return C25562q.m49310a(b);
    }

    GoogleSignInClient(Activity activity, GoogleSignInOptions googleSignInOptions) {
        super(activity, (C25335a) C25253a.f59869e, (C25335a.AbstractC25339d) googleSignInOptions, (AbstractC25466q) new C25363a());
    }

    public GoogleSignInClient(Context context, GoogleSignInOptions googleSignInOptions) {
        super(context, C25253a.f59869e, googleSignInOptions, new C25363a());
    }
}
