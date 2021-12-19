package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.view.View;
import com.bytedance.android.live.p229d.AbstractC4051b;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p561j.C9128j;
import com.bytedance.android.livesdkapi.p690f.C11756a;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import java.util.HashMap;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.bo */
final /* synthetic */ class View$OnClickListenerC8092bo implements View.OnClickListener {

    /* renamed from: a */
    private final FullVideoButtonWidget f20106a;

    static {
        Covode.recordClassIndex(8899);
    }

    View$OnClickListenerC8092bo(FullVideoButtonWidget fullVideoButtonWidget) {
        this.f20106a = fullVideoButtonWidget;
    }

    public final void onClick(View view) {
        Long l;
        AbstractC4051b bVar;
        FullVideoButtonWidget fullVideoButtonWidget = this.f20106a;
        C6779a.m14563a().mo13053a(new C11756a(2));
        HashMap hashMap = new HashMap();
        hashMap.put("room_id", String.valueOf(fullVideoButtonWidget.f19912a));
        hashMap.put(StringSet.type, "portrait_to_landscape");
        C6501b.C6502a.m13948a("screen_rotate").mo12651a("room_id", String.valueOf(fullVideoButtonWidget.f19912a)).mo12651a(StringSet.type, "portrait_to_landscape").mo12643a(fullVideoButtonWidget.dataChannel).mo12656c("click").mo12654b("live").mo12658d("live_detail").mo12655b();
        if (fullVideoButtonWidget.dataChannel != null && (l = (Long) fullVideoButtonWidget.dataChannel.mo28318b(C9128j.class)) != null && (bVar = (AbstractC4051b) C6193a.m13435a(AbstractC4051b.class)) != null) {
            bVar.reportAudienceRotateBtnClick(String.valueOf(fullVideoButtonWidget.f19912a), l.longValue(), "1");
            fullVideoButtonWidget.dataChannel.mo28315b(C9128j.class, Long.valueOf(System.currentTimeMillis()));
        }
    }
}
