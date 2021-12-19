package com.p2082ss.android.ugc.aweme.qrcode;

import android.content.Intent;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpage.p1237c.C17739a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.qrcode.QRCodeFragment__BindExtra */
public final class QRCodeFragment__BindExtra {
    static {
        Covode.recordClassIndex(77887);
    }

    /* renamed from: com_ss_android_ugc_aweme_qrcode_QRCodeFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras */
    public static Bundle m118046x373c40a2(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: com_ss_android_ugc_aweme_qrcode_QRCodeFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get */
    public static Object m118045x34ff295f(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    public QRCodeFragment__BindExtra(QRCodeFragment qRCodeFragment, Intent intent) {
        Object com_ss_android_ugc_aweme_qrcode_QRCodeFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get;
        C89219l.m154721d(qRCodeFragment, "");
        C89219l.m154721d(intent, "");
        Bundle com_ss_android_ugc_aweme_qrcode_QRCodeFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = m118046x373c40a2(intent);
        if (com_ss_android_ugc_aweme_qrcode_QRCodeFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras != null && (com_ss_android_ugc_aweme_qrcode_QRCodeFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get = m118045x34ff295f(com_ss_android_ugc_aweme_qrcode_QRCodeFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras, "extra_params")) != null) {
            C89219l.m154716b(com_ss_android_ugc_aweme_qrcode_QRCodeFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get, "");
            if (!(com_ss_android_ugc_aweme_qrcode_QRCodeFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get instanceof C66414j)) {
                if (com_ss_android_ugc_aweme_qrcode_QRCodeFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get instanceof String) {
                    com_ss_android_ugc_aweme_qrcode_QRCodeFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get = C17739a.m32874a((String) com_ss_android_ugc_aweme_qrcode_QRCodeFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get, C66414j.class);
                } else {
                    throw new IllegalArgumentException("Expecting " + C66414j.class + " but get " + com_ss_android_ugc_aweme_qrcode_QRCodeFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get.getClass());
                }
            }
            qRCodeFragment.f149241e = (C66414j) com_ss_android_ugc_aweme_qrcode_QRCodeFragment__BindExtra_com_ss_android_ugc_aweme_lancet_IntentLancet_get;
        }
    }
}
