package com.p2082ss.android.ugc.aweme.share.entity.base;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.openshare.entity.AbstractC62726a;

/* renamed from: com.ss.android.ugc.aweme.share.entity.base.TikTokMediaContent */
public class TikTokMediaContent {
    public AbstractC62726a mMediaObject;

    static {
        Covode.recordClassIndex(81228);
    }

    public TikTokMediaContent() {
    }

    public final boolean checkArgs() {
        return this.mMediaObject.checkArgs();
    }

    public final int getType() {
        AbstractC62726a aVar = this.mMediaObject;
        if (aVar == null) {
            return 0;
        }
        return aVar.type();
    }

    public TikTokMediaContent(AbstractC62726a aVar) {
        this.mMediaObject = aVar;
    }
}
