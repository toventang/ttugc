package com.p2082ss.android.ugc.aweme.badge;

import android.app.Dialog;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.RelativeLayout;
import androidx.fragment.app.DialogInterface$OnCancelListenerC0944d;
import androidx.lifecycle.AbstractC1204m;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.jedi.arch.AbstractC20362a;
import com.bytedance.jedi.arch.AbstractC20367ae;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.AbstractC20477i;
import com.bytedance.jedi.arch.AbstractC20527q;
import com.bytedance.jedi.arch.AbstractC20534v;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.C20373ak;
import com.bytedance.jedi.arch.C20374al;
import com.bytedance.jedi.arch.C20375am;
import com.bytedance.jedi.arch.C20376an;
import com.bytedance.jedi.arch.C20531t;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.AccountService;
import com.p2082ss.android.ugc.aweme.IProfileBadgeService;
import com.p2082ss.android.ugc.aweme.account.profilebadge.ProfileBadgeServiceImpl;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.profile.model.ProfileBadgeStruct;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.setting.C68030bp;
import com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp;
import com.p2082ss.android.ugc.aweme.utils.C80538hl;
import com.p2082ss.android.ugc.aweme.utils.C80630u;
import com.p2082ss.android.ugc.trill.R;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.badge.f */
public final class C34437f extends DialogInterface$OnCancelListenerC0944d implements AbstractC20527q, AbstractC34450j {

    /* renamed from: i */
    public static final int f81379i = 3;

    /* renamed from: j */
    public static final C34438a f81380j = new C34438a((byte) 0);

    /* renamed from: m */
    private static final String f81381m = "EditProfileBadgeDialog";

    /* renamed from: n */
    private static final long f81382n = InteractFirstFrameTimeOutDurationSetting.DEFAULT;

    /* renamed from: a */
    public C34448h f81383a;

    /* renamed from: b */
    public boolean f81384b;

    /* renamed from: c */
    public ProfileBadgeStruct f81385c;

    /* renamed from: d */
    public ProfileBadgeStruct f81386d;

    /* renamed from: e */
    public C34431c f81387e;

    /* renamed from: f */
    public GridLayoutManager f81388f;

    /* renamed from: g */
    final IProfileBadgeService f81389g;

    /* renamed from: h */
    public final User f81390h;

    /* renamed from: k */
    private final AbstractC89244h f81391k = C89250i.m154773a((AbstractC89171a) new C34444g(this));

    /* renamed from: l */
    private final AbstractC89244h f81392l;

    /* renamed from: o */
    private SparseArray f81393o;

    /* renamed from: a */
    public final View mo60864a(int i) {
        if (this.f81393o == null) {
            this.f81393o = new SparseArray();
        }
        View view = (View) this.f81393o.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f81393o.put(i, findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final DmtStatusView mo60865a() {
        return (DmtStatusView) this.f81391k.getValue();
    }

    /* renamed from: b */
    public final EditProfileBadgeViewModel mo60869b() {
        return (EditProfileBadgeViewModel) this.f81392l.getValue();
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.badge.f$a */
    public static final class C34438a {
        static {
            Covode.recordClassIndex(41386);
        }

        private C34438a() {
        }

        public /* synthetic */ C34438a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20534v
    public final AbstractC1204m getLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final AbstractC20534v getLifecycleOwnerHolder() {
        return this;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20367ae
    public final /* bridge */ /* synthetic */ AbstractC20477i getReceiver() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final AbstractC20367ae<AbstractC20477i> getReceiverHolder() {
        return this;
    }

    /* renamed from: com.ss.android.ugc.aweme.badge.f$g */
    static final class C34444g extends AbstractC89220m implements AbstractC89171a<DmtStatusView> {

        /* renamed from: a */
        final /* synthetic */ C34437f f81399a;

        static {
            Covode.recordClassIndex(41392);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34444g(C34437f fVar) {
            super(0);
            this.f81399a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ DmtStatusView invoke() {
            return this.f81399a.mo60864a(R.id.e7i);
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f81393o;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.badge.f$d */
    static final class C34441d extends AbstractC89220m implements AbstractC89171a<EditProfileBadgeViewModel> {

        /* renamed from: a */
        final /* synthetic */ C34437f f81396a;

        static {
            Covode.recordClassIndex(41389);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34441d(C34437f fVar) {
            super(0);
            this.f81396a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ EditProfileBadgeViewModel invoke() {
            JediViewModel a = C20531t.m38716a(this.f81396a.requireActivity()).mo33800a(EditProfileBadgeViewModel.class);
            C89219l.m154716b(a, "");
            return a;
        }
    }

    static {
        Covode.recordClassIndex(41385);
    }

    /* renamed from: com.ss.android.ugc.aweme.badge.f$h */
    public static final class C34445h implements IProfileBadgeService.AbstractC31279a {

        /* renamed from: a */
        final /* synthetic */ C34437f f81400a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89234a f81401b;

        /* renamed from: c */
        final /* synthetic */ C89233z.C89234a f81402c;

        static {
            Covode.recordClassIndex(41393);
        }

        @Override // com.p2082ss.android.ugc.aweme.IProfileBadgeService.AbstractC31279a
        /* renamed from: a */
        public final void mo57241a() {
            String str;
            AccountService.m65215a().mo57069e().updateCurProfileBadge(this.f81400a.f81386d);
            C34437f fVar = this.f81400a;
            ProfileBadgeStruct profileBadgeStruct = fVar.f81386d;
            Boolean bool = null;
            if (profileBadgeStruct != null) {
                str = profileBadgeStruct.getUrl();
            } else {
                str = null;
            }
            ProfileBadgeStruct profileBadgeStruct2 = this.f81400a.f81386d;
            if (profileBadgeStruct2 != null) {
                bool = Boolean.valueOf(profileBadgeStruct2.getShouldShow());
            }
            fVar.mo60867a(str, bool);
            if (!this.f81401b.element) {
                this.f81401b.element = true;
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.IProfileBadgeService.AbstractC31279a
        /* renamed from: a */
        public final void mo57242a(ProfileBadgeStruct profileBadgeStruct) {
            if (profileBadgeStruct != null && Long.valueOf(profileBadgeStruct.getId()) != null) {
                C34437f fVar = this.f81400a;
                fVar.f81386d = fVar.f81385c;
                if (!this.f81402c.element) {
                    this.f81400a.mo60870c();
                    this.f81402c.element = true;
                }
            }
        }

        C34445h(C34437f fVar, C89233z.C89234a aVar, C89233z.C89234a aVar2) {
            this.f81400a = fVar;
            this.f81401b = aVar;
            this.f81402c = aVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.badge.f$i */
    public static final class C34446i implements IProfileBadgeService.AbstractC31280b {

        /* renamed from: a */
        final /* synthetic */ C34437f f81403a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89234a f81404b;

        /* renamed from: c */
        final /* synthetic */ C89233z.C89234a f81405c;

        static {
            Covode.recordClassIndex(41394);
        }

        @Override // com.p2082ss.android.ugc.aweme.IProfileBadgeService.AbstractC31280b
        /* renamed from: a */
        public final void mo56083a() {
            String str;
            AccountService.m65215a().mo57069e().updateCurProfileBadge(this.f81403a.f81386d);
            C34437f fVar = this.f81403a;
            ProfileBadgeStruct profileBadgeStruct = fVar.f81386d;
            Boolean bool = null;
            if (profileBadgeStruct != null) {
                str = profileBadgeStruct.getUrl();
            } else {
                str = null;
            }
            ProfileBadgeStruct profileBadgeStruct2 = this.f81403a.f81386d;
            if (profileBadgeStruct2 != null) {
                bool = Boolean.valueOf(profileBadgeStruct2.getShouldShow());
            }
            fVar.mo60867a(str, bool);
            if (!this.f81404b.element) {
                this.f81404b.element = true;
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.IProfileBadgeService.AbstractC31280b
        /* renamed from: a */
        public final void mo56084a(ProfileBadgeStruct profileBadgeStruct) {
            if (profileBadgeStruct != null && Long.valueOf(profileBadgeStruct.getId()) != null) {
                C34437f fVar = this.f81403a;
                fVar.f81386d = fVar.f81385c;
                if (!this.f81405c.element) {
                    this.f81403a.mo60870c();
                    this.f81405c.element = true;
                }
            }
        }

        C34446i(C34437f fVar, C89233z.C89234a aVar, C89233z.C89234a aVar2) {
            this.f81403a = fVar;
            this.f81404b = aVar;
            this.f81405c = aVar2;
        }
    }

    /* renamed from: c */
    public final void mo60870c() {
        new C23144b(this).mo37640e(R.string.euv).mo37636b(R.raw.icon_tick_fill_small).mo37639d(R.attr.aw).mo37634a(f81382n).mo37637b();
    }

    /* renamed from: com.ss.android.ugc.aweme.badge.f$f */
    public static final class C34443f extends AbstractView$OnClickListenerC80259bp {

        /* renamed from: a */
        final /* synthetic */ C34437f f81398a;

        static {
            Covode.recordClassIndex(41391);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34443f(C34437f fVar) {
            super(InteractFirstFrameTimeOutDurationSetting.DEFAULT);
            this.f81398a = fVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:105:0x01ce, code lost:
            if (r0 == null) goto L_0x01d0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x009e, code lost:
            if (r0 == null) goto L_0x00a0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:63:0x0142, code lost:
            if (r0 == null) goto L_0x0144;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:73:0x016a, code lost:
            if (r0 == null) goto L_0x016c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:81:0x0182, code lost:
            if (r0 == null) goto L_0x0184;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:89:0x019e, code lost:
            if (r0 == null) goto L_0x01a0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:97:0x01b6, code lost:
            if (r0 == null) goto L_0x01b8;
         */
        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo60873a(android.view.View r9) {
            /*
            // Method dump skipped, instructions count: 486
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.badge.C34437f.C34443f.mo60873a(android.view.View):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.badge.f$c */
    static final class View$OnClickListenerC34440c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C34437f f81395a;

        static {
            Covode.recordClassIndex(41388);
        }

        View$OnClickListenerC34440c(C34437f fVar) {
            this.f81395a = fVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f81395a.mo60869b().mo60841a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.badge.f$e */
    static final class View$OnClickListenerC34442e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C34437f f81397a;

        static {
            Covode.recordClassIndex(41390);
        }

        View$OnClickListenerC34442e(C34437f fVar) {
            this.f81397a = fVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f81397a.dismiss();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.badge.AbstractC34450j
    /* renamed from: a */
    public final void mo60866a(C34448h hVar) {
        String str;
        this.f81383a = hVar;
        this.f81384b = true;
        Boolean bool = null;
        if (hVar != null) {
            str = hVar.getUrl();
            bool = hVar.getShouldShow();
        } else {
            str = null;
        }
        mo60867a(str, bool);
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f81385c = this.f81390h.getProfileBadge();
        this.f81386d = this.f81390h.getProfileBadge();
        setStyle(0, R.style.a1_);
    }

    public C34437f(User user) {
        C89219l.m154721d(user, "");
        this.f81390h = user;
        IProfileBadgeService b = ProfileBadgeServiceImpl.m67562b();
        C89219l.m154716b(b, "");
        this.f81389g = b;
        this.f81392l = C89250i.m154773a((AbstractC89171a) new C34441d(this));
    }

    /* renamed from: a */
    public final void mo60868a(boolean z) {
        int i;
        if (z) {
            i = 8;
        } else {
            i = 0;
        }
        if (mo60864a(R.id.ar2) != null && mo60864a(R.id.ar5) != null && mo60864a(R.id.ar5) != null && mo60864a(R.id.arc) != null) {
            RelativeLayout relativeLayout = (RelativeLayout) mo60864a(R.id.ar2);
            C89219l.m154716b(relativeLayout, "");
            relativeLayout.setVisibility(i);
            TuxTextView tuxTextView = (TuxTextView) mo60864a(R.id.ar5);
            C89219l.m154716b(tuxTextView, "");
            tuxTextView.setVisibility(i);
            TuxTextView tuxTextView2 = (TuxTextView) mo60864a(R.id.ar4);
            C89219l.m154716b(tuxTextView2, "");
            tuxTextView2.setVisibility(i);
            TuxButton tuxButton = (TuxButton) mo60864a(R.id.arc);
            C89219l.m154716b(tuxButton, "");
            tuxButton.setVisibility(i);
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20527q.C20528a.m38714a(vm1, bVar);
    }

    /* renamed from: a */
    public final void mo60867a(String str, Boolean bool) {
        if (str != null && C89219l.m154714a((Object) bool, (Object) true) && mo60864a(R.id.ar1) != null) {
            SmartImageView smartImageView = (SmartImageView) mo60864a(R.id.ar1);
            C89219l.m154716b(smartImageView, "");
            smartImageView.setVisibility(0);
            C20766v a = C20761r.m39061a(str);
            a.f49092E = (SmartImageView) mo60864a(R.id.ar1);
            a.mo34179a(f81381m).mo34186c();
        } else if (mo60864a(R.id.ar1) != null) {
            SmartImageView smartImageView2 = (SmartImageView) mo60864a(R.id.ar1);
            C89219l.m154716b(smartImageView2, "");
            smartImageView2.setVisibility(8);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.badge.f$b */
    static final class C34439b extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, C34451k, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C34437f f81394a;

        static {
            Covode.recordClassIndex(41387);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34439b(C34437f fVar) {
            super(2);
            this.f81394a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, C34451k kVar) {
            String str;
            C34451k kVar2 = kVar;
            C89219l.m154721d(iVar, "");
            if (kVar2 != null) {
                if (kVar2.f81418e) {
                    this.f81394a.mo60865a().mo27384f();
                    this.f81394a.mo60868a(true);
                } else if (!kVar2.f81419f) {
                    this.f81394a.mo60865a().mo27387h();
                    this.f81394a.mo60868a(true);
                } else if (kVar2.f81416c == null || !(!kVar2.f81416c.isEmpty())) {
                    this.f81394a.mo60865a().mo27387h();
                    this.f81394a.mo60868a(true);
                } else {
                    this.f81394a.mo60865a().mo27385g();
                    this.f81394a.mo60868a(false);
                    String str2 = C68030bp.m120331a().f152380b;
                    if (C80538hl.m139614a(str2)) {
                        TuxTextView tuxTextView = (TuxTextView) this.f81394a.mo60864a(R.id.ard);
                        C89219l.m154716b(tuxTextView, "");
                        tuxTextView.setText(str2);
                    }
                    TuxTextView tuxTextView2 = (TuxTextView) this.f81394a.mo60864a(R.id.ar5);
                    C89219l.m154716b(tuxTextView2, "");
                    C34435d dVar = kVar2.f81417d;
                    String str3 = null;
                    if (dVar != null) {
                        str = dVar.getName();
                    } else {
                        str = null;
                    }
                    tuxTextView2.setText(str);
                    TuxTextView tuxTextView3 = (TuxTextView) this.f81394a.mo60864a(R.id.ar4);
                    C89219l.m154716b(tuxTextView3, "");
                    C34435d dVar2 = kVar2.f81417d;
                    if (dVar2 != null) {
                        str3 = dVar2.getDescription();
                    }
                    tuxTextView3.setText(str3);
                    C34437f fVar = this.f81394a;
                    this.f81394a.getContext();
                    fVar.f81388f = new GridLayoutManager(C34437f.f81379i);
                    this.f81394a.f81387e = new C34431c(this.f81394a, kVar2.f81416c, this.f81394a.f81390h);
                    RecyclerView recyclerView = (RecyclerView) this.f81394a.mo60864a(R.id.arb);
                    C89219l.m154716b(recyclerView, "");
                    recyclerView.setLayoutManager(this.f81394a.f81388f);
                    RecyclerView recyclerView2 = (RecyclerView) this.f81394a.mo60864a(R.id.arb);
                    C89219l.m154716b(recyclerView2, "");
                    recyclerView2.setAdapter(this.f81394a.f81387e);
                }
            }
            return C89391z.f203057a;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        Window window;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        DmtStatusView.C17269a a = DmtStatusView.C17269a.m31905a(getContext());
        a.mo27397a().mo27400a(2131232924, R.string.gzs, R.string.gzr, R.string.gzy, new View$OnClickListenerC34440c(this));
        ((DmtStatusView) mo60864a(R.id.e7i)).mo27382d();
        ((DmtStatusView) mo60864a(R.id.e7i)).setBuilder(a);
        Dialog dialog = getDialog();
        if (!(dialog == null || (window = dialog.getWindow()) == null)) {
            window.setLayout(-1, -1);
            window.setGravity(80);
            window.setBackgroundDrawableResource(R.color.l);
        }
        if (mo60864a(R.id.ar0) != null) {
            C20766v a2 = C20761r.m39060a(C34735v.m70965a(C80630u.m139797a(this.f81390h)));
            a2.f49092E = (SmartImageView) mo60864a(R.id.ar0);
            a2.mo34179a(f81381m).mo34186c();
        }
        ProfileBadgeStruct profileBadge = this.f81390h.getProfileBadge();
        Boolean bool = null;
        if (profileBadge != null) {
            str = profileBadge.getUrl();
        } else {
            str = null;
        }
        ProfileBadgeStruct profileBadge2 = this.f81390h.getProfileBadge();
        if (profileBadge2 != null) {
            bool = Boolean.valueOf(profileBadge2.getShouldShow());
        }
        mo60867a(str, bool);
        ((RelativeLayout) mo60864a(R.id.are)).setOnClickListener(new View$OnClickListenerC34442e(this));
        ((TuxButton) mo60864a(R.id.arc)).setOnClickListener(new C34443f(this));
        mo60869b().mo60841a();
        AbstractC88412b unused = selectSubscribe(mo60869b(), C34447g.f81406a, new C20370ah(), new C34439b(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.aym, viewGroup, false);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af> AbstractC88412b subscribe(JediViewModel<S> jediViewModel, C20370ah<S> ahVar, AbstractC89183m<? super AbstractC20477i, ? super S, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20527q.C20528a.m38708a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20527q.C20528a.m38709a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, C20370ah<C20374al<A, B>> ahVar, AbstractC89187q<? super AbstractC20477i, ? super A, ? super B, C89391z> qVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(qVar, "");
        return AbstractC20527q.C20528a.m38711a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, T> AbstractC88412b asyncSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends AbstractC20362a<? extends T>> kVar, C20370ah<C20373ak<AbstractC20362a<T>>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super Throwable, C89391z> mVar, AbstractC89172b<? super AbstractC20477i, C89391z> bVar, AbstractC89183m<? super AbstractC20477i, ? super T, C89391z> mVar2) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        return AbstractC20527q.C20528a.m38710a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B, C> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, C20370ah<C20375am<A, B, C>> ahVar, AbstractC89188r<? super AbstractC20477i, ? super A, ? super B, ? super C, C89391z> rVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(rVar, "");
        return AbstractC20527q.C20528a.m38712a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B, C, D> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, AbstractC89290k<S, ? extends D> kVar4, C20370ah<C20376an<A, B, C, D>> ahVar, AbstractC89189s<? super AbstractC20477i, ? super A, ? super B, ? super C, ? super D, C89391z> sVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(kVar4, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(sVar, "");
        return AbstractC20527q.C20528a.m38713a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}
