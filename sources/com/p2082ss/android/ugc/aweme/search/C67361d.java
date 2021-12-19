package com.p2082ss.android.ugc.aweme.search;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.discover.model.Position;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.search.d */
public final class C67361d implements Serializable {
    @AbstractC27891c(mo46611a = "field")

    /* renamed from: a */
    private String f150930a;
    @AbstractC27891c(mo46611a = "positions")

    /* renamed from: b */
    private List<Position> f150931b;

    static {
        Covode.recordClassIndex(78991);
    }

    public final String getField() {
        return this.f150930a;
    }

    public final List<Position> getPositions() {
        return this.f150931b;
    }

    public final void setField(String str) {
        this.f150930a = str;
    }

    public final void setPositions(List<Position> list) {
        this.f150931b = list;
    }
}
