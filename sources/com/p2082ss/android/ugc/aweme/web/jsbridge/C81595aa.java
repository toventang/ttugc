package com.p2082ss.android.ugc.aweme.web.jsbridge;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.C18288a;
import com.bytedance.ies.web.p1285a.C18297h;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.sdk.webview.p2175a.C30242g;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.aa */
public final class C81595aa extends C30242g {

    /* renamed from: b */
    private C18288a f182479b;

    static {
        Covode.recordClassIndex(94992);
    }

    public C81595aa(WeakReference<Context> weakReference, C18288a aVar) {
        super(weakReference);
        this.f182479b = aVar;
    }

    @Override // com.p2082ss.android.sdk.webview.p2175a.C30242g, com.bytedance.ies.web.p1285a.AbstractC18293d
    public final void call(C18297h hVar, JSONObject jSONObject) {
        String string = hVar.f43671d.getString(StringSet.type);
        if (!TextUtils.equals("goods_order_share", string)) {
            hVar.f43670c = "open";
            hVar.f43671d.put(StringSet.type, "openRecord");
            if (hVar.f43671d.has("args")) {
                JSONObject jSONObject2 = hVar.f43671d.getJSONObject("args");
                jSONObject2.put("recordOrigin", "jsBridge");
                if ("challenge".equals(string)) {
                    jSONObject2.put("id", jSONObject2.get("challenge_id"));
                    jSONObject2.put("recordParam", "challenge");
                } else if ("music".equals(string)) {
                    jSONObject2.put("id", jSONObject2.get("music_id"));
                    jSONObject2.put("recordParam", "music");
                } else if ("effect".equals(string)) {
                    if (jSONObject2.has("effect_id")) {
                        jSONObject2.put("id", jSONObject2.get("effect_id"));
                    }
                    jSONObject2.put("recordParam", "sticker");
                    if (jSONObject2.has("effect_meta_info")) {
                        jSONObject2.put("effect_meta_info", jSONObject2.getJSONObject("effect_meta_info").toString());
                    }
                    if (jSONObject2.has("effect_image")) {
                        jSONObject2.put("effect_image", jSONObject2.getJSONObject("effect_image").toString());
                    }
                } else if ("donation".equals(string)) {
                    jSONObject2.put("id", jSONObject2.get("charity_id"));
                    jSONObject2.put("recordParam", "donation");
                } else if ("tcm".equals(string)) {
                    jSONObject2.put("recordParam", "tcm");
                    jSONObject2.put("star_atlas_object", hVar.f43671d.getJSONObject("args").toString());
                }
                jSONObject2.put("group", "1");
            }
            mo53694a(hVar.f43671d);
        }
    }
}
