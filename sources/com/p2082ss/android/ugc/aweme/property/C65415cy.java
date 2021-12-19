package com.p2082ss.android.ugc.aweme.property;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.property.cy */
public final class C65415cy {

    /* renamed from: a */
    public static final float[] f147565a = null;

    /* renamed from: b */
    public static final C65415cy f147566b = new C65415cy();

    private C65415cy() {
    }

    static {
        Covode.recordClassIndex(76902);
    }

    /* renamed from: a */
    public static final List<Float> m117134a() {
        try {
            float[] fArr = (float[]) SettingsManager.m29616a().mo25397a("video_bitrate_category", float[].class, f147565a);
            if (fArr != null) {
                C89219l.m154721d(fArr, "");
                int length = fArr.length;
                if (length == 0) {
                    return C89086z.INSTANCE;
                }
                if (length == 1) {
                    return C89070n.m154516a(Float.valueOf(fArr[0]));
                }
                C89219l.m154721d(fArr, "");
                ArrayList arrayList = new ArrayList(fArr.length);
                for (float f : fArr) {
                    arrayList.add(Float.valueOf(f));
                }
                return arrayList;
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
