package com.bytedance.android.live;

import androidx.fragment.app.AbstractC0952i;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;

/* renamed from: com.bytedance.android.live.f */
public interface AbstractC4317f extends AbstractC2953a {
    static {
        Covode.recordClassIndex(4890);
    }

    Class<? extends LiveRecyclableWidget> getCommentWidget();

    void showEmoteDetailDialog(EmoteModel emoteModel, AbstractC0952i iVar);
}
