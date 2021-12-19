package com.bytedance.ies.ugc.aweme.network.zstd;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.ugc.aweme.network.zstd.b */
public final class C18110b {

    /* renamed from: a */
    public static final C18113c f43103a = null;

    /* renamed from: b */
    public static final C18110b f43104b = new C18110b();

    /* renamed from: com.bytedance.ies.ugc.aweme.network.zstd.b$c */
    public static final class C18113c {
        @AbstractC27891c(mo46611a = "zstd_dict")

        /* renamed from: a */
        public final C18112b f43109a;

        static {
            Covode.recordClassIndex(20753);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof C18113c) && C89219l.m154714a(this.f43109a, ((C18113c) obj).f43109a);
            }
            return true;
        }

        public final int hashCode() {
            C18112b bVar = this.f43109a;
            if (bVar != null) {
                return bVar.hashCode();
            }
            return 0;
        }

        public final String toString() {
            return "ZstdDictConfigWrapper(config=" + this.f43109a + ")";
        }
    }

    private C18110b() {
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.network.zstd.b$a */
    public static final class C18111a {
        @AbstractC27891c(mo46611a = "url")

        /* renamed from: a */
        public final String f43105a = null;
        @AbstractC27891c(mo46611a = "checksum")

        /* renamed from: b */
        public final String f43106b = null;

        static {
            Covode.recordClassIndex(20751);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C18111a)) {
                return false;
            }
            C18111a aVar = (C18111a) obj;
            return C89219l.m154714a(this.f43105a, aVar.f43105a) && C89219l.m154714a(this.f43106b, aVar.f43106b);
        }

        public final int hashCode() {
            String str = this.f43105a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f43106b;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            return "DictUrl(url=" + this.f43105a + ", checksum=" + this.f43106b + ")";
        }

        private C18111a() {
        }
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.network.zstd.b$b */
    public static final class C18112b {
        @AbstractC27891c(mo46611a = "path")

        /* renamed from: a */
        public final Map<String, String> f43107a = null;
        @AbstractC27891c(mo46611a = "version_url")

        /* renamed from: b */
        public final Map<String, C18111a> f43108b = null;

        static {
            Covode.recordClassIndex(20752);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C18112b)) {
                return false;
            }
            C18112b bVar = (C18112b) obj;
            return C89219l.m154714a(this.f43107a, bVar.f43107a) && C89219l.m154714a(this.f43108b, bVar.f43108b);
        }

        public final int hashCode() {
            Map<String, String> map = this.f43107a;
            int i = 0;
            int hashCode = (map != null ? map.hashCode() : 0) * 31;
            Map<String, C18111a> map2 = this.f43108b;
            if (map2 != null) {
                i = map2.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            return "ZstdDictConfig(path=" + this.f43107a + ", versionUrl=" + this.f43108b + ")";
        }

        private C18112b() {
        }
    }

    static {
        Covode.recordClassIndex(20750);
    }
}
