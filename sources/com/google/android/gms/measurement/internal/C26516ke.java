package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.measurement.internal.ke */
public final class C26516ke {

    /* renamed from: a */
    final C26381ff f62415a;

    static {
        Covode.recordClassIndex(31938);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo43621b() {
        if (this.f62415a.mo43253b().f61924x.mo43209a() > 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo43620a() {
        if (mo43621b() && this.f62415a.mo43011l().mo41857a() - this.f62415a.mo43253b().f61924x.mo43209a() > this.f62415a.f62001e.mo43632a((String) null, C26530p.f62507aS)) {
            return true;
        }
        return false;
    }

    public C26516ke(C26381ff ffVar) {
        this.f62415a = ffVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo43619a(String str, Bundle bundle) {
        String str2;
        this.f62415a.mo43015p().mo43002c();
        if (!this.f62415a.mo43265r()) {
            if (bundle == null || bundle.isEmpty()) {
                str2 = null;
            } else {
                if (str == null || str.isEmpty()) {
                    str = "auto";
                }
                Uri.Builder builder = new Uri.Builder();
                builder.path(str);
                for (String str3 : bundle.keySet()) {
                    builder.appendQueryParameter(str3, bundle.getString(str3));
                }
                str2 = builder.build().toString();
            }
            if (!TextUtils.isEmpty(str2)) {
                this.f62415a.mo43253b().f61923w.mo43214a(str2);
                this.f62415a.mo43253b().f61924x.mo43210a(this.f62415a.mo43011l().mo41857a());
            }
        }
    }
}
