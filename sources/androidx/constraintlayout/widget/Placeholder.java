package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

public class Placeholder extends View {

    /* renamed from: a */
    int f2290a = -1;

    /* renamed from: b */
    View f2291b;

    /* renamed from: c */
    int f2292c = 4;

    static {
        Covode.recordClassIndex(620);
    }

    public View getContent() {
        return this.f2291b;
    }

    public int getEmptyVisibility() {
        return this.f2292c;
    }

    public void setEmptyVisibility(int i) {
        this.f2292c = i;
    }

    public void setContentId(int i) {
        View findViewById;
        if (this.f2290a != i) {
            View view = this.f2291b;
            if (view != null) {
                view.setVisibility(0);
                ((ConstraintLayout.C0547a) this.f2291b.getLayoutParams()).f2251aa = false;
                this.f2291b = null;
            }
            this.f2290a = i;
            if (i != -1 && (findViewById = ((View) getParent()).findViewById(i)) != null) {
                findViewById.setVisibility(8);
            }
        }
    }

    /* renamed from: a */
    private void m2085a(AttributeSet attributeSet) {
        super.setVisibility(this.f2292c);
        this.f2290a = -1;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.ph, R.attr.sj});
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.f2290a = obtainStyledAttributes.getResourceId(index, this.f2290a);
                } else if (index == 1) {
                    this.f2292c = obtainStyledAttributes.getInt(index, this.f2292c);
                }
            }
        }
    }

    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize((float) rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((((float) width) / 2.0f) - (((float) rect.width()) / 2.0f)) - ((float) rect.left), ((((float) height) / 2.0f) + (((float) rect.height()) / 2.0f)) - ((float) rect.bottom), paint);
        }
    }

    public Placeholder(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m2085a(attributeSet);
    }
}
