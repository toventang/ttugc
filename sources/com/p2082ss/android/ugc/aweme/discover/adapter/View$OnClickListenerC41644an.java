package com.p2082ss.android.ugc.aweme.discover.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.core.content.C0643b;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.android.livesdkapi.depend.model.live.RoomInfo;
import com.bytedance.android.livesdkapi.depend.p680d.AbstractC11642f;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.tablayout.DmtTabLayout;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17300a;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17303d;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1722h.C23163i;
import com.p2082ss.android.ugc.aweme.discover.helper.C41988ah;
import com.p2082ss.android.ugc.aweme.discover.helper.C42014f;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.p2788a.C42312e;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.p2789b.C42317b;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.p2789b.C42319d;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.p2789b.C42320e;
import com.p2082ss.android.ugc.aweme.discover.model.Position;
import com.p2082ss.android.ugc.aweme.discover.model.SearchUser;
import com.p2082ss.android.ugc.aweme.discover.p2760a.C41507ao;
import com.p2082ss.android.ugc.aweme.discover.p2760a.C41510aq;
import com.p2082ss.android.ugc.aweme.discover.p2760a.C41528e;
import com.p2082ss.android.ugc.aweme.discover.p2760a.C41537l;
import com.p2082ss.android.ugc.aweme.discover.p2787m.C42292a;
import com.p2082ss.android.ugc.aweme.discover.p2787m.C42303f;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.p2806c.C42813a;
import com.p2082ss.android.ugc.aweme.feed.AvatarImageWithLive;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.C50196d;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.LiveCircleView;
import com.p2082ss.android.ugc.aweme.follow.NewFollowButton;
import com.p2082ss.android.ugc.aweme.follow.widet.C51086a;
import com.p2082ss.android.ugc.aweme.following.p3003ui.adapter.AbstractC51187d;
import com.p2082ss.android.ugc.aweme.friends.model.MutualStruct;
import com.p2082ss.android.ugc.aweme.i18n.C53437b;
import com.p2082ss.android.ugc.aweme.live.AbstractC58593c;
import com.p2082ss.android.ugc.aweme.live.ILiveOuterService;
import com.p2082ss.android.ugc.aweme.live.LiveOuterService;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.p2817e.AbstractC43303b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.IIMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56245a;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.profile.model.BlockStatus;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatusEvent;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3575f.C63771aj;
import com.p2082ss.android.ugc.aweme.search.C67361d;
import com.p2082ss.android.ugc.aweme.search.ecom.C67412f;
import com.p2082ss.android.ugc.aweme.search.ecom.C67414g;
import com.p2082ss.android.ugc.aweme.search.ecom.ProductListView;
import com.p2082ss.android.ugc.aweme.search.p3684b.C67348a;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67496as;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67498at;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67540c;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67542d;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67568r;
import com.p2082ss.android.ugc.aweme.search.p3696l.C67641m;
import com.p2082ss.android.ugc.aweme.search.p3703q.C67699b;
import com.p2082ss.android.ugc.aweme.search.p3703q.C67702c;
import com.p2082ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import com.p2082ss.android.ugc.aweme.userservice.UserService;
import com.p2082ss.android.ugc.aweme.userservice.api.IUserService;
import com.p2082ss.android.ugc.aweme.utils.C80538hl;
import com.p2082ss.android.ugc.aweme.utils.C80581io;
import com.p2082ss.android.ugc.aweme.utils.UserVerify;
import com.p2082ss.android.ugc.aweme.views.MutualRelationView;
import com.p2082ss.android.ugc.aweme.views.RtlViewPager;
import com.p2082ss.android.ugc.aweme.views.SuggestUserAvatarView;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p077b.C1731i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.an */
public final class View$OnClickListenerC41644an extends AbstractView$OnAttachStateChangeListenerC41671b implements View.OnClickListener, AbstractC1214u<FollowStatus>, AbstractC90252i, AbstractC90253j {

    /* renamed from: A */
    public static final C41648c f97140A = new C41648c((byte) 0);

    /* renamed from: B */
    private TextView f97141B;

    /* renamed from: C */
    private TuxTextView f97142C;

    /* renamed from: D */
    private MutualRelationView f97143D;

    /* renamed from: E */
    private ViewStub f97144E;

    /* renamed from: F */
    private AbstractC51187d f97145F;

    /* renamed from: G */
    private final AbstractC89244h f97146G;

    /* renamed from: H */
    private final AbstractC89244h f97147H;

    /* renamed from: I */
    private final AbstractC89244h f97148I;

    /* renamed from: a */
    AvatarImageWithLive f97149a;

    /* renamed from: b */
    LiveCircleView f97150b;

    /* renamed from: c */
    public NewFollowButton f97151c;

    /* renamed from: d */
    TextView f97152d;

    /* renamed from: e */
    TextView f97153e;

    /* renamed from: f */
    ViewStub f97154f;

    /* renamed from: g */
    ViewStub f97155g;

    /* renamed from: h */
    public RtlViewPager f97156h;

    /* renamed from: i */
    ViewGroup f97157i;

    /* renamed from: m */
    C67699b f97158m;

    /* renamed from: n */
    C67702c f97159n;

    /* renamed from: o */
    public ProductListView f97160o;

    /* renamed from: p */
    ViewStub f97161p;

    /* renamed from: q */
    C50196d f97162q;

    /* renamed from: r */
    AbstractC43303b f97163r;

    /* renamed from: s */
    public User f97164s;

    /* renamed from: t */
    public SearchUser f97165t;

    /* renamed from: u */
    C51086a f97166u;

    /* renamed from: v */
    C42014f f97167v;

    /* renamed from: w */
    public User f97168w;

    /* renamed from: x */
    public EnumC41670ao f97169x;

    /* renamed from: y */
    final AbstractC1214u<BlockStatus> f97170y;

    /* renamed from: z */
    final AbstractC89171a<C89391z> f97171z;

    static {
        Covode.recordClassIndex(49557);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final IUserService mo60336a() {
        return (IUserService) this.f97146G.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C67414g mo70857b() {
        return (C67414g) this.f97147H.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C67412f mo70858c() {
        return (C67412f) this.f97148I.getValue();
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(174, new RunnableC90250g(View$OnClickListenerC41644an.class, "onFollowStatusEvent", FollowStatusEvent.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.an$c */
    public static final class C41648c {
        static {
            Covode.recordClassIndex(49561);
        }

        private C41648c() {
        }

        public /* synthetic */ C41648c(byte b) {
            this();
        }

        /* renamed from: a */
        public static View$OnClickListenerC41644an m83625a(ViewGroup viewGroup, AbstractC51187d dVar) {
            C89219l.m154721d(viewGroup, "");
            C89219l.m154721d(dVar, "");
            return new View$OnClickListenerC41644an(C67641m.m119786a(viewGroup, R.layout.avf), dVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.an$n */
    static final class C41669n extends AbstractC89220m implements AbstractC89171a<IUserService> {

        /* renamed from: a */
        public static final C41669n f97196a = new C41669n();

        static {
            Covode.recordClassIndex(49582);
        }

        C41669n() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ IUserService invoke() {
            return UserService.m138861d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.an$d */
    static final class RunnableC41649d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC41644an f97175a;

        static {
            Covode.recordClassIndex(49562);
        }

        RunnableC41649d(View$OnClickListenerC41644an anVar) {
            this.f97175a = anVar;
        }

        public final void run() {
            C1731i.m5640b(new CallableC41654i(this.f97175a), C1731i.f5562a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.an$h */
    public static final class C41653h implements C42014f.AbstractC42017c {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC41644an f97179a;

        static {
            Covode.recordClassIndex(49566);
        }

        @Override // com.p2082ss.android.ugc.aweme.discover.helper.C42014f.AbstractC42017c
        /* renamed from: a */
        public final List<C67361d> mo70843a() {
            User user = this.f97179a.f97164s;
            if (user != null) {
                return user.getHighlightInfoList();
            }
            return null;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C41653h(View$OnClickListenerC41644an anVar) {
            this.f97179a = anVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.discover.helper.C42014f.AbstractC42017c
        /* renamed from: a */
        public final List<Object> mo70844a(String str, String str2, Position position) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(position, "");
            int hashCode = str2.hashCode();
            if (hashCode != -980688722) {
                if (hashCode != -980394840 || !str2.equals("search_user_name")) {
                    return null;
                }
            } else if (!str2.equals("search_user_desc")) {
                return null;
            }
            View view = this.f97179a.itemView;
            C89219l.m154716b(view, "");
            return C89070n.m154522b(new ForegroundColorSpan(C0643b.m2378c(view.getContext(), R.color.bx)), new C42292a(C17300a.m32029a().mo27610a(C17303d.f41573g)));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.an$j */
    static final class RunnableC41655j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC41644an f97181a;

        /* renamed from: b */
        final /* synthetic */ FollowStatusEvent f97182b;

        static {
            Covode.recordClassIndex(49568);
        }

        RunnableC41655j(View$OnClickListenerC41644an anVar, FollowStatusEvent followStatusEvent) {
            this.f97181a = anVar;
            this.f97182b = followStatusEvent;
        }

        public final void run() {
            FollowStatus followStatus;
            View$OnClickListenerC41644an anVar = this.f97181a;
            FollowStatusEvent followStatusEvent = this.f97182b;
            if (followStatusEvent != null) {
                followStatus = followStatusEvent.status;
            } else {
                followStatus = null;
            }
            anVar.onChanged(followStatus);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.an$l */
    static final class C41662l extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC41644an f97189a;

        static {
            Covode.recordClassIndex(49575);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41662l(View$OnClickListenerC41644an anVar) {
            super(0);
            this.f97189a = anVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            View$OnClickListenerC41644an.m83601a(this.f97189a, "8", null, 2);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.discover.adapter.AbstractView$OnAttachStateChangeListenerC41671b
    /* renamed from: E */
    public final void mo70854E() {
        mo70857b().mo106320a().clear();
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.an$a */
    public static final class C41646a implements C51086a.AbstractC51088a {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC41644an f97173a;

        static {
            Covode.recordClassIndex(49559);
        }

        @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51088a
        /* renamed from: a */
        public final void mo70870a() {
            User user = this.f97173a.f97164s;
            if (user != null) {
                C42319d.m84685a("search_popup_confirm_show", this.f97173a.mo70877F(), user).mo96792f();
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51088a
        /* renamed from: b */
        public final void mo70871b() {
            User user = this.f97173a.f97164s;
            if (user != null) {
                C42319d.m84685a("search_popup_confirm_click", this.f97173a.mo70877F(), user).mo106452c("button_type", "click_back").mo96792f();
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51088a
        /* renamed from: c */
        public final void mo70872c() {
            User user = this.f97173a.f97164s;
            if (user != null) {
                C42319d.m84685a("search_popup_confirm_click", this.f97173a.mo70877F(), user).mo106452c("button_type", "click_unfollow").mo96792f();
            }
        }

        C41646a(View$OnClickListenerC41644an anVar) {
            this.f97173a = anVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.an$k */
    static final class C41656k extends AbstractC89220m implements AbstractC89171a<C67412f> {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC41644an f97183a;

        static {
            Covode.recordClassIndex(49569);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41656k(View$OnClickListenerC41644an anVar) {
            super(0);
            this.f97183a = anVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C67412f invoke() {
            return new C67412f(new AbstractC89171a<Context>(this) {
                /* class com.p2082ss.android.ugc.aweme.discover.adapter.View$OnClickListenerC41644an.C41656k.C416571 */

                /* renamed from: a */
                final /* synthetic */ C41656k f97184a;

                static {
                    Covode.recordClassIndex(49570);
                }

                {
                    this.f97184a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ Context invoke() {
                    return this.f97184a.f97183a.mo70878G();
                }
            }, new AbstractC89171a<User>(this) {
                /* class com.p2082ss.android.ugc.aweme.discover.adapter.View$OnClickListenerC41644an.C41656k.C416582 */

                /* renamed from: a */
                final /* synthetic */ C41656k f97185a;

                static {
                    Covode.recordClassIndex(49571);
                }

                {
                    this.f97185a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* bridge */ /* synthetic */ User invoke() {
                    return this.f97185a.f97183a.f97164s;
                }
            }, new AbstractC89171a<C67568r>(this) {
                /* class com.p2082ss.android.ugc.aweme.discover.adapter.View$OnClickListenerC41644an.C41656k.C416593 */

                /* renamed from: a */
                final /* synthetic */ C41656k f97186a;

                static {
                    Covode.recordClassIndex(49572);
                }

                {
                    this.f97186a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ C67568r invoke() {
                    return this.f97186a.f97183a.mo70877F();
                }
            }, new AbstractC89171a<String>(this) {
                /* class com.p2082ss.android.ugc.aweme.discover.adapter.View$OnClickListenerC41644an.C41656k.C416604 */

                /* renamed from: a */
                final /* synthetic */ C41656k f97187a;

                static {
                    Covode.recordClassIndex(49573);
                }

                {
                    this.f97187a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ String invoke() {
                    return this.f97187a.f97183a.mo70862h();
                }
            }, new AbstractC89171a<String>(this) {
                /* class com.p2082ss.android.ugc.aweme.discover.adapter.View$OnClickListenerC41644an.C41656k.C416615 */

                /* renamed from: a */
                final /* synthetic */ C41656k f97188a;

                static {
                    Covode.recordClassIndex(49574);
                }

                {
                    this.f97188a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ String invoke() {
                    return this.f97188a.f97183a.mo70864j();
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.an$m */
    static final class C41663m extends AbstractC89220m implements AbstractC89171a<C67414g> {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC41644an f97190a;

        static {
            Covode.recordClassIndex(49576);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41663m(View$OnClickListenerC41644an anVar) {
            super(0);
            this.f97190a = anVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C67414g invoke() {
            return new C67414g(new AbstractC89171a<User>(this) {
                /* class com.p2082ss.android.ugc.aweme.discover.adapter.View$OnClickListenerC41644an.C41663m.C416641 */

                /* renamed from: a */
                final /* synthetic */ C41663m f97191a;

                static {
                    Covode.recordClassIndex(49577);
                }

                {
                    this.f97191a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* bridge */ /* synthetic */ User invoke() {
                    return this.f97191a.f97190a.f97164s;
                }
            }, new AbstractC89171a<C67568r>(this) {
                /* class com.p2082ss.android.ugc.aweme.discover.adapter.View$OnClickListenerC41644an.C41663m.C416652 */

                /* renamed from: a */
                final /* synthetic */ C41663m f97192a;

                static {
                    Covode.recordClassIndex(49578);
                }

                {
                    this.f97192a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ C67568r invoke() {
                    return this.f97192a.f97190a.mo70877F();
                }
            }, new AbstractC89171a<String>(this) {
                /* class com.p2082ss.android.ugc.aweme.discover.adapter.View$OnClickListenerC41644an.C41663m.C416663 */

                /* renamed from: a */
                final /* synthetic */ C41663m f97193a;

                static {
                    Covode.recordClassIndex(49579);
                }

                {
                    this.f97193a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ String invoke() {
                    return this.f97193a.f97190a.mo70862h();
                }
            }, new AbstractC89171a<String>(this) {
                /* class com.p2082ss.android.ugc.aweme.discover.adapter.View$OnClickListenerC41644an.C41663m.C416674 */

                /* renamed from: a */
                final /* synthetic */ C41663m f97194a;

                static {
                    Covode.recordClassIndex(49580);
                }

                {
                    this.f97194a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ String invoke() {
                    return this.f97194a.f97190a.mo70864j();
                }
            }, new AbstractC89171a<Boolean>(this) {
                /* class com.p2082ss.android.ugc.aweme.discover.adapter.View$OnClickListenerC41644an.C41663m.C416685 */

                /* renamed from: a */
                final /* synthetic */ C41663m f97195a;

                static {
                    Covode.recordClassIndex(49581);
                }

                {
                    this.f97195a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ Boolean invoke() {
                    boolean z;
                    boolean z2;
                    RtlViewPager rtlViewPager = this.f97195a.f97190a.f97156h;
                    boolean z3 = false;
                    if (rtlViewPager == null || rtlViewPager.getCurrentItem() != 1) {
                        z = false;
                    } else {
                        z = true;
                    }
                    ProductListView productListView = this.f97195a.f97190a.f97160o;
                    if (productListView == null || productListView.getVisibility() != 0) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (z || z2) {
                        z3 = true;
                    }
                    return Boolean.valueOf(z3);
                }
            });
        }
    }

    /* renamed from: g */
    static boolean m83603g() {
        try {
            ILiveOuterService s = LiveOuterService.m107269s();
            C89219l.m154716b(s, "");
            AbstractC58593c d = s.mo95830d();
            C89219l.m154716b(d, "");
            return d.mo13038s().mo13045a();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: i */
    public final String mo70863i() {
        User user;
        String uid;
        String str = mo70877F().f151302C;
        if (str.length() > 0) {
            return str;
        }
        SearchUser searchUser = this.f97165t;
        if (searchUser == null || (user = searchUser.user) == null || (uid = user.getUid()) == null) {
            return "";
        }
        return uid;
    }

    /* renamed from: j */
    public final String mo70864j() {
        if (mo70877F().f151303D != null) {
            return "1";
        }
        SearchUser searchUser = this.f97165t;
        if (searchUser == null || !searchUser.isAladdin()) {
            return "0";
        }
        return "1";
    }

    /* renamed from: m */
    private final String m83606m() {
        User user = this.f97164s;
        if (user == null) {
            return "";
        }
        String a = C53437b.m98615a((long) user.getFollowerCount());
        String quantityString = mo70878G().getResources().getQuantityString(R.plurals.hd, user.getFollowerCount(), a);
        C89219l.m154716b(quantityString, "");
        return quantityString;
    }

    /* renamed from: n */
    private final String m83607n() {
        User user = this.f97164s;
        if (user == null) {
            return "";
        }
        String a = C53437b.m98615a((long) user.getAwemeCount());
        String quantityString = mo70878G().getResources().getQuantityString(R.plurals.hj, user.getAwemeCount(), a);
        C89219l.m154716b(quantityString, "");
        return quantityString;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final String mo70861f() {
        try {
            ILiveOuterService s = LiveOuterService.m107269s();
            C89219l.m154716b(s, "");
            AbstractC58593c d = s.mo95830d();
            C89219l.m154716b(d, "");
            AbstractC11642f r = d.mo13037r();
            View view = this.itemView;
            C89219l.m154716b(view, "");
            return r.mo12968a(view.getContext());
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: h */
    public final String mo70862h() {
        List<Aweme> list;
        List<Music> list2;
        if (!TextUtils.isEmpty(mo70877F().f151301B)) {
            return mo70877F().f151301B;
        }
        SearchUser searchUser = this.f97165t;
        if (searchUser != null && (list2 = searchUser.musicCards) != null && (!list2.isEmpty())) {
            return "musician";
        }
        SearchUser searchUser2 = this.f97165t;
        if (searchUser2 == null || (list = searchUser2.awemeCards) == null || !(!list.isEmpty())) {
            return "person";
        }
        return "hot_user";
    }

    /* renamed from: l */
    private final void m83605l() {
        User user;
        if (this.f97169x == EnumC41670ao.SHOW_BLOCK && C41528e.m83468a()) {
            User user2 = this.f97164s;
            if ((user2 != null && user2.getBlockStatus() == 1) || ((user = this.f97164s) != null && user.getBlockStatus() == 4)) {
                TuxTextView tuxTextView = this.f97142C;
                if (tuxTextView == null) {
                    C89219l.m154710a("descText");
                }
                Drawable e = C41510aq.m83457e();
                if (e != null) {
                    int b = C41510aq.m83454b();
                    int c = C41510aq.m83455c();
                    C23163i.m43660a((View) tuxTextView, Integer.valueOf(b), Integer.valueOf(c), Integer.valueOf(b), Integer.valueOf(c), false, 16);
                    tuxTextView.setBackground(e);
                }
                Integer d = C41510aq.m83456d();
                if (d != null) {
                    tuxTextView.setTextColor(d.intValue());
                }
                tuxTextView.setText(R.string.fgr);
                tuxTextView.setTuxFont(72);
            }
        }
    }

    /* renamed from: k */
    private final boolean m83604k() {
        User user;
        MutualStruct mutualStruct;
        if (this.f97169x != EnumC41670ao.EMPTY || (user = this.f97164s) == null) {
            return false;
        }
        if ((user.getFollowStatus() != 0 && C41537l.m83473a()) || (mutualStruct = user.getMutualStruct()) == null || mutualStruct.getTotal() <= 0) {
            return false;
        }
        TuxTextView tuxTextView = this.f97142C;
        if (tuxTextView == null) {
            C89219l.m154710a("descText");
        }
        tuxTextView.setVisibility(8);
        MutualRelationView mutualRelationView = this.f97143D;
        if (mutualRelationView == null) {
            C89219l.m154710a("mutualRelationView");
        }
        mutualRelationView.setVisibility(0);
        mutualRelationView.setTextColor(C0643b.m2378c(mutualRelationView.getContext(), R.color.c5));
        mutualRelationView.setTuxTextSize(61);
        int i = C41510aq.m83453a().f96831a;
        if (i == 2 || i == 3) {
            if (this.f97143D == null) {
                C89219l.m154710a("mutualRelationView");
            }
            C89219l.m154716b(mutualStruct, "");
            C89219l.m154721d(mutualStruct, "");
            if (!SuggestUserAvatarView.m141175a(mutualStruct)) {
                Drawable e = C41510aq.m83457e();
                if (e != null) {
                    int b = C41510aq.m83454b();
                    int c = C41510aq.m83455c();
                    mutualRelationView.m141126a(Integer.valueOf(b), Integer.valueOf(c), Integer.valueOf(b), Integer.valueOf(c));
                    mutualRelationView.setRootBackground(e);
                }
                Integer d = C41510aq.m83456d();
                if (d != null) {
                    mutualRelationView.setTextColor(d.intValue());
                }
                mutualRelationView.mo125025b(C0643b.m2378c(mutualRelationView.getContext(), R.color.l), C0643b.m2378c(mutualRelationView.getContext(), R.color.bx));
                mutualRelationView.mo125021a(((Number) C41510aq.f96835b.getValue()).intValue(), ((Number) C41510aq.f96836c.getValue()).intValue());
                mutualRelationView.mo125024b();
                mutualRelationView.setTuxTextSize(72);
            }
        }
        mutualRelationView.mo125023a(mutualStruct, 4);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo70859d() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        User user = this.f97164s;
        if (user != null) {
            String searchUserName = user.getSearchUserName();
            if (searchUserName == null || !C80538hl.m139614a(searchUserName)) {
                searchUserName = "";
            }
            spannableStringBuilder.append((CharSequence) searchUserName);
            C42014f fVar = this.f97167v;
            if (fVar != null) {
                fVar.mo71199a((C42014f) spannableStringBuilder, (Spannable) "search_user_name", (String) 0);
            }
            if (C80581io.m139706a(new UserVerify(null, user.getCustomVerify(), user.getEnterpriseVerifyReason(), -1))) {
                spannableStringBuilder.append((CharSequence) " T");
                spannableStringBuilder.setSpan(new C63771aj(mo70878G(), R.drawable.abf), (spannableStringBuilder.length() - 2) + 1, spannableStringBuilder.length(), 17);
            }
            if (user.isPrivateAccount() && C41507ao.m83452a() && C41988ah.m84051a(user.getFollowStatus())) {
                String string = mo70878G().getString(R.string.et7);
                C89219l.m154716b(string, "");
                spannableStringBuilder.append((CharSequence) " · ");
                spannableStringBuilder.append((CharSequence) string);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(C0643b.m2378c(mo70878G(), R.color.c5)), (spannableStringBuilder.length() - 3) - string.length(), spannableStringBuilder.length(), 33);
            }
        }
        TextView textView = this.f97152d;
        if (textView == null) {
            C89219l.m154710a("usernameText");
        }
        textView.setText(spannableStringBuilder);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.an$i */
    static final class CallableC41654i<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC41644an f97180a;

        static {
            Covode.recordClassIndex(49567);
        }

        CallableC41654i(View$OnClickListenerC41644an anVar) {
            this.f97180a = anVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            User user;
            String str;
            String str2;
            String str3;
            User user2;
            User user3;
            String uid;
            String str4;
            User user4;
            User user5;
            User user6;
            User user7;
            SearchUser searchUser = this.f97180a.f97165t;
            Integer num = null;
            if (searchUser != null) {
                user = searchUser.user;
            } else {
                user = null;
            }
            String a = C42312e.m84674a(user);
            String str5 = "blocked";
            if (this.f97180a.f97169x == EnumC41670ao.SHOW_BLOCK) {
                a = str5;
            }
            String str6 = this.f97180a.mo70877F().f151323r;
            String str7 = "";
            if (TextUtils.isEmpty(str6) && ((user7 = this.f97180a.f97168w) == null || (str6 = user7.getUid()) == null)) {
                str6 = str7;
            }
            C67498at a2 = C42317b.m84679a(this.f97180a.mo70877F());
            a2.mo106493t(a);
            a2.mo106456l(str6);
            String h = this.f97180a.mo70862h();
            SearchUser searchUser2 = this.f97180a.f97165t;
            if (searchUser2 == null || (user6 = searchUser2.user) == null) {
                str = null;
            } else {
                str = user6.getUniqueId();
            }
            a2.mo106494u(str);
            SearchUser searchUser3 = this.f97180a.f97165t;
            if (searchUser3 == null || (user5 = searchUser3.user) == null) {
                str2 = null;
            } else {
                str2 = C42312e.m84674a(user5);
            }
            if (this.f97180a.f97169x != EnumC41670ao.SHOW_BLOCK) {
                str5 = str2;
            }
            SearchUser searchUser4 = this.f97180a.f97165t;
            if (!(searchUser4 == null || (user4 = searchUser4.user) == null)) {
                num = Integer.valueOf(C42320e.m84686a(user4));
            }
            a2.mo106489c(num);
            if (C80538hl.m139614a(str5)) {
                a2.mo96786a("user_tag", str5);
            }
            SearchUser searchUser5 = this.f97180a.f97165t;
            if (searchUser5 != null && !searchUser5.isAladdin() && this.f97180a.mo70877F().f151306a) {
                a2.mo106498y(String.valueOf(this.f97180a.getAdapterPosition()));
            }
            if (this.f97180a.mo70877F().f151303D != null) {
                C67542d dVar = (C67542d) ((C67542d) a2.mo106491r("user")).mo106490d(Integer.valueOf(this.f97180a.getAdapterPosition()));
                User user8 = this.f97180a.f97164s;
                if (user8 == null || (str4 = user8.getSearchUserDesc()) == null) {
                    str4 = str7;
                }
                dVar.mo106492s(str4);
            }
            SearchUser searchUser6 = this.f97180a.f97165t;
            if (searchUser6 != null && searchUser6.isAladdin()) {
                SearchUser searchUser7 = this.f97180a.f97165t;
                if (!(searchUser7 == null || (user3 = searchUser7.user) == null || (uid = user3.getUid()) == null)) {
                    str7 = uid;
                }
                a2.mo106495v(str7);
            }
            a2.mo106497x(h);
            a2.mo106496w(this.f97180a.mo70864j());
            a2.mo106487g(this.f97180a.mo70863i());
            SearchUser searchUser8 = this.f97180a.f97165t;
            if (searchUser8 == null || (user2 = searchUser8.user) == null || !user2.isLive()) {
                str3 = "0";
            } else {
                str3 = "1";
            }
            a2.mo106452c("is_live", str3);
            Objects.requireNonNull(a2, "null cannot be cast to non-null type T");
            a2.mo96792f();
            return a2;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0141, code lost:
        if (r1.isPrivateAccount() != false) goto L_0x0143;
     */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0113  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo70860e() {
        /*
        // Method dump skipped, instructions count: 361
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.discover.adapter.View$OnClickListenerC41644an.mo70860e():void");
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.an$f */
    static final class C41651f implements DmtTabLayout.AbstractC17288b {

        /* renamed from: a */
        public static final C41651f f97177a = new C41651f();

        static {
            Covode.recordClassIndex(49564);
        }

        C41651f() {
        }

        @Override // com.bytedance.ies.dmt.p1194ui.widget.tablayout.DmtTabLayout.AbstractC17288b
        /* renamed from: a */
        public final void mo27573a(DmtTabLayout.C17294f fVar) {
            fVar.mo27592a();
        }
    }

    @AbstractC90264r
    public final void onFollowStatusEvent(FollowStatusEvent followStatusEvent) {
        this.itemView.post(new RunnableC41655j(this, followStatusEvent));
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.adapter.AbstractView$OnAttachStateChangeListenerC41671b
    public final void onViewAttachedToWindow(View view) {
        C89219l.m154721d(view, "");
        super.onViewAttachedToWindow(view);
        EventBus.m156966a(EventBus.m156962a(), this);
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.adapter.AbstractView$OnAttachStateChangeListenerC41671b
    public final void onViewDetachedFromWindow(View view) {
        C89219l.m154721d(view, "");
        super.onViewDetachedFromWindow(view);
        EventBus.m156962a().mo145395b(this);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.an$b */
    static final class C41647b implements C51086a.AbstractC51089b {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC41644an f97174a;

        static {
            Covode.recordClassIndex(49560);
        }

        C41647b(View$OnClickListenerC41644an anVar) {
            this.f97174a = anVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51089b
        /* renamed from: a */
        public final void mo70873a(FollowStatus followStatus) {
            User user;
            User user2;
            C89219l.m154716b(followStatus, "");
            if (followStatus.followStatus != 0 && (user = this.f97174a.f97164s) != null && user.getBlockStatus() == 1 && (user2 = this.f97174a.f97164s) != null) {
                user2.setBlockStatus(0);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private View$OnClickListenerC41644an(View view) {
        super(view);
        C89219l.m154721d(view, "");
        this.f97146G = C89250i.m154773a((AbstractC89171a) C41669n.f97196a);
        this.f97170y = new C41652g(this);
        this.f97147H = C89250i.m154773a((AbstractC89171a) new C41663m(this));
        this.f97148I = C89250i.m154773a((AbstractC89171a) new C41656k(this));
        this.f97171z = new C41662l(this);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.an$g */
    static final class C41652g<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC41644an f97178a;

        static {
            Covode.recordClassIndex(49565);
        }

        C41652g(View$OnClickListenerC41644an anVar) {
            this.f97178a = anVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            User user;
            BlockStatus blockStatus = (BlockStatus) obj;
            View$OnClickListenerC41644an anVar = this.f97178a;
            if (blockStatus != null && (user = anVar.f97164s) != null && !(!C89219l.m154714a((Object) blockStatus.userId, (Object) user.getUid()))) {
                if (blockStatus.blockStatus == 1) {
                    anVar.f97169x = EnumC41670ao.SHOW_BLOCK;
                    if (C41537l.m83473a()) {
                        user.setFollowStatus(0);
                        NewFollowButton newFollowButton = anVar.f97151c;
                        if (newFollowButton == null) {
                            C89219l.m154710a("followButton");
                        }
                        newFollowButton.mo73175a(0, user.getFollowerStatus());
                    }
                } else if (anVar.f97169x == EnumC41670ao.SHOW_BLOCK) {
                    anVar.f97169x = EnumC41670ao.EMPTY;
                }
                user.getBlockStatus();
                user.setBlockStatus(blockStatus.blockStatus);
                anVar.mo70860e();
            }
        }
    }

    /* renamed from: a */
    public final void onChanged(FollowStatus followStatus) {
        User user;
        if (C67348a.m119401b() != 1 && followStatus != null && (user = this.f97164s) != null && TextUtils.equals(followStatus.userId, user.getUid())) {
            if (followStatus.followStatus == 1 || followStatus.followStatus == 2 || followStatus.followStatus == 4) {
                this.f97169x = EnumC41670ao.SHOW_FOLLOW;
            }
            if (followStatus.followStatus == 0) {
                this.f97169x = EnumC41670ao.EMPTY;
            }
            int followStatus2 = user.getFollowStatus();
            user.setFollowStatus(followStatus.followStatus);
            if (followStatus2 != followStatus.followStatus) {
                mo70859d();
            }
            mo70860e();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.an$e */
    static final class C41650e implements C51086a.AbstractC51090c {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC41644an f97176a;

        static {
            Covode.recordClassIndex(49563);
        }

        C41650e(View$OnClickListenerC41644an anVar) {
            this.f97176a = anVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51090c
        /* renamed from: a */
        public final boolean mo63341a(int i) {
            String str;
            IIMService createIIMServicebyMonsterPlugin;
            User user = this.f97176a.f97164s;
            if (user == null) {
                return false;
            }
            View$OnClickListenerC41644an anVar = this.f97176a;
            C89219l.m154721d(user, "");
            int followStatus = user.getFollowStatus();
            String str2 = "click_cancel_follow";
            if (followStatus == 0) {
                str2 = user.isPrivateAccount() ? "click_request" : "click_follow_button";
            } else if (followStatus != 1) {
                if (followStatus != 2) {
                    if (followStatus != 4) {
                        str2 = "";
                    }
                } else if (!C42303f.m84663a(user)) {
                    str2 = "click_message";
                }
            }
            anVar.mo70856a(str2, null);
            Context G = this.f97176a.mo70878G();
            if (this.f97176a.mo70877F().f151306a) {
                str = "general_search";
            } else {
                str = "search_result";
            }
            User user2 = this.f97176a.f97164s;
            NewFollowButton newFollowButton = this.f97176a.f97151c;
            if (newFollowButton == null) {
                C89219l.m154710a("followButton");
            }
            boolean shouldShowMessageText = newFollowButton.getShouldShowMessageText();
            C89219l.m154721d(str, "");
            if (user2 == null || !shouldShowMessageText || user2.getFollowStatus() != 2) {
                return false;
            }
            IMUser fromUser = IMUser.fromUser(user2);
            if (!(fromUser == null || (createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false)) == null)) {
                createIIMServicebyMonsterPlugin.startChat(C56245a.C56247b.m102214a(G, fromUser).mo93274c(str).mo93271b("button").f128281a);
            }
            return true;
        }
    }

    public final void onClick(View view) {
        User user;
        String str;
        ClickAgent.onClick(view);
        if (C58001a.m104815a(view, 1200) || (user = this.f97164s) == null) {
            return;
        }
        if (view == null || view.getId() != R.id.bsr || !BusinessComponentServiceUtils.getLiveAllService().mo120927a(this.f97164s)) {
            m83601a(this, null, C89041ag.m154412a(C89387v.m154943a("list_result_type", "user")), 1);
            return;
        }
        C89378p[] pVarArr = new C89378p[2];
        User user2 = this.f97164s;
        if (user2 == null || (str = String.valueOf(user2.roomId)) == null) {
            str = "";
        }
        pVarArr[0] = C89387v.m154943a("room_id", str);
        pVarArr[1] = C89387v.m154943a("list_result_type", "live");
        mo70856a("click_into_live", C89041ag.m154421a(pVarArr));
        User user3 = this.f97164s;
        if (user3 == null) {
            C89219l.m154715b();
        }
        long j = user3.roomId;
        String str2 = mo70877F().f151314i;
        String str3 = mo70877F().f151311f;
        String str4 = mo70877F().f151309d;
        User user4 = this.f97164s;
        if (user4 == null) {
            C89219l.m154715b();
        }
        String uid = user4.getUid();
        StringBuilder sb = new StringBuilder();
        User user5 = this.f97164s;
        if (user5 == null) {
            C89219l.m154715b();
        }
        String sb2 = sb.append(String.valueOf(user5.roomId)).toString();
        EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
        enterRoomConfig.f28232b.f28280x = str2;
        enterRoomConfig.f28232b.f28281y = str3;
        enterRoomConfig.f28232b.f28244A = str4;
        enterRoomConfig.f28232b.f28282z = uid;
        SearchUser searchUser = this.f97165t;
        if (searchUser != null && searchUser.isAladdin()) {
            enterRoomConfig.f28232b.f28245B = sb2;
        }
        enterRoomConfig.f28232b.f28257a = str2;
        enterRoomConfig.f28232b.f28258b = user.getUid();
        enterRoomConfig.f28233c.f28295L = "others_photo";
        C42813a.m85511a(mo70878G(), j, C89070n.m154525d(Long.valueOf(j)), C89070n.m154525d(new RoomInfo(j, user.getUid())), enterRoomConfig, "general_search");
    }

    /* renamed from: b */
    private final void m83602b(String str, Map<String, String> map) {
        String str2;
        mo70856a("click_info", map);
        User user = this.f97164s;
        if (user != null) {
            str2 = C42312e.m84674a(user);
        } else {
            str2 = null;
        }
        if (this.f97169x == EnumC41670ao.SHOW_BLOCK) {
            str2 = "blocked";
        }
        AbstractC51187d dVar = this.f97145F;
        if (dVar != null) {
            dVar.mo71325a(this.itemView, this.f97164s, getAdapterPosition(), str2, str);
        }
    }

    /* renamed from: a */
    public final void mo70856a(String str, Map<String, String> map) {
        User user;
        String str2;
        String str3;
        String str4;
        String searchUserName;
        User user2;
        User user3;
        User user4;
        C67496as b = C42317b.m84680b(mo70877F());
        String h = mo70862h();
        SearchUser searchUser = this.f97165t;
        Integer num = null;
        if (searchUser != null) {
            user = searchUser.user;
        } else {
            user = null;
        }
        String a = C42312e.m84674a(user);
        if (this.f97169x == EnumC41670ao.SHOW_BLOCK) {
            a = "blocked";
        }
        C67542d dVar = (C67542d) ((C67542d) b.mo106497x(h)).mo106493t(a);
        SearchUser searchUser2 = this.f97165t;
        if (searchUser2 == null || (user4 = searchUser2.user) == null) {
            str2 = null;
        } else {
            str2 = user4.getUniqueId();
        }
        C67540c u = dVar.mo106494u(str2);
        SearchUser searchUser3 = this.f97165t;
        if (searchUser3 == null || (user3 = searchUser3.user) == null) {
            str3 = null;
        } else {
            str3 = user3.getUid();
        }
        C67542d dVar2 = (C67542d) ((C67542d) u.mo106456l(str3)).mo106496w(mo70864j()).mo106487g(mo70863i());
        User user5 = this.f97164s;
        if (user5 != null) {
            num = Integer.valueOf(C42320e.m84686a(user5));
        }
        dVar2.mo106489c(num);
        SearchUser searchUser4 = this.f97165t;
        if (searchUser4 == null || !searchUser4.isAladdin()) {
            b.mo106439A(str);
            if (mo70877F().f151306a) {
                b.mo106498y(String.valueOf(getAdapterPosition()));
            }
        } else {
            b.mo106440B(str);
            SearchUser searchUser5 = this.f97165t;
            String str5 = "";
            if (searchUser5 == null || (user2 = searchUser5.user) == null || (str4 = user2.getUid()) == null) {
                str4 = str5;
            }
            C67542d dVar3 = (C67542d) ((C67542d) b.mo106495v(str4)).mo106490d(Integer.valueOf(getAdapterPosition()));
            User user6 = this.f97164s;
            if (!(user6 == null || (searchUserName = user6.getSearchUserName()) == null)) {
                str5 = searchUserName;
            }
            dVar3.mo106492s(str5);
        }
        if (map != null) {
            b.mo96788a(map);
        }
        b.mo96792f();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public View$OnClickListenerC41644an(View view, AbstractC51187d dVar) {
        this(view);
        C89219l.m154721d(view, "");
        View findViewById = view.findViewById(R.id.bsr);
        C89219l.m154716b(findViewById, "");
        this.f97149a = (AvatarImageWithLive) findViewById;
        View findViewById2 = view.findViewById(R.id.br7);
        C89219l.m154716b(findViewById2, "");
        this.f97150b = (LiveCircleView) findViewById2;
        View findViewById3 = view.findViewById(R.id.xm);
        C89219l.m154716b(findViewById3, "");
        this.f97151c = (NewFollowButton) findViewById3;
        View findViewById4 = view.findViewById(R.id.f6v);
        C89219l.m154716b(findViewById4, "");
        this.f97152d = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.eso);
        C89219l.m154716b(findViewById5, "");
        this.f97153e = (TextView) findViewById5;
        View findViewById6 = view.findViewById(R.id.ew0);
        C89219l.m154716b(findViewById6, "");
        this.f97141B = (TextView) findViewById6;
        View findViewById7 = view.findViewById(R.id.ev0);
        C89219l.m154716b(findViewById7, "");
        this.f97142C = (TuxTextView) findViewById7;
        View findViewById8 = view.findViewById(R.id.cp5);
        C89219l.m154716b(findViewById8, "");
        this.f97143D = (MutualRelationView) findViewById8;
        View findViewById9 = view.findViewById(R.id.fad);
        C89219l.m154716b(findViewById9, "");
        this.f97144E = (ViewStub) findViewById9;
        View findViewById10 = view.findViewById(R.id.fa6);
        C89219l.m154716b(findViewById10, "");
        this.f97154f = (ViewStub) findViewById10;
        View findViewById11 = view.findViewById(R.id.cou);
        C89219l.m154716b(findViewById11, "");
        this.f97161p = (ViewStub) findViewById11;
        View findViewById12 = view.findViewById(R.id.fae);
        C89219l.m154716b(findViewById12, "");
        this.f97155g = (ViewStub) findViewById12;
        ViewStub viewStub = this.f97144E;
        if (viewStub == null) {
            C89219l.m154710a("videoAndPlaylistStub");
        }
        this.f97159n = new C67702c(viewStub, null, 2);
        view.setOnClickListener(this);
        AvatarImageWithLive avatarImageWithLive = this.f97149a;
        if (avatarImageWithLive == null) {
            C89219l.m154710a("avatarImage");
        }
        avatarImageWithLive.setOnClickListener(this);
        this.f97145F = dVar;
        NewFollowButton newFollowButton = this.f97151c;
        if (newFollowButton == null) {
            C89219l.m154710a("followButton");
        }
        C51086a aVar = new C51086a(newFollowButton, new C51086a.AbstractC51093f(this) {
            /* class com.p2082ss.android.ugc.aweme.discover.adapter.View$OnClickListenerC41644an.C416451 */

            /* renamed from: a */
            final /* synthetic */ View$OnClickListenerC41644an f97172a;

            static {
                Covode.recordClassIndex(49558);
            }

            @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51093f
            public final String getEnterMethod() {
                return "click_follow";
            }

            @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51093f
            public final int getFollowFromType() {
                return 14;
            }

            @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51093f
            public final String getEnterFrom() {
                if (this.f97172a.mo70877F().f151306a) {
                    return "general_search";
                }
                return "search_result";
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f97172a = r1;
            }

            @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51093f
            /* renamed from: a */
            public final void mo63346a(int i, User user) {
                String str;
                String str2;
                String str3;
                if (user != null) {
                    if (i == 0) {
                        str = "follow_cancel";
                        str2 = "search_follow_cancel";
                    } else {
                        str = "follow";
                        str2 = "search_follow";
                    }
                    C42319d.m84684a(this.f97172a.mo70877F(), str, i, user, null, false).mo96792f();
                    if (this.f97172a.mo70877F().f151306a) {
                        str3 = "general";
                    } else {
                        str3 = "user";
                    }
                    C42319d.m84684a(this.f97172a.mo70877F(), str2, i, user, C89041ag.m154412a(C89387v.m154943a("search_type", str3)), true).mo96792f();
                }
            }
        });
        if (C41537l.m83473a()) {
            aVar.f117881g = new C41646a(this);
            aVar.f117877c = new C41647b(this);
            aVar.f117882h = true;
            this.f97166u = aVar;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.ss.android.ugc.aweme.discover.adapter.an */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    static /* synthetic */ void m83601a(View$OnClickListenerC41644an anVar, String str, Map map, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            map = null;
        }
        anVar.m83602b(str, map);
    }
}
