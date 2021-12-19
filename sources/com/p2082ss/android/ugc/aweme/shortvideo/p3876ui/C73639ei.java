package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct;
import java.util.Comparator;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ei */
public final /* synthetic */ class C73639ei implements Comparator {

    /* renamed from: a */
    static final Comparator f165465a = new C73639ei();

    static {
        Covode.recordClassIndex(86377);
    }

    private C73639ei() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Integer.compare(((AVTextExtraStruct) obj).getStart(), ((AVTextExtraStruct) obj2).getStart());
    }
}
