package com.bytedance.android.live.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.broadcast.aa */
public final class C3008aa extends BroadcastReceiver {

    /* renamed from: a */
    private AbstractC3009a f8822a;

    /* renamed from: com.bytedance.android.live.broadcast.aa$a */
    public interface AbstractC3009a {
        static {
            Covode.recordClassIndex(3471);
        }

        /* renamed from: a */
        void mo8170a(String str);
    }

    static {
        Covode.recordClassIndex(3470);
    }

    public C3008aa(AbstractC3009a aVar) {
        this.f8822a = aVar;
    }

    /* renamed from: a */
    private static String m8322a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.PHONE_STATE".equals(intent.getAction())) {
            this.f8822a.mo8170a(m8322a(intent, "state"));
        }
    }
}
