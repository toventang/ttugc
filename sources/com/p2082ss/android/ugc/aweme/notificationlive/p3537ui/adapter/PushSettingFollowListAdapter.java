package com.p2082ss.android.ugc.aweme.notificationlive.p3537ui.adapter;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.common.views.CommonItemView;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.jedi.arch.AbstractC20362a;
import com.bytedance.jedi.arch.AbstractC20467g;
import com.bytedance.jedi.arch.AbstractC20550y;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.C20372aj;
import com.bytedance.jedi.arch.C20379aq;
import com.bytedance.jedi.arch.C20466f;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.ext.adapter.C20671j;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxy;
import com.bytedance.jedi.ext.adapter.p1467b.AbstractC20638g;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.p2140di.push.C29902a;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.app.api.p2319b.C33615a;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.base.arch.AbstractC34489c;
import com.p2082ss.android.ugc.aweme.base.arch.AbstractC34491d;
import com.p2082ss.android.ugc.aweme.base.arch.JediBaseViewHolder;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageWithVerify;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.common.AbstractC39085b;
import com.p2082ss.android.ugc.aweme.common.C39088c;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.following.p3002a.C51105d;
import com.p2082ss.android.ugc.aweme.following.p3002a.C51106e;
import com.p2082ss.android.ugc.aweme.following.p3002a.C51107f;
import com.p2082ss.android.ugc.aweme.following.p3002a.C51108g;
import com.p2082ss.android.ugc.aweme.following.p3003ui.viewholder.RelationStatusViewHolder;
import com.p2082ss.android.ugc.aweme.following.repository.C51133f;
import com.p2082ss.android.ugc.aweme.friends.model.RecommendContact;
import com.p2082ss.android.ugc.aweme.notificationlive.C62513a;
import com.p2082ss.android.ugc.aweme.notificationlive.C62562r;
import com.p2082ss.android.ugc.aweme.notificationlive.C62577t;
import com.p2082ss.android.ugc.aweme.notificationlive.NotificationLiveViewModel;
import com.p2082ss.android.ugc.aweme.notificationlive.ResponseState;
import com.p2082ss.android.ugc.aweme.notificationlive.p3537ui.NotificationChoiceState;
import com.p2082ss.android.ugc.aweme.notificationlive.p3537ui.PushSettingNotificationChoiceViewModel;
import com.p2082ss.android.ugc.aweme.profile.C63419ae;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3728a.C68348f;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.AbstractC68350b;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.AbstractC68351c;
import com.p2082ss.android.ugc.aweme.setting.services.C68432f;
import com.p2082ss.android.ugc.aweme.setting.services.C68434h;
import com.p2082ss.android.ugc.aweme.user.repository.UserState;
import com.p2082ss.android.ugc.aweme.user.repository.UserViewModel;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.aweme.utils.C80581io;
import com.p2082ss.android.ugc.aweme.utils.UserVerify;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4591l.C88960c;
import p4600h.AbstractC89244h;
import p4600h.C89391z;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.ss.android.ugc.aweme.notificationlive.ui.adapter.PushSettingFollowListAdapter */
public final class PushSettingFollowListAdapter extends AbstractC34489c<Object> {

    /* renamed from: h */
    public static final C62642a f142020h = new C62642a((byte) 0);

    /* renamed from: d */
    public String f142021d = "";

    /* renamed from: e */
    public boolean f142022e = true;

    /* renamed from: f */
    public final AbstractC1204m f142023f;

    /* renamed from: g */
    public final String f142024g;

    static {
        Covode.recordClassIndex(73429);
    }

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.ui.adapter.PushSettingFollowListAdapter$a */
    public static final class C62642a {
        static {
            Covode.recordClassIndex(73445);
        }

        private C62642a() {
        }

        public /* synthetic */ C62642a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.ui.adapter.PushSettingFollowListAdapter$FollowItemViewSwitchHolder */
    public final class FollowItemViewSwitchHolder extends JediBaseViewHolder<FollowItemViewSwitchHolder, C51107f> implements AbstractC68350b, AbstractC68351c, AbstractC68351c {

        /* renamed from: g */
        public CommonItemView f142044g;

        /* renamed from: j */
        C88960c<CommonItemView> f142045j;

        /* renamed from: k */
        final /* synthetic */ PushSettingFollowListAdapter f142046k;

        /* renamed from: l */
        private final AbstractC89244h f142047l;

        static {
            Covode.recordClassIndex(73439);
        }

        /* renamed from: m */
        private final PushSettingNotificationChoiceViewModel m113053m() {
            return (PushSettingNotificationChoiceViewModel) this.f142047l.getValue();
        }

        @Override // com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.AbstractC68351c
        /* renamed from: a */
        public final void mo68832a(Exception exc) {
        }

        @Override // com.p2082ss.android.ugc.aweme.base.arch.JediBaseViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.AbstractC1202k
        public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
            super.onStateChanged(mVar, aVar);
        }

        @Override // com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.AbstractC68350b
        public final void aD_() {
            C62577t.m113004a(this.f142044g.mo27138d());
        }

        @Override // com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.AbstractC68350b
        public final void cm_() {
            View view = this.itemView;
            C89219l.m154716b(view, "");
            new C23144b(view).mo37640e(R.string.dck).mo37637b();
        }

        @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
        public final void cc_() {
            super.cc_();
            this.f142044g.setOnClickListener(new View$OnClickListenerC62640c(this));
            C39088c<AbstractC39085b<C68348f>, AbstractC68351c> providePushSettingFetchPresenter = C68432f.f153189a.providePushSettingFetchPresenter();
            providePushSettingFetchPresenter.mo67839a_(this);
            providePushSettingFetchPresenter.mo57616a(new Object[0]);
            AbstractC88412b unused = selectSubscribe(m113053m(), C62653d.f142066a, new C20370ah(), new C62641d(this));
        }

        /* renamed from: com.ss.android.ugc.aweme.notificationlive.ui.adapter.PushSettingFollowListAdapter$FollowItemViewSwitchHolder$a */
        public static final class C62638a extends AbstractC89220m implements AbstractC89171a<PushSettingNotificationChoiceViewModel> {

            /* renamed from: a */
            final /* synthetic */ JediViewHolder f142048a;

            /* renamed from: b */
            final /* synthetic */ AbstractC89277c f142049b;

            /* renamed from: c */
            final /* synthetic */ AbstractC89277c f142050c;

            static {
                Covode.recordClassIndex(73440);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C62638a(JediViewHolder jediViewHolder, AbstractC89277c cVar, AbstractC89277c cVar2) {
                super(0);
                this.f142048a = jediViewHolder;
                this.f142049b = cVar;
                this.f142050c = cVar2;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.notificationlive.ui.PushSettingNotificationChoiceViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARN: Type inference failed for: r0v16, types: [com.ss.android.ugc.aweme.notificationlive.ui.PushSettingNotificationChoiceViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARN: Type inference failed for: r0v21, types: [com.ss.android.ugc.aweme.notificationlive.ui.PushSettingNotificationChoiceViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARNING: Unknown variable types count: 3 */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final com.p2082ss.android.ugc.aweme.notificationlive.p3537ui.PushSettingNotificationChoiceViewModel invoke() {
                /*
                // Method dump skipped, instructions count: 117
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.notificationlive.p3537ui.adapter.PushSettingFollowListAdapter.FollowItemViewSwitchHolder.C62638a.invoke():com.bytedance.jedi.arch.JediViewModel");
            }

            /* renamed from: com_ss_android_ugc_aweme_notificationlive_ui_adapter_PushSettingFollowListAdapter$FollowItemViewSwitchHolder$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get */
            public static AbstractC1174ac m113057x8b2cc3ea(C1175ad adVar, String str, Class cls) {
                if (cls.equals(ScopeViewModel.class)) {
                    return adVar.mo3984a(str, cls);
                }
                AbstractC1174ac a = adVar.mo3984a(str, cls);
                C1171ab.m3870a(a, adVar);
                return a;
            }
        }

        /* renamed from: a */
        public final void mo100577a(boolean z) {
            try {
                m113053m().mo100556b(z);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.AbstractC68351c
        /* renamed from: a */
        public final void mo68831a(C68348f fVar) {
            boolean z;
            boolean z2 = true;
            mo100577a(true);
            if (fVar != null) {
                if (fVar.f152988j != 1 || !C62577t.m113008c()) {
                    z = false;
                } else {
                    z = true;
                }
                mo100577a(z);
                if (fVar.f152988j != 1) {
                    z2 = false;
                }
                C62577t.m113004a(z2);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.notificationlive.ui.adapter.PushSettingFollowListAdapter$FollowItemViewSwitchHolder$b */
        static final class C62639b<T> implements AbstractC88433f {

            /* renamed from: a */
            final /* synthetic */ FollowItemViewSwitchHolder f142051a;

            static {
                Covode.recordClassIndex(73441);
            }

            C62639b(FollowItemViewSwitchHolder followItemViewSwitchHolder) {
                this.f142051a = followItemViewSwitchHolder;
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(Object obj) {
                String str;
                CommonItemView commonItemView = (CommonItemView) obj;
                C39088c<AbstractC39085b<BaseResponse>, AbstractC68350b> providePushSettingChangePresenter = C68432f.f153189a.providePushSettingChangePresenter();
                providePushSettingChangePresenter.mo67839a_(this.f142051a);
                C89219l.m154716b(commonItemView, "");
                providePushSettingChangePresenter.mo57616a("live_push", Integer.valueOf(commonItemView.mo27138d() ? 1 : 0));
                C33744d a = new C33744d().mo59983a("label", "live_push");
                if (commonItemView.mo27138d()) {
                    str = "on";
                } else {
                    str = "off";
                }
                C39162r.m79460a("notification_switch", a.mo59983a("to_status", str).f79943a);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.notificationlive.ui.adapter.PushSettingFollowListAdapter$FollowItemViewSwitchHolder$c */
        static final class View$OnClickListenerC62640c implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ FollowItemViewSwitchHolder f142052a;

            static {
                Covode.recordClassIndex(73442);
            }

            View$OnClickListenerC62640c(FollowItemViewSwitchHolder followItemViewSwitchHolder) {
                this.f142052a = followItemViewSwitchHolder;
            }

            public final void onClick(View view) {
                AbstractC88979t<CommonItemView> d;
                AbstractC88979t<CommonItemView> a;
                ClickAgent.onClick(view);
                if (C62577t.m113008c()) {
                    this.f142052a.f142044g.setChecked(!this.f142052a.f142044g.mo27138d());
                    FollowItemViewSwitchHolder followItemViewSwitchHolder = this.f142052a;
                    followItemViewSwitchHolder.mo100577a(followItemViewSwitchHolder.f142044g.mo27138d());
                    FollowItemViewSwitchHolder followItemViewSwitchHolder2 = this.f142052a;
                    if (followItemViewSwitchHolder2.f142045j == null) {
                        followItemViewSwitchHolder2.f142045j = new C88960c<>();
                        C88960c<CommonItemView> cVar = followItemViewSwitchHolder2.f142045j;
                        if (!(cVar == null || (d = cVar.mo143291d(400, TimeUnit.MILLISECONDS)) == null || (a = d.mo143261a(C88391a.m153580a(C88392a.f200660a))) == null)) {
                            a.mo143289d(new C62639b(followItemViewSwitchHolder2));
                        }
                    }
                    C88960c<CommonItemView> cVar2 = followItemViewSwitchHolder2.f142045j;
                    if (cVar2 != null) {
                        cVar2.onNext(this.f142052a.f142044g);
                    }
                    C68434h.f153192a.mo108582a("live_push", this.f142052a.f142044g.mo27138d() ? 1 : 0);
                    return;
                }
                Context context = this.f142052a.f142044g.getContext();
                C89219l.m154716b(context, "");
                C89219l.m154721d(context, "");
                if (Build.VERSION.SDK_INT >= 26) {
                    Intent intent = new Intent("android.settings.CHANNEL_NOTIFICATION_SETTINGS");
                    intent.setFlags(268435456);
                    intent.putExtra("android.provider.extra.APP_PACKAGE", C17867d.m33078a().getPackageName());
                    intent.putExtra("android.provider.extra.CHANNEL_ID", C29902a.m60273a().getRealChannelId("live_push"));
                    if (C62577t.f141904a == null) {
                        C62577t.f141904a = C17867d.m33078a().getPackageManager();
                    }
                    PackageManager packageManager = C62577t.f141904a;
                    if (packageManager != null && packageManager.resolveActivity(intent, 65536) != null) {
                        C84349a.m145093a(intent, context);
                        context.startActivity(intent);
                    }
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.notificationlive.ui.adapter.PushSettingFollowListAdapter$FollowItemViewSwitchHolder$d */
        static final class C62641d extends AbstractC89220m implements AbstractC89183m<FollowItemViewSwitchHolder, Boolean, C89391z> {

            /* renamed from: a */
            final /* synthetic */ FollowItemViewSwitchHolder f142053a;

            static {
                Covode.recordClassIndex(73443);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C62641d(FollowItemViewSwitchHolder followItemViewSwitchHolder) {
                super(2);
                this.f142053a = followItemViewSwitchHolder;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89183m
            public final /* synthetic */ C89391z invoke(FollowItemViewSwitchHolder followItemViewSwitchHolder, Boolean bool) {
                FollowItemViewSwitchHolder followItemViewSwitchHolder2 = followItemViewSwitchHolder;
                boolean booleanValue = bool.booleanValue();
                C89219l.m154721d(followItemViewSwitchHolder2, "");
                followItemViewSwitchHolder2.f142044g.setChecked(booleanValue);
                this.f142053a.f142046k.f142022e = booleanValue;
                return C89391z.f203057a;
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public FollowItemViewSwitchHolder(com.p2082ss.android.ugc.aweme.notificationlive.p3537ui.adapter.PushSettingFollowListAdapter r5, android.view.ViewGroup r6) {
            /*
                r4 = this;
                java.lang.String r3 = ""
                p4600h.p4611f.p4613b.C89219l.m154721d(r6, r3)
                r4.f142046k = r5
                android.content.Context r0 = r6.getContext()
                android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r0)
                r1 = 2131560286(0x7f0d075e, float:1.874594E38)
                r0 = 0
                android.view.View r0 = com.C1764a.m5927a(r2, r1, r6, r0)
                p4600h.p4611f.p4613b.C89219l.m154716b(r0, r3)
                r4.<init>(r0)
                android.view.View r1 = r4.itemView
                r0 = 2131365201(0x7f0a0d51, float:1.835026E38)
                android.view.View r0 = r1.findViewById(r0)
                p4600h.p4611f.p4613b.C89219l.m154716b(r0, r3)
                com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = (com.bytedance.ies.dmt.p1194ui.common.views.CommonItemView) r0
                r4.f142044g = r0
                java.lang.Class<com.ss.android.ugc.aweme.notificationlive.ui.PushSettingNotificationChoiceViewModel> r0 = com.p2082ss.android.ugc.aweme.notificationlive.p3537ui.PushSettingNotificationChoiceViewModel.class
                h.k.c r1 = p4600h.p4611f.p4613b.C89204ab.m154669a(r0)
                com.ss.android.ugc.aweme.notificationlive.ui.adapter.PushSettingFollowListAdapter$FollowItemViewSwitchHolder$a r0 = new com.ss.android.ugc.aweme.notificationlive.ui.adapter.PushSettingFollowListAdapter$FollowItemViewSwitchHolder$a
                r0.<init>(r4, r1, r1)
                h.h r0 = p4600h.C89250i.m154773a(r0)
                r4.f142047l = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.notificationlive.p3537ui.adapter.PushSettingFollowListAdapter.FollowItemViewSwitchHolder.<init>(com.ss.android.ugc.aweme.notificationlive.ui.adapter.PushSettingFollowListAdapter, android.view.ViewGroup):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.ui.adapter.PushSettingFollowListAdapter$FollowItemViewHolder */
    public final class FollowItemViewHolder extends JediBaseViewHolder<FollowItemViewHolder, C51108g> implements AbstractC33974au {

        /* renamed from: g */
        public boolean f142025g;

        /* renamed from: j */
        final /* synthetic */ PushSettingFollowListAdapter f142026j;

        /* renamed from: k */
        private final AvatarImageWithVerify f142027k;

        /* renamed from: l */
        private final TextView f142028l;

        /* renamed from: m */
        private final ImageView f142029m;

        /* renamed from: n */
        private final ImageView f142030n;

        /* renamed from: o */
        private final AbstractC89244h f142031o;

        static {
            Covode.recordClassIndex(73430);
        }

        /* renamed from: m */
        public final PushSettingNotificationChoiceViewModel mo63351m() {
            return (PushSettingNotificationChoiceViewModel) this.f142031o.getValue();
        }

        @Override // com.p2082ss.android.ugc.aweme.base.arch.JediBaseViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.AbstractC1202k
        public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
            super.onStateChanged(mVar, aVar);
        }

        /* renamed from: com.ss.android.ugc.aweme.notificationlive.ui.adapter.PushSettingFollowListAdapter$FollowItemViewHolder$a */
        public static final class C62630a extends AbstractC89220m implements AbstractC89171a<PushSettingNotificationChoiceViewModel> {

            /* renamed from: a */
            final /* synthetic */ JediViewHolder f142032a;

            /* renamed from: b */
            final /* synthetic */ AbstractC89277c f142033b;

            /* renamed from: c */
            final /* synthetic */ AbstractC89277c f142034c;

            static {
                Covode.recordClassIndex(73431);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C62630a(JediViewHolder jediViewHolder, AbstractC89277c cVar, AbstractC89277c cVar2) {
                super(0);
                this.f142032a = jediViewHolder;
                this.f142033b = cVar;
                this.f142034c = cVar2;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.notificationlive.ui.PushSettingNotificationChoiceViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARN: Type inference failed for: r0v16, types: [com.ss.android.ugc.aweme.notificationlive.ui.PushSettingNotificationChoiceViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARN: Type inference failed for: r0v21, types: [com.ss.android.ugc.aweme.notificationlive.ui.PushSettingNotificationChoiceViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARNING: Unknown variable types count: 3 */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final com.p2082ss.android.ugc.aweme.notificationlive.p3537ui.PushSettingNotificationChoiceViewModel invoke() {
                /*
                // Method dump skipped, instructions count: 117
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.notificationlive.p3537ui.adapter.PushSettingFollowListAdapter.FollowItemViewHolder.C62630a.invoke():com.bytedance.jedi.arch.JediViewModel");
            }

            /* renamed from: com_ss_android_ugc_aweme_notificationlive_ui_adapter_PushSettingFollowListAdapter$FollowItemViewHolder$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get */
            public static AbstractC1174ac m113052x868d556(C1175ad adVar, String str, Class cls) {
                if (cls.equals(ScopeViewModel.class)) {
                    return adVar.mo3984a(str, cls);
                }
                AbstractC1174ac a = adVar.mo3984a(str, cls);
                C1171ab.m3870a(a, adVar);
                return a;
            }
        }

        /* renamed from: n */
        private final NotificationLiveViewModel m113047n() {
            C62633d dVar = C62633d.f142037a;
            JediViewHolderProxy jediViewHolderProxy = this.f48646d;
            if (jediViewHolderProxy != null) {
                JediViewModel jediViewModel = (JediViewModel) C20671j.C20672a.m38922a(mo33721d(), jediViewHolderProxy.mo33900b()).mo33923a(getClass().getName() + '_' + NotificationLiveViewModel.class.getName(), NotificationLiveViewModel.class);
                AbstractC20550y a = jediViewModel.f48234j.mo33696a(NotificationLiveViewModel.class);
                if (a != null) {
                    a.binding(jediViewModel);
                }
                jediViewModel.mo33686a_(dVar);
                return (NotificationLiveViewModel) jediViewModel;
            }
            throw new IllegalStateException("proxy not bound to viewHolder yet");
        }

        @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
        public final void cc_() {
            super.cc_();
            C62637h hVar = new C62637h(this);
            JediViewHolderProxy jediViewHolderProxy = this.f48646d;
            if (jediViewHolderProxy != null) {
                JediViewModel jediViewModel = (JediViewModel) C20671j.C20672a.m38922a(mo33721d(), jediViewHolderProxy.mo33900b()).mo33923a(getClass().getName() + '_' + UserViewModel.class.getName(), UserViewModel.class);
                AbstractC20550y a = jediViewModel.f48234j.mo33696a(UserViewModel.class);
                if (a != null) {
                    a.binding(jediViewModel);
                }
                jediViewModel.mo33686a_(hVar);
                AbstractC88412b unused = subscribe((UserViewModel) jediViewModel, new C20370ah(), C62631b.f142035a);
                AbstractC88412b unused2 = selectSubscribe(mo63351m(), C62650a.f142063a, new C20370ah(), new C62632c(this));
                return;
            }
            throw new IllegalStateException("proxy not bound to viewHolder yet");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.notificationlive.ui.adapter.PushSettingFollowListAdapter$FollowItemViewHolder$d */
        public static final class C62633d extends AbstractC89220m implements AbstractC89172b<ResponseState, ResponseState> {

            /* renamed from: a */
            public static final C62633d f142037a = new C62633d();

            static {
                Covode.recordClassIndex(73434);
            }

            C62633d() {
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

        /* renamed from: com.ss.android.ugc.aweme.notificationlive.ui.adapter.PushSettingFollowListAdapter$FollowItemViewHolder$h */
        static final class C62637h extends AbstractC89220m implements AbstractC89172b<UserState, UserState> {

            /* renamed from: a */
            final /* synthetic */ FollowItemViewHolder f142043a;

            static {
                Covode.recordClassIndex(73438);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C62637h(FollowItemViewHolder followItemViewHolder) {
                super(1);
                this.f142043a = followItemViewHolder;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ UserState invoke(UserState userState) {
                UserState userState2 = userState;
                C89219l.m154721d(userState2, "");
                return UserState.copy$default(userState2, ((C51108g) this.f142043a.aQ_()).f117934b, false, null, null, null, 30, null);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.notificationlive.ui.adapter.PushSettingFollowListAdapter$FollowItemViewHolder$e */
        public static final class View$OnClickListenerC62634e implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ FollowItemViewHolder f142038a;

            /* renamed from: b */
            final /* synthetic */ User f142039b;

            static {
                Covode.recordClassIndex(73435);
            }

            View$OnClickListenerC62634e(FollowItemViewHolder followItemViewHolder, User user) {
                this.f142038a = followItemViewHolder;
                this.f142039b = user;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                this.f142038a.f142025g = false;
                C88960c<C62513a> a = C62577t.m112999a();
                if (a != null) {
                    User user = this.f142039b;
                    C89219l.m154716b(view, "");
                    a.onNext(new C62513a(user, C34729o.m70950a(view.getContext()), "push_setting", this.f142038a.f142026j.f142024g));
                }
            }
        }

        /* renamed from: a */
        public final void mo100572a(int i) {
            if (i == 1) {
                this.f142029m.setImageResource(2131233410);
            } else if (i == 2) {
                this.f142029m.setImageResource(2131233409);
            } else if (i == 3) {
                this.f142029m.setImageResource(2131233411);
            }
        }

        /* renamed from: a */
        public final void mo100574a(boolean z) {
            float f;
            float f2;
            float f3;
            AvatarImageWithVerify avatarImageWithVerify = this.f142027k;
            float f4 = 1.0f;
            if (z) {
                f = 1.0f;
            } else {
                f = 0.34f;
            }
            avatarImageWithVerify.setAlpha(f);
            TextView textView = this.f142028l;
            if (z) {
                f2 = 1.0f;
            } else {
                f2 = 0.34f;
            }
            textView.setAlpha(f2);
            ImageView imageView = this.f142029m;
            if (z) {
                f3 = 1.0f;
            } else {
                f3 = 0.34f;
            }
            imageView.setAlpha(f3);
            ImageView imageView2 = this.f142030n;
            if (!z) {
                f4 = 0.34f;
            }
            imageView2.setAlpha(f4);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.notificationlive.ui.adapter.PushSettingFollowListAdapter$FollowItemViewHolder$g */
        public static final class View$OnClickListenerC62636g implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ FollowItemViewHolder f142041a;

            /* renamed from: b */
            final /* synthetic */ User f142042b;

            static {
                Covode.recordClassIndex(73437);
            }

            View$OnClickListenerC62636g(FollowItemViewHolder followItemViewHolder, User user) {
                this.f142041a = followItemViewHolder;
                this.f142042b = user;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                if (this.f142041a.f142026j.f142022e) {
                    this.f142041a.f142025g = true;
                    C89219l.m154716b(view, "");
                    if (view.getContext() != null) {
                        SmartRouter.buildRoute(view.getContext(), "aweme://user/profile/").withParam("uid", this.f142042b.getUid()).withParam("sec_user_id", this.f142042b.getSecUid()).withParam("enter_from", "push_setting").withParam("profile_enterprise_type", C63419ae.f143971a.mo101949a(this.f142042b)).open();
                    }
                    C39162r.m79460a("enter_personal_detail", new C33744d().mo59983a("enter_from", "click_head").mo59983a("enter_method", "live_push_setting").mo59983a("to_user_id", this.f142042b.getUid()).f79943a);
                    return;
                }
                C89219l.m154716b(view, "");
                C62577t.m113003a(view.getContext(), this.f142042b);
            }
        }

        /* renamed from: a */
        public final void mo100573a(User user) {
            this.f142027k.setUserData(new UserVerify(user.getAvatarThumb(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), Integer.valueOf(user.getVerificationType())));
            this.f142027k.mo61285a();
            View$OnClickListenerC62636g gVar = new View$OnClickListenerC62636g(this, user);
            this.f142027k.setOnClickListener(gVar);
            this.f142028l.setOnClickListener(gVar);
            this.itemView.setOnClickListener(new View$OnClickListenerC62634e(this, user));
            this.f142028l.setText(C80580in.m139684b(user));
            View view = this.itemView;
            C89219l.m154716b(view, "");
            C80581io.m139704a(view.getContext(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), this.f142028l);
            mo100572a(user.getLivePushNotificationStatus());
            mo100574a(this.f142026j.f142022e);
            NotificationLiveViewModel n = m113047n();
            String secUid = user.getSecUid();
            C89219l.m154716b(secUid, "");
            n.mo100460a(secUid);
            AbstractC88412b unused = selectSubscribe(m113047n(), C62651b.f142064a, C62652c.f142065a, new C20370ah(), new C62635f(user));
        }

        /* renamed from: com.ss.android.ugc.aweme.notificationlive.ui.adapter.PushSettingFollowListAdapter$FollowItemViewHolder$c */
        static final class C62632c extends AbstractC89220m implements AbstractC89183m<FollowItemViewHolder, Boolean, C89391z> {

            /* renamed from: a */
            final /* synthetic */ FollowItemViewHolder f142036a;

            static {
                Covode.recordClassIndex(73433);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C62632c(FollowItemViewHolder followItemViewHolder) {
                super(2);
                this.f142036a = followItemViewHolder;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89183m
            public final /* synthetic */ C89391z invoke(FollowItemViewHolder followItemViewHolder, Boolean bool) {
                FollowItemViewHolder followItemViewHolder2 = followItemViewHolder;
                boolean booleanValue = bool.booleanValue();
                C89219l.m154721d(followItemViewHolder2, "");
                followItemViewHolder2.mo100574a(booleanValue);
                this.f142036a.f142026j.f142022e = booleanValue;
                return C89391z.f203057a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.notificationlive.ui.adapter.PushSettingFollowListAdapter$FollowItemViewHolder$b */
        static final class C62631b extends AbstractC89220m implements AbstractC89183m<FollowItemViewHolder, UserState, C89391z> {

            /* renamed from: a */
            public static final C62631b f142035a = new C62631b();

            static {
                Covode.recordClassIndex(73432);
            }

            C62631b() {
                super(2);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89183m
            public final /* synthetic */ C89391z invoke(FollowItemViewHolder followItemViewHolder, UserState userState) {
                ListMiddleware<NotificationChoiceState, Object, C51133f> listMiddleware;
                FollowItemViewHolder followItemViewHolder2 = followItemViewHolder;
                UserState userState2 = userState;
                C89219l.m154721d(followItemViewHolder2, "");
                C89219l.m154721d(userState2, "");
                AbstractC20362a<FollowStatus> followStatus = userState2.getFollowStatus();
                if (followStatus instanceof C20372aj) {
                    followItemViewHolder2.mo100573a(userState2.getUser());
                } else if (followStatus instanceof C20466f) {
                    View view = followItemViewHolder2.itemView;
                    C89219l.m154716b(view, "");
                    Context context = view.getContext();
                    AbstractC20362a<FollowStatus> followStatus2 = userState2.getFollowStatus();
                    Objects.requireNonNull(followStatus2, "null cannot be cast to non-null type com.bytedance.jedi.arch.Fail<com.ss.android.ugc.aweme.profile.model.FollowStatus>");
                    C33615a.m68848a(context, ((C20466f) followStatus2).f48408a, (int) R.string.byb);
                } else if (followStatus instanceof C20379aq) {
                    followItemViewHolder2.mo100573a(userState2.getUser());
                }
                if (userState2.getUser().getFollowStatus() == 0) {
                    PushSettingNotificationChoiceViewModel m = followItemViewHolder2.mo63351m();
                    ListMiddleware<NotificationChoiceState, Object, C51133f> listMiddleware2 = null;
                    if (m != null) {
                        listMiddleware = m.f141940f;
                    } else {
                        listMiddleware = null;
                    }
                    listMiddleware.mo33732a(C89086z.INSTANCE);
                    PushSettingNotificationChoiceViewModel m2 = followItemViewHolder2.mo63351m();
                    if (m2 != null) {
                        listMiddleware2 = m2.f141940f;
                    }
                    listMiddleware2.refresh();
                }
                return C89391z.f203057a;
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public FollowItemViewHolder(com.p2082ss.android.ugc.aweme.notificationlive.p3537ui.adapter.PushSettingFollowListAdapter r5, android.view.ViewGroup r6) {
            /*
            // Method dump skipped, instructions count: 111
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.notificationlive.p3537ui.adapter.PushSettingFollowListAdapter.FollowItemViewHolder.<init>(com.ss.android.ugc.aweme.notificationlive.ui.adapter.PushSettingFollowListAdapter, android.view.ViewGroup):void");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.notificationlive.ui.adapter.PushSettingFollowListAdapter$FollowItemViewHolder$f */
        public static final class C62635f extends AbstractC89220m implements AbstractC89187q<FollowItemViewHolder, C62562r, Integer, C89391z> {

            /* renamed from: a */
            final /* synthetic */ User f142040a;

            static {
                Covode.recordClassIndex(73436);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C62635f(User user) {
                super(3);
                this.f142040a = user;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89187q
            public final /* synthetic */ C89391z invoke(FollowItemViewHolder followItemViewHolder, C62562r rVar, Integer num) {
                FollowItemViewHolder followItemViewHolder2 = followItemViewHolder;
                int intValue = num.intValue();
                C89219l.m154721d(followItemViewHolder2, "");
                if (rVar != null) {
                    if (followItemViewHolder2.f142025g) {
                        followItemViewHolder2.mo63351m().f141939e = true;
                        followItemViewHolder2.f142025g = false;
                    } else {
                        this.f142040a.setLivePushNotificationStatus(intValue);
                        followItemViewHolder2.mo100572a(intValue);
                    }
                }
                return C89391z.f203057a;
            }
        }
    }

    /* renamed from: d */
    private final AbstractC89172b<Integer, Boolean> m113044d(int i) {
        return new C62649h(this, i);
    }

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.ui.adapter.PushSettingFollowListAdapter$b */
    static final class C62643b extends AbstractC89220m implements AbstractC89172b<ViewGroup, JediViewHolder<? extends AbstractC20467g, ?>> {

        /* renamed from: a */
        final /* synthetic */ PushSettingFollowListAdapter f142055a;

        static {
            Covode.recordClassIndex(73446);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62643b(PushSettingFollowListAdapter pushSettingFollowListAdapter) {
            super(1);
            this.f142055a = pushSettingFollowListAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ JediViewHolder<? extends AbstractC20467g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            return new FollowItemViewHolder(this.f142055a, viewGroup2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.ui.adapter.PushSettingFollowListAdapter$c */
    static final class C62644c extends AbstractC89220m implements AbstractC89172b<ViewGroup, JediViewHolder<? extends AbstractC20467g, ?>> {

        /* renamed from: a */
        public static final C62644c f142056a = new C62644c();

        static {
            Covode.recordClassIndex(73447);
        }

        C62644c() {
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

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.ui.adapter.PushSettingFollowListAdapter$d */
    static final class C62645d extends AbstractC89220m implements AbstractC89172b<ViewGroup, JediViewHolder<? extends AbstractC20467g, ?>> {

        /* renamed from: a */
        public static final C62645d f142057a = new C62645d();

        static {
            Covode.recordClassIndex(73448);
        }

        C62645d() {
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

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.ui.adapter.PushSettingFollowListAdapter$e */
    static final class C62646e extends AbstractC89220m implements AbstractC89172b<ViewGroup, JediViewHolder<? extends AbstractC20467g, ?>> {

        /* renamed from: a */
        public static final C62646e f142058a = new C62646e();

        static {
            Covode.recordClassIndex(73449);
        }

        C62646e() {
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

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.ui.adapter.PushSettingFollowListAdapter$f */
    static final class C62647f extends AbstractC89220m implements AbstractC89172b<ViewGroup, JediViewHolder<? extends AbstractC20467g, ?>> {

        /* renamed from: a */
        final /* synthetic */ PushSettingFollowListAdapter f142059a;

        static {
            Covode.recordClassIndex(73450);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62647f(PushSettingFollowListAdapter pushSettingFollowListAdapter) {
            super(1);
            this.f142059a = pushSettingFollowListAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ JediViewHolder<? extends AbstractC20467g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            return new FollowItemViewTitleHolder(this.f142059a, viewGroup2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.ui.adapter.PushSettingFollowListAdapter$g */
    static final class C62648g extends AbstractC89220m implements AbstractC89172b<ViewGroup, JediViewHolder<? extends AbstractC20467g, ?>> {

        /* renamed from: a */
        final /* synthetic */ PushSettingFollowListAdapter f142060a;

        static {
            Covode.recordClassIndex(73451);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62648g(PushSettingFollowListAdapter pushSettingFollowListAdapter) {
            super(1);
            this.f142060a = pushSettingFollowListAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ JediViewHolder<? extends AbstractC20467g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            return new FollowItemViewSwitchHolder(this.f142060a, viewGroup2);
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

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.notificationlive.ui.adapter.PushSettingFollowListAdapter$h */
    public static final class C62649h extends AbstractC89220m implements AbstractC89172b<Integer, Boolean> {

        /* renamed from: a */
        final /* synthetic */ PushSettingFollowListAdapter f142061a;

        /* renamed from: b */
        final /* synthetic */ int f142062b;

        static {
            Covode.recordClassIndex(73452);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62649h(PushSettingFollowListAdapter pushSettingFollowListAdapter, int i) {
            super(1);
            this.f142061a = pushSettingFollowListAdapter;
            this.f142062b = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(Integer num) {
            int i;
            int intValue = num.intValue();
            int i2 = this.f142062b;
            Object a = this.f142061a.mo33762a(intValue);
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
        AbstractC20638g unused = gVar.mo33893a(m113044d(0), null, new C62643b(this));
        AbstractC20638g unused2 = gVar.mo33893a(m113044d(7), null, C62644c.f142056a);
        AbstractC20638g unused3 = gVar.mo33893a(m113044d(9), null, C62645d.f142057a);
        AbstractC20638g unused4 = gVar.mo33893a(m113044d(12), null, C62646e.f142058a);
        AbstractC20638g unused5 = gVar.mo33893a(m113044d(17), null, new C62647f(this));
        AbstractC20638g unused6 = gVar.mo33893a(m113044d(18), null, new C62648g(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.ui.adapter.PushSettingFollowListAdapter$FollowItemViewTitleHolder */
    public final class FollowItemViewTitleHolder extends JediBaseViewHolder<FollowItemViewTitleHolder, C51107f> implements AbstractC33974au {

        /* renamed from: g */
        final /* synthetic */ PushSettingFollowListAdapter f142054g;

        static {
            Covode.recordClassIndex(73444);
        }

        @Override // com.p2082ss.android.ugc.aweme.base.arch.JediBaseViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.AbstractC1202k
        public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
            super.onStateChanged(mVar, aVar);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public FollowItemViewTitleHolder(com.p2082ss.android.ugc.aweme.notificationlive.p3537ui.adapter.PushSettingFollowListAdapter r5, android.view.ViewGroup r6) {
            /*
                r4 = this;
                java.lang.String r3 = ""
                p4600h.p4611f.p4613b.C89219l.m154721d(r6, r3)
                r4.f142054g = r5
                android.content.Context r0 = r6.getContext()
                android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r0)
                r1 = 2131560287(0x7f0d075f, float:1.8745942E38)
                r0 = 0
                android.view.View r0 = com.C1764a.m5927a(r2, r1, r6, r0)
                p4600h.p4611f.p4613b.C89219l.m154716b(r0, r3)
                r4.<init>(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.notificationlive.p3537ui.adapter.PushSettingFollowListAdapter.FollowItemViewTitleHolder.<init>(com.ss.android.ugc.aweme.notificationlive.ui.adapter.PushSettingFollowListAdapter, android.view.ViewGroup):void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PushSettingFollowListAdapter(AbstractC1204m mVar, String str) {
        super(mVar, new C51105d(), 4);
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(str, "");
        this.f142023f = mVar;
        this.f142024g = str;
    }
}
