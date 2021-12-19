package com.p2082ss.android.ugc.aweme.comment.p2503ui;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1214u;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.C17656f;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import com.bytedance.ies.powerlist.page.AbstractC17700f;
import com.bytedance.ies.powerlist.page.config.AbstractC17692b;
import com.bytedance.ies.powerlist.page.config.C17693c;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.status.TuxStatusView;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.comment.adapter.C36213af;
import com.p2082ss.android.ugc.aweme.comment.adapter.C36214ag;
import com.p2082ss.android.ugc.aweme.comment.adapter.C36215ah;
import com.p2082ss.android.ugc.aweme.comment.adapter.LikeCell;
import com.p2082ss.android.ugc.aweme.comment.adapter.LikeLoadMoreCell;
import com.p2082ss.android.ugc.aweme.comment.adapter.LikeNoMoreLimitCell;
import com.p2082ss.android.ugc.aweme.comment.model.LikeListResponse;
import com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36419e;
import com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36420f;
import com.p2082ss.android.ugc.aweme.comment.p2495i.C36500h;
import com.p2082ss.android.ugc.aweme.comment.util.C37199i;
import com.p2082ss.android.ugc.aweme.comment.viewmodel.LikeListVM;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.i18n.C53437b;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89379q;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4615g.C89241a;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.dc */
public final class C37130dc extends AbstractC34586a implements AbstractC36420f {

    /* renamed from: k */
    public static final C37131a f87490k = new C37131a((byte) 0);

    /* renamed from: s */
    private static final int f87491s;

    /* renamed from: a */
    public Aweme f87492a;

    /* renamed from: b */
    public long f87493b;

    /* renamed from: c */
    public C36500h f87494c;

    /* renamed from: d */
    public AbstractC36419e f87495d;

    /* renamed from: e */
    public volatile boolean f87496e = true;

    /* renamed from: j */
    public C36215ah f87497j = new C36215ah();

    /* renamed from: l */
    private String f87498l;

    /* renamed from: m */
    private int f87499m;

    /* renamed from: n */
    private final AbstractC89244h f87500n = C89250i.m154773a((AbstractC89171a) new C37135e(this));

    /* renamed from: o */
    private boolean f87501o;

    /* renamed from: p */
    private final AbstractC89244h f87502p = C89250i.m154773a((AbstractC89171a) new C37137g(this));

    /* renamed from: q */
    private final AbstractC89244h f87503q = C89250i.m154773a((AbstractC89171a) new C37132b(this));

    /* renamed from: r */
    private final C37136f f87504r;

    /* renamed from: t */
    private SparseArray f87505t;

    /* renamed from: e */
    private final TuxStatusView m74877e() {
        return (TuxStatusView) this.f87502p.getValue();
    }

    /* renamed from: g */
    private final TuxTextView m74878g() {
        return (TuxTextView) this.f87503q.getValue();
    }

    /* renamed from: a */
    public final View mo64660a(int i) {
        if (this.f87505t == null) {
            this.f87505t = new SparseArray();
        }
        View view = (View) this.f87505t.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f87505t.put(i, findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final LikeListVM mo64661a() {
        return (LikeListVM) this.f87500n.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36420f
    /* renamed from: b */
    public final void mo63721b(boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36420f
    /* renamed from: c */
    public final void mo63723c(boolean z) {
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.dc$a */
    public static final class C37131a {
        static {
            Covode.recordClassIndex(44485);
        }

        private C37131a() {
        }

        public /* synthetic */ C37131a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C37130dc m74895a(ActivityC0945e eVar, C36500h hVar, Aweme aweme, AbstractC36419e eVar2) {
            C89219l.m154721d(eVar, "");
            C89219l.m154721d(hVar, "");
            C89219l.m154721d(aweme, "");
            C89219l.m154721d(eVar2, "");
            C37130dc dcVar = new C37130dc();
            Bundle bundle = new Bundle();
            bundle.putSerializable("id", hVar);
            dcVar.setArguments(bundle);
            dcVar.f87494c = hVar;
            dcVar.f87495d = eVar2;
            dcVar.f87492a = aweme;
            dcVar.f87493b = LikeListVM.C37250a.m75257a(eVar).mo64801a(aweme);
            return dcVar;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36420f
    /* renamed from: i */
    public final void mo63726i() {
        m74876d(false);
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.dc$b */
    static final class C37132b extends AbstractC89220m implements AbstractC89171a<TuxTextView> {

        /* renamed from: a */
        final /* synthetic */ C37130dc f87506a;

        static {
            Covode.recordClassIndex(44486);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37132b(C37130dc dcVar) {
            super(0);
            this.f87506a = dcVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxTextView invoke() {
            return this.f87506a.mo64660a(R.id.av3);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.dc$e */
    static final class C37135e extends AbstractC89220m implements AbstractC89171a<LikeListVM> {

        /* renamed from: a */
        final /* synthetic */ C37130dc f87515a;

        static {
            Covode.recordClassIndex(44489);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37135e(C37130dc dcVar) {
            super(0);
            this.f87515a = dcVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ LikeListVM invoke() {
            ActivityC0945e requireActivity = this.f87515a.requireActivity();
            C89219l.m154716b(requireActivity, "");
            return LikeListVM.C37250a.m75257a(requireActivity);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.dc$g */
    static final class C37137g extends AbstractC89220m implements AbstractC89171a<TuxStatusView> {

        /* renamed from: a */
        final /* synthetic */ C37130dc f87517a;

        static {
            Covode.recordClassIndex(44491);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37137g(C37130dc dcVar) {
            super(0);
            this.f87517a = dcVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxStatusView invoke() {
            return this.f87517a.mo64660a(R.id.e7i);
        }
    }

    /* renamed from: b */
    private final String m74875b() {
        String aid;
        Aweme aweme = this.f87492a;
        if (aweme == null || (aid = aweme.getAid()) == null) {
            return "";
        }
        return aid;
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36420f
    /* renamed from: c */
    public final RecyclerView mo63722c() {
        return (RecyclerView) mo64660a(R.id.c_1);
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36420f
    /* renamed from: h */
    public final void mo63725h() {
        if (this.f87501o) {
            m74876d(true);
        }
        m74879j();
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f87505t;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: k */
    private final void m74880k() {
        String str;
        String b = m74875b();
        Aweme aweme = this.f87492a;
        C36500h hVar = this.f87494c;
        if (hVar == null || (str = hVar.getEnterFrom()) == null) {
            str = "";
        }
        this.f87497j = new C36215ah(b, aweme, str);
    }

    static {
        Covode.recordClassIndex(44484);
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        f87491s = C89241a.m154730a(TypedValue.applyDimension(1, 64.0f, system.getDisplayMetrics()));
    }

    public C37130dc() {
        C17693c cVar = new C17693c();
        cVar.f42319a = 10;
        cVar.f42320b = false;
        this.f87504r = new C37136f(this, cVar.mo28182a(LikeLoadMoreCell.class));
    }

    /* renamed from: j */
    private final void m74879j() {
        ArrayList arrayList;
        List<User> likeList;
        if (af_()) {
            mo64661a().mo64803a(m74875b());
            LikeListResponse k = mo64661a().mo64814k();
            if (this.f87496e || k != null) {
                AbstractC36419e eVar = this.f87495d;
                if (eVar != null) {
                    eVar.mo63710a(this);
                }
                if (k == null || (likeList = k.getLikeList()) == null) {
                    arrayList = C89086z.INSTANCE;
                } else {
                    ArrayList arrayList2 = new ArrayList(C89070n.m154526a((Iterable) likeList, 10));
                    Iterator<T> it = likeList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(new C36213af(it.next(), this.f87497j, false));
                    }
                    arrayList = arrayList2;
                }
                PowerList powerList = (PowerList) mo64660a(R.id.c_1);
                C89219l.m154716b(powerList, "");
                powerList.getState().mo28138b(arrayList);
                this.f87504r.f42330c.mo28163e();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36420f
    /* renamed from: d */
    public final String mo63724d() {
        long a;
        Context context = getContext();
        if (context == null) {
            context = C17867d.m33078a();
        }
        C89219l.m154716b(context, "");
        String string = context.getResources().getString(R.string.bnm);
        C89219l.m154716b(string, "");
        if (!af_()) {
            a = this.f87493b;
        } else {
            a = mo64661a().mo64801a(this.f87492a);
        }
        String a2 = C53437b.m98615a(a);
        C89219l.m154716b(a2, "");
        return C89361p.m154869a(string, "%d", a2, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36420f
    /* renamed from: a */
    public final void mo63717a(AbstractC36419e eVar) {
        C89219l.m154721d(eVar, "");
        this.f87495d = eVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.comment.ui.dc$c */
    public static final class C37133c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C37130dc f87507a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89124d f87508b;

        /* renamed from: c */
        final /* synthetic */ List f87509c;

        /* renamed from: d */
        final /* synthetic */ C89233z.C89238e f87510d;

        static {
            Covode.recordClassIndex(44487);
        }

        C37133c(C37130dc dcVar, AbstractC89124d dVar, List list, C89233z.C89238e eVar) {
            this.f87507a = dcVar;
            this.f87508b = dVar;
            this.f87509c = list;
            this.f87510d = eVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f87507a.mo64662a((LikeListResponse) obj, null, this.f87508b, this.f87509c, this.f87510d.element);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36420f
    /* renamed from: a */
    public final void mo63718a(C36500h hVar) {
        this.f87494c = hVar;
        m74880k();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.comment.ui.dc$d */
    public static final class C37134d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C37130dc f87511a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89124d f87512b;

        /* renamed from: c */
        final /* synthetic */ List f87513c;

        /* renamed from: d */
        final /* synthetic */ C89233z.C89238e f87514d;

        static {
            Covode.recordClassIndex(44488);
        }

        C37134d(C37130dc dcVar, AbstractC89124d dVar, List list, C89233z.C89238e eVar) {
            this.f87511a = dcVar;
            this.f87512b = dVar;
            this.f87513c = list;
            this.f87514d = eVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            LikeListResponse k = this.f87511a.mo64661a().mo64814k();
            if (k != null) {
                this.f87511a.mo64662a(k, null, this.f87512b, this.f87513c, this.f87514d.element);
            } else {
                this.f87511a.mo64662a(null, th, this.f87512b, this.f87513c, this.f87514d.element);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.dc$f */
    public static final class C37136f extends AbstractC17692b<List<? extends User>> {

        /* renamed from: a */
        final /* synthetic */ C37130dc f87516a;

        static {
            Covode.recordClassIndex(44490);
        }

        @Override // com.bytedance.ies.powerlist.page.config.AbstractC17694d
        /* renamed from: a */
        public final void mo23345a(AbstractC89124d<? super AbstractC17700f<List<User>>> dVar) {
            C89219l.m154721d(dVar, "");
            if (this.f87516a.af_()) {
                if (this.f87516a.f87496e) {
                    this.f87516a.f87496e = false;
                    this.f87516a.mo64663a(dVar, C89086z.INSTANCE);
                    return;
                }
                LikeListResponse k = this.f87516a.mo64661a().mo64814k();
                if (k != null) {
                    this.f87516a.mo64662a(k, null, dVar, C89086z.INSTANCE, null);
                } else {
                    C37199i.m75175b("LikeListFragment", "configList onRefresh unknown error");
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37136f(C37130dc dcVar, C17693c cVar) {
            super(cVar);
            this.f87516a = dcVar;
        }

        @Override // com.bytedance.ies.powerlist.page.config.AbstractC17694d
        /* renamed from: b */
        public final /* synthetic */ void mo23347b(AbstractC89124d dVar, Object obj) {
            List<? extends User> list = (List) obj;
            C89219l.m154721d(dVar, "");
            C89219l.m154721d(list, "");
            if (this.f87516a.af_()) {
                this.f87516a.mo64663a(dVar, list);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.dc$h */
    static final class C37138h<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C37130dc f87518a;

        static {
            Covode.recordClassIndex(44492);
        }

        C37138h(C37130dc dcVar) {
            this.f87518a = dcVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            User user = (User) obj;
            PowerList powerList = (PowerList) this.f87518a.mo64660a(R.id.c_1);
            C89219l.m154716b(powerList, "");
            C17656f<AbstractC17641a> state = powerList.getState();
            C89219l.m154716b(user, "");
            state.mo28137b(new C36213af(user, this.f87518a.f87497j, false));
            AbstractC36419e eVar = this.f87518a.f87495d;
            if (eVar != null) {
                eVar.mo63710a(this.f87518a);
            }
        }
    }

    /* renamed from: d */
    private final void m74876d(boolean z) {
        if (af_() && (!C89219l.m154714a(Boolean.valueOf(z), mo64661a().mo64813j().getValue()))) {
            if (z) {
                mo64661a().mo64812i().clear();
            }
            mo64661a().mo64813j().setValue(Boolean.valueOf(z));
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public final void onCreate(Bundle bundle) {
        Serializable serializable;
        int i;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        String str = null;
        if (arguments != null) {
            serializable = arguments.getSerializable("id");
        } else {
            serializable = null;
        }
        if (!(serializable instanceof C36500h)) {
            serializable = null;
        }
        C36500h hVar = (C36500h) serializable;
        this.f87494c = hVar;
        if (hVar != null) {
            str = hVar.getInsertLikeUserIds();
        }
        this.f87498l = str;
        C36500h hVar2 = this.f87494c;
        if (hVar2 != null) {
            i = hVar2.getLikeUserCount();
        } else {
            i = 0;
        }
        this.f87499m = i;
        m74880k();
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36420f
    /* renamed from: a */
    public final void mo63719a(Aweme aweme) {
        String str;
        m74875b();
        if (aweme != null) {
            aweme.getAid();
        }
        String b = m74875b();
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        if (!C89219l.m154714a((Object) b, (Object) str)) {
            this.f87496e = true;
        }
        this.f87492a = aweme;
        m74880k();
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36420f
    /* renamed from: a */
    public final void mo63720a(boolean z) {
        this.f87501o = z;
        m74876d(z);
    }

    /* renamed from: a */
    private final int m74874a(List<String> list, List<? extends User> list2) {
        if (list != null && !list.isEmpty() && list2 != null && !list2.isEmpty()) {
            PowerList powerList = (PowerList) mo64660a(R.id.c_1);
            C89219l.m154716b(powerList, "");
            if (powerList.getHeight() > 0) {
                Iterator<T> it = list2.iterator();
                int i = 0;
                while (it.hasNext()) {
                    if (list.contains(it.next().getUid())) {
                        i++;
                    }
                }
                int min = Math.min(list2.size(), Math.max(list.size(), this.f87499m) - (list.size() - i));
                PowerList powerList2 = (PowerList) mo64660a(R.id.c_1);
                C89219l.m154716b(powerList2, "");
                double height = (double) powerList2.getHeight();
                double d = (double) f87491s;
                Double.isNaN(height);
                Double.isNaN(d);
                if (min < C89241a.m154729a(height / d)) {
                    return min;
                }
            }
        }
        return 0;
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        ((PowerList) mo64660a(R.id.c_1)).mo28083a(LikeCell.class);
        ((PowerList) mo64660a(R.id.c_1)).mo28083a(LikeNoMoreLimitCell.class);
        ((PowerList) mo64660a(R.id.c_1)).mo28082a(this.f87504r);
        mo64661a().mo64810g().observe(this, new C37138h(this));
        if (this.f87501o) {
            m74876d(true);
        }
        m74879j();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0020  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo64663a(p4600h.p4603c.AbstractC89124d<? super com.bytedance.ies.powerlist.page.AbstractC17700f<java.util.List<com.p2082ss.android.ugc.aweme.profile.model.User>>> r9, java.util.List<? extends com.p2082ss.android.ugc.aweme.profile.model.User> r10) {
        /*
        // Method dump skipped, instructions count: 224
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.comment.p2503ui.C37130dc.mo64663a(h.c.d, java.util.List):void");
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.f205085if, viewGroup, false);
    }

    /* renamed from: a */
    public final void mo64662a(LikeListResponse likeListResponse, Throwable th, AbstractC89124d<? super AbstractC17700f<List<User>>> dVar, List<? extends User> list, List<String> list2) {
        boolean z;
        if (af_()) {
            TuxStatusView e = m74877e();
            C89219l.m154716b(e, "");
            e.setVisibility(8);
            Exception exc = null;
            if (likeListResponse != null) {
                AbstractC36419e eVar = this.f87495d;
                if (eVar != null) {
                    eVar.mo63710a(this);
                }
                ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().getUid());
                }
                ArrayList arrayList2 = arrayList;
                List<User> likeList = likeListResponse.getLikeList();
                if (likeList == null) {
                    likeList = C89086z.INSTANCE;
                }
                int a = m74874a(list2, likeList);
                ArrayList arrayList3 = new ArrayList();
                for (T t : likeList) {
                    if (!arrayList2.contains(t.getUid())) {
                        arrayList3.add(t);
                    }
                }
                ArrayList arrayList4 = arrayList3;
                ArrayList arrayList5 = new ArrayList();
                int size = arrayList4.size();
                for (int i = 0; i < size; i++) {
                    User user = (User) arrayList4.get(i);
                    C36215ah ahVar = this.f87497j;
                    if (i >= 0 && a > i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    arrayList5.add(new C36213af(user, ahVar, z));
                }
                if (!likeListResponse.getHasMore() || !(!arrayList5.isEmpty())) {
                    if (!likeListResponse.getHasMore() && likeListResponse.isShowLimit()) {
                        arrayList5.add(new C36214ag());
                    }
                    dVar.resumeWith(C89379q.m157068constructorimpl(AbstractC17700f.C17701a.m32838a(arrayList5)));
                } else {
                    dVar.resumeWith(C89379q.m157068constructorimpl(AbstractC17700f.C17701a.m32841a(null, likeList, arrayList5, 1)));
                }
                if (likeList.isEmpty()) {
                    TuxTextView g = m74878g();
                    C89219l.m154716b(g, "");
                    g.setVisibility(0);
                }
            } else if (list.isEmpty()) {
                TuxTextView g2 = m74878g();
                C89219l.m154716b(g2, "");
                g2.setVisibility(0);
                dVar.resumeWith(C89379q.m157068constructorimpl(AbstractC17700f.C17701a.m32841a(null, C89086z.INSTANCE, C89086z.INSTANCE, 1)));
            } else {
                if (th instanceof Exception) {
                    exc = th;
                }
                Exception exc2 = exc;
                if (exc2 == null) {
                    exc2 = new IllegalStateException("unknown error");
                }
                dVar.resumeWith(C89379q.m157068constructorimpl(AbstractC17700f.C17701a.m32839a(exc2)));
            }
        }
    }
}
