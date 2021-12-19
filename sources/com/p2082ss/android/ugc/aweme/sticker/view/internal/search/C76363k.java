package com.p2082ss.android.ugc.aweme.sticker.view.internal.search;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.search.k */
public final class C76363k {

    /* renamed from: a */
    public final boolean f171542a;

    /* renamed from: b */
    public final List<Effect> f171543b;

    /* renamed from: c */
    public final String f171544c;

    static {
        Covode.recordClassIndex(89318);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C76363k)) {
            return false;
        }
        C76363k kVar = (C76363k) obj;
        return this.f171542a == kVar.f171542a && C89219l.m154714a(this.f171543b, kVar.f171543b) && C89219l.m154714a(this.f171544c, kVar.f171544c);
    }

    public final int hashCode() {
        boolean z = this.f171542a;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = i * 31;
        List<Effect> list = this.f171543b;
        int i5 = 0;
        int hashCode = (i4 + (list != null ? list.hashCode() : 0)) * 31;
        String str = this.f171544c;
        if (str != null) {
            i5 = str.hashCode();
        }
        return hashCode + i5;
    }

    public final String toString() {
        return "SearchStickerData(recommend=" + this.f171542a + ", effects=" + this.f171543b + ", searchId=" + this.f171544c + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.ss.android.ugc.effectmanager.effect.model.Effect> */
    /* JADX WARN: Multi-variable type inference failed */
    public C76363k(boolean z, List<? extends Effect> list, String str) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(str, "");
        this.f171542a = z;
        this.f171543b = list;
        this.f171544c = str;
    }
}
