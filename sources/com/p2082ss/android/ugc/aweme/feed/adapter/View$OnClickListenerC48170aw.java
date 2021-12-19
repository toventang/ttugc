package com.p2082ss.android.ugc.aweme.feed.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.C33594aj;
import com.p2082ss.android.ugc.aweme.app.SharePrefCache;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageWithVerify;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.challenge.p2448d.C35503c;
import com.p2082ss.android.ugc.aweme.common.C39143l;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.p2632d.AbstractC39098d;
import com.p2082ss.android.ugc.aweme.feed.experiment.C49504ag;
import com.p2082ss.android.ugc.aweme.feed.guide.GalleryLayoutManager;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.feed.p2943d.C49418a;
import com.p2082ss.android.ugc.aweme.friends.model.UserWithAweme;
import com.p2082ss.android.ugc.aweme.friends.p3022ui.AbstractC51754w;
import com.p2082ss.android.ugc.aweme.friends.service.C51648a;
import com.p2082ss.android.ugc.aweme.login.C58957c;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.widget.C64357h;
import com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63854r;
import com.p2082ss.android.ugc.aweme.profile.presenter.C63847n;
import com.p2082ss.android.ugc.aweme.services.MainServiceImpl;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80581io;
import com.p2082ss.android.ugc.aweme.utils.UserVerify;
import com.p2082ss.android.ugc.aweme.video.C80709c;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.playerkit.model.C84208l;
import com.p2082ss.android.ugc.playerkit.model.C84216o;
import com.p2082ss.android.ugc.playerkit.videoview.AbstractC84295k;
import com.p2082ss.android.ugc.playerkit.videoview.C84294j;
import com.p2082ss.android.ugc.playerkit.videoview.KeepSurfaceTextureView;
import com.p2082ss.android.ugc.playerkit.videoview.VideoViewComponent;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.aw */
public final class View$OnClickListenerC48170aw extends RecyclerView.ViewHolder implements View.OnClickListener, GalleryLayoutManager.AbstractC49578c, AbstractC63854r {

    /* renamed from: a */
    int f111569a;

    /* renamed from: b */
    int f111570b;

    /* renamed from: c */
    public C64357h.AbstractC64362b f111571c;

    /* renamed from: d */
    public AbstractC39098d<View$OnClickListenerC48170aw> f111572d;

    /* renamed from: e */
    public VideoViewComponent f111573e;

    /* renamed from: f */
    public boolean f111574f;

    /* renamed from: g */
    public boolean f111575g;

    /* renamed from: h */
    public Video f111576h;

    /* renamed from: i */
    public UserWithAweme f111577i;

    /* renamed from: j */
    public final AbstractC48173a f111578j;

    /* renamed from: k */
    public final AbstractC48174b f111579k;

    /* renamed from: l */
    public GalleryLayoutManager f111580l;

    /* renamed from: m */
    private final AbstractC89244h f111581m;

    /* renamed from: n */
    private final AbstractC89244h f111582n;

    /* renamed from: o */
    private final AbstractC89244h f111583o;

    /* renamed from: p */
    private final AbstractC89244h f111584p;

    /* renamed from: q */
    private final AbstractC89244h f111585q;

    /* renamed from: r */
    private final AbstractC89244h f111586r;

    /* renamed from: s */
    private final AbstractC89244h f111587s;

    /* renamed from: t */
    private final C49418a f111588t = new C49418a();

    /* renamed from: u */
    private Integer f111589u;

    /* renamed from: v */
    private AbstractC51754w f111590v = C51648a.f118980a.mo87329i();

    /* renamed from: w */
    private final C48182j f111591w = new C48182j(this);

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.aw$a */
    public interface AbstractC48173a {
        static {
            Covode.recordClassIndex(56915);
        }

        /* renamed from: a */
        void mo80302a(User user, int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.aw$b */
    public interface AbstractC48174b {
        static {
            Covode.recordClassIndex(56916);
        }

        /* renamed from: a */
        void mo80301a(int i);
    }

    static {
        Covode.recordClassIndex(56912);
    }

    /* renamed from: j */
    private TextView m91493j() {
        return (TextView) this.f111581m.getValue();
    }

    /* renamed from: k */
    private AvatarImageWithVerify m91494k() {
        return (AvatarImageWithVerify) this.f111582n.getValue();
    }

    /* renamed from: l */
    private TextView m91495l() {
        return (TextView) this.f111584p.getValue();
    }

    /* renamed from: m */
    private TextView m91496m() {
        return (TextView) this.f111585q.getValue();
    }

    /* renamed from: a */
    public final RemoteImageView mo80303a() {
        return (RemoteImageView) this.f111586r.getValue();
    }

    /* renamed from: b */
    public final KeepSurfaceTextureView mo80305b() {
        return (KeepSurfaceTextureView) this.f111587s.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.guide.GalleryLayoutManager.AbstractC49578c
    /* renamed from: h */
    public final void mo80311h() {
        mo80312i();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.aw$f */
    public static final class C48178f implements AbstractC34543f {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC48170aw f111598a;

        static {
            Covode.recordClassIndex(56920);
        }

        C48178f(View$OnClickListenerC48170aw awVar) {
            this.f111598a = awVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f
        /* renamed from: b */
        public final void mo57674b() {
        }

        @Override // com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f
        /* renamed from: a */
        public final void mo57673a() {
            this.f111598a.mo80310g();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.aw$c */
    static final class C48175c extends AbstractC89220m implements AbstractC89171a<AvatarImageWithVerify> {

        /* renamed from: a */
        final /* synthetic */ View f111595a;

        static {
            Covode.recordClassIndex(56917);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48175c(View view) {
            super(0);
            this.f111595a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AvatarImageWithVerify invoke() {
            return this.f111595a.findViewById(R.id.nz);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.aw$d */
    static final class C48176d extends AbstractC89220m implements AbstractC89171a<ImageView> {

        /* renamed from: a */
        final /* synthetic */ View f111596a;

        static {
            Covode.recordClassIndex(56918);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48176d(View view) {
            super(0);
            this.f111596a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ImageView invoke() {
            return this.f111596a.findViewById(R.id.a6q);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.aw$e */
    static final class C48177e extends AbstractC89220m implements AbstractC89171a<TuxTextView> {

        /* renamed from: a */
        final /* synthetic */ View f111597a;

        static {
            Covode.recordClassIndex(56919);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48177e(View view) {
            super(0);
            this.f111597a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxTextView invoke() {
            return this.f111597a.findViewById(R.id.b6a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.aw$h */
    static final class C48180h extends AbstractC89220m implements AbstractC89171a<RemoteImageView> {

        /* renamed from: a */
        final /* synthetic */ View f111600a;

        static {
            Covode.recordClassIndex(56922);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48180h(View view) {
            super(0);
            this.f111600a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ RemoteImageView invoke() {
            return this.f111600a.findViewById(R.id.buj);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.aw$k */
    static final class C48183k extends AbstractC89220m implements AbstractC89171a<KeepSurfaceTextureView> {

        /* renamed from: a */
        final /* synthetic */ View f111603a;

        static {
            Covode.recordClassIndex(56925);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48183k(View view) {
            super(0);
            this.f111603a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ KeepSurfaceTextureView invoke() {
            return this.f111603a.findViewById(R.id.eh3);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.aw$l */
    static final class C48184l extends AbstractC89220m implements AbstractC89171a<TuxTextView> {

        /* renamed from: a */
        final /* synthetic */ View f111604a;

        static {
            Covode.recordClassIndex(56926);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48184l(View view) {
            super(0);
            this.f111604a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxTextView invoke() {
            return this.f111604a.findViewById(R.id.dez);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.aw$m */
    static final class C48185m extends AbstractC89220m implements AbstractC89171a<TuxTextView> {

        /* renamed from: a */
        final /* synthetic */ View f111605a;

        static {
            Covode.recordClassIndex(56927);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48185m(View view) {
            super(0);
            this.f111605a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxTextView invoke() {
            return this.f111605a.findViewById(R.id.fa1);
        }
    }

    /* renamed from: c */
    public final void mo80306c() {
        mo80303a().setVisibility(0);
    }

    /* renamed from: d */
    public final void mo80307d() {
        if (this.f111574f && mo80303a().getVisibility() == 0) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(500);
            alphaAnimation.setAnimationListener(new animationAnimation$AnimationListenerC48179g(this));
            mo80303a().startAnimation(alphaAnimation);
        }
    }

    /* renamed from: f */
    public final void mo80309f() {
        this.f111575g = false;
        if (this.f111588t.f113577a != 0) {
            VideoViewComponent videoViewComponent = this.f111573e;
            if (videoViewComponent == null) {
                C89219l.m154710a("mVideoView");
            }
            videoViewComponent.mo129269c();
            VideoViewComponent videoViewComponent2 = this.f111573e;
            if (videoViewComponent2 == null) {
                C89219l.m154710a("mVideoView");
            }
            videoViewComponent2.mo129270d();
            VideoViewComponent videoViewComponent3 = this.f111573e;
            if (videoViewComponent3 == null) {
                C89219l.m154710a("mVideoView");
            }
            videoViewComponent3.mo80280a(this.f111591w);
            this.f111588t.f113577a = 0;
            mo80306c();
        }
    }

    /* renamed from: e */
    public final void mo80308e() {
        int i;
        do {
            VideoViewComponent videoViewComponent = this.f111573e;
            if (videoViewComponent == null) {
                C89219l.m154710a("mVideoView");
            }
            C84294j jVar = videoViewComponent.f188405b;
            C89219l.m154716b(jVar, "");
            if (!jVar.mo129315c() || this.f111576h == null) {
                this.f111575g = true;
                return;
            }
            int i2 = this.f111588t.f113577a;
            if (i2 == 0) {
                VideoViewComponent videoViewComponent2 = this.f111573e;
                if (videoViewComponent2 == null) {
                    C89219l.m154710a("mVideoView");
                }
                videoViewComponent2.mo129268b(this.f111591w);
                VideoViewComponent videoViewComponent3 = this.f111573e;
                if (videoViewComponent3 == null) {
                    C89219l.m154710a("mVideoView");
                }
                videoViewComponent3.mo129263a(this.f111576h, C16048b.m29633a().mo25412a(true, "decoder_type", 0));
                this.f111575g = false;
                this.f111588t.f113577a = 2;
                return;
            } else if (i2 == 3) {
                i = this.f111588t.f113577a;
            } else {
                return;
            }
        } while (i == 0);
        if (i == 3) {
            mo80307d();
            VideoViewComponent videoViewComponent4 = this.f111573e;
            if (videoViewComponent4 == null) {
                C89219l.m154710a("mVideoView");
            }
            videoViewComponent4.mo129262a(this.f111576h);
            this.f111588t.f113577a = 4;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo80312i() {
        UserWithAweme userWithAweme = this.f111577i;
        if (userWithAweme != null) {
            m91490a(userWithAweme.getUser().getFollowStatus(), userWithAweme.getUser().getFollowerStatus());
            m91494k().setUserData(new UserVerify(userWithAweme.getUser().getAvatarThumb(), userWithAweme.getUser().getCustomVerify(), userWithAweme.getUser().getEnterpriseVerifyReason(), Integer.valueOf(userWithAweme.getUser().getVerificationType())));
            m91494k().mo61285a();
            m91492a(userWithAweme.getUser());
        }
    }

    /* renamed from: g */
    public final void mo80310g() {
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        Activity activity = null;
        if (!g.isLogin()) {
            C58957c.m108320a(C17873f.m33102j(), "homepage_follow", "click_follow_tab", (Bundle) null, new C48178f(this));
            return;
        }
        UserWithAweme userWithAweme = this.f111577i;
        if (userWithAweme != null) {
            if (userWithAweme.getUser().getFollowStatus() == 0) {
                this.f111579k.mo80301a(getAdapterPosition());
            }
            View view = this.itemView;
            C89219l.m154716b(view, "");
            if (view.getContext() != null) {
                View view2 = this.itemView;
                C89219l.m154716b(view2, "");
                if (view2.getContext() instanceof Activity) {
                    View view3 = this.itemView;
                    C89219l.m154716b(view3, "");
                    Context context = view3.getContext();
                    Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
                    activity = (Activity) context;
                }
            }
            int i = 2;
            int i2 = 0;
            if (userWithAweme.getUser().getFollowStatus() == 0) {
                if (userWithAweme.getUser().isSecret()) {
                    i = 4;
                } else if (userWithAweme.getUser().getFollowerStatus() != 1) {
                    i = 1;
                }
                i2 = i;
            }
            if (userWithAweme.getUser().getFollowStatus() == 4) {
                if (activity == null) {
                    return;
                }
            } else if (i2 == 4) {
                if (activity != null) {
                    m91491a(activity);
                } else {
                    return;
                }
            }
            m91489a(i2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.aw$g  reason: invalid class name */
    public static final class animationAnimation$AnimationListenerC48179g implements Animation.AnimationListener {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC48170aw f111599a;

        static {
            Covode.recordClassIndex(56921);
        }

        public final void onAnimationRepeat(Animation animation) {
            C89219l.m154721d(animation, "");
        }

        public final void onAnimationStart(Animation animation) {
            C89219l.m154721d(animation, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        animationAnimation$AnimationListenerC48179g(View$OnClickListenerC48170aw awVar) {
            this.f111599a = awVar;
        }

        public final void onAnimationEnd(Animation animation) {
            C89219l.m154721d(animation, "");
            this.f111599a.mo80303a().setVisibility(8);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.aw$i */
    public static final class C48181i implements AbstractC84295k {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC48170aw f111601a;

        static {
            Covode.recordClassIndex(56923);
        }

        @Override // com.p2082ss.android.ugc.playerkit.videoview.AbstractC84295k
        public final void aJ_() {
        }

        @Override // com.p2082ss.android.ugc.playerkit.videoview.AbstractC84295k
        /* renamed from: b */
        public final void mo60627b(int i, int i2) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C48181i(View$OnClickListenerC48170aw awVar) {
            this.f111601a = awVar;
        }

        @Override // com.p2082ss.android.ugc.playerkit.videoview.AbstractC84295k
        /* renamed from: a */
        public final void mo60625a(int i, int i2) {
            if (this.f111601a.f111575g) {
                this.f111601a.f111575g = false;
                this.f111601a.mo80308e();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.aw$j */
    public static final class C48182j extends C80709c {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC48170aw f111602a;

        static {
            Covode.recordClassIndex(56924);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C48182j(View$OnClickListenerC48170aw awVar) {
            this.f111602a = awVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.video.C80709c, com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onPlayFailed(C84208l lVar) {
            super.onPlayFailed(lVar);
            this.f111602a.mo80303a().setVisibility(0);
        }

        @Override // com.p2082ss.android.ugc.aweme.video.C80709c, com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
        public final void onRenderFirstFrame(C84216o oVar) {
            super.onRenderFirstFrame(oVar);
            this.f111602a.f111574f = true;
            this.f111602a.mo80307d();
            if (this.f111602a.getAdapterPosition() != this.f111602a.f111580l.f114053b) {
                VideoViewComponent videoViewComponent = this.f111602a.f111573e;
                if (videoViewComponent == null) {
                    C89219l.m154710a("mVideoView");
                }
                videoViewComponent.mo129267b();
            }
        }
    }

    /* renamed from: a */
    private static void m91491a(Activity activity) {
        SharePrefCache inst = SharePrefCache.inst();
        C89219l.m154716b(inst, "");
        C33594aj<Integer> privacyAccountFollowCount = inst.getPrivacyAccountFollowCount();
        C89219l.m154716b(privacyAccountFollowCount, "");
        Integer c = privacyAccountFollowCount.mo59941c();
        if (c != null && c.intValue() == 0) {
            new C17197a.C17200a(activity).mo27194b(R.string.esu).mo27190a(R.string.cbc, (DialogInterface.OnClickListener) null, false).mo27193a().mo27184b();
        } else {
            C89219l.m154716b(c, "");
            int intValue = c.intValue();
            if (1 <= intValue && 3 >= intValue) {
                new C79459a(activity).mo123050a(R.string.esv).mo123053a();
            }
        }
        privacyAccountFollowCount.mo59940b(Integer.valueOf(c.intValue() + 1));
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63854r
    /* renamed from: b */
    public final void mo71320b(FollowStatus followStatus) {
        C89219l.m154721d(followStatus, "");
        UserWithAweme userWithAweme = this.f111577i;
        if (userWithAweme != null && TextUtils.equals(followStatus.userId, userWithAweme.getUser().getUid())) {
            userWithAweme.getUser().setFollowStatus(followStatus.followStatus);
            int i = followStatus.followStatus;
            UserWithAweme userWithAweme2 = this.f111577i;
            if (userWithAweme2 == null) {
                C89219l.m154715b();
            }
            AbstractC81915c.m141874a(new C35503c(i, userWithAweme2));
            m91490a(followStatus.followStatus, followStatus.followerStatus);
            if (followStatus.followStatus == 0 && !TextUtils.isEmpty(userWithAweme.getUser().getRemarkName())) {
                userWithAweme.getUser().setRemarkName("");
                m91492a(userWithAweme.getUser());
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63854r
    /* renamed from: c */
    public final void mo71321c(FollowStatus followStatus) {
        C89219l.m154721d(followStatus, "");
        this.f111589u = Integer.valueOf(followStatus.followStatus);
        String str = followStatus.userId;
        C89219l.m154716b(str, "");
        if (followStatus.followStatus == 0) {
            C39162r.m79460a("follow_cancel_finish", new C33744d().mo59983a("enter_from", "homepage_follow").mo59983a("to_user_id", str).f79943a);
        } else {
            C39162r.m79460a("follow_finish", new C33744d().mo59983a("enter_from", "homepage_follow").mo59983a("to_user_id", str).f79943a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63854r
    /* renamed from: d_ */
    public final void mo71322d_(Exception exc) {
        User user;
        int i;
        int followStatus;
        View view = this.itemView;
        C89219l.m154716b(view, "");
        Activity a = C34729o.m70950a(view.getContext());
        C89219l.m154716b(a, "");
        C39143l.m79438a(a, exc);
        UserWithAweme userWithAweme = this.f111577i;
        if (userWithAweme != null) {
            Integer num = this.f111589u;
            if (num != null) {
                followStatus = num.intValue();
            } else {
                followStatus = userWithAweme.getUser().getFollowStatus();
            }
            m91490a(followStatus, userWithAweme.getUser().getFollowerStatus());
        }
        UserWithAweme userWithAweme2 = this.f111577i;
        if (userWithAweme2 != null && (user = userWithAweme2.getUser()) != null) {
            Integer num2 = this.f111589u;
            if (num2 != null) {
                i = num2.intValue();
            } else {
                i = 0;
            }
            user.setFollowStatus(i);
        }
    }

    public final void onClick(View view) {
        UserWithAweme userWithAweme;
        ClickAgent.onClick(view);
        C89219l.m154721d(view, "");
        int id = view.getId();
        if (id == R.id.a6q) {
            UserWithAweme userWithAweme2 = this.f111577i;
            if (userWithAweme2 != null) {
                C64357h.AbstractC64362b bVar = this.f111571c;
                if (bVar != null) {
                    User user = userWithAweme2.getUser();
                    getAdapterPosition();
                    bVar.mo81340a(user);
                }
                this.f111578j.mo80302a(userWithAweme2.getUser(), getAdapterPosition());
            }
        } else if (id == R.id.b6a && !C58001a.m104815a(view, 1200) && (userWithAweme = this.f111577i) != null) {
            C64357h.AbstractC64362b bVar2 = this.f111571c;
            if (bVar2 != null) {
                User user2 = userWithAweme.getUser();
                getAdapterPosition();
                bVar2.mo81341b(user2);
            }
            mo80310g();
        }
    }

    /* renamed from: a */
    private final void m91489a(int i) {
        Integer num;
        int i2;
        User user;
        m91490a(i, -1);
        UserWithAweme userWithAweme = this.f111577i;
        if (userWithAweme == null || (user = userWithAweme.getUser()) == null) {
            num = null;
        } else {
            num = Integer.valueOf(user.getFollowStatus());
        }
        this.f111589u = num;
        UserWithAweme userWithAweme2 = this.f111577i;
        if (userWithAweme2 != null) {
            boolean z = true;
            if (userWithAweme2.getUser().getFollowStatus() == 0) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            AbstractC51754w wVar = this.f111590v;
            C63847n.C63848a b = new C63847n.C63848a().mo103320a(userWithAweme2.getUser().getUid()).mo103325b(userWithAweme2.getUser().getSecUid());
            if (!userWithAweme2.getUser().isSecret() && !userWithAweme2.getUser().isPrivateAccount()) {
                z = false;
            }
            wVar.mo87469a(b.mo103322a(z).mo103318a(i2).mo103327c("homepage_follow").mo103324b(12).mo103328d(userWithAweme2.getUser().getFollowerStatus()).mo103323a());
        }
    }

    /* renamed from: a */
    private void m91492a(User user) {
        C89219l.m154721d(user, "");
        m91496m().setText(user.getNickname());
        m91493j().setText("@" + user.getUniqueId());
        View view = this.itemView;
        C89219l.m154716b(view, "");
        C80581io.m139704a(view.getContext(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), m91496m());
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.guide.GalleryLayoutManager.AbstractC49578c
    /* renamed from: a */
    public final void mo80304a(RecyclerView recyclerView, int i) {
        if (getAdapterPosition() != i) {
            mo80309f();
        } else if (recyclerView != null && recyclerView.getVisibility() == 0) {
            AbstractC39098d<View$OnClickListenerC48170aw> dVar = this.f111572d;
            if (dVar != null) {
                dVar.mo67856b(this);
            }
            GalleryLayoutManager galleryLayoutManager = this.f111580l;
            if (!(galleryLayoutManager.f114059h == null || galleryLayoutManager.f114059h.get() == null)) {
                if (!MainServiceImpl.createIMainServicebyMonsterPlugin(false).isOnFollowPage(galleryLayoutManager.f114059h.get())) {
                    return;
                }
            }
            mo80308e();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0090, code lost:
        if (r6 == 2) goto L_0x0068;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m91490a(int r6, int r7) {
        /*
        // Method dump skipped, instructions count: 200
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.adapter.View$OnClickListenerC48170aw.m91490a(int, int):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public View$OnClickListenerC48170aw(final View view, AbstractC48173a aVar, AbstractC48174b bVar, GalleryLayoutManager galleryLayoutManager) {
        super(view);
        C89219l.m154721d(view, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(galleryLayoutManager, "");
        this.f111578j = aVar;
        this.f111579k = bVar;
        this.f111580l = galleryLayoutManager;
        this.f111569a = (int) C13628n.m24520b(view.getContext(), 279.0f);
        this.f111570b = (int) C13628n.m24520b(view.getContext(), 372.0f);
        this.f111581m = C89250i.m154773a((AbstractC89171a) new C48184l(view));
        this.f111582n = C89250i.m154773a((AbstractC89171a) new C48175c(view));
        AbstractC89244h a = C89250i.m154773a((AbstractC89171a) new C48176d(view));
        this.f111583o = a;
        this.f111584p = C89250i.m154773a((AbstractC89171a) new C48177e(view));
        this.f111585q = C89250i.m154773a((AbstractC89171a) new C48185m(view));
        this.f111586r = C89250i.m154773a((AbstractC89171a) new C48180h(view));
        this.f111587s = C89250i.m154773a((AbstractC89171a) new C48183k(view));
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener(this) {
            /* class com.p2082ss.android.ugc.aweme.feed.adapter.View$OnClickListenerC48170aw.View$OnAttachStateChangeListenerC481711 */

            /* renamed from: a */
            final /* synthetic */ View$OnClickListenerC48170aw f111592a;

            static {
                Covode.recordClassIndex(56913);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f111592a = r1;
            }

            public final void onViewAttachedToWindow(View view) {
                C89219l.m154721d(view, "");
                GalleryLayoutManager galleryLayoutManager = this.f111592a.f111580l;
                galleryLayoutManager.f114061j.add(this.f111592a);
            }

            public final void onViewDetachedFromWindow(View view) {
                C89219l.m154721d(view, "");
                this.f111592a.mo80309f();
                GalleryLayoutManager galleryLayoutManager = this.f111592a.f111580l;
                galleryLayoutManager.f114061j.remove(this.f111592a);
            }
        });
        VideoViewComponent videoViewComponent = new VideoViewComponent((byte) 0);
        this.f111573e = videoViewComponent;
        videoViewComponent.mo129265a(mo80305b());
        VideoViewComponent videoViewComponent2 = this.f111573e;
        if (videoViewComponent2 == null) {
            C89219l.m154710a("mVideoView");
        }
        videoViewComponent2.f188405b.mo129312a(new C48181i(this));
        view.setOnClickListener(new View.OnClickListener(this) {
            /* class com.p2082ss.android.ugc.aweme.feed.adapter.View$OnClickListenerC48170aw.View$OnClickListenerC481722 */

            /* renamed from: a */
            final /* synthetic */ View$OnClickListenerC48170aw f111593a;

            static {
                Covode.recordClassIndex(56914);
            }

            {
                this.f111593a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                UserWithAweme userWithAweme = this.f111593a.f111577i;
                if (userWithAweme == null) {
                    C89219l.m154715b();
                }
                if (this.f111593a.getAdapterPosition() < this.f111593a.f111580l.f114053b) {
                    this.f111593a.f111580l.mo4318a(this.f111593a.f111580l.f114053b - 1);
                } else if (this.f111593a.getAdapterPosition() > this.f111593a.f111580l.f114053b) {
                    this.f111593a.f111580l.mo4318a(this.f111593a.f111580l.f114053b + 1);
                } else {
                    C64357h.AbstractC64362b bVar = this.f111593a.f111571c;
                    if (bVar != null) {
                        User user = userWithAweme.getUser();
                        this.f111593a.getAdapterPosition();
                        bVar.mo81342c(user);
                    }
                    SmartRouter.buildRoute(view.getContext(), "aweme://user/profile/").withParam("uid", userWithAweme.getUser().getUid()).withParam("sec_user_id", userWithAweme.getUser().getSecUid()).withParam("enter_from", "homepage_follow").withParam("enter_from_request_id", userWithAweme.getUser().getRequestId()).withParam("extra_previous_page_position", "card_head").withParam("need_track_compare_recommend_reason", 1).withParam("previous_recommend_reason", userWithAweme.getUser().getRecommendReason()).withParam("recommend_from_type", "card").open();
                }
            }
        });
        m91495l().setOnClickListener(this);
        ((ImageView) a.getValue()).setOnClickListener(this);
        this.f111590v.mo87468a(this);
        Context context = view.getContext();
        C89219l.m154716b(context, "");
        if (C49504ag.m92740a()) {
            int a2 = (int) (((float) C13628n.m24504a(context)) * 0.712f);
            this.f111569a = a2;
            this.f111570b = (int) (((float) a2) * 1.34f);
        }
    }
}
