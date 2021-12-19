package com.p2082ss.android.ugc.aweme.filter.p2984d.p2985a;

import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.AbstractC50752m;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import java.io.File;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.filter.d.a.f */
public final class C50680f implements AbstractC50752m {
    static {
        Covode.recordClassIndex(59842);
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.repository.internal.AbstractC50752m
    /* renamed from: a */
    public final void mo86025a(File file) {
        C89219l.m154721d(file, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.repository.internal.AbstractC50752m
    /* renamed from: a */
    public final void mo86024a(int i, File file, Exception exc) {
        C89219l.m154721d(file, "");
        C63244g.m114602a().mo73263I().mo101628a("filter unzip error" + i + " filterZipFile path ->" + file.getPath() + " filterZipFile path exit ->" + file.exists());
        C63244g.m114602a().mo73263I().mo101628a(Log.getStackTraceString(exc));
    }
}
