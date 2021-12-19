package com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.LifecycleOwnerWidget;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72926g;
import com.p2082ss.android.ugc.aweme.sticker.AbstractC75341f;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.AbsInteractStickerWidget */
public abstract class AbsInteractStickerWidget extends LifecycleOwnerWidget implements AbstractC33974au, AbstractC75341f {
    static {
        Covode.recordClassIndex(85772);
    }

    /* renamed from: a */
    public abstract void mo115491a(Aweme aweme);

    /* renamed from: a */
    public abstract void mo115492a(AbstractC72926g gVar);

    /* renamed from: e */
    public abstract InteractStickerViewModel mo115493e();

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.base.LifecycleOwnerWidget, com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }
}
