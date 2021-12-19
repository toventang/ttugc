package com.p2082ss.ttvideoengine.p4419l;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ttvideoengine.AbstractC86509j;
import java.util.Objects;

/* renamed from: com.ss.ttvideoengine.l.b */
public class C86567b {

    /* renamed from: a */
    public String f195029a;

    /* renamed from: b */
    public String f195030b;

    /* renamed from: c */
    public long f195031c;

    /* renamed from: d */
    public AbstractC86509j f195032d;

    static {
        Covode.recordClassIndex(101795);
    }

    public int hashCode() {
        return Objects.hash(this.f195029a, this.f195030b, this.f195032d);
    }

    public boolean equals(Object obj) {
        boolean z;
        boolean z2 = false;
        if (obj == null) {
            return false;
        }
        if (super.equals(obj)) {
            return true;
        }
        if (!(obj instanceof C86567b)) {
            return false;
        }
        C86567b bVar = (C86567b) obj;
        if (this.f195031c != bVar.f195031c || !this.f195029a.equals(bVar.f195029a)) {
            z = false;
        } else {
            z = true;
        }
        AbstractC86509j jVar = this.f195032d;
        if (jVar == null) {
            if (bVar.f195032d != null) {
                return false;
            }
            return z;
        } else if (bVar.f195032d != null) {
            if (!z) {
                return z;
            }
            if (jVar == bVar.f195032d) {
                z2 = true;
            }
            return z2;
        }
        return false;
    }
}
