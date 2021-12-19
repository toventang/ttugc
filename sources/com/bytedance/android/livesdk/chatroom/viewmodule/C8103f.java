package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.livesdk.chatroom.viewmodule.BottomRightBannerWidget;
import com.bytedance.android.livesdk.event.C8461n;
import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.f */
final /* synthetic */ class C8103f implements AbstractC88433f {

    /* renamed from: a */
    private final BottomRightBannerWidget f20113a;

    static {
        Covode.recordClassIndex(8910);
    }

    C8103f(BottomRightBannerWidget bottomRightBannerWidget) {
        this.f20113a = bottomRightBannerWidget;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        BottomRightBannerWidget bottomRightBannerWidget = this.f20113a;
        C8461n nVar = (C8461n) obj;
        if (nVar != null) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            int i = BottomRightBannerWidget.C79732.f19818a[nVar.f20915a.ordinal()];
            try {
                jSONObject2.put("code", i != 1 ? i != 2 ? i != 3 ? "0" : "3" : "2" : "1");
                jSONObject.put("args", jSONObject2);
                if (bottomRightBannerWidget.f19803a != null && bottomRightBannerWidget.f19803a.f17424b != null && bottomRightBannerWidget.f19803a.f17424b.mo13236a() != null) {
                    bottomRightBannerWidget.f19803a.f17424b.mo13236a().mo29404a("H5_loginStatus", jSONObject);
                }
            } catch (JSONException unused) {
            }
        }
    }
}
