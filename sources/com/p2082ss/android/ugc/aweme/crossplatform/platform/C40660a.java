package com.p2082ss.android.ugc.aweme.crossplatform.platform;

import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.a */
public final class C40660a {

    /* renamed from: a */
    public static final C40660a f95239a = new C40660a();

    private C40660a() {
    }

    static {
        Covode.recordClassIndex(48500);
    }

    /* renamed from: a */
    public static final void m82031a(String str, boolean z, boolean z2) {
        JSONObject put = new JSONObject().put("jump_url", str).put("jump_has_click", z).put("jump_block_by", "blocked");
        if (z2) {
            put.put("container_type", "bullet");
        }
        C12290b.m22060a("h5_block_app_url", 0, put);
    }

    /* renamed from: b */
    public static final void m82032b(String str, boolean z, boolean z2) {
        JSONObject put = new JSONObject().put("jump_url", str).put("jump_has_click", z).put("jump_block_by", "apk_download");
        if (z2) {
            put.put("container_type", "bullet");
        }
        C12290b.m22060a("h5_block_app_url", 0, put);
    }

    /* renamed from: c */
    public static final void m82033c(String str, boolean z, boolean z2) {
        JSONObject put = new JSONObject().put("jump_url", str).put("jump_has_click", z);
        if (z2) {
            put.put("container_type", "bullet");
        }
        C12290b.m22060a("h5_block_app_url", 1, put);
    }
}
