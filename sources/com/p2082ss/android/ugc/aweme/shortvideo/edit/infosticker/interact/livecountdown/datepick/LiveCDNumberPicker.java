package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.datepick;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import android.widget.OverScroller;
import androidx.core.content.C0643b;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.edit.C71210g;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89271h;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.datepick.LiveCDNumberPicker */
public final class LiveCDNumberPicker extends View {

    /* renamed from: d */
    public static final C71172a f159429d = new C71172a((byte) 0);

    /* renamed from: A */
    private int f159430A;

    /* renamed from: B */
    private OverScroller f159431B;

    /* renamed from: C */
    private VelocityTracker f159432C;

    /* renamed from: D */
    private int f159433D;

    /* renamed from: E */
    private int f159434E;

    /* renamed from: F */
    private int f159435F;

    /* renamed from: G */
    private AbstractC71181f f159436G;

    /* renamed from: a */
    Integer f159437a;

    /* renamed from: b */
    Integer f159438b;

    /* renamed from: c */
    AbstractC71178d f159439c;

    /* renamed from: e */
    private ArrayList<Integer> f159440e;

    /* renamed from: f */
    private ArrayList<Boolean> f159441f;

    /* renamed from: g */
    private int f159442g;

    /* renamed from: h */
    private int f159443h;

    /* renamed from: i */
    private int f159444i;

    /* renamed from: j */
    private int f159445j;

    /* renamed from: k */
    private int f159446k;

    /* renamed from: l */
    private int f159447l;

    /* renamed from: m */
    private boolean f159448m;

    /* renamed from: n */
    private int f159449n;

    /* renamed from: o */
    private int f159450o;

    /* renamed from: p */
    private float f159451p;

    /* renamed from: q */
    private boolean f159452q;

    /* renamed from: r */
    private int f159453r;

    /* renamed from: s */
    private int f159454s = Integer.MIN_VALUE;

    /* renamed from: t */
    private int f159455t;

    /* renamed from: u */
    private int f159456u;

    /* renamed from: v */
    private int f159457v;

    /* renamed from: w */
    private int f159458w;

    /* renamed from: x */
    private Paint f159459x = new Paint();

    /* renamed from: y */
    private int f159460y;

    /* renamed from: z */
    private int f159461z;

    static {
        Covode.recordClassIndex(83679);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.datepick.LiveCDNumberPicker$a */
    public static final class C71172a {
        static {
            Covode.recordClassIndex(83680);
        }

        private C71172a() {
        }

        public /* synthetic */ C71172a(byte b) {
            this();
        }
    }

    public final int getCurrentPosition() {
        return this.f159447l;
    }

    public final boolean getWrapSelectorPick() {
        return this.f159448m;
    }

    /* renamed from: d */
    private final void m125765d() {
        int i = Build.VERSION.SDK_INT;
        postInvalidateOnAnimation();
    }

    public final String getCurrentItem() {
        return m125764d(this.f159447l);
    }

    /* renamed from: c */
    private final int m125762c() {
        Paint.FontMetricsInt fontMetricsInt = this.f159459x.getFontMetricsInt();
        return Math.abs(fontMetricsInt.bottom + fontMetricsInt.top);
    }

    private final int getGapHeight() {
        return getItemHeight() - m125762c();
    }

    private final int getItemHeight() {
        return getHeight() / (this.f159449n - 2);
    }

    public final String getMaxValue() {
        AbstractC71178d dVar = this.f159439c;
        if (dVar != null) {
            return dVar.mo112527a(this.f159443h);
        }
        return String.valueOf(this.f159443h);
    }

    public final String getMinValue() {
        AbstractC71178d dVar = this.f159439c;
        if (dVar != null) {
            return dVar.mo112527a(this.f159442g);
        }
        return String.valueOf(this.f159442g);
    }

    /* access modifiers changed from: protected */
    public final int getSuggestedMinimumHeight() {
        int suggestedMinimumWidth = super.getSuggestedMinimumWidth();
        if (this.f159450o > 0) {
            return Math.max(suggestedMinimumWidth, ((int) C13628n.m24520b(getContext(), 38.0f)) * this.f159450o);
        }
        return suggestedMinimumWidth;
    }

    /* renamed from: b */
    private final void m125761b() {
        this.f159456u = getItemHeight();
        this.f159457v = m125762c();
        this.f159455t = getGapHeight();
        int i = this.f159456u;
        int i2 = ((this.f159445j * i) + ((this.f159457v + i) / 2)) - (i * this.f159444i);
        this.f159454s = i2;
        this.f159453r = i2;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        if (r0 <= 0) goto L_0x0029;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0030  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo112494a() {
        /*
        // Method dump skipped, instructions count: 125
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.datepick.LiveCDNumberPicker.mo112494a():void");
    }

    public final void computeScroll() {
        super.computeScroll();
        OverScroller overScroller = this.f159431B;
        if (overScroller == null) {
            C89219l.m154715b();
        }
        if (overScroller.computeScrollOffset()) {
            OverScroller overScroller2 = this.f159431B;
            if (overScroller2 == null) {
                C89219l.m154715b();
            }
            int currX = overScroller2.getCurrX();
            OverScroller overScroller3 = this.f159431B;
            if (overScroller3 == null) {
                C89219l.m154715b();
            }
            int currY = overScroller3.getCurrY();
            if (this.f159458w == 0) {
                OverScroller overScroller4 = this.f159431B;
                if (overScroller4 == null) {
                    C89219l.m154715b();
                }
                this.f159458w = overScroller4.getStartY();
            }
            scrollBy(currX, currY - this.f159458w);
            this.f159458w = currY;
            invalidate();
        } else if (!this.f159452q) {
            this.f159458w = 0;
            int i = this.f159454s - this.f159453r;
            int abs = Math.abs(i);
            int i2 = this.f159456u;
            if (abs > i2 / 2) {
                if (i > 0) {
                    i2 = -i2;
                }
                i += i2;
            }
            if (i != 0) {
                OverScroller overScroller5 = this.f159431B;
                if (overScroller5 == null) {
                    C89219l.m154715b();
                }
                overScroller5.startScroll(getScrollX(), getScrollY(), 0, i, 800);
                m125765d();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final int getSuggestedMinimumWidth() {
        int measureText;
        int suggestedMinimumHeight = super.getSuggestedMinimumHeight();
        if (this.f159450o <= 0) {
            return suggestedMinimumHeight;
        }
        this.f159459x.setTextSize(((float) this.f159430A) * 1.3f);
        if (this.f159439c != null) {
            measureText = this.f159446k;
        } else {
            measureText = (int) this.f159459x.measureText(String.valueOf(this.f159442g));
            int measureText2 = (int) this.f159459x.measureText(String.valueOf(this.f159443h));
            this.f159459x.setTextSize(((float) this.f159430A) * 1.0f);
            if (measureText <= measureText2) {
                measureText = measureText2;
            }
        }
        return Math.max(suggestedMinimumHeight, measureText);
    }

    public final void setMaxValidValue(Integer num) {
        this.f159437a = num;
    }

    public final void setMaxValue(int i) {
        this.f159443h = i;
    }

    public final void setMaxWidth(int i) {
        this.f159446k = i;
    }

    public final void setMinValidValue(Integer num) {
        this.f159438b = num;
    }

    public final void setMinValue(int i) {
        this.f159442g = i;
    }

    public final void setUnselectedTextColor(int i) {
        this.f159461z = i;
    }

    public final void setOnValueChangedListener(AbstractC71181f fVar) {
        C89219l.m154721d(fVar, "");
        this.f159436G = fVar;
    }

    public final void setWrapSelectorWheel(boolean z) {
        this.f159448m = z;
        invalidate();
    }

    public final void setSelectedTextColor(int i) {
        this.f159460y = C0643b.m2378c(getContext(), i);
        invalidate();
    }

    public final void setTextAlign(Paint.Align align) {
        C89219l.m154721d(align, "");
        this.f159459x.setTextAlign(align);
    }

    public final void setTypeface(Typeface typeface) {
        C89219l.m154721d(typeface, "");
        this.f159459x.setTypeface(typeface);
    }

    public final void setValue(String str) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str, "");
        mo112495a(m125759a(str));
    }

    /* renamed from: a */
    private final int m125759a(String str) {
        AbstractC71178d dVar = this.f159439c;
        if (dVar != null) {
            return m125763c(dVar.mo112525a(str));
        }
        try {
            return m125763c(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* renamed from: b */
    private final int m125760b(int i) {
        int i2 = this.f159443h;
        if (i > i2) {
            int i3 = this.f159442g;
            return (i3 + ((i - i2) % ((i2 - i3) + 1))) - 1;
        }
        int i4 = this.f159442g;
        if (i < i4) {
            return (i2 - ((i4 - i) % ((i2 - i4) + 1))) + 1;
        }
        return i;
    }

    /* renamed from: e */
    private final boolean m125766e(int i) {
        Integer num = this.f159438b;
        if (num != null && i < num.intValue()) {
            return false;
        }
        Integer num2 = this.f159437a;
        if (num2 == null || i <= num2.intValue()) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private final int m125763c(int i) {
        if (this.f159448m) {
            return m125760b(i);
        }
        Integer num = this.f159437a;
        if (num == null) {
            int i2 = this.f159443h;
            if (i > i2) {
                return i2;
            }
        } else if (i > num.intValue()) {
            Integer num2 = this.f159437a;
            if (num2 == null) {
                C89219l.m154715b();
            }
            return num2.intValue();
        }
        Integer num3 = this.f159438b;
        if (num3 == null) {
            int i3 = this.f159442g;
            if (i < i3) {
                return i3;
            }
            return i;
        } else if (i >= num3.intValue()) {
            return i;
        } else {
            Integer num4 = this.f159438b;
            if (num4 == null) {
                C89219l.m154715b();
            }
            return num4.intValue();
        }
    }

    /* renamed from: d */
    private String m125764d(int i) {
        AbstractC71178d dVar = this.f159439c;
        if (dVar != null) {
            return dVar.mo112527a(i);
        }
        if (this.f159448m) {
            return C71210g.m125829a(m125760b(i));
        }
        if (i <= this.f159443h && i >= this.f159442g) {
            return C71210g.m125829a(i);
        }
        return "";
    }

    public final void setPickerItemCount(int i) {
        int i2 = i + 2;
        this.f159449n = i2;
        this.f159444i = (i2 - 1) / 2;
        int i3 = i2 - 2;
        this.f159450o = i3;
        this.f159445j = (i3 - 1) / 2;
        this.f159440e = new ArrayList<>(this.f159449n);
        this.f159441f = new ArrayList<>(this.f159449n);
        mo112494a();
        m125761b();
        invalidate();
        invalidate();
    }

    /* renamed from: a */
    public final void mo112495a(int i) {
        if (this.f159447l != i) {
            this.f159447l = i;
            ArrayList<Integer> arrayList = this.f159440e;
            if (arrayList == null) {
                C89219l.m154710a("selectorItemIndices");
            }
            arrayList.clear();
            int i2 = this.f159449n;
            for (int i3 = 0; i3 < i2; i3++) {
                int i4 = this.f159447l + (i3 - this.f159444i);
                if (this.f159448m) {
                    i4 = m125760b(i4);
                }
                ArrayList<Integer> arrayList2 = this.f159440e;
                if (arrayList2 == null) {
                    C89219l.m154710a("selectorItemIndices");
                }
                arrayList2.add(Integer.valueOf(i4));
            }
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00f0 A[EDGE_INSN: B:39:0x00f0->B:37:0x00f0 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDraw(android.graphics.Canvas r12) {
        /*
        // Method dump skipped, instructions count: 244
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.datepick.LiveCDNumberPicker.onDraw(android.graphics.Canvas):void");
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Integer num;
        C89219l.m154721d(motionEvent, "");
        if (this.f159432C == null) {
            this.f159432C = VelocityTracker.obtain();
        }
        VelocityTracker velocityTracker = this.f159432C;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    float y = motionEvent.getY() - this.f159451p;
                    if (!this.f159452q && Math.abs(y) > ((float) this.f159433D)) {
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                        if (y > 0.0f) {
                            y -= (float) this.f159433D;
                        } else {
                            y += (float) this.f159433D;
                        }
                        this.f159452q = true;
                    }
                    if (this.f159452q) {
                        scrollBy(0, (int) y);
                        invalidate();
                        this.f159451p = motionEvent.getY();
                    }
                } else if (actionMasked == 3) {
                    if (this.f159452q) {
                        this.f159452q = false;
                    }
                }
            } else if (this.f159452q) {
                this.f159452q = false;
                ViewParent parent2 = getParent();
                if (parent2 != null) {
                    parent2.requestDisallowInterceptTouchEvent(false);
                }
                VelocityTracker velocityTracker2 = this.f159432C;
                if (velocityTracker2 != null) {
                    velocityTracker2.computeCurrentVelocity(1000, (float) this.f159434E);
                }
                VelocityTracker velocityTracker3 = this.f159432C;
                if (velocityTracker3 != null) {
                    num = Integer.valueOf((int) velocityTracker3.getYVelocity());
                } else {
                    num = null;
                }
                this.f159458w = 0;
                OverScroller overScroller = this.f159431B;
                if (overScroller != null) {
                    int scrollX = getScrollX();
                    int scrollY = getScrollY();
                    if (num == null) {
                        C89219l.m154715b();
                    }
                    int intValue = num.intValue();
                    double itemHeight = (double) getItemHeight();
                    Double.isNaN(itemHeight);
                    overScroller.fling(scrollX, scrollY, 0, intValue, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, (int) (itemHeight * 0.7d));
                }
                m125765d();
            } else {
                int y2 = (((int) motionEvent.getY()) / this.f159456u) - this.f159445j;
                this.f159458w = 0;
                OverScroller overScroller2 = this.f159431B;
                if (overScroller2 == null) {
                    C89219l.m154715b();
                }
                overScroller2.startScroll(0, 0, 0, (-this.f159456u) * y2, 300);
                invalidate();
            }
            VelocityTracker velocityTracker4 = this.f159432C;
            if (velocityTracker4 != null) {
                velocityTracker4.recycle();
            }
            this.f159432C = null;
        } else {
            OverScroller overScroller3 = this.f159431B;
            if (overScroller3 == null) {
                C89219l.m154715b();
            }
            if (!overScroller3.isFinished()) {
                OverScroller overScroller4 = this.f159431B;
                if (overScroller4 == null) {
                    C89219l.m154715b();
                }
                overScroller4.forceFinished(true);
            }
            this.f159451p = motionEvent.getY();
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-2, -2);
        }
        setMeasuredDimension(m125758a(getSuggestedMinimumWidth(), layoutParams.width, i) + getPaddingLeft() + getPaddingRight(), m125758a(getSuggestedMinimumHeight(), layoutParams.height, i2) + getPaddingTop() + getPaddingBottom());
    }

    public LiveCDNumberPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArray;
        int i;
        int i2;
        int i3;
        int i4;
        MethodCollector.m26663i(13785);
        boolean z = false;
        if (context != null) {
            typedArray = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.a4z, R.attr.a57, R.attr.a5g, R.attr.a5h, R.attr.abb, R.attr.ai8, R.attr.aif, R.attr.atf, R.attr.aud}, 0, 0);
        } else {
            typedArray = null;
        }
        if (typedArray != null) {
            i = typedArray.getInt(7, 5);
        } else {
            i = 5;
        }
        int i5 = i + 2;
        this.f159449n = i5;
        this.f159444i = (i5 - 1) / 2;
        int i6 = i5 - 2;
        this.f159450o = i6;
        this.f159445j = (i6 - 1) / 2;
        this.f159440e = new ArrayList<>(this.f159449n);
        this.f159441f = new ArrayList<>(this.f159449n);
        if (typedArray != null) {
            i2 = typedArray.getInt(2, Integer.MIN_VALUE);
        } else {
            i2 = 0;
        }
        this.f159442g = i2;
        if (typedArray != null) {
            i3 = typedArray.getInt(0, Integer.MAX_VALUE);
        } else {
            i3 = 0;
        }
        this.f159443h = i3;
        if (typedArray != null) {
            if (typedArray.hasValue(1)) {
                this.f159437a = Integer.valueOf(typedArray.getInt(1, 0));
            }
            if (typedArray.hasValue(3)) {
                this.f159438b = Integer.valueOf(typedArray.getInt(3, 0));
            }
            z = typedArray.getBoolean(8, false);
        }
        this.f159448m = z;
        this.f159431B = new OverScroller(context, new DecelerateInterpolator(2.5f));
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        C89219l.m154716b(viewConfiguration, "");
        this.f159433D = viewConfiguration.getScaledTouchSlop();
        this.f159434E = viewConfiguration.getScaledMaximumFlingVelocity() / 4;
        this.f159435F = viewConfiguration.getScaledMinimumFlingVelocity();
        int i7 = R.color.a2;
        if (typedArray != null) {
            i4 = typedArray.getColor(4, C0643b.m2378c(context, R.color.a2));
        } else {
            i4 = R.color.a2;
        }
        this.f159460y = i4;
        this.f159461z = typedArray != null ? typedArray.getColor(5, C0643b.m2378c(context, R.color.a2)) : i7;
        this.f159430A = typedArray != null ? typedArray.getDimensionPixelSize(6, 80) : 80;
        Paint paint = this.f159459x;
        paint.setAntiAlias(true);
        paint.setAntiAlias(true);
        paint.setTextSize(paint.getTextSize());
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setTextAlign(Paint.Align.CENTER);
        if (typedArray != null) {
            typedArray.recycle();
        }
        mo112494a();
        MethodCollector.m26664o(13785);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004e, code lost:
        if (p4600h.p4611f.p4613b.C89219l.m154703a(r1, r0.intValue()) <= 0) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00c5, code lost:
        if (p4600h.p4611f.p4613b.C89219l.m154703a(r1, r0.intValue()) >= 0) goto L_0x00c7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void scrollBy(int r10, int r11) {
        /*
        // Method dump skipped, instructions count: 760
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.datepick.LiveCDNumberPicker.scrollBy(int, int):void");
    }

    /* renamed from: a */
    private static int m125758a(int i, int i2, int i3) {
        int size = View.MeasureSpec.getSize(i3);
        int mode = View.MeasureSpec.getMode(View.MeasureSpec.getMode(i3));
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                return (i2 == -2 || i2 == -1) ? i : i2;
            }
            if (mode != 1073741824) {
                return 0;
            }
        } else if (i2 == -2) {
            size = C89271h.m154772c(i, size);
        } else if (i2 != -1) {
            size = C89271h.m154772c(i2, size);
        }
        return size;
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        MethodCollector.m26663i(13534);
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m125761b();
        }
        MethodCollector.m26664o(13534);
    }
}
