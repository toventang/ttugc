package com.p2082ss.android.ugc.awemepushlib.interaction;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.push.PushBody;
import com.bytedance.push.p1590c.AbstractC21782m;
import com.p2082ss.android.ugc.awemepushlib.manager.MessageShowHandler;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.awemepushlib.interaction.v */
final /* synthetic */ class C81888v implements AbstractC21782m {

    /* renamed from: a */
    static final AbstractC21782m f183052a = new C81888v();

    static {
        Covode.recordClassIndex(95302);
    }

    private C81888v() {
    }

    @Override // com.bytedance.push.p1590c.AbstractC21782m
    /* renamed from: a */
    public final JSONObject mo35460a(Context context, int i, PushBody pushBody) {
        MessageShowHandler.m141814a(context, pushBody.mo35387a(), i);
        return null;
    }
}
