package com.bytedance.p1734ug.p1735a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.ug.a.p */
public final class C23458p implements AbstractC23452j {

    /* renamed from: a */
    private final C23445f f55619a;

    /* renamed from: b */
    private AbstractC23453k f55620b;

    /* renamed from: c */
    private List<AbstractC23454l> f55621c = new CopyOnWriteArrayList();

    /* renamed from: d */
    private AtomicInteger f55622d = new AtomicInteger(0);

    static {
        Covode.recordClassIndex(27418);
    }

    /* renamed from: a */
    private AbstractC23452j m44146a(AbstractC23454l lVar) {
        this.f55621c.add(lVar);
        return this;
    }

    C23458p(C23445f fVar) {
        AbstractC23454l gVar;
        this.f55619a = fVar;
        m44146a(new C23455m(fVar.f55599b));
        if (fVar.f55601d) {
            int i = fVar.f55602e;
            if (i != 1) {
                gVar = i == 2 ? new C23446g() : gVar;
            } else {
                gVar = new C23448h(fVar.f55598a, fVar.f55599b);
            }
            m44146a(gVar);
        }
        this.f55620b = new C23442c(fVar.f55599b, fVar.f55600c);
    }

    @Override // com.bytedance.p1734ug.p1735a.AbstractC23452j
    /* renamed from: a */
    public final void mo38216a(String str, int i, String str2) {
        mo38217a(str, i, str2, null);
    }

    @Override // com.bytedance.p1734ug.p1735a.AbstractC23452j
    /* renamed from: a */
    public final void mo38217a(String str, int i, String str2, JSONObject jSONObject) {
        if (i != 0 && TextUtils.isEmpty(str2)) {
            str2 = "other error";
        }
        C23440a aVar = new C23440a(this.f55622d.addAndGet(1));
        aVar.f55587a = this.f55619a.f55599b;
        aVar.f55588b = this.f55619a.f55600c;
        aVar.f55590d = str;
        aVar.f55592f = i;
        aVar.f55594h = jSONObject;
        aVar.f55591e = str2;
        aVar.f55593g = String.valueOf(System.currentTimeMillis());
        this.f55620b.mo38210a("ug_sdk_action_check", aVar.mo38208a());
        for (AbstractC23454l lVar : this.f55621c) {
            lVar.mo38212a(aVar);
        }
    }
}
