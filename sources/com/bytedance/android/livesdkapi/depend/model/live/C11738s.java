package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.bytedance.android.livesdkapi.depend.model.live.s */
public class C11738s {
    @AbstractC27891c(mo46611a = "ngb_push_url")

    /* renamed from: a */
    public String f28093a = "";
    @AbstractC27891c(mo46611a = "ngb_push_url_postfix")

    /* renamed from: b */
    public String f28094b = "";
    @AbstractC27891c(mo46611a = "height")

    /* renamed from: c */
    public int f28095c = 640;
    @AbstractC27891c(mo46611a = "width")

    /* renamed from: d */
    public int f28096d = 360;
    @AbstractC27891c(mo46611a = "min_bitrate")

    /* renamed from: e */
    public int f28097e = 200;
    @AbstractC27891c(mo46611a = "default_bitrate")

    /* renamed from: f */
    public int f28098f = 500;
    @AbstractC27891c(mo46611a = "max_bitrate")

    /* renamed from: g */
    public int f28099g = 800;
    @AbstractC27891c(mo46611a = "video_profile")

    /* renamed from: h */
    public int f28100h = 1;
    @AbstractC27891c(mo46611a = "hardware_encode")

    /* renamed from: i */
    public boolean f28101i;
    @AbstractC27891c(mo46611a = "bitrate_adapt_strategy")

    /* renamed from: j */
    public int f28102j;
    @AbstractC27891c(mo46611a = "fps")

    /* renamed from: k */
    public int f28103k = 15;
    @AbstractC27891c(mo46611a = "anchor_interact_profile")

    /* renamed from: l */
    public int f28104l;
    @AbstractC27891c(mo46611a = "audience_interact_profile")

    /* renamed from: m */
    public int f28105m;
    @AbstractC27891c(mo46611a = "super_resolution")

    /* renamed from: n */
    public C11739a f28106n;
    @AbstractC27891c(mo46611a = "bytevc1_enable")

    /* renamed from: o */
    public boolean f28107o;
    @AbstractC27891c(mo46611a = "gop_sec")

    /* renamed from: p */
    public float f28108p = 2.0f;
    @AbstractC27891c(mo46611a = "bframe_enable")

    /* renamed from: q */
    public boolean f28109q = true;
    @AbstractC27891c(mo46611a = "roi")

    /* renamed from: r */
    public boolean f28110r;
    @AbstractC27891c(mo46611a = "sw_roi")

    /* renamed from: s */
    public boolean f28111s;

    /* renamed from: t */
    public int f28112t;

    /* renamed from: u */
    public int f28113u;

    static {
        Covode.recordClassIndex(13426);
    }

    /* renamed from: com.bytedance.android.livesdkapi.depend.model.live.s$a */
    public static class C11739a {
        @AbstractC27891c(mo46611a = "enable")

        /* renamed from: a */
        public boolean f28114a;
        @AbstractC27891c(mo46611a = "antialiasing")

        /* renamed from: b */
        public boolean f28115b;
        @AbstractC27891c(mo46611a = "strength")

        /* renamed from: c */
        public int f28116c;

        static {
            Covode.recordClassIndex(13427);
        }

        public C11739a() {
            this(false, false, 0);
        }

        public C11739a(boolean z, boolean z2, int i) {
            this.f28114a = z;
            this.f28115b = z2;
            this.f28116c = i;
        }
    }

    /* renamed from: a */
    public final int mo18701a() {
        if (this.f28095c == 0) {
            this.f28095c = 640;
        }
        return this.f28095c;
    }

    /* renamed from: b */
    public final int mo18702b() {
        if (this.f28096d == 0) {
            this.f28096d = 360;
        }
        return this.f28096d;
    }

    /* renamed from: c */
    public final int mo18703c() {
        if (this.f28097e == 0) {
            this.f28097e = 200;
        }
        return this.f28097e;
    }

    /* renamed from: d */
    public final int mo18704d() {
        if (this.f28098f == 0) {
            this.f28098f = 500;
        }
        return this.f28098f;
    }

    /* renamed from: f */
    public final int mo18706f() {
        if (this.f28103k == 0) {
            this.f28103k = 15;
        }
        return this.f28103k;
    }

    /* renamed from: e */
    public final int mo18705e() {
        if (this.f28099g == 0) {
            this.f28099g = (mo18704d() * 2) - mo18703c();
        }
        return this.f28099g;
    }
}
