package com.p2082ss.android.ugc.aweme.utils;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.TextView;
import androidx.appcompat.p017a.p018a.C0196a;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.common.C17174a;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.utils.io */
public final class C80581io {

    /* renamed from: a */
    public static final C80581io f180198a = new C80581io();

    private C80581io() {
    }

    static {
        Covode.recordClassIndex(93854);
    }

    /* renamed from: a */
    public static final boolean m139706a(UserVerify userVerify) {
        String str;
        String str2 = null;
        if (userVerify != null) {
            str = userVerify.getCustomVerify();
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            return true;
        }
        if (userVerify != null) {
            str2 = userVerify.getEnterpriseVerifyReason();
        }
        if (!TextUtils.isEmpty(str2)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static int m139708b(Context context, Float f) {
        if (!(context == null || f == null)) {
            switch (C13628n.m24522c(context, f.floatValue())) {
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                case ABRConfig.ABR_SELECT_SCENE:
                case 15:
                    break;
                case 16:
                default:
                    return R.drawable.abh;
                case 17:
                    return R.drawable.abg;
            }
        }
        return R.drawable.abf;
    }

    /* renamed from: c */
    private static int m139710c(Context context, Float f) {
        float f2;
        if (context != null && f != null) {
            int c = C13628n.m24522c(context, f.floatValue());
            if (c != 17 && c != 20) {
                switch (c) {
                    case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                    case ABRConfig.ABR_SELECT_SCENE:
                    case 15:
                        f2 = C13628n.m24520b(context, 3.0f);
                        break;
                    default:
                        f2 = C13628n.m24520b(context, 4.0f);
                        break;
                }
            } else {
                f2 = C13628n.m24520b(context, 4.0f);
            }
        } else {
            f2 = C13628n.m24520b(context, 4.0f);
        }
        return (int) f2;
    }

    /* renamed from: a */
    private static Drawable m139701a(Context context, Float f) {
        if (context == null || f == null) {
            return null;
        }
        int c = C13628n.m24522c(context, f.floatValue());
        if (c == 17) {
            return C0196a.m619b(context, R.drawable.abg);
        }
        if (c == 20) {
            return C0196a.m619b(context, R.drawable.abh);
        }
        switch (c) {
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
            case ABRConfig.ABR_STARTUP_MAX_BITRATE:
            case ABRConfig.ABR_SELECT_SCENE:
            case 15:
                return C0196a.m619b(context, R.drawable.abf);
            default:
                return C0196a.m619b(context, R.drawable.abh);
        }
    }

    /* renamed from: a */
    private static boolean m139707a(String str, String str2) {
        if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final void m139703a(Context context, UserVerify userVerify, TextView textView) {
        if (context != null && textView != null && m139706a(userVerify)) {
            m139709b(context, textView, false);
        }
    }

    /* renamed from: a */
    public static void m139702a(Context context, TextView textView, boolean z) {
        Drawable a = m139701a(context, Float.valueOf(textView.getTextSize()));
        if (!z || a == null) {
            int i = Build.VERSION.SDK_INT;
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        int i2 = Build.VERSION.SDK_INT;
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, a, (Drawable) null);
        textView.setCompoundDrawablePadding(m139710c(context, Float.valueOf(textView.getTextSize())));
    }

    /* renamed from: b */
    private static void m139709b(Context context, TextView textView, boolean z) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(textView.getText());
        if (z) {
            try {
                spannableStringBuilder.delete((spannableStringBuilder.length() - 2) - 3, spannableStringBuilder.length() - 3);
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
        spannableStringBuilder.append((CharSequence) " T");
        spannableStringBuilder.setSpan(new C17174a(context, m139708b(context, Float.valueOf(textView.getTextSize()))), (spannableStringBuilder.length() - 2) + 1, spannableStringBuilder.length(), 17);
        textView.setText(spannableStringBuilder);
    }

    /* renamed from: a */
    public static final void m139704a(Context context, String str, String str2, TextView textView) {
        if (context != null && textView != null) {
            m139702a(context, textView, m139707a(str, str2));
        }
    }

    /* renamed from: a */
    public static final void m139705a(Context context, String str, String str2, TextView textView, boolean z) {
        if (context != null && textView != null && m139707a(str, str2)) {
            m139709b(context, textView, z);
        }
    }
}
