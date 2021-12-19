package com.p2082ss.android.ugc.aweme.shortvideo.cut;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p2082ss.android.vesdk.VEListener;
import java.util.List;
import p4600h.C89378p;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.i */
public interface AbstractC70076i {
    static {
        Covode.recordClassIndex(82496);
    }

    /* renamed from: a */
    void mo110534a(int i, int i2);

    /* renamed from: a */
    void mo110535a(int i, int i2, List<? extends VideoSegment> list);

    /* renamed from: a */
    void mo110536a(int i, VideoSegment videoSegment);

    /* renamed from: a */
    void mo110537a(C70071e eVar, VEListener.AbstractC85248q qVar);

    /* renamed from: a */
    void mo110538a(List<? extends VideoSegment> list);

    /* renamed from: a */
    void mo110539a(List<? extends VideoSegment> list, int i, long j, long j2);

    /* renamed from: a */
    void mo110540a(List<? extends VideoSegment> list, boolean z);

    /* renamed from: a */
    void mo110541a(boolean z, C89378p<Long, Long> pVar);

    /* renamed from: a */
    void mo110542a(boolean z, boolean z2, List<? extends VideoSegment> list);

    /* renamed from: a */
    boolean mo110543a(float f, float f2, float f3, int i, int i2);

    /* renamed from: a */
    boolean mo110544a(int i, float f);

    /* renamed from: b */
    void mo110545b(int i, float f);

    /* renamed from: b */
    void mo110546b(int i, int i2);

    /* renamed from: c */
    void mo110547c(int i, int i2);

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.i$a */
    public static final class C70077a {
        static {
            Covode.recordClassIndex(82497);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.shortvideo.cut.i */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public static /* synthetic */ void m123718a(AbstractC70076i iVar, boolean z, C89378p pVar, int i) {
            if ((i & 1) != 0) {
                z = false;
            }
            if ((i & 2) != 0) {
                pVar = null;
            }
            iVar.mo110541a(z, pVar);
        }

        /* renamed from: a */
        public static /* synthetic */ boolean m123719a(AbstractC70076i iVar, float f, float f2, float f3, int i) {
            float f4 = f3;
            float f5 = f2;
            if ((i & 2) != 0) {
                f5 = 1.0f;
            }
            if ((i & 4) != 0) {
                f4 = 1.0f;
            }
            return iVar.mo110543a(f, f5, f4, 0, 0);
        }
    }
}
