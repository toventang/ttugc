package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* renamed from: a */
    private final int f1834a = getResources().getDimensionPixelOffset(R.dimen.e3);

    /* renamed from: b */
    private final int f1835b = getResources().getDimensionPixelOffset(R.dimen.e2);

    static {
        Covode.recordClassIndex(549);
    }

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f1834a * 2), this.f1835b), 1073741824), i2);
    }
}
