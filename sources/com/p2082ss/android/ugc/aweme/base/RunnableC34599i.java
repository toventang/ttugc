package com.p2082ss.android.ugc.aweme.base;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.facebook.imagepipeline.p1890o.C24636b;
import com.p2082ss.android.common.util.NetworkUtils;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.services.ImageUserServiceImpl;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.base.i */
final /* synthetic */ class RunnableC34599i implements Runnable {

    /* renamed from: a */
    private final C24636b f81648a;

    /* renamed from: b */
    private final Throwable f81649b;

    static {
        Covode.recordClassIndex(41561);
    }

    RunnableC34599i(C24636b bVar, Throwable th) {
        this.f81648a = bVar;
        this.f81649b = th;
    }

    public final void run() {
        int i;
        C24636b bVar = this.f81648a;
        Throwable th = this.f81649b;
        Uri uri = bVar.mSourceUri;
        Context a = C17867d.m33078a();
        String uri2 = uri != null ? uri.toString() : null;
        if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
            C58029j.f132256h = C34587g.m70619a();
        }
        if (C58029j.f132256h) {
            JSONObject jSONObject = new JSONObject();
            try {
                String th2 = th.toString();
                jSONObject.put("errorDesc", th2);
                jSONObject.put("url", uri2);
                jSONObject.put("userId", ImageUserServiceImpl.createImageUserServicebyMonsterPlugin(false).getCurrentUserId());
                if (TextUtils.isEmpty(C58029j.f132254f) || !C58029j.m104846b() || C58029j.m104847c()) {
                    C58029j.f132254f = NetworkUtils.getNetworkAccessType(a);
                }
                jSONObject.put("networkType", C58029j.f132254f);
                jSONObject.put("url_convert", false);
                if (!TextUtils.isEmpty("")) {
                    jSONObject.put("caller_id", "");
                }
                C34611o.m70671b("aweme_image_load_log", "image_error", jSONObject);
                if (!TextUtils.isEmpty(th2)) {
                    if (!th2.contains("canceled")) {
                        if (!th2.contains("Canceled")) {
                            if (th2.contains("network not available")) {
                                i = 3;
                                C12290b.m22060a("aweme_image_load_error_rate", i, jSONObject);
                            }
                        }
                    }
                    i = 2;
                    C12290b.m22060a("aweme_image_load_error_rate", i, jSONObject);
                }
                i = 1;
                C12290b.m22060a("aweme_image_load_error_rate", i, jSONObject);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
