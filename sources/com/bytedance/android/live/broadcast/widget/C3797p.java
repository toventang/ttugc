package com.bytedance.android.live.broadcast.widget;

import com.bytedance.android.live.broadcast.api.model.C3069b;
import com.bytedance.android.livesdk.chatroom.p488c.C7400q;
import com.bytedance.android.livesdk.chatroom.p488c.C7404u;
import com.bytedance.android.livesdk.livesetting.watchlive.TestDisableEffectSetting;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.live.broadcast.widget.p */
public final /* synthetic */ class C3797p implements AbstractC88433f {

    /* renamed from: a */
    private final VideoWidget2 f10531a;

    static {
        Covode.recordClassIndex(4323);
    }

    C3797p(VideoWidget2 videoWidget2) {
        this.f10531a = videoWidget2;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        VideoWidget2 videoWidget2 = this.f10531a;
        if (obj instanceof C7400q) {
            videoWidget2.onEvent((C7400q) obj);
        } else if (obj instanceof C3069b) {
            if (!TestDisableEffectSetting.INSTANCE.getValue()) {
                videoWidget2.onEvent((C3069b) obj);
            }
        } else if (obj instanceof C7404u) {
            C7404u uVar = (C7404u) obj;
            if (videoWidget2.f10455v != null) {
                videoWidget2.f10455v.onEvent(uVar);
            }
        }
    }
}
