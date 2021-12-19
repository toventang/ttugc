package com.p2082ss.android.p2092ad.splash.core;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Message;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.ContextThemeWrapper;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.p2092ad.splash.AbstractC29675p;
import com.p2082ss.android.p2092ad.splash.core.p2096a.AbstractView$OnClickListenerC29388a;
import com.p2082ss.android.p2092ad.splash.core.p2098c.C29446b;
import com.p2082ss.android.p2092ad.splash.core.p2100e.C29455b;
import com.p2082ss.android.p2092ad.splash.core.p2100e.C29457c;
import com.p2082ss.android.p2092ad.splash.core.p2100e.C29462f;
import com.p2082ss.android.p2092ad.splash.core.p2100e.C29463g;
import com.p2082ss.android.p2092ad.splash.core.p2100e.C29469m;
import com.p2082ss.android.p2092ad.splash.core.p2102g.C29487a;
import com.p2082ss.android.p2092ad.splash.core.p2102g.C29488b;
import com.p2082ss.android.p2092ad.splash.core.p2104i.AbstractC29503a;
import com.p2082ss.android.p2092ad.splash.core.p2104i.C29506c;
import com.p2082ss.android.p2092ad.splash.core.p2105j.C29526a;
import com.p2082ss.android.p2092ad.splash.core.p2105j.C29528b;
import com.p2082ss.android.p2092ad.splash.core.p2105j.C29529c;
import com.p2082ss.android.p2092ad.splash.core.p2105j.C29533d;
import com.p2082ss.android.p2092ad.splash.core.p2105j.C29534e;
import com.p2082ss.android.p2092ad.splash.core.video2.AbstractC29612b;
import com.p2082ss.android.p2092ad.splash.core.video2.AbstractC29621g;
import com.p2082ss.android.p2092ad.splash.core.video2.BDASplashVideoView;
import com.p2082ss.android.p2092ad.splash.core.video2.C29613c;
import com.p2082ss.android.p2092ad.splash.core.video2.C29618f;
import com.p2082ss.android.p2092ad.splash.p2094b.C29375a;
import com.p2082ss.android.p2092ad.splash.p2095c.AbstractC29383a;
import com.p2082ss.android.p2092ad.splash.p2109f.C29638a;
import com.p2082ss.android.p2092ad.splash.p2109f.C29640c;
import com.p2082ss.android.p2092ad.splash.p2109f.C29644g;
import com.p2082ss.android.p2092ad.splash.p2109f.C29646i;
import com.p2082ss.android.p2092ad.splash.p2109f.C29654j;
import com.p2082ss.android.p2092ad.splash.p2109f.C29657l;
import com.p2082ss.android.p2092ad.splash.p2109f.C29658m;
import com.p2082ss.android.p2092ad.splash.p2109f.C29661o;
import com.p2082ss.android.p2092ad.splash.p2109f.HandlerC29663q;
import com.p2082ss.android.ugc.trill.R;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.core.c */
public final class C29411c extends RelativeLayout implements AbstractC29502i, HandlerC29663q.AbstractC29664a {

    /* renamed from: A */
    public HandlerC29663q f69845A = new HandlerC29663q(this);

    /* renamed from: B */
    public int f69846B = 0;

    /* renamed from: C */
    public int f69847C = 1;

    /* renamed from: D */
    AlphaAnimation f69848D;

    /* renamed from: E */
    GestureDetector f69849E;

    /* renamed from: F */
    GestureDetector f69850F;

    /* renamed from: G */
    GestureDetector.SimpleOnGestureListener f69851G;

    /* renamed from: H */
    C29487a f69852H;

    /* renamed from: I */
    public AnimatorSet f69853I;

    /* renamed from: J */
    public ValueAnimator f69854J;

    /* renamed from: K */
    C29488b f69855K;

    /* renamed from: L */
    public AbstractC29621g f69856L;

    /* renamed from: M */
    public boolean f69857M = false;

    /* renamed from: N */
    public boolean f69858N = false;

    /* renamed from: O */
    private final long f69859O = 300;

    /* renamed from: P */
    private LinearLayout f69860P;

    /* renamed from: Q */
    private ViewStub f69861Q;

    /* renamed from: R */
    private BDASplashImageView f69862R;

    /* renamed from: S */
    private RelativeLayout f69863S;

    /* renamed from: T */
    private ImageView f69864T;

    /* renamed from: U */
    private TextView f69865U;

    /* renamed from: V */
    private C29526a f69866V;

    /* renamed from: W */
    private long f69867W = System.currentTimeMillis();

    /* renamed from: a */
    RelativeLayout f69868a;

    /* renamed from: aa */
    private boolean f69869aa;

    /* renamed from: ab */
    private String f69870ab;

    /* renamed from: ac */
    private String f69871ac;

    /* renamed from: ad */
    private Timer f69872ad;

    /* renamed from: ae */
    private Space f69873ae;

    /* renamed from: af */
    private boolean f69874af = true;

    /* renamed from: ag */
    private boolean f69875ag = false;

    /* renamed from: b */
    public FrameLayout f69876b;

    /* renamed from: c */
    Space f69877c;

    /* renamed from: d */
    public ImageView f69878d;

    /* renamed from: e */
    public TextView f69879e;

    /* renamed from: f */
    public BDASplashVideoView f69880f;

    /* renamed from: g */
    public RelativeLayout f69881g;

    /* renamed from: h */
    TextView f69882h;

    /* renamed from: i */
    public LinearLayout f69883i;

    /* renamed from: j */
    public FrameLayout f69884j;

    /* renamed from: k */
    TextView f69885k;

    /* renamed from: l */
    public C29529c f69886l;

    /* renamed from: m */
    public C29533d f69887m;

    /* renamed from: n */
    public ImageView f69888n;

    /* renamed from: o */
    C29528b f69889o;

    /* renamed from: p */
    public TextView f69890p;

    /* renamed from: q */
    public View f69891q;

    /* renamed from: r */
    View f69892r;

    /* renamed from: s */
    public boolean f69893s;

    /* renamed from: t */
    long f69894t;

    /* renamed from: u */
    public int f69895u = -1;

    /* renamed from: v */
    boolean f69896v;

    /* renamed from: w */
    public boolean f69897w = true;

    /* renamed from: x */
    public boolean f69898x;

    /* renamed from: y */
    public C29455b f69899y;

    /* renamed from: z */
    public AbstractC29541p f69900z;

    static {
        Covode.recordClassIndex(35805);
    }

    /* renamed from: a */
    public final boolean mo51456a(MotionEvent motionEvent) {
        C29487a aVar;
        C29488b bVar = this.f69855K;
        if (bVar != null && bVar.mo51577a()) {
            int action = motionEvent.getAction();
            if (action == 0) {
                bVar.f70168f.set(motionEvent.getX(), motionEvent.getY());
            } else if (action == 1 || action == 3) {
                float x = motionEvent.getX() - bVar.f70168f.x;
                float y = motionEvent.getY() - bVar.f70168f.y;
                if (Math.abs(x) <= Math.abs(y) && y < 0.0f && Math.abs(y) >= ((float) bVar.f70169g)) {
                    bVar.f70167e.mo51476a();
                    return true;
                }
            }
        }
        GestureDetector gestureDetector = this.f69850F;
        if (gestureDetector != null && gestureDetector.onTouchEvent(motionEvent)) {
            return true;
        }
        if (motionEvent.getAction() != 1 || (aVar = this.f69852H) == null || !aVar.mo51504a(motionEvent)) {
            return this.f69857M;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo51457a(final C29455b bVar) {
        if (bVar.mo51541g()) {
            ViewGroup.LayoutParams layoutParams = this.f69877c.getLayoutParams();
            layoutParams.height = C29654j.m59702a();
            this.f69877c.setLayoutParams(layoutParams);
            this.f69877c.setVisibility(4);
            this.f69878d.setVisibility(8);
        } else {
            this.f69877c.setVisibility(8);
            this.f69878d.setVisibility(0);
        }
        C29462f fVar = bVar.f70001a;
        String b = C29654j.m59739b(fVar);
        if (C29657l.m59760a(b) || C29495h.f70229e == null) {
            return false;
        }
        C2941815 r12 = new AbstractC29675p() {
            /* class com.p2082ss.android.p2092ad.splash.core.C29411c.C2941815 */

            static {
                Covode.recordClassIndex(35812);
            }

            @Override // com.p2082ss.android.p2092ad.splash.AbstractC29675p
            /* renamed from: c */
            public final void mo51420c() {
                C29411c.this.mo51449a();
                C29411c.this.f69900z.mo51658a();
            }

            @Override // com.p2082ss.android.p2092ad.splash.AbstractC29675p
            /* renamed from: a */
            public final void mo51418a() {
                C29411c.this.mo51459b(1);
                C29411c cVar = C29411c.this;
                cVar.mo51451a(cVar.f69899y.mo51536c());
            }

            @Override // com.p2082ss.android.p2092ad.splash.AbstractC29675p
            /* renamed from: b */
            public final void mo51419b() {
                if (C29495h.m59095a().f70668p) {
                    C29411c.this.mo51455a(false);
                    return;
                }
                C29411c.this.mo51449a();
                C29411c.this.f69900z.mo51659a(bVar);
            }
        };
        if (TextUtils.isEmpty(fVar.f70079e)) {
            C29495h.f70229e.mo28692a(this.f69862R, b, bVar.f70035m, r12);
        } else {
            C29495h.f70229e.mo28693a(this.f69862R, b, bVar.f70035m, fVar.f70079e, r12);
        }
        try {
            if (bVar.f70039q == 0 || bVar.f70039q == 4) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("show_expected", Integer.valueOf(bVar.f70025c));
                String str = "not_real_time";
                if (bVar.f69978C) {
                    str = "real_time";
                }
                jSONObject.putOpt("show_type", str);
                if (C29495h.f70200X != -1) {
                    jSONObject.put("awemelaunch", C29495h.f70200X == 1 ? 1 : 2);
                }
                jSONObject.put("ad_sequence", C29556v.m59363a().mo51759p());
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.putOpt("ad_extra_data", jSONObject);
                jSONObject2.put("is_ad_event", "1");
                if (!C29657l.m59760a(bVar.f70032j)) {
                    jSONObject2.put("log_extra", bVar.f70032j);
                }
                jSONObject2.put("ad_fetch_time", bVar.f70024b);
                C29495h.m59099a(bVar.f70026d, "splash_ad", "show", jSONObject2);
                C29506c.C29507a aVar = new C29506c.C29507a();
                aVar.f70264a = C29654j.m59706a((AbstractC29383a) bVar);
                C29506c a = aVar.mo51606a();
                if (C29495h.m59095a().f70654b) {
                    C29495h.m59108g().mo51602a(null, "show", bVar.f70026d, bVar.f70046x, bVar.f70032j, true, -1, null, a);
                } else {
                    C29495h.m59108g().mo51601a(null, bVar.f70026d, bVar.f70046x, bVar.f70032j, true, -1, null, a);
                }
            }
            this.f69862R.f69769a = bVar;
            this.f69862R.setInteraction(this.f69900z);
            this.f69862R.setVisibility(0);
            return true;
        } catch (Exception unused) {
            mo51449a();
            this.f69900z.mo51658a();
            return false;
        }
    }

    /* renamed from: a */
    public final void mo51453a(C29455b bVar, float f, float f2, boolean z) {
        mo51454a(bVar, f, f2, z, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0047, code lost:
        if (r4 == false) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0051, code lost:
        if (r0.mo51867e() != false) goto L_0x0053;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo51455a(boolean r4) {
        /*
        // Method dump skipped, instructions count: 118
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.p2092ad.splash.core.C29411c.mo51455a(boolean):void");
    }

    /* renamed from: a */
    public final void mo51452a(C29455b bVar, float f, float f2) {
        C29638a.m59659a(bVar.f70026d, "click ad");
        String str = this.f69893s ? "click_normal_area" : "";
        C29457c.C29458a aVar = new C29457c.C29458a();
        aVar.f70059a = 0;
        C29457c.C29458a a = aVar.mo51556a((int) f, (int) f2);
        a.f70062d = this.f69893s;
        a.f70061c = str;
        if (this.f69900z.mo51661a(bVar, a.mo51557a())) {
            mo51449a();
        }
    }

    /* renamed from: a */
    public final void mo51454a(C29455b bVar, float f, float f2, boolean z, String str) {
        C29638a.m59659a(bVar.f70026d, "click ad");
        C29457c.C29458a aVar = new C29457c.C29458a();
        aVar.f70060b = z;
        C29457c.C29458a a = aVar.mo51556a((int) f, (int) f2);
        if (!TextUtils.isEmpty(str)) {
            a.f70067i = str;
        }
        if (this.f69896v) {
            a.f70065g = this.f69847C;
            C29529c cVar = this.f69886l;
            if (!(cVar == null || cVar.getBDAVideoController() == null)) {
                a.f70066h = (long) this.f69886l.getBDAVideoController().mo51868f();
            }
        }
        if (this.f69900z.mo51664b(bVar, a.mo51557a())) {
            mo51449a();
            this.f69895u = 1;
            if (this.f69856L != null) {
                mo51466i();
            }
            C29529c cVar2 = this.f69886l;
            if (cVar2 != null && cVar2.getBDAVideoController() != null) {
                this.f69886l.setBreakReason(this.f69895u);
                this.f69886l.getBDAVideoController().mo51863b();
            }
        }
    }

    /* renamed from: d */
    public final boolean mo51461d() {
        if (this.f69846B > 1) {
            return true;
        }
        return false;
    }

    public final boolean performClick() {
        return super.performClick();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo51463f() {
        this.f69883i.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
            /* class com.p2082ss.android.p2092ad.splash.core.C29411c.View$OnLayoutChangeListenerC294439 */

            /* renamed from: b */
            private int f69947b;

            static {
                Covode.recordClassIndex(35837);
            }

            /* renamed from: a */
            private void m58967a(int i) {
                C29469m mVar = C29411c.this.f69899y.f69987L;
                boolean z = true;
                if (mVar == null || !mVar.mo51559a(1)) {
                    z = false;
                }
                if (!C29495h.m59095a().f70669q || !z) {
                    C29411c.this.f69883i.setTranslationY(C29411c.this.f69883i.getTranslationY() + ((float) i));
                } else {
                    m58968a(C29411c.this.f69878d, i);
                    m58968a(C29411c.this.f69879e, i);
                    C29411c.this.f69884j.setPadding(C29411c.this.f69884j.getPaddingLeft(), C29411c.this.f69884j.getPaddingTop() + i, C29411c.this.f69884j.getPaddingRight(), C29411c.this.f69884j.getPaddingBottom());
                }
                C29411c.this.f69883i.removeOnLayoutChangeListener(this);
            }

            /* renamed from: a */
            private static void m58968a(View view, int i) {
                if (view.getVisibility() == 0) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    marginLayoutParams.topMargin += i;
                    view.setLayoutParams(marginLayoutParams);
                }
            }

            /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                Context context;
                boolean contains;
                boolean b;
                int a;
                if (C29411c.this.f69883i != null) {
                    this.f69947b++;
                    int[] iArr = {0, 0};
                    C29411c.this.f69883i.getLocationOnScreen(iArr);
                    int i9 = iArr[1];
                    int paddingTop = C29411c.this.f69883i.getPaddingTop();
                    LinearLayout linearLayout = C29411c.this.f69883i;
                    if (linearLayout == null || (context = linearLayout.getContext()) == null) {
                        a = 0;
                    } else {
                        String lowerCase = Build.BRAND.toLowerCase();
                        switch (lowerCase.hashCode()) {
                            case -1206476313:
                                if (lowerCase.equals("huawei")) {
                                    if (C29640c.f70698b == null) {
                                        C29640c.f70698b = Arrays.asList("GLK-AL00");
                                    }
                                    contains = C29640c.f70698b.contains(Build.MODEL);
                                    break;
                                }
                                contains = false;
                                break;
                            case -759499589:
                                if (lowerCase.equals("xiaomi")) {
                                }
                                contains = false;
                                break;
                            case 3418016:
                                if (lowerCase.equals("oppo")) {
                                }
                                contains = false;
                                break;
                            case 3620012:
                                if (lowerCase.equals("vivo")) {
                                }
                                contains = false;
                                break;
                            case 97536331:
                                if (lowerCase.equals("flyme")) {
                                }
                                contains = false;
                                break;
                            default:
                                contains = false;
                                break;
                        }
                        if (contains) {
                            b = true;
                        } else if (C29640c.m59667a("huawei") || C29640c.m59667a("honor")) {
                            b = C29640c.m59668b(linearLayout);
                        } else if (C29640c.m59667a("oppo")) {
                            b = linearLayout.getContext().getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
                        } else if (C29640c.m59667a("vivo")) {
                            b = C29640c.m59669c(linearLayout);
                        } else if (C29640c.m59667a("xiaomi")) {
                            b = C29640c.m59670d(linearLayout);
                        } else if (C29640c.m59667a("flyme")) {
                            b = C29640c.m59671e(linearLayout);
                        } else if (Build.VERSION.SDK_INT >= 28) {
                            b = C29640c.m59672f(linearLayout);
                        } else {
                            b = false;
                        }
                        Boolean valueOf = Boolean.valueOf(b);
                        C29640c.f70697a = valueOf;
                        if (valueOf.booleanValue()) {
                            C29644g.m59688b("has notch");
                            if (Build.VERSION.SDK_INT >= 28) {
                                Activity i10 = C29640c.m59675i(linearLayout);
                                if (i10 == null) {
                                    C29644g.m59688b("failed to get activity");
                                } else {
                                    int i11 = i10.getWindow().getAttributes().layoutInDisplayCutoutMode;
                                    if (i11 == 2) {
                                        C29644g.m59688b("layout mode never");
                                    } else if (i11 == 1) {
                                        C29644g.m59688b("layout mode short edges");
                                        if (C29640c.m59673g(linearLayout) || C29640c.m59674h(linearLayout)) {
                                            a = C29640c.m59666a(linearLayout);
                                            if (C29640c.f70697a.booleanValue() && a == 0 && i9 == 0) {
                                                a = C29646i.m59698a(context);
                                            }
                                        }
                                    } else {
                                        C29644g.m59688b("layout mode default");
                                        if (C29640c.m59674h(linearLayout)) {
                                            a = C29640c.m59666a(linearLayout);
                                            a = C29646i.m59698a(context);
                                        }
                                    }
                                }
                            } else if (C29640c.m59673g(linearLayout) || C29640c.m59674h(linearLayout)) {
                                a = C29640c.m59666a(linearLayout);
                                a = C29646i.m59698a(context);
                            }
                        } else {
                            C29644g.m59688b("no notch");
                            if (!C29495h.m59095a().f70659g && C29640c.m59674h(linearLayout)) {
                                a = C29640c.m59666a(linearLayout);
                                a = C29646i.m59698a(context);
                            }
                        }
                        a = 0;
                        a = C29646i.m59698a(context);
                    }
                    C29644g.m59688b("screenY:" + i9 + " paddingTop:" + paddingTop + " safeInsetTop:" + a);
                    if (i9 + paddingTop < a) {
                        int i12 = (a - i9) - paddingTop;
                        C29644g.m59688b("adjust translationY:" + i12 + ". triedTimes:" + this.f69947b);
                        m58967a(i12);
                    } else {
                        C29644g.m59688b("no need to adjust translationY. triedTimes:" + this.f69947b);
                    }
                    if (this.f69947b >= 3) {
                        m58967a(0);
                    }
                }
            }
        });
    }

    /* renamed from: h */
    public final void mo51465h() {
        this.f69845A.removeMessages(1);
        this.f69845A.sendEmptyMessageDelayed(1, this.f69894t);
    }

    /* renamed from: j */
    private void m58918j() {
        if (this.f69872ad == null) {
            Timer timer = new Timer();
            this.f69872ad = timer;
            timer.scheduleAtFixedRate(new TimerTask() {
                /* class com.p2082ss.android.p2092ad.splash.core.C29411c.C2942017 */

                static {
                    Covode.recordClassIndex(35814);
                }

                public final void run() {
                    Message obtainMessage = C29411c.this.f69845A.obtainMessage();
                    obtainMessage.what = 2;
                    C29411c.this.f69845A.sendMessage(obtainMessage);
                }
            }, (this.f69894t % 1000) + 1000, 1000);
        }
    }

    /* renamed from: i */
    public final void mo51466i() {
        RunnableC2942622 r1 = new Runnable() {
            /* class com.p2082ss.android.p2092ad.splash.core.C29411c.RunnableC2942622 */

            static {
                Covode.recordClassIndex(35820);
            }

            public final void run() {
                C29411c.this.f69856L.mo51863b();
            }
        };
        if (C29495h.m59095a().f70663k) {
            post(r1);
        } else {
            r1.run();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C29644g.m59688b("Detached!");
        m58919k();
        C29495h.m59109h().mo51600i();
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.AbstractC29502i
    /* renamed from: b */
    public final void mo51391b() {
        C29529c cVar = this.f69886l;
        if (cVar != null && cVar.getBDAVideoController() != null) {
            this.f69886l.getBDAVideoController().mo51860a(this.f69897w);
        }
    }

    /* renamed from: g */
    public final void mo51464g() {
        C29529c cVar;
        C29638a.m59659a(this.f69899y.f70026d, "skip ad");
        if (!this.f69896v || (cVar = this.f69886l) == null) {
            this.f69900z.mo51660a(this.f69899y, -1);
        } else {
            cVar.setBreakReason(2);
            this.f69886l.mo51626a();
        }
        if (this.f69856L != null) {
            this.f69895u = 2;
            mo51466i();
        }
        mo51449a();
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!C29495h.m59095a().f70668p) {
            m58918j();
        }
        C29644g.m59688b("setSplashShowTime: ");
        C29539n.m59216a().mo51655a(System.currentTimeMillis());
        this.f69900z.mo51662b();
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
            /* class com.p2082ss.android.p2092ad.splash.core.C29411c.ViewTreeObserver$OnPreDrawListenerC2942118 */

            static {
                Covode.recordClassIndex(35815);
            }

            public final boolean onPreDraw() {
                if (C29411c.this.f69899y != null && C29411c.this.f69899y.f70039q == 0 && C29411c.this.f69899y.f70035m == 0) {
                    C29411c.this.mo51459b(0);
                }
                C29411c.this.getViewTreeObserver().removeOnPreDrawListener(this);
                if (!C29495h.m59095a().f70668p) {
                    C29411c.this.mo51465h();
                }
                C29411c.this.f69900z.mo51663b(C29411c.this.f69899y);
                return true;
            }
        });
        C29535k.m59196a().mo51647a(this.f69899y.f70026d, 1000);
    }

    /* renamed from: k */
    private void m58919k() {
        BDASplashImageView bDASplashImageView = this.f69862R;
        if (bDASplashImageView != null) {
            try {
                Bitmap bitmap = ((BitmapDrawable) bDASplashImageView.getDrawable()).getBitmap();
                if (bitmap != null && !bitmap.isRecycled()) {
                    bitmap.recycle();
                    this.f69862R.setImageBitmap(null);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        C29618f.m59608a().mo51909b();
        C29529c cVar = this.f69886l;
        if (cVar != null) {
            cVar.mo51627b();
        }
        AbstractC29621g gVar = this.f69856L;
        if (gVar != null) {
            gVar.mo51872j();
            this.f69856L = null;
            this.f69880f = null;
        }
        if (this.f69872ad != null) {
            C29644g.m59688b("splash_count_down. detach: timer canceled");
            this.f69872ad.cancel();
            this.f69872ad = null;
        }
        AlphaAnimation alphaAnimation = this.f69848D;
        if (alphaAnimation != null) {
            alphaAnimation.cancel();
            this.f69848D = null;
        }
        C29533d dVar = this.f69887m;
        if (dVar != null) {
            dVar.mo51641a();
        }
        this.f69896v = false;
        AnimatorSet animatorSet = this.f69853I;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f69853I = null;
        }
        ValueAnimator valueAnimator = this.f69854J;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f69854J = null;
        }
    }

    /* renamed from: l */
    private void m58920l() {
        if (this.f69856L != null) {
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            hashMap.put("duration", Long.toString((long) this.f69856L.mo51868f()));
            hashMap.put("percent", Integer.valueOf(C29658m.m59761a((long) this.f69856L.mo51868f(), (long) this.f69856L.mo51869g())));
            hashMap.put("break_reason", 9);
            hashMap2.put("break_reason", 9);
            hashMap2.put("play_order", 1);
            C29446b.m58971a();
            C29446b.m58973a(this.f69899y, 0, "play_break", hashMap, hashMap2);
            C29495h.m59109h().mo51598g();
        }
    }

    /* renamed from: a */
    public final void mo51449a() {
        this.f69898x = true;
        if (C29495h.m59095a().f70668p) {
            this.f69845A.removeMessages(1);
        }
    }

    /* renamed from: e */
    public final void mo51462e() {
        this.f69890p.setVisibility(0);
        this.f69890p.setTextSize(1, 15.0f);
        this.f69890p.setTextColor(-1);
        this.f69890p.setY((float) this.f69868a.getBottom());
        this.f69890p.setGravity(17);
        this.f69890p.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        this.f69891q.setAlpha(0.0f);
        this.f69891q.setVisibility(0);
        this.f69891q.setY(((float) this.f69868a.getBottom()) - C29661o.m59767a(getContext(), 50.0f));
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.AbstractC29502i
    /* renamed from: c */
    public final void mo51394c() {
        C29644g.m59688b("on background");
        AbstractC29621g gVar = this.f69856L;
        if (gVar != null) {
            gVar.mo51860a(true);
        }
        C29529c cVar = this.f69886l;
        if (cVar != null && cVar.getBDAVideoController() != null) {
            AbstractC29621g bDAVideoController = this.f69886l.getBDAVideoController();
            bDAVideoController.mo51860a(true);
            if (bDAVideoController.mo51867e()) {
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                hashMap.put("percent", Integer.valueOf(C29658m.m59761a((long) bDAVideoController.mo51868f(), (long) bDAVideoController.mo51869g())));
                hashMap.put("is_ad_event", "1");
                hashMap.put("ad_fetch_time", Long.valueOf(this.f69899y.f70024b));
                hashMap.put("break_reason", 7);
                if (!C29657l.m59760a(this.f69899y.f70032j)) {
                    hashMap.put("log_extra", this.f69899y.f70032j);
                }
                hashMap2.put("position", Integer.valueOf(2 - this.f69847C));
                hashMap2.put("duration", Long.toString((long) bDAVideoController.mo51868f()));
                hashMap2.put("break_reason", 7);
                hashMap2.put("play_order", 1);
                C29446b.m58971a();
                C29446b.m58973a(this.f69899y, 0, "play_break", hashMap, hashMap2);
            }
        }
    }

    public final void setSplashAdInteraction(AbstractC29541p pVar) {
        this.f69900z = pVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final AbstractC29612b mo51458b(final C29455b bVar) {
        return new C29613c() {
            /* class com.p2082ss.android.p2092ad.splash.core.C29411c.C2942521 */

            static {
                Covode.recordClassIndex(35819);
            }

            @Override // com.p2082ss.android.p2092ad.splash.core.video2.C29613c
            /* renamed from: c */
            public final void mo51488c() {
                C29495h.m59109h().mo51596e();
            }

            @Override // com.p2082ss.android.p2092ad.splash.core.video2.C29613c
            /* renamed from: e */
            public final void mo51492e() {
                C29495h.m59109h().mo51597f();
            }

            @Override // com.p2082ss.android.p2092ad.splash.core.video2.AbstractC29612b, com.p2082ss.android.p2092ad.splash.core.video2.C29613c
            /* renamed from: b */
            public final void mo51424b() {
                C29411c.this.mo51449a();
                C29411c.this.f69900z.mo51658a();
            }

            @Override // com.p2082ss.android.p2092ad.splash.core.video2.C29613c
            /* renamed from: d */
            public final void mo51490d() {
                C29455b bVar = C29411c.this.f69899y;
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                hashMap2.put("play_order", 1);
                C29446b.m58971a();
                C29446b.m58973a(bVar, 0, "resume", hashMap, hashMap2);
            }

            @Override // com.p2082ss.android.p2092ad.splash.core.video2.AbstractC29612b, com.p2082ss.android.p2092ad.splash.core.video2.C29613c
            /* renamed from: a */
            public final void mo51421a() {
                int i = 2;
                C29411c.this.mo51459b(2);
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject.put("show_expected", bVar.f70025c);
                    String str = "not_real_time";
                    if (bVar.f69978C) {
                        str = "real_time";
                    }
                    jSONObject.put("show_type", str);
                    jSONObject.putOpt("play_order", 1);
                    if (C29495h.f70200X != -1) {
                        if (C29495h.f70200X == 1) {
                            i = 1;
                        }
                        jSONObject.put("awemelaunch", i);
                    }
                    jSONObject.put("ad_sequence", C29556v.m59363a().mo51759p());
                    jSONObject2.putOpt("ad_extra_data", jSONObject);
                    jSONObject2.putOpt("is_ad_event", "1");
                    if (!C29657l.m59760a(bVar.f70032j)) {
                        jSONObject2.put("log_extra", bVar.f70032j);
                    }
                    jSONObject2.put("ad_fetch_time", bVar.f70024b);
                } catch (JSONException e) {
                    e.printStackTrace();
                    jSONObject2 = null;
                }
                C29495h.m59099a(bVar.f70026d, "splash_ad", "play", jSONObject2);
                if (bVar.f70040r != null) {
                    C29506c.C29507a aVar = new C29506c.C29507a();
                    aVar.f70264a = C29654j.m59706a((AbstractC29383a) bVar);
                    C29506c a = aVar.mo51606a();
                    if (C29495h.m59095a().f70654b) {
                        C29495h.m59108g().mo51602a(null, "play", bVar.f70026d, bVar.f70040r.f70121a, bVar.f70032j, true, -1, null, a);
                    } else {
                        C29495h.m59108g().mo51604c(null, bVar.f70026d, bVar.f70040r.f70121a, bVar.f70032j, true, -1, null, a);
                    }
                }
                AbstractC29503a h = C29495h.m59109h();
                long g = (long) C29411c.this.f69856L.mo51869g();
                C29411c.this.f69856L.mo51865c();
                C29411c.this.f69856L.mo51866d();
                h.mo51590a(g);
            }

            @Override // com.p2082ss.android.p2092ad.splash.core.video2.AbstractC29612b, com.p2082ss.android.p2092ad.splash.core.video2.C29613c
            /* renamed from: b */
            public final void mo51487b(int i) {
                C29411c.this.mo51451a((long) i);
            }

            @Override // com.p2082ss.android.p2092ad.splash.core.video2.AbstractC29612b, com.p2082ss.android.p2092ad.splash.core.video2.C29613c
            /* renamed from: c */
            public final void mo51489c(int i) {
                super.mo51489c(i);
                C29411c.this.f69858N = true;
            }

            @Override // com.p2082ss.android.p2092ad.splash.core.video2.AbstractC29612b, com.p2082ss.android.p2092ad.splash.core.video2.C29613c
            /* renamed from: a */
            public final void mo51422a(int i) {
                if (C29411c.this.f69898x && C29495h.m59095a().f70664l) {
                    return;
                }
                if (C29495h.m59095a().f70668p) {
                    C29411c.this.mo51455a(true);
                    return;
                }
                C29411c.this.mo51449a();
                C29411c.this.mo51450a(i);
                C29411c.this.f69900z.mo51659a(bVar);
            }

            @Override // com.p2082ss.android.p2092ad.splash.core.video2.C29613c
            /* renamed from: d */
            public final void mo51491d(int i) {
                C29455b bVar = C29411c.this.f69899y;
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                hashMap.put("duration", Integer.valueOf(i));
                hashMap2.put("play_order", 1);
                C29446b.m58971a();
                C29446b.m58973a(bVar, 0, "pause", hashMap, hashMap2);
            }

            @Override // com.p2082ss.android.p2092ad.splash.core.video2.C29613c
            /* renamed from: d */
            public final void mo51427d(int i, int i2) {
                C29495h.m59109h().mo51594c();
                m58948a(i, i2, "third_quartile");
            }

            @Override // com.p2082ss.android.p2092ad.splash.core.video2.C29613c
            /* renamed from: b */
            public final void mo51425b(int i, int i2) {
                C29495h.m59109h().mo51589a();
                m58948a(i, i2, "first_quartile");
            }

            @Override // com.p2082ss.android.p2092ad.splash.core.video2.C29613c
            /* renamed from: c */
            public final void mo51426c(int i, int i2) {
                C29495h.m59109h().mo51593b();
                m58948a(i, i2, "midpoint");
            }

            @Override // com.p2082ss.android.p2092ad.splash.core.video2.AbstractC29612b, com.p2082ss.android.p2092ad.splash.core.video2.C29613c
            /* renamed from: a */
            public final void mo51423a(int i, int i2) {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    long j = (long) i;
                    jSONObject.put("duration", Long.toString(j));
                    jSONObject.put("percent", C29658m.m59761a(j, (long) i2));
                    jSONObject.put("is_ad_event", "1");
                    jSONObject.put("ad_fetch_time", bVar.f70024b);
                    jSONObject.put("break_reason", C29411c.this.f69895u);
                    if (!C29657l.m59760a(bVar.f70032j)) {
                        jSONObject.put("log_extra", bVar.f70032j);
                    }
                    jSONObject2.put("break_reason", C29411c.this.f69895u);
                    jSONObject2.putOpt("play_order", 1);
                    jSONObject.put("ad_extra_data", jSONObject2);
                } catch (JSONException e) {
                    e.printStackTrace();
                    jSONObject = null;
                }
                C29495h.m59099a(bVar.f70026d, "splash_ad", "play_break", jSONObject);
                if (C29411c.this.f69895u != 1) {
                    C29495h.m59109h().mo51598g();
                }
            }

            /* renamed from: a */
            private void m58948a(int i, int i2, String str) {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("play_order", 1);
                    jSONObject.put("ad_extra_data", jSONObject2);
                    long j = (long) i2;
                    jSONObject.put("duration", Long.toString(j));
                    jSONObject.put("percent", C29658m.m59761a((long) i, j));
                    jSONObject.put("is_ad_event", "1");
                    jSONObject.put("ad_fetch_time", bVar.f70024b);
                    if (!TextUtils.isEmpty(bVar.f70032j)) {
                        jSONObject.put("log_extra", bVar.f70032j);
                    }
                } catch (Throwable unused) {
                }
                C29495h.m59099a(bVar.f70026d, "splash_ad", str, jSONObject);
            }
        };
    }

    /* renamed from: e */
    private boolean m58917e(int i) {
        if (!this.f69896v || this.f69847C != 1 || i <= 5) {
            return true;
        }
        return false;
    }

    private void setSkipClickListener(C29455b bVar) {
        this.f69884j.setOnClickListener(new View.OnClickListener() {
            /* class com.p2082ss.android.p2092ad.splash.core.C29411c.View$OnClickListenerC2942219 */

            static {
                Covode.recordClassIndex(35816);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                C29411c.this.mo51464g();
            }
        });
    }

    /* access modifiers changed from: package-private */
    public final void setImageTouchListener(final C29455b bVar) {
        setOnTouchListener(new View.OnTouchListener() {
            /* class com.p2082ss.android.p2092ad.splash.core.C29411c.View$OnTouchListenerC2942420 */

            static {
                Covode.recordClassIndex(35818);
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if ((C29411c.this.getTouchDelegate() == null || !C29411c.this.getTouchDelegate().onTouchEvent(motionEvent)) && !C29411c.this.mo51456a(motionEvent) && motionEvent.getAction() == 1) {
                    C29411c.this.mo51452a(bVar, motionEvent.getRawX(), motionEvent.getRawY());
                }
                return true;
            }
        });
    }

    public final void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 4 || i == 8) {
            m58919k();
        }
    }

    /* renamed from: b */
    public static ObjectAnimator m58914b(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
        ofFloat.setDuration(300L);
        return ofFloat;
    }

    private void setupWifiPreloadHindLayout(C29455b bVar) {
        String str = bVar.f69988M;
        if (!TextUtils.isEmpty(str)) {
            this.f69879e.setVisibility(0);
            this.f69879e.setText(str);
        }
    }

    /* renamed from: a */
    public final ObjectAnimator mo51448a(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "y", view.getY(), view.getY() - C29661o.m59767a(getContext(), 30.0f));
        ofFloat.setDuration(300L);
        return ofFloat;
    }

    public final void onWindowFocusChanged(boolean z) {
        AbstractC29621g gVar;
        super.onWindowFocusChanged(z);
        C29638a.m59659a(0, "hasWindowFocus: ".concat(String.valueOf(z)));
        if (C29495h.m59095a().f70664l && z != this.f69874af && (gVar = this.f69856L) != null && !this.f69898x) {
            this.f69874af = z;
            if (z) {
                gVar.mo51871i();
            } else {
                gVar.mo51870h();
            }
        }
    }

    /* renamed from: c */
    private GradientDrawable m58915c(int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        float f = (float) i;
        gradientDrawable.setCornerRadii(new float[]{C29661o.m59767a(getContext(), f), C29661o.m59767a(getContext(), f), C29661o.m59767a(getContext(), f), C29661o.m59767a(getContext(), f), C29661o.m59767a(getContext(), f), C29661o.m59767a(getContext(), f), C29661o.m59767a(getContext(), f), C29661o.m59767a(getContext(), f)});
        return gradientDrawable;
    }

    private void setupAdLabelLayout(C29455b bVar) {
        C29463g gVar = bVar.f69986K;
        if (gVar != null) {
            if (!TextUtils.isEmpty(gVar.f70083d)) {
                this.f69885k.setText(gVar.f70083d);
            }
            if (!TextUtils.isEmpty(gVar.f70082c)) {
                this.f69885k.setTextColor(C29654j.m59704a(gVar.f70082c, "#ffffff"));
            }
            if (!TextUtils.isEmpty(gVar.f70080a)) {
                GradientDrawable c = m58915c(2);
                c.setColor(C29654j.m59704a(gVar.f70080a, "#32222222"));
                int i = Build.VERSION.SDK_INT;
                this.f69885k.setBackground(c);
            }
        }
    }

    /* renamed from: b */
    public final void mo51459b(int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("bda_splash_render_duration", System.currentTimeMillis() - this.f69867W);
            C29375a.m58829a().mo51358a("bda_splash_render_duration", i, jSONObject, null);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private void setupSkipButtonHitArea(C29455b bVar) {
        C29469m mVar = bVar.f69987L;
        boolean z = true;
        if (mVar != null) {
            if (!mVar.mo51559a(1)) {
                z = false;
                if (mVar == null) {
                    return;
                }
            }
            if (this.f69884j.getVisibility() == 0 && this.f69884j.getParent() != null) {
                if (z) {
                    int a = (int) C29661o.m59767a(getContext(), (float) mVar.f70098b);
                    int a2 = (int) C29661o.m59767a(getContext(), (float) mVar.f70099c);
                    C29654j.m59723a(this.f69865U, a, a, a2, a2);
                    this.f69884j.setOnTouchListener(new View.OnTouchListener() {
                        /* class com.p2082ss.android.p2092ad.splash.core.C29411c.View$OnTouchListenerC2941310 */

                        static {
                            Covode.recordClassIndex(35807);
                        }

                        public final boolean onTouch(View view, MotionEvent motionEvent) {
                            if (C29411c.this.getTouchDelegate() == null || !C29411c.this.getTouchDelegate().onTouchEvent(motionEvent)) {
                                return false;
                            }
                            return true;
                        }
                    });
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    int a3 = ((int) C29661o.m59767a(getContext(), (float) mVar.f70099c)) + 0;
                    this.f69884j.setPaddingRelative(a3, (int) C29661o.m59767a(getContext(), 14.0f), (int) C29661o.m59767a(getContext(), 16.0f), ((int) C29661o.m59767a(getContext(), (float) mVar.f70098b)) + 0);
                    this.f69884j.setLayoutParams(layoutParams);
                    this.f69884j.setOnClickListener(new View.OnClickListener() {
                        /* class com.p2082ss.android.p2092ad.splash.core.C29411c.View$OnClickListenerC2941411 */

                        static {
                            Covode.recordClassIndex(35808);
                        }

                        public final void onClick(View view) {
                            ClickAgent.onClick(view);
                        }
                    });
                    this.f69865U.setOnClickListener(new View.OnClickListener() {
                        /* class com.p2082ss.android.p2092ad.splash.core.C29411c.View$OnClickListenerC2941613 */

                        static {
                            Covode.recordClassIndex(35810);
                        }

                        public final void onClick(View view) {
                            ClickAgent.onClick(view);
                            C29411c.this.mo51464g();
                        }
                    });
                    return;
                }
                C29654j.m59723a(this.f69884j, mVar.f70098b, mVar.f70098b, mVar.f70099c, mVar.f70099c);
                int i = Build.VERSION.SDK_INT;
                this.f69883i.setPaddingRelative(0, 0, 0, mVar.f70098b);
            }
        }
    }

    private void setupSkipLayout(C29455b bVar) {
        this.f69846B = (int) (this.f69894t / 1000);
        this.f69866V.setText(new StringBuilder().append(this.f69846B).toString());
        this.f69866V.setDuration(this.f69894t);
        C29469m mVar = bVar.f69987L;
        if (mVar == null || TextUtils.isEmpty(mVar.f70102f)) {
            this.f69884j.setVisibility(8);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(10, -1);
            int a = (int) C29661o.m59767a(getContext(), 16.0f);
            layoutParams.setMargins(0, (int) C29661o.m59767a(getContext(), 16.0f), a, 0);
            int i = Build.VERSION.SDK_INT;
            layoutParams.addRule(21, -1);
            layoutParams.setMarginStart(0);
            layoutParams.setMarginEnd(a);
            this.f69879e.setLayoutParams(layoutParams);
            return;
        }
        this.f69884j.setVisibility(0);
        this.f69870ab = mVar.f70102f;
        this.f69869aa = mVar.f70103g;
        this.f69871ac = mVar.f70097a;
        this.f69865U.setText(m58916d(this.f69846B));
        if (!TextUtils.isEmpty(mVar.f70100d)) {
            this.f69865U.setTextColor(C29654j.m59704a(mVar.f70100d, "#ffffff"));
            this.f69866V.setTextColor(C29654j.m59704a(mVar.f70100d, "#ffffff"));
        }
        if (!TextUtils.isEmpty(mVar.f70101e)) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            GradientDrawable c = m58915c(12);
            int a2 = C29654j.m59704a(mVar.f70101e, "#32222222");
            c.setColor(a2);
            gradientDrawable.setColor(a2);
            int i2 = Build.VERSION.SDK_INT;
            this.f69865U.setBackground(c);
            this.f69866V.setBackground(gradientDrawable);
        }
        setSkipClickListener(bVar);
    }

    /* renamed from: b */
    public final void mo51460b(long j) {
        Timer timer = this.f69872ad;
        if (timer != null) {
            timer.cancel();
        }
        long j2 = j + C29495h.m59095a().f70666n;
        this.f69894t = j2;
        int i = (int) (j2 / 1000);
        this.f69846B = i;
        this.f69865U.setText(m58916d(i));
        mo51465h();
        this.f69872ad = null;
        m58918j();
    }

    /* renamed from: d */
    private CharSequence m58916d(int i) {
        if (i < 0) {
            i = 0;
        }
        C29463g gVar = this.f69899y.f69986K;
        if (gVar != null) {
            if (gVar.f70081b == 3) {
                if (this.f69899y.mo51547n()) {
                    return m58911a(this.f69870ab, " | ", 14, "#4DFFFFFF", C1764a.m5928a("%02d%s", new Object[]{Integer.valueOf(i), this.f69871ac}), 18);
                } else if (!this.f69899y.mo51548o()) {
                    return this.f69870ab;
                } else {
                    if (i > ((int) (this.f69894t / 1000)) - this.f69899y.mo51549p()) {
                        return m58911a("Ad", " | ", 14, "#4DFFFFFF", C1764a.m5928a("%02d%s", new Object[]{Integer.valueOf(i), this.f69871ac}), 18);
                    }
                    return m58911a(this.f69870ab, " | ", 14, "#4DFFFFFF", C1764a.m5928a("%02d%s", new Object[]{Integer.valueOf(i), this.f69871ac}), 18);
                }
            } else if (gVar.f70081b == 2) {
                if (!this.f69869aa || !m58917e(i)) {
                    return this.f69870ab;
                }
                String a = C1764a.m5928a("%d%s", new Object[]{Integer.valueOf(i), this.f69871ac});
                if (this.f69899y.mo51541g()) {
                    return m58911a(a, " | ", 13, "#66222222", this.f69870ab, 16);
                }
                return m58911a(a, " | ", 13, "#66F8F8F8", this.f69870ab, 16);
            }
        }
        if (!this.f69869aa) {
            return this.f69870ab;
        }
        if (C29654j.m59728a(getContext())) {
            return C1764a.m5928a("%s %s%s", new Object[]{this.f69870ab, Integer.valueOf(i), this.f69871ac});
        }
        return C1764a.m5928a("%s%s %s", new Object[]{Integer.valueOf(i), this.f69871ac, this.f69870ab});
    }

    /* renamed from: a */
    public final void mo51450a(int i) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("play_order", 1);
            jSONObject.put("ad_extra_data", jSONObject2);
            jSONObject.put("duration", Long.toString((long) i));
            jSONObject.put("percent", Integer.toString(100));
            jSONObject.put("is_ad_event", "1");
            jSONObject.put("ad_fetch_time", this.f69899y.f70024b);
            if (!C29657l.m59760a(this.f69899y.f70032j)) {
                jSONObject.put("log_extra", this.f69899y.f70032j);
            }
        } catch (JSONException e) {
            e.printStackTrace();
            jSONObject = null;
        }
        C29495h.m59099a(this.f69899y.f70026d, "splash_ad", "play_over", jSONObject);
        if (this.f69899y.f70040r != null) {
            C29506c.C29507a aVar = new C29506c.C29507a();
            aVar.f70264a = C29654j.m59706a((AbstractC29383a) this.f69899y);
            C29506c a = aVar.mo51606a();
            if (C29495h.m59095a().f70654b) {
                C29495h.m59108g().mo51602a(null, "play_over", this.f69899y.f70026d, this.f69899y.f70040r.f70122b, this.f69899y.f70032j, true, -1, null, a);
            } else {
                C29495h.m59108g().mo51605d(null, this.f69899y.f70026d, this.f69899y.f70040r.f70122b, this.f69899y.f70032j, true, -1, null, a);
            }
        }
        C29495h.m59109h().mo51595d();
    }

    /* renamed from: a */
    public final void mo51451a(long j) {
        if (C29495h.m59095a().f70668p) {
            RunnableC29447d dVar = new RunnableC29447d(this, j);
            int i = Build.VERSION.SDK_INT;
            if (isAttachedToWindow()) {
                dVar.run();
            } else {
                post(dVar);
            }
        }
    }

    public C29411c(Context context) {
        super(context);
        float a;
        MethodCollector.m26663i(8556);
        if (C29495h.f70177A != 0) {
            try {
                TypedArray obtainStyledAttributes = new ContextThemeWrapper(getContext(), C29495h.f70177A).getTheme().obtainStyledAttributes(new int[]{16842836});
                setBackgroundDrawable(obtainStyledAttributes.getDrawable(0));
                obtainStyledAttributes.recycle();
            } catch (Exception unused) {
            }
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        this.f69860P = linearLayout;
        addView(linearLayout);
        ViewStub viewStub = new ViewStub(context);
        this.f69861Q = viewStub;
        viewStub.setLayoutParams(new LinearLayout.LayoutParams(-1, 27));
        this.f69861Q.setLayoutResource(R.layout.b0r);
        this.f69861Q.setVisibility(8);
        this.f69860P.addView(this.f69861Q);
        this.f69868a = new RelativeLayout(context);
        this.f69868a.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        Space space = new Space(context);
        this.f69877c = space;
        space.setId(R.id.e53);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12, -1);
        this.f69877c.setLayoutParams(layoutParams);
        this.f69877c.setBackgroundColor(getResources().getColor(R.color.pi));
        this.f69877c.setVisibility(4);
        this.f69876b = new FrameLayout(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(2, this.f69877c.getId());
        this.f69876b.setLayoutParams(layoutParams2);
        this.f69862R = new BDASplashImageView(context);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
        this.f69862R.setScaleType(ImageView.ScaleType.FIT_XY);
        this.f69862R.setVisibility(8);
        this.f69862R.setLayoutParams(layoutParams3);
        this.f69880f = new BDASplashVideoView(context);
        this.f69880f.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f69880f.setVisibility(8);
        this.f69886l = new C29529c(context);
        this.f69886l.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f69886l.setVisibility(8);
        this.f69887m = new C29533d(context);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams((int) C29661o.m59767a(context, 140.0f), (int) C29661o.m59767a(context, 170.0f));
        layoutParams4.bottomMargin = (int) C29661o.m59767a(context, 148.0f);
        layoutParams4.addRule(12);
        layoutParams4.addRule(14);
        this.f69887m.setLayoutParams(layoutParams4);
        this.f69887m.setVisibility(8);
        this.f69881g = new RelativeLayout(context);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, (int) C29661o.m59767a(context, 60.0f));
        layoutParams5.gravity = 80;
        this.f69881g.setLayoutParams(layoutParams5);
        this.f69881g.setBackgroundColor(getResources().getColor(R.color.pc));
        this.f69881g.setVisibility(8);
        this.f69863S = new RelativeLayout(context);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams6.addRule(13, -1);
        this.f69863S.setLayoutParams(layoutParams6);
        this.f69882h = new TextView(context);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams7.addRule(15, -1);
        this.f69882h.setEllipsize(TextUtils.TruncateAt.END);
        this.f69882h.setLines(1);
        this.f69882h.setMaxWidth((int) C29661o.m59767a(context, 200.0f));
        this.f69882h.setText(R.string.g04);
        this.f69882h.setTextColor(getResources().getColor(R.color.pi));
        this.f69882h.setTextSize(1, 20.0f);
        this.f69882h.setLayoutParams(layoutParams7);
        this.f69882h.setId(R.id.e57);
        this.f69863S.addView(this.f69882h);
        this.f69864T = new ImageView(context);
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams8.addRule(15, -1);
        layoutParams8.addRule(1, this.f69882h.getId());
        layoutParams8.setMargins((int) C29661o.m59767a(context, 4.0f), 0, 0, 0);
        this.f69864T.setPadding(0, (int) C29661o.m59767a(context, 1.0f), 0, 0);
        this.f69864T.setImageDrawable(getResources().getDrawable(2131233882));
        this.f69864T.setLayoutParams(layoutParams8);
        this.f69863S.addView(this.f69864T);
        this.f69881g.addView(this.f69863S);
        this.f69878d = new ImageView(context);
        RelativeLayout.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams(-2, -2);
        int i = Build.VERSION.SDK_INT;
        layoutParams9.addRule(20, -1);
        layoutParams9.addRule(10, -1);
        int a2 = (int) C29661o.m59767a(context, 14.0f);
        layoutParams9.setMargins(a2, (int) C29661o.m59767a(context, 14.0f), 0, 0);
        int i2 = Build.VERSION.SDK_INT;
        layoutParams9.setMarginStart(a2);
        layoutParams9.setMarginEnd(0);
        this.f69878d.setVisibility(8);
        this.f69878d.setLayoutParams(layoutParams9);
        ImageView imageView = new ImageView(context);
        this.f69888n = imageView;
        imageView.setImageResource(R.drawable.bky);
        this.f69889o = new C29528b(context);
        RelativeLayout.LayoutParams layoutParams10 = new RelativeLayout.LayoutParams((int) C29661o.m59767a(context, 209.0f), (int) C29661o.m59767a(context, 44.0f));
        layoutParams10.bottomMargin = (int) C29661o.m59767a(context, 100.0f);
        layoutParams10.addRule(12);
        layoutParams10.addRule(14);
        this.f69889o.setLayoutParams(layoutParams10);
        this.f69889o.setVisibility(8);
        this.f69883i = new LinearLayout(context);
        RelativeLayout.LayoutParams layoutParams11 = new RelativeLayout.LayoutParams(-1, -2);
        this.f69883i.setOrientation(0);
        this.f69883i.setLayoutParams(layoutParams11);
        if (!C29495h.m59095a().f70669q) {
            this.f69883i.setFitsSystemWindows(true);
        }
        this.f69873ae = new Space(context);
        LinearLayout.LayoutParams layoutParams12 = new LinearLayout.LayoutParams(0, 1);
        layoutParams12.weight = 1.0f;
        this.f69873ae.setLayoutParams(layoutParams12);
        this.f69884j = new FrameLayout(context);
        RelativeLayout.LayoutParams layoutParams13 = new RelativeLayout.LayoutParams(-2, (int) C29661o.m59767a(context, 36.0f));
        int i3 = Build.VERSION.SDK_INT;
        layoutParams13.addRule(21, -1);
        layoutParams13.addRule(10, -1);
        if (C29495h.m59095a().f70659g) {
            a = C29661o.m59767a(context, 10.0f);
        } else {
            a = C29661o.m59767a(context, 16.0f);
        }
        int i4 = (int) a;
        layoutParams13.setMargins(0, (int) C29661o.m59767a(context, 8.0f), i4, 0);
        int i5 = Build.VERSION.SDK_INT;
        layoutParams13.setMarginStart(0);
        layoutParams13.setMarginEnd(i4);
        this.f69884j.setLayoutParams(layoutParams13);
        this.f69884j.setVisibility(8);
        this.f69884j.setId(R.id.e59);
        this.f69865U = new TextView(context);
        FrameLayout.LayoutParams layoutParams14 = new FrameLayout.LayoutParams(-2, (int) C29661o.m59767a(context, 24.0f));
        this.f69865U.setBackgroundResource(R.drawable.bku);
        int i6 = Build.VERSION.SDK_INT;
        this.f69865U.setPaddingRelative((int) C29661o.m59767a(context, 10.0f), 0, (int) C29661o.m59767a(context, 10.0f), 0);
        layoutParams14.gravity = 17;
        this.f69865U.setGravity(17);
        this.f69865U.setTextSize(1, 12.0f);
        this.f69865U.setLayoutParams(layoutParams14);
        this.f69884j.addView(this.f69865U);
        this.f69879e = new TextView(context);
        LinearLayout.LayoutParams layoutParams15 = new LinearLayout.LayoutParams(-2, -2);
        int a3 = (int) C29661o.m59767a(context, 9.0f);
        layoutParams15.setMargins(0, (int) C29661o.m59767a(context, 17.0f), a3, 0);
        int i7 = Build.VERSION.SDK_INT;
        layoutParams15.setMarginStart(0);
        layoutParams15.setMarginEnd(a3);
        int i8 = Build.VERSION.SDK_INT;
        this.f69879e.setPaddingRelative(3, 3, 3, 3);
        this.f69879e.setTextColor(Color.parseColor("#ffffff"));
        this.f69879e.setShadowLayer(12.0f, 0.0f, 0.0f, Color.parseColor("#7f000000"));
        this.f69879e.setTextSize(1, 12.0f);
        this.f69879e.setVisibility(8);
        this.f69879e.setLayoutParams(layoutParams15);
        this.f69866V = new C29526a(context);
        LinearLayout.LayoutParams layoutParams16 = new LinearLayout.LayoutParams((int) C29661o.m59767a(context, 40.0f), (int) C29661o.m59767a(context, 40.0f));
        int a4 = (int) C29661o.m59767a(context, 44.0f);
        layoutParams16.setMargins(0, (int) C29661o.m59767a(context, 30.0f), a4, 0);
        int i9 = Build.VERSION.SDK_INT;
        layoutParams16.setMarginStart(0);
        layoutParams16.setMarginEnd(a4);
        this.f69866V.setLayoutParams(layoutParams16);
        this.f69866V.setGravity(17);
        this.f69866V.setTextSize(1, 18.0f);
        this.f69866V.setVisibility(8);
        this.f69885k = new TextView(context);
        int i10 = Build.VERSION.SDK_INT;
        this.f69885k.setPaddingRelative((int) C29661o.m59767a(context, 4.0f), (int) C29661o.m59767a(context, 2.0f), (int) C29661o.m59767a(context, 4.0f), (int) C29661o.m59767a(context, 2.0f));
        this.f69885k.setTextSize(1, 10.0f);
        this.f69885k.setVisibility(8);
        TextView textView = new TextView(context);
        this.f69890p = textView;
        textView.setVisibility(8);
        View view = new View(context);
        this.f69891q = view;
        view.setBackgroundResource(R.drawable.a_e);
        this.f69891q.setVisibility(8);
        this.f69891q.setLayoutParams(new RelativeLayout.LayoutParams(-1, (int) C29661o.m59767a(context, 50.0f)));
        View view2 = new View(getContext());
        this.f69892r = view2;
        view2.setBackgroundResource(R.drawable.bkq);
        this.f69892r.setVisibility(8);
        this.f69892r.setLayoutParams(new RelativeLayout.LayoutParams(-1, (int) C29661o.m59767a(getContext(), 105.0f)));
        this.f69860P.addView(this.f69868a);
        this.f69876b.addView(this.f69886l);
        this.f69876b.addView(this.f69862R);
        this.f69876b.addView(this.f69880f);
        this.f69876b.addView(this.f69881g);
        this.f69868a.addView(this.f69876b);
        this.f69868a.addView(this.f69877c);
        this.f69868a.addView(this.f69892r);
        this.f69883i.addView(this.f69878d);
        this.f69883i.addView(this.f69873ae);
        this.f69868a.addView(this.f69883i);
        this.f69868a.addView(this.f69889o);
        this.f69868a.addView(this.f69887m);
        this.f69868a.addView(this.f69891q);
        this.f69868a.addView(this.f69890p);
        if (C29495h.f70246v != 0) {
            this.f69879e.setText(C29495h.f70246v);
        } else {
            this.f69879e.setText(R.string.g09);
        }
        if (C29495h.f70249y != 0) {
            this.f69865U.setText(C29495h.f70249y);
        } else {
            this.f69865U.setText(R.string.g06);
        }
        if (C29495h.f70247w != 0) {
            this.f69865U.setBackgroundResource(C29495h.f70247w);
        }
        if (C29495h.f70191O == 1) {
            this.f69862R.setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
        setFocusable(true);
        setFocusableInTouchMode(true);
        this.f69874af = true;
        MethodCollector.m26664o(8556);
    }

    @Override // com.p2082ss.android.p2092ad.splash.p2109f.HandlerC29663q.AbstractC29664a
    /* renamed from: a */
    public final void mo28809a(Message message) {
        if (message.what == 1) {
            if (!this.f69898x && C29495h.m59095a().f70664l && !C29495h.m59095a().f70668p) {
                m58920l();
            }
            mo51455a(false);
        } else if (message.what == 2) {
            int i = this.f69846B - 1;
            this.f69846B = i;
            C29644g.m59688b("splash count down. display seconds left: " + this.f69846B);
            if (i == 0) {
                Timer timer = this.f69872ad;
                if (timer != null) {
                    timer.cancel();
                    this.f69872ad = null;
                    return;
                }
                return;
            }
            if (this.f69865U.getVisibility() == 0 && this.f69869aa) {
                this.f69865U.setText(m58916d(i));
            }
            if (this.f69866V.getVisibility() == 0) {
                this.f69866V.setText(String.valueOf(i));
            }
            if (this.f69890p.getVisibility() == 0 && this.f69899y.f69996U == 5) {
                this.f69890p.setText(m58912a(this.f69899y.f69997V, String.valueOf(i)));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void setupUIWidgets(C29455b bVar) {
        int i;
        float a;
        int i2;
        float a2;
        setupSkipLayout(bVar);
        setupWifiPreloadHindLayout(bVar);
        setupAdLabelLayout(bVar);
        C29463g gVar = bVar.f69986K;
        if (gVar != null) {
            C29638a.m59659a(0, "new splash style，position:" + gVar.f70081b);
            C29661o.m59769a(this.f69879e);
            C29661o.m59769a(this.f69885k);
            C29661o.m59769a(this.f69884j);
            int i3 = gVar.f70081b;
            if (i3 != 0) {
                if (i3 == 1) {
                    C29661o.m59771a(this.f69879e, this.f69883i);
                    C29661o.m59771a(this.f69884j, this.f69883i);
                    this.f69885k.setVisibility(0);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 8388693;
                    if (bVar.f70036n == 3 && this.f69881g.getVisibility() == 0) {
                        i = this.f69881g.getLayoutParams().height;
                    } else {
                        i = 0;
                    }
                    int a3 = (int) C29661o.m59767a(getContext(), 16.0f);
                    layoutParams.setMargins(0, 0, a3, ((int) C29661o.m59767a(getContext(), 20.0f)) + i);
                    int i4 = Build.VERSION.SDK_INT;
                    layoutParams.setMarginStart(0);
                    layoutParams.setMarginEnd(a3);
                    this.f69885k.setLayoutParams(layoutParams);
                    C29661o.m59771a(this.f69885k, this.f69876b);
                } else if (i3 == 2) {
                    if (!TextUtils.isEmpty(this.f69885k.getText())) {
                        this.f69885k.setVisibility(0);
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, (int) C29661o.m59767a(getContext(), 18.0f));
                        if (this.f69879e.getVisibility() != 0) {
                            if (this.f69896v) {
                                a2 = C29661o.m59767a(getContext(), 12.0f);
                            } else {
                                a2 = C29661o.m59767a(getContext(), 20.0f);
                            }
                            i2 = (int) a2;
                        } else {
                            i2 = 0;
                        }
                        layoutParams2.setMargins(0, 0, i2, 0);
                        int i5 = Build.VERSION.SDK_INT;
                        layoutParams2.setMarginStart(0);
                        layoutParams2.setMarginEnd(i2);
                        this.f69885k.setLayoutParams(layoutParams2);
                        this.f69885k.setTextSize(1, 12.0f);
                        int i6 = Build.VERSION.SDK_INT;
                        this.f69885k.setPaddingRelative((int) C29661o.m59767a(getContext(), 4.0f), 0, (int) C29661o.m59767a(getContext(), 0.0f), 0);
                        this.f69885k.setBackgroundColor(Color.parseColor("#00222222"));
                        this.f69885k.setShadowLayer(2.0f, 0.0f, 1.0f, Color.parseColor("#66000000"));
                        C29661o.m59771a(this.f69885k, this.f69883i);
                    }
                    if (this.f69879e.getVisibility() == 0) {
                        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, (int) C29661o.m59767a(getContext(), 18.0f));
                        if (this.f69896v) {
                            a = C29661o.m59767a(getContext(), 12.0f);
                        } else {
                            a = C29661o.m59767a(getContext(), 20.0f);
                        }
                        int i7 = (int) a;
                        layoutParams3.setMargins(0, 0, i7, 0);
                        int i8 = Build.VERSION.SDK_INT;
                        layoutParams3.setMarginStart(0);
                        layoutParams3.setMarginEnd(i7);
                        this.f69879e.setLayoutParams(layoutParams3);
                        this.f69879e.setTextSize(1, 12.0f);
                        this.f69879e.setShadowLayer(2.0f, 0.0f, 1.0f, Color.parseColor("#66000000"));
                        if (!TextUtils.isEmpty(gVar.f70082c)) {
                            this.f69879e.setTextColor(C29654j.m59704a(gVar.f70082c, "#ffffff"));
                        }
                        int i9 = Build.VERSION.SDK_INT;
                        this.f69879e.setPaddingRelative((int) C29661o.m59767a(getContext(), 6.0f), 0, (int) C29661o.m59767a(getContext(), 0.0f), 0);
                        this.f69879e.setText("|  " + ((Object) this.f69879e.getText()));
                        C29661o.m59771a(this.f69879e, this.f69883i);
                    }
                    if (this.f69884j.getVisibility() == 0) {
                        if (!bVar.f69989N) {
                            this.f69865U.setTextSize(1, 16.0f);
                        }
                        C29661o.m59771a(this.f69884j, this.f69868a);
                        int h = C29654j.m59754h();
                        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, (int) C29661o.m59767a(getContext(), 30.0f));
                        layoutParams4.addRule(12, -1);
                        int a4 = (int) C29661o.m59767a(getContext(), 15.0f);
                        if (bVar.mo51541g()) {
                            if (C29495h.m59102b() != null && "13".equals(C29495h.m59102b().mo51563a())) {
                                h += (int) C29661o.m59767a(getContext(), 5.5f);
                            }
                            layoutParams4.setMargins(0, 0, a4, h);
                        } else {
                            layoutParams4.setMargins(0, 0, a4, (int) C29661o.m59767a(getContext(), 35.0f));
                        }
                        int i10 = Build.VERSION.SDK_INT;
                        layoutParams4.addRule(21, -1);
                        layoutParams4.setMarginStart(0);
                        layoutParams4.setMarginEnd(a4);
                        this.f69884j.setLayoutParams(layoutParams4);
                        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, -1);
                        this.f69865U.setMinimumWidth((int) C29661o.m59767a(getContext(), 64.0f));
                        this.f69865U.setLayoutParams(layoutParams5);
                        C29469m mVar = bVar.f69987L;
                        if (mVar != null && !TextUtils.isEmpty(mVar.f70101e)) {
                            GradientDrawable c = m58915c(16);
                            c.setColor(C29654j.m59704a(mVar.f70101e, "#32222222"));
                            if (bVar.mo51541g()) {
                                c.setStroke((int) C29661o.m59767a(getContext(), 0.5f), Color.parseColor("#66222222"));
                            } else {
                                c.setStroke((int) C29661o.m59767a(getContext(), 0.5f), Color.parseColor("#99FAFAFA"));
                            }
                            int i11 = Build.VERSION.SDK_INT;
                            this.f69865U.setBackground(c);
                        }
                    }
                    if (this.f69878d.getVisibility() == 0) {
                        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
                        int a5 = (int) C29661o.m59767a(getContext(), 14.0f);
                        layoutParams6.setMargins(a5, 0, 0, 0);
                        int i12 = Build.VERSION.SDK_INT;
                        layoutParams6.setMarginStart(a5);
                        layoutParams6.setMarginEnd(0);
                        this.f69878d.setLayoutParams(layoutParams6);
                    }
                    if (this.f69896v) {
                        C29638a.m59659a(this.f69899y.f70026d, "interactive splash ad, adding volume button");
                        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams((int) C29661o.m59767a(getContext(), 16.0f), (int) C29661o.m59767a(getContext(), 16.0f));
                        layoutParams7.rightMargin = (int) C29661o.m59767a(getContext(), 15.0f);
                        layoutParams7.gravity = 15;
                        this.f69888n.setLayoutParams(layoutParams7);
                        C29661o.m59771a(this.f69888n, this.f69883i);
                        this.f69888n.setOnClickListener(new AbstractView$OnClickListenerC29388a() {
                            /* class com.p2082ss.android.p2092ad.splash.core.C29411c.C2941916 */

                            static {
                                Covode.recordClassIndex(35813);
                            }

                            @Override // com.p2082ss.android.p2092ad.splash.core.p2096a.AbstractView$OnClickListenerC29388a
                            /* renamed from: a */
                            public final void mo51385a() {
                                C29411c cVar = C29411c.this;
                                cVar.f69897w = !cVar.f69897w;
                                if (C29411c.this.f69897w) {
                                    C29411c.this.f69888n.setImageResource(R.drawable.bky);
                                } else {
                                    C29411c.this.f69888n.setImageResource(R.drawable.bl0);
                                }
                                if (C29411c.this.f69886l != null) {
                                    C29411c.this.f69886l.setMute(C29411c.this.f69897w);
                                }
                                HashMap hashMap = new HashMap(1);
                                hashMap.put("position", Integer.valueOf(2 - C29411c.this.f69847C));
                                C29446b.m58971a();
                                C29446b.m58973a(C29411c.this.f69899y, 0, "click_sound_switch", null, hashMap);
                            }
                        });
                    }
                    if (this.f69883i != null) {
                        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-1, -2);
                        layoutParams8.setMargins(0, (int) C29661o.m59767a(getContext(), 35.0f), 0, 0);
                        int i13 = Build.VERSION.SDK_INT;
                        layoutParams8.setMarginStart(0);
                        layoutParams8.setMarginEnd(0);
                        this.f69883i.setOrientation(0);
                        this.f69883i.setLayoutParams(layoutParams8);
                    }
                } else if (i3 != 3) {
                    C29661o.m59771a(this.f69879e, this.f69883i);
                    C29661o.m59771a(this.f69884j, this.f69883i);
                    if (gVar.f70081b != 0) {
                        this.f69885k.setVisibility(8);
                    }
                } else {
                    C29638a.m59659a(0, "xigua TV style, is clickable: " + bVar.mo51547n() + ", is skippable: " + bVar.mo51548o());
                    if (bVar.mo51547n() || bVar.mo51548o()) {
                        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(-2, (int) C29661o.m59767a(getContext(), 40.0f));
                        int a6 = (int) C29661o.m59767a(getContext(), 44.0f);
                        layoutParams9.setMargins(0, (int) C29661o.m59767a(getContext(), 30.0f), a6, 0);
                        int i14 = Build.VERSION.SDK_INT;
                        layoutParams9.setMarginStart(0);
                        layoutParams9.setMarginEnd(a6);
                        this.f69884j.setLayoutParams(layoutParams9);
                        this.f69865U.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
                        GradientDrawable c2 = m58915c(20);
                        C29469m mVar2 = bVar.f69987L;
                        if (mVar2 == null || TextUtils.isEmpty(mVar2.f70101e)) {
                            c2.setAlpha(153);
                            c2.setColor(-16777216);
                        } else {
                            c2.setColor(C29654j.m59704a(mVar2.f70101e, "#32222222"));
                        }
                        int a7 = (int) C29661o.m59767a(getContext(), 14.0f);
                        int a8 = (int) C29661o.m59767a(getContext(), 8.0f);
                        int a9 = (int) C29661o.m59767a(getContext(), 14.0f);
                        int a10 = (int) C29661o.m59767a(getContext(), 7.0f);
                        int i15 = Build.VERSION.SDK_INT;
                        this.f69865U.setPaddingRelative(a7, a8, a9, a10);
                        this.f69865U.setBackground(c2);
                        this.f69865U.setTextSize(1, 18.0f);
                        C29661o.m59771a(this.f69884j, this.f69883i);
                    } else {
                        this.f69866V.setVisibility(0);
                        C29661o.m59771a(this.f69866V, this.f69883i);
                    }
                    if (!TextUtils.isEmpty(gVar.f70083d) && (bVar.mo51547n() || !bVar.mo51548o())) {
                        this.f69885k.setVisibility(0);
                        FrameLayout.LayoutParams layoutParams10 = new FrameLayout.LayoutParams((int) C29661o.m59767a(getContext(), 40.0f), (int) C29661o.m59767a(getContext(), 22.0f));
                        layoutParams10.gravity = 8388691;
                        int a11 = (int) C29661o.m59767a(getContext(), 8.0f);
                        layoutParams10.setMargins(a11, 0, 0, (int) C29661o.m59767a(getContext(), 8.0f));
                        int i16 = Build.VERSION.SDK_INT;
                        layoutParams10.setMarginStart(a11);
                        layoutParams10.setMarginEnd(0);
                        this.f69885k.setGravity(17);
                        GradientDrawable c3 = m58915c(4);
                        if (!TextUtils.isEmpty(gVar.f70080a)) {
                            c3.setColor(C29654j.m59704a(gVar.f70080a, "#32222222"));
                        } else {
                            c3.setColor(-16777216);
                            c3.setAlpha(153);
                        }
                        int i17 = Build.VERSION.SDK_INT;
                        this.f69885k.setBackground(c3);
                        if (!TextUtils.isEmpty(gVar.f70082c)) {
                            this.f69885k.setTextColor(C29654j.m59704a(gVar.f70082c, "#ffffff"));
                        } else {
                            this.f69885k.setTextColor(-1);
                        }
                        this.f69885k.setTextSize(1, 12.0f);
                        this.f69885k.setText(gVar.f70083d);
                        this.f69885k.setLayoutParams(layoutParams10);
                        C29661o.m59771a(this.f69885k, this.f69876b);
                    }
                }
            } else if (TextUtils.isEmpty(gVar.f70083d)) {
                C29661o.m59771a(this.f69879e, this.f69883i);
                C29661o.m59771a(this.f69884j, this.f69883i);
            } else {
                C29661o.m59772a(true, this.f69885k);
                C29661o.m59772a(false, this.f69884j, this.f69879e);
                this.f69885k.setTextSize(1, 12.0f);
                this.f69885k.setOnClickListener(new View.OnClickListener() {
                    /* class com.p2082ss.android.p2092ad.splash.core.C29411c.View$OnClickListenerC2941714 */

                    static {
                        Covode.recordClassIndex(35811);
                    }

                    public final void onClick(View view) {
                        ClickAgent.onClick(view);
                        HashMap hashMap = new HashMap(1);
                        hashMap.put("refer", "adtag");
                        C29446b.m58971a();
                        C29446b.m58973a(C29411c.this.f69899y, 0, "otherclick", hashMap, null);
                    }
                });
                float a12 = (float) ((int) C29661o.m59767a(getContext(), 1.0f));
                this.f69885k.setShadowLayer(a12, 0.0f, a12, Color.argb(31, 0, 0, 0));
                C29661o.m59772a(true, this.f69892r);
                LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams11.gravity = 16;
                layoutParams11.topMargin = (int) C29661o.m59767a(getContext(), 7.0f);
                int i18 = Build.VERSION.SDK_INT;
                layoutParams11.setMarginEnd((int) C29661o.m59767a(getContext(), 13.0f));
                TextView textView = this.f69885k;
                LinearLayout linearLayout = this.f69883i;
                if (textView != null) {
                    textView.setLayoutParams(layoutParams11);
                }
                C29661o.m59771a(textView, linearLayout);
            }
        }
        setupSkipButtonHitArea(bVar);
    }

    /* renamed from: a */
    public static String m58912a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return str.replace("%", str2);
    }

    /* renamed from: a */
    static void m58913a(View view, AlphaAnimation alphaAnimation) {
        if (view != null && view.getVisibility() == 0) {
            view.startAnimation(alphaAnimation);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0037, code lost:
        if (r3 != 4) goto L_0x000a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onKeyDown(int r10, android.view.KeyEvent r11) {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.p2092ad.splash.core.C29411c.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    /* renamed from: a */
    private SpannableString m58911a(String str, String str2, int i, String str3, String str4, int i2) {
        SpannableString spannableString = new SpannableString(str + str2 + str4);
        spannableString.setSpan(new AbsoluteSizeSpan(18, true), 0, str.length(), 33);
        spannableString.setSpan(new AbsoluteSizeSpan(i, true), str.length(), str.length() + str2.length(), 33);
        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor(str3)), str.length(), str.length() + str2.length(), 33);
        spannableString.setSpan(new AbsoluteSizeSpan(i2, true), str.length() + str2.length(), spannableString.length(), 33);
        int max = Math.max(18, Math.max(i, i2));
        spannableString.setSpan(new C29534e((int) C29661o.m59767a(getContext(), (float) ((-Math.abs(max - 18)) / 2))), 0, str.length(), 33);
        spannableString.setSpan(new C29534e((int) C29661o.m59767a(getContext(), (float) ((-Math.abs(max - i)) / 2))), str.length(), str.length() + str2.length(), 33);
        spannableString.setSpan(new C29534e((int) C29661o.m59767a(getContext(), (float) ((-Math.abs(max - i2)) / 2))), str.length() + str2.length(), spannableString.length(), 33);
        return spannableString;
    }
}
