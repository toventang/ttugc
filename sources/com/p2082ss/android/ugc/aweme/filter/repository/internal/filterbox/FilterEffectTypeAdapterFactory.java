package com.p2082ss.android.ugc.aweme.filter.repository.internal.filterbox;

import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28031v;
import com.google.gson.AbstractC28033w;
import com.google.gson.C27910f;
import com.google.gson.p2019b.C27895a;
import com.google.gson.p2020c.C27897a;
import com.google.gson.p2020c.C27900c;
import com.p2082ss.android.ugc.aweme.effectplatform.FilterEffect;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.filterbox.FilterEffectTypeAdapterFactory */
public final class FilterEffectTypeAdapterFactory implements AbstractC28033w {
    static {
        Covode.recordClassIndex(59890);
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.filterbox.FilterEffectTypeAdapterFactory$a */
    public static final class C50726a extends AbstractC28031v<T> {

        /* renamed from: a */
        final /* synthetic */ AbstractC28031v f117092a;

        static {
            Covode.recordClassIndex(59891);
        }

        C50726a(AbstractC28031v vVar) {
            this.f117092a = vVar;
        }

        @Override // com.google.gson.AbstractC28031v
        public final T read(C27897a aVar) {
            return (T) this.f117092a.read(aVar);
        }

        @Override // com.google.gson.AbstractC28031v
        public final void write(C27900c cVar, T t) {
            AbstractC28031v vVar = this.f117092a;
            Objects.requireNonNull(t, "null cannot be cast to non-null type com.ss.android.ugc.aweme.effectplatform.FilterEffect");
            vVar.write(cVar, t);
        }
    }

    @Override // com.google.gson.AbstractC28033w
    public final <T> AbstractC28031v<T> create(C27910f fVar, C27895a<T> aVar) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(aVar, "");
        if (!(!C89219l.m154714a(aVar.rawType, Effect.class)) || !(!C89219l.m154714a(aVar.rawType, com.p2082ss.ugc.effectplatform.model.Effect.class))) {
            return new C50726a(fVar.mo46664a(this, C27895a.get(FilterEffect.class)));
        }
        return null;
    }
}
