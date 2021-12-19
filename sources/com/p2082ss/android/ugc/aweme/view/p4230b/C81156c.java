package com.p2082ss.android.ugc.aweme.view.p4230b;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.AbstractC0952i;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.jedi.arch.AbstractC20477i;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.C20531t;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.C39165u;
import com.p2082ss.android.ugc.aweme.common.C39219x;
import com.p2082ss.android.ugc.aweme.model.AbstractC60142d;
import com.p2082ss.android.ugc.aweme.model.AbstractC60154n;
import com.p2082ss.android.ugc.aweme.model.AbstractC60162u;
import com.p2082ss.android.ugc.aweme.model.C60141c;
import com.p2082ss.android.ugc.aweme.model.C60148j;
import com.p2082ss.android.ugc.aweme.model.C60157q;
import com.p2082ss.android.ugc.aweme.model.C60159r;
import com.p2082ss.android.ugc.aweme.p2398bn.C34891a;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.C64315z;
import com.p2082ss.android.ugc.aweme.utils.C80558hx;
import com.p2082ss.android.ugc.aweme.view.customView.AbstractC81202b;
import com.p2082ss.android.ugc.aweme.view.customView.C81200a;
import com.p2082ss.android.ugc.aweme.view.customView.NaviGLSurfaceView;
import com.p2082ss.android.ugc.aweme.view.customView.NaviNonSwipingViewPager;
import com.p2082ss.android.ugc.aweme.view.p4229a.C81127d;
import com.p2082ss.android.ugc.aweme.view.p4229a.C81128e;
import com.p2082ss.android.ugc.aweme.viewModel.ProfileNaviCreatorViewModel;
import com.p2082ss.android.ugc.aweme.viewModel.ProfileNaviEditorState;
import com.p2082ss.android.ugc.aweme.viewModel.ProfileNaviEditorViewModel;
import com.p2082ss.android.ugc.aweme.viewModel.ProfileNaviSpinnerViewModel;
import com.p2082ss.android.ugc.trill.R;
import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.Map;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.view.b.c */
public final class C81156c extends AbstractC81202b {

    /* renamed from: b */
    public AbstractC0952i f181354b;

    /* renamed from: c */
    private final AbstractC89244h f181355c = C89250i.m154773a((AbstractC89171a) new C81157a(this));

    /* renamed from: d */
    private final AbstractC89244h f181356d = C89250i.m154773a((AbstractC89171a) new C81169h(this));

    /* renamed from: e */
    private SparseArray f181357e;

    static {
        Covode.recordClassIndex(94484);
    }

    @Override // com.p2082ss.android.ugc.aweme.view.customView.AbstractC81202b
    /* renamed from: a */
    public final View mo124616a(int i) {
        if (this.f181357e == null) {
            this.f181357e = new SparseArray();
        }
        View view = (View) this.f181357e.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f181357e.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.view.customView.AbstractC81202b
    /* renamed from: b */
    public final int mo124617b() {
        return R.layout.aos;
    }

    @Override // com.p2082ss.android.ugc.aweme.view.customView.AbstractC81202b
    /* renamed from: j */
    public final void mo124621j() {
        SparseArray sparseArray = this.f181357e;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: k */
    public final ProfileNaviCreatorViewModel mo124622k() {
        return (ProfileNaviCreatorViewModel) this.f181355c.getValue();
    }

    /* renamed from: l */
    public final ProfileNaviSpinnerViewModel mo124623l() {
        return (ProfileNaviSpinnerViewModel) this.f181356d.getValue();
    }

    @Override // androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.view.customView.AbstractC81202b
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo124621j();
    }

    @Override // com.p2082ss.android.ugc.aweme.view.customView.AbstractC81202b
    /* renamed from: e */
    public final NaviGLSurfaceView mo124619e() {
        return (NaviGLSurfaceView) mo124616a(R.id.cqb);
    }

    /* renamed from: com.ss.android.ugc.aweme.view.b.c$a */
    static final class C81157a extends AbstractC89220m implements AbstractC89171a<ProfileNaviCreatorViewModel> {

        /* renamed from: a */
        final /* synthetic */ C81156c f181358a;

        static {
            Covode.recordClassIndex(94485);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81157a(C81156c cVar) {
            super(0);
            this.f181358a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ProfileNaviCreatorViewModel invoke() {
            JediViewModel a = C20531t.m38716a(this.f181358a.requireActivity()).mo33800a(ProfileNaviCreatorViewModel.class);
            C89219l.m154716b(a, "");
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.view.b.c$h */
    static final class C81169h extends AbstractC89220m implements AbstractC89171a<ProfileNaviSpinnerViewModel> {

        /* renamed from: a */
        final /* synthetic */ C81156c f181371a;

        static {
            Covode.recordClassIndex(94497);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81169h(C81156c cVar) {
            super(0);
            this.f181371a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ProfileNaviSpinnerViewModel invoke() {
            JediViewModel a = C20531t.m38716a(this.f181371a.requireActivity()).mo33800a(ProfileNaviSpinnerViewModel.class);
            C89219l.m154716b(a, "");
            return a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.view.customView.AbstractC81202b
    /* renamed from: g */
    public final void mo124620g() {
        super.mo124620g();
        AbstractC88412b unused = selectSubscribe(mo124687a(), C81170d.f181372a, new C20370ah(), new C81167f(this));
        AbstractC88412b unused2 = selectSubscribe(mo124687a(), C81171e.f181373a, new C20370ah(), new C81168g(this));
    }

    /* renamed from: m */
    public final boolean mo124624m() {
        mo124687a();
        if (C60159r.f137138a == null) {
            return true;
        }
        mo124687a();
        C60157q qVar = C60159r.f137138a;
        if (qVar == null) {
            C89219l.m154715b();
        }
        if (!C64315z.m116188a(qVar.f137132a)) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public final String mo124625n() {
        ViewPager viewPager = (ViewPager) mo124616a(R.id.cqg);
        C89219l.m154716b(viewPager, "");
        int currentItem = viewPager.getCurrentItem();
        List<AbstractC60162u> tabList = ((ProfileNaviEditorState) mo124687a().mo33676a(this)).getTabList();
        if (tabList == null || tabList.size() <= currentItem) {
            return null;
        }
        return tabList.get(currentItem).mo97836a();
    }

    /* renamed from: o */
    public final void mo124626o() {
        ViewPager viewPager = (ViewPager) mo124616a(R.id.cqd);
        if (viewPager != null) {
            viewPager.setAdapter(null);
        }
        NaviNonSwipingViewPager naviNonSwipingViewPager = (NaviNonSwipingViewPager) mo124616a(R.id.cqg);
        if (naviNonSwipingViewPager != null) {
            naviNonSwipingViewPager.setVisibility(0);
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) mo124616a(R.id.cqc);
        if (constraintLayout != null) {
            constraintLayout.setVisibility(8);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.view.customView.AbstractC81202b
    /* renamed from: c */
    public final void mo124618c() {
        TuxTextView tuxTextView = (TuxTextView) mo124616a(R.id.d89);
        if (tuxTextView != null) {
            tuxTextView.setOnClickListener(new View$OnClickListenerC81158b(this));
        }
        TuxIconView tuxIconView = (TuxIconView) mo124616a(R.id.d82);
        if (tuxIconView != null) {
            tuxIconView.setOnClickListener(new View$OnClickListenerC81159c(this));
        }
        TuxTextView tuxTextView2 = (TuxTextView) mo124616a(R.id.d8_);
        if (tuxTextView2 != null) {
            tuxTextView2.setOnClickListener(new View$OnClickListenerC81162d(this));
        }
        ((TuxButton) mo124616a(R.id.cqa)).setOnClickListener(new View$OnClickListenerC81163e(this));
    }

    public C81156c(AbstractC0952i iVar) {
        C89219l.m154721d(iVar, "");
        this.f181354b = iVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.view.b.c$c */
    static final class View$OnClickListenerC81159c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C81156c f181360a;

        static {
            Covode.recordClassIndex(94487);
        }

        View$OnClickListenerC81159c(C81156c cVar) {
            this.f181360a = cVar;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            C39162r.m79460a("click_exit_avatar", new C33744d().mo59983a("item_tab", this.f181360a.mo124625n()).f79943a);
            if (this.f181360a.getContext() != null) {
                C17197a.C17200a a = new C17197a.C17200a(this.f181360a.getContext()).mo27189a(R.string.a13);
                Context context = this.f181360a.getContext();
                if (context != null) {
                    str = context.getString(R.string.a11);
                } else {
                    str = null;
                }
                a.f41071b = str;
                a.f41067M = true;
                C17197a a2 = a.mo27190a(R.string.a12, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC81160a(this), false).mo27195b(R.string.a0l, (DialogInterface.OnClickListener) DialogInterface$OnClickListenerC81161b.f181362a, false).mo27193a();
                C34891a.m71267a();
                a2.mo27185c();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.view.b.c$c$b */
        static final class DialogInterface$OnClickListenerC81161b implements DialogInterface.OnClickListener {

            /* renamed from: a */
            public static final DialogInterface$OnClickListenerC81161b f181362a = new DialogInterface$OnClickListenerC81161b();

            static {
                Covode.recordClassIndex(94489);
            }

            DialogInterface$OnClickListenerC81161b() {
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                C39162r.m79460a("cancel_exit_avatar", new C33744d().f79943a);
                dialogInterface.cancel();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.view.b.c$c$a */
        static final class DialogInterface$OnClickListenerC81160a implements DialogInterface.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ View$OnClickListenerC81159c f181361a;

            static {
                Covode.recordClassIndex(94488);
            }

            DialogInterface$OnClickListenerC81160a(View$OnClickListenerC81159c cVar) {
                this.f181361a = cVar;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                boolean m = this.f181361a.f181360a.mo124624m();
                C39162r.m79460a("confirm_exit_avatar", new C33744d().mo59980a("is_new", m ? 1 : 0).mo59983a("end_time", String.valueOf(new Date().getTime())).f79943a);
                ProfileNaviEditorViewModel a = this.f181361a.f181360a.mo124687a();
                a.mo33690d(ProfileNaviEditorViewModel.C81345s.f181707a);
                a.mo33690d(ProfileNaviEditorViewModel.C81346t.f181708a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.view.b.c$b */
    static final class View$OnClickListenerC81158b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C81156c f181359a;

        static {
            Covode.recordClassIndex(94486);
        }

        View$OnClickListenerC81158b(C81156c cVar) {
            this.f181359a = cVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0058  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0080  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0093 A[LOOP:0: B:24:0x008d->B:26:0x0093, LOOP_END] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r6) {
            /*
            // Method dump skipped, instructions count: 196
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.view.p4230b.C81156c.View$OnClickListenerC81158b.onClick(android.view.View):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.view.b.c$d */
    static final class View$OnClickListenerC81162d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C81156c f181363a;

        static {
            Covode.recordClassIndex(94490);
        }

        View$OnClickListenerC81162d(C81156c cVar) {
            this.f181363a = cVar;
        }

        public final void onClick(View view) {
            AbstractC60142d dVar;
            String str;
            String str2;
            String str3;
            String a;
            ClickAgent.onClick(view);
            this.f181363a.mo124626o();
            C39219x editCategory = ((ProfileNaviEditorState) this.f181363a.mo124687a().mo33676a(this.f181363a)).getEditCategory();
            this.f181363a.mo124687a();
            C60157q qVar = C60159r.f137138a;
            if (editCategory != null) {
                dVar = editCategory.f92639b;
                if (!(dVar == null || qVar == null)) {
                    if (C64315z.m116188a(dVar.mo97822h())) {
                        a = dVar.mo97822h();
                        if (a == null) {
                            C89219l.m154715b();
                        }
                    } else {
                        a = dVar.mo97815a();
                    }
                    if (qVar.mo97833b(a) != null) {
                        AbstractC60154n b = qVar.mo97833b(a);
                        if (b == null) {
                            C89219l.m154715b();
                        }
                        str = b.mo97825a();
                    } else if (qVar.mo97834c(a) != null) {
                        C60148j c = qVar.mo97834c(a);
                        if (c == null) {
                            C89219l.m154715b();
                        }
                        str = c.f137099a;
                    }
                }
                str = null;
            } else {
                dVar = null;
                str = null;
            }
            if (editCategory != null) {
                StringBuilder sb = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                for (Map.Entry<String, Integer> entry : editCategory.f92638a.entrySet()) {
                    sb.append(entry.getKey());
                    sb2.append(entry.getValue().intValue());
                    sb.append(",");
                    sb2.append(",");
                }
                str2 = sb.toString();
                str3 = sb2.toString();
            } else {
                str2 = null;
                str3 = null;
            }
            C39162r.m79460a("submit_avatar_detail", new C33744d().mo59983a("item_id", str).mo59983a("item_tab", dVar != null ? dVar.mo97815a() : null).mo59983a("detail_category", str2).mo59983a("value", str3).f79943a);
            ProfileNaviEditorState profileNaviEditorState = (ProfileNaviEditorState) this.f181363a.mo124687a().aB_();
            C39219x editCategory2 = profileNaviEditorState.getEditCategory();
            if (editCategory2 != null) {
                editCategory2.mo68102a();
            }
            profileNaviEditorState.setEditCategory(null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.view.b.c$e */
    static final class View$OnClickListenerC81163e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C81156c f181364a;

        static {
            Covode.recordClassIndex(94491);
        }

        View$OnClickListenerC81163e(C81156c cVar) {
            this.f181364a = cVar;
        }

        public final void onClick(View view) {
            C81200a naviManager;
            ClickAgent.onClick(view);
            this.f181364a.mo124623l().mo33690d(ProfileNaviSpinnerViewModel.C81382b.f181767a);
            String n = this.f181364a.mo124625n();
            this.f181364a.mo124687a();
            C60157q qVar = C60159r.f137138a;
            boolean m = this.f181364a.mo124624m();
            String valueOf = String.valueOf(new Date().getTime());
            StringBuilder sb = new StringBuilder();
            if (qVar != null) {
                for (AbstractC60154n nVar : qVar.f137134c.values()) {
                    sb.append(nVar.mo97825a());
                    sb.append(",");
                }
                for (C60148j jVar : qVar.f137135d.values()) {
                    sb.append(jVar.f137099a);
                    sb.append(",");
                }
            }
            C39162r.m79460a("save_avatar", new C33744d().mo59980a("is_new", m ? 1 : 0).mo59983a("last_item_tab", n).mo59983a("item_list", sb.toString()).mo59983a("end_time", valueOf).f79943a);
            C81156c cVar = this.f181364a;
            ((NaviGLSurfaceView) cVar.mo124616a(R.id.cqb)).setCamera(false);
            NaviGLSurfaceView e = cVar.mo124619e();
            if (!(e == null || (naviManager = e.getNaviManager()) == null)) {
                naviManager.mo124677a(66670, 1, 1, "");
            }
            this.f181364a.mo124688a(new Runnable(this) {
                /* class com.p2082ss.android.ugc.aweme.view.p4230b.C81156c.View$OnClickListenerC81163e.RunnableC811641 */

                /* renamed from: a */
                final /* synthetic */ View$OnClickListenerC81163e f181365a;

                static {
                    Covode.recordClassIndex(94492);
                }

                {
                    this.f181365a = r1;
                }

                public final void run() {
                    this.f181365a.f181364a.mo124623l().mo33690d(ProfileNaviSpinnerViewModel.C81381a.f181766a);
                    ((NaviGLSurfaceView) this.f181365a.f181364a.mo124616a(R.id.cqb)).queueEvent(new Runnable(this) {
                        /* class com.p2082ss.android.ugc.aweme.view.p4230b.C81156c.View$OnClickListenerC81163e.RunnableC811641.RunnableC811651 */

                        /* renamed from: a */
                        final /* synthetic */ RunnableC811641 f181366a;

                        static {
                            Covode.recordClassIndex(94493);
                        }

                        {
                            this.f181366a = r1;
                        }

                        /* renamed from: com.ss.android.ugc.aweme.view.b.c$e$1$1$a */
                        static final class C81166a extends AbstractC89220m implements AbstractC89171a<C89391z> {

                            /* renamed from: a */
                            final /* synthetic */ File f181367a;

                            /* renamed from: b */
                            final /* synthetic */ RunnableC811651 f181368b;

                            static {
                                Covode.recordClassIndex(94494);
                            }

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            C81166a(File file, RunnableC811651 r3) {
                                super(0);
                                this.f181367a = file;
                                this.f181368b = r3;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            @Override // p4600h.p4611f.p4612a.AbstractC89171a
                            public final /* synthetic */ C89391z invoke() {
                                ProfileNaviCreatorViewModel k = this.f181368b.f181366a.f181365a.f181364a.mo124622k();
                                File file = this.f181367a;
                                C89219l.m154721d(file, "");
                                C60159r.f137139b = new C60141c(file);
                                C60157q qVar = C60159r.f137138a;
                                if (qVar != null) {
                                    ProfileNaviCreatorViewModel.C81300a.m141044a(file, new ProfileNaviCreatorViewModel.C81317q(qVar));
                                    k.mo124802j();
                                }
                                this.f181368b.f181366a.f181365a.f181364a.mo124622k().mo124800g();
                                return C89391z.f203057a;
                            }
                        }

                        public final void run() {
                            MethodCollector.m26663i(4156);
                            try {
                                C81200a naviManager = ((NaviGLSurfaceView) this.f181366a.f181365a.f181364a.mo124616a(R.id.cqb)).getNaviManager();
                                if (naviManager != null) {
                                    int[] iArr = naviManager.f181449O;
                                    if (iArr == null) {
                                        C89219l.m154715b();
                                    }
                                    GLES20.glBindFramebuffer(36160, iArr[0]);
                                    Bitmap a = C81200a.m140956a(naviManager.f181461e, naviManager.f181462f, false);
                                    C89219l.m154721d(a, "");
                                    int min = Math.min(a.getWidth(), a.getHeight());
                                    Bitmap createBitmap = Bitmap.createBitmap(a, (a.getWidth() - min) / 2, (a.getHeight() - min) / 2, min, min);
                                    C89219l.m154716b(createBitmap, "");
                                    if (createBitmap != null) {
                                        File a2 = C39165u.m79471a(this.f181366a.f181365a.f181364a.getContext(), createBitmap);
                                        if (a2 != null) {
                                            C80558hx.m139642a(0, new C81166a(a2, this));
                                            MethodCollector.m26664o(4156);
                                            return;
                                        }
                                        MethodCollector.m26664o(4156);
                                        return;
                                    }
                                }
                                MethodCollector.m26664o(4156);
                            } catch (Exception e) {
                                if (e.getMessage() != null) {
                                    this.f181366a.f181365a.f181364a.getTag();
                                }
                                MethodCollector.m26664o(4156);
                            }
                        }
                    });
                }
            }, 1000);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.view.b.c$f */
    static final class C81167f extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, List<? extends AbstractC60162u>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C81156c f181369a;

        static {
            Covode.recordClassIndex(94495);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81167f(C81156c cVar) {
            super(2);
            this.f181369a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, List<? extends AbstractC60162u> list) {
            List<? extends AbstractC60162u> list2 = list;
            C89219l.m154721d(iVar, "");
            if (list2 != null) {
                C81156c cVar = this.f181369a;
                ViewPager viewPager = (ViewPager) cVar.mo124616a(R.id.cqg);
                C89219l.m154716b(viewPager, "");
                Context requireContext = cVar.requireContext();
                C89219l.m154716b(requireContext, "");
                viewPager.setAdapter(new C81127d(requireContext, cVar.f181354b, list2));
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.view.b.c$g */
    static final class C81168g extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, C39219x, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C81156c f181370a;

        static {
            Covode.recordClassIndex(94496);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81168g(C81156c cVar) {
            super(2);
            this.f181370a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, C39219x xVar) {
            C39219x xVar2 = xVar;
            C89219l.m154721d(iVar, "");
            if (xVar2 != null) {
                C81156c cVar = this.f181370a;
                AbstractC60142d dVar = xVar2.f92639b;
                NaviNonSwipingViewPager naviNonSwipingViewPager = (NaviNonSwipingViewPager) cVar.mo124616a(R.id.cqg);
                if (naviNonSwipingViewPager != null) {
                    naviNonSwipingViewPager.setVisibility(8);
                }
                ConstraintLayout constraintLayout = (ConstraintLayout) cVar.mo124616a(R.id.cqc);
                if (constraintLayout != null) {
                    constraintLayout.setVisibility(0);
                }
                ViewPager viewPager = (ViewPager) cVar.mo124616a(R.id.cqd);
                if (viewPager != null) {
                    Context requireContext = cVar.requireContext();
                    C89219l.m154716b(requireContext, "");
                    viewPager.setAdapter(new C81128e(requireContext, cVar.f181354b, dVar));
                }
            }
            return C89391z.f203057a;
        }
    }
}
