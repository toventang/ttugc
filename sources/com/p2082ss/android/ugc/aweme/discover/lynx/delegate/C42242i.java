package com.p2082ss.android.ugc.aweme.discover.lynx.delegate;

import com.bytedance.android.live.base.p177a.C2954a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.helper.C41985ae;
import com.p2082ss.android.ugc.aweme.discover.lynx.p2779a.C42186b;
import com.p2082ss.android.ugc.aweme.discover.p2787m.AbstractC42293b;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.lynx.delegate.i */
public final class C42242i extends AbstractC42218b {

    /* renamed from: a */
    public static final C42243a f98421a = new C42243a((byte) 0);

    /* renamed from: c */
    private final AbstractC89244h f98422c;

    static {
        Covode.recordClassIndex(50184);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.lynx.delegate.i$a */
    public static final class C42243a {
        static {
            Covode.recordClassIndex(50185);
        }

        private C42243a() {
        }

        public /* synthetic */ C42243a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.lynx.delegate.i$b */
    static final class C42244b extends AbstractC89220m implements AbstractC89171a<C422451> {

        /* renamed from: a */
        final /* synthetic */ C42186b f98423a;

        static {
            Covode.recordClassIndex(50186);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42244b(C42186b bVar) {
            super(0);
            this.f98423a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C422451 invoke() {
            return new AbstractC42293b.AbstractC42294a<C2954a>(this) {
                /* class com.p2082ss.android.ugc.aweme.discover.lynx.delegate.C42242i.C42244b.C422451 */

                /* renamed from: a */
                final /* synthetic */ C42244b f98424a;

                static {
                    Covode.recordClassIndex(50187);
                }

                @Override // com.p2082ss.android.ugc.aweme.discover.p2787m.AbstractC42293b.AbstractC42294a
                /* renamed from: a */
                public final Class<C2954a> mo60371a() {
                    return C2954a.class;
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f98424a = r1;
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.p2082ss.android.ugc.aweme.discover.p2787m.AbstractC42293b.AbstractC42294a
                /* renamed from: a */
                public final /* synthetic */ void mo60372a(C2954a aVar) {
                    C2954a aVar2 = aVar;
                    C89219l.m154721d(aVar2, "");
                    long j = aVar2.f8696a;
                    C42186b bVar = this.f98424a.f98423a;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("room_id_str", String.valueOf(j));
                    bVar.mo71386a("updateLiveCloseState", jSONObject);
                }
            };
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.lynx.delegate.AbstractC42218b
    /* renamed from: a */
    public final void mo71429a() {
        C41985ae.f97915a.mo71487a((AbstractC42293b.AbstractC42294a) this.f98422c.getValue());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C42242i(C42186b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
        this.f98422c = C89250i.m154773a((AbstractC89171a) new C42244b(bVar));
    }
}
