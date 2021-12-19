package com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3234b.p3236b;

import android.os.Handler;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.EnumC56260m;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.share.b.b.c */
final /* synthetic */ class C55952c implements Handler.Callback {

    /* renamed from: a */
    static final Handler.Callback f127587a = new C55952c();

    static {
        Covode.recordClassIndex(65745);
    }

    private C55952c() {
    }

    public final boolean handleMessage(Message message) {
        if (message == null || message.what != 100 || !(message.obj instanceof C55954e)) {
            return false;
        }
        C55954e eVar = (C55954e) message.obj;
        if (eVar.f127588a != EnumC56260m.SENDING) {
            return false;
        }
        C56244a.m102190b("ShareHelper", "realSendShareMsg because reach to time");
        C55949a.m101797a(eVar);
        return false;
    }
}
