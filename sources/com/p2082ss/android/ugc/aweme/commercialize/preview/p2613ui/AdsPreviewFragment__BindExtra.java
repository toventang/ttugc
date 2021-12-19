package com.p2082ss.android.ugc.aweme.commercialize.preview.p2613ui;

import android.content.Intent;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpage.p1237c.C17739a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.preview.ui.AdsPreviewFragment__BindExtra */
public final class AdsPreviewFragment__BindExtra {
    static {
        Covode.recordClassIndex(45834);
    }

    /* renamed from: com_ss_android_ugc_aweme_commercialize_preview_ui_AdsPreviewFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras */
    public static Bundle m77735x718f871a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: com_ss_android_ugc_aweme_commercialize_preview_ui_AdsPreviewFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get */
    public static Object m77734x6706a9d7(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    public AdsPreviewFragment__BindExtra(AdsPreviewFragment adsPreviewFragment, Intent intent) {
        Object com_ss_android_ugc_aweme_commercialize_preview_ui_AdsPreviewFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get;
        C89219l.m154721d(adsPreviewFragment, "");
        C89219l.m154721d(intent, "");
        Bundle com_ss_android_ugc_aweme_commercialize_preview_ui_AdsPreviewFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = m77735x718f871a(intent);
        if (com_ss_android_ugc_aweme_commercialize_preview_ui_AdsPreviewFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras != null && (com_ss_android_ugc_aweme_commercialize_preview_ui_AdsPreviewFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get = m77734x6706a9d7(com_ss_android_ugc_aweme_commercialize_preview_ui_AdsPreviewFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras, "url")) != null) {
            C89219l.m154716b(com_ss_android_ugc_aweme_commercialize_preview_ui_AdsPreviewFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get, "");
            if (!(com_ss_android_ugc_aweme_commercialize_preview_ui_AdsPreviewFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get instanceof String)) {
                if (com_ss_android_ugc_aweme_commercialize_preview_ui_AdsPreviewFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get instanceof String) {
                    com_ss_android_ugc_aweme_commercialize_preview_ui_AdsPreviewFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get = C17739a.m32874a((String) com_ss_android_ugc_aweme_commercialize_preview_ui_AdsPreviewFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get, String.class);
                } else {
                    throw new IllegalArgumentException("Expecting " + String.class + " but get " + com_ss_android_ugc_aweme_commercialize_preview_ui_AdsPreviewFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get.getClass());
                }
            }
            adsPreviewFragment.f90574b = (String) com_ss_android_ugc_aweme_commercialize_preview_ui_AdsPreviewFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get;
        }
    }
}
