package com.p2082ss.ttvideoengine.p4419l;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ttvideoengine.p4417j.AbstractC86517e;
import com.p2082ss.ttvideoengine.p4428q.AbstractC86612a;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.ss.ttvideoengine.l.c */
public final class C86568c extends C86567b {

    /* renamed from: e */
    public AbstractC86517e f195033e;

    /* renamed from: f */
    public AbstractC86612a f195034f;

    /* renamed from: g */
    public Map<String, String> f195035g;

    /* renamed from: h */
    public boolean f195036h;

    static {
        Covode.recordClassIndex(101796);
    }

    @Override // com.p2082ss.ttvideoengine.p4419l.C86567b
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.f195033e);
    }

    @Override // com.p2082ss.ttvideoengine.p4419l.C86567b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C86568c) && super.equals(obj)) {
            return Objects.equals(this.f195033e, ((C86568c) obj).f195033e);
        }
        return false;
    }
}
