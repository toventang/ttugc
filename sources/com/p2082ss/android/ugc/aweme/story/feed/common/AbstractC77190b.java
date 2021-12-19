package com.p2082ss.android.ugc.aweme.story.feed.common;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.feed.adapter.C48238ce;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.story.feed.p4046ui.progress.StoryListProgressBar;
import dmt.viewpager.DmtRtlViewPager;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.feed.common.b */
public abstract class AbstractC77190b implements AbstractC1214u<C33942b> {

    /* renamed from: a */
    public C77201c f173166a;

    /* renamed from: b */
    public DmtRtlViewPager f173167b;

    /* renamed from: c */
    public StoryFeedViewModel f173168c;

    /* renamed from: d */
    public AbstractC77188a f173169d;

    /* renamed from: e */
    public Context f173170e;

    /* renamed from: f */
    public StoryListProgressBar f173171f;

    /* renamed from: g */
    public C48238ce f173172g;

    /* renamed from: h */
    public View f173173h;

    static {
        Covode.recordClassIndex(90202);
    }

    /* renamed from: a */
    public abstract void mo120804a(int i);

    /* renamed from: a */
    public abstract void mo120805a(Aweme aweme, int i);

    /* renamed from: b */
    public abstract void mo120806b(int i);

    /* renamed from: g */
    public abstract void mo120807g();

    /* renamed from: a */
    public final C77201c mo120808a() {
        C77201c cVar = this.f173166a;
        if (cVar == null) {
            C89219l.m154710a("adapter");
        }
        return cVar;
    }

    /* renamed from: b */
    public final DmtRtlViewPager mo120809b() {
        DmtRtlViewPager dmtRtlViewPager = this.f173167b;
        if (dmtRtlViewPager == null) {
            C89219l.m154710a("storyViewPager");
        }
        return dmtRtlViewPager;
    }

    /* renamed from: c */
    public final StoryFeedViewModel mo120810c() {
        StoryFeedViewModel storyFeedViewModel = this.f173168c;
        if (storyFeedViewModel == null) {
            C89219l.m154710a("storyFeedVM");
        }
        return storyFeedViewModel;
    }

    /* renamed from: d */
    public final AbstractC77188a mo120811d() {
        AbstractC77188a aVar = this.f173169d;
        if (aVar == null) {
            C89219l.m154710a("baseStoryPlayerView");
        }
        return aVar;
    }

    /* renamed from: e */
    public final Context mo120812e() {
        Context context = this.f173170e;
        if (context == null) {
            C89219l.m154710a("context");
        }
        return context;
    }

    /* renamed from: f */
    public final View mo120813f() {
        View view = this.f173173h;
        if (view == null) {
            C89219l.m154710a("rootView");
        }
        return view;
    }
}
