package com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.analytics.C2592b;
import com.bytedance.analytics.page.AbstractC2597b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.tablayout.DmtTabLayout;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32594j;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.C32775b;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.C32794l;
import com.p2082ss.android.ugc.aweme.account.p2233a.p2235b.C31376a;
import com.p2082ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.s */
public final class C32725s extends AbstractC32613a {

    /* renamed from: d */
    public static final C32726a f77999d = new C32726a((byte) 0);

    /* renamed from: a */
    public C32794l f78000a;

    /* renamed from: b */
    public int f78001b = -1;

    /* renamed from: c */
    public boolean f78002c = true;

    /* renamed from: e */
    private final AbstractC89244h f78003e = C89250i.m154773a((AbstractC89171a) new C32730e(this));

    /* renamed from: j */
    private final AbstractC89244h f78004j = C89250i.m154773a((AbstractC89171a) new C32727b(this));

    /* renamed from: k */
    private HashMap f78005k;

    static {
        Covode.recordClassIndex(39504);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b
    /* renamed from: a */
    public final void mo57442a(int i, String str) {
        C89219l.m154721d(str, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: c */
    public final View mo57434c(int i) {
        if (this.f78005k == null) {
            this.f78005k = new HashMap();
        }
        View view = (View) this.f78005k.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f78005k.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: d */
    public final int mo57435d() {
        return R.layout.hp;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: h */
    public final void mo57438h() {
        HashMap hashMap = this.f78005k;
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

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.s$a */
    public static final class C32726a {
        static {
            Covode.recordClassIndex(39505);
        }

        private C32726a() {
        }

        public /* synthetic */ C32726a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: q */
    public final boolean mo57458q() {
        KeyboardUtils.m70897c(getView());
        return super.mo57458q();
    }

    /* renamed from: e */
    public final boolean mo58547e() {
        ViewPager viewPager = (ViewPager) mo57434c(R.id.d1c);
        C89219l.m154716b(viewPager, "");
        if (viewPager.getCurrentItem() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: p */
    public final C32775b mo57457p() {
        return new C32775b(getString(R.string.aog), null, false, null, null, false, "phone_sign_up_homepage", false, false, 1790);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.s$b */
    static final class C32727b extends AbstractC89220m implements AbstractC89171a<C32794l.C32795a> {

        /* renamed from: a */
        final /* synthetic */ C32725s f78006a;

        static {
            Covode.recordClassIndex(39506);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32727b(C32725s sVar) {
            super(0);
            this.f78006a = sVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C32794l.C32795a invoke() {
            C32634g gVar = new C32634g();
            gVar.setArguments(new Bundle(this.f78006a.getArguments()));
            Bundle arguments = gVar.getArguments();
            if (arguments == null) {
                C89219l.m154715b();
            }
            arguments.putInt("current_page", EnumC32594j.INPUT_EMAIL_SIGN_UP.getValue());
            Bundle arguments2 = gVar.getArguments();
            if (arguments2 == null) {
                C89219l.m154715b();
            }
            arguments2.remove("next_page");
            String string = this.f78006a.getString(R.string.d6j);
            C89219l.m154716b(string, "");
            return new C32794l.C32795a(gVar, string);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.s$e */
    static final class C32730e extends AbstractC89220m implements AbstractC89171a<C32794l.C32795a> {

        /* renamed from: a */
        final /* synthetic */ C32725s f78009a;

        static {
            Covode.recordClassIndex(39509);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32730e(C32725s sVar) {
            super(0);
            this.f78009a = sVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C32794l.C32795a invoke() {
            C32746u uVar = new C32746u();
            uVar.setArguments(new Bundle(this.f78009a.getArguments()));
            Bundle arguments = uVar.getArguments();
            if (arguments == null) {
                C89219l.m154715b();
            }
            arguments.putInt("current_page", EnumC32594j.INPUT_PHONE_SIGN_UP.getValue());
            Bundle arguments2 = uVar.getArguments();
            if (arguments2 == null) {
                C89219l.m154715b();
            }
            arguments2.remove("next_page");
            String string = this.f78009a.getString(R.string.d8w);
            C89219l.m154716b(string, "");
            return new C32794l.C32795a(uVar, string);
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        int i = this.f78001b;
        if (i == -1) {
            Bundle arguments = getArguments();
            if (arguments == null || arguments.getInt("child_page") != EnumC32594j.INPUT_EMAIL_SIGN_UP.getValue()) {
                i = 0;
            } else {
                i = 1;
            }
        }
        int i2 = this.f78001b;
        if (i2 != i) {
            if (i2 != -1) {
                this.f78002c = false;
            }
            this.f78001b = i;
            ViewPager viewPager = (ViewPager) mo57434c(R.id.d1c);
            C89219l.m154716b(viewPager, "");
            viewPager.setCurrentItem(i);
        }
        C32794l lVar = this.f78000a;
        if (lVar == null) {
            C89219l.m154710a("tabAdapter");
        }
        Fragment a = lVar.mo3649a(this.f78001b);
        if (a instanceof AbstractC2597b) {
            C2592b.m7537a((AbstractC2597b) a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.s$c */
    public static final class C32728c implements ViewPager.AbstractC1579e {

        /* renamed from: a */
        final /* synthetic */ C32725s f78007a;

        static {
            Covode.recordClassIndex(39507);
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageScrolled(int i, float f, int i2) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32728c(C32725s sVar) {
            this.f78007a = sVar;
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageSelected(int i) {
            String str;
            this.f78007a.f78001b = i;
            C32775b bVar = this.f78007a.f77799v;
            if (bVar == null) {
                C89219l.m154715b();
            }
            if (this.f78007a.mo58547e()) {
                str = "phone_sign_up_homepage";
            } else {
                str = "email_sign_up_homepage";
            }
            bVar.f78110i = str;
            C32794l lVar = this.f78007a.f78000a;
            if (lVar == null) {
                C89219l.m154710a("tabAdapter");
            }
            Fragment a = lVar.mo3649a(this.f78007a.f78001b);
            if (a instanceof AbstractC2597b) {
                C2592b.m7537a((AbstractC2597b) a);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageScrollStateChanged(int i) {
            String str;
            if (i != 2) {
                return;
            }
            if (!this.f78007a.f78002c) {
                this.f78007a.f78002c = true;
                return;
            }
            ViewPager viewPager = (ViewPager) this.f78007a.mo57434c(R.id.d1c);
            C89219l.m154716b(viewPager, "");
            if (viewPager.getCurrentItem() != this.f78007a.f78001b) {
                if (this.f78007a.mo58547e()) {
                    str = "register_switch_phone";
                } else {
                    str = "register_switch_email";
                }
                C39162r.m79460a(str, new C31376a().mo57399a("enter_method", this.f78007a.mo58467x()).mo57399a("enter_type", "slide").f75156a);
                ViewPager viewPager2 = (ViewPager) this.f78007a.mo57434c(R.id.d1c);
                C89219l.m154716b(viewPager2, "");
                viewPager2.getCurrentItem();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.s$d */
    static final class C32729d implements DmtTabLayout.AbstractC17288b {

        /* renamed from: a */
        final /* synthetic */ C32725s f78008a;

        static {
            Covode.recordClassIndex(39508);
        }

        C32729d(C32725s sVar) {
            this.f78008a = sVar;
        }

        @Override // com.bytedance.ies.dmt.p1194ui.widget.tablayout.DmtTabLayout.AbstractC17288b
        /* renamed from: a */
        public final void mo27573a(DmtTabLayout.C17294f fVar) {
            String str;
            this.f78008a.f78002c = false;
            C89219l.m154716b(fVar, "");
            if (fVar.f41524e == 0) {
                str = "register_switch_phone";
            } else {
                str = "register_switch_email";
            }
            C39162r.m79460a(str, new C31376a().mo57399a("enter_method", this.f78008a.mo58467x()).mo57399a("enter_type", "click").f75156a);
            ViewPager viewPager = (ViewPager) this.f78008a.mo57434c(R.id.d1c);
            C89219l.m154716b(viewPager, "");
            viewPager.setCurrentItem(fVar.f41524e);
            String.valueOf(fVar.f41522c);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        AbstractC0952i childFragmentManager = getChildFragmentManager();
        C89219l.m154716b(childFragmentManager, "");
        C32794l lVar = new C32794l(childFragmentManager);
        this.f78000a = lVar;
        lVar.mo58593a((C32794l.C32795a) this.f78003e.getValue());
        C32794l lVar2 = this.f78000a;
        if (lVar2 == null) {
            C89219l.m154710a("tabAdapter");
        }
        lVar2.mo58593a((C32794l.C32795a) this.f78004j.getValue());
        ViewPager viewPager = (ViewPager) mo57434c(R.id.d1c);
        C89219l.m154716b(viewPager, "");
        C32794l lVar3 = this.f78000a;
        if (lVar3 == null) {
            C89219l.m154710a("tabAdapter");
        }
        viewPager.setAdapter(lVar3);
        ((DmtTabLayout) mo57434c(R.id.d1d)).setCustomTabViewResId(R.layout.h_);
        ((DmtTabLayout) mo57434c(R.id.d1d)).setupWithViewPager((ViewPager) mo57434c(R.id.d1c));
        ((ViewPager) mo57434c(R.id.d1c)).addOnPageChangeListener(new C32728c(this));
        ((DmtTabLayout) mo57434c(R.id.d1d)).setOnTabClickListener(new C32729d(this));
    }
}
