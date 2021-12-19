package com.bytedance.tux.dialog.internal;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.dialog.C23013a;
import com.bytedance.tux.dialog.internal.C23068d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.tux.dialog.internal.c */
public abstract class AbstractC23067c {

    /* renamed from: d */
    public final C23068d f54595d;

    /* renamed from: e */
    protected C23013a f54596e;

    /* renamed from: f */
    public final Context f54597f;

    static {
        Covode.recordClassIndex(26991);
    }

    /* renamed from: a */
    public abstract View mo37400a();

    /* renamed from: c */
    public final C23013a mo37488c() {
        C23013a aVar = this.f54596e;
        if (aVar == null) {
            C89219l.m154710a("dialog");
        }
        return aVar;
    }

    /* renamed from: a */
    public void mo37401a(C23013a aVar) {
        C89219l.m154719c(aVar, "");
        this.f54596e = aVar;
    }

    /* renamed from: b */
    public final void mo37487b(C23013a aVar) {
        C89219l.m154719c(aVar, "");
        this.f54596e = aVar;
    }

    public AbstractC23067c(Context context) {
        C89219l.m154719c(context, "");
        this.f54597f = context;
        this.f54595d = C23068d.C23069a.m43492a(context);
    }
}
