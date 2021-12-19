package com.p2082ss.android.ugc.aweme.filter.repository.internal.filterbox;

import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28031v;
import com.google.gson.AbstractC28033w;
import com.google.gson.C27910f;
import com.google.gson.C27917g;
import com.google.gson.p2019b.C27895a;
import com.google.gson.p2020c.C27897a;
import com.google.gson.p2020c.C27900c;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.filterbox.FilterBoxEffectNetListResponseTypeAdapter */
public final class FilterBoxEffectNetListResponseTypeAdapter implements AbstractC28033w {
    static {
        Covode.recordClassIndex(59888);
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.filterbox.FilterBoxEffectNetListResponseTypeAdapter$a */
    public static final class C50725a extends AbstractC28031v<T> {

        /* renamed from: a */
        final /* synthetic */ AbstractC28031v f117091a;

        static {
            Covode.recordClassIndex(59889);
        }

        C50725a(AbstractC28031v vVar) {
            this.f117091a = vVar;
        }

        @Override // com.google.gson.AbstractC28031v
        public final T read(C27897a aVar) {
            return (T) this.f117091a.read(aVar);
        }

        @Override // com.google.gson.AbstractC28031v
        public final void write(C27900c cVar, T t) {
            AbstractC28031v vVar = this.f117091a;
            Objects.requireNonNull(t, "null cannot be cast to non-null type com.ss.android.ugc.aweme.filter.repository.internal.filterbox.FilterBoxEffectNetListResponse2");
            vVar.write(cVar, t);
        }
    }

    @Override // com.google.gson.AbstractC28033w
    public final <T> AbstractC28031v<T> create(C27910f fVar, C27895a<T> aVar) {
        C89219l.m154721d(aVar, "");
        if (!C89219l.m154714a(aVar.rawType, C50742g.class)) {
            return null;
        }
        return new C50725a(new C27917g().mo46679a(new FilterEffectTypeAdapterFactory()).mo46682b().mo46665a((Class) C50743h.class));
    }
}
