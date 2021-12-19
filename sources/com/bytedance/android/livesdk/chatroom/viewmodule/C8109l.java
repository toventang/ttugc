package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.livesdk.event.C8449c;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import org.json.JSONException;
import org.json.JSONObject;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.l */
final /* synthetic */ class C8109l implements AbstractC88433f {

    /* renamed from: a */
    private final BottomRightBannerWidget f20121a;

    static {
        Covode.recordClassIndex(8916);
    }

    C8109l(BottomRightBannerWidget bottomRightBannerWidget) {
        this.f20121a = bottomRightBannerWidget;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        C8449c cVar;
        BottomRightBannerWidget bottomRightBannerWidget = this.f20121a;
        if ((obj instanceof C8449c) && (cVar = (C8449c) obj) != null && cVar.f20891a == 1) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(StringSet.type, cVar.f20892b);
                jSONObject.put("data", cVar.f20893c.toString());
                if (bottomRightBannerWidget.f19806d != null) {
                    bottomRightBannerWidget.f19806d.mo13252a(bottomRightBannerWidget.f19803a, "H5_roomStatusChange", jSONObject);
                }
            } catch (JSONException unused) {
            }
        }
    }
}
