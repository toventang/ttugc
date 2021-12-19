package com.p2082ss.android.ugc.awemepushlib.p4249di.ies;

import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.ServiceLifecycle;
import com.p2082ss.android.newmedia.p2166d.AbstractIntentServiceC30129a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.awemepushlib.manager.MessageShowHandler;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.awemepushlib.di.ies.MessageHandler */
public class MessageHandler extends AbstractIntentServiceC30129a {
    static {
        Covode.recordClassIndex(95239);
    }

    @Override // com.p2082ss.android.newmedia.p2166d.AbstractIntentServiceC30129a
    public int onStartCommand(Intent intent, int i, int i2) {
        ServiceLifecycle.onStartCommand(this, intent, i, i2);
        return super.onStartCommand(intent, i, i2);
    }

    @Override // com.p2082ss.android.newmedia.p2166d.AbstractIntentServiceC30129a
    /* renamed from: a */
    public final void mo53503a(Context context, String str) {
        String str2 = "context = [" + context + "], type = [1], obj = [" + str + "], from = [2], extra = [" + ((String) null) + "]";
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("receive_time", new StringBuilder().append(System.currentTimeMillis()).toString());
            jSONObject.put("message", str2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C39162r.m79461a("push_receive_in_mt", jSONObject);
        MessageShowHandler.m141810a(context, 1, str, 2);
    }
}
