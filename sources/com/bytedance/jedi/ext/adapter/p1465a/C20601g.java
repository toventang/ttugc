package com.bytedance.jedi.ext.adapter.p1465a;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20467g;
import com.bytedance.jedi.arch.AbstractC20468h;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.ext.list.AbstractC20443c;
import com.bytedance.jedi.arch.ext.list.C20442b;
import com.bytedance.jedi.arch.ext.list.C20465o;
import com.bytedance.jedi.arch.ext.list.IListState;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.bytedance.jedi.arch.ext.list.ListViewModel;
import com.bytedance.jedi.ext.adapter.AbstractC20553a;
import com.bytedance.jedi.ext.adapter.p1465a.AbstractC20554a;
import com.bytedance.jedi.ext.adapter.p1465a.C20594d;
import com.bytedance.jedi.ext.adapter.p1465a.C20596f;
import com.bytedance.jedi.ext.adapter.p1465a.p1466a.AbstractC20582m;
import com.bytedance.jedi.ext.adapter.p1465a.p1466a.C20574g;
import com.bytedance.jedi.ext.adapter.p1465a.p1466a.C20580k;
import com.bytedance.jedi.ext.adapter.p1465a.p1466a.C20585o;
import java.util.Arrays;
import java.util.List;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.C89391z;
import p4600h.p4601a.C89064i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.jedi.ext.adapter.a.g */
public final class C20601g<T, DEC extends C20594d<T>, RECEIVER extends AbstractC20467g> extends AbstractC20554a<T, DEC, RECEIVER, C20601g<T, DEC, RECEIVER>> {

    /* renamed from: q */
    public ListViewModel<T, ?, ?> f48761q;

    /* renamed from: r */
    AbstractC89171a<C89391z> f48762r = new C20618m(this);

    static {
        Covode.recordClassIndex(24133);
    }

    /* renamed from: com.bytedance.jedi.ext.adapter.a.g$c */
    static final class C20606c extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ ListViewModel f48768a;

        static {
            Covode.recordClassIndex(24138);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20606c(ListViewModel listViewModel) {
            super(0);
            this.f48768a = listViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f48768a.mo33758l();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.jedi.ext.adapter.a.g$g */
    static final class C20610g extends AbstractC89220m implements AbstractC89183m<RECEIVER, List<? extends T>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C20601g f48772a;

        static {
            Covode.recordClassIndex(24142);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20610g(C20601g gVar) {
            super(2);
            this.f48772a = gVar;
        }

        /* renamed from: com.bytedance.jedi.ext.adapter.a.g$g$a */
        static final class C20611a extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ AbstractC89172b f48773a;

            /* renamed from: b */
            final /* synthetic */ AbstractC20467g f48774b;

            static {
                Covode.recordClassIndex(24143);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C20611a(AbstractC89172b bVar, AbstractC20467g gVar) {
                super(0);
                this.f48773a = bVar;
                this.f48774b = gVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* bridge */ /* synthetic */ C89391z invoke() {
                this.f48773a.invoke(this.f48774b);
                return C89391z.f203057a;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(Object obj, Object obj2) {
            C20611a aVar;
            AbstractC20467g gVar = (AbstractC20467g) obj;
            List<? extends T> list = (List) obj2;
            C89219l.m154719c(gVar, "");
            C89219l.m154719c(list, "");
            AbstractC20553a<T, ?, ?> aVar2 = this.f48772a.f48666n;
            AbstractC89172b<? super RECEIVER, C89391z> bVar = this.f48772a.f48665m;
            if (bVar != null) {
                aVar = new C20611a(bVar, gVar);
            } else {
                aVar = null;
            }
            aVar2.mo33763a(list, aVar);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.jedi.ext.adapter.a.g$m */
    static final class C20618m extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C20601g f48782a;

        static {
            Covode.recordClassIndex(24150);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20618m(C20601g gVar) {
            super(0);
            this.f48782a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            ListViewModel<T, ?, ?> listViewModel = this.f48782a.f48761q;
            if (listViewModel != null) {
                listViewModel.mo33757k();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.jedi.ext.adapter.a.g$a */
    static final class C20602a extends AbstractC89220m implements AbstractC89172b<ViewGroup, AbstractC20595e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89183m f48763a;

        /* renamed from: b */
        final /* synthetic */ C20601g f48764b;

        static {
            Covode.recordClassIndex(24134);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20602a(AbstractC89183m mVar, C20601g gVar) {
            super(1);
            this.f48763a = mVar;
            this.f48764b = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AbstractC20595e invoke(ViewGroup viewGroup) {
            C89219l.m154719c(viewGroup, "");
            return this.f48763a.invoke(viewGroup, new AbstractC89171a<C89391z>(this) {
                /* class com.bytedance.jedi.ext.adapter.p1465a.C20601g.C20602a.C206031 */

                /* renamed from: a */
                final /* synthetic */ C20602a f48765a;

                static {
                    Covode.recordClassIndex(24135);
                }

                {
                    this.f48765a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ C89391z invoke() {
                    this.f48765a.f48764b.f48667o.f48749d.mo33867c(244);
                    return C89391z.f203057a;
                }
            });
        }
    }

    /* renamed from: com.bytedance.jedi.ext.adapter.a.g$b */
    static final class C20604b extends AbstractC89220m implements AbstractC89172b<ViewGroup, AbstractC20593c> {

        /* renamed from: a */
        final /* synthetic */ C20601g f48766a;

        static {
            Covode.recordClassIndex(24136);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20604b(C20601g gVar) {
            super(1);
            this.f48766a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AbstractC20593c invoke(ViewGroup viewGroup) {
            C89219l.m154719c(viewGroup, "");
            return this.f48766a.f48660h.invoke(viewGroup, new AbstractC89171a<C89391z>(this) {
                /* class com.bytedance.jedi.ext.adapter.p1465a.C20601g.C20604b.C206051 */

                /* renamed from: a */
                final /* synthetic */ C20604b f48767a;

                static {
                    Covode.recordClassIndex(24137);
                }

                {
                    this.f48767a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* bridge */ /* synthetic */ C89391z invoke() {
                    this.f48767a.f48766a.f48762r.invoke();
                    return C89391z.f203057a;
                }
            });
        }
    }

    /* renamed from: com.bytedance.jedi.ext.adapter.a.g$d */
    static final class C20607d extends AbstractC89220m implements AbstractC89172b<RECEIVER, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C20601g f48769a;

        static {
            Covode.recordClassIndex(24139);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20607d(C20601g gVar) {
            super(1);
            this.f48769a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Object obj) {
            AbstractC89172b<RECEIVER, C89391z> a;
            C89219l.m154719c(obj, "");
            AbstractC20443c<T, RECEIVER> cVar = this.f48769a.f48662j;
            if (!(cVar == null || (a = cVar.mo33773a()) == null)) {
                a.invoke(obj);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.jedi.ext.adapter.a.g$j */
    static final class C20614j extends AbstractC89220m implements AbstractC89172b<RECEIVER, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C20601g f48777a;

        static {
            Covode.recordClassIndex(24146);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20614j(C20601g gVar) {
            super(1);
            this.f48777a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Object obj) {
            AbstractC89172b<RECEIVER, C89391z> a;
            C89219l.m154719c(obj, "");
            AbstractC20443c<T, RECEIVER> cVar = this.f48777a.f48661i;
            if (!(cVar == null || (a = cVar.mo33773a()) == null)) {
                a.invoke(obj);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final DEC mo33882a(RecyclerView recyclerView) {
        AbstractC89172b<? super ViewGroup, ? extends RecyclerView.ViewHolder> bVar;
        AbstractC89172b<? super ViewGroup, ? extends RecyclerView.ViewHolder> bVar2;
        AbstractC89172b<? super ViewGroup, ? extends RecyclerView.ViewHolder> bVar3;
        AbstractC89172b<? super ViewGroup, ? extends RecyclerView.ViewHolder> bVar4;
        View view;
        View view2;
        View view3;
        View view4;
        C20596f.C20599c cVar;
        C89219l.m154719c(recyclerView, "");
        ListViewModel<T, ?, ?> listViewModel = this.f48761q;
        if (listViewModel != null) {
            AbstractC20468h<RECEIVER> hVar = this.f48668p;
            AbstractC88412b unused = hVar.selectSubscribe(listViewModel, C20619h.f48783a, new C20370ah(), new C20612h(this));
            AbstractC88412b unused2 = hVar.selectSubscribe(listViewModel, C20621j.f48785a, new C20370ah(), new C20613i(this));
            AbstractC20468h.C20469a.m38667a(hVar, listViewModel, C20622k.f48786a, (C20370ah) null, new C20615k(this, listViewModel), new C20614j(this), new C20617l(this), 2);
            AbstractC20468h.C20469a.m38667a(hVar, listViewModel, C20623l.f48787a, (C20370ah) null, new C20608e(this), new C20607d(this), new C20609f(this), 2);
            AbstractC88412b unused3 = hVar.selectSubscribe(listViewModel, C20620i.f48784a, new C20370ah(), new C20610g(this));
            DEC dec = this.f48667o;
            C20596f.C20598b bVar5 = null;
            if (!(this.f48653a == null || (view4 = dec.f48747b.f48705a) == (view3 = this.f48653a))) {
                dec.f48747b.f48705a = view3;
                C20580k kVar = dec.f48747b;
                if (view3 != null) {
                    cVar = new C20596f.C20599c(view3);
                } else {
                    cVar = null;
                }
                kVar.f48706b = cVar;
                if (dec.f48751f.f48743a != null) {
                    if (view3 == null) {
                        dec.notifyItemRemoved(0);
                    } else {
                        dec.mo33877a(dec.f48747b, view4, view3, 0);
                    }
                }
            }
            if (!(this.f48655c == null || (view2 = dec.f48748c.f48705a) == (view = this.f48655c))) {
                dec.f48748c.f48705a = view;
                C20580k kVar2 = dec.f48747b;
                if (view != null) {
                    bVar5 = new C20596f.C20598b(view);
                }
                kVar2.f48706b = bVar5;
                if (dec.f48751f.f48743a != null) {
                    if (view == null) {
                        if (dec.f48746a.getItemCount() == 0) {
                            int f = dec.f48750e.mo33863f();
                            if (f != -1) {
                                dec.notifyItemRemoved(f);
                            }
                        } else {
                            dec.notifyItemRemoved(dec.f48747b.mo33857c() + dec.f48746a.getItemCount());
                        }
                    } else if (dec.f48746a.getItemCount() == 0) {
                        int f2 = dec.f48750e.mo33863f();
                        if (f2 != -1) {
                            dec.mo33877a(dec.f48748c, view2, view, f2);
                        }
                    } else {
                        dec.mo33877a(dec.f48748c, view2, view, dec.f48747b.mo33857c() + dec.f48746a.getItemCount());
                    }
                }
            }
            if (!(this.f48654b == null || (bVar4 = dec.f48747b.f48706b) == (bVar3 = this.f48654b))) {
                dec.f48747b.f48706b = bVar3;
                if (dec.f48751f.f48743a != null) {
                    if (bVar3 == null) {
                        dec.notifyItemRemoved(0);
                    } else {
                        dec.mo33878a(dec.f48747b, bVar4, bVar3, 0);
                    }
                }
            }
            if (!(this.f48656d == null || (bVar2 = dec.f48748c.f48706b) == (bVar = this.f48656d))) {
                dec.f48748c.f48706b = bVar;
                if (dec.f48751f.f48743a != null) {
                    if (bVar == null) {
                        if (dec.f48746a.getItemCount() == 0) {
                            int f3 = dec.f48750e.mo33863f();
                            if (f3 != -1) {
                                dec.notifyItemRemoved(f3);
                            }
                        } else {
                            dec.notifyItemRemoved(dec.f48747b.mo33857c() + dec.f48746a.getItemCount());
                        }
                    } else if (dec.f48746a.getItemCount() == 0) {
                        int f4 = dec.f48750e.mo33863f();
                        if (f4 != -1) {
                            dec.mo33878a(dec.f48748c, bVar2, bVar, f4);
                        }
                    } else {
                        dec.mo33878a(dec.f48748c, bVar2, bVar, dec.f48747b.mo33857c() + dec.f48746a.getItemCount());
                    }
                }
            }
            dec.mo33880b(this.f48657e);
            int[] iArr = this.f48659g;
            dec.mo33879a(Arrays.copyOf(iArr, iArr.length));
            if (this.f48657e != 241) {
                ListViewModel<T, ?, ?> listViewModel2 = this.f48761q;
                if (listViewModel2 != null) {
                    dec.f48749d.f48728i = new C20606c(listViewModel2);
                    if (dec.f48749d.f48727h == 241) {
                        dec.mo33880b(242);
                    }
                }
                AbstractC89183m mVar = this.f48658f;
                if (mVar == null) {
                    if (this.f48657e == 242) {
                        mVar = AbstractC20554a.C20555a.f48669a;
                    } else {
                        mVar = AbstractC20554a.C20556b.f48670a;
                    }
                }
                C20602a aVar = new C20602a(mVar, this);
                C89219l.m154719c(aVar, "");
                AbstractC89172b<? super ViewGroup, ? extends AbstractC20595e> bVar6 = dec.f48749d.f48724e;
                if (bVar6 == null || bVar6 != aVar) {
                    dec.f48749d.f48724e = aVar;
                    if (dec.f48751f.f48743a != null && dec.f48749d.mo33864g()) {
                        AbstractC20582m.C20583a.m38804a(dec.f48749d);
                        dec.notifyItemRemoved(dec.f48746a.getItemCount() + dec.f48747b.mo33857c() + dec.f48748c.mo33857c());
                        dec.notifyItemInserted(dec.f48746a.getItemCount() + dec.f48747b.mo33857c() + dec.f48748c.mo33857c());
                        C20585o.m38805a(dec.f48749d);
                    }
                }
            }
            if (C89064i.m154487a(this.f48659g, 1)) {
                C20604b bVar7 = new C20604b(this);
                C89219l.m154719c(bVar7, "");
                AbstractC89172b<? super ViewGroup, ? extends AbstractC20593c> bVar8 = dec.f48750e.f48711e;
                if (bVar8 == null || bVar8 != bVar7) {
                    dec.f48750e.f48711e = bVar7;
                    dec.mo33876a();
                }
            }
            recyclerView.setAdapter(dec);
            return this.f48667o;
        }
        throw new IllegalArgumentException("realAdapter does not provide viewModel, please specify one".toString());
    }

    /* renamed from: com.bytedance.jedi.ext.adapter.a.g$l */
    static final class C20617l extends AbstractC89220m implements AbstractC89183m<RECEIVER, List<? extends T>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C20601g f48781a;

        static {
            Covode.recordClassIndex(24149);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20617l(C20601g gVar) {
            super(2);
            this.f48781a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(Object obj, Object obj2) {
            AbstractC89183m<RECEIVER, List<? extends T>, C89391z> c;
            C89219l.m154719c(obj, "");
            C89219l.m154719c(obj2, "");
            AbstractC20443c<T, RECEIVER> cVar = this.f48781a.f48661i;
            if (!(cVar == null || (c = cVar.mo33775c()) == null)) {
                c.invoke(obj, obj2);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.jedi.ext.adapter.a.g$e */
    static final class C20608e extends AbstractC89220m implements AbstractC89183m<RECEIVER, Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C20601g f48770a;

        static {
            Covode.recordClassIndex(24140);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20608e(C20601g gVar) {
            super(2);
            this.f48770a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(Object obj, Throwable th) {
            AbstractC89183m<RECEIVER, Throwable, C89391z> b;
            C89219l.m154719c(obj, "");
            C89219l.m154719c(th, "");
            C20585o oVar = this.f48770a.f48667o.f48749d;
            if (oVar.mo33864g()) {
                oVar.mo33866b(244);
                if (oVar.mo33868f()) {
                    oVar.f48729j.f48736b = true;
                }
            }
            AbstractC20443c<T, RECEIVER> cVar = this.f48770a.f48662j;
            if (!(cVar == null || (b = cVar.mo33774b()) == null)) {
                b.invoke(obj, th);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.jedi.ext.adapter.a.g$f */
    static final class C20609f extends AbstractC89220m implements AbstractC89183m<RECEIVER, List<? extends T>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C20601g f48771a;

        static {
            Covode.recordClassIndex(24141);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20609f(C20601g gVar) {
            super(2);
            this.f48771a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(Object obj, Object obj2) {
            AbstractC89183m<RECEIVER, List<? extends T>, C89391z> c;
            C89219l.m154719c(obj, "");
            C89219l.m154719c(obj2, "");
            DEC dec = this.f48771a.f48667o;
            if (dec.f48749d.f48726g != 243) {
                dec.mo33881c(241);
            }
            AbstractC20443c<T, RECEIVER> cVar = this.f48771a.f48662j;
            if (!(cVar == null || (c = cVar.mo33775c()) == null)) {
                c.invoke(obj, obj2);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.jedi.ext.adapter.a.g$h */
    static final class C20612h extends AbstractC89220m implements AbstractC89183m<RECEIVER, C20442b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C20601g f48775a;

        static {
            Covode.recordClassIndex(24144);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20612h(C20601g gVar) {
            super(2);
            this.f48775a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(Object obj, C20442b bVar) {
            int i;
            C20442b bVar2 = bVar;
            C89219l.m154719c(obj, "");
            C89219l.m154719c(bVar2, "");
            DEC dec = this.f48775a.f48667o;
            if (!bVar2.f48382a) {
                i = 243;
            } else {
                i = 241;
            }
            dec.mo33881c(i);
            AbstractC89183m<? super RECEIVER, ? super Boolean, C89391z> mVar = this.f48775a.f48663k;
            if (mVar != null) {
                mVar.invoke(obj, Boolean.valueOf(bVar2.f48382a));
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.jedi.ext.adapter.a.g$k */
    static final class C20615k extends AbstractC89220m implements AbstractC89183m<RECEIVER, Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C20601g f48778a;

        /* renamed from: b */
        final /* synthetic */ ListViewModel f48779b;

        static {
            Covode.recordClassIndex(24147);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20615k(C20601g gVar, ListViewModel listViewModel) {
            super(2);
            this.f48778a = gVar;
            this.f48779b = listViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(Object obj, Throwable th) {
            AbstractC89183m<RECEIVER, Throwable, C89391z> b;
            C89219l.m154719c(obj, "");
            C89219l.m154719c(th, "");
            this.f48778a.f48668p.withState(this.f48779b, new AbstractC89172b<IListState<T, ? extends C20465o>, C89391z>(this) {
                /* class com.bytedance.jedi.ext.adapter.p1465a.C20601g.C20615k.C206161 */

                /* renamed from: a */
                final /* synthetic */ C20615k f48780a;

                static {
                    Covode.recordClassIndex(24148);
                }

                {
                    this.f48780a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(Object obj) {
                    boolean z;
                    IListState iListState = (IListState) obj;
                    C89219l.m154719c(iListState, "");
                    if (((ListState) iListState.getSubstate()).getList().isEmpty()) {
                        DEC dec = this.f48780a.f48778a.f48667o;
                        if (dec.f48750e.mo33864g()) {
                            if (dec.f48750e.f48714h == 241) {
                                z = true;
                            } else {
                                z = false;
                            }
                            dec.f48750e.mo33861b(243);
                            if (dec.f48751f.f48743a != null && z) {
                                dec.notifyDataSetChanged();
                            }
                        }
                    }
                    return C89391z.f203057a;
                }
            });
            AbstractC20443c<T, RECEIVER> cVar = this.f48778a.f48661i;
            if (!(cVar == null || (b = cVar.mo33774b()) == null)) {
                b.invoke(obj, th);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.jedi.ext.adapter.a.g$i */
    static final class C20613i extends AbstractC89220m implements AbstractC89183m<RECEIVER, C20442b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C20601g f48776a;

        static {
            Covode.recordClassIndex(24145);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20613i(C20601g gVar) {
            super(2);
            this.f48776a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(Object obj, C20442b bVar) {
            boolean z;
            C20442b bVar2 = bVar;
            C89219l.m154719c(obj, "");
            C89219l.m154719c(bVar2, "");
            DEC dec = this.f48776a.f48667o;
            boolean z2 = bVar2.f48382a;
            if (dec.f48750e.mo33864g()) {
                int i = 241;
                if (dec.f48750e.f48714h == 241) {
                    z = true;
                } else {
                    z = false;
                }
                boolean z3 = !z2;
                C20574g gVar = dec.f48750e;
                if (z2) {
                    i = 242;
                }
                gVar.mo33861b(i);
                if (!(dec.f48751f.f48743a == null || z == z3)) {
                    dec.notifyDataSetChanged();
                }
            }
            AbstractC89183m<? super RECEIVER, ? super Boolean, C89391z> mVar = this.f48776a.f48664l;
            if (mVar != null) {
                mVar.invoke(obj, Boolean.valueOf(bVar2.f48382a));
            }
            return C89391z.f203057a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20601g(AbstractC20553a<T, ?, ?> aVar, DEC dec, AbstractC20468h<? extends RECEIVER> hVar) {
        super(aVar, dec, hVar);
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(dec, "");
        C89219l.m154719c(hVar, "");
    }
}
