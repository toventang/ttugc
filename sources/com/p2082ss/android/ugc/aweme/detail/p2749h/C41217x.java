package com.p2082ss.android.ugc.aweme.detail.p2749h;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.p2082ss.android.ugc.aweme.detail.p2751ui.DetailActivity;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import com.p2082ss.android.ugc.aweme.feed.widget.FeedSwipeRefreshLayout;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.IIMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3252c.C56205f;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89206ad;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.detail.h.x */
public final class C41217x extends C41178b {

    /* renamed from: H */
    public static final C41218a f96322H = new C41218a((byte) 0);

    /* renamed from: F */
    public boolean f96323F;

    /* renamed from: G */
    public Bundle f96324G;

    /* renamed from: a */
    public List<Aweme> f96325a;

    static {
        Covode.recordClassIndex(49100);
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.h.x$a */
    public static final class C41218a {
        static {
            Covode.recordClassIndex(49101);
        }

        private C41218a() {
        }

        public /* synthetic */ C41218a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.p2749h.C41178b
    /* renamed from: C */
    public final void mo70437C() {
        super.mo70437C();
        if (!mo70548n() && this.f96323F) {
            VerticalViewPager verticalViewPager = this.f114759N;
            C89219l.m154716b(verticalViewPager, "");
            verticalViewPager.setDisableScroll(true);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.detail.p2749h.C41178b
    /* renamed from: m */
    public final void mo70387m() {
        if (!C56205f.m102123c()) {
            super.mo70387m();
        } else if (!mo70548n()) {
            Fragment aH_ = aH_();
            C89219l.m154716b(aH_, "");
            IMService.createIIMServicebyMonsterPlugin(false).showReplyFragment((ViewGroup) aH_.getView(), mo84913bY(), this.f96324G, null);
        }
    }

    /* renamed from: n */
    public final boolean mo70548n() {
        if (this.f183419bv == null) {
            return true;
        }
        Activity activity = this.f183419bv;
        C89219l.m154716b(activity, "");
        if (activity.isFinishing()) {
            return true;
        }
        Activity activity2 = this.f183419bv;
        C89219l.m154716b(activity2, "");
        if (activity2.isDestroyed() || aH_() == null) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.h.x$b */
    public static final class C41219b implements ViewPager.AbstractC1579e {

        /* renamed from: a */
        final /* synthetic */ C41217x f96326a;

        static {
            Covode.recordClassIndex(49102);
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageScrolled(int i, float f, int i2) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C41219b(C41217x xVar) {
            this.f96326a = xVar;
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageSelected(int i) {
            List<Aweme> list;
            String str;
            Aweme aweme;
            if (!this.f96326a.mo70548n() && (list = this.f96326a.f96325a) != null && i < list.size()) {
                List<Aweme> list2 = this.f96326a.f96325a;
                if (list2 == null || (aweme = list2.get(i)) == null) {
                    str = null;
                } else {
                    str = aweme.getAid();
                }
                IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
                Fragment fragment = this.f96326a.f183420bw;
                C89219l.m154716b(fragment, "");
                createIIMServicebyMonsterPlugin.showReplyFragment(fragment.getView(), this.f96326a.mo84913bY(), this.f96326a.f96324G, str);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a, com.p2082ss.android.ugc.aweme.detail.p2749h.C41178b
    /* renamed from: c */
    public final void mo70479c(int i) {
        super.mo70479c(i);
        if (!mo70548n()) {
            if (i != 1 && i != 4 && i != 2) {
                return;
            }
            if (this.f183419bv instanceof DetailActivity) {
                Activity activity = this.f183419bv;
                Objects.requireNonNull(activity, "null cannot be cast to non-null type com.ss.android.ugc.aweme.detail.ui.DetailActivity");
                ((DetailActivity) activity).onBackPressed();
                return;
            }
            Activity activity2 = this.f183419bv;
            if (activity2 != null) {
                activity2.onBackPressed();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81911c, com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81910b
    /* renamed from: a */
    public final void mo70547a(Bundle bundle) {
        super.mo70547a(bundle);
        C49812b bVar = this.f114782aJ;
        C89219l.m154716b(bVar, "");
        if (C89219l.m154714a((Object) bVar.getEnterMethodValue(), (Object) "click_quoted_message")) {
            this.f96323F = true;
            this.f114805ag = true;
        }
        StringBuilder sb = new StringBuilder("enter method: ");
        C49812b bVar2 = this.f114782aJ;
        C89219l.m154716b(bVar2, "");
        StringBuilder append = sb.append(bVar2.getEnterMethodValue()).append(" aid: ");
        C49812b bVar3 = this.f114782aJ;
        C89219l.m154716b(bVar3, "");
        StringBuilder append2 = append.append(bVar3.getAid()).append(" playing aid:");
        C49812b bVar4 = this.f114782aJ;
        C89219l.m154716b(bVar4, "");
        C56244a.m102191c("ReplyMessagePanel", append2.append(bVar4.getChatRoomPlayingRealAid()).toString());
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.List<java.lang.Object>, boolean] */
    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c, com.p2082ss.android.ugc.aweme.detail.p2749h.C41178b
    /* renamed from: b */
    public final void mo59517b(List<Aweme> list, boolean z) {
        if (!this.f96323F) {
            super.mo59517b(list, z);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41217x(Bundle bundle, C49812b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
        this.f96324G = bundle;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.List<java.lang.Object>, boolean] */
    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c, com.p2082ss.android.ugc.aweme.detail.p2749h.C41178b
    /* renamed from: c */
    public final void mo59523c(List<Aweme> list, boolean z) {
        if (this.f96323F) {
            super.mo59523c(list, false);
        } else {
            super.mo59523c(list, z);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49887w, com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a, com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81910b, com.p2082ss.android.ugc.aweme.detail.p2749h.C41178b
    /* renamed from: a */
    public final void mo70393a(View view, Bundle bundle) {
        if (!C56205f.m102123c()) {
            super.mo70393a(view, bundle);
            return;
        }
        super.mo70393a(view, bundle);
        if (this.f96323F) {
            FeedSwipeRefreshLayout feedSwipeRefreshLayout = this.f114766U;
            C89219l.m154716b(feedSwipeRefreshLayout, "");
            feedSwipeRefreshLayout.setEnabled(false);
        }
        this.f114759N.mo67974a(new C41219b(this));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.List<java.lang.Object>, boolean] */
    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c, com.p2082ss.android.ugc.aweme.detail.p2749h.C41178b
    /* renamed from: a */
    public final void mo59512a(List<Aweme> list, boolean z) {
        Object obj;
        this.f96325a = C89206ad.m154682d(list);
        StringBuilder sb = new StringBuilder("onRefreshResult size: ");
        if (list != null) {
            obj = Integer.valueOf(list.size());
        } else {
            obj = "null";
        }
        C56244a.m102191c("ReplyMessagePanel", sb.append(obj).append(" ").append(z).toString());
        if (this.f96323F) {
            super.mo59512a(list, false);
        } else {
            super.mo59512a(list, z);
        }
    }
}
