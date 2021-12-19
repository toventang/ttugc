package com.p2082ss.android.ugc.aweme.editSticker.p2883f;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.editSticker.C45890g;
import com.p2082ss.android.ugc.aweme.shortvideo.C70636dh;
import com.p2082ss.android.ugc.tools.view.AbstractC84922b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.editSticker.f.g */
public final class C45889g {
    static {
        Covode.recordClassIndex(54413);
    }

    /* renamed from: a */
    public static final int[] m88533a(View view, int i, int i2) {
        int i3;
        int i4;
        C89219l.m154721d(view, "");
        AbstractC84922b bVar = C45890g.f106878a;
        if (bVar != null) {
            bVar.mo59450a(view, i, i2);
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        AbstractC84922b bVar2 = C45890g.f106878a;
        if (bVar2 != null) {
            i3 = bVar2.mo59455f();
        } else {
            i3 = 0;
        }
        AbstractC84922b bVar3 = C45890g.f106878a;
        if (bVar3 != null) {
            i4 = bVar3.mo59453d();
        } else {
            i4 = 0;
        }
        double d = (double) i2;
        Double.isNaN(d);
        if (((double) (i * 16)) > d * 9.01d) {
            return new int[]{0, (((C70636dh.m124836e(view.getContext()) - i3) - layoutParams.height) / 2) + i4};
        }
        return new int[]{(C70636dh.m124831b(view.getContext()) - layoutParams.width) >> 1, i4};
    }
}
