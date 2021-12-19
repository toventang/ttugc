package com.bytedance.android.livesdk.chatroom.p499ui;

import android.text.TextPaint;
import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.p488c.C7382ao;
import com.bytedance.android.livesdk.model.message.C9627ay;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p430ab.C6581g;
import com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.an */
public final class C7759an extends AbstractC7885cz {

    /* renamed from: a */
    private final int f19253a;

    /* renamed from: b */
    private final User f19254b;

    /* renamed from: c */
    private final boolean f19255c;

    static {
        Covode.recordClassIndex(8554);
    }

    @Override // com.bytedance.android.livesdk.chatroom.p499ui.AbstractC7885cz
    /* renamed from: a */
    public final void mo11881a(View view) {
    }

    public C7759an(User user) {
        this.f19254b = user;
        this.f19253a = -1;
    }

    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        if (this.f19255c) {
            textPaint.setColor(this.f19253a);
        }
    }

    public final void onClick(View view) {
        Object obj;
        String str;
        if (this.f19254b != null) {
            if (view != null) {
                obj = view.getTag(R.id.epm);
            } else {
                obj = null;
            }
            if (obj instanceof AbstractC6571a) {
                AbstractC6571a aVar = (AbstractC6571a) obj;
                if (aVar instanceof C9627ay) {
                    C9627ay ayVar = (C9627ay) aVar;
                    if (ayVar.f23457s != null && "pm_mt_guidance_interaction".equals(ayVar.f23457s.f23645a)) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("event_type", "click");
                        hashMap.put("click_module", "message");
                        C6501b.C6502a.m13948a("livesdk_anchor_interact_notice").mo12652a((Map<String, String>) hashMap).mo12639a().mo12655b();
                        str = "interact_guide";
                        C6779a.m14563a().mo13053a(new C7382ao(C6581g.m14075a(this.f19254b), str));
                    }
                }
            }
            str = "positive_reply";
            C6779a.m14563a().mo13053a(new C7382ao(C6581g.m14075a(this.f19254b), str));
        }
    }

    public C7759an(User user, int i) {
        this.f19254b = user;
        this.f19253a = i;
        this.f19255c = true;
    }
}
