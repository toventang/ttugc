package com.p2082ss.android.ugc.aweme.services.video;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.PhotoMvAnchorConfig;

/* renamed from: com.ss.android.ugc.aweme.services.video.IVideoRecordEntranceService */
public interface IVideoRecordEntranceService {
    static {
        Covode.recordClassIndex(80017);
    }

    void notifyToolPermissionActivity(Context context, Intent intent, boolean z, boolean z2, boolean z3);

    void startChangeBanMusicEditActivity(Context context, Intent intent);

    void startChoosePhotoActivity(Activity activity, Intent intent, PhotoMvAnchorConfig photoMvAnchorConfig);

    void startSuperEntranceRecordActivity(Activity activity, Intent intent);

    void startToolPermissionActivity(Activity activity, Intent intent);

    void startToolPermissionActivity(Activity activity, Intent intent, boolean z, boolean z2, boolean z3);

    void startToolPermissionActivity(Context context, Intent intent);
}
