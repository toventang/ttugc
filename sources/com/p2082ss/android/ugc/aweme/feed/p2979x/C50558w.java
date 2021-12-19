package com.p2082ss.android.ugc.aweme.feed.p2979x;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.x.w */
public final class C50558w {

    /* renamed from: a */
    public static final C50558w f116849a = new C50558w();

    private C50558w() {
    }

    static {
        Covode.recordClassIndex(59705);
    }

    /* renamed from: a */
    public static final String m94788a(List<? extends Aweme> list) {
        C89219l.m154721d(list, "");
        StringBuilder sb = new StringBuilder("[");
        int i = 0;
        while (i < list.size() - 1) {
            sb.append(((Aweme) list.get(i)).getAid());
            sb.append(",");
            i++;
        }
        sb.append(((Aweme) list.get(i)).getAid()).append("]");
        return sb.toString();
    }

    /* renamed from: a */
    public static final boolean m94789a(int i, List<? extends Aweme> list) {
        int size = list.size();
        for (int i2 = i + 1; i2 < size; i2++) {
            if (((Aweme) list.get(i2)).isAd() || ((Aweme) list.get(i2)).isLive()) {
                return true;
            }
        }
        return false;
    }
}
