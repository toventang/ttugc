package com.bytedance.ies.powerpermissions;

import androidx.fragment.app.ActivityC0945e;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.legoImp.task.PowerPermissionsTask;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.powerpermissions.l */
public final class C17773l implements AbstractC17748c {

    /* renamed from: b */
    public static LinkedList<AbstractC17764e> f42438b = new LinkedList<>();

    /* renamed from: c */
    public static boolean f42439c;

    /* renamed from: d */
    public static final C17774a f42440d = new C17774a((byte) 0);

    /* renamed from: a */
    public C17771k f42441a;

    /* renamed from: com.bytedance.ies.powerpermissions.l$a */
    public static final class C17774a {
        static {
            Covode.recordClassIndex(20338);
        }

        private C17774a() {
        }

        /* renamed from: a */
        public final void mo28244a() {
            MethodCollector.m26663i(531);
            if (!C17773l.f42439c) {
                synchronized (this) {
                    try {
                        if (!C17773l.f42439c) {
                            IGetInterceptor c = PowerPermissionsTask.m106298c();
                            C89219l.m154709a((Object) c, "");
                            List<AbstractC17764e> a = c.mo28217a();
                            if (a != null) {
                                for (T t : a) {
                                    C89219l.m154709a((Object) t, "");
                                    C89219l.m154719c(t, "");
                                    C17773l.f42438b.add(t);
                                }
                            }
                            C17773l.f42439c = true;
                        }
                    } finally {
                        MethodCollector.m26664o(531);
                    }
                }
                return;
            }
            MethodCollector.m26664o(531);
        }

        public /* synthetic */ C17774a(byte b) {
            this();
        }

        /* renamed from: a */
        public final AbstractC17748c mo28243a(ActivityC0945e eVar, PrivacyCert privacyCert) {
            C89219l.m154719c(eVar, "");
            mo28244a();
            C17773l lVar = new C17773l(eVar, (byte) 0);
            if (privacyCert != null) {
                C17771k kVar = lVar.f42441a;
                C89219l.m154719c(privacyCert, "");
                kVar.f42435b = privacyCert;
            }
            if (!C17773l.f42438b.isEmpty()) {
                Iterator<AbstractC17764e> it = C17773l.f42438b.iterator();
                while (it.hasNext()) {
                    AbstractC17764e next = it.next();
                    C89219l.m154709a((Object) next, "");
                    lVar.mo28228a(next);
                }
            }
            return lVar;
        }
    }

    static {
        Covode.recordClassIndex(20337);
    }

    /* renamed from: a */
    public static final AbstractC17748c m32969a(ActivityC0945e eVar) {
        return f42440d.mo28243a(eVar, null);
    }

    @Override // com.bytedance.ies.powerpermissions.AbstractC17748c
    /* renamed from: a */
    public final AbstractC17748c mo28228a(AbstractC17764e eVar) {
        C89219l.m154719c(eVar, "");
        return this.f42441a.mo28228a(eVar);
    }

    private C17773l(ActivityC0945e eVar) {
        C89219l.m154719c(eVar, "");
        C17771k kVar = new C17771k();
        kVar.f42434a = new WeakReference<>(eVar);
        this.f42441a = kVar;
    }

    @Override // com.bytedance.ies.powerpermissions.AbstractC17748c
    /* renamed from: a */
    public final AbstractC17748c mo28229a(String... strArr) {
        C89219l.m154719c(strArr, "");
        return this.f42441a.mo28229a((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // com.bytedance.ies.powerpermissions.AbstractC17748c
    /* renamed from: a */
    public final void mo28230a(AbstractC17765f fVar) {
        C89219l.m154719c(fVar, "");
        this.f42441a.mo28230a(fVar);
    }

    public /* synthetic */ C17773l(ActivityC0945e eVar, byte b) {
        this(eVar);
    }
}
