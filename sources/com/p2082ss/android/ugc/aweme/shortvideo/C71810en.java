package com.p2082ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct;
import java.util.Comparator;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.en */
public final /* synthetic */ class C71810en implements Comparator {

    /* renamed from: a */
    static final Comparator f160941a = new C71810en();

    static {
        Covode.recordClassIndex(84355);
    }

    private C71810en() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((AVTextExtraStruct) obj2).getStart() - ((AVTextExtraStruct) obj).getStart();
    }
}
