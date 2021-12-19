package com.p2082ss.android.ugc.aweme.services.mvtemplate;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4137c.p4138a.AbstractC78930b;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4137c.p4138a.AbstractC78931c;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4137c.p4138a.AbstractC78932d;
import com.p2082ss.android.ugc.playerkit.model.C84208l;
import com.p2082ss.android.ugc.playerkit.model.C84216o;

/* renamed from: com.ss.android.ugc.aweme.services.mvtemplate.AVVideoViewComponentFactoryImplKt */
public final class AVVideoViewComponentFactoryImplKt {
    static {
        Covode.recordClassIndex(79906);
    }

    public static final AbstractC78930b toIAVMediaError(C84208l lVar) {
        return new AVVideoViewComponentFactoryImplKt$toIAVMediaError$1(lVar);
    }

    public static final AbstractC78932d toIAVPlayerFirstFrameEvent(C84216o oVar) {
        return new AVVideoViewComponentFactoryImplKt$toIAVPlayerFirstFrameEvent$1(oVar);
    }

    public static final OnUIPlayListener toOnUIPlayListener(AbstractC78931c cVar) {
        return new AVVideoViewComponentFactoryImplKt$toOnUIPlayListener$1(cVar);
    }
}
