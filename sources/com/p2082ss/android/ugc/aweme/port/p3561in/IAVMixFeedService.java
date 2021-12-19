package com.p2082ss.android.ugc.aweme.port.p3561in;

import android.app.Activity;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.port.in.IAVMixFeedService */
public interface IAVMixFeedService {
    static {
        Covode.recordClassIndex(74412);
    }

    boolean needCreateFirstMix();

    boolean needShowAddOrRemoveButton();

    void showAddToMixInPublishPage(Activity activity, AbstractC63174ah ahVar, String str, String str2, String str3, String str4);

    void updateFeedEvent();
}
