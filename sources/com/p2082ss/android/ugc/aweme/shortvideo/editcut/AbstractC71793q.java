package com.p2082ss.android.ugc.aweme.shortvideo.editcut;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.vesdk.C85581w;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.q */
public interface AbstractC71793q {
    static {
        Covode.recordClassIndex(84338);
    }

    /* renamed from: a */
    long mo113312a();

    /* renamed from: a */
    void mo113313a(long j, C85581w.EnumC85607f fVar, boolean z);

    /* renamed from: d */
    boolean mo113316d();

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.q$a */
    public static final class C71794a {
        static {
            Covode.recordClassIndex(84339);
        }

        /* renamed from: a */
        public static /* synthetic */ void m126761a(AbstractC71793q qVar, long j, C85581w.EnumC85607f fVar, boolean z, int i) {
            if ((i & 2) != 0) {
                fVar = C85581w.EnumC85607f.EDITOR_SEEK_FLAG_LastSeek;
            }
            if ((i & 4) != 0) {
                z = true;
            }
            qVar.mo113313a(j, fVar, z);
        }
    }
}
