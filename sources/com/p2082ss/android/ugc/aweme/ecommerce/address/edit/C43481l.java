package com.p2082ss.android.ugc.aweme.ecommerce.address.edit;

import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0952i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20467g;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.jedi.ext.adapter.p1467b.AbstractC20638g;
import com.p2082ss.android.ugc.aweme.base.arch.AbstractC34489c;
import com.p2082ss.android.ugc.aweme.base.arch.AbstractC34491d;
import com.p2082ss.android.ugc.aweme.ecommerce.address.dto.InputItemDTO;
import com.p2082ss.android.ugc.aweme.ecommerce.address.edit.viewholder.DescItemViewHolder;
import com.p2082ss.android.ugc.aweme.ecommerce.address.edit.viewholder.PhoneInputItemViewHolder;
import com.p2082ss.android.ugc.aweme.ecommerce.address.edit.viewholder.RegionInputItemViewHolder;
import com.p2082ss.android.ugc.aweme.ecommerce.address.edit.viewholder.SwitchInputItemViewHolder;
import com.p2082ss.android.ugc.aweme.ecommerce.address.edit.viewholder.TextInputItemViewHolder;
import com.p2082ss.android.ugc.aweme.ecommerce.address.p2820a.C43340a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.l */
public final class C43481l extends AbstractC34489c<Object> {

    /* renamed from: d */
    public final AbstractC1204m f101411d;

    /* renamed from: e */
    public final AbstractC0952i f101412e;

    static {
        Covode.recordClassIndex(51710);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.arch.AbstractC34497h, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: c */
    public final int mo60936c(int i) {
        return ((AbstractC34491d) this).f81477a.mo33895b(i);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.l$b */
    static final class C43483b extends AbstractC89220m implements AbstractC89172b<ViewGroup, JediViewHolder<? extends AbstractC20467g, ?>> {

        /* renamed from: a */
        public static final C43483b f101414a = new C43483b();

        static {
            Covode.recordClassIndex(51712);
        }

        C43483b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ JediViewHolder<? extends AbstractC20467g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            return new DescItemViewHolder(viewGroup2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.l$c */
    static final class C43484c extends AbstractC89220m implements AbstractC89172b<ViewGroup, JediViewHolder<? extends AbstractC20467g, ?>> {

        /* renamed from: a */
        public static final C43484c f101415a = new C43484c();

        static {
            Covode.recordClassIndex(51713);
        }

        C43484c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ JediViewHolder<? extends AbstractC20467g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            return new TextInputItemViewHolder(viewGroup2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.l$e */
    static final class C43486e extends AbstractC89220m implements AbstractC89172b<ViewGroup, JediViewHolder<? extends AbstractC20467g, ?>> {

        /* renamed from: a */
        public static final C43486e f101417a = new C43486e();

        static {
            Covode.recordClassIndex(51715);
        }

        C43486e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ JediViewHolder<? extends AbstractC20467g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            return new PhoneInputItemViewHolder(viewGroup2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.l$i */
    static final class C43490i extends AbstractC89220m implements AbstractC89172b<ViewGroup, JediViewHolder<? extends AbstractC20467g, ?>> {

        /* renamed from: a */
        public static final C43490i f101421a = new C43490i();

        static {
            Covode.recordClassIndex(51719);
        }

        C43490i() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ JediViewHolder<? extends AbstractC20467g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            return new SwitchInputItemViewHolder(viewGroup2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.l$a */
    static final class C43482a extends AbstractC89220m implements AbstractC89172b<Integer, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C43481l f101413a;

        static {
            Covode.recordClassIndex(51711);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43482a(C43481l lVar) {
            super(1);
            this.f101413a = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(Integer num) {
            int intValue = num.intValue();
            boolean z = false;
            if (this.f101413a.mo74001a(intValue, 0) || this.f101413a.mo74001a(intValue, 5)) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.l$d */
    static final class C43485d extends AbstractC89220m implements AbstractC89172b<Integer, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C43481l f101416a;

        static {
            Covode.recordClassIndex(51714);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43485d(C43481l lVar) {
            super(1);
            this.f101416a = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(this.f101416a.mo74001a(num.intValue(), 1));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.l$f */
    static final class C43487f extends AbstractC89220m implements AbstractC89172b<Integer, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C43481l f101418a;

        static {
            Covode.recordClassIndex(51716);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43487f(C43481l lVar) {
            super(1);
            this.f101418a = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(this.f101418a.mo74001a(num.intValue(), 2));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.l$g */
    static final class C43488g extends AbstractC89220m implements AbstractC89172b<ViewGroup, JediViewHolder<? extends AbstractC20467g, ?>> {

        /* renamed from: a */
        final /* synthetic */ C43481l f101419a;

        static {
            Covode.recordClassIndex(51717);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43488g(C43481l lVar) {
            super(1);
            this.f101419a = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ JediViewHolder<? extends AbstractC20467g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            return new RegionInputItemViewHolder(viewGroup2, this.f101419a.f101412e);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.l$h */
    static final class C43489h extends AbstractC89220m implements AbstractC89172b<Integer, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C43481l f101420a;

        static {
            Covode.recordClassIndex(51718);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43489h(C43481l lVar) {
            super(1);
            this.f101420a = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(this.f101420a.mo74001a(num.intValue(), 3));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.l$j */
    static final class C43491j extends AbstractC89220m implements AbstractC89172b<Integer, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C43481l f101422a;

        static {
            Covode.recordClassIndex(51720);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43491j(C43481l lVar) {
            super(1);
            this.f101422a = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(this.f101422a.mo74001a(num.intValue(), 4));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.arch.AbstractC34497h
    /* renamed from: a */
    public final void mo60935a(AbstractC20638g<JediViewHolder<? extends AbstractC20467g, ?>> gVar) {
        C89219l.m154721d(gVar, "");
        AbstractC20638g unused = gVar.mo33893a(new C43482a(this), null, C43484c.f101415a);
        AbstractC20638g unused2 = gVar.mo33893a(new C43485d(this), null, C43486e.f101417a);
        AbstractC20638g unused3 = gVar.mo33893a(new C43487f(this), null, new C43488g(this));
        AbstractC20638g unused4 = gVar.mo33893a(new C43489h(this), null, C43490i.f101421a);
        AbstractC20638g unused5 = gVar.mo33893a(new C43491j(this), null, C43483b.f101414a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C43481l(AbstractC1204m mVar, AbstractC0952i iVar) {
        super(mVar, new C43480k(), 4);
        C89219l.m154721d(mVar, "");
        this.f101411d = mVar;
        this.f101412e = iVar;
    }

    /* renamed from: a */
    public final boolean mo74001a(int i, int i2) {
        InputItemDTO inputItemDTO;
        Integer num;
        Object a = mo33762a(i);
        if (!(a instanceof C43340a)) {
            a = null;
        }
        C43340a aVar = (C43340a) a;
        if (aVar == null || (inputItemDTO = aVar.f101148a) == null || (num = inputItemDTO.f101203h) == null || num.intValue() != i2) {
            return false;
        }
        return true;
    }
}
