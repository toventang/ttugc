package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: androidx.appcompat.widget.o */
public class C0440o extends RatingBar {

    /* renamed from: a */
    private final C0438m f1702a;

    static {
        Covode.recordClassIndex(505);
    }

    public C0440o(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmap = this.f1702a.f1698a;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }

    private C0440o(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, R.attr.a92);
        C0438m mVar = new C0438m(this);
        this.f1702a = mVar;
        mVar.mo1949a(attributeSet, R.attr.a92);
    }
}
