package com.p2082ss.android.ugc.aweme.feed.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.content.C0643b;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.p2082ss.android.ugc.aweme.app.C33830n;
import com.p2082ss.android.ugc.aweme.base.opensourcemodified.android.support.p2378v4.widget.AbstractC34638b;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.common.widget.AbstractC39191c;
import com.p2082ss.android.ugc.aweme.detail.transition.C41333b;
import com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48151ak;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4612a.AbstractC89171a;

/* renamed from: com.ss.android.ugc.aweme.feed.widget.LoadMoreFrameLayout */
public class LoadMoreFrameLayout extends FrameLayout {

    /* renamed from: g */
    private static final String[] f116642g = {"personal_homepage", "others_homepage", "challenge", "single_song", "prop_page", "duet_page", "mv_page", "poi_detail"};

    /* renamed from: A */
    private AbstractC50500c f116643A;

    /* renamed from: a */
    public AbstractC48151ak f116644a;

    /* renamed from: b */
    public int f116645b;

    /* renamed from: c */
    public int f116646c;

    /* renamed from: d */
    final AbstractC89171a<String> f116647d;

    /* renamed from: e */
    final AbstractC89171a<String> f116648e;

    /* renamed from: f */
    public int f116649f;

    /* renamed from: h */
    private int f116650h;

    /* renamed from: i */
    private DmtStatusView f116651i;

    /* renamed from: j */
    private AbstractC39191c f116652j;

    /* renamed from: k */
    private AbstractC34638b f116653k;

    /* renamed from: l */
    private int f116654l;

    /* renamed from: m */
    private boolean f116655m;

    /* renamed from: n */
    private boolean f116656n;

    /* renamed from: o */
    private float f116657o;

    /* renamed from: p */
    private float f116658p;

    /* renamed from: q */
    private int f116659q;

    /* renamed from: r */
    private ValueAnimator f116660r;

    /* renamed from: s */
    private long f116661s;

    /* renamed from: t */
    private String f116662t;

    /* renamed from: u */
    private boolean f116663u;

    /* renamed from: v */
    private Drawable f116664v;

    /* renamed from: w */
    private View f116665w;

    /* renamed from: x */
    private AbstractC50499b f116666x;

    /* renamed from: y */
    private AbstractC50498a f116667y;

    /* renamed from: z */
    private String f116668z;

    /* renamed from: com.ss.android.ugc.aweme.feed.widget.LoadMoreFrameLayout$a */
    public interface AbstractC50498a {
        static {
            Covode.recordClassIndex(59641);
        }

        /* renamed from: a */
        void mo70522a();
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.widget.LoadMoreFrameLayout$b */
    public interface AbstractC50499b {
        static {
            Covode.recordClassIndex(59642);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.widget.LoadMoreFrameLayout$c */
    public interface AbstractC50500c {
        static {
            Covode.recordClassIndex(59643);
        }

        /* renamed from: a */
        void mo84863a(int i);
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        try {
            super.onFinishInflate();
            this.f116663u = true;
        } catch (Exception unused) {
        }
    }

    /* renamed from: f */
    public final void mo85755f() {
        DmtStatusView a = mo85748a(false);
        if (a != null) {
            a.setVisibility(8);
        }
    }

    public int getViewPagerMarginTop() {
        AbstractC39191c cVar = this.f116652j;
        if (cVar == null) {
            return 0;
        }
        return ((ViewGroup.MarginLayoutParams) cVar.getLayoutParams()).topMargin;
    }

    static {
        Covode.recordClassIndex(59633);
    }

    /* renamed from: b */
    public final void mo85751b() {
        DmtStatusView a = mo85748a(true);
        if (a != null) {
            a.mo27387h();
        }
        this.f116645b = 2;
        mo85753d();
    }

    /* renamed from: e */
    public final void mo85754e() {
        DmtStatusView a = mo85748a(true);
        if (a != null) {
            a.setVisibility(0);
        }
        setBackgroundColor(C0643b.m2378c(getContext(), R.color.a2));
    }

    /* renamed from: a */
    public final void mo85749a() {
        this.f116645b = 0;
        if (this.f116661s == -1) {
            this.f116661s = System.currentTimeMillis();
        }
    }

    /* renamed from: c */
    public final void mo85752c() {
        DmtStatusView a = mo85748a(true);
        if (a != null) {
            a.mo27385g();
        }
        this.f116645b = 1;
        if (this.f116652j != null) {
            m94663i();
        }
        if (this.f116661s != -1 && !TextUtils.isEmpty(this.f116662t)) {
            C33830n.m70670b("aweme_feed_load_more_duration", this.f116662t, (float) (System.currentTimeMillis() - this.f116661s));
            this.f116661s = -1;
        }
    }

    /* renamed from: d */
    public final void mo85753d() {
        DmtStatusView a = mo85748a(false);
        if (a != null) {
            a.mo27382d();
        }
        this.f116645b = -1;
        if (this.f116652j != null) {
            m94663i();
        }
        if (this.f116661s != -1 && !TextUtils.isEmpty(this.f116662t)) {
            C33830n.m70670b("aweme_feed_load_more_duration", this.f116662t, (float) (System.currentTimeMillis() - this.f116661s));
            this.f116661s = -1;
        }
    }

    /* renamed from: g */
    public final void mo85756g() {
        final int i = ((int) (((float) this.f116646c) * 1.5f)) / 100;
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 100);
        ofInt.setDuration(300L);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.p2082ss.android.ugc.aweme.feed.widget.LoadMoreFrameLayout.C504944 */

            static {
                Covode.recordClassIndex(59637);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                int i = i * (intValue - LoadMoreFrameLayout.this.f116649f);
                LoadMoreFrameLayout.this.f116649f = intValue;
                DmtStatusView a = LoadMoreFrameLayout.this.mo85748a(true);
                if (a.mo27383e()) {
                    a.mo27384f();
                } else {
                    LoadMoreFrameLayout.this.mo85754e();
                }
                LoadMoreFrameLayout.this.setViewPagerMarginTopByDelta(-i);
            }
        });
        ofInt.addListener(new Animator.AnimatorListener() {
            /* class com.p2082ss.android.ugc.aweme.feed.widget.LoadMoreFrameLayout.C504955 */

            static {
                Covode.recordClassIndex(59638);
            }

            public final void onAnimationCancel(Animator animator) {
            }

            public final void onAnimationRepeat(Animator animator) {
            }

            public final void onAnimationEnd(Animator animator) {
                LoadMoreFrameLayout.this.mo85758h();
            }

            public final void onAnimationStart(Animator animator) {
                LoadMoreFrameLayout.this.f116649f = 0;
            }
        });
        ofInt.start();
    }

    /* renamed from: i */
    private void m94663i() {
        this.f116660r = ValueAnimator.ofFloat(0.0f, 1.0f);
        final int viewPagerMarginTop = getViewPagerMarginTop();
        this.f116660r.setDuration(200L);
        this.f116660r.setInterpolator(new DecelerateInterpolator());
        this.f116660r.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.p2082ss.android.ugc.aweme.feed.widget.LoadMoreFrameLayout.C504922 */

            static {
                Covode.recordClassIndex(59635);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                int viewPagerMarginTop = LoadMoreFrameLayout.this.getViewPagerMarginTop();
                LoadMoreFrameLayout loadMoreFrameLayout = LoadMoreFrameLayout.this;
                if (animatedFraction == 1.0f) {
                    i = -viewPagerMarginTop;
                } else {
                    double pow = 1.0d - Math.pow((double) animatedFraction, 3.0d);
                    double d = (double) viewPagerMarginTop;
                    Double.isNaN(d);
                    double d2 = pow * d;
                    double viewPagerMarginTop2 = (double) LoadMoreFrameLayout.this.getViewPagerMarginTop();
                    Double.isNaN(viewPagerMarginTop2);
                    i = (int) (d2 - viewPagerMarginTop2);
                }
                loadMoreFrameLayout.setViewPagerMarginTopByDelta(i);
            }
        });
        this.f116660r.addListener(new Animator.AnimatorListener() {
            /* class com.p2082ss.android.ugc.aweme.feed.widget.LoadMoreFrameLayout.C504933 */

            static {
                Covode.recordClassIndex(59636);
            }

            public final void onAnimationCancel(Animator animator) {
            }

            public final void onAnimationRepeat(Animator animator) {
            }

            public final void onAnimationStart(Animator animator) {
            }

            public final void onAnimationEnd(Animator animator) {
                LoadMoreFrameLayout.this.setBackground(null);
            }
        });
        this.f116660r.start();
        mo85755f();
    }

    /* renamed from: h */
    public final void mo85758h() {
        this.f116660r = ValueAnimator.ofFloat(0.0f, 1.0f);
        final int viewPagerMarginTop = getViewPagerMarginTop();
        int i = ((this.f116646c + viewPagerMarginTop) * -200) / this.f116659q;
        if (i < 0) {
            i = 200;
        }
        this.f116660r.setDuration((long) i);
        this.f116660r.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.p2082ss.android.ugc.aweme.feed.widget.LoadMoreFrameLayout.C504966 */

            static {
                Covode.recordClassIndex(59639);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                int viewPagerMarginTop = LoadMoreFrameLayout.this.getViewPagerMarginTop();
                LoadMoreFrameLayout loadMoreFrameLayout = LoadMoreFrameLayout.this;
                if (animatedFraction == 1.0f) {
                    i = -(viewPagerMarginTop + loadMoreFrameLayout.f116646c);
                } else {
                    double pow = 1.0d - Math.pow((double) animatedFraction, 3.0d);
                    double d = (double) (viewPagerMarginTop + LoadMoreFrameLayout.this.f116646c);
                    Double.isNaN(d);
                    double d2 = pow * d;
                    double viewPagerMarginTop2 = (double) (LoadMoreFrameLayout.this.getViewPagerMarginTop() + LoadMoreFrameLayout.this.f116646c);
                    Double.isNaN(viewPagerMarginTop2);
                    i = (int) (d2 - viewPagerMarginTop2);
                }
                loadMoreFrameLayout.setViewPagerMarginTopByDelta(i);
            }
        });
        this.f116660r.addListener(new Animator.AnimatorListener() {
            /* class com.p2082ss.android.ugc.aweme.feed.widget.LoadMoreFrameLayout.C504977 */

            static {
                Covode.recordClassIndex(59640);
            }

            public final void onAnimationCancel(Animator animator) {
            }

            public final void onAnimationRepeat(Animator animator) {
            }

            public final void onAnimationStart(Animator animator) {
            }

            public final void onAnimationEnd(Animator animator) {
                if (LoadMoreFrameLayout.this.f116644a != null && LoadMoreFrameLayout.this.f116645b == -1) {
                    LoadMoreFrameLayout.this.f116644a.mo70521a();
                }
            }
        });
        this.f116660r.start();
    }

    public void setEnterFromPage(String str) {
        this.f116668z = str;
    }

    public void setLabel(String str) {
        this.f116662t = str;
    }

    public void setLoadMoreListener(AbstractC48151ak akVar) {
        this.f116644a = akVar;
    }

    public void setOnGestureTriggerExit(AbstractC50498a aVar) {
        this.f116667y = aVar;
    }

    public void setOnLoadMoreUiListener(AbstractC50499b bVar) {
        this.f116666x = bVar;
    }

    public void setOnScrolledListener(AbstractC50500c cVar) {
        this.f116643A = cVar;
    }

    public LoadMoreFrameLayout(Context context) {
        this(context, null);
    }

    public void setLoadMoreEmptyView(View view) {
        this.f116665w = view;
        this.f116651i = null;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        MethodCollector.m26663i(6192);
        super.onDraw(canvas);
        MethodCollector.m26664o(6192);
    }

    public void setBottomViewBackground(Drawable drawable) {
        DmtStatusView a = mo85748a(false);
        if (a != null) {
            a.setBackgroundDrawable(drawable);
        } else {
            this.f116664v = drawable;
        }
    }

    /* renamed from: a */
    private static boolean m94662a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        for (String str2 : f116642g) {
            if (str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public void setViewPagerMarginTopByDelta(int i) {
        AbstractC39191c cVar = this.f116652j;
        if (cVar != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) cVar.getLayoutParams();
            marginLayoutParams.topMargin += i;
            marginLayoutParams.bottomMargin = -marginLayoutParams.topMargin;
            AbstractC50500c cVar2 = this.f116643A;
            if (cVar2 != null) {
                cVar2.mo84863a(marginLayoutParams.topMargin);
            }
            this.f116652j.setLayoutParams(marginLayoutParams);
        }
    }

    /* renamed from: a */
    public final DmtStatusView mo85748a(boolean z) {
        MethodCollector.m26663i(6340);
        if (this.f116651i == null && z && this.f116663u) {
            try {
                this.f116651i = new DmtStatusView(getContext());
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, C34728n.m70946a(60.0d));
                layoutParams.gravity = 80;
                layoutParams.setMargins(0, 0, 0, C34728n.m70946a(49.0d));
                addView(this.f116651i, 0, layoutParams);
                if (this.f116665w == null) {
                    TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.bif, (ViewGroup) null);
                    textView.setGravity(17);
                    textView.setTextColor(C0643b.m2378c(getContext(), R.color.ac));
                    this.f116665w = textView;
                }
                DmtStatusView.C17269a a = DmtStatusView.C17269a.m31905a(getContext());
                a.mo27402a(new View.OnClickListener() {
                    /* class com.p2082ss.android.ugc.aweme.feed.widget.LoadMoreFrameLayout.View$OnClickListenerC504911 */

                    static {
                        Covode.recordClassIndex(59634);
                    }

                    public final void onClick(View view) {
                        ClickAgent.onClick(view);
                        if (LoadMoreFrameLayout.this.f116644a != null) {
                            LoadMoreFrameLayout.this.f116644a.mo70521a();
                        }
                    }
                });
                if (!C41333b.C41335b.f96469a || !m94662a(this.f116668z)) {
                    a.mo27406b(this.f116665w);
                }
                this.f116651i.setBuilder(a);
                Drawable drawable = this.f116664v;
                if (drawable != null) {
                    this.f116651i.setBackgroundDrawable(drawable);
                }
            } catch (Exception unused) {
                this.f116651i = null;
                this.f116664v = null;
            }
        }
        DmtStatusView dmtStatusView = this.f116651i;
        if (dmtStatusView != null && dmtStatusView.mo27383e()) {
            this.f116645b = -1;
        }
        DmtStatusView dmtStatusView2 = this.f116651i;
        MethodCollector.m26664o(6340);
        return dmtStatusView2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0052, code lost:
        if (r1 != 3) goto L_0x0054;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
        // Method dump skipped, instructions count: 200
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.widget.LoadMoreFrameLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a9, code lost:
        if (r5 <= 0) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c8, code lost:
        if (r5 < 0) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ca, code lost:
        r6 = -r9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r12) {
        /*
        // Method dump skipped, instructions count: 475
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.widget.LoadMoreFrameLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: a */
    public final void mo85750a(AbstractC39191c cVar, AbstractC34638b bVar) {
        this.f116652j = cVar;
        this.f116653k = bVar;
    }

    public LoadMoreFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private LoadMoreFrameLayout(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(6038);
        this.f116645b = -1;
        this.f116661s = -1;
        this.f116647d = C50514g.f116748a;
        this.f116648e = C50515h.f116749a;
        this.f116654l = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f116646c = (int) (getContext().getResources().getDisplayMetrics().density * 109.0f);
        this.f116659q = (int) (getContext().getResources().getDisplayMetrics().density * 218.0f);
        MethodCollector.m26664o(6038);
    }
}
