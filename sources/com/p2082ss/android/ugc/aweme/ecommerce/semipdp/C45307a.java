package com.p2082ss.android.ugc.aweme.ecommerce.semipdp;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.C0643b;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.jedi.arch.AbstractC20362a;
import com.bytedance.jedi.arch.AbstractC20367ae;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.AbstractC20380ar;
import com.bytedance.jedi.arch.AbstractC20477i;
import com.bytedance.jedi.arch.AbstractC20527q;
import com.bytedance.jedi.arch.AbstractC20534v;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.C20373ak;
import com.bytedance.jedi.arch.C20374al;
import com.bytedance.jedi.arch.C20375am;
import com.bytedance.jedi.arch.C20376an;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.keva.Keva;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.services.apm.api.C22708a;
import com.bytedance.tux.badge.TuxAlertBadge;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.navigation.p1723a.C23187b;
import com.bytedance.tux.p1717e.C23073a;
import com.bytedance.tux.p1722h.C23163i;
import com.bytedance.tux.sheet.AbstractC23218b;
import com.bytedance.tux.sheet.sheet.C23226a;
import com.bytedance.tux.status.TuxStatusView;
import com.p2082ss.android.ugc.aweme.base.arch.C34499i;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.Image;
import com.p2082ss.android.ugc.aweme.ecommerce.cart.C43625a;
import com.p2082ss.android.ugc.aweme.ecommerce.p2818a.C43313a;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2851c.C44766a;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.CartEntry;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.FirstNotice;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductBase;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPackStruct;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.SellerInfo;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ThirdParty;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.view.compat.C44998a;
import com.p2082ss.android.ugc.aweme.ecommerce.semipdp.SemiPdpStarter;
import com.p2082ss.android.ugc.aweme.ecommerce.semipdp.SemiPdpViewModel;
import com.p2082ss.android.ugc.aweme.ecommerce.semipdp.p2855a.C45333a;
import com.p2082ss.android.ugc.aweme.ecommerce.semipdp.p2855a.C45336b;
import com.p2082ss.android.ugc.aweme.ecommerce.track.C45546d;
import com.p2082ss.android.ugc.aweme.ecommerce.util.C45562g;
import com.p2082ss.android.ugc.aweme.ecommerce.util.C45563h;
import com.p2082ss.android.ugc.aweme.ecommerce.util.C45565j;
import com.p2082ss.android.ugc.aweme.ecommerce.util.C45573n;
import com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp;
import com.p2082ss.android.ugc.aweme.utils.ActivityStack;
import com.p2082ss.android.ugc.aweme.video.AbstractC80747i;
import com.p2082ss.android.ugc.aweme.video.C81079v;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89271h;
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.semipdp.a */
public final class C45307a extends Fragment implements AbstractC20380ar<C34499i>, AbstractC20527q, AbstractC23218b {

    /* renamed from: d */
    public static final float f105603d = ((((float) C45563h.f106106b) - C45563h.m88110a()) + 100.0f);

    /* renamed from: e */
    public static final C45312d f105604e = new C45312d((byte) 0);

    /* renamed from: a */
    public final C34499i f105605a = new C34499i();

    /* renamed from: b */
    public C45333a f105606b;

    /* renamed from: c */
    public C45336b f105607c;

    /* renamed from: f */
    private final lifecycleAwareLazy f105608f;

    /* renamed from: g */
    private final AbstractC89244h f105609g;

    /* renamed from: h */
    private boolean f105610h;

    /* renamed from: i */
    private SparseArray f105611i;

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.semipdp.a$b */
    public static final class C45309b extends AbstractC89220m implements AbstractC89183m<SemiPdpState, Bundle, SemiPdpState> {
        public static final C45309b INSTANCE = new C45309b();

        static {
            Covode.recordClassIndex(53768);
        }

        public C45309b() {
            super(2);
        }

        public final SemiPdpState invoke(SemiPdpState semiPdpState, Bundle bundle) {
            C89219l.m154719c(semiPdpState, "");
            return semiPdpState;
        }
    }

    /* renamed from: a */
    public final View mo76413a(int i) {
        if (this.f105611i == null) {
            this.f105611i = new SparseArray();
        }
        View view = (View) this.f105611i.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f105611i.put(i, findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final SemiPdpViewModel mo76414a() {
        return (SemiPdpViewModel) this.f105608f.getValue();
    }

    /* renamed from: b */
    public final C45350k mo76415b() {
        return (C45350k) this.f105609g.getValue();
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.semipdp.a$d */
    public static final class C45312d {
        static {
            Covode.recordClassIndex(53771);
        }

        private C45312d() {
        }

        public /* synthetic */ C45312d(byte b) {
            this();
        }
    }

    /* Return type fixed from 'androidx.lifecycle.ad$b' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20380ar
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C34499i mo33721d() {
        return this.f105605a;
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

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.semipdp.a$e */
    static final class C45313e extends AbstractC89220m implements AbstractC89171a<C45350k> {

        /* renamed from: a */
        final /* synthetic */ C45307a f105618a;

        static {
            Covode.recordClassIndex(53772);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45313e(C45307a aVar) {
            super(0);
            this.f105618a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C45350k invoke() {
            return new C45350k(this.f105618a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.semipdp.a$s */
    public static final class RunnableC45330s implements Runnable {

        /* renamed from: a */
        public static final RunnableC45330s f105642a = new RunnableC45330s();

        static {
            Covode.recordClassIndex(53789);
        }

        RunnableC45330s() {
        }

        public final void run() {
            C81079v.m140776O().mo123908B();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.semipdp.a$h */
    static final class C45316h extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C45307a f105621a;

        static {
            Covode.recordClassIndex(53775);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45316h(C45307a aVar) {
            super(2);
            this.f105621a = aVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.semipdp.a$h$a */
        static final class C45317a extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ C45316h f105622a;

            /* renamed from: b */
            final /* synthetic */ Integer f105623b;

            static {
                Covode.recordClassIndex(53776);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C45317a(C45316h hVar, Integer num) {
                super(0);
                this.f105622a = hVar;
                this.f105623b = num;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                this.f105622a.f105621a.mo76414a().mo76409b();
                return C89391z.f203057a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.semipdp.a$h$b */
        static final class C45318b extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ C45316h f105624a;

            /* renamed from: b */
            final /* synthetic */ Integer f105625b;

            static {
                Covode.recordClassIndex(53777);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C45318b(C45316h hVar, Integer num) {
                super(0);
                this.f105624a = hVar;
                this.f105625b = num;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                this.f105624a.f105621a.mo76414a().mo76409b();
                return C89391z.f203057a;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Integer num) {
            String str;
            Integer num2 = num;
            C89219l.m154721d(iVar, "");
            View view = this.f105621a.getView();
            if (view != null) {
                if (num2 != null) {
                    if (num2.intValue() == -1) {
                        C45349j a = this.f105621a.mo76414a().mo76402a();
                        if (a != null) {
                            if (this.f105621a.mo76414a().f105583d) {
                                str = "full_screen";
                            } else {
                                str = "half_screen";
                            }
                            HashMap<String, Object> h = this.f105621a.mo76414a().mo76412h();
                            C89219l.m154721d(str, "");
                            C89219l.m154721d(h, "");
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            linkedHashMap.put("page_show_type", str);
                            linkedHashMap.putAll(h);
                            a.mo76429b("tiktokec_enter_product_detail", linkedHashMap);
                        }
                        TuxStatusView tuxStatusView = (TuxStatusView) this.f105621a.mo76413a(R.id.e7i);
                        if (tuxStatusView != null) {
                            tuxStatusView.setVisibility(8);
                        }
                        C45336b b = C45307a.m87907b(this.f105621a);
                        if (b != null) {
                            b.setSpecialIllegalState(false);
                        }
                    } else if (num2.intValue() == 0) {
                        TuxStatusView tuxStatusView2 = (TuxStatusView) this.f105621a.mo76413a(R.id.e7i);
                        if (tuxStatusView2 != null) {
                            tuxStatusView2.setVisibility(0);
                        }
                        TuxStatusView tuxStatusView3 = (TuxStatusView) this.f105621a.mo76413a(R.id.e7i);
                        if (tuxStatusView3 != null) {
                            tuxStatusView3.mo37867a();
                        }
                    }
                }
                if (num2 != null) {
                    if (num2.intValue() == 3) {
                        TuxStatusView tuxStatusView4 = (TuxStatusView) this.f105621a.mo76413a(R.id.e7i);
                        if (tuxStatusView4 != null) {
                            tuxStatusView4.setVisibility(0);
                        }
                        TuxStatusView tuxStatusView5 = (TuxStatusView) this.f105621a.mo76413a(R.id.e7i);
                        if (tuxStatusView5 != null) {
                            tuxStatusView5.setStatus(C45565j.m88113b(true, new C45317a(this, num2)));
                        }
                    } else if (num2.intValue() == 4) {
                        TuxStatusView tuxStatusView6 = (TuxStatusView) this.f105621a.mo76413a(R.id.e7i);
                        if (tuxStatusView6 != null) {
                            tuxStatusView6.setVisibility(0);
                        }
                        TuxStatusView tuxStatusView7 = (TuxStatusView) this.f105621a.mo76413a(R.id.e7i);
                        if (tuxStatusView7 != null) {
                            TuxStatusView.C23263c cVar = new TuxStatusView.C23263c();
                            String string = view.getResources().getString(R.string.bgv);
                            C89219l.m154716b(string, "");
                            cVar.mo37879a(string);
                            String string2 = view.getResources().getString(R.string.bgu);
                            C89219l.m154716b(string2, "");
                            cVar.mo37878a((CharSequence) string2);
                            cVar.mo37876a(0, R.drawable.z4);
                            tuxStatusView7.setStatus(cVar);
                        }
                    } else if (num2.intValue() == 5) {
                        TuxStatusView tuxStatusView8 = (TuxStatusView) this.f105621a.mo76413a(R.id.e7i);
                        if (tuxStatusView8 != null) {
                            tuxStatusView8.setVisibility(0);
                        }
                        TuxStatusView tuxStatusView9 = (TuxStatusView) this.f105621a.mo76413a(R.id.e7i);
                        if (tuxStatusView9 != null) {
                            TuxStatusView.C23263c cVar2 = new TuxStatusView.C23263c();
                            String string3 = view.getResources().getString(R.string.bgt);
                            C89219l.m154716b(string3, "");
                            cVar2.mo37879a(string3);
                            String string4 = view.getResources().getString(R.string.bgs);
                            C89219l.m154716b(string4, "");
                            cVar2.mo37878a((CharSequence) string4);
                            cVar2.mo37876a(0, R.drawable.yv);
                            tuxStatusView9.setStatus(cVar2);
                        }
                    }
                }
                TuxStatusView tuxStatusView10 = (TuxStatusView) this.f105621a.mo76413a(R.id.e7i);
                if (tuxStatusView10 != null) {
                    tuxStatusView10.setVisibility(0);
                }
                TuxStatusView tuxStatusView11 = (TuxStatusView) this.f105621a.mo76413a(R.id.e7i);
                if (tuxStatusView11 != null) {
                    tuxStatusView11.setStatus(C45565j.m88113b(true, new C45318b(this, num2)));
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.semipdp.a$a */
    public static final class C45308a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f105612a;

        static {
            Covode.recordClassIndex(53767);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45308a(AbstractC89277c cVar) {
            super(0);
            this.f105612a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            String name = C89170a.m154665a(this.f105612a).getName();
            C89219l.m154709a((Object) name, "");
            return name;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.semipdp.a$u */
    static final class C45332u extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ View f105647a;

        static {
            Covode.recordClassIndex(53791);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45332u(View view) {
            super(0);
            this.f105647a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            View view = this.f105647a;
            C89219l.m154716b(view, "");
            C23226a.C23228b.m43787a(view);
            return C89391z.f203057a;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f105611i;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.semipdp.a$q */
    static final class C45328q extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C45307a f105639a;

        static {
            Covode.recordClassIndex(53787);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45328q(C45307a aVar) {
            super(0);
            this.f105639a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f105639a.mo76414a().mo76407a("return");
            this.f105639a.mo76414a().mo33689c(SemiPdpViewModel.C45299a.f105591a);
            return C89391z.f203057a;
        }
    }

    static {
        Covode.recordClassIndex(53766);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        if (mo76414a().f105583d) {
            AbstractC81915c.m141874a(new C43313a(false, getContext()));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        AbstractC81915c.m141874a(new C43313a(true, getContext()));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        mo76414a().mo76402a().f105682b = SystemClock.elapsedRealtime();
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.semipdp.a$c */
    public static final class C45310c extends AbstractC89220m implements AbstractC89171a<SemiPdpViewModel> {

        /* renamed from: a */
        final /* synthetic */ Fragment f105613a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f105614b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f105615c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89183m f105616d;

        static {
            Covode.recordClassIndex(53769);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45310c(Fragment fragment, AbstractC89171a aVar, AbstractC89277c cVar, AbstractC89183m mVar) {
            super(0);
            this.f105613a = fragment;
            this.f105614b = aVar;
            this.f105615c = cVar;
            this.f105616d = mVar;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, com.ss.android.ugc.aweme.ecommerce.semipdp.SemiPdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.ecommerce.semipdp.SemiPdpViewModel invoke() {
            /*
                r3 = this;
                androidx.fragment.app.Fragment r1 = r3.f105613a
                r0 = r1
                com.bytedance.jedi.arch.ar r0 = (com.bytedance.jedi.arch.AbstractC20380ar) r0
                androidx.lifecycle.ad$b r0 = r0.mo33721d()
                androidx.lifecycle.ad r2 = androidx.lifecycle.C1181ae.m3879a(r1, r0)
                h.f.a.a r0 = r3.f105614b
                java.lang.Object r1 = r0.invoke()
                java.lang.String r1 = (java.lang.String) r1
                h.k.c r0 = r3.f105615c
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                androidx.lifecycle.ac r2 = m87915xacc77eb2(r2, r1, r0)
                com.bytedance.jedi.arch.JediViewModel r2 = (com.bytedance.jedi.arch.JediViewModel) r2
                com.bytedance.jedi.arch.z r1 = r2.f48234j
                java.lang.Class<com.ss.android.ugc.aweme.ecommerce.semipdp.SemiPdpViewModel> r0 = com.p2082ss.android.ugc.aweme.ecommerce.semipdp.SemiPdpViewModel.class
                com.bytedance.jedi.arch.y r1 = r1.mo33696a(r0)
                if (r1 == 0) goto L_0x0033
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154709a(r2, r0)
                r1.binding(r2)
            L_0x0033:
                com.ss.android.ugc.aweme.ecommerce.semipdp.a$c$1 r0 = new com.ss.android.ugc.aweme.ecommerce.semipdp.a$c$1
                r0.<init>(r3)
                r2.mo33686a_(r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.semipdp.C45307a.C45310c.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_ecommerce_semipdp_SemiPdpFragment$$special$$inlined$viewModel$3_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m87915xacc77eb2(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.semipdp.a$o */
    static final class C45326o extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C45307a f105636a;

        static {
            Covode.recordClassIndex(53785);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45326o(C45307a aVar) {
            super(0);
            this.f105636a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            SellerInfo sellerInfo;
            String str;
            ProductPackStruct productPackStruct = this.f105636a.mo76414a().f105580a;
            if (!(productPackStruct == null || (sellerInfo = productPackStruct.f104676d) == null || (str = sellerInfo.f104709f) == null)) {
                SemiPdpViewModel a = this.f105636a.mo76414a();
                Context context = this.f105636a.getContext();
                if (context == null) {
                    C89219l.m154715b();
                }
                C89219l.m154716b(context, "");
                a.mo76405a(context, str);
            }
            C45349j a2 = this.f105636a.mo76414a().mo76402a();
            if (a2 != null) {
                a2.mo76427a("show_window", (String) null);
            }
            return C89391z.f203057a;
        }
    }

    public C45307a() {
        AbstractC89277c a = C89204ab.m154669a(SemiPdpViewModel.class);
        C45308a aVar = new C45308a(a);
        this.f105608f = new lifecycleAwareLazy(this, aVar, new C45310c(this, aVar, a, C45309b.INSTANCE));
        this.f105609g = C89250i.m154773a((AbstractC89171a) new C45313e(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.semipdp.a$r */
    static final class C45329r extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C45307a f105640a;

        /* renamed from: b */
        final /* synthetic */ Context f105641b;

        static {
            Covode.recordClassIndex(53788);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45329r(C45307a aVar, Context context) {
            super(0);
            this.f105640a = aVar;
            this.f105641b = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            HashMap<String, Object> hashMap;
            Object obj;
            Object obj2;
            Object obj3;
            Object obj4;
            ProductBase productBase;
            List<Image> list;
            Image image;
            List<String> urls;
            Object g;
            SellerInfo sellerInfo;
            ProductBase productBase2;
            SellerInfo sellerInfo2;
            Context context = this.f105641b;
            AbstractC0952i fragmentManager = this.f105640a.getFragmentManager();
            SemiPdpViewModel a = this.f105640a.mo76414a();
            C89378p[] pVarArr = new C89378p[6];
            SemiPdpStarter.SemiPdpEnterParams semiPdpEnterParams = a.f105581b;
            Object obj5 = "";
            if (semiPdpEnterParams == null || (hashMap = semiPdpEnterParams.getTrackParams()) == null) {
                hashMap = obj5;
            }
            pVarArr[0] = new C89378p("trackParams", hashMap);
            ProductPackStruct productPackStruct = a.f105580a;
            if (productPackStruct == null || (sellerInfo2 = productPackStruct.f104676d) == null || (obj = sellerInfo2.f104705b) == null) {
                obj = obj5;
            }
            pVarArr[1] = new C89378p("store_name", obj);
            ProductPackStruct productPackStruct2 = a.f105580a;
            if (productPackStruct2 == null || (productBase2 = productPackStruct2.f104677e) == null || (obj2 = productBase2.f104657a) == null) {
                obj2 = obj5;
            }
            pVarArr[2] = new C89378p("product_name", obj2);
            ProductPackStruct productPackStruct3 = a.f105580a;
            if (productPackStruct3 == null || (obj3 = productPackStruct3.f104674b) == null) {
                obj3 = obj5;
            }
            pVarArr[3] = new C89378p("product_id", obj3);
            ProductPackStruct productPackStruct4 = a.f105580a;
            if (productPackStruct4 == null || (sellerInfo = productPackStruct4.f104676d) == null || (obj4 = sellerInfo.f104704a) == null) {
                obj4 = obj5;
            }
            pVarArr[4] = new C89378p("shop_id", obj4);
            ProductPackStruct productPackStruct5 = a.f105580a;
            if (!(productPackStruct5 == null || (productBase = productPackStruct5.f104677e) == null || (list = productBase.f104660d) == null || (image = (Image) C89070n.m154583g((List) list)) == null || (urls = image.getUrls()) == null || (g = C89070n.m154583g((List) urls)) == null)) {
                obj5 = g;
            }
            pVarArr[5] = new C89378p("product_image_url", obj5);
            IPdpStarter.C44631a.m87370a(context, fragmentManager, C89041ag.m154428c(pVarArr), null);
            return C89391z.f203057a;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        String str;
        int i;
        super.onStop();
        if (ActivityStack.isAppBackGround()) {
            mo76414a().mo76407a("close");
        }
        SemiPdpViewModel a = mo76414a();
        C45349j jVar = a.f105590n;
        if (jVar == null) {
            C89219l.m154710a("logger");
            return;
        }
        if (a.f105583d) {
            str = "full_screen";
        } else {
            str = "half_screen";
        }
        int size = a.f105589m.size();
        boolean z = a.f105587k;
        if (a.f105580a != null) {
            i = 1;
        } else {
            i = 0;
        }
        String str2 = a.f105586g;
        HashMap<String, Object> h = a.mo76412h();
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(h, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("page_show_type", str);
        linkedHashMap.put("main_photo_view_cnt", Integer.valueOf(size));
        linkedHashMap.put("is_image_clicked", Integer.valueOf(z ? 1 : 0));
        linkedHashMap.put("is_load_data", Integer.valueOf(i));
        linkedHashMap.put("quit_type", str2);
        linkedHashMap.put("stay_time", Long.valueOf(SystemClock.elapsedRealtime() - jVar.f105682b));
        linkedHashMap.putAll(h);
        jVar.mo76429b("tiktokec_stay_product_detail", linkedHashMap);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.semipdp.a$p */
    static final class C45327p extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C45307a f105637a;

        /* renamed from: b */
        final /* synthetic */ Context f105638b;

        static {
            Covode.recordClassIndex(53786);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45327p(C45307a aVar, Context context) {
            super(0);
            this.f105637a = aVar;
            this.f105638b = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            FirstNotice firstNotice;
            AbstractC0952i iVar;
            ThirdParty thirdParty;
            ThirdParty thirdParty2;
            C45349j a = this.f105637a.mo76414a().mo76402a();
            String str = null;
            if (a != null) {
                a.mo76427a("open_3rd_party_buy", (String) null);
            }
            if (this.f105637a.mo76414a().mo76411g()) {
                C45307a aVar = this.f105637a;
                View a2 = C1764a.m5927a(LayoutInflater.from(aVar.getContext()), R.layout.qq, null, false);
                ProductPackStruct productPackStruct = aVar.mo76414a().f105580a;
                if (productPackStruct == null || (thirdParty2 = productPackStruct.f104688p) == null) {
                    firstNotice = null;
                } else {
                    firstNotice = thirdParty2.f104721f;
                }
                if (firstNotice == null) {
                    aVar.mo76414a();
                    SemiPdpViewModel.m87890b(aVar.getContext());
                } else {
                    if (a2 != null) {
                        TuxButton tuxButton = (TuxButton) a2.findViewById(R.id.dzd);
                        C89219l.m154716b(tuxButton, "");
                        tuxButton.setOnClickListener(new C45331t(a2, aVar, firstNotice));
                        C20766v a3 = C45562g.m88109a((Object) firstNotice.f104635a);
                        a3.f49092E = (SmartImageView) a2.findViewById(R.id.d2k);
                        a3.mo34186c();
                        TuxTextView tuxTextView = (TuxTextView) a2.findViewById(R.id.dzr);
                        C89219l.m154716b(tuxTextView, "");
                        tuxTextView.setText(firstNotice.f104636b);
                        TuxTextView tuxTextView2 = (TuxTextView) a2.findViewById(R.id.dzi);
                        C89219l.m154716b(tuxTextView2, "");
                        tuxTextView2.setText(firstNotice.f104637c);
                        TuxButton tuxButton2 = (TuxButton) a2.findViewById(R.id.dzd);
                        C89219l.m154716b(tuxButton2, "");
                        tuxButton2.setText(firstNotice.f104638d);
                    }
                    C45349j a4 = aVar.mo76414a().mo76402a();
                    if (a4 != null) {
                        C89219l.m154721d("3rd_party_notice", "");
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("actionsheet_name", "3rd_party_notice");
                        a4.mo76429b("tiktokec_enter_actionsheet", linkedHashMap);
                    }
                    C23226a.C23227a aVar2 = new C23226a.C23227a();
                    C89219l.m154716b(a2, "");
                    C23226a.C23227a a5 = aVar2.mo37816a(a2).mo37812a(0);
                    TuxNavBar.C23179a aVar3 = new TuxNavBar.C23179a();
                    C23187b a6 = new C23187b().mo37738a(R.raw.icon_x_mark_small);
                    a6.f54930b = true;
                    C23226a aVar4 = a5.mo37818a(aVar3.mo37733b(a6.mo37741a((AbstractC89171a<C89391z>) new C45332u(a2)))).mo37823c().f55057a;
                    Context context = aVar.getContext();
                    if (!(context instanceof ActivityC0945e)) {
                        context = null;
                    }
                    ActivityC0945e eVar = (ActivityC0945e) context;
                    if (eVar != null) {
                        iVar = eVar.getSupportFragmentManager();
                    } else {
                        iVar = null;
                    }
                    aVar4.show(iVar, "semi_pdp_first_notice_sheet");
                    SemiPdpViewModel a7 = aVar.mo76414a();
                    try {
                        Keva keva = a7.f105582c;
                        if (keva != null) {
                            StringBuilder sb = new StringBuilder("notice_sheet_");
                            ProductPackStruct productPackStruct2 = a7.f105580a;
                            if (!(productPackStruct2 == null || (thirdParty = productPackStruct2.f104688p) == null)) {
                                str = thirdParty.f104716a;
                            }
                            keva.storeBoolean(sb.append(str).toString(), true);
                        }
                    } catch (Throwable unused) {
                        C22708a.m42800a("Keva Write Notice Sheet Shown Fail");
                    }
                }
            } else {
                this.f105637a.mo76414a().mo76404a(this.f105638b);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.semipdp.a$n */
    public static final class C45325n extends RecyclerView.AbstractC1371n {

        /* renamed from: a */
        public boolean f105632a;

        /* renamed from: b */
        public int f105633b;

        /* renamed from: c */
        public int f105634c;

        /* renamed from: d */
        final /* synthetic */ C45307a f105635d;

        static {
            Covode.recordClassIndex(53784);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C45325n(C45307a aVar) {
            this.f105635d = aVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4753a(RecyclerView recyclerView, int i) {
            C89219l.m154721d(recyclerView, "");
            super.mo4753a(recyclerView, i);
            if (i != this.f105634c && i == 0 && this.f105632a) {
                C45349j a = this.f105635d.mo76414a().mo76402a();
                if (a != null) {
                    a.mo76426a("fulltodetail");
                }
                this.f105632a = false;
            }
            this.f105634c = i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4754a(RecyclerView recyclerView, int i, int i2) {
            C89219l.m154721d(recyclerView, "");
            this.f105632a = true;
            this.f105633b += i2;
            this.f105635d.mo76414a().mo33689c(new SemiPdpViewModel.C45306h(this.f105633b));
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C45333a m87904a(C45307a aVar) {
        C45333a aVar2 = aVar.f105606b;
        if (aVar2 == null) {
            C89219l.m154710a("bottomView");
        }
        return aVar2;
    }

    /* renamed from: b */
    public static final /* synthetic */ C45336b m87907b(C45307a aVar) {
        C45336b bVar = aVar.f105607c;
        if (bVar == null) {
            C89219l.m154710a("headerView");
        }
        return bVar;
    }

    /* renamed from: a */
    private final void m87905a(float f) {
        C45333a aVar = this.f105606b;
        if (aVar == null) {
            C89219l.m154710a("bottomView");
        } else {
            aVar.setTranslationY(f);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.semipdp.a$t */
    public static final class C45331t extends AbstractView$OnClickListenerC80259bp {

        /* renamed from: a */
        final /* synthetic */ long f105643a = 700;

        /* renamed from: b */
        final /* synthetic */ View f105644b;

        /* renamed from: c */
        final /* synthetic */ C45307a f105645c;

        /* renamed from: d */
        final /* synthetic */ FirstNotice f105646d;

        static {
            Covode.recordClassIndex(53790);
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
        /* renamed from: a */
        public final void mo60873a(View view) {
            if (view != null) {
                C45349j a = this.f105645c.mo76414a().mo76402a();
                if (a != null) {
                    a.mo76427a("buy_now", "3rd_party_notice");
                }
                this.f105645c.mo76414a().mo76404a(this.f105645c.getContext());
                C23226a.C23228b.m43787a(this.f105644b);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45331t(View view, C45307a aVar, FirstNotice firstNotice) {
            super(700);
            this.f105644b = view;
            this.f105645c = aVar;
            this.f105646d = firstNotice;
        }
    }

    /* renamed from: a */
    private final void m87906a(boolean z) {
        if (isResumed() && this.f105610h) {
            if (z) {
                View view = getView();
                if (view != null) {
                    view.post(RunnableC45330s.f105642a);
                }
                C81079v.m140776O().mo123912F();
                return;
            }
            C81079v.m140776O().mo123913G();
            C81079v.m140776O().mo123950y();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        View view;
        View view2;
        View rootView;
        ViewGroup viewGroup;
        MethodCollector.m26663i(7997);
        super.onActivityCreated(bundle);
        if (getContext() != null) {
            FrameLayout frameLayout = null;
            if (mo76414a().f105585f) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
                layoutParams.gravity = 80;
                layoutParams2.gravity = 48;
                View view3 = getView();
                if (view3 instanceof FrameLayout) {
                    frameLayout = view3;
                }
                FrameLayout frameLayout2 = frameLayout;
                if (frameLayout2 != null) {
                    C45333a aVar = this.f105606b;
                    if (aVar == null) {
                        C89219l.m154710a("bottomView");
                    }
                    frameLayout2.addView(aVar, layoutParams);
                    C45336b bVar = this.f105607c;
                    if (bVar == null) {
                        C89219l.m154710a("headerView");
                    }
                    frameLayout2.addView(bVar, layoutParams2);
                }
                C45336b bVar2 = this.f105607c;
                if (bVar2 == null) {
                    C89219l.m154710a("headerView");
                    MethodCollector.m26664o(7997);
                    return;
                }
                ((TuxIconView) bVar2.mo76422a(R.id.a73)).setIconRes(R.raw.icon_arrow_left_ltr);
                MethodCollector.m26664o(7997);
                return;
            }
            if (!(Build.VERSION.SDK_INT < 21 || (view2 = getView()) == null || (rootView = view2.getRootView()) == null || (viewGroup = (ViewGroup) rootView.findViewById(R.id.ajx)) == null)) {
                viewGroup.setElevation(0.0f);
            }
            View view4 = getView();
            if (view4 != null) {
                view = C45573n.m88119a(view4);
            } else {
                view = null;
            }
            CoordinatorLayout.C0560e eVar = new CoordinatorLayout.C0560e(-1, -2);
            CoordinatorLayout.C0560e eVar2 = new CoordinatorLayout.C0560e(-1, -2);
            eVar.f2418c = 80;
            eVar2.f2418c = 48;
            if (view instanceof CoordinatorLayout) {
                frameLayout = view;
            }
            CoordinatorLayout coordinatorLayout = frameLayout;
            if (coordinatorLayout != null) {
                C45333a aVar2 = this.f105606b;
                if (aVar2 == null) {
                    C89219l.m154710a("bottomView");
                }
                coordinatorLayout.addView(aVar2, eVar);
                C45336b bVar3 = this.f105607c;
                if (bVar3 == null) {
                    C89219l.m154710a("headerView");
                }
                coordinatorLayout.addView(bVar3, eVar2);
            }
            C45336b bVar4 = this.f105607c;
            if (bVar4 == null) {
                C89219l.m154710a("headerView");
            } else {
                bVar4.setVisibility(8);
                MethodCollector.m26664o(7997);
                return;
            }
        }
        MethodCollector.m26664o(7997);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Serializable serializable;
        boolean z;
        boolean z2;
        HashMap<String, Object> hashMap;
        Integer num;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        ProductPackStruct productPackStruct = null;
        if (arguments != null) {
            serializable = arguments.getSerializable("ENTER_PARAMS");
        } else {
            serializable = null;
        }
        if (!(serializable instanceof SemiPdpStarter.SemiPdpEnterParams)) {
            serializable = null;
        }
        SemiPdpStarter.SemiPdpEnterParams semiPdpEnterParams = (SemiPdpStarter.SemiPdpEnterParams) serializable;
        mo76414a().f105581b = semiPdpEnterParams;
        SemiPdpViewModel a = mo76414a();
        if (semiPdpEnterParams != null) {
            z = semiPdpEnterParams.getFullScreen();
        } else {
            z = false;
        }
        a.mo76408a(z);
        SemiPdpViewModel a2 = mo76414a();
        if (semiPdpEnterParams != null) {
            z2 = semiPdpEnterParams.getFullScreen();
        } else {
            z2 = false;
        }
        a2.f105585f = z2;
        SemiPdpViewModel a3 = mo76414a();
        if (semiPdpEnterParams != null) {
            hashMap = semiPdpEnterParams.getTrackParams();
        } else {
            hashMap = null;
        }
        C45349j jVar = new C45349j(hashMap);
        LinkedHashMap<String, Object> linkedHashMap = jVar.f105681a;
        HashMap<String, Object> hashMap2 = jVar.f105683c;
        if (hashMap2 != null) {
            linkedHashMap.putAll(hashMap2);
        }
        linkedHashMap.put("page_name", "semi_product_detail");
        linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        C89219l.m154721d(jVar, "");
        a3.f105590n = jVar;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            num = Integer.valueOf(arguments2.getInt("ERROR_CODE"));
        } else {
            num = null;
        }
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            productPackStruct = (ProductPackStruct) arguments3.getParcelable("product_info");
        }
        if (num != null) {
            if (num.intValue() == 0 && productPackStruct != null) {
                mo76414a().mo76406a(productPackStruct);
                mo76414a().mo76403a(0);
                return;
            } else if (num.intValue() != 0) {
                mo76414a().mo76403a(num.intValue());
                return;
            }
        }
        mo76414a().mo76403a(-99999);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20527q.C20528a.m38714a(vm1, bVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.semipdp.a$l */
    static final class C45323l extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, List<? extends Object>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C45307a f105630a;

        static {
            Covode.recordClassIndex(53782);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45323l(C45307a aVar) {
            super(2);
            this.f105630a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, List<? extends Object> list) {
            List<? extends Object> list2 = list;
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(list2, "");
            this.f105630a.mo76415b().mo60931a(list2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.semipdp.a$j */
    static final class C45321j extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C45307a f105628a;

        static {
            Covode.recordClassIndex(53780);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45321j(C45307a aVar) {
            super(2);
            this.f105628a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
            java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            	at java.base/java.util.Objects.checkIndex(Objects.java:359)
            	at java.base/java.util.ArrayList.get(ArrayList.java:427)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
            */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ p4600h.C89391z invoke(com.bytedance.jedi.arch.AbstractC20477i r3, java.lang.Boolean r4) {
            /*
                r2 = this;
                java.lang.Boolean r4 = (java.lang.Boolean) r4
                boolean r1 = r4.booleanValue()
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154721d(r3, r0)
                if (r1 == 0) goto L_0x0022
                com.ss.android.ugc.aweme.ecommerce.semipdp.a r0 = r2.f105628a
                com.ss.android.ugc.aweme.ecommerce.semipdp.SemiPdpViewModel r0 = r0.mo76414a()
                boolean r0 = r0.f105585f
                if (r0 == 0) goto L_0x0025
                com.ss.android.ugc.aweme.ecommerce.semipdp.a r0 = r2.f105628a
                androidx.fragment.app.e r0 = r0.getActivity()
                if (r0 == 0) goto L_0x0022
                r0.finish()
            L_0x0022:
                h.z r0 = p4600h.C89391z.f203057a
                return r0
            L_0x0025:
                com.ss.android.ugc.aweme.ecommerce.semipdp.a r0 = r2.f105628a
                com.bytedance.tux.sheet.sheet.C23226a.C23228b.m43788a(r0)
                goto L_0x0022
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.semipdp.C45307a.C45321j.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.semipdp.a$k */
    static final class C45322k extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C45307a f105629a;

        static {
            Covode.recordClassIndex(53781);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45322k(C45307a aVar) {
            super(2);
            this.f105629a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Integer num) {
            String str;
            int i;
            ThirdParty thirdParty;
            int intValue = num.intValue();
            C89219l.m154721d(iVar, "");
            if (intValue != 1) {
                C45333a a = C45307a.m87904a(this.f105629a);
                ProductPackStruct productPackStruct = this.f105629a.mo76414a().f105580a;
                if (productPackStruct == null || (thirdParty = productPackStruct.f104688p) == null) {
                    str = null;
                } else {
                    str = thirdParty.f104719d;
                }
                TuxButton tuxButton = (TuxButton) a.mo76420a(R.id.a0k);
                C89219l.m154716b(tuxButton, "");
                tuxButton.setEnabled(false);
                TuxButton tuxButton2 = (TuxButton) a.mo76420a(R.id.a0k);
                C89219l.m154716b(tuxButton2, "");
                if (str == null) {
                    Context context = a.getContext();
                    C89219l.m154716b(context, "");
                    Resources resources = context.getResources();
                    if (intValue == 2) {
                        i = R.string.bg2;
                    } else {
                        i = R.string.bg8;
                    }
                    str = resources.getString(i);
                }
                tuxButton2.setText(str);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: b */
    private final void m87908b(C23226a aVar, int i) {
        if (i == 3) {
            ActivityC0945e activity = aVar.getActivity();
            if (activity == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(activity, "");
            Dialog dialog = aVar.getDialog();
            C89219l.m154716b(dialog, "");
            C23073a.C23074a.m43509a(activity, dialog).mo37499b(true).mo37493a().mo37504e(-16777216).mo37502c(true).mo37495a(false).f54627a.mo33415d();
            m87906a(true);
        } else if (i == 4 || i == 5) {
            ActivityC0945e activity2 = aVar.getActivity();
            if (activity2 == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(activity2, "");
            Dialog dialog2 = aVar.getDialog();
            C89219l.m154716b(dialog2, "");
            C23073a.C23074a.m43509a(activity2, dialog2).mo37499b(false).mo37493a().mo37504e(-16777216).mo37502c(true).mo37495a(false).f54627a.mo33415d();
            m87906a(false);
        }
        mo76414a().f105588l = i;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.semipdp.a$i */
    static final class C45319i extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, CartEntry, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C45307a f105626a;

        static {
            Covode.recordClassIndex(53778);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45319i(C45307a aVar) {
            super(2);
            this.f105626a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, CartEntry cartEntry) {
            HashMap<String, Object> hashMap;
            CartEntry cartEntry2 = cartEntry;
            C89219l.m154721d(iVar, "");
            C45336b b = C45307a.m87907b(this.f105626a);
            if (b != null) {
                SemiPdpStarter.SemiPdpEnterParams semiPdpEnterParams = this.f105626a.mo76414a().f105581b;
                C453201 r5 = new AbstractC89171a<C89391z>(this) {
                    /* class com.p2082ss.android.ugc.aweme.ecommerce.semipdp.C45307a.C45319i.C453201 */

                    /* renamed from: a */
                    final /* synthetic */ C45319i f105627a;

                    static {
                        Covode.recordClassIndex(53779);
                    }

                    {
                        this.f105627a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // p4600h.p4611f.p4612a.AbstractC89171a
                    public final /* synthetic */ C89391z invoke() {
                        HashMap<String, Object> hashMap;
                        HashMap<String, Object> hashMap2;
                        Object obj;
                        CartEntry cartEntry;
                        HashMap<String, Object> requestParams;
                        Context context = this.f105627a.f105626a.getContext();
                        SemiPdpStarter.SemiPdpEnterParams semiPdpEnterParams = this.f105627a.f105626a.mo76414a().f105581b;
                        String str = null;
                        if (semiPdpEnterParams != null) {
                            hashMap = semiPdpEnterParams.getTrackParams();
                        } else {
                            hashMap = null;
                        }
                        SemiPdpStarter.SemiPdpEnterParams semiPdpEnterParams2 = this.f105627a.f105626a.mo76414a().f105581b;
                        if (semiPdpEnterParams2 != null) {
                            hashMap2 = semiPdpEnterParams2.getRequestParams();
                        } else {
                            hashMap2 = null;
                        }
                        SemiPdpStarter.SemiPdpEnterParams semiPdpEnterParams3 = this.f105627a.f105626a.mo76414a().f105581b;
                        if (semiPdpEnterParams3 == null || (requestParams = semiPdpEnterParams3.getRequestParams()) == null) {
                            obj = null;
                        } else {
                            obj = requestParams.get("chain_key");
                        }
                        String str2 = (String) obj;
                        ProductPackStruct productPackStruct = this.f105627a.f105626a.mo76414a().f105580a;
                        if (!(productPackStruct == null || (cartEntry = productPackStruct.f104690r) == null)) {
                            str = cartEntry.f104633a;
                        }
                        C43625a.m86647a(context, hashMap, hashMap2, str2, "semi_product_detail", str);
                        return C89391z.f203057a;
                    }
                };
                if (cartEntry2 != null) {
                    if (!b.f105658d) {
                        b.f105658d = true;
                        HashMap hashMap2 = new HashMap();
                        if (semiPdpEnterParams == null || (hashMap = semiPdpEnterParams.getTrackParams()) == null) {
                            hashMap = new HashMap<>();
                        }
                        hashMap2.putAll(hashMap);
                        hashMap2.put("page_name", "semi_product_detail");
                        C45546d.m88094a("tiktokec_cart_entrance_show", hashMap2);
                    }
                    TuxIconView tuxIconView = (TuxIconView) b.mo76422a(R.id.e05);
                    C89219l.m154716b(tuxIconView, "");
                    tuxIconView.setVisibility(0);
                    Integer num = cartEntry2.f104634b;
                    if (num != null) {
                        int intValue = num.intValue();
                        if (intValue > 0) {
                            TuxAlertBadge tuxAlertBadge = (TuxAlertBadge) b.mo76422a(R.id.e07);
                            C89219l.m154716b(tuxAlertBadge, "");
                            tuxAlertBadge.setVisibility(0);
                            ((TuxAlertBadge) b.mo76422a(R.id.e07)).setCount(intValue);
                        }
                    }
                    TuxIconView tuxIconView2 = (TuxIconView) b.mo76422a(R.id.e05);
                    C89219l.m154716b(tuxIconView2, "");
                    tuxIconView2.setOnClickListener(new C45336b.C45339c(semiPdpEnterParams, r5));
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.semipdp.a$m */
    static final class C45324m extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C45307a f105631a;

        static {
            Covode.recordClassIndex(53783);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45324m(C45307a aVar) {
            super(2);
            this.f105631a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Integer num) {
            int intValue = num.intValue();
            C89219l.m154721d(iVar, "");
            C45336b b = C45307a.m87907b(this.f105631a);
            if (b != null && !b.f105656b) {
                float f = (float) intValue;
                if (f > b.f105655a) {
                    ((TuxIconView) b.mo76422a(R.id.a73)).setTintColor(C0643b.m2378c(b.getContext(), R.color.bx));
                    ((TuxIconView) b.mo76422a(R.id.clv)).setTintColor(C0643b.m2378c(b.getContext(), R.color.bx));
                    ((TuxIconView) b.mo76422a(R.id.e05)).setTintColor(C0643b.m2378c(b.getContext(), R.color.bx));
                } else {
                    ((TuxIconView) b.mo76422a(R.id.a73)).setTintColor(C0643b.m2378c(b.getContext(), R.color.a9));
                    ((TuxIconView) b.mo76422a(R.id.clv)).setTintColor(C0643b.m2378c(b.getContext(), R.color.a9));
                    ((TuxIconView) b.mo76422a(R.id.e05)).setTintColor(C0643b.m2378c(b.getContext(), R.color.a9));
                }
                View a = b.mo76422a(R.id.be4);
                C89219l.m154716b(a, "");
                a.setAlpha(C89271h.m154771c(f / b.f105655a, 1.0f));
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.tux.sheet.AbstractC23218b
    /* renamed from: a */
    public final void mo37805a(C23226a aVar, float f) {
        TuxStatusView tuxStatusView;
        C89219l.m154721d(aVar, "");
        if (f == 1.0f) {
            mo76414a().mo76408a(true);
        } else {
            mo76414a().mo76408a(false);
        }
        if (f <= 0.0f) {
            m87905a((-f) * C45563h.f106107c);
        } else {
            m87905a(0.0f);
        }
        if (f >= 0.0f && (tuxStatusView = (TuxStatusView) mo76413a(R.id.e7i)) != null) {
            C23163i.m43660a((View) tuxStatusView, (Integer) null, (Integer) null, (Integer) null, Integer.valueOf((int) (f105603d * (1.0f - f))), false, 23);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        String str;
        ThirdParty thirdParty;
        TuxStatusView tuxStatusView;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        ((RecyclerView) mo76413a(R.id.d03)).mo4402a(new C44998a(C0643b.m2378c(requireContext(), R.color.b7), 0, 0.0f, 6));
        mo76415b().mo67829d(false);
        RecyclerView recyclerView = (RecyclerView) mo76413a(R.id.d03);
        C89219l.m154716b(recyclerView, "");
        recyclerView.setAdapter(mo76415b());
        ((RecyclerView) mo76413a(R.id.d03)).mo4405a(new C45325n(this));
        Context context = getContext();
        if (context != null) {
            this.f105606b = new C45333a(context, new C45326o(this), new C45327p(this, context));
            C45336b bVar = new C45336b(context, new C45328q(this), new C45329r(this, context));
            this.f105607c = bVar;
            boolean a = SettingsManager.m29616a().mo25400a("ecom_semi_pdp_show_report", false);
            bVar.f105657c = a;
            TuxIconView tuxIconView = (TuxIconView) bVar.mo76422a(R.id.clv);
            C89219l.m154716b(tuxIconView, "");
            if (a) {
                i = 0;
            } else {
                i = 8;
            }
            tuxIconView.setVisibility(i);
            TuxStatusView tuxStatusView2 = (TuxStatusView) mo76413a(R.id.e7i);
            if (tuxStatusView2 != null) {
                View a2 = C44766a.m87492a(context, R.layout.pk, null, false);
                C89219l.m154716b(a2, "");
                tuxStatusView2.mo37868a(a2);
            }
            if (!mo76414a().f105585f && (tuxStatusView = (TuxStatusView) mo76413a(R.id.e7i)) != null) {
                C23163i.m43660a((View) tuxStatusView, (Integer) null, (Integer) null, (Integer) null, Integer.valueOf((int) f105603d), false, 23);
            }
            C45333a aVar = this.f105606b;
            if (aVar == null) {
                C89219l.m154710a("bottomView");
            }
            ProductPackStruct productPackStruct = mo76414a().f105580a;
            if (productPackStruct == null || (thirdParty = productPackStruct.f104688p) == null || (str = thirdParty.f104719d) == null) {
                str = "";
            }
            aVar.setBottomText(str);
        }
        AbstractC88412b unused = selectSubscribe(mo76414a(), C45340b.f105669a, new C20370ah(), new C45321j(this));
        AbstractC88412b unused2 = selectSubscribe(mo76414a(), C45345f.f105677a, new C20370ah(), new C45322k(this));
        AbstractC88412b unused3 = selectSubscribe(mo76414a(), C45346g.f105678a, new C20370ah(), new C45323l(this));
        AbstractC88412b unused4 = selectSubscribe(mo76414a(), C45347h.f105679a, new C20370ah(), new C45324m(this));
        AbstractC88412b unused5 = selectSubscribe(mo76414a(), C45348i.f105680a, C45342c.f105674a, new C20370ah(), new C45315g(this));
        AbstractC88412b unused6 = selectSubscribe(mo76414a(), C45343d.f105675a, new C20370ah(), new C45316h(this));
        AbstractC88412b unused7 = selectSubscribe(mo76414a(), C45344e.f105676a, new C20370ah(), new C45319i(this));
        View view2 = getView();
        if (view2 != null) {
            view2.setFocusableInTouchMode(true);
        }
        View view3 = getView();
        if (view3 != null) {
            view3.requestFocus();
        }
        View view4 = getView();
        if (view4 != null) {
            view4.setOnKeyListener(new View$OnKeyListenerC45314f(this));
        }
        AbstractC80747i O = C81079v.m140776O();
        C89219l.m154716b(O, "");
        this.f105610h = O.mo123892o();
    }

    @Override // com.bytedance.tux.sheet.AbstractC23218b
    /* renamed from: a */
    public final void mo37806a(C23226a aVar, int i) {
        C45349j a;
        C45349j a2;
        C45349j a3;
        C89219l.m154721d(aVar, "");
        if (i == 3) {
            if (mo76414a().f105588l == 4 && (a = mo76414a().mo76402a()) != null) {
                a.mo76426a("halftofull");
            }
            m87908b(aVar, i);
        } else if (i == 4) {
            if (mo76414a().f105588l == 3 && (a2 = mo76414a().mo76402a()) != null) {
                a2.mo76426a("fulltohalf");
            }
            m87908b(aVar, i);
        } else if (i == 5) {
            if (mo76414a().f105588l == 4 && (a3 = mo76414a().mo76402a()) != null) {
                a3.mo76426a("halftoquit");
            }
            m87908b(aVar, i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.semipdp.a$f */
    static final class View$OnKeyListenerC45314f implements View.OnKeyListener {

        /* renamed from: a */
        final /* synthetic */ C45307a f105619a;

        static {
            Covode.recordClassIndex(53773);
        }

        View$OnKeyListenerC45314f(C45307a aVar) {
            this.f105619a = aVar;
        }

        public final boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (i != 4) {
                return false;
            }
            this.f105619a.mo76414a().mo76407a("return");
            return false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.qp, viewGroup, false);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af> AbstractC88412b subscribe(JediViewModel<S> jediViewModel, C20370ah<S> ahVar, AbstractC89183m<? super AbstractC20477i, ? super S, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20527q.C20528a.m38708a(this, jediViewModel, ahVar, mVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.semipdp.a$g */
    static final class C45315g extends AbstractC89220m implements AbstractC89187q<AbstractC20477i, Boolean, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C45307a f105620a;

        static {
            Covode.recordClassIndex(53774);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45315g(C45307a aVar) {
            super(3);
            this.f105620a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Boolean bool, Integer num) {
            ThirdParty thirdParty;
            String str;
            boolean booleanValue = bool.booleanValue();
            Integer num2 = num;
            String str2 = "";
            C89219l.m154721d(iVar, str2);
            int i = 8;
            if (num2 != null && num2.intValue() == -1) {
                C45307a.m87904a(this.f105620a).setVisibility(0);
                C45336b b = C45307a.m87907b(this.f105620a);
                if (b != null) {
                    b.setSpecialIllegalState(false);
                }
                C45333a a = C45307a.m87904a(this.f105620a);
                if (a != null) {
                    ProductPackStruct productPackStruct = this.f105620a.mo76414a().f105580a;
                    if (!(productPackStruct == null || (thirdParty = productPackStruct.f104688p) == null || (str = thirdParty.f104719d) == null)) {
                        str2 = str;
                    }
                    a.setBottomText(str2);
                }
            } else {
                C45333a a2 = C45307a.m87904a(this.f105620a);
                if (a2 != null) {
                    a2.setVisibility(8);
                }
                C45336b b2 = C45307a.m87907b(this.f105620a);
                if (b2 != null) {
                    b2.setSpecialIllegalState(true);
                }
            }
            C45336b b3 = C45307a.m87907b(this.f105620a);
            if (b3 != null) {
                if (booleanValue && (num2 == null || num2.intValue() != 0)) {
                    i = 0;
                }
                b3.setVisibility(i);
            }
            return C89391z.f203057a;
        }
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
