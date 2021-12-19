package com.p2082ss.android.ugc.aweme.kids.commonfeed.p3347ui.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.content.C0643b;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.p2082ss.android.ugc.aweme.base.opensourcemodified.android.support.p2378v4.widget.AbstractC34638b;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.common.widget.AbstractC39191c;
import com.p2082ss.android.ugc.aweme.kids.commonfeed.AbstractC57383a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4612a.AbstractC89171a;

/* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.ui.widget.LoadMoreFrameLayout */
public class LoadMoreFrameLayout extends FrameLayout {

    /* renamed from: a */
    public AbstractC39191c f131182a;

    /* renamed from: b */
    public AbstractC34638b f131183b;

    /* renamed from: c */
    public AbstractC57383a f131184c;

    /* renamed from: d */
    public int f131185d;

    /* renamed from: e */
    public int f131186e;

    /* renamed from: f */
    public long f131187f;

    /* renamed from: g */
    public String f131188g;

    /* renamed from: h */
    final AbstractC89171a<String> f131189h;

    /* renamed from: i */
    final AbstractC89171a<String> f131190i;

    /* renamed from: j */
    private DmtStatusView f131191j;

    /* renamed from: k */
    private int f131192k;

    /* renamed from: l */
    private boolean f131193l;

    /* renamed from: m */
    private float f131194m;

    /* renamed from: n */
    private float f131195n;

    /* renamed from: o */
    private int f131196o;

    /* renamed from: p */
    private ValueAnimator f131197p;

    /* renamed from: q */
    private boolean f131198q;

    /* renamed from: r */
    private Drawable f131199r;

    /* renamed from: s */
    private View f131200s;

    /* renamed from: t */
    private AbstractC57514a f131201t;

    /* renamed from: u */
    private AbstractC57515b f131202u;

    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.ui.widget.LoadMoreFrameLayout$a */
    public interface AbstractC57514a {
        static {
            Covode.recordClassIndex(67454);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.ui.widget.LoadMoreFrameLayout$b */
    public interface AbstractC57515b {
        static {
            Covode.recordClassIndex(67455);
        }
    }

    static {
        Covode.recordClassIndex(67448);
    }

    /* renamed from: c */
    private void m104182c() {
        DmtStatusView a = mo94775a(false);
        if (a != null) {
            a.setVisibility(8);
        }
    }

    public int getViewPagerMarginTop() {
        AbstractC39191c cVar = this.f131182a;
        if (cVar == null) {
            return 0;
        }
        return ((ViewGroup.MarginLayoutParams) cVar.getLayoutParams()).topMargin;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        try {
            super.onFinishInflate();
            this.f131198q = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public final void mo94776a() {
        DmtStatusView a = mo94775a(false);
        if (a != null) {
            a.mo27382d();
        }
        this.f131185d = -1;
        if (this.f131182a != null) {
            mo94777b();
        }
        if (this.f131187f != -1 && !TextUtils.isEmpty(this.f131188g)) {
            this.f131187f = -1;
        }
    }

    /* renamed from: b */
    public final void mo94777b() {
        this.f131197p = ValueAnimator.ofFloat(0.0f, 1.0f);
        final int viewPagerMarginTop = getViewPagerMarginTop();
        int i = (viewPagerMarginTop * -200) / this.f131196o;
        if (i < 0) {
            i = 200;
        }
        this.f131197p.setDuration((long) i);
        this.f131197p.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.p2082ss.android.ugc.aweme.kids.commonfeed.p3347ui.widget.LoadMoreFrameLayout.C575102 */

            static {
                Covode.recordClassIndex(67450);
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
        this.f131197p.addListener(new Animator.AnimatorListener() {
            /* class com.p2082ss.android.ugc.aweme.kids.commonfeed.p3347ui.widget.LoadMoreFrameLayout.C575113 */

            static {
                Covode.recordClassIndex(67451);
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
        this.f131197p.start();
        m104182c();
    }

    public void setLabel(String str) {
        this.f131188g = str;
    }

    public void setLoadMoreListener(AbstractC57383a aVar) {
        this.f131184c = aVar;
    }

    public void setOnLoadMoreUiListener(AbstractC57514a aVar) {
        this.f131201t = aVar;
    }

    public void setOnScrolledListener(AbstractC57515b bVar) {
        this.f131202u = bVar;
    }

    public void setLoadMoreEmptyView(View view) {
        this.f131200s = view;
        this.f131191j = null;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        MethodCollector.m26663i(6428);
        super.onDraw(canvas);
        MethodCollector.m26664o(6428);
    }

    public void setBottomViewBackground(Drawable drawable) {
        DmtStatusView a = mo94775a(false);
        if (a != null) {
            a.setBackgroundDrawable(drawable);
        } else {
            this.f131199r = drawable;
        }
    }

    public void setViewPagerMarginTopByDelta(int i) {
        AbstractC39191c cVar = this.f131182a;
        if (cVar != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) cVar.getLayoutParams();
            marginLayoutParams.topMargin += i;
            marginLayoutParams.bottomMargin = -marginLayoutParams.topMargin;
            if (this.f131202u != null) {
                int i2 = marginLayoutParams.topMargin;
            }
            this.f131182a.setLayoutParams(marginLayoutParams);
        }
    }

    /* renamed from: a */
    public final DmtStatusView mo94775a(boolean z) {
        MethodCollector.m26663i(6562);
        if (this.f131191j == null && z && this.f131198q) {
            try {
                this.f131191j = new DmtStatusView(getContext());
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, C34728n.m70946a(60.0d));
                layoutParams.gravity = 80;
                layoutParams.setMargins(0, 0, 0, C34728n.m70946a(49.0d));
                addView(this.f131191j, 0, layoutParams);
                if (this.f131200s == null) {
                    TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.bif, (ViewGroup) null);
                    textView.setGravity(17);
                    textView.setTextColor(C0643b.m2378c(getContext(), R.color.ac));
                    this.f131200s = textView;
                }
                this.f131191j.setBuilder(DmtStatusView.C17269a.m31905a(getContext()).mo27402a(new View.OnClickListener() {
                    /* class com.p2082ss.android.ugc.aweme.kids.commonfeed.p3347ui.widget.LoadMoreFrameLayout.View$OnClickListenerC575091 */

                    static {
                        Covode.recordClassIndex(67449);
                    }

                    public final void onClick(View view) {
                        ClickAgent.onClick(view);
                        if (LoadMoreFrameLayout.this.f131184c != null) {
                            LoadMoreFrameLayout.this.f131184c.mo94649a();
                        }
                    }
                }).mo27406b(this.f131200s));
                Drawable drawable = this.f131199r;
                if (drawable != null) {
                    this.f131191j.setBackgroundDrawable(drawable);
                }
            } catch (Exception e) {
                this.f131191j = null;
                this.f131199r = null;
                e.printStackTrace();
            }
        }
        DmtStatusView dmtStatusView = this.f131191j;
        if (dmtStatusView != null && dmtStatusView.mo27383e()) {
            this.f131185d = -1;
        }
        DmtStatusView dmtStatusView2 = this.f131191j;
        MethodCollector.m26664o(6562);
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
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.kids.commonfeed.p3347ui.widget.LoadMoreFrameLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractC39191c cVar;
        AbstractC34638b bVar;
        int i;
        DmtStatusView a = mo94775a(true);
        if (a == null || (cVar = this.f131182a) == null || cVar.getAdapter() == null || this.f131182a.getAdapter().getCount() == 0 || this.f131182a.getAdapter().getCount() - 1 != this.f131182a.getCurrentItem() || this.f131182a.mo67976a() || ((bVar = this.f131183b) != null && bVar.mo61107a())) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3 && this.f131193l) {
                        mo94777b();
                    }
                } else if (this.f131193l) {
                    float y = motionEvent.getY();
                    int i2 = (int) ((y - this.f131195n) / 1.0f);
                    this.f131195n = y;
                    int viewPagerMarginTop = getViewPagerMarginTop();
                    int i3 = viewPagerMarginTop + i2;
                    if (i3 > 0) {
                        i2 = -viewPagerMarginTop;
                    }
                    if (i3 >= (-this.f131196o)) {
                        setViewPagerMarginTopByDelta(i2);
                        if (a.mo27383e()) {
                            a.mo27384f();
                        } else {
                            DmtStatusView a2 = mo94775a(true);
                            if (a2 != null) {
                                a2.setVisibility(0);
                            }
                            setBackgroundColor(C0643b.m2378c(getContext(), R.color.a2));
                        }
                    }
                }
            } else if (this.f131193l) {
                if (getViewPagerMarginTop() > (-this.f131186e) || (i = this.f131185d) == 1 || i == 2) {
                    mo94777b();
                } else {
                    this.f131197p = ValueAnimator.ofFloat(0.0f, 1.0f);
                    final int viewPagerMarginTop2 = getViewPagerMarginTop();
                    int i4 = ((this.f131186e + viewPagerMarginTop2) * -200) / this.f131196o;
                    if (i4 < 0) {
                        i4 = 200;
                    }
                    this.f131197p.setDuration((long) i4);
                    this.f131197p.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        /* class com.p2082ss.android.ugc.aweme.kids.commonfeed.p3347ui.widget.LoadMoreFrameLayout.C575124 */

                        static {
                            Covode.recordClassIndex(67452);
                        }

                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            int i;
                            float animatedFraction = valueAnimator.getAnimatedFraction();
                            int viewPagerMarginTop = LoadMoreFrameLayout.this.getViewPagerMarginTop();
                            LoadMoreFrameLayout loadMoreFrameLayout = LoadMoreFrameLayout.this;
                            if (animatedFraction == 1.0f) {
                                i = -(viewPagerMarginTop + loadMoreFrameLayout.f131186e);
                            } else {
                                double pow = 1.0d - Math.pow((double) animatedFraction, 3.0d);
                                double d = (double) (viewPagerMarginTop2 + LoadMoreFrameLayout.this.f131186e);
                                Double.isNaN(d);
                                double d2 = pow * d;
                                double viewPagerMarginTop2 = (double) (LoadMoreFrameLayout.this.getViewPagerMarginTop() + LoadMoreFrameLayout.this.f131186e);
                                Double.isNaN(viewPagerMarginTop2);
                                i = (int) (d2 - viewPagerMarginTop2);
                            }
                            loadMoreFrameLayout.setViewPagerMarginTopByDelta(i);
                        }
                    });
                    this.f131197p.addListener(new Animator.AnimatorListener() {
                        /* class com.p2082ss.android.ugc.aweme.kids.commonfeed.p3347ui.widget.LoadMoreFrameLayout.C575135 */

                        static {
                            Covode.recordClassIndex(67453);
                        }

                        public final void onAnimationCancel(Animator animator) {
                        }

                        public final void onAnimationRepeat(Animator animator) {
                        }

                        public final void onAnimationStart(Animator animator) {
                        }

                        public final void onAnimationEnd(Animator animator) {
                            if (LoadMoreFrameLayout.this.f131184c != null && LoadMoreFrameLayout.this.f131185d == -1) {
                                LoadMoreFrameLayout.this.f131184c.mo94649a();
                            }
                        }
                    });
                    this.f131197p.start();
                }
            }
            this.f131193l = false;
        } else {
            this.f131193l = false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public LoadMoreFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private LoadMoreFrameLayout(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(6269);
        this.f131185d = -1;
        this.f131187f = -1;
        this.f131189h = C57533b.f131340a;
        this.f131190i = C57534c.f131341a;
        this.f131192k = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f131186e = (int) (getContext().getResources().getDisplayMetrics().density * 109.0f);
        this.f131196o = (int) (getContext().getResources().getDisplayMetrics().density * 218.0f);
        MethodCollector.m26664o(6269);
    }
}
