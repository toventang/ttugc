package com.p2082ss.android.ugc.aweme.qna.fragment;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.DoubleColorBallAnimationView;
import com.bytedance.ies.foundation.fragment.C17372a;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.p1710c.C23005c;
import com.bytedance.tux.sheet.p1724a.C23208a;
import com.bytedance.tux.status.TuxStatusView;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.qna.p3645c.AbstractC66019b;
import com.p2082ss.android.ugc.aweme.qna.p3647e.C66061b;
import com.p2082ss.android.ugc.aweme.qna.p3649g.C66279c;
import com.p2082ss.android.ugc.aweme.qna.p3649g.C66285d;
import com.p2082ss.android.ugc.aweme.qna.p3650ui.C66318g;
import com.p2082ss.android.ugc.aweme.qna.p3650ui.C66320i;
import com.p2082ss.android.ugc.aweme.qna.p3650ui.C66334l;
import com.p2082ss.android.ugc.aweme.qna.p3650ui.QnaRecyclerView;
import com.p2082ss.android.ugc.aweme.qna.p3651vm.C66356b;
import com.p2082ss.android.ugc.aweme.qna.p3651vm.C66357c;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p4600h.C89376n;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.qna.fragment.a */
public abstract class AbstractC66098a extends C17372a {

    /* renamed from: e */
    public boolean f148813e;

    /* renamed from: f */
    public String f148814f;

    /* renamed from: g */
    public String f148815g;

    /* renamed from: h */
    public String f148816h;

    /* renamed from: i */
    private final String f148817i;

    /* renamed from: j */
    private SparseArray f148818j;

    static {
        Covode.recordClassIndex(77606);
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a
    /* renamed from: a */
    public View mo27715a(int i) {
        if (this.f148818j == null) {
            this.f148818j = new SparseArray();
        }
        View view = (View) this.f148818j.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f148818j.put(i, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a
    public void bx_() {
        SparseArray sparseArray = this.f148818j;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a
    /* renamed from: c */
    public abstract int mo64296c();

    /* renamed from: f */
    public void mo105143f() {
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        bx_();
    }

    /* renamed from: d */
    public String mo105141d() {
        return this.f148817i;
    }

    /* renamed from: e */
    public void mo105142e() {
        if (!this.f148813e) {
            this.f148813e = true;
            mo105143f();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.a$a */
    static final class C66099a extends AbstractC89220m implements AbstractC89172b<View, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C66105f f148819a;

        /* renamed from: b */
        final /* synthetic */ AbstractC66103d f148820b;

        /* renamed from: c */
        final /* synthetic */ C66356b f148821c;

        static {
            Covode.recordClassIndex(77607);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66099a(C66105f fVar, AbstractC66103d dVar, C66356b bVar) {
            super(1);
            this.f148819a = fVar;
            this.f148820b = dVar;
            this.f148821c = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(View view) {
            C89219l.m154721d(view, "");
            this.f148820b.mo105144a(new C66104e(this.f148821c, this.f148819a.f148831c));
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f148814f = arguments.getString("author_id");
            this.f148815g = arguments.getString("enter_from");
            this.f148816h = arguments.getString("enter_method");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.a$b */
    public static final class C66100b extends RecyclerView.AbstractC1371n {

        /* renamed from: a */
        final /* synthetic */ QnaRecyclerView f148822a;

        /* renamed from: b */
        final /* synthetic */ C66334l f148823b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89171a f148824c;

        static {
            Covode.recordClassIndex(77608);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4753a(RecyclerView recyclerView, int i) {
            C89219l.m154721d(recyclerView, "");
            super.mo4753a(recyclerView, i);
            RecyclerView.AbstractC1362i layoutManager = this.f148822a.getLayoutManager();
            Objects.requireNonNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            int m = ((LinearLayoutManager) layoutManager).mo4373m();
            int itemCount = this.f148823b.getItemCount();
            if (m >= itemCount - 1 && i == 0 && this.f148822a.getPrevDragDir() == QnaRecyclerView.EnumC66300a.UP) {
                RecyclerView.ViewHolder f = this.f148822a.mo4451f(itemCount - 2);
                if (!(f instanceof C66320i)) {
                    f = null;
                }
                C66318g gVar = (C66318g) f;
                if (gVar != null) {
                    View findViewById = gVar.f149126c.findViewById(R.id.ap9);
                    C89219l.m154716b(findViewById, "");
                    ((DoubleColorBallAnimationView) findViewById).setVisibility(0);
                }
                this.f148824c.invoke();
            }
        }

        C66100b(QnaRecyclerView qnaRecyclerView, C66334l lVar, AbstractC89171a aVar) {
            this.f148822a = qnaRecyclerView;
            this.f148823b = lVar;
            this.f148824c = aVar;
        }
    }

    /* renamed from: a */
    public final void mo105138a(C66357c cVar, boolean z) {
        C89219l.m154721d(cVar, "");
        String str = cVar.f149227a;
        SmartRouter.buildRoute(getActivity(), "//qna/detail/").withParam("id", str).withParam("enter_method", cVar.f149228b).withParam("enter_from", AbstractC66019b.C66020a.m117830a(z)).open();
    }

    /* renamed from: a */
    public static RecyclerView.AbstractC1371n m117902a(QnaRecyclerView qnaRecyclerView, C66334l lVar, AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(qnaRecyclerView, "");
        C89219l.m154721d(lVar, "");
        C89219l.m154721d(aVar, "");
        return new C66100b(qnaRecyclerView, lVar, aVar);
    }

    /* renamed from: a */
    public final void mo105139a(String str, String str2, boolean z) {
        if (str != null) {
            SmartRoute withParam = SmartRouter.buildRoute(requireActivity(), "aweme://aweme/detail/".concat(String.valueOf(str))).withParam("enter_from", AbstractC66019b.C66020a.m117830a(z)).withParam("show_answer_question_button", 1);
            if (str2 == null) {
                str2 = "";
            }
            withParam.withParam("question_content", str2).open();
        }
    }

    /* renamed from: a */
    public final void mo105140a(List<C66105f> list, AbstractC66103d dVar, C66356b bVar) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(bVar, "");
        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
        for (T t : list) {
            arrayList.add(new C23208a.C23214e().mo37788a(t.f148829a).mo37789b(t.f148830b).mo37787a(new C66099a(t, dVar, bVar)));
        }
        Object[] array = arrayList.toArray(new C23208a.C23214e[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        C23208a.C23214e[] eVarArr = (C23208a.C23214e[]) array;
        new C23208a.C23211b().mo37797a((C23208a.C23214e[]) Arrays.copyOf(eVarArr, eVarArr.length)).mo37800b().show(getFragmentManager(), "BaseQnaTabFragment");
    }

    /* renamed from: a */
    public static void m117904a(String str, String str2, Context context, boolean z) {
        C89219l.m154721d(context, "");
        C39162r.m79460a("enter_personal_detail", new C33744d().mo59983a("enter_from", "qa_personal_profile").f79943a);
        if (!TextUtils.isEmpty(str)) {
            SmartRouter.buildRoute(context, "aweme://user/profile/").withParam("uid", str).withParam("enter_from", AbstractC66019b.C66020a.m117830a(z)).withParam("sec_uid", str2).open();
        }
    }

    /* renamed from: a */
    public final void mo105137a(EnumC66276w wVar, View view, EnumC66275v vVar, boolean z, String str, AbstractC89171a<C89391z> aVar, boolean z2) {
        C66279c.C66280a aVar2;
        String str2;
        String str3;
        String str4;
        String str5;
        C89219l.m154721d(wVar, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(vVar, "");
        C89219l.m154721d(aVar, "");
        int i = C66101b.f148825a[wVar.ordinal()];
        if (i == 1) {
            View findViewById = view.findViewById(vVar.getRvId());
            C89219l.m154716b(findViewById, "");
            ((RecyclerView) findViewById).setVisibility(0);
            View findViewById2 = view.findViewById(R.id.dbt);
            C89219l.m154716b(findViewById2, "");
            ((ConstraintLayout) findViewById2).setVisibility(8);
        } else if (i == 2) {
            TuxStatusView tuxStatusView = (TuxStatusView) view.findViewById(R.id.dc1);
            boolean z3 = this instanceof C66224s;
            C89219l.m154721d(vVar, "");
            if (z) {
                int i2 = C66285d.f149015a[vVar.ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        aVar2 = new C66279c.C66280a(C66279c.m117958a(R.string.f1i), C66279c.m117958a(R.string.f1h));
                    } else if (i2 != 3) {
                        throw new C89376n();
                    } else if (z2) {
                        aVar2 = new C66279c.C66280a(C66279c.m117958a(R.string.f4d), C66279c.m117958a(R.string.f4c));
                    } else {
                        aVar2 = new C66279c.C66280a(C66279c.m117958a(R.string.f1g), C66279c.m117958a(R.string.f1f));
                    }
                } else if (C66061b.m117871a()) {
                    aVar2 = new C66279c.C66280a(C66279c.m117958a(R.string.f4a), C66279c.m117958a(R.string.f4_));
                } else {
                    aVar2 = new C66279c.C66280a(C66279c.m117958a(R.string.f3v), C66279c.m117958a(R.string.f3u));
                }
            } else {
                int i3 = C66285d.f149016b[vVar.ordinal()];
                if (i3 == 1) {
                    aVar2 = new C66279c.C66280a("", "");
                } else if (i3 == 2) {
                    if (str != null) {
                        str3 = C66279c.m117959a(R.string.f3t, str);
                        str2 = C66279c.m117959a(R.string.f3s, str);
                    } else {
                        str2 = "";
                        str3 = str2;
                    }
                    aVar2 = new C66279c.C66280a(str3, str2);
                } else if (i3 == 3) {
                    if (str != null) {
                        str5 = C66279c.m117959a(R.string.f1e, str);
                        str4 = C66279c.m117959a(R.string.f1d, str);
                    } else {
                        str4 = "";
                        str5 = str4;
                    }
                    aVar2 = new C66279c.C66280a(str5, str4);
                } else {
                    throw new C89376n();
                }
            }
            TuxStatusView.C23263c a = new TuxStatusView.C23263c().mo37877a(C23005c.m43393a(new C66279c.C66284d(z3)));
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            int a2 = C89241a.m154730a(TypedValue.applyDimension(1, 72.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            C89219l.m154709a((Object) system2, "");
            tuxStatusView.setStatus(a.mo37880b(a2, C89241a.m154730a(TypedValue.applyDimension(1, 72.0f, system2.getDisplayMetrics()))).mo37879a(aVar2.f149008a).mo37878a((CharSequence) aVar2.f149009b));
            View findViewById3 = view.findViewById(vVar.getRvId());
            C89219l.m154716b(findViewById3, "");
            ((RecyclerView) findViewById3).setVisibility(8);
            View findViewById4 = view.findViewById(R.id.dbt);
            C89219l.m154716b(findViewById4, "");
            ((ConstraintLayout) findViewById4).setVisibility(0);
        } else if (i == 3) {
            TuxStatusView tuxStatusView2 = (TuxStatusView) view.findViewById(R.id.dc1);
            Context requireContext = requireContext();
            C89219l.m154716b(requireContext, "");
            C89219l.m154716b(tuxStatusView2, "");
            C89219l.m154721d(requireContext, "");
            C89219l.m154721d(tuxStatusView2, "");
            C89219l.m154721d(aVar, "");
            TuxStatusView.C23263c a3 = new TuxStatusView.C23263c().mo37877a(C23005c.m43393a(C66279c.C66281b.f149010a));
            Resources system3 = Resources.getSystem();
            C89219l.m154709a((Object) system3, "");
            int a4 = C89241a.m154730a(TypedValue.applyDimension(1, 72.0f, system3.getDisplayMetrics()));
            Resources system4 = Resources.getSystem();
            C89219l.m154709a((Object) system4, "");
            TuxStatusView.C23263c a5 = a3.mo37880b(a4, C89241a.m154730a(TypedValue.applyDimension(1, 72.0f, system4.getDisplayMetrics()))).mo37879a(C66279c.m117958a(R.string.dck)).mo37878a((CharSequence) C66279c.m117958a(R.string.bop));
            a5.f55132j = new C66279c.C66282c(aVar, tuxStatusView2);
            tuxStatusView2.setStatus(a5);
        }
    }
}
