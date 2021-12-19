package com.p2082ss.android.ugc.aweme.inbox.widget.multi;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.inbox.widget.multi.k */
public abstract class AbstractC56585k {

    /* renamed from: j */
    public final int f129018j;

    static {
        Covode.recordClassIndex(66408);
    }

    /* renamed from: a */
    public abstract boolean mo93492a();

    public int hashCode() {
        int i;
        int i2 = this.f129018j;
        if (mo93492a()) {
            i = 1231;
        } else {
            i = 1237;
        }
        return i2 + i;
    }

    public AbstractC56585k(int i) {
        this.f129018j = i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC56585k)) {
            return false;
        }
        AbstractC56585k kVar = (AbstractC56585k) obj;
        if (kVar.f129018j == this.f129018j && kVar.mo93492a() == mo93492a()) {
            return true;
        }
        return false;
    }
}
