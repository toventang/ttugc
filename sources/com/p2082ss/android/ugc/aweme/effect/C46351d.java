package com.p2082ss.android.ugc.aweme.effect;

import android.graphics.Color;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.effect.d */
public final class C46351d {

    /* renamed from: a */
    public static final int f108045a = (C13628n.m24504a(C63247i.f143610a) - (((int) C13628n.m24520b(C63247i.f143610a, 24.0f)) * 2));

    /* renamed from: b */
    private static int[] f108046b;

    static {
        Covode.recordClassIndex(54928);
    }

    /* renamed from: a */
    public static int[] m89411a() {
        List<String> d = C63244g.m114602a().mo73278f().mo73335d();
        if (d == null || d.isEmpty()) {
            int[] iArr = f108046b;
            if (iArr != null) {
                return iArr;
            }
            int[] intArray = C63247i.f143610a.getResources().getIntArray(R.array.t);
            f108046b = intArray;
            return intArray;
        }
        int[] iArr2 = new int[d.size()];
        for (int i = 0; i < d.size(); i++) {
            iArr2[i] = m89410a(d.get(i));
        }
        return iArr2;
    }

    /* renamed from: a */
    private static int m89410a(String str) {
        try {
            return Color.parseColor(str);
        } catch (Exception unused) {
            return -1;
        }
    }
}
