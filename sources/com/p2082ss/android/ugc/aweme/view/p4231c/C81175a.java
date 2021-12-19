package com.p2082ss.android.ugc.aweme.view.p4231c;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.util.SparseArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.jedi.arch.C20531t;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxCompoundIconTextView;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.model.AbstractC60142d;
import com.p2082ss.android.ugc.aweme.model.C60157q;
import com.p2082ss.android.ugc.aweme.model.C60159r;
import com.p2082ss.android.ugc.aweme.p2398bn.C34891a;
import com.p2082ss.android.ugc.aweme.view.customView.AbstractC81202b;
import com.p2082ss.android.ugc.aweme.view.customView.NaviGLSurfaceView;
import com.p2082ss.android.ugc.aweme.view.p4231c.DialogC81187b;
import com.p2082ss.android.ugc.aweme.viewModel.ProfileNaviCreatorViewModel;
import com.p2082ss.android.ugc.aweme.viewModel.ProfileNaviHubState;
import com.p2082ss.android.ugc.aweme.viewModel.ProfileNaviHubViewModel;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.view.c.a */
public final class C81175a extends AbstractC81202b implements DialogC81187b.AbstractC81188a {

    /* renamed from: b */
    final AbstractC89244h f181378b = C89250i.m154773a((AbstractC89171a) new C81176a(this));

    /* renamed from: c */
    private final AbstractC89244h f181379c = C89250i.m154773a((AbstractC89171a) new C81177b(this));

    /* renamed from: d */
    private final AbstractC89244h f181380d = C89250i.m154773a((AbstractC89171a) new C81186k(this));

    /* renamed from: e */
    private final Handler f181381e = new Handler();

    /* renamed from: f */
    private SparseArray f181382f;

    static {
        Covode.recordClassIndex(94503);
    }

    @Override // com.p2082ss.android.ugc.aweme.view.customView.AbstractC81202b
    /* renamed from: a */
    public final View mo124616a(int i) {
        if (this.f181382f == null) {
            this.f181382f = new SparseArray();
        }
        View view = (View) this.f181382f.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f181382f.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.view.customView.AbstractC81202b
    /* renamed from: b */
    public final int mo124617b() {
        return R.layout.aou;
    }

    @Override // com.p2082ss.android.ugc.aweme.view.customView.AbstractC81202b
    /* renamed from: j */
    public final void mo124621j() {
        SparseArray sparseArray = this.f181382f;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: k */
    public final ProfileNaviHubViewModel mo124636k() {
        return (ProfileNaviHubViewModel) this.f181379c.getValue();
    }

    /* renamed from: l */
    public final DialogC81187b mo124637l() {
        return (DialogC81187b) this.f181380d.getValue();
    }

    @Override // androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.view.customView.AbstractC81202b
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo124621j();
    }

    /* renamed from: com.ss.android.ugc.aweme.view.c.a$j */
    static final class RunnableC81185j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C81175a f181392a;

        static {
            Covode.recordClassIndex(94513);
        }

        RunnableC81185j(C81175a aVar) {
            this.f181392a = aVar;
        }

        public final void run() {
            this.f181392a.mo124638m();
            this.f181392a.mo124636k().mo124876a(false);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.view.customView.AbstractC81202b
    /* renamed from: e */
    public final NaviGLSurfaceView mo124619e() {
        return (NaviGLSurfaceView) mo124616a(R.id.cqj);
    }

    @Override // androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.view.customView.AbstractC81202b
    public final void onPause() {
        super.onPause();
        this.f181381e.removeCallbacksAndMessages(null);
    }

    /* renamed from: com.ss.android.ugc.aweme.view.c.a$a */
    static final class C81176a extends AbstractC89220m implements AbstractC89171a<ProfileNaviCreatorViewModel> {

        /* renamed from: a */
        final /* synthetic */ C81175a f181383a;

        static {
            Covode.recordClassIndex(94504);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81176a(C81175a aVar) {
            super(0);
            this.f181383a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ProfileNaviCreatorViewModel invoke() {
            JediViewModel a = C20531t.m38716a(this.f181383a.requireActivity()).mo33800a(ProfileNaviCreatorViewModel.class);
            C89219l.m154716b(a, "");
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.view.c.a$b */
    static final class C81177b extends AbstractC89220m implements AbstractC89171a<ProfileNaviHubViewModel> {

        /* renamed from: a */
        final /* synthetic */ C81175a f181384a;

        static {
            Covode.recordClassIndex(94505);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81177b(C81175a aVar) {
            super(0);
            this.f181384a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ProfileNaviHubViewModel invoke() {
            JediViewModel a = C20531t.m38716a(this.f181384a.requireActivity()).mo33800a(ProfileNaviHubViewModel.class);
            C89219l.m154716b(a, "");
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.view.c.a$k */
    static final class C81186k extends AbstractC89220m implements AbstractC89171a<DialogC81187b> {

        /* renamed from: a */
        final /* synthetic */ C81175a f181393a;

        static {
            Covode.recordClassIndex(94514);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81186k(C81175a aVar) {
            super(0);
            this.f181393a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ DialogC81187b invoke() {
            ActivityC0945e requireActivity = this.f181393a.requireActivity();
            C89219l.m154716b(requireActivity, "");
            return new DialogC81187b(requireActivity, this.f181393a, (byte) 0);
        }
    }

    /* renamed from: m */
    public final void mo124638m() {
        if (getActivity() != null) {
            new C81192c().show(getChildFragmentManager(), "navi");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        if (((ProfileNaviHubState) mo124636k().mo33676a(this)).getShouldShowSwitcher()) {
            this.f181381e.postDelayed(new RunnableC81185j(this), 500);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.view.customView.AbstractC81202b
    /* renamed from: c */
    public final void mo124618c() {
        ((TuxCompoundIconTextView) mo124616a(R.id.cqf)).setOnClickListener(new View$OnClickListenerC81178c(this));
        ((LinearLayout) mo124616a(R.id.d8g)).setOnClickListener(new View$OnClickListenerC81179d(this));
        ((LinearLayout) mo124616a(R.id.d8h)).setOnClickListener(new View$OnClickListenerC81180e(this));
        ((TuxIconView) mo124616a(R.id.d8e)).setOnClickListener(new View$OnClickListenerC81181f(this));
        ((ConstraintLayout) mo124616a(R.id.d8m)).setOnClickListener(new View$OnClickListenerC81182g(this));
    }

    @Override // com.p2082ss.android.ugc.aweme.view.p4231c.DialogC81187b.AbstractC81188a
    /* renamed from: n */
    public final void mo124639n() {
        C39162r.m79460a("delete_avatar", new C33744d().mo59983a("enter_from", "avatar_hub").f79943a);
        Context context = getContext();
        if (context != null) {
            C17197a.C17200a a = new C17197a.C17200a(context).mo27189a(R.string.a0q);
            a.f41067M = true;
            C17197a a2 = a.mo27190a(R.string.a0o, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC81183h(this), false).mo27195b(R.string.a0l, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC81184i(this), false).mo27193a();
            C34891a.m71267a();
            a2.mo27185c();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.view.p4231c.DialogC81187b.AbstractC81188a
    /* renamed from: o */
    public final void mo124640o() {
        C39162r.m79460a("create_avatar_duplicate", new C33744d().mo59983a("enter_from", "avatar_hub").f79943a);
        mo124637l().dismiss();
        ProfileNaviHubViewModel k = mo124636k();
        C60157q qVar = C60159r.f137138a;
        if (qVar != null) {
            HashMap<String, AbstractC60142d> hashMap = C60159r.f137142e;
            if (hashMap != null) {
                C89219l.m154721d(hashMap, "");
                C60157q a = C60157q.C60158a.m109647a(qVar.mo97831a(), hashMap);
                a.f137132a = null;
                a.f137137f = null;
                a.f137136e = null;
                C60159r.m109650a(a);
            }
            k.mo124877b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.view.c.a$c */
    static final class View$OnClickListenerC81178c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C81175a f181385a;

        static {
            Covode.recordClassIndex(94506);
        }

        View$OnClickListenerC81178c(C81175a aVar) {
            this.f181385a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C39162r.m79460a("click_metami_avatar_hub", new C33744d().mo59983a("enter_from", "avatar_hub").f79943a);
            this.f181385a.mo124638m();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.view.c.a$d */
    static final class View$OnClickListenerC81179d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C81175a f181386a;

        static {
            Covode.recordClassIndex(94507);
        }

        View$OnClickListenerC81179d(C81175a aVar) {
            this.f181386a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C39162r.m79460a("edit_avatar_hub", new C33744d().mo59983a("enter_from", "avatar_hub").f79943a);
            this.f181386a.mo124636k().mo124877b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.view.c.a$e */
    static final class View$OnClickListenerC81180e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C81175a f181387a;

        static {
            Covode.recordClassIndex(94508);
        }

        View$OnClickListenerC81180e(C81175a aVar) {
            this.f181387a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C39162r.m79460a("more_option_avatar_hub", new C33744d().mo59983a("enter_from", "avatar_hub").f79943a);
            this.f181387a.mo124637l().show();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.view.c.a$f */
    static final class View$OnClickListenerC81181f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C81175a f181388a;

        static {
            Covode.recordClassIndex(94509);
        }

        View$OnClickListenerC81181f(C81175a aVar) {
            this.f181388a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C39162r.m79460a("exit_avatar_hub", new C33744d().mo59983a("enter_from", "avatar_hub").f79943a);
            ProfileNaviHubViewModel k = this.f181388a.mo124636k();
            k.mo33690d(ProfileNaviHubViewModel.C81357g.f181723a);
            k.mo33690d(ProfileNaviHubViewModel.C81358h.f181724a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.view.c.a$g */
    static final class View$OnClickListenerC81182g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C81175a f181389a;

        static {
            Covode.recordClassIndex(94510);
        }

        View$OnClickListenerC81182g(C81175a aVar) {
            this.f181389a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C39162r.m79460a("set_avatar_profile", new C33744d().mo59983a("enter_from", "avatar_hub").f79943a);
            ((ProfileNaviCreatorViewModel) this.f181389a.f181378b.getValue()).mo124800g();
        }
    }

    @Override // androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.view.customView.AbstractC81202b
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        mo124618c();
    }

    /* renamed from: com.ss.android.ugc.aweme.view.c.a$i */
    static final class DialogInterface$OnClickListenerC81184i implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C81175a f181391a;

        static {
            Covode.recordClassIndex(94512);
        }

        DialogInterface$OnClickListenerC81184i(C81175a aVar) {
            this.f181391a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C39162r.m79460a("cancel_delete_avatar", new C33744d().mo59983a("enter_from", "avatar_hub").f79943a);
            this.f181391a.mo124637l().dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.view.c.a$h */
    static final class DialogInterface$OnClickListenerC81183h implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C81175a f181390a;

        static {
            Covode.recordClassIndex(94511);
        }

        DialogInterface$OnClickListenerC81183h(C81175a aVar) {
            this.f181390a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C39162r.m79460a("confirm_delete_avatar", new C33744d().mo59983a("enter_from", "avatar_hub").f79943a);
            this.f181390a.mo124637l().dismiss();
            this.f181390a.mo124636k().mo124874a(0);
        }
    }
}
