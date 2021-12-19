package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.os.SystemClock;
import com.bytedance.android.live.C4366j;
import com.bytedance.android.livesdk.C6905bf;
import com.bytedance.android.livesdk.chatroom.p488c.C7368aa;
import com.bytedance.android.livesdk.chatroom.p488c.C7382ao;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.af */
public final /* synthetic */ class RunnableC8056af implements Runnable {

    /* renamed from: a */
    private final CommentWidget f20065a;

    /* renamed from: b */
    private final C7368aa f20066b;

    static {
        Covode.recordClassIndex(8863);
    }

    RunnableC8056af(CommentWidget commentWidget, C7368aa aaVar) {
        this.f20065a = commentWidget;
        this.f20066b = aaVar;
    }

    public final void run() {
        CommentWidget commentWidget = this.f20065a;
        C7368aa aaVar = this.f20066b;
        commentWidget.dataChannel.mo28320c(C4366j.class, new C7382ao(3, aaVar.f18263b));
        C6905bf.m14776a().mo13208c();
        commentWidget.f19839h = null;
        commentWidget.f19842k = aaVar;
        C6501b.C6502a.m13948a("livesdk_comment_rethink_edit_ck").mo12643a(commentWidget.dataChannel).mo12646a("user_id", C11115u.m19743a().mo17915b().mo13161c()).mo12651a(UGCMonitor.EVENT_COMMENT, aaVar.f18263b).mo12645a("resend_same_cmt", aaVar.mo13595a() ? 1 : 0).mo12645a("if_click_cg", commentWidget.f19840i ? 1 : 0).mo12655b();
        commentWidget.f19843l = SystemClock.uptimeMillis();
    }
}
