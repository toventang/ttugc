package com.p2082ss.android.ugc.aweme.commerce.p2505a;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38703bs;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.effectmanager.common.utils.MD5Utils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.commerce.a.j */
public final class C37474j {
    static {
        Covode.recordClassIndex(44859);
    }

    /* renamed from: a */
    public static String m75558a(Aweme aweme) {
        if (!m75564e(aweme)) {
            return "";
        }
        return C38703bs.m78536e(aweme).javascriptResource;
    }

    /* renamed from: b */
    public static String m75560b(Aweme aweme) {
        if (!m75564e(aweme)) {
            return "";
        }
        return C38703bs.m78536e(aweme).vender;
    }

    /* renamed from: c */
    public static String m75562c(Aweme aweme) {
        if (!m75564e(aweme)) {
            return "";
        }
        return C38703bs.m78536e(aweme).verificationParameters;
    }

    /* renamed from: d */
    public static String m75563d(Aweme aweme) {
        return MD5Utils.getMD5String(m75558a(aweme) + m75560b(aweme) + m75562c(aweme));
    }

    /* renamed from: e */
    private static boolean m75564e(Aweme aweme) {
        if (!C37699a.m76314s(aweme) || aweme.getAwemeRawAd().getOmVast() == null || C38703bs.m78536e(aweme) == null || C38703bs.m78536e(aweme) == null) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static boolean m75561b(View view, int i, int i2) {
        if (((float) view.getHeight()) <= ((float) i) * 0.8f || ((float) view.getWidth()) <= ((float) i2) * 0.8f) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static List<View> m75559a(View view, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        if (m75561b(view, i, i2)) {
            arrayList.add(view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                View childAt = viewGroup.getChildAt(i3);
                if (m75561b(view, i, i2)) {
                    arrayList.add(childAt);
                }
                arrayList.addAll(m75559a(childAt, i, i2));
            }
        }
        return arrayList;
    }
}
