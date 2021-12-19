package com.bytedance.common.wschannel.client;

import android.content.Context;
import android.os.Parcelable;
import com.bytedance.common.wschannel.model.SsWsApp;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.common.wschannel.client.j */
public interface AbstractC13726j {

    /* renamed from: com.bytedance.common.wschannel.client.j$a */
    public static class C13727a {

        /* renamed from: a */
        String f33357a;

        /* renamed from: b */
        Parcelable f33358b;

        /* renamed from: c */
        int f33359c;

        static {
            Covode.recordClassIndex(15762);
        }
    }

    static {
        Covode.recordClassIndex(15761);
    }

    /* renamed from: a */
    void mo22080a(Context context);

    /* renamed from: a */
    void mo22081a(Context context, int i);

    /* renamed from: a */
    void mo22082a(Context context, SsWsApp ssWsApp);

    /* renamed from: a */
    void mo22083a(Context context, WsChannelMsg wsChannelMsg);

    /* renamed from: a */
    void mo22084a(Context context, boolean z);

    /* renamed from: b */
    void mo22085b(Context context);

    /* renamed from: b */
    void mo22086b(Context context, SsWsApp ssWsApp);
}
