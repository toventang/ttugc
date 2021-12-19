package com.p2082ss.android.ugc.aweme.mix.mixdetail;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.content.C0643b;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1182af;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.extensions.C12780d;
import com.bytedance.assem.arch.extensions.C12793o;
import com.bytedance.assem.arch.extensions.C12794p;
import com.bytedance.assem.arch.extensions.C12795q;
import com.bytedance.assem.arch.extensions.C12796r;
import com.bytedance.assem.arch.viewModel.AbstractC12818f;
import com.bytedance.assem.arch.viewModel.AbstractC12846h;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.C12814b;
import com.bytedance.assem.arch.viewModel.C12815c;
import com.bytedance.assem.arch.viewModel.C12854k;
import com.bytedance.assem.arch.viewModel.C12856l;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a;
import com.bytedance.ies.dmt.p1194ui.widget.DmtTextView;
import com.bytedance.tiktok.proxy.AbstractC22876d;
import com.bytedance.tiktok.proxy.AbstractC22878f;
import com.bytedance.tiktok.proxy.AbstractC22880h;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.p1713b.C23024a;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.bytedance.tux.dialog.p1713b.C23028c;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.commerce.C37437a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.adapter.C48257j;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.mix.api.MixFeedApi;
import com.p2082ss.android.ugc.aweme.mix.mixdetail.viewmodel.C59853a;
import com.p2082ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosManageViewModel;
import com.p2082ss.android.ugc.aweme.mix.p3446a.C59330a;
import com.p2082ss.android.ugc.aweme.mix.pickcandidate.AddMultiVideoFragment;
import com.p2082ss.android.ugc.aweme.mix.services.MixFeedService;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89391z;
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
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.g */
public final class C59663g extends AbstractC34586a implements AbstractC12846h {

    /* renamed from: k */
    public static final C59670g f136040k = new C59670g((byte) 0);

    /* renamed from: a */
    public TextTitleBar f136041a;

    /* renamed from: b */
    public MixManageBottomView f136042b;

    /* renamed from: c */
    public String f136043c = "";

    /* renamed from: d */
    public String f136044d = "";

    /* renamed from: e */
    public boolean f136045e;

    /* renamed from: j */
    public long f136046j = 300;

    /* renamed from: l */
    private final C12814b f136047l;

    /* renamed from: m */
    private SparseArray f136048m;

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.g$b */
    public static final class C59665b extends AbstractC89220m implements AbstractC89172b<C59853a, C59853a> {
        public static final C59665b INSTANCE = new C59665b();

        static {
            Covode.recordClassIndex(70066);
        }

        public C59665b() {
            super(1);
        }

        public final C59853a invoke(C59853a aVar) {
            C89219l.m154719c(aVar, "");
            return aVar;
        }
    }

    static {
        Covode.recordClassIndex(70064);
    }

    /* renamed from: a */
    public final MixVideosManageViewModel mo97193a() {
        return (MixVideosManageViewModel) this.f136047l.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public final boolean getHasSubscribedForReused() {
        return false;
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public final AbstractC1204m getHostLifecycleOwner() {
        return null;
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public final AbstractC22876d getReceiverForHostVM() {
        return null;
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.g$g */
    public static final class C59670g {
        static {
            Covode.recordClassIndex(70071);
        }

        private C59670g() {
        }

        public /* synthetic */ C59670g(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.g$m */
    public static final class C59678m implements AbstractC17251a {
        static {
            Covode.recordClassIndex(70079);
        }

        @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
        /* renamed from: a */
        public final void mo27339a(View view) {
            C89219l.m154721d(view, "");
        }

        @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
        /* renamed from: b */
        public final void mo27340b(View view) {
            C89219l.m154721d(view, "");
        }

        C59678m() {
        }
    }

    @Override // com.bytedance.tiktok.proxy.AbstractC22878f
    public final AbstractC1204m getActualLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public final AbstractC22878f getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // com.bytedance.tiktok.proxy.AbstractC22880h
    public final AbstractC22876d getActualReceiver() {
        return this;
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public final AbstractC22880h<AbstractC22876d> getActualReceiverHolder() {
        return this;
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.g$c */
    public static final class C59666c extends AbstractC89220m implements AbstractC89171a<C12874b<C59853a>> {
        public static final C59666c INSTANCE = new C59666c();

        static {
            Covode.recordClassIndex(70067);
        }

        public C59666c() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C59853a> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.g$f */
    public static final class C59669f extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C59669f INSTANCE = new C59669f();

        static {
            Covode.recordClassIndex(70070);
        }

        public C59669f() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.g$d */
    public static final class C59667d extends AbstractC89220m implements AbstractC89171a<ActivityC0945e> {

        /* renamed from: a */
        final /* synthetic */ Fragment f136050a;

        static {
            Covode.recordClassIndex(70068);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59667d(Fragment fragment) {
            super(0);
            this.f136050a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final ActivityC0945e invoke() {
            ActivityC0945e requireActivity = this.f136050a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            return requireActivity;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f136048m;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.g$a */
    public static final class C59664a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f136049a;

        static {
            Covode.recordClassIndex(70065);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59664a(AbstractC89277c cVar) {
            super(0);
            this.f136049a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f136049a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.g$e */
    public static final class C59668e extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ Fragment f136051a;

        static {
            Covode.recordClassIndex(70069);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59668e(Fragment fragment) {
            super(0);
            this.f136051a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            ActivityC0945e requireActivity = this.f136051a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            C1182af viewModelStore = requireActivity.getViewModelStore();
            C89219l.m154709a((Object) viewModelStore, "");
            return viewModelStore;
        }
    }

    public C59663g() {
        AbstractC89277c a = C89204ab.m154669a(MixVideosManageViewModel.class);
        this.f136047l = new C12814b(a, new C59664a(a), C59666c.INSTANCE, new C59667d(this), new C59668e(this), C59669f.INSTANCE, C59665b.INSTANCE);
    }

    /* renamed from: b */
    public final void mo97195b() {
        Context context = getContext();
        if (context == null) {
            C89219l.m154715b();
        }
        C89219l.m154716b(context, "");
        C23028c.m43435a((C23023b) new C23023b(context).mo37479a(R.string.b7h).mo37483b(R.string.b7g), new C59688u(this)).mo37405a().mo37396b().show();
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        View view = getView();
        if (view == null) {
            C89219l.m154715b();
        }
        C89219l.m154716b(view, "");
        view.setFocusableInTouchMode(true);
        View view2 = getView();
        if (view2 == null) {
            C89219l.m154715b();
        }
        view2.requestFocus();
        View view3 = getView();
        if (view3 == null) {
            C89219l.m154715b();
        }
        view3.setOnKeyListener(new View$OnKeyListenerC59686t(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.g$o */
    static final class View$OnClickListenerC59681o implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C59663g f136061a;

        static {
            Covode.recordClassIndex(70082);
        }

        View$OnClickListenerC59681o(C59663g gVar) {
            this.f136061a = gVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f136061a.mo97194a(false);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ MixManageBottomView m109225a(C59663g gVar) {
        MixManageBottomView mixManageBottomView = gVar.f136042b;
        if (mixManageBottomView == null) {
            C89219l.m154710a("mBottomView");
        }
        return mixManageBottomView;
    }

    /* renamed from: b */
    public static final /* synthetic */ TextTitleBar m109227b(C59663g gVar) {
        TextTitleBar textTitleBar = gVar.f136041a;
        if (textTitleBar == null) {
            C89219l.m154710a("mTitleBar");
        }
        return textTitleBar;
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.g$i */
    static final class View$OnClickListenerC59672i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C59663g f136053a;

        static {
            Covode.recordClassIndex(70073);
        }

        View$OnClickListenerC59672i(C59663g gVar) {
            this.f136053a = gVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C59663g.m109226a(this.f136053a.mo97193a(), new AbstractC89172b<C59853a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.mix.mixdetail.C59663g.View$OnClickListenerC59672i.C596731 */

                /* renamed from: a */
                final /* synthetic */ View$OnClickListenerC59672i f136054a;

                static {
                    Covode.recordClassIndex(70074);
                }

                {
                    this.f136054a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C59853a aVar) {
                    C59853a aVar2 = aVar;
                    C89219l.m154721d(aVar2, "");
                    if (!aVar2.f136328d.f31085a.booleanValue()) {
                        this.f136054a.f136053a.mo97194a(true);
                    }
                    return C89391z.f203057a;
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.g$n */
    static final class C59679n extends AbstractC89220m implements AbstractC89172b<Assembler, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C59663g f136059a;

        static {
            Covode.recordClassIndex(70080);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59679n(C59663g gVar) {
            super(1);
            this.f136059a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Assembler assembler) {
            Assembler assembler2 = assembler;
            C89219l.m154721d(assembler2, "");
            assembler2.mo20582b(this.f136059a, C596801.f136060a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.g$k */
    static final class View$OnClickListenerC59675k implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C59663g f136056a;

        static {
            Covode.recordClassIndex(70076);
        }

        View$OnClickListenerC59675k(C59663g gVar) {
            this.f136056a = gVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (this.f136056a.f136045e) {
                C59663g.m109226a(this.f136056a.mo97193a(), new AbstractC89172b<C59853a, C89391z>(this) {
                    /* class com.p2082ss.android.ugc.aweme.mix.mixdetail.C59663g.View$OnClickListenerC59675k.C596761 */

                    /* renamed from: a */
                    final /* synthetic */ View$OnClickListenerC59675k f136057a;

                    static {
                        Covode.recordClassIndex(70077);
                    }

                    {
                        this.f136057a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C89391z invoke(C59853a aVar) {
                        C59853a aVar2 = aVar;
                        C89219l.m154721d(aVar2, "");
                        if (aVar2.f136328d.f31085a.booleanValue()) {
                            DmtTextView startText = C59663g.m109227b(this.f136057a.f136056a).getStartText();
                            C89219l.m154716b(startText, "");
                            if (startText.getVisibility() == 0) {
                                this.f136057a.f136056a.mo97195b();
                            }
                        }
                        return C89391z.f203057a;
                    }
                });
                return;
            }
            C59330a.m109037a(this.f136056a.f136043c, this.f136056a.f136044d, false);
            ActivityC0945e activity = this.f136056a.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.g$u */
    public static final class C59688u extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C59663g f136069a;

        static {
            Covode.recordClassIndex(70089);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59688u(C59663g gVar) {
            super(1);
            this.f136069a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23025b bVar) {
            C23025b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            CharSequence text = this.f136069a.getText(R.string.b78);
            C89219l.m154716b(text, "");
            bVar2.mo37421c(text, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.mix.mixdetail.C59663g.C59688u.C596891 */

                /* renamed from: a */
                final /* synthetic */ C59688u f136070a;

                static {
                    Covode.recordClassIndex(70090);
                }

                {
                    this.f136070a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C89219l.m154721d(aVar, "");
                    C59330a.m109037a(this.f136070a.f136069a.f136043c, this.f136070a.f136069a.f136044d, true);
                    ActivityC0945e activity = this.f136070a.f136069a.getActivity();
                    if (activity != null) {
                        activity.finish();
                    }
                    return C89391z.f203057a;
                }
            });
            CharSequence text2 = this.f136069a.getText(R.string.atu);
            C89219l.m154716b(text2, "");
            bVar2.mo37419b(text2, C596902.f136071a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.g$j */
    static final class View$OnClickListenerC59674j implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C59663g f136055a;

        static {
            Covode.recordClassIndex(70075);
        }

        View$OnClickListenerC59674j(C59663g gVar) {
            this.f136055a = gVar;
        }

        public final void onClick(View view) {
            AbstractC0952i supportFragmentManager;
            AbstractC0952i supportFragmentManager2;
            Fragment a;
            AbstractC0952i supportFragmentManager3;
            ClickAgent.onClick(view);
            ActivityC0945e activity = this.f136055a.getActivity();
            if (activity == null || (supportFragmentManager2 = activity.getSupportFragmentManager()) == null || (a = supportFragmentManager2.mo3551a("AddMultiVideoFragment")) == null) {
                AddMultiVideoFragment a2 = AddMultiVideoFragment.C59881m.m109337a();
                ActivityC0945e activity2 = this.f136055a.getActivity();
                if (!(activity2 == null || (supportFragmentManager = activity2.getSupportFragmentManager()) == null)) {
                    supportFragmentManager.mo3552a().mo3451a(R.anim.dq, R.anim.dx).mo3454a(R.id.b82, a2, "AddMultiVideoFragment").mo3457a((String) null).mo3467b();
                }
            } else {
                ActivityC0945e activity3 = this.f136055a.getActivity();
                if (!(activity3 == null || (supportFragmentManager3 = activity3.getSupportFragmentManager()) == null)) {
                    supportFragmentManager3.mo3552a().mo3474c(a).mo3457a((String) null).mo3451a(R.anim.ds, R.anim.dt).mo3467b();
                }
            }
            C59330a.m109041e(this.f136055a.mo97193a().f136169j, "manage_video");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.g$h */
    static final class View$OnClickListenerC59671h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C59663g f136052a;

        static {
            Covode.recordClassIndex(70072);
        }

        View$OnClickListenerC59671h(C59663g gVar) {
            this.f136052a = gVar;
        }

        public final void onClick(View view) {
            ActivityC0945e activity;
            ArrayList arrayList;
            String str;
            ClickAgent.onClick(view);
            if (!C58001a.m104815a(view, this.f136052a.f136046j) && (activity = this.f136052a.getActivity()) != null) {
                MixVideosManageViewModel a = this.f136052a.mo97193a();
                C89219l.m154716b(activity, "");
                C89219l.m154721d(activity, "");
                C59853a aVar = (C59853a) a.mo20671d().mo20680a();
                List<Aweme> list = aVar.f136325a;
                String str2 = null;
                if (list != null) {
                    ArrayList arrayList2 = new ArrayList(C89070n.m154526a((Iterable) list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(it.next().getAid());
                    }
                    arrayList = arrayList2;
                } else {
                    arrayList = null;
                }
                String str3 = ",";
                String a2 = arrayList != null ? C89070n.m154551a(arrayList, str3, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (AbstractC89172b) null, 62) : null;
                if (arrayList == null || arrayList.isEmpty()) {
                    List<String> list2 = aVar.f136326b;
                    if (list2 != null) {
                        str = C89070n.m154551a(list2, str3, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (AbstractC89172b) null, 62);
                    }
                    str = null;
                } else {
                    List<String> list3 = aVar.f136326b;
                    if (list3 != null) {
                        ArrayList arrayList3 = new ArrayList();
                        for (T t : list3) {
                            if (!arrayList.contains(t)) {
                                arrayList3.add(t);
                            }
                        }
                        str3 = str3;
                        str = C89070n.m154551a(arrayList3, str3, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (AbstractC89172b) null, 62);
                    }
                    str = null;
                }
                List<String> list4 = aVar.f136327c;
                if (list4 != null) {
                    str2 = C89070n.m154551a(list4, str3, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (AbstractC89172b) null, 62);
                }
                List<Aweme> list5 = aVar.f136325a;
                if (list5 != null) {
                    for (T t2 : list5) {
                        if (t2.getCommerceVideoAuthInfo() != null) {
                            C37437a commerceVideoAuthInfo = t2.getCommerceVideoAuthInfo();
                            C89219l.m154716b(commerceVideoAuthInfo, "");
                            if (commerceVideoAuthInfo.getDarkPostStatus() == 1) {
                                new C23144b(activity).mo37640e(R.string.b3x).mo37637b();
                                return;
                            }
                        }
                    }
                }
                MixFeedApi a3 = MixFeedApi.C59385a.m109095a();
                int operation = MixFeedApi.EnumC59386b.VIDEOCOMMITCHANGES.getOperation();
                String str4 = a.f136170k;
                if (str4 == null) {
                    C89219l.m154710a("mMixId");
                }
                AbstractC88412b a4 = a3.manageMixFeed(operation, str4, "[" + a2 + ']', "[" + str2 + ']', "[" + str + ']', null).mo142918b(C88925a.m154180b(C88946a.f201991c)).mo142909a(C88391a.m153580a(C88392a.f200660a)).mo142915a(new MixVideosManageViewModel.C59799r(a, activity), new MixVideosManageViewModel.C59800s(a, activity));
                C89219l.m154716b(a4, "");
                a.mo20659a(a4);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.g$p */
    static final class View$OnClickListenerC59682p implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C59663g f136062a;

        static {
            Covode.recordClassIndex(70083);
        }

        View$OnClickListenerC59682p(C59663g gVar) {
            this.f136062a = gVar;
        }

        public final void onClick(View view) {
            List list;
            ClickAgent.onClick(view);
            MixVideosManageViewModel a = this.f136062a.mo97193a();
            C59853a aVar = (C59853a) a.mo20671d().mo20680a();
            C89233z.C89238e eVar = new C89233z.C89238e();
            T t = (T) 0;
            eVar.element = t;
            List<Aweme> list2 = aVar.f136325a;
            ArrayList arrayList = new ArrayList();
            C89233z.C89238e eVar2 = new C89233z.C89238e();
            eVar2.element = (T) aVar.f136327c;
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            if (list2 != null) {
                arrayList.addAll(C89070n.m154590j(list2));
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    T t2 = eVar.element;
                    if (t2 == null) {
                        C89219l.m154715b();
                    }
                    Aweme aweme = (Aweme) arrayList.get(i - t2.intValue());
                    List<String> list3 = aVar.f136326b;
                    if (list3 != null && list3.contains(aweme.getAid())) {
                        arrayList.remove(i - eVar.element.intValue());
                        eVar.element = (T) Integer.valueOf(eVar.element.intValue() + 1);
                    }
                }
                if (eVar2.element != null) {
                    arrayList2.addAll(C89070n.m154590j(eVar2.element));
                    List<String> list4 = aVar.f136326b;
                    if (list4 != null) {
                        list = C89070n.m154590j(list4);
                    } else {
                        list = null;
                    }
                    C48257j.m91661a(arrayList3, list);
                    int size2 = arrayList2.size();
                    int i2 = 0;
                    for (int i3 = 0; i3 < size2; i3++) {
                        int i4 = i3 - i2;
                        Object obj = arrayList2.get(i4);
                        C89219l.m154716b(obj, "");
                        List<String> list5 = aVar.f136326b;
                        if (list5 != null && list5.contains(obj)) {
                            arrayList2.remove(i4);
                            i2++;
                            arrayList3.remove(obj);
                        }
                    }
                }
                a.mo20662a(new MixVideosManageViewModel.C59782e(arrayList, list2, eVar, aVar, eVar2, arrayList2, arrayList3, a));
                a.mo20662a(MixVideosManageViewModel.C59784g.f136198a);
            }
            C59853a aVar2 = (C59853a) a.mo20671d().mo20680a();
            C89233z.C89238e eVar3 = new C89233z.C89238e();
            eVar3.element = t;
            List<Aweme> list6 = aVar2.f136330f;
            ArrayList arrayList4 = new ArrayList();
            if (list6 != null) {
                arrayList4.addAll(C89070n.m154590j(list6));
                int size3 = arrayList4.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    T t3 = eVar3.element;
                    if (t3 == null) {
                        C89219l.m154715b();
                    }
                    Aweme aweme2 = (Aweme) arrayList4.get(i5 - t3.intValue());
                    List<String> list7 = aVar2.f136326b;
                    if (list7 != null && list7.contains(aweme2.getAid())) {
                        arrayList4.remove(i5 - eVar3.element.intValue());
                        eVar3.element = (T) Integer.valueOf(eVar3.element.intValue() + 1);
                    }
                }
                a.mo20662a(new MixVideosManageViewModel.C59783f(arrayList4, list6, eVar3, aVar2, a));
            }
            C39162r.m79460a("remove_multiple_playlist_video", new C33744d().mo59983a("enter_from", this.f136062a.f136044d).mo59983a("enter_method", "manage_video").mo59983a("playlist_id", this.f136062a.f136043c).f79943a);
            this.f136062a.mo97194a(true);
            new C23144b(this.f136062a).mo37640e(R.string.f_x).mo37637b();
        }
    }

    /* renamed from: a */
    public final void mo97194a(boolean z) {
        mo97193a().mo97230a(z);
        if (z) {
            TextTitleBar textTitleBar = this.f136041a;
            if (textTitleBar == null) {
                C89219l.m154710a("mTitleBar");
            }
            DmtTextView startText = textTitleBar.getStartText();
            C89219l.m154716b(startText, "");
            startText.setVisibility(0);
            TextTitleBar textTitleBar2 = this.f136041a;
            if (textTitleBar2 == null) {
                C89219l.m154710a("mTitleBar");
            }
            textTitleBar2.setTitle(R.string.bjp);
            TextTitleBar textTitleBar3 = this.f136041a;
            if (textTitleBar3 == null) {
                C89219l.m154710a("mTitleBar");
            }
            DmtTextView endText = textTitleBar3.getEndText();
            C89219l.m154716b(endText, "");
            endText.setVisibility(0);
            TextTitleBar textTitleBar4 = this.f136041a;
            if (textTitleBar4 == null) {
                C89219l.m154710a("mTitleBar");
            }
            ImageView backBtn = textTitleBar4.getBackBtn();
            C89219l.m154716b(backBtn, "");
            backBtn.setVisibility(8);
            TextTitleBar textTitleBar5 = this.f136041a;
            if (textTitleBar5 == null) {
                C89219l.m154710a("mTitleBar");
            }
            textTitleBar5.setUseBackIcon(false);
        } else {
            TextTitleBar textTitleBar6 = this.f136041a;
            if (textTitleBar6 == null) {
                C89219l.m154710a("mTitleBar");
            }
            textTitleBar6.setUseBackIcon(true);
            TextTitleBar textTitleBar7 = this.f136041a;
            if (textTitleBar7 == null) {
                C89219l.m154710a("mTitleBar");
            }
            textTitleBar7.setTitle(R.string.f_p);
            TextTitleBar textTitleBar8 = this.f136041a;
            if (textTitleBar8 == null) {
                C89219l.m154710a("mTitleBar");
            }
            DmtTextView startText2 = textTitleBar8.getStartText();
            C89219l.m154716b(startText2, "");
            startText2.setVisibility(8);
            TextTitleBar textTitleBar9 = this.f136041a;
            if (textTitleBar9 == null) {
                C89219l.m154710a("mTitleBar");
            }
            DmtTextView endText2 = textTitleBar9.getEndText();
            C89219l.m154716b(endText2, "");
            endText2.setVisibility(8);
        }
        if (z) {
            MixManageBottomView mixManageBottomView = this.f136042b;
            if (mixManageBottomView == null) {
                C89219l.m154710a("mBottomView");
            }
            mixManageBottomView.getEditMixLayout().setVisibility(0);
            MixManageBottomView mixManageBottomView2 = this.f136042b;
            if (mixManageBottomView2 == null) {
                C89219l.m154710a("mBottomView");
            }
            mixManageBottomView2.getRemoveConfirmView().setVisibility(8);
            return;
        }
        MixManageBottomView mixManageBottomView3 = this.f136042b;
        if (mixManageBottomView3 == null) {
            C89219l.m154710a("mBottomView");
        }
        mixManageBottomView3.getEditMixLayout().setVisibility(8);
        MixManageBottomView mixManageBottomView4 = this.f136042b;
        if (mixManageBottomView4 == null) {
            C89219l.m154710a("mBottomView");
        }
        mixManageBottomView4.getRemoveConfirmView().setVisibility(0);
    }

    /* renamed from: a */
    public static <VM1 extends AssemViewModel<S1>, S1 extends AbstractC12853j, R> R m109226a(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC12846h.C12847a.m23091a(vm1, bVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.g$s */
    static final class C59685s extends AbstractC89220m implements AbstractC89183m<AbstractC22876d, List<? extends Aweme>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C59663g f136066a;

        static {
            Covode.recordClassIndex(70086);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59685s(C59663g gVar) {
            super(2);
            this.f136066a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC22876d dVar, List<? extends Aweme> list) {
            boolean z;
            List<? extends Aweme> list2 = list;
            C89219l.m154721d(dVar, "");
            TuxButton removeView = C59663g.m109225a(this.f136066a).getRemoveView();
            if (list2 == null || list2.size() != 0) {
                z = true;
            } else {
                z = false;
            }
            removeView.setEnabled(z);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.g$l */
    static final class C59677l extends AbstractC89220m implements AbstractC89183m<AbstractC22876d, C12776a<? extends Boolean>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C59663g f136058a;

        static {
            Covode.recordClassIndex(70078);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59677l(C59663g gVar) {
            super(2);
            this.f136058a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC22876d dVar, C12776a<? extends Boolean> aVar) {
            C12776a<? extends Boolean> aVar2 = aVar;
            C89219l.m154721d(dVar, "");
            C89219l.m154721d(aVar2, "");
            this.f136058a.f136045e = aVar2.f31085a.booleanValue();
            if (aVar2.f31085a.booleanValue()) {
                C59663g.m109227b(this.f136058a).getEndText().setTextColor(C0643b.m2378c(C59663g.m109227b(this.f136058a).getContext(), R.color.bh));
                DmtTextView endText = C59663g.m109227b(this.f136058a).getEndText();
                C89219l.m154716b(endText, "");
                endText.setEnabled(true);
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        MixVideosManageViewModel a;
        MixVideosManageViewModel a2;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.ckx);
        C89219l.m154716b(findViewById, "");
        TextTitleBar textTitleBar = (TextTitleBar) findViewById;
        this.f136041a = textTitleBar;
        if (textTitleBar == null) {
            C89219l.m154710a("mTitleBar");
        }
        textTitleBar.setUseBackIcon(false);
        TextTitleBar textTitleBar2 = this.f136041a;
        if (textTitleBar2 == null) {
            C89219l.m154710a("mTitleBar");
        }
        textTitleBar2.getBackBtn().setOnClickListener(new View$OnClickListenerC59672i(this));
        TextTitleBar textTitleBar3 = this.f136041a;
        if (textTitleBar3 == null) {
            C89219l.m154710a("mTitleBar");
        }
        textTitleBar3.setStartText(R.string.a8y);
        TextTitleBar textTitleBar4 = this.f136041a;
        if (textTitleBar4 == null) {
            C89219l.m154710a("mTitleBar");
        }
        textTitleBar4.getBackBtn().setImageResource(2131233257);
        TextTitleBar textTitleBar5 = this.f136041a;
        if (textTitleBar5 == null) {
            C89219l.m154710a("mTitleBar");
        }
        textTitleBar5.setTitle(R.string.bjp);
        TextTitleBar textTitleBar6 = this.f136041a;
        if (textTitleBar6 == null) {
            C89219l.m154710a("mTitleBar");
        }
        textTitleBar6.setEndText(R.string.baq);
        TextTitleBar textTitleBar7 = this.f136041a;
        if (textTitleBar7 == null) {
            C89219l.m154710a("mTitleBar");
        }
        textTitleBar7.getEndText().setTextColor(getResources().getColor(R.color.bz));
        TextTitleBar textTitleBar8 = this.f136041a;
        if (textTitleBar8 == null) {
            C89219l.m154710a("mTitleBar");
        }
        DmtTextView endText = textTitleBar8.getEndText();
        C89219l.m154716b(endText, "");
        endText.setEnabled(false);
        TextTitleBar textTitleBar9 = this.f136041a;
        if (textTitleBar9 == null) {
            C89219l.m154710a("mTitleBar");
        }
        textTitleBar9.getStartText().setOnClickListener(new View$OnClickListenerC59675k(this));
        TextTitleBar textTitleBar10 = this.f136041a;
        if (textTitleBar10 == null) {
            C89219l.m154710a("mTitleBar");
        }
        DmtTextView endText2 = textTitleBar10.getEndText();
        C89219l.m154716b(endText2, "");
        if (endText2.getVisibility() == 0) {
            AbstractC12818f.C12819a.m23063a(this, mo97193a(), C59691h.f136072a, (C12854k) null, new C59677l(this), 6);
        }
        TextTitleBar textTitleBar11 = this.f136041a;
        if (textTitleBar11 == null) {
            C89219l.m154710a("mTitleBar");
        }
        DmtTextView endText3 = textTitleBar11.getEndText();
        C89219l.m154716b(endText3, "");
        endText3.isEnabled();
        TextTitleBar textTitleBar12 = this.f136041a;
        if (textTitleBar12 == null) {
            C89219l.m154710a("mTitleBar");
        }
        textTitleBar12.getEndText().setOnClickListener(new View$OnClickListenerC59671h(this));
        TextTitleBar textTitleBar13 = this.f136041a;
        if (textTitleBar13 == null) {
            C89219l.m154710a("mTitleBar");
        }
        textTitleBar13.setOnTitleBarClickListener(new C59678m());
        C12780d.m23005a(this, new C59679n(this));
        View findViewById2 = view.findViewById(R.id.ckw);
        C89219l.m154716b(findViewById2, "");
        MixManageBottomView mixManageBottomView = (MixManageBottomView) findViewById2;
        this.f136042b = mixManageBottomView;
        if (mixManageBottomView == null) {
            C89219l.m154710a("mBottomView");
        }
        mixManageBottomView.getRemoveView().setOnClickListener(new View$OnClickListenerC59681o(this));
        MixManageBottomView mixManageBottomView2 = this.f136042b;
        if (mixManageBottomView2 == null) {
            C89219l.m154710a("mBottomView");
        }
        mixManageBottomView2.getRemoveConfirmView().setOnClickListener(new View$OnClickListenerC59682p(this));
        MixManageBottomView mixManageBottomView3 = this.f136042b;
        if (mixManageBottomView3 == null) {
            C89219l.m154710a("mBottomView");
        }
        mixManageBottomView3.getAddVideoView().setOnClickListener(new View$OnClickListenerC59674j(this));
        mo20510a(a, C59692i.f136073a, C59693j.f136074a, C12856l.m23102a(mo97193a().f31149c), null, new C59683q(this));
        C89233z.C89236c cVar = new C89233z.C89236c();
        cVar.element = MixFeedService.m109435k().mo97328d();
        mo20510a(a2, C59694k.f136075a, C59695l.f136076a, C12856l.m23102a(mo97193a().f31149c), null, new C59684r(this, cVar));
        AbstractC12818f.C12819a.m23063a(this, mo97193a(), C59696m.f136077a, (C12854k) null, new C59685s(this), 6);
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.g$t */
    static final class View$OnKeyListenerC59686t implements View.OnKeyListener {

        /* renamed from: a */
        final /* synthetic */ C59663g f136067a;

        static {
            Covode.recordClassIndex(70087);
        }

        View$OnKeyListenerC59686t(C59663g gVar) {
            this.f136067a = gVar;
        }

        public final boolean onKey(View view, int i, KeyEvent keyEvent) {
            C89219l.m154716b(keyEvent, "");
            if (keyEvent.getAction() != 0 || i != 4) {
                return false;
            }
            C59663g.m109226a(this.f136067a.mo97193a(), new AbstractC89172b<C59853a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.mix.mixdetail.C59663g.View$OnKeyListenerC59686t.C596871 */

                /* renamed from: a */
                final /* synthetic */ View$OnKeyListenerC59686t f136068a;

                static {
                    Covode.recordClassIndex(70088);
                }

                {
                    this.f136068a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C59853a aVar) {
                    C59853a aVar2 = aVar;
                    C89219l.m154721d(aVar2, "");
                    if (!aVar2.f136328d.f31085a.booleanValue()) {
                        this.f136068a.f136067a.mo97194a(true);
                        return C89391z.f203057a;
                    } else if (this.f136068a.f136067a.f136045e) {
                        this.f136068a.f136067a.mo97195b();
                        return C89391z.f203057a;
                    } else {
                        C59330a.m109037a(this.f136068a.f136067a.f136043c, this.f136068a.f136067a.f136044d, false);
                        ActivityC0945e activity = this.f136068a.f136067a.getActivity();
                        if (activity == null) {
                            return null;
                        }
                        activity.finish();
                        return C89391z.f203057a;
                    }
                }
            });
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.g$r */
    static final class C59684r extends AbstractC89220m implements AbstractC89187q<AbstractC22876d, List<? extends String>, List<? extends String>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C59663g f136064a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89236c f136065b;

        static {
            Covode.recordClassIndex(70085);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59684r(C59663g gVar, C89233z.C89236c cVar) {
            super(3);
            this.f136064a = gVar;
            this.f136065b = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(AbstractC22876d dVar, List<? extends String> list, List<? extends String> list2) {
            boolean z;
            List<? extends String> list3 = list;
            C89219l.m154721d(dVar, "");
            TuxButton addVideoView = C59663g.m109225a(this.f136064a).getAddVideoView();
            if (list3 == null) {
                C89219l.m154715b();
            }
            if (list3.size() < this.f136065b.element) {
                z = true;
            } else {
                z = false;
            }
            addVideoView.setEnabled(z);
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str = "";
        C89219l.m154721d(layoutInflater, str);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("key_mix_id");
            if (string == null) {
                string = str;
            }
            this.f136043c = string;
            String string2 = arguments.getString("enter_from");
            if (string2 != null) {
                str = string2;
            }
            this.f136044d = str;
        }
        return C1764a.m5927a(layoutInflater, R.layout.a14, viewGroup, false);
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.g$q */
    static final class C59683q extends AbstractC89220m implements AbstractC89187q<AbstractC22876d, List<? extends String>, List<? extends Aweme>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C59663g f136063a;

        static {
            Covode.recordClassIndex(70084);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59683q(C59663g gVar) {
            super(3);
            this.f136063a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(AbstractC22876d dVar, List<? extends String> list, List<? extends Aweme> list2) {
            List<? extends String> list3 = list;
            List<? extends Aweme> list4 = list2;
            C89219l.m154721d(dVar, "");
            if (list3 != null) {
                if (list4 != null) {
                    ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list4, 10));
                    Iterator<T> it = list4.iterator();
                    while (it.hasNext()) {
                        arrayList.add(it.next().getAid());
                    }
                    ArrayList arrayList2 = arrayList;
                    if (arrayList2 != null && (!arrayList2.isEmpty())) {
                        ArrayList arrayList3 = new ArrayList();
                        for (T t : list3) {
                            if (arrayList2.contains(t)) {
                                arrayList3.add(t);
                            }
                        }
                        C59663g.m109225a(this.f136063a).mo97181a(arrayList3.size());
                    }
                }
                C59663g.m109225a(this.f136063a).mo97181a(list3.size());
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    /* renamed from: a */
    public final <S extends AbstractC12853j> void mo20508a(AssemViewModel<S> assemViewModel, C12854k<S> kVar, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89183m<? super AbstractC22876d, ? super S, C89391z> mVar) {
        C89219l.m154721d(assemViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(mVar, "");
        AbstractC12846h.C12847a.m23092a(this, assemViewModel, kVar, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    /* renamed from: b */
    public final <S extends AbstractC12853j, A> void mo20515b(AssemViewModel<S> assemViewModel, AbstractC89290k<S, ? extends A> kVar, C12854k<C12793o<A>> kVar2, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89183m<? super AbstractC22876d, ? super A, C89391z> mVar) {
        C89219l.m154721d(assemViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(mVar, "");
        AbstractC12846h.C12847a.m23097b(this, assemViewModel, kVar, kVar2, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    /* renamed from: a */
    public final <S extends AbstractC12853j, A> void mo20509a(AssemViewModel<S> assemViewModel, AbstractC89290k<S, ? extends A> kVar, C12854k<C12793o<A>> kVar2, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89183m<? super AbstractC22876d, ? super A, C89391z> mVar) {
        C89219l.m154721d(assemViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(mVar, "");
        AbstractC12846h.C12847a.m23093a(this, assemViewModel, kVar, kVar2, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    /* renamed from: a */
    public final <S extends AbstractC12853j, A, B> void mo20510a(AssemViewModel<S> assemViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, C12854k<C12794p<A, B>> kVar3, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89187q<? super AbstractC22876d, ? super A, ? super B, C89391z> qVar) {
        C89219l.m154721d(assemViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(qVar, "");
        AbstractC12846h.C12847a.m23094a(this, assemViewModel, kVar, kVar2, kVar3, bVar, qVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    /* renamed from: a */
    public final <S extends AbstractC12853j, A, B, C> void mo20511a(AssemViewModel<S> assemViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, C12854k<C12795q<A, B, C>> kVar4, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89188r<? super AbstractC22876d, ? super A, ? super B, ? super C, C89391z> rVar) {
        C89219l.m154721d(assemViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(kVar4, "");
        C89219l.m154721d(rVar, "");
        AbstractC12846h.C12847a.m23095a(this, assemViewModel, kVar, kVar2, kVar3, kVar4, bVar, rVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    /* renamed from: a */
    public final <S extends AbstractC12853j, A, B, C, D> void mo20512a(AssemViewModel<S> assemViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, AbstractC89290k<S, ? extends D> kVar4, C12854k<C12796r<A, B, C, D>> kVar5, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89189s<? super AbstractC22876d, ? super A, ? super B, ? super C, ? super D, C89391z> sVar) {
        C89219l.m154721d(assemViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(kVar4, "");
        C89219l.m154721d(kVar5, "");
        C89219l.m154721d(sVar, "");
        AbstractC12846h.C12847a.m23096a(this, assemViewModel, kVar, kVar2, kVar3, kVar4, kVar5, bVar, sVar);
    }
}
