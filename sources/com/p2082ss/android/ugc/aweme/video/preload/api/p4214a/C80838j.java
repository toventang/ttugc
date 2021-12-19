package com.p2082ss.android.ugc.aweme.video.preload.api.p4214a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.video.preload.AbstractC80918i;
import com.p2082ss.android.ugc.aweme.video.preload.api.AbstractC80850i;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.video.preload.api.a.j */
public final class C80838j implements AbstractC80850i {

    /* renamed from: a */
    public static final C80838j f180783a = new C80838j();

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.AbstractC80850i
    /* renamed from: a */
    public final boolean mo124205a() {
        return false;
    }

    private C80838j() {
    }

    static {
        Covode.recordClassIndex(94136);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.AbstractC80850i
    /* renamed from: a */
    public final File mo124204a(Context context, AbstractC80850i.EnumC80851a aVar) {
        File file;
        if (context != null) {
            if (C58016d.f132221b == null || !C58016d.f132224e) {
                C58016d.f132221b = context.getCacheDir();
            }
            file = C58016d.f132221b;
        } else {
            file = null;
        }
        return new File(file, AbstractC80918i.EnumC80919a.VideoCache.getCacheDirName());
    }
}
