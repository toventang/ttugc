package com.p2082ss.android.ugc.asve.recorder;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.vesdk.runtime.AbstractC85556e;
import java.io.File;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.asve.recorder.m */
public final class C31217m extends AbstractC85556e {

    /* renamed from: d */
    private final AbstractC31192e f74819d;

    static {
        Covode.recordClassIndex(37863);
    }

    @Override // com.p2082ss.android.vesdk.runtime.AbstractC85556e
    /* renamed from: b */
    public final String mo56848b() {
        String absolutePath = this.f74819d.mo56221c().getAbsolutePath();
        C89219l.m154716b(absolutePath, "");
        return absolutePath;
    }

    @Override // com.p2082ss.android.vesdk.runtime.AbstractC85556e
    /* renamed from: c */
    public final String mo56849c() {
        String absolutePath = this.f74819d.mo56222d().getAbsolutePath();
        C89219l.m154716b(absolutePath, "");
        return absolutePath;
    }

    @Override // com.p2082ss.android.vesdk.runtime.AbstractC85556e
    /* renamed from: a */
    public final String mo56847a() {
        String absolutePath = this.f74819d.mo56220b().getAbsolutePath();
        new File(absolutePath).mkdirs();
        C89219l.m154716b(absolutePath, "");
        return absolutePath;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C31217m(AbstractC31192e eVar) {
        super(eVar.mo56219a().getAbsolutePath());
        C89219l.m154721d(eVar, "");
        this.f74819d = eVar;
    }
}
