package com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.p051h.p052a.C0998a;
import com.bytedance.covode.number.Covode;

public final class MediaSessionReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static final C19210a f45379a = new C19210a((byte) 0);

    static {
        Covode.recordClassIndex(21976);
    }

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession.MediaSessionReceiver$a */
    public static final class C19210a {
        static {
            Covode.recordClassIndex(21977);
        }

        private C19210a() {
        }

        public /* synthetic */ C19210a(byte b) {
            this();
        }
    }

    public final void onReceive(Context context, Intent intent) {
        if (context != null) {
            Intent intent2 = new Intent("intent.filter.X_ELEMENT_X_AUDIO_MEDIA_SESSION_BROADCAST");
            intent2.putExtra("EXTRA_MEDIA_BUTTON_DATA", intent);
            C0998a.m3454a(context).mo3694a(intent2);
        }
    }
}
