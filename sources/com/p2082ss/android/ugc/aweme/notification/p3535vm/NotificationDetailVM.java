package com.p2082ss.android.ugc.aweme.notification.p3535vm;

import androidx.lifecycle.AbstractC1174ac;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.util.LinkedHashSet;
import java.util.Set;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.vm.NotificationDetailVM */
public final class NotificationDetailVM extends AbstractC1174ac {

    /* renamed from: a */
    public static final C62376a f141551a = new C62376a((byte) 0);

    /* renamed from: b */
    private final AbstractC89244h f141552b = C89250i.m154773a((AbstractC89171a) C62377b.f141553a);

    static {
        Covode.recordClassIndex(73164);
    }

    /* renamed from: a */
    private Set<String> m112814a() {
        return (Set) this.f141552b.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.vm.NotificationDetailVM$a */
    public static final class C62376a {
        static {
            Covode.recordClassIndex(73165);
        }

        private C62376a() {
        }

        public /* synthetic */ C62376a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.vm.NotificationDetailVM$b */
    static final class C62377b extends AbstractC89220m implements AbstractC89171a<Set<String>> {

        /* renamed from: a */
        public static final C62377b f141553a = new C62377b();

        static {
            Covode.recordClassIndex(73166);
        }

        C62377b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Set<String> invoke() {
            return new LinkedHashSet();
        }
    }

    /* renamed from: a */
    public final void mo100372a(BaseNotice baseNotice, AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(aVar, "");
        if (baseNotice != null && !m112814a().contains(baseNotice.nid)) {
            Set<String> a = m112814a();
            String str = baseNotice.nid;
            C89219l.m154716b(str, "");
            a.add(str);
            aVar.invoke();
        }
    }
}
