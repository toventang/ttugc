package com.bytedance.android.live.publicscreen.impl.model.chat.badge;

import android.os.Handler;
import com.bytedance.android.live.publicscreen.p386a.C5889g;
import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.publicscreen.impl.model.chat.badge.i */
public abstract class AbstractC6005i extends AbstractC5996b {

    /* renamed from: f */
    public final Handler f15068f;

    /* renamed from: g */
    public final AbstractC89172b<AbstractC6005i, C89391z> f15069g;

    static {
        Covode.recordClassIndex(6616);
    }

    /* renamed from: e */
    public abstract void mo11894e();

    /* renamed from: f */
    public abstract void mo11895f();

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.f.a.b<? super com.bytedance.android.live.publicscreen.impl.model.chat.badge.i, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractC6005i(C5889g gVar, Handler handler, AbstractC89172b<? super AbstractC6005i, C89391z> bVar) {
        super(gVar);
        C89219l.m154721d(gVar, "");
        C89219l.m154721d(handler, "");
        C89219l.m154721d(bVar, "");
        this.f15068f = handler;
        this.f15069g = bVar;
    }
}
