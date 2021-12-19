package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3088d;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17420a;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17427b;
import com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.bytedance.p1399im.core.p1408d.C19672u;
import java.util.concurrent.Callable;
import p4560f.p4561a.AbstractC88405ad;
import p4560f.p4561a.AbstractC88407af;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.d.ac */
final /* synthetic */ class C53735ac {
    static {
        Covode.recordClassIndex(63315);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.d.ac$a */
    public static final class CallableC53736a<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ AbstractC17420a f123266a;

        /* renamed from: b */
        final /* synthetic */ String f123267b;

        static {
            Covode.recordClassIndex(63316);
        }

        public CallableC53736a(AbstractC17420a aVar, String str) {
            this.f123266a = aVar;
            this.f123267b = str;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            return this.f123266a.mo27720a(this.f123267b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.d.ac$b */
    public static final class CallableC53737b<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ AbstractC17420a f123268a;

        /* renamed from: b */
        final /* synthetic */ String f123269b;

        static {
            Covode.recordClassIndex(63317);
        }

        public CallableC53737b(AbstractC17420a aVar, String str) {
            this.f123268a = aVar;
            this.f123269b = str;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            return this.f123268a.mo27728b(this.f123269b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.d.ac$c */
    public static final class C53738c<T> implements AbstractC88407af {

        /* renamed from: a */
        final /* synthetic */ AbstractC17420a f123270a;

        /* renamed from: b */
        final /* synthetic */ String f123271b;

        static {
            Covode.recordClassIndex(63318);
        }

        public C53738c(AbstractC17420a aVar, String str) {
            this.f123270a = aVar;
            this.f123271b = str;
        }

        @Override // p4560f.p4561a.AbstractC88407af
        public final void subscribe(final AbstractC88405ad<C19638h> adVar) {
            C89219l.m154721d(adVar, "");
            long c = AbstractC17427b.C17428a.m32311c(this.f123271b);
            if (c > 0) {
                this.f123270a.mo27730b(String.valueOf(c), new AbstractC19479b<C19638h>() {
                    /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3088d.C53735ac.C53738c.C537391 */

                    static {
                        Covode.recordClassIndex(63319);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
                    /* renamed from: a */
                    public final /* synthetic */ void mo27861a(C19638h hVar) {
                        C89219l.m154721d(hVar, "");
                        adVar.mo142931a(hVar);
                    }

                    @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
                    /* renamed from: a */
                    public final void mo27860a(C19672u uVar) {
                        Throwable th;
                        AbstractC88405ad adVar = adVar;
                        if (uVar == null || (th = uVar.f46735h) == null) {
                            th = new RuntimeException("createSingleConversation() failed with no errors");
                        }
                        adVar.mo142933b(th);
                    }
                });
            } else {
                adVar.mo142933b(new IllegalArgumentException("createSingleConversation() uid invalid: uid = ".concat(String.valueOf(c))));
            }
        }
    }
}
