package com.bytedance.android.p126a.p136b.p138b.p139a;

import android.os.SystemClock;
import com.bytedance.android.p126a.p127a.p131d.C2626b;
import com.bytedance.android.p126a.p127a.p135h.C2641b;
import com.bytedance.android.p126a.p136b.C2651a;
import com.bytedance.android.p126a.p136b.C2654b;
import com.bytedance.android.p126a.p136b.p138b.C2665b;
import com.bytedance.android.p126a.p136b.p138b.C2667c;
import com.bytedance.android.p126a.p136b.p138b.p139a.AbstractC2661e;
import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.a.b.b.a.g */
public final class C2664g extends AbstractC2656a {
    static {
        Covode.recordClassIndex(3052);
    }

    C2664g(C2651a aVar) {
        super(aVar);
    }

    @Override // com.bytedance.android.p126a.p136b.p138b.p139a.AbstractC2661e, com.bytedance.android.p126a.p136b.p138b.p139a.AbstractC2656a
    /* renamed from: a */
    public final C2667c mo7176a(AbstractC2661e.AbstractC2662a aVar) {
        long uptimeMillis = SystemClock.uptimeMillis();
        C2667c a = super.mo7176a(aVar);
        C2654b.m7680a().mo7172a(a, SystemClock.uptimeMillis() - uptimeMillis);
        return a;
    }

    /* renamed from: b */
    private static JSONObject m7700b(C2667c cVar) {
        String str;
        Throwable th;
        JSONObject jSONObject = new JSONObject();
        if (cVar != null) {
            try {
                str = cVar.f7966b;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        } else {
            str = "RESPONSE IS NULL";
        }
        jSONObject.putOpt("http_msg", str);
        if (!(cVar == null || (th = cVar.f7970f) == null)) {
            jSONObject.putOpt("http_err_class", th.getClass().getCanonicalName());
        }
        return jSONObject;
    }

    @Override // com.bytedance.android.p126a.p136b.p138b.p139a.AbstractC2656a
    /* renamed from: a */
    public final C2667c mo7177a(C2667c cVar) {
        if (!(cVar == null || cVar.f7969e == null)) {
            C2665b bVar = cVar.f7969e;
            C2626b bVar2 = bVar.f7960e;
            int i = cVar.f7965a;
            String str = bVar.f7957b;
            long j = cVar.f7968d;
            JSONObject b = m7700b(cVar);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("track_url_list", str).put("track_status", i).put("local_time_ms", j).put("is_retry", bVar2.f7888j).putOpt("ad_extra_data", b);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            C2641b.m7645a("track_url", bVar2, jSONObject);
        }
        return cVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x00eb A[Catch:{ all -> 0x013a }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f4 A[Catch:{ all -> 0x013a }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0105 A[Catch:{ all -> 0x013a }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x018f  */
    @Override // com.bytedance.android.p126a.p136b.p138b.p139a.AbstractC2656a
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bytedance.android.p126a.p136b.p138b.C2665b mo7175a(com.bytedance.android.p126a.p136b.p138b.C2665b r12) {
        /*
        // Method dump skipped, instructions count: 412
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.p126a.p136b.p138b.p139a.C2664g.mo7175a(com.bytedance.android.a.b.b.b):com.bytedance.android.a.b.b.b");
    }
}
