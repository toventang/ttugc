package com.p2082ss.android.ugc.aweme.shortvideo.util;

import com.bytedance.covode.number.Covode;
import java.io.File;
import java.util.Comparator;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.ao */
public final /* synthetic */ class C73961ao implements Comparator {

    /* renamed from: a */
    static final Comparator f166037a = new C73961ao();

    static {
        Covode.recordClassIndex(86711);
    }

    private C73961ao() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Long.compare(((File) obj).lastModified(), ((File) obj2).lastModified());
    }
}
