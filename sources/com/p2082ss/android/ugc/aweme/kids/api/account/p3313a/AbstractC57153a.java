package com.p2082ss.android.ugc.aweme.kids.api.account.p3313a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.kids.api.account.a.a */
public interface AbstractC57153a extends Serializable {
    static {
        Covode.recordClassIndex(67051);
    }

    String getSecUserId();

    String getShortId();

    String getUniqueId();

    UrlModel getUserAvatar();

    String getUserId();

    Integer getUserPeriod();

    UrlModel getUserThumb();

    Boolean isKidsMode();
}
