package com.bytedance.scene.navigation;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.scene.navigation.i */
public final class C22260i {

    /* renamed from: a */
    List<Record> f52656a = new ArrayList();

    static {
        Covode.recordClassIndex(26072);
    }

    /* renamed from: c */
    public final List<Record> mo36565c() {
        return new ArrayList(this.f52656a);
    }

    C22260i() {
    }

    /* renamed from: b */
    public final boolean mo36564b() {
        if (this.f52656a.size() > 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final Record mo36562a() {
        if (this.f52656a.size() <= 0) {
            return null;
        }
        List<Record> list = this.f52656a;
        return list.get(list.size() - 1);
    }

    /* renamed from: a */
    public final void mo36563a(Record record) {
        this.f52656a.remove(record);
    }
}
