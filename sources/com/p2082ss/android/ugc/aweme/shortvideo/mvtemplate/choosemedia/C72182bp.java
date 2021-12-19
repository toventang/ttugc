package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.C89386u;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.bp */
public final class C72182bp {

    /* renamed from: a */
    public static final C72182bp f161801a = new C72182bp();

    private C72182bp() {
    }

    static {
        Covode.recordClassIndex(84847);
    }

    /* renamed from: a */
    public static C89386u<Boolean, Integer, Long> m127372a(Context context, List<? extends MediaModel> list, long j, long j2) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(list, "");
        int size = list.size();
        long j3 = 0;
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            if (((long) ((int) ((MediaModel) list.get(i2)).f134668h)) <= j) {
                if (context instanceof Activity) {
                    new C23144b((Activity) context).mo37635a(context.getString(R.string.h3o, Long.valueOf(j / 1000))).mo37637b();
                }
                C72200bs.m127398a(1, 0);
                return new C89386u<>(false, -1, -1L);
            }
            j3 += (long) ((int) ((MediaModel) list.get(i2)).f134668h);
            if (((MediaModel) list.get(i2)).f134667g == 4) {
                i++;
            }
        }
        if (j3 <= j) {
            if (context instanceof Activity) {
                new C23144b((Activity) context).mo37635a(context.getString(R.string.h3o, Long.valueOf(j / 1000))).mo37637b();
            }
            C72200bs.m127398a(1, 0);
            return new C89386u<>(false, -1, -1L);
        } else if (1 > j2 || j3 <= j2) {
            return new C89386u<>(true, Integer.valueOf(i), Long.valueOf(j3));
        } else {
            if (context instanceof Activity) {
                new C23144b((Activity) context).mo37640e(R.string.d52).mo37637b();
            }
            C72200bs.m127398a(2, 0);
            return new C89386u<>(false, -1, -1L);
        }
    }
}
