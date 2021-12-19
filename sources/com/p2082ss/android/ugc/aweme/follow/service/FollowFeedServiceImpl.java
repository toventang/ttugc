package com.p2082ss.android.ugc.aweme.follow.service;

import android.content.Context;
import android.text.TextPaint;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.AbstractC35329by;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49679g;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.C50403p;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.FollowTab;
import com.p2082ss.android.ugc.aweme.follow.presenter.C51079a;
import com.p2082ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.HomeTabViewModel;
import com.p2082ss.android.ugc.aweme.service.IFollowFeedService;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.follow.service.FollowFeedServiceImpl */
public final class FollowFeedServiceImpl implements IFollowFeedService {
    static {
        Covode.recordClassIndex(60280);
    }

    @Override // com.p2082ss.android.ugc.aweme.service.IFollowFeedService
    /* renamed from: b */
    public final Fragment mo86504b() {
        return new C50403p();
    }

    /* renamed from: c */
    public static IFollowFeedService m95503c() {
        MethodCollector.m26663i(10278);
        Object a = C81908b.m141854a(IFollowFeedService.class, false);
        if (a != null) {
            IFollowFeedService iFollowFeedService = (IFollowFeedService) a;
            MethodCollector.m26664o(10278);
            return iFollowFeedService;
        }
        if (C81908b.f183237bn == null) {
            synchronized (IFollowFeedService.class) {
                try {
                    if (C81908b.f183237bn == null) {
                        C81908b.f183237bn = new FollowFeedServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(10278);
                    throw th;
                }
            }
        }
        FollowFeedServiceImpl followFeedServiceImpl = (FollowFeedServiceImpl) C81908b.f183237bn;
        MethodCollector.m26664o(10278);
        return followFeedServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.service.IFollowFeedService
    /* renamed from: a */
    public final void mo86501a() {
        AbstractC81915c.m141874a(new C49679g());
    }

    @Override // com.p2082ss.android.ugc.aweme.service.IFollowFeedService
    /* renamed from: a */
    public final AbstractC35329by mo86498a(Context context) {
        C89219l.m154721d(context, "");
        return new FollowTab(context);
    }

    @Override // com.p2082ss.android.ugc.aweme.service.IFollowFeedService
    /* renamed from: a */
    public final String mo86499a(ActivityC0945e eVar) {
        String l;
        C89219l.m154721d(eVar, "");
        FollowTab followTab = (FollowTab) HomeTabViewModel.C53309a.m98315a(eVar).mo89735a("Following");
        if (followTab == null || (l = followTab.mo85043l()) == null) {
            return "";
        }
        return l;
    }

    @Override // com.p2082ss.android.ugc.aweme.service.IFollowFeedService
    /* renamed from: a */
    public final List<Aweme> mo86500a(List<? extends FollowFeed> list) {
        C89219l.m154721d(list, "");
        List<Aweme> a = C51079a.m95491a((List<FollowFeed>) list);
        C89219l.m154716b(a, "");
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.service.IFollowFeedService
    /* renamed from: b */
    public final float mo86503b(ActivityC0945e eVar) {
        TextView textView;
        TextPaint paint;
        C89219l.m154721d(eVar, "");
        FollowTab followTab = (FollowTab) HomeTabViewModel.C53309a.m98315a(eVar).mo89735a("Following");
        if (followTab == null || (textView = followTab.f115343k) == null || (paint = textView.getPaint()) == null) {
            return 0.0f;
        }
        return paint.measureText(followTab.mo62207Y_());
    }

    @Override // com.p2082ss.android.ugc.aweme.service.IFollowFeedService
    /* renamed from: a */
    public final void mo86502a(ActivityC0945e eVar, float f) {
        TextView textView;
        C89219l.m154721d(eVar, "");
        FollowTab followTab = (FollowTab) HomeTabViewModel.C53309a.m98315a(eVar).mo89735a("Following");
        if (followTab != null && (textView = followTab.f115343k) != null) {
            textView.setTextSize(1, f);
        }
    }
}
