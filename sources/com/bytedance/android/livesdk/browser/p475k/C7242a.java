package com.bytedance.android.livesdk.browser.p475k;

import android.os.SystemClock;
import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.live.p176b.AbstractC2931h;
import com.bytedance.android.livesdk.p425aa.p429d.C6542d;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;

/* renamed from: com.bytedance.android.livesdk.browser.k.a */
public final class C7242a {

    /* renamed from: a */
    private long f18022a;

    /* renamed from: b */
    private final String f18023b;

    /* renamed from: c */
    private final String f18024c;

    /* renamed from: d */
    private AbstractC2931h f18025d;

    static {
        Covode.recordClassIndex(7988);
    }

    public C7242a(String str, String str2, AbstractC2931h hVar) {
        this.f18023b = str;
        this.f18024c = str2;
        this.f18025d = hVar;
    }

    /* renamed from: a */
    public final void mo13410a(int i, int i2, String str) {
        long j = 0;
        if (i == 0) {
            this.f18022a = SystemClock.uptimeMillis();
        } else {
            long j2 = this.f18022a;
            if (j2 > 0) {
                this.f18022a = 0;
                j = SystemClock.uptimeMillis() - j2;
            } else {
                return;
            }
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("webview_scene", this.f18023b);
        hashMap.put("url", this.f18024c);
        if (i2 != 0) {
            hashMap.put("error_code", Integer.valueOf(i2));
            hashMap.put("error_msg", str);
        }
        C3868c.m9489a(C6542d.m13984a("ttlive_webview_load_status"), i, j, hashMap);
        if (i == 2) {
            C3868c.m9491a(C6542d.m13985b("ttlive_webview_load_status"), i, hashMap);
        }
        AbstractC2931h hVar = this.f18025d;
        if (hVar == null) {
            return;
        }
        if (i == 0) {
            hVar.mo7666a(hashMap);
        } else if (i == 1) {
            hVar.mo7665a(j, hashMap);
        } else if (i == 2) {
            hVar.mo7667b(j, hashMap);
        } else if (i == 3) {
            hVar.mo7668c(j, hashMap);
        }
    }
}
