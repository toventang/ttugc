package com.p2082ss.android.ugc.aweme.kids.setting.items.language.p3380c;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.language.AbstractC58069b;
import java.util.Locale;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.setting.items.language.c.a */
public final class C57949a implements AbstractC58069b {

    /* renamed from: b */
    public static final C57950a f132106b = new C57950a((byte) 0);

    /* renamed from: a */
    public final String f132107a;

    /* renamed from: c */
    private Locale f132108c;

    /* renamed from: d */
    private String[] f132109d;

    /* renamed from: e */
    private final String f132110e;

    /* renamed from: f */
    private final String f132111f;

    /* renamed from: g */
    private final String f132112g;

    /* renamed from: h */
    private final String f132113h;

    static {
        Covode.recordClassIndex(67973);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.setting.items.language.c.a$a */
    public static final class C57950a {
        static {
            Covode.recordClassIndex(67974);
        }

        private C57950a() {
        }

        public /* synthetic */ C57950a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.language.AbstractC58069b
    /* renamed from: a */
    public final String mo90017a() {
        return this.f132110e;
    }

    @Override // com.p2082ss.android.ugc.aweme.language.AbstractC58069b
    /* renamed from: b */
    public final String mo90018b() {
        return this.f132111f;
    }

    @Override // com.p2082ss.android.ugc.aweme.language.AbstractC58069b
    /* renamed from: d */
    public final String[] mo90020d() {
        return this.f132109d;
    }

    @Override // com.p2082ss.android.ugc.aweme.language.AbstractC58069b
    /* renamed from: e */
    public final String mo90021e() {
        return this.f132112g;
    }

    @Override // com.p2082ss.android.ugc.aweme.language.AbstractC58069b
    /* renamed from: f */
    public final String mo90022f() {
        return this.f132113h;
    }

    @Override // com.p2082ss.android.ugc.aweme.language.AbstractC58069b
    /* renamed from: c */
    public final Locale mo90019c() {
        if (this.f132108c == null) {
            this.f132108c = new Locale(this.f132111f, this.f132107a);
        }
        return this.f132108c;
    }

    public /* synthetic */ C57949a(String str, String str2, String str3, String str4) {
        this(str, str2, str3, str4, str2);
    }

    public C57949a(String str, String str2, String str3, String str4, String str5) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        C89219l.m154721d(str5, "");
        this.f132110e = str;
        this.f132111f = str2;
        this.f132107a = str3;
        this.f132112g = str4;
        this.f132113h = str5;
    }
}
