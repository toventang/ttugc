package com.bytedance.bdlocation.p846a;

import android.text.TextUtils;
import com.bytedance.bdlocation.BDLocation;
import com.bytedance.bdlocation.C13182f;
import com.bytedance.bdlocation.service.C13190a;
import com.bytedance.bdlocation.utils.C13229b;
import com.bytedance.bpea.basics.AbstractC13343d;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.bdlocation.a.a */
public final class C13149a {

    /* renamed from: a */
    public C13156e f32034a;

    /* renamed from: b */
    public int f32035b;

    /* renamed from: c */
    private String f32036c;

    /* renamed from: d */
    private AbstractC13152b f32037d = new AbstractC13152b() {
        /* class com.bytedance.bdlocation.p846a.C13149a.C131501 */

        static {
            Covode.recordClassIndex(15097);
        }

        @Override // com.bytedance.bdlocation.p846a.C13149a.AbstractC13152b
        /* renamed from: a */
        public final void mo21245a(int i) {
            C13149a.this.f32035b = i;
        }
    };

    /* renamed from: com.bytedance.bdlocation.a.a$a */
    public interface AbstractC13151a {
        static {
            Covode.recordClassIndex(15098);
        }

        /* renamed from: a */
        void mo21246a(BDLocation bDLocation);

        /* renamed from: a */
        void mo21247a(C13154c cVar);
    }

    /* renamed from: com.bytedance.bdlocation.a.a$b */
    public interface AbstractC13152b {
        static {
            Covode.recordClassIndex(15099);
        }

        /* renamed from: a */
        void mo21245a(int i);
    }

    static {
        Covode.recordClassIndex(15096);
    }

    /* renamed from: a */
    public final C13149a mo21243a(long j) {
        this.f32034a.f32082d = j;
        return this;
    }

    public C13149a(String str) {
        this.f32036c = str;
        C13156e eVar = new C13156e(this.f32036c);
        this.f32034a = eVar;
        eVar.f32080b = 30000;
    }

    /* renamed from: b */
    public final void mo21244b(AbstractC13343d dVar) {
        if (dVar != null) {
            String certToken = dVar.certToken();
            if (!TextUtils.isEmpty(certToken)) {
                this.f32034a.f32079a = certToken;
            }
        }
    }

    /* renamed from: a */
    public final BDLocation mo21242a(AbstractC13343d dVar) {
        C13153b.m23670a();
        C13229b.m23789a(dVar, "getLocation");
        mo21244b(dVar);
        if (this.f32034a.f32081c != 0) {
            this.f32034a.f32081c = 0;
        }
        C13156e eVar = new C13156e(this.f32034a);
        eVar.f32089k = dVar;
        return C13190a.m23731a().mo21311a(eVar);
    }

    /* renamed from: c */
    public static BDLocation m23662c(AbstractC13343d dVar) {
        C13229b.m23789a(dVar, "getLastKnowLocation");
        if (!C13182f.m23709a()) {
            C13154c cVar = new C13154c("No Location Permission", "Unknown", "30");
            C13190a.m23731a().f32206a.mo21286b();
            throw cVar;
        } else if (C13182f.m23712b()) {
            try {
                return C13190a.m23731a().f32206a.mo21282a().f32190c;
            } catch (Exception unused) {
                return null;
            }
        } else {
            C13154c cVar2 = new C13154c("Device did not enable location service", "Unknown", "1");
            C13190a.m23731a().f32206a.mo21286b();
            throw cVar2;
        }
    }
}
