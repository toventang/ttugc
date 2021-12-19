package com.p2082ss.android.ugc.asve.editor;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.vesdk.C85581w;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.asve.editor.i */
public final class C31078i extends AbstractC31077h {

    /* renamed from: a */
    public String[] f74438a;

    static {
        Covode.recordClassIndex(37708);
    }

    public C31078i(String[] strArr) {
        C89219l.m154721d(strArr, "");
        this.f74438a = strArr;
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31077h
    /* renamed from: a */
    public final int mo56408a(C85581w wVar, boolean z) {
        C89219l.m154721d(wVar, "");
        if (z) {
            wVar.mo131696h();
        }
        return wVar.mo131628a(this.f74438a, (String[]) null, (String[]) null, C85581w.EnumC85613l.VIDEO_OUT_RATIO_ORIGINAL);
    }
}
