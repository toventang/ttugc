package com.bytedance.common.wschannel.client;

import android.content.Intent;
import com.bytedance.common.wschannel.client.C13717c;
import com.bytedance.common.wschannel.model.C13769a;
import com.bytedance.common.wschannel.model.SocketState;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

/* renamed from: com.bytedance.common.wschannel.client.i */
public final class C13725i extends AbstractC13716b {
    static {
        Covode.recordClassIndex(15760);
    }

    public C13725i(C13717c.AbstractC13718a aVar) {
        super(aVar);
    }

    @Override // com.bytedance.common.wschannel.client.AbstractC13719d
    /* renamed from: a */
    public final void mo22079a(Intent intent, C13769a aVar) {
        intent.setExtrasClassLoader(SocketState.class.getClassLoader());
        ArrayList<SocketState> parcelableArrayListExtra = intent.getParcelableArrayListExtra("connection");
        if (parcelableArrayListExtra != null) {
            for (SocketState socketState : parcelableArrayListExtra) {
                if (socketState != null) {
                    mo22078a(socketState.f33441d, socketState.f33439b);
                }
            }
        }
    }
}
