package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.content.Context;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1114a.AbstractC16042a;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.bq */
public interface AbstractC8094bq extends AbstractC1204m, AbstractC16042a {
    static {
        Covode.recordClassIndex(8901);
    }

    /* renamed from: a */
    void mo10546a(Throwable th);

    /* renamed from: g */
    String mo10549g();

    Context getContext();

    DataChannel provideDataChannel();
}
