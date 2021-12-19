package com.p2082ss.android.ugc.aweme.discover.p2797ui.suggest;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import com.p2082ss.android.ugc.aweme.discover.model.suggest.Word;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42664al;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.suggest.a */
public final class C42962a implements AbstractC17641a {

    /* renamed from: a */
    public final Word f100183a;

    /* renamed from: b */
    public final AbstractC42664al.AbstractC42665a f100184b;

    static {
        Covode.recordClassIndex(51094);
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
        if (!(obj instanceof C42962a)) {
            return false;
        }
        C42962a aVar = (C42962a) obj;
        return C89219l.m154714a(this.f100183a, aVar.f100183a) && C89219l.m154714a(this.f100184b, aVar.f100184b);
    }

    public final int hashCode() {
        Word word = this.f100183a;
        int i = 0;
        int hashCode = (word != null ? word.hashCode() : 0) * 31;
        AbstractC42664al.AbstractC42665a aVar = this.f100184b;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "DiscoverySuggestSearchBreakLineItem(sugWord=" + this.f100183a + ", handler=" + this.f100184b + ")";
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

    public C42962a(Word word, AbstractC42664al.AbstractC42665a aVar) {
        C89219l.m154721d(word, "");
        C89219l.m154721d(aVar, "");
        this.f100183a = word;
        this.f100184b = aVar;
    }
}
