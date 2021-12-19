package com.bytedance.jedi.ext.adapter.p1465a.p1466a;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.ext.adapter.p1465a.AbstractC20593c;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.bytedance.jedi.ext.adapter.a.a.g */
public final class C20574g extends AbstractC20573f {

    /* renamed from: c */
    static final /* synthetic */ AbstractC89286i[] f48709c = {new C89232y(C89204ab.m154669a(C20574g.class), "defaultEmpty", "getDefaultEmpty()Lkotlin/jvm/functions/Function1;")};

    /* renamed from: d */
    public int f48710d = 15990784;

    /* renamed from: e */
    public AbstractC89172b<? super ViewGroup, ? extends AbstractC20593c> f48711e;

    /* renamed from: f */
    public AbstractC20593c f48712f;

    /* renamed from: g */
    public int f48713g;

    /* renamed from: h */
    public int f48714h = 241;

    /* renamed from: i */
    public final AbstractC20573f f48715i;

    /* renamed from: j */
    public final AbstractC20573f f48716j;

    /* renamed from: k */
    private final AbstractC89244h f48717k = C89250i.m154773a((AbstractC89171a) C20575a.f48718a);

    /* renamed from: com.bytedance.jedi.ext.adapter.a.a.g$a */
    static final class C20575a extends AbstractC89220m implements AbstractC89171a<AbstractC89172b<? super ViewGroup, ? extends C20568c>> {

        /* renamed from: a */
        public static final C20575a f48718a = new C20575a();

        static {
            Covode.recordClassIndex(24107);
        }

        C20575a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ AbstractC89172b<? super ViewGroup, ? extends C20568c> invoke() {
            return C205761.f48719a;
        }
    }

    @Override // com.bytedance.jedi.ext.adapter.p1465a.p1466a.AbstractC20582m
    /* renamed from: e */
    public final int mo33862e() {
        return this.f48710d;
    }

    @Override // com.bytedance.jedi.ext.adapter.p1465a.p1466a.AbstractC20582m
    /* renamed from: g */
    public final boolean mo33864g() {
        if (this.f48713g != 0) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(24106);
    }

    @Override // com.bytedance.jedi.ext.adapter.p1465a.p1466a.AbstractC20573f
    /* renamed from: c */
    public final int mo33857c() {
        int i;
        if (this.f48714h != 241 && (this.f48713g & 1) == 1) {
            i = 1;
        } else {
            i = 0;
        }
        if (this.f48715i.mo33864g() && (this.f48713g & 2) == 2) {
            i += this.f48715i.mo33857c();
        }
        if (!this.f48716j.mo33864g() || (this.f48713g & 4) != 4) {
            return i;
        }
        return i + this.f48716j.mo33857c();
    }

    /* renamed from: f */
    public final int mo33863f() {
        int i;
        if (!this.f48716j.mo33864g() || (this.f48713g & 4) != 4) {
            return -1;
        }
        if (this.f48714h != 241 && (this.f48713g & 1) == 1) {
            i = 1;
        } else {
            i = 0;
        }
        if (!this.f48715i.mo33864g() || (this.f48713g & 2) != 2) {
            return i;
        }
        return i + this.f48715i.mo33857c();
    }

    @Override // com.bytedance.jedi.ext.adapter.p1465a.p1466a.AbstractC20582m
    /* renamed from: a */
    public final void mo33860a(int i) {
        this.f48710d = i;
    }

    /* renamed from: c */
    private final void m38779c(int i) {
        AbstractC20593c cVar = this.f48712f;
        if (cVar != null) {
            cVar.mo33847a(i);
        }
    }

    /* renamed from: b */
    public final void mo33861b(int i) {
        if (this.f48714h != i) {
            this.f48714h = i;
            m38779c(i);
        }
    }

    @Override // com.bytedance.jedi.ext.adapter.p1465a.p1466a.AbstractC20582m
    /* renamed from: a */
    public final RecyclerView.ViewHolder mo33859a(ViewGroup viewGroup) {
        View view;
        C89219l.m154719c(viewGroup, "");
        AbstractC20593c cVar = this.f48712f;
        if (cVar == null || (view = cVar.mo33846a()) == null) {
            AbstractC89172b<? super ViewGroup, ? extends AbstractC20593c> bVar = this.f48711e;
            if (bVar == null) {
                bVar = (AbstractC89172b) this.f48717k.getValue();
            }
            AbstractC20593c cVar2 = (AbstractC20593c) bVar.invoke(viewGroup);
            this.f48712f = cVar2;
            view = cVar2.mo33846a();
        }
        C20577h hVar = new C20577h(view);
        m38779c(this.f48714h);
        mo33853a(hVar);
        return hVar;
    }

    public C20574g(AbstractC20573f fVar, AbstractC20573f fVar2) {
        C89219l.m154719c(fVar, "");
        C89219l.m154719c(fVar2, "");
        this.f48715i = fVar;
        this.f48716j = fVar2;
    }
}
