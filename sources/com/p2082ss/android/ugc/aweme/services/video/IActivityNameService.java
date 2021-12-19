package com.p2082ss.android.ugc.aweme.services.video;

import android.app.Activity;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.services.video.IActivityNameService */
public interface IActivityNameService {
    static {
        Covode.recordClassIndex(80013);
    }

    Class<? extends Activity> getDraftBoxActivity();

    Class<? extends Activity> getVideoEditActivityClass();

    Class<? extends Activity> getVideoPublishActivityClass();

    Class<? extends Activity> getVideoPublishPreviewActivityClass();

    Class<? extends Activity> getVideoRecordActivityClass();

    Class<? extends Activity> getVideoRecordPermissionActivityClass();
}
