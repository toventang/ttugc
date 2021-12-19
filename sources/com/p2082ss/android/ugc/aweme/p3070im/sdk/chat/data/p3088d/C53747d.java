package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3088d;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17434e;
import com.bytedance.ies.p1208im.core.api.p1211b.p1212a.AbstractC17425d;
import com.bytedance.p1399im.core.p1408d.C19536ag;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.p1399im.core.p1408d.C19587an;
import com.bytedance.p1399im.core.p1408d.C19593ar;
import com.bytedance.p1399im.core.p1408d.C19600ay;
import java.util.List;
import java.util.Map;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88986z;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.d.d */
public final class C53747d extends AbstractC88979t<AbstractC53746c> {

    /* renamed from: a */
    private final AbstractC17434e f123280a;

    static {
        Covode.recordClassIndex(63327);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.d.d$a */
    static final class C53748a extends AbstractC53743ae implements AbstractC17425d {

        /* renamed from: a */
        private final AbstractC17434e f123281a;

        /* renamed from: b */
        private final AbstractC88986z<? super AbstractC53746c> f123282b;

        static {
            Covode.recordClassIndex(63328);
        }

        @Override // com.bytedance.ies.p1208im.core.api.p1211b.p1212a.AbstractC17425d, com.bytedance.p1399im.core.p1408d.AbstractC19674v
        /* renamed from: a */
        public final void mo27798a(List<C19538ai> list, boolean z) {
            AbstractC88986z<? super AbstractC53746c> zVar = this.f123282b;
            if (list == null) {
                list = C89086z.INSTANCE;
            }
            zVar.onNext(new C53761q(list, z));
        }

        /* access modifiers changed from: protected */
        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3088d.AbstractC53743ae
        /* renamed from: a */
        public final void mo90324a() {
            this.f123281a.mo27761b();
        }

        @Override // com.bytedance.ies.p1208im.core.api.p1211b.p1212a.AbstractC17425d, com.bytedance.p1399im.core.p1408d.AbstractC19674v
        /* renamed from: a */
        public final void mo27792a(C19538ai aiVar) {
            AbstractC88986z<? super AbstractC53746c> zVar = this.f123282b;
            if (aiVar != null) {
                zVar.onNext(new C53753i(aiVar));
                return;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }

        public C53748a(AbstractC17434e eVar, AbstractC88986z<? super AbstractC53746c> zVar) {
            C89219l.m154721d(eVar, "");
            C89219l.m154721d(zVar, "");
            this.f123281a = eVar;
            this.f123282b = zVar;
        }

        @Override // com.bytedance.ies.p1208im.core.api.p1211b.p1212a.AbstractC17425d, com.bytedance.p1399im.core.p1408d.AbstractC19674v
        /* renamed from: b */
        public final void mo27799b(List<C19538ai> list, boolean z) {
            AbstractC88986z<? super AbstractC53746c> zVar = this.f123282b;
            if (list == null) {
                list = C89086z.INSTANCE;
            }
            zVar.onNext(new C53760p(list, z));
        }

        @Override // com.bytedance.ies.p1208im.core.api.p1211b.p1212a.AbstractC17425d, com.bytedance.p1399im.core.p1408d.AbstractC19674v
        /* renamed from: a */
        public final void mo27789a(int i, C19538ai aiVar) {
            AbstractC88986z<? super AbstractC53746c> zVar = this.f123282b;
            if (aiVar != null) {
                zVar.onNext(new C53750f(i, aiVar));
                return;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }

        @Override // com.bytedance.ies.p1208im.core.api.p1211b.p1212a.AbstractC17425d, com.bytedance.p1399im.core.p1408d.AbstractC19674v
        /* renamed from: a */
        public final void mo27791a(int i, C19587an anVar) {
            AbstractC88986z<? super AbstractC53746c> zVar = this.f123282b;
            if (anVar != null) {
                zVar.onNext(new C53767w(i, anVar));
                return;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }

        @Override // com.bytedance.ies.p1208im.core.api.p1211b.p1212a.AbstractC17425d, com.bytedance.p1399im.core.p1408d.AbstractC19674v
        /* renamed from: a */
        public final void mo27794a(C19538ai aiVar, boolean z) {
            AbstractC88986z<? super AbstractC53746c> zVar = this.f123282b;
            if (aiVar != null) {
                zVar.onNext(new C53765u(aiVar, z));
                return;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }

        @Override // com.bytedance.ies.p1208im.core.api.p1211b.p1212a.AbstractC17425d, com.bytedance.p1399im.core.p1408d.AbstractC19674v
        /* renamed from: a */
        public final void mo27797a(List<C19538ai> list, Map<String, Map<String, String>> map) {
            AbstractC88986z<? super AbstractC53746c> zVar = this.f123282b;
            if (list == null) {
                list = C89086z.INSTANCE;
            }
            if (map == null) {
                map = C89041ag.m154415a();
            }
            zVar.onNext(new C53734ab(list, map));
        }

        @Override // com.bytedance.ies.p1208im.core.api.p1211b.p1212a.AbstractC17425d, com.bytedance.p1399im.core.p1408d.AbstractC19674v
        /* renamed from: a */
        public final void mo27796a(List<C19538ai> list, int i, String str) {
            AbstractC88986z<? super AbstractC53746c> zVar = this.f123282b;
            if (list == null) {
                list = C89086z.INSTANCE;
            }
            zVar.onNext(new C53762r(list, i, str));
        }

        @Override // com.bytedance.ies.p1208im.core.api.p1211b.p1212a.AbstractC17425d, com.bytedance.p1399im.core.p1408d.AbstractC19674v
        /* renamed from: a */
        public final void mo27790a(int i, C19538ai aiVar, C19600ay ayVar) {
            AbstractC88986z<? super AbstractC53746c> zVar = this.f123282b;
            if (aiVar != null) {
                zVar.onNext(new C53766v(i, aiVar, ayVar));
                return;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }

        @Override // com.bytedance.ies.p1208im.core.api.p1211b.p1212a.AbstractC17425d, com.bytedance.p1399im.core.p1408d.AbstractC19674v
        /* renamed from: a */
        public final void mo27793a(C19538ai aiVar, Map<String, List<C19536ag>> map, Map<String, List<C19536ag>> map2) {
            AbstractC88986z<? super AbstractC53746c> zVar = this.f123282b;
            if (aiVar != null) {
                if (map == null) {
                    map = C89041ag.m154415a();
                }
                if (map2 == null) {
                    map2 = C89041ag.m154415a();
                }
                zVar.onNext(new C53757m(aiVar, map, map2));
                return;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }

        @Override // com.bytedance.ies.p1208im.core.api.p1211b.p1212a.AbstractC17425d, com.bytedance.p1399im.core.p1408d.AbstractC19674v
        /* renamed from: a */
        public final void mo27795a(List<C19538ai> list, int i, C19593ar arVar) {
            C89219l.m154721d(arVar, "");
            AbstractC88986z<? super AbstractC53746c> zVar = this.f123282b;
            if (list == null) {
                list = C89086z.INSTANCE;
            }
            zVar.onNext(new C53756l(list, i, arVar));
        }
    }

    public C53747d(AbstractC17434e eVar) {
        C89219l.m154721d(eVar, "");
        this.f123280a = eVar;
    }

    @Override // p4560f.p4561a.AbstractC88979t
    /* renamed from: a */
    public final void mo17922a(AbstractC88986z<? super AbstractC53746c> zVar) {
        C89219l.m154721d(zVar, "");
        C53748a aVar = new C53748a(this.f123280a, zVar);
        zVar.onSubscribe(aVar);
        this.f123280a.mo27759a(aVar);
    }
}
