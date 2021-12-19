package com.p2082ss.android.ugc.aweme.p2282ad.settings;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ad.settings.f */
public final class C33388f {

    /* renamed from: a */
    public static final C33389a f79338a = new C33389a((byte) 0);

    /* renamed from: b */
    public static final C33388f f79339b = new C33388f();

    /* renamed from: c */
    private static final AbstractC89244h f79340c = C89250i.m154773a((AbstractC89171a) C33390b.f79343a);

    /* renamed from: a */
    public static final C33389a m68471a() {
        return (C33389a) f79340c.getValue();
    }

    private C33388f() {
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.settings.f$a */
    public static final class C33389a {
        @AbstractC27891c(mo46611a = "max_upload_fail_url")

        /* renamed from: a */
        public final int f79341a;
        @AbstractC27891c(mo46611a = "sampling_rate")

        /* renamed from: b */
        public final int f79342b;

        static {
            Covode.recordClassIndex(40237);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C33389a)) {
                return false;
            }
            C33389a aVar = (C33389a) obj;
            return this.f79341a == aVar.f79341a && this.f79342b == aVar.f79342b;
        }

        public final int hashCode() {
            return (this.f79341a * 31) + this.f79342b;
        }

        public final String toString() {
            return "UAWPIConfig(maxUploadFailUrl=" + this.f79341a + ", samplingRate=" + this.f79342b + ")";
        }

        private C33389a() {
            this.f79341a = 50;
            this.f79342b = 3;
        }

        public /* synthetic */ C33389a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.settings.f$b */
    static final class C33390b extends AbstractC89220m implements AbstractC89171a<C33389a> {

        /* renamed from: a */
        public static final C33390b f79343a = new C33390b();

        static {
            Covode.recordClassIndex(40238);
        }

        C33390b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C33389a invoke() {
            Object a = SettingsManager.m29616a().mo25397a("upload_ad_web_preload_info_config", C33389a.class, C33388f.f79338a);
            if (a == null) {
                a = C33388f.f79338a;
            }
            C89219l.m154716b(a, "");
            return a;
        }
    }

    static {
        Covode.recordClassIndex(40236);
    }
}
