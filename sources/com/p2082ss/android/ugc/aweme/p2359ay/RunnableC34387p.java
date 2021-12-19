package com.p2082ss.android.ugc.aweme.p2359ay;

import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.p1477a.C20750g;
import com.bytedance.ttnet.p1703d.C22940b;
import com.facebook.net.C24906g;
import com.p2082ss.android.ugc.aweme.p2359ay.C34384o;
import okhttp3.C90029ac;
import okhttp3.Request;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.ay.p */
final /* synthetic */ class RunnableC34387p implements Runnable {

    /* renamed from: a */
    private final C34384o.C343851 f81294a;

    /* renamed from: b */
    private final C20750g f81295b;

    /* renamed from: c */
    private final C90029ac f81296c;

    /* renamed from: d */
    private final long f81297d;

    /* renamed from: e */
    private final Request f81298e;

    static {
        Covode.recordClassIndex(41331);
    }

    RunnableC34387p(C34384o.C343851 r1, C20750g gVar, C90029ac acVar, long j, Request request) {
        this.f81294a = r1;
        this.f81295b = gVar;
        this.f81296c = acVar;
        this.f81297d = j;
        this.f81298e = request;
    }

    public final void run() {
        C34384o.C343851 r6 = this.f81294a;
        C20750g gVar = this.f81295b;
        C90029ac acVar = this.f81296c;
        long j = this.f81297d;
        Request request = this.f81298e;
        gVar.f48977d = System.currentTimeMillis();
        String str = null;
        if (acVar != null) {
            try {
                str = acVar.mo144718a("x-snssdk.remoteaddr", null);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject.put("image_size", j);
            jSONObject2.put("image_size", j);
            C22940b bVar = new C22940b();
            bVar.f35358a = str;
            if (C34384o.this.f81233b != null) {
                C34384o.this.f81233b.mo60809a(gVar.f48977d - gVar.f48974a, gVar.f48974a, C34384o.this.f81288f.url().toString(), bVar, jSONObject);
            }
            C24906g gVar2 = new C24906g();
            gVar2.f59126b = acVar;
            gVar2.f59127c = request.url().toString();
            jSONObject2.put("http_status", acVar.f204107c);
            jSONObject2.put("requestId", gVar.f48979f);
            try {
                if (gVar.f48975b == 0 || gVar.f48974a == 0) {
                    jSONObject2.put("queue_time", -1L);
                } else {
                    jSONObject2.put("queue_time", gVar.f48975b - gVar.f48974a);
                }
                if (gVar.f48977d == 0 || gVar.f48975b == 0) {
                    jSONObject2.put("fetch_time", -1L);
                } else {
                    jSONObject2.put("fetch_time", gVar.f48977d - gVar.f48975b);
                }
                if (gVar.f48977d == 0 || gVar.f48974a == 0) {
                    jSONObject2.put("total_time", -1L);
                } else {
                    jSONObject2.put("total_time", gVar.f48977d - gVar.f48974a);
                }
            } catch (JSONException unused) {
            }
            if (C34384o.this.f81234c != null) {
                C34384o.this.f81234c.mo39304b(gVar2, bVar, jSONObject2);
            }
        } catch (JSONException unused2) {
        }
    }
}
