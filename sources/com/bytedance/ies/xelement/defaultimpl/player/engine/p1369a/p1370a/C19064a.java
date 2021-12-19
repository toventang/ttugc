package com.bytedance.ies.xelement.defaultimpl.player.engine.p1369a.p1370a;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.CopyOnWriteArrayList;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.a.a.a */
public final class C19064a<Element> {

    /* renamed from: a */
    public final CopyOnWriteArrayList<Element> f45159a = new CopyOnWriteArrayList<>();

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.a.a.a$a */
    public interface AbstractC19065a<Element> {
        static {
            Covode.recordClassIndex(21828);
        }

        /* renamed from: a */
        void mo30414a(Element element);
    }

    static {
        Covode.recordClassIndex(21827);
    }

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.a.a.a$b */
    public static final class C19066b implements AbstractC19065a<Element> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f45160a;

        static {
            Covode.recordClassIndex(21829);
        }

        C19066b(AbstractC89172b bVar) {
            this.f45160a = bVar;
        }

        @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.p1369a.p1370a.C19064a.AbstractC19065a
        /* renamed from: a */
        public final void mo30414a(Element element) {
            this.f45160a.invoke(element);
        }
    }

    /* renamed from: b */
    public final void mo30413b(Element element) {
        this.f45159a.remove(element);
    }

    /* renamed from: a */
    public final void mo30412a(Element element) {
        if (!this.f45159a.contains(element)) {
            this.f45159a.add(element);
        }
    }

    /* renamed from: a */
    public final void mo30411a(AbstractC89172b<? super Element, C89391z> bVar) {
        C89219l.m154719c(bVar, "");
        C19066b bVar2 = new C19066b(bVar);
        C89219l.m154719c(bVar2, "");
        for (Element element : this.f45159a) {
            try {
                bVar2.mo30414a(element);
            } catch (Exception unused) {
            }
        }
    }
}
