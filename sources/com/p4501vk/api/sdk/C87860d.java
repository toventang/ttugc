package com.p4501vk.api.sdk;

import com.bytedance.covode.number.Covode;
import com.p4501vk.api.sdk.p4505d.C87866b;
import com.p4501vk.api.sdk.p4505d.C87870c;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.vk.api.sdk.d */
public final class C87860d {

    /* renamed from: a */
    public final AbstractC87878f f199565a;

    /* renamed from: b */
    public volatile AbstractC87851c f199566b;

    /* renamed from: c */
    public final C87831b f199567c;

    /* renamed from: d */
    private final AbstractC89244h f199568d = C89250i.m154773a((AbstractC89171a) new C87861a(this));

    static {
        Covode.recordClassIndex(103870);
    }

    /* renamed from: a */
    public final C87866b mo142339a() {
        return (C87866b) this.f199568d.getValue();
    }

    /* renamed from: com.vk.api.sdk.d$a */
    static final class C87861a extends AbstractC89220m implements AbstractC89171a<C87866b> {

        /* renamed from: a */
        final /* synthetic */ C87860d f199569a;

        static {
            Covode.recordClassIndex(103871);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C87861a(C87860d dVar) {
            super(0);
            this.f199569a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C87866b invoke() {
            return new C87866b(new C87870c(this.f199569a.f199567c));
        }
    }

    public C87860d(C87831b bVar) {
        C89219l.m154719c(bVar, "");
        this.f199567c = bVar;
        this.f199565a = bVar.f199517c;
    }

    /* renamed from: a */
    public final void mo142340a(String str, String str2) {
        C89219l.m154719c(str, "");
        mo142339a().mo142343a(str, str2);
    }
}
