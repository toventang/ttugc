package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.appcompat.widget.b */
final class C0417b extends Drawable {

    /* renamed from: a */
    final ActionBarContainer f1633a;

    static {
        Covode.recordClassIndex(482);
    }

    public final int getOpacity() {
        return 0;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public C0417b(ActionBarContainer actionBarContainer) {
        this.f1633a = actionBarContainer;
    }

    public final void draw(Canvas canvas) {
        if (!this.f1633a.f1200d) {
            if (this.f1633a.f1197a != null) {
                this.f1633a.f1197a.draw(canvas);
            }
            if (this.f1633a.f1198b != null && this.f1633a.f1201e) {
                this.f1633a.f1198b.draw(canvas);
            }
        } else if (this.f1633a.f1199c != null) {
            this.f1633a.f1199c.draw(canvas);
        }
    }

    public final void getOutline(Outline outline) {
        if (this.f1633a.f1200d) {
            if (this.f1633a.f1199c != null) {
                this.f1633a.f1199c.getOutline(outline);
            }
        } else if (this.f1633a.f1197a != null) {
            this.f1633a.f1197a.getOutline(outline);
        }
    }
}
