package com.p2082ss.android.ugc.asve.recorder.p2220b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.vesdk.C85346av;
import com.p2082ss.android.vesdk.C85579v;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.asve.recorder.b.b */
public final class C31131b implements AbstractC31130a {

    /* renamed from: a */
    private final C85346av f74590a;

    static {
        Covode.recordClassIndex(37774);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2220b.AbstractC31130a
    /* renamed from: a */
    public final void mo56580a(Runnable runnable) {
        this.f74590a.mo130754a(runnable);
    }

    public C31131b(C85346av avVar) {
        C89219l.m154721d(avVar, "");
        this.f74590a = avVar;
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2220b.AbstractC31130a
    /* renamed from: a */
    public final void mo56582a(boolean z) {
        this.f74590a.mo130824o(z);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.p2220b.AbstractC31130a
    /* renamed from: a */
    public final void mo56581a(String str, String str2, boolean z) {
        C89219l.m154721d(str, "");
        C85346av avVar = this.f74590a;
        if (str2 == null) {
            str2 = "";
        }
        avVar.mo130753a(new C85579v(str, str2, z));
    }
}
