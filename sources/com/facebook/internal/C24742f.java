package com.facebook.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.net.Uri;
import android.os.Bundle;
import androidx.browser.p024a.C0479c;
import androidx.browser.p024a.C0483e;
import com.bytedance.covode.number.Covode;
import com.facebook.C24872m;
import com.facebook.internal.p1894a.p1896b.C24677a;
import com.facebook.login.C24846a;

/* renamed from: com.facebook.internal.f */
public class C24742f {

    /* renamed from: a */
    private Uri f58715a;

    static {
        Covode.recordClassIndex(28895);
    }

    public C24742f(String str, Bundle bundle) {
        this.f58715a = m47372a(str, bundle == null ? new Bundle() : bundle);
    }

    /* renamed from: a */
    public static Uri m47372a(String str, Bundle bundle) {
        if (C24677a.m47209a(C24742f.class)) {
            return null;
        }
        try {
            return C24693ad.m47228a(C24691ab.m47224a(), C24872m.m47693e() + "/dialog/" + str, bundle);
        } catch (Throwable th) {
            C24677a.m47208a(th, C24742f.class);
            return null;
        }
    }

    /* renamed from: a */
    public final boolean mo40570a(Activity activity, String str) {
        if (C24677a.m47209a(this)) {
            return false;
        }
        try {
            C0483e eVar = C24846a.f58975a;
            C24846a.f58975a = null;
            C0479c a = new C0479c.C0480a(eVar).mo2041a();
            a.f1822a.setPackage(str);
            a.f1822a.addFlags(1073741824);
            try {
                a.mo2040a(activity, this.f58715a);
                return true;
            } catch (ActivityNotFoundException unused) {
                return false;
            }
        } catch (Throwable th) {
            C24677a.m47208a(th, this);
            return false;
        }
    }
}
