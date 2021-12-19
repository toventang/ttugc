package com.p2082ss.android.ugc.aweme.profile.widgets.common;

import com.bytedance.assem.arch.service.AbstractC12799b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.common.j */
public interface AbstractC64616j extends AbstractC12799b<C64615i> {
    static {
        Covode.recordClassIndex(76082);
    }

    /* renamed from: a */
    void mo104142a(int i, EnumC64592g gVar);

    /* renamed from: a */
    void mo104143a(User user, EnumC64592g gVar, boolean z);

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.common.j$a */
    public static final class C64617a {
        static {
            Covode.recordClassIndex(76083);
        }

        /* renamed from: a */
        public static /* synthetic */ void m116533a(AbstractC64616j jVar, EnumC64592g gVar, int i) {
            if ((i & 2) != 0) {
                gVar = EnumC64592g.NORMAL;
            }
            jVar.mo104142a(0, gVar);
        }

        /* renamed from: a */
        public static /* synthetic */ void m116532a(AbstractC64616j jVar, User user, EnumC64592g gVar, boolean z, int i) {
            if ((i & 2) != 0) {
                gVar = EnumC64592g.NORMAL;
            }
            if ((i & 4) != 0) {
                z = false;
            }
            jVar.mo104143a(user, gVar, z);
        }
    }
}
