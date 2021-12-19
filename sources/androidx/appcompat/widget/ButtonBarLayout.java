package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

public class ButtonBarLayout extends LinearLayout {

    /* renamed from: a */
    private boolean f1338a;

    /* renamed from: b */
    private int f1339b = -1;

    /* renamed from: c */
    private int f1340c;

    static {
        Covode.recordClassIndex(403);
    }

    /* renamed from: a */
    private boolean m1332a() {
        if (getOrientation() == 1) {
            return true;
        }
        return false;
    }

    public int getMinimumHeight() {
        return Math.max(this.f1340c, super.getMinimumHeight());
    }

    /* renamed from: a */
    private int m1331a(int i) {
        int childCount = getChildCount();
        while (i < childCount) {
            if (getChildAt(i).getVisibility() == 0) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public void setAllowStacking(boolean z) {
        if (this.f1338a != z) {
            this.f1338a = z;
            if (!z && getOrientation() == 1) {
                setStacked(false);
            }
            requestLayout();
        }
    }

    private void setStacked(boolean z) {
        int i;
        int i2;
        setOrientation(z ? 1 : 0);
        if (z) {
            i = 5;
        } else {
            i = 80;
        }
        setGravity(i);
        View findViewById = findViewById(R.id.e4p);
        if (findViewById != null) {
            if (z) {
                i2 = 8;
            } else {
                i2 = 4;
            }
            findViewById.setVisibility(i2);
        }
        for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
            bringChildToFront(getChildAt(childCount));
        }
    }

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ia});
        this.f1338a = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a4, code lost:
        if (r2 != false) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r7, int r8) {
        /*
        // Method dump skipped, instructions count: 170
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ButtonBarLayout.onMeasure(int, int):void");
    }
}
