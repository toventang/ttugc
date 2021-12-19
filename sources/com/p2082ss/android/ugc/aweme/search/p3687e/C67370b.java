package com.p2082ss.android.ugc.aweme.search.p3687e;

import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.model.SearchIntermediateViewModel;
import com.p2082ss.android.ugc.aweme.search.C67458j;
import com.p2082ss.android.ugc.aweme.search.activity.SearchResultActivity;
import com.p2082ss.android.ugc.aweme.search.p3695k.AbstractC67567q;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67469ad;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67486am;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67540c;
import com.p2082ss.android.ugc.aweme.utils.C80214ai;
import com.p2082ss.android.ugc.aweme.utils.C80359du;
import com.p2082ss.android.ugc.aweme.utils.C80514gu;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.search.e.b */
public final class C67370b {
    static {
        Covode.recordClassIndex(79000);
    }

    /* renamed from: com.ss.android.ugc.aweme.search.e.b$a */
    static final class RunnableC67371a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C67368a f150943a;

        /* renamed from: b */
        final /* synthetic */ String f150944b;

        static {
            Covode.recordClassIndex(79001);
        }

        RunnableC67371a(C67368a aVar, String str) {
            this.f150943a = aVar;
            this.f150944b = str;
        }

        public final void run() {
            C67469ad adVar;
            String str;
            Integer num;
            String str2;
            String str3;
            AbstractC67567q a = C67486am.m119564a();
            String str4 = null;
            if (a != null) {
                adVar = a.mo106431c();
            } else {
                adVar = null;
            }
            SearchResultActivity a2 = C80514gu.m139557a();
            JSONObject b = C80359du.m139329b(this.f150944b);
            if (b == null || (str = b.optString("search_bonus_id")) == null) {
                str = "";
            }
            if (a2 == null || (num = ((SearchIntermediateViewModel) C1181ae.m3881a(a2, (C1175ad.AbstractC1177b) null).mo3983a(SearchIntermediateViewModel.class)).getSearchTabIndex().getValue()) == null) {
                num = -1;
            }
            C89219l.m154716b(num, "");
            int intValue = num.intValue();
            C67368a aVar = this.f150943a;
            if (adVar != null) {
                str2 = adVar.f151151a;
            } else {
                str2 = null;
            }
            C67540c a3 = aVar.mo106480a(str2);
            if (adVar != null) {
                str3 = adVar.f151151a;
            } else {
                str3 = null;
            }
            C67540c d = a3.mo106484d(str3);
            if (adVar != null) {
                str4 = adVar.f151152b;
            }
            C67540c f = ((C67540c) d.mo106482b(str4).mo106459o(C67458j.m119529a(a2))).mo106486f(C67458j.m119531b(intValue));
            f.mo106452c("search_bonus_id", str);
            f.mo96792f();
        }
    }

    /* renamed from: a */
    public static final void m119416a(C67368a aVar, String str) {
        C89219l.m154721d(aVar, "");
        C80214ai.m139042a(new RunnableC67371a(aVar, str), "BoltsUtils");
    }
}
