package com.bytedance.tux.dialog.p1713b;

import com.bytedance.covode.number.Covode;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.dialog.internal.C23068d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.tux.dialog.b.f */
public final class C23033f {

    /* renamed from: a */
    public final List<TuxButton> f54528a = new ArrayList();

    /* renamed from: b */
    public AbstractC89172b<? super TuxButton, C89391z> f54529b;

    /* renamed from: c */
    public boolean f54530c = true;

    /* renamed from: d */
    public CharSequence f54531d;

    /* renamed from: e */
    public final int f54532e;

    /* renamed from: f */
    public final AbstractC89172b<C23024a, C89391z> f54533f;

    static {
        Covode.recordClassIndex(26953);
    }

    /* renamed from: a */
    public final void mo37428a(AbstractC89172b<? super TuxButton, C89391z> bVar) {
        C89219l.m154719c(bVar, "");
        this.f54529b = bVar;
        Iterator<T> it = this.f54528a.iterator();
        while (it.hasNext()) {
            bVar.invoke(it.next());
        }
    }

    /* renamed from: a */
    public final void mo37429a(CharSequence charSequence) {
        C89219l.m154719c(charSequence, "");
        Iterator<T> it = this.f54528a.iterator();
        while (it.hasNext()) {
            it.next().setText(charSequence);
        }
        this.f54531d = charSequence;
    }

    /* renamed from: a */
    public final void mo37430a(boolean z) {
        Iterator<T> it = this.f54528a.iterator();
        while (it.hasNext()) {
            it.next().setEnabled(z);
        }
        this.f54530c = z;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: h.f.a.b<? super com.bytedance.tux.dialog.b.a, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public C23033f(C23068d dVar, int i, CharSequence charSequence, AbstractC89172b<? super C23024a, C89391z> bVar) {
        C89219l.m154719c(dVar, "");
        C89219l.m154719c(charSequence, "");
        this.f54532e = i;
        this.f54533f = bVar;
        this.f54531d = charSequence;
    }
}
