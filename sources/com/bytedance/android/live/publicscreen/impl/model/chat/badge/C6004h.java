package com.bytedance.android.live.publicscreen.impl.model.chat.badge;

import android.os.Handler;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.publicscreen.p386a.C5889g;
import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.publicscreen.impl.model.chat.badge.h */
public class C6004h extends AbstractC6000f {

    /* renamed from: h */
    private final int f15067h;

    static {
        Covode.recordClassIndex(6615);
    }

    @Override // com.bytedance.android.live.publicscreen.impl.model.chat.badge.AbstractC5996b
    /* renamed from: a */
    public final int mo11890a() {
        return this.f15067h;
    }

    @Override // com.bytedance.android.live.publicscreen.impl.model.chat.badge.AbstractC5996b
    /* renamed from: c */
    public AbstractC5995a mo11892c() {
        return new C5997c(this.f15057b.f14747d, mo11893d());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6004h(int i, C5889g gVar, Handler handler, ImageModel imageModel, AbstractC89172b<? super AbstractC6005i, C89391z> bVar) {
        super(gVar, handler, imageModel, bVar);
        C89219l.m154721d(gVar, "");
        C89219l.m154721d(handler, "");
        C89219l.m154721d(imageModel, "");
        C89219l.m154721d(bVar, "");
        this.f15067h = i;
    }
}
