package com.p2082ss.android.ugc.aweme.shortvideo.util;

import com.bytedance.covode.number.Covode;
import java.io.File;
import java.util.Comparator;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.an */
public final /* synthetic */ class C73960an implements Comparator {

    /* renamed from: a */
    static final Comparator f166036a = new C73960an();

    static {
        Covode.recordClassIndex(86710);
    }

    private C73960an() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Long.compare(((File) obj).lastModified(), ((File) obj2).lastModified());
    }
}
