package com.p2082ss.android.ugc.aweme.property;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.property.ef */
public final class C65450ef {

    /* renamed from: m */
    public static final C65451a f147620m = new C65451a((byte) 0);

    /* renamed from: a */
    public int f147621a;

    /* renamed from: b */
    public boolean f147622b;
    @AbstractC27891c(mo46611a = "max_speed")

    /* renamed from: c */
    public final int f147623c;
    @AbstractC27891c(mo46611a = "compile_video_size_index")

    /* renamed from: d */
    public final int f147624d;
    @AbstractC27891c(mo46611a = "high_quality_compile_video_size_index")

    /* renamed from: e */
    public final int f147625e;
    @AbstractC27891c(mo46611a = "ve_synthesis_settings")

    /* renamed from: f */
    public final String f147626f;
    @AbstractC27891c(mo46611a = "high_quality_ve_synthesis_settings")

    /* renamed from: g */
    public final String f147627g;
    @AbstractC27891c(mo46611a = "use_smart_compile")

    /* renamed from: h */
    public final boolean f147628h;
    @AbstractC27891c(mo46611a = "high_quality_use_smart_compile")

    /* renamed from: i */
    public final boolean f147629i;
    @AbstractC27891c(mo46611a = "upload_socket_num")

    /* renamed from: j */
    public final int f147630j;
    @AbstractC27891c(mo46611a = "bitrate_of_recode_threshold")

    /* renamed from: k */
    public final int f147631k;
    @AbstractC27891c(mo46611a = "high_quality_bitrate_of_recode_threshold")

    /* renamed from: l */
    public final int f147632l;

    static {
        Covode.recordClassIndex(76937);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C65450ef)) {
            return false;
        }
        C65450ef efVar = (C65450ef) obj;
        return this.f147623c == efVar.f147623c && this.f147624d == efVar.f147624d && this.f147625e == efVar.f147625e && C89219l.m154714a(this.f147626f, efVar.f147626f) && C89219l.m154714a(this.f147627g, efVar.f147627g) && this.f147628h == efVar.f147628h && this.f147629i == efVar.f147629i && this.f147630j == efVar.f147630j && this.f147631k == efVar.f147631k && this.f147632l == efVar.f147632l;
    }

    public final int hashCode() {
        int i = ((((this.f147623c * 31) + this.f147624d) * 31) + this.f147625e) * 31;
        String str = this.f147626f;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f147627g;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        int i3 = (hashCode + i2) * 31;
        boolean z = this.f147628h;
        int i4 = 1;
        if (z) {
            z = true;
        }
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = z ? 1 : 0;
        int i8 = (i3 + i5) * 31;
        if (!this.f147629i) {
            i4 = 0;
        }
        return ((((((i8 + i4) * 31) + this.f147630j) * 31) + this.f147631k) * 31) + this.f147632l;
    }

    public final String toString() {
        return "UploadSpeedEncodeSettings(maxSpeed=" + this.f147623c + ", compileVideoSizeIndex=" + this.f147624d + ", highQualityCompileVideoSizeIndex=" + this.f147625e + ", veSynthesisSettings=" + this.f147626f + ", highQualityVeSynthesisSettings=" + this.f147627g + ", useSmartCompile=" + this.f147628h + ", highQualityUseSmartCompile=" + this.f147629i + ", uploadSocketNum=" + this.f147630j + ", bitrateOfRecodeThreshold=" + this.f147631k + ", highQualityBitrateOfRecodeThreshold=" + this.f147632l + ")";
    }

    /* renamed from: com.ss.android.ugc.aweme.property.ef$a */
    public static final class C65451a {
        static {
            Covode.recordClassIndex(76938);
        }

        private C65451a() {
        }

        public /* synthetic */ C65451a(byte b) {
            this();
        }
    }

    private /* synthetic */ C65450ef() {
        this(C65502y.m117230a(), C65382bv.m117079a(), C65447ec.m117166a(), C65447ec.m117167b(), C65475h.m117202a(), C65381bu.m117078a());
    }

    private C65450ef(int i, int i2, String str, String str2, int i3, int i4) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f147623c = -1;
        this.f147624d = i;
        this.f147625e = i2;
        this.f147626f = str;
        this.f147627g = str2;
        this.f147628h = false;
        this.f147629i = false;
        this.f147630j = 1;
        this.f147631k = i3;
        this.f147632l = i4;
        this.f147621a = -1;
    }
}
