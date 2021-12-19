package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.livesdk.chatroom.p499ui.p501b.C7784c;
import com.bytedance.android.livesdk.model.C9537au;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.bb */
public final /* synthetic */ class C8079bb implements AbstractC88433f {

    /* renamed from: a */
    private final DecorationWrapperWidget f20092a;

    /* renamed from: b */
    private final C9537au f20093b;

    static {
        Covode.recordClassIndex(8886);
    }

    C8079bb(DecorationWrapperWidget decorationWrapperWidget, C9537au auVar) {
        this.f20092a = decorationWrapperWidget;
        this.f20093b = auVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        String str;
        DecorationWrapperWidget decorationWrapperWidget = this.f20092a;
        C9537au auVar = this.f20093b;
        C7784c.f19307b = true;
        if (auVar != null) {
            boolean z = auVar.f23165g == 1;
            long id = decorationWrapperWidget.f19877g != null ? decorationWrapperWidget.f19877g.getId() : 0;
            HashMap hashMap = new HashMap();
            hashMap.put("room_id", String.valueOf(id));
            hashMap.put("prop_id", String.valueOf(auVar.f23166h));
            if (z) {
                hashMap.put("words", auVar.f23162d);
            }
            if (!(decorationWrapperWidget.f19877g == null || decorationWrapperWidget.f19877g.getOwner() == null)) {
                hashMap.put("anchor_id", String.valueOf(decorationWrapperWidget.f19877g.getOwner().getId()));
            }
            if (z) {
                str = "livesdk_live_character_prop_effective_use";
            } else {
                str = "livesdk_live_picture_prop_effective_use";
            }
            C6501b.C6502a.m13948a(str).mo12652a((Map<String, String>) hashMap).mo12658d("live_take_detail").mo12654b("live_take").mo12643a(decorationWrapperWidget.dataChannel).mo12655b();
            if (z) {
                decorationWrapperWidget.f19872b = true;
            } else {
                decorationWrapperWidget.f19871a = true;
            }
        }
    }
}
