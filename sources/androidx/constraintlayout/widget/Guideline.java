package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.covode.number.Covode;

public class Guideline extends View {
    static {
        Covode.recordClassIndex(619);
    }

    public void draw(Canvas canvas) {
    }

    public void setVisibility(int i) {
    }

    public Guideline(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public void setGuidelineBegin(int i) {
        ConstraintLayout.C0547a aVar = (ConstraintLayout.C0547a) getLayoutParams();
        aVar.f2250a = i;
        setLayoutParams(aVar);
    }

    public void setGuidelineEnd(int i) {
        ConstraintLayout.C0547a aVar = (ConstraintLayout.C0547a) getLayoutParams();
        aVar.f2264b = i;
        setLayoutParams(aVar);
    }

    public void setGuidelinePercent(float f) {
        ConstraintLayout.C0547a aVar = (ConstraintLayout.C0547a) getLayoutParams();
        aVar.f2265c = f;
        setLayoutParams(aVar);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
