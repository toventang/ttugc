package com.p2082ss.android.ugc.aweme.discover.helper;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.detail.p2748g.C41131d;
import com.p2082ss.android.ugc.aweme.discover.api.SearchContinuousLoadingApi;
import com.p2082ss.android.ugc.aweme.discover.model.ContinuousLoadingAwemeList;
import com.p2082ss.android.ugc.aweme.discover.p2787m.AbstractC42293b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49672ag;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50529ae;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.helper.x */
public final class C42058x implements AbstractC42293b.AbstractC42294a<FollowStatus> {

    /* renamed from: b */
    public static final WeakHashMap<Object, ContinuousLoadingAwemeList> f98054b = new WeakHashMap<>();

    /* renamed from: c */
    public static final C42059a f98055c = new C42059a((byte) 0);

    /* renamed from: a */
    public final AbstractC42060b f98056a;

    /* renamed from: com.ss.android.ugc.aweme.discover.helper.x$b */
    public interface AbstractC42060b {
        static {
            Covode.recordClassIndex(49990);
        }

        /* renamed from: a */
        boolean mo70987a(Aweme aweme);

        Object aR_();

        List<Aweme> aS_();

        List<Aweme> aT_();

        int aU_();
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.helper.x$a */
    public static final class C42059a {
        static {
            Covode.recordClassIndex(49989);
        }

        private C42059a() {
        }

        public /* synthetic */ C42059a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C42058x m84178a(AbstractC42060b bVar) {
            C89219l.m154721d(bVar, "");
            return new C42058x(bVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2787m.AbstractC42293b.AbstractC42294a
    /* renamed from: a */
    public final Class<FollowStatus> mo60371a() {
        return FollowStatus.class;
    }

    static {
        Covode.recordClassIndex(49988);
    }

    /* renamed from: b */
    private final ContinuousLoadingAwemeList m84173b() {
        List<Aweme> arrayList;
        Object aR_ = this.f98056a.aR_();
        if (aR_ == null) {
            return null;
        }
        WeakHashMap<Object, ContinuousLoadingAwemeList> weakHashMap = f98054b;
        ContinuousLoadingAwemeList continuousLoadingAwemeList = weakHashMap.get(aR_);
        if (continuousLoadingAwemeList != null) {
            return continuousLoadingAwemeList;
        }
        List<Aweme> aS_ = this.f98056a.aS_();
        if (aS_ != null) {
            arrayList = C89070n.m154585g((Collection) aS_);
        } else {
            arrayList = new ArrayList<>();
        }
        ContinuousLoadingAwemeList continuousLoadingAwemeList2 = new ContinuousLoadingAwemeList();
        continuousLoadingAwemeList2.awemeList = arrayList;
        continuousLoadingAwemeList2.cursor = arrayList.size();
        continuousLoadingAwemeList2.hasMore = 1;
        weakHashMap.put(aR_, continuousLoadingAwemeList2);
        return continuousLoadingAwemeList2;
    }

    public C42058x(AbstractC42060b bVar) {
        C89219l.m154721d(bVar, "");
        this.f98056a = bVar;
        C41985ae.f97915a.mo71487a((AbstractC42293b.AbstractC42294a<?>) this);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.p2082ss.android.ugc.aweme.discover.p2787m.AbstractC42293b.AbstractC42294a
    /* renamed from: a */
    public final /* synthetic */ void mo60372a(FollowStatus followStatus) {
        FollowStatus followStatus2 = followStatus;
        C89219l.m154721d(followStatus2, "");
        Iterator<T> it = f98054b.entrySet().iterator();
        while (it.hasNext()) {
            List<Aweme> list = ((ContinuousLoadingAwemeList) it.next().getValue()).awemeList;
            if (list != null) {
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    User author = it2.next().getAuthor();
                    if (author != null && C89219l.m154714a((Object) followStatus2.userId, (Object) author.getUid())) {
                        author.setFollowStatus(followStatus2.followStatus);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private final List<Aweme> m84172a(List<Aweme> list, Aweme aweme) {
        int i;
        int i2 = -1;
        int i3 = 0;
        for (T t : list) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                C89070n.m154520a();
            }
            if (C89219l.m154714a((Object) aweme.getAid(), (Object) t.getAid())) {
                i2 = i3;
            }
            i3 = i4;
        }
        int i5 = i2 + 1;
        AbstractC42060b bVar = this.f98056a;
        List<Aweme> list2 = null;
        int intValue = (bVar != null ? Integer.valueOf(bVar.aU_()) : null).intValue();
        if (i5 >= intValue) {
            i = i5 - intValue;
        } else {
            if (list.size() < intValue) {
                intValue = list.size();
            }
            i5 = intValue;
            i = 0;
        }
        AbstractC42060b bVar2 = this.f98056a;
        if (bVar2 != null) {
            list2 = bVar2.aT_();
        }
        List<Aweme> g = C89070n.m154585g((Collection) list.subList(i, i5));
        if (list2 != null && list2.size() > 0) {
            g.addAll(0, list2);
        }
        return g;
    }

    /* renamed from: a */
    public final void mo71225a(C49672ag agVar, Aweme aweme, AbstractC89183m<? super Aweme, ? super List<Aweme>, C89391z> mVar) {
        ContinuousLoadingAwemeList b;
        List<Aweme> list;
        List<Aweme> a;
        C89219l.m154721d(agVar, "");
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(mVar, "");
        if (!(!C89219l.m154714a((Object) agVar.f114319e, (Object) "from_search_continuous_loading_card")) && (b = m84173b()) != null && (list = b.awemeList) != null) {
            if (this.f98056a.mo70987a(aweme)) {
                a = null;
            } else {
                a = m84172a(list, aweme);
            }
            mVar.invoke(aweme, a);
        }
    }

    /* renamed from: a */
    public final void mo71224a(Context context, Bundle bundle, SearchContinuousLoadingApi.C41847b bVar) {
        int i;
        long j;
        Aweme aweme;
        C89219l.m154721d(context, "");
        C89219l.m154721d(bundle, "");
        C89219l.m154721d(bVar, "");
        ContinuousLoadingAwemeList b = m84173b();
        if (b != null) {
            List<Aweme> list = b.awemeList;
            if (list != null) {
                i = list.size();
            } else {
                i = 0;
            }
            bVar.f97619d = i;
            List<Aweme> list2 = b.awemeList;
            if (list2 == null || (aweme = (Aweme) C89070n.m154588i((List) list2)) == null) {
                j = 0;
            } else {
                j = aweme.getCreateTime();
            }
            bVar.f97621f = j;
            C41131d dVar = new C41131d();
            dVar.mo70383a(b);
            dVar.mo70382a().mo71012a(bVar);
            C50529ae.f116790a = dVar;
            bundle.putString("video_from", "from_search_continuous_loading_card");
            SmartRouter.buildRoute(context, "//aweme/detail").withParam(bundle).open();
        }
    }
}
