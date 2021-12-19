package com.p2082ss.android.ugc.aweme.story.feed.common;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.uikit.p1281c.C18247a;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.p1722h.C23163i;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.adaptation.C33403c;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37879bc;
import com.p2082ss.android.ugc.aweme.feed.adapter.C48238ce;
import com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewCell;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2949i.AbstractC49691s;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49672ag;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50545m;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.services.story.EnterStoryParam;
import com.p2082ss.android.ugc.aweme.services.story.IStoryService;
import com.p2082ss.android.ugc.aweme.story.feed.C77164a;
import com.p2082ss.android.ugc.aweme.story.p4019b.C76595e;
import com.p2082ss.android.ugc.aweme.story.p4019b.C76596f;
import com.p2082ss.android.ugc.aweme.story.p4019b.C76598h;
import com.p2082ss.android.ugc.aweme.story.p4019b.C76601k;
import com.p2082ss.android.ugc.aweme.story.p4019b.C76602l;
import com.p2082ss.android.ugc.aweme.story.p4019b.EnumC76597g;
import com.p2082ss.android.ugc.aweme.story.p4024c.C76660b;
import com.p2082ss.android.ugc.aweme.story.p4024c.C76677d;
import com.p2082ss.android.ugc.aweme.story.p4025d.C76706a;
import com.p2082ss.android.ugc.aweme.tux.business.story.StoryBrandView;
import com.p2082ss.android.ugc.trill.R;
import org.greenrobot.eventbus.AbstractC90253j;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.story.feed.common.StoryVideoViewHolder */
public class StoryVideoViewHolder extends VideoViewCell implements AbstractC90253j {
    static {
        Covode.recordClassIndex(90197);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewCell
    /* renamed from: ah */
    public final void mo80188ah() {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewCell
    /* renamed from: ai */
    public final void mo80189ai() {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewCell
    /* renamed from: aj */
    public final void mo80190aj() {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewCell
    /* renamed from: g */
    public final void mo80219g(Aweme aweme) {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewCell
    /* renamed from: h */
    public final void mo80222h(Aweme aweme) {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai, com.p2082ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    /* renamed from: V */
    public final void mo80107V() {
        super.mo80107V();
        this.f111313o.f111745b.mo63634a(new C49672ag(60, new C76595e(EnumC76597g.PLAY_GUIDE, null)));
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewCell
    /* renamed from: ao */
    public final void mo80194ao() {
        this.f111437ap.mo63634a(new C49672ag(60, new C76595e(EnumC76597g.NOTIFY_OUTER_VIEW_HOLDER, new C76596f("on_start_play_animation"))));
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewCell
    /* renamed from: aA */
    public final float mo80170aA() {
        String str;
        View invoke;
        if ((C76660b.m134242b() || C50545m.m94762a(this.f111308j)) && !TextUtils.equals("homepage_follow", this.f111313o.f111753j) && !TextUtils.equals("homepage_hot", this.f111313o.f111753j)) {
            str = "story_bubble_list_layout";
        } else {
            str = "place_holder_caption";
        }
        AbstractC89172b<String, View> bVar = this.f111313o.f111758o;
        if (bVar == null || (invoke = bVar.invoke(str)) == null) {
            return 0.0f;
        }
        return invoke.getY();
    }

    /* renamed from: com.ss.android.ugc.aweme.story.feed.common.StoryVideoViewHolder$b */
    static final class RunnableC77187b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ StoryVideoViewHolder f173151a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89236c f173152b;

        static {
            Covode.recordClassIndex(90199);
        }

        RunnableC77187b(StoryVideoViewHolder storyVideoViewHolder, C89233z.C89236c cVar) {
            this.f173151a = storyVideoViewHolder;
            this.f173152b = cVar;
        }

        public final void run() {
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            float height = (float) ((this.f173151a.f111313o.f111744a.getHeight() - this.f173152b.element) - C89241a.m154730a(TypedValue.applyDimension(1, 52.0f, system.getDisplayMetrics())));
            float f = 0.1f * height;
            float f2 = height * 0.7f;
            LinearLayout linearLayout = (LinearLayout) this.f173151a.f111313o.f111744a.findViewById(R.id.bbn);
            if (linearLayout != null) {
                ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                C23163i.m43668b(linearLayout, 0, Integer.valueOf(C89241a.m154730a(f)), 0, 0, false, 16);
                linearLayout.setLayoutParams(layoutParams);
            }
            StoryBrandView storyBrandView = (StoryBrandView) this.f173151a.f111313o.f111744a.findViewById(R.id.bbk);
            if (storyBrandView != null) {
                ViewGroup.LayoutParams layoutParams2 = storyBrandView.getLayoutParams();
                C23163i.m43668b(storyBrandView, 0, Integer.valueOf(C89241a.m154730a(f2)), 0, 0, false, 16);
                storyBrandView.setLayoutParams(layoutParams2);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StoryVideoViewHolder(C48238ce ceVar) {
        super(ceVar);
        C89219l.m154721d(ceVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public void onPlayCompleted(String str) {
        super.onPlayCompleted(str);
        this.f111437ap.mo63634a(new C49672ag(60, new C76595e(EnumC76597g.ON_PLAY_COMPLETED, new C76601k(str))));
    }

    /* renamed from: com.ss.android.ugc.aweme.story.feed.common.StoryVideoViewHolder$a */
    static final class View$OnClickListenerC77186a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ StoryVideoViewHolder f173150a;

        static {
            Covode.recordClassIndex(90198);
        }

        View$OnClickListenerC77186a(StoryVideoViewHolder storyVideoViewHolder) {
            this.f173150a = storyVideoViewHolder;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C76598h.m134184a(this.f173150a.f111313o.f111753j, "page", "click", null, 56);
            IStoryService storyService = AVExternalServiceImpl.m113114a().storyService();
            Context ap = this.f173150a.mo80195ap();
            C89219l.m154716b(ap, "");
            storyService.startStoryActivity(ap, new EnterStoryParam(null, "click_fullscreen_intro", "story", false, true, false, !C76660b.m134249i(), 41, null));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewCell
    /* renamed from: a */
    public final void mo80093a(View view, boolean z) {
        if (view != null) {
            view.setVisibility(4);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai, com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.p2082ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    /* renamed from: a */
    public final void mo80114a(Aweme aweme, int i) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        if (C76706a.m134279e(aweme)) {
            this.f111308j = aweme;
            FrameLayout frameLayout = (FrameLayout) this.f111313o.f111744a.findViewById(R.id.e9u);
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
            }
            FrameLayout frameLayout2 = this.f111377H;
            C89219l.m154716b(frameLayout2, "");
            frameLayout2.setVisibility(8);
            User curUser = C31575b.m65865g().getCurUser();
            if (curUser != null) {
                C34577e.m70592a((RemoteImageView) this.f111313o.f111744a.findViewById(R.id.bbm), curUser.getAvatarThumb());
            }
            StoryBrandView storyBrandView = (StoryBrandView) this.f111313o.f111744a.findViewById(R.id.bbk);
            if (storyBrandView != null) {
                storyBrandView.setOnClickListener(new View$OnClickListenerC77186a(this));
            }
            C89233z.C89236c cVar = new C89233z.C89236c();
            cVar.element = 0;
            if (C33403c.f79377m == 0) {
                cVar.element = C18247a.m33946a(mo80195ap());
                View findViewById = this.f111313o.f111744a.findViewById(R.id.e7_);
                if (!(findViewById == null || (layoutParams2 = findViewById.getLayoutParams()) == null)) {
                    layoutParams2.height = cVar.element;
                }
            } else {
                View findViewById2 = this.f111313o.f111744a.findViewById(R.id.e7_);
                if (!(findViewById2 == null || (layoutParams = findViewById2.getLayoutParams()) == null)) {
                    layoutParams.height = 0;
                }
            }
            this.f111313o.f111744a.post(new RunnableC77187b(this, cVar));
        } else {
            FrameLayout frameLayout3 = (FrameLayout) this.f111313o.f111744a.findViewById(R.id.e9u);
            if (frameLayout3 != null) {
                frameLayout3.setVisibility(8);
            }
            FrameLayout frameLayout4 = this.f111377H;
            C89219l.m154716b(frameLayout4, "");
            frameLayout4.setVisibility(0);
            super.mo80114a(aweme, i);
        }
        View view = this.f111477w;
        C89219l.m154716b(view, "");
        view.setVisibility(8);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewCell
    /* renamed from: a */
    public final AbstractC37879bc mo80156a(View view, AbstractC49691s<C49672ag> sVar, Fragment fragment) {
        C89219l.m154721d(fragment, "");
        if (C76677d.m134255a()) {
            return new C77164a();
        }
        AbstractC37879bc a = super.mo80156a(view, sVar, fragment);
        C89219l.m154716b(a, "");
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener, com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.p2082ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    public void onPlayProgressChange(String str, long j, long j2) {
        SmartImageView smartImageView;
        super.onPlayProgressChange(str, j, j2);
        SmartImageView smartImageView2 = this.f111472r;
        if (!(smartImageView2 == null || smartImageView2.getVisibility() != 0 || (smartImageView = this.f111472r) == null)) {
            smartImageView.setVisibility(8);
        }
        this.f111437ap.mo63634a(new C49672ag(60, new C76595e(EnumC76597g.ON_PLAY_PROGRESS_CHANGED, new C76602l(str, j, j2))));
    }
}
