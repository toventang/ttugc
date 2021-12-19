package com.google.android.gms.measurement.internal;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.fe */
public final /* synthetic */ class C26380fe implements AbstractC26440hk {

    /* renamed from: a */
    private final C26381ff f61988a;

    static {
        Covode.recordClassIndex(31802);
    }

    C26380fe(C26381ff ffVar) {
        this.f61988a = ffVar;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26440hk
    /* renamed from: a */
    public final void mo43250a(int i, Throwable th, byte[] bArr) {
        List<ResolveInfo> queryIntentActivities;
        C26381ff ffVar = this.f61988a;
        if ((i == 200 || i == 204 || i == 304) && th == null) {
            ffVar.mo43253b().f61920t.mo43205a(true);
            if (bArr.length == 0) {
                ffVar.mo43016q().f61834j.mo43169a("Deferred Deep Link response empty.");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                String optString = jSONObject.optString("deeplink", "");
                String optString2 = jSONObject.optString("gclid", "");
                double optDouble = jSONObject.optDouble("timestamp", 0.0d);
                if (TextUtils.isEmpty(optString)) {
                    ffVar.mo43016q().f61834j.mo43169a("Deferred Deep Link is empty.");
                    return;
                }
                C26510jz e = ffVar.mo43256e();
                if (TextUtils.isEmpty(optString) || (queryIntentActivities = e.mo43012m().getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0)) == null || queryIntentActivities.isEmpty()) {
                    ffVar.mo43016q().f61830f.mo43171a("Deferred Deep Link validation failed. gclid, deep link", optString2, optString);
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putString("gclid", optString2);
                bundle.putString("_cis", "ddp");
                ffVar.f62004h.mo43305a("auto", "_cmp", bundle);
                C26510jz e2 = ffVar.mo43256e();
                if (!TextUtils.isEmpty(optString) && e2.mo43534a(optString, optDouble)) {
                    e2.mo43012m().sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
                }
            } catch (JSONException e3) {
                ffVar.mo43016q().f61827c.mo43170a("Failed to parse the Deferred Deep Link response. exception", e3);
            }
        } else {
            ffVar.mo43016q().f61830f.mo43171a("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i), th);
        }
    }
}
