package com.p2082ss.android.ugc.aweme.feedback;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.common.util.C29844g;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.FeedbackConf;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p2082ss.android.ugc.aweme.p2479ck.C36125t;
import com.p2082ss.android.ugc.aweme.p2479ck.C36131u;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.feedback.b */
public final class C50567b {

    /* renamed from: a */
    public static final C50567b f116860a = new C50567b();

    private C50567b() {
    }

    static {
        Covode.recordClassIndex(59714);
    }

    /* renamed from: a */
    public static boolean m94799a(Activity activity, String str) {
        String str2 = "";
        C89219l.m154721d(activity, str2);
        C89219l.m154721d(str, str2);
        try {
            IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
            C89219l.m154716b(iESSettingsProxy, str2);
            FeedbackConf feedbackConf = iESSettingsProxy.getFeedbackConf();
            C89219l.m154716b(feedbackConf, str2);
            String feRecord = feedbackConf.getFeRecord();
            C89219l.m154716b(feRecord, str2);
            str2 = feRecord;
        } catch (Exception unused) {
        }
        C36131u a = C36131u.m73602a(str2);
        a.mo63248a("enter_from", str);
        C36125t.m73598a(C36125t.m73591a(), a.f85356a.mo52126a());
        return true;
    }

    /* renamed from: a */
    public static void m94798a(String str, HashMap<String, String> hashMap) {
        if (!(str == null || str.length() == 0)) {
            for (String str2 : C89361p.m154915b(str, new String[]{"&"})) {
                List<String> b = C89361p.m154915b(str2, new String[]{"="});
                if (b.size() == 2) {
                    hashMap.put(b.get(0), b.get(1));
                }
            }
        }
    }

    /* renamed from: b */
    public static String m94800b(String str, HashMap<String, String> hashMap) {
        int a = C89361p.m154882a((CharSequence) str, '?', 0, false, 6);
        if (a > 0) {
            Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
            str = str.substring(0, a);
            C89219l.m154716b(str, "");
        }
        C29844g gVar = new C29844g(str);
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            gVar.mo52130a(entry.getKey(), entry.getValue());
        }
        String a2 = gVar.mo52126a();
        C89219l.m154716b(a2, "");
        return a2;
    }
}
