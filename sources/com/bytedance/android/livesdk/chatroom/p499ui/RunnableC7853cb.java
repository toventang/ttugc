package com.bytedance.android.livesdk.chatroom.p499ui;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.C4344t;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.chatroom.detail.C7435f;
import com.bytedance.android.livesdk.chatroom.p481b.C7302b;
import com.bytedance.android.livesdk.gift.p548d.C8803g;
import com.bytedance.android.livesdk.model.message.C9883n;
import com.bytedance.android.message.IMessageService;
import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.live.sdk.message.data.IMessage;
import com.p2082ss.ugc.live.sdk.message.interfaces.IMessageManager;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.chatroom.ui.cb */
public final /* synthetic */ class RunnableC7853cb implements Runnable {

    /* renamed from: a */
    private final C7822br f19573a;

    static {
        Covode.recordClassIndex(8648);
    }

    RunnableC7853cb(C7822br brVar) {
        this.f19573a = brVar;
    }

    public final void run() {
        C7822br brVar = this.f19573a;
        if (brVar.f19513u != null) {
            C7435f fVar = brVar.f19513u;
            IMessageManager iMessageManager = ((IMessageService) C6193a.m13435a(IMessageService.class)).get();
            while (!fVar.f18439d.isEmpty() && iMessageManager != null) {
                iMessageManager.insertMessage((IMessage) fVar.f18439d.poll());
            }
        }
        if (brVar.f19496d != null && brVar.f19496d.getStatus() == 3) {
            C9883n a = C7302b.m15207a(brVar.f19495c);
            IMessageManager iMessageManager2 = ((IMessageService) C6193a.m13435a(IMessageService.class)).get();
            if (iMessageManager2 != null) {
                iMessageManager2.insertMessage(a, true);
            }
        }
        if (brVar.f19504l) {
            User user = new User();
            user.setId(brVar.f19497e);
            brVar.f19423V.mo28320c(C4344t.class, new C8803g(user, brVar.f19502j));
            brVar.f19504l = false;
            brVar.f19502j = 0;
        } else if (brVar.f19501i) {
            User user2 = new User();
            user2.setId(brVar.f19497e);
            brVar.f19423V.mo28320c(C4344t.class, new C8803g(user2, brVar.f19502j));
            brVar.f19501i = false;
            brVar.f19502j = 0;
        }
        if (TextUtils.equals(brVar.f19503k, "gift_panel")) {
            User user3 = new User();
            user3.setId(brVar.f19497e);
            brVar.f19423V.mo28320c(C4344t.class, new C8803g(user3));
            brVar.f19503k = null;
        } else if (TextUtils.equals(brVar.f19503k, "package_panel")) {
            User user4 = new User();
            user4.setId(brVar.f19497e);
            brVar.f19423V.mo28320c(C4344t.class, new C8803g(user4));
            brVar.f19503k = null;
        }
    }
}
