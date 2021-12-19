package com.bytedance.scene.group;

import com.bytedance.covode.number.Covode;
import com.bytedance.scene.AbstractC22219j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.scene.group.a */
public final class C22185a {

    /* renamed from: a */
    List<GroupRecord> f52446a = new ArrayList();

    /* renamed from: b */
    final Map<AbstractC22219j, GroupRecord> f52447b = new HashMap();

    /* renamed from: c */
    final Map<String, GroupRecord> f52448c = new HashMap();

    static {
        Covode.recordClassIndex(25991);
    }

    C22185a() {
    }

    /* renamed from: a */
    public final List<AbstractC22219j> mo36383a() {
        ArrayList arrayList = new ArrayList();
        for (GroupRecord groupRecord : this.f52446a) {
            arrayList.add(groupRecord.f52439b);
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    public final GroupRecord mo36381a(AbstractC22219j jVar) {
        return this.f52447b.get(jVar);
    }

    /* renamed from: a */
    public final GroupRecord mo36382a(String str) {
        return this.f52448c.get(str);
    }
}
