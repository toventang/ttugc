package com.p2082ss.android.ugc.aweme.commercialize.utils;

import com.bytedance.covode.number.Covode;
import java.util.LinkedHashMap;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.au */
public final class C38654au {

    /* renamed from: a */
    public static final LinkedHashMap<Integer, C38751k> f91336a = new LinkedHashMap<>();

    /* renamed from: b */
    public static final C38654au f91337b = new C38654au();

    private C38654au() {
    }

    static {
        Covode.recordClassIndex(46195);
    }

    /* renamed from: a */
    public static C38751k m78417a() {
        LinkedHashMap<Integer, C38751k> linkedHashMap = f91336a;
        if (!linkedHashMap.isEmpty()) {
            return linkedHashMap.values().iterator().next();
        }
        return null;
    }
}
