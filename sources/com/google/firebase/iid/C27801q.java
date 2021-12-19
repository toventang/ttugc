package com.google.firebase.iid;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.C25565r;
import com.google.android.gms.p1940d.AbstractC25631h;
import com.google.android.gms.p1940d.C25635k;
import com.google.firebase.C27695b;
import com.google.firebase.installations.AbstractC27845g;
import com.google.firebase.installations.AbstractC27850k;
import com.google.firebase.p2011c.AbstractC27706c;
import com.google.firebase.p2014f.AbstractC27749h;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.firebase.iid.q */
public final class C27801q {

    /* renamed from: a */
    private final C27695b f65313a;

    /* renamed from: b */
    private final C27760ae f65314b;

    /* renamed from: c */
    private final C27766aj f65315c;

    /* renamed from: d */
    private final AbstractC27749h f65316d;

    /* renamed from: e */
    private final AbstractC27706c f65317e;

    /* renamed from: f */
    private final AbstractC27845g f65318f;

    static {
        Covode.recordClassIndex(33389);
    }

    /* renamed from: a */
    private String m55581a() {
        try {
            return Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(this.f65313a.mo46326b().getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    /* renamed from: a */
    public final AbstractC25631h<String> mo46447a(AbstractC25631h<Bundle> hVar) {
        return hVar.mo41871a(C27791g.f65294a, new C27802r(this));
    }

    /* renamed from: a */
    public final AbstractC25631h<Bundle> mo46448a(String str, String str2, String str3, Bundle bundle) {
        m55582b(str, str2, str3, bundle);
        return this.f65315c.mo46419a(bundle);
    }

    /* renamed from: b */
    private Bundle m55582b(String str, String str2, String str3, Bundle bundle) {
        String str4;
        Object a;
        bundle.putString("scope", str3);
        bundle.putString("sender", str2);
        bundle.putString("subtype", str2);
        bundle.putString("appid", str);
        bundle.putString("gmp_app_id", this.f65313a.mo46327c().f65179b);
        bundle.putString("gmsv", Integer.toString(this.f65314b.mo46415e()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f65314b.mo46413c());
        bundle.putString("app_ver_name", this.f65314b.mo46414d());
        bundle.putString("firebase-app-name-hash", m55581a());
        try {
            AbstractC25631h<AbstractC27850k> b = this.f65318f.mo46542b();
            C25565r.m49326c("Must not be called on the main application thread");
            C25565r.m49315a(b, "Task must not be null");
            if (b.mo41880a()) {
                a = C25635k.m49514a((AbstractC25631h) b);
            } else {
                C25635k.C25636a aVar = new C25635k.C25636a((byte) 0);
                C25635k.m49516a(b, aVar);
                aVar.f60757a.await();
                a = C25635k.m49514a((AbstractC25631h) b);
            }
            String a2 = ((AbstractC27850k) a).mo46474a();
            if (!TextUtils.isEmpty(a2)) {
                bundle.putString("Goog-Firebase-Installations-Auth", a2);
            }
        } catch (InterruptedException | ExecutionException unused) {
        }
        if ("20.2.3".length() != 0) {
            str4 = "fiid-".concat("20.2.3");
        } else {
            str4 = new String("fiid-");
        }
        bundle.putString("cliv", str4);
        AbstractC27706c.EnumC27707a a3 = this.f65317e.mo46342a("fire-iid");
        if (a3 != AbstractC27706c.EnumC27707a.NONE) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(a3.getCode()));
            bundle.putString("Firebase-Client", this.f65316d.mo46381a());
        }
        return bundle;
    }

    public C27801q(C27695b bVar, C27760ae aeVar, AbstractC27749h hVar, AbstractC27706c cVar, AbstractC27845g gVar) {
        this(bVar, aeVar, new C27766aj(bVar.mo46324a(), aeVar), hVar, cVar, gVar);
    }

    private C27801q(C27695b bVar, C27760ae aeVar, C27766aj ajVar, AbstractC27749h hVar, AbstractC27706c cVar, AbstractC27845g gVar) {
        this.f65313a = bVar;
        this.f65314b = aeVar;
        this.f65315c = ajVar;
        this.f65316d = hVar;
        this.f65317e = cVar;
        this.f65318f = gVar;
    }
}
