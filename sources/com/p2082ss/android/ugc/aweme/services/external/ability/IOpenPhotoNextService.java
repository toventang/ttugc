package com.p2082ss.android.ugc.aweme.services.external.ability;

import android.os.Bundle;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.services.external.ability.IOpenPhotoNextService */
public interface IOpenPhotoNextService {
    static {
        Covode.recordClassIndex(79831);
    }

    void gotoNextPage(ActivityC0945e eVar, boolean z, Bundle bundle, List<String> list, IPageToFinish iPageToFinish);
}
