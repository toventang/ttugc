package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.p3230a.AbstractC55867a;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IImplService */
public interface IImplService {
    static {
        Covode.recordClassIndex(64890);
    }

    boolean enableExpressionTab();

    AbstractC55867a getRelationListAdapter(boolean z);

    boolean isMtCase();

    boolean isUserVerified(IMUser iMUser);

    boolean needAwemeMsgShowFollow();

    boolean needSessionListShowMore();

    void setupStatusBar(Activity activity);
}
