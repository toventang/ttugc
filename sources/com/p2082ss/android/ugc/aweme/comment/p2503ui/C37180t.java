package com.p2082ss.android.ugc.aweme.comment.p2503ui;

import com.bytedance.covode.number.Covode;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.comment.ui.t */
public final /* synthetic */ class C37180t implements Predicate {

    /* renamed from: a */
    private final Set f87689a;

    static {
        Covode.recordClassIndex(44534);
    }

    C37180t(Set set) {
        this.f87689a = set;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        return !this.f87689a.contains(((Map.Entry) obj).getKey());
    }
}
