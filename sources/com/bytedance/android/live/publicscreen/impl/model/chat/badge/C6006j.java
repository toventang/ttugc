package com.bytedance.android.live.publicscreen.impl.model.chat.badge;

import android.os.Handler;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.publicscreen.p386a.C5889g;
import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.publicscreen.impl.model.chat.badge.j */
public final class C6006j extends C6004h {

    /* renamed from: h */
    private final Runnable f15070h;

    static {
        Covode.recordClassIndex(6617);
    }

    @Override // com.bytedance.android.live.publicscreen.impl.model.chat.badge.AbstractC5996b, com.bytedance.android.live.publicscreen.impl.model.chat.badge.C6004h
    /* renamed from: c */
    public final AbstractC5995a mo11892c() {
        C5997c cVar = new C5997c(this.f15057b.f14747d, mo11893d());
        cVar.f15054c = this.f15070h;
        return cVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6006j(int i, C5889g gVar, Handler handler, ImageModel imageModel, AbstractC89172b<? super AbstractC6005i, C89391z> bVar, Runnable runnable) {
        super(i, gVar, handler, imageModel, bVar);
        C89219l.m154721d(gVar, "");
        C89219l.m154721d(handler, "");
        C89219l.m154721d(imageModel, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(runnable, "");
        this.f15070h = runnable;
    }
}
