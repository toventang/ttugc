package com.p2082ss.android.ugc.aweme.forward.statistics;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.forward.statistics.ForwardStatisticsServiceImpl */
public class ForwardStatisticsServiceImpl implements IForwardStatisticsService {
    static {
        Covode.recordClassIndex(60635);
    }

    @Override // com.p2082ss.android.ugc.aweme.forward.statistics.IForwardStatisticsService
    /* renamed from: a */
    public final String mo86842a() {
        C17873f.m33102j();
        return "list";
    }

    /* renamed from: b */
    public static IForwardStatisticsService m95759b() {
        MethodCollector.m26663i(7114);
        Object a = C81908b.m141854a(IForwardStatisticsService.class, false);
        if (a != null) {
            IForwardStatisticsService iForwardStatisticsService = (IForwardStatisticsService) a;
            MethodCollector.m26664o(7114);
            return iForwardStatisticsService;
        }
        if (C81908b.f183238bo == null) {
            synchronized (IForwardStatisticsService.class) {
                try {
                    if (C81908b.f183238bo == null) {
                        C81908b.f183238bo = new ForwardStatisticsServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(7114);
                    throw th;
                }
            }
        }
        ForwardStatisticsServiceImpl forwardStatisticsServiceImpl = (ForwardStatisticsServiceImpl) C81908b.f183238bo;
        MethodCollector.m26664o(7114);
        return forwardStatisticsServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.forward.statistics.IForwardStatisticsService
    /* renamed from: a */
    public final HashMap<String, String> mo86843a(Aweme aweme, String str) {
        return C51416a.m95775a(aweme, str);
    }

    @Override // com.p2082ss.android.ugc.aweme.forward.statistics.IForwardStatisticsService
    /* renamed from: a */
    public final HashMap<String, String> mo86844a(String str, Aweme aweme) {
        return C51416a.m95776a(str, aweme);
    }

    @Override // com.p2082ss.android.ugc.aweme.forward.statistics.IForwardStatisticsService
    /* renamed from: a */
    public final C33743c mo86841a(C33743c cVar, Aweme aweme, String str) {
        return C51416a.m95774a(cVar, aweme, str);
    }

    @Override // com.p2082ss.android.ugc.aweme.forward.statistics.IForwardStatisticsService
    /* renamed from: a */
    public final JSONObject mo86845a(JSONObject jSONObject, Aweme aweme, String str) {
        return C51416a.m95774a(C33743c.m69072a(jSONObject), aweme, str).mo59977a();
    }

    @Override // com.p2082ss.android.ugc.aweme.forward.statistics.IForwardStatisticsService
    /* renamed from: b */
    public final C33743c mo86847b(C33743c cVar, Aweme aweme, String str) {
        if (cVar == null) {
            cVar = new C33743c();
        }
        if (aweme != null) {
            cVar.mo59976a("enter_from", str);
            cVar.mo59976a("author_id", aweme.getAuthorUid());
            cVar.mo59976a("request_id", C59208ac.m108763b(aweme));
        }
        return cVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.forward.statistics.IForwardStatisticsService
    /* renamed from: a */
    public final void mo86846a(String str, Aweme aweme, String str2, String str3) {
        C33744d dVar = new C33744d();
        dVar.mo59985a((HashMap<? extends String, ? extends String>) C51416a.m95776a(str, aweme)).mo59985a((HashMap<? extends String, ? extends String>) C51416a.m95775a(aweme, str2)).mo59983a("enter_method", str3);
        if ("homepage_country".equals(str) && aweme.getAuthor() != null) {
            dVar.mo59983a("country_name", aweme.getAuthor().getRegion());
        }
        C39162r.m79460a("click_comment_and_repost", dVar.f79943a);
    }
}
