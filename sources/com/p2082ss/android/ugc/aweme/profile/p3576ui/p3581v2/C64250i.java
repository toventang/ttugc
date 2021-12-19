package com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1182af;
import com.bytedance.apm.p789q.C12599s;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.C12752d;
import com.bytedance.assem.arch.core.C12753e;
import com.bytedance.assem.arch.core.C12759i;
import com.bytedance.assem.arch.core.C12767q;
import com.bytedance.assem.arch.extensions.AbstractC12779c;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.extensions.C12780d;
import com.bytedance.assem.arch.service.C12801d;
import com.bytedance.assem.arch.viewModel.AbstractC12848i;
import com.bytedance.assem.arch.viewModel.C12814b;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.p2082ss.android.ugc.aweme.analysis.Analysis;
import com.p2082ss.android.ugc.aweme.base.component.AnalysisStayTimeFragmentComponent;
import com.p2082ss.android.ugc.aweme.base.p2372d.C34569a;
import com.p2082ss.android.ugc.aweme.base.p2372d.C34572c;
import com.p2082ss.android.ugc.aweme.experiment.C46934fk;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2958o.C49766a;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50104bc;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.friends.C51487e;
import com.p2082ss.android.ugc.aweme.friends.model.MutualStruct;
import com.p2082ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.p2082ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p2082ss.android.ugc.aweme.lego.C58254p;
import com.p2082ss.android.ugc.aweme.metrics.C59218am;
import com.p2082ss.android.ugc.aweme.newfollow.p3506c.C61504e;
import com.p2082ss.android.ugc.aweme.p2436cc.C35434c;
import com.p2082ss.android.ugc.aweme.p2436cc.C35435d;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3575f.C63804z;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3580d.AbstractC64151d;
import com.p2082ss.android.ugc.aweme.profile.widgets.common.AbstractC64616j;
import com.p2082ss.android.ugc.aweme.profile.widgets.common.C64618k;
import com.p2082ss.android.ugc.aweme.profile.widgets.common.C64644n;
import com.p2082ss.android.ugc.aweme.profile.widgets.common.EnumC64592g;
import com.p2082ss.android.ugc.aweme.profile.widgets.common.UserProfileInfoVM;
import com.p2082ss.android.ugc.aweme.profile.widgets.follow.C64715b;
import com.p2082ss.android.ugc.aweme.profile.widgets.follow.C64719f;
import com.p2082ss.android.ugc.aweme.profile.widgets.navbar.C65078c;
import com.p2082ss.android.ugc.aweme.profile.widgets.p3582a.C64490e;
import com.p2082ss.android.ugc.aweme.profile.widgets.p3583b.AbstractC64553r;
import com.p2082ss.android.ugc.aweme.profile.widgets.p3583b.C64534i;
import com.p2082ss.android.ugc.aweme.profile.widgets.p3584c.p3585a.C64555a;
import com.p2082ss.android.ugc.aweme.profile.widgets.p3588f.C64685a;
import com.p2082ss.android.ugc.aweme.profile.widgets.p3590g.p3591a.C64819g;
import com.p2082ss.android.ugc.aweme.profile.widgets.p3594h.p3595a.C64871b;
import com.p2082ss.android.ugc.aweme.profile.widgets.p3600m.C64924a;
import com.p2082ss.android.ugc.aweme.profile.widgets.recommend.user.C65126f;
import com.p2082ss.android.ugc.aweme.profile.widgets.relations.AbstractC65189d;
import com.p2082ss.android.ugc.aweme.profile.widgets.relations.C65171b;
import com.p2082ss.android.ugc.aweme.profile.widgets.userId.C65198b;
import com.p2082ss.android.ugc.aweme.profile.widgets.userId.C65201d;
import com.p2082ss.android.ugc.aweme.recommend.C66623g;
import com.p2082ss.android.ugc.trill.R;
import dagger.hilt.android.internal.p4539b.C88098a;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4600h.C89391z;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.v2.i */
public final class C64250i extends AbstractC64204a implements AbstractC64151d, AbstractC64206ab, AbstractC90252i, AbstractC90253j {

    /* renamed from: I */
    public static final C64270m f145694I = new C64270m((byte) 0);

    /* renamed from: A */
    public String f145695A;

    /* renamed from: B */
    public String f145696B;

    /* renamed from: C */
    public boolean f145697C;

    /* renamed from: D */
    public Aweme f145698D;

    /* renamed from: E */
    public String f145699E = "";

    /* renamed from: F */
    public String f145700F = "";

    /* renamed from: G */
    public EnumC64271n f145701G = EnumC64271n.LOAD_IDLE;

    /* renamed from: H */
    public String f145702H = "";

    /* renamed from: J */
    private int f145703J;

    /* renamed from: K */
    private String f145704K = "";

    /* renamed from: L */
    private final C12814b f145705L;

    /* renamed from: M */
    private AbstractC50104bc f145706M;

    /* renamed from: N */
    private SparseArray f145707N;

    /* renamed from: u */
    public String f145708u;

    /* renamed from: v */
    public String f145709v = "";

    /* renamed from: w */
    public String f145710w = "";

    /* renamed from: y */
    public String f145711y;

    /* renamed from: z */
    public MutualStruct f145712z;

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.v2.i$f */
    public static final class C64263f extends AbstractC89220m implements AbstractC89172b<C64644n, C64644n> {
        public static final C64263f INSTANCE = new C64263f();

        static {
            Covode.recordClassIndex(75708);
        }

        public C64263f() {
            super(1);
        }

        public final C64644n invoke(C64644n nVar) {
            C89219l.m154719c(nVar, "");
            return nVar;
        }
    }

    static {
        Covode.recordClassIndex(75695);
    }

    /* renamed from: b */
    public final View mo103800b(int i) {
        if (this.f145707N == null) {
            this.f145707N = new SparseArray();
        }
        View view = (View) this.f145707N.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f145707N.put(i, findViewById);
        return findViewById;
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(72, new RunnableC90250g(C64250i.class, "onUpdateUserEvent", C34572c.class, ThreadMode.POSTING, 0, false));
        hashMap.put(34, new RunnableC90250g(C64250i.class, "onAntiCrawlerEvent", C34569a.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC63980al
    /* renamed from: k */
    public final int mo103549k() {
        return R.layout.ani;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC63980al
    /* renamed from: l */
    public final boolean mo103550l() {
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.v2.i$b */
    public static final class C64259b extends AbstractC89220m implements AbstractC89171a<Fragment> {

        /* renamed from: a */
        final /* synthetic */ Fragment f145722a;

        static {
            Covode.recordClassIndex(75704);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64259b(Fragment fragment) {
            super(0);
            this.f145722a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final Fragment invoke() {
            return this.f145722a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.v2.i$m */
    public static final class C64270m {
        static {
            Covode.recordClassIndex(75715);
        }

        private C64270m() {
        }

        public /* synthetic */ C64270m(byte b) {
            this();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x010d, code lost:
        if (r8.f31016a.containsKey(new com.bytedance.assem.arch.core.C12765o(r2, null)) == false) goto L_0x010f;
     */
    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.p3580d.AbstractC64151d
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo103754a(java.lang.String r15, java.lang.String r16) {
        /*
        // Method dump skipped, instructions count: 359
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.C64250i.mo103754a(java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0109, code lost:
        if (r8.f31016a.containsKey(new com.bytedance.assem.arch.core.C12765o(r2, null)) == false) goto L_0x010b;
     */
    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.p3580d.AbstractC64151d
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo103753a(java.lang.String r15) {
        /*
        // Method dump skipped, instructions count: 355
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.C64250i.mo103753a(java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f2, code lost:
        if (r6.f31016a.containsKey(new com.bytedance.assem.arch.core.C12765o(r0, null)) == false) goto L_0x00f4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x022b  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0247  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0251  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0261  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x026a  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0276  */
    /* JADX WARNING: Removed duplicated region for block: B:156:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0195 A[SYNTHETIC, Splitter:B:77:0x0195] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01c5 A[Catch:{ Exception -> 0x01e9 }] */
    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.p3580d.AbstractC64151d
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo103755a(boolean r16) {
        /*
        // Method dump skipped, instructions count: 648
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.C64250i.mo103755a(boolean):void");
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.v2.i$g */
    public static final class C64264g extends AbstractC89220m implements AbstractC89171a<C12874b<C64644n>> {
        public static final C64264g INSTANCE = new C64264g();

        static {
            Covode.recordClassIndex(75709);
        }

        public C64264g() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C64644n> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.v2.i$l */
    public static final class C64269l extends AbstractC89220m implements AbstractC89171a<C12874b<C64644n>> {
        public static final C64269l INSTANCE = new C64269l();

        static {
            Covode.recordClassIndex(75714);
        }

        public C64269l() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C64644n> invoke() {
            return new C12874b<>();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.AbstractC64206ab
    /* renamed from: d */
    public final void mo103787d() {
        this.f145701G = EnumC64271n.LOAD_IDLE;
    }

    /* Return type fixed from 'com.bytedance.assem.arch.service.a' to match base method */
    @Override // com.bytedance.assem.arch.service.AbstractC12799b
    /* renamed from: e */
    public final /* synthetic */ C64207ac mo20658e() {
        return new C64207ac();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.ui.v2.i$ac */
    public static final class RunnableC64254ac implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C64250i f145716a;

        static {
            Covode.recordClassIndex(75699);
        }

        RunnableC64254ac(C64250i iVar) {
            this.f145716a = iVar;
        }

        public final void run() {
            String str = this.f145716a.f145096a;
            if (str == null) {
                str = "";
            }
            C64314y.m116185a("others_homepage", str, "request");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.v2.i$ag */
    static final class C64258ag extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ C64250i f145721a;

        static {
            Covode.recordClassIndex(75703);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64258ag(C64250i iVar) {
            super(0);
            this.f145721a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1175ad.AbstractC1177b invoke() {
            C1175ad.AbstractC1177b a = C88098a.m153168a(this.f145721a.getActivity());
            if (a == null) {
                C89219l.m154715b();
            }
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.v2.i$c */
    public static final class C64260c extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ Fragment f145723a;

        static {
            Covode.recordClassIndex(75705);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64260c(Fragment fragment) {
            super(0);
            this.f145723a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            C1182af viewModelStore = this.f145723a.getViewModelStore();
            C89219l.m154709a((Object) viewModelStore, "");
            return viewModelStore;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.v2.i$h */
    public static final class C64265h extends AbstractC89220m implements AbstractC89171a<ActivityC0945e> {

        /* renamed from: a */
        final /* synthetic */ Fragment f145726a;

        static {
            Covode.recordClassIndex(75710);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64265h(Fragment fragment) {
            super(0);
            this.f145726a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final ActivityC0945e invoke() {
            ActivityC0945e requireActivity = this.f145726a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            return requireActivity;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f145707N;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        if (this.f145697C) {
            mo103552n();
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        C61504e.C61505a.f139616a.mo99162c();
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.v2.i$a */
    public static final class C64251a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f145713a;

        static {
            Covode.recordClassIndex(75696);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64251a(AbstractC89277c cVar) {
            super(0);
            this.f145713a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f145713a).getName();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.ui.v2.i$aa */
    public static final class RunnableC64252aa implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C64250i f145714a;

        static {
            Covode.recordClassIndex(75697);
        }

        RunnableC64252aa(C64250i iVar) {
            this.f145714a = iVar;
        }

        public final void run() {
            AbstractC65189d dVar = (AbstractC65189d) C12801d.m23027d(this.f145714a, C89204ab.m154669a(AbstractC65189d.class));
            if (dVar != null) {
                dVar.mo104356x();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.v2.i$d */
    public static final class C64261d extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ Fragment f145724a;

        static {
            Covode.recordClassIndex(75706);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64261d(Fragment fragment) {
            super(0);
            this.f145724a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e requireActivity = this.f145724a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            return Assembler.C12747a.m22936a(requireActivity).mo20583b(this.f145724a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.v2.i$e */
    public static final class C64262e extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ Fragment f145725a;

        static {
            Covode.recordClassIndex(75707);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64262e(Fragment fragment) {
            super(0);
            this.f145725a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e requireActivity = this.f145725a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            return Assembler.C12747a.m22936a(requireActivity).mo20584c(this.f145725a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.v2.i$i */
    public static final class C64266i extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ Fragment f145727a;

        static {
            Covode.recordClassIndex(75711);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64266i(Fragment fragment) {
            super(0);
            this.f145727a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            ActivityC0945e requireActivity = this.f145727a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            C1182af viewModelStore = requireActivity.getViewModelStore();
            C89219l.m154709a((Object) viewModelStore, "");
            return viewModelStore;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.v2.i$j */
    public static final class C64267j extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ Fragment f145728a;

        static {
            Covode.recordClassIndex(75712);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64267j(Fragment fragment) {
            super(0);
            this.f145728a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e requireActivity = this.f145728a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            return Assembler.C12747a.m22936a(requireActivity).mo20583b(this.f145728a.getActivity());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.v2.i$k */
    public static final class C64268k extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ Fragment f145729a;

        static {
            Covode.recordClassIndex(75713);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64268k(Fragment fragment) {
            super(0);
            this.f145729a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e requireActivity = this.f145729a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            return Assembler.C12747a.m22936a(requireActivity).mo20584c(this.f145729a.getActivity());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.p2082ss.android.ugc.aweme.analysis.AbstractC33501c
    /* renamed from: F */
    public final Analysis mo59595F() {
        Analysis labelName = new Analysis().setLabelName("others_homepage");
        C89219l.m154716b(labelName, "");
        return labelName;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.AbstractC64206ab
    /* renamed from: c */
    public final void mo103785c() {
        if (TextUtils.equals(this.f145696B, "feed_detail")) {
            AbstractC50104bc bcVar = this.f145706M;
            if (bcVar != null) {
                bcVar.mo85241a();
                return;
            }
            return;
        }
        ActivityC0945e activity = getActivity();
        if (activity == null) {
            C89219l.m154715b();
        }
        activity.finish();
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC63980al
    /* renamed from: h */
    public final boolean mo103546h() {
        Bundle arguments = getArguments();
        if (arguments == null || !TextUtils.equals(arguments.getString("profile_from", ""), "feed_detail")) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC63980al, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.f145103l != null) {
            User user = this.f145103l;
            C89219l.m154716b(user, "");
            if (user.isLive()) {
                mo103801c(false);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.v2.i$n */
    public enum EnumC64271n {
        LOAD_IDLE,
        LOAD_ING,
        LOAD_DONE;

        static {
            Covode.recordClassIndex(75716);
        }
    }

    public C64250i() {
        C12814b bVar;
        AbstractC12848i.C12852d dVar = AbstractC12848i.C12852d.f31278a;
        C64258ag agVar = new C64258ag(this);
        AbstractC89277c a = C89204ab.m154669a(UserProfileInfoVM.class);
        C64251a aVar = new C64251a(a);
        C64263f fVar = C64263f.INSTANCE;
        if (C89219l.m154714a(dVar, AbstractC12848i.C12849a.f31275a)) {
            bVar = new C12814b(a, aVar, C64264g.INSTANCE, new C64265h(this), new C64266i(this), agVar, fVar, new C64267j(this), new C64268k(this));
        } else if (dVar == null || C89219l.m154714a(dVar, AbstractC12848i.C12852d.f31278a)) {
            bVar = new C12814b(a, aVar, C64269l.INSTANCE, new C64259b(this), new C64260c(this), agVar, fVar, new C64261d(this), new C64262e(this));
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.f145705L = bVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.AbstractC64206ab
    /* renamed from: b */
    public final void mo103783b() {
        AbstractC64616j.C64617a.m116533a((AbstractC64616j) C12801d.m23017a(this, C89204ab.m154669a(AbstractC64616j.class)), null, 3);
        AbstractC64553r rVar = (AbstractC64553r) C12801d.m23027d(this, C89204ab.m154669a(AbstractC64553r.class));
        if (rVar != null) {
            rVar.mo104122S();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0114, code lost:
        if (r12.f31016a.containsKey(new com.bytedance.assem.arch.core.C12765o(r2, null)) == false) goto L_0x0116;
     */
    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.p3580d.AbstractC64151d
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo103748a() {
        /*
        // Method dump skipped, instructions count: 367
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.C64250i.mo103748a():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d9, code lost:
        if (r12.f31016a.containsKey(new com.bytedance.assem.arch.core.C12765o(r2, null)) == false) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00db, code lost:
        r9 = r4.element;
        r3 = getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e5, code lost:
        if (r3 == java.lang.Object.class) goto L_0x0132;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00e7, code lost:
        r14 = r3.getInterfaces();
        p4600h.p4611f.p4613b.C89219l.m154709a((java.lang.Object) r14, "");
        r13 = new java.util.ArrayList();
        r12 = r14.length;
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f5, code lost:
        if (r2 >= r12) goto L_0x0107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00f7, code lost:
        r1 = r14[r2];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ff, code lost:
        if (com.bytedance.assem.arch.service.AbstractC12800c.class.isAssignableFrom(r1) == false) goto L_0x0104;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0101, code lost:
        r13.add(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0104, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0107, code lost:
        r1 = r13.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0111, code lost:
        if (r1.hasNext() == false) goto L_0x012c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0113, code lost:
        r0 = (java.lang.Class) r1.next();
        p4600h.p4611f.p4613b.C89219l.m154709a((java.lang.Object) r0, "");
        r9.mo20612a(r0, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x012c, code lost:
        r3 = r3.getSuperclass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0130, code lost:
        if (r3 != null) goto L_0x00e3;
     */
    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC63980al, com.p2082ss.android.ugc.aweme.profile.p3576ui.p3580d.AbstractC64151d
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo103548j() {
        /*
        // Method dump skipped, instructions count: 358
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.C64250i.mo103548j():void");
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.p3580d.AbstractC64151d
    /* renamed from: a */
    public final void mo103750a(AbstractC50104bc bcVar) {
        C89219l.m154721d(bcVar, "");
        this.f145706M = bcVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.p3580d.AbstractC64151d
    /* renamed from: a */
    public final /* synthetic */ void mo103752a(Boolean bool) {
        mo103801c(bool.booleanValue());
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.AbstractC64206ab
    /* renamed from: b */
    public final void mo103784b(User user) {
        String str = this.f145708u;
        if (!(str == null || user == null)) {
            user.setRequestId(str);
        }
        this.f145103l = user;
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.v2.i$r */
    static final class C64290r implements AnalysisStayTimeFragmentComponent.AbstractC34536a {

        /* renamed from: a */
        final /* synthetic */ C64250i f145751a;

        static {
            Covode.recordClassIndex(75735);
        }

        C64290r(C64250i iVar) {
            this.f145751a = iVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.base.component.AnalysisStayTimeFragmentComponent.AbstractC34536a
        /* renamed from: a */
        public final C59218am mo61009a(C59218am amVar) {
            String str;
            C89219l.m154721d(amVar, "");
            amVar.f134902d = this.f145751a.f145710w;
            amVar.f134903e = this.f145751a.f145096a;
            Aweme aweme = this.f145751a.f145698D;
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            amVar.f134901c = str;
            return amVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.v2.i$t */
    static final class C64292t<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C64250i f145753a;

        static {
            Covode.recordClassIndex(75737);
        }

        C64292t(C64250i iVar) {
            this.f145753a = iVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (num != null && num.intValue() == 1) {
                this.f145753a.mo103801c(true);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.p3580d.AbstractC64151d
    /* renamed from: b */
    public final void mo103759b(boolean z) {
        AbstractC64553r rVar = (AbstractC64553r) C12801d.m23027d(this, C89204ab.m154669a(AbstractC64553r.class));
        if (rVar != null) {
            rVar.mo104128a(z, false);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.p3580d.AbstractC64151d
    /* renamed from: e */
    public final void mo103762e(String str) {
        AbstractC64553r rVar = (AbstractC64553r) C12801d.m23027d(this, C89204ab.m154669a(AbstractC64553r.class));
        if (rVar != null) {
            rVar.mo104129b(str);
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC63980al, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        C89219l.m154721d(bundle, "");
        bundle.putString("uid", this.f145096a);
        bundle.putString("sec_user_id", this.f145097b);
        super.onSaveInstanceState(bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.ui.v2.i$ab */
    public static final class C64253ab extends AbstractC89220m implements AbstractC89172b<C64207ac, C64207ac> {

        /* renamed from: a */
        public static final C64253ab f145715a = new C64253ab();

        static {
            Covode.recordClassIndex(75698);
        }

        C64253ab() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C64207ac invoke(C64207ac acVar) {
            C64207ac acVar2 = acVar;
            if (acVar2 != null) {
                return C64207ac.m116113a(acVar2, null, null, null, null, null, null, null, null, null, false, null, null, new C12776a(C89391z.f203057a), null, 12287);
            }
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.ui.v2.i$ad */
    public static final class C64255ad extends AbstractC89220m implements AbstractC89172b<C64207ac, C64207ac> {

        /* renamed from: a */
        final /* synthetic */ String f145717a;

        /* renamed from: b */
        final /* synthetic */ String f145718b;

        static {
            Covode.recordClassIndex(75700);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64255ad(String str, String str2) {
            super(1);
            this.f145717a = str;
            this.f145718b = str2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C64207ac invoke(C64207ac acVar) {
            C64207ac acVar2 = acVar;
            if (acVar2 != null) {
                return C64207ac.m116113a(acVar2, this.f145717a, this.f145718b, null, null, null, null, null, null, null, false, null, null, null, null, 16380);
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.v2.i$ae */
    static final class C64256ae extends AbstractC89220m implements AbstractC89172b<C64207ac, C64207ac> {

        /* renamed from: a */
        final /* synthetic */ boolean f145719a;

        static {
            Covode.recordClassIndex(75701);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64256ae(boolean z) {
            super(1);
            this.f145719a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C64207ac invoke(C64207ac acVar) {
            C64207ac acVar2 = acVar;
            if (acVar2 != null) {
                return C64207ac.m116113a(acVar2, null, null, null, null, null, null, null, null, null, this.f145719a, new C12776a(Boolean.valueOf(this.f145719a)), null, null, null, 14847);
            }
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.ui.v2.i$af */
    public static final class C64257af extends AbstractC89220m implements AbstractC89172b<C64207ac, C64207ac> {

        /* renamed from: a */
        final /* synthetic */ Aweme f145720a;

        static {
            Covode.recordClassIndex(75702);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64257af(Aweme aweme) {
            super(1);
            this.f145720a = aweme;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C64207ac invoke(C64207ac acVar) {
            C64207ac acVar2 = acVar;
            if (acVar2 != null) {
                return C64207ac.m116113a(acVar2, null, null, null, null, null, null, this.f145720a, null, null, false, null, null, null, null, 16319);
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.v2.i$o */
    static final class C64272o extends AbstractC89220m implements AbstractC89172b<C64207ac, C64207ac> {

        /* renamed from: a */
        public static final C64272o f145731a = new C64272o();

        static {
            Covode.recordClassIndex(75717);
        }

        C64272o() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C64207ac invoke(C64207ac acVar) {
            C64207ac acVar2 = acVar;
            if (acVar2 != null) {
                return C64207ac.m116113a(acVar2, null, null, null, null, null, null, null, null, new C12776a(C89391z.f203057a), false, null, null, null, null, 16127);
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.v2.i$p */
    static final class C64273p extends AbstractC89220m implements AbstractC89172b<C64207ac, C64207ac> {

        /* renamed from: a */
        public static final C64273p f145732a = new C64273p();

        static {
            Covode.recordClassIndex(75718);
        }

        C64273p() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C64207ac invoke(C64207ac acVar) {
            C64207ac acVar2 = acVar;
            if (acVar2 != null) {
                return C64207ac.m116113a(acVar2, null, null, null, null, null, null, null, null, null, false, null, new C12776a(C89391z.f203057a), null, null, 14335);
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.v2.i$s */
    static final class C64291s extends AbstractC89220m implements AbstractC89172b<C64207ac, C64207ac> {

        /* renamed from: a */
        final /* synthetic */ C64250i f145752a;

        static {
            Covode.recordClassIndex(75736);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64291s(C64250i iVar) {
            super(1);
            this.f145752a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C64207ac invoke(C64207ac acVar) {
            C64207ac acVar2 = acVar;
            if (acVar2 != null) {
                return C64207ac.m116113a(acVar2, this.f145752a.f145096a, this.f145752a.f145097b, null, null, null, null, null, null, null, false, null, null, null, null, 16380);
            }
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.ui.v2.i$u */
    public static final class C64293u extends AbstractC89220m implements AbstractC89172b<C64207ac, C64207ac> {

        /* renamed from: a */
        final /* synthetic */ String f145754a;

        static {
            Covode.recordClassIndex(75738);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64293u(String str) {
            super(1);
            this.f145754a = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C64207ac invoke(C64207ac acVar) {
            C64207ac acVar2 = acVar;
            if (acVar2 != null) {
                return C64207ac.m116113a(acVar2, null, null, null, this.f145754a, null, null, null, null, null, false, null, null, null, null, 16375);
            }
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.ui.v2.i$v */
    public static final class C64294v extends AbstractC89220m implements AbstractC89172b<C64207ac, C64207ac> {

        /* renamed from: a */
        final /* synthetic */ String f145755a;

        static {
            Covode.recordClassIndex(75739);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64294v(String str) {
            super(1);
            this.f145755a = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C64207ac invoke(C64207ac acVar) {
            C64207ac acVar2 = acVar;
            if (acVar2 != null) {
                return C64207ac.m116113a(acVar2, null, null, null, null, null, null, null, this.f145755a, null, false, null, null, null, null, 16255);
            }
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.ui.v2.i$w */
    public static final class C64295w extends AbstractC89220m implements AbstractC89172b<C64207ac, C64207ac> {

        /* renamed from: a */
        public static final C64295w f145756a = new C64295w();

        static {
            Covode.recordClassIndex(75740);
        }

        C64295w() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C64207ac invoke(C64207ac acVar) {
            C64207ac acVar2 = acVar;
            if (acVar2 != null) {
                return C64207ac.m116113a(acVar2, null, null, null, null, null, null, null, null, null, false, null, null, null, new C12776a(C89391z.f203057a), 8191);
            }
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.ui.v2.i$x */
    public static final class C64296x extends AbstractC89220m implements AbstractC89172b<C64207ac, C64207ac> {

        /* renamed from: a */
        final /* synthetic */ String f145757a;

        static {
            Covode.recordClassIndex(75741);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64296x(String str) {
            super(1);
            this.f145757a = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C64207ac invoke(C64207ac acVar) {
            C64207ac acVar2 = acVar;
            if (acVar2 != null) {
                return C64207ac.m116113a(acVar2, null, null, this.f145757a, null, null, null, null, null, null, false, null, null, null, null, 16379);
            }
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.ui.v2.i$y */
    public static final class C64297y extends AbstractC89220m implements AbstractC89172b<C64207ac, C64207ac> {

        /* renamed from: a */
        final /* synthetic */ String f145758a;

        static {
            Covode.recordClassIndex(75742);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64297y(String str) {
            super(1);
            this.f145758a = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C64207ac invoke(C64207ac acVar) {
            C64207ac acVar2 = acVar;
            if (acVar2 != null) {
                return C64207ac.m116113a(acVar2, null, null, null, null, null, this.f145758a, null, null, null, false, null, null, null, null, 16351);
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.v2.i$z */
    static final class C64298z extends AbstractC89220m implements AbstractC89172b<C64207ac, C64207ac> {

        /* renamed from: a */
        final /* synthetic */ String f145759a;

        static {
            Covode.recordClassIndex(75743);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64298z(String str) {
            super(1);
            this.f145759a = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C64207ac invoke(C64207ac acVar) {
            C64207ac acVar2 = acVar;
            if (acVar2 != null) {
                return C64207ac.m116113a(acVar2, null, null, null, null, this.f145759a, null, null, null, null, false, null, null, null, null, 16367);
            }
            return null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.AbstractC64206ab
    /* renamed from: c */
    public final void mo103786c(User user) {
        C89219l.m154721d(user, "");
        if (af_()) {
            this.f145109r.mo104028a(user);
            this.f145701G = EnumC64271n.LOAD_DONE;
            this.f145103l = user;
            if (!(!C51487e.m95905b() || this.f145103l == null || this.f145712z == null)) {
                User user2 = this.f145103l;
                C89219l.m154716b(user2, "");
                user2.setMutualStruct(this.f145712z);
            }
            mo103754a(user.getUid(), user.getSecUid());
        }
    }

    @AbstractC90264r
    public final void onAntiCrawlerEvent(C34569a aVar) {
        String str;
        if (aVar != null && (str = aVar.f81610a) != null) {
            if (C89361p.m154908a((CharSequence) str, (CharSequence) "/aweme/v1/user/profile/other/?", false) || C89361p.m154908a((CharSequence) str, (CharSequence) "/aweme/v1/aweme/post/?", false) || C89361p.m154908a((CharSequence) str, (CharSequence) "/aweme/v1/aweme/favorite/?", false)) {
                EventBus.m156962a().mo145397d(aVar);
                mo103783b();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC63980al, com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.AbstractC64204a, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        if (C64315z.m116188a(this.f145710w)) {
            mo103758b(this.f145710w);
        }
        if (C64315z.m116188a(this.f145711y)) {
            mo103760c(this.f145711y);
        }
        if (C64315z.m116188a(this.f145700F)) {
            mo103753a(this.f145700F);
        }
        if (C64315z.m116188a(this.f145699E)) {
            mo103761d(this.f145699E);
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC63980al, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        String str;
        C35435d.C35436a.m72465a("new_user_profile");
        C35435d.f83604b = true;
        C35434c.m72461a(C35435d.f83603a);
        String str2 = "";
        if (TextUtils.isEmpty(this.f145096a)) {
            if (bundle == null || (str = bundle.getString("uid")) == null) {
                str = str2;
            }
            this.f145096a = str;
        }
        if (TextUtils.isEmpty(this.f145097b)) {
            if (!(bundle == null || (string = bundle.getString("sec_user_id")) == null)) {
                str2 = string;
            }
            this.f145097b = str2;
        }
        super.onCreate(bundle);
    }

    @AbstractC90264r
    public final void onUpdateUserEvent(C34572c cVar) {
        if (cVar != null && cVar.f81612a != null) {
            User user = cVar.f81612a;
            C89219l.m154716b(user, "");
            if (TextUtils.equals(user.getUid(), this.f145096a)) {
                mo103784b(cVar.f81612a);
                AbstractC64616j jVar = (AbstractC64616j) C12801d.m23022b(this, C89204ab.m154669a(AbstractC64616j.class));
                if (jVar != null) {
                    AbstractC64616j.C64617a.m116532a(jVar, cVar.f81612a, null, false, 6);
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.p3580d.AbstractC64151d
    /* renamed from: a */
    public final void mo103751a(User user) {
        String str;
        if (af_()) {
            if (user != null) {
                this.f145109r.mo104028a(user);
                mo103784b(user);
                AbstractC64616j jVar = (AbstractC64616j) C12801d.m23022b(this, C89204ab.m154669a(AbstractC64616j.class));
                if (jVar != null) {
                    AbstractC64616j.C64617a.m116532a(jVar, user, null, true, 2);
                }
            }
            if (C12599s.m22724a()) {
                AbstractC65189d dVar = (AbstractC65189d) C12801d.m23027d(this, C89204ab.m154669a(AbstractC65189d.class));
                if (dVar != null) {
                    dVar.mo104356x();
                }
            } else {
                C58254p.m105190a().post(new RunnableC64252aa(this));
            }
            if (user == null || (str = user.getUid()) == null) {
                str = "";
            }
            C64314y.m116185a("others_homepage", str, "simple");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.v2.i$q */
    static final class C64274q extends AbstractC89220m implements AbstractC89172b<Assembler, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C64250i f145733a;

        /* renamed from: b */
        final /* synthetic */ C64871b f145734b;

        /* renamed from: c */
        final /* synthetic */ View f145735c;

        static {
            Covode.recordClassIndex(75719);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64274q(C64250i iVar, C64871b bVar, View view) {
            super(1);
            this.f145733a = iVar;
            this.f145734b = bVar;
            this.f145735c = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Assembler assembler) {
            Assembler assembler2 = assembler;
            C89219l.m154721d(assembler2, "");
            assembler2.mo20576a(this.f145733a, (AbstractC89172b<? super C12759i<AbstractC12779c>, C89391z>) new AbstractC89172b<C12759i<AbstractC12779c>, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.C64250i.C64274q.C642751 */

                /* renamed from: a */
                final /* synthetic */ C64274q f145736a;

                static {
                    Covode.recordClassIndex(75720);
                }

                {
                    this.f145736a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C12759i<AbstractC12779c> iVar) {
                    C12759i<AbstractC12779c> iVar2 = iVar;
                    C89219l.m154721d(iVar2, "");
                    iVar2.mo20617a(this.f145736a.f145734b);
                    return C89391z.f203057a;
                }
            });
            if (C46934fk.f109382f) {
                assembler2.mo20582b(this.f145733a, new AbstractC89172b<C12767q, C89391z>(this) {
                    /* class com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.C64250i.C64274q.C642888 */

                    /* renamed from: a */
                    final /* synthetic */ C64274q f145749a;

                    static {
                        Covode.recordClassIndex(75733);
                    }

                    {
                        this.f145749a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C89391z invoke(C12767q qVar) {
                        C12767q qVar2 = qVar;
                        C89219l.m154721d(qVar2, "");
                        qVar2.mo20632a(C89204ab.m154669a(C64534i.class));
                        qVar2.f31050b = new C64534i();
                        qVar2.f31053e = this.f145749a.f145735c;
                        return C89391z.f203057a;
                    }
                });
            }
            assembler2.mo20582b(this.f145733a, new AbstractC89172b<C12767q, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.C64250i.C64274q.C642899 */

                /* renamed from: a */
                final /* synthetic */ C64274q f145750a;

                static {
                    Covode.recordClassIndex(75734);
                }

                {
                    this.f145750a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C12767q qVar) {
                    C12767q qVar2 = qVar;
                    C89219l.m154721d(qVar2, "");
                    qVar2.mo20632a(C89204ab.m154669a(C64618k.class));
                    qVar2.f31050b = new C64618k();
                    qVar2.f31053e = (RelativeLayout) this.f145750a.f145733a.mo103800b(R.id.d9f);
                    return C89391z.f203057a;
                }
            });
            assembler2.mo20582b(this.f145733a, new AbstractC89172b<C12767q, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.C64250i.C64274q.C6427610 */

                /* renamed from: a */
                final /* synthetic */ C64274q f145737a;

                static {
                    Covode.recordClassIndex(75721);
                }

                {
                    this.f145737a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C12767q qVar) {
                    C12767q qVar2 = qVar;
                    C89219l.m154721d(qVar2, "");
                    qVar2.mo20632a(C89204ab.m154669a(C65078c.class));
                    qVar2.f31050b = new C65078c();
                    qVar2.f31053e = (TuxNavBar) this.f145737a.f145733a.mo103800b(R.id.cpv);
                    return C89391z.f203057a;
                }
            });
            assembler2.mo20582b(this.f145733a, new AbstractC89172b<C12767q, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.C64250i.C64274q.C6427711 */

                /* renamed from: a */
                final /* synthetic */ C64274q f145738a;

                static {
                    Covode.recordClassIndex(75722);
                }

                {
                    this.f145738a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C12767q qVar) {
                    C12767q qVar2 = qVar;
                    C89219l.m154721d(qVar2, "");
                    qVar2.mo20632a(C89204ab.m154669a(C64819g.class));
                    qVar2.f31050b = new C64819g();
                    qVar2.f31053e = this.f145738a.f145735c;
                    return C89391z.f203057a;
                }
            });
            assembler2.mo20582b(this.f145733a, new AbstractC89172b<C12767q, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.C64250i.C64274q.C6427812 */

                /* renamed from: a */
                final /* synthetic */ C64274q f145739a;

                static {
                    Covode.recordClassIndex(75723);
                }

                {
                    this.f145739a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C12767q qVar) {
                    C12767q qVar2 = qVar;
                    C89219l.m154721d(qVar2, "");
                    qVar2.mo20632a(C89204ab.m154669a(C65201d.class));
                    qVar2.f31050b = new C65201d();
                    qVar2.f31053e = (TuxTextView) this.f145739a.f145733a.mo103800b(R.id.f_q);
                    return C89391z.f203057a;
                }
            });
            assembler2.mo20582b(this.f145733a, new AbstractC89172b<C12767q, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.C64250i.C64274q.C6427913 */

                /* renamed from: a */
                final /* synthetic */ C64274q f145740a;

                static {
                    Covode.recordClassIndex(75724);
                }

                {
                    this.f145740a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C12767q qVar) {
                    C12767q qVar2 = qVar;
                    C89219l.m154721d(qVar2, "");
                    qVar2.mo20632a(C89204ab.m154669a(C65198b.class));
                    qVar2.f31050b = new C65198b();
                    qVar2.f31053e = (TuxTextView) this.f145740a.f145733a.mo103800b(R.id.f_k);
                    return C89391z.f203057a;
                }
            });
            assembler2.mo20582b(this.f145733a, new AbstractC89172b<C12767q, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.C64250i.C64274q.C6428014 */

                /* renamed from: a */
                final /* synthetic */ C64274q f145741a;

                static {
                    Covode.recordClassIndex(75725);
                }

                {
                    this.f145741a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C12767q qVar) {
                    C12767q qVar2 = qVar;
                    C89219l.m154721d(qVar2, "");
                    qVar2.mo20632a(C89204ab.m154669a(C65171b.class));
                    qVar2.f31050b = new C65171b();
                    qVar2.f31053e = (LinearLayout) this.f145741a.f145733a.mo103800b(R.id.ce9);
                    return C89391z.f203057a;
                }
            });
            assembler2.mo20582b(this.f145733a, new AbstractC89172b<C12767q, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.C64250i.C64274q.C6428115 */

                /* renamed from: a */
                final /* synthetic */ C64274q f145742a;

                static {
                    Covode.recordClassIndex(75726);
                }

                {
                    this.f145742a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C12767q qVar) {
                    C12767q qVar2 = qVar;
                    C89219l.m154721d(qVar2, "");
                    qVar2.mo20632a(C89204ab.m154669a(C64555a.class));
                    qVar2.f31050b = new C64555a();
                    qVar2.f31053e = (TuxButton) this.f145742a.f145733a.mo103800b(R.id.sj);
                    return C89391z.f203057a;
                }
            });
            assembler2.mo20582b(this.f145733a, new AbstractC89172b<C12767q, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.C64250i.C64274q.C642822 */

                /* renamed from: a */
                final /* synthetic */ C64274q f145743a;

                static {
                    Covode.recordClassIndex(75727);
                }

                {
                    this.f145743a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C12767q qVar) {
                    C12767q qVar2 = qVar;
                    C89219l.m154721d(qVar2, "");
                    qVar2.mo20632a(C89204ab.m154669a(C64685a.class));
                    qVar2.f31050b = new C64685a();
                    qVar2.f31053e = (RelativeLayout) this.f145743a.f145733a.mo103800b(R.id.cpc);
                    return C89391z.f203057a;
                }
            });
            assembler2.mo20582b(this.f145733a, new AbstractC89172b<C12767q, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.C64250i.C64274q.C642833 */

                /* renamed from: a */
                final /* synthetic */ C64274q f145744a;

                static {
                    Covode.recordClassIndex(75728);
                }

                {
                    this.f145744a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C12767q qVar) {
                    C12767q qVar2 = qVar;
                    C89219l.m154721d(qVar2, "");
                    qVar2.mo20632a(C89204ab.m154669a(C64924a.class));
                    qVar2.f31050b = new C64924a();
                    qVar2.f31053e = this.f145744a.f145735c;
                    return C89391z.f203057a;
                }
            });
            assembler2.mo20582b(this.f145733a, new AbstractC89172b<C12767q, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.C64250i.C64274q.C642844 */

                /* renamed from: a */
                final /* synthetic */ C64274q f145745a;

                static {
                    Covode.recordClassIndex(75729);
                }

                {
                    this.f145745a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C12767q qVar) {
                    C12767q qVar2 = qVar;
                    C89219l.m154721d(qVar2, "");
                    qVar2.mo20632a(C89204ab.m154669a(C64490e.class));
                    qVar2.f31050b = new C64490e();
                    qVar2.f31053e = this.f145745a.f145735c;
                    return C89391z.f203057a;
                }
            });
            assembler2.mo20582b(this.f145733a, new AbstractC89172b<C12767q, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.C64250i.C64274q.C642855 */

                /* renamed from: a */
                final /* synthetic */ C64274q f145746a;

                static {
                    Covode.recordClassIndex(75730);
                }

                {
                    this.f145746a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C12767q qVar) {
                    C12767q qVar2 = qVar;
                    C89219l.m154721d(qVar2, "");
                    qVar2.mo20632a(C89204ab.m154669a(C64719f.class));
                    qVar2.f31050b = new C64719f();
                    qVar2.f31053e = this.f145746a.f145735c;
                    return C89391z.f203057a;
                }
            });
            assembler2.mo20582b(this.f145733a, new AbstractC89172b<C12767q, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.C64250i.C64274q.C642866 */

                /* renamed from: a */
                final /* synthetic */ C64274q f145747a;

                static {
                    Covode.recordClassIndex(75731);
                }

                {
                    this.f145747a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C12767q qVar) {
                    C12767q qVar2 = qVar;
                    C89219l.m154721d(qVar2, "");
                    qVar2.mo20632a(C89204ab.m154669a(C65126f.class));
                    qVar2.f31050b = new C65126f();
                    qVar2.f31053e = (FrameLayout) this.f145747a.f145733a.mo103800b(R.id.d7p);
                    return C89391z.f203057a;
                }
            });
            if (!C46934fk.f109382f) {
                assembler2.mo20582b(this.f145733a, new AbstractC89172b<C12767q, C89391z>(this) {
                    /* class com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.C64250i.C64274q.C642877 */

                    /* renamed from: a */
                    final /* synthetic */ C64274q f145748a;

                    static {
                        Covode.recordClassIndex(75732);
                    }

                    {
                        this.f145748a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C89391z invoke(C12767q qVar) {
                        C12767q qVar2 = qVar;
                        C89219l.m154721d(qVar2, "");
                        qVar2.mo20632a(C89204ab.m154669a(C64534i.class));
                        qVar2.f31050b = new C64534i();
                        qVar2.f31053e = this.f145748a.f145735c;
                        return C89391z.f203057a;
                    }
                });
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: f */
    private final void m116137f(String str) {
        ActivityC0945e activity;
        String str2;
        String str3;
        String str4;
        if (C49766a.f114511a && (activity = getActivity()) != null) {
            C89219l.m154716b(activity, "");
            Aweme aweme = HomePageDataViewModel.C52942a.m97777a(activity).f121745k;
            if (aweme != null) {
                String aid = aweme.getAid();
                Aweme aweme2 = this.f145698D;
                String str5 = null;
                if (aweme2 != null) {
                    str2 = aweme2.getAid();
                } else {
                    str2 = null;
                }
                if (TextUtils.equals(aid, str2)) {
                    String secAuthorUid = aweme.getSecAuthorUid();
                    Aweme aweme3 = this.f145698D;
                    if (aweme3 != null) {
                        str4 = aweme3.getSecAuthorUid();
                    } else {
                        str4 = null;
                    }
                    if (TextUtils.equals(secAuthorUid, str4)) {
                        return;
                    }
                }
                StringBuilder append = new StringBuilder("I18nUserProfileFragmentV2 ").append(str).append(" invalid aweme, aid: ");
                Aweme aweme4 = this.f145698D;
                if (aweme4 != null) {
                    str3 = aweme4.getAid();
                } else {
                    str3 = null;
                }
                StringBuilder append2 = append.append(str3).append(", aweme_secUid: ");
                Aweme aweme5 = this.f145698D;
                if (aweme5 != null) {
                    str5 = aweme5.getSecAuthorUid();
                }
                C51423a.m95791b(4, "feed2profile", append2.append(str5).append(", secUid: ").append(this.f145097b).append("; homepage_aid: ").append(aweme.getAid()).append(", homepage_secUid: ").append(aweme.getSecAuthorUid()).toString());
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC63980al
    /* renamed from: b */
    public final void mo103544b(View view) {
        C64871b bVar;
        C66623g gVar;
        C89219l.m154721d(view, "");
        super.mo103544b(view);
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (arguments.getSerializable("recommend_enter_profile_params") instanceof C66623g) {
                Serializable serializable = arguments.getSerializable("recommend_enter_profile_params");
                Objects.requireNonNull(serializable, "null cannot be cast to non-null type com.ss.android.ugc.aweme.recommend.RecommendEnterProfileParams");
                gVar = (C66623g) serializable;
            } else {
                gVar = null;
            }
            C64715b bVar2 = new C64715b(arguments.getString("request_id", ""), arguments.getString("room_id", ""), arguments.getString("room_owner_id", ""), arguments.getString("user_type", ""), arguments.getString("enter_from", ""), gVar, arguments.getString("position", ""));
            int i = arguments.getInt("general_search_card_type", 0);
            boolean z = arguments.getBoolean("extra_from_mutual", false);
            boolean z2 = arguments.getBoolean("isFromFeed", true);
            String string = arguments.getString("event_keys");
            if (string == null) {
                string = "";
            }
            C89219l.m154716b(string, "");
            bVar = new C64871b(this.f145100e, z2, this.f145702H, this.f145696B, z, bVar2, i, string);
        } else {
            bVar = new C64871b(this.f145100e, this.f145702H, this.f145696B, null, 242);
        }
        C12780d.m23005a(this, new C64274q(this, bVar, view));
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.p3580d.AbstractC64151d
    /* renamed from: b */
    public final void mo103757b(Aweme aweme) {
        if (aweme != null && !TextUtils.equals(this.f145096a, aweme.getAuthorUid())) {
            mo103548j();
            String authorUid = aweme.getAuthorUid();
            User author = aweme.getAuthor();
            C89219l.m154716b(author, "");
            mo103754a(authorUid, author.getSecUid());
            mo103749a(aweme);
            mo103751a(aweme.getAuthor());
            mo103801c(false);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0109, code lost:
        if (r8.f31016a.containsKey(new com.bytedance.assem.arch.core.C12765o(r2, null)) == false) goto L_0x010b;
     */
    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.p3580d.AbstractC64151d
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo103760c(java.lang.String r15) {
        /*
        // Method dump skipped, instructions count: 355
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.C64250i.mo103760c(java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ea, code lost:
        if (r10.f31016a.containsKey(new com.bytedance.assem.arch.core.C12765o(r2, null)) == false) goto L_0x00ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ec, code lost:
        r11 = r4.element;
        r10 = r6.getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f6, code lost:
        if (r10 == java.lang.Object.class) goto L_0x0143;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f8, code lost:
        r14 = r10.getInterfaces();
        p4600h.p4611f.p4613b.C89219l.m154709a((java.lang.Object) r14, "");
        r13 = new java.util.ArrayList();
        r3 = r14.length;
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0106, code lost:
        if (r2 >= r3) goto L_0x0118;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0108, code lost:
        r1 = r14[r2];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0110, code lost:
        if (com.bytedance.assem.arch.service.AbstractC12800c.class.isAssignableFrom(r1) == false) goto L_0x0115;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0112, code lost:
        r13.add(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0115, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0118, code lost:
        r1 = r13.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0122, code lost:
        if (r1.hasNext() == false) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0124, code lost:
        r0 = (java.lang.Class) r1.next();
        p4600h.p4611f.p4613b.C89219l.m154709a((java.lang.Object) r0, "");
        r11.mo20612a(r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x013d, code lost:
        r10 = r10.getSuperclass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0141, code lost:
        if (r10 != null) goto L_0x00f4;
     */
    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.p3580d.AbstractC64151d
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo103761d(java.lang.String r16) {
        /*
        // Method dump skipped, instructions count: 375
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.C64250i.mo103761d(java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0152, code lost:
        if (r11.f31016a.containsKey(new com.bytedance.assem.arch.core.C12765o(r8, null)) == false) goto L_0x0154;
     */
    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.AbstractC64206ab
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo103782a(int r16) {
        /*
        // Method dump skipped, instructions count: 494
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.C64250i.mo103782a(int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0109, code lost:
        if (r8.f31016a.containsKey(new com.bytedance.assem.arch.core.C12765o(r2, null)) == false) goto L_0x010b;
     */
    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.p3580d.AbstractC64151d
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo103758b(java.lang.String r15) {
        /*
        // Method dump skipped, instructions count: 355
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.C64250i.mo103758b(java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0160, code lost:
        if (r12.f31016a.containsKey(new com.bytedance.assem.arch.core.C12765o(r8, null)) == false) goto L_0x0162;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo103801c(boolean r16) {
        /*
        // Method dump skipped, instructions count: 519
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.C64250i.mo103801c(boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:135:0x030b, code lost:
        if (r3.f31016a.containsKey(new com.bytedance.assem.arch.core.C12765o(r2, null)) == false) goto L_0x030d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x030d, code lost:
        r7 = r8.element;
        r6 = getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0317, code lost:
        if (r6 == java.lang.Object.class) goto L_0x0366;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0319, code lost:
        r5 = r6.getInterfaces();
        p4600h.p4611f.p4613b.C89219l.m154709a((java.lang.Object) r5, "");
        r4 = new java.util.ArrayList();
        r3 = r5.length;
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0327, code lost:
        if (r2 >= r3) goto L_0x0339;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0329, code lost:
        r1 = r5[r2];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0331, code lost:
        if (com.bytedance.assem.arch.service.AbstractC12800c.class.isAssignableFrom(r1) == false) goto L_0x0336;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0333, code lost:
        r4.add(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0336, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0339, code lost:
        r2 = r4.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0343, code lost:
        if (r2.hasNext() == false) goto L_0x0360;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0345, code lost:
        r1 = (java.lang.Class) r2.next();
        p4600h.p4611f.p4613b.C89219l.m154709a((java.lang.Object) r1, "");
        r7.mo20612a(r1, r19);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0360, code lost:
        r6 = r6.getSuperclass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0364, code lost:
        if (r6 != null) goto L_0x0315;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01d4, code lost:
        if (r3.f31016a.containsKey(new com.bytedance.assem.arch.core.C12765o(r2, null)) == false) goto L_0x01d6;
     */
    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC63980al
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo103543a(android.view.View r20) {
        /*
        // Method dump skipped, instructions count: 934
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.C64250i.mo103543a(android.view.View):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00fe, code lost:
        if (r10.f31016a.containsKey(new com.bytedance.assem.arch.core.C12765o(r2, null)) == false) goto L_0x0100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0100, code lost:
        r10 = r4.element;
        r9 = r6.getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x010a, code lost:
        if (r9 == java.lang.Object.class) goto L_0x0157;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x010c, code lost:
        r13 = r9.getInterfaces();
        p4600h.p4611f.p4613b.C89219l.m154709a((java.lang.Object) r13, "");
        r12 = new java.util.ArrayList();
        r3 = r13.length;
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x011a, code lost:
        if (r2 >= r3) goto L_0x012c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x011c, code lost:
        r1 = r13[r2];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0124, code lost:
        if (com.bytedance.assem.arch.service.AbstractC12800c.class.isAssignableFrom(r1) == false) goto L_0x0129;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0126, code lost:
        r12.add(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0129, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x012c, code lost:
        r1 = r12.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0136, code lost:
        if (r1.hasNext() == false) goto L_0x0151;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0138, code lost:
        r0 = (java.lang.Class) r1.next();
        p4600h.p4611f.p4613b.C89219l.m154709a((java.lang.Object) r0, "");
        r10.mo20612a(r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0151, code lost:
        r9 = r9.getSuperclass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0155, code lost:
        if (r9 != null) goto L_0x0108;
     */
    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.p3580d.AbstractC64151d
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo103749a(com.p2082ss.android.ugc.aweme.feed.model.Aweme r15) {
        /*
        // Method dump skipped, instructions count: 395
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.C64250i.mo103749a(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC63980al, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        int i;
        String string;
        Integer e;
        C89219l.m154721d(view, "");
        Bundle arguments = getArguments();
        if (arguments == null || (str = arguments.getString("extra_previous_page")) == null) {
            str = "";
        }
        this.f145710w = str;
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (string = arguments2.getString("profile_from_scene")) == null || (e = C89361p.m154863e(string)) == null) {
            i = 0;
        } else {
            i = e.intValue();
        }
        this.f145703J = i;
        super.onViewCreated(view, bundle);
        C63804z.m115400a(C63804z.m115399a(), this.f145710w);
        try {
            m116137f("onViewCreated verify assem");
            ((AbstractC64616j) C12801d.m23017a(this, C89204ab.m154669a(AbstractC64616j.class))).mo104142a(this.f145703J, EnumC64592g.CHANGE_TAB);
        } catch (Exception e2) {
            C51423a.m95792b("I18nUserProfileFragmentV2", "ProfileInfoService can't be find: ".concat(String.valueOf(e2)));
            ((UserProfileInfoVM) this.f145705L.getValue()).mo104137a(this.f145703J, EnumC64592g.CHANGE_TAB);
        }
        ActivityC0945e activity = getActivity();
        if (activity != null) {
            C89219l.m154716b(activity, "");
            ScrollSwitchStateManager.C52950a.m97811a(activity).mo89353c(this, new C64292t(this));
        }
    }
}
