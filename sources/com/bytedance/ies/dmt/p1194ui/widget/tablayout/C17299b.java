package com.bytedance.ies.dmt.p1194ui.widget.tablayout;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.p037h.C0792v;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.tablayout.DmtTabLayout;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.bytedance.ies.dmt.ui.widget.tablayout.b */
public final class C17299b {

    /* renamed from: a */
    public static final C17299b f41549a = new C17299b();

    private C17299b() {
    }

    static {
        Covode.recordClassIndex(19782);
    }

    /* renamed from: a */
    public static final void m32026a(DmtTabLayout dmtTabLayout) {
        int measuredWidth;
        C89219l.m154721d(dmtTabLayout, "");
        if (dmtTabLayout.getTabMode() == 0 && dmtTabLayout.getTabCount() > 5) {
            int min = Math.min(dmtTabLayout.getTabCount(), 5);
            int i = 0;
            for (int i2 = 0; i2 < min; i2++) {
                DmtTabLayout.C17294f b = dmtTabLayout.mo27529b(i2);
                if (b == null) {
                    C89219l.m154715b();
                }
                C89219l.m154716b(b, "");
                DmtTabLayout.C17296h hVar = b.f41528i;
                C89219l.m154716b(hVar, "");
                if (hVar.getVisibility() == 0) {
                    i += hVar.getMeasuredWidth();
                }
            }
            DmtTabLayout.C17294f b2 = dmtTabLayout.mo27529b(5);
            if (b2 == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(b2, "");
            DmtTabLayout.C17296h hVar2 = b2.f41528i;
            C89219l.m154716b(hVar2, "");
            double measuredWidth2 = (double) hVar2.getMeasuredWidth();
            Double.isNaN(measuredWidth2);
            int a = i + C89241a.m154729a(measuredWidth2 * 0.5d);
            if (a > 0 && a < (measuredWidth = dmtTabLayout.getMeasuredWidth() - dmtTabLayout.getTabStripLeftPadding())) {
                float f = ((float) measuredWidth) / 5.5f;
                int tabCount = dmtTabLayout.getTabCount();
                for (int i3 = 0; i3 < tabCount; i3++) {
                    DmtTabLayout.C17294f b3 = dmtTabLayout.mo27529b(i3);
                    if (b3 == null) {
                        C89219l.m154715b();
                    }
                    C89219l.m154716b(b3, "");
                    DmtTabLayout.C17296h hVar3 = b3.f41528i;
                    C89219l.m154716b(hVar3, "");
                    if (hVar3.getVisibility() == 0) {
                        ViewGroup.LayoutParams layoutParams = hVar3.getLayoutParams();
                        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                        layoutParams2.width = (int) f;
                        layoutParams2.weight = 0.0f;
                        if (dmtTabLayout.f41484q) {
                            layoutParams2.leftMargin = 0;
                            layoutParams2.rightMargin = 0;
                        }
                        hVar3.setLayoutParams(layoutParams2);
                        C0792v.m2741a(hVar3, 0, hVar3.getPaddingTop(), 0, hVar3.getPaddingBottom());
                    }
                }
            }
        }
    }
}
