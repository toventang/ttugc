package com.bytedance.android.live.design.app.p232b;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.p037h.C0792v;
import androidx.core.widget.AbstractC0817b;
import com.bytedance.android.live.design.C4079b;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.bytedance.android.live.design.app.b.e */
public final class C4069e extends ViewGroup {

    /* renamed from: a */
    private int f11270a;

    /* renamed from: b */
    private int f11271b;

    /* renamed from: c */
    private int f11272c;

    /* renamed from: d */
    private Paint f11273d;

    /* renamed from: e */
    private final TextPaint f11274e = new TextPaint();

    /* renamed from: f */
    private int f11275f;

    /* renamed from: g */
    private int f11276g;

    static {
        Covode.recordClassIndex(4613);
    }

    public final void setOrientation(int i) {
        this.f11270a = i;
        requestLayout();
    }

    public C4069e(Context context) {
        super(context);
        MethodCollector.m26663i(9085);
        setWillNotDraw(false);
        this.f11272c = getContext().getResources().getDimensionPixelSize(R.dimen.np);
        Paint paint = new Paint(1);
        this.f11273d = paint;
        paint.setColor(C4079b.m9889a(this, (int) R.attr.am1));
        this.f11273d.setStrokeWidth((float) this.f11272c);
        this.f11275f = getContext().getResources().getDimensionPixelSize(R.dimen.n_);
        this.f11276g = getContext().getResources().getDimensionPixelSize(R.dimen.n9);
        MethodCollector.m26664o(9085);
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        int childCount = getChildCount();
        if (childCount > 0) {
            canvas.drawRect(0.0f, (float) this.f11276g, (float) getWidth(), (float) (this.f11276g + this.f11272c), this.f11273d);
            int i = 1;
            if (this.f11271b == 1) {
                int width = (getWidth() - ((childCount - 1) * this.f11272c)) / childCount;
                while (i < childCount) {
                    int i2 = this.f11272c;
                    float f = (float) ((i * width) + ((i - 1) * i2));
                    int i3 = this.f11276g;
                    canvas.drawRect(f, (float) (i3 + i2), f + ((float) i2), (float) (i3 + i2 + this.f11275f), this.f11273d);
                    i++;
                }
                return;
            }
            while (i < childCount) {
                View childAt = getChildAt(i - 1);
                canvas.drawRect(0.0f, (float) childAt.getBottom(), (float) getWidth(), (float) (childAt.getBottom() + this.f11272c), this.f11273d);
                i++;
            }
        }
    }

    /* renamed from: a */
    public final void mo9517a(LiveDialog liveDialog, List<C4064b> list) {
        removeAllViews();
        if (list != null && !list.isEmpty()) {
            for (C4064b bVar : list) {
                C4071g gVar = new C4071g(getContext());
                gVar.f11279a.mo9511a(bVar.f11258b);
                gVar.setText(bVar.f11257a);
                if (bVar.f11259c != null) {
                    gVar.setOnClickListener(new View$OnClickListenerC4070f(bVar, liveDialog));
                }
                gVar.setEnabled(bVar.f11260d);
                addView(gVar);
            }
        }
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3;
        StaticLayout staticLayout;
        MethodCollector.m26663i(10337);
        int childCount = getChildCount();
        if (childCount > 0) {
            int size = View.MeasureSpec.getSize(i);
            int childCount2 = (size - ((getChildCount() - 1) * this.f11272c)) / getChildCount();
            int i4 = this.f11270a;
            int i5 = 0;
            if (i4 == 0) {
                int i6 = 0;
                while (true) {
                    TextView textView = (TextView) getChildAt(i6);
                    int paddingLeft = (childCount2 - textView.getPaddingLeft()) - textView.getPaddingRight();
                    CharSequence text = textView.getText();
                    if (paddingLeft > 0 && !TextUtils.isEmpty(text)) {
                        this.f11274e.reset();
                        this.f11274e.set(textView.getPaint());
                        TextPaint textPaint = this.f11274e;
                        if (Build.VERSION.SDK_INT >= 27) {
                            i3 = textView.getAutoSizeMaxTextSize();
                        } else if (textView instanceof AbstractC0817b) {
                            i3 = ((AbstractC0817b) textView).getAutoSizeMaxTextSize();
                        } else {
                            i3 = -1;
                        }
                        textPaint.setTextSize((float) i3);
                        TextPaint textPaint2 = this.f11274e;
                        if (Build.VERSION.SDK_INT >= 23) {
                            staticLayout = StaticLayout.Builder.obtain(text, 0, text.length(), textPaint2, paddingLeft).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency()).setMaxLines(textView.getMaxLines()).setTextDirection(TextDirectionHeuristics.FIRSTSTRONG_LTR).build();
                        } else {
                            staticLayout = new StaticLayout(text, textPaint2, paddingLeft, Layout.Alignment.ALIGN_NORMAL, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
                        }
                        if (!(staticLayout.getLineCount() == 1 && staticLayout.getLineEnd(staticLayout.getLineCount() - 1) == text.length())) {
                            this.f11271b = 2;
                        }
                    }
                    i6++;
                    if (i6 >= childCount) {
                        this.f11271b = 1;
                        break;
                    }
                }
                this.f11271b = 2;
            } else {
                this.f11271b = i4;
            }
            if (this.f11271b == 1) {
                do {
                    getChildAt(i5).measure(View.MeasureSpec.makeMeasureSpec(childCount2, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f11275f, 1073741824));
                    i5++;
                } while (i5 < childCount);
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f11276g + this.f11272c + this.f11275f, 1073741824));
                MethodCollector.m26664o(10337);
                return;
            }
            do {
                getChildAt(i5).measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f11275f, 1073741824));
                i5++;
            } while (i5 < childCount);
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f11276g + ((this.f11272c + this.f11275f) * childCount), 1073741824));
            MethodCollector.m26664o(10337);
            return;
        }
        super.onMeasure(i, i2);
        MethodCollector.m26664o(10337);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        int measuredWidth;
        int childCount = getChildCount();
        int i5 = 0;
        if (C0792v.m2768e(this) == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (childCount <= 0) {
            return;
        }
        if (this.f11271b == 1) {
            int i6 = this.f11276g + this.f11272c;
            int i7 = this.f11275f + i6;
            do {
                View childAt = getChildAt(i5);
                if (z2) {
                    measuredWidth = (childAt.getMeasuredWidth() + this.f11272c) * i5;
                } else {
                    measuredWidth = ((i3 - i) - ((i5 + 1) * childAt.getMeasuredWidth())) - (this.f11272c * i5);
                }
                childAt.layout(measuredWidth, i6, childAt.getMeasuredWidth() + measuredWidth, i7);
                i5++;
            } while (i5 < childCount);
            return;
        }
        int i8 = this.f11276g + this.f11272c;
        int i9 = 0;
        do {
            View childAt2 = getChildAt(i9);
            childAt2.layout(0, i8, childAt2.getMeasuredWidth(), childAt2.getMeasuredHeight() + i8);
            i8 += childAt2.getMeasuredHeight() + this.f11272c;
            i9++;
        } while (i9 < childCount);
    }
}
