package com.p2082ss.android.ugc.aweme.commercialize.views;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C0643b;
import androidx.core.p037h.C0792v;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.facebook.fresco.animation.p1867c.C24290a;
import com.facebook.fresco.animation.p1867c.p1868a.C24293a;
import com.p2082ss.android.ugc.aweme.C34789bd;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.commercialize.C38000g;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.feed.model.commercialize.CommerceSmartUITasks;
import com.p2082ss.android.ugc.aweme.p3452ml.api.SmartFeedAdUIService;
import com.p2082ss.android.ugc.aweme.utils.C80595j;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.d */
public abstract class AbstractC38925d extends FrameLayout {

    /* renamed from: l */
    private static final String f91928l = AbstractC38925d.class.getSimpleName();

    /* renamed from: A */
    private long f91929A;

    /* renamed from: a */
    protected View f91930a;

    /* renamed from: b */
    public int f91931b;

    /* renamed from: c */
    protected TextView f91932c;

    /* renamed from: d */
    protected TextView f91933d;

    /* renamed from: e */
    protected RemoteImageView f91934e;

    /* renamed from: f */
    protected ImageView f91935f;

    /* renamed from: g */
    protected Aweme f91936g;

    /* renamed from: h */
    protected LottieAnimationView f91937h;

    /* renamed from: i */
    protected C24290a f91938i;

    /* renamed from: j */
    protected ValueAnimator f91939j;

    /* renamed from: k */
    protected DataCenter f91940k;

    /* renamed from: m */
    private boolean f91941m;

    /* renamed from: n */
    private View f91942n;

    /* renamed from: o */
    private View f91943o;

    /* renamed from: p */
    private ObjectAnimator f91944p;

    /* renamed from: q */
    private ObjectAnimator f91945q;

    /* renamed from: r */
    private int f91946r;

    /* renamed from: s */
    private Context f91947s;

    /* renamed from: t */
    private String f91948t;

    /* renamed from: u */
    private Runnable f91949u;

    /* renamed from: v */
    private Runnable f91950v;

    /* renamed from: w */
    private View f91951w;

    /* renamed from: x */
    private boolean f91952x;

    /* renamed from: y */
    private Runnable f91953y;

    /* renamed from: z */
    private int f91954z;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo67359a(int i, int i2);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract boolean mo67361a();

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract boolean mo67363b();

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract boolean mo67364c();

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract void mo67365d();

    /* access modifiers changed from: package-private */
    public abstract int getLayoutId();

    /* access modifiers changed from: package-private */
    public abstract void setLabelVisibility(int i);

    public int getDefaultColor() {
        return this.f91954z;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    /* renamed from: f */
    public final void mo67605f() {
        mo67361a();
    }

    static {
        Covode.recordClassIndex(46512);
    }

    /* renamed from: m */
    private boolean m79037m() {
        if (this.f91946r == 4) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    private boolean m79038n() {
        if (this.f91946r == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    private boolean m79039o() {
        if (this.f91946r == 2) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo67604e() {
        if (!this.f91952x) {
            mo67367k();
            this.f91952x = true;
        }
    }

    /* renamed from: p */
    private void m79040p() {
        int height;
        DataCenter dataCenter = this.f91940k;
        if (dataCenter != null) {
            View view = this.f91930a;
            if (view == null) {
                height = 0;
            } else {
                height = view.getHeight();
            }
            dataCenter.mo60191a("ad_bottom_label_show", Integer.valueOf(height));
        }
    }

    /* renamed from: q */
    private boolean m79041q() {
        if (m79039o() || m79037m() || m79038n()) {
            return true;
        }
        return false;
    }

    public int getBackGroundColor() {
        int i = this.f91954z;
        Drawable background = getBackground();
        if (background instanceof ColorDrawable) {
            return ((ColorDrawable) background).getColor();
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    public int getShowSeconds() {
        if (m79041q()) {
            return 0;
        }
        return this.f91936g.getAwemeRawAd().getShowButtonSeconds() * 1000;
    }

    /* renamed from: h */
    public final void mo67611h() {
        this.f91941m = false;
        this.f91931b = 0;
        Runnable runnable = this.f91949u;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f91950v;
        if (runnable2 != null) {
            removeCallbacks(runnable2);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (!TextUtils.isEmpty(this.f91948t)) {
            this.f91948t = null;
        }
        mo67368l();
    }

    /* renamed from: l */
    private void mo67368l() {
        ObjectAnimator objectAnimator = this.f91944p;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.f91942n.clearAnimation();
        }
        ObjectAnimator objectAnimator2 = this.f91945q;
        if (objectAnimator2 != null) {
            objectAnimator2.cancel();
            this.f91943o.clearAnimation();
        }
        View view = this.f91942n;
        if (view != null) {
            view.setBackgroundDrawable(null);
        }
        View view2 = this.f91943o;
        if (view2 != null) {
            view2.setBackgroundDrawable(null);
        }
    }

    /* access modifiers changed from: package-private */
    public int getColorChangeSeconds() {
        Aweme aweme = this.f91936g;
        if (aweme == null || !aweme.isAd() || this.f91936g.getAwemeRawAd().getAnimationType() != 3) {
            return getShowSeconds();
        }
        return Math.max(getShowSeconds(), this.f91936g.getAwemeRawAd().getShowButtonColorSeconds() * 1000);
    }

    /* renamed from: i */
    public final void mo67612i() {
        if (this.f91938i != null && this.f91939j != null) {
            this.f91934e.removeCallbacks(this.f91953y);
            this.f91939j.end();
            this.f91938i.mo40068a(0);
            this.f91938i.stop();
            this.f91938i = null;
        }
    }

    /* renamed from: k */
    private void mo67367k() {
        View inflate = View.inflate(getContext(), getLayoutId(), this);
        this.f91930a = inflate;
        this.f91942n = inflate.findViewById(R.id.ao7);
        this.f91943o = this.f91930a.findViewById(R.id.ao8);
        this.f91932c = (TextView) this.f91930a.findViewById(R.id.cfx);
        this.f91933d = (TextView) this.f91930a.findViewById(R.id.cfu);
        this.f91935f = (ImageView) this.f91930a.findViewById(R.id.ao6);
        this.f91951w = this.f91930a.findViewById(R.id.aoa);
        this.f91937h = (LottieAnimationView) this.f91930a.findViewById(R.id.emb);
        this.f91934e = (RemoteImageView) this.f91930a.findViewById(R.id.dkp);
        C80595j.m139739a(this);
        this.f91931b = 0;
    }

    /* renamed from: g */
    public final void mo67606g() {
        if (mo67361a() && !m79037m() && !m79038n()) {
            mo67604e();
            mo67368l();
            this.f91942n.setVisibility(0);
            this.f91942n.setBackgroundResource(2131231698);
            int a = C13628n.m24504a(this.f91947s);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f91942n, "translationX", (float) (-a), (float) a);
            this.f91944p = ofFloat;
            ofFloat.setDuration(1500L);
            this.f91944p.setRepeatCount(0);
            this.f91944p.start();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final /* synthetic */ void mo67613j() {
        AwemeRawAd awemeRawAd;
        Animatable i;
        if (this.f91934e.getController() != null && (awemeRawAd = this.f91936g.getAwemeRawAd()) != null && awemeRawAd.getButtonIcon() != null && (i = this.f91934e.getController().mo39821i()) != null && awemeRawAd.getButtonIconAnimationRepeatTimes() != 0) {
            C24290a aVar = (C24290a) i;
            this.f91938i = aVar;
            ValueAnimator a = C24293a.m46220a(aVar);
            this.f91939j = a;
            a.setRepeatCount(awemeRawAd.getButtonIconAnimationRepeatTimes() - 1);
            this.f91939j.start();
        }
    }

    /* access modifiers changed from: package-private */
    public void setDefaultColor(int i) {
        this.f91954z = i;
    }

    public void setDownloadUrl(String str) {
        this.f91948t = str;
    }

    /* renamed from: b */
    public final void mo67600b(long j) {
        Aweme aweme = this.f91936g;
        if (aweme != null && C37699a.m76238aJ(aweme)) {
            this.f91934e.postDelayed(this.f91953y, j);
        }
    }

    /* renamed from: a */
    public final void mo67594a(long j) {
        int i;
        int colorDelay;
        int i2;
        int buttonShow;
        if (mo67361a()) {
            this.f91929A = 0;
            mo67604e();
            if (!mo67363b()) {
                Runnable runnable = this.f91949u;
                if (runnable != null) {
                    removeCallbacks(runnable);
                }
                int showSeconds = getShowSeconds();
                CommerceSmartUITasks predictTaskIndex = SmartFeedAdUIService.instance().getPredictTaskIndex();
                if (predictTaskIndex == null || (buttonShow = predictTaskIndex.getButtonShow()) < 0) {
                    i2 = 0;
                } else {
                    showSeconds = buttonShow * 1000;
                    i2 = 1;
                }
                if (this.f91949u == null) {
                    this.f91949u = new RunnableC38927f(this, i2, showSeconds);
                }
                long j2 = this.f91929A;
                long j3 = (long) showSeconds;
                if (j2 >= j3) {
                    int showSeconds2 = getShowSeconds() / 1000;
                    if (C37699a.m76314s(this.f91936g) && !mo67363b()) {
                        C38000g.m77050a().mo65898j(this.f91947s, this.f91936g);
                        Aweme aweme = this.f91936g;
                        if (aweme != null) {
                            C18129a.m33746a("draw_ad", "button_show", aweme.getAwemeRawAd()).mo28902c();
                            C18129a.m33746a("draw_ad", "othershow", this.f91936g.getAwemeRawAd()).mo28900b("refer", "button").mo28902c();
                            if (SmartFeedAdUIService.instance().getSmartAdUIExperimentValue() != null) {
                                m79034a(showSeconds2, 0, 1, i2);
                            }
                        }
                    }
                    View view = this.f91930a;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        marginLayoutParams.bottomMargin = 0;
                        this.f91930a.setLayoutParams(marginLayoutParams);
                        m79040p();
                    }
                } else {
                    postDelayed(this.f91949u, j3 - j2);
                }
            }
            if (mo67364c() && !m79041q() && !this.f91941m) {
                int colorChangeSeconds = getColorChangeSeconds();
                CommerceSmartUITasks predictTaskIndex2 = SmartFeedAdUIService.instance().getPredictTaskIndex();
                if (predictTaskIndex2 == null || (colorDelay = predictTaskIndex2.getColorDelay()) < 0) {
                    i = 0;
                } else {
                    colorChangeSeconds = colorDelay * 1000;
                    i = 1;
                }
                Runnable runnable2 = this.f91950v;
                if (runnable2 != null) {
                    removeCallbacks(runnable2);
                }
                if (this.f91950v == null) {
                    this.f91950v = new RunnableC38942g(this, i, colorChangeSeconds);
                }
                long j4 = this.f91929A;
                long j5 = (long) colorChangeSeconds;
                if (j4 >= j5) {
                    int colorChangeSeconds2 = getColorChangeSeconds() / 1000;
                    if (mo67364c() && !m79041q()) {
                        mo67359a(Color.parseColor(C37699a.m76265ak(this.f91936g)), 0);
                        this.f91941m = true;
                        if (SmartFeedAdUIService.instance().getSmartAdUIExperimentValue() != null) {
                            m79034a(colorChangeSeconds2, 0, 2, i);
                        }
                    }
                } else {
                    postDelayed(this.f91950v, j5 - j4);
                }
            }
            this.f91929A = 0;
        }
    }

    /* renamed from: a */
    public final void mo67597a(String str) {
        mo67604e();
        this.f91946r = 1;
        this.f91942n.setVisibility(8);
        this.f91943o.setVisibility(8);
        this.f91933d.setVisibility(0);
        this.f91933d.setText(str);
        this.f91933d.setTextColor(C0643b.m2378c(this.f91947s, R.color.a9));
        this.f91932c.setVisibility(8);
        mo67598a(true);
    }

    /* renamed from: a */
    public final void mo67598a(boolean z) {
        Aweme aweme = this.f91936g;
        if (aweme != null) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd == null || awemeRawAd.getButtonIcon() == null) {
                C13628n.m24510a(this.f91934e, 8);
                return;
            }
            C13628n.m24510a(this.f91934e, 0);
            if (z) {
                this.f91934e.setAlpha(1.0f);
            } else {
                this.f91934e.setAlpha(0.5f);
            }
        }
    }

    public AbstractC38925d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo67602c(int i, int i2) {
        if (C37699a.m76314s(this.f91936g) && !mo67363b()) {
            mo67601b(this, new RunnableC38944i(this, i, i2));
        }
        C38000g.m77053d().mo67203a(this.f91930a, 0, 300, true);
        m79040p();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo67601b(View view, Runnable runnable) {
        if (runnable != null && view != null && C0792v.m2791y(view)) {
            if (!C34729o.m70960b(view) || C17873f.f42636l || C34789bd.m71023a(view.getContext()) == 2) {
                view.postDelayed(new RunnableC38943h(this, view, runnable), 100);
            } else {
                runnable.run();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo67599b(int i, int i2) {
        int parseColor;
        if (mo67364c() && !m79041q()) {
            if (C37699a.m76319x(this.f91936g)) {
                parseColor = C0643b.m2378c(getContext(), R.color.bh);
            } else if (C37699a.m76233aE(this.f91936g)) {
                parseColor = Color.parseColor(C37699a.m76247aS(this.f91936g));
            } else {
                parseColor = Color.parseColor(C37699a.m76265ak(this.f91936g));
            }
            mo67359a(parseColor, 300);
            this.f91941m = true;
            if (i == 1) {
                m79034a(getColorChangeSeconds() / 1000, i2 / 1000, 2, 1);
            } else if (SmartFeedAdUIService.instance().getSmartAdUIExperimentValue() != null) {
                m79034a(getColorChangeSeconds() / 1000, getColorChangeSeconds() / 1000, 2, 0);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo67603d(int i, int i2) {
        if (this.f91936g != null) {
            C38000g.m77050a().mo65898j(this.f91947s, this.f91936g);
            C18129a.m33746a("draw_ad", "button_show", this.f91936g.getAwemeRawAd()).mo28902c();
            C18129a.m33746a("draw_ad", "othershow", this.f91936g.getAwemeRawAd()).mo28900b("refer", "button").mo28902c();
            if (!mo67364c()) {
                mo67600b(1300);
            }
            if (i == 1) {
                m79034a(getShowSeconds() / 1000, i2 / 1000, 1, 1);
            } else if (SmartFeedAdUIService.instance().getSmartAdUIExperimentValue() != null) {
                m79034a(getShowSeconds() / 1000, getShowSeconds() / 1000, 1, 0);
            }
        }
    }

    /* renamed from: a */
    public final void mo67596a(Aweme aweme, DataCenter dataCenter) {
        String a;
        AwemeRawAd awemeRawAd;
        this.f91940k = dataCenter;
        this.f91936g = aweme;
        if (!mo67361a()) {
            setLabelVisibility(8);
            return;
        }
        Aweme aweme2 = this.f91936g;
        if (aweme2 == null || !aweme2.isAd()) {
            setLabelVisibility(8);
            return;
        }
        mo67604e();
        mo67365d();
        setLabelVisibility(0);
        if (C37699a.m76319x(aweme)) {
            a = C37699a.m76257ac(aweme);
        } else {
            a = C38000g.m77053d().mo67202a(getContext(), aweme);
        }
        if (aweme.isAppAd()) {
            mo67604e();
            mo67368l();
            this.f91946r = 0;
            this.f91942n.setVisibility(8);
            this.f91943o.setVisibility(8);
            this.f91933d.setTextColor(C0643b.m2378c(this.f91947s, R.color.ac));
            this.f91933d.setText(a);
            this.f91932c.setVisibility(8);
            this.f91935f.setImageResource(R.drawable.b1l);
            this.f91935f.setVisibility(0);
            mo67598a(false);
        } else {
            if (mo67364c()) {
                a = this.f91947s.getString(R.string.a6n, a);
            }
            mo67597a(a);
        }
        Aweme aweme3 = this.f91936g;
        if (aweme3 != null && (awemeRawAd = aweme3.getAwemeRawAd()) != null && awemeRawAd.getButtonIcon() != null) {
            if (C37699a.m76238aJ(this.f91936g)) {
                C34577e.m70599a(this.f91934e, awemeRawAd.getButtonIcon());
            } else {
                C34577e.m70608b(this.f91934e, awemeRawAd.getButtonIcon(), -1, -1);
            }
        }
    }

    public AbstractC38925d(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        this.f91953y = new RunnableC38926e(this);
        this.f91929A = 0;
        this.f91947s = context;
    }

    /* renamed from: a */
    private static void m79034a(int i, int i2, int i3, int i4) {
        C39162r.m79460a("ad_ui_adjust", new C33744d().mo59980a("original_time", i).mo59980a("real_time", i2).mo59980a("tag", i3).mo59980a("is_adjusted", i4).f79943a);
    }
}
