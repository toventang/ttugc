package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3088d;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17427b;
import com.bytedance.ies.p1208im.core.api.p1211b.p1212a.AbstractC17423b;
import com.bytedance.p1399im.core.p1408d.C19537ah;
import com.bytedance.p1399im.core.p1408d.C19638h;
import java.util.List;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88986z;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.d.b */
public final class C53744b extends AbstractC88979t<AbstractC53732a> {

    /* renamed from: a */
    private final AbstractC17427b f123277a;

    static {
        Covode.recordClassIndex(63324);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.d.b$a */
    static final class C53745a extends AbstractC53743ae implements AbstractC17423b {

        /* renamed from: a */
        private final AbstractC17427b f123278a;

        /* renamed from: b */
        private final AbstractC88986z<? super AbstractC53732a> f123279b;

        static {
            Covode.recordClassIndex(63325);
        }

        @Override // com.bytedance.p1399im.core.p1408d.AbstractC19669r
        /* renamed from: d */
        public final int mo28016d() {
            return 0;
        }

        /* access modifiers changed from: protected */
        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3088d.AbstractC53743ae
        /* renamed from: a */
        public final void mo90324a() {
            this.f123278a.mo27734a();
        }

        @Override // com.bytedance.p1399im.core.p1408d.AbstractC19669r
        /* renamed from: a */
        public final void mo28006a(List<C19537ah> list) {
            AbstractC88986z<? super AbstractC53732a> zVar = this.f123279b;
            if (list == null) {
                list = C89086z.INSTANCE;
            }
            zVar.onNext(new C53733aa(list));
        }

        @Override // com.bytedance.p1399im.core.p1408d.AbstractC19669r
        /* renamed from: b */
        public final void mo28012b(List<C19537ah> list) {
            AbstractC88986z<? super AbstractC53732a> zVar = this.f123279b;
            if (list == null) {
                list = C89086z.INSTANCE;
            }
            zVar.onNext(new C53749e(list));
        }

        @Override // com.bytedance.p1399im.core.p1408d.AbstractC19669r
        /* renamed from: c */
        public final void mo28015c(List<C19537ah> list) {
            AbstractC88986z<? super AbstractC53732a> zVar = this.f123279b;
            if (list == null) {
                list = C89086z.INSTANCE;
            }
            zVar.onNext(new C53764t(list));
        }

        @Override // com.bytedance.p1399im.core.p1408d.AbstractC19669r
        /* renamed from: a */
        public final void mo28001a(C19638h hVar) {
            AbstractC88986z<? super AbstractC53732a> zVar = this.f123279b;
            if (hVar != null) {
                zVar.onNext(new C53752h(hVar));
                return;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }

        @Override // com.bytedance.p1399im.core.p1408d.AbstractC19669r
        /* renamed from: b */
        public final void mo28010b(C19638h hVar) {
            AbstractC88986z<? super AbstractC53732a> zVar = this.f123279b;
            if (hVar != null) {
                zVar.onNext(new C53754j(hVar));
                return;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }

        @Override // com.bytedance.p1399im.core.p1408d.AbstractC19669r
        /* renamed from: c */
        public final void mo28014c(C19638h hVar) {
            AbstractC88986z<? super AbstractC53732a> zVar = this.f123279b;
            if (hVar != null) {
                zVar.onNext(new C53758n(hVar));
                return;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }

        @Override // com.bytedance.p1399im.core.p1408d.AbstractC19669r
        /* renamed from: d */
        public final void mo28017d(C19638h hVar) {
            AbstractC88986z<? super AbstractC53732a> zVar = this.f123279b;
            if (hVar != null) {
                zVar.onNext(new C53755k(hVar));
                return;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }

        public C53745a(AbstractC17427b bVar, AbstractC88986z<? super AbstractC53732a> zVar) {
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(zVar, "");
            this.f123278a = bVar;
            this.f123279b = zVar;
        }

        @Override // com.bytedance.p1399im.core.p1408d.AbstractC19669r
        /* renamed from: a */
        public final void mo28002a(C19638h hVar, int i) {
            AbstractC88986z<? super AbstractC53732a> zVar = this.f123279b;
            if (hVar != null) {
                zVar.onNext(new C53770z(hVar, i));
                return;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }

        @Override // com.bytedance.p1399im.core.p1408d.AbstractC19669r
        /* renamed from: a */
        public final void mo28003a(String str, int i) {
            AbstractC88986z<? super AbstractC53732a> zVar = this.f123279b;
            if (str != null) {
                zVar.onNext(new C53768x(str, i));
                return;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }

        @Override // com.bytedance.p1399im.core.p1408d.AbstractC19669r
        /* renamed from: a */
        public final void mo28005a(String str, List<? extends C19537ah> list) {
            AbstractC88986z<? super AbstractC53732a> zVar = this.f123279b;
            if (str != null) {
                if (list == null) {
                    list = C89086z.INSTANCE;
                }
                zVar.onNext(new C53759o(str, list));
                return;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }

        @Override // com.bytedance.p1399im.core.p1408d.AbstractC19669r
        /* renamed from: a */
        public final void mo28004a(String str, int i, List<Long> list) {
            AbstractC88986z<? super AbstractC53732a> zVar = this.f123279b;
            if (str != null) {
                if (list == null) {
                    list = C89086z.INSTANCE;
                }
                zVar.onNext(new C53769y(str, i, list));
                return;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    public C53744b(AbstractC17427b bVar) {
        C89219l.m154721d(bVar, "");
        this.f123277a = bVar;
    }

    @Override // p4560f.p4561a.AbstractC88979t
    /* renamed from: a */
    public final void mo17922a(AbstractC88986z<? super AbstractC53732a> zVar) {
        C89219l.m154721d(zVar, "");
        C53745a aVar = new C53745a(this.f123277a, zVar);
        zVar.onSubscribe(aVar);
        this.f123277a.mo27735a(aVar);
    }
}
