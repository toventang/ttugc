package com.p2082ss.android.ugc.aweme.port.p3561in;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.language.AbstractC58069b;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.port.in.IAVSettingService */
public interface IAVSettingService {
    static {
        Covode.recordClassIndex(74413);
    }

    String getAppLanguage();

    String getAppLogRegion();

    Locale getCountryLocale();

    AbstractC58069b getCurrentI18nItem(Context context);

    String getRegion();

    boolean getSaveAtPost();

    String getSysLanguage();

    boolean isKorean();
}
