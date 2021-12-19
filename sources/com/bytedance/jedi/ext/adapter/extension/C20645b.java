package com.bytedance.jedi.ext.adapter.extension;

import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1204m;
import androidx.recyclerview.widget.C1445j;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20467g;
import com.bytedance.jedi.arch.AbstractC20468h;
import com.bytedance.jedi.arch.ext.list.p1464a.C20435c;
import com.bytedance.jedi.arch.ext.list.p1464a.C20438e;
import com.bytedance.jedi.ext.adapter.AbstractC20651f;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.jedi.ext.adapter.p1465a.p1466a.C20572e;
import com.bytedance.jedi.ext.adapter.p1467b.AbstractC20638g;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.jedi.ext.adapter.extension.b */
public final class C20645b<T, RECEIVER extends AbstractC20467g> extends AbstractC20644a<T, C20645b<T, RECEIVER>, JediViewHolder<? extends AbstractC20467g, T>> {

    /* renamed from: f */
    public static final C20646a f48820f = new C20646a((byte) 0);

    /* renamed from: e */
    public final AbstractC1204m f48821e;

    static {
        Covode.recordClassIndex(24179);
    }

    /* renamed from: com.bytedance.jedi.ext.adapter.extension.b$a */
    public static final class C20646a {
        static {
            Covode.recordClassIndex(24180);
        }

        private C20646a() {
        }

        public /* synthetic */ C20646a(byte b) {
            this();
        }

        /* renamed from: a */
        public static <T, RECEIVER extends AbstractC20467g> C20645b<T, RECEIVER> m38886a(AbstractC20468h<? extends RECEIVER> hVar, C1445j.AbstractC1451e<T> eVar) {
            C89219l.m154719c(hVar, "");
            C89219l.m154719c(eVar, "");
            return new C20645b<>((AbstractC1204m) hVar, C89219l.m154719c(eVar, ""), (byte) 0);
        }
    }

    /* renamed from: com.bytedance.jedi.ext.adapter.extension.b$c */
    static final class C20649c extends AbstractC89220m implements AbstractC89172b<ViewGroup, JediAdapterBuilder$viewHolder$factory$1$1> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89187q f48827a;

        /* renamed from: b */
        final /* synthetic */ int f48828b;

        static {
            Covode.recordClassIndex(24183);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ JediAdapterBuilder$viewHolder$factory$1$1 invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154719c(viewGroup2, "");
            return new JediAdapterBuilder$viewHolder$factory$1$1(this, viewGroup2, C20572e.m38772a(viewGroup2, this.f48828b));
        }
    }

    /* renamed from: com.bytedance.jedi.ext.adapter.extension.b$d */
    static final class C20650d extends AbstractC89220m implements AbstractC89172b<ViewGroup, JediAdapterBuilder$viewHolder$factory$2$1> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89188r f48829a;

        /* renamed from: b */
        final /* synthetic */ int f48830b;

        static {
            Covode.recordClassIndex(24184);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ JediAdapterBuilder$viewHolder$factory$2$1 invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154719c(viewGroup2, "");
            return new JediAdapterBuilder$viewHolder$factory$2$1(this, viewGroup2, C20572e.m38772a(viewGroup2, this.f48830b));
        }
    }

    /* renamed from: com.bytedance.jedi.ext.adapter.extension.b$b */
    public static final class C20647b extends AbstractC20651f<T> {

        /* renamed from: d */
        final /* synthetic */ C20645b f48822d;

        /* renamed from: e */
        final /* synthetic */ C20438e f48823e;

        static {
            Covode.recordClassIndex(24181);
        }

        /* renamed from: com.bytedance.jedi.ext.adapter.extension.b$b$a */
        static final class C20648a extends AbstractC89220m implements AbstractC89172b<Integer, Boolean> {

            /* renamed from: a */
            final /* synthetic */ AbstractC89183m f48824a;

            /* renamed from: b */
            final /* synthetic */ C20647b f48825b;

            /* renamed from: c */
            final /* synthetic */ AbstractC20638g f48826c;

            static {
                Covode.recordClassIndex(24182);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C20648a(AbstractC89183m mVar, C20647b bVar, AbstractC20638g gVar) {
                super(1);
                this.f48824a = mVar;
                this.f48825b = bVar;
                this.f48826c = gVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ Boolean invoke(Integer num) {
                int intValue = num.intValue();
                return Boolean.valueOf(((Boolean) this.f48824a.invoke(Integer.valueOf(intValue), this.f48825b.mo33838a(intValue, false))).booleanValue());
            }
        }

        @Override // com.bytedance.jedi.ext.adapter.p1467b.AbstractC20629d
        /* renamed from: a */
        public final void mo33884a(AbstractC20638g<JediViewHolder<? extends AbstractC20467g, T>> gVar) {
            C89219l.m154719c(gVar, "");
            for (T t : this.f48822d.f48818c) {
                AbstractC89183m<? super Integer, ? super RecyclerView, C89391z> mVar = (AbstractC89183m) t.component3();
                gVar.mo33893a(new C20648a((AbstractC89183m) t.component2(), this, gVar), mVar, (AbstractC89172b) t.component1());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C20647b(C20645b bVar, C20438e eVar, AbstractC1204m mVar, C20438e eVar2, C20435c cVar) {
            super(mVar, eVar2, cVar);
            this.f48822d = bVar;
            this.f48823e = eVar;
        }
    }

    private C20645b(AbstractC1204m mVar, C20435c<T> cVar) {
        super(cVar, (byte) 0);
        this.f48821e = mVar;
    }

    public /* synthetic */ C20645b(AbstractC1204m mVar, C20435c cVar, byte b) {
        this(mVar, cVar);
    }
}
