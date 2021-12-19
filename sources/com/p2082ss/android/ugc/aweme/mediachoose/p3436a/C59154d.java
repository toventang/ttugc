package com.p2082ss.android.ugc.aweme.mediachoose.p3436a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.mediachoose.a.d */
public final class C59154d {

    /* renamed from: a */
    public final C59155e f134591a;

    /* renamed from: b */
    public final List<MediaModel> f134592b;

    static {
        Covode.recordClassIndex(69512);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static C59154d m108662a(C59155e eVar, List<MediaModel> list) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(list, "");
        return new C59154d(eVar, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C59154d)) {
            return false;
        }
        C59154d dVar = (C59154d) obj;
        return C89219l.m154714a(this.f134591a, dVar.f134591a) && C89219l.m154714a(this.f134592b, dVar.f134592b);
    }

    public final int hashCode() {
        C59155e eVar = this.f134591a;
        int i = 0;
        int hashCode = (eVar != null ? eVar.hashCode() : 0) * 31;
        List<MediaModel> list = this.f134592b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "MediaRequestData(param=" + this.f134591a + ", mediaModelList=" + this.f134592b + ")";
    }

    public C59154d(C59155e eVar, List<MediaModel> list) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(list, "");
        this.f134591a = eVar;
        this.f134592b = list;
    }
}
