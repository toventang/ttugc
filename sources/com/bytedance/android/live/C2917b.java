package com.bytedance.android.live;

import androidx.fragment.app.AbstractC0952i;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.livesdk.chatroom.viewmodule.CommentWidget;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import emotes.p4557a.C88349a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.b */
public class C2917b implements AbstractC4317f {
    static {
        Covode.recordClassIndex(3356);
    }

    @Override // com.bytedance.android.live.base.AbstractC2953a
    public void onInit() {
    }

    @Override // com.bytedance.android.live.AbstractC4317f
    public Class<? extends LiveRecyclableWidget> getCommentWidget() {
        return CommentWidget.class;
    }

    @Override // com.bytedance.android.live.AbstractC4317f
    public void showEmoteDetailDialog(EmoteModel emoteModel, AbstractC0952i iVar) {
        C89219l.m154721d(emoteModel, "");
        C89219l.m154721d(iVar, "");
        C88349a aVar = new C88349a();
        if (emoteModel != null) {
            aVar.f200557d = emoteModel;
        }
        String simpleName = C88349a.class.getSimpleName();
        C89219l.m154716b(simpleName, "");
        aVar.show(iVar, simpleName);
    }
}
