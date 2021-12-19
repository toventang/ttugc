package com.bytedance.android.live.publicscreen.impl.model.chat.badge;

import com.bytedance.android.live.publicscreen.p386a.C5889g;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.publicscreen.impl.model.chat.badge.b */
public abstract class AbstractC5996b {

    /* renamed from: a */
    public AbstractC5995a f15056a;

    /* renamed from: b */
    public final C5889g f15057b;

    static {
        Covode.recordClassIndex(6607);
    }

    /* renamed from: a */
    public abstract int mo11890a();

    /* renamed from: c */
    public abstract AbstractC5995a mo11892c();

    /* renamed from: b */
    public final AbstractC5995a mo11891b() {
        if (this.f15056a == null) {
            this.f15056a = mo11892c();
        }
        AbstractC5995a aVar = this.f15056a;
        if (aVar == null) {
            C89219l.m154710a("badge");
        }
        return aVar;
    }

    public AbstractC5996b(C5889g gVar) {
        C89219l.m154721d(gVar, "");
        this.f15057b = gVar;
    }
}
