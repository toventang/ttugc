package com.p2082ss.android.vesdk;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.vesdk.ar */
public final class C85322ar {

    /* renamed from: A */
    public EnumC85325c f190982A = EnumC85325c.LV_GRAPH_TYPE;

    /* renamed from: B */
    public VEDisplaySettings f190983B;

    /* renamed from: C */
    public boolean f190984C;

    /* renamed from: D */
    public boolean f190985D = true;

    /* renamed from: E */
    public boolean f190986E = true;

    /* renamed from: F */
    public boolean f190987F;

    /* renamed from: G */
    public boolean f190988G = false;

    /* renamed from: a */
    public VESize f190989a = new VESize(720, 1280);

    /* renamed from: b */
    public boolean f190990b = false;

    /* renamed from: c */
    public boolean f190991c = false;

    /* renamed from: d */
    public boolean f190992d = false;

    /* renamed from: e */
    public boolean f190993e = false;

    /* renamed from: f */
    public boolean f190994f = false;

    /* renamed from: g */
    public int f190995g = 30;

    /* renamed from: h */
    public boolean f190996h = false;

    /* renamed from: i */
    public boolean f190997i;

    /* renamed from: j */
    public boolean f190998j;

    /* renamed from: k */
    public boolean f190999k;

    /* renamed from: l */
    public boolean f191000l;

    /* renamed from: m */
    public boolean f191001m;

    /* renamed from: n */
    public boolean f191002n;

    /* renamed from: o */
    public boolean f191003o;

    /* renamed from: p */
    public long f191004p;

    /* renamed from: q */
    public boolean f191005q;

    /* renamed from: r */
    public boolean f191006r;

    /* renamed from: s */
    public EnumC85324b f191007s = EnumC85324b.RecordFullContent;

    /* renamed from: t */
    public boolean f191008t = false;

    /* renamed from: u */
    public int f191009u = Integer.MAX_VALUE;

    /* renamed from: v */
    public int f191010v;

    /* renamed from: w */
    public boolean f191011w = false;

    /* renamed from: x */
    public boolean f191012x = false;

    /* renamed from: y */
    public boolean f191013y = true;

    /* renamed from: z */
    public EnumC85326d f191014z = EnumC85326d.Default;

    static {
        Covode.recordClassIndex(99433);
    }

    /* renamed from: com.ss.android.vesdk.ar$a */
    public static class C85323a {

        /* renamed from: a */
        public C85322ar f191015a;

        static {
            Covode.recordClassIndex(99434);
        }

        /* renamed from: a */
        public final C85323a mo130630a() {
            this.f191015a.f191000l = true;
            return this;
        }

        /* renamed from: b */
        public final C85323a mo130636b() {
            this.f191015a.f191002n = true;
            return this;
        }

        /* renamed from: c */
        public final C85323a mo130638c() {
            this.f191015a.f191003o = true;
            return this;
        }

        /* renamed from: d */
        public final C85323a mo130640d() {
            this.f191015a.f190984C = true;
            return this;
        }

        /* renamed from: e */
        public final C85323a mo130642e() {
            this.f191015a.f190985D = false;
            return this;
        }

        /* renamed from: f */
        public final C85323a mo130644f() {
            this.f191015a.f190986E = false;
            return this;
        }

        public C85323a() {
            C85322ar arVar = new C85322ar();
            this.f191015a = arVar;
            arVar.f190995g = ((Integer) C85568t.m147473a().mo131557a("ve_titan_max_count_of_render_frame_buffer", Integer.valueOf(this.f191015a.f190995g))).intValue();
            C85315al.m146637a("VEPreviewSettings", "AB maxCountOfBufCache: " + this.f191015a.f190995g);
        }

        /* renamed from: a */
        public final C85323a mo130631a(long j) {
            this.f191015a.f191004p = j;
            return this;
        }

        /* renamed from: b */
        public final C85323a mo130637b(boolean z) {
            this.f191015a.f190991c = z;
            return this;
        }

        /* renamed from: c */
        public final C85323a mo130639c(boolean z) {
            this.f191015a.f190997i = z;
            return this;
        }

        /* renamed from: d */
        public final C85323a mo130641d(boolean z) {
            this.f191015a.f190998j = z;
            return this;
        }

        /* renamed from: e */
        public final C85323a mo130643e(boolean z) {
            this.f191015a.f191001m = z;
            return this;
        }

        /* renamed from: f */
        public final C85323a mo130645f(boolean z) {
            this.f191015a.f191008t = z;
            return this;
        }

        /* renamed from: a */
        public final C85323a mo130632a(VEDisplaySettings vEDisplaySettings) {
            this.f191015a.f190983B = vEDisplaySettings;
            return this;
        }

        /* renamed from: a */
        public final C85323a mo130633a(VESize vESize) {
            this.f191015a.f190989a = vESize;
            return this;
        }

        /* renamed from: a */
        public final C85323a mo130634a(EnumC85325c cVar) {
            this.f191015a.f190982A = cVar;
            return this;
        }

        /* renamed from: a */
        public final C85323a mo130635a(boolean z) {
            this.f191015a.f190990b = z;
            return this;
        }
    }

    /* renamed from: com.ss.android.vesdk.ar$b */
    public enum EnumC85324b {
        RecordOriginContent,
        RecordEffectContent,
        RecordFullContent,
        RecordIntermediateContent;

        static {
            Covode.recordClassIndex(99435);
        }
    }

    /* renamed from: com.ss.android.vesdk.ar$c */
    public enum EnumC85325c {
        LV_GRAPH_TYPE,
        AWESOME_GRAPH_TYPE,
        QR_CODE_GRAPH;

        static {
            Covode.recordClassIndex(99436);
        }
    }

    /* renamed from: com.ss.android.vesdk.ar$d */
    public enum EnumC85326d {
        Default,
        Pro;

        static {
            Covode.recordClassIndex(99437);
        }
    }
}
