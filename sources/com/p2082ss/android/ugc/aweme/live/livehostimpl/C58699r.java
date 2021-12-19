package com.p2082ss.android.ugc.aweme.live.livehostimpl;

import android.content.Context;
import com.bytedance.android.livesdkapi.AbstractC11748e;
import com.bytedance.android.livesdkapi.host.AbstractC11797b;
import com.bytedance.android.livesdkapi.p676d.AbstractC11619a;
import com.bytedance.android.livesdkapi.p676d.AbstractC11620b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1206f.C17309b;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.app.SharePrefCache;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.live.livehostimpl.r */
public final class C58699r implements AbstractC11797b {

    /* renamed from: a */
    private final AbstractC11620b f133623a = new C58700a((byte) 0);

    /* renamed from: b */
    private final AbstractC11748e f133624b = new C58701b(C17867d.m33078a());

    static {
        Covode.recordClassIndex(69001);
    }

    @Override // com.bytedance.android.live.base.AbstractC2953a
    public final void onInit() {
    }

    /* renamed from: com.ss.android.ugc.aweme.live.livehostimpl.r$a */
    static class C58700a implements AbstractC11620b {
        static {
            Covode.recordClassIndex(69002);
        }

        private C58700a() {
        }

        @Override // com.bytedance.android.livesdkapi.p676d.AbstractC11620b
        /* renamed from: a */
        public final void mo18415a() {
            AbstractC11619a.f27770c.mo13067a(true);
        }

        @Override // com.bytedance.android.livesdkapi.p676d.AbstractC11620b
        /* renamed from: b */
        public final boolean mo18416b() {
            return SharePrefCache.inst().isEnableMessagePb2Json().mo59941c().booleanValue();
        }

        /* synthetic */ C58700a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.AbstractC11797b
    /* renamed from: a */
    public final AbstractC11620b mo18858a() {
        return this.f133623a;
    }

    @Override // com.bytedance.android.livesdkapi.host.AbstractC11797b
    /* renamed from: b */
    public final AbstractC11748e mo18859b() {
        return this.f133624b;
    }

    C58699r() {
    }

    /* renamed from: com.ss.android.ugc.aweme.live.livehostimpl.r$b */
    static class C58701b implements AbstractC11748e {

        /* renamed from: a */
        private C17309b f133625a;

        /* renamed from: b */
        private Map<String, Object> f133626b = new HashMap();

        static {
            Covode.recordClassIndex(69003);
        }

        /* renamed from: a */
        private static void m107853a(boolean z) {
            if (!z) {
                throw new IllegalArgumentException();
            }
        }

        C58701b(Context context) {
            this.f133625a = C17309b.m32048a(context, "live-app-core-sdk");
        }

        @Override // com.bytedance.android.livesdkapi.AbstractC11748e
        /* renamed from: b */
        public final void mo18709b(AbstractC11748e.AbstractC11749a aVar) {
            boolean z;
            if (aVar.type() == AbstractC11748e.EnumC11750b.Boolean) {
                z = true;
            } else {
                z = false;
            }
            m107853a(z);
            this.f133626b.put(aVar.key(), Boolean.TRUE);
            if (aVar.supportPersist()) {
                this.f133625a.f41591a.edit().putBoolean(aVar.key(), true).apply();
            }
        }

        @Override // com.bytedance.android.livesdkapi.AbstractC11748e
        /* renamed from: a */
        public final boolean mo18708a(AbstractC11748e.AbstractC11749a aVar) {
            boolean z;
            if (aVar.type() == AbstractC11748e.EnumC11750b.Boolean) {
                z = true;
            } else {
                z = false;
            }
            m107853a(z);
            Boolean bool = (Boolean) this.f133626b.get(aVar.key());
            if (bool == null) {
                if (aVar.supportPersist()) {
                    bool = Boolean.valueOf(this.f133625a.mo27622a(aVar.key(), ((Boolean) aVar.defValue()).booleanValue()));
                } else {
                    bool = (Boolean) aVar.defValue();
                }
                this.f133626b.put(aVar.key(), bool);
            }
            return bool.booleanValue();
        }

        @Override // com.bytedance.android.livesdkapi.AbstractC11748e
        /* renamed from: c */
        public final int mo18710c(AbstractC11748e.AbstractC11749a aVar) {
            boolean z;
            if (aVar.type() == AbstractC11748e.EnumC11750b.Integer) {
                z = true;
            } else {
                z = false;
            }
            m107853a(z);
            Integer num = (Integer) this.f133626b.get(aVar.key());
            if (num == null) {
                if (aVar.supportPersist()) {
                    num = Integer.valueOf(this.f133625a.mo27617a(aVar.key(), ((Integer) aVar.defValue()).intValue()));
                } else {
                    num = (Integer) aVar.defValue();
                }
                this.f133626b.put(aVar.key(), num);
            }
            return num.intValue();
        }

        @Override // com.bytedance.android.livesdkapi.AbstractC11748e
        /* renamed from: a */
        public final void mo18707a(AbstractC11748e.AbstractC11749a aVar, int i) {
            boolean z;
            if (aVar.type() == AbstractC11748e.EnumC11750b.Integer) {
                z = true;
            } else {
                z = false;
            }
            m107853a(z);
            this.f133626b.put(aVar.key(), Integer.valueOf(i));
            if (aVar.supportPersist()) {
                this.f133625a.f41591a.edit().putInt(aVar.key(), i).apply();
            }
        }
    }
}
