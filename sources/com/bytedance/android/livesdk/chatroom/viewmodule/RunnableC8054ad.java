package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.core.widget.C4031a;
import com.bytedance.android.live.p176b.AbstractC2928f;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.browser.p462c.AbstractC6956d;
import com.bytedance.android.livesdk.browser.p462c.AbstractC6963e;
import com.bytedance.android.livesdk.chatroom.p488c.C7368aa;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p561j.C9076co;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.p2082ss.android.ugc.trill.R;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.ad */
public final /* synthetic */ class RunnableC8054ad implements Runnable {

    /* renamed from: a */
    private final CommentWidget f20060a;

    /* renamed from: b */
    private final String f20061b;

    /* renamed from: c */
    private final C7368aa f20062c;

    static {
        Covode.recordClassIndex(8861);
    }

    RunnableC8054ad(CommentWidget commentWidget, String str, C7368aa aaVar) {
        this.f20060a = commentWidget;
        this.f20061b = str;
        this.f20062c = aaVar;
    }

    public final void run() {
        CommentWidget commentWidget = this.f20060a;
        String str = this.f20061b;
        C7368aa aaVar = this.f20062c;
        commentWidget.f19840i = true;
        AbstractC6956d.C6958b a = AbstractC6963e.m14871a(str);
        a.f17407k = -1;
        a.f17406j = 80;
        if (((Boolean) commentWidget.dataChannel.mo28318b(C9076co.class)).booleanValue()) {
            a.f17399c = (int) C3966y.m9668e((int) (((float) C3966y.m9662b()) * 0.9f));
            a.f17398b = (int) C3966y.m9668e(C3966y.m9664c());
            a.f17420x = C3966y.m9657a((int) R.string.e28);
            a.f17421y = true;
            a.f17389C = true;
        } else {
            AbstractC6956d.C6958b a2 = a.mo13259a(8, 0, 0, 8);
            a2.f17410n = true;
            a2.f17399c = (int) C3966y.m9668e(C3966y.m9662b());
            a2.f17398b = 395;
        }
        C4031a.m9839a(C11279p.m20001a(commentWidget.getContext()), ((AbstractC2928f) C6193a.m13435a(AbstractC2928f.class)).webViewManager().mo13245a(a));
        C6501b.C6502a.m13948a("livesdk_comment_rethink_cg_ck").mo12643a(commentWidget.dataChannel).mo12646a("user_id", C11115u.m19743a().mo17915b().mo13161c()).mo12651a(UGCMonitor.EVENT_COMMENT, aaVar.f18263b).mo12645a("resend_same_cmt", aaVar.mo13595a() ? 1 : 0).mo12655b();
    }
}
