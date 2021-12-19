package com.p2082ss.android.ugc.aweme.account.login.recover;

import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.AbstractC0952i;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.tablayout.DmtTabLayout;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32594j;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.C32775b;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.C32794l;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a;
import com.p2082ss.android.ugc.aweme.account.p2233a.p2235b.C31376a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.recover.b */
public final class C32018b extends AbstractC32613a {

    /* renamed from: c */
    public static final C32019a f76430c = new C32019a((byte) 0);

    /* renamed from: a */
    public int f76431a = -1;

    /* renamed from: b */
    public boolean f76432b = true;

    /* renamed from: d */
    private C32794l f76433d;

    /* renamed from: e */
    private final AbstractC89244h f76434e = C89250i.m154773a((AbstractC89171a) new C32023e(this));

    /* renamed from: j */
    private final AbstractC89244h f76435j = C89250i.m154773a((AbstractC89171a) new C32020b(this));

    /* renamed from: k */
    private HashMap f76436k;

    static {
        Covode.recordClassIndex(38773);
    }

    /* renamed from: g */
    private final C32794l.C32795a m66405g() {
        return (C32794l.C32795a) this.f76435j.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b
    /* renamed from: a */
    public final void mo57442a(int i, String str) {
        C89219l.m154721d(str, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: c */
    public final View mo57434c(int i) {
        if (this.f76436k == null) {
            this.f76436k = new HashMap();
        }
        View view = (View) this.f76436k.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f76436k.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: d */
    public final int mo57435d() {
        return R.layout.gb;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: h */
    public final void mo57438h() {
        HashMap hashMap = this.f76436k;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo57438h();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: r */
    public final void mo57459r() {
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: s */
    public final void mo57460s() {
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.recover.b$a */
    public static final class C32019a {
        static {
            Covode.recordClassIndex(38774);
        }

        private C32019a() {
        }

        public /* synthetic */ C32019a(byte b) {
            this();
        }
    }

    /* renamed from: e */
    public final boolean mo57981e() {
        ViewPager viewPager = (ViewPager) mo57434c(R.id.d1a);
        C89219l.m154716b(viewPager, "");
        if (viewPager.getCurrentItem() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: p */
    public final C32775b mo57457p() {
        return new C32775b(getString(R.string.f8a), null, false, null, null, false, "phone_login_homepage", false, false, 1278);
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        int i = this.f76431a;
        if (i == -1) {
            Bundle arguments = getArguments();
            if (arguments == null || arguments.getInt("child_page") != EnumC32594j.INPUT_EMAIL_LOGIN.getValue()) {
                i = 0;
            } else {
                i = 1;
            }
        }
        int i2 = this.f76431a;
        if (i2 != i) {
            if (i2 != -1) {
                this.f76432b = false;
            }
            this.f76431a = i;
            ViewPager viewPager = (ViewPager) mo57434c(R.id.d1a);
            C89219l.m154716b(viewPager, "");
            viewPager.setCurrentItem(i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.recover.b$b */
    static final class C32020b extends AbstractC89220m implements AbstractC89171a<C32794l.C32795a> {

        /* renamed from: a */
        final /* synthetic */ C32018b f76437a;

        static {
            Covode.recordClassIndex(38775);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32020b(C32018b bVar) {
            super(0);
            this.f76437a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C32794l.C32795a invoke() {
            View$OnClickListenerC31993a aVar = new View$OnClickListenerC31993a();
            aVar.setArguments(new Bundle(this.f76437a.getArguments()));
            Bundle arguments = aVar.getArguments();
            if (arguments == null) {
                C89219l.m154715b();
            }
            arguments.putInt("current_page", EnumC32594j.INPUT_EMAIL_LOGIN.getValue());
            Bundle arguments2 = aVar.getArguments();
            if (arguments2 == null) {
                C89219l.m154715b();
            }
            arguments2.remove("next_page");
            String string = this.f76437a.getString(R.string.anx);
            C89219l.m154716b(string, "");
            return new C32794l.C32795a(aVar, string);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.recover.b$e */
    static final class C32023e extends AbstractC89220m implements AbstractC89171a<C32794l.C32795a> {

        /* renamed from: a */
        final /* synthetic */ C32018b f76440a;

        static {
            Covode.recordClassIndex(38778);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32023e(C32018b bVar) {
            super(0);
            this.f76440a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C32794l.C32795a invoke() {
            C32024c cVar = new C32024c();
            cVar.setArguments(new Bundle(this.f76440a.getArguments()));
            Bundle arguments = cVar.getArguments();
            if (arguments == null) {
                C89219l.m154715b();
            }
            arguments.putInt("current_page", EnumC32594j.INPUT_PHONE_LOGIN.getValue());
            Bundle arguments2 = cVar.getArguments();
            if (arguments2 == null) {
                C89219l.m154715b();
            }
            arguments2.remove("next_page");
            String string = this.f76440a.getString(R.string.d8w);
            C89219l.m154716b(string, "");
            return new C32794l.C32795a(cVar, string);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.recover.b$c */
    public static final class C32021c implements ViewPager.AbstractC1579e {

        /* renamed from: a */
        final /* synthetic */ C32018b f76438a;

        static {
            Covode.recordClassIndex(38776);
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageScrolled(int i, float f, int i2) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32021c(C32018b bVar) {
            this.f76438a = bVar;
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageSelected(int i) {
            String str;
            this.f76438a.f76431a = i;
            C32775b bVar = this.f76438a.f77799v;
            if (bVar == null) {
                C89219l.m154715b();
            }
            if (this.f76438a.mo57981e()) {
                str = "phone_login_homepage";
            } else {
                str = "email_login_homepage";
            }
            bVar.f78110i = str;
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageScrollStateChanged(int i) {
            String str;
            if (i != 2) {
                return;
            }
            if (!this.f76438a.f76432b) {
                this.f76438a.f76432b = true;
                return;
            }
            ViewPager viewPager = (ViewPager) this.f76438a.mo57434c(R.id.d1a);
            C89219l.m154716b(viewPager, "");
            if (viewPager.getCurrentItem() != this.f76438a.f76431a) {
                if (this.f76438a.mo57981e()) {
                    str = "switch_to_phone";
                } else {
                    str = "switch_to_email";
                }
                C39162r.m79460a(str, new C31376a().mo57399a("enter_method", this.f76438a.mo58467x()).mo57399a("enter_type", "slide").f75156a);
                ViewPager viewPager2 = (ViewPager) this.f76438a.mo57434c(R.id.d1a);
                C89219l.m154716b(viewPager2, "");
                viewPager2.getCurrentItem();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.recover.b$d */
    static final class C32022d implements DmtTabLayout.AbstractC17288b {

        /* renamed from: a */
        final /* synthetic */ C32018b f76439a;

        static {
            Covode.recordClassIndex(38777);
        }

        C32022d(C32018b bVar) {
            this.f76439a = bVar;
        }

        @Override // com.bytedance.ies.dmt.p1194ui.widget.tablayout.DmtTabLayout.AbstractC17288b
        /* renamed from: a */
        public final void mo27573a(DmtTabLayout.C17294f fVar) {
            String str;
            this.f76439a.f76432b = false;
            C89219l.m154716b(fVar, "");
            if (fVar.f41524e == 0) {
                str = "switch_to_phone";
            } else {
                str = "switch_to_email";
            }
            C39162r.m79460a(str, new C31376a().mo57399a("enter_method", this.f76439a.mo58467x()).mo57399a("enter_type", "click").f75156a);
            ViewPager viewPager = (ViewPager) this.f76439a.mo57434c(R.id.d1a);
            C89219l.m154716b(viewPager, "");
            viewPager.setCurrentItem(fVar.f41524e);
            String.valueOf(fVar.f41522c);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        float f;
        DmtTabLayout.C17296h hVar;
        TextView textView;
        TextPaint paint;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        AbstractC0952i childFragmentManager = getChildFragmentManager();
        C89219l.m154716b(childFragmentManager, "");
        C32794l lVar = new C32794l(childFragmentManager);
        this.f76433d = lVar;
        lVar.mo58593a((C32794l.C32795a) this.f76434e.getValue());
        C32794l lVar2 = this.f76433d;
        if (lVar2 == null) {
            C89219l.m154710a("tabAdapter");
        }
        lVar2.mo58593a(m66405g());
        ViewPager viewPager = (ViewPager) mo57434c(R.id.d1a);
        C89219l.m154716b(viewPager, "");
        C32794l lVar3 = this.f76433d;
        if (lVar3 == null) {
            C89219l.m154710a("tabAdapter");
        }
        viewPager.setAdapter(lVar3);
        ((DmtTabLayout) mo57434c(R.id.d1b)).setCustomTabViewResId(R.layout.h_);
        ((DmtTabLayout) mo57434c(R.id.d1b)).setupWithViewPager((ViewPager) mo57434c(R.id.d1a));
        ((ViewPager) mo57434c(R.id.d1a)).addOnPageChangeListener(new C32021c(this));
        ((DmtTabLayout) mo57434c(R.id.d1b)).setOnTabClickListener(new C32022d(this));
        ViewPager viewPager2 = (ViewPager) mo57434c(R.id.d1a);
        C89219l.m154716b(viewPager2, "");
        viewPager2.setCurrentItem(1);
        DmtTabLayout.C17294f b = ((DmtTabLayout) mo57434c(R.id.d1b)).mo27529b(1);
        if (b == null || (hVar = b.f41528i) == null || (textView = hVar.getTextView()) == null || (paint = textView.getPaint()) == null) {
            f = 0.0f;
        } else {
            f = paint.measureText(m66405g().f78145b);
        }
        if (f + C13628n.m24520b(getContext(), 24.0f) > ((float) (C13628n.m24504a(getContext()) / 2))) {
            DmtTabLayout dmtTabLayout = (DmtTabLayout) mo57434c(R.id.d1b);
            C89219l.m154716b(dmtTabLayout, "");
            dmtTabLayout.setTabMode(0);
        }
    }
}
