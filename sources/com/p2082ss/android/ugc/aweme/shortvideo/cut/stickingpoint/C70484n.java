package com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70076i;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.n */
public final class C70484n {

    /* renamed from: a */
    public AbstractC70076i f157495a;

    /* renamed from: b */
    public AbstractC70076i f157496b;

    /* renamed from: c */
    public boolean f157497c;

    static {
        Covode.recordClassIndex(82927);
    }

    /* renamed from: a */
    public final void mo111047a(List<? extends VideoSegment> list, int i, long j, long j2) {
        AbstractC70076i iVar = this.f157496b;
        if (iVar != null) {
            iVar.mo110538a(list);
        }
        AbstractC70076i iVar2 = this.f157495a;
        if (iVar2 != null) {
            iVar2.mo110538a(list);
        }
        if (this.f157497c) {
            AbstractC70076i iVar3 = this.f157496b;
            if (iVar3 != null) {
                iVar3.mo110539a(list, i, j, j2);
                return;
            }
            return;
        }
        AbstractC70076i iVar4 = this.f157495a;
        if (iVar4 != null) {
            iVar4.mo110539a(list, i, j, j2);
        }
    }

    /* renamed from: a */
    public final boolean mo111048a(float f, float f2, float f3, int i, int i2) {
        AbstractC70076i iVar = this.f157495a;
        if (iVar != null) {
            return iVar.mo110543a(f, f2, f3, i, i2);
        }
        return false;
    }
}
