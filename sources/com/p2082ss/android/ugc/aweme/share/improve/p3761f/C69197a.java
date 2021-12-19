package com.p2082ss.android.ugc.aweme.share.improve.p3761f;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69682c;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.improve.f.a */
public final class C69197a implements AbstractC69682c<AbstractC69693h> {
    static {
        Covode.recordClassIndex(81511);
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69682c
    /* renamed from: a */
    public final List<AbstractC69693h> mo109565a(List<AbstractC69693h> list) {
        C89219l.m154721d(list, "");
        if (SettingsManager.m29616a().mo25400a("enable_compliance_biz_monitor", true)) {
            T t = null;
            int i = 2;
            int i2 = 0;
            int i3 = 0;
            for (T t2 : list) {
                if (C89219l.m154714a((Object) t2.mo61919c(), (Object) "live_photo") && t2.mo61923f()) {
                    t = t2;
                }
                if ((C89219l.m154714a((Object) t2.mo61919c(), (Object) "duet") || C89219l.m154714a((Object) t2.mo61919c(), (Object) "stitch")) && !t2.mo61923f()) {
                    i--;
                    if (i2 == 0) {
                        i2 = i3;
                    }
                }
                i3++;
            }
            if (t != null && i == 0) {
                list.remove(t);
                list.add(i2, t);
            }
        }
        return list;
    }
}
