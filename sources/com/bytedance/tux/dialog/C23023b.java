package com.bytedance.tux.dialog;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.dialog.internal.AbstractC23064b;
import com.bytedance.tux.dialog.p1712a.AbstractC23022e;
import com.bytedance.tux.dialog.p1713b.AbstractC23034g;
import com.bytedance.tux.dialog.p1714c.AbstractC23036a;
import com.bytedance.tux.dialog.p1715d.AbstractC23047c;
import com.bytedance.tux.dialog.p1715d.C23046b;
import com.bytedance.tux.dialog.p1716e.AbstractC23057h;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.tux.dialog.b */
public final class C23023b extends AbstractC23064b<C23023b, C23013a> {

    /* renamed from: a */
    public boolean f54502a;

    /* renamed from: b */
    public AbstractC23057h f54503b;

    /* renamed from: c */
    public AbstractC23047c f54504c;

    /* renamed from: d */
    public AbstractC23022e f54505d;

    /* renamed from: e */
    public AbstractC23034g f54506e;

    /* renamed from: f */
    public AbstractC23036a f54507f;

    static {
        Covode.recordClassIndex(26943);
    }

    /* renamed from: a */
    public final C23013a mo37405a() {
        return new C23013a(this);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23023b(Context context) {
        super(context);
        C89219l.m154719c(context, "");
    }

    /* renamed from: a */
    public final C23023b mo37406a(AbstractC23022e eVar) {
        C89219l.m154719c(eVar, "");
        this.f54505d = eVar;
        return this;
    }

    /* renamed from: a */
    public final C23023b mo37407a(AbstractC23034g gVar) {
        C89219l.m154719c(gVar, "");
        this.f54506e = gVar;
        return this;
    }

    /* renamed from: c */
    public final C23023b mo37413d(CharSequence charSequence) {
        AbstractC23047c cVar = this.f54504c;
        if (cVar == null) {
            cVar = new C23046b(this.f54592n);
            this.f54504c = cVar;
        }
        cVar.mo37441b(charSequence);
        return this;
    }

    /* renamed from: a */
    public final C23023b mo37408a(AbstractC23047c cVar) {
        C89219l.m154719c(cVar, "");
        this.f54504c = cVar;
        return this;
    }

    /* renamed from: a */
    public final C23023b mo37409a(AbstractC23057h hVar) {
        C89219l.m154719c(hVar, "");
        this.f54503b = hVar;
        return this;
    }

    /* renamed from: a */
    public final C23023b mo37411b(CharSequence charSequence) {
        AbstractC23047c cVar = this.f54504c;
        if (cVar == null) {
            cVar = new C23046b(this.f54592n);
            this.f54504c = cVar;
        }
        cVar.mo37440a(charSequence);
        return this;
    }
}
