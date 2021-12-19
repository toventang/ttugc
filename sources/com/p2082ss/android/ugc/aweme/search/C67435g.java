package com.p2082ss.android.ugc.aweme.search;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.app.C0576b;
import androidx.core.p036g.C0692e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.p2770e.C41937p;
import com.p2082ss.android.ugc.aweme.discover.p2775j.C42097l;
import com.p2082ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.p2082ss.android.ugc.aweme.search.activity.SearchResultActivity;
import com.p2082ss.android.ugc.aweme.search.model.C67674b;
import com.p2082ss.android.ugc.aweme.search.model.C67678d;
import com.p2082ss.android.ugc.aweme.search.p3687e.C67375d;
import com.p2082ss.android.ugc.aweme.search.p3696l.C67639l;
import com.p2082ss.android.ugc.aweme.search.p3696l.p3697a.C67602d;
import com.p2082ss.android.ugc.aweme.search.p3705s.C67721b;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.search.g */
public final class C67435g {

    /* renamed from: a */
    public static final C67435g f151077a = new C67435g();

    /* renamed from: b */
    private static long f151078b;

    private C67435g() {
    }

    static {
        Covode.recordClassIndex(79071);
    }

    /* renamed from: a */
    private static boolean m119471a() {
        long currentTimeMillis = System.currentTimeMillis();
        f151078b = currentTimeMillis;
        if (currentTimeMillis - f151078b >= 1000) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m119470a(Context context, C67678d dVar, C67674b bVar, Bundle bundle) {
        String str;
        String str2;
        C89219l.m154721d(dVar, "");
        if (m119471a() && context != null) {
            C67639l.f151540a = System.currentTimeMillis();
            C42097l.m84310a();
            C67602d.f151416a.mo106575a();
            if (dVar.getKeyword() != null) {
                C67721b.m119889a(dVar);
                C67375d.f150947a.mo106291b();
            }
            dVar.setSearchEnterParam(bVar);
            boolean z = true;
            int i = 0;
            if (!TextUtils.isEmpty(dVar.getSwitchTab())) {
                String switchTab = dVar.getSwitchTab();
                C89219l.m154716b(switchTab, "");
                Integer valueOf = Integer.valueOf(C67458j.m119530b(switchTab));
                if (valueOf.intValue() >= 0 && valueOf != null) {
                    i = valueOf.intValue();
                }
                if (dVar.getFilterOption().isDefaultOption()) {
                    AbstractC81915c.m141874a(new C41937p(i));
                } else {
                    AbstractC81915c.m141874a(new C41937p(i, dVar.getFilterOption()));
                }
            } else {
                boolean a = MSAdaptionService.m97895c().mo89372a(context);
                if (bVar != null) {
                    str = bVar.getEnterSearchFrom();
                } else {
                    str = null;
                }
                if (!TextUtils.equals(str, "homepage_hot")) {
                    if (bVar != null) {
                        str2 = bVar.getEnterSearchFrom();
                    } else {
                        str2 = null;
                    }
                    if (!TextUtils.equals(str2, "homepage_follow")) {
                        z = false;
                    }
                }
                if (!(context instanceof Activity) || a || z) {
                    SearchResultActivity.C67340a.m119398a(context, dVar, bVar, null);
                    return;
                }
                if (bundle == null) {
                    bundle = C0576b.m2190a((Activity) context, new C0692e[0]).mo2564a();
                }
                SearchResultActivity.C67340a.m119398a(context, dVar, bVar, bundle);
            }
        }
    }
}
