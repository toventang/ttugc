package com.p2082ss.android.ugc.aweme.discover.lynx.delegate;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.helper.C41985ae;
import com.p2082ss.android.ugc.aweme.discover.lynx.p2779a.C42186b;
import com.p2082ss.android.ugc.aweme.discover.p2787m.AbstractC42293b;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49672ag;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.lynx.delegate.e */
public final class C42226e extends AbstractC42218b {

    /* renamed from: a */
    public static final C42227a f98397a = new C42227a((byte) 0);

    /* renamed from: c */
    private final AbstractC89244h f98398c;

    static {
        Covode.recordClassIndex(50168);
    }

    /* renamed from: d */
    private final AbstractC42293b.AbstractC42294a<C49672ag> m84516d() {
        return (AbstractC42293b.AbstractC42294a) this.f98398c.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.lynx.delegate.e$a */
    public static final class C42227a {
        static {
            Covode.recordClassIndex(50169);
        }

        private C42227a() {
        }

        public /* synthetic */ C42227a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.lynx.delegate.e$b */
    static final class C42228b extends AbstractC89220m implements AbstractC89171a<C422291> {

        /* renamed from: a */
        final /* synthetic */ C42186b f98399a;

        static {
            Covode.recordClassIndex(50170);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42228b(C42186b bVar) {
            super(0);
            this.f98399a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C422291 invoke() {
            return new AbstractC42293b.AbstractC42294a<C49672ag>(this) {
                /* class com.p2082ss.android.ugc.aweme.discover.lynx.delegate.C42226e.C42228b.C422291 */

                /* renamed from: a */
                final /* synthetic */ C42228b f98400a;

                static {
                    Covode.recordClassIndex(50171);
                }

                @Override // com.p2082ss.android.ugc.aweme.discover.p2787m.AbstractC42293b.AbstractC42294a
                /* renamed from: a */
                public final Class<C49672ag> mo60371a() {
                    return C49672ag.class;
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f98400a = r1;
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.p2082ss.android.ugc.aweme.discover.p2787m.AbstractC42293b.AbstractC42294a
                /* renamed from: a */
                public final /* synthetic */ void mo60372a(C49672ag agVar) {
                    C49672ag agVar2 = agVar;
                    C89219l.m154721d(agVar2, "");
                    if (agVar2.f114315a == 13) {
                        C42186b bVar = this.f98400a.f98399a;
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("aid", agVar2.f114316b);
                        Bundle bundle = agVar2.f114317c;
                        if (bundle != null) {
                            jSONObject.put("dig_status", bundle.getInt("user_digged"));
                        }
                        bVar.mo71386a("changeDiggState", jSONObject);
                    }
                }
            };
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.lynx.delegate.AbstractC42218b
    /* renamed from: b */
    public final void mo71431b() {
        C41985ae.f97915a.mo71487a((AbstractC42293b.AbstractC42294a<?>) m84516d());
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.lynx.delegate.AbstractC42218b
    /* renamed from: c */
    public final void mo71432c() {
        C41985ae aeVar = C41985ae.f97915a;
        AbstractC42293b.AbstractC42294a<C49672ag> d = m84516d();
        C89219l.m154721d(d, "");
        Iterator<WeakReference<AbstractC42293b.AbstractC42294a<?>>> it = aeVar.mo71486a().iterator();
        while (it.hasNext()) {
            WeakReference<AbstractC42293b.AbstractC42294a<?>> next = it.next();
            if (d == next.get() || next.get() == null) {
                it.remove();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C42226e(C42186b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
        this.f98398c = C89250i.m154773a((AbstractC89171a) new C42228b(bVar));
    }
}
