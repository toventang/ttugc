package com.bytedance.android.livesdk.p424a;

import android.content.DialogInterface;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.p405s.AbstractC6103e;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.covode.number.Covode;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.a.j */
final /* synthetic */ class DialogInterface$OnClickListenerC6429j implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final C6424f f16025a;

    /* renamed from: b */
    private final Map f16026b;

    /* renamed from: c */
    private final String f16027c;

    /* renamed from: d */
    private final User f16028d;

    static {
        Covode.recordClassIndex(7165);
    }

    DialogInterface$OnClickListenerC6429j(C6424f fVar, Map map, String str, User user) {
        this.f16025a = fVar;
        this.f16026b = map;
        this.f16027c = str;
        this.f16028d = user;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C6424f fVar = this.f16025a;
        Map<String, String> map = this.f16026b;
        String str = this.f16027c;
        User user = this.f16028d;
        String str2 = "activity_banned_talk".equals(fVar.f16014j) ? "livesdk_anchor_mute_cancel_toast_click" : "livesdk_anchor_blocklist_cancel_toast_click";
        map.put("action_type", "yes");
        C6501b.C6502a.m13948a(str2).mo12652a(map).mo12655b();
        fVar.f16008d.setVisibility(0);
        fVar.f16006b.setVisibility(8);
        if (str.equals("activity_kick_out")) {
            ((AbstractC6103e) C6193a.m13435a(AbstractC6103e.class)).kickOut(fVar, false, fVar.f16016l, user.getId());
        } else {
            ((AbstractC6103e) C6193a.m13435a(AbstractC6103e.class)).unmuteUser(user, fVar.f16016l, fVar);
        }
        dialogInterface.dismiss();
    }
}
