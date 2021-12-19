package com.p2082ss.android.ugc.aweme.detail.p2751ui;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.view.animation.AccelerateInterpolator;
import android.widget.RelativeLayout;
import androidx.core.p037h.C0792v;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.detail.p2751ui.p2752a.C41346a;
import com.p2082ss.android.ugc.aweme.detail.transition.C41333b;
import com.p2082ss.android.ugc.aweme.feed.C48311ag;
import com.p2082ss.android.ugc.aweme.feed.adapter.C48238ce;
import com.p2082ss.android.ugc.aweme.feed.adapter.C48245ck;
import com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewCell;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import com.p2082ss.android.ugc.aweme.feed.trending.C49948a;
import com.p2082ss.android.ugc.aweme.trending.service.ITrendingFeedService;
import com.p2082ss.android.ugc.aweme.trending.service.TrendingDetailServiceImpl;
import com.p2082ss.android.ugc.aweme.video.preload.p4213a.C80826e;
import com.p2082ss.android.ugc.trill.R;
import org.greenrobot.eventbus.AbstractC90253j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.detail.ui.DetailFeedVideoViewHolder */
public final class DetailFeedVideoViewHolder extends VideoViewCell implements AbstractC90253j {

    /* renamed from: a */
    private boolean f96496a = true;

    /* renamed from: b */
    private final BaseFeedPageParams f96497b;

    /* renamed from: c */
    private ViewStub f96498c;

    /* renamed from: d */
    private C49948a f96499d;

    /* renamed from: e */
    private C41346a f96500e;

    static {
        Covode.recordClassIndex(49233);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai, com.p2082ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    /* renamed from: e */
    public final C48311ag mo70617e() {
        return new C48311ag(true, C80826e.m140220a().f180767a);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai, com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewCell
    /* renamed from: j */
    public final void mo70620j() {
        super.mo70620j();
        ValueAnimator valueAnimator = this.f96500e.f96506a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai, com.p2082ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    /* renamed from: f */
    public final void mo70618f() {
        super.mo70618f();
        C49948a aVar = this.f96499d;
        if (aVar != null) {
            Aweme aweme = aVar.f115137b;
            if (aweme != null) {
                aweme.getAid();
            }
            aVar.mo84993a();
            aVar.mo84994b();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai, com.p2082ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    /* renamed from: i */
    public final void mo70619i() {
        super.mo70619i();
        C41346a aVar = this.f96500e;
        RelativeLayout relativeLayout = this.f111470p;
        C89219l.m154716b(relativeLayout, "");
        C89219l.m154721d(relativeLayout, "");
        if (relativeLayout.getChildCount() != 0 && aVar.f96507b) {
            aVar.mo70633a(relativeLayout);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai, com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewCell
    /* renamed from: a */
    public final void mo70614a(int i) {
        super.mo70614a(i);
        C49948a aVar = this.f96499d;
        if (aVar != null) {
            Aweme aweme = aVar.f115137b;
            if (aweme != null) {
                aweme.getAid();
            }
            View view = aVar.f115138c;
            if (view != null && view.getVisibility() == 0) {
                aVar.mo84994b();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai, com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewCell
    /* renamed from: a */
    public final void mo70615a(Aweme aweme) {
        super.mo70615a(aweme);
        C49948a aVar = this.f96499d;
        if (!(aVar == null || aweme == null)) {
            aweme.getDesc();
            aVar.f115137b = aweme;
        }
        if (C41333b.f96464a && aweme != null) {
            C0792v.m2752a(this.f111377H, aweme.getAid());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DetailFeedVideoViewHolder(C48238ce ceVar) {
        super(ceVar);
        ActivityC0945e activity;
        C89219l.m154721d(ceVar, "");
        MethodCollector.m26663i(10402);
        BaseFeedPageParams baseFeedPageParams = ceVar.f111748e;
        this.f96497b = baseFeedPageParams;
        View findViewById = ceVar.f111744a.findViewById(R.id.enp);
        C89219l.m154716b(findViewById, "");
        this.f96498c = (ViewStub) findViewById;
        ITrendingFeedService b = TrendingDetailServiceImpl.m137898b();
        C49812b bVar = baseFeedPageParams.param;
        C89219l.m154716b(bVar, "");
        String enterMethodValue = bVar.getEnterMethodValue();
        C89219l.m154716b(enterMethodValue, "");
        boolean z = !b.mo122882a(enterMethodValue);
        C49812b bVar2 = baseFeedPageParams.param;
        C89219l.m154716b(bVar2, "");
        if (!TextUtils.isEmpty(bVar2.getTrendingEventId()) && z) {
            View inflate = this.f96498c.inflate();
            Fragment fragment = this.f111310l;
            if (!(fragment == null || (activity = fragment.getActivity()) == null)) {
                C89219l.m154716b(inflate, "");
                C89219l.m154716b(activity, "");
                this.f96499d = new C49948a(inflate, activity);
            }
        }
        this.f96500e = new C41346a();
        MethodCollector.m26664o(10402);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai, com.p2082ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    /* renamed from: a */
    public final void mo70616a(boolean z) {
        super.mo70616a(z);
        C41346a aVar = this.f96500e;
        RelativeLayout relativeLayout = this.f111470p;
        C89219l.m154716b(relativeLayout, "");
        C89219l.m154721d(relativeLayout, "");
        aVar.f96507b = z;
        ValueAnimator valueAnimator = aVar.f96506a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (z) {
            C48245ck.f111773c = 0;
            relativeLayout.setAlpha(0.0f);
            aVar.f96506a = ValueAnimator.ofFloat(relativeLayout.getAlpha(), 1.0f);
            ValueAnimator valueAnimator2 = aVar.f96506a;
            if (valueAnimator2 != null) {
                valueAnimator2.setDuration(400L);
            }
        } else {
            C48245ck.f111773c = 1;
            aVar.f96506a = ValueAnimator.ofFloat(relativeLayout.getAlpha(), 0.0f);
            ValueAnimator valueAnimator3 = aVar.f96506a;
            if (valueAnimator3 != null) {
                valueAnimator3.setDuration(200L);
            }
        }
        ValueAnimator valueAnimator4 = aVar.f96506a;
        if (valueAnimator4 != null) {
            valueAnimator4.setInterpolator(new AccelerateInterpolator());
        }
        ValueAnimator valueAnimator5 = aVar.f96506a;
        if (valueAnimator5 != null) {
            valueAnimator5.addUpdateListener(new C41346a.C41348b(relativeLayout));
        }
        ValueAnimator valueAnimator6 = aVar.f96506a;
        if (valueAnimator6 != null) {
            valueAnimator6.start();
        }
    }
}
