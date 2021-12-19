package com.p2082ss.android.ugc.aweme.account.login.p2267ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17301b;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17303d;
import com.p2082ss.android.ugc.trill.R;
import java.util.Arrays;

/* renamed from: com.ss.android.ugc.aweme.account.login.ui.WaveSideBar */
public class WaveSideBar extends View {

    /* renamed from: a */
    private static final String[] f77058a = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

    /* renamed from: b */
    private String[] f77059b;

    /* renamed from: c */
    private int f77060c;

    /* renamed from: d */
    private float f77061d;

    /* renamed from: e */
    private Paint f77062e;

    /* renamed from: f */
    private int f77063f;

    /* renamed from: g */
    private float f77064g;

    /* renamed from: h */
    private float f77065h;

    /* renamed from: i */
    private float f77066i;

    /* renamed from: j */
    private RectF f77067j;

    /* renamed from: k */
    private float f77068k;

    /* renamed from: l */
    private float f77069l;

    /* renamed from: m */
    private boolean f77070m;

    /* renamed from: n */
    private boolean f77071n;

    /* renamed from: o */
    private int f77072o;

    /* renamed from: p */
    private int f77073p;

    /* renamed from: q */
    private AbstractC32307a f77074q;

    /* renamed from: r */
    private float f77075r;

    /* renamed from: s */
    private DisplayMetrics f77076s;

    /* renamed from: com.ss.android.ugc.aweme.account.login.ui.WaveSideBar$a */
    public interface AbstractC32307a {
        static {
            Covode.recordClassIndex(39075);
        }

        /* renamed from: a */
        void mo58383a(String str);
    }

    /* access modifiers changed from: protected */
    public String[] getDefaultIndexItems() {
        return f77058a;
    }

    static {
        Covode.recordClassIndex(39074);
    }

    public void setLazyRespond(boolean z) {
        this.f77071n = z;
    }

    public void setOnSelectIndexItemListener(AbstractC32307a aVar) {
        this.f77074q = aVar;
    }

    public void setMaxOffset(int i) {
        this.f77066i = (float) i;
        invalidate();
    }

    public void setIndexItems(String... strArr) {
        this.f77059b = (String[]) Arrays.copyOf(strArr, strArr.length);
        requestLayout();
    }

    public void setTextColor(int i) {
        this.f77063f = i;
        this.f77062e.setColor(i);
        invalidate();
    }

    public void setPosition(int i) {
        if (i == 0 || i == 1) {
            this.f77072o = i;
            requestLayout();
            return;
        }
        throw new IllegalArgumentException("the position must be POSITION_RIGHT or POSITION_LEFT");
    }

    public void setTextSize(float f) {
        if (this.f77064g != f) {
            this.f77064g = f;
            this.f77062e.setTextSize(f);
            invalidate();
        }
    }

    public void setTextAlign(int i) {
        if (this.f77073p != i) {
            if (i == 0) {
                this.f77062e.setTextAlign(Paint.Align.CENTER);
            } else if (i == 1) {
                this.f77062e.setTextAlign(Paint.Align.LEFT);
            } else if (i == 2) {
                this.f77062e.setTextAlign(Paint.Align.RIGHT);
            } else {
                throw new IllegalArgumentException("the alignment must be TEXT_ALIGN_CENTER, TEXT_ALIGN_LEFT or TEXT_ALIGN_RIGHT");
            }
            this.f77073p = i;
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        MethodCollector.m26663i(10668);
        super.onDraw(canvas);
        int length = this.f77059b.length;
        int i = 0;
        while (true) {
            int i2 = 255;
            if (i < length) {
                float f6 = this.f77075r;
                float f7 = this.f77065h;
                float f8 = (float) i;
                float f9 = f6 + (f7 * f8);
                float f10 = 0.0f;
                if (this.f77060c != -1) {
                    float abs = Math.abs(this.f77061d - ((f8 * f7) + (f7 / 2.0f))) / this.f77065h;
                    f = Math.max(1.0f - ((abs * abs) / 16.0f), 0.0f);
                } else {
                    f = 0.0f;
                }
                if (i != this.f77060c) {
                    i2 = (int) ((1.0f - f) * 255.0f);
                }
                this.f77062e.setAlpha(i2);
                Paint paint = this.f77062e;
                float f11 = this.f77064g;
                paint.setTextSize(f11 + (f11 * f));
                if (this.f77072o == 1) {
                    int i3 = this.f77073p;
                    if (i3 == 0) {
                        f4 = ((float) getPaddingLeft()) + (this.f77069l / 2.0f);
                        f5 = this.f77066i;
                    } else if (i3 == 1) {
                        f4 = (float) getPaddingLeft();
                        f5 = this.f77066i;
                    } else if (i3 == 2) {
                        f10 = ((float) getPaddingLeft()) + this.f77069l + (this.f77066i * f);
                    }
                    f10 = f4 + (f5 * f);
                } else {
                    int i4 = this.f77073p;
                    if (i4 == 0) {
                        f2 = ((float) (getWidth() - getPaddingRight())) - (this.f77069l / 2.0f);
                        f3 = this.f77066i;
                    } else if (i4 == 1) {
                        f2 = ((float) (getWidth() - getPaddingRight())) - this.f77069l;
                        f3 = this.f77066i;
                    } else if (i4 == 2) {
                        f2 = (float) (getWidth() - getPaddingRight());
                        f3 = this.f77066i;
                    }
                    f10 = f2 - (f3 * f);
                }
                canvas.drawText(this.f77059b[i], f10, f9, this.f77062e);
                i++;
            } else {
                this.f77062e.setAlpha(255);
                this.f77062e.setTextSize(this.f77064g);
                MethodCollector.m26664o(10668);
                return;
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        AbstractC32307a aVar;
        AbstractC32307a aVar2;
        AbstractC32307a aVar3;
        if (this.f77059b.length == 0) {
            return super.onTouchEvent(motionEvent);
        }
        float y = motionEvent.getY();
        float x = motionEvent.getX();
        float height = y - (((float) (getHeight() / 2)) - (this.f77068k / 2.0f));
        this.f77061d = height;
        if (height <= 0.0f) {
            i = 0;
        } else {
            i = (int) (height / this.f77065h);
            String[] strArr = this.f77059b;
            if (i >= strArr.length) {
                i = strArr.length - 1;
            }
        }
        this.f77060c = i;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    if (this.f77070m && !this.f77071n && (aVar3 = this.f77074q) != null) {
                        aVar3.mo58383a(this.f77059b[this.f77060c]);
                    }
                    invalidate();
                    return true;
                } else if (action != 3) {
                    return super.onTouchEvent(motionEvent);
                }
            }
            if (this.f77071n && (aVar2 = this.f77074q) != null) {
                aVar2.mo58383a(this.f77059b[this.f77060c]);
            }
            this.f77060c = -1;
            this.f77070m = false;
            invalidate();
            return true;
        } else if (this.f77067j.contains(x, y)) {
            this.f77070m = true;
            if (!this.f77071n && (aVar = this.f77074q) != null) {
                aVar.mo58383a(this.f77059b[this.f77060c]);
            }
            invalidate();
            return true;
        } else {
            this.f77060c = -1;
            return false;
        }
    }

    public WaveSideBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        float paddingRight;
        float f;
        MethodCollector.m26663i(10666);
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i);
        Paint.FontMetrics fontMetrics = this.f77062e.getFontMetrics();
        float f2 = fontMetrics.bottom - fontMetrics.top;
        this.f77065h = f2;
        String[] strArr = this.f77059b;
        this.f77068k = ((float) strArr.length) * f2;
        for (String str : strArr) {
            this.f77069l = Math.max(this.f77069l, this.f77062e.measureText(str));
        }
        if (this.f77072o == 1) {
            paddingRight = 0.0f;
        } else {
            paddingRight = (((float) size2) - this.f77069l) - ((float) getPaddingRight());
        }
        if (this.f77072o == 1) {
            f = ((float) getPaddingLeft()) + paddingRight + this.f77069l;
        } else {
            f = (float) size2;
        }
        float f3 = (float) (size / 2);
        float f4 = this.f77068k;
        float f5 = f3 - (f4 / 2.0f);
        this.f77067j.set(paddingRight, f5, f, f4 + f5);
        float f6 = this.f77065h;
        this.f77075r = ((f3 - ((((float) this.f77059b.length) * f6) / 2.0f)) + ((f6 / 2.0f) - ((fontMetrics.descent - fontMetrics.ascent) / 2.0f))) - fontMetrics.ascent;
        MethodCollector.m26664o(10666);
    }

    private WaveSideBar(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(10498);
        this.f77060c = -1;
        this.f77061d = -1.0f;
        this.f77067j = new RectF();
        this.f77070m = false;
        this.f77071n = false;
        this.f77076s = context.getResources().getDisplayMetrics();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.aci, R.attr.acj, R.attr.ack, R.attr.acl, R.attr.acm, R.attr.acn});
        this.f77071n = obtainStyledAttributes.getBoolean(0, false);
        this.f77063f = obtainStyledAttributes.getColor(4, -7829368);
        this.f77064g = obtainStyledAttributes.getDimension(5, TypedValue.applyDimension(2, 14.0f, this.f77076s));
        this.f77066i = obtainStyledAttributes.getDimension(1, TypedValue.applyDimension(1, 80.0f, this.f77076s));
        this.f77072o = obtainStyledAttributes.getInt(2, 0);
        this.f77073p = obtainStyledAttributes.getInt(3, 0);
        obtainStyledAttributes.recycle();
        this.f77059b = getDefaultIndexItems();
        Paint paint = new Paint();
        this.f77062e = paint;
        paint.setAntiAlias(true);
        this.f77062e.setColor(this.f77063f);
        this.f77062e.setTextSize(this.f77064g);
        this.f77062e.setTypeface(C17301b.m32033a().mo27611a(C17303d.f41573g));
        int i = this.f77073p;
        if (i == 0) {
            this.f77062e.setTextAlign(Paint.Align.CENTER);
            MethodCollector.m26664o(10498);
        } else if (i != 1) {
            if (i == 2) {
                this.f77062e.setTextAlign(Paint.Align.RIGHT);
            }
            MethodCollector.m26664o(10498);
        } else {
            this.f77062e.setTextAlign(Paint.Align.LEFT);
            MethodCollector.m26664o(10498);
        }
    }
}
