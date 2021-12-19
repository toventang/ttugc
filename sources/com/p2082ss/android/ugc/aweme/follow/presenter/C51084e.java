package com.p2082ss.android.ugc.aweme.follow.presenter;

import com.bytedance.covode.number.Covode;
import java.util.List;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.follow.presenter.e */
public final class C51084e {

    /* renamed from: e */
    public static final C51085a f117861e = new C51085a((byte) 0);

    /* renamed from: a */
    public String f117862a = "";

    /* renamed from: b */
    public String f117863b = "";

    /* renamed from: c */
    public String f117864c = "";

    /* renamed from: d */
    public String f117865d = "";

    /* renamed from: f */
    private Integer f117866f = 0;

    /* renamed from: g */
    private int f117867g;

    /* renamed from: h */
    private List<Long> f117868h = C89086z.INSTANCE;

    /* renamed from: i */
    private final int f117869i;

    /* renamed from: j */
    private final int f117870j;

    /* renamed from: k */
    private final int f117871k;

    /* renamed from: l */
    private final String f117872l;

    static {
        Covode.recordClassIndex(60278);
    }

    /* renamed from: com.ss.android.ugc.aweme.follow.presenter.e$a */
    public static final class C51085a {
        static {
            Covode.recordClassIndex(60279);
        }

        private C51085a() {
        }

        public /* synthetic */ C51085a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C51084e m95502a(int i, int i2, int i3, String str) {
            C89219l.m154721d(str, "");
            return new C51084e(i, i2, i3, str);
        }
    }

    /* renamed from: a */
    public final C51083d mo86497a() {
        return new C51083d(this.f117869i, this.f117870j, this.f117871k, this.f117872l, this.f117862a, this.f117866f, this.f117863b, this.f117864c, this.f117865d, this.f117867g, this.f117868h);
    }

    public C51084e(int i, int i2, int i3, String str) {
        C89219l.m154721d(str, "");
        this.f117869i = i;
        this.f117870j = i2;
        this.f117871k = i3;
        this.f117872l = str;
    }
}
