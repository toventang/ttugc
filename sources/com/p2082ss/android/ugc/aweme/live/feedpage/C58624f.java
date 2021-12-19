package com.p2082ss.android.ugc.aweme.live.feedpage;

import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.ss.android.ugc.aweme.live.feedpage.f */
final /* synthetic */ class C58624f implements AbstractC88433f {

    /* renamed from: a */
    private final C58621e f133521a;

    /* renamed from: b */
    private final AbstractC88433f f133522b;

    /* renamed from: c */
    private final long f133523c;

    /* renamed from: d */
    private final List f133524d;

    static {
        Covode.recordClassIndex(68924);
    }

    C58624f(C58621e eVar, AbstractC88433f fVar, long j, List list) {
        this.f133521a = eVar;
        this.f133522b = fVar;
        this.f133523c = j;
        this.f133524d = list;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        Map<Long, Long> a;
        long j;
        C58621e eVar = this.f133521a;
        AbstractC88433f fVar = this.f133522b;
        long j2 = this.f133523c;
        List<User> list = this.f133524d;
        C58628j jVar = (C58628j) obj;
        if (!(jVar == null || fVar == null || (a = jVar.f133529a.mo96092a()) == null)) {
            Long l = a.get(Long.valueOf(j2));
            if (l == null) {
                l = 0L;
            }
            if (l.longValue() != 0) {
                eVar.f133506c.put(Long.valueOf(j2), l);
                eVar.f133507d.put(Long.valueOf(j2), Long.valueOf(System.currentTimeMillis()));
            }
            eVar.f133510g.put(Long.valueOf(j2), l);
            eVar.f133509f.put(Long.valueOf(j2), Long.valueOf(System.currentTimeMillis()));
            if (!C13603b.m24435a((Collection) list)) {
                for (User user : list) {
                    if (user != null) {
                        try {
                            j = Long.parseLong(user.getUid());
                        } catch (Exception e) {
                            e.printStackTrace();
                            j = 0;
                        }
                        Long l2 = a.get(Long.valueOf(j));
                        if (l2 == null) {
                            l2 = 0L;
                        }
                        if (l2.longValue() != 0) {
                            eVar.f133506c.put(Long.valueOf(j), l2);
                            eVar.f133507d.put(Long.valueOf(j), Long.valueOf(System.currentTimeMillis()));
                        }
                        eVar.f133510g.put(Long.valueOf(j), l2);
                        eVar.f133509f.put(Long.valueOf(j), Long.valueOf(System.currentTimeMillis()));
                    }
                }
            }
            fVar.accept(l);
        }
    }
}
