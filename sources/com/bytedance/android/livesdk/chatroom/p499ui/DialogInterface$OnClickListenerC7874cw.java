package com.bytedance.android.livesdk.chatroom.p499ui;

import android.content.DialogInterface;
import com.bytedance.android.livesdk.chatroom.detail.C7445j;
import com.bytedance.android.livesdk.chatroom.p481b.C7307f;
import com.bytedance.android.livesdk.chatroom.p499ui.C7822br;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.cw */
final /* synthetic */ class DialogInterface$OnClickListenerC7874cw implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final C7822br.C783217 f19597a;

    static {
        Covode.recordClassIndex(8669);
    }

    DialogInterface$OnClickListenerC7874cw(C7822br.C783217 r1) {
        this.f19597a = r1;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C7822br.C783217 r1 = this.f19597a;
        if (C7822br.this.f19513u != null) {
            C7307f.m15216a(C7822br.this.f19513u.f18437b);
        }
        if (C7822br.this.f19511s != null) {
            C7445j jVar = C7822br.this.f19511s;
            HashMap hashMap = new HashMap();
            hashMap.put("event_belong", "live");
            hashMap.put("event_type", "click");
            hashMap.put("event_page", "live_detail");
            hashMap.put("event_module", "popup");
            hashMap.put("live_type", jVar.f18516x);
            hashMap.put("request_id", jVar.f18497e);
            hashMap.put("log_pb", jVar.f18498f);
            C6501b.C6502a.m13948a("crash_popup_click_over").mo12652a((Map<String, String>) hashMap).mo12655b();
        }
    }
}
