package com.p2082ss.android.ugc.aweme.friends.invite.p3021v2;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import androidx.lifecycle.LiveData;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.common.C39109f;
import com.p2082ss.android.ugc.aweme.common.C39117g;
import com.p2082ss.android.ugc.aweme.common.C39121h;
import com.p2082ss.android.ugc.aweme.common.C39139k;
import com.p2082ss.android.ugc.aweme.friends.invite.AbstractC51540c;
import com.p2082ss.android.ugc.aweme.friends.invite.p3021v2.InvitationSharePackage;
import com.p2082ss.android.ugc.aweme.friends.invite.p3021v2.InvitationViewModel;
import com.p2082ss.android.ugc.aweme.friends.p3015e.C51488a;
import com.p2082ss.android.ugc.aweme.inbox.widget.C56520b;
import com.p2082ss.android.ugc.aweme.language.C58071d;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.share.C68863ah;
import com.p2082ss.android.ugc.aweme.share.ShareDependService;
import com.p2082ss.android.ugc.aweme.share.improve.C68963a;
import com.p2082ss.android.ugc.aweme.share.improve.p3757b.C69109b;
import com.p2082ss.android.ugc.aweme.share.improve.p3758c.C69124b;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.C69684e;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.friends.invite.v2.ThirdPartInvitationItemView */
public final class ThirdPartInvitationItemView implements AbstractC51540c {

    /* renamed from: e */
    public static final AbstractC89244h f118875e = C89250i.m154773a((AbstractC89171a) C51587b.f118889a);

    /* renamed from: f */
    public static final C51586a f118876f = new C51586a((byte) 0);

    /* renamed from: a */
    public TuxButton f118877a;

    /* renamed from: b */
    public View.OnClickListener f118878b;

    /* renamed from: c */
    public String f118879c = "";

    /* renamed from: d */
    public final Fragment f118880d;

    /* renamed from: g */
    private DmtStatusView f118881g;

    /* renamed from: h */
    private RemoteImageView f118882h;

    /* renamed from: i */
    private TextView f118883i;

    /* renamed from: j */
    private TextView f118884j;

    /* renamed from: k */
    private final AbstractC89244h f118885k = C89250i.m154773a((AbstractC89171a) new C51595j(this));

    /* renamed from: l */
    private String f118886l = "general";

    /* renamed from: m */
    private final C56520b f118887m;

    /* renamed from: e */
    public final InvitationViewModel mo87096e() {
        return (InvitationViewModel) this.f118885k.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.invite.v2.ThirdPartInvitationItemView$a */
    public static final class C51586a {
        static {
            Covode.recordClassIndex(60861);
        }

        private C51586a() {
        }

        public /* synthetic */ C51586a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.invite.AbstractC51540c
    /* renamed from: b */
    public final String mo87052b() {
        return this.f118886l;
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.invite.v2.ThirdPartInvitationItemView$j */
    static final class C51595j extends AbstractC89220m implements AbstractC89171a<InvitationViewModel> {

        /* renamed from: a */
        final /* synthetic */ ThirdPartInvitationItemView f118899a;

        static {
            Covode.recordClassIndex(60870);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51595j(ThirdPartInvitationItemView thirdPartInvitationItemView) {
            super(0);
            this.f118899a = thirdPartInvitationItemView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ InvitationViewModel invoke() {
            return InvitationViewModel.C51573a.m96080a(this.f118899a.f118880d);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.invite.AbstractC51540c
    /* renamed from: c */
    public final LiveData<Boolean> mo87053c() {
        return mo87096e().mo87089a();
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.invite.v2.ThirdPartInvitationItemView$b */
    static final class C51587b extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C51587b f118889a = new C51587b();

        static {
            Covode.recordClassIndex(60862);
        }

        C51587b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if (!C89361p.m154872a("BR", C58071d.m104914h(), true) && !C89361p.m154872a("BR", C58071d.m104913g(), true)) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static {
        Covode.recordClassIndex(60859);
    }

    /* renamed from: d */
    public final ActivityC0945e mo87095d() {
        RemoteImageView remoteImageView = this.f118882h;
        if (remoteImageView == null) {
            C89219l.m154710a("ivAvatar");
        }
        Context context = remoteImageView.getContext();
        Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        return (ActivityC0945e) context;
    }

    /* renamed from: g */
    public final void mo87098g() {
        new C23144b(this.f118880d).mo37640e(R.string.clf).mo37637b();
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.invite.v2.ThirdPartInvitationItemView$BackCallShareProxy */
    static final class BackCallShareProxy implements AbstractC33974au {

        /* renamed from: a */
        private final WeakReference<ThirdPartInvitationItemView> f118888a;

        static {
            Covode.recordClassIndex(60860);
        }

        @Override // androidx.lifecycle.AbstractC1202k
        public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
            if (aVar == AbstractC1196i.EnumC1198a.ON_RESUME) {
                onResume();
            }
        }

        @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_RESUME)
        public final void onResume() {
            ThirdPartInvitationItemView thirdPartInvitationItemView = this.f118888a.get();
            if (thirdPartInvitationItemView != null && thirdPartInvitationItemView.mo87096e().f118854c) {
                thirdPartInvitationItemView.mo87096e().f118854c = false;
                C51488a.m95913a(thirdPartInvitationItemView.f118879c, "click_whatsapp_icon");
                thirdPartInvitationItemView.mo87097f();
            }
        }

        public BackCallShareProxy(WeakReference<ThirdPartInvitationItemView> weakReference) {
            C89219l.m154721d(weakReference, "");
            this.f118888a = weakReference;
        }
    }

    /* renamed from: f */
    public final void mo87097f() {
        InvitationViewModel e = mo87096e();
        C39139k kVar = new C39139k(this.f118880d, new C51591f(this), new C51592g(this));
        C89219l.m154721d(kVar, "");
        if (C89219l.m154714a((Object) e.mo87089a().getValue(), (Object) true)) {
            C39109f.m79404c("InvitationViewModel", "requestInviteConfig block by loading");
            return;
        }
        C51596a aVar = e.f118853b;
        if (aVar == null || !aVar.mo87103a()) {
            e.mo87089a().postValue(true);
            C39117g.m79415a(InvitationApi.f118801a.getInvitationConfig(""), kVar, new C39121h(new InvitationViewModel.C51581g(e), new InvitationViewModel.C51582h(e)));
            return;
        }
        kVar.f92347b.invoke(aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.invite.AbstractC51540c
    /* renamed from: a */
    public final void mo87047a() {
        AbstractC69581b bVar = C68963a.C68964a.m121652a("whatsapp", C17873f.m33102j());
        if (!((Boolean) f118875e.getValue()).booleanValue() || bVar == null || bVar.mo109555c() || !bVar.mo109557b(C17867d.m33078a())) {
            this.f118886l = "general";
            RemoteImageView remoteImageView = this.f118882h;
            if (remoteImageView == null) {
                C89219l.m154710a("ivAvatar");
            }
            C34577e.m70591a(remoteImageView, 2131232082);
            TuxButton tuxButton = this.f118877a;
            if (tuxButton == null) {
                C89219l.m154710a("button");
            }
            tuxButton.setOnClickListener(new View$OnClickListenerC51589d(this));
        } else {
            this.f118886l = "whatsapp";
            RemoteImageView remoteImageView2 = this.f118882h;
            if (remoteImageView2 == null) {
                C89219l.m154710a("ivAvatar");
            }
            C34577e.m70591a(remoteImageView2, (int) R.raw.icon_color_whatsapp_circle);
            TuxButton tuxButton2 = this.f118877a;
            if (tuxButton2 == null) {
                C89219l.m154710a("button");
            }
            tuxButton2.setOnClickListener(new View$OnClickListenerC51588c(this, bVar));
        }
        TuxButton tuxButton3 = this.f118877a;
        if (tuxButton3 == null) {
            C89219l.m154710a("button");
        }
        ViewParent parent = tuxButton3.getParent();
        if (!(parent instanceof View)) {
            parent = null;
        }
        View view = (View) parent;
        if (view != null) {
            view.setOnClickListener(new View$OnClickListenerC51590e(this));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.friends.invite.v2.ThirdPartInvitationItemView$g */
    public static final class C51592g extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ ThirdPartInvitationItemView f118895a;

        static {
            Covode.recordClassIndex(60867);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51592g(ThirdPartInvitationItemView thirdPartInvitationItemView) {
            super(1);
            this.f118895a = thirdPartInvitationItemView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            this.f118895a.mo87098g();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.invite.v2.ThirdPartInvitationItemView$i */
    static final class C51594i extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ ThirdPartInvitationItemView f118898a;

        static {
            Covode.recordClassIndex(60869);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51594i(ThirdPartInvitationItemView thirdPartInvitationItemView) {
            super(1);
            this.f118898a = thirdPartInvitationItemView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            this.f118898a.mo87098g();
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.invite.AbstractC51540c
    /* renamed from: a */
    public final void mo87048a(View.OnClickListener onClickListener) {
        C89219l.m154721d(onClickListener, "");
        this.f118878b = onClickListener;
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.invite.AbstractC51540c
    /* renamed from: a */
    public final void mo87051a(String str) {
        C89219l.m154721d(str, "");
        this.f118879c = str;
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.invite.v2.ThirdPartInvitationItemView$e */
    static final class View$OnClickListenerC51590e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ThirdPartInvitationItemView f118893a;

        static {
            Covode.recordClassIndex(60865);
        }

        View$OnClickListenerC51590e(ThirdPartInvitationItemView thirdPartInvitationItemView) {
            this.f118893a = thirdPartInvitationItemView;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            TuxButton tuxButton = this.f118893a.f118877a;
            if (tuxButton == null) {
                C89219l.m154710a("button");
            }
            tuxButton.performClick();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.invite.v2.ThirdPartInvitationItemView$c */
    static final class View$OnClickListenerC51588c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ThirdPartInvitationItemView f118890a;

        /* renamed from: b */
        final /* synthetic */ AbstractC69581b f118891b;

        static {
            Covode.recordClassIndex(60863);
        }

        View$OnClickListenerC51588c(ThirdPartInvitationItemView thirdPartInvitationItemView, AbstractC69581b bVar) {
            this.f118890a = thirdPartInvitationItemView;
            this.f118891b = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!C58001a.m104815a(view, 1200)) {
                View.OnClickListener onClickListener = this.f118890a.f118878b;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                ThirdPartInvitationItemView thirdPartInvitationItemView = this.f118890a;
                AbstractC69581b bVar = this.f118891b;
                thirdPartInvitationItemView.mo87096e().mo87090a(new C39139k<>(thirdPartInvitationItemView.f118880d, new C51593h(thirdPartInvitationItemView, bVar), new C51594i(thirdPartInvitationItemView)), bVar);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.invite.v2.ThirdPartInvitationItemView$d */
    static final class View$OnClickListenerC51589d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ThirdPartInvitationItemView f118892a;

        static {
            Covode.recordClassIndex(60864);
        }

        View$OnClickListenerC51589d(ThirdPartInvitationItemView thirdPartInvitationItemView) {
            this.f118892a = thirdPartInvitationItemView;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!C58001a.m104815a(view, 1200)) {
                View.OnClickListener onClickListener = this.f118892a.f118878b;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                C51488a.m95913a(this.f118892a.f118879c, "click_general_icon");
                this.f118892a.mo87097f();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.invite.v2.ThirdPartInvitationItemView$h */
    static final class C51593h extends AbstractC89220m implements AbstractC89172b<InvitationViewModel.C51574b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ ThirdPartInvitationItemView f118896a;

        /* renamed from: b */
        final /* synthetic */ AbstractC69581b f118897b;

        static {
            Covode.recordClassIndex(60868);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51593h(ThirdPartInvitationItemView thirdPartInvitationItemView, AbstractC69581b bVar) {
            super(1);
            this.f118896a = thirdPartInvitationItemView;
            this.f118897b = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(InvitationViewModel.C51574b bVar) {
            InvitationViewModel.C51574b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            C51488a.m95914a(this.f118896a.f118879c, "whatsapp", "cell", bVar2.f118857a);
            C68863ah.f154027a.mo109413a(this.f118897b.mo109548a(), bVar2.f118858b, this.f118896a.mo87095d());
            this.f118896a.mo87096e().f118854c = true;
            return C89391z.f203057a;
        }
    }

    public ThirdPartInvitationItemView(Fragment fragment) {
        C89219l.m154721d(fragment, "");
        this.f118880d = fragment;
        fragment.getLifecycle().mo4012a(new BackCallShareProxy(new WeakReference(this)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.friends.invite.v2.ThirdPartInvitationItemView$f */
    public static final class C51591f extends AbstractC89220m implements AbstractC89172b<C51596a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ ThirdPartInvitationItemView f118894a;

        static {
            Covode.recordClassIndex(60866);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51591f(ThirdPartInvitationItemView thirdPartInvitationItemView) {
            super(1);
            this.f118894a = thirdPartInvitationItemView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C51596a aVar) {
            C51596a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            if (aVar2.mo87103a()) {
                ThirdPartInvitationItemView thirdPartInvitationItemView = this.f118894a;
                String str = aVar2.f118902c;
                if (str == null) {
                    C89219l.m154715b();
                }
                String str2 = aVar2.f118901b;
                if (str2 == null) {
                    C89219l.m154715b();
                }
                String str3 = aVar2.f118900a;
                if (str3 == null) {
                    C89219l.m154715b();
                }
                ActivityC0945e d = thirdPartInvitationItemView.mo87095d();
                String str4 = thirdPartInvitationItemView.f118879c;
                C89219l.m154721d(d, "");
                C89219l.m154721d(str2, "");
                C89219l.m154721d(str, "");
                C89219l.m154721d(str3, "");
                C89219l.m154721d(str4, "");
                C89219l.m154721d(str2, "");
                C89219l.m154721d(str, "");
                C89219l.m154721d(str3, "");
                C89219l.m154721d(str4, "");
                SharePackage.C69654a aVar3 = new SharePackage.C69654a();
                String c = C69124b.m122228c(C69124b.m122226b(C69124b.m122224a(str)));
                if (c == null) {
                    c = "";
                }
                InvitationSharePackage invitationSharePackage = new InvitationSharePackage(aVar3.mo109809e(c).mo109803a("invite_friends"));
                C89219l.m154721d(str2, "");
                invitationSharePackage.f118850b = str2;
                C89219l.m154721d(str4, "");
                invitationSharePackage.f118849a = str4;
                C69684e.C69686b bVar = new C69684e.C69686b();
                C68863ah.f154027a.mo109409a(bVar, (Activity) d, false);
                bVar.f155584o = false;
                bVar.mo109823a(new C69109b());
                bVar.mo109829a("instagram");
                bVar.mo109829a("snapchat");
                bVar.mo109829a("instagram_story");
                bVar.mo109824a(invitationSharePackage);
                bVar.mo109826a(new InvitationSharePackage.C51571a.C51572a());
                ShareDependService.C68822a.m121324a().mo109326a(d, bVar.mo109831a(), R.style.wi).show();
            } else {
                this.f118894a.mo87098g();
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.invite.AbstractC51540c
    /* renamed from: a */
    public final void mo87050a(C56520b bVar) {
        boolean z;
        C89219l.m154721d(bVar, "");
        if (!C89219l.m154714a(this.f118887m, bVar)) {
            if (bVar.f128860b != -1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                RemoteImageView remoteImageView = this.f118882h;
                if (remoteImageView == null) {
                    C89219l.m154710a("ivAvatar");
                }
                RemoteImageView remoteImageView2 = this.f118882h;
                if (remoteImageView2 == null) {
                    C89219l.m154710a("ivAvatar");
                }
                ViewGroup.LayoutParams layoutParams = remoteImageView2.getLayoutParams();
                layoutParams.width = bVar.f128860b;
                layoutParams.height = bVar.f128860b;
                remoteImageView.setLayoutParams(layoutParams);
            }
            TextView textView = this.f118883i;
            if (textView == null) {
                C89219l.m154710a("tvTitle");
            }
            if (!(textView instanceof TuxTextView)) {
                textView = null;
            }
            TuxTextView tuxTextView = (TuxTextView) textView;
            if (tuxTextView != null) {
                if (bVar.f128863e != -1) {
                    tuxTextView.setTuxFont(bVar.f128863e);
                }
                if (bVar.f128864f != -1) {
                    tuxTextView.mo37697a((float) bVar.f128864f);
                }
            }
            TextView textView2 = this.f118884j;
            if (textView2 == null) {
                C89219l.m154710a("tvContent");
            }
            if (!(textView2 instanceof TuxTextView)) {
                textView2 = null;
            }
            TuxTextView tuxTextView2 = (TuxTextView) textView2;
            if (tuxTextView2 != null) {
                if (bVar.f128865g != -1) {
                    tuxTextView2.setTuxFont(bVar.f128865g);
                }
                if (bVar.f128866h != -1) {
                    tuxTextView2.mo37697a((float) bVar.f128866h);
                }
            }
            if (bVar.f128868j != -1) {
                TextView textView3 = this.f118884j;
                if (textView3 == null) {
                    C89219l.m154710a("tvContent");
                }
                if (textView3.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                    TextView textView4 = this.f118884j;
                    if (textView4 == null) {
                        C89219l.m154710a("tvContent");
                    }
                    TextView textView5 = this.f118884j;
                    if (textView5 == null) {
                        C89219l.m154710a("tvContent");
                    }
                    ViewGroup.LayoutParams layoutParams2 = textView5.getLayoutParams();
                    Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                    marginLayoutParams.topMargin = bVar.f128868j;
                    textView4.setLayoutParams(marginLayoutParams);
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.invite.AbstractC51540c
    /* renamed from: a */
    public final void mo87049a(DmtStatusView dmtStatusView, RemoteImageView remoteImageView, TextView textView, TextView textView2, TuxButton tuxButton) {
        C89219l.m154721d(remoteImageView, "");
        C89219l.m154721d(textView, "");
        C89219l.m154721d(textView2, "");
        C89219l.m154721d(tuxButton, "");
        this.f118881g = dmtStatusView;
        this.f118882h = remoteImageView;
        this.f118883i = textView;
        this.f118884j = textView2;
        this.f118877a = tuxButton;
        textView.setText(R.string.cle);
        textView2.setText(R.string.cld);
        tuxButton.setText(R.string.clb);
        if (dmtStatusView != null) {
            InvitationViewModel e = mo87096e();
            Fragment fragment = this.f118880d;
            C51598c cVar = new C51598c(dmtStatusView);
            C89219l.m154721d(fragment, "");
            C89219l.m154721d(cVar, "");
            if (!e.f118852a) {
                e.mo87089a().observe(fragment, cVar);
                e.f118852a = true;
            }
        }
    }
}
