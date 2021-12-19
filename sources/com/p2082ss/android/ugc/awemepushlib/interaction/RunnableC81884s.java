package com.p2082ss.android.ugc.awemepushlib.interaction;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.push.C21761b;
import com.p2082ss.android.ugc.awemepushlib.manager.C81900a;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.awemepushlib.interaction.s */
final /* synthetic */ class RunnableC81884s implements Runnable {

    /* renamed from: a */
    private final Context f183049a;

    /* renamed from: b */
    private final JSONObject f183050b;

    static {
        Covode.recordClassIndex(95298);
    }

    RunnableC81884s(Context context, JSONObject jSONObject) {
        this.f183049a = context;
        this.f183050b = jSONObject;
    }

    public final void run() {
        Context context = this.f183049a;
        JSONObject jSONObject = this.f183050b;
        C81859c.m141752a("method_push_start_ttsetting_data_callback");
        C21761b.f51571a.mo35435a(context, jSONObject);
        System.out.println();
        C81900a.m141823a().mo125562g(context);
        C81900a.m141823a();
        C81900a.m141824a(context, jSONObject);
        C81859c.m141753b("method_push_start_ttsetting_data_callback");
    }
}
