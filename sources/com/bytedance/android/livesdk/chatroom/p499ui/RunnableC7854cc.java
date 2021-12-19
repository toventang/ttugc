package com.bytedance.android.livesdk.chatroom.p499ui;

import android.os.Build;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.p218f.C3941k;
import com.bytedance.android.livesdk.chatroom.p499ui.p500a.C7711b;
import com.bytedance.android.livesdk.utils.C11291z;
import com.bytedance.common.utility.C13617h;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.chatroom.ui.cc */
public final /* synthetic */ class RunnableC7854cc implements Runnable {

    /* renamed from: a */
    private final C7822br f19574a;

    static {
        Covode.recordClassIndex(8649);
    }

    RunnableC7854cc(C7822br brVar) {
        this.f19574a = brVar;
    }

    public final void run() {
        C7822br brVar = this.f19574a;
        brVar.f19466am = true;
        if (brVar.f19496d != null && brVar.f19496d.background != null) {
            if (Build.VERSION.SDK_INT >= 23) {
                brVar.f19406E.setForeground(null);
            }
            C3941k.m9601a(brVar.f19406E, brVar.f19496d.background);
        } else if (C13617h.m24466b(brVar.f19498f)) {
            C3941k.m9604a(brVar.f19406E, new ImageModel(null, brVar.f19498f), new C11291z(5, ((float) C13628n.m24504a(brVar.getContext())) / ((float) C13628n.m24521b(brVar.getContext()))));
        } else if (brVar.f19463aj == null || brVar.f19463aj.f28233c == null || brVar.f19463aj.f28233c.f28344ay == null) {
            C3941k.m9605a(brVar.f19406E, "res://" + brVar.mo14092a(brVar.getContext()) + "/2131234492");
        } else {
            C3941k.m9604a(brVar.f19406E, brVar.f19463aj.f28233c.f28344ay, new C11291z(5, ((float) C13628n.m24504a(brVar.getContext())) / ((float) C13628n.m24521b(brVar.getContext()))));
        }
        if (brVar.f19406E != null) {
            brVar.f19406E.setVisibility(0);
            C7711b.C7712a.m15759a("live_room_ctr").mo13989a(null, 3);
        }
    }
}
