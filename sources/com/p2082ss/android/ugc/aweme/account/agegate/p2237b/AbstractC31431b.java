package com.p2082ss.android.ugc.aweme.account.agegate.p2237b;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.SystemClock;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.content.C0643b;
import androidx.core.content.p032a.C0637f;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.lifecycle.C1210r;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.ies.dmt.p1194ui.titlebar.NormalTitleBar;
import com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17301b;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17303d;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.p1713b.C23024a;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.bytedance.tux.dialog.p1713b.C23028c;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.sdk.p2174a.C30223b;
import com.p2082ss.android.ugc.aweme.C31291a;
import com.p2082ss.android.ugc.aweme.C36085cj;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31685i;
import com.p2082ss.android.ugc.aweme.account.agegate.model.C31541b;
import com.p2082ss.android.ugc.aweme.account.agegate.p2239d.C31534a;
import com.p2082ss.android.ugc.aweme.account.agegate.p2240e.AbstractC31539a;
import com.p2082ss.android.ugc.aweme.account.agegate.util.AbstractC31549a;
import com.p2082ss.android.ugc.aweme.account.agegate.util.C31563f;
import com.p2082ss.android.ugc.aweme.account.agegate.util.C31566h;
import com.p2082ss.android.ugc.aweme.account.agegate.viewmodel.AgeGateNicknameViewModel;
import com.p2082ss.android.ugc.aweme.account.agegate.viewmodel.AgeGateResultViewModel;
import com.p2082ss.android.ugc.aweme.account.bean.AgeGateResponse;
import com.p2082ss.android.ugc.aweme.account.experiment.C31637a;
import com.p2082ss.android.ugc.aweme.account.experiment.C31646f;
import com.p2082ss.android.ugc.aweme.account.login.p2261f.AbstractC31918a;
import com.p2082ss.android.ugc.aweme.account.login.p2261f.C31925b;
import com.p2082ss.android.ugc.aweme.account.login.p2261f.C31927d;
import com.p2082ss.android.ugc.aweme.account.login.p2261f.EnumC31926c;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32592i;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32594j;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.C32775b;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.C32776c;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.InputResultIndicator;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a;
import com.p2082ss.android.ugc.aweme.account.p2233a.p2235b.C31376a;
import com.p2082ss.android.ugc.aweme.account.p2280ui.InputWithIndicator;
import com.p2082ss.android.ugc.aweme.account.p2280ui.LoadingButton;
import com.p2082ss.android.ugc.aweme.account.util.C33047p;
import com.p2082ss.android.ugc.aweme.account.util.C33048q;
import com.p2082ss.android.ugc.aweme.account.views.AbstractC33066c;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.language.C58071d;
import com.p2082ss.android.ugc.aweme.main.service.ILanguageService;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.utils.C80537hk;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.trill.R;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89376n;
import p4600h.C89391z;
import p4600h.p4601a.C89047am;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.account.agegate.b.b */
public abstract class AbstractC31431b extends AbstractC32613a implements AbstractC31539a {

    /* renamed from: F */
    private static final HashSet<Integer> f75250F = C89047am.m154440c(3008010, 3008008, 3008012, 3008020, 3008026);

    /* renamed from: r */
    public static final HashSet<Integer> f75251r = C89047am.m154440c(3008010, 3008011, 3008009, 3008008, 3008012, 3008020, 3008026);

    /* renamed from: s */
    public static final C31432a f75252s = new C31432a((byte) 0);

    /* renamed from: A */
    private final AbstractC89244h f75253A = C89250i.m154773a((AbstractC89171a) new C31451s(this));

    /* renamed from: B */
    private CharSequence f75254B;

    /* renamed from: C */
    private final AbstractC89244h f75255C = C89250i.m154773a((AbstractC89171a) new C31446o(this));

    /* renamed from: D */
    private final AbstractC89244h f75256D = C89250i.m154773a((AbstractC89171a) new C31447p(this));

    /* renamed from: E */
    private final AbstractC89244h f75257E = C89250i.m154773a((AbstractC89171a) new C31434c(this));

    /* renamed from: G */
    private HashMap f75258G;

    /* renamed from: a */
    private final AbstractC89244h f75259a = C89250i.m154773a((AbstractC89171a) new C31436e(this));

    /* renamed from: b */
    private int f75260b = -3001;

    /* renamed from: c */
    private long f75261c;

    /* renamed from: d */
    private final C31925b f75262d = new C31925b();

    /* renamed from: e */
    private boolean f75263e;

    /* renamed from: j */
    private final AbstractC89244h f75264j = C89250i.m154773a((AbstractC89171a) new C31445n(this));

    /* renamed from: k */
    public int f75265k;

    /* renamed from: l */
    public boolean f75266l;

    /* renamed from: m */
    public boolean f75267m;

    /* renamed from: n */
    public int f75268n;

    /* renamed from: o */
    public int f75269o;

    /* renamed from: p */
    public String f75270p;

    /* renamed from: q */
    final AbstractC89244h f75271q = C89250i.m154773a((AbstractC89171a) new C31438g(this));

    /* renamed from: y */
    private final AbstractC89244h f75272y = C89250i.m154773a((AbstractC89171a) new C31437f(this));

    /* renamed from: z */
    private final AbstractC89244h f75273z = C89250i.m154773a((AbstractC89171a) new C31435d(this));

    /* renamed from: E */
    private final String m65651E() {
        return (String) this.f75273z.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: c */
    public View mo57434c(int i) {
        if (this.f75258G == null) {
            this.f75258G = new HashMap();
        }
        View view = (View) this.f75258G.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f75258G.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: h */
    public void mo57438h() {
        HashMap hashMap = this.f75258G;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final C31534a mo57450i() {
        return (C31534a) this.f75259a.getValue();
    }

    /* renamed from: j */
    public final boolean mo57451j() {
        return ((Boolean) this.f75264j.getValue()).booleanValue();
    }

    /* renamed from: k */
    public final String mo57452k() {
        return (String) this.f75253A.getValue();
    }

    /* renamed from: l */
    public final AgeGateNicknameViewModel mo57453l() {
        return (AgeGateNicknameViewModel) this.f75255C.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.b.b$a */
    public static final class C31432a {
        static {
            Covode.recordClassIndex(38149);
        }

        private C31432a() {
        }

        public /* synthetic */ C31432a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.agegate.p2240e.AbstractC31539a
    /* renamed from: a */
    public final void mo57445a(boolean z, boolean z2) {
        NormalTitleBar normalTitleBar = (NormalTitleBar) mo57434c(R.id.qx);
        C89219l.m154716b(normalTitleBar, "");
        int i = 0;
        normalTitleBar.setVisibility(0);
        NormalTitleBar normalTitleBar2 = (NormalTitleBar) mo57434c(R.id.qx);
        C89219l.m154716b(normalTitleBar2, "");
        ImageView startBtn = normalTitleBar2.getStartBtn();
        C89219l.m154716b(startBtn, "");
        startBtn.setVisibility(z ? 0 : 8);
        NormalTitleBar normalTitleBar3 = (NormalTitleBar) mo57434c(R.id.qx);
        C89219l.m154716b(normalTitleBar3, "");
        ImageView endBtn = normalTitleBar3.getEndBtn();
        C89219l.m154716b(endBtn, "");
        if (!z2) {
            i = 8;
        }
        endBtn.setVisibility(i);
        Context context = getContext();
        if (context != null) {
            ((NormalTitleBar) mo57434c(R.id.qx)).setEndBtnIcon(R.drawable.jj);
            NormalTitleBar normalTitleBar4 = (NormalTitleBar) mo57434c(R.id.qx);
            C89219l.m154716b(normalTitleBar4, "");
            ImageView endBtn2 = normalTitleBar4.getEndBtn();
            C89219l.m154716b(context, "");
            endBtn2.setColorFilter(C0637f.m2349b(context.getResources(), R.color.bx, null), PorterDuff.Mode.SRC_IN);
        }
        ((NormalTitleBar) mo57434c(R.id.qx)).setOnTitleBarClickListener(new C31442k(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.b.b$d */
    static final class C31435d extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC31431b f75277a;

        static {
            Covode.recordClassIndex(38152);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31435d(AbstractC31431b bVar) {
            super(0);
            this.f75277a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            return this.f75277a.getString(R.string.qi);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.b.b$g */
    static final class C31438g extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC31431b f75280a;

        static {
            Covode.recordClassIndex(38155);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31438g(AbstractC31431b bVar) {
            super(0);
            this.f75280a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            if (this.f75280a.mo58460Z_() == EnumC32594j.AGE_GATE_LOGIN) {
                return "login";
            }
            return "sign_up";
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.b.b$o */
    static final class C31446o extends AbstractC89220m implements AbstractC89171a<AgeGateNicknameViewModel> {

        /* renamed from: a */
        final /* synthetic */ AbstractC31431b f75288a;

        static {
            Covode.recordClassIndex(38163);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31446o(AbstractC31431b bVar) {
            super(0);
            this.f75288a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AgeGateNicknameViewModel invoke() {
            return C1181ae.m3879a(this.f75288a, (C1175ad.AbstractC1177b) null).mo3983a(AgeGateNicknameViewModel.class);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.b.b$s */
    static final class C31451s extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC31431b f75293a;

        static {
            Covode.recordClassIndex(38168);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31451s(AbstractC31431b bVar) {
            super(0);
            this.f75293a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            return this.f75293a.getString(R.string.qn);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.agegate.p2240e.AbstractC31539a
    /* renamed from: o */
    public final void mo57456o() {
        this.f75265k = -1;
        C31563f.m65842a(mo57441a(AbstractC31918a.C31924f.f76269a));
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: r */
    public final void mo57459r() {
        ((LoadingButton) mo57434c(R.id.hi)).mo58777b(true);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: s */
    public final void mo57460s() {
        ((LoadingButton) mo57434c(R.id.hi)).mo58776a(true);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.b.b$c */
    static final class C31434c extends AbstractC89220m implements AbstractC89171a<C1210r<AgeGateResponse>> {

        /* renamed from: a */
        final /* synthetic */ AbstractC31431b f75276a;

        static {
            Covode.recordClassIndex(38151);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31434c(AbstractC31431b bVar) {
            super(0);
            this.f75276a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1210r<AgeGateResponse> invoke() {
            Fragment parentFragment = this.f75276a.getParentFragment();
            if (parentFragment != null) {
                return ((AgeGateResultViewModel) C1181ae.m3879a(parentFragment, (C1175ad.AbstractC1177b) null).mo3983a(AgeGateResultViewModel.class)).f75515b;
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.b.b$e */
    static final class C31436e extends AbstractC89220m implements AbstractC89171a<C31534a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC31431b f75278a;

        static {
            Covode.recordClassIndex(38153);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31436e(AbstractC31431b bVar) {
            super(0);
            this.f75278a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C31534a invoke() {
            return new C31534a(this.f75278a.mo58460Z_(), this.f75278a.mo58458A());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.b.b$f */
    static final class C31437f extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC31431b f75279a;

        static {
            Covode.recordClassIndex(38154);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31437f(AbstractC31431b bVar) {
            super(0);
            this.f75279a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            AbstractC31431b bVar = this.f75279a;
            return bVar.getString(R.string.qm, bVar.mo57452k());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.b.b$n */
    static final class C31445n extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ AbstractC31431b f75287a;

        static {
            Covode.recordClassIndex(38162);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31445n(AbstractC31431b bVar) {
            super(0);
            this.f75287a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if (this.f75287a.mo58460Z_() == EnumC32594j.THIRD_PARTY_AGE_GATE || this.f75287a.mo58460Z_() == EnumC32594j.THIRD_PARTY_FTC_AGE_GATE) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.b.b$p */
    static final class C31447p extends AbstractC89220m implements AbstractC89171a<C1210r<String>> {

        /* renamed from: a */
        final /* synthetic */ AbstractC31431b f75289a;

        static {
            Covode.recordClassIndex(38164);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31447p(AbstractC31431b bVar) {
            super(0);
            this.f75289a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1210r<String> invoke() {
            Fragment parentFragment = this.f75289a.getParentFragment();
            if (parentFragment != null) {
                return ((AgeGateResultViewModel) C1181ae.m3879a(parentFragment, (C1175ad.AbstractC1177b) null).mo3983a(AgeGateResultViewModel.class)).f75514a;
            }
            return null;
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C33047p.f78597a = null;
        C31534a i = mo57450i();
        i.ck_();
        i.mo67840h();
        ActivityC0945e activity = getActivity();
        if (activity != null) {
            KeyboardUtils.m70893a(activity, 16);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.agegate.b.b$m */
    public static final class C31444m extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ AbstractC31431b f75286a;

        static {
            Covode.recordClassIndex(38161);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31444m(AbstractC31431b bVar) {
            super(0);
            this.f75286a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            Editable editable;
            boolean z;
            EditText editText;
            InputWithIndicator inputWithIndicator = (InputWithIndicator) this.f75286a.mo57434c(R.id.hl);
            if (inputWithIndicator == null || (editText = inputWithIndicator.getEditText()) == null) {
                editable = null;
            } else {
                editable = editText.getText();
            }
            String valueOf = String.valueOf(editable);
            if (valueOf == null || C89361p.m154870a((CharSequence) valueOf)) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(!z);
        }
    }

    /* renamed from: I */
    private final boolean m65652I() {
        int i;
        Bundle arguments = getArguments();
        if (arguments != null) {
            i = arguments.getInt("age_gate_register_action", 0);
        } else {
            i = 0;
        }
        if (i != 1) {
            User b = C80580in.m139683b();
            C89219l.m154716b(b, "");
            if (b.getAgeGateAction() == 1) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        C39162r.m79460a("age_gate_page", new C31376a().mo57398a("stay_time", this.f75262d.mo57857a()).mo57398a("page_show_cost", this.f75261c).mo57397a("step", mo58460Z_().getValue()).f75156a);
        mo57438h();
    }

    static {
        Covode.recordClassIndex(38148);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.agegate.p2240e.AbstractC31539a
    /* renamed from: m */
    public final void mo57454m() {
        Context context = getContext();
        if (context != null) {
            C89219l.m154716b(context, "");
            int b = C0637f.m2349b(context.getResources(), R.color.bx, null);
            C31452t tVar = new C31452t(b, b, b, this);
            String str = (String) this.f75272y.getValue();
            C89219l.m154716b(str, "");
            String k = mo57452k();
            C89219l.m154716b(k, "");
            ((C23023b) C23028c.m43435a(((C23023b) new C23023b(context).mo37479a(R.string.qo)).mo37413d(m65653a(str, k, tVar)), new C31453u(this)).mo37482a(false)).mo37405a().mo37396b().show();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.agegate.p2240e.AbstractC31539a
    /* renamed from: n */
    public final void mo57455n() {
        String str;
        Context context = getContext();
        if (context != null) {
            C89219l.m154716b(context, "");
            int b = C0637f.m2349b(context.getResources(), R.color.bx, null);
            C31433b bVar = new C31433b(b, b, b, this);
            TuxTextView tuxTextView = (TuxTextView) mo57434c(R.id.qu);
            tuxTextView.setLinksClickable(true);
            tuxTextView.setMovementMethod(LinkMovementMethod.getInstance());
            StringBuilder sb = new StringBuilder();
            C32775b bVar2 = this.f77799v;
            if (bVar2 == null || (str = bVar2.f78107f) == null) {
                str = "";
            }
            String sb2 = sb.append(str).append(" ").append(m65651E()).toString();
            String E = m65651E();
            C89219l.m154716b(E, "");
            tuxTextView.setText(m65653a(sb2, E, bVar));
            Context context2 = tuxTextView.getContext();
            C89219l.m154716b(context2, "");
            tuxTextView.setHighlightColor(C0637f.m2349b(context2.getResources(), R.color.c9, null));
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Bundle arguments = getArguments();
        if (arguments != null) {
            InputWithIndicator inputWithIndicator = (InputWithIndicator) mo57434c(R.id.hl);
            if (inputWithIndicator != null) {
                String string = arguments.getString("key_dob", "");
                C89219l.m154716b(string, "");
                inputWithIndicator.setText(string);
            }
            InputWithIndicator inputWithIndicator2 = (InputWithIndicator) mo57434c(R.id.ho);
            if (inputWithIndicator2 != null) {
                String string2 = arguments.getString("key_nickname", "");
                C89219l.m154716b(string2, "");
                inputWithIndicator2.setText(string2);
            }
        }
        InputWithIndicator inputWithIndicator3 = (InputWithIndicator) mo57434c(R.id.ho);
        if (inputWithIndicator3 != null && inputWithIndicator3.getVisibility() == 0) {
            C32776c.m67375a(((InputWithIndicator) mo57434c(R.id.ho)).getEditText());
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onStop() {
        IBinder windowToken;
        String str;
        Bundle arguments = getArguments();
        if (arguments != null) {
            InputWithIndicator inputWithIndicator = (InputWithIndicator) mo57434c(R.id.ho);
            String str2 = null;
            if (inputWithIndicator != null) {
                str = inputWithIndicator.getText();
            } else {
                str = null;
            }
            arguments.putString("key_nickname", str);
            InputWithIndicator inputWithIndicator2 = (InputWithIndicator) mo57434c(R.id.hl);
            if (inputWithIndicator2 != null) {
                str2 = inputWithIndicator2.getText();
            }
            arguments.putString("key_dob", str2);
        }
        InputWithIndicator inputWithIndicator3 = (InputWithIndicator) mo57434c(R.id.ho);
        if (!(inputWithIndicator3 == null || (windowToken = inputWithIndicator3.getWindowToken()) == null)) {
            mo58462a(windowToken);
        }
        super.onStop();
    }

    /* renamed from: t */
    public final void mo57461t() {
        boolean z;
        Editable editable;
        EditText editText;
        InputWithIndicator inputWithIndicator = (InputWithIndicator) mo57434c(R.id.ho);
        boolean z2 = false;
        if (inputWithIndicator == null || inputWithIndicator.getVisibility() != 0) {
            z = true;
        } else {
            z = !C89219l.m154714a((Object) mo57453l().f75512d.getValue(), (Object) false);
        }
        LoadingButton loadingButton = (LoadingButton) mo57434c(R.id.hi);
        C89219l.m154716b(loadingButton, "");
        InputWithIndicator inputWithIndicator2 = (InputWithIndicator) mo57434c(R.id.hl);
        if (inputWithIndicator2 == null || (editText = inputWithIndicator2.getEditText()) == null) {
            editable = null;
        } else {
            editable = editText.getText();
        }
        if (C80537hk.m139613a(String.valueOf(editable)) && z) {
            z2 = true;
        }
        loadingButton.setEnabled(z2);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.agegate.p2240e.AbstractC31539a
    /* renamed from: e */
    public void mo57436e() {
        EditText editText;
        EditText editText2;
        TuxTextView tuxTextView = (TuxTextView) mo57434c(R.id.qu);
        C89219l.m154716b(tuxTextView, "");
        this.f75254B = tuxTextView.getText();
        TuxTextView tuxTextView2 = (TuxTextView) mo57434c(R.id.qv);
        C89219l.m154716b(tuxTextView2, "");
        tuxTextView2.setText(getString(R.string.fy0));
        TuxTextView tuxTextView3 = (TuxTextView) mo57434c(R.id.qu);
        C89219l.m154716b(tuxTextView3, "");
        tuxTextView3.setText(getString(R.string.fxx));
        InputResultIndicator inputResultIndicator = (InputResultIndicator) mo57434c(R.id.hq);
        if (inputResultIndicator != null) {
            inputResultIndicator.setVisibility(0);
        }
        InputWithIndicator inputWithIndicator = (InputWithIndicator) mo57434c(R.id.ho);
        if (inputWithIndicator != null) {
            inputWithIndicator.setVisibility(0);
            inputWithIndicator.setTextWatcher(new C31439h(this));
        }
        mo57453l().f75512d.observe(this, new C31441j(this));
        InputWithIndicator inputWithIndicator2 = (InputWithIndicator) mo57434c(R.id.ho);
        if (!(inputWithIndicator2 == null || (editText2 = inputWithIndicator2.getEditText()) == null)) {
            editText2.setInputType(524288);
            editText2.setTypeface(Typeface.DEFAULT);
            editText2.setHint(getString(R.string.fxz));
            editText2.setEnabled(true);
            editText2.setFilters(new InputFilter[]{mo57453l().f75511c});
            editText2.setImeOptions(1);
            editText2.setSingleLine(true);
        }
        InputWithIndicator inputWithIndicator3 = (InputWithIndicator) mo57434c(R.id.hl);
        if (inputWithIndicator3 != null && (editText = inputWithIndicator3.getEditText()) != null) {
            editText.setOnFocusChangeListener(new View$OnFocusChangeListenerC31440i(this));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: p */
    public final C32775b mo57457p() {
        String string;
        String string2;
        String string3;
        C32775b bVar = new C32775b(null, null, false, null, null, false, null, false, false, 2047);
        if (this.f75267m) {
            bVar.f78102a = null;
            if (this.f75269o != 1) {
                string3 = getString(R.string.qs);
            } else {
                string3 = getString(R.string.h4e);
            }
            bVar.f78107f = string3;
        } else {
            if (!this.f75266l) {
                bVar.f78102a = getString(R.string.aog);
                string = getString(R.string.d5n);
            } else {
                bVar.f78102a = null;
                if (m65652I()) {
                    string = getString(R.string.d7a);
                } else {
                    string = getString(R.string.a5q);
                }
            }
            bVar.f78107f = string;
        }
        if (!this.f75267m) {
            string2 = getString(R.string.a5r);
        } else if (this.f75268n == 2) {
            string2 = getString(R.string.qh);
        } else {
            string2 = getString(R.string.qt);
        }
        bVar.f78106e = string2;
        bVar.f78108g = 2131231078;
        bVar.f78111j = false;
        return bVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b, com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a
    /* renamed from: q */
    public final boolean mo57458q() {
        if (!this.f75263e && mo58458A() == EnumC32592i.GUEST_MODE && C31646f.f75697a.mo57651b()) {
            this.f75263e = true;
            Context requireContext = requireContext();
            C89219l.m154716b(requireContext, "");
            C23028c.m43435a((C23023b) new C23023b(requireContext).mo37479a(R.string.c9a).mo37483b(R.string.c9_), new C31449r(this)).mo37405a().mo37396b().show();
            C31376a aVar = new C31376a();
            String str = this.f75270p;
            if (str == null) {
                C89219l.m154710a("mPlatform");
            }
            C39162r.m79460a("show_age_gate_persuade_popup", aVar.mo57399a("platform", str).f75156a);
            return true;
        } else if (!mo57450i().f75422a.mo57546e()) {
            return true;
        } else {
            if (this.f75267m) {
                C36085cj.m73549c().mo57395a("", false);
            }
            C31566h.m65848a();
            if (mo57451j()) {
                int i = this.f75265k;
                if (i != -99) {
                    i = 0;
                }
                this.f75265k = i;
                Bundle arguments = getArguments();
                if (arguments != null) {
                    arguments.putInt("result_code", this.f75265k);
                }
            } else {
                C31563f.m65842a(mo57441a(AbstractC31918a.C31919a.f76264a));
            }
            return false;
        }
    }

    /* renamed from: g */
    public void mo57437g() {
        boolean z;
        LoadingButton loadingButton;
        String string;
        EditText editText;
        int i;
        C31534a i2 = mo57450i();
        AbstractC31539a aVar = (AbstractC31539a) i2.f92287i;
        boolean e = i2.f75422a.mo57546e();
        if (i2.f75422a.f75433b == EnumC32594j.EDIT_DOB_AGE_GATE || !C31637a.C31640c.m65950a()) {
            z = false;
        } else {
            z = true;
        }
        aVar.mo57445a(e, z);
        if (i2.f75422a.f75433b != EnumC32594j.EDIT_DOB_AGE_GATE && C16048b.m29633a().mo25412a(true, "age_gate_pop_explaining_why", 0) == C31637a.C31640c.f75682a) {
            ((AbstractC31539a) i2.f92287i).mo57455n();
        }
        C31541b bVar = i2.f75422a;
        if ((bVar.f75433b == EnumC32594j.AGE_GATE_SIGN_UP || bVar.f75433b == EnumC32594j.AGE_GATE_LOGIN) && !C31637a.C31639b.m65949a() && C16048b.m29633a().mo25412a(true, "age_gate_ask_nickname_before_dob", 0) == C31637a.C31638a.f75677a) {
            ((AbstractC31539a) i2.f92287i).mo57436e();
        }
        Context context = getContext();
        if (context != null) {
            ((TuxTextView) mo57434c(R.id.qu)).setTextColor(C0643b.m2378c(context, R.color.c4));
        }
        InputWithIndicator inputWithIndicator = (InputWithIndicator) mo57434c(R.id.hl);
        if (!(inputWithIndicator == null || (editText = inputWithIndicator.getEditText()) == null)) {
            editText.setInputType(1);
            editText.setTypeface(Typeface.DEFAULT);
            if (this.f75267m) {
                i = R.string.qj;
            } else {
                i = R.string.d5m;
            }
            editText.setHint(getString(i));
            editText.setEnabled(true);
        }
        InputWithIndicator inputWithIndicator2 = (InputWithIndicator) mo57434c(R.id.hl);
        if (inputWithIndicator2 != null) {
            inputWithIndicator2.setTextWatcher(new C31443l(this));
        }
        InputWithIndicator inputWithIndicator3 = (InputWithIndicator) mo57434c(R.id.hl);
        if (inputWithIndicator3 != null) {
            inputWithIndicator3.setAutoHideRules(new C31444m(this));
        }
        if (mo58458A() != EnumC32592i.GUEST_MODE || !C31646f.f75697a.mo57650a()) {
            loadingButton = (LoadingButton) mo57434c(R.id.hi);
            if (this.f75267m) {
                string = getString(R.string.as0);
            } else {
                string = getString(R.string.dfd);
            }
        } else {
            loadingButton = (LoadingButton) mo57434c(R.id.hi);
            string = getString(R.string.c9e);
        }
        C89219l.m154716b(string, "");
        loadingButton.setButtonText(string);
        mo57461t();
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.b.b$h */
    public static final class C31439h extends C31685i {

        /* renamed from: a */
        final /* synthetic */ AbstractC31431b f75281a;

        static {
            Covode.recordClassIndex(38156);
        }

        C31439h(AbstractC31431b bVar) {
            this.f75281a = bVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.account.C31685i
        public final void afterTextChanged(Editable editable) {
            super.afterTextChanged(editable);
            AgeGateNicknameViewModel l = this.f75281a.mo57453l();
            if (l != null) {
                l.mo57574a(String.valueOf(editable));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.b.b$k */
    public static final class C31442k implements AbstractC17251a {

        /* renamed from: a */
        final /* synthetic */ AbstractC31431b f75284a;

        static {
            Covode.recordClassIndex(38159);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31442k(AbstractC31431b bVar) {
            this.f75284a = bVar;
        }

        @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
        /* renamed from: a */
        public final void mo27339a(View view) {
            this.f75284a.mo58494D();
        }

        @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
        /* renamed from: b */
        public final void mo27340b(View view) {
            C31534a i = this.f75284a.mo57450i();
            if (C31637a.C31640c.m65950a()) {
                ((AbstractC31539a) i.f92287i).mo57454m();
                C31563f.m65843a("click_question_mark");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.b.b$l */
    public static final class C31443l extends C31685i {

        /* renamed from: a */
        final /* synthetic */ AbstractC31431b f75285a;

        static {
            Covode.recordClassIndex(38160);
        }

        C31443l(AbstractC31431b bVar) {
            this.f75285a = bVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.account.C31685i
        public final void afterTextChanged(Editable editable) {
            super.afterTextChanged(editable);
            this.f75285a.mo57461t();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ String m65654a(AbstractC31431b bVar) {
        String str = bVar.f75270p;
        if (str == null) {
            C89219l.m154710a("mPlatform");
        }
        return str;
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.b.b$b */
    public static final class C31433b extends AbstractC33066c {

        /* renamed from: a */
        final /* synthetic */ int f75274a;

        /* renamed from: b */
        final /* synthetic */ AbstractC31431b f75275b;

        static {
            Covode.recordClassIndex(38150);
        }

        public final void onClick(View view) {
            C89219l.m154721d(view, "");
            ((AbstractC31539a) this.f75275b.mo57450i().f92287i).mo57454m();
            C31563f.m65843a("click_link");
        }

        @Override // com.p2082ss.android.ugc.aweme.account.views.AbstractC33066c
        public final void updateDrawState(TextPaint textPaint) {
            C89219l.m154721d(textPaint, "");
            super.updateDrawState(textPaint);
            textPaint.setFakeBoldText(false);
            textPaint.setUnderlineText(false);
            textPaint.setTypeface(C17301b.m32033a().mo27611a(C17303d.f41573g));
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31433b(int i, int i2, int i3, AbstractC31431b bVar) {
            super(i2, i3);
            this.f75274a = i;
            this.f75275b = bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.b.b$r */
    static final class C31449r extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC31431b f75291a;

        static {
            Covode.recordClassIndex(38166);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31449r(AbstractC31431b bVar) {
            super(1);
            this.f75291a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23025b bVar) {
            C23025b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            bVar2.mo37416a(17039370, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.account.agegate.p2237b.AbstractC31431b.C31449r.C314501 */

                /* renamed from: a */
                final /* synthetic */ C31449r f75292a;

                static {
                    Covode.recordClassIndex(38167);
                }

                {
                    this.f75292a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C89219l.m154721d(aVar, "");
                    C39162r.m79460a("click_age_gate_persuade_popup", new C31376a().mo57399a("platform", AbstractC31431b.m65654a(this.f75292a.f75291a)).f75156a);
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.b.b$t */
    public static final class C31452t extends AbstractC33066c {

        /* renamed from: a */
        final /* synthetic */ int f75294a;

        /* renamed from: b */
        final /* synthetic */ AbstractC31431b f75295b;

        static {
            Covode.recordClassIndex(38169);
        }

        @Override // com.p2082ss.android.ugc.aweme.account.views.AbstractC33066c
        public final void updateDrawState(TextPaint textPaint) {
            C89219l.m154721d(textPaint, "");
            super.updateDrawState(textPaint);
            textPaint.setFakeBoldText(true);
            textPaint.setUnderlineText(false);
        }

        public final void onClick(View view) {
            String concat;
            C89219l.m154721d(view, "");
            AbstractC31539a aVar = (AbstractC31539a) this.f75295b.mo57450i().f92287i;
            String a = C58071d.m104907a();
            String lowerCase = ((ILanguageService) C31291a.m65463a(ILanguageService.class)).mo96645a().toLowerCase();
            if (C58071d.m104912f()) {
                concat = "https://www.tiktok.com/legal/privacy-policy-us?lang=".concat(String.valueOf(lowerCase));
            } else if ((!TextUtils.isEmpty(a) && Arrays.asList("AT", "BE", "BG", "HR", "CY", "CZ", "DK", "EE", "FI", "FR", "DE", "GR", "HU", "IE", "IT", "LV", "LT", "LU", "MT", "NL", "PL", "PT", "RO", "SK", "SI", "ES", "SE", "IS", "LI", "NO").contains(a.toUpperCase(Locale.US))) || a.equalsIgnoreCase("GB") || a.equalsIgnoreCase("CH")) {
                if (C31541b.f75431a.contains(a)) {
                    lowerCase = "en";
                }
                concat = "https://www.tiktok.com/legal/privacy-policy-eea?lang=".concat(String.valueOf(lowerCase));
            } else {
                concat = "https://www.tiktok.com/legal/privacy-policy-row?lang=".concat(String.valueOf(lowerCase));
            }
            aVar.mo57447b(concat);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31452t(int i, int i2, int i3, AbstractC31431b bVar) {
            super(i2, i3);
            this.f75294a = i;
            this.f75295b = bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.b.b$u */
    static final class C31453u extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC31431b f75296a;

        static {
            Covode.recordClassIndex(38170);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31453u(AbstractC31431b bVar) {
            super(1);
            this.f75296a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23025b bVar) {
            C23025b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            bVar2.mo37416a(R.string.as_, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.account.agegate.p2237b.AbstractC31431b.C31453u.C314541 */

                /* renamed from: a */
                final /* synthetic */ C31453u f75297a;

                static {
                    Covode.recordClassIndex(38171);
                }

                {
                    this.f75297a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    String str;
                    C89219l.m154721d(aVar, "");
                    this.f75297a.f75296a.mo57450i();
                    if (C31637a.C31640c.m65950a()) {
                        str = "click_question_mark";
                    } else {
                        str = "click_link";
                    }
                    C89219l.m154721d(str, "");
                    C39162r.m79460a("age_gate_info_popup_click", new C31376a().mo57399a("enter_method", str).mo57399a("action_type", "click_ok").f75156a);
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.agegate.p2240e.AbstractC31539a
    /* renamed from: b */
    public void mo57432b(int i) {
        this.f75260b = i;
        C31563f.m65842a(mo57441a(new AbstractC31918a.C31923e(this.f75260b)));
    }

    @Override // com.p2082ss.android.ugc.aweme.account.agegate.p2240e.AbstractC31539a
    /* renamed from: b */
    public final void mo57446b(AgeGateResponse ageGateResponse) {
        LiveData liveData;
        String str;
        if (ageGateResponse != null) {
            InputWithIndicator inputWithIndicator = (InputWithIndicator) mo57434c(R.id.ho);
            if (!(inputWithIndicator == null || inputWithIndicator.getVisibility() != 0 || (liveData = (LiveData) this.f75256D.getValue()) == null)) {
                InputWithIndicator inputWithIndicator2 = (InputWithIndicator) mo57434c(R.id.ho);
                if (inputWithIndicator2 != null) {
                    str = inputWithIndicator2.getText();
                } else {
                    str = null;
                }
                liveData.postValue(str);
            }
            LiveData liveData2 = (LiveData) this.f75257E.getValue();
            if (liveData2 != null) {
                liveData2.postValue(ageGateResponse);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.agegate.p2240e.AbstractC31539a
    /* renamed from: d */
    public final void mo57449d(String str) {
        if (C80537hk.m139613a(str)) {
            ActivityC0945e activity = getActivity();
            if (activity == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(activity, "");
            new C23144b(activity).mo37635a(str).mo37637b();
            return;
        }
        ActivityC0945e activity2 = getActivity();
        if (activity2 == null) {
            C89219l.m154715b();
        }
        C89219l.m154716b(activity2, "");
        new C23144b(activity2).mo37640e(R.string.dcq).mo37637b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.agegate.b.b$j */
    public static final class C31441j<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ AbstractC31431b f75283a;

        static {
            Covode.recordClassIndex(38158);
        }

        C31441j(AbstractC31431b bVar) {
            this.f75283a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            EditText editText;
            EditText editText2;
            if (C89219l.m154714a(obj, (Object) false)) {
                InputResultIndicator inputResultIndicator = (InputResultIndicator) this.f75283a.mo57434c(R.id.hq);
                if (inputResultIndicator != null) {
                    String string = this.f75283a.getString(R.string.fxy);
                    C89219l.m154716b(string, "");
                    inputResultIndicator.mo58482a(string);
                }
                InputWithIndicator inputWithIndicator = (InputWithIndicator) this.f75283a.mo57434c(R.id.hl);
                if (!(inputWithIndicator == null || (editText2 = inputWithIndicator.getEditText()) == null)) {
                    editText2.setEnabled(false);
                }
                C31563f.m65845a((String) this.f75283a.f75271q.getValue(), "combine");
            } else {
                InputResultIndicator inputResultIndicator2 = (InputResultIndicator) this.f75283a.mo57434c(R.id.hq);
                if (inputResultIndicator2 != null) {
                    inputResultIndicator2.mo58481a();
                }
                InputWithIndicator inputWithIndicator2 = (InputWithIndicator) this.f75283a.mo57434c(R.id.hl);
                if (!(inputWithIndicator2 == null || (editText = inputWithIndicator2.getEditText()) == null)) {
                    editText.setEnabled(true);
                }
            }
            this.f75283a.mo57461t();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.agegate.p2240e.AbstractC31539a
    /* renamed from: b */
    public final void mo57447b(String str) {
        C89219l.m154721d(str, "");
        Context context = getContext();
        if (context != null) {
            SmartRouter.buildRoute(context, "//webview").withParam(Uri.parse(str)).withParam("use_webview_title", true).open();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.agegate.p2240e.AbstractC31539a
    /* renamed from: c */
    public final void mo57448c(String str) {
        C89219l.m154721d(str, "");
        C17197a.C17200a aVar = new C17197a.C17200a(getActivity());
        if (!TextUtils.isEmpty(str)) {
            C31376a aVar2 = new C31376a();
            String str2 = this.f75270p;
            if (str2 == null) {
                C89219l.m154710a("mPlatform");
            }
            C39162r.m79460a("age_gate_eligible_popup", aVar2.mo57399a("platform", str2).mo57399a("enter_method", mo58467x()).mo57399a("enter_from", mo58466w()).f75156a);
            aVar.f41071b = str;
            aVar.mo27190a(R.string.as_, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC31448q(this), false);
            aVar.mo27193a().mo27185c().setCancelable(false);
        }
    }

    /* renamed from: a */
    private static void m65655a(View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.playSequentially(ObjectAnimator.ofFloat(view, "translationX", 0.0f, -((float) C34728n.m70946a(6.0d))).setDuration(80L), ObjectAnimator.ofFloat(view, "translationX", -((float) C34728n.m70946a(6.0d)), 0.0f).setDuration(80L), ObjectAnimator.ofFloat(view, "translationX", 0.0f, (float) C34728n.m70946a(4.0d)).setDuration(60L), ObjectAnimator.ofFloat(view, "translationX", (float) C34728n.m70946a(4.0d), 0.0f).setDuration(60L), ObjectAnimator.ofFloat(view, "translationX", 0.0f, -((float) C34728n.m70946a(2.0d))).setDuration(40L), ObjectAnimator.ofFloat(view, "translationX", -((float) C34728n.m70946a(2.0d)), 0.0f).setDuration(40L), ObjectAnimator.ofFloat(view, "translationX", 0.0f, (float) C34728n.m70946a(1.0d)).setDuration(20L), ObjectAnimator.ofFloat(view, "translationX", (float) C34728n.m70946a(1.0d), 0.0f).setDuration(20L));
        animatorSet.start();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.agegate.p2240e.AbstractC31539a
    /* renamed from: a */
    public final void mo57443a(AgeGateResponse ageGateResponse) {
        C89219l.m154721d(ageGateResponse, "");
        if (ageGateResponse.getAgeGatePostAction() == 1 || ageGateResponse.getRegisterAgeGatePostAction() == 1) {
            C31563f.m65842a(mo57441a(AbstractC31918a.C31922d.f76267a));
        } else {
            C31563f.m65842a(mo57441a(AbstractC31918a.C31920b.f76265a));
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        boolean z;
        String str;
        String str2;
        EnumC31926c cVar;
        boolean z2;
        int i;
        User curUser;
        String str3;
        int i2;
        int i3;
        super.onCreate(bundle);
        this.f75262d.f76270a = SystemClock.elapsedRealtime();
        boolean z3 = false;
        Keva.getRepo("compliance_setting").storeBoolean("need_to_show_ftc_age_gate_but_no_showed", false);
        if (mo58460Z_() == EnumC32594j.EDIT_DOB_AGE_GATE) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                i2 = arguments.getInt("user_age_status", 0);
            } else {
                i2 = 0;
            }
            this.f75268n = i2;
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                i3 = arguments2.getInt("description_type", 0);
            } else {
                i3 = 0;
            }
            this.f75269o = i3;
            this.f75267m = true;
        }
        if (mo57451j()) {
            Bundle arguments3 = getArguments();
            if (arguments3 == null || (str3 = arguments3.getString("platform", "")) == null) {
                str3 = "";
            }
            this.f75270p = str3;
        } else {
            if (mo58460Z_() == EnumC32594j.AGE_GATE) {
                z = true;
            } else {
                z = false;
            }
            this.f75266l = z;
            if (mo58460Z_() == EnumC32594j.AGE_GATE_LOGIN) {
                str = "sms_verification";
            } else {
                str = "phone";
            }
            this.f75270p = str;
        }
        if (mo58458A() == EnumC32592i.GUEST_MODE) {
            this.f75270p = "guestmode";
        }
        boolean I = m65652I();
        if (this.f75266l) {
            str2 = "existing";
        } else {
            str2 = this.f75270p;
            if (str2 == null) {
                C89219l.m154710a("mPlatform");
            }
        }
        if (this.f75266l) {
            cVar = EnumC31926c.EXISTING_USER;
        } else {
            cVar = EnumC31926c.NEW_USER;
        }
        boolean z4 = this.f75267m;
        String x = mo58467x();
        C89219l.m154716b(x, "");
        int i4 = this.f75268n;
        String w = mo58466w();
        C89219l.m154716b(w, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(x, "");
        C89219l.m154721d(w, "");
        if (z4) {
            C39162r.m79460a("show_age_edit_page", new C31376a().mo57399a("enter_from", "age_edit_page").mo57399a("enter_method", x).mo57397a("user_age_status", i4).f75156a);
        } else if (I) {
            IAccountUserService e = C36085cj.f85262b.mo57069e();
            C31376a a = new C31376a().mo57399a("enter_method", x);
            if (e == null || !e.isLogin()) {
                z2 = false;
            } else {
                z2 = true;
            }
            C31376a a2 = a.mo57399a("user_is_login", String.valueOf(z2)).mo57399a("is_bind_fb", String.valueOf(C30223b.f72086a.mo53668a("facebook"))).mo57399a("is_bind_gl", String.valueOf(C30223b.f72086a.mo53668a("google")));
            if (e == null || (curUser = e.getCurUser()) == null) {
                i = -1;
            } else {
                i = curUser.getUserMode();
            }
            C31376a a3 = a2.mo57397a("user_mode", i);
            if (C33048q.f78600a == -1) {
                C33048q.f78600a = C33048q.m67692c().getInt("ftc_age_enable", 0);
            }
            if (C33048q.f78600a == 1) {
                z3 = true;
            }
            C39162r.m79460a("f_age_gate_show", a3.mo57399a("is_ftc_enable", String.valueOf(z3)).mo57399a("user_type", C31563f.m65841a(cVar)).mo57399a("enter_from", w).mo57399a("platform", str2).f75156a);
        } else {
            C39162r.m79460a("age_gate_show", new C31376a().mo57399a("platform", str2).mo57399a("user_type", C31563f.m65841a(cVar)).mo57399a("enter_from", w).mo57399a("enter_method", x).f75156a);
        }
        C31534a i5 = mo57450i();
        i5.mo67839a_(this);
        i5.mo67838a(i5.f75422a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final AbstractC31549a mo57441a(AbstractC31918a aVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        C89219l.m154721d(aVar, "");
        String str = null;
        if (aVar instanceof AbstractC31918a.C31924f) {
            if (this.f75267m) {
                T t = mo57450i().f92286h;
                C89219l.m154716b(t, "");
                T t2 = t.mData;
                C89219l.m154716b(t2, "");
                String x = mo58467x();
                C89219l.m154716b(x, "");
                String w = mo58466w();
                C89219l.m154716b(w, "");
                return new AbstractC31549a.C31551b(t2, w, x, this.f75262d.mo57857a(), this.f75268n);
            } else if (m65652I()) {
                EnumC31926c a = C31927d.m66294a(this.f75266l);
                T t3 = mo57450i().f92286h;
                C89219l.m154716b(t3, "");
                T t4 = t3.mData;
                C89219l.m154716b(t4, "");
                String x2 = mo58467x();
                C89219l.m154716b(x2, "");
                String w2 = mo58466w();
                C89219l.m154716b(w2, "");
                String str2 = this.f75270p;
                if (str2 == null) {
                    C89219l.m154710a("mPlatform");
                }
                long a2 = this.f75262d.mo57857a();
                InputWithIndicator inputWithIndicator = (InputWithIndicator) mo57434c(R.id.ho);
                if (inputWithIndicator != null) {
                    str = inputWithIndicator.getText();
                }
                if (String.valueOf(str).length() > 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                return new AbstractC31549a.C31552c(a, t4, x2, w2, str2, a2, z4, 64);
            } else {
                EnumC31926c a3 = C31927d.m66294a(this.f75266l);
                String w3 = mo58466w();
                C89219l.m154716b(w3, "");
                String x3 = mo58467x();
                C89219l.m154716b(x3, "");
                T t5 = mo57450i().f92286h;
                C89219l.m154716b(t5, "");
                T t6 = t5.mData;
                C89219l.m154716b(t6, "");
                String str3 = this.f75270p;
                if (str3 == null) {
                    C89219l.m154710a("mPlatform");
                }
                long a4 = this.f75262d.mo57857a();
                InputWithIndicator inputWithIndicator2 = (InputWithIndicator) mo57434c(R.id.ho);
                if (inputWithIndicator2 != null) {
                    str = inputWithIndicator2.getText();
                }
                if (String.valueOf(str).length() > 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                return new AbstractC31549a.C31550a(a3, t6, w3, x3, str3, a4, z3);
            }
        } else if (aVar instanceof AbstractC31918a.C31923e) {
            if (this.f75267m) {
                AgeGateResponse ageGateResponse = new AgeGateResponse(((AbstractC31918a.C31923e) aVar).f76268a, null, false, 0, 0, null, 62, null);
                String x4 = mo58467x();
                C89219l.m154716b(x4, "");
                String w4 = mo58466w();
                C89219l.m154716b(w4, "");
                return new AbstractC31549a.C31551b(ageGateResponse, w4, x4, this.f75262d.mo57857a(), this.f75268n);
            } else if (m65652I()) {
                EnumC31926c a5 = C31927d.m66294a(this.f75266l);
                AgeGateResponse ageGateResponse2 = new AgeGateResponse(((AbstractC31918a.C31923e) aVar).f76268a, null, false, 0, 0, null, 62, null);
                String x5 = mo58467x();
                C89219l.m154716b(x5, "");
                String w5 = mo58466w();
                C89219l.m154716b(w5, "");
                String str4 = this.f75270p;
                if (str4 == null) {
                    C89219l.m154710a("mPlatform");
                }
                return new AbstractC31549a.C31552c(a5, ageGateResponse2, x5, w5, str4, this.f75262d.mo57857a(), false, 192);
            } else {
                EnumC31926c a6 = C31927d.m66294a(this.f75266l);
                AgeGateResponse ageGateResponse3 = new AgeGateResponse(((AbstractC31918a.C31923e) aVar).f76268a, null, false, 0, 0, null, 62, null);
                String w6 = mo58466w();
                C89219l.m154716b(w6, "");
                String x6 = mo58467x();
                C89219l.m154716b(x6, "");
                String str5 = this.f75270p;
                if (str5 == null) {
                    C89219l.m154710a("mPlatform");
                }
                return new AbstractC31549a.C31550a(a6, ageGateResponse3, w6, x6, str5, this.f75262d.mo57857a());
            }
        } else if (aVar instanceof AbstractC31918a.C31920b) {
            if (this.f75267m) {
                AgeGateResponse ageGateResponse4 = new AgeGateResponse(56004, null, false, 0, 0, null, 62, null);
                String x7 = mo58467x();
                C89219l.m154716b(x7, "");
                String w7 = mo58466w();
                C89219l.m154716b(w7, "");
                return new AbstractC31549a.C31551b(ageGateResponse4, w7, x7, this.f75262d.mo57857a(), this.f75268n);
            }
            EnumC31926c a7 = C31927d.m66294a(this.f75266l);
            AgeGateResponse ageGateResponse5 = new AgeGateResponse(56004, null, false, 0, 0, null, 62, null);
            String w8 = mo58466w();
            C89219l.m154716b(w8, "");
            String x8 = mo58467x();
            C89219l.m154716b(x8, "");
            String str6 = this.f75270p;
            if (str6 == null) {
                C89219l.m154710a("mPlatform");
            }
            return new AbstractC31549a.C31550a(a7, ageGateResponse5, w8, x8, str6, this.f75262d.mo57857a());
        } else if ((aVar instanceof AbstractC31918a.C31922d) || (aVar instanceof AbstractC31918a.C31921c)) {
            if (this.f75267m) {
                AgeGateResponse ageGateResponse6 = new AgeGateResponse(56004, null, false, 0, 0, null, 62, null);
                String x9 = mo58467x();
                C89219l.m154716b(x9, "");
                String w9 = mo58466w();
                C89219l.m154716b(w9, "");
                return new AbstractC31549a.C31551b(ageGateResponse6, w9, x9, this.f75262d.mo57857a(), this.f75268n);
            }
            EnumC31926c a8 = C31927d.m66294a(this.f75266l);
            AgeGateResponse ageGateResponse7 = new AgeGateResponse(56004, null, false, 0, 0, null, 62, null);
            String w10 = mo58466w();
            C89219l.m154716b(w10, "");
            String x10 = mo58467x();
            C89219l.m154716b(x10, "");
            String str7 = this.f75270p;
            if (str7 == null) {
                C89219l.m154710a("mPlatform");
            }
            return new AbstractC31549a.C31552c(a8, ageGateResponse7, x10, w10, str7, this.f75262d.mo57857a(), false, 192);
        } else if (!(aVar instanceof AbstractC31918a.C31919a)) {
            throw new C89376n();
        } else if (this.f75267m) {
            AgeGateResponse ageGateResponse8 = new AgeGateResponse(this.f75260b, null, false, 0, 0, null, 62, null);
            String x11 = mo58467x();
            C89219l.m154716b(x11, "");
            String w11 = mo58466w();
            C89219l.m154716b(w11, "");
            return new AbstractC31549a.C31551b(ageGateResponse8, w11, x11, this.f75262d.mo57857a(), this.f75268n);
        } else if (m65652I()) {
            EnumC31926c a9 = C31927d.m66294a(this.f75266l);
            AgeGateResponse ageGateResponse9 = new AgeGateResponse(this.f75260b, null, false, 0, 0, null, 62, null);
            String x12 = mo58467x();
            C89219l.m154716b(x12, "");
            String w12 = mo58466w();
            C89219l.m154716b(w12, "");
            String str8 = this.f75270p;
            if (str8 == null) {
                C89219l.m154710a("mPlatform");
            }
            long a10 = this.f75262d.mo57857a();
            InputWithIndicator inputWithIndicator3 = (InputWithIndicator) mo57434c(R.id.ho);
            if (inputWithIndicator3 != null) {
                str = inputWithIndicator3.getText();
            }
            if (String.valueOf(str).length() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            return new AbstractC31549a.C31552c(a9, ageGateResponse9, x12, w12, str8, a10, z2, 64);
        } else {
            EnumC31926c a11 = C31927d.m66294a(this.f75266l);
            String w13 = mo58466w();
            C89219l.m154716b(w13, "");
            String x13 = mo58467x();
            C89219l.m154716b(x13, "");
            AgeGateResponse ageGateResponse10 = new AgeGateResponse(this.f75260b, null, false, 0, 0, null, 62, null);
            String str9 = this.f75270p;
            if (str9 == null) {
                C89219l.m154710a("mPlatform");
            }
            long a12 = this.f75262d.mo57857a();
            InputWithIndicator inputWithIndicator4 = (InputWithIndicator) mo57434c(R.id.ho);
            if (inputWithIndicator4 != null) {
                str = inputWithIndicator4.getText();
            }
            if (String.valueOf(str).length() > 0) {
                z = true;
            } else {
                z = false;
            }
            return new AbstractC31549a.C31550a(a11, ageGateResponse10, w13, x13, str9, a12, z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.agegate.b.b$i */
    public static final class View$OnFocusChangeListenerC31440i implements View.OnFocusChangeListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC31431b f75282a;

        static {
            Covode.recordClassIndex(38157);
        }

        View$OnFocusChangeListenerC31440i(AbstractC31431b bVar) {
            this.f75282a = bVar;
        }

        public final void onFocusChange(View view, boolean z) {
            if (this.f75282a.f43437f) {
                AbstractC31431b bVar = this.f75282a;
                C89219l.m154716b(view, "");
                bVar.mo57428a(view, z);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b
    /* renamed from: a */
    public final void mo57442a(int i, String str) {
        C89219l.m154721d(str, "");
        ActivityC0945e activity = getActivity();
        if (activity != null) {
            C89219l.m154716b(activity, "");
            new C23144b(activity).mo37635a(str).mo37637b();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.AbstractC32613a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        mo57437g();
        this.f75261c = this.f75262d.mo57857a();
        ActivityC0945e activity = getActivity();
        if (activity != null) {
            KeyboardUtils.m70893a(activity, 48);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.agegate.b.b$q */
    public static final class DialogInterface$OnClickListenerC31448q implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC31431b f75290a;

        static {
            Covode.recordClassIndex(38165);
        }

        DialogInterface$OnClickListenerC31448q(AbstractC31431b bVar) {
            this.f75290a = bVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (this.f75290a.mo57451j()) {
                this.f75290a.f75265k = -99;
                ActivityC0945e activity = this.f75290a.getActivity();
                if (activity != null) {
                    activity.setResult(this.f75290a.f75265k);
                }
            }
            C31566h.m65848a();
            C39162r.m79460a("age_gate_eligible_popup_confirm", new C31376a().mo57399a("platform", AbstractC31431b.m65654a(this.f75290a)).mo57399a("enter_method", this.f75290a.mo58467x()).mo57399a("enter_from", this.f75290a.mo58466w()).f75156a);
            ActivityC0945e activity2 = this.f75290a.getActivity();
            if (activity2 != null) {
                activity2.finish();
            }
        }
    }

    /* renamed from: a */
    public void mo57428a(View view, boolean z) {
        CharSequence charSequence;
        C89219l.m154721d(view, "");
        TuxTextView tuxTextView = (TuxTextView) mo57434c(R.id.qu);
        C89219l.m154716b(tuxTextView, "");
        if (!z) {
            charSequence = getString(R.string.fxx);
        } else {
            charSequence = this.f75254B;
            if (charSequence == null) {
                charSequence = "";
            }
        }
        tuxTextView.setText(charSequence);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.agegate.p2240e.AbstractC31539a
    /* renamed from: a */
    public final void mo57444a(String str, int i) {
        C89219l.m154721d(str, "");
        TuxTextView tuxTextView = (TuxTextView) mo57434c(R.id.hh);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setText(str);
        LinearLayout linearLayout = (LinearLayout) mo57434c(R.id.hj);
        C89219l.m154716b(linearLayout, "");
        linearLayout.setVisibility(0);
        if (!this.f75267m) {
            TuxTextView tuxTextView2 = (TuxTextView) mo57434c(R.id.hh);
            C89219l.m154716b(tuxTextView2, "");
            switch (i) {
                case 3008008:
                    str = getResources().getQuantityString(R.plurals.p, 2, 2);
                    break;
                case 3008010:
                    str = getResources().getQuantityString(R.plurals.p, 0, 0);
                    break;
                case 3008012:
                    str = getResources().getQuantityString(R.plurals.p, 1, 1);
                    break;
                case 3008020:
                    str = getResources().getQuantityString(R.plurals.p, 4, 4);
                    break;
                case 3008026:
                    str = getResources().getQuantityString(R.plurals.p, 3, 3);
                    break;
            }
            tuxTextView2.setText(str);
            if (f75250F.contains(Integer.valueOf(i))) {
                LinearLayout linearLayout2 = (LinearLayout) mo57434c(R.id.hj);
                C89219l.m154716b(linearLayout2, "");
                m65655a(linearLayout2);
            }
        }
    }

    /* renamed from: a */
    private static SpannableStringBuilder m65653a(String str, String str2, AbstractC33066c cVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        String spannableStringBuilder2 = spannableStringBuilder.toString();
        C89219l.m154716b(spannableStringBuilder2, "");
        int a = C89361p.m154888a((CharSequence) spannableStringBuilder2, str2, 0, false, 6);
        if (a >= 0) {
            spannableStringBuilder.setSpan(cVar, a, str2.length() + a, 34);
        }
        return spannableStringBuilder;
    }
}
