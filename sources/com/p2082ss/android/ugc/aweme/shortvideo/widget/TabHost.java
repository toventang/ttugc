package com.p2082ss.android.ugc.aweme.shortvideo.widget;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Scroller;
import android.widget.TextView;
import androidx.core.content.C0643b;
import androidx.core.p030b.C0622a;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.p2730de.C40970e;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.p2082ss.android.ugc.aweme.tools.C78099c;
import com.p2082ss.android.ugc.aweme.utils.C80339de;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.TabHost */
public class TabHost extends FrameLayout implements View.OnTouchListener {

    /* renamed from: a */
    public static final String f166963a = TabHost.class.getSimpleName();

    /* renamed from: b */
    public int f166964b;

    /* renamed from: c */
    public boolean f166965c;

    /* renamed from: d */
    public boolean f166966d;

    /* renamed from: e */
    List<Integer> f166967e;

    /* renamed from: f */
    Scroller f166968f;

    /* renamed from: g */
    public LinearLayout f166969g;

    /* renamed from: h */
    public AbstractC74261a f166970h;

    /* renamed from: i */
    public C80339de f166971i;

    /* renamed from: j */
    public int f166972j;

    /* renamed from: k */
    public View f166973k;

    /* renamed from: l */
    private GestureDetector f166974l;

    /* renamed from: m */
    private AbstractC74262b f166975m;

    /* renamed from: n */
    private AbstractC74263c f166976n;

    /* renamed from: o */
    private float f166977o;

    /* renamed from: p */
    private float f166978p;

    /* renamed from: q */
    private float f166979q;

    /* renamed from: r */
    private float f166980r;

    /* renamed from: s */
    private int f166981s;

    /* renamed from: t */
    private int f166982t;

    /* renamed from: u */
    private int f166983u;

    /* renamed from: v */
    private int f166984v;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.TabHost$a */
    public interface AbstractC74261a {
        static {
            Covode.recordClassIndex(87030);
        }

        /* renamed from: a */
        void mo116853a(Object obj, int i, int i2, boolean z, boolean z2);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.TabHost$b */
    public interface AbstractC74262b {
        static {
            Covode.recordClassIndex(87031);
        }

        /* renamed from: a */
        void mo116854a(String str);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.TabHost$c */
    public interface AbstractC74263c {
        static {
            Covode.recordClassIndex(87032);
        }
    }

    public int getCurrentIndex() {
        return this.f166964b;
    }

    static {
        Covode.recordClassIndex(87028);
    }

    public int getTabCount() {
        LinearLayout linearLayout = this.f166969g;
        if (linearLayout == null) {
            return 0;
        }
        return linearLayout.getChildCount();
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f166969g = (LinearLayout) findViewById(R.id.acf);
    }

    /* renamed from: a */
    public final boolean mo116834a() {
        ShortVideoContext shortVideoContext;
        Activity activity = (Activity) getContext();
        if (activity == null || (shortVideoContext = ((ShortVideoContextViewModel) C1181ae.m3881a((ActivityC0945e) activity, (C1175ad.AbstractC1177b) null).mo3983a(ShortVideoContextViewModel.class)).f155842a) == null || !shortVideoContext.mo110018b()) {
            return false;
        }
        return true;
    }

    public void setOnIndexChangedListener(AbstractC74261a aVar) {
        this.f166970h = aVar;
    }

    public void setScrollEnabled(boolean z) {
        this.f166965c = z;
    }

    public void setSharedARTabChangeListener(AbstractC74262b bVar) {
        this.f166975m = bVar;
    }

    public void setTouchEventWrapper(AbstractC74263c cVar) {
        this.f166976n = cVar;
    }

    public void setUISwitchEnabled(boolean z) {
        this.f166966d = z;
    }

    /* renamed from: c */
    private void m130644c(int i) {
        if (this.f166969g != null) {
            for (int i2 = 0; i2 < this.f166969g.getChildCount(); i2++) {
                if (i2 != i) {
                    m130642a(i2, false);
                }
            }
            m130642a(i, true);
        }
    }

    /* renamed from: b */
    public final Object mo116835b(int i) {
        View childAt;
        LinearLayout linearLayout = this.f166969g;
        if (linearLayout == null || (childAt = linearLayout.getChildAt(i)) == null) {
            return null;
        }
        return childAt.getTag();
    }

    public void setStartMargin(int i) {
        this.f166984v = i;
        LinearLayout linearLayout = this.f166969g;
        if (linearLayout != null && (linearLayout instanceof ScrollableLinearLayout)) {
            ScrollableLinearLayout scrollableLinearLayout = (ScrollableLinearLayout) linearLayout;
            scrollableLinearLayout.f166948a = i;
            scrollableLinearLayout.requestLayout();
        }
        requestLayout();
    }

    /* renamed from: a */
    public final Object mo116829a(int i) {
        View childAt;
        LinearLayout linearLayout = this.f166969g;
        if (linearLayout == null || (childAt = linearLayout.getChildAt(i)) == null) {
            return null;
        }
        return childAt.getTag();
    }

    public TabHost(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: a */
    private void m130642a(int i, boolean z) {
        View childAt;
        LinearLayout linearLayout = this.f166969g;
        if (linearLayout != null && (childAt = linearLayout.getChildAt(i)) != null) {
            if (childAt instanceof C74294n) {
                ((C74294n) childAt).setTabSelected(z);
            } else if (childAt instanceof TextView) {
                childAt.setSelected(z);
            }
        }
    }

    /* renamed from: b */
    private void m130643b(int i, int i2) {
        View childAt;
        LinearLayout linearLayout = this.f166969g;
        if (linearLayout != null && (childAt = linearLayout.getChildAt(i)) != null) {
            int i3 = 0;
            if (childAt instanceof C74294n) {
                C74294n nVar = (C74294n) childAt;
                nVar.setTextColor(i2);
                int alpha = Color.alpha(i2);
                Drawable[] compoundDrawables = nVar.getTextView().getCompoundDrawables();
                int length = compoundDrawables.length;
                while (i3 < length) {
                    Drawable drawable = compoundDrawables[i3];
                    if (drawable != null) {
                        drawable.setAlpha(alpha);
                        i3++;
                    } else {
                        return;
                    }
                }
            } else if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                textView.setTextColor(i2);
                int alpha2 = Color.alpha(i2);
                Drawable[] compoundDrawables2 = textView.getCompoundDrawables();
                int length2 = compoundDrawables2.length;
                while (i3 < length2) {
                    Drawable drawable2 = compoundDrawables2[i3];
                    if (drawable2 != null) {
                        drawable2.setAlpha(alpha2);
                        i3++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo116830a(int i, int i2) {
        AbstractC74261a aVar;
        int i3;
        AbstractC74262b bVar;
        if (!mo116834a() || (bVar = this.f166975m) == null) {
            for (int i4 = 0; i4 < this.f166969g.getChildCount(); i4++) {
                if (i4 == i) {
                    i3 = this.f166981s;
                } else {
                    i3 = this.f166982t;
                }
                m130643b(i4, i3);
                m130644c(i);
            }
            int i5 = this.f166964b;
            if (!(i5 == i || (aVar = this.f166970h) == null)) {
                aVar.mo116853a(mo116835b(i5), i, i2, false, true);
            }
            C40970e.m82485a("withoutAnim the set index is " + i + " mCurIndex:" + this.f166964b);
            this.f166964b = i;
            if (!this.f166967e.isEmpty() && i >= 0 && i < this.f166967e.size()) {
                ValueAnimator ofInt = ValueAnimator.ofInt(this.f166969g.getScrollX(), this.f166967e.get(i).intValue() - this.f166967e.get(0).intValue());
                ofInt.setDuration(150L);
                ofInt.addUpdateListener(new C74293m(this));
                ofInt.start();
                return;
            }
            return;
        }
        bVar.mo116854a((String) mo116835b(i));
    }

    /* renamed from: c */
    private void m130645c(int i, int i2) {
        int childCount = this.f166969g.getChildCount();
        this.f166967e.clear();
        int i3 = i;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = this.f166969g.getChildAt(i4);
            if (childAt != null) {
                if (i4 == 0) {
                    i3 = ((i3 + ((i2 - i) / 2)) - (childAt.getWidth() / 2)) - this.f166984v;
                }
                if (childAt instanceof C74294n) {
                    C74294n nVar = (C74294n) childAt;
                    this.f166967e.add(Integer.valueOf(nVar.getTextView().getPaddingLeft() + i3 + (((nVar.getTextView().getWidth() - nVar.getTextView().getPaddingLeft()) - nVar.getTextView().getPaddingRight()) / 2)));
                } else if (childAt instanceof TextView) {
                    this.f166967e.add(Integer.valueOf((childAt.getWidth() / 2) + i3));
                }
                childAt.layout(i3, childAt.getTop(), childAt.getWidth() + i3, childAt.getBottom());
                i3 += childAt.getWidth();
            }
        }
        C40970e.m82485a("the xPivots size is " + childCount + " mCurIndex:" + this.f166964b);
        int a = C0622a.m2312a(this.f166964b, 0, childCount - 1);
        try {
            this.f166969g.scrollTo(this.f166967e.get(a).intValue() - this.f166967e.get(0).intValue(), 0);
            if (this.f166964b > a) {
                C40970e.m82485a("mCurIndex is dangerous， modify it !!! safeIndex: " + a + " mCurIndex:" + this.f166964b);
                this.f166964b = a;
            }
        } catch (IndexOutOfBoundsException e) {
            StringBuilder sb = new StringBuilder();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt2 = this.f166969g.getChildAt(i5);
                sb.append("index ");
                sb.append(i5);
                sb.append(' ');
                sb.append(childAt2.getClass());
                sb.append(' ');
                sb.append(childAt2.getTag());
                sb.append('\n');
            }
            throw new IllegalStateException("Inconsistency detected. children are ".concat(String.valueOf(sb)), e);
        }
    }

    /* renamed from: a */
    public final void mo116833a(View view, int i) {
        MethodCollector.m26663i(9204);
        LinearLayout linearLayout = this.f166969g;
        if (linearLayout == null || linearLayout.getChildCount() < i) {
            MethodCollector.m26664o(9204);
            return;
        }
        this.f166969g.addView(view, i);
        int i2 = this.f166964b;
        if (i <= i2) {
            this.f166964b = i2 + 1;
        }
        requestLayout();
        MethodCollector.m26664o(9204);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01d4, code lost:
        r2 = r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r10, android.view.MotionEvent r11) {
        /*
        // Method dump skipped, instructions count: 577
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.widget.TabHost.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: a */
    public final void mo116831a(int i, boolean z, boolean z2) {
        mo116832a(i, z, false, z2);
    }

    private TabHost(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(9049);
        this.f166965c = true;
        this.f166966d = true;
        this.f166971i = new C80339de();
        this.f166981s = C0643b.m2378c(getContext(), R.color.a9);
        this.f166982t = C0643b.m2378c(getContext(), R.color.ac);
        this.f166983u = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f166967e = new ArrayList();
        setOnTouchListener(this);
        this.f166968f = new Scroller(getContext());
        this.f166974l = new GestureDetector(getContext(), new GestureDetector.OnGestureListener() {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.widget.TabHost.GestureDetector$OnGestureListenerC742601 */

            static {
                Covode.recordClassIndex(87029);
            }

            public final boolean onDown(MotionEvent motionEvent) {
                return true;
            }

            public final void onLongPress(MotionEvent motionEvent) {
            }

            public final void onShowPress(MotionEvent motionEvent) {
            }

            public final boolean onSingleTapUp(MotionEvent motionEvent) {
                TabHost tabHost = TabHost.this;
                if (tabHost.equals(tabHost.f166973k) || TabHost.this.f166969g.equals(TabHost.this.f166973k) || !TabHost.this.f166971i.mo123710a(TabHost.this.f166973k) || !TabHost.this.f166966d) {
                    return false;
                }
                TabHost tabHost2 = TabHost.this;
                tabHost2.mo116830a(tabHost2.f166972j, 0);
                return false;
            }

            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (TabHost.this.f166965c && !TabHost.this.mo116834a() && f2 < 20.0f) {
                    TabHost.this.f166968f.fling(TabHost.this.f166968f.getFinalX(), TabHost.this.f166968f.getFinalY(), (int) f2, 0, 500, (int) f, 0, TabHost.this.getHeight());
                }
                return false;
            }

            public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (!TabHost.this.f166965c || TabHost.this.mo116834a()) {
                    return false;
                }
                if (f2 < 20.0f) {
                    f2 = 20.0f;
                }
                TabHost.this.f166969g.scrollBy((int) ((f * 20.0f) / f2), 0);
                TabHost.this.invalidate();
                return true;
            }
        });
        MethodCollector.m26664o(9049);
    }

    /* renamed from: a */
    public final void mo116832a(int i, boolean z, boolean z2, boolean z3) {
        AbstractC74261a aVar;
        int i2;
        for (int i3 = 0; i3 < this.f166969g.getChildCount(); i3++) {
            if (i3 == i) {
                i2 = this.f166981s;
            } else {
                i2 = this.f166982t;
            }
            m130643b(i3, i2);
            m130644c(i);
        }
        int i4 = this.f166964b;
        if (!(i4 == i || (aVar = this.f166970h) == null || !z)) {
            aVar.mo116853a(mo116835b(i4), i, 0, z2, z3);
        }
        C40970e.m82485a("the set index is " + i + " mCurIndex:" + this.f166964b);
        this.f166964b = i;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        MethodCollector.m26663i(9214);
        super.onLayout(z, i, i2, i3, i4);
        if (C78099c.m136517a(getContext())) {
            int childCount = this.f166969g.getChildCount();
            this.f166967e.clear();
            int i5 = i3;
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = this.f166969g.getChildAt(i6);
                if (childAt != null) {
                    if (i6 == 0) {
                        int i7 = i3 - i;
                        i5 = (i5 - (i7 / 2)) + (childAt.getWidth() / 2) + ((this.f166969g.getRight() - this.f166969g.getLeft()) - i7) + this.f166984v;
                    }
                    this.f166967e.add(Integer.valueOf(i5 - (childAt.getWidth() / 2)));
                    childAt.layout(i5 - childAt.getWidth(), childAt.getTop(), i5, childAt.getBottom());
                    i5 -= childAt.getWidth();
                }
            }
            C40970e.m82485a("the xPivots size is " + childCount + " mCurIndex:" + this.f166964b);
            int a = C0622a.m2312a(this.f166964b, 0, childCount - 1);
            try {
                this.f166969g.scrollTo(this.f166967e.get(a).intValue() - this.f166967e.get(0).intValue(), 0);
                if (this.f166964b > a) {
                    C40970e.m82485a("mCurIndex is dangerous， modify it !!! safeIndex: " + a + " mCurIndex:" + this.f166964b);
                    this.f166964b = a;
                }
                MethodCollector.m26664o(9214);
            } catch (IndexOutOfBoundsException e) {
                StringBuilder sb = new StringBuilder();
                for (int i8 = 0; i8 < childCount; i8++) {
                    View childAt2 = this.f166969g.getChildAt(i8);
                    sb.append("index ");
                    sb.append(i8);
                    sb.append(' ');
                    sb.append(childAt2.getClass());
                    sb.append(' ');
                    sb.append(childAt2.getTag());
                    sb.append('\n');
                }
                IllegalStateException illegalStateException = new IllegalStateException("Inconsistency detected. children are ".concat(String.valueOf(sb)), e);
                MethodCollector.m26664o(9214);
                throw illegalStateException;
            }
        } else {
            m130645c(i, i3);
            MethodCollector.m26664o(9214);
        }
    }
}
