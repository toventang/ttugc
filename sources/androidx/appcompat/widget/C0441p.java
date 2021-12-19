package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: androidx.appcompat.widget.p */
public class C0441p extends SeekBar {

    /* renamed from: a */
    private final C0442q f1703a;

    static {
        Covode.recordClassIndex(506);
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        C0442q qVar = this.f1703a;
        if (qVar.f1705c != null) {
            qVar.f1705c.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0442q qVar = this.f1703a;
        Drawable drawable = qVar.f1705c;
        if (drawable != null && drawable.isStateful() && drawable.setState(qVar.f1704b.getDrawableState())) {
            qVar.f1704b.invalidateDrawable(drawable);
        }
    }

    public C0441p(Context context) {
        this(context, null);
    }

    public synchronized void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        C0442q qVar = this.f1703a;
        if (qVar.f1705c != null) {
            int max = qVar.f1704b.getMax();
            int i2 = 1;
            if (max > 1) {
                int intrinsicWidth = qVar.f1705c.getIntrinsicWidth();
                int intrinsicHeight = qVar.f1705c.getIntrinsicHeight();
                if (intrinsicWidth >= 0) {
                    i = intrinsicWidth / 2;
                } else {
                    i = 1;
                }
                if (intrinsicHeight >= 0) {
                    i2 = intrinsicHeight / 2;
                }
                qVar.f1705c.setBounds(-i, -i2, i, i2);
                float width = ((float) ((qVar.f1704b.getWidth() - qVar.f1704b.getPaddingLeft()) - qVar.f1704b.getPaddingRight())) / ((float) max);
                int save = canvas.save();
                canvas.translate((float) qVar.f1704b.getPaddingLeft(), (float) (qVar.f1704b.getHeight() / 2));
                for (int i3 = 0; i3 <= max; i3++) {
                    qVar.f1705c.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    public C0441p(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.ab4);
    }

    public C0441p(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0442q qVar = new C0442q(this);
        this.f1703a = qVar;
        qVar.mo1949a(attributeSet, i);
    }
}
