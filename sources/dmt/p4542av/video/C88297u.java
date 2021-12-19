package dmt.p4542av.video;

import com.bytedance.covode.number.Covode;

/* renamed from: dmt.av.video.u */
public final class C88297u {

    /* renamed from: n */
    public static final C88298a f200368n = new C88298a((byte) 0);

    /* renamed from: a */
    public int f200369a;

    /* renamed from: b */
    public int f200370b;

    /* renamed from: c */
    public int f200371c;

    /* renamed from: d */
    public int f200372d;

    /* renamed from: e */
    public int f200373e;

    /* renamed from: f */
    public boolean f200374f;

    /* renamed from: g */
    public boolean f200375g;

    /* renamed from: h */
    public long f200376h;

    /* renamed from: i */
    public Boolean f200377i;

    /* renamed from: j */
    public int f200378j;

    /* renamed from: k */
    public int f200379k;

    /* renamed from: l */
    public final boolean f200380l;

    /* renamed from: m */
    public final boolean f200381m;

    static {
        Covode.recordClassIndex(104332);
    }

    /* renamed from: a */
    public static final C88297u m153440a(int i, int i2, int i3, int i4, int i5) {
        return C88298a.m153448a(i, i2, i3, i4, i5, false, false, 960);
    }

    /* renamed from: a */
    public static final C88297u m153441a(int i, int i2, int i3, int i4, int i5, boolean z) {
        return C88298a.m153447a(i, i2, i3, i4, i5, z);
    }

    /* renamed from: a */
    public static final C88297u m153442a(int i, int i2, int i3, int i4, boolean z) {
        return C88298a.m153448a(i, 0, i2, i3, i4, true, z, 512);
    }

    /* renamed from: b */
    public static final C88297u m153443b(int i, int i2, int i3, int i4, int i5) {
        return C88298a.m153445a(i, i2, i3, i4, i5);
    }

    /* renamed from: dmt.av.video.u$a */
    public static final class C88298a {
        static {
            Covode.recordClassIndex(104333);
        }

        private C88298a() {
        }

        public /* synthetic */ C88298a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C88297u m153445a(int i, int i2, int i3, int i4, int i5) {
            C88297u uVar = new C88297u(i);
            uVar.f200369a = i5;
            uVar.f200370b = 0;
            uVar.f200371c = i2;
            uVar.f200372d = i3;
            uVar.f200373e = i4;
            return uVar;
        }

        /* renamed from: a */
        public static C88297u m153447a(int i, int i2, int i3, int i4, int i5, boolean z) {
            C88297u uVar = new C88297u(i);
            uVar.f200369a = i5;
            uVar.f200370b = 0;
            uVar.f200371c = i2;
            uVar.f200372d = i3;
            uVar.f200373e = i4;
            uVar.f200374f = z;
            uVar.f200375g = true;
            return uVar;
        }

        /* renamed from: a */
        public static /* synthetic */ C88297u m153448a(int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, int i6) {
            boolean z3 = z;
            boolean z4 = z2;
            if ((i6 & 64) != 0) {
                z3 = true;
            }
            if ((i6 & 256) != 0) {
                z4 = false;
            }
            return m153446a(i, i2, i3, i4, i5, 0, z3, false, z4);
        }

        /* renamed from: a */
        private static C88297u m153446a(int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2, boolean z3) {
            C88297u uVar = new C88297u(1, i, z, false);
            uVar.f200369a = i5;
            uVar.f200370b = 0;
            uVar.f200371c = i2;
            uVar.f200372d = i3;
            uVar.f200373e = i4;
            uVar.f200374f = z3;
            uVar.f200375g = false;
            return uVar;
        }
    }

    /* renamed from: a */
    public final C88297u mo142784a() {
        this.f200377i = true;
        return this;
    }

    public /* synthetic */ C88297u(int i) {
        this(0, i, true, false);
    }

    public C88297u(int i, int i2, boolean z, boolean z2) {
        this.f200378j = i;
        this.f200379k = i2;
        this.f200380l = z;
        this.f200381m = z2;
        this.f200376h = 300;
    }
}
