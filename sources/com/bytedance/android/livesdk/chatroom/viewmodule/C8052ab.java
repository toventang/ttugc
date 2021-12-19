package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.livesdk.chatroom.p488c.C7367a;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p450an.C6800c;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6806c;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.ab */
final /* synthetic */ class C8052ab implements AbstractC88433f {

    /* renamed from: a */
    private final CommentWidget f20058a;

    static {
        Covode.recordClassIndex(8859);
    }

    C8052ab(CommentWidget commentWidget) {
        this.f20058a = commentWidget;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        CommentWidget commentWidget = this.f20058a;
        if (((C5832d) obj).statusCode == 0) {
            C6501b.C6502a.m13948a("livesdk_set_comment_status").mo12643a(commentWidget.dataChannel).mo12651a("status", "open").mo12651a("situation", "comment_popup").mo12655b();
            C6806c.m14603a((C6800c) AbstractC6804a.f16969bR, (Object) true);
            C6779a.m14563a().mo13053a(new C7367a(true));
            commentWidget.mo14267b();
            return;
        }
        C11226ao.m19882a(C3966y.m9669e(), (int) R.string.e6h);
    }
}
