package com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.focused.p3152ui;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17420a;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17427b;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.p2082ss.android.ugc.aweme.inbox.C56511t;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55202d;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3261k.AbstractC56237a;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4602b.C89095f;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.focused.ui.c */
public final class C54903c implements AbstractC54902b {

    /* renamed from: b */
    public static final C54906a f125691b = new C54906a((byte) 0);

    /* renamed from: a */
    public final int f125692a;

    /* renamed from: c */
    private final AbstractC89244h f125693c;

    /* renamed from: d */
    private final int f125694d;

    /* renamed from: e */
    private final AbstractC17420a f125695e;

    /* renamed from: f */
    private final AbstractC89171a<Long> f125696f;

    /* renamed from: g */
    private final AbstractC89187q<String, String, String, C89391z> f125697g;

    static {
        Covode.recordClassIndex(64624);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.focused.ui.c$a */
    public static final class C54906a {
        static {
            Covode.recordClassIndex(64627);
        }

        private C54906a() {
        }

        public /* synthetic */ C54906a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.focused.ui.c$b */
    static final class C54907b extends AbstractC89220m implements AbstractC89171a<Long> {

        /* renamed from: a */
        final /* synthetic */ C54903c f125699a;

        static {
            Covode.recordClassIndex(64628);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54907b(C54903c cVar) {
            super(0);
            this.f125699a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Long invoke() {
            return Long.valueOf(TimeUnit.DAYS.toMillis((long) this.f125699a.f125692a));
        }
    }

    public /* synthetic */ C54903c() {
        this(C56511t.m102471a().f128749e, C56511t.m102471a().f128750f, AbstractC17420a.C17421a.m32276a(), C549041.f125698a, new AbstractC89187q<String, String, String, C89391z>(C55202d.f126269a) {
            /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.focused.p3152ui.C54903c.C549052 */

            static {
                Covode.recordClassIndex(64626);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89187q
            public final /* synthetic */ C89391z invoke(String str, String str2, String str3) {
                C19638h a;
                String str4 = str;
                String str5 = str2;
                String str6 = str3;
                C89219l.m154721d(str5, "");
                C89219l.m154721d(str6, "");
                C89219l.m154721d(str5, "");
                C89219l.m154721d(str6, "");
                if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str5) && !TextUtils.isEmpty(str6) && (a = AbstractC17420a.C17421a.m32276a().mo27720a(str4)) != null) {
                    Map<String, String> localExt = a.getLocalExt();
                    if (localExt == null) {
                        localExt = new HashMap<>();
                    }
                    localExt.put(str5, str6);
                    a.setLocalExt(localExt);
                    if (str4 == null) {
                        C89219l.m154715b();
                    }
                    AbstractC17427b.C17428a.m32308a(str4).mo27740a(localExt);
                }
                return C89391z.f203057a;
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r15v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.im.service.k.a> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.focused.p3152ui.AbstractC54902b
    /* renamed from: a */
    public final List<AbstractC56237a> mo91907a(List<? extends AbstractC56237a> list) {
        String str;
        C89219l.m154721d(list, "");
        if (list.size() <= this.f125694d) {
            return list;
        }
        long longValue = this.f125696f.invoke().longValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            C19638h a = this.f125695e.mo27720a(((AbstractC56237a) obj).bL_());
            if (!(a == null || (str = a.getLocalExt().get("key_focused_session_last_shown_time")) == null)) {
                Long g = C89361p.m154865g(str);
                if (g == null) {
                    C56244a.m102185a("FocusedListFilter", "Invalid number format ".concat(String.valueOf(str)));
                } else if (a.getUpdatedTime() < g.longValue() && longValue - a.getUpdatedTime() >= ((Number) this.f125693c.getValue()).longValue()) {
                }
            }
            arrayList.add(obj);
        }
        List<AbstractC56237a> g2 = C89070n.m154585g((Collection) arrayList);
        int size = g2.size();
        int i = this.f125694d;
        if (size < i) {
            g2.addAll(C89070n.m154571d((Iterable) C89070n.m154577e(list, g2), i - g2.size()));
            C89219l.m154721d(g2, "");
            C89095f fVar = C89095f.f202805a;
            Objects.requireNonNull(fVar, "null cannot be cast to non-null type kotlin.Comparator<T> /* = java.util.Comparator<T> */");
            C89070n.m154530a(g2, (Comparator) fVar);
        }
        for (AbstractC56237a aVar : g2) {
            this.f125697g.invoke(aVar.bL_(), "key_focused_session_last_shown_time", String.valueOf(longValue));
        }
        return C89070n.m154590j(g2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: h.f.a.q<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    private C54903c(int i, int i2, AbstractC17420a aVar, AbstractC89171a<Long> aVar2, AbstractC89187q<? super String, ? super String, ? super String, C89391z> qVar) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar2, "");
        C89219l.m154721d(qVar, "");
        this.f125692a = i;
        this.f125694d = i2;
        this.f125695e = aVar;
        this.f125696f = aVar2;
        this.f125697g = qVar;
        this.f125693c = C89250i.m154773a((AbstractC89171a) new C54907b(this));
    }
}
