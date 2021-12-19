package com.p2082ss.android.ugc.aweme.account.security;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.core.content.C0643b;
import androidx.core.widget.C0823h;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.account.security.SafeInfoNoticeApi;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p2082ss.android.ugc.aweme.crossplatform.p2706a.C40520b;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.account.security.d */
public final class C32940d extends PopupWindow {

    /* renamed from: h */
    public static final C32941a f78377h = new C32941a((byte) 0);

    /* renamed from: a */
    public LinearLayout f78378a;

    /* renamed from: b */
    public TextView f78379b;

    /* renamed from: c */
    public int f78380c;

    /* renamed from: d */
    public String f78381d;

    /* renamed from: e */
    public List<C32938b> f78382e;

    /* renamed from: f */
    public final Context f78383f;

    /* renamed from: g */
    public final View f78384g;

    /* renamed from: i */
    private TuxIconView f78385i;

    /* renamed from: j */
    private boolean f78386j = true;

    /* renamed from: k */
    private String f78387k;

    /* renamed from: l */
    private String f78388l;

    /* renamed from: m */
    private String f78389m;

    /* renamed from: n */
    private SpannableStringBuilder f78390n;

    /* renamed from: o */
    private Boolean f78391o;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.security.d$b */
    public static final class C32942b<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C32942b f78392a = new C32942b();

        static {
            Covode.recordClassIndex(39734);
        }

        C32942b() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(39732);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.security.d$a */
    public static final class C32941a {
        static {
            Covode.recordClassIndex(39733);
        }

        private C32941a() {
        }

        /* renamed from: a */
        public static boolean m67579a() {
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            if (g.isLogin()) {
                IAccountUserService g2 = C31575b.m65865g();
                C89219l.m154716b(g2, "");
                if (g2.isChildrenMode() || !Keva.getRepo("account_security_keva_name").getBoolean(m67578a("safe_info_need_show_"), false)) {
                    return false;
                }
                return true;
            }
            return false;
        }

        public /* synthetic */ C32941a(byte b) {
            this();
        }

        /* renamed from: a */
        public static String m67578a(String str) {
            StringBuilder append = new StringBuilder().append(str);
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            return append.append(g.getCurUserId()).toString();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.security.d$h */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC32948h implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ C32940d f78398a;

        static {
            Covode.recordClassIndex(39740);
        }

        public final void onGlobalLayout() {
            ViewTreeObserver viewTreeObserver = this.f78398a.f78379b.getViewTreeObserver();
            C89219l.m154716b(viewTreeObserver, "");
            viewTreeObserver.removeOnGlobalLayoutListener(this);
            if (this.f78398a.f78379b.getLineCount() > 3) {
                ViewGroup.LayoutParams layoutParams = this.f78398a.f78378a.getLayoutParams();
                layoutParams.height = (int) C13628n.m24520b(this.f78398a.f78383f, 84.0f);
                this.f78398a.f78378a.setLayoutParams(layoutParams);
                this.f78398a.f78379b.getLayoutParams().height = (int) C13628n.m24520b(this.f78398a.f78383f, 68.0f);
                C0823h.m2908a(this.f78398a.f78379b, 2, 13, 1, 2);
                this.f78398a.getContentView().measure(0, 0);
                this.f78398a.f78380c = 0;
                try {
                    this.f78398a.dismiss();
                } catch (Exception unused) {
                }
                this.f78398a.mo58721a();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        ViewTreeObserver$OnGlobalLayoutListenerC32948h(C32940d dVar) {
            this.f78398a = dVar;
        }
    }

    /* renamed from: a */
    public final void mo58721a() {
        if (!isShowing()) {
            if (this.f78380c == 0) {
                int[] iArr = new int[2];
                this.f78384g.getLocationOnScreen(iArr);
                getContentView().measure(0, 0);
                int i = iArr[1];
                View contentView = getContentView();
                C89219l.m154716b(contentView, "");
                this.f78380c = i - contentView.getMeasuredHeight();
            }
            showAtLocation(this.f78384g, 0, 0, this.f78380c);
            if (this.f78386j) {
                this.f78386j = false;
                C39162r.m79460a("security_alert_notify", new C33744d().mo59983a("aid", String.valueOf(C17867d.f42590n)).mo59983a("notice_id", this.f78389m).mo59983a("notice_type", this.f78387k).mo59983a("notice_model", this.f78388l).f79943a);
            }
        }
    }

    /* renamed from: b */
    private final void m67575b() {
        int a;
        if (this.f78390n != null) {
            if (TextUtils.equals(this.f78388l, "can_not_cancel")) {
                this.f78385i.setIconRes(R.raw.icon_chevron_right_ltr);
                this.f78385i.setOnClickListener(new View$OnClickListenerC32944d(this));
            } else {
                this.f78385i.setIconRes(2131232357);
                this.f78385i.setOnClickListener(new View$OnClickListenerC32945e(this));
            }
            List<C32938b> list = this.f78382e;
            if (list == null || !(!list.isEmpty())) {
                this.f78379b.setText(this.f78390n);
                this.f78379b.setOnClickListener(new View$OnClickListenerC32947g(this));
            } else {
                List<C32938b> list2 = this.f78382e;
                if (list2 == null) {
                    C89219l.m154715b();
                }
                for (C32938b bVar : list2) {
                    String str = bVar.f78374a;
                    if (!(str == null || (a = C89361p.m154885a((CharSequence) String.valueOf(this.f78390n), str)) == -1)) {
                        SpannableStringBuilder spannableStringBuilder = this.f78390n;
                        if (spannableStringBuilder == null) {
                            C89219l.m154715b();
                        }
                        if (a < spannableStringBuilder.length()) {
                            int length = str.length() + a;
                            SpannableStringBuilder spannableStringBuilder2 = this.f78390n;
                            if (spannableStringBuilder2 == null) {
                                C89219l.m154715b();
                            }
                            if (length <= spannableStringBuilder2.length()) {
                                C32949i iVar = new C32949i(this, bVar);
                                SpannableStringBuilder spannableStringBuilder3 = this.f78390n;
                                if (spannableStringBuilder3 == null) {
                                    C89219l.m154715b();
                                }
                                spannableStringBuilder3.setSpan(iVar, a, str.length() + a, 33);
                            }
                        }
                    }
                }
                this.f78379b.setText(this.f78390n);
                this.f78379b.setMovementMethod(LinkMovementMethod.getInstance());
                this.f78379b.setHighlightColor(C0643b.m2378c(this.f78383f, R.color.c9));
                List<C32938b> list3 = this.f78382e;
                if (list3 == null) {
                    C89219l.m154715b();
                }
                if (list3.size() == 1) {
                    this.f78379b.setOnClickListener(new View$OnClickListenerC32946f(this));
                }
            }
            this.f78379b.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC32948h(this));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.security.d$c */
    public static final class C32943c<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C32943c f78393a = new C32943c();

        static {
            Covode.recordClassIndex(39735);
        }

        C32943c() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            if (th != null) {
                th.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.security.d$d */
    public static final class View$OnClickListenerC32944d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C32940d f78394a;

        static {
            Covode.recordClassIndex(39736);
        }

        View$OnClickListenerC32944d(C32940d dVar) {
            this.f78394a = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C32940d dVar = this.f78394a;
            dVar.mo58722a(dVar.f78381d);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.security.d$g */
    public static final class View$OnClickListenerC32947g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C32940d f78397a;

        static {
            Covode.recordClassIndex(39739);
        }

        View$OnClickListenerC32947g(C32940d dVar) {
            this.f78397a = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C32940d dVar = this.f78397a;
            dVar.mo58722a(dVar.f78381d);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.security.d$e */
    public static final class View$OnClickListenerC32945e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C32940d f78395a;

        static {
            Covode.recordClassIndex(39737);
        }

        View$OnClickListenerC32945e(C32940d dVar) {
            this.f78395a = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            Keva.getRepo("account_security_keva_name").storeBoolean(C32941a.m67578a("safe_info_need_show_"), false);
            try {
                this.f78395a.dismiss();
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.security.d$f */
    public static final class View$OnClickListenerC32946f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C32940d f78396a;

        static {
            Covode.recordClassIndex(39738);
        }

        View$OnClickListenerC32946f(C32940d dVar) {
            this.f78396a = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C32940d dVar = this.f78396a;
            List<C32938b> list = dVar.f78382e;
            if (list == null) {
                C89219l.m154715b();
            }
            dVar.mo58722a(list.get(0).f78375b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.security.d$i */
    public static final class C32949i extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ C32940d f78399a;

        /* renamed from: b */
        final /* synthetic */ C32938b f78400b;

        static {
            Covode.recordClassIndex(39741);
        }

        public final void onClick(View view) {
            C89219l.m154721d(view, "");
            List<C32938b> list = this.f78399a.f78382e;
            if (list == null) {
                C89219l.m154715b();
            }
            if (list.size() != 1) {
                this.f78399a.mo58722a(this.f78400b.f78375b);
            }
        }

        public final void updateDrawState(TextPaint textPaint) {
            C89219l.m154721d(textPaint, "");
            super.updateDrawState(textPaint);
            textPaint.setColor(C0643b.m2378c(this.f78399a.f78383f, R.color.bh));
            textPaint.setUnderlineText(false);
            textPaint.setFakeBoldText(true);
        }

        C32949i(C32940d dVar, C32938b bVar) {
            this.f78399a = dVar;
            this.f78400b = bVar;
        }
    }

    /* renamed from: a */
    public final void mo58722a(String str) {
        if (this.f78389m != null) {
            SafeInfoNoticeApi a = SafeInfoNoticeApi.C32936a.m67574a();
            String str2 = this.f78389m;
            if (str2 == null) {
                C89219l.m154715b();
            }
            String str3 = this.f78387k;
            if (str3 == null) {
                str3 = "";
            }
            a.safeInfoConfirm(str2, str3).mo142918b(C88925a.m154180b(C88946a.f201991c)).mo142909a(C88925a.m154180b(C88946a.f201991c)).mo142915a(C32942b.f78392a, C32943c.f78393a);
            Keva.getRepo("account_security_keva_name").storeBoolean(C32941a.m67578a("safe_info_need_show_"), false);
            try {
                dismiss();
            } catch (Exception unused) {
            }
            this.f78386j = true;
        }
        Activity j = C17873f.m33102j();
        if (C89361p.m154872a(this.f78387k, "unbind_email", false)) {
            SmartRouter.buildRoute(j, str).open();
        } else if (j != null && str != null) {
            Intent a2 = C40520b.m81720a(j, str + "&notice_id=" + this.f78389m);
            C89219l.m154716b(a2, "");
            a2.setClass(j, CrossPlatformActivity.class);
            a2.putExtra("hide_nav_bar", true);
            C84349a.m145093a(a2, j);
            j.startActivity(a2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32940d(Context context, View view) {
        super(context);
        C89219l.m154721d(context, "");
        C89219l.m154721d(view, "");
        MethodCollector.m26663i(6336);
        this.f78383f = context;
        this.f78384g = view;
        setContentView(LayoutInflater.from(context).inflate(R.layout.am6, (ViewGroup) null));
        View findViewById = getContentView().findViewById(R.id.c53);
        C89219l.m154716b(findViewById, "");
        this.f78378a = (LinearLayout) findViewById;
        View findViewById2 = getContentView().findViewById(R.id.f0c);
        C89219l.m154716b(findViewById2, "");
        this.f78379b = (TextView) findViewById2;
        View findViewById3 = getContentView().findViewById(R.id.by1);
        C89219l.m154716b(findViewById3, "");
        this.f78385i = (TuxIconView) findViewById3;
        C32937a aVar = (C32937a) new C27910f().mo46670a(Keva.getRepo("account_security_keva_name").getString(C32941a.m67578a("safe_info_"), ""), C32937a.class);
        if (aVar != null) {
            this.f78388l = aVar.f78372f;
            this.f78387k = aVar.f78371e;
            this.f78389m = aVar.f78367a;
            this.f78390n = new SpannableStringBuilder(aVar.f78368b);
            this.f78381d = aVar.f78373g;
            this.f78382e = aVar.f78369c;
            this.f78391o = Boolean.valueOf(aVar.f78370d);
        }
        m67575b();
        setWidth(-1);
        setHeight(-2);
        setBackgroundDrawable(new ColorDrawable(0));
        MethodCollector.m26664o(6336);
    }
}
