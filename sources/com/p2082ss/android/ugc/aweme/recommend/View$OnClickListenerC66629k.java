package com.p2082ss.android.ugc.aweme.recommend;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.lifecycle.C1213t;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34478k;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h;
import com.p2082ss.android.ugc.aweme.common.p2634f.C39112b;
import com.p2082ss.android.ugc.aweme.friends.model.RecommendList;
import com.p2082ss.android.ugc.aweme.friends.model.RecommendUserDialogList;
import com.p2082ss.android.ugc.aweme.friends.model.RecommendUserHint;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.metrics.C59256u;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p2082ss.android.ugc.aweme.profile.model.RecommendCommonUserModel;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3568b.C63496c;
import com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63857u;
import com.p2082ss.android.ugc.aweme.profile.presenter.C63823ab;
import com.p2082ss.android.ugc.aweme.recommend.C66623g;
import com.p2082ss.android.ugc.aweme.recommend.C66645r;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80440fo;
import com.p2082ss.android.ugc.aweme.video.AbstractC80747i;
import com.p2082ss.android.ugc.aweme.video.C81079v;
import com.p2082ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.playerkit.videoview.C84249a;
import com.p2082ss.android.ugc.playerkit.videoview.VideoViewComponent;
import com.p2082ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;
import p4600h.p4619j.C89271h;

/* renamed from: com.ss.android.ugc.aweme.recommend.k */
public final class View$OnClickListenerC66629k extends C39112b implements View.OnClickListener, AbstractC34478k<User>, AbstractC63857u {

    /* renamed from: d */
    public static final C66630a f149778d = new C66630a((byte) 0);

    /* renamed from: a */
    C63823ab f149779a;

    /* renamed from: b */
    public boolean f149780b;

    /* renamed from: c */
    public final C66626i f149781c = new C66626i();

    /* renamed from: e */
    private final AbstractC89244h f149782e = C89250i.m154774a(EnumC89331m.NONE, new C66634d(this));

    /* renamed from: f */
    private final AbstractC89244h f149783f = C89250i.m154774a(EnumC89331m.NONE, new C66636e(this));

    /* renamed from: g */
    private final AbstractC89244h f149784g = C89250i.m154774a(EnumC89331m.NONE, new C66637f(this));

    /* renamed from: h */
    private boolean f149785h;

    /* renamed from: i */
    private RecommendUsersDialogViewModel f149786i;

    /* renamed from: j */
    private SparseArray f149787j;

    static {
        Covode.recordClassIndex(78187);
    }

    /* renamed from: a */
    private View m118392a(int i) {
        if (this.f149787j == null) {
            this.f149787j = new SparseArray();
        }
        View view = (View) this.f149787j.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f149787j.put(i, findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final C66627j mo105639a() {
        return (C66627j) this.f149782e.getValue();
    }

    /* renamed from: b */
    public final String mo105641b() {
        return (String) this.f149783f.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.k$a */
    public static final class C66630a {
        static {
            Covode.recordClassIndex(78188);
        }

        private C66630a() {
        }

        public /* synthetic */ C66630a(byte b) {
            this();
        }

        /* renamed from: a */
        public static void m118402a(AbstractC0952i iVar, RecommendUserDialogList recommendUserDialogList, String str, String str2) {
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(recommendUserDialogList, "");
            Fragment a = iVar.mo3551a("RecommendUserDialogFragment");
            if (!(a instanceof View$OnClickListenerC66629k)) {
                a = null;
            }
            View$OnClickListenerC66629k kVar = (View$OnClickListenerC66629k) a;
            if (kVar == null) {
                if (str == null) {
                    str = "";
                }
                if (str2 == null) {
                    str2 = "";
                }
                kVar = new View$OnClickListenerC66629k();
                Bundle bundle = new Bundle();
                bundle.putSerializable("data", recommendUserDialogList);
                bundle.putSerializable("enter_from", str);
                bundle.putSerializable("previous_page", str2);
                kVar.setArguments(bundle);
            }
            if (!kVar.isAdded()) {
                iVar.mo3552a().mo3456a(kVar, "RecommendUserDialogFragment").mo3473c();
            }
        }
    }

    /* renamed from: c */
    private static boolean m118393c() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.p2082ss.android.ugc.aweme.common.p2634f.C39112b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f149787j;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2634f.C39112b, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C66626i iVar = this.f149781c;
        if (!iVar.f149769c) {
            iVar.f149770d = System.currentTimeMillis();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.k$d */
    static final class C66634d extends AbstractC89220m implements AbstractC89171a<C66627j> {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC66629k f149794a;

        static {
            Covode.recordClassIndex(78192);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66634d(View$OnClickListenerC66629k kVar) {
            super(0);
            this.f149794a = kVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.recommend.k$d$a */
        static final class C66635a implements AbstractC39063h.AbstractC39067a {

            /* renamed from: a */
            final /* synthetic */ C66634d f149795a;

            static {
                Covode.recordClassIndex(78193);
            }

            C66635a(C66634d dVar) {
                this.f149795a = dVar;
            }

            @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h.AbstractC39067a
            /* renamed from: l */
            public final void mo62679l() {
                View$OnClickListenerC66629k kVar = this.f149795a.f149794a;
                kVar.mo105639a().ao_();
                C63823ab abVar = kVar.f149779a;
                if (abVar != null) {
                    abVar.mo103287d();
                }
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C66627j invoke() {
            View$OnClickListenerC66629k kVar = this.f149794a;
            C66627j jVar = new C66627j(kVar, kVar.mo105641b());
            jVar.mo67813a((AbstractC39063h.AbstractC39067a) new C66635a(this));
            return jVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.k$e */
    static final class C66636e extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC66629k f149796a;

        static {
            Covode.recordClassIndex(78194);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66636e(View$OnClickListenerC66629k kVar) {
            super(0);
            this.f149796a = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            Bundle arguments = this.f149796a.getArguments();
            if (arguments != null) {
                return arguments.getString("enter_from");
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.k$f */
    static final class C66637f extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC66629k f149797a;

        static {
            Covode.recordClassIndex(78195);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66637f(View$OnClickListenerC66629k kVar) {
            super(0);
            this.f149797a = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            Bundle arguments = this.f149797a.getArguments();
            if (arguments != null) {
                return arguments.getString("previous_page");
            }
            return null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2634f.C39112b, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        C66626i iVar = this.f149781c;
        if (iVar.f149769c) {
            iVar.f149769c = false;
            iVar.f149767a += System.currentTimeMillis() - iVar.f149770d;
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d
    public final void dismiss() {
        String str;
        C1213t<Boolean> tVar;
        try {
            super.dismiss();
        } catch (IllegalStateException unused) {
            super.dismissAllowingStateLoss();
        }
        if (this.f149780b) {
            C81079v.m140776O().mo123950y();
            this.f149780b = false;
        }
        Keva keva = C66645r.C66646a.m118420a().f149813a;
        Calendar instance = Calendar.getInstance();
        C89219l.m154716b(instance, "");
        instance.setTimeInMillis(System.currentTimeMillis());
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        keva.storeLong("dialog_last_shown_timestamp", instance.getTimeInMillis());
        C66626i iVar = this.f149781c;
        if (iVar.f149769c) {
            iVar.f149769c = false;
            iVar.f149767a += System.currentTimeMillis() - iVar.f149770d;
            if (iVar.f149768b || iVar.f149767a > 4000) {
                C66645r.C66646a.m118420a().f149813a.storeInt("dialog_close_without_action_in_times", 0);
            } else {
                C66645r a = C66645r.C66646a.m118420a();
                int i = a.f149813a.getInt("dialog_close_without_action_in_times", 0) + 1;
                a.f149813a.storeInt("dialog_close_without_action_in_times", i);
                if (i >= 2) {
                    Keva keva2 = a.f149813a;
                    Calendar instance2 = Calendar.getInstance();
                    C89219l.m154716b(instance2, "");
                    instance2.setTimeInMillis(System.currentTimeMillis());
                    instance2.set(11, 0);
                    instance2.set(12, 0);
                    instance2.set(13, 0);
                    instance2.add(6, 30);
                    keva2.storeLong("dialog_close_without_action_in_times_maximum_timestamp", instance2.getTimeInMillis());
                }
            }
        }
        C33744d a2 = new C33744d().mo59983a("enter_from", mo105641b());
        if (this.f149785h) {
            str = "button";
        } else {
            str = "blank";
        }
        C39162r.m79460a("close_suggested_accounts_pop_up", a2.mo59983a("click_method", str).f79943a);
        if (TextUtils.equals(mo105641b(), "personal_collection") || TextUtils.equals(mo105641b(), "personal_homepage")) {
            AbstractC81915c.m141874a(new C63496c());
        }
        RecommendUsersDialogViewModel recommendUsersDialogViewModel = this.f149786i;
        if (recommendUsersDialogViewModel != null && (tVar = recommendUsersDialogViewModel.f149746b) != null) {
            tVar.postValue(false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.k$b */
    public static final class C66631b implements C80440fo.AbstractC80442a {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC66629k f149788a;

        static {
            Covode.recordClassIndex(78189);
        }

        C66631b(View$OnClickListenerC66629k kVar) {
            this.f149788a = kVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.C80440fo.AbstractC80442a
        /* renamed from: a */
        public final void mo86642a(int i, final C80440fo foVar) {
            final int i2;
            C89219l.m154721d(foVar, "");
            if (this.f149788a.mo105639a().f149773b) {
                i2 = i - 1;
            } else {
                i2 = i;
            }
            final User user = (User) this.f149788a.mo105639a().mo63369e().get(i);
            if (user != null && !(user instanceof RecommendUserHint)) {
                String uid = user.getUid();
                C89219l.m154716b(uid, "");
                foVar.mo123741a(uid, new Runnable() {
                    /* class com.p2082ss.android.ugc.aweme.recommend.View$OnClickListenerC66629k.C66631b.RunnableC666321 */

                    static {
                        Covode.recordClassIndex(78190);
                    }

                    public final void run() {
                        this.f149788a.mo105640a("show_recommend_user_cell", user, i2);
                        C59256u a = new C59256u().mo96834a(this.f149788a.mo105641b());
                        a.f135350a = C59256u.EnumC59259c.POP_UP;
                        a.f135352b = C59256u.EnumC59257a.SHOW;
                        a.mo96832a(user).mo96792f();
                    }
                });
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.k$c */
    public static final class C66633c extends RecyclerView.AbstractC1371n {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC66629k f149793a;

        static {
            Covode.recordClassIndex(78191);
        }

        C66633c(View$OnClickListenerC66629k kVar) {
            this.f149793a = kVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4753a(RecyclerView recyclerView, int i) {
            C89219l.m154721d(recyclerView, "");
            if (!this.f149793a.f149781c.f149768b && i == 1) {
                this.f149793a.f149781c.f149768b = true;
            }
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.p2082ss.android.ugc.aweme.common.p2634f.C39112b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, R.style.wh);
        ActivityC0945e activity = getActivity();
        if (activity != null) {
            this.f149786i = (RecommendUsersDialogViewModel) C1181ae.m3881a(activity, (C1175ad.AbstractC1177b) null).mo3983a(RecommendUsersDialogViewModel.class);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63857u
    /* renamed from: b */
    public final void mo81332b(RecommendList recommendList) {
        if (this.f92310ae && recommendList != null && (recommendList instanceof RecommendUserDialogList)) {
            List<User> recommendUsers = ((RecommendUserDialogList) recommendList).getRecommendUsers();
            C63823ab abVar = this.f149779a;
            if (!(abVar == null || abVar.mo103289f() == 0)) {
                mo105639a().mo62376b(recommendUsers);
                if (recommendList.hasMore()) {
                    mo105639a().aq_();
                    return;
                }
            }
            mo105639a().ap_();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        C89219l.m154716b(onCreateDialog, "");
        onCreateDialog.setCancelable(true);
        onCreateDialog.setCanceledOnTouchOutside(true);
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            window.addFlags(67108864);
            window.setAttributes(attributes);
        }
        onCreateDialog.setOnShowListener(new DialogInterface$OnShowListenerC66638g(this));
        return onCreateDialog;
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.k$g */
    static final class DialogInterface$OnShowListenerC66638g implements DialogInterface.OnShowListener {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC66629k f149798a;

        static {
            Covode.recordClassIndex(78196);
        }

        DialogInterface$OnShowListenerC66638g(View$OnClickListenerC66629k kVar) {
            this.f149798a = kVar;
        }

        public final void onShow(DialogInterface dialogInterface) {
            VideoViewComponent videoViewComponent;
            VideoViewComponent videoViewComponent2;
            View$OnClickListenerC66629k kVar = this.f149798a;
            if (C66641n.m118410a()) {
                AbstractC80747i O = C81079v.m140776O();
                C89219l.m154716b(O, "");
                if (O.mo123892o()) {
                    C81079v.m140776O().mo123908B();
                } else {
                    C84249a aVar = C84249a.C84250a.f188424a;
                    C89219l.m154716b(aVar, "");
                    if (!(aVar.f188422a == null || (videoViewComponent = aVar.f188422a.get()) == null || !videoViewComponent.mo129273g())) {
                        C84249a aVar2 = C84249a.C84250a.f188424a;
                        if (!(aVar2.f188422a == null || (videoViewComponent2 = aVar2.f188422a.get()) == null)) {
                            videoViewComponent2.mo129267b();
                        }
                    }
                }
                kVar.f149780b = true;
            }
            C39162r.m79460a("show_suggested_accounts_pop_up", new C33744d().mo59983a("enter_from", this.f149798a.mo105641b()).f79943a);
            C66626i iVar = this.f149798a.f149781c;
            if (!iVar.f149769c) {
                iVar.f149769c = true;
                iVar.f149767a = 0;
                iVar.f149770d = System.currentTimeMillis();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63857u
    /* renamed from: a */
    public final void mo81328a(RecommendList recommendList) {
        if (this.f92310ae && recommendList != null && (recommendList instanceof RecommendUserDialogList)) {
            RecommendUserDialogList recommendUserDialogList = (RecommendUserDialogList) recommendList;
            List<User> recommendUsers = recommendUserDialogList.getRecommendUsers();
            if (recommendUsers == null || recommendUsers.isEmpty()) {
                mo105639a().mo67810f();
                mo105639a().mo67829d(false);
                return;
            }
            mo105639a().mo67829d(false);
            mo105639a().mo62377b_(recommendUserDialogList.getRecommendUsers());
            if (recommendList.hasMore()) {
                mo105639a().aq_();
            } else {
                mo105639a().ap_();
            }
        }
    }

    public final void onClick(View view) {
        Integer valueOf;
        ClickAgent.onClick(view);
        if (view != null && (valueOf = Integer.valueOf(view.getId())) != null) {
            if (valueOf.intValue() == R.id.bn0) {
                if (this.f92310ae) {
                    this.f149781c.f149768b = true;
                    C66627j a = mo105639a();
                    RecyclerView recyclerView = (RecyclerView) m118392a(R.id.dgn);
                    C89219l.m154716b(recyclerView, "");
                    RecyclerView.AbstractC1362i layoutManager = recyclerView.getLayoutManager();
                    if (a.f92236l != null) {
                        List list = a.f92236l;
                        C89219l.m154716b(list, "");
                        Iterator it = list.iterator();
                        int i = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            } else if (!(it.next() instanceof RecommendUserHint)) {
                                i++;
                            } else if (i >= 0) {
                                if (i == 0) {
                                    if (i < a.f92236l.size()) {
                                        a.f92236l.remove(i);
                                        a.notifyItemRemoved(i);
                                    }
                                    a.f149773b = false;
                                    return;
                                }
                                return;
                            }
                        }
                        RecommendUserHint recommendUserHint = a.f149772a;
                        if (a.f92236l != null) {
                            a.f92236l.add(0, recommendUserHint);
                            a.notifyItemInserted(0);
                        }
                        a.f149773b = true;
                        if (layoutManager != null) {
                            layoutManager.mo4363e(0);
                        }
                    }
                }
            } else if (valueOf.intValue() == R.id.a6q) {
                this.f149785h = true;
                dismiss();
            } else if (valueOf.intValue() == R.id.c3s) {
                dismiss();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63857u
    /* renamed from: a */
    public final void mo81329a(Exception exc) {
        if (this.f92310ae) {
            List e = mo105639a().mo63369e();
            if (e == null || e.isEmpty()) {
                mo105639a().mo67829d(false);
                return;
            }
            mo105639a().mo67829d(false);
            mo105639a().mo67824j();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2634f.C39112b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C1213t<Boolean> tVar;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        RecommendUsersDialogViewModel recommendUsersDialogViewModel = this.f149786i;
        if (!(recommendUsersDialogViewModel == null || (tVar = recommendUsersDialogViewModel.f149746b) == null)) {
            tVar.postValue(true);
        }
        int a = (int) (((float) C13628n.m24504a(getContext())) * 0.84f);
        View findViewById = view.findViewById(R.id.c3o);
        C89219l.m154716b(findViewById, "");
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        layoutParams.width = C89271h.m154772c(a, C89241a.m154730a(TypedValue.applyDimension(1, 360.0f, system.getDisplayMetrics())));
        Resources system2 = Resources.getSystem();
        C89219l.m154709a((Object) system2, "");
        layoutParams.height = C89271h.m154772c((int) (((float) C13628n.m24521b(getContext())) * 0.8f), C89241a.m154730a(TypedValue.applyDimension(1, 480.0f, system2.getDisplayMetrics())));
        findViewById.requestLayout();
        RecyclerView recyclerView = (RecyclerView) m118392a(R.id.dgn);
        if (recyclerView != null) {
            recyclerView.getContext();
            recyclerView.setLayoutManager(new WrapLinearLayoutManager());
            recyclerView.setAdapter(mo105639a());
            recyclerView.mo4405a(new C66633c(this));
        }
        RecyclerView recyclerView2 = (RecyclerView) m118392a(R.id.dgn);
        if (recyclerView2 != null) {
            new C80440fo(recyclerView2, new C66631b(this));
        }
        TuxIconView tuxIconView = (TuxIconView) m118392a(R.id.bn0);
        if (tuxIconView != null) {
            tuxIconView.setOnClickListener(this);
        }
        TuxIconView tuxIconView2 = (TuxIconView) m118392a(R.id.a6q);
        if (tuxIconView2 != null) {
            tuxIconView2.setOnClickListener(this);
        }
        FrameLayout frameLayout = (FrameLayout) m118392a(R.id.c3s);
        if (frameLayout != null) {
            frameLayout.setOnClickListener(this);
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) m118392a(R.id.c3o);
        if (constraintLayout != null) {
            constraintLayout.setOnClickListener(this);
        }
        if (this.f149779a == null) {
            RecommendCommonUserModel recommendCommonUserModel = new RecommendCommonUserModel();
            Bundle arguments = getArguments();
            Serializable serializable = null;
            if (arguments != null) {
                serializable = arguments.getSerializable("data");
            }
            Objects.requireNonNull(serializable, "null cannot be cast to non-null type com.ss.android.ugc.aweme.friends.model.RecommendUserDialogList");
            recommendCommonUserModel.setRecommendList((RecommendUserDialogList) serializable);
            C63823ab abVar = new C63823ab(recommendCommonUserModel, this);
            this.f149779a = abVar;
            mo81328a(abVar.mo103280a());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.xi, viewGroup, false);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34478k
    /* renamed from: a */
    public final void mo60911a(FollowStatus followStatus, String str, String str2) {
        C89219l.m154721d(followStatus, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        if (followStatus.followStatus == 0) {
            C39162r.m79460a("follow_cancel_finish", new C33744d().mo59983a("enter_from", "suggest_account_pop_up").mo59983a("to_user_id", str).f79943a);
        } else {
            C39162r.m79460a("follow_finish", new C33744d().mo59983a("enter_from", "suggest_account_pop_up").mo59983a("to_user_id", str).f79943a);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object, int] */
    @Override // com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34478k
    /* renamed from: a */
    public final /* synthetic */ void mo60910a(int i, User user, int i2) {
        boolean z;
        String str;
        RecommendList a;
        User user2 = user;
        if (user2 == null) {
            return;
        }
        if (i == 100) {
            this.f149781c.f149768b = true;
            if (this.f92310ae) {
                getContext();
                if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
                    C58029j.f132256h = m118393c();
                }
                if (!C58029j.f132256h) {
                    new C79459a(getContext()).mo123050a(R.string.dcq).mo123053a();
                    return;
                }
                if (user2.getFollowStatus() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolean z2 = !z;
                mo105639a().mo105638a(user2, user2.getFollowStatus());
                if (z2) {
                    mo105640a("follow", user2, i2);
                    C59256u a2 = new C59256u().mo96834a(mo105641b());
                    a2.f135350a = C59256u.EnumC59259c.POP_UP;
                    a2.f135352b = C59256u.EnumC59257a.FOLLOW;
                    a2.mo96832a(user2).mo96792f();
                    return;
                }
                mo105640a("follow_cancel", user2, i2);
                C59256u a3 = new C59256u().mo96834a(mo105641b());
                a3.f135350a = C59256u.EnumC59259c.POP_UP;
                a3.f135352b = C59256u.EnumC59257a.FOLLOW_CANCEL;
                a3.mo96832a(user2).mo96792f();
            }
        } else if (i == 101) {
            this.f149781c.f149768b = true;
            SmartRoute withParam = SmartRouter.buildRoute(getActivity(), "aweme://user/profile/" + user2.getUid()).withParam("sec_user_id", user2.getSecUid()).withParam("from_recommend_card", 1).withParam("enter_from", "suggest_account_pop_up").withParam("extra_previous_page_position", mo105641b()).withParam("recommend_from_type", "list").withParam("extra_mutual_relation", user2.getMutualStruct()).withParam("extra_from_mutual", true);
            C63823ab abVar = this.f149779a;
            String str2 = "";
            if (abVar == null || (a = abVar.mo103280a()) == null || (str = a.getRid()) == null) {
                str = str2;
            }
            SmartRoute withParam2 = withParam.withParam("enter_from_request_id", str);
            String b = mo105641b();
            C59256u.EnumC59259c cVar = C59256u.EnumC59259c.POP_UP;
            String recType = user2.getRecType();
            C59256u.EnumC59258b a4 = C66623g.C66624a.m118386a(user2);
            String uid = user2.getUid();
            String requestId = user2.getRequestId();
            if (requestId != null) {
                str2 = requestId;
            }
            withParam2.withParam("recommend_enter_profile_params", new C66623g(b, null, cVar, recType, a4, uid, null, null, str2, null, user2.getFriendTypeStr(), user2.getSocialInfo())).open();
            C39162r.m79460a("enter_personal_detail", new C33744d().mo59983a("enter_from", "suggest_account_pop_up").mo59983a("previous_page", mo105641b()).mo59983a("to_user_id", user2.getUid()).mo59983a("rec_type", user2.getRecType()).mo59980a("impr_order", i2).f79943a);
            C59256u a5 = new C59256u().mo96834a(mo105641b());
            a5.f135350a = C59256u.EnumC59259c.POP_UP;
            a5.f135352b = C59256u.EnumC59257a.ENTER_PROFILE;
            a5.mo96832a(user2).mo96792f();
        }
    }

    /* renamed from: a */
    public final void mo105640a(String str, User user, int i) {
        C39162r.m79460a(str, new C33744d().mo59983a("enter_from", "suggest_account_pop_up").mo59983a("previous_page", mo105641b()).mo59983a("rec_type", user.getRecType()).mo59983a("rec_uid", user.getUid()).mo59980a("impr_order", i).mo59983a("relation_type", user.getFriendTypeStr()).f79943a);
    }
}
