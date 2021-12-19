package com.p2082ss.android.ugc.aweme.services.external;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.IDraftService;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.IEditService;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.IPublishPageService;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.IRecordService;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.ITestActivityService;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.IVideo2GifUIService;

/* renamed from: com.ss.android.ugc.aweme.services.external.IUIService */
public interface IUIService {
    static {
        Covode.recordClassIndex(79810);
    }

    IVideo2GifUIService abilityUiService();

    IDraftService draftService();

    IEditService editService();

    IPublishPageService publishService();

    IRecordService recordService();

    ITestActivityService schemaTestService();

    void startSuperEntraceActivity(Context context);
}
