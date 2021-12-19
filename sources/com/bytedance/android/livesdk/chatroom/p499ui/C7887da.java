package com.bytedance.android.livesdk.chatroom.p499ui;

import android.text.TextPaint;
import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.model.message.C9627ay;
import com.bytedance.android.livesdk.model.message.C9878i;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.da */
public final class C7887da extends AbstractC7885cz {

    /* renamed from: a */
    private final int f19620a;

    /* renamed from: b */
    private final User f19621b;

    /* renamed from: c */
    private final boolean f19622c = false;

    static {
        Covode.recordClassIndex(8682);
    }

    @Override // com.bytedance.android.livesdk.chatroom.p499ui.AbstractC7885cz
    /* renamed from: a */
    public final void mo11881a(View view) {
        if (this.f19622c) {
            onClick(view);
        }
    }

    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        textPaint.setColor(this.f19620a);
    }

    public final void onClick(View view) {
        Object obj;
        if (this.f19621b != null) {
            UserProfileEvent userProfileEvent = new UserProfileEvent(this.f19621b.getId(), StringSet.name);
            userProfileEvent.mSource = "live_comment";
            if (view != null) {
                obj = view.getTag(R.id.epm);
            } else {
                obj = null;
            }
            if (obj instanceof AbstractC6571a) {
                AbstractC6571a aVar = (AbstractC6571a) obj;
                userProfileEvent.msgId = aVar.getMessageId();
                if (aVar instanceof C9878i) {
                    userProfileEvent.content = ((C9878i) aVar).f23853f;
                } else if (aVar instanceof C9627ay) {
                    C9627ay ayVar = (C9627ay) aVar;
                    if (ayVar.f23457s != null && "pm_mt_guidance_interaction".equals(ayVar.f23457s.f23645a)) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("event_type", "click");
                        hashMap.put("click_module", "username");
                        C6501b.C6502a.m13948a("livesdk_anchor_interact_notice").mo12652a((Map<String, String>) hashMap).mo12639a().mo12655b();
                    }
                }
            }
            C6779a.m14563a().mo13053a(userProfileEvent);
        }
    }

    public C7887da(User user, int i) {
        this.f19621b = user;
        this.f19620a = i;
    }
}
