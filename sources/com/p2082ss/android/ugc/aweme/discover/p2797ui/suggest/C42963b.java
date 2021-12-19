package com.p2082ss.android.ugc.aweme.discover.p2797ui.suggest;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import com.p2082ss.android.ugc.aweme.discover.model.suggest.Word;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42664al;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.suggest.b */
public final class C42963b implements AbstractC17641a {

    /* renamed from: a */
    public final Word f100185a;

    /* renamed from: b */
    public final int f100186b;

    /* renamed from: c */
    public final AbstractC42664al.AbstractC42665a f100187c;

    static {
        Covode.recordClassIndex(51095);
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
        if (!(obj instanceof C42963b)) {
            return false;
        }
        C42963b bVar = (C42963b) obj;
        return C89219l.m154714a(this.f100185a, bVar.f100185a) && this.f100186b == bVar.f100186b && C89219l.m154714a(this.f100187c, bVar.f100187c);
    }

    public final int hashCode() {
        Word word = this.f100185a;
        int i = 0;
        int hashCode = (((word != null ? word.hashCode() : 0) * 31) + this.f100186b) * 31;
        AbstractC42664al.AbstractC42665a aVar = this.f100187c;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "DiscoverySuggestSearchSingleLineItem(sugWord=" + this.f100185a + ", layoutStyle=" + this.f100186b + ", handler=" + this.f100187c + ")";
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

    public C42963b(Word word, int i, AbstractC42664al.AbstractC42665a aVar) {
        C89219l.m154721d(word, "");
        C89219l.m154721d(aVar, "");
        this.f100185a = word;
        this.f100186b = i;
        this.f100187c = aVar;
    }
}
