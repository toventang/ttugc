package com.bytedance.jedi.ext.adapter.p1465a.p1466a;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.ext.adapter.p1465a.AbstractC20595e;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.bytedance.jedi.ext.adapter.a.a.o */
public final class C20585o extends AbstractC20573f {

    /* renamed from: c */
    static final /* synthetic */ AbstractC89286i[] f48722c = {new C89232y(C89204ab.m154669a(C20585o.class), "defaultLoading", "getDefaultLoading()Lkotlin/jvm/functions/Function1;")};

    /* renamed from: d */
    public int f48723d = 16056320;

    /* renamed from: e */
    public AbstractC89172b<? super ViewGroup, ? extends AbstractC20595e> f48724e;

    /* renamed from: f */
    public AbstractC20595e f48725f;

    /* renamed from: g */
    public int f48726g = 241;

    /* renamed from: h */
    public int f48727h = 241;

    /* renamed from: i */
    public AbstractC89171a<C89391z> f48728i;

    /* renamed from: j */
    public final C20590q f48729j = new C20590q(this);

    /* renamed from: k */
    private final AbstractC89244h f48730k = C89250i.m154773a((AbstractC89171a) new C20586a(this));

    /* renamed from: l */
    private boolean f48731l;

    @Override // com.bytedance.jedi.ext.adapter.p1465a.p1466a.AbstractC20582m
    /* renamed from: e */
    public final int mo33862e() {
        return this.f48723d;
    }

    /* renamed from: com.bytedance.jedi.ext.adapter.a.a.o$a */
    static final class C20586a extends AbstractC89220m implements AbstractC89171a<AbstractC89172b<? super ViewGroup, ? extends C20562a>> {

        /* renamed from: a */
        final /* synthetic */ C20585o f48732a;

        static {
            Covode.recordClassIndex(24118);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20586a(C20585o oVar) {
            super(0);
            this.f48732a = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC89172b<? super ViewGroup, ? extends C20562a> invoke() {
            return new AbstractC89172b<ViewGroup, C20562a>(this) {
                /* class com.bytedance.jedi.ext.adapter.p1465a.p1466a.C20585o.C20586a.C205871 */

                /* renamed from: a */
                final /* synthetic */ C20586a f48733a;

                static {
                    Covode.recordClassIndex(24119);
                }

                {
                    this.f48733a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C20562a invoke(ViewGroup viewGroup) {
                    ViewGroup viewGroup2 = viewGroup;
                    C89219l.m154719c(viewGroup2, "");
                    return new C20562a(viewGroup2, new AbstractC89171a<C89391z>(this) {
                        /* class com.bytedance.jedi.ext.adapter.p1465a.p1466a.C20585o.C20586a.C205871.C205881 */

                        /* renamed from: a */
                        final /* synthetic */ C205871 f48734a;

                        static {
                            Covode.recordClassIndex(24120);
                        }

                        {
                            this.f48734a = r2;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        @Override // p4600h.p4611f.p4612a.AbstractC89171a
                        public final /* synthetic */ C89391z invoke() {
                            this.f48734a.f48733a.f48732a.mo33867c(244);
                            return C89391z.f203057a;
                        }
                    });
                }
            };
        }
    }

    /* renamed from: f */
    public final boolean mo33868f() {
        if (this.f48727h == 244) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.jedi.ext.adapter.p1465a.p1466a.AbstractC20582m
    /* renamed from: g */
    public final boolean mo33864g() {
        if (this.f48727h == 241 || this.f48728i == null) {
            return false;
        }
        return true;
    }

    static {
        Covode.recordClassIndex(24117);
    }

    @Override // com.bytedance.jedi.ext.adapter.p1465a.p1466a.AbstractC20582m
    /* renamed from: a */
    public final void mo33860a(int i) {
        this.f48723d = i;
    }

    /* renamed from: a */
    public static /* synthetic */ void m38805a(C20585o oVar) {
        oVar.m38806d(oVar.f48726g);
    }

    /* renamed from: d */
    private void m38806d(int i) {
        AbstractC20595e eVar = this.f48725f;
        if (eVar != null) {
            eVar.mo33843a(i);
        }
    }

    /* renamed from: a */
    public final void mo33865a(RecyclerView recyclerView) {
        C89219l.m154719c(recyclerView, "");
        this.f48729j.mo33869a(recyclerView);
    }

    /* renamed from: b */
    public final void mo33866b(int i) {
        boolean z;
        if (this.f48726g != i) {
            this.f48726g = i;
            if (i == 242) {
                z = true;
            } else {
                z = false;
            }
            this.f48731l = z;
            m38806d(i);
        }
    }

    /* renamed from: c */
    public final void mo33867c(int i) {
        if (this.f48726g == i && !this.f48731l) {
            this.f48731l = true;
            mo33866b(242);
            AbstractC89171a<C89391z> aVar = this.f48728i;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    @Override // com.bytedance.jedi.ext.adapter.p1465a.p1466a.AbstractC20582m
    /* renamed from: a */
    public final RecyclerView.ViewHolder mo33859a(ViewGroup viewGroup) {
        View view;
        C89219l.m154719c(viewGroup, "");
        AbstractC20595e eVar = this.f48725f;
        if (eVar == null || (view = eVar.mo33842a()) == null) {
            AbstractC89172b<? super ViewGroup, ? extends AbstractC20595e> bVar = this.f48724e;
            if (bVar == null) {
                bVar = (AbstractC89172b) this.f48730k.getValue();
            }
            AbstractC20595e eVar2 = (AbstractC20595e) bVar.invoke(viewGroup);
            this.f48725f = eVar2;
            view = eVar2.mo33842a();
        }
        C20589p pVar = new C20589p(view);
        m38805a(this);
        mo33853a(pVar);
        return pVar;
    }
}
