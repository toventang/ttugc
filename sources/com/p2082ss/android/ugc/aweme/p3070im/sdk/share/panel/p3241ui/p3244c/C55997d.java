package com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.p3241ui.p3244c;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageWithVerify;
import com.p2082ss.android.ugc.aweme.follow.widet.C51086a;
import com.p2082ss.android.ugc.aweme.metrics.C59256u;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.p3241ui.view.SharePanelFollowButton;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.viewmodel.C56083c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.viewmodel.SharePanelViewModel;
import com.p2082ss.android.ugc.aweme.p3070im.service.share.p3264a.AbstractC56264b;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.aweme.social.p3916c.C74721a;
import com.p2082ss.android.ugc.aweme.social.p3916c.C74722b;
import com.p2082ss.android.ugc.aweme.social.widget.p3919b.AbstractC74745a;
import com.p2082ss.android.ugc.aweme.views.MutualRelationView;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.EnumC89331m;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c.d */
public final class C55997d extends RecyclerView.ViewHolder {

    /* renamed from: j */
    public static final C55998a f127684j = new C55998a((byte) 0);

    /* renamed from: a */
    public C74721a f127685a;

    /* renamed from: b */
    public final C56083c f127686b;

    /* renamed from: c */
    public final AbstractC89244h f127687c;

    /* renamed from: d */
    public final AbstractC89244h f127688d;

    /* renamed from: e */
    public final AbstractC89244h f127689e;

    /* renamed from: f */
    public final AbstractC89244h f127690f;

    /* renamed from: g */
    public final C51086a.C51094g f127691g = new C51086a.C51094g();

    /* renamed from: h */
    public final C56002e f127692h = new C56002e(this);

    /* renamed from: i */
    public final SharePanelViewModel f127693i;

    /* renamed from: k */
    private final AbstractC89244h f127694k;

    /* renamed from: l */
    private final AbstractC89244h f127695l = C89250i.m154773a((AbstractC89171a) new C56003f(this));

    /* renamed from: m */
    private final AbstractC56264b f127696m;

    static {
        Covode.recordClassIndex(65791);
    }

    /* renamed from: a */
    public final SharePanelFollowButton mo92859a() {
        return (SharePanelFollowButton) this.f127694k.getValue();
    }

    /* renamed from: b */
    public final C51086a mo92860b() {
        return (C51086a) this.f127695l.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c.d$a */
    public static final class C55998a {
        static {
            Covode.recordClassIndex(65792);
        }

        private C55998a() {
        }

        public /* synthetic */ C55998a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c.d$b */
    static final class C55999b extends AbstractC89220m implements AbstractC89171a<AvatarImageWithVerify> {

        /* renamed from: a */
        final /* synthetic */ View f127697a;

        static {
            Covode.recordClassIndex(65793);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55999b(View view) {
            super(0);
            this.f127697a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AvatarImageWithVerify invoke() {
            return this.f127697a.findViewById(R.id.on);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c.d$d */
    static final class C56001d extends AbstractC89220m implements AbstractC89171a<SharePanelFollowButton> {

        /* renamed from: a */
        final /* synthetic */ View f127700a;

        static {
            Covode.recordClassIndex(65795);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56001d(View view) {
            super(0);
            this.f127700a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SharePanelFollowButton invoke() {
            return this.f127700a.findViewById(R.id.b6g);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c.d$e */
    public static final class C56002e implements C51086a.AbstractC51091d {

        /* renamed from: a */
        final /* synthetic */ C55997d f127701a;

        static {
            Covode.recordClassIndex(65796);
        }

        @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51091d
        /* renamed from: a */
        public final void mo63342a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51091d
        /* renamed from: b */
        public final void mo63344b() {
            this.f127701a.mo92859a().setFollowStatus(0);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C56002e(C55997d dVar) {
            this.f127701a = dVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51091d
        /* renamed from: a */
        public final void mo63343a(FollowStatus followStatus) {
            C74721a aVar;
            Bundle bundle;
            String string;
            if (followStatus != null && followStatus.isFollowSucess && this.f127701a.mo92859a().getStatus() == 4 && (aVar = this.f127701a.f127685a) != null) {
                SharePanelViewModel sharePanelViewModel = this.f127701a.f127693i;
                String str = "";
                C89219l.m154721d(aVar, str);
                AbstractC74745a aVar2 = sharePanelViewModel.f127876g;
                if (aVar2 != null) {
                    aVar2.mo117796a(C89070n.m154516a(C74722b.m131180a(aVar)));
                }
                C59256u uVar = new C59256u();
                SharePackage sharePackage = sharePanelViewModel.f127873d;
                if (!(sharePackage == null || (bundle = sharePackage.f155492i) == null || (string = bundle.getString("enter_from")) == null)) {
                    str = string;
                }
                C59256u a = uVar.mo96834a(str);
                a.f135350a = C59256u.EnumC59259c.CARD;
                C59256u a2 = a.mo96832a(C74722b.m131180a(aVar));
                a2.f135352b = C59256u.EnumC59257a.FOLLOW;
                a2.mo96837o("long_press").mo96792f();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c.d$g */
    static final class C56004g extends AbstractC89220m implements AbstractC89171a<MutualRelationView> {

        /* renamed from: a */
        final /* synthetic */ View f127703a;

        static {
            Covode.recordClassIndex(65798);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56004g(View view) {
            super(0);
            this.f127703a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ MutualRelationView invoke() {
            return this.f127703a.findViewById(R.id.cp5);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c.d$h */
    static final class C56005h extends AbstractC89220m implements AbstractC89171a<TuxTextView> {

        /* renamed from: a */
        final /* synthetic */ View f127704a;

        static {
            Covode.recordClassIndex(65799);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56005h(View view) {
            super(0);
            this.f127704a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxTextView invoke() {
            return this.f127704a.findViewById(R.id.cpq);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c.d$i */
    static final class C56006i extends AbstractC89220m implements AbstractC89171a<TuxTextView> {

        /* renamed from: a */
        final /* synthetic */ View f127705a;

        static {
            Covode.recordClassIndex(65800);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56006i(View view) {
            super(0);
            this.f127705a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxTextView invoke() {
            return this.f127705a.findViewById(R.id.df8);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c.d$f */
    static final class C56003f extends AbstractC89220m implements AbstractC89171a<C51086a> {

        /* renamed from: a */
        final /* synthetic */ C55997d f127702a;

        static {
            Covode.recordClassIndex(65797);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56003f(C55997d dVar) {
            super(0);
            this.f127702a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C51086a invoke() {
            C51086a aVar = new C51086a(this.f127702a.mo92859a(), this.f127702a.f127691g);
            aVar.f117878d = this.f127702a.f127692h;
            return aVar;
        }
    }

    /* renamed from: a */
    public final View.OnClickListener mo92858a(User user) {
        return new View$OnClickListenerC56000c(this, user);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c.d$c */
    static final class View$OnClickListenerC56000c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C55997d f127698a;

        /* renamed from: b */
        final /* synthetic */ User f127699b;

        static {
            Covode.recordClassIndex(65794);
        }

        View$OnClickListenerC56000c(C55997d dVar, User user) {
            this.f127698a = dVar;
            this.f127699b = user;
        }

        public final void onClick(View view) {
            boolean z;
            C74721a aVar;
            ClickAgent.onClick(view);
            int status = this.f127698a.mo92859a().getStatus();
            if (status == 0) {
                C55997d dVar = this.f127698a;
                User user = this.f127699b;
                dVar.mo92859a().setFollowStatus(4);
                C51086a b = dVar.mo92860b();
                String uid = user.getUid();
                String secUid = user.getSecUid();
                int followerStatus = user.getFollowerStatus();
                if (user.isSecret() || user.isPrivateAccount()) {
                    z = true;
                } else {
                    z = false;
                }
                b.mo86509a(uid, secUid, 1, followerStatus, z);
            } else if ((status == 1 || status == 2) && (aVar = this.f127698a.f127685a) != null) {
                this.f127698a.f127686b.mo92946a(aVar);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C55997d(View view, SharePanelViewModel sharePanelViewModel, AbstractC56264b bVar) {
        super(view);
        C89219l.m154721d(view, "");
        C89219l.m154721d(sharePanelViewModel, "");
        this.f127693i = sharePanelViewModel;
        this.f127696m = bVar;
        this.f127686b = new C56083c(sharePanelViewModel, bVar);
        this.f127687c = C89250i.m154774a(EnumC89331m.NONE, new C55999b(view));
        this.f127688d = C89250i.m154774a(EnumC89331m.NONE, new C56005h(view));
        this.f127689e = C89250i.m154774a(EnumC89331m.NONE, new C56006i(view));
        this.f127690f = C89250i.m154774a(EnumC89331m.NONE, new C56004g(view));
        this.f127694k = C89250i.m154774a(EnumC89331m.NONE, new C56001d(view));
    }
}
