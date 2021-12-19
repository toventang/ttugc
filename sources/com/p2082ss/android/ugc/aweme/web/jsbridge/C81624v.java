package com.p2082ss.android.ugc.aweme.web.jsbridge;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.AbstractC18293d;
import com.bytedance.ies.web.p1285a.C18297h;
import com.p2082ss.android.sdk.webview.C30246d;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.qrcode.view.QRCodePermissionActivity;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.v */
public final class C81624v implements AbstractC18293d {

    /* renamed from: a */
    protected WeakReference<Context> f182515a;

    static {
        Covode.recordClassIndex(95021);
    }

    public C81624v(WeakReference<Context> weakReference) {
        this.f182515a = weakReference;
    }

    @Override // com.bytedance.ies.web.p1285a.AbstractC18293d
    public final void call(C18297h hVar, JSONObject jSONObject) {
        if (C30246d.m61214a(this.f182515a) != null) {
            C39162r.m79460a("qr_code_scan_enter", new C33744d().mo59983a("enter_from", "h5").f79943a);
            JSONObject jSONObject2 = null;
            if (hVar.f43671d.has("args")) {
                jSONObject2 = hVar.f43671d.getJSONObject("args");
            }
            QRCodePermissionActivity.m118193a(C30246d.m61214a(this.f182515a));
            if (jSONObject2 != null && jSONObject2.has("should_close_self") && jSONObject2.getBoolean("should_close_self")) {
                Context a = C30246d.m61214a(this.f182515a);
                if (a instanceof Activity) {
                    ((Activity) a).finish();
                }
            }
        }
    }
}
