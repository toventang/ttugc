package com.bytedance.android.livesdk.chatroom.p499ui.p501b;

import android.os.SystemClock;
import com.bytedance.android.livesdk.model.C9537au;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.b.c */
public final class C7784c {

    /* renamed from: a */
    public static long f19306a;

    /* renamed from: b */
    public static boolean f19307b;

    /* renamed from: c */
    public static final C7784c f19308c = new C7784c();

    private C7784c() {
    }

    static {
        Covode.recordClassIndex(8579);
    }

    /* renamed from: a */
    public static void m15847a(DataChannel dataChannel, C9537au auVar) {
        if (auVar != null && f19306a > 0) {
            C6501b.C6502a.m13948a("livesdk_live_prop_use_time").mo12643a(dataChannel).mo12658d("live_take_detail").mo12645a("prop_type", auVar.f23165g).mo12651a("words", auVar.f23162d).mo12646a("prop_id", auVar.f23166h).mo12651a("live_type", "video_live").mo12646a("use_time", SystemClock.elapsedRealtime() - f19306a).mo12655b();
        }
    }
}
