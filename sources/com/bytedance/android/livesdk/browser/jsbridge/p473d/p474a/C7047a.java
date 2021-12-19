package com.bytedance.android.livesdk.browser.jsbridge.p473d.p474a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.livesdk.browser.jsbridge.p473d.C7055e;
import com.bytedance.android.livesdk.browser.p462c.AbstractC6954b;
import com.bytedance.android.livesdk.browser.p463d.C6972a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.C18297h;
import com.kakao.usermgmt.StringSet;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.d.a.a */
public final class C7047a extends C7055e {

    /* renamed from: b */
    private C6972a f17656b;

    static {
        Covode.recordClassIndex(7786);
    }

    @Override // com.bytedance.ies.web.p1285a.AbstractC18293d, com.bytedance.android.livesdk.browser.jsbridge.p473d.C7055e
    public final void call(C18297h hVar, JSONObject jSONObject) {
        super.call(hVar, jSONObject);
        if (TextUtils.equals(hVar.f43671d.optString(StringSet.type), "gift_panel")) {
            this.f17656b.dismissAllowingStateLoss();
        }
    }

    public C7047a(WeakReference<Context> weakReference, C6972a aVar, final String str) {
        super(weakReference, new AbstractC6954b() {
            /* class com.bytedance.android.livesdk.browser.jsbridge.p473d.p474a.C7047a.C70481 */

            static {
                Covode.recordClassIndex(7787);
            }

            @Override // com.bytedance.android.livesdk.browser.p462c.AbstractC6954b
            /* renamed from: d */
            public final String mo13240d() {
                return str;
            }
        });
        this.f17656b = aVar;
    }
}
