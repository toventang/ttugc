package com.bytedance.android.livesdk.p643ui.p644a;

import android.content.res.Resources;
import android.view.ViewGroup;
import com.bytedance.android.live.design.widget.shapecontrol.ShapeControllableView;
import com.bytedance.covode.number.Covode;
import com.p084a.p088b.p089a.C1863a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.ui.a.a */
public final class C10936a {
    static {
        Covode.recordClassIndex(12548);
    }

    /* renamed from: a */
    public static void m19558a(ShapeControllableView shapeControllableView, ViewGroup.LayoutParams layoutParams) {
        C89219l.m154721d(shapeControllableView, "");
        C89219l.m154721d(layoutParams, "");
    }

    /* renamed from: a */
    public static boolean m19559a(String str, C1863a aVar, ShapeControllableView shapeControllableView, ViewGroup.LayoutParams layoutParams) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(shapeControllableView, "");
        C89219l.m154721d(layoutParams, "");
        int hashCode = str.hashCode();
        int i = 0;
        if (hashCode != -1070567623) {
            if (hashCode != -391775833) {
                if (hashCode == 872454657 && str.equals("app:gradientPositions")) {
                    String str2 = aVar.f5673a;
                    C89219l.m154716b(str2, "");
                    shapeControllableView.setGradientPositions(Integer.parseInt(str2));
                    return true;
                }
            } else if (str.equals("app:gradientOrientation")) {
                String str3 = aVar.f5673a;
                if (str3 != null && str3.hashCode() == -1984141450 && str3.equals("vertical")) {
                    i = 1;
                }
                shapeControllableView.setGradientOrientation(i);
                return true;
            }
        } else if (str.equals("app:gradientColors")) {
            Resources resources = shapeControllableView.getResources();
            String str4 = aVar.f5673a;
            C89219l.m154716b(str4, "");
            shapeControllableView.setGradientColors(resources.getIntArray(Integer.parseInt(str4)));
            return true;
        }
        return false;
    }
}
