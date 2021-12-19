package p4593g.p4594a.p4595a.p4596a.p4598b.p4599a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;

/* renamed from: g.a.a.a.b.a.a */
public final class C88994a extends Drawable {

    /* renamed from: a */
    public Bitmap f202075a;

    /* renamed from: b */
    public Paint f202076b;

    /* renamed from: c */
    protected int f202077c;

    /* renamed from: d */
    protected int f202078d;

    static {
        Covode.recordClassIndex(105036);
    }

    public final int getOpacity() {
        return -3;
    }

    public final int getIntrinsicHeight() {
        return this.f202078d;
    }

    public final int getIntrinsicWidth() {
        return this.f202077c;
    }

    public final int getMinimumHeight() {
        return this.f202078d;
    }

    public final int getMinimumWidth() {
        return this.f202077c;
    }

    public final void setAlpha(int i) {
        this.f202076b.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f202076b.setColorFilter(colorFilter);
    }

    public final void draw(Canvas canvas) {
        Bitmap bitmap = this.f202075a;
        if (bitmap != null && !bitmap.isRecycled()) {
            canvas.drawBitmap(this.f202075a, 0.0f, 0.0f, this.f202076b);
        }
    }

    public C88994a(Bitmap bitmap) {
        this.f202075a = bitmap;
        if (bitmap != null) {
            this.f202077c = bitmap.getWidth();
            this.f202078d = this.f202075a.getHeight();
        } else {
            this.f202077c = 0;
            this.f202078d = 0;
        }
        Paint paint = new Paint();
        this.f202076b = paint;
        paint.setDither(true);
        this.f202076b.setFilterBitmap(true);
    }
}
