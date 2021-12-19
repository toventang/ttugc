package com.p2082ss.android.ugc.aweme.story.feed.common;

import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tiktok.homepage.services.MainPageFragmentImpl;
import com.p2082ss.android.ugc.aweme.AbstractC34835bi;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37879bc;
import com.p2082ss.android.ugc.aweme.detail.p2751ui.AbstractC41361am;
import com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48148ah;
import com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai;
import com.p2082ss.android.ugc.aweme.feed.adapter.C48238ce;
import com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewCell;
import com.p2082ss.android.ugc.aweme.feed.adapter.p2937a.AbstractC48136a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.feed.model.story.UserStory;
import com.p2082ss.android.ugc.aweme.feed.p2949i.AbstractC49691s;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49672ag;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50545m;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.story.C77260g;
import com.p2082ss.android.ugc.aweme.story.feed.C77164a;
import com.p2082ss.android.ugc.aweme.story.feed.p4046ui.player.DragScaleLayout;
import com.p2082ss.android.ugc.aweme.story.p4019b.C76593c;
import com.p2082ss.android.ugc.aweme.story.p4019b.C76595e;
import com.p2082ss.android.ugc.aweme.story.p4019b.C76600j;
import com.p2082ss.android.ugc.aweme.story.p4019b.EnumC76597g;
import com.p2082ss.android.ugc.aweme.story.p4024c.C76660b;
import com.p2082ss.android.ugc.aweme.story.p4024c.C76677d;
import com.p2082ss.android.ugc.aweme.story.p4025d.C76706a;
import com.p2082ss.android.ugc.aweme.story.p4043f.C77163d;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.Objects;
import org.greenrobot.eventbus.AbstractC90253j;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.feed.common.StoryPlayerListViewHolder */
public final class StoryPlayerListViewHolder extends VideoViewCell implements AbstractC90253j {

    /* renamed from: a */
    public static final C77183a f173146a = new C77183a((byte) 0);

    /* renamed from: b */
    private Aweme f173147b;

    static {
        Covode.recordClassIndex(90193);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48234cd, com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewCell
    /* renamed from: a */
    public final void mo80071a(Video video) {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewCell
    /* renamed from: ai */
    public final void mo80189ai() {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewCell
    /* renamed from: al */
    public final void mo80191al() {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewCell
    /* renamed from: am */
    public final void mo80192am() {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewCell
    /* renamed from: e */
    public final void mo80216e(String str) {
        C89219l.m154721d(str, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.story.feed.common.StoryPlayerListViewHolder$a */
    public static final class C77183a {
        static {
            Covode.recordClassIndex(90194);
        }

        private C77183a() {
        }

        public /* synthetic */ C77183a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai, com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewCell
    /* renamed from: b */
    public final Aweme mo80206b() {
        return this.f173147b;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai, com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.p2082ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    /* renamed from: c */
    public final void mo80080c() {
        super.mo80080c();
        this.f111471q.mo80266a();
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai, com.p2082ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    /* renamed from: U */
    public final void mo80106U() {
        super.mo80106U();
        ((DragScaleLayout) this.f111313o.f111744a.findViewById(R.id.aov)).mo120837a(true);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48148ah
    /* renamed from: aa */
    public final void mo80185aa() {
        AbstractC48148ah v;
        super.mo80185aa();
        AbstractC48149ai T = mo80105T();
        if (T != null && (v = T.mo80231v()) != null) {
            v.mo80185aa();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48148ah
    /* renamed from: ac */
    public final void mo80187ac() {
        AbstractC48148ah v;
        super.mo80187ac();
        AbstractC48149ai T = mo80105T();
        if (T != null && (v = T.mo80231v()) != null) {
            v.mo80187ac();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewCell
    /* renamed from: ah */
    public final void mo80188ah() {
        if (!C76660b.m134242b() || !C76677d.m134255a()) {
            super.mo80188ah();
        } else {
            this.f111447az.mo60189a("video_share_click", (AbstractC1214u<C33942b>) this);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai, com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewCell
    /* renamed from: g */
    public final void mo80072g() {
        super.mo80072g();
        this.f111471q.mo80275e();
        DragScaleLayout dragScaleLayout = (DragScaleLayout) this.f111313o.f111744a.findViewById(R.id.aov);
        if (dragScaleLayout != null) {
            dragScaleLayout.mo120837a(false);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewCell
    /* renamed from: H */
    public final void mo80069H() {
        super.mo80069H();
        if (C76706a.m134277c(this.f111308j)) {
            AbstractC48136a aVar = this.f111471q;
            Aweme aweme = this.f111308j;
            if (aweme == null) {
                C89219l.m154715b();
            }
            aVar.mo80268a(aweme, this.f111309k);
            ((DragScaleLayout) this.f111313o.f111744a.findViewById(R.id.aov)).setReleaseListener(new C77184b(this));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewCell
    /* renamed from: n */
    public final void mo80073n() {
        super.mo80073n();
        this.f111447az.mo60189a("on_story_guide_page_unselected", (AbstractC1214u<C33942b>) this);
        this.f111447az.mo60189a("on_story_page_selected", (AbstractC1214u<C33942b>) this);
        this.f111447az.mo60189a("on_story_page_unselected", (AbstractC1214u<C33942b>) this);
        this.f111447az.mo60189a("on_should_scroll_to_next_user", (AbstractC1214u<C33942b>) this);
        this.f111447az.mo60189a("ON_STORY_DATA_CHANGED", (AbstractC1214u<C33942b>) this);
        this.f111447az.mo60189a("on_start_play_animation", (AbstractC1214u<C33942b>) this);
    }

    /* renamed from: com.ss.android.ugc.aweme.story.feed.common.StoryPlayerListViewHolder$b */
    static final class C77184b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ StoryPlayerListViewHolder f173148a;

        static {
            Covode.recordClassIndex(90195);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77184b(StoryPlayerListViewHolder storyPlayerListViewHolder) {
            super(0);
            this.f173148a = storyPlayerListViewHolder;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            Fragment fragment = this.f173148a.f111313o.f111746c;
            if (!(fragment instanceof AbstractC41361am)) {
                fragment = null;
            }
            AbstractC41361am amVar = (AbstractC41361am) fragment;
            if (amVar != null) {
                if (amVar.mo70638b(this.f173148a.f111309k)) {
                    this.f173148a.f111313o.f111745b.mo63634a(new C49672ag(60, new C76595e(EnumC76597g.ON_SHOULD_SCROLL_TO_NEXT_USER, null)));
                } else if (amVar.bn_()) {
                    ((DragScaleLayout) this.f173148a.f111313o.f111744a.findViewById(R.id.aov)).mo120837a(true);
                }
            }
            return C89391z.f203057a;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.AbstractC1214u, com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final /* synthetic */ void onChanged(C33942b bVar) {
        onChanged(bVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StoryPlayerListViewHolder(C48238ce ceVar) {
        super(ceVar);
        C89219l.m154721d(ceVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai, com.p2082ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    /* renamed from: d */
    public final void mo80126d(String str) {
        C89219l.m154721d(str, "");
        this.f111471q.mo80271b(str);
    }

    /* renamed from: com.ss.android.ugc.aweme.story.feed.common.StoryPlayerListViewHolder$c */
    static final class C77185c extends AbstractC89220m implements AbstractC89172b<String, View> {

        /* renamed from: a */
        final /* synthetic */ StoryPlayerListViewHolder f173149a;

        static {
            Covode.recordClassIndex(90196);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77185c(StoryPlayerListViewHolder storyPlayerListViewHolder) {
            super(1);
            this.f173149a = storyPlayerListViewHolder;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ View invoke(String str) {
            String str2 = str;
            C89219l.m154721d(str2, "");
            int hashCode = str2.hashCode();
            if (hashCode != -1154870718) {
                if (hashCode == -926734197 && str2.equals("place_holder_caption")) {
                    return this.f173149a.f111430ai;
                }
                return null;
            } else if (str2.equals("story_bubble_list_layout")) {
                return this.f173149a.f111380K;
            } else {
                return null;
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewCell
    /* renamed from: a */
    public final AbstractC48136a mo80157a(C48238ce ceVar) {
        C89219l.m154721d(ceVar, "");
        FrameLayout frameLayout = this.f111382M;
        C89219l.m154716b(frameLayout, "");
        FrameLayout frameLayout2 = this.f111378I;
        C89219l.m154716b(frameLayout2, "");
        FrameLayout frameLayout3 = this.f111379J;
        C89219l.m154716b(frameLayout3, "");
        FrameLayout frameLayout4 = this.f111380K;
        C89219l.m154716b(frameLayout4, "");
        C77185c cVar = new C77185c(this);
        C89219l.m154721d(frameLayout, "");
        C89219l.m154721d(this, "");
        C89219l.m154721d(ceVar, "");
        C89219l.m154721d(frameLayout2, "");
        C89219l.m154721d(frameLayout3, "");
        C89219l.m154721d(frameLayout4, "");
        AbstractC34835bi a = C77260g.f173332a.mo120135a(frameLayout, this, ceVar, frameLayout2, frameLayout3, frameLayout4, cVar);
        Objects.requireNonNull(a, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.adapter.playerview.BaseFeedPlayerView");
        return (AbstractC48136a) a;
    }

    /* renamed from: j */
    private final boolean m134886j(Aweme aweme) {
        UserStory userStory;
        List<Aweme> stories;
        Aweme aweme2;
        UserStory userStory2;
        List<Aweme> stories2;
        if (!(!C89219l.m154714a((Object) this.f111313o.f111748e.eventType, (Object) "westwindow") || aweme == null || (userStory = aweme.getUserStory()) == null || (stories = userStory.getStories()) == null || stories.size() <= 0)) {
            if (aweme == null || (userStory2 = aweme.getUserStory()) == null || (stories2 = userStory2.getStories()) == null) {
                aweme2 = null;
            } else {
                aweme2 = stories2.get(0);
            }
            if (C76706a.m134279e(aweme2)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai, com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewCell
    /* renamed from: a */
    public final void mo70614a(int i) {
        Aweme aweme;
        Aweme aweme2;
        super.mo70614a(i);
        String ar = mo80197ar();
        C89219l.m154716b(ar, "");
        boolean a = C89219l.m154714a((Object) "homepage_follow", (Object) ar);
        boolean a2 = C50545m.m94762a(this.f111308j);
        if ((C76706a.m134281g(this.f111308j) || ((aweme2 = this.f111308j) != null && aweme2.isStoryFakeAweme())) && a2 && C76660b.m134252l() && (!a || !C76660b.m134246f())) {
            ViewGroup viewGroup = this.f111375F;
            C89219l.m154716b(viewGroup, "");
            viewGroup.setVisibility(4);
        } else {
            ViewGroup viewGroup2 = this.f111375F;
            C89219l.m154716b(viewGroup2, "");
            viewGroup2.setVisibility(0);
        }
        this.f111471q.mo80267a(i);
        if (C76660b.m134242b() && !a2 && (aweme = this.f111308j) != null && !aweme.isStoryFakeAweme() && !C76706a.m134280f(this.f111308j) && !m134886j(this.f173147b) && !C76706a.m134279e(this.f173147b)) {
            User b = C80580in.m139683b();
            C89219l.m154716b(b, "");
            String uid = b.getUid();
            User b2 = C80580in.m139683b();
            C89219l.m154716b(b2, "");
            String uid2 = b2.getUid();
            C89219l.m154716b(uid2, "");
            C89219l.m154721d(uid2, "");
            if (C77163d.f173102a.getBoolean(uid2 + "_STORY_SHOW_VIEWER_LIST_TIPS", true)) {
                mo80203ax();
                Message obtainMessage = this.f111399aC.obtainMessage(31);
                C89219l.m154716b(obtainMessage, "");
                obtainMessage.what = 31;
                this.f111399aC.sendMessage(obtainMessage);
                C89219l.m154716b(uid, "");
                C89219l.m154721d(uid, "");
                C77163d.f173102a.storeBoolean(uid + "_STORY_SHOW_VIEWER_LIST_TIPS", false);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewCell
    /* renamed from: a */
    public final void mo80070a(C33942b bVar) {
        String str;
        super.onChanged(bVar);
        if (bVar != null && (str = bVar.f80277a) != null) {
            switch (str.hashCode()) {
                case -1206738399:
                    if (str.equals("on_story_page_selected")) {
                        C76600j jVar = (C76600j) bVar.mo60212a();
                        if (!C76660b.m134242b()) {
                            if (C76706a.m134279e(jVar.f171919a)) {
                                RelativeLayout relativeLayout = this.f111383N;
                                C89219l.m154716b(relativeLayout, "");
                                relativeLayout.setVisibility(4);
                            } else {
                                RelativeLayout relativeLayout2 = this.f111383N;
                                C89219l.m154716b(relativeLayout2, "");
                                relativeLayout2.setVisibility(0);
                            }
                        }
                        if (jVar.f171920b == this.f111309k) {
                            if (!C76706a.m134279e(jVar.f171919a)) {
                                mo70615a(jVar.f171919a);
                            }
                            mo80185aa();
                        }
                        if (C76706a.m134282h(jVar.f171919a)) {
                            RelativeLayout relativeLayout3 = this.f111383N;
                            C89219l.m154716b(relativeLayout3, "");
                            relativeLayout3.setVisibility(4);
                            return;
                        }
                        return;
                    }
                    return;
                case -781426983:
                    if (str.equals("on_should_scroll_to_next_user")) {
                        ((DragScaleLayout) this.f111313o.f111744a.findViewById(R.id.aov)).mo120837a(true);
                        return;
                    }
                    return;
                case -219301751:
                    if (str.equals("ON_STORY_DATA_CHANGED")) {
                        C76593c cVar = (C76593c) bVar.mo60212a();
                        Aweme aweme = this.f111308j;
                        if (aweme != null && aweme.isStoryFakeAweme()) {
                            mo70615a(cVar.f171910a);
                            return;
                        }
                        return;
                    }
                    return;
                case 43859514:
                    if (str.equals("on_story_page_unselected")) {
                        View view = this.f111389T;
                        C89219l.m154716b(view, "");
                        view.setVisibility(8);
                        return;
                    }
                    return;
                case 2125858838:
                    if (str.equals("on_start_play_animation")) {
                        mo80194ao();
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai, com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewCell
    /* renamed from: a */
    public final void mo70615a(Aweme aweme) {
        if (C76706a.m134277c(aweme)) {
            this.f173147b = aweme;
            DragScaleLayout dragScaleLayout = (DragScaleLayout) this.f111313o.f111744a.findViewById(R.id.aov);
            C89219l.m154716b(dragScaleLayout, "");
            dragScaleLayout.setEnabled(false);
        } else if (C76706a.m134280f(aweme)) {
            RelativeLayout relativeLayout = this.f111383N;
            C89219l.m154716b(relativeLayout, "");
            relativeLayout.setVisibility(4);
        }
        super.mo70615a(aweme);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewCell
    /* renamed from: a */
    public final void mo80093a(View view, boolean z) {
        if (!MainPageFragmentImpl.m43110j().mo37217i() || (!C89219l.m154714a((Object) this.f111313o.f111753j, (Object) "homepage_hot") && !C89219l.m154714a((Object) this.f111313o.f111753j, (Object) "homepage_follow"))) {
            super.mo80093a(view, z);
        } else {
            super.mo80093a(view, true);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai, com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.p2082ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    /* renamed from: a */
    public final void mo80114a(Aweme aweme, int i) {
        super.mo80114a(aweme, i);
        if (C76660b.m134242b()) {
            RelativeLayout relativeLayout = this.f111383N;
            C89219l.m154716b(relativeLayout, "");
            relativeLayout.setVisibility(4);
        } else if (m134886j(aweme)) {
            RelativeLayout relativeLayout2 = this.f111383N;
            C89219l.m154716b(relativeLayout2, "");
            relativeLayout2.setVisibility(4);
        } else {
            RelativeLayout relativeLayout3 = this.f111383N;
            C89219l.m154716b(relativeLayout3, "");
            relativeLayout3.setVisibility(0);
        }
        SmartImageView smartImageView = this.f111472r;
        C89219l.m154716b(smartImageView, "");
        smartImageView.setVisibility(8);
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
}
