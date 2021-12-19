package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.livesdk.chatroom.model.ShareReportResult;
import com.bytedance.android.livesdk.chatroom.p488c.C7407w;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.bi */
public final /* synthetic */ class C7131bi implements AbstractC88433f {

    /* renamed from: a */
    static final AbstractC88433f f17761a = new C7131bi();

    static {
        Covode.recordClassIndex(7877);
    }

    private C7131bi() {
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        C5832d dVar = (C5832d) obj;
        if (dVar != null && dVar.data != null && ((ShareReportResult) dVar.data).getDeltaIntimacy() > 0) {
            C6779a.m14563a().mo13053a(new C7407w((ShareReportResult) dVar.data));
        }
    }
}
