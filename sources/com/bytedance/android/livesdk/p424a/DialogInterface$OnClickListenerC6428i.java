package com.bytedance.android.livesdk.p424a;

import android.content.DialogInterface;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.covode.number.Covode;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.a.i */
final /* synthetic */ class DialogInterface$OnClickListenerC6428i implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final C6424f f16023a;

    /* renamed from: b */
    private final Map f16024b;

    static {
        Covode.recordClassIndex(7164);
    }

    DialogInterface$OnClickListenerC6428i(C6424f fVar, Map map) {
        this.f16023a = fVar;
        this.f16024b = map;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C6424f fVar = this.f16023a;
        Map<String, String> map = this.f16024b;
        String str = "activity_banned_talk".equals(fVar.f16014j) ? "livesdk_anchor_mute_cancel_toast_click" : "livesdk_anchor_blocklist_cancel_toast_click";
        map.put("action_type", "no");
        C6501b.C6502a.m13948a(str).mo12652a(map).mo12655b();
        dialogInterface.dismiss();
    }
}
