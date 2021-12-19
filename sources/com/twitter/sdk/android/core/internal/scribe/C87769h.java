package com.twitter.sdk.android.core.internal.scribe;

import com.bytedance.covode.number.Covode;
import com.twitter.sdk.android.core.internal.scribe.AbstractC87767g;
import java.util.Comparator;

/* access modifiers changed from: package-private */
/* renamed from: com.twitter.sdk.android.core.internal.scribe.h */
public final /* synthetic */ class C87769h implements Comparator {

    /* renamed from: a */
    static final Comparator f199363a = new C87769h();

    static {
        Covode.recordClassIndex(103767);
    }

    private C87769h() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return (int) (((AbstractC87767g.C87768a) obj).f199362b - ((AbstractC87767g.C87768a) obj2).f199362b);
    }
}
