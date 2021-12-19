package com.p2082ss.android.ugc.aweme.bullet.p2417e;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.bullet.p1184ui.common.BulletContainerView;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.e.c */
public final class C35146c {

    /* renamed from: a */
    public final BulletContainerView f82936a;

    /* renamed from: b */
    public final C16248b f82937b;

    static {
        Covode.recordClassIndex(42301);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35146c)) {
            return false;
        }
        C35146c cVar = (C35146c) obj;
        return C89219l.m154714a(this.f82936a, cVar.f82936a) && C89219l.m154714a(this.f82937b, cVar.f82937b);
    }

    public final int hashCode() {
        BulletContainerView bulletContainerView = this.f82936a;
        int i = 0;
        int hashCode = (bulletContainerView != null ? bulletContainerView.hashCode() : 0) * 31;
        C16248b bVar = this.f82937b;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "BulletViewCache(bulletView=" + this.f82936a + ", factory=" + this.f82937b + ")";
    }

    public C35146c(BulletContainerView bulletContainerView, C16248b bVar) {
        C89219l.m154721d(bulletContainerView, "");
        C89219l.m154721d(bVar, "");
        this.f82936a = bulletContainerView;
        this.f82937b = bVar;
    }
}
