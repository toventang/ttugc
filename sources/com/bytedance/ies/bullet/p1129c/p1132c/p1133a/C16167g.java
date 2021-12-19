package com.bytedance.ies.bullet.p1129c.p1132c.p1133a;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;
import p4600h.C89379q;
import p4600h.C89382r;

/* renamed from: com.bytedance.ies.bullet.c.c.a.g */
public final class C16167g {

    /* renamed from: a */
    private long f38927a;

    /* renamed from: b */
    private long f38928b;

    /* renamed from: c */
    private long f38929c;

    /* renamed from: d */
    private long f38930d;

    /* renamed from: e */
    private long f38931e;

    /* renamed from: f */
    private long f38932f;

    /* renamed from: g */
    private long f38933g;

    static {
        Covode.recordClassIndex(18460);
    }

    /* renamed from: a */
    public final boolean mo25726a() {
        if (this.f38927a <= 0 || this.f38928b <= 0 || this.f38929c <= 0 || this.f38930d <= 0 || this.f38931e <= 0 || this.f38932f <= 0 || this.f38933g <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final JSONObject mo25727b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("on_call_from_js", this.f38928b - this.f38927a);
            jSONObject.put("on_decode_end", this.f38929c - this.f38927a);
            jSONObject.put("on_method_call", this.f38930d - this.f38927a);
            jSONObject.put("on_callback_start", this.f38931e - this.f38927a);
            jSONObject.put("on_encode_end", this.f38932f - this.f38927a);
            C89379q.m157068constructorimpl(jSONObject.put("on_callback_end", this.f38933g - this.f38927a));
        } catch (Throwable th) {
            C89379q.m157068constructorimpl(C89382r.m154941a(th));
        }
        return jSONObject;
    }

    /* renamed from: a */
    public final void mo25725a(long j) {
        if (j <= 0) {
            j = System.currentTimeMillis();
        }
        this.f38927a = j;
        this.f38928b = j;
    }

    /* renamed from: b */
    public final void mo25728b(long j) {
        if (j <= 0) {
            j = System.currentTimeMillis();
        }
        this.f38929c = j;
    }

    /* renamed from: c */
    public final void mo25729c(long j) {
        if (j <= 0) {
            j = System.currentTimeMillis();
        }
        this.f38930d = j;
    }
}
