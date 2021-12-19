package com.p2082ss.android.ugc.aweme.trending.p4149ui.list;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import com.p2082ss.android.ugc.aweme.search.C67590l;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.trending.ui.list.b */
public final class C79128b implements AbstractC17641a {

    /* renamed from: a */
    public C67590l f177835a;

    /* renamed from: b */
    public boolean f177836b;

    /* renamed from: c */
    public AbstractC79129a f177837c;

    /* renamed from: com.ss.android.ugc.aweme.trending.ui.list.b$a */
    public interface AbstractC79129a {
        static {
            Covode.recordClassIndex(92312);
        }

        /* renamed from: a */
        void mo122915a(View view, C79128b bVar);

        /* renamed from: a */
        void mo122916a(boolean z, C67590l lVar);
    }

    static {
        Covode.recordClassIndex(92311);
    }

    @Override // com.bytedance.ies.powerlist.p1231b.AbstractC17641a
    /* renamed from: c */
    public final Object mo28111c(AbstractC17641a aVar) {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C79128b)) {
            return false;
        }
        C79128b bVar = (C79128b) obj;
        return C89219l.m154714a(this.f177835a, bVar.f177835a) && this.f177836b == bVar.f177836b && C89219l.m154714a(this.f177837c, bVar.f177837c);
    }

    public final int hashCode() {
        C67590l lVar = this.f177835a;
        int i = 0;
        int hashCode = (lVar != null ? lVar.hashCode() : 0) * 31;
        boolean z = this.f177836b;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode + i2) * 31;
        AbstractC79129a aVar = this.f177837c;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return i5 + i;
    }

    public final String toString() {
        return "TrendingSheetItem(model=" + this.f177835a + ", isSelected=" + this.f177836b + ", listener=" + this.f177837c + ")";
    }

    @Override // com.bytedance.ies.powerlist.p1231b.AbstractC17641a
    /* renamed from: a */
    public final boolean mo28109a(AbstractC17641a aVar) {
        return aVar.equals(this);
    }

    @Override // com.bytedance.ies.powerlist.p1231b.AbstractC17641a
    /* renamed from: b */
    public final boolean mo28110b(AbstractC17641a aVar) {
        return aVar.equals(this);
    }

    public C79128b(C67590l lVar, boolean z, AbstractC79129a aVar) {
        C89219l.m154721d(lVar, "");
        this.f177835a = lVar;
        this.f177836b = z;
        this.f177837c = aVar;
    }
}
