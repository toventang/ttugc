package com.zhihu.matisse.internal.p4516ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import p4593g.p4594a.p4595a.p4596a.p4598b.C88989a;

/* renamed from: com.zhihu.matisse.internal.ui.widget.PreviewViewPager */
public class PreviewViewPager extends ViewPager {
    static {
        Covode.recordClassIndex(104004);
    }

    public PreviewViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public boolean canScroll(View view, boolean z, int i, int i2, int i3) {
        if (!(view instanceof C88989a)) {
            return super.canScroll(view, z, i, i2, i3);
        }
        if (((C88989a) view).mo143311a(i) || super.canScroll(view, z, i, i2, i3)) {
            return true;
        }
        return false;
    }
}
