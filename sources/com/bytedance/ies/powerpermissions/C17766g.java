package com.bytedance.ies.powerpermissions;

import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.entry.p873a.p876c.C13390a;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.powerpermissions.g */
public final class C17766g extends AbstractC17764e {

    /* renamed from: b */
    public static final C17767a f42431b = new C17767a((byte) 0);

    static {
        Covode.recordClassIndex(20330);
    }

    /* renamed from: com.bytedance.ies.powerpermissions.g$a */
    public static final class C17767a {
        static {
            Covode.recordClassIndex(20331);
        }

        private C17767a() {
        }

        public /* synthetic */ C17767a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.powerpermissions.AbstractC17764e
    /* renamed from: a */
    public final void mo28239a(C17775m mVar, String... strArr) {
        C89219l.m154719c(strArr, "");
        if (mVar != null) {
            PrivacyCert privacyCert = mVar.f42446e;
            if (privacyCert == null || C13390a.C13391a.m24077a(strArr, privacyCert) == null) {
                mVar.mo28245a();
            } else {
                mVar.mo28247b();
            }
        }
    }
}
