package com.bytedance.common.wschannel.client;

import android.content.Intent;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.common.wschannel.client.C13717c;
import com.bytedance.common.wschannel.model.C13769a;
import com.bytedance.common.wschannel.model.SocketState;
import com.bytedance.common.wschannel.p912b.C13654b;
import com.bytedance.common.wschannel.p912b.EnumC13653a;
import com.bytedance.common.wschannel.p912b.EnumC13655c;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.common.wschannel.client.e */
public final class C13720e extends AbstractC13716b {
    static {
        Covode.recordClassIndex(15755);
    }

    /* renamed from: com.bytedance.common.wschannel.client.e$1 */
    static /* synthetic */ class C137211 {

        /* renamed from: a */
        static final /* synthetic */ int[] f33356a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        static {
            /*
                r0 = 15756(0x3d8c, float:2.2079E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.bytedance.common.wschannel.b.c[] r0 = com.bytedance.common.wschannel.p912b.EnumC13655c.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.bytedance.common.wschannel.client.C13720e.C137211.f33356a = r2
                com.bytedance.common.wschannel.b.c r0 = com.bytedance.common.wschannel.p912b.EnumC13655c.CONNECT_FAILED     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.bytedance.common.wschannel.client.C13720e.C137211.f33356a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.bytedance.common.wschannel.b.c r0 = com.bytedance.common.wschannel.p912b.EnumC13655c.CONNECTED     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.client.C13720e.C137211.<clinit>():void");
        }
    }

    public C13720e(C13717c.AbstractC13718a aVar) {
        super(aVar);
    }

    @Override // com.bytedance.common.wschannel.client.AbstractC13719d
    /* renamed from: a */
    public final void mo22079a(Intent intent, C13769a aVar) {
        intent.setExtrasClassLoader(SocketState.class.getClassLoader());
        SocketState socketState = (SocketState) intent.getParcelableExtra("connection");
        EnumC13655c a = mo22078a(socketState.f33441d, socketState.f33439b);
        this.f33354a.mo22068a(new C13654b(a, EnumC13653a.m24590of(socketState.f33442e), socketState.f33441d), socketState.mo22146a());
        int i = C137211.f33356a[a.ordinal()];
        int i2 = 1;
        if (i != 1) {
            if (i == 2) {
                i2 = 0;
            } else {
                return;
            }
        }
        if (WsConstants.getLinkProgressChangeListener() != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("lp_status", i2);
                WsConstants.getLinkProgressChangeListener().mo21943a("CMP_RECEIVE_CONNECTION", jSONObject);
            } catch (Throwable unused) {
            }
        }
    }
}
