package com.p2082ss.android.ugc.aweme;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.detail.api.DetailApi;
import com.p2082ss.android.ugc.aweme.detail.p2748g.C41128a;
import com.p2082ss.android.ugc.aweme.detail.p2751ui.C41401l;
import com.p2082ss.android.ugc.aweme.detail.p2751ui.DetailActivity;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.param.C49811a;
import com.p2082ss.android.ugc.trill.R;
import java.util.Map;
import p4600h.C89378p;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.DetailFeedServiceImpl */
public final class DetailFeedServiceImpl implements DetailFeedService {
    static {
        Covode.recordClassIndex(37924);
    }

    @Override // com.p2082ss.android.ugc.aweme.DetailFeedService
    /* renamed from: a */
    public final Class<? extends Activity> mo57058a() {
        return DetailActivity.class;
    }

    /* renamed from: b */
    public static DetailFeedService m65254b() {
        MethodCollector.m26663i(10283);
        Object a = C81908b.m141854a(DetailFeedService.class, false);
        if (a != null) {
            DetailFeedService detailFeedService = (DetailFeedService) a;
            MethodCollector.m26664o(10283);
            return detailFeedService;
        }
        if (C81908b.f183407p == null) {
            synchronized (DetailFeedService.class) {
                try {
                    if (C81908b.f183407p == null) {
                        C81908b.f183407p = new DetailFeedServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(10283);
                    throw th;
                }
            }
        }
        DetailFeedServiceImpl detailFeedServiceImpl = (DetailFeedServiceImpl) C81908b.f183407p;
        MethodCollector.m26664o(10283);
        return detailFeedServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.DetailFeedService
    /* renamed from: a */
    public final C41128a mo57055a(String str) {
        C41128a a = DetailApi.m82808a(str, null, null, 4);
        C89219l.m154716b(a, "");
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.DetailFeedService
    /* renamed from: a */
    public final Fragment mo57054a(Activity activity) {
        C89219l.m154721d(activity, "");
        C41401l a = C41401l.m83282a(C49811a.m93273a(activity), new Bundle());
        C89219l.m154716b(a, "");
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.DetailFeedService
    /* renamed from: a */
    public final Map<String, View> mo57059a(View view) {
        C89219l.m154721d(view, "");
        View findViewById = view.findViewById(R.id.bzd);
        View findViewById2 = view.findViewById(R.id.fhs);
        if (findViewById != null) {
            Map<String, View> b = C89041ag.m154427b(new C89378p("search_icon_in_feed", findViewById));
            if (findViewById2 != null) {
                b.put("search_bar_in_feed", findViewById2);
            }
            return b;
        }
        throw new IllegalStateException("no search icon find in your layout");
    }

    @Override // com.p2082ss.android.ugc.aweme.DetailFeedService
    /* renamed from: a */
    public final Aweme mo57057a(String str, String str2) {
        Aweme a = DetailApi.m82809a(str, str2, 0);
        C89219l.m154716b(a, "");
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.DetailFeedService
    /* renamed from: a */
    public final C41128a mo57056a(String str, String str2, String str3) {
        C41128a a = DetailApi.m82808a(str, str2, str3, 0);
        C89219l.m154716b(a, "");
        return a;
    }
}
