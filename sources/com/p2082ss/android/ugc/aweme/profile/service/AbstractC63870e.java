package com.p2082ss.android.ugc.aweme.profile.service;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.profile.experiment.AbstractC63744f;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC63985aq;

/* renamed from: com.ss.android.ugc.aweme.profile.service.e */
public interface AbstractC63870e {
    static {
        Covode.recordClassIndex(75295);
    }

    void checkToTransformMusDraft();

    AbstractC63985aq createAwemeListFragment(int i, int i2, String str, String str2, boolean z, boolean z2, boolean z3);

    AbstractC34586a createMyProfileFragment();

    void enterMyFavorites(Activity activity, Bundle bundle);

    AbstractC63744f getBulletABHelper();

    boolean needShowSafeInfoNotice();

    void onFeedStop();

    boolean shouldShowI18nRecommendUserDialogOnMyPrifile();

    void startThirdSocialActivity(Context context, User user, int i);

    void switchToBioUrl(Activity activity, String str);
}
