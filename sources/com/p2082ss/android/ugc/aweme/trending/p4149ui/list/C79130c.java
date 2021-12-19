package com.p2082ss.android.ugc.aweme.trending.p4149ui.list;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import com.p2082ss.android.ugc.aweme.search.C67590l;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.trending.ui.list.c */
public final class C79130c implements AbstractC17641a {

    /* renamed from: a */
    public C67590l f177838a;

    /* renamed from: b */
    public boolean f177839b;

    /* renamed from: c */
    public AbstractC79131a f177840c;

    /* renamed from: com.ss.android.ugc.aweme.trending.ui.list.c$a */
    public interface AbstractC79131a {
        static {
            Covode.recordClassIndex(92314);
        }

        /* renamed from: a */
        void mo122918a(View view, C79130c cVar);

        /* renamed from: a */
        void mo122919a(boolean z, C67590l lVar);
    }

    static {
        Covode.recordClassIndex(92313);
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
        if (!(obj instanceof C79130c)) {
            return false;
        }
        C79130c cVar = (C79130c) obj;
        return C89219l.m154714a(this.f177838a, cVar.f177838a) && this.f177839b == cVar.f177839b && C89219l.m154714a(this.f177840c, cVar.f177840c);
    }

    public final int hashCode() {
        C67590l lVar = this.f177838a;
        int i = 0;
        int hashCode = (lVar != null ? lVar.hashCode() : 0) * 31;
        boolean z = this.f177839b;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode + i2) * 31;
        AbstractC79131a aVar = this.f177840c;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return i5 + i;
    }

    public final String toString() {
        return "TrendingSheetRichItem(model=" + this.f177838a + ", isSelected=" + this.f177839b + ", listener=" + this.f177840c + ")";
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

    public C79130c(C67590l lVar, boolean z, AbstractC79131a aVar) {
        C89219l.m154721d(lVar, "");
        this.f177838a = lVar;
        this.f177839b = z;
        this.f177840c = aVar;
    }
}
