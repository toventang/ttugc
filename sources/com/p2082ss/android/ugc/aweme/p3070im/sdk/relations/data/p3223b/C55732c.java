package com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.p3223b;

import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.b.c */
public final class C55732c {

    /* renamed from: n */
    public static final C55733a f127109n = new C55733a((byte) 0);

    /* renamed from: a */
    public Boolean f127110a;

    /* renamed from: b */
    public String f127111b;

    /* renamed from: c */
    public boolean f127112c;

    /* renamed from: d */
    public boolean f127113d;

    /* renamed from: e */
    public boolean f127114e;

    /* renamed from: f */
    public boolean f127115f;

    /* renamed from: g */
    public boolean f127116g;

    /* renamed from: h */
    public List<String> f127117h;

    /* renamed from: i */
    public boolean f127118i;

    /* renamed from: j */
    public boolean f127119j;

    /* renamed from: k */
    public EnumC55734b f127120k;

    /* renamed from: l */
    public final int f127121l;

    /* renamed from: m */
    public final boolean f127122m;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.b.c$b */
    public enum EnumC55734b {
        LONG_PRESS,
        NORMAL;

        static {
            Covode.recordClassIndex(65520);
        }
    }

    static {
        Covode.recordClassIndex(65518);
    }

    public C55732c() {
        this(false, 3);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.b.c$a */
    public static final class C55733a {
        static {
            Covode.recordClassIndex(65519);
        }

        private C55733a() {
        }

        public /* synthetic */ C55733a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final boolean mo92609a() {
        if (this.f127121l == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo92610b() {
        int i = this.f127121l;
        if (i == 1 || i == 2 || i == 3) {
            return true;
        }
        return false;
    }

    public C55732c(int i, boolean z) {
        this.f127121l = i;
        this.f127122m = z;
        this.f127112c = true;
        this.f127113d = true;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C55732c(boolean z, int i) {
        this(0, (i & 2) != 0 ? false : z);
    }
}
