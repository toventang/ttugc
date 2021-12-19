package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.content.DialogInterface;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.C6905bf;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.ai */
public final /* synthetic */ class DialogInterface$OnClickListenerC8059ai implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final CommentWidget f20069a;

    static {
        Covode.recordClassIndex(8866);
    }

    DialogInterface$OnClickListenerC8059ai(CommentWidget commentWidget) {
        this.f20069a = commentWidget;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        CommentWidget commentWidget = this.f20069a;
        IHostApp iHostApp = (IHostApp) C6193a.m13435a(IHostApp.class);
        if (iHostApp != null) {
            iHostApp.jumpToAgsStatusPage(commentWidget.getContext(), "popup_live_comment_ban");
        }
        commentWidget.f19844m = null;
        C6905bf.m14776a().mo13208c();
        C6501b.C6502a.m13948a("livesdk_tns_ags_float_comment_ban").mo12643a(commentWidget.dataChannel).mo12646a("user_id", C11115u.m19743a().mo17915b().mo13161c()).mo12651a("action_type", "click_details").mo12655b();
    }
}
