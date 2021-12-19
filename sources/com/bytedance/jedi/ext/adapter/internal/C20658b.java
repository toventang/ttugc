package com.bytedance.jedi.ext.adapter.internal;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.jedi.ext.adapter.internal.b */
public final class C20658b {

    /* renamed from: a */
    public final List<Boolean> f48855a = new ArrayList();

    static {
        Covode.recordClassIndex(24194);
    }

    /* renamed from: a */
    public final void mo33914a() {
        if (this.f48855a.size() != 0) {
            this.f48855a.clear();
        }
    }

    /* renamed from: b */
    private final void m38906b(int i) {
        this.f48855a.add(i, false);
    }

    /* renamed from: a */
    private final void m38905a(int i) {
        if (i < this.f48855a.size()) {
            this.f48855a.set(i, true);
        } else {
            this.f48855a.add(i, true);
        }
    }

    /* renamed from: a */
    public final void mo33915a(int i, boolean z) {
        if (i >= 0 && i <= this.f48855a.size()) {
            if (z) {
                m38905a(i);
            } else {
                m38906b(i);
            }
        }
    }
}
