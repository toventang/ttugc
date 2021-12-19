package com.p2082ss.android.ugc.aweme.notification.p3535vm;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.notice.api.C61530a;
import com.p2082ss.android.ugc.aweme.notification.p3523e.C61933a;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.vm.NotificationVM */
public final class NotificationVM extends BaseNotificationVM {

    /* renamed from: d */
    public static final C62378a f141554d = new C62378a((byte) 0);

    /* renamed from: e */
    private final AbstractC89244h f141555e = C89250i.m154773a((AbstractC89171a) C62379b.f141556a);

    static {
        Covode.recordClassIndex(73167);
    }

    /* renamed from: l */
    private final Map<Integer, C62455c> m112816l() {
        return (Map) this.f141555e.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.vm.NotificationVM$a */
    public static final class C62378a {
        static {
            Covode.recordClassIndex(73168);
        }

        private C62378a() {
        }

        public /* synthetic */ C62378a(byte b) {
            this();
        }

        /* renamed from: a */
        public static NotificationVM m112820a(Fragment fragment) {
            C89219l.m154721d(fragment, "");
            AbstractC1174ac a = C1181ae.m3879a(fragment, (C1175ad.AbstractC1177b) null).mo3983a(NotificationVM.class);
            C89219l.m154716b(a, "");
            return (NotificationVM) a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.vm.NotificationVM$b */
    static final class C62379b extends AbstractC89220m implements AbstractC89171a<Map<Integer, C62455c>> {

        /* renamed from: a */
        public static final C62379b f141556a = new C62379b();

        static {
            Covode.recordClassIndex(73169);
        }

        C62379b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Map<Integer, C62455c> invoke() {
            return new LinkedHashMap();
        }
    }

    /* renamed from: j */
    public final C62455c mo100354j() {
        return mo100373b(mo100337a());
    }

    /* renamed from: k */
    public final boolean mo100374k() {
        mo100345d().clear();
        mo100346e().setValue(true);
        return mo100354j().mo100443i();
    }

    public NotificationVM() {
        C62496e eVar;
        C89219l.m154721d(this, "");
        C61933a.f140586a = new WeakReference<>(this);
        C61933a.C61943d a = C61933a.f140588c.mo100003a(false);
        if (a != null) {
            a.f140608c = true;
            eVar = a.f140607b;
        } else {
            eVar = null;
        }
        C61933a.f140587b = null;
        if (eVar != null) {
            m112816l().put(Integer.valueOf(C61530a.C61532b.m111445a()), eVar);
        }
    }

    /* renamed from: b */
    public final C62455c mo100373b(int i) {
        C62455c cVar = m112816l().get(Integer.valueOf(i));
        if (cVar == null) {
            if (i == C61530a.C61532b.m111445a()) {
                cVar = new C62474d();
            } else {
                cVar = new C62455c(i);
            }
            m112816l().put(Integer.valueOf(i), cVar);
        }
        return cVar;
    }
}
