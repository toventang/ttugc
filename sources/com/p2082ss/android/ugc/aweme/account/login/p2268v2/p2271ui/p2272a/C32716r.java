package com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.analytics.C2592b;
import com.bytedance.analytics.page.AbstractC2597b;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.tablayout.DmtTabLayout;
import com.bytedance.sdk.p1625a.p1642e.AbstractC22361c;
import com.bytedance.sdk.p1625a.p1642e.C22359a;
import com.bytedance.sdk.p1625a.p1642e.C22362d;
import com.p2082ss.android.ugc.aweme.account.login.p2263h.C31940a;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.C32582d;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32592i;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32594j;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.C32404v;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.C32407x;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.C32775b;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.C32794l;
import com.p2082ss.android.ugc.aweme.account.login.recover.C32034f;
import com.p2082ss.android.ugc.aweme.account.p2233a.p2235b.C31376a;
import com.p2082ss.android.ugc.aweme.account.p2280ui.LoadingButton;
import com.p2082ss.android.ugc.aweme.account.util.C33038h;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.p2311am.C33493a;
import com.p2082ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.HashMap;
import p4560f.p4561a.p4567d.AbstractC88428a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.r */
public final class C32716r extends AbstractC32613a {

    /* renamed from: d */
    public static final C32717a f77983d = new C32717a((byte) 0);

    /* renamed from: a */
    public C32794l f77984a;

    /* renamed from: b */
    public int f77985b = -1;

    /* renamed from: c */
    public boolean f77986c = true;

    /* renamed from: e */
    private boolean f77987e;

    /* renamed from: j */
    private final AbstractC89244h f77988j = C89250i.m154773a((AbstractC89171a) new C32722f(this));

    /* renamed from: k */
    private final AbstractC89244h f77989k = C89250i.m154773a((AbstractC89171a) new C32719c(this));

    /* renamed from: l */
    private HashMap f77990l;

    static {
        Covode.recordClassIndex(39495);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b
    /* renamed from: a */
    public final void mo57442a(int i, String str) {
        C89219l.m154721d(str, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: c */
    public final View mo57434c(int i) {
        if (this.f77990l == null) {
            this.f77990l = new HashMap();
        }
        View view = (View) this.f77990l.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f77990l.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: d */
    public final int mo57435d() {
        return R.layout.ho;
    }

    /* renamed from: e */
    public final C32794l.C32795a mo58545e() {
        return (C32794l.C32795a) this.f77988j.getValue();
    }

    /* renamed from: g */
    public final C32794l.C32795a mo57437g() {
        return (C32794l.C32795a) this.f77989k.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: h */
    public final void mo57438h() {
        HashMap hashMap = this.f77990l;
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

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.r$a */
    public static final class C32717a {
        static {
            Covode.recordClassIndex(39496);
        }

        private C32717a() {
        }

        public /* synthetic */ C32717a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.r$b */
    public static final class C32718b implements AbstractC88428a {

        /* renamed from: a */
        final /* synthetic */ Fragment f77991a;

        static {
            Covode.recordClassIndex(39497);
        }

        C32718b(Fragment fragment) {
            this.f77991a = fragment;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88428a
        /* renamed from: a */
        public final void mo8579a() {
            LoadingButton loadingButton = (LoadingButton) ((AbstractC32572b) this.f77991a).mo57434c(R.id.d1g);
            if (loadingButton != null) {
                loadingButton.mo58777b(true);
            }
        }
    }

    /* renamed from: i */
    public final boolean mo58546i() {
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
        boolean z;
        String string = getString(R.string.aq4);
        if (mo58458A() != EnumC32592i.RECOVER_ACCOUNT) {
            z = true;
        } else {
            z = false;
        }
        return new C32775b(string, null, false, null, null, false, "phone_login_homepage", z, false, 1278);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.r$c */
    static final class C32719c extends AbstractC89220m implements AbstractC89171a<C32794l.C32795a> {

        /* renamed from: a */
        final /* synthetic */ C32716r f77992a;

        static {
            Covode.recordClassIndex(39498);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32719c(C32716r rVar) {
            super(0);
            this.f77992a = rVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C32794l.C32795a invoke() {
            View$OnClickListenerC32630f fVar = new View$OnClickListenerC32630f();
            fVar.setArguments(new Bundle(this.f77992a.getArguments()));
            Bundle arguments = fVar.getArguments();
            if (arguments == null) {
                C89219l.m154715b();
            }
            arguments.putInt("current_page", EnumC32594j.INPUT_EMAIL_LOGIN.getValue());
            Bundle arguments2 = fVar.getArguments();
            if (arguments2 == null) {
                C89219l.m154715b();
            }
            arguments2.remove("next_page");
            String string = this.f77992a.getString(R.string.anx);
            C89219l.m154716b(string, "");
            return new C32794l.C32795a(fVar, string);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.r$f */
    static final class C32722f extends AbstractC89220m implements AbstractC89171a<C32794l.C32795a> {

        /* renamed from: a */
        final /* synthetic */ C32716r f77995a;

        static {
            Covode.recordClassIndex(39501);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32722f(C32716r rVar) {
            super(0);
            this.f77995a = rVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C32794l.C32795a invoke() {
            C32731t tVar = new C32731t();
            tVar.setArguments(new Bundle(this.f77995a.getArguments()));
            Bundle arguments = tVar.getArguments();
            if (arguments == null) {
                C89219l.m154715b();
            }
            arguments.putInt("current_page", EnumC32594j.INPUT_PHONE_LOGIN.getValue());
            Bundle arguments2 = tVar.getArguments();
            if (arguments2 == null) {
                C89219l.m154715b();
            }
            arguments2.putInt("current_scene", tVar.mo58458A().getValue());
            Bundle arguments3 = tVar.getArguments();
            if (arguments3 == null) {
                C89219l.m154715b();
            }
            arguments3.remove("next_page");
            String string = this.f77995a.getString(R.string.d8w);
            C89219l.m154716b(string, "");
            return new C32794l.C32795a(tVar, string);
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        int i = this.f77985b;
        if (i == -1) {
            Bundle arguments = getArguments();
            if (arguments == null || arguments.getInt("child_page") != EnumC32594j.INPUT_EMAIL_LOGIN.getValue()) {
                i = 0;
            } else {
                i = 1;
            }
        }
        int i2 = this.f77985b;
        if (i2 != i) {
            if (i2 != -1) {
                this.f77986c = false;
            }
            this.f77985b = i;
            ViewPager viewPager = (ViewPager) mo57434c(R.id.d1a);
            C89219l.m154716b(viewPager, "");
            viewPager.setCurrentItem(i);
        }
        C32794l lVar = this.f77984a;
        if (lVar == null) {
            C89219l.m154710a("tabAdapter");
        }
        Fragment a = lVar.mo3649a(this.f77985b);
        if (a instanceof AbstractC2597b) {
            C2592b.m7537a((AbstractC2597b) a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.r$d */
    public static final class C32720d implements ViewPager.AbstractC1579e {

        /* renamed from: a */
        final /* synthetic */ C32716r f77993a;

        static {
            Covode.recordClassIndex(39499);
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageScrolled(int i, float f, int i2) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32720d(C32716r rVar) {
            this.f77993a = rVar;
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageSelected(int i) {
            String str;
            this.f77993a.f77985b = i;
            C32775b bVar = this.f77993a.f77799v;
            if (bVar == null) {
                C89219l.m154715b();
            }
            if (this.f77993a.mo58546i()) {
                str = "phone_login_homepage";
            } else {
                str = "email_login_homepage";
            }
            bVar.f78110i = str;
            C32794l lVar = this.f77993a.f77984a;
            if (lVar == null) {
                C89219l.m154710a("tabAdapter");
            }
            Fragment a = lVar.mo3649a(this.f77993a.f77985b);
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
            if (!this.f77993a.f77986c) {
                this.f77993a.f77986c = true;
                return;
            }
            ViewPager viewPager = (ViewPager) this.f77993a.mo57434c(R.id.d1a);
            C89219l.m154716b(viewPager, "");
            if (viewPager.getCurrentItem() != this.f77993a.f77985b) {
                if (this.f77993a.mo58546i()) {
                    str = "switch_to_phone";
                } else {
                    str = "switch_to_email";
                }
                C39162r.m79460a(str, new C31376a().mo57399a("enter_method", this.f77993a.mo58467x()).mo57399a("enter_type", "slide").f75156a);
                ViewPager viewPager2 = (ViewPager) this.f77993a.mo57434c(R.id.d1a);
                C89219l.m154716b(viewPager2, "");
                viewPager2.getCurrentItem();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.r$h */
    public static final class C32724h implements AbstractC22361c {

        /* renamed from: a */
        final /* synthetic */ C32716r f77998a;

        static {
            Covode.recordClassIndex(39503);
        }

        @Override // com.bytedance.sdk.p1625a.p1642e.AbstractC22361c
        /* renamed from: a */
        public final void mo36721a(int i, int i2) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32724h(C32716r rVar) {
            this.f77998a = rVar;
        }

        @Override // com.bytedance.sdk.p1625a.p1642e.AbstractC22361c
        /* renamed from: a */
        public final void mo36722a(C22359a aVar) {
            if (aVar != null) {
                if (C31940a.m66308a(C31940a.m66307a(aVar.f52836a), C31940a.m66309b(aVar.f52836a))) {
                    this.f77998a.mo58543a(aVar.f52836a, aVar.f52838c, true);
                    C32404v.m66771a("phone");
                    return;
                }
                this.f77998a.mo58544b(aVar.f52836a, aVar.f52838c, true);
                C32404v.m66771a("email");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.r$e */
    static final class C32721e implements DmtTabLayout.AbstractC17288b {

        /* renamed from: a */
        final /* synthetic */ C32716r f77994a;

        static {
            Covode.recordClassIndex(39500);
        }

        C32721e(C32716r rVar) {
            this.f77994a = rVar;
        }

        @Override // com.bytedance.ies.dmt.p1194ui.widget.tablayout.DmtTabLayout.AbstractC17288b
        /* renamed from: a */
        public final void mo27573a(DmtTabLayout.C17294f fVar) {
            String str;
            this.f77994a.f77986c = false;
            C89219l.m154716b(fVar, "");
            if (fVar.f41524e == 0) {
                str = "switch_to_phone";
            } else {
                str = "switch_to_email";
            }
            C39162r.m79460a(str, new C31376a().mo57399a("enter_method", this.f77994a.mo58467x()).mo57399a("enter_type", "click").f75156a);
            ViewPager viewPager = (ViewPager) this.f77994a.mo57434c(R.id.d1a);
            C89219l.m154716b(viewPager, "");
            viewPager.setCurrentItem(fVar.f41524e);
            String.valueOf(fVar.f41522c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.r$g */
    public static final class C32723g implements AbstractC22361c {

        /* renamed from: a */
        final /* synthetic */ C32716r f77996a;

        /* renamed from: b */
        final /* synthetic */ boolean f77997b;

        static {
            Covode.recordClassIndex(39502);
        }

        @Override // com.bytedance.sdk.p1625a.p1642e.AbstractC22361c
        /* renamed from: a */
        public final void mo36722a(C22359a aVar) {
            if (aVar != null) {
                if (C31940a.m66308a(C31940a.m66307a(aVar.f52836a), C31940a.m66309b(aVar.f52836a))) {
                    if (this.f77997b && this.f77996a.mo58465v() == EnumC32594j.INPUT_EMAIL_LOGIN) {
                        return;
                    }
                    if (this.f77996a.mo58458A() != EnumC32592i.RECOVER_ACCOUNT || this.f77996a.mo58465v() != EnumC32594j.INPUT_EMAIL_LOGIN) {
                        this.f77996a.mo58543a(aVar.f52836a, aVar.f52838c, false);
                        C32404v.m66771a("phone");
                    }
                } else if (this.f77997b && this.f77996a.mo58465v() == EnumC32594j.INPUT_PHONE_LOGIN) {
                } else {
                    if (this.f77996a.mo58458A() != EnumC32592i.RECOVER_ACCOUNT || this.f77996a.mo58465v() != EnumC32594j.INPUT_PHONE_LOGIN) {
                        this.f77996a.mo58544b(aVar.f52836a, aVar.f52838c, false);
                        C32404v.m66771a("email");
                    }
                }
            }
        }

        C32723g(C32716r rVar, boolean z) {
            this.f77996a = rVar;
            this.f77997b = z;
        }

        @Override // com.bytedance.sdk.p1625a.p1642e.AbstractC22361c
        /* renamed from: a */
        public final void mo36721a(int i, int i2) {
            Serializable serializable;
            if (i2 == 6 && !this.f77997b) {
                C32716r rVar = this.f77996a;
                Bundle arguments = rVar.getArguments();
                if (arguments != null) {
                    serializable = arguments.getSerializable("recover_account_data");
                } else {
                    serializable = null;
                }
                C32034f.C32036b bVar = (C32034f.C32036b) serializable;
                if (rVar.mo58458A() != EnumC32592i.RECOVER_ACCOUNT || bVar == null || !bVar.getSafe()) {
                    C39162r.onEventV3("gms_login_info_autofill_notify");
                    C22362d.m42100a().mo36725a((Activity) rVar.getActivity(), true, (AbstractC22361c) new C32724h(rVar));
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        float f;
        DmtTabLayout.C17296h hVar;
        TextView customTextView;
        TextPaint paint;
        boolean z;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        AbstractC0952i childFragmentManager = getChildFragmentManager();
        C89219l.m154716b(childFragmentManager, "");
        C32794l lVar = new C32794l(childFragmentManager);
        this.f77984a = lVar;
        lVar.mo58593a(mo58545e());
        C32794l lVar2 = this.f77984a;
        if (lVar2 == null) {
            C89219l.m154710a("tabAdapter");
        }
        lVar2.mo58593a(mo57437g());
        ViewPager viewPager = (ViewPager) mo57434c(R.id.d1a);
        C89219l.m154716b(viewPager, "");
        C32794l lVar3 = this.f77984a;
        if (lVar3 == null) {
            C89219l.m154710a("tabAdapter");
        }
        viewPager.setAdapter(lVar3);
        ((DmtTabLayout) mo57434c(R.id.d1b)).setCustomTabViewResId(R.layout.h_);
        ((DmtTabLayout) mo57434c(R.id.d1b)).setupWithViewPager((ViewPager) mo57434c(R.id.d1a));
        ((ViewPager) mo57434c(R.id.d1a)).addOnPageChangeListener(new C32720d(this));
        ((DmtTabLayout) mo57434c(R.id.d1b)).setOnTabClickListener(new C32721e(this));
        if (!this.f77987e && C33493a.m68599a()) {
            this.f77987e = true;
            Bundle arguments = getArguments();
            if (arguments != null) {
                z = arguments.getBoolean("disable_auto_gms", false);
            } else {
                z = false;
            }
            C22362d.m42100a().mo36725a((Activity) getActivity(), false, (AbstractC22361c) new C32723g(this, z));
        }
        DmtTabLayout.C17294f b = ((DmtTabLayout) mo57434c(R.id.d1b)).mo27529b(1);
        if (b == null || (hVar = b.f41528i) == null || (customTextView = hVar.getCustomTextView()) == null || (paint = customTextView.getPaint()) == null) {
            f = 0.0f;
        } else {
            f = paint.measureText(mo57437g().f78145b);
        }
        if (f + C13628n.m24520b(getContext(), 24.0f) > ((float) (C13628n.m24504a(getContext()) / 2))) {
            DmtTabLayout dmtTabLayout = (DmtTabLayout) mo57434c(R.id.d1b);
            C89219l.m154716b(dmtTabLayout, "");
            dmtTabLayout.setTabMode(0);
        }
    }

    /* renamed from: a */
    public final void mo58543a(String str, String str2, boolean z) {
        String a = C31940a.m66307a(str);
        C89219l.m154716b(a, "");
        if (a.length() != 0) {
            String b = C31940a.m66309b(str);
            C89219l.m154716b(b, "");
            if (b.length() != 0 && !TextUtils.isEmpty(str2)) {
                String a2 = C31940a.m66307a(str);
                C89219l.m154716b(a2, "");
                int parseInt = Integer.parseInt(a2);
                String b2 = C31940a.m66309b(str);
                C89219l.m154716b(b2, "");
                C31940a.C31941a create = C31940a.C31941a.create(parseInt, Long.parseLong(b2));
                C89219l.m154716b(create, "");
                C32582d.m67062a(this, create);
                Fragment fragment = mo58545e().f78144a;
                if (!(fragment instanceof C32731t)) {
                    return;
                }
                if (z) {
                    ((C32731t) fragment).mo58548a(C31940a.m66309b(str), str2, C31940a.m66307a(str), str, true);
                    if (str == null) {
                        C89219l.m154715b();
                    }
                    if (str2 == null) {
                        C89219l.m154715b();
                    }
                    C32407x.m66803a((AbstractC32572b) this, str, str2, "phone", true, (AbstractC89172b) null, 32).mo143235a((AbstractC88428a) new C32718b(fragment)).mo143246c();
                    return;
                }
                ((C32731t) fragment).mo58548a(C31940a.m66309b(str), str2, C31940a.m66307a(str), str, false);
            }
        }
    }

    /* renamed from: b */
    public final void mo58544b(String str, String str2, boolean z) {
        String str3;
        if (mo57434c(R.id.d1a) != null) {
            ViewPager viewPager = (ViewPager) mo57434c(R.id.d1a);
            C89219l.m154716b(viewPager, "");
            boolean z2 = true;
            viewPager.setCurrentItem(1);
            Fragment fragment = mo57437g().f78144a;
            if (fragment instanceof View$OnClickListenerC32630f) {
                View$OnClickListenerC32630f fVar = (View$OnClickListenerC32630f) fragment;
                if (fVar.f77828a != null) {
                    EditText editText = fVar.f77828a;
                    if (editText == null) {
                        C89219l.m154710a("emailInput");
                    }
                    Editable text = editText.getText();
                    C89219l.m154716b(text, "");
                    if (text.length() != 0) {
                        z2 = false;
                    }
                    if (z2 || z) {
                        if (!TextUtils.isEmpty(str)) {
                            if (str == null) {
                                str = "";
                            }
                            fVar.f77832e = str;
                            EditText editText2 = fVar.f77828a;
                            if (editText2 == null) {
                                C89219l.m154710a("emailInput");
                            }
                            editText2.setText(fVar.f77832e);
                        }
                        if (!TextUtils.isEmpty(str2)) {
                            if (str2 == null) {
                                str2 = "";
                            }
                            fVar.f77833j = str2;
                            EditText editText3 = fVar.f77829b;
                            if (editText3 == null) {
                                C89219l.m154710a("passwordInput");
                            }
                            editText3.setText(fVar.f77833j);
                        }
                        if (z) {
                            boolean a = C33038h.m67672a(fVar.f77832e);
                            String str4 = fVar.f77832e;
                            String str5 = fVar.f77833j;
                            if (a) {
                                str3 = "email";
                            } else {
                                str3 = "handle";
                            }
                            C32407x.m66803a((AbstractC32572b) fVar, str4, str5, str3, true, (AbstractC89172b) null, 32).mo143246c();
                            return;
                        }
                        return;
                    }
                    EditText editText4 = fVar.f77828a;
                    if (editText4 == null) {
                        C89219l.m154710a("emailInput");
                    }
                    if (C89219l.m154714a((Object) editText4.getText().toString(), (Object) str) && !TextUtils.isEmpty(str2)) {
                        if (str2 == null) {
                            str2 = "";
                        }
                        fVar.f77833j = str2;
                        EditText editText5 = fVar.f77829b;
                        if (editText5 == null) {
                            C89219l.m154710a("passwordInput");
                        }
                        editText5.setText(fVar.f77833j);
                    }
                }
            }
        }
    }
}
