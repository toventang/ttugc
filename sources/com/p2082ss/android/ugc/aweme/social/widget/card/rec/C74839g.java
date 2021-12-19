package com.p2082ss.android.ugc.aweme.social.widget.card.rec;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.AbstractC17654e;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import com.bytedance.ies.powerlist.page.config.AbstractC17692b;
import com.p2082ss.android.ugc.aweme.social.widget.C74743a;
import com.p2082ss.android.ugc.aweme.social.widget.card.p3920a.C74765i;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.social.widget.card.rec.g */
public final class C74839g extends AbstractC17654e implements AbstractC74841h {

    /* renamed from: d */
    private final AbstractC89244h f168206d;

    static {
        Covode.recordClassIndex(87697);
    }

    /* renamed from: d */
    private final C74842i m131407d() {
        return (C74842i) this.f168206d.getValue();
    }

    @Override // com.bytedance.ies.powerlist.AbstractC17654e
    /* renamed from: c */
    public final void mo28126c() {
        m131407d().mo117899c();
    }

    /* renamed from: com.ss.android.ugc.aweme.social.widget.card.rec.g$a */
    static final class C74840a extends AbstractC89220m implements AbstractC89171a<C74842i> {

        /* renamed from: a */
        final /* synthetic */ C74839g f168207a;

        /* renamed from: b */
        final /* synthetic */ C74743a f168208b;

        /* renamed from: c */
        final /* synthetic */ C74765i f168209c;

        static {
            Covode.recordClassIndex(87698);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74840a(C74839g gVar, C74743a aVar, C74765i iVar) {
            super(0);
            this.f168207a = gVar;
            this.f168208b = aVar;
            this.f168209c = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C74842i invoke() {
            return new C74842i(this.f168208b, this.f168209c, this.f168207a);
        }
    }

    @Override // com.bytedance.ies.powerlist.AbstractC17654e
    /* renamed from: a */
    public final AbstractC17692b<?> mo28123a() {
        return m131407d().mo117898b();
    }

    @Override // com.p2082ss.android.ugc.aweme.social.widget.card.rec.AbstractC74841h
    /* renamed from: b */
    public final void mo117896b(List<? extends AbstractC17641a> list) {
        C89219l.m154721d(list, "");
        mo28125b().mo28138b(list);
    }

    @Override // com.p2082ss.android.ugc.aweme.social.widget.card.rec.AbstractC74841h
    /* renamed from: a */
    public final void mo117894a(View view) {
        C89219l.m154721d(view, "");
        mo28127d_(view);
    }

    @Override // com.p2082ss.android.ugc.aweme.social.widget.card.rec.AbstractC74841h
    /* renamed from: a */
    public final void mo117895a(Map<Integer, Class<? extends PowerCell<?>>> map) {
        C89219l.m154721d(map, "");
        Object[] array = map.values().toArray(new Class[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        Class[] clsArr = (Class[]) array;
        mo28124a((Class[]) Arrays.copyOf(clsArr, clsArr.length));
    }

    public C74839g(C74743a aVar, C74765i iVar) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(iVar, "");
        this.f168206d = C89250i.m154773a((AbstractC89171a) new C74840a(this, aVar, iVar));
    }
}
