package com.bytedance.android.livesdk.browser.jsbridge.p473d.p474a;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.AbstractC18293d;
import com.bytedance.ies.web.p1285a.C18297h;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.d.a.b */
public final class C7049b implements AbstractC18293d {

    /* renamed from: a */
    private WeakReference<Context> f17658a;

    static {
        Covode.recordClassIndex(7788);
    }

    public C7049b(WeakReference<Context> weakReference) {
        this.f17658a = weakReference;
    }

    @Override // com.bytedance.ies.web.p1285a.AbstractC18293d
    public final void call(C18297h hVar, JSONObject jSONObject) {
        if (this.f17658a.get() != null) {
            ((IHostAction) C6193a.m13435a(IHostAction.class)).handleSchema(this.f17658a.get(), "sslocal://openRecord?enter_from=direct_shoot&tab=live", new Bundle());
        }
    }
}
