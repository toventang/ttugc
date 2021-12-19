package com.p2082ss.android.ugc.aweme.tools.draft.ftc.view;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.p2082ss.android.ugc.aweme.base.opensourcemodified.android.support.p2378v4.widget.AbstractC34638b;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.common.widget.AbstractC39191c;
import com.p2082ss.android.ugc.aweme.tools.draft.ftc.p4107b.AbstractC78256a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4612a.AbstractC89171a;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.view.LoadMoreFrameLayout */
public class LoadMoreFrameLayout extends FrameLayout {

    /* renamed from: a */
    public AbstractC39191c f175938a;

    /* renamed from: b */
    public AbstractC34638b f175939b;

    /* renamed from: c */
    public AbstractC78256a f175940c;

    /* renamed from: d */
    public int f175941d;

    /* renamed from: e */
    public int f175942e;

    /* renamed from: f */
    public long f175943f;

    /* renamed from: g */
    public String f175944g;

    /* renamed from: h */
    final AbstractC89171a<String> f175945h;

    /* renamed from: i */
    final AbstractC89171a<String> f175946i;

    /* renamed from: j */
    private DmtStatusView f175947j;

    /* renamed from: k */
    private int f175948k;

    /* renamed from: l */
    private boolean f175949l;

    /* renamed from: m */
    private float f175950m;

    /* renamed from: n */
    private float f175951n;

    /* renamed from: o */
    private int f175952o;

    /* renamed from: p */
    private ValueAnimator f175953p;

    /* renamed from: q */
    private boolean f175954q;

    /* renamed from: r */
    private Drawable f175955r;

    /* renamed from: s */
    private View f175956s;

    /* renamed from: t */
    private AbstractC78347a f175957t;

    /* renamed from: u */
    private AbstractC78348b f175958u;

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.view.LoadMoreFrameLayout$a */
    public interface AbstractC78347a {
        static {
            Covode.recordClassIndex(91467);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.view.LoadMoreFrameLayout$b */
    public interface AbstractC78348b {
        static {
            Covode.recordClassIndex(91468);
        }
    }

    static {
        Covode.recordClassIndex(91461);
    }

    /* renamed from: b */
    private void m136807b() {
        DmtStatusView a = mo122217a(false);
        if (a != null) {
            a.setVisibility(8);
        }
    }

    public int getViewPagerMarginTop() {
        AbstractC39191c cVar = this.f175938a;
        if (cVar == null) {
            return 0;
        }
        return ((ViewGroup.MarginLayoutParams) cVar.getLayoutParams()).topMargin;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        try {
            super.onFinishInflate();
            this.f175954q = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public final void mo122218a() {
        this.f175953p = ValueAnimator.ofFloat(0.0f, 1.0f);
        final int viewPagerMarginTop = getViewPagerMarginTop();
        int i = (viewPagerMarginTop * -200) / this.f175952o;
        if (i < 0) {
            i = 200;
        }
        this.f175953p.setDuration((long) i);
        this.f175953p.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.p2082ss.android.ugc.aweme.tools.draft.ftc.view.LoadMoreFrameLayout.C783432 */

            static {
                Covode.recordClassIndex(91463);
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
        this.f175953p.addListener(new Animator.AnimatorListener() {
            /* class com.p2082ss.android.ugc.aweme.tools.draft.ftc.view.LoadMoreFrameLayout.C783443 */

            static {
                Covode.recordClassIndex(91464);
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
        this.f175953p.start();
        m136807b();
    }

    public void setLabel(String str) {
        this.f175944g = str;
    }

    public void setLoadMoreListener(AbstractC78256a aVar) {
        this.f175940c = aVar;
    }

    public void setOnLoadMoreUiListener(AbstractC78347a aVar) {
        this.f175957t = aVar;
    }

    public void setOnScrolledListener(AbstractC78348b bVar) {
        this.f175958u = bVar;
    }

    public void setLoadMoreEmptyView(View view) {
        this.f175956s = view;
        this.f175947j = null;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        MethodCollector.m26663i(8221);
        super.onDraw(canvas);
        MethodCollector.m26664o(8221);
    }

    public void setBottomViewBackground(Drawable drawable) {
        DmtStatusView a = mo122217a(false);
        if (a != null) {
            a.setBackgroundDrawable(drawable);
        } else {
            this.f175955r = drawable;
        }
    }

    public void setViewPagerMarginTopByDelta(int i) {
        AbstractC39191c cVar = this.f175938a;
        if (cVar != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) cVar.getLayoutParams();
            marginLayoutParams.topMargin += i;
            marginLayoutParams.bottomMargin = -marginLayoutParams.topMargin;
            if (this.f175958u != null) {
                int i2 = marginLayoutParams.topMargin;
            }
            this.f175938a.setLayoutParams(marginLayoutParams);
        }
    }

    /* renamed from: a */
    public final DmtStatusView mo122217a(boolean z) {
        MethodCollector.m26663i(8355);
        if (this.f175947j == null && z && this.f175954q) {
            try {
                this.f175947j = new DmtStatusView(getContext());
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, C34728n.m70946a(60.0d));
                layoutParams.gravity = 80;
                layoutParams.setMargins(0, 0, 0, C34728n.m70946a(49.0d));
                addView(this.f175947j, 0, layoutParams);
                if (this.f175956s == null) {
                    TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.bif, (ViewGroup) null);
                    textView.setGravity(17);
                    textView.setTextColor(getContext().getResources().getColor(R.color.ac));
                    this.f175956s = textView;
                }
                this.f175947j.setBuilder(DmtStatusView.C17269a.m31905a(getContext()).mo27402a(new View.OnClickListener() {
                    /* class com.p2082ss.android.ugc.aweme.tools.draft.ftc.view.LoadMoreFrameLayout.View$OnClickListenerC783421 */

                    static {
                        Covode.recordClassIndex(91462);
                    }

                    public final void onClick(View view) {
                        ClickAgent.onClick(view);
                    }
                }).mo27406b(this.f175956s));
                Drawable drawable = this.f175955r;
                if (drawable != null) {
                    this.f175947j.setBackgroundDrawable(drawable);
                }
            } catch (Exception e) {
                this.f175947j = null;
                this.f175955r = null;
                e.printStackTrace();
            }
        }
        DmtStatusView dmtStatusView = this.f175947j;
        if (dmtStatusView != null && dmtStatusView.mo27383e()) {
            this.f175941d = -1;
        }
        DmtStatusView dmtStatusView2 = this.f175947j;
        MethodCollector.m26664o(8355);
        return dmtStatusView2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004a, code lost:
        if (r1 != 3) goto L_0x004c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
        // Method dump skipped, instructions count: 150
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.tools.draft.ftc.view.LoadMoreFrameLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractC39191c cVar;
        AbstractC34638b bVar;
        int i;
        DmtStatusView a = mo122217a(true);
        if (a == null || (cVar = this.f175938a) == null || cVar.getAdapter() == null || this.f175938a.getAdapter().getCount() == 0 || this.f175938a.getAdapter().getCount() - 1 != this.f175938a.getCurrentItem() || this.f175938a.mo67976a() || ((bVar = this.f175939b) != null && bVar.mo61107a())) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3 && this.f175949l) {
                        mo122218a();
                    }
                } else if (this.f175949l) {
                    float y = motionEvent.getY();
                    int i2 = (int) ((y - this.f175951n) / 1.0f);
                    this.f175951n = y;
                    int viewPagerMarginTop = getViewPagerMarginTop();
                    int i3 = viewPagerMarginTop + i2;
                    if (i3 > 0) {
                        i2 = -viewPagerMarginTop;
                    }
                    if (i3 >= (-this.f175952o)) {
                        setViewPagerMarginTopByDelta(i2);
                        if (a.mo27383e()) {
                            a.mo27384f();
                        } else {
                            DmtStatusView a2 = mo122217a(true);
                            if (a2 != null) {
                                a2.setVisibility(0);
                            }
                            setBackgroundColor(getContext().getResources().getColor(R.color.a2));
                        }
                    }
                }
            } else if (this.f175949l) {
                if (getViewPagerMarginTop() > (-this.f175942e) || (i = this.f175941d) == 1 || i == 2) {
                    mo122218a();
                } else {
                    this.f175953p = ValueAnimator.ofFloat(0.0f, 1.0f);
                    final int viewPagerMarginTop2 = getViewPagerMarginTop();
                    int i4 = ((this.f175942e + viewPagerMarginTop2) * -200) / this.f175952o;
                    if (i4 < 0) {
                        i4 = 200;
                    }
                    this.f175953p.setDuration((long) i4);
                    this.f175953p.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        /* class com.p2082ss.android.ugc.aweme.tools.draft.ftc.view.LoadMoreFrameLayout.C783454 */

                        static {
                            Covode.recordClassIndex(91465);
                        }

                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            int i;
                            float animatedFraction = valueAnimator.getAnimatedFraction();
                            int viewPagerMarginTop = LoadMoreFrameLayout.this.getViewPagerMarginTop();
                            LoadMoreFrameLayout loadMoreFrameLayout = LoadMoreFrameLayout.this;
                            if (animatedFraction == 1.0f) {
                                i = -(viewPagerMarginTop + loadMoreFrameLayout.f175942e);
                            } else {
                                double pow = 1.0d - Math.pow((double) animatedFraction, 3.0d);
                                double d = (double) (viewPagerMarginTop2 + LoadMoreFrameLayout.this.f175942e);
                                Double.isNaN(d);
                                double d2 = pow * d;
                                double viewPagerMarginTop2 = (double) (LoadMoreFrameLayout.this.getViewPagerMarginTop() + LoadMoreFrameLayout.this.f175942e);
                                Double.isNaN(viewPagerMarginTop2);
                                i = (int) (d2 - viewPagerMarginTop2);
                            }
                            loadMoreFrameLayout.setViewPagerMarginTopByDelta(i);
                        }
                    });
                    this.f175953p.addListener(new Animator.AnimatorListener() {
                        /* class com.p2082ss.android.ugc.aweme.tools.draft.ftc.view.LoadMoreFrameLayout.C783465 */

                        static {
                            Covode.recordClassIndex(91466);
                        }

                        public final void onAnimationCancel(Animator animator) {
                        }

                        public final void onAnimationEnd(Animator animator) {
                        }

                        public final void onAnimationRepeat(Animator animator) {
                        }

                        public final void onAnimationStart(Animator animator) {
                        }
                    });
                    this.f175953p.start();
                }
            }
            this.f175949l = false;
        } else {
            this.f175949l = false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public LoadMoreFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private LoadMoreFrameLayout(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(8075);
        this.f175941d = -1;
        this.f175943f = -1;
        this.f175945h = C78371a.f176096a;
        this.f175946i = C78372b.f176097a;
        this.f175948k = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f175942e = (int) (getContext().getResources().getDisplayMetrics().density * 109.0f);
        this.f175952o = (int) (getContext().getResources().getDisplayMetrics().density * 218.0f);
        MethodCollector.m26664o(8075);
    }
}
