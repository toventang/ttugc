package com.p2082ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28031v;
import com.google.gson.AbstractC28033w;
import com.google.gson.C27910f;
import com.google.gson.p2019b.C27895a;
import com.google.gson.p2020c.C27897a;
import com.google.gson.p2020c.C27900c;

/* renamed from: com.ss.android.ugc.aweme.utils.PostConstructTypeAdapterFactory */
public class PostConstructTypeAdapterFactory implements AbstractC28033w {
    static {
        Covode.recordClassIndex(93433);
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.PostConstructTypeAdapterFactory$a */
    static class C80175a<T> extends AbstractC28031v<T> {

        /* renamed from: a */
        private final AbstractC28031v<T> f179617a;

        static {
            Covode.recordClassIndex(93434);
        }

        C80175a(AbstractC28031v<T> vVar) {
            this.f179617a = vVar;
        }

        @Override // com.google.gson.AbstractC28031v
        public final T read(C27897a aVar) {
            return this.f179617a.read(aVar);
        }

        @Override // com.google.gson.AbstractC28031v
        public final void write(C27900c cVar, T t) {
            this.f179617a.write(cVar, t);
        }
    }

    @Override // com.google.gson.AbstractC28033w
    public <T> AbstractC28031v<T> create(C27910f fVar, C27895a<T> aVar) {
        return new C80175a(fVar.mo46664a(this, aVar));
    }
}
