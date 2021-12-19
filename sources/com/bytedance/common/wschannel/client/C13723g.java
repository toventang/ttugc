package com.bytedance.common.wschannel.client;

import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.common.wschannel.client.C13717c;
import com.bytedance.common.wschannel.model.C13769a;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.common.wschannel.client.g */
public final class C13723g extends AbstractC13716b {
    static {
        Covode.recordClassIndex(15758);
    }

    public C13723g(C13717c.AbstractC13718a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    private static String m24731a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.bytedance.common.wschannel.client.AbstractC13719d
    /* renamed from: a */
    public final void mo22079a(Intent intent, C13769a aVar) {
        try {
            JSONObject jSONObject = new JSONObject(m24731a(intent, "link_progress"));
            String str = (String) jSONObject.remove("link_progress");
            if (!TextUtils.isEmpty(str) && WsConstants.getLinkProgressChangeListener() != null) {
                WsConstants.getLinkProgressChangeListener().mo21943a(str, jSONObject);
            }
        } catch (Exception unused) {
        }
    }
}
