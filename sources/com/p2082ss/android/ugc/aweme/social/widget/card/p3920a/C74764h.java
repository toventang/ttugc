package com.p2082ss.android.ugc.aweme.social.widget.card.p3920a;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.social.widget.card.a.h */
public final class C74764h {

    /* renamed from: a */
    public final EnumC74754a f168048a;

    /* renamed from: b */
    public final int f168049b;

    /* renamed from: c */
    public final int f168050c;

    /* renamed from: d */
    public final WeakReference<RecyclerView> f168051d;

    static {
        Covode.recordClassIndex(87609);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C74764h)) {
            return false;
        }
        C74764h hVar = (C74764h) obj;
        return C89219l.m154714a(this.f168048a, hVar.f168048a) && this.f168049b == hVar.f168049b && this.f168050c == hVar.f168050c && C89219l.m154714a(this.f168051d, hVar.f168051d);
    }

    public final int hashCode() {
        EnumC74754a aVar = this.f168048a;
        int i = 0;
        int hashCode = (((((aVar != null ? aVar.hashCode() : 0) * 31) + this.f168049b) * 31) + this.f168050c) * 31;
        WeakReference<RecyclerView> weakReference = this.f168051d;
        if (weakReference != null) {
            i = weakReference.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "RecUserGroupConfig(variant=" + this.f168048a + ", step=" + this.f168049b + ", maxCount=" + this.f168050c + ", attachRecyclerViewRef=" + this.f168051d + ")";
    }

    private /* synthetic */ C74764h() {
        this(EnumC74754a.RECTANGLE, 20, Integer.MAX_VALUE, null);
    }

    public C74764h(EnumC74754a aVar, int i, int i2, WeakReference<RecyclerView> weakReference) {
        C89219l.m154721d(aVar, "");
        this.f168048a = aVar;
        this.f168049b = i;
        this.f168050c = i2;
        this.f168051d = weakReference;
    }
}
