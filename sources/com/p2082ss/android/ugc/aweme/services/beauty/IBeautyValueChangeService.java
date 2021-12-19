package com.p2082ss.android.ugc.aweme.services.beauty;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.services.beauty.IBeautyValueChangeService */
public interface IBeautyValueChangeService {
    public static final Companion Companion = Companion.$$INSTANCE;

    static {
        Covode.recordClassIndex(79748);
    }

    BeautyAbSetting getAbSetting();

    float getComposerValue(String str, String str2, String str3, float f);

    String getSelectedChildResId(String str, String str2, String str3);

    int saveComposerValue(String str, String str2, String str3, float f);

    int saveSelectedChildResId(String str, String str2, String str3);

    /* renamed from: com.ss.android.ugc.aweme.services.beauty.IBeautyValueChangeService$Companion */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        static {
            Covode.recordClassIndex(79749);
        }
    }
}
