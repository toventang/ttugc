package com.p2082ss.android.ugc.aweme.player.sdk.p3552a;

import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.player.sdk.p3552a.C62966e;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.player.sdk.a.k */
public final class C63008k {

    /* renamed from: a */
    int f143099a;

    /* renamed from: b */
    int f143100b;

    static {
        Covode.recordClassIndex(73845);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.player.sdk.a.k$a */
    public static class C63009a {

        /* renamed from: a */
        private final HashMap<String, Object> f143101a = new HashMap<>();

        static {
            Covode.recordClassIndex(73846);
        }

        /* renamed from: a */
        public final synchronized JSONObject mo101096a() {
            JSONObject jSONObject;
            MethodCollector.m26663i(11516);
            try {
                jSONObject = new JSONObject(this.f143101a);
                MethodCollector.m26664o(11516);
            } catch (Exception e) {
                e.printStackTrace();
                MethodCollector.m26664o(11516);
                return null;
            }
            return jSONObject;
        }

        /* renamed from: a */
        public final C63009a mo101095a(String str, Integer num) {
            this.f143101a.put(str, num);
            return this;
        }
    }

    /* renamed from: a */
    private void m113584a() {
        if (C62966e.C62967a.f142928a.f142927a != null) {
            new C63009a().mo101095a("prepare_hash", Integer.valueOf(this.f143099a)).mo101095a("start_hash", Integer.valueOf(this.f143100b)).mo101096a();
        }
    }

    /* renamed from: a */
    public final void mo101094a(Surface surface) {
        if (surface != null) {
            this.f143100b = surface.hashCode();
        }
        if (this.f143099a != this.f143100b) {
            m113584a();
        }
    }
}
