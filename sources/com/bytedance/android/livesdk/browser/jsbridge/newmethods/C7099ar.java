package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.AbstractC18337f;
import com.bytedance.ies.web.jsbridge2.C18338g;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.ar */
public final class C7099ar extends AbstractC18337f<JSONObject, JSONObject> {
    static {
        Covode.recordClassIndex(7845);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.web.jsbridge2.g] */
    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18337f
    public final /* synthetic */ JSONObject invoke(JSONObject jSONObject, C18338g gVar) {
        JSONObject jSONObject2 = jSONObject;
        C89219l.m154721d(jSONObject2, "");
        C89219l.m154721d(gVar, "");
        String optString = jSONObject2.optString("iap_id", "");
        if (C13627m.m24498a(optString)) {
            return null;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        Uri.Builder appendQueryParameter = Uri.parse("https://play.google.com/store/account/subscriptions").buildUpon().appendQueryParameter("sku", optString);
        Context context = ((IHostContext) C6193a.m13435a(IHostContext.class)).context();
        C89219l.m154716b(context, "");
        intent.setData(appendQueryParameter.appendQueryParameter("package", context.getApplicationInfo().packageName).build());
        intent.setPackage("com.android.vending");
        Context context2 = gVar.f43859a;
        C84349a.m145093a(intent, context2);
        context2.startActivity(intent);
        return null;
    }
}
