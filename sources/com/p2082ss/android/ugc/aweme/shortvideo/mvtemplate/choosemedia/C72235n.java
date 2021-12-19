package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.FloatEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.imagepipeline.p1880e.C24428k;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.tools.C78099c;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.n */
public final class C72235n extends LinearLayout {

    /* renamed from: A */
    private float f161939A;

    /* renamed from: B */
    private float f161940B;

    /* renamed from: C */
    private long f161941C;

    /* renamed from: D */
    private boolean f161942D;

    /* renamed from: a */
    public int f161943a;

    /* renamed from: b */
    public FrameLayout f161944b;

    /* renamed from: c */
    RecyclerView f161945c;

    /* renamed from: d */
    public TextView f161946d;

    /* renamed from: e */
    View f161947e;

    /* renamed from: f */
    ViewPropertyAnimator f161948f;

    /* renamed from: g */
    public ViewPropertyAnimator f161949g;

    /* renamed from: h */
    public AbstractC72241a f161950h;

    /* renamed from: i */
    public AbstractC72243c f161951i;

    /* renamed from: j */
    public boolean f161952j;

    /* renamed from: k */
    boolean f161953k;

    /* renamed from: l */
    public String f161954l;

    /* renamed from: m */
    public final Runnable f161955m;

    /* renamed from: n */
    float f161956n;

    /* renamed from: o */
    float f161957o;

    /* renamed from: p */
    public boolean f161958p;

    /* renamed from: q */
    boolean f161959q;

    /* renamed from: r */
    public boolean f161960r;

    /* renamed from: s */
    final RecyclerView.AbstractC1371n f161961s;

    /* renamed from: t */
    float f161962t;

    /* renamed from: u */
    private int f161963u;

    /* renamed from: v */
    private int f161964v;

    /* renamed from: w */
    private int f161965w;

    /* renamed from: x */
    private ValueAnimator f161966x;

    /* renamed from: y */
    private final Runnable f161967y;

    /* renamed from: z */
    private boolean f161968z;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.n$a */
    public interface AbstractC72241a {
        static {
            Covode.recordClassIndex(84906);
        }

        /* renamed from: a */
        void mo114372a(boolean z);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.n$c */
    public interface AbstractC72243c {
        static {
            Covode.recordClassIndex(84908);
        }

        /* renamed from: a */
        CharSequence mo114273a(int i);
    }

    static {
        Covode.recordClassIndex(84900);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.n$b */
    static class RunnableC72242b implements Runnable {
        static {
            Covode.recordClassIndex(84907);
        }

        private RunnableC72242b() {
        }

        public final void run() {
            C24428k.m46551a().mo40247e().f57872e.mo40429b();
        }

        /* synthetic */ RunnableC72242b(byte b) {
            this();
        }
    }

    /* renamed from: b */
    public final void mo114443b() {
        ValueAnimator valueAnimator = this.f161966x;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f161966x.removeAllUpdateListeners();
            this.f161966x = null;
        }
        if (this.f161960r) {
            this.f161946d.setTranslationX(0.0f);
            m127435a(this.f161944b, C13628n.m24520b(C63238c.f143574a, 146.0f));
        }
    }

    /* renamed from: c */
    public final void mo114444c() {
        this.f161947e.setVisibility(8);
        if (!this.f161960r) {
            this.f161946d.setVisibility(4);
            ViewGroup.LayoutParams layoutParams = this.f161944b.getLayoutParams();
            layoutParams.width = (int) C13628n.m24520b(C63238c.f143574a, 56.0f);
            this.f161944b.setLayoutParams(layoutParams);
        }
        this.f161953k = false;
        this.f161948f = null;
    }

    /* renamed from: a */
    public final void mo114440a() {
        this.f161942D = false;
        ValueAnimator valueAnimator = this.f161966x;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f161966x.removeAllUpdateListeners();
            this.f161966x = null;
        }
    }

    public final void setFastScrollListener(AbstractC72241a aVar) {
        this.f161950h = aVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.n$d */
    class C72244d extends FloatEvaluator {
        static {
            Covode.recordClassIndex(84909);
        }

        private C72244d() {
        }

        /* synthetic */ C72244d(C72235n nVar, byte b) {
            this();
        }

        @Override // android.animation.FloatEvaluator
        public final Float evaluate(float f, Number number, Number number2) {
            float floatValue = super.evaluate(f, number, number2).floatValue();
            C72235n.m127435a(C72235n.this.f161944b, floatValue);
            return Float.valueOf(floatValue);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.n$e */
    class C72245e extends AnimatorListenerAdapter {
        static {
            Covode.recordClassIndex(84910);
        }

        private C72245e() {
        }

        public final void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            C72235n.this.mo114443b();
            C72235n.this.f161958p = false;
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            C72235n.this.mo114443b();
            C72235n.this.f161958p = false;
        }

        /* synthetic */ C72245e(C72235n nVar, byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.n$f */
    class C72246f extends AnimatorListenerAdapter {
        static {
            Covode.recordClassIndex(84911);
        }

        private C72246f() {
        }

        public final void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            C72235n.this.mo114440a();
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            C72235n.this.mo114440a();
        }

        /* synthetic */ C72246f(C72235n nVar, byte b) {
            this();
        }
    }

    public C72235n(Context context) {
        this(context, (byte) 0);
    }

    /* renamed from: a */
    private static void m127434a(ValueAnimator valueAnimator) {
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    private void setHandleSelected(boolean z) {
        this.f161944b.setSelected(z);
    }

    public final void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        layoutParams.width = -1;
        super.setLayoutParams(layoutParams);
    }

    public final void setEnabled(boolean z) {
        int i;
        super.setEnabled(z);
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        setVisibility(i);
    }

    /* renamed from: a */
    public static int m127433a(RecyclerView.AbstractC1362i iVar) {
        if (iVar instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) iVar).mo4371k();
        }
        if (iVar instanceof StaggeredGridLayoutManager) {
            return ((StaggeredGridLayoutManager) iVar).mo4790a((int[]) null)[0];
        }
        return 0;
    }

    private void setScrollBarStartTransX(float f) {
        if (this.f161959q) {
            this.f161957o = -f;
            this.f161956n = -20.0f;
            return;
        }
        this.f161957o = f;
        this.f161956n = 20.0f;
    }

    public final void setViewPositions(float f) {
        int measuredHeight = this.f161944b.getMeasuredHeight();
        this.f161963u = measuredHeight;
        float a = (float) m127432a(this.f161964v - measuredHeight, (int) (f - ((float) (measuredHeight / 2))));
        this.f161944b.setY(a);
        this.f161946d.setY(a);
    }

    public final void setSectionIndexer(AbstractC72243c cVar) {
        this.f161951i = cVar;
        if (this.f161968z && cVar != null) {
            this.f161960r = true;
            this.f161946d.setVisibility(0);
            m127435a(this.f161944b, C13628n.m24520b(C63238c.f143574a, 146.0f));
            m127435a(this.f161946d, C13628n.m24520b(C63238c.f143574a, 116.0f));
            setScrollBarStartTransX(146.0f);
        }
    }

    /* renamed from: a */
    static void m127436a(ViewPropertyAnimator viewPropertyAnimator) {
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void setLayoutParams(ViewGroup viewGroup) {
        RecyclerView recyclerView = this.f161945c;
        if (recyclerView == null || recyclerView.getId() == -1) {
            throw new IllegalArgumentException("RecyclerView must have a view ID");
        } else if (viewGroup instanceof FrameLayout) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
            layoutParams.height = -1;
            layoutParams.gravity = 8388613;
            layoutParams.setMargins(0, 0, 0, 0);
            setLayoutParams(layoutParams);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            this.f161946d.measure(makeMeasureSpec, makeMeasureSpec);
            this.f161944b.measure(makeMeasureSpec, makeMeasureSpec);
            this.f161963u = this.f161944b.getMeasuredHeight();
        } else {
            throw new IllegalArgumentException("Parent ViewGroup must be a ConstraintLayout, CoordinatorLayout, FrameLayout, or RelativeLayout");
        }
    }

    /* renamed from: a */
    static boolean m127437a(View view) {
        if (view == null || view.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void setRecyclerViewPosition(float r5) {
        /*
        // Method dump skipped, instructions count: 151
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C72235n.setRecyclerViewPosition(float):void");
    }

    /* renamed from: b */
    public final float mo114442b(RecyclerView recyclerView) {
        if (recyclerView == null) {
            return 0.0f;
        }
        this.f161963u = this.f161944b.getMeasuredHeight();
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        float computeVerticalScrollRange = (float) ((recyclerView.computeVerticalScrollRange() - this.f161964v) + this.f161963u);
        float f = (float) computeVerticalScrollOffset;
        if (computeVerticalScrollRange <= 0.0f) {
            computeVerticalScrollRange = 1.0f;
        }
        float f2 = f / computeVerticalScrollRange;
        if (this.f161953k && this.f161948f != null) {
            getHandler().removeCallbacks(this.f161955m);
            m127436a(this.f161948f);
        }
        if (Math.abs(computeVerticalScrollOffset - this.f161943a) > this.f161965w / 4 && this.f161952j) {
            this.f161952j = false;
            if (!m127437a(this.f161947e)) {
                this.f161947e.setAlpha(0.0f);
                this.f161947e.setVisibility(0);
                if (((float) this.f161945c.computeVerticalScrollRange()) - (((float) this.f161964v) * 2.1f) > 0.0f) {
                    this.f161947e.setTranslationX(C13628n.m24520b(C63238c.f143574a, this.f161957o));
                    this.f161953k = false;
                    this.f161948f = this.f161947e.animate().translationX(0.0f).alpha(1.0f).setDuration(300).setListener(new AnimatorListenerAdapter() {
                        /* class com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C72235n.C722394 */

                        static {
                            Covode.recordClassIndex(84904);
                        }

                        public final void onAnimationCancel(Animator animator) {
                            C72235n nVar = C72235n.this;
                            nVar.f161947e.setTranslationX(0.0f);
                            nVar.f161947e.setAlpha(1.0f);
                            if (nVar.f161960r) {
                                nVar.f161949g.cancel();
                                nVar.f161949g = null;
                                nVar.f161946d.setTranslationX(0.0f);
                                nVar.f161946d.setAlpha(1.0f);
                            }
                        }
                    });
                }
                if (this.f161960r) {
                    this.f161946d.setTranslationX(C13628n.m24520b(C63238c.f143574a, this.f161956n));
                    this.f161946d.setAlpha(0.0f);
                    this.f161949g = this.f161946d.animate().translationX(0.0f).alpha(1.0f).setDuration(150).setStartDelay(150);
                }
            }
        }
        int i = this.f161964v;
        int i2 = this.f161963u;
        return (((float) (i - i2)) * f2) + (((float) i2) / 2.0f);
    }

    /* renamed from: a */
    public final void mo114441a(RecyclerView recyclerView) {
        MethodCollector.m26663i(8864);
        this.f161945c = recyclerView;
        if (getParent() instanceof ViewGroup) {
            setLayoutParams((ViewGroup) getParent());
        } else if (recyclerView.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) recyclerView.getParent();
            viewGroup.addView(this);
            setLayoutParams(viewGroup);
        }
        recyclerView.mo4405a(this.f161961s);
        post(new RunnableC72248p(this));
        MethodCollector.m26664o(8864);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return super.onTouchEvent(motionEvent);
                    }
                }
            }
            requestDisallowInterceptTouchEvent(false);
            setHandleSelected(false);
            if (this.f161960r) {
                if (this.f161942D) {
                    m127436a(this.f161949g);
                    m127434a(this.f161966x);
                }
                if (this.f161958p && this.f161966x == null) {
                    this.f161942D = false;
                    float b = C13628n.m24520b(C63238c.f143574a, 146.0f);
                    ValueAnimator duration = ValueAnimator.ofFloat(this.f161962t, b).setDuration(300L);
                    this.f161966x = duration;
                    duration.addUpdateListener(new C72250r(this, b));
                    this.f161966x.addListener(new C72245e(this, (byte) 0));
                    this.f161966x.start();
                }
            } else {
                if (this.f161942D) {
                    m127436a(this.f161949g);
                    m127434a(this.f161966x);
                }
                if (m127437a(this.f161946d) && this.f161966x == null) {
                    int width = this.f161944b.getWidth();
                    this.f161942D = false;
                    ViewPropertyAnimator listener = this.f161946d.animate().translationX(C13628n.m24520b(C63238c.f143574a, this.f161956n)).alpha(0.0f).setDuration(150).setListener(new AnimatorListenerAdapter() {
                        /* class com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C72235n.C722383 */

                        static {
                            Covode.recordClassIndex(84903);
                        }

                        public final void onAnimationCancel(Animator animator) {
                            super.onAnimationCancel(animator);
                            C72235n.this.f161946d.setVisibility(4);
                            C72235n.this.f161949g = null;
                        }

                        public final void onAnimationEnd(Animator animator) {
                            super.onAnimationEnd(animator);
                            C72235n.this.f161946d.setVisibility(4);
                            C72235n.this.f161949g = null;
                        }
                    });
                    this.f161949g = listener;
                    listener.start();
                    ValueAnimator ofObject = ValueAnimator.ofObject(new C72244d(this, (byte) 0), Integer.valueOf(width), Float.valueOf(C13628n.m24520b(C63238c.f143574a, 56.0f)));
                    this.f161966x = ofObject;
                    ofObject.setStartDelay(175);
                    this.f161966x.addListener(new C72245e(this, (byte) 0));
                    this.f161966x.setDuration(300L).start();
                }
            }
            getHandler().postDelayed(this.f161955m, 3400);
            AbstractC72241a aVar = this.f161950h;
            if (aVar != null) {
                aVar.mo114372a(true);
            }
            if (C24428k.m46551a().mo40247e().f57872e.mo40431c()) {
                getHandler().removeCallbacks(this.f161967y);
                C24428k.m46551a().mo40247e().f57872e.mo40429b();
            }
            return true;
        } else if (!m127437a(this.f161947e)) {
            return false;
        } else {
            this.f161939A = motionEvent.getY();
            this.f161940B = this.f161944b.getY();
            FrameLayout frameLayout = this.f161944b;
            int rawX = (int) motionEvent.getRawX();
            int rawY = (int) motionEvent.getRawY();
            if (frameLayout != null) {
                int[] iArr = new int[2];
                frameLayout.getLocationOnScreen(iArr);
                int i = iArr[0];
                int i2 = iArr[1];
                int measuredWidth = frameLayout.getMeasuredWidth() + i;
                int measuredHeight = frameLayout.getMeasuredHeight() + i2;
                if (rawY < i2 || rawY > measuredHeight || rawX < i || rawX > measuredWidth || this.f161953k) {
                    return false;
                }
                requestDisallowInterceptTouchEvent(true);
                setHandleSelected(true);
                getHandler().removeCallbacks(this.f161955m);
                m127436a(this.f161948f);
            }
            return false;
        }
        if (!C24428k.m46551a().mo40247e().f57872e.mo40431c()) {
            C24428k.m46551a().mo40247e().f57872e.mo40427a();
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f161941C < 50) {
            getHandler().removeCallbacks(this.f161967y);
        }
        this.f161941C = currentTimeMillis;
        getHandler().postDelayed(this.f161967y, 50);
        float y = motionEvent.getY();
        float f = this.f161940B + (y - this.f161939A) + (((float) this.f161963u) / 2.0f);
        setViewPositions(f);
        if (Math.abs(y - this.f161939A) > 10.0f) {
            if (this.f161951i != null) {
                if (this.f161960r) {
                    if (!this.f161958p) {
                        this.f161942D = true;
                        this.f161958p = true;
                        float b2 = C13628n.m24520b(C63238c.f143574a, 146.0f);
                        ValueAnimator duration2 = ValueAnimator.ofFloat(b2, C13628n.m24520b(C63238c.f143574a, 178.0f)).setDuration(300L);
                        this.f161966x = duration2;
                        duration2.addUpdateListener(new C72249q(this, b2));
                        this.f161966x.addListener(new C72246f(this, (byte) 0));
                        this.f161966x.start();
                    }
                } else if (!m127437a(this.f161946d)) {
                    this.f161946d.setAlpha(0.0f);
                    this.f161946d.setVisibility(0);
                    this.f161942D = true;
                    this.f161946d.setTranslationX(C13628n.m24520b(C63238c.f143574a, this.f161956n));
                    this.f161949g = this.f161946d.animate().translationX(0.0f).alpha(1.0f).setDuration(150).setStartDelay(150).setListener(new AnimatorListenerAdapter() {
                        /* class com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C72235n.C722372 */

                        static {
                            Covode.recordClassIndex(84902);
                        }

                        public final void onAnimationCancel(Animator animator) {
                            super.onAnimationCancel(animator);
                            C72235n.this.f161949g = null;
                        }

                        public final void onAnimationEnd(Animator animator) {
                            super.onAnimationEnd(animator);
                            C72235n.this.f161949g = null;
                        }
                    });
                    ValueAnimator ofObject2 = ValueAnimator.ofObject(new C72244d(this, (byte) 0), Float.valueOf(C13628n.m24520b(C63238c.f143574a, 56.0f)), Float.valueOf(C13628n.m24520b(C63238c.f143574a, 178.0f)));
                    this.f161966x = ofObject2;
                    ofObject2.addListener(new C72246f(this, (byte) 0));
                    this.f161966x.setDuration(300L).start();
                }
            }
            setRecyclerViewPosition(f);
        }
        return true;
    }

    private C72235n(Context context, byte b) {
        this(context, (char) 0);
    }

    /* renamed from: a */
    private static int m127432a(int i, int i2) {
        return Math.min(Math.max(0, i2), i);
    }

    /* renamed from: a */
    public static void m127435a(View view, float f) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = (int) f;
        view.setLayoutParams(layoutParams);
    }

    private C72235n(Context context, char c) {
        super(context, null, 0);
        MethodCollector.m26663i(8721);
        this.f161954l = "";
        this.f161955m = new RunnableC72247o(this);
        this.f161956n = 20.0f;
        this.f161957o = 56.0f;
        this.f161958p = false;
        this.f161959q = false;
        this.f161960r = false;
        this.f161967y = new RunnableC72242b((byte) 0);
        this.f161968z = false;
        this.f161961s = new RecyclerView.AbstractC1371n() {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C72235n.C722361 */

            static {
                Covode.recordClassIndex(84901);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
            /* renamed from: a */
            public final void mo4753a(RecyclerView recyclerView, int i) {
                super.mo4753a(recyclerView, i);
                if (!C72235n.this.isEnabled()) {
                    return;
                }
                if (i == 0) {
                    C72235n.this.f161943a = recyclerView.computeVerticalScrollOffset();
                    if (!C72235n.this.f161944b.isSelected()) {
                        C72235n.this.getHandler().postDelayed(C72235n.this.f161955m, 3000);
                        if (C72235n.this.f161950h != null) {
                            C72235n.this.f161950h.mo114372a(false);
                        }
                    }
                } else if (i == 1) {
                    C72235n.this.getHandler().removeCallbacks(C72235n.this.f161955m);
                    C72235n.this.f161952j = true;
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
            /* renamed from: a */
            public final void mo4754a(RecyclerView recyclerView, int i, int i2) {
                if (!C72235n.this.f161944b.isSelected() && C72235n.this.isEnabled()) {
                    C72235n nVar = C72235n.this;
                    nVar.setViewPositions(nVar.mo114442b(recyclerView));
                }
                if (C72235n.this.f161960r && C72235n.this.f161951i != null && recyclerView.getLayoutManager() != null) {
                    String charSequence = C72235n.this.f161951i.mo114273a(C72235n.m127433a(recyclerView.getLayoutManager())).toString();
                    if (!C72235n.this.f161954l.equals(charSequence)) {
                        C72235n.this.f161954l = charSequence;
                        C72235n.this.f161946d.setText(charSequence);
                    }
                }
            }
        };
        this.f161939A = 0.0f;
        this.f161940B = 0.0f;
        this.f161941C = 0;
        this.f161942D = false;
        this.f161962t = 0.0f;
        inflate(context, R.layout.zj, this);
        setClipChildren(false);
        setOrientation(0);
        this.f161946d = (TextView) findViewById(R.id.azg);
        this.f161944b = (FrameLayout) findViewById(R.id.azh);
        this.f161947e = findViewById(R.id.azi);
        this.f161965w = C13628n.m24504a(context);
        if (C78099c.m136517a(context)) {
            this.f161959q = true;
        }
        setScrollBarStartTransX(56.0f);
        MethodCollector.m26664o(8721);
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f161964v = i2;
    }
}
