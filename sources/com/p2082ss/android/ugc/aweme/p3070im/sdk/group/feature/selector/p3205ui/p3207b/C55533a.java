package com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.selector.p3205ui.p3207b;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.C17656f;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.navigation.p1723a.C23187b;
import com.bytedance.tux.navigation.p1723a.C23194g;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.p1710c.C23005c;
import com.bytedance.tux.status.TuxStatusView;
import com.bytedance.tux.status.loading.TuxDualBallView;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.activity.ChatRoomActivity;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55076b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.selector.p3205ui.view.C55598c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.selector.p3205ui.view.C55600e;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.selector.p3205ui.view.GroupListCell;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.selector.p3205ui.view.IndexCell;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.selector.viewmodel.GroupListViewModel;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56245a;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMConversation;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.b.a */
public final class C55533a extends AbstractC34586a {

    /* renamed from: b */
    public static final C55534a f126769b = new C55534a((byte) 0);

    /* renamed from: a */
    GroupListViewModel f126770a;

    /* renamed from: c */
    private HashMap f126771c;

    static {
        Covode.recordClassIndex(65304);
    }

    /* renamed from: a */
    public final View mo92484a(int i) {
        if (this.f126771c == null) {
            this.f126771c = new HashMap();
        }
        View view = (View) this.f126771c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f126771c.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.b.a$a */
    public static final class C55534a {
        static {
            Covode.recordClassIndex(65305);
        }

        private C55534a() {
        }

        public /* synthetic */ C55534a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f126771c;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.b.a$b */
    static final class C55535b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C55533a f126772a;

        static {
            Covode.recordClassIndex(65306);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55535b(C55533a aVar) {
            super(0);
            this.f126772a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            Fragment fragment = this.f126772a;
            AbstractC0952i fragmentManager = fragment.getFragmentManager();
            if (fragmentManager != null) {
                if (fragmentManager.mo3564e() > 0) {
                    C56244a.m102191c("GroupListFragment", "poping backstack");
                    fragmentManager.mo3562c();
                } else {
                    C56244a.m102191c("GroupListFragment", "nothing in backstack");
                    fragmentManager.mo3552a().mo3455a(fragment).mo3467b();
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.b.a$e */
    static final class C55538e extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        public static final C55538e f126775a = new C55538e();

        static {
            Covode.recordClassIndex(65309);
        }

        C55538e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f54431a = R.raw.icon_large_group;
            aVar2.f54435e = Integer.valueOf((int) R.attr.bd);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.b.a$d */
    static final class C55537d<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C55533a f126774a;

        static {
            Covode.recordClassIndex(65308);
        }

        C55537d(C55533a aVar) {
            this.f126774a = aVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            IMConversation iMConversation = (IMConversation) obj;
            C55533a aVar = this.f126774a;
            C89219l.m154716b(iMConversation, "");
            ChatRoomActivity.C54401a.m99731a(C56245a.C56247b.m102213a(aVar.getContext(), iMConversation).mo93271b("existed_group").f128281a);
            ActivityC0945e activity = aVar.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AbstractC1174ac a = C1181ae.m3879a(this, (C1175ad.AbstractC1177b) null).mo3983a(GroupListViewModel.class);
        C89219l.m154716b(a, "");
        GroupListViewModel groupListViewModel = (GroupListViewModel) a;
        groupListViewModel.f126857b.observe(this, new C55536c(this));
        groupListViewModel.f126858c.observe(this, new C55537d(this));
        this.f126770a = groupListViewModel;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.b.a$c */
    static final class C55536c<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C55533a f126773a;

        static {
            Covode.recordClassIndex(65307);
        }

        C55536c(C55533a aVar) {
            this.f126773a = aVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            C55533a aVar = this.f126773a;
            GroupListViewModel groupListViewModel = aVar.f126770a;
            if (groupListViewModel == null) {
                C89219l.m154710a("mViewModel");
            }
            List j = C89070n.m154590j(groupListViewModel.f126856a);
            if (!(!j.isEmpty())) {
                j = null;
            }
            if (j != null) {
                PowerList powerList = (PowerList) aVar.mo92484a(R.id.bc9);
                C89219l.m154716b(powerList, "");
                C17656f<AbstractC17641a> state = powerList.getState();
                state.mo28128a();
                int i = 0;
                for (T t : j) {
                    int i2 = i + 1;
                    if (i < 0) {
                        C89070n.m154520a();
                    }
                    T t2 = t;
                    if (i == 0 || (!C89219l.m154714a((Object) t2.getInitialLetter(), (Object) ((IMConversation) j.get(i - 1)).getInitialLetter()))) {
                        String initialLetter = t2.getInitialLetter();
                        C89219l.m154716b(initialLetter, "");
                        state.mo28132a(new C55600e(initialLetter));
                    }
                    state.mo28132a(new C55598c(t2));
                    i = i2;
                }
            } else {
                TuxStatusView tuxStatusView = (TuxStatusView) aVar.mo92484a(R.id.e7i);
                C89219l.m154716b(tuxStatusView, "");
                tuxStatusView.setVisibility(0);
                TuxStatusView.C23263c a = new TuxStatusView.C23263c().mo37877a(C23005c.m43393a(C55538e.f126775a));
                String string = aVar.getString(R.string.c7v);
                C89219l.m154716b(string, "");
                TuxStatusView.C23263c a2 = a.mo37879a(string);
                String string2 = aVar.getString(R.string.c7w);
                C89219l.m154716b(string2, "");
                ((TuxStatusView) aVar.mo92484a(R.id.e7i)).setStatus(a2.mo37878a((CharSequence) string2));
            }
            TuxDualBallView tuxDualBallView = (TuxDualBallView) aVar.mo92484a(R.id.cg3);
            C89219l.m154716b(tuxDualBallView, "");
            if (tuxDualBallView.getVisibility() == 0) {
                tuxDualBallView.mo37885c();
                tuxDualBallView.setVisibility(8);
            }
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        C55076b.m100725d().setupStatusBar(getActivity());
        TuxNavBar.C23179a a = new TuxNavBar.C23179a().mo37732a(new C23187b().mo37738a(R.raw.icon_arrow_left_ltr).mo37741a((AbstractC89171a<C89391z>) new C55535b(this)));
        C23194g gVar = new C23194g();
        String string = getString(R.string.c7u);
        C89219l.m154716b(string, "");
        TuxNavBar.C23179a a2 = a.mo37731a(gVar.mo37753a(string));
        a2.f54919d = true;
        ((TuxNavBar) mo92484a(R.id.cpv)).setNavActions(a2);
        ((TuxDualBallView) mo92484a(R.id.cg3)).mo37884b();
        PowerList powerList = (PowerList) mo92484a(R.id.bc9);
        powerList.mo28083a(IndexCell.class, GroupListCell.class);
        GroupListViewModel groupListViewModel = this.f126770a;
        if (groupListViewModel == null) {
            C89219l.m154710a("mViewModel");
        }
        powerList.mo28082a(groupListViewModel.mo92527a());
        powerList.getState().mo28128a();
        GroupListViewModel groupListViewModel2 = this.f126770a;
        if (groupListViewModel2 == null) {
            C89219l.m154710a("mViewModel");
        }
        groupListViewModel2.mo92527a().f42330c.mo28163e();
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.a4p, viewGroup, false);
    }
}
