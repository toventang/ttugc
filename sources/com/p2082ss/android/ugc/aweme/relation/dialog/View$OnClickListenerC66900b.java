package com.p2082ss.android.ugc.aweme.relation.dialog;

import android.app.Dialog;
import android.content.res.Resources;
import android.os.Bundle;
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
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.AbstractC1391ab;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.AbstractC17207b;
import com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.C17205a;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34478k;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.p2634f.C39112b;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p2082ss.android.ugc.aweme.friends.model.Friend;
import com.p2082ss.android.ugc.aweme.friends.model.FriendList;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.metrics.C59256u;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.recommend.C66623g;
import com.p2082ss.android.ugc.aweme.relation.dialog.C66897a;
import com.p2082ss.android.ugc.aweme.relation.p3673b.C66870b;
import com.p2082ss.android.ugc.aweme.relation.p3674c.EnumC66892b;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80440fo;
import com.p2082ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.p2082ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.EnumC89331m;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;
import p4600h.p4619j.C89271h;

/* renamed from: com.ss.android.ugc.aweme.relation.dialog.b */
public final class View$OnClickListenerC66900b extends C39112b implements View.OnClickListener, AbstractC34478k<User> {

    /* renamed from: a */
    public static final C66901a f150186a = new C66901a((byte) 0);

    /* renamed from: b */
    private final AbstractC89244h f150187b = C89250i.m154774a(EnumC89331m.NONE, new C66904c(this));

    /* renamed from: c */
    private final AbstractC89244h f150188c = C89250i.m154774a(EnumC89331m.NONE, new C66905d(this));

    /* renamed from: d */
    private final AbstractC89244h f150189d = C89250i.m154774a(EnumC89331m.NONE, new C66906e(this));

    /* renamed from: e */
    private boolean f150190e;

    /* renamed from: f */
    private SparseArray f150191f;

    static {
        Covode.recordClassIndex(78476);
    }

    /* renamed from: a */
    private View m118651a(int i) {
        if (this.f150191f == null) {
            this.f150191f = new SparseArray();
        }
        View view = (View) this.f150191f.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f150191f.put(i, findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final C66897a mo105831a() {
        return (C66897a) this.f150187b.getValue();
    }

    /* renamed from: b */
    public final String mo105833b() {
        return (String) this.f150188c.getValue();
    }

    /* renamed from: c */
    public final int mo105834c() {
        return ((Number) this.f150189d.getValue()).intValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.dialog.b$a */
    public static final class C66901a {
        static {
            Covode.recordClassIndex(78477);
        }

        private C66901a() {
        }

        public /* synthetic */ C66901a(byte b) {
            this();
        }

        /* renamed from: a */
        private static View$OnClickListenerC66900b m118661a(FriendList<Friend> friendList, String str, int i) {
            View$OnClickListenerC66900b bVar = new View$OnClickListenerC66900b();
            Bundle bundle = new Bundle();
            bundle.putSerializable("data", friendList);
            bundle.putSerializable("enter_from", str);
            bundle.putSerializable("social_rec_type", Integer.valueOf(i));
            bVar.setArguments(bundle);
            return bVar;
        }

        /* renamed from: a */
        public static void m118662a(AbstractC0952i iVar, FriendList<Friend> friendList, String str, int i) {
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(friendList, "");
            Fragment a = iVar.mo3551a("SocialRecFriendsDialogFragment");
            if (!(a instanceof View$OnClickListenerC66900b)) {
                a = null;
            }
            View$OnClickListenerC66900b bVar = (View$OnClickListenerC66900b) a;
            if (bVar == null) {
                if (str == null) {
                    str = "";
                }
                bVar = m118661a(friendList, str, i);
            }
            if (!bVar.isAdded()) {
                iVar.mo3552a().mo3456a(bVar, "SocialRecFriendsDialogFragment").mo3473c();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.dialog.b$c */
    static final class C66904c extends AbstractC89220m implements AbstractC89171a<C66897a> {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC66900b f150196a;

        static {
            Covode.recordClassIndex(78480);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66904c(View$OnClickListenerC66900b bVar) {
            super(0);
            this.f150196a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C66897a invoke() {
            View$OnClickListenerC66900b bVar = this.f150196a;
            C66897a aVar = new C66897a(bVar, bVar.mo105833b());
            aVar.mo67829d(false);
            return aVar;
        }
    }

    /* renamed from: e */
    private static boolean m118654e() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d
    public final void dismiss() {
        try {
            super.dismiss();
        } catch (IllegalStateException unused) {
            super.dismissAllowingStateLoss();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2634f.C39112b, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C17205a.C17206a.f41116a.mo27210a(AbstractC17207b.EnumC17208a.SOCIAL_REC_FRIENDS);
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.p2082ss.android.ugc.aweme.common.p2634f.C39112b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f150191f;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.dialog.b$d */
    static final class C66905d extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC66900b f150197a;

        static {
            Covode.recordClassIndex(78481);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66905d(View$OnClickListenerC66900b bVar) {
            super(0);
            this.f150197a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            Bundle arguments = this.f150197a.getArguments();
            if (arguments != null) {
                return arguments.getString("enter_from");
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.dialog.b$e */
    static final class C66906e extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC66900b f150198a;

        static {
            Covode.recordClassIndex(78482);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66906e(View$OnClickListenerC66900b bVar) {
            super(0);
            this.f150198a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            Serializable serializable;
            Bundle arguments = this.f150198a.getArguments();
            if (arguments != null) {
                serializable = arguments.getSerializable("social_rec_type");
            } else {
                serializable = null;
            }
            Objects.requireNonNull(serializable, "null cannot be cast to non-null type kotlin.Int");
            return Integer.valueOf(((Integer) serializable).intValue());
        }
    }

    /* renamed from: d */
    private final void m118653d() {
        String str;
        Bundle arguments = getArguments();
        Serializable serializable = null;
        if (arguments != null) {
            serializable = arguments.getSerializable("data");
        }
        FriendList friendList = (FriendList) serializable;
        if (this.f92310ae && friendList != null) {
            if (friendList.getFriends().isEmpty()) {
                mo105831a().mo67810f();
            } else {
                C66897a a = mo105831a();
                List<User> friends = friendList.getFriends();
                C89219l.m154716b(friends, "");
                ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) friends, 10));
                for (User user : friends) {
                    C89219l.m154716b(user, "");
                    LogPbBean logPbBean = friendList.getLogPbBean();
                    if (logPbBean == null || (str = logPbBean.getImprId()) == null) {
                        str = "";
                    }
                    user.setRequestId(str);
                    arrayList.add(user);
                }
                a.mo62377b_(arrayList);
            }
            mo105831a().mo67829d(false);
            mo105831a().ap_();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.dialog.b$b */
    public static final class C66902b implements C80440fo.AbstractC80442a {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC66900b f150192a;

        static {
            Covode.recordClassIndex(78478);
        }

        C66902b(View$OnClickListenerC66900b bVar) {
            this.f150192a = bVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.C80440fo.AbstractC80442a
        /* renamed from: a */
        public final void mo86642a(int i, final C80440fo foVar) {
            C89219l.m154721d(foVar, "");
            final User user = (User) this.f150192a.mo105831a().mo63369e().get(i);
            if (user != null && !(user instanceof C66897a.C66899b)) {
                String uid = user.getUid();
                C89219l.m154716b(uid, "");
                foVar.mo123741a(uid, new Runnable() {
                    /* class com.p2082ss.android.ugc.aweme.relation.dialog.View$OnClickListenerC66900b.C66902b.RunnableC669031 */

                    static {
                        Covode.recordClassIndex(78479);
                    }

                    public final void run() {
                        this.f150192a.mo105832a(user, C59256u.EnumC59257a.SHOW, this.f150192a.mo105834c());
                    }
                });
            }
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.p2082ss.android.ugc.aweme.common.p2634f.C39112b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, R.style.y9);
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
        return onCreateDialog;
    }

    public final void onClick(View view) {
        Integer valueOf;
        ClickAgent.onClick(view);
        if (view != null && (valueOf = Integer.valueOf(view.getId())) != null) {
            if (valueOf.intValue() == R.id.bn0) {
                if (this.f92310ae) {
                    C66897a a = mo105831a();
                    RecyclerView recyclerView = (RecyclerView) m118651a(R.id.dgn);
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
                            } else if (!(it.next() instanceof C66897a.C66899b)) {
                                i++;
                            } else if (i >= 0) {
                                if (i == 0 && i < a.f92236l.size()) {
                                    a.f92236l.remove(i);
                                    a.notifyItemRemoved(i);
                                    return;
                                }
                                return;
                            }
                        }
                        C66897a.C66899b bVar = a.f150181a;
                        if (a.f92236l != null) {
                            a.f92236l.add(0, bVar);
                            a.notifyItemInserted(0);
                        }
                        if (layoutManager != null) {
                            layoutManager.mo4363e(0);
                        }
                    }
                }
            } else if (valueOf.intValue() == R.id.a6q) {
                this.f150190e = true;
                dismiss();
            } else if (valueOf.intValue() == R.id.c3s) {
                dismiss();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2634f.C39112b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        int a = (int) (((float) C13628n.m24504a(getContext())) * 0.84f);
        int b = (int) (((float) C13628n.m24521b(getContext())) * 0.8f);
        View findViewById = view.findViewById(R.id.c3o);
        C89219l.m154716b(findViewById, "");
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        layoutParams.width = C89271h.m154772c(a, C89241a.m154730a(TypedValue.applyDimension(1, 360.0f, system.getDisplayMetrics())));
        Resources system2 = Resources.getSystem();
        C89219l.m154709a((Object) system2, "");
        layoutParams.height = C89271h.m154772c(b, C89241a.m154730a(TypedValue.applyDimension(1, 480.0f, system2.getDisplayMetrics())));
        findViewById.requestLayout();
        RecyclerView recyclerView = (RecyclerView) m118651a(R.id.dgn);
        if (recyclerView != null) {
            recyclerView.getContext();
            recyclerView.setLayoutManager(new WrapLinearLayoutManager());
            recyclerView.setAdapter(mo105831a());
            RecyclerView.AbstractC1356f itemAnimator = recyclerView.getItemAnimator();
            Objects.requireNonNull(itemAnimator, "null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
            ((AbstractC1391ab) itemAnimator).f4621m = false;
        }
        RecyclerView recyclerView2 = (RecyclerView) m118651a(R.id.dgn);
        if (recyclerView2 != null) {
            new C80440fo(recyclerView2, new C66902b(this));
        }
        TuxIconView tuxIconView = (TuxIconView) m118651a(R.id.bn0);
        if (tuxIconView != null) {
            tuxIconView.setOnClickListener(this);
        }
        TuxIconView tuxIconView2 = (TuxIconView) m118651a(R.id.a6q);
        if (tuxIconView2 != null) {
            tuxIconView2.setOnClickListener(this);
        }
        FrameLayout frameLayout = (FrameLayout) m118651a(R.id.c3s);
        if (frameLayout != null) {
            frameLayout.setOnClickListener(this);
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) m118651a(R.id.c3o);
        if (constraintLayout != null) {
            constraintLayout.setOnClickListener(this);
        }
        m118653d();
        C66870b.m118588b(mo105834c(), EnumC66892b.RECOMMEND.getValue());
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.a25, viewGroup, false);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34478k
    /* renamed from: a */
    public final void mo60911a(FollowStatus followStatus, String str, String str2) {
        C89219l.m154721d(followStatus, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        if (followStatus.followStatus == 0) {
            C39162r.m79460a("follow_cancel_finish", new C33744d().mo59983a("enter_from", str2).mo59983a("to_user_id", str).f79943a);
        } else {
            C39162r.m79460a("follow_finish", new C33744d().mo59983a("enter_from", str2).mo59983a("to_user_id", str).f79943a);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object, int] */
    @Override // com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34478k
    /* renamed from: a */
    public final /* synthetic */ void mo60910a(int i, User user, int i2) {
        boolean z;
        String str;
        User user2 = user;
        if (user2 == null) {
            return;
        }
        if (i != 100) {
            if (i == 101) {
                SmartRouter.buildRoute(getActivity(), "aweme://user/profile/" + user2.getUid()).withParam("sec_user_id", user2.getSecUid()).withParam("from_recommend_card", 1).withParam("enter_from", "foru_boarding").withParam("extra_previous_page_position", mo105833b()).withParam("recommend_from_type", "list").withParam("extra_mutual_relation", user2.getMutualStruct()).withParam("extra_from_mutual", true).withParam("recommend_enter_profile_params", new C66623g(mo105833b(), null, C59256u.EnumC59259c.POP_UP, user2.getRecType(), C66623g.C66624a.m118386a(user2), user2.getUid(), null, null, user2.getRequestId(), null, user2.getFriendTypeStr(), user2.getSocialInfo())).open();
                C33744d a = new C33744d().mo59983a("enter_from", "foru_boarding").mo59983a("previous_page", mo105833b()).mo59983a("to_user_id", user2.getUid());
                if (mo105834c() == 2) {
                    str = "1-2";
                } else {
                    str = "1-1";
                }
                C39162r.m79460a("enter_personal_detail", a.mo59983a("rec_type", str).mo59980a("impr_order", i2).f79943a);
                mo105832a(user2, C59256u.EnumC59257a.ENTER_PROFILE, mo105834c());
            }
        } else if (this.f92310ae) {
            getContext();
            if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
                C58029j.f132256h = m118654e();
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
            mo105831a().mo105825a(user2, user2.getFollowStatus());
            if (z2) {
                m118652a("follow", user2, i2, mo105834c());
                mo105832a(user2, C59256u.EnumC59257a.FOLLOW, mo105834c());
                return;
            }
            m118652a("follow_cancel", user2, i2, mo105834c());
            mo105832a(user2, C59256u.EnumC59257a.FOLLOW_CANCEL, mo105834c());
        }
    }

    /* renamed from: a */
    public final void mo105832a(User user, C59256u.EnumC59257a aVar, int i) {
        C59256u a = new C59256u().mo96834a(mo105833b());
        a.f135350a = C59256u.EnumC59259c.POP_UP;
        a.f135352b = aVar;
        C59256u o = a.mo96837o("on_boarding");
        if (i == 2) {
            user.setRecType("1-2");
        } else {
            user.setRecType("1-1");
        }
        o.mo96832a(user).mo96792f();
    }

    /* renamed from: a */
    private final void m118652a(String str, User user, int i, int i2) {
        String str2;
        C33744d a = new C33744d().mo59983a("enter_from", "foru_boarding").mo59983a("previous_page", mo105833b());
        if (i2 == 2) {
            str2 = "1-2";
        } else {
            str2 = "1-1";
        }
        C39162r.m79460a(str, a.mo59983a("rec_type", str2).mo59983a("rec_uid", user.getUid()).mo59980a("impr_order", i).mo59983a("relation_type", user.getFriendTypeStr()).f79943a);
    }
}
