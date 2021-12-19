package com.p2082ss.android.ugc.aweme.editSticker.text.bean;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.editSticker.text.bean.c */
public final class C46084c {

    /* renamed from: a */
    public final List<TextStickerTextWrap> f107328a;

    /* renamed from: b */
    public final String f107329b;

    static {
        Covode.recordClassIndex(54642);
    }

    public final int hashCode() {
        List<TextStickerTextWrap> list = this.f107328a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        String str = this.f107329b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "EffectTextChangeInfo(textWrapList=" + this.f107328a + ", effectTextId=" + this.f107329b + ")";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C46084c) {
            C46084c cVar = (C46084c) obj;
            if (C89219l.m154714a((Object) cVar.f107329b, (Object) this.f107329b)) {
                List<TextStickerTextWrap> list = cVar.f107328a;
                ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().safeStrPair());
                }
                List<TextStickerTextWrap> list2 = this.f107328a;
                ArrayList arrayList2 = new ArrayList(C89070n.m154526a((Iterable) list2, 10));
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(it2.next().safeStrPair());
                }
                if (C89219l.m154714a(arrayList, arrayList2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public C46084c(List<TextStickerTextWrap> list, String str) {
        C89219l.m154721d(list, "");
        this.f107328a = list;
        this.f107329b = str;
    }
}
