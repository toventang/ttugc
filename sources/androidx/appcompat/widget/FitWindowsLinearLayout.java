package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AbstractC0459y;
import com.bytedance.covode.number.Covode;

public class FitWindowsLinearLayout extends LinearLayout implements AbstractC0459y {

    /* renamed from: a */
    private AbstractC0459y.AbstractC0460a f1350a;

    static {
        Covode.recordClassIndex(408);
    }

    @Override // androidx.appcompat.widget.AbstractC0459y
    public void setOnFitSystemWindowsListener(AbstractC0459y.AbstractC0460a aVar) {
        this.f1350a = aVar;
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        AbstractC0459y.AbstractC0460a aVar = this.f1350a;
        if (aVar != null) {
            aVar.mo554a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    public FitWindowsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
