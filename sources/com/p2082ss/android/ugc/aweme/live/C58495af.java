package com.p2082ss.android.ugc.aweme.live;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.live.af */
public final class C58495af implements AbstractC58611f {
    static {
        Covode.recordClassIndex(68786);
    }

    @Override // com.p2082ss.android.ugc.aweme.live.AbstractC58611f
    /* renamed from: a */
    public final boolean mo95863a() {
        return Live.invalid();
    }

    /* renamed from: com.ss.android.ugc.aweme.live.af$a */
    static class C58496a {

        /* renamed from: a */
        public static AbstractC58611f f133171a = new C58495af();

        static {
            Covode.recordClassIndex(68787);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.live.AbstractC58611f
    /* renamed from: b */
    public final boolean mo95864b() {
        if (Live.getService() != null) {
            return true;
        }
        return false;
    }
}
