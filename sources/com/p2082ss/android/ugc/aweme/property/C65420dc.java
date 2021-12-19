package com.p2082ss.android.ugc.aweme.property;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.property.dc */
public final class C65420dc {

    /* renamed from: a */
    public static final int[] f147573a = null;

    /* renamed from: b */
    public static final C65420dc f147574b = new C65420dc();

    private C65420dc() {
    }

    static {
        Covode.recordClassIndex(76907);
    }

    /* renamed from: a */
    public static final List<Integer> m117139a() {
        try {
            int[] iArr = (int[]) SettingsManager.m29616a().mo25397a("video_quality_category", int[].class, f147573a);
            if (iArr != null) {
                C89219l.m154721d(iArr, "");
                int length = iArr.length;
                if (length == 0) {
                    return C89086z.INSTANCE;
                }
                if (length == 1) {
                    return C89070n.m154516a(Integer.valueOf(iArr[0]));
                }
                C89219l.m154721d(iArr, "");
                ArrayList arrayList = new ArrayList(iArr.length);
                for (int i : iArr) {
                    arrayList.add(Integer.valueOf(i));
                }
                return arrayList;
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
