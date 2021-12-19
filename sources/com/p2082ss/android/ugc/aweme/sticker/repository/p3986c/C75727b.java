package com.p2082ss.android.ugc.aweme.sticker.repository.p3986c;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.repository.c.b */
public final class C75727b {

    /* renamed from: a */
    public final List<Effect> f170137a;

    /* renamed from: b */
    public final int f170138b;

    /* renamed from: c */
    public final int f170139c;

    /* renamed from: d */
    public final Map<String, String> f170140d;

    static {
        Covode.recordClassIndex(88658);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C75727b)) {
            return false;
        }
        C75727b bVar = (C75727b) obj;
        return C89219l.m154714a(this.f170137a, bVar.f170137a) && this.f170138b == bVar.f170138b && this.f170139c == bVar.f170139c && C89219l.m154714a(this.f170140d, bVar.f170140d);
    }

    public final int hashCode() {
        List<Effect> list = this.f170137a;
        int i = 0;
        int hashCode = (((((list != null ? list.hashCode() : 0) * 31) + this.f170138b) * 31) + this.f170139c) * 31;
        Map<String, String> map = this.f170140d;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "PinStickerRequest(effects=" + this.f170137a + ", pinIndex=" + this.f170138b + ", priority=" + this.f170139c + ", extraParam=" + this.f170140d + ")";
    }

    public /* synthetic */ C75727b(List list, int i) {
        this(list, i, 0, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.ss.android.ugc.effectmanager.effect.model.Effect> */
    /* JADX WARN: Multi-variable type inference failed */
    public C75727b(List<? extends Effect> list, int i, int i2, Map<String, String> map) {
        C89219l.m154721d(list, "");
        this.f170137a = list;
        this.f170138b = i;
        this.f170139c = i2;
        this.f170140d = map;
    }
}
