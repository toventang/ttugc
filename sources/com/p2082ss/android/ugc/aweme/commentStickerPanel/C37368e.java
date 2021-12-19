package com.p2082ss.android.ugc.aweme.commentStickerPanel;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1213t;
import com.C1764a;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.jedi.arch.C20531t;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.commentStickerPanel.C37411l;
import com.p2082ss.android.ugc.aweme.commentStickerPanel.CommentAndQuestionAndQuestionStickerPanelViewModel;
import com.p2082ss.android.ugc.aweme.property.C65412cv;
import com.p2082ss.android.ugc.tools.view.widget.DoubleColorBallAnimationView;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.e */
public final class C37368e extends Fragment {

    /* renamed from: h */
    public static final C37369a f88169h = new C37369a((byte) 0);

    /* renamed from: a */
    public CommentAndQuestionAndQuestionStickerPanelViewModel f88170a;

    /* renamed from: b */
    public View f88171b;

    /* renamed from: c */
    C37411l f88172c;

    /* renamed from: d */
    C37411l f88173d;

    /* renamed from: e */
    C37411l f88174e;

    /* renamed from: f */
    C37411l f88175f;

    /* renamed from: g */
    C37411l f88176g;

    /* renamed from: i */
    private String f88177i;

    /* renamed from: j */
    private CommentAndQuestionAndQuestionStickerPanelViewModel.EnumC37331a f88178j = CommentAndQuestionAndQuestionStickerPanelViewModel.EnumC37331a.SuggestTab;

    /* renamed from: k */
    private LinearLayout f88179k;

    /* renamed from: l */
    private View f88180l;

    /* renamed from: m */
    private View f88181m;

    /* renamed from: n */
    private View f88182n;

    /* renamed from: o */
    private C1213t<Boolean> f88183o = new C1213t<>();

    /* renamed from: p */
    private C1213t<Boolean> f88184p = new C1213t<>();

    /* renamed from: q */
    private HashMap f88185q;

    static {
        Covode.recordClassIndex(44748);
    }

    /* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.e$a */
    public static final class C37369a {
        static {
            Covode.recordClassIndex(44749);
        }

        private C37369a() {
        }

        public /* synthetic */ C37369a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.e$d */
    public static final class C37372d extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C37368e f88188a;

        static {
            Covode.recordClassIndex(44752);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37372d(C37368e eVar) {
            super(0);
            this.f88188a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f88188a.mo65003a();
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.e$e */
    public static final class C37373e extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C37368e f88189a;

        static {
            Covode.recordClassIndex(44753);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37373e(C37368e eVar) {
            super(0);
            this.f88189a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f88189a.mo65003a();
            return C89391z.f203057a;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f88185q;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00c5, code lost:
        if (r0.mo65058a() == false) goto L_0x00fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00cf, code lost:
        if (r0.mo65058a() == false) goto L_0x00fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00df, code lost:
        if (r0.mo65058a() == false) goto L_0x00fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00e9, code lost:
        if (r0.mo65058a() == false) goto L_0x00fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00f3, code lost:
        if (r0.mo65058a() == false) goto L_0x00fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00fc, code lost:
        mo65004a("normal");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0101, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo65003a() {
        /*
        // Method dump skipped, instructions count: 258
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.commentStickerPanel.C37368e.mo65003a():void");
    }

    /* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.e$b */
    static final class View$OnClickListenerC37370b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C37368e f88186a;

        static {
            Covode.recordClassIndex(44750);
        }

        View$OnClickListenerC37370b(C37368e eVar) {
            this.f88186a = eVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f88186a.mo65004a("loading");
            CommentAndQuestionAndQuestionStickerPanelViewModel commentAndQuestionAndQuestionStickerPanelViewModel = this.f88186a.f88170a;
            if (commentAndQuestionAndQuestionStickerPanelViewModel == null) {
                C89219l.m154710a("commentAndQuestionStickerPanelViewModel");
            }
            commentAndQuestionAndQuestionStickerPanelViewModel.mo64932a();
            this.f88186a.mo65003a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.e$c */
    static final class C37371c<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C37368e f88187a;

        static {
            Covode.recordClassIndex(44751);
        }

        C37371c(C37368e eVar) {
            this.f88187a = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            Boolean bool = (Boolean) obj;
            View view = this.f88187a.f88171b;
            if (view == null) {
                C89219l.m154710a("shallowView");
            }
            C89219l.m154716b(bool, "");
            if (bool.booleanValue()) {
                i = 8;
            } else {
                i = 0;
            }
            view.setVisibility(i);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        View view = this.f88181m;
        if (view == null) {
            C89219l.m154710a("networkErrorPage");
        }
        ((TuxButton) view.findViewById(R.id.awr)).setOnClickListener(new View$OnClickListenerC37370b(this));
    }

    /* renamed from: a */
    public final void mo65004a(String str) {
        View view;
        switch (str.hashCode()) {
            case -1039745817:
                if (str.equals("normal")) {
                    LinearLayout linearLayout = this.f88179k;
                    if (linearLayout == null) {
                        C89219l.m154710a("normalPage");
                    }
                    linearLayout.setVisibility(0);
                    View view2 = this.f88180l;
                    if (view2 == null) {
                        C89219l.m154710a("emptyStickerPage");
                    }
                    view2.setVisibility(8);
                    View view3 = this.f88181m;
                    if (view3 == null) {
                        C89219l.m154710a("networkErrorPage");
                    }
                    view3.setVisibility(8);
                    View view4 = this.f88182n;
                    if (view4 == null) {
                        C89219l.m154710a("loadingPage");
                    }
                    view4.setVisibility(8);
                    return;
                }
                return;
            case 96634189:
                if (str.equals("empty")) {
                    LinearLayout linearLayout2 = this.f88179k;
                    if (linearLayout2 == null) {
                        C89219l.m154710a("normalPage");
                    }
                    linearLayout2.setVisibility(8);
                    View view5 = this.f88180l;
                    if (view5 == null) {
                        C89219l.m154710a("emptyStickerPage");
                    }
                    view5.setVisibility(0);
                    View view6 = this.f88181m;
                    if (view6 == null) {
                        C89219l.m154710a("networkErrorPage");
                    }
                    view6.setVisibility(8);
                    View view7 = this.f88182n;
                    if (view7 == null) {
                        C89219l.m154710a("loadingPage");
                    }
                    view7.setVisibility(8);
                    View view8 = getView();
                    if (view8 != null) {
                        view = view8.findViewById(R.id.bi7);
                    } else {
                        view = null;
                    }
                    String str2 = this.f88177i;
                    if (str2 == null) {
                        C89219l.m154710a("tabTitle");
                    }
                    CommentAndQuestionAndQuestionStickerPanelViewModel commentAndQuestionAndQuestionStickerPanelViewModel = this.f88170a;
                    if (commentAndQuestionAndQuestionStickerPanelViewModel == null) {
                        C89219l.m154710a("commentAndQuestionStickerPanelViewModel");
                    }
                    if (C89219l.m154714a((Object) str2, (Object) commentAndQuestionAndQuestionStickerPanelViewModel.f88072a.get(0))) {
                        if (view != null) {
                            view.setBackgroundResource(2131232223);
                        }
                        View view9 = this.f88180l;
                        if (view9 == null) {
                            C89219l.m154710a("emptyStickerPage");
                        }
                        View findViewById = view9.findViewById(R.id.a_1);
                        C89219l.m154716b(findViewById, "");
                        ((TuxTextView) findViewById).setText(view9.getContext().getString(R.string.f0o));
                        View findViewById2 = view9.findViewById(R.id.a_0);
                        C89219l.m154716b(findViewById2, "");
                        ((TuxTextView) findViewById2).setText(view9.getContext().getString(R.string.f0m));
                        return;
                    }
                    String str3 = this.f88177i;
                    if (str3 == null) {
                        C89219l.m154710a("tabTitle");
                    }
                    CommentAndQuestionAndQuestionStickerPanelViewModel commentAndQuestionAndQuestionStickerPanelViewModel2 = this.f88170a;
                    if (commentAndQuestionAndQuestionStickerPanelViewModel2 == null) {
                        C89219l.m154710a("commentAndQuestionStickerPanelViewModel");
                    }
                    if (C89219l.m154714a((Object) str3, (Object) commentAndQuestionAndQuestionStickerPanelViewModel2.f88072a.get(1))) {
                        if (view != null) {
                            view.setBackgroundResource(2131232224);
                        }
                        View view10 = this.f88180l;
                        if (view10 == null) {
                            C89219l.m154710a("emptyStickerPage");
                        }
                        View findViewById3 = view10.findViewById(R.id.a_1);
                        C89219l.m154716b(findViewById3, "");
                        ((TuxTextView) findViewById3).setText(view10.getContext().getString(R.string.f0l));
                        View findViewById4 = view10.findViewById(R.id.a_0);
                        C89219l.m154716b(findViewById4, "");
                        ((TuxTextView) findViewById4).setText(view10.getContext().getString(R.string.f0j));
                        return;
                    }
                    return;
                }
                return;
            case 96784904:
                if (str.equals("error")) {
                    LinearLayout linearLayout3 = this.f88179k;
                    if (linearLayout3 == null) {
                        C89219l.m154710a("normalPage");
                    }
                    linearLayout3.setVisibility(8);
                    View view11 = this.f88180l;
                    if (view11 == null) {
                        C89219l.m154710a("emptyStickerPage");
                    }
                    view11.setVisibility(8);
                    View view12 = this.f88181m;
                    if (view12 == null) {
                        C89219l.m154710a("networkErrorPage");
                    }
                    view12.setVisibility(0);
                    View view13 = this.f88181m;
                    if (view13 == null) {
                        C89219l.m154710a("networkErrorPage");
                    }
                    View findViewById5 = view13.findViewById(R.id.a_7);
                    C89219l.m154716b(findViewById5, "");
                    findViewById5.setVisibility(8);
                    View view14 = this.f88181m;
                    if (view14 == null) {
                        C89219l.m154710a("networkErrorPage");
                    }
                    View findViewById6 = view14.findViewById(R.id.a_2);
                    C89219l.m154716b(findViewById6, "");
                    ((TuxTextView) findViewById6).setText(view14.getContext().getString(R.string.f0i));
                    View view15 = this.f88182n;
                    if (view15 == null) {
                        C89219l.m154710a("loadingPage");
                    }
                    view15.setVisibility(8);
                    return;
                }
                return;
            case 336650556:
                if (str.equals("loading")) {
                    LinearLayout linearLayout4 = this.f88179k;
                    if (linearLayout4 == null) {
                        C89219l.m154710a("normalPage");
                    }
                    linearLayout4.setVisibility(8);
                    View view16 = this.f88180l;
                    if (view16 == null) {
                        C89219l.m154710a("emptyStickerPage");
                    }
                    view16.setVisibility(8);
                    View view17 = this.f88181m;
                    if (view17 == null) {
                        C89219l.m154710a("networkErrorPage");
                    }
                    view17.setVisibility(8);
                    View view18 = this.f88182n;
                    if (view18 == null) {
                        C89219l.m154710a("loadingPage");
                    }
                    view18.setVisibility(0);
                    View view19 = this.f88182n;
                    if (view19 == null) {
                        C89219l.m154710a("loadingPage");
                    }
                    View findViewById7 = view19.findViewById(R.id.cg3);
                    C89219l.m154716b(findViewById7, "");
                    ((DoubleColorBallAnimationView) findViewById7).setVisibility(0);
                    return;
                }
                return;
            case 1729423394:
                if (str.equals("noInternet")) {
                    LinearLayout linearLayout5 = this.f88179k;
                    if (linearLayout5 == null) {
                        C89219l.m154710a("normalPage");
                    }
                    linearLayout5.setVisibility(8);
                    View view20 = this.f88180l;
                    if (view20 == null) {
                        C89219l.m154710a("emptyStickerPage");
                    }
                    view20.setVisibility(8);
                    View view21 = this.f88181m;
                    if (view21 == null) {
                        C89219l.m154710a("networkErrorPage");
                    }
                    view21.setVisibility(0);
                    View view22 = this.f88181m;
                    if (view22 == null) {
                        C89219l.m154710a("networkErrorPage");
                    }
                    View findViewById8 = view22.findViewById(R.id.a_3);
                    C89219l.m154716b(findViewById8, "");
                    ((TuxTextView) findViewById8).setText(view22.getContext().getString(R.string.ciz));
                    View findViewById9 = view22.findViewById(R.id.a_2);
                    C89219l.m154716b(findViewById9, "");
                    ((TuxTextView) findViewById9).setText(view22.getContext().getString(R.string.ciy));
                    View view23 = this.f88182n;
                    if (view23 == null) {
                        C89219l.m154710a("loadingPage");
                    }
                    view23.setVisibility(8);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        mo65003a();
        this.f88184p.observe(this, new C37371c(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        MethodCollector.m26663i(7504);
        C89219l.m154721d(layoutInflater, "");
        ActivityC0945e activity = getActivity();
        if (activity != null) {
            JediViewModel a = C20531t.m38716a(activity).mo33800a(CommentAndQuestionAndQuestionStickerPanelViewModel.class);
            C89219l.m154716b(a, "");
            this.f88170a = (CommentAndQuestionAndQuestionStickerPanelViewModel) a;
            View a2 = C1764a.m5927a(layoutInflater, R.layout.nm, viewGroup, false);
            View findViewById = a2.findViewById(R.id.ctj);
            if (findViewById != null) {
                this.f88179k = (LinearLayout) findViewById;
                View findViewById2 = a2.findViewById(R.id.cta);
                C89219l.m154716b(findViewById2, "");
                this.f88180l = findViewById2;
                View findViewById3 = a2.findViewById(R.id.crh);
                C89219l.m154716b(findViewById3, "");
                this.f88181m = findViewById3;
                View findViewById4 = a2.findViewById(R.id.cfs);
                C89219l.m154716b(findViewById4, "");
                this.f88182n = findViewById4;
                View findViewById5 = a2.findViewById(R.id.a_k);
                C89219l.m154716b(findViewById5, "");
                this.f88171b = findViewById5;
                Bundle arguments = getArguments();
                if (arguments != null) {
                    String string = arguments.getString("tabTitle", "");
                    C89219l.m154716b(string, "");
                    this.f88177i = string;
                }
                String str = this.f88177i;
                if (str == null) {
                    C89219l.m154710a("tabTitle");
                }
                CommentAndQuestionAndQuestionStickerPanelViewModel commentAndQuestionAndQuestionStickerPanelViewModel = this.f88170a;
                if (commentAndQuestionAndQuestionStickerPanelViewModel == null) {
                    C89219l.m154710a("commentAndQuestionStickerPanelViewModel");
                }
                if (C89219l.m154714a((Object) str, (Object) commentAndQuestionAndQuestionStickerPanelViewModel.f88072a.get(0))) {
                    this.f88178j = CommentAndQuestionAndQuestionStickerPanelViewModel.EnumC37331a.SuggestTab;
                    Context context = getContext();
                    if (context != null) {
                        if (C65412cv.m117128b()) {
                            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                            C89219l.m154716b(context, "");
                            this.f88172c = new C37411l(context, C37411l.EnumC37412a.InvitationQuestion, (byte) 0);
                            C37411l lVar = this.f88175f;
                            if (lVar != null) {
                                lVar.setLayoutParams(layoutParams);
                            }
                            LinearLayout linearLayout = this.f88179k;
                            if (linearLayout == null) {
                                C89219l.m154710a("normalPage");
                            }
                            linearLayout.addView(this.f88172c);
                        }
                        if (C65412cv.m117129c()) {
                            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                            C89219l.m154716b(context, "");
                            C37411l lVar2 = new C37411l(context, C37411l.EnumC37412a.RecommendQuestion, (byte) 0);
                            this.f88173d = lVar2;
                            lVar2.setLayoutParams(layoutParams2);
                            LinearLayout linearLayout2 = this.f88179k;
                            if (linearLayout2 == null) {
                                C89219l.m154710a("normalPage");
                            }
                            linearLayout2.addView(this.f88173d);
                        }
                        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
                        C89219l.m154716b(context, "");
                        C37411l lVar3 = new C37411l(context, C37411l.EnumC37412a.RecommendComment, (byte) 0);
                        this.f88174e = lVar3;
                        lVar3.setLayoutParams(layoutParams3);
                        LinearLayout linearLayout3 = this.f88179k;
                        if (linearLayout3 == null) {
                            C89219l.m154710a("normalPage");
                        }
                        linearLayout3.addView(this.f88174e);
                    }
                } else {
                    this.f88178j = CommentAndQuestionAndQuestionStickerPanelViewModel.EnumC37331a.FavoriteTab;
                    Context context2 = getContext();
                    if (context2 != null) {
                        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
                        if (C65412cv.m117130d()) {
                            C89219l.m154716b(context2, "");
                            C37411l lVar4 = new C37411l(context2, C37411l.EnumC37412a.FavoriteQuestion, (byte) 0);
                            this.f88175f = lVar4;
                            lVar4.setLayoutParams(layoutParams4);
                            LinearLayout linearLayout4 = this.f88179k;
                            if (linearLayout4 == null) {
                                C89219l.m154710a("normalPage");
                            }
                            linearLayout4.addView(this.f88175f);
                        }
                        C89219l.m154716b(context2, "");
                        this.f88176g = new C37411l(context2, C37411l.EnumC37412a.FavoriteComment, (byte) 0);
                        C37411l lVar5 = this.f88174e;
                        if (lVar5 != null) {
                            lVar5.setLayoutParams(layoutParams4);
                        }
                        LinearLayout linearLayout5 = this.f88179k;
                        if (linearLayout5 == null) {
                            C89219l.m154710a("normalPage");
                        }
                        linearLayout5.addView(this.f88176g);
                    }
                }
                MethodCollector.m26664o(7504);
                return a2;
            }
            NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
            MethodCollector.m26664o(7504);
            throw nullPointerException;
        }
        NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        MethodCollector.m26664o(7504);
        throw nullPointerException2;
    }
}
