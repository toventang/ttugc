package com.bytedance.common.wschannel.client;

import android.content.Intent;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.wschannel.client.C13717c;
import com.bytedance.common.wschannel.model.C13769a;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.common.wschannel.client.h */
public final class C13724h extends AbstractC13716b {
    static {
        Covode.recordClassIndex(15759);
    }

    public C13724h(C13717c.AbstractC13718a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    private static String m24733a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.bytedance.common.wschannel.client.AbstractC13719d
    /* renamed from: a */
    public final void mo22079a(Intent intent, C13769a aVar) {
        intent.setExtrasClassLoader(WsChannelMsg.class.getClassLoader());
        m24733a(intent, "payload_md5");
        intent.getBooleanExtra("send_result", true);
        Logger.debug();
    }
}
