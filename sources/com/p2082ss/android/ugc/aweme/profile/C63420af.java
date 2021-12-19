package com.p2082ss.android.ugc.aweme.profile;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.p084a.p088b.C1870c;
import com.p2082ss.android.common.util.C29844g;
import com.p2082ss.android.ugc.aweme.lego.C58254p;
import com.p2082ss.android.ugc.aweme.p3682s.C67261e;
import com.p2082ss.android.ugc.aweme.profile.experiment.C63753j;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.profile.af */
public final class C63420af {
    static {
        Covode.recordClassIndex(74711);
    }

    /* renamed from: a */
    public static String m114996a(String str) {
        if (TextUtils.isEmpty(str)) {
            return " ";
        }
        return str;
    }

    /* renamed from: a */
    public static void m114997a(Context context) {
        long g = C67261e.m119189g();
        if (g != -1) {
            C58254p.f132679a.postDelayed(new RunnableC63421ag(context), g);
            return;
        }
        C1870c.m6050a(context, "profile_fragment_user_mt");
        C1870c.m6050a(context, "profile_fragment_aweme_list_mus");
    }

    /* renamed from: a */
    public static void m114998a(TextView textView, String str) {
        if (TextUtils.isEmpty(str)) {
            textView.setText(R.string.fxt);
            return;
        }
        while (str.contains("\n\n")) {
            str = str.replaceAll("\n\n", "\n");
        }
        textView.setText(str);
    }

    /* renamed from: a */
    public static void m114999a(C29844g gVar, Integer num, int i) {
        if (C63753j.f144516a && num != null && num.intValue() == 1000 && i == 0) {
            gVar.mo52128a("filter_private", 1);
        }
    }
}
