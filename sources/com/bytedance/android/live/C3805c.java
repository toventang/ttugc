package com.bytedance.android.live;

import androidx.fragment.app.AbstractC0952i;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.c */
public class C3805c implements AbstractC4317f {
    static {
        Covode.recordClassIndex(4331);
    }

    @Override // com.bytedance.android.live.AbstractC4317f
    public Class<? extends LiveRecyclableWidget> getCommentWidget() {
        return null;
    }

    @Override // com.bytedance.android.live.base.AbstractC2953a
    public void onInit() {
    }

    @Override // com.bytedance.android.live.AbstractC4317f
    public void showEmoteDetailDialog(EmoteModel emoteModel, AbstractC0952i iVar) {
        C89219l.m154721d(emoteModel, "");
        C89219l.m154721d(iVar, "");
    }
}
