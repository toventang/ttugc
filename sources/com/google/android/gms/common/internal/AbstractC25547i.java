package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.util.Arrays;

/* renamed from: com.google.android.gms.common.internal.i */
public abstract class AbstractC25547i {

    /* renamed from: a */
    private static final Object f60619a = new Object();

    /* renamed from: b */
    private static AbstractC25547i f60620b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo41758a(C25548a aVar, ServiceConnection serviceConnection);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo41759b(C25548a aVar, ServiceConnection serviceConnection);

    /* access modifiers changed from: protected */
    /* renamed from: com.google.android.gms.common.internal.i$a */
    public static final class C25548a {

        /* renamed from: f */
        private static final Uri f60621f = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

        /* renamed from: a */
        public final String f60622a;

        /* renamed from: b */
        public final ComponentName f60623b = null;

        /* renamed from: c */
        public final int f60624c;

        /* renamed from: d */
        private final String f60625d;

        /* renamed from: e */
        private final boolean f60626e;

        public final String toString() {
            String str = this.f60625d;
            if (str == null) {
                return this.f60623b.flattenToString();
            }
            return str;
        }

        static {
            Covode.recordClassIndex(30951);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f60625d, this.f60622a, this.f60623b, Integer.valueOf(this.f60624c), Boolean.valueOf(this.f60626e)});
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C25548a)) {
                return false;
            }
            C25548a aVar = (C25548a) obj;
            if (!C25560p.m49308a(this.f60625d, aVar.f60625d) || !C25560p.m49308a(this.f60622a, aVar.f60622a) || !C25560p.m49308a(this.f60623b, aVar.f60623b) || this.f60624c != aVar.f60624c || this.f60626e != aVar.f60626e) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        public final Intent mo41819a(Context context) {
            Intent component;
            MethodCollector.m26663i(11277);
            if (this.f60625d != null) {
                if (this.f60626e) {
                    Bundle bundle = new Bundle();
                    bundle.putString("serviceActionBundleKey", this.f60625d);
                    Bundle call = context.getContentResolver().call(f60621f, "serviceIntentCall", (String) null, bundle);
                    if (call == null || (component = (Intent) call.getParcelable("serviceResponseIntentKey")) == null) {
                        String valueOf = String.valueOf(this.f60625d);
                        if (valueOf.length() != 0) {
                            "Dynamic lookup for intent failed for action: ".concat(valueOf);
                        } else {
                            new String("Dynamic lookup for intent failed for action: ");
                        }
                    }
                }
                component = new Intent(this.f60625d).setPackage(this.f60622a);
            } else {
                component = new Intent().setComponent(this.f60623b);
            }
            MethodCollector.m26664o(11277);
            return component;
        }

        public C25548a(String str, String str2, int i, boolean z) {
            this.f60625d = C25565r.m49316a(str);
            this.f60622a = C25565r.m49316a(str2);
            this.f60624c = i;
            this.f60626e = z;
        }
    }

    static {
        Covode.recordClassIndex(30950);
    }

    /* renamed from: a */
    public static AbstractC25547i m49290a(Context context) {
        synchronized (f60619a) {
            if (f60620b == null) {
                Context applicationContext = context.getApplicationContext();
                if (C58003a.f132201c) {
                    if (applicationContext == null) {
                        applicationContext = C58003a.f132199a;
                    }
                }
                f60620b = new C25514ag(applicationContext);
            }
        }
        return f60620b;
    }

    /* renamed from: a */
    public final void mo41818a(String str, String str2, int i, ServiceConnection serviceConnection, boolean z) {
        mo41759b(new C25548a(str, str2, i, z), serviceConnection);
    }
}
