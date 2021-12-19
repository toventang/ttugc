package com.bytedance.android.livesdk.browser.p463d;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.AbstractC0976n;
import androidx.fragment.app.Fragment;
import com.C1764a;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p218f.C3907ag;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.core.widget.C4031a;
import com.bytedance.android.live.design.view.sheet.LiveBottomSheetBehavior;
import com.bytedance.android.live.p176b.AbstractC2928f;
import com.bytedance.android.live.p176b.AbstractC2931h;
import com.bytedance.android.live.p176b.AbstractC2936j;
import com.bytedance.android.live.p176b.C2943o;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.browser.jsbridge.AbstractC7033a;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C7121bf;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C7186n;
import com.bytedance.android.livesdk.browser.jsbridge.p473d.p474a.C7047a;
import com.bytedance.android.livesdk.browser.p462c.AbstractC6953a;
import com.bytedance.android.livesdk.browser.p462c.AbstractC6955c;
import com.bytedance.android.livesdk.browser.p462c.AbstractC6956d;
import com.bytedance.android.livesdk.browser.p463d.View$OnClickListenerC6986h;
import com.bytedance.android.livesdk.browser.p466g.C7024a;
import com.bytedance.android.livesdk.container.p508e.C8242a;
import com.bytedance.android.livesdk.container.p510g.C8247a;
import com.bytedance.android.livesdk.container.util.C8299b;
import com.bytedance.android.livesdk.lynx.AbstractC9352c;
import com.bytedance.android.livesdk.lynx.p570ui.AbstractC9376a;
import com.bytedance.android.livesdk.lynx.p570ui.C9448e;
import com.bytedance.android.livesdk.utils.C11218ah;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.p1301e.C18484a;
import com.bytedance.ies.xbridge.p1301e.C18494b;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.browser.d.a */
public class C6972a extends C4031a implements AbstractC6955c, View$OnClickListenerC6986h.AbstractC6989a, AbstractC7033a, AbstractC9376a.AbstractC9378b {

    /* renamed from: A */
    private View f17442A;

    /* renamed from: B */
    private View f17443B;

    /* renamed from: C */
    private View f17444C;

    /* renamed from: D */
    private View f17445D;

    /* renamed from: E */
    private View f17446E;

    /* renamed from: F */
    private View f17447F;

    /* renamed from: G */
    private View f17448G;

    /* renamed from: H */
    private TextView f17449H;

    /* renamed from: I */
    private boolean f17450I;

    /* renamed from: J */
    private boolean f17451J;

    /* renamed from: K */
    private boolean f17452K;

    /* renamed from: L */
    private boolean f17453L;

    /* renamed from: M */
    private boolean f17454M;

    /* renamed from: N */
    private String f17455N;

    /* renamed from: O */
    private boolean f17456O;

    /* renamed from: P */
    private int f17457P;

    /* renamed from: Q */
    private int f17458Q;

    /* renamed from: R */
    private int f17459R;

    /* renamed from: S */
    private boolean f17460S;

    /* renamed from: T */
    private long f17461T;

    /* renamed from: U */
    private long f17462U;

    /* renamed from: V */
    private boolean f17463V;

    /* renamed from: W */
    private boolean f17464W;

    /* renamed from: X */
    private boolean f17465X;

    /* renamed from: Y */
    private boolean f17466Y;

    /* renamed from: Z */
    private int f17467Z;

    /* renamed from: aa */
    private String f17468aa;

    /* renamed from: ab */
    private boolean f17469ab;

    /* renamed from: ac */
    private boolean f17470ac;

    /* renamed from: ad */
    private C2943o f17471ad;

    /* renamed from: ae */
    private String f17472ae;

    /* renamed from: af */
    private String f17473af;

    /* renamed from: ag */
    private int f17474ag;

    /* renamed from: ah */
    private boolean f17475ah;

    /* renamed from: ai */
    private float f17476ai;

    /* renamed from: aj */
    private boolean f17477aj;

    /* renamed from: ak */
    private int f17478ak = -1;

    /* renamed from: e */
    public ImageView f17479e;

    /* renamed from: f */
    View f17480f;

    /* renamed from: g */
    boolean f17481g;

    /* renamed from: h */
    String f17482h;

    /* renamed from: i */
    String f17483i;

    /* renamed from: j */
    public int f17484j;

    /* renamed from: k */
    int f17485k;

    /* renamed from: l */
    int f17486l;

    /* renamed from: m */
    int f17487m;

    /* renamed from: n */
    int f17488n;

    /* renamed from: o */
    int f17489o;

    /* renamed from: p */
    public AbstractC9376a f17490p;

    /* renamed from: q */
    public boolean f17491q;

    /* renamed from: r */
    public AbstractC2931h f17492r;

    /* renamed from: s */
    public int f17493s;

    /* renamed from: t */
    public boolean f17494t = true;

    /* renamed from: u */
    public AbstractC2928f.AbstractC2929a f17495u;

    /* renamed from: v */
    public String f17496v = "";

    /* renamed from: w */
    public String f17497w = "bottom";

    /* renamed from: x */
    private View f17498x;

    /* renamed from: y */
    private View f17499y;

    /* renamed from: z */
    private View f17500z;

    static {
        Covode.recordClassIndex(7711);
    }

    @Override // com.bytedance.android.livesdk.lynx.p570ui.AbstractC9376a.AbstractC9378b
    /* renamed from: f */
    public final void mo13279f() {
        this.f17460S = true;
    }

    @Override // com.bytedance.android.livesdk.browser.p462c.AbstractC6955c
    /* renamed from: b */
    public final void mo13241b() {
        dismissAllowingStateLoss();
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.live.C2907a
    public void dismiss() {
        dismissAllowingStateLoss();
    }

    @Override // com.bytedance.android.livesdk.lynx.p570ui.AbstractC9376a.AbstractC9378b
    /* renamed from: g */
    public final void mo13280g() {
        dismissAllowingStateLoss();
    }

    /* renamed from: h */
    private boolean m14900h() {
        if (this.f17457P == 0 && this.f17484j == 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.live.C2907a
    public void dismissAllowingStateLoss() {
        C8299b.m16456a(this.f17444C, this.f17497w, this.f17470ac, new AbstractC89171a<C89391z>() {
            /* class com.bytedance.android.livesdk.browser.p463d.C6972a.C69797 */

            static {
                Covode.recordClassIndex(7718);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                C6972a.super.dismissAllowingStateLoss();
                return C89391z.f203057a;
            }
        });
    }

    @Override // com.bytedance.android.live.core.widget.C4031a
    /* renamed from: j_ */
    public final String mo9425j_() {
        AbstractC9376a aVar = this.f17490p;
        if (aVar == null) {
            return "";
        }
        return aVar.f22874K;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment, com.bytedance.android.live.core.widget.C4031a
    public void onDestroyView() {
        super.onDestroyView();
        C2943o oVar = this.f17471ad;
        if (oVar != null) {
            oVar.mo7709c();
        }
    }

    @Override // com.bytedance.android.livesdk.browser.p462c.AbstractC6955c
    /* renamed from: c */
    public final WebView mo13242c() {
        AbstractC9376a aVar = this.f17490p;
        if (aVar == null || !(aVar.mo13302f() instanceof WebView)) {
            return null;
        }
        return (WebView) this.f17490p.mo13302f();
    }

    @Override // androidx.fragment.app.Fragment, com.bytedance.android.live.core.widget.C4031a
    public void onDestroy() {
        super.onDestroy();
        AbstractC2928f fVar = (AbstractC2928f) C6193a.m13435a(AbstractC2928f.class);
        if (fVar != null) {
            fVar.getHybridDialogManager().mo7673a(this);
        }
        C2943o oVar = this.f17471ad;
        if (oVar != null) {
            oVar.mo7710d();
        }
    }

    @Override // com.bytedance.android.livesdk.lynx.p570ui.AbstractC9376a.AbstractC9378b
    /* renamed from: d */
    public final void mo13277d() {
        long currentTimeMillis = System.currentTimeMillis();
        this.f17462U = currentTimeMillis;
        C3854a.m9453a(3, "onPageStarted", String.valueOf(currentTimeMillis - this.f17461T));
        this.f17460S = false;
        if (this.f11063b) {
            this.f17499y.setVisibility(8);
        }
    }

    /* renamed from: i */
    private AbstractC9376a m14901i() {
        Bundle bundle = new Bundle();
        bundle.putString("url", this.f17483i);
        bundle.putString("original_scheme", this.f17472ae);
        bundle.putBoolean("bundle_user_webview_title", false);
        bundle.putBoolean("hide_nav_bar", true);
        bundle.putBoolean("shouldChangeBgResIntoTransparent", this.f17454M);
        int i = this.f17467Z;
        if (i != -1) {
            bundle.putInt("bundle_web_view_background_color", i);
        }
        if (this.f17474ag == C9448e.EnumC9450b.LYNX.ordinal()) {
            this.f17498x.setBackgroundColor(this.f17478ak);
            bundle.putString("fallback_url", this.f17473af);
            bundle.putInt("bundle_preset_width", C3966y.m9653a((float) this.f17457P));
            Fragment createLynxFragment = ((AbstractC9352c) C6193a.m13435a(AbstractC9352c.class)).createLynxFragment(getContext(), bundle);
            if (createLynxFragment == null) {
                try {
                    Uri parse = Uri.parse(this.f17473af);
                    if (!TextUtils.equals("webcast_webview", parse.getHost())) {
                        AbstractC2928f.AbstractC2929a aVar = this.f17495u;
                        if (aVar != null) {
                            aVar.mo7664a(this.f17473af);
                        } else {
                            ((IActionHandlerService) C6193a.m13435a(IActionHandlerService.class)).handle(getContext(), this.f17473af);
                            dismissAllowingStateLoss();
                            return null;
                        }
                    } else {
                        bundle.putString("url", parse.getQueryParameter("url"));
                    }
                } catch (Exception e) {
                    C3854a.m9458a("HybridDialogFragment", e);
                }
            } else if (createLynxFragment instanceof AbstractC9376a) {
                AbstractC9376a aVar2 = (AbstractC9376a) createLynxFragment;
                aVar2.f22870G = this;
                aVar2.f22872I = this.f17495u;
                return aVar2;
            } else {
                C3854a.m9453a(6, "HybridDialogFragment", "fragment is not AbsHybridFragment");
                return null;
            }
        }
        View$OnClickListenerC6986h hVar = new View$OnClickListenerC6986h();
        hVar.setArguments(bundle);
        hVar.f22870G = this;
        hVar.f17545c = this.f17492r;
        hVar.f17519E = this.f17468aa;
        return hVar;
    }

    @Override // com.bytedance.android.livesdk.lynx.p570ui.AbstractC9376a.AbstractC9378b
    /* renamed from: e */
    public final void mo13278e() {
        View view;
        C3854a.m9453a(3, "onPageStarted", String.valueOf(System.currentTimeMillis() - this.f17462U));
        if (this.f11063b) {
            if (this.f17453L && (view = this.f17480f) != null) {
                view.setVisibility(8);
            }
            if (this.f17454M) {
                this.f17467Z = 0;
                if (mo13242c() != null) {
                    mo13242c().setBackgroundColor(this.f17467Z);
                }
            }
            if (this.f17460S || ((this.f17490p.mo13302f() instanceof WebView) && TextUtils.equals(((WebView) this.f17490p.mo13302f()).getUrl(), "about:blank"))) {
                this.f17499y.setVisibility(0);
            } else {
                this.f17499y.setVisibility(8);
            }
            if (this.f17491q) {
                int i = this.f17485k;
                if (i > 0) {
                    mo13272a(i);
                } else {
                    mo13274a(this.f17486l, this.f17487m, this.f17488n, this.f17489o);
                }
            }
            C2943o oVar = this.f17471ad;
            if (oVar != null) {
                oVar.mo7708b();
            }
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.live.core.widget.C4031a
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
    }

    /* renamed from: a */
    public final void mo13272a(int i) {
        if (i > 0) {
            C3907ag.m9541a(this.f17444C, C3966y.m9653a((float) i));
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d
    public Dialog onCreateDialog(Bundle bundle) {
        DialogC69731 r2 = new Dialog(getContext(), getTheme()) {
            /* class com.bytedance.android.livesdk.browser.p463d.C6972a.DialogC69731 */

            static {
                Covode.recordClassIndex(7712);
            }

            public final void onBackPressed() {
                if (C6972a.this.mCancelable) {
                    C6972a.this.dismissAllowingStateLoss();
                }
            }
        };
        r2.requestWindowFeature(1);
        return r2;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        Window window;
        super.onActivityCreated(bundle);
        if (getDialog() != null && (window = getDialog().getWindow()) != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            window.getDecorView().setPadding(0, 0, 0, 0);
            attributes.width = -1;
            attributes.height = -1;
            attributes.gravity = 80;
            attributes.dimAmount = 0.0f;
            window.setAttributes(attributes);
            getDialog();
            mo13273a(this.f17457P, this.f17484j);
            if (this.f17477aj) {
                window.addFlags(65792);
                window.setSoftInputMode(48);
            }
            int i = this.f17485k;
            if (i != 0) {
                mo13272a(i);
            } else {
                mo13274a(this.f17486l, this.f17487m, this.f17489o, this.f17488n);
            }
            window.setBackgroundDrawable(new ColorDrawable());
            if (m14900h()) {
                window.addFlags(32);
            }
            window.setFlags(1024, 1024);
            if (this.f17452K) {
                getDialog().setOnKeyListener(new DialogInterface.OnKeyListener() {
                    /* class com.bytedance.android.livesdk.browser.p463d.C6972a.DialogInterface$OnKeyListenerC69786 */

                    static {
                        Covode.recordClassIndex(7717);
                    }

                    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                        if (i != 4 || C6972a.this.f17490p.mo13302f() == null) {
                            return false;
                        }
                        View f = C6972a.this.f17490p.mo13302f();
                        if (!(f instanceof WebView)) {
                            return false;
                        }
                        WebView webView = (WebView) f;
                        if (!webView.canGoBack()) {
                            return false;
                        }
                        webView.goBack();
                        return true;
                    }
                });
            }
        }
    }

    @Override // com.bytedance.android.livesdk.browser.p463d.View$OnClickListenerC6986h.AbstractC6989a
    /* renamed from: a */
    public final void mo13275a(AbstractC6953a aVar) {
        aVar.mo13237a(this.f17496v);
        aVar.mo13236a().mo29405b("close", new C7186n(this));
        aVar.mo13236a().mo29405b("setHotsoon", new C7121bf(this));
        aVar.mo13236a().mo29405b("setLive", new C7121bf(this));
        aVar.mo13239c().mo29410a("open_live", new C7047a(new WeakReference(getActivity()), this, this.f17496v));
    }

    /* renamed from: a */
    public final void mo13276a(boolean z) {
        setCancelable(z);
        getDialog().setCanceledOnTouchOutside(z);
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment, com.bytedance.android.live.core.widget.C4031a
    public void onCreate(Bundle bundle) {
        boolean z;
        int i;
        Uri parse;
        int b;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null && !this.f17475ah) {
            this.f17483i = arguments.getString("arg_url");
            this.f17457P = arguments.getInt("arg_width");
            this.f17484j = arguments.getInt("arg_height");
            this.f17459R = arguments.getInt("arg_margin");
            this.f17485k = arguments.getInt("arg_radius");
            this.f17486l = arguments.getInt("arg_radius_top_left");
            this.f17487m = arguments.getInt("arg_radius_top_right");
            this.f17489o = arguments.getInt("arg_radius_bottom_right");
            this.f17488n = arguments.getInt("arg_radius_bottom_left");
            this.f17458Q = arguments.getInt("arg_gravity");
            this.f17467Z = arguments.getInt("arg_background_res");
            this.f17468aa = arguments.getString("arg_monitor_page_service");
            this.f17491q = arguments.getBoolean("arg_use_bottom_close");
            this.f17463V = arguments.getBoolean("arg_landscape_custom_height");
            this.f17464W = arguments.getBoolean("arg_landscape_custom_gravity");
            this.f17466Y = arguments.getBoolean("arg_show_dim");
            this.f17469ab = arguments.getBoolean("arg_enable_pull_down_close", false);
            this.f17493s = arguments.getInt("arg_variable_height", 0);
            this.f17494t = arguments.getBoolean("arg_cancel_on_touch_outside");
            this.f17450I = arguments.getBoolean("arg_enable_title_bar");
            this.f17451J = arguments.getBoolean("arg_enable_title_share");
            this.f17481g = arguments.getBoolean("arg_enable_title_share_add_report_action");
            this.f17482h = arguments.getString("arg_report_schema");
            this.f17456O = arguments.getBoolean("arg_enable_title_close");
            this.f17455N = arguments.getString("arg_title");
            this.f17452K = arguments.getBoolean("arg_use_page_back");
            this.f17453L = arguments.getBoolean("arg_use_native_loading");
            this.f17454M = arguments.getBoolean("arg_should_change_bg_res_into_transparent");
            this.f17472ae = arguments.getString("arg_original_scheme");
            this.f17473af = arguments.getString("fallback_schema");
            this.f17496v = arguments.getString("arg_from_label");
            this.f17474ag = arguments.getInt("hybrid_type", C9448e.EnumC9450b.H5.ordinal());
            this.f17497w = arguments.getString("arg_enter_type", "bottom");
            this.f17476ai = arguments.getFloat("arg_mask_alpha");
            this.f17478ak = arguments.getInt("arg_web_bg_color", -1);
            this.f17475ah = true;
        }
        if (getActivity().getRequestedOrientation() == 0) {
            z = true;
        } else {
            z = false;
        }
        this.f17470ac = z;
        if (z) {
            i = R.style.a2k;
        } else {
            i = R.style.a2j;
        }
        setStyle(1, i);
        if (getActivity().getRequestedOrientation() == 0) {
            if (!this.f17463V) {
                this.f17459R = 8;
                this.f17485k = 8;
                this.f17484j = (int) C3966y.m9668e(C3966y.m9662b() - (this.f17459R * 2));
                this.f17457P = 375;
            }
            if (!this.f17464W) {
                this.f17458Q = 8388693;
            }
            if (this.f17465X) {
                this.f17459R = 0;
                this.f17485k = 0;
                this.f17486l = 0;
                this.f17487m = 0;
                this.f17488n = 0;
                this.f17489o = 0;
                this.f17484j = (int) C3966y.m9668e(C3966y.m9662b());
                this.f17457P = 375;
                this.f17467Z = -16777216;
            }
        }
        if (this.f17457P <= 0) {
            this.f17457P = 300;
        }
        if (!TextUtils.isEmpty(this.f17483i) && (parse = Uri.parse(this.f17483i)) != null && (b = C11218ah.m19873b(parse.getQueryParameter("height"))) > 0) {
            this.f17484j = b;
        }
        if (getActivity().getRequestedOrientation() == 0 && ((float) this.f17484j) > C3966y.m9668e(C3966y.m9662b())) {
            this.f17484j = (int) C3966y.m9668e(C3966y.m9662b() - (this.f17459R * 2));
        }
        if (this.f17484j <= 0) {
            this.f17484j = 400;
        }
        if (this.f17491q) {
            this.f17484j += 48;
        }
        if (this.f17485k < 0) {
            this.f17485k = 0;
        }
        if (this.f17486l < 0) {
            this.f17486l = 0;
        }
        if (this.f17487m < 0) {
            this.f17487m = 0;
        }
        if (this.f17489o < 0) {
            this.f17489o = 0;
        }
        if (this.f17488n < 0) {
            this.f17488n = 0;
        }
    }

    @Override // com.bytedance.android.livesdk.browser.jsbridge.AbstractC7033a
    /* renamed from: a */
    public final <T> void mo13267a(String str, T t) {
        AbstractC9376a aVar = this.f17490p;
        if (aVar instanceof AbstractC7033a) {
            aVar.mo13267a(str, t);
        }
    }

    /* renamed from: a */
    public final void mo13273a(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = this.f17444C.getLayoutParams();
        layoutParams.width = C3966y.m9653a((float) i);
        int i3 = this.f17493s;
        if (i3 == 0) {
            i3 = C3966y.m9653a((float) i2);
        }
        if (this.f17450I) {
            i3 = C3966y.m9653a((float) i2);
        }
        layoutParams.height = i3;
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = this.f17458Q;
        }
        if (this.f17493s > 0) {
            getView().post(new RunnableC6985g(this, i2));
        }
        this.f17444C.setLayoutParams(layoutParams);
        this.f17444C.requestLayout();
    }

    @Override // androidx.fragment.app.Fragment, com.bytedance.android.live.core.widget.C4031a
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C2943o oVar = this.f17471ad;
        if (oVar != null) {
            oVar.mo7707a(view, bundle);
        }
        C8299b.m16455a(this.f17444C, this.f17497w, this.f17470ac);
        if (this.f17470ac) {
            ((CoordinatorLayout.C0560e) this.f17498x.getLayoutParams()).mo2538a((CoordinatorLayout.AbstractC0557b) null);
            this.f17498x.requestLayout();
            return;
        }
        LiveBottomSheetBehavior a = LiveBottomSheetBehavior.m9940a(this.f17498x);
        a.mo9578b(C3966y.m9653a((float) this.f17484j));
        if (this.f17458Q == 80) {
            if (this.f17469ab) {
                a.mo9580b(true);
                a.mo9574a(new C8247a() {
                    /* class com.bytedance.android.livesdk.browser.p463d.C6972a.C69742 */

                    static {
                        Covode.recordClassIndex(7713);
                    }

                    @Override // com.bytedance.android.live.design.view.sheet.LiveBottomSheetBehavior.AbstractC4107a, com.bytedance.android.livesdk.container.p510g.C8247a
                    /* renamed from: a */
                    public final void mo9572a(View view, int i) {
                        if (i == 5) {
                            C6972a.this.dismissAllowingStateLoss();
                        }
                    }
                });
            } else {
                a.mo9580b(false);
            }
            if (this.f17493s > 0) {
                ImageView imageView = this.f17479e;
                if (imageView != null) {
                    imageView.setVisibility(0);
                }
                a.mo9574a(new C8247a() {
                    /* class com.bytedance.android.livesdk.browser.p463d.C6972a.C69753 */

                    static {
                        Covode.recordClassIndex(7714);
                    }

                    @Override // com.bytedance.android.live.design.view.sheet.LiveBottomSheetBehavior.AbstractC4107a, com.bytedance.android.livesdk.container.p510g.C8247a
                    /* renamed from: a */
                    public final void mo9571a(View view, float f) {
                        super.mo9571a(view, f);
                        int a = C3966y.m9653a((float) C6972a.this.f17484j);
                        int i = (int) (((float) a) + (((float) (C6972a.this.f17493s - a)) * f));
                        View f2 = C6972a.this.f17490p.mo13302f();
                        if (f2 != null) {
                            C8242a.m16384a(f2, i);
                        }
                    }

                    @Override // com.bytedance.android.live.design.view.sheet.LiveBottomSheetBehavior.AbstractC4107a, com.bytedance.android.livesdk.container.p510g.C8247a
                    /* renamed from: a */
                    public final void mo9572a(View view, int i) {
                        super.mo9572a(view, i);
                        if (C6972a.this.f17479e != null) {
                            if (i == 3) {
                                C6972a.this.f17479e.setImageResource(2131234832);
                            } else if (i == 4) {
                                C6972a.this.f17479e.setImageResource(2131234833);
                            }
                        }
                    }
                });
                return;
            }
            ImageView imageView2 = this.f17479e;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
                return;
            }
            return;
        }
        a.f11415m = false;
    }

    /* renamed from: a */
    public static C6972a m14898a(AbstractC6956d.C6958b bVar, C2943o oVar) {
        C7024a.m14981a(bVar.f17397a);
        if (TextUtils.equals(Uri.parse(bVar.f17397a).getQueryParameter("landscape"), "1")) {
            bVar.f17411o = true;
        }
        C6972a aVar = new C6972a();
        aVar.f17483i = bVar.f17397a;
        aVar.f17457P = bVar.f17398b;
        aVar.f17484j = bVar.f17399c;
        aVar.f17458Q = bVar.f17406j;
        aVar.f17485k = bVar.f17401e;
        aVar.f17459R = bVar.f17400d;
        aVar.f17486l = bVar.f17402f;
        aVar.f17487m = bVar.f17403g;
        aVar.f17489o = bVar.f17404h;
        aVar.f17488n = bVar.f17405i;
        aVar.f17491q = bVar.f17409m;
        aVar.f17492r = bVar.f17417u;
        aVar.f17463V = bVar.f17410n;
        aVar.f17465X = bVar.f17411o;
        aVar.f17464W = bVar.f17412p;
        aVar.f17466Y = bVar.f17413q;
        aVar.f17469ab = bVar.f17394H;
        aVar.f17493s = bVar.f17395I;
        aVar.f17467Z = bVar.f17407k;
        aVar.f17468aa = bVar.f17418v;
        aVar.f17494t = bVar.f17419w;
        aVar.f17450I = bVar.f17421y;
        aVar.f17451J = bVar.f17422z;
        aVar.f17481g = bVar.f17387A;
        aVar.f17482h = bVar.f17388B;
        aVar.f17456O = bVar.f17389C;
        aVar.f17455N = bVar.f17420x;
        aVar.f17452K = bVar.f17414r;
        aVar.f17453L = bVar.f17415s;
        aVar.f17454M = bVar.f17416t;
        aVar.f17496v = bVar.f17390D;
        aVar.f17472ae = bVar.f17391E;
        aVar.f17497w = bVar.f17392F;
        aVar.f17476ai = bVar.f17393G;
        aVar.f17477aj = bVar.f17396J;
        aVar.f17475ah = true;
        aVar.f17471ad = oVar;
        if (oVar != null) {
            C89219l.m154721d(aVar, "");
            oVar.f8684a = aVar;
        }
        return aVar;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        View view;
        int i2;
        int i3;
        String str;
        long currentTimeMillis = System.currentTimeMillis();
        this.f17461T = currentTimeMillis;
        C3854a.m9453a(3, "onCreateView", String.valueOf(currentTimeMillis));
        LayoutInflater from = LayoutInflater.from(getContext());
        C2943o oVar = this.f17471ad;
        if (oVar == null || oVar.mo7706a() <= 0) {
            i = R.layout.b4b;
        } else {
            i = this.f17471ad.mo7706a();
        }
        View a = C1764a.m5927a(from, i, viewGroup, false);
        this.f17498x = a.findViewById(R.id.dnh);
        this.f17442A = a.findViewById(R.id.acf);
        this.f17443B = a.findViewById(R.id.d4p);
        this.f17444C = a.findViewById(R.id.ack);
        this.f17445D = a.findViewById(R.id.eiz);
        this.f17499y = a.findViewById(R.id.djd);
        this.f17500z = a.findViewById(R.id.fid);
        this.f17448G = a.findViewById(R.id.btd);
        this.f17446E = a.findViewById(R.id.ej2);
        this.f17447F = a.findViewById(R.id.ej7);
        this.f17449H = (TextView) a.findViewById(R.id.ej8);
        this.f17480f = a.findViewById(R.id.cg3);
        this.f17479e = (ImageView) a.findViewById(R.id.bg8);
        if (m14900h() || !this.f17494t) {
            getDialog().hide();
        } else {
            mo13276a(true);
        }
        ViewGroup.LayoutParams layoutParams = this.f17500z.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
        }
        marginLayoutParams.setMargins(C3966y.m9653a((float) this.f17459R), C3966y.m9653a((float) this.f17459R), C3966y.m9653a((float) this.f17459R), C3966y.m9653a((float) this.f17459R));
        this.f17500z.setLayoutParams(marginLayoutParams);
        AbstractC9376a i4 = m14901i();
        this.f17490p = i4;
        if (i4 == null) {
            return a;
        }
        AbstractC0976n a2 = getChildFragmentManager().mo3552a();
        a2.mo3469b(R.id.fid, this.f17490p);
        a2.mo3473c();
        this.f17490p.f22871H = this;
        AbstractC2928f fVar = (AbstractC2928f) C6193a.m13435a(AbstractC2928f.class);
        if (fVar != null) {
            AbstractC2936j hybridDialogManager = fVar.getHybridDialogManager();
            if (TextUtils.isEmpty(this.f17496v)) {
                str = "ungroup";
            } else {
                str = this.f17496v;
            }
            hybridDialogManager.mo7675a(str, this);
        }
        this.f17443B.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.android.livesdk.browser.p463d.C6972a.View$OnClickListenerC69764 */

            static {
                Covode.recordClassIndex(7715);
            }

            public final void onClick(View view) {
                if (C6972a.this.f17494t) {
                    C6972a.this.dismissAllowingStateLoss();
                }
                C18484a aVar = new C18484a("container_popupTapSpace", System.currentTimeMillis(), null);
                aVar.mo29624a(C6972a.this.mo9425j_());
                C18494b.m34415a(aVar);
            }
        });
        if (this.f17466Y) {
            this.f17443B.setBackgroundColor(((int) ((this.f17476ai * 255.0f) + 0.5f)) << 24);
        } else {
            this.f17443B.setBackgroundColor(0);
        }
        this.f17499y.setOnClickListener(new View$OnClickListenerC6980b(this));
        a.post(new RunnableC6981c(this));
        View view2 = this.f17445D;
        if (view2 != null) {
            int i5 = 8;
            if (this.f17450I) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            view2.setVisibility(i2);
            View view3 = this.f17446E;
            if (this.f17456O) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            view3.setVisibility(i3);
            this.f17446E.setOnClickListener(new View$OnClickListenerC6982d(this));
            View view4 = this.f17447F;
            if (this.f17451J) {
                i5 = 0;
            }
            view4.setVisibility(i5);
            this.f17447F.setOnClickListener(new View$OnClickListenerC6983e(this));
            this.f17449H.setText(this.f17455N);
            if (this.f17491q) {
                this.f17448G.setVisibility(0);
                this.f17448G.setOnClickListener(new View$OnClickListenerC6984f(this));
            }
            if (this.f17450I) {
                a.findViewById(R.id.ej6).setVisibility(0);
            }
        }
        if (this.f17453L && (view = this.f17480f) != null) {
            view.setVisibility(0);
        }
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo13274a(int i, int i2, int i3, int i4) {
        if (i >= 0 && i2 >= 0 && i3 >= 0 && i4 >= 0) {
            C3907ag.m9542b(this.f17444C, C3966y.m9653a((float) i));
        }
    }
}
