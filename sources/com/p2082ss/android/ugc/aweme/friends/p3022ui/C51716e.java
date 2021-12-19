package com.p2082ss.android.ugc.aweme.friends.p3022ui;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.core.content.C0643b;
import androidx.fragment.app.ActivityC0945e;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.titlebar.AbstractC17250a;
import com.bytedance.ies.dmt.p1194ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p1194ui.widget.C17273d;
import com.bytedance.ies.dmt.p1194ui.widget.DmtEditText;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p1194ui.widget.MtEmptyView;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.base.p2379ui.C34699o;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.comment.p2490d.C36410g;
import com.p2082ss.android.ugc.aweme.common.AbstractC39085b;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h;
import com.p2082ss.android.ugc.aweme.common.p2634f.C39115e;
import com.p2082ss.android.ugc.aweme.feed.C48027ac;
import com.p2082ss.android.ugc.aweme.framework.p3007b.C51425a;
import com.p2082ss.android.ugc.aweme.framework.services.IUserService;
import com.p2082ss.android.ugc.aweme.friends.C51489f;
import com.p2082ss.android.ugc.aweme.friends.model.AtFriendsViewModel;
import com.p2082ss.android.ugc.aweme.friends.p3011a.C51437a;
import com.p2082ss.android.ugc.aweme.friends.p3011a.C51443b;
import com.p2082ss.android.ugc.aweme.friends.p3016f.AbstractC51491b;
import com.p2082ss.android.ugc.aweme.friends.p3016f.C51497f;
import com.p2082ss.android.ugc.aweme.friends.p3022ui.IndexView;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.search.model.C67679e;
import com.p2082ss.android.ugc.aweme.search.model.C67681g;
import com.p2082ss.android.ugc.aweme.search.model.C67683h;
import com.p2082ss.android.ugc.aweme.search.model.C67684i;
import com.p2082ss.android.ugc.aweme.search.service.ISearchUserService;
import com.p2082ss.android.ugc.aweme.search.service.SearchUserService;
import com.p2082ss.android.ugc.aweme.services.BaseUserService;
import com.p2082ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.e */
public final class C51716e extends AbstractC34586a implements AbstractC51491b {

    /* renamed from: k */
    public static final C51717a f119211k = new C51717a((byte) 0);

    /* renamed from: a */
    public final AtFriendsViewModel f119212a = new AtFriendsViewModel();

    /* renamed from: b */
    public final C51437a f119213b = new C51437a();

    /* renamed from: c */
    public final C51443b f119214c = new C51443b();

    /* renamed from: d */
    public LinearLayoutManager f119215d;

    /* renamed from: e */
    public C51753v f119216e;

    /* renamed from: j */
    final AbstractC89244h f119217j = C89250i.m154773a((AbstractC89171a) C51732o.f119240a);

    /* renamed from: l */
    private final AbstractC89244h f119218l = C89250i.m154773a((AbstractC89171a) C51718b.f119225a);

    /* renamed from: m */
    private final AbstractC89244h f119219m = C89250i.m154773a((AbstractC89171a) C51733p.f119241a);

    /* renamed from: n */
    private final AbstractC89244h f119220n = C89250i.m154773a((AbstractC89171a) new C51719c(this));

    /* renamed from: o */
    private final AbstractC89244h f119221o = C89250i.m154773a((AbstractC89171a) new C51731n(this));

    /* renamed from: p */
    private String f119222p;

    /* renamed from: q */
    private int f119223q;

    /* renamed from: r */
    private SparseArray f119224r;

    static {
        Covode.recordClassIndex(61079);
    }

    /* renamed from: c */
    private static String m96399c(int i) {
        return i == 1 ? "comments" : i == 0 ? "captions" : "";
    }

    /* renamed from: b */
    public final View mo87450b(int i) {
        if (this.f119224r == null) {
            this.f119224r = new SparseArray();
        }
        View view = (View) this.f119224r.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f119224r.put(i, findViewById);
        return findViewById;
    }

    /* renamed from: c */
    public final HashSet<String> mo87451c() {
        return (HashSet) this.f119218l.getValue();
    }

    /* renamed from: d */
    public final C51497f mo87452d() {
        return (C51497f) this.f119219m.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.e$a */
    public static final class C51717a {
        static {
            Covode.recordClassIndex(61080);
        }

        private C51717a() {
        }

        public /* synthetic */ C51717a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.e$b */
    static final class C51718b extends AbstractC89220m implements AbstractC89171a<HashSet<String>> {

        /* renamed from: a */
        public static final C51718b f119225a = new C51718b();

        static {
            Covode.recordClassIndex(61081);
        }

        C51718b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ HashSet<String> invoke() {
            return new HashSet();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.e$o */
    static final class C51732o extends AbstractC89220m implements AbstractC89171a<ISearchUserService> {

        /* renamed from: a */
        public static final C51732o f119240a = new C51732o();

        static {
            Covode.recordClassIndex(61095);
        }

        C51732o() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ISearchUserService invoke() {
            return SearchUserService.m119898b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.e$p */
    static final class C51733p extends AbstractC89220m implements AbstractC89171a<C51497f> {

        /* renamed from: a */
        public static final C51733p f119241a = new C51733p();

        static {
            Covode.recordClassIndex(61096);
        }

        C51733p() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C51497f invoke() {
            return new C51497f();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.e$f */
    public static final class C51722f implements C51443b.AbstractC51444a {

        /* renamed from: a */
        final /* synthetic */ C51716e f119229a;

        static {
            Covode.recordClassIndex(61085);
        }

        @Override // com.p2082ss.android.ugc.aweme.friends.p3011a.C51443b.AbstractC51444a
        /* renamed from: a */
        public final String mo86926a() {
            return this.f119229a.mo87452d().f118684a;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C51722f(C51716e eVar) {
            this.f119229a = eVar;
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f119224r;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.p3016f.AbstractC51491b
    /* renamed from: a */
    public final void mo87000a() {
        if (af_() && this.f119214c.getItemCount() == 0) {
            ((DmtStatusView) mo87450b(R.id.e77)).mo27384f();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.e$c */
    static final class C51719c extends AbstractC89220m implements AbstractC89171a<C17273d> {

        /* renamed from: a */
        final /* synthetic */ C51716e f119226a;

        static {
            Covode.recordClassIndex(61082);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51719c(C51716e eVar) {
            super(0);
            this.f119226a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C17273d invoke() {
            return new C17273d.C17274a(this.f119226a.getContext()).mo27457a(2131232926).mo27462b(R.string.vb).mo27464c(R.string.vc).f41365a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.e$e */
    static final class C51721e implements AbstractC39063h.AbstractC39067a {

        /* renamed from: a */
        final /* synthetic */ C51716e f119228a;

        static {
            Covode.recordClassIndex(61084);
        }

        C51721e(C51716e eVar) {
            this.f119228a = eVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h.AbstractC39067a
        /* renamed from: l */
        public final void mo62679l() {
            this.f119228a.mo87451c().size();
            this.f119228a.f119214c.ao_();
            this.f119228a.mo87452d().mo87013a(false, this.f119228a.mo87453e());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.e$n */
    static final class C51731n extends AbstractC89220m implements AbstractC89171a<C17273d> {

        /* renamed from: a */
        final /* synthetic */ C51716e f119239a;

        static {
            Covode.recordClassIndex(61094);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51731n(C51716e eVar) {
            super(0);
            this.f119239a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C17273d invoke() {
            return new C17273d.C17274a(this.f119239a.getContext()).mo27457a(2131232925).mo27462b(R.string.gzz).mo27464c(R.string.h00).f41365a;
        }
    }

    /* renamed from: e */
    public final C67681g mo87453e() {
        String str;
        String str2 = this.f119214c.f118551g;
        int i = this.f119223q;
        if (i == 1) {
            str = "comment_user";
        } else if (i == 0) {
            str = "at_user";
        } else {
            str = "";
        }
        return new C67681g(6, null, str2, str, 20, C89070n.m154590j(mo87451c()));
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.p3016f.AbstractC51491b
    /* renamed from: b */
    public final void mo87003b() {
        if (af_()) {
            if (this.f119214c.getItemCount() == 0) {
                ((DmtStatusView) mo87450b(R.id.e77)).mo27387h();
            }
            C39115e.m79412a(getActivity(), mo87450b(R.id.dqk));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.e$j */
    public static final class C51726j extends C34699o {

        /* renamed from: a */
        final /* synthetic */ C51716e f119233a;

        static {
            Covode.recordClassIndex(61089);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C51726j(C51716e eVar) {
            this.f119233a = eVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.friends.ui.e$j$a */
        static final class C51727a<TTaskResult, TContinuationResult> implements AbstractC1729g {

            /* renamed from: a */
            final /* synthetic */ C51726j f119234a;

            static {
                Covode.recordClassIndex(61090);
            }

            C51727a(C51726j jVar) {
                this.f119234a = jVar;
            }

            @Override // p077b.AbstractC1729g
            public final /* synthetic */ Object then(C1731i iVar) {
                C89219l.m154716b(iVar, "");
                if (iVar.mo5539b() || iVar.mo5544c()) {
                    ((DmtStatusView) this.f119234a.f119233a.mo87450b(R.id.e77)).mo27384f();
                } else {
                    this.f119234a.f119233a.f119214c.f118546b = (List) iVar.mo5545d();
                    List list = (List) iVar.mo5545d();
                    if (list != null && (!list.isEmpty())) {
                        this.f119234a.f119233a.mo87449a((Integer) null);
                    }
                    List list2 = (List) iVar.mo5545d();
                    if (list2 != null) {
                        Integer.valueOf(list2.size());
                    }
                }
                this.f119234a.f119233a.mo87451c().clear();
                this.f119234a.f119233a.mo87452d().mo87013a(true, this.f119234a.f119233a.mo87453e());
                return C89391z.f203057a;
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.C34699o
        public final void afterTextChanged(Editable editable) {
            boolean z;
            int i;
            int i2;
            C89219l.m154721d(editable, "");
            if (editable.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i = 8;
            } else {
                i = 0;
            }
            ImageButton imageButton = (ImageButton) this.f119233a.mo87450b(R.id.a6_);
            C89219l.m154716b(imageButton, "");
            if (imageButton.getVisibility() != i) {
                if (i == 8) {
                    C51716e eVar = this.f119233a;
                    if (eVar.f119213b.getItemCount() == 0) {
                        i2 = 1;
                    } else {
                        i2 = -1;
                    }
                    eVar.mo87448a(i2);
                }
                ImageButton imageButton2 = (ImageButton) this.f119233a.mo87450b(R.id.a6_);
                C89219l.m154716b(imageButton2, "");
                imageButton2.setVisibility(i);
            }
            String obj = editable.toString();
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.CharSequence");
            String obj2 = C89361p.m154910b((CharSequence) obj).toString();
            if (!C89219l.m154714a((Object) this.f119233a.f119214c.f118551g, (Object) obj2)) {
                C51443b bVar = this.f119233a.f119214c;
                C89219l.m154721d(obj2, "");
                bVar.f118551g = obj2;
                if (obj2.length() > 0) {
                    if (!this.f119233a.mo87452d().mo67841i()) {
                        C51497f d = this.f119233a.mo87452d();
                        C51716e eVar2 = this.f119233a;
                        C89219l.m154721d(eVar2, "");
                        if (!(eVar2 instanceof AbstractC51491b)) {
                            eVar2 = null;
                        }
                        d.mo67839a_(eVar2);
                    }
                    if (this.f119233a.f119213b.getItemCount() == 0) {
                        ((DmtStatusView) this.f119233a.mo87450b(R.id.e77)).mo27384f();
                    }
                    this.f119233a.mo87451c().size();
                    if (((ISearchUserService) this.f119233a.f119217j.getValue()).mo106817a()) {
                        AtFriendsViewModel atFriendsViewModel = this.f119233a.f119212a;
                        List<? extends IMUser> list = this.f119233a.f119213b.f118522b;
                        if (list == null) {
                            list = C89086z.INSTANCE;
                        }
                        atFriendsViewModel.searchKeyWord(obj2, list).mo5534a(new C51727a(this), C1731i.f5564c, null);
                        return;
                    }
                    this.f119233a.mo87451c().clear();
                    this.f119233a.mo87452d().mo87013a(true, this.f119233a.mo87453e());
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.e$g */
    static final class View$OnClickListenerC51723g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C51716e f119230a;

        static {
            Covode.recordClassIndex(61086);
        }

        View$OnClickListenerC51723g(C51716e eVar) {
            this.f119230a = eVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            ActivityC0945e activity = this.f119230a.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.e$h */
    static final class View$OnClickListenerC51724h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C51716e f119231a;

        static {
            Covode.recordClassIndex(61087);
        }

        View$OnClickListenerC51724h(C51716e eVar) {
            this.f119231a = eVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            ActivityC0945e activity = this.f119231a.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ LinearLayoutManager m96398a(C51716e eVar) {
        LinearLayoutManager linearLayoutManager = eVar.f119215d;
        if (linearLayoutManager == null) {
            C89219l.m154710a("linearLayoutManager");
        }
        return linearLayoutManager;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.friends.ui.e$q */
    public static final class View$OnClickListenerC51734q implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C51716e f119242a;

        static {
            Covode.recordClassIndex(61097);
        }

        View$OnClickListenerC51734q(C51716e eVar) {
            this.f119242a = eVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f119242a.mo87452d().mo87013a(true, this.f119242a.mo87453e());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.e$k */
    static final class View$OnClickListenerC51728k implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C51716e f119235a;

        static {
            Covode.recordClassIndex(61091);
        }

        View$OnClickListenerC51728k(C51716e eVar) {
            this.f119235a = eVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            ((DmtEditText) this.f119235a.mo87450b(R.id.dqk)).setText("");
            ((DmtEditText) this.f119235a.mo87450b(R.id.dqk)).clearFocus();
            C39115e.m79412a(this.f119235a.getActivity(), this.f119235a.mo87450b(R.id.dqk));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.e$m */
    static final class C51730m implements IndexView.AbstractC51664a {

        /* renamed from: a */
        final /* synthetic */ C51716e f119238a;

        static {
            Covode.recordClassIndex(61093);
        }

        C51730m(C51716e eVar) {
            this.f119238a = eVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.friends.p3022ui.IndexView.AbstractC51664a
        /* renamed from: a */
        public final void mo87400a(int i) {
            LinearLayoutManager a = C51716e.m96398a(this.f119238a);
            IndexView indexView = (IndexView) this.f119238a.mo87450b(R.id.bmo);
            int i2 = 0;
            int i3 = 0;
            while (i2 < indexView.f119029b.size() && i2 < i) {
                i3 += indexView.f119029b.get(i2).intValue();
                i2++;
            }
            a.mo4347a(i3, 0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.e$d */
    static final class C51720d<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ C51716e f119227a;

        static {
            Covode.recordClassIndex(61083);
        }

        C51720d(C51716e eVar) {
            this.f119227a = eVar;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            int i;
            IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
            C89219l.m154716b(iVar, "");
            if (!iVar.mo5539b() && !iVar.mo5544c()) {
                C89219l.m154716b(createIUserServicebyMonsterPlugin, "");
                if (createIUserServicebyMonsterPlugin.isLogin()) {
                    C51716e eVar = this.f119227a;
                    C51753v vVar = new C51753v(this.f119227a.getContext(), ((AtFriendsViewModel.Companion.AllFriends) iVar.mo5545d()).indexLabels, ((AtFriendsViewModel.Companion.AllFriends) iVar.mo5545d()).indexLabelCount);
                    ((RecyclerView) this.f119227a.mo87450b(R.id.dgn)).mo4402a(vVar);
                    eVar.f119216e = vVar;
                    IndexView indexView = (IndexView) this.f119227a.mo87450b(R.id.bmo);
                    List<String> list = ((AtFriendsViewModel.Companion.AllFriends) iVar.mo5545d()).indexLabels;
                    List<Integer> list2 = ((AtFriendsViewModel.Companion.AllFriends) iVar.mo5545d()).indexLabelCount;
                    indexView.f119028a.clear();
                    indexView.f119029b.clear();
                    indexView.f119028a.addAll(list);
                    indexView.f119029b.addAll(list2);
                    indexView.requestLayout();
                    C51437a aVar = this.f119227a.f119213b;
                    AtFriendsViewModel.Companion.AllFriends allFriends = (AtFriendsViewModel.Companion.AllFriends) iVar.mo5545d();
                    aVar.f118524d = allFriends;
                    if (allFriends != null) {
                        aVar.f118522b = allFriends.filterFriends;
                        aVar.f118523c = allFriends.mobRecentUsers;
                    }
                    C51716e eVar2 = this.f119227a;
                    if (eVar2.f119213b.getItemCount() == 0) {
                        i = 1;
                    } else {
                        i = -1;
                    }
                    eVar2.mo87448a(i);
                    this.f119227a.f119213b.notifyDataSetChanged();
                    return null;
                }
            }
            ((DmtStatusView) this.f119227a.mo87450b(R.id.e77)).mo27385g();
            return null;
        }
    }

    /* renamed from: a */
    public final void mo87448a(int i) {
        if (af_() && mo87450b(R.id.dgn) != null) {
            RecyclerView recyclerView = (RecyclerView) mo87450b(R.id.dgn);
            C89219l.m154716b(recyclerView, "");
            if (!C89219l.m154714a(recyclerView.getAdapter(), this.f119213b)) {
                C51753v vVar = this.f119216e;
                if (vVar != null) {
                    ((RecyclerView) mo87450b(R.id.dgn)).mo4425c(vVar);
                    ((RecyclerView) mo87450b(R.id.dgn)).mo4402a(vVar);
                }
                RecyclerView recyclerView2 = (RecyclerView) mo87450b(R.id.dgn);
                C89219l.m154716b(recyclerView2, "");
                recyclerView2.setAdapter(this.f119213b);
                IndexView indexView = (IndexView) mo87450b(R.id.bmo);
                C89219l.m154716b(indexView, "");
                indexView.setVisibility(0);
            }
            DmtStatusView.C17269a a = DmtStatusView.C17269a.m31905a(getContext());
            MtEmptyView a2 = MtEmptyView.m31926a(getContext());
            a2.setStatus(new C17273d.C17274a(getContext()).mo27457a(2131232651).mo27462b(R.string.vb).mo27464c(R.string.vc).f41365a);
            a.mo27406b(a2);
            ((DmtStatusView) mo87450b(R.id.e77)).setBuilder(a);
            ((DmtStatusView) mo87450b(R.id.e77)).setStatus(-1);
            ((DmtStatusView) mo87450b(R.id.e77)).setStatus(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo87449a(Integer num) {
        if (af_() && mo87450b(R.id.dgn) != null) {
            RecyclerView recyclerView = (RecyclerView) mo87450b(R.id.dgn);
            C89219l.m154716b(recyclerView, "");
            int i = 1;
            if (!C89219l.m154714a(recyclerView.getAdapter(), this.f119214c)) {
                if (this.f119216e != null) {
                    RecyclerView recyclerView2 = (RecyclerView) mo87450b(R.id.dgn);
                    C51753v vVar = this.f119216e;
                    if (vVar == null) {
                        C89219l.m154715b();
                    }
                    recyclerView2.mo4425c(vVar);
                }
                RecyclerView recyclerView3 = (RecyclerView) mo87450b(R.id.dgn);
                C89219l.m154716b(recyclerView3, "");
                recyclerView3.setAdapter(this.f119214c);
                IndexView indexView = (IndexView) mo87450b(R.id.bmo);
                C89219l.m154716b(indexView, "");
                indexView.setVisibility(4);
            }
            if (num != null) {
                i = num.intValue();
            } else {
                DmtStatusView dmtStatusView = (DmtStatusView) mo87450b(R.id.e77);
                C89219l.m154716b(dmtStatusView, "");
                if (dmtStatusView.mo27389j()) {
                    i = 0;
                } else {
                    DmtStatusView dmtStatusView2 = (DmtStatusView) mo87450b(R.id.e77);
                    C89219l.m154716b(dmtStatusView2, "");
                    if (!dmtStatusView2.mo27390k()) {
                        DmtStatusView dmtStatusView3 = (DmtStatusView) mo87450b(R.id.e77);
                        C89219l.m154716b(dmtStatusView3, "");
                        if (dmtStatusView3.mo27391l()) {
                            i = 2;
                        } else {
                            i = -1;
                        }
                    }
                }
            }
            DmtStatusView.C17269a a = DmtStatusView.C17269a.m31905a(getContext()).mo27401a(R.string.gzs, new View$OnClickListenerC51734q(this));
            MtEmptyView a2 = MtEmptyView.m31926a(getContext());
            a2.setStatus(new C17273d.C17274a(getContext()).mo27457a(2131232652).mo27462b(R.string.gzz).mo27464c(R.string.h00).f41365a);
            a.mo27406b(a2);
            ((DmtStatusView) mo87450b(R.id.e77)).setBuilder(a);
            ((DmtStatusView) mo87450b(R.id.e77)).setStatus(-1);
            ((DmtStatusView) mo87450b(R.id.e77)).setStatus(i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a8, code lost:
        if (r2 == null) goto L_0x00aa;
     */
    @Override // com.p2082ss.android.ugc.aweme.friends.p3016f.AbstractC51491b
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo87002a(boolean r5) {
        /*
        // Method dump skipped, instructions count: 190
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.friends.p3022ui.C51716e.mo87002a(boolean):void");
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.e$l */
    public static final class C51729l extends C51425a {

        /* renamed from: a */
        final /* synthetic */ C51716e f119236a;

        /* renamed from: b */
        final /* synthetic */ View f119237b;

        static {
            Covode.recordClassIndex(61092);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n, com.p2082ss.android.ugc.aweme.framework.p3007b.C51425a
        /* renamed from: a */
        public final void mo4753a(RecyclerView recyclerView, int i) {
            C89219l.m154721d(recyclerView, "");
            super.mo4753a(recyclerView, i);
            ((IndexView) this.f119236a.mo87450b(R.id.bmo)).setRecycleViewPos(C51716e.m96398a(this.f119236a).mo4371k());
            C39115e.m79412a(this.f119236a.getActivity(), this.f119236a.mo87450b(R.id.dqk));
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51729l(C51716e eVar, View view, Context context) {
            super(context);
            this.f119236a = eVar;
            this.f119237b = view;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n, com.p2082ss.android.ugc.aweme.framework.p3007b.C51425a
        /* renamed from: a */
        public final void mo4754a(RecyclerView recyclerView, int i, int i2) {
            C89219l.m154721d(recyclerView, "");
            super.mo4754a(recyclerView, i, i2);
            if (((float) i2) > C13628n.m24520b(this.f119236a.getContext(), 10.0f)) {
                C39115e.m79412a(this.f119236a.getActivity(), this.f119236a.mo87450b(R.id.dqk));
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.p3016f.AbstractC51491b
    /* renamed from: a */
    public final void mo87001a(C67683h hVar, String str) {
        ArrayList arrayList;
        T t;
        C89219l.m154721d(hVar, "");
        C89219l.m154721d(str, "");
        int i = 1;
        if (!(!C89219l.m154714a((Object) str, (Object) this.f119214c.f118551g))) {
            if (this.f119223q == 0) {
                C39162r.m79463b("search_video_at", C59208ac.m108761a(new C33744d().mo59983a("search_keyword", str).mo59983a("log_pb", C48027ac.C48028a.f111257a.mo80055a(mo87452d().f118684a)).f79943a));
            }
            if (af_() && !TextUtils.isEmpty(this.f119214c.f118551g)) {
                AbstractC39085b bVar = mo87452d().f92286h;
                if (bVar == null || (t = bVar.mData) == null || !t.mo106753a()) {
                    this.f119214c.ap_();
                } else {
                    this.f119214c.aq_();
                }
                List<? extends C67679e> list = hVar.f151688a;
                Integer num = null;
                if (list != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (T t2 : list) {
                        AtFriendsViewModel atFriendsViewModel = this.f119212a;
                        String userId = t2.f151672g.getUserId();
                        if (userId == null) {
                            userId = "";
                        }
                        if (!atFriendsViewModel.latestSearchUsersContain(userId)) {
                            arrayList2.add(t2);
                        }
                    }
                    arrayList = arrayList2;
                } else {
                    arrayList = null;
                }
                C51443b bVar2 = this.f119214c;
                bVar2.f118548d = arrayList;
                bVar2.f118549e = hVar.f151689b;
                bVar2.f118550f = hVar.f151690c;
                List<? extends C67679e> list2 = hVar.f151688a;
                if (list2 != null) {
                    Iterator<T> it = list2.iterator();
                    while (it.hasNext()) {
                        C67684i iVar = it.next().f151672g;
                        if (iVar.getMentionBlockType() == 1 && iVar.getUserId() != null) {
                            List<String> list3 = bVar2.f118555k;
                            String userId2 = iVar.getUserId();
                            if (userId2 == null) {
                                C89219l.m154715b();
                            }
                            list3.add(userId2);
                        }
                    }
                }
                if (this.f119214c.getItemCount() != 0) {
                    i = -1;
                }
                mo87449a(Integer.valueOf(i));
                C33744d a = new C33744d().mo59983a("search_position", m96399c(this.f119223q)).mo59983a("new_sug_session_id", C51489f.f118674a).mo59983a("impr_id", hVar.f151690c).mo59983a("raw_query", str);
                List<? extends C67679e> list4 = this.f119214c.f118548d;
                if (list4 != null) {
                    num = Integer.valueOf(list4.size());
                }
                C39162r.m79460a("trending_show", a.mo59982a("words_num", num).f79943a);
            }
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        Resources resources;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        C34729o.m70954a(getActivity(), C0643b.m2378c(view.getContext(), R.color.nc));
        C51489f.f118674a = String.valueOf(System.currentTimeMillis());
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f119222p = arguments.getString("video_id");
            this.f119223q = arguments.getInt("source");
        }
        this.f119213b.f118525e = this.f119223q;
        this.f119214c.f118552h = this.f119223q;
        C51443b bVar = this.f119214c;
        String c = m96399c(this.f119223q);
        C89219l.m154721d(c, "");
        bVar.f118553i = c;
        this.f119214c.f118554j = new C51722f(this);
        TextTitleBar textTitleBar = (TextTitleBar) mo87450b(R.id.eim);
        C89219l.m154716b(textTitleBar, "");
        textTitleBar.setUseBackIcon(true);
        TextTitleBar textTitleBar2 = (TextTitleBar) mo87450b(R.id.eim);
        C89219l.m154716b(textTitleBar2, "");
        textTitleBar2.getBackBtn().setImageResource(2131232545);
        TextTitleBar textTitleBar3 = (TextTitleBar) mo87450b(R.id.eim);
        C89219l.m154716b(textTitleBar3, "");
        textTitleBar3.getBackBtn().setOnClickListener(new View$OnClickListenerC51723g(this));
        TextTitleBar textTitleBar4 = (TextTitleBar) mo87450b(R.id.eim);
        C89219l.m154716b(textTitleBar4, "");
        textTitleBar4.getStartText().setOnClickListener(new View$OnClickListenerC51724h(this));
        if (C36410g.m74111b()) {
            AbstractC17250a aVar = (AbstractC17250a) mo87450b(R.id.eim);
            Context context = getContext();
            if (context == null || (resources = context.getResources()) == null) {
                str = null;
            } else {
                str = resources.getString(R.string.vg);
            }
            aVar.setTitle(str);
        }
        ((DmtEditText) mo87450b(R.id.dqk)).setHint(R.string.dqg);
        ((DmtEditText) mo87450b(R.id.dqk)).setOnKeyListener(new View$OnKeyListenerC51725i(this));
        ((DmtEditText) mo87450b(R.id.dqk)).addTextChangedListener(new C51726j(this));
        ((ImageButton) mo87450b(R.id.a6_)).setOnClickListener(new View$OnClickListenerC51728k(this));
        getContext();
        this.f119215d = new WrapLinearLayoutManager();
        RecyclerView recyclerView = (RecyclerView) mo87450b(R.id.dgn);
        C89219l.m154716b(recyclerView, "");
        LinearLayoutManager linearLayoutManager = this.f119215d;
        if (linearLayoutManager == null) {
            C89219l.m154710a("linearLayoutManager");
        }
        recyclerView.setLayoutManager(linearLayoutManager);
        ((RecyclerView) mo87450b(R.id.dgn)).setHasFixedSize(true);
        ((RecyclerView) mo87450b(R.id.dgn)).mo4405a(new C51729l(this, view, view.getContext()));
        ((IndexView) mo87450b(R.id.bmo)).setIndexLetterTv((TextView) mo87450b(R.id.bmn));
        ((IndexView) mo87450b(R.id.bmo)).setOnLetterTouchListener(new C51730m(this));
        mo87448a(0);
        this.f119212a.loadAllFriends().mo5534a(new C51720d(this), C1731i.f5564c, null);
        this.f119214c.mo67829d(true);
        this.f119214c.mo67813a(new C51721e(this));
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.a0n, viewGroup, false);
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.e$i */
    static final class View$OnKeyListenerC51725i implements View.OnKeyListener {

        /* renamed from: a */
        final /* synthetic */ C51716e f119232a;

        static {
            Covode.recordClassIndex(61088);
        }

        View$OnKeyListenerC51725i(C51716e eVar) {
            this.f119232a = eVar;
        }

        public final boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (i != 66) {
                return false;
            }
            C39115e.m79412a(this.f119232a.getActivity(), this.f119232a.mo87450b(R.id.dqk));
            return true;
        }
    }
}
