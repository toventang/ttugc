package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.p3082b;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.facebook.p1844d.AbstractC24156b;
import com.facebook.p1844d.AbstractC24157c;
import java.lang.ref.WeakReference;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.b.b.f */
public final class C53643f {

    /* renamed from: a */
    public final WeakReference<C19538ai> f123074a;

    /* renamed from: b */
    public final List<C53646h> f123075b;

    /* renamed from: c */
    public final boolean f123076c;

    /* renamed from: d */
    public final int f123077d;

    static {
        Covode.recordClassIndex(63223);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C53643f)) {
            return false;
        }
        C53643f fVar = (C53643f) obj;
        return C89219l.m154714a(this.f123074a, fVar.f123074a) && C89219l.m154714a(this.f123075b, fVar.f123075b) && this.f123076c == fVar.f123076c && this.f123077d == fVar.f123077d;
    }

    public final int hashCode() {
        WeakReference<C19538ai> weakReference = this.f123074a;
        int i = 0;
        int hashCode = (weakReference != null ? weakReference.hashCode() : 0) * 31;
        List<C53646h> list = this.f123075b;
        if (list != null) {
            i = list.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.f123076c;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        return ((i2 + i3) * 31) + this.f123077d;
    }

    public final String toString() {
        return "PreloadMedia(msg=" + this.f123074a + ", urls=" + this.f123075b + ", isAnimate=" + this.f123076c + ", priority=" + this.f123077d + ")";
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.b.b.f$a */
    public static final class C53644a extends AbstractC24156b<Void> {

        /* renamed from: a */
        final /* synthetic */ C53646h f123078a;

        /* renamed from: b */
        final /* synthetic */ C53643f f123079b;

        /* renamed from: c */
        final /* synthetic */ AbstractC53642e f123080c;

        static {
            Covode.recordClassIndex(63224);
        }

        @Override // com.facebook.p1844d.AbstractC24156b
        public final void onFailureImpl(AbstractC24157c<Void> cVar) {
            AbstractC53642e eVar = this.f123080c;
            if (eVar != null) {
                eVar.mo90204a(this.f123078a);
            }
        }

        @Override // com.facebook.p1844d.AbstractC24156b
        public final void onNewResultImpl(AbstractC24157c<Void> cVar) {
            AbstractC53642e eVar = this.f123080c;
            if (eVar != null) {
                eVar.mo90204a(this.f123078a);
            }
        }

        C53644a(C53646h hVar, C53643f fVar, AbstractC53642e eVar) {
            this.f123078a = hVar;
            this.f123079b = fVar;
            this.f123080c = eVar;
        }
    }

    private C53643f(WeakReference<C19538ai> weakReference, List<C53646h> list, boolean z) {
        C89219l.m154721d(weakReference, "");
        C89219l.m154721d(list, "");
        this.f123074a = weakReference;
        this.f123075b = list;
        this.f123076c = z;
        this.f123077d = 0;
    }

    public /* synthetic */ C53643f(WeakReference weakReference, List list, boolean z, byte b) {
        this(weakReference, list, z);
    }
}
