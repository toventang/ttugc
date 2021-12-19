package com.bytedance.android.livesdk.browser.jsbridge.p473d;

import android.content.Context;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdkapi.host.AbstractC11818m;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.AbstractC18293d;
import com.bytedance.ies.web.p1285a.C18297h;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.d.d */
public final class C7053d implements AbstractC18293d {

    /* renamed from: a */
    private final WeakReference<Context> f17662a;

    static {
        Covode.recordClassIndex(7792);
    }

    public C7053d(WeakReference<Context> weakReference) {
        this.f17662a = weakReference;
    }

    @Override // com.bytedance.ies.web.p1285a.AbstractC18293d
    public final void call(C18297h hVar, JSONObject jSONObject) {
        ActivityC0945e a = C11279p.m20001a(this.f17662a.get());
        if (a != null) {
            ((IHostApp) C6193a.m13435a(IHostApp.class)).startBindPhoneDialogFragment(a, "", "", new AbstractC11818m() {
                /* class com.bytedance.android.livesdk.browser.jsbridge.p473d.C7053d.C70541 */

                static {
                    Covode.recordClassIndex(7793);
                }
            });
            jSONObject.put("code", 1);
            return;
        }
        jSONObject.put("code", 0);
    }
}
