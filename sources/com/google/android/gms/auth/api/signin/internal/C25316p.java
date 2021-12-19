package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.C25565r;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.auth.api.signin.internal.p */
public final class C25316p {

    /* renamed from: a */
    private static C25316p f60059a;

    /* renamed from: b */
    private C25302b f60060b;

    /* renamed from: c */
    private GoogleSignInAccount f60061c;

    /* renamed from: d */
    private GoogleSignInOptions f60062d = this.f60060b.mo41403b();

    static {
        Covode.recordClassIndex(30706);
    }

    /* renamed from: a */
    public final synchronized void mo41422a() {
        MethodCollector.m26663i(9491);
        C25302b bVar = this.f60060b;
        bVar.f60048a.lock();
        try {
            bVar.f60049b.edit().clear().apply();
            bVar.f60048a.unlock();
            this.f60061c = null;
            this.f60062d = null;
            MethodCollector.m26664o(9491);
        } catch (Throwable th) {
            bVar.f60048a.unlock();
            MethodCollector.m26664o(9491);
            throw th;
        }
    }

    private C25316p(Context context) {
        C25302b a = C25302b.m48642a(context);
        this.f60060b = a;
        this.f60061c = a.mo41400a();
    }

    /* renamed from: b */
    private static synchronized C25316p m48678b(Context context) {
        synchronized (C25316p.class) {
            MethodCollector.m26663i(9341);
            C25316p pVar = f60059a;
            if (pVar != null) {
                MethodCollector.m26664o(9341);
                return pVar;
            }
            C25316p pVar2 = new C25316p(context);
            f60059a = pVar2;
            MethodCollector.m26664o(9341);
            return pVar2;
        }
    }

    /* renamed from: a */
    public static synchronized C25316p m48677a(Context context) {
        C25316p b;
        synchronized (C25316p.class) {
            MethodCollector.m26663i(9340);
            Context applicationContext = context.getApplicationContext();
            if (C58003a.f132201c) {
                if (applicationContext == null) {
                    applicationContext = C58003a.f132199a;
                }
            }
            b = m48678b(applicationContext);
            MethodCollector.m26664o(9340);
        }
        return b;
    }

    /* renamed from: a */
    public final synchronized void mo41423a(GoogleSignInOptions googleSignInOptions, GoogleSignInAccount googleSignInAccount) {
        MethodCollector.m26663i(9493);
        C25302b bVar = this.f60060b;
        C25565r.m49314a(googleSignInAccount);
        C25565r.m49314a(googleSignInOptions);
        bVar.mo41402a("defaultGoogleSignInAccount", googleSignInAccount.f59984h);
        C25565r.m49314a(googleSignInAccount);
        C25565r.m49314a(googleSignInOptions);
        String str = googleSignInAccount.f59984h;
        String b = C25302b.m48644b("googleSignInAccount", str);
        JSONObject c = googleSignInAccount.mo41363c();
        c.remove("serverAuthCode");
        bVar.mo41402a(b, c.toString());
        bVar.mo41402a(C25302b.m48644b("googleSignInOptions", str), googleSignInOptions.mo41370b().toString());
        this.f60061c = googleSignInAccount;
        this.f60062d = googleSignInOptions;
        MethodCollector.m26664o(9493);
    }
}
