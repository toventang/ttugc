package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.content.DialogInterface;
import com.bytedance.android.livesdk.C6905bf;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.ah */
public final /* synthetic */ class DialogInterface$OnClickListenerC8058ah implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final CommentWidget f20068a;

    static {
        Covode.recordClassIndex(8865);
    }

    DialogInterface$OnClickListenerC8058ah(CommentWidget commentWidget) {
        this.f20068a = commentWidget;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        CommentWidget commentWidget = this.f20068a;
        commentWidget.f19844m = null;
        C6905bf.m14776a().mo13208c();
        C6501b.C6502a.m13948a("livesdk_tns_ags_float_comment_ban").mo12643a(commentWidget.dataChannel).mo12646a("user_id", C11115u.m19743a().mo17915b().mo13161c()).mo12651a("action_type", "click_ok").mo12655b();
    }
}
