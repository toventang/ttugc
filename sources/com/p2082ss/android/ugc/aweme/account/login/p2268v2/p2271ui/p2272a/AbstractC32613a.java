package com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.ActivityC0945e;
import com.C1764a;
import com.bytedance.analytics.page.AbstractC2597b;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.titlebar.AbstractC17250a;
import com.bytedance.ies.dmt.p1194ui.titlebar.NormalTitleBar;
import com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.AbstractC32793k;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.AccountKeyBoardHelper;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.C32775b;
import com.p2082ss.android.ugc.aweme.account.p2274n.C32857g;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.a */
public abstract class AbstractC32613a extends AbstractC32572b implements AbstractC2597b, AbstractC32793k {

    /* renamed from: a */
    private AccountKeyBoardHelper f77797a;

    /* renamed from: b */
    private HashMap f77798b;

    /* renamed from: v */
    public C32775b f77799v;

    /* renamed from: w */
    public boolean f77800w;

    static {
        Covode.recordClassIndex(39392);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b
    /* renamed from: c */
    public View mo57434c(int i) {
        if (this.f77798b == null) {
            this.f77798b = new HashMap();
        }
        View view = (View) this.f77798b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f77798b.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: d */
    public abstract int mo57435d();

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.AbstractC32793k
    /* renamed from: f */
    public void mo58496f() {
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b
    /* renamed from: h */
    public void mo57438h() {
        HashMap hashMap = this.f77798b;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: p */
    public abstract C32775b mo57457p();

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b
    /* renamed from: q */
    public boolean mo57458q() {
        return false;
    }

    /* renamed from: r */
    public abstract void mo57459r();

    /* renamed from: s */
    public abstract void mo57460s();

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.AbstractC32793k
    /* renamed from: u */
    public void mo58497u() {
    }

    @Override // com.bytedance.analytics.page.AbstractC2597b
    /* renamed from: c */
    public final Map<String, String> mo7085c() {
        C89219l.m154721d(this, "");
        return null;
    }

    /* renamed from: g */
    private static boolean mo57437g() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: D */
    public void mo58494D() {
        ActivityC0945e activity = getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }

    @Override // com.bytedance.analytics.page.AbstractC2597b
    public final String ag_() {
        return String.valueOf(mo58460Z_().hashCode());
    }

    @Override // com.bytedance.analytics.page.AbstractC2597b
    public final String bv_() {
        return mo58460Z_().toString();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onDestroyView() {
        mo57459r();
        super.onDestroyView();
        mo57438h();
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        AccountKeyBoardHelper accountKeyBoardHelper = this.f77797a;
        if (accountKeyBoardHelper != null) {
            accountKeyBoardHelper.f77753a = null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        AccountKeyBoardHelper accountKeyBoardHelper = this.f77797a;
        if (accountKeyBoardHelper != null) {
            accountKeyBoardHelper.f77753a = this;
        }
    }

    /* renamed from: C */
    public final boolean mo58493C() {
        getContext();
        if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
            C58029j.f132256h = mo57437g();
        }
        if (C58029j.f132256h) {
            return true;
        }
        String string = getString(R.string.dcq);
        C89219l.m154716b(string, "");
        mo57442a(0, string);
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.a$a */
    public static final class C32614a implements AbstractC17251a {

        /* renamed from: a */
        final /* synthetic */ AbstractC32613a f77801a;

        static {
            Covode.recordClassIndex(39393);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32614a(AbstractC32613a aVar) {
            this.f77801a = aVar;
        }

        @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
        /* renamed from: a */
        public final void mo27339a(View view) {
            this.f77801a.mo58494D();
        }

        @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
        /* renamed from: b */
        public final void mo27340b(View view) {
            String str;
            C32775b bVar = this.f77801a.f77799v;
            if (bVar != null) {
                str = bVar.f78110i;
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                C32857g.m67458a(this.f77801a.getActivity(), str, this.f77801a.mo58467x());
                return;
            }
            throw new IllegalStateException("please pass pageName".toString());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.a$b */
    public static final class View$OnClickListenerC32615b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ View f77802a;

        static {
            Covode.recordClassIndex(39394);
        }

        View$OnClickListenerC32615b(View view) {
            this.f77802a = view;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            KeyboardUtils.m70897c(this.f77802a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.a$c */
    public static final class View$OnClickListenerC32616c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC32613a f77803a;

        /* renamed from: b */
        final /* synthetic */ View f77804b;

        /* renamed from: c */
        final /* synthetic */ View.OnClickListener f77805c;

        static {
            Covode.recordClassIndex(39395);
        }

        View$OnClickListenerC32616c(AbstractC32613a aVar, View view, View.OnClickListener onClickListener) {
            this.f77803a = aVar;
            this.f77804b = view;
            this.f77805c = onClickListener;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!C58001a.m104815a(this.f77804b, 1200) && this.f77803a.mo58493C()) {
                if (C17873f.m33102j() == null) {
                    C17873f.m33093a(this.f77803a.getActivity());
                }
                this.f77805c.onClick(view);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b
    /* renamed from: b_ */
    public final void mo57470b_(int i) {
        if (i == 0) {
            if (af_()) {
                mo57459r();
            } else if (this.f77800w) {
                this.f77800w = false;
            }
        } else if (i != 1) {
        } else {
            if (af_()) {
                mo57460s();
            } else {
                this.f77800w = true;
            }
        }
    }

    /* renamed from: a */
    public final void mo58495a(View view, View.OnClickListener onClickListener) {
        C89219l.m154721d(onClickListener, "");
        if (view != null) {
            view.setOnClickListener(new View$OnClickListenerC32616c(this, view, onClickListener));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Integer num;
        C32775b bVar;
        String str;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        C32775b p = mo57457p();
        this.f77799v = p;
        if (p == null) {
            NormalTitleBar normalTitleBar = (NormalTitleBar) mo57434c(R.id.qx);
            C89219l.m154716b(normalTitleBar, "");
            normalTitleBar.setVisibility(8);
            TuxTextView tuxTextView = (TuxTextView) mo57434c(R.id.qt);
            C89219l.m154716b(tuxTextView, "");
            tuxTextView.setVisibility(8);
            TuxTextView tuxTextView2 = (TuxTextView) mo57434c(R.id.qv);
            C89219l.m154716b(tuxTextView2, "");
            tuxTextView2.setVisibility(8);
            TuxTextView tuxTextView3 = (TuxTextView) mo57434c(R.id.qu);
            C89219l.m154716b(tuxTextView3, "");
            tuxTextView3.setVisibility(8);
            ImageView imageView = (ImageView) mo57434c(R.id.qw);
            C89219l.m154716b(imageView, "");
            imageView.setVisibility(8);
        } else {
            if (TextUtils.isEmpty(p.f78102a)) {
                NormalTitleBar normalTitleBar2 = (NormalTitleBar) mo57434c(R.id.qx);
                C89219l.m154716b(normalTitleBar2, "");
                normalTitleBar2.setVisibility(8);
            } else {
                AbstractC17250a aVar = (AbstractC17250a) mo57434c(R.id.qx);
                C32775b bVar2 = this.f77799v;
                if (bVar2 == null) {
                    C89219l.m154715b();
                }
                aVar.setTitle(bVar2.f78102a);
                C32775b bVar3 = this.f77799v;
                if (bVar3 == null) {
                    C89219l.m154715b();
                }
                if (!TextUtils.isEmpty(bVar3.f78103b)) {
                    NormalTitleBar normalTitleBar3 = (NormalTitleBar) mo57434c(R.id.qx);
                    C32775b bVar4 = this.f77799v;
                    if (bVar4 == null) {
                        C89219l.m154715b();
                    }
                    normalTitleBar3.setStartText(bVar4.f78103b);
                    ((NormalTitleBar) mo57434c(R.id.qx)).setStartTextSize((float) getResources().getDimensionPixelSize(R.dimen.d7));
                } else {
                    C32775b bVar5 = this.f77799v;
                    if (bVar5 == null) {
                        C89219l.m154715b();
                    }
                    if (bVar5.f78104c) {
                        ((NormalTitleBar) mo57434c(R.id.qx)).setStartBtnIcon(R.drawable.jp);
                    } else {
                        NormalTitleBar normalTitleBar4 = (NormalTitleBar) mo57434c(R.id.qx);
                        C89219l.m154716b(normalTitleBar4, "");
                        ImageView startBtn = normalTitleBar4.getStartBtn();
                        C89219l.m154716b(startBtn, "");
                        startBtn.setVisibility(8);
                    }
                }
                ((NormalTitleBar) mo57434c(R.id.qx)).setOnTitleBarClickListener(new C32614a(this));
                C32775b bVar6 = this.f77799v;
                if (bVar6 == null) {
                    C89219l.m154715b();
                }
                if (!bVar6.f78111j) {
                    NormalTitleBar normalTitleBar5 = (NormalTitleBar) mo57434c(R.id.qx);
                    C89219l.m154716b(normalTitleBar5, "");
                    ImageView endBtn = normalTitleBar5.getEndBtn();
                    C89219l.m154716b(endBtn, "");
                    endBtn.setVisibility(8);
                }
            }
            C32775b bVar7 = this.f77799v;
            if (bVar7 == null) {
                C89219l.m154715b();
            }
            if (TextUtils.isEmpty(bVar7.f78106e)) {
                TuxTextView tuxTextView4 = (TuxTextView) mo57434c(R.id.qv);
                C89219l.m154716b(tuxTextView4, "");
                tuxTextView4.setVisibility(8);
            } else {
                TuxTextView tuxTextView5 = (TuxTextView) mo57434c(R.id.qv);
                C89219l.m154716b(tuxTextView5, "");
                C32775b bVar8 = this.f77799v;
                if (bVar8 == null) {
                    C89219l.m154715b();
                }
                tuxTextView5.setText(bVar8.f78106e);
            }
            C32775b bVar9 = this.f77799v;
            if (bVar9 == null) {
                C89219l.m154715b();
            }
            if (TextUtils.isEmpty(bVar9.f78105d)) {
                TuxTextView tuxTextView6 = (TuxTextView) mo57434c(R.id.qt);
                C89219l.m154716b(tuxTextView6, "");
                tuxTextView6.setVisibility(8);
            } else {
                TuxTextView tuxTextView7 = (TuxTextView) mo57434c(R.id.qt);
                C89219l.m154716b(tuxTextView7, "");
                C32775b bVar10 = this.f77799v;
                if (bVar10 == null) {
                    C89219l.m154715b();
                }
                tuxTextView7.setText(bVar10.f78105d);
                TuxTextView tuxTextView8 = (TuxTextView) mo57434c(R.id.qt);
                C89219l.m154716b(tuxTextView8, "");
                tuxTextView8.setVisibility(0);
            }
            C32775b bVar11 = this.f77799v;
            if (bVar11 == null) {
                C89219l.m154715b();
            }
            if (TextUtils.isEmpty(bVar11.f78107f)) {
                TuxTextView tuxTextView9 = (TuxTextView) mo57434c(R.id.qu);
                C89219l.m154716b(tuxTextView9, "");
                tuxTextView9.setVisibility(8);
            } else {
                TuxTextView tuxTextView10 = (TuxTextView) mo57434c(R.id.qu);
                C89219l.m154716b(tuxTextView10, "");
                C32775b bVar12 = this.f77799v;
                if (bVar12 == null) {
                    C89219l.m154715b();
                }
                tuxTextView10.setText(bVar12.f78107f);
            }
            C32775b bVar13 = this.f77799v;
            if (!(bVar13 == null || (num = bVar13.f78108g) == null)) {
                ((ImageView) mo57434c(R.id.qw)).setImageResource(num.intValue());
                ImageView imageView2 = (ImageView) mo57434c(R.id.qw);
                C89219l.m154716b(imageView2, "");
                imageView2.setVisibility(0);
            }
            ((AbstractC17250a) mo57434c(R.id.qx)).mo27298a(false);
        }
        NormalTitleBar normalTitleBar6 = (NormalTitleBar) mo57434c(R.id.qx);
        C89219l.m154716b(normalTitleBar6, "");
        if (!(normalTitleBar6.getVisibility() == 8 || (bVar = this.f77799v) == null || !bVar.f78111j)) {
            C32775b bVar14 = this.f77799v;
            if (bVar14 != null) {
                str = bVar14.f78110i;
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                throw new IllegalStateException("please pass pageName".toString());
            }
        }
        C32775b bVar15 = this.f77799v;
        if (bVar15 != null && bVar15.f78109h) {
            LinearLayout linearLayout = (LinearLayout) mo57434c(R.id.cgs);
            C89219l.m154716b(linearLayout, "");
            this.f77797a = new AccountKeyBoardHelper(linearLayout, this);
        }
        C32775b bVar16 = this.f77799v;
        if (bVar16 != null && bVar16.f78112k && !AccountKeyBoardHelper.C32598a.m67091a()) {
            view.setOnClickListener(new View$OnClickListenerC32615b(view));
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.hf, viewGroup, false);
        Objects.requireNonNull(a, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout linearLayout = (LinearLayout) a;
        linearLayout.addView(C1764a.m5927a(layoutInflater, mo57435d(), linearLayout, false));
        return linearLayout;
    }
}
