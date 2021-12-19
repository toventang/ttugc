package com.p2082ss.android.ugc.aweme.discover.p2797ui.Dialog;

import android.animation.ArgbEvaluator;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1717e.C23073a;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.feed.AbstractC48309ae;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.search.theme.C67782c;
import com.p2082ss.android.ugc.aweme.search.theme.dark.ThemeViewModel;
import com.p2082ss.android.ugc.aweme.utils.C80534hh;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.Dialog.d */
public final class C42557d extends AbstractC34586a implements AbstractC48309ae {

    /* renamed from: r */
    public static final String f99258r = "com.ss.android.ugc.aweme.discover.ui.SearchDialogFragment";

    /* renamed from: s */
    public static final C42558a f99259s = new C42558a((byte) 0);

    /* renamed from: a */
    public SearchNestedLayout f99260a;

    /* renamed from: b */
    public ViewGroup f99261b;

    /* renamed from: c */
    public ViewGroup f99262c;

    /* renamed from: d */
    public ViewGroup f99263d;

    /* renamed from: e */
    public TextView f99264e;

    /* renamed from: j */
    public AppCompatTextView f99265j;

    /* renamed from: k */
    public View f99266k;

    /* renamed from: l */
    public TextView f99267l;

    /* renamed from: m */
    public NestedScrollingChildFrameLayout f99268m;

    /* renamed from: n */
    public Fragment f99269n;

    /* renamed from: o */
    public C42559b f99270o;

    /* renamed from: p */
    public boolean f99271p;

    /* renamed from: q */
    public AbstractC89172b<? super Boolean, C89391z> f99272q = new C42563f(this);

    /* renamed from: t */
    private final AbstractC89244h f99273t = C89250i.m154773a((AbstractC89171a) C42560c.f99287a);

    /* renamed from: u */
    private final AbstractC89244h f99274u = C89250i.m154773a((AbstractC89171a) new C42561d(this));

    /* renamed from: v */
    private final AbstractC89244h f99275v = C89250i.m154773a((AbstractC89171a) new C42568k(this));

    /* renamed from: w */
    private SparseArray f99276w;

    /* renamed from: d */
    private final ArgbEvaluator m85052d() {
        return (ArgbEvaluator) this.f99273t.getValue();
    }

    /* renamed from: e */
    private final int m85053e() {
        return ((Number) this.f99274u.getValue()).intValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.Dialog.d$a */
    public static final class C42558a {
        static {
            Covode.recordClassIndex(50653);
        }

        private C42558a() {
        }

        public /* synthetic */ C42558a(byte b) {
            this();
        }

        /* renamed from: a */
        public static void m85061a(ActivityC0945e eVar) {
            C42557d dVar;
            if (eVar != null && !eVar.isFinishing() && (dVar = (C42557d) eVar.getSupportFragmentManager().mo3551a(C42557d.f99258r)) != null) {
                dVar.mo72730b();
            }
        }

        /* renamed from: b */
        public static C42557d m85062b(ActivityC0945e eVar) {
            C89219l.m154721d(eVar, "");
            return (C42557d) eVar.getSupportFragmentManager().mo3551a(C42557d.f99258r);
        }

        /* renamed from: a */
        public static C42557d m85060a(int i, ActivityC0945e eVar, Fragment fragment, C42559b bVar) {
            if (!(eVar == null || fragment == null || eVar.isFinishing())) {
                try {
                    AbstractC0952i supportFragmentManager = eVar.getSupportFragmentManager();
                    C42557d dVar = (C42557d) supportFragmentManager.mo3551a(C42557d.f99258r);
                    if (dVar == null) {
                        C42557d dVar2 = new C42557d();
                        dVar2.f99270o = bVar;
                        dVar2.f99269n = fragment;
                        supportFragmentManager.mo3552a().mo3454a(i, dVar2, C42557d.f99258r).mo3473c();
                        return dVar2;
                    }
                    dVar.f99270o = bVar;
                    dVar.f99269n = fragment;
                    dVar.mo72731c();
                    supportFragmentManager.mo3552a().mo3474c(dVar).mo3467b();
                    dVar.mo72727a();
                    return dVar;
                } catch (Exception e) {
                    C51423a.m95788a("", e);
                }
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.Dialog.d$c */
    static final class C42560c extends AbstractC89220m implements AbstractC89171a<ArgbEvaluator> {

        /* renamed from: a */
        public static final C42560c f99287a = new C42560c();

        static {
            Covode.recordClassIndex(50655);
        }

        C42560c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ArgbEvaluator invoke() {
            return new ArgbEvaluator();
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        m85054g();
    }

    /* renamed from: b */
    public final void mo72730b() {
        SearchNestedLayout searchNestedLayout = this.f99260a;
        if (searchNestedLayout != null) {
            searchNestedLayout.mo72689a(false, true);
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f99276w;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.Dialog.d$d */
    static final class C42561d extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        final /* synthetic */ C42557d f99288a;

        static {
            Covode.recordClassIndex(50656);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42561d(C42557d dVar) {
            super(0);
            this.f99288a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            int i;
            Resources resources;
            ActivityC0945e activity = this.f99288a.getActivity();
            if (activity == null || (resources = activity.getResources()) == null) {
                i = 0;
            } else {
                i = resources.getColor(R.color.bk);
            }
            return Integer.valueOf(i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.Dialog.d$k */
    static final class C42568k extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        final /* synthetic */ C42557d f99295a;

        static {
            Covode.recordClassIndex(50663);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42568k(C42557d dVar) {
            super(0);
            this.f99295a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            int i;
            Resources resources;
            ActivityC0945e activity = this.f99295a.getActivity();
            if (activity == null || (resources = activity.getResources()) == null) {
                i = 0;
            } else {
                i = resources.getColor(R.color.c9);
            }
            return Integer.valueOf(i);
        }
    }

    static {
        Covode.recordClassIndex(50652);
    }

    /* renamed from: g */
    private void m85054g() {
        View view = getView();
        if (view != null) {
            view.setFocusableInTouchMode(true);
        }
        View view2 = getView();
        if (view2 != null) {
            view2.requestFocus();
        }
        View view3 = getView();
        if (view3 != null) {
            view3.setOnKeyListener(new View$OnKeyListenerC42562e(this));
        }
    }

    /* renamed from: a */
    public final void mo72727a() {
        SearchNestedLayout searchNestedLayout = this.f99260a;
        if (searchNestedLayout != null) {
            searchNestedLayout.setMOnShowHeightChangeListener(this);
            SearchNestedLayout searchNestedLayout2 = this.f99260a;
            if (searchNestedLayout2 != null) {
                searchNestedLayout2.setOnDialogListener(new C42567j(this));
            }
            SearchNestedLayout searchNestedLayout3 = this.f99260a;
            if (searchNestedLayout3 != null) {
                searchNestedLayout3.mo72689a(true, true);
            }
        }
        Fragment fragment = this.f99269n;
        if (fragment != null) {
            fragment.onHiddenChanged(false);
        }
    }

    /* renamed from: c */
    public final void mo72731c() {
        String str;
        String str2;
        AppCompatTextView appCompatTextView;
        String str3;
        TextView textView;
        String str4;
        int i;
        Fragment fragment = this.f99269n;
        if (fragment instanceof AbstractC42554a) {
            NestedScrollingChildFrameLayout nestedScrollingChildFrameLayout = this.f99268m;
            if (nestedScrollingChildFrameLayout != null) {
                Objects.requireNonNull(fragment, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.ui.Dialog.GetScrollingView");
                nestedScrollingChildFrameLayout.setGetScrollingView((AbstractC42554a) fragment);
            }
            Objects.requireNonNull(this.f99269n, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.ui.Dialog.GetScrollingView");
            NestedScrollingChildFrameLayout nestedScrollingChildFrameLayout2 = this.f99268m;
            if (nestedScrollingChildFrameLayout2 != null) {
                nestedScrollingChildFrameLayout2.getiDispatchNestedPreFling();
            }
        }
        ViewGroup viewGroup = this.f99261b;
        int i2 = 0;
        String str5 = null;
        if (viewGroup != null) {
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            if (layoutParams != null) {
                C42559b bVar = this.f99270o;
                if (bVar != null) {
                    i = bVar.f99278b;
                } else {
                    i = 0;
                }
                layoutParams.height = i;
            } else {
                layoutParams = null;
            }
            viewGroup.setLayoutParams(layoutParams);
        }
        C42559b bVar2 = this.f99270o;
        if (bVar2 != null) {
            str = bVar2.f99279c;
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str) && (textView = this.f99264e) != null) {
            C42559b bVar3 = this.f99270o;
            if (bVar3 != null) {
                str4 = bVar3.f99279c;
            } else {
                str4 = null;
            }
            textView.setText(str4);
        }
        View$OnClickListenerC42566i iVar = new View$OnClickListenerC42566i(this);
        TextView textView2 = this.f99264e;
        if (textView2 != null) {
            textView2.setOnClickListener(new View$OnClickListenerC42564g(this));
        }
        SearchNestedLayout searchNestedLayout = this.f99260a;
        if (searchNestedLayout != null) {
            searchNestedLayout.setOnCancelListener(iVar);
        }
        C42559b bVar4 = this.f99270o;
        if (bVar4 != null) {
            str2 = bVar4.f99281e;
        } else {
            str2 = null;
        }
        if (!TextUtils.isEmpty(str2) && (appCompatTextView = this.f99265j) != null) {
            C42559b bVar5 = this.f99270o;
            if (bVar5 != null) {
                str3 = bVar5.f99281e;
            } else {
                str3 = null;
            }
            appCompatTextView.setText(str3);
        }
        AppCompatTextView appCompatTextView2 = this.f99265j;
        if (appCompatTextView2 != null) {
            appCompatTextView2.setOnClickListener(new View$OnClickListenerC42565h(this));
        }
        m85051a(getActivity(), this.f99269n);
        TextView textView3 = this.f99267l;
        if (textView3 != null) {
            C42559b bVar6 = this.f99270o;
            if (bVar6 != null) {
                str5 = bVar6.f99277a;
            }
            textView3.setText(str5);
        }
        ViewGroup viewGroup2 = this.f99263d;
        if (viewGroup2 != null) {
            C42559b bVar7 = this.f99270o;
            if (bVar7 != null && !bVar7.f99286j) {
                i2 = 8;
            }
            viewGroup2.setVisibility(i2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.Dialog.d$b */
    public static final class C42559b {

        /* renamed from: a */
        public String f99277a = "";

        /* renamed from: b */
        public int f99278b;

        /* renamed from: c */
        public String f99279c = "";

        /* renamed from: d */
        public View.OnClickListener f99280d;

        /* renamed from: e */
        public String f99281e = "";

        /* renamed from: f */
        public int f99282f;

        /* renamed from: g */
        public int f99283g;

        /* renamed from: h */
        public boolean f99284h = true;

        /* renamed from: i */
        public View.OnClickListener f99285i;

        /* renamed from: j */
        public boolean f99286j = true;

        static {
            Covode.recordClassIndex(50654);
        }

        /* renamed from: a */
        public final void mo72732a(String str) {
            C89219l.m154721d(str, "");
            this.f99277a = str;
        }

        /* renamed from: b */
        public final void mo72733b(String str) {
            C89219l.m154721d(str, "");
            this.f99279c = str;
        }

        /* renamed from: c */
        public final void mo72734c(String str) {
            C89219l.m154721d(str, "");
            this.f99281e = str;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.Dialog.d$e */
    public static final class View$OnKeyListenerC42562e implements View.OnKeyListener {

        /* renamed from: a */
        final /* synthetic */ C42557d f99289a;

        static {
            Covode.recordClassIndex(50657);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        View$OnKeyListenerC42562e(C42557d dVar) {
            this.f99289a = dVar;
        }

        public final boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (i != 4) {
                return false;
            }
            C42558a.m85061a(this.f99289a.getActivity());
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.Dialog.d$i */
    public static final class View$OnClickListenerC42566i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C42557d f99293a;

        static {
            Covode.recordClassIndex(50661);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        View$OnClickListenerC42566i(C42557d dVar) {
            this.f99293a = dVar;
        }

        public final void onClick(View view) {
            C42559b bVar;
            View.OnClickListener onClickListener;
            ClickAgent.onClick(view);
            Fragment fragment = this.f99293a.f99269n;
            if (fragment != null) {
                fragment.onHiddenChanged(true);
            }
            if (!(this.f99293a.f99271p || (bVar = this.f99293a.f99270o) == null || (onClickListener = bVar.f99280d) == null)) {
                onClickListener.onClick(view);
            }
            this.f99293a.f99271p = false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.Dialog.d$j */
    public static final class C42567j implements AbstractC42556c {

        /* renamed from: a */
        final /* synthetic */ C42557d f99294a;

        static {
            Covode.recordClassIndex(50662);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C42567j(C42557d dVar) {
            this.f99294a = dVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.Dialog.AbstractC42556c
        /* renamed from: a */
        public final void mo72726a(boolean z) {
            AbstractC0952i iVar;
            if (!z) {
                ActivityC0945e activity = this.f99294a.getActivity();
                Fragment fragment = null;
                if (activity != null) {
                    iVar = activity.getSupportFragmentManager();
                    if (iVar != null) {
                        fragment = iVar.mo3551a(C42557d.f99258r);
                    }
                } else {
                    iVar = null;
                }
                C42557d dVar = (C42557d) fragment;
                if (dVar != null && iVar != null) {
                    iVar.mo3552a().mo3471b(dVar).mo3473c();
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (!isHidden()) {
            m85054g();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.Dialog.d$f */
    static final class C42563f extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C42557d f99290a;

        static {
            Covode.recordClassIndex(50658);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42563f(C42557d dVar) {
            super(1);
            this.f99290a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            int i;
            boolean booleanValue = bool.booleanValue();
            View view = this.f99290a.f99266k;
            if (view != null) {
                if (booleanValue) {
                    i = 8;
                } else {
                    i = 0;
                }
                view.setVisibility(i);
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.discover.ui.Dialog.d$g */
    public static final class View$OnClickListenerC42564g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C42557d f99291a;

        static {
            Covode.recordClassIndex(50659);
        }

        View$OnClickListenerC42564g(C42557d dVar) {
            this.f99291a = dVar;
        }

        public final void onClick(View view) {
            AbstractC0952i supportFragmentManager;
            ClickAgent.onClick(view);
            ActivityC0945e activity = this.f99291a.getActivity();
            if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null && supportFragmentManager.mo3551a(C42557d.f99258r) != null) {
                this.f99291a.mo72730b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.discover.ui.Dialog.d$h */
    public static final class View$OnClickListenerC42565h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C42557d f99292a;

        static {
            Covode.recordClassIndex(50660);
        }

        View$OnClickListenerC42565h(C42557d dVar) {
            this.f99292a = dVar;
        }

        public final void onClick(View view) {
            View.OnClickListener onClickListener;
            ClickAgent.onClick(view);
            C42559b bVar = this.f99292a.f99270o;
            if (!(bVar == null || (onClickListener = bVar.f99285i) == null)) {
                onClickListener.onClick(view);
            }
            this.f99292a.f99271p = true;
            this.f99292a.mo72730b();
        }
    }

    /* renamed from: a */
    public final void mo72729a(boolean z) {
        int i;
        int i2;
        if (getContext() != null) {
            if (z) {
                AppCompatTextView appCompatTextView = this.f99265j;
                if (appCompatTextView != null) {
                    Resources resources = getResources();
                    C42559b bVar = this.f99270o;
                    if (bVar != null) {
                        i2 = bVar.f99282f;
                    } else {
                        i2 = R.color.bh;
                    }
                    appCompatTextView.setTextColor(resources.getColor(i2));
                }
                AppCompatTextView appCompatTextView2 = this.f99265j;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setClickable(true);
                    return;
                }
                return;
            }
            AppCompatTextView appCompatTextView3 = this.f99265j;
            if (appCompatTextView3 != null) {
                Resources resources2 = getResources();
                C42559b bVar2 = this.f99270o;
                if (bVar2 != null) {
                    i = bVar2.f99283g;
                } else {
                    i = R.color.bz;
                }
                appCompatTextView3.setTextColor(resources2.getColor(i));
            }
            AppCompatTextView appCompatTextView4 = this.f99265j;
            if (appCompatTextView4 != null) {
                appCompatTextView4.setClickable(false);
            }
        }
    }

    /* renamed from: a */
    private static void m85051a(ActivityC0945e eVar, Fragment fragment) {
        if (fragment != null && eVar != null && !eVar.isFinishing()) {
            eVar.getSupportFragmentManager().mo3552a().mo3470b(R.id.akp, fragment, "contentFragment").mo3473c();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.AbstractC48309ae
    /* renamed from: a */
    public final void mo72728a(float f, float f2) {
        C67782c value;
        Integer valueOf;
        float f3 = (f * 1.0f) / f2;
        if (f3 >= 0.0f) {
            Object evaluate = m85052d().evaluate(f3, Integer.valueOf(((Number) this.f99275v.getValue()).intValue()), Integer.valueOf(m85053e()));
            Objects.requireNonNull(evaluate, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) evaluate).intValue();
            ActivityC0945e activity = getActivity();
            Integer num = null;
            if (!(activity == null || (value = ((ThemeViewModel) C1181ae.m3881a(activity, (C1175ad.AbstractC1177b) null).mo3983a(ThemeViewModel.class)).mo106885a().getValue()) == null || (valueOf = Integer.valueOf(value.f151911b)) == null)) {
                Object evaluate2 = m85052d().evaluate(f3, valueOf, Integer.valueOf(m85053e()));
                Objects.requireNonNull(evaluate2, "null cannot be cast to non-null type kotlin.Int");
                num = (Integer) evaluate2;
            }
            try {
                ViewGroup viewGroup = this.f99262c;
                if (viewGroup != null) {
                    viewGroup.setBackgroundColor(intValue);
                }
                if (num == null || getActivity() == null) {
                    C80534hh.m139606a(getActivity(), 8421504);
                    return;
                }
                ActivityC0945e activity2 = getActivity();
                if (activity2 == null) {
                    C89219l.m154715b();
                }
                C89219l.m154716b(activity2, "");
                C23073a.C23074a.m43508a(activity2).mo37498b(num.intValue()).f54627a.mo33415d();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        this.f99262c = (FrameLayout) view.findViewById(R.id.acf);
        this.f99260a = (SearchNestedLayout) view.findViewById(R.id.dnh);
        this.f99263d = (RelativeLayout) view.findViewById(R.id.eja);
        this.f99264e = (AppCompatTextView) view.findViewById(R.id.a72);
        this.f99265j = (AppCompatTextView) view.findViewById(R.id.abx);
        this.f99261b = (LinearLayout) view.findViewById(R.id.aki);
        this.f99267l = (TuxTextView) view.findViewById(R.id.aky);
        NestedScrollingChildFrameLayout nestedScrollingChildFrameLayout = (NestedScrollingChildFrameLayout) view.findViewById(R.id.akp);
        this.f99268m = nestedScrollingChildFrameLayout;
        if (nestedScrollingChildFrameLayout != null) {
            nestedScrollingChildFrameLayout.setNestedScrollingParent(this.f99260a);
        }
        mo72731c();
        this.f99266k = view.findViewById(R.id.ff5);
        C42559b bVar = this.f99270o;
        if (bVar != null) {
            z = bVar.f99284h;
        } else {
            z = true;
        }
        mo72729a(z);
        mo72727a();
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.au5, viewGroup, false);
    }
}
