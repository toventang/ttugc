package com.p2082ss.android.ugc.aweme.following.p3003ui.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.jedi.arch.AbstractC20362a;
import com.bytedance.jedi.arch.AbstractC20467g;
import com.bytedance.jedi.arch.AbstractC20550y;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.C20372aj;
import com.bytedance.jedi.arch.C20379aq;
import com.bytedance.jedi.arch.C20466f;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.ext.adapter.C20671j;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxy;
import com.bytedance.jedi.ext.adapter.p1467b.AbstractC20638g;
import com.bytedance.jedi.p1445a.p1446a.AbstractC20129c;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.p1713b.C23024a;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.bytedance.tux.dialog.p1713b.C23028c;
import com.bytedance.tux.icon.TuxIconView;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.base.arch.AbstractC34489c;
import com.p2082ss.android.ugc.aweme.base.arch.AbstractC34491d;
import com.p2082ss.android.ugc.aweme.base.arch.JediBaseViewHolder;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageWithVerify;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.common.C39143l;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h;
import com.p2082ss.android.ugc.aweme.common.p2634f.C39110a;
import com.p2082ss.android.ugc.aweme.experiment.C46792ci;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.following.p3002a.C51105d;
import com.p2082ss.android.ugc.aweme.following.p3002a.C51106e;
import com.p2082ss.android.ugc.aweme.following.p3002a.C51107f;
import com.p2082ss.android.ugc.aweme.following.p3002a.C51108g;
import com.p2082ss.android.ugc.aweme.following.p3003ui.view.I18nFollowUserBtn;
import com.p2082ss.android.ugc.aweme.following.p3003ui.viewholder.RecommendContactViewHolder;
import com.p2082ss.android.ugc.aweme.following.p3003ui.viewholder.RecommendRelationTitleViewHolder;
import com.p2082ss.android.ugc.aweme.following.p3003ui.viewholder.RelationStatusViewHolder;
import com.p2082ss.android.ugc.aweme.following.p3003ui.viewmodel.FollowRelationTabViewModel;
import com.p2082ss.android.ugc.aweme.following.p3003ui.viewmodel.FollowerRelationViewModel;
import com.p2082ss.android.ugc.aweme.friends.model.RecommendContact;
import com.p2082ss.android.ugc.aweme.friends.p3022ui.C51695at;
import com.p2082ss.android.ugc.aweme.friends.service.C51648a;
import com.p2082ss.android.ugc.aweme.metrics.C59252q;
import com.p2082ss.android.ugc.aweme.metrics.C59260v;
import com.p2082ss.android.ugc.aweme.notificationlive.C62513a;
import com.p2082ss.android.ugc.aweme.notificationlive.C62561q;
import com.p2082ss.android.ugc.aweme.notificationlive.C62562r;
import com.p2082ss.android.ugc.aweme.notificationlive.C62577t;
import com.p2082ss.android.ugc.aweme.notificationlive.C62683w;
import com.p2082ss.android.ugc.aweme.notificationlive.C62686x;
import com.p2082ss.android.ugc.aweme.notificationlive.NotificationLiveViewModel;
import com.p2082ss.android.ugc.aweme.notificationlive.ResponseState;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.C63973ae;
import com.p2082ss.android.ugc.aweme.profile.presenter.C63847n;
import com.p2082ss.android.ugc.aweme.recommend.MutualFriendItemViewHolder;
import com.p2082ss.android.ugc.aweme.recommend.MutualListTitleViewHolder;
import com.p2082ss.android.ugc.aweme.recommend.RecommendSuggestTitleViewHolder;
import com.p2082ss.android.ugc.aweme.recommend.users.RecommendUserService;
import com.p2082ss.android.ugc.aweme.recommend.users.RecommendUserServiceImpl;
import com.p2082ss.android.ugc.aweme.relation.viewholder.NewRecommendUserViewHolder;
import com.p2082ss.android.ugc.aweme.story.C77260g;
import com.p2082ss.android.ugc.aweme.story.avatar.AbstractC76504c;
import com.p2082ss.android.ugc.aweme.story.avatar.AbstractC76506d;
import com.p2082ss.android.ugc.aweme.story.avatar.AbstractC76508e;
import com.p2082ss.android.ugc.aweme.story.avatar.EnumC76586o;
import com.p2082ss.android.ugc.aweme.tux.business.story.EnumC79475a;
import com.p2082ss.android.ugc.aweme.tux.business.story.StoryBrandView;
import com.p2082ss.android.ugc.aweme.unread.UnReadCircleView;
import com.p2082ss.android.ugc.aweme.user.repository.UserState;
import com.p2082ss.android.ugc.aweme.user.repository.UserViewModel;
import com.p2082ss.android.ugc.aweme.userservice.UserService;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.trill.R;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4560f.p4561a.p4591l.C88960c;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter */
public final class FollowListAdapter extends AbstractC34489c<Object> {

    /* renamed from: k */
    public static final C51166a f117999k = new C51166a((byte) 0);

    /* renamed from: d */
    public final Map<String, Boolean> f118000d = new LinkedHashMap();

    /* renamed from: e */
    public final boolean f118001e;

    /* renamed from: f */
    public final HashSet<String> f118002f = new HashSet<>();

    /* renamed from: g */
    public String f118003g = "";

    /* renamed from: h */
    public final AbstractC1204m f118004h;

    /* renamed from: i */
    public final String f118005i;

    /* renamed from: j */
    public final boolean f118006j;

    static {
        Covode.recordClassIndex(60351);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    /* renamed from: g */
    public final boolean mo67821g() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter$a */
    public static final class C51166a {
        static {
            Covode.recordClassIndex(60369);
        }

        private C51166a() {
        }

        public /* synthetic */ C51166a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter$FollowItemViewHolder */
    public final class FollowItemViewHolder extends JediBaseViewHolder<FollowItemViewHolder, C51108g> implements AbstractC33974au {

        /* renamed from: g */
        public final I18nFollowUserBtn f118007g;

        /* renamed from: j */
        public final ImageView f118008j;

        /* renamed from: k */
        public final StoryBrandView f118009k;

        /* renamed from: l */
        final AbstractC89244h f118010l;

        /* renamed from: m */
        final /* synthetic */ FollowListAdapter f118011m;

        /* renamed from: n */
        private final AvatarImageWithVerify f118012n;

        /* renamed from: o */
        private final TextView f118013o;

        /* renamed from: p */
        private final TextView f118014p;

        /* renamed from: q */
        private final ImageView f118015q;

        /* renamed from: r */
        private final TuxIconView f118016r;

        /* renamed from: s */
        private final UnReadCircleView f118017s;

        /* renamed from: t */
        private final AbstractC89244h f118018t;

        /* renamed from: u */
        private final AbstractC89244h f118019u = C89250i.m154773a((AbstractC89171a) new C51163j(this));

        static {
            Covode.recordClassIndex(60352);
        }

        /* renamed from: m */
        public final FollowRelationTabViewModel mo63351m() {
            return (FollowRelationTabViewModel) this.f118018t.getValue();
        }

        @Override // com.p2082ss.android.ugc.aweme.base.arch.JediBaseViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.AbstractC1202k
        public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
            super.onStateChanged(mVar, aVar);
        }

        /* renamed from: p */
        private static int m95579p() {
            return C16048b.m29633a().mo25412a(true, "show_remark_icon_style", 0);
        }

        /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter$FollowItemViewHolder$j */
        static final class C51163j extends AbstractC89220m implements AbstractC89171a<AbstractC76506d> {

            /* renamed from: a */
            final /* synthetic */ FollowItemViewHolder f118043a;

            static {
                Covode.recordClassIndex(60366);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C51163j(FollowItemViewHolder followItemViewHolder) {
                super(0);
                this.f118043a = followItemViewHolder;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ AbstractC76506d invoke() {
                AbstractC76504c d = C77260g.f173332a.mo120156d();
                if (d != null) {
                    return d.mo120228a(new AbstractC76508e(this) {
                        /* class com.p2082ss.android.ugc.aweme.following.p3003ui.adapter.FollowListAdapter.FollowItemViewHolder.C51163j.C511641 */

                        /* renamed from: a */
                        final /* synthetic */ C51163j f118044a;

                        static {
                            Covode.recordClassIndex(60367);
                        }

                        @Override // com.p2082ss.android.ugc.aweme.story.avatar.AbstractC76548h
                        /* renamed from: d */
                        public final boolean mo80540d() {
                            return true;
                        }

                        @Override // com.p2082ss.android.ugc.aweme.story.avatar.AbstractC76508e
                        /* renamed from: c */
                        public final EnumC76586o mo80539c() {
                            return EnumC76586o.FOLLOW_LIST;
                        }

                        @Override // com.p2082ss.android.ugc.aweme.story.avatar.AbstractC76508e
                        /* renamed from: a */
                        public final StoryBrandView mo80534a() {
                            return this.f118044a.f118043a.f118009k;
                        }

                        @Override // com.p2082ss.android.ugc.aweme.story.avatar.AbstractC76508e
                        /* renamed from: b */
                        public final /* bridge */ /* synthetic */ AbstractC1204m mo80538b() {
                            return this.f118044a.f118043a;
                        }

                        /* JADX WARN: Incorrect args count in method signature: ()V */
                        {
                            this.f118044a = r1;
                        }

                        @Override // com.p2082ss.android.ugc.aweme.story.avatar.AbstractC76548h
                        /* renamed from: a */
                        public final void mo80536a(boolean z, EnumC79475a aVar) {
                            C89219l.m154721d(aVar, "");
                            AbstractC76508e.C76509a.m134112a(aVar);
                        }

                        @Override // com.p2082ss.android.ugc.aweme.story.avatar.AbstractC76508e
                        /* renamed from: a */
                        public final void mo80535a(SmartRoute smartRoute, Aweme aweme) {
                            C89219l.m154721d(smartRoute, "");
                            C89219l.m154721d(aweme, "");
                            smartRoute.withParam("enter_from", this.f118044a.f118043a.f118011m.mo63369e());
                        }

                        @Override // com.p2082ss.android.ugc.aweme.story.avatar.AbstractC76547g
                        /* renamed from: a */
                        public final boolean mo80537a(String str, HashMap<String, String> hashMap) {
                            C89219l.m154721d(str, "");
                            C89219l.m154721d(hashMap, "");
                            if (C89219l.m154714a((Object) str, (Object) "story_click")) {
                                String uid = ((C51108g) this.f118044a.f118043a.aQ_()).f117934b.getUid();
                                if (this.f118044a.f118043a.f118011m.f118002f.contains(uid)) {
                                    return false;
                                }
                                this.f118044a.f118043a.f118011m.f118002f.add(uid);
                            }
                            hashMap.put("enter_from", this.f118044a.f118043a.f118011m.mo63369e());
                            return true;
                        }
                    });
                }
                return null;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter$FollowItemViewHolder$a */
        public static final class C51150a extends AbstractC89220m implements AbstractC89171a<FollowRelationTabViewModel> {

            /* renamed from: a */
            final /* synthetic */ JediViewHolder f118020a;

            /* renamed from: b */
            final /* synthetic */ AbstractC89277c f118021b;

            /* renamed from: c */
            final /* synthetic */ AbstractC89277c f118022c;

            static {
                Covode.recordClassIndex(60353);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C51150a(JediViewHolder jediViewHolder, AbstractC89277c cVar, AbstractC89277c cVar2) {
                super(0);
                this.f118020a = jediViewHolder;
                this.f118021b = cVar;
                this.f118022c = cVar2;
            }

            /* JADX WARN: Type inference failed for: r0v9, types: [com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationTabViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARNING: Unknown variable types count: 1 */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final com.p2082ss.android.ugc.aweme.following.p3003ui.viewmodel.FollowRelationTabViewModel invoke() {
                /*
                    r3 = this;
                    com.bytedance.jedi.ext.adapter.JediViewHolder r0 = r3.f118020a
                    androidx.lifecycle.m r0 = r0.mo33833k()
                    androidx.fragment.app.e r1 = com.bytedance.jedi.ext.adapter.C20624b.m38846b(r0)
                    androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a
                    androidx.lifecycle.ad r2 = androidx.lifecycle.C1181ae.m3881a(r1, r0)
                    h.k.c r0 = r3.f118022c
                    java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                    java.lang.String r1 = r0.getName()
                    java.lang.String r0 = ""
                    p4600h.p4611f.p4613b.C89219l.m154709a(r1, r0)
                    h.k.c r0 = r3.f118021b
                    java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                    androidx.lifecycle.ac r0 = m95583x9d2f77d9(r2, r1, r0)
                    com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.following.p3003ui.adapter.FollowListAdapter.FollowItemViewHolder.C51150a.invoke():com.bytedance.jedi.arch.JediViewModel");
            }

            /* renamed from: com_ss_android_ugc_aweme_following_ui_adapter_FollowListAdapter$FollowItemViewHolder$$special$$inlined$activityViewModel$1_androidx_lifecycle_VScopeLancet_get */
            public static AbstractC1174ac m95583x9d2f77d9(C1175ad adVar, String str, Class cls) {
                if (cls.equals(ScopeViewModel.class)) {
                    return adVar.mo3984a(str, cls);
                }
                AbstractC1174ac a = adVar.mo3984a(str, cls);
                C1171ab.m3870a(a, adVar);
                return a;
            }
        }

        @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
        public final void cc_() {
            super.cc_();
            AbstractC88412b unused = subscribe(mo70807n(), new C20370ah(), new C51160h(this));
            NotificationLiveViewModel o = m95578o();
            String secUid = ((C51108g) aQ_()).f117934b.getSecUid();
            C89219l.m154716b(secUid, "");
            o.mo100460a(secUid);
            AbstractC88412b unused2 = selectSubscribe(m95578o(), C51184a.f118065a, C51185b.f118066a, new C20370ah(), C51161i.f118040a);
        }

        /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter$FollowItemViewHolder$b */
        public static final class C51151b extends AbstractC89220m implements AbstractC89171a<FollowerRelationViewModel> {

            /* renamed from: a */
            final /* synthetic */ JediViewHolder f118023a;

            /* renamed from: b */
            final /* synthetic */ AbstractC89277c f118024b;

            /* renamed from: c */
            final /* synthetic */ AbstractC89277c f118025c;

            static {
                Covode.recordClassIndex(60354);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C51151b(JediViewHolder jediViewHolder, AbstractC89277c cVar, AbstractC89277c cVar2) {
                super(0);
                this.f118023a = jediViewHolder;
                this.f118024b = cVar;
                this.f118025c = cVar2;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationViewModel] */
            /* JADX WARN: Type inference failed for: r0v16, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationViewModel] */
            /* JADX WARN: Type inference failed for: r0v21, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationViewModel] */
            /* JADX WARNING: Unknown variable types count: 3 */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final com.p2082ss.android.ugc.aweme.following.p3003ui.viewmodel.FollowerRelationViewModel invoke() {
                /*
                // Method dump skipped, instructions count: 117
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.following.p3003ui.adapter.FollowListAdapter.FollowItemViewHolder.C51151b.invoke():com.bytedance.jedi.arch.JediViewModel");
            }

            /* renamed from: com_ss_android_ugc_aweme_following_ui_adapter_FollowListAdapter$FollowItemViewHolder$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get */
            public static AbstractC1174ac m95584x8832aaa0(C1175ad adVar, String str, Class cls) {
                if (cls.equals(ScopeViewModel.class)) {
                    return adVar.mo3984a(str, cls);
                }
                AbstractC1174ac a = adVar.mo3984a(str, cls);
                C1171ab.m3870a(a, adVar);
                return a;
            }
        }

        /* renamed from: o */
        private final NotificationLiveViewModel m95578o() {
            C51152c cVar = C51152c.f118026a;
            JediViewHolderProxy jediViewHolderProxy = this.f48646d;
            if (jediViewHolderProxy != null) {
                JediViewModel jediViewModel = (JediViewModel) C20671j.C20672a.m38922a(mo33721d(), jediViewHolderProxy.mo33900b()).mo33923a(getClass().getName() + '_' + NotificationLiveViewModel.class.getName(), NotificationLiveViewModel.class);
                AbstractC20550y a = jediViewModel.f48234j.mo33696a(NotificationLiveViewModel.class);
                if (a != null) {
                    a.binding(jediViewModel);
                }
                jediViewModel.mo33686a_(cVar);
                return (NotificationLiveViewModel) jediViewModel;
            }
            throw new IllegalStateException("proxy not bound to viewHolder yet");
        }

        /* renamed from: n */
        public final UserViewModel mo70807n() {
            C51165k kVar = new C51165k(this);
            JediViewHolderProxy jediViewHolderProxy = this.f48646d;
            if (jediViewHolderProxy != null) {
                JediViewModel jediViewModel = (JediViewModel) C20671j.C20672a.m38922a(mo33721d(), jediViewHolderProxy.mo33900b()).mo33923a(getClass().getName() + '_' + UserViewModel.class.getName(), UserViewModel.class);
                AbstractC20550y a = jediViewModel.f48234j.mo33696a(UserViewModel.class);
                if (a != null) {
                    a.binding(jediViewModel);
                }
                jediViewModel.mo33686a_(kVar);
                return (UserViewModel) jediViewModel;
            }
            throw new IllegalStateException("proxy not bound to viewHolder yet");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter$FollowItemViewHolder$c */
        public static final class C51152c extends AbstractC89220m implements AbstractC89172b<ResponseState, ResponseState> {

            /* renamed from: a */
            public static final C51152c f118026a = new C51152c();

            static {
                Covode.recordClassIndex(60355);
            }

            C51152c() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ ResponseState invoke(ResponseState responseState) {
                ResponseState responseState2 = responseState;
                C89219l.m154721d(responseState2, "");
                return ResponseState.copy$default(responseState2, -1, -1, null, null, 12, null);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter$FollowItemViewHolder$k */
        public static final class C51165k extends AbstractC89220m implements AbstractC89172b<UserState, UserState> {

            /* renamed from: a */
            final /* synthetic */ FollowItemViewHolder f118045a;

            static {
                Covode.recordClassIndex(60368);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C51165k(FollowItemViewHolder followItemViewHolder) {
                super(1);
                this.f118045a = followItemViewHolder;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ UserState invoke(UserState userState) {
                UserState userState2 = userState;
                C89219l.m154721d(userState2, "");
                return UserState.copy$default(userState2, ((C51108g) this.f118045a.aQ_()).f117934b, false, null, null, null, 30, null);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter$FollowItemViewHolder$g */
        public static final class View$OnClickListenerC51159g implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ FollowItemViewHolder f118037a;

            /* renamed from: b */
            final /* synthetic */ User f118038b;

            static {
                Covode.recordClassIndex(60362);
            }

            View$OnClickListenerC51159g(FollowItemViewHolder followItemViewHolder, User user) {
                this.f118037a = followItemViewHolder;
                this.f118038b = user;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                C88960c<C62513a> a = C62577t.m112999a();
                if (a != null) {
                    User user = this.f118038b;
                    C89219l.m154716b(view, "");
                    a.onNext(new C62513a(user, C34729o.m70950a(view.getContext()), this.f118037a.f118011m.mo63369e(), "others_homepage"));
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter$FollowItemViewHolder$f */
        public static final class View$OnClickListenerC51155f implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ FollowItemViewHolder f118031a;

            /* renamed from: b */
            final /* synthetic */ User f118032b;

            static {
                Covode.recordClassIndex(60358);
            }

            View$OnClickListenerC51155f(FollowItemViewHolder followItemViewHolder, User user) {
                this.f118031a = followItemViewHolder;
                this.f118032b = user;
            }

            public final void onClick(final View view) {
                ClickAgent.onClick(view);
                Resources resources = this.f118031a.f118008j.getResources();
                String string = resources.getString(R.string.f_o);
                C89219l.m154716b(string, "");
                String string2 = resources.getString(R.string.a8y);
                C89219l.m154716b(string2, "");
                CharSequence[] charSequenceArr = {string, string2};
                C89219l.m154716b(view, "");
                C39110a aVar = new C39110a(view.getContext());
                aVar.mo67871a(charSequenceArr, new DialogInterface.OnClickListener(this) {
                    /* class com.p2082ss.android.ugc.aweme.following.p3003ui.adapter.FollowListAdapter.FollowItemViewHolder.View$OnClickListenerC51155f.DialogInterface$OnClickListenerC511561 */

                    /* renamed from: a */
                    final /* synthetic */ View$OnClickListenerC51155f f118033a;

                    static {
                        Covode.recordClassIndex(60359);
                    }

                    {
                        this.f118033a = r1;
                    }

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        if (i == 0) {
                            C39162r.m79460a("click_remove_fans", new C33744d().mo59983a("enter_from", "fans").f79943a);
                            View view = view;
                            C89219l.m154716b(view, "");
                            Context context = view.getContext();
                            C89219l.m154716b(context, "");
                            View view2 = view;
                            C89219l.m154716b(view2, "");
                            String string = view2.getResources().getString(R.string.f_n);
                            C89219l.m154716b(string, "");
                            String a = C1764a.m5928a(string, Arrays.copyOf(new Object[]{C80580in.m139684b(this.f118033a.f118032b)}, 1));
                            C89219l.m154716b(a, "");
                            C23028c.m43435a(((C23023b) new C23023b(context).mo37479a(R.string.f_o)).mo37413d(a), new AbstractC89172b<C23025b, C89391z>(this) {
                                /* class com.p2082ss.android.ugc.aweme.following.p3003ui.adapter.FollowListAdapter.FollowItemViewHolder.View$OnClickListenerC51155f.DialogInterface$OnClickListenerC511561.C511571 */

                                /* renamed from: a */
                                final /* synthetic */ DialogInterface$OnClickListenerC511561 f118035a;

                                static {
                                    Covode.recordClassIndex(60360);
                                }

                                {
                                    this.f118035a = r2;
                                }

                                /* Return type fixed from 'java.lang.Object' to match base method */
                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                                public final /* synthetic */ C89391z invoke(C23025b bVar) {
                                    C23025b bVar2 = bVar;
                                    C89219l.m154721d(bVar2, "");
                                    bVar2.mo37416a(R.string.f_m, new AbstractC89172b<C23024a, C89391z>(this) {
                                        /* class com.p2082ss.android.ugc.aweme.following.p3003ui.adapter.FollowListAdapter.FollowItemViewHolder.View$OnClickListenerC51155f.DialogInterface$OnClickListenerC511561.C511571.C511581 */

                                        /* renamed from: a */
                                        final /* synthetic */ C511571 f118036a;

                                        static {
                                            Covode.recordClassIndex(60361);
                                        }

                                        {
                                            this.f118036a = r2;
                                        }

                                        /* Return type fixed from 'java.lang.Object' to match base method */
                                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                        @Override // p4600h.p4611f.p4612a.AbstractC89172b
                                        public final /* synthetic */ C89391z invoke(C23024a aVar) {
                                            C89219l.m154721d(aVar, "");
                                            C39162r.m79460a("remove_fans", new C33744d().mo59983a("enter_from", "fans").f79943a);
                                            UserViewModel n = this.f118036a.f118035a.f118033a.f118031a.mo70807n();
                                            String uid = this.f118036a.f118035a.f118033a.f118032b.getUid();
                                            C89219l.m154716b(uid, "");
                                            String secUid = this.f118036a.f118035a.f118033a.f118032b.getSecUid();
                                            C89219l.m154716b(secUid, "");
                                            C89219l.m154721d(uid, "");
                                            C89219l.m154721d(secUid, "");
                                            AbstractC88979t<BaseResponse> a = UserService.m138861d().mo123565a(uid, secUid).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a));
                                            C89219l.m154716b(a, "");
                                            n.mo33682a(a, UserViewModel.C80091d.f179470a);
                                            return C89391z.f203057a;
                                        }
                                    });
                                    bVar2.mo37418b(R.string.a8y, (AbstractC89172b<? super C23024a, C89391z>) null);
                                    return C89391z.f203057a;
                                }
                            }).mo37405a().mo37396b().show();
                        }
                    }
                });
                aVar.f92306a.mo458b();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter$FollowItemViewHolder$d */
        public static final class View$OnClickListenerC51153d implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ FollowItemViewHolder f118027a;

            /* renamed from: b */
            final /* synthetic */ User f118028b;

            static {
                Covode.recordClassIndex(60356);
            }

            View$OnClickListenerC51153d(FollowItemViewHolder followItemViewHolder, User user) {
                this.f118027a = followItemViewHolder;
                this.f118028b = user;
            }

            public final void onClick(View view) {
                String str;
                ClickAgent.onClick(view);
                if (this.f118027a.f118011m.f118001e) {
                    C89219l.m154716b(view, "");
                    Context context = view.getContext();
                    if (context != null) {
                        SmartRouter.buildRoute(context, "aweme://user/profile/").withParam("uid", this.f118028b.getUid()).withParam("sec_user_id", this.f118028b.getSecUid()).withParam("enter_from", this.f118027a.f118011m.mo63369e()).withParam("need_track_compare_recommend_reason", 1).withParam("previous_recommend_reason", this.f118028b.getRecommendReason()).withParam("recommend_from_type", "list").open();
                    }
                } else {
                    C89219l.m154716b(view, "");
                    if (view.getContext() != null) {
                        int i = 0;
                        User user = this.f118028b;
                        if (user != null) {
                            i = user.getCommerceUserLevel();
                        }
                        SmartRouter.buildRoute(view.getContext(), "aweme://user/profile/").withParam("uid", this.f118028b.getUid()).withParam("sec_user_id", this.f118028b.getSecUid()).withParam("enter_from", this.f118027a.f118011m.mo63369e()).withParam("profile_enterprise_type", i).open();
                    }
                }
                FollowListAdapter followListAdapter = this.f118027a.f118011m;
                User user2 = this.f118028b;
                C59252q qVar = new C59252q();
                qVar.f135314q = user2.getUid();
                C59252q o = qVar.mo96825o(followListAdapter.mo63369e());
                if (followListAdapter.f118006j) {
                    str = "personal_homepage";
                } else {
                    str = "others_homepage";
                }
                o.f135285Y = str;
                o.f135284X = "1044";
                o.f135316s = user2.getRequestId();
                o.mo96822a(user2).mo96792f();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter$FollowItemViewHolder$e */
        public static final class View$OnClickListenerC51154e implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ FollowItemViewHolder f118029a;

            /* renamed from: b */
            final /* synthetic */ User f118030b;

            static {
                Covode.recordClassIndex(60357);
            }

            View$OnClickListenerC51154e(FollowItemViewHolder followItemViewHolder, User user) {
                this.f118029a = followItemViewHolder;
                this.f118030b = user;
            }

            public final void onClick(View view) {
                String str;
                String str2;
                String str3;
                String str4;
                String str5;
                int i;
                int i2;
                int i3;
                ClickAgent.onClick(view);
                FollowListAdapter followListAdapter = this.f118029a.f118011m;
                User user = this.f118030b;
                boolean z = true;
                if (user.getFollowerStatus() == 1) {
                    str = "mutual";
                } else {
                    str = "single";
                }
                if (user.getFollowStatus() == 0) {
                    str2 = "follow";
                } else {
                    str2 = "follow_cancel";
                }
                C59260v vVar = new C59260v(str2);
                if (followListAdapter.f118006j) {
                    str3 = "personal_homepage";
                } else {
                    str3 = "others_homepage";
                }
                vVar.f135402b = str3;
                C59260v a = vVar.mo96847a(followListAdapter.mo63369e());
                a.f135409s = "follow_button";
                if (user.getFollowStatus() == 0) {
                    str4 = "1007";
                } else {
                    str4 = "1036";
                }
                a.f135372a = str4;
                a.f135405e = user.getUid();
                a.f135412v = str;
                a.f135408r = user.getRequestId();
                C59260v a2 = a.mo96846a(user);
                if (user.getFollowStatus() == 0) {
                    str5 = followListAdapter.f118003g;
                } else {
                    str5 = "";
                }
                a2.f135371Z = str5;
                a2.f135376aa = user.isSecret() ? 1 : 0;
                int followStatus = user.getFollowStatus();
                int i4 = 4;
                int i5 = 0;
                if (followStatus == 0) {
                    i = -1;
                } else if (followStatus != 4) {
                    i = 1;
                } else {
                    i = 0;
                }
                a2.f135377ab = i;
                a2.mo96792f();
                if (this.f118030b.getFollowStatus() == 0) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                if (C46792ci.m90137a()) {
                    if (i2 != 1) {
                        i4 = 0;
                    } else if (!this.f118030b.isPrivateAccount() && !this.f118030b.isSecret()) {
                        i4 = this.f118030b.getFollowerStatus() == 1 ? 2 : 1;
                    }
                    I18nFollowUserBtn i18nFollowUserBtn = this.f118029a.f118007g;
                    if (this.f118030b.getFollowerStatus() == 1) {
                        i3 = 1;
                    } else {
                        i3 = 0;
                    }
                    i18nFollowUserBtn.mo73175a(i4, i3);
                }
                UserViewModel n = this.f118029a.mo70807n();
                C63847n.C63848a b = new C63847n.C63848a().mo103320a(this.f118030b.getUid()).mo103325b(this.f118030b.getSecUid());
                if (!this.f118030b.isPrivateAccount() && !this.f118030b.isSecret()) {
                    z = false;
                }
                C63847n.C63848a c = b.mo103322a(z).mo103318a(i2).mo103327c(this.f118029a.f118011m.mo63369e());
                FollowListAdapter followListAdapter2 = this.f118029a.f118011m;
                if (!followListAdapter2.f118006j && TextUtils.equals(followListAdapter2.f118005i, "follower_relation")) {
                    i5 = 11;
                } else if (!followListAdapter2.f118006j && TextUtils.equals(followListAdapter2.f118005i, "following_relation")) {
                    i5 = 10;
                } else if (followListAdapter2.f118006j && TextUtils.equals(followListAdapter2.f118005i, "follower_relation")) {
                    i5 = 9;
                }
                n.mo123556a(c.mo103324b(i5).mo103328d(this.f118030b.getFollowerStatus()).mo103323a());
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public FollowItemViewHolder(com.p2082ss.android.ugc.aweme.following.p3003ui.adapter.FollowListAdapter r7, android.view.ViewGroup r8) {
            /*
            // Method dump skipped, instructions count: 253
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.following.p3003ui.adapter.FollowListAdapter.FollowItemViewHolder.<init>(com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter, android.view.ViewGroup):void");
        }

        /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter$FollowItemViewHolder$h */
        static final class C51160h extends AbstractC89220m implements AbstractC89183m<FollowItemViewHolder, UserState, C89391z> {

            /* renamed from: a */
            final /* synthetic */ FollowItemViewHolder f118039a;

            static {
                Covode.recordClassIndex(60363);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C51160h(FollowItemViewHolder followItemViewHolder) {
                super(2);
                this.f118039a = followItemViewHolder;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89183m
            public final /* synthetic */ C89391z invoke(FollowItemViewHolder followItemViewHolder, UserState userState) {
                int i;
                boolean z;
                FollowItemViewHolder followItemViewHolder2 = followItemViewHolder;
                UserState userState2 = userState;
                C89219l.m154721d(followItemViewHolder2, "");
                C89219l.m154721d(userState2, "");
                if (userState2.getUser().getFollowStatus() == 0 && userState2.getUser().getLivePushNotificationStatus() != 2) {
                    userState2.getUser().setLivePushNotificationStatus(2);
                    C62683w wVar = new C62683w(new C62683w.C62684a(), (byte) 0);
                    C62561q qVar = C62686x.f142117a;
                    String secUid = userState2.getUser().getSecUid();
                    C89219l.m154716b(secUid, "");
                    qVar.mo33457a(secUid, wVar);
                }
                AbstractC20362a<FollowStatus> followStatus = userState2.getFollowStatus();
                if (followStatus instanceof C20372aj) {
                    Map<String, Boolean> map = this.f118039a.f118011m.f118000d;
                    String uid = userState2.getUser().getUid();
                    C89219l.m154716b(uid, "");
                    FollowStatus a = userState2.getFollowStatus().mo33695a();
                    if (a != null) {
                        i = a.followStatus;
                    } else {
                        i = 0;
                    }
                    if (i == 1 || i == 2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    map.put(uid, Boolean.valueOf(z));
                    followItemViewHolder2.mo86603a(userState2.getUser(), true);
                    IMService.createIIMServicebyMonsterPlugin(false).updateIMUser(IMUser.fromUser(userState2.getUser()));
                    followItemViewHolder2.mo70807n();
                    String e = this.f118039a.f118011m.mo63369e();
                    String uid2 = userState2.getUser().getUid();
                    C89219l.m154716b(uid2, "");
                    UserViewModel.m138853a(e, uid2, userState2.getUser().getFollowStatus());
                } else if (followStatus instanceof C20466f) {
                    AbstractC20362a<FollowStatus> followStatus2 = userState2.getFollowStatus();
                    Objects.requireNonNull(followStatus2, "null cannot be cast to non-null type com.bytedance.jedi.arch.Fail<com.ss.android.ugc.aweme.profile.model.FollowStatus>");
                    Throwable th = ((C20466f) followStatus2).f48408a;
                    Activity d = C34729o.m70962d(followItemViewHolder2.itemView);
                    C89219l.m154716b(d, "");
                    C39143l.m79438a(d, th);
                    followItemViewHolder2.mo86603a(userState2.getUser(), false);
                    followItemViewHolder2.mo70807n().mo123555a();
                } else if (followStatus instanceof C20379aq) {
                    followItemViewHolder2.mo86603a(userState2.getUser(), false);
                }
                if (userState2.getFollowerIsRemoved()) {
                    FollowerRelationViewModel followerRelationViewModel = (FollowerRelationViewModel) followItemViewHolder2.f118010l.getValue();
                    String uid3 = userState2.getUser().getUid();
                    C89219l.m154716b(uid3, "");
                    C89219l.m154721d(uid3, "");
                    followerRelationViewModel.mo33687b_(new FollowerRelationViewModel.C51373m(followerRelationViewModel, uid3));
                    IAccountUserService g = C31575b.m65865g();
                    C89219l.m154716b(g, "");
                    if (C63973ae.m115689a(g.getCurUser())) {
                        FollowRelationTabViewModel m = followItemViewHolder2.mo63351m();
                        IAccountUserService g2 = C31575b.m65865g();
                        C89219l.m154716b(g2, "");
                        User curUser = g2.getCurUser();
                        C89219l.m154716b(curUser, "");
                        m.mo86729a(curUser.getFansCount());
                    } else {
                        FollowRelationTabViewModel m2 = followItemViewHolder2.mo63351m();
                        IAccountUserService g3 = C31575b.m65865g();
                        C89219l.m154716b(g3, "");
                        User curUser2 = g3.getCurUser();
                        C89219l.m154716b(curUser2, "");
                        m2.mo86729a(curUser2.getFollowerCount());
                    }
                }
                return C89391z.f203057a;
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:31:0x015d  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0179  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x017d  */
        /* JADX WARNING: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo86603a(com.p2082ss.android.ugc.aweme.profile.model.User r11, boolean r12) {
            /*
            // Method dump skipped, instructions count: 511
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.following.p3003ui.adapter.FollowListAdapter.FollowItemViewHolder.mo86603a(com.ss.android.ugc.aweme.profile.model.User, boolean):void");
        }

        /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter$FollowItemViewHolder$i */
        static final class C51161i extends AbstractC89220m implements AbstractC89187q<FollowItemViewHolder, C62562r, Integer, C89391z> {

            /* renamed from: a */
            public static final C51161i f118040a = new C51161i();

            static {
                Covode.recordClassIndex(60364);
            }

            C51161i() {
                super(3);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89187q
            public final /* synthetic */ C89391z invoke(FollowItemViewHolder followItemViewHolder, C62562r rVar, Integer num) {
                FollowItemViewHolder followItemViewHolder2 = followItemViewHolder;
                final C62562r rVar2 = rVar;
                final int intValue = num.intValue();
                C89219l.m154721d(followItemViewHolder2, "");
                followItemViewHolder2.withState(followItemViewHolder2.mo70807n(), new AbstractC89172b<UserState, C89391z>() {
                    /* class com.p2082ss.android.ugc.aweme.following.p3003ui.adapter.FollowListAdapter.FollowItemViewHolder.C51161i.C511621 */

                    static {
                        Covode.recordClassIndex(60365);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C89391z invoke(UserState userState) {
                        UserState userState2 = userState;
                        C89219l.m154721d(userState2, "");
                        if (rVar2 != null) {
                            User clone = userState2.getUser().clone();
                            C89219l.m154716b(clone, "");
                            clone.setLivePushNotificationStatus(intValue);
                            if (clone.getFollowStatus() == 0) {
                                clone.setLivePushNotificationStatus(2);
                            }
                            C89219l.m154716b(clone, "");
                            AbstractC20129c<String, User> a = UserService.m138861d().mo123560a();
                            String uid = clone.getUid();
                            C89219l.m154716b(uid, "");
                            a.mo33457a(uid, clone);
                        }
                        return C89391z.f203057a;
                    }
                });
                return C89391z.f203057a;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter$b */
    public static final class C51167b extends AbstractC39063h.C39069c {

        /* renamed from: c */
        final /* synthetic */ FollowListAdapter f118046c;

        /* renamed from: d */
        final /* synthetic */ ViewGroup f118047d;

        static {
            Covode.recordClassIndex(60370);
        }

        @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h.C39069c
        /* renamed from: a */
        public final void mo67826a() {
            super.mo67826a();
            AbstractC39063h.C39068b bVar = this.f118046c.f92249u;
            C89219l.m154716b(bVar, "");
            if (bVar.f92255b == 1) {
                View view = this.itemView;
                C89219l.m154716b(view, "");
                view.getLayoutParams().height = 0;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51167b(FollowListAdapter followListAdapter, ViewGroup viewGroup, ViewGroup viewGroup2) {
            super(viewGroup2);
            this.f118046c = followListAdapter;
            this.f118047d = viewGroup;
        }
    }

    /* renamed from: e */
    public final String mo63369e() {
        if (TextUtils.equals(this.f118005i, "following_relation")) {
            if (this.f118006j) {
                return "following";
            }
            return "other_following";
        } else if (!TextUtils.equals(this.f118005i, "follower_relation")) {
            return "";
        } else {
            if (this.f118006j) {
                return "fans";
            }
            return "other_fans";
        }
    }

    /* renamed from: d */
    private final AbstractC89172b<Integer, Boolean> m95571d(int i) {
        return new C51183r(this, i);
    }

    /* renamed from: a */
    public final void mo86602a(String str) {
        C89219l.m154721d(str, "");
        this.f118003g = str;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    /* renamed from: a_ */
    public final RecyclerView.ViewHolder mo62748a_(ViewGroup viewGroup) {
        return new C51167b(this, viewGroup, viewGroup);
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter$c */
    static final class C51168c extends AbstractC89220m implements AbstractC89172b<ViewGroup, JediViewHolder<? extends AbstractC20467g, ?>> {

        /* renamed from: a */
        final /* synthetic */ FollowListAdapter f118048a;

        static {
            Covode.recordClassIndex(60371);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51168c(FollowListAdapter followListAdapter) {
            super(1);
            this.f118048a = followListAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ JediViewHolder<? extends AbstractC20467g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            return new FollowItemViewHolder(this.f118048a, viewGroup2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter$j */
    static final class C51175j extends AbstractC89220m implements AbstractC89172b<ViewGroup, JediViewHolder<? extends AbstractC20467g, ?>> {

        /* renamed from: a */
        final /* synthetic */ FollowListAdapter f118055a;

        static {
            Covode.recordClassIndex(60378);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51175j(FollowListAdapter followListAdapter) {
            super(1);
            this.f118055a = followListAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ JediViewHolder<? extends AbstractC20467g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            return new FollowItemViewHolder(this.f118055a, viewGroup2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter$k */
    static final class C51176k extends AbstractC89220m implements AbstractC89172b<ViewGroup, JediViewHolder<? extends AbstractC20467g, ?>> {

        /* renamed from: a */
        public static final C51176k f118056a = new C51176k();

        static {
            Covode.recordClassIndex(60379);
        }

        C51176k() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ JediViewHolder<? extends AbstractC20467g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            return new RelationStatusViewHolder(viewGroup2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter$l */
    static final class C51177l extends AbstractC89220m implements AbstractC89172b<ViewGroup, JediViewHolder<? extends AbstractC20467g, ?>> {

        /* renamed from: a */
        public static final C51177l f118057a = new C51177l();

        static {
            Covode.recordClassIndex(60380);
        }

        C51177l() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ JediViewHolder<? extends AbstractC20467g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            return new RelationStatusViewHolder(viewGroup2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter$m */
    static final class C51178m extends AbstractC89220m implements AbstractC89172b<ViewGroup, JediViewHolder<? extends AbstractC20467g, ?>> {

        /* renamed from: a */
        public static final C51178m f118058a = new C51178m();

        static {
            Covode.recordClassIndex(60381);
        }

        C51178m() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ JediViewHolder<? extends AbstractC20467g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            return new RelationStatusViewHolder(viewGroup2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter$n */
    static final class C51179n extends AbstractC89220m implements AbstractC89172b<ViewGroup, JediViewHolder<? extends AbstractC20467g, ?>> {

        /* renamed from: a */
        public static final C51179n f118059a = new C51179n();

        static {
            Covode.recordClassIndex(60382);
        }

        C51179n() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ JediViewHolder<? extends AbstractC20467g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            return new RelationStatusViewHolder(viewGroup2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter$o */
    static final class C51180o extends AbstractC89220m implements AbstractC89172b<ViewGroup, JediViewHolder<? extends AbstractC20467g, ?>> {

        /* renamed from: a */
        public static final C51180o f118060a = new C51180o();

        static {
            Covode.recordClassIndex(60383);
        }

        C51180o() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ JediViewHolder<? extends AbstractC20467g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            return new RelationStatusViewHolder(viewGroup2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter$p */
    static final class C51181p extends AbstractC89220m implements AbstractC89172b<ViewGroup, JediViewHolder<? extends AbstractC20467g, ?>> {

        /* renamed from: a */
        public static final C51181p f118061a = new C51181p();

        static {
            Covode.recordClassIndex(60384);
        }

        C51181p() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ JediViewHolder<? extends AbstractC20467g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            return new RelationStatusViewHolder(viewGroup2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter$d */
    static final class C51169d extends AbstractC89220m implements AbstractC89172b<ViewGroup, JediViewHolder<? extends AbstractC20467g, ?>> {

        /* renamed from: a */
        public static final C51169d f118049a = new C51169d();

        static {
            Covode.recordClassIndex(60372);
        }

        C51169d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ JediViewHolder<? extends AbstractC20467g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            C51648a aVar = C51648a.f118980a;
            Context context = viewGroup2.getContext();
            C89219l.m154716b(context, "");
            return new RecommendContactViewHolder(aVar.mo87298a(context));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter$e */
    static final class C51170e extends AbstractC89220m implements AbstractC89172b<ViewGroup, JediViewHolder<? extends AbstractC20467g, ?>> {

        /* renamed from: a */
        public static final C51170e f118050a = new C51170e();

        static {
            Covode.recordClassIndex(60373);
        }

        C51170e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ JediViewHolder<? extends AbstractC20467g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            RecommendUserService b = RecommendUserServiceImpl.m118456b();
            Context context = viewGroup2.getContext();
            C89219l.m154716b(context, "");
            return new NewRecommendUserViewHolder(b.mo105667a(context, 3));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter$f */
    static final class C51171f extends AbstractC89220m implements AbstractC89172b<ViewGroup, JediViewHolder<? extends AbstractC20467g, ?>> {

        /* renamed from: a */
        public static final C51171f f118051a = new C51171f();

        static {
            Covode.recordClassIndex(60374);
        }

        C51171f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ JediViewHolder<? extends AbstractC20467g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            RecommendUserService b = RecommendUserServiceImpl.m118456b();
            Context context = viewGroup2.getContext();
            C89219l.m154716b(context, "");
            return new NewRecommendUserViewHolder(b.mo105667a(context, 3));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter$h */
    static final class C51173h extends AbstractC89220m implements AbstractC89172b<ViewGroup, JediViewHolder<? extends AbstractC20467g, ?>> {

        /* renamed from: a */
        public static final C51173h f118053a = new C51173h();

        static {
            Covode.recordClassIndex(60376);
        }

        C51173h() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ JediViewHolder<? extends AbstractC20467g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            Context context = viewGroup2.getContext();
            C89219l.m154716b(context, "");
            return new MutualFriendItemViewHolder(new C51695at(context, (byte) 0));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter$i */
    static final class C51174i extends AbstractC89220m implements AbstractC89172b<ViewGroup, JediViewHolder<? extends AbstractC20467g, ?>> {

        /* renamed from: a */
        public static final C51174i f118054a = new C51174i();

        static {
            Covode.recordClassIndex(60377);
        }

        C51174i() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ JediViewHolder<? extends AbstractC20467g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            View a = C1764a.m5927a(LayoutInflater.from(viewGroup2.getContext()), R.layout.aok, viewGroup2, false);
            C89219l.m154716b(a, "");
            return new MutualListTitleViewHolder(a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter$q */
    static final class C51182q extends AbstractC89220m implements AbstractC89172b<ViewGroup, JediViewHolder<? extends AbstractC20467g, ?>> {

        /* renamed from: a */
        public static final C51182q f118062a = new C51182q();

        static {
            Covode.recordClassIndex(60385);
        }

        C51182q() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ JediViewHolder<? extends AbstractC20467g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            View a = C1764a.m5927a(LayoutInflater.from(viewGroup2.getContext()), R.layout.ans, viewGroup2, false);
            C89219l.m154716b(a, "");
            return new RecommendRelationTitleViewHolder(a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.arch.AbstractC34497h, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: c */
    public final int mo60936c(int i) {
        int c = super.mo60936c(i);
        if (c != 0) {
            return c;
        }
        return ((AbstractC34491d) this).f81477a.mo33895b(i - mo60937d());
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter$g */
    static final class C51172g extends AbstractC89220m implements AbstractC89172b<ViewGroup, JediViewHolder<? extends AbstractC20467g, ?>> {

        /* renamed from: a */
        public static final C51172g f118052a = new C51172g();

        static {
            Covode.recordClassIndex(60375);
        }

        C51172g() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ JediViewHolder<? extends AbstractC20467g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            View a = C1764a.m5927a(LayoutInflater.from(viewGroup2.getContext()), R.layout.mh, viewGroup2, false);
            C89219l.m154716b(a, "");
            Context context = viewGroup2.getContext();
            C89219l.m154716b(context, "");
            return new RecommendSuggestTitleViewHolder(a, context);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter$r */
    public static final class C51183r extends AbstractC89220m implements AbstractC89172b<Integer, Boolean> {

        /* renamed from: a */
        final /* synthetic */ FollowListAdapter f118063a;

        /* renamed from: b */
        final /* synthetic */ int f118064b;

        static {
            Covode.recordClassIndex(60386);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51183r(FollowListAdapter followListAdapter, int i) {
            super(1);
            this.f118063a = followListAdapter;
            this.f118064b = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(Integer num) {
            int i;
            int intValue = num.intValue();
            int i2 = this.f118064b;
            Object a = this.f118063a.mo33762a(intValue);
            boolean z = false;
            if (a instanceof C51107f) {
                i = ((C51107f) a).f117931a;
            } else if (a instanceof C51108g) {
                i = ((C51108g) a).f117933a;
            } else if (a instanceof C51106e) {
                i = ((C51106e) a).f117928a;
            } else if (a instanceof RecommendContact) {
                i = 3;
            } else {
                i = 0;
            }
            if (i2 == i) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.arch.AbstractC34497h
    /* renamed from: a */
    public final void mo60935a(AbstractC20638g<JediViewHolder<? extends AbstractC20467g, ?>> gVar) {
        C89219l.m154721d(gVar, "");
        AbstractC20638g unused = gVar.mo33893a(m95571d(0), null, new C51168c(this));
        AbstractC20638g unused2 = gVar.mo33893a(m95571d(1), null, new C51175j(this));
        AbstractC20638g unused3 = gVar.mo33893a(m95571d(7), null, C51176k.f118056a);
        AbstractC20638g unused4 = gVar.mo33893a(m95571d(8), null, C51177l.f118057a);
        AbstractC20638g unused5 = gVar.mo33893a(m95571d(9), null, C51178m.f118058a);
        AbstractC20638g unused6 = gVar.mo33893a(m95571d(10), null, C51179n.f118059a);
        AbstractC20638g unused7 = gVar.mo33893a(m95571d(11), null, C51180o.f118060a);
        AbstractC20638g unused8 = gVar.mo33893a(m95571d(12), null, C51181p.f118061a);
        AbstractC20638g unused9 = gVar.mo33893a(m95571d(4), null, C51182q.f118062a);
        AbstractC20638g unused10 = gVar.mo33893a(m95571d(3), null, C51169d.f118049a);
        AbstractC20638g unused11 = gVar.mo33893a(m95571d(2), null, C51170e.f118050a);
        AbstractC20638g unused12 = gVar.mo33893a(m95571d(13), null, C51171f.f118051a);
        AbstractC20638g unused13 = gVar.mo33893a(m95571d(14), null, C51172g.f118052a);
        AbstractC20638g unused14 = gVar.mo33893a(m95571d(15), null, C51173h.f118053a);
        AbstractC20638g unused15 = gVar.mo33893a(m95571d(16), null, C51174i.f118054a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FollowListAdapter(AbstractC1204m mVar, String str, boolean z) {
        super(mVar, new C51105d(), 4);
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(str, "");
        this.f118004h = mVar;
        this.f118005i = str;
        this.f118006j = z;
    }
}
