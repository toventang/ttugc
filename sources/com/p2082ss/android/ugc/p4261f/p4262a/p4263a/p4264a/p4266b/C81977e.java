package com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4266b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.C81968b;
import com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81962a;
import com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81963b;
import com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81964c;
import com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81966e;
import com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.C81967f;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.f.a.a.a.b.e */
public final class C81977e implements AbstractC81981g {
    static {
        Covode.recordClassIndex(95792);
    }

    @Override // com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4266b.AbstractC81981g
    /* renamed from: a */
    public final void mo117464a(AbstractC81962a aVar) {
    }

    @Override // com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4266b.AbstractC81981g
    /* renamed from: a */
    public final void mo117465a(List<? extends AbstractC81966e> list) {
    }

    @Override // com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4266b.AbstractC81981g
    /* renamed from: b */
    public final void mo117466b(List<? extends AbstractC81963b> list) {
    }

    @Override // com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4266b.AbstractC81981g
    /* renamed from: a */
    public final C81967f mo61744a(List<? extends AbstractC81964c> list, Map<String, Object> map) {
        C81967f fVar = new C81967f();
        if (list == null || list.isEmpty()) {
            fVar.f183435b = new C81968b(0, "bitrate list is empty...");
            return fVar;
        }
        AbstractC81964c cVar = (AbstractC81964c) list.get(0);
        for (AbstractC81964c cVar2 : list) {
            if (cVar2.getBitRate() < cVar.getBitRate()) {
                cVar = cVar2;
            }
        }
        fVar.f183437d = (double) cVar.getBitRate();
        fVar.f183434a = cVar;
        fVar.f183436c = 2;
        return fVar;
    }
}
