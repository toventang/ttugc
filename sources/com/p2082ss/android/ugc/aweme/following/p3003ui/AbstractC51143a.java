package com.p2082ss.android.ugc.aweme.following.p3003ui;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.C17273d;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p1194ui.widget.MtEmptyView;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.base.arch.AbstractC34488b;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50540h;
import com.p2082ss.android.ugc.aweme.following.repository.C51133f;
import com.p2082ss.android.ugc.aweme.friends.p3011a.AbstractC51472p;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.views.C81437h;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.following.ui.a */
public abstract class AbstractC51143a extends AbstractC34488b implements AbstractC51472p {

    /* renamed from: k */
    public static final C51144a f117987k = new C51144a((byte) 0);

    /* renamed from: b */
    public String f117988b;

    /* renamed from: c */
    public User f117989c;

    /* renamed from: d */
    public boolean f117990d;

    /* renamed from: e */
    protected DmtStatusView.C17269a f117991e;

    /* renamed from: j */
    public String f117992j = "";

    /* renamed from: l */
    private SparseArray f117993l;

    static {
        Covode.recordClassIndex(60344);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.arch.AbstractC34488b
    /* renamed from: a */
    public View mo60929a(int i) {
        if (this.f117993l == null) {
            this.f117993l = new SparseArray();
        }
        View view = (View) this.f117993l.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f117993l.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.arch.AbstractC34488b
    /* renamed from: a */
    public void mo60930a() {
        SparseArray sparseArray = this.f117993l;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: g */
    public abstract int mo86590g();

    /* renamed from: i */
    public int mo86592i() {
        return 0;
    }

    /* renamed from: j */
    public String mo86593j() {
        return "";
    }

    /* renamed from: l */
    public boolean mo86595l() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.arch.AbstractC34488b
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo60930a();
    }

    /* renamed from: p */
    public abstract void mo86598p();

    /* renamed from: q */
    public abstract int mo86599q();

    /* renamed from: r */
    public abstract int mo86600r();

    /* renamed from: com.ss.android.ugc.aweme.following.ui.a$a */
    public static final class C51144a {
        static {
            Covode.recordClassIndex(60345);
        }

        private C51144a() {
        }

        public /* synthetic */ C51144a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.p3011a.AbstractC51472p
    /* renamed from: n */
    public final boolean mo86596n() {
        return this.f117990d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final DmtStatusView.C17269a mo86589e() {
        DmtStatusView.C17269a aVar = this.f117991e;
        if (aVar == null) {
            C89219l.m154710a("mStatusViewBuilder");
        }
        return aVar;
    }

    /* renamed from: k */
    public final String mo86594k() {
        if (mo86591h()) {
            return "personal_homepage";
        }
        return "others_homepage";
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.p3011a.AbstractC51472p
    /* renamed from: o */
    public final void mo86597o() {
        if (af_()) {
            mo86598p();
            this.f117990d = false;
        }
    }

    /* renamed from: h */
    public final boolean mo86591h() {
        String str = this.f117988b;
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        return TextUtils.equals(str, g.getCurUserId());
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.p3011a.AbstractC51472p
    /* renamed from: a */
    public final void mo86587a(boolean z) {
        this.f117990d = z;
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.a$b */
    static final class View$OnClickListenerC51145b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC51143a f117994a;

        static {
            Covode.recordClassIndex(60346);
        }

        View$OnClickListenerC51145b(AbstractC51143a aVar) {
            this.f117994a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f117994a.mo86598p();
        }
    }

    /* renamed from: a */
    public final boolean mo86588a(ListState<Object, C51133f> listState) {
        C89219l.m154721d(listState, "");
        mo86591h();
        return false;
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("uid", "");
            C89219l.m154716b(string, "");
            this.f117992j = string;
            this.f117988b = arguments.getString("uid");
        }
        this.f117989c = C50540h.f116811c;
    }

    /* renamed from: a */
    public final void mo86585a(DmtStatusView dmtStatusView) {
        C89219l.m154721d(dmtStatusView, "");
        DmtStatusView.C17269a b = DmtStatusView.C17269a.m31905a(getContext()).mo27407b(C81437h.m141212a(getContext(), new View$OnClickListenerC51145b(this)));
        C89219l.m154716b(b, "");
        this.f117991e = b;
        MtEmptyView a = MtEmptyView.m31926a(getContext());
        Context context = getContext();
        if (context == null) {
            C89219l.m154715b();
        }
        a.setStatus(new C17273d.C17274a(context).mo27457a(2131232651).mo27462b(mo86600r()).mo27464c(mo86599q()).f41365a);
        DmtStatusView.C17269a aVar = this.f117991e;
        if (aVar == null) {
            C89219l.m154710a("mStatusViewBuilder");
        }
        aVar.mo27406b(a);
        DmtStatusView.C17269a aVar2 = this.f117991e;
        if (aVar2 == null) {
            C89219l.m154710a("mStatusViewBuilder");
        }
        dmtStatusView.setBuilder(aVar2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo86586a(com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView r7, java.lang.Exception r8) {
        /*
        // Method dump skipped, instructions count: 189
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.following.p3003ui.AbstractC51143a.mo86586a(com.bytedance.ies.dmt.ui.widget.DmtStatusView, java.lang.Exception):void");
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        return C1764a.m5927a(layoutInflater, mo86590g(), viewGroup, false);
    }
}
