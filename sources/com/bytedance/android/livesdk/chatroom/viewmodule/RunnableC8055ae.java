package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.livesdk.C6905bf;
import com.bytedance.android.livesdk.chatroom.p488c.C7368aa;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.ae */
public final /* synthetic */ class RunnableC8055ae implements Runnable {

    /* renamed from: a */
    private final CommentWidget f20063a;

    /* renamed from: b */
    private final C7368aa f20064b;

    static {
        Covode.recordClassIndex(8862);
    }

    RunnableC8055ae(CommentWidget commentWidget, C7368aa aaVar) {
        this.f20063a = commentWidget;
        this.f20064b = aaVar;
    }

    public final void run() {
        CommentWidget commentWidget = this.f20063a;
        C7368aa aaVar = this.f20064b;
        commentWidget.mo14266a(aaVar.f18263b, false, true, aaVar.f18264c);
        C6905bf.m14776a().mo13208c();
        commentWidget.f19839h = null;
        C6501b.C6502a.m13948a("livesdk_comment_rethink_post_ck").mo12643a(commentWidget.dataChannel).mo12646a("user_id", C11115u.m19743a().mo17915b().mo13161c()).mo12651a(UGCMonitor.EVENT_COMMENT, aaVar.f18263b).mo12645a("resend_same_cmt", aaVar.mo13595a() ? 1 : 0).mo12645a("if_click_cg", commentWidget.f19840i ? 1 : 0).mo12655b();
    }
}
