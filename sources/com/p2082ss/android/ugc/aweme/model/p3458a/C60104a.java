package com.p2082ss.android.ugc.aweme.model.p3458a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.tools.p4118f.AbstractC78597a;
import com.p2082ss.android.ugc.aweme.tools.p4118f.AbstractC78598b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.model.a.a */
public final class C60104a {

    /* renamed from: a */
    public final String f136976a;

    /* renamed from: b */
    public final String f136977b;

    /* renamed from: c */
    public final Music f136978c;

    /* renamed from: d */
    public final String f136979d;

    /* renamed from: e */
    public final String f136980e;

    /* renamed from: f */
    public final String f136981f;

    /* renamed from: g */
    public final boolean f136982g;

    /* renamed from: h */
    public final String f136983h;

    /* renamed from: i */
    public final String f136984i;

    /* renamed from: j */
    public final String f136985j;

    /* renamed from: k */
    public final boolean f136986k;

    /* renamed from: l */
    public final String f136987l;

    /* renamed from: m */
    public final Integer f136988m;

    /* renamed from: n */
    public final AbstractC78597a f136989n;

    /* renamed from: o */
    public final AbstractC78598b f136990o;

    static {
        Covode.recordClassIndex(70615);
    }

    public C60104a() {
        this(null, null, null, null, null, null, null, false, null, null, 32767);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C60104a)) {
            return false;
        }
        C60104a aVar = (C60104a) obj;
        return C89219l.m154714a(this.f136976a, aVar.f136976a) && C89219l.m154714a(this.f136977b, aVar.f136977b) && C89219l.m154714a(this.f136978c, aVar.f136978c) && C89219l.m154714a(this.f136979d, aVar.f136979d) && C89219l.m154714a(this.f136980e, aVar.f136980e) && C89219l.m154714a(this.f136981f, aVar.f136981f) && this.f136982g == aVar.f136982g && C89219l.m154714a(this.f136983h, aVar.f136983h) && C89219l.m154714a(this.f136984i, aVar.f136984i) && C89219l.m154714a(this.f136985j, aVar.f136985j) && this.f136986k == aVar.f136986k && C89219l.m154714a(this.f136987l, aVar.f136987l) && C89219l.m154714a(this.f136988m, aVar.f136988m) && C89219l.m154714a(this.f136989n, aVar.f136989n) && C89219l.m154714a(this.f136990o, aVar.f136990o);
    }

    public final int hashCode() {
        String str = this.f136976a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f136977b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Music music = this.f136978c;
        int hashCode3 = (hashCode2 + (music != null ? music.hashCode() : 0)) * 31;
        String str3 = this.f136979d;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f136980e;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f136981f;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        boolean z = this.f136982g;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode6 + i3) * 31;
        String str6 = this.f136983h;
        int hashCode7 = (i6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.f136984i;
        int hashCode8 = (hashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.f136985j;
        int hashCode9 = (hashCode8 + (str8 != null ? str8.hashCode() : 0)) * 31;
        if (!this.f136986k) {
            i2 = 0;
        }
        int i7 = (hashCode9 + i2) * 31;
        String str9 = this.f136987l;
        int hashCode10 = (i7 + (str9 != null ? str9.hashCode() : 0)) * 31;
        Integer num = this.f136988m;
        int hashCode11 = (hashCode10 + (num != null ? num.hashCode() : 0)) * 31;
        AbstractC78597a aVar = this.f136989n;
        int hashCode12 = (hashCode11 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        AbstractC78598b bVar = this.f136990o;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return hashCode12 + i;
    }

    public final String toString() {
        return "PropReuseConfig(creationId=" + this.f136976a + ", shootWay=" + this.f136977b + ", music=" + this.f136978c + ", musicOrigin=" + this.f136979d + ", groupId=" + this.f136980e + ", enterFrom=" + this.f136981f + ", isAutoTryNext=" + this.f136982g + ", from=" + this.f136983h + ", stickerFrom=" + this.f136984i + ", gradeKey=" + this.f136985j + ", isNeedShowLoading=" + this.f136986k + ", giphyIds=" + this.f136987l + ", videoLength=" + this.f136988m + ", reuseStickerDAInterceptor=" + this.f136989n + ", reuseStickerDownloadFinishListener=" + this.f136990o + ")";
    }

    /* renamed from: com.ss.android.ugc.aweme.model.a.a$a */
    public static final class C60105a {

        /* renamed from: a */
        public Music f136991a;

        /* renamed from: b */
        public String f136992b;

        /* renamed from: c */
        public String f136993c;

        /* renamed from: d */
        public String f136994d = "";

        /* renamed from: e */
        public String f136995e = "";

        /* renamed from: f */
        public boolean f136996f = true;

        /* renamed from: g */
        public Integer f136997g;

        /* renamed from: h */
        public AbstractC78598b f136998h;

        /* renamed from: i */
        private String f136999i;

        /* renamed from: j */
        private String f137000j;

        /* renamed from: k */
        private String f137001k;

        /* renamed from: l */
        private boolean f137002l;

        /* renamed from: m */
        private String f137003m = "";

        /* renamed from: n */
        private String f137004n = "";

        /* renamed from: o */
        private AbstractC78597a f137005o;

        static {
            Covode.recordClassIndex(70616);
        }

        /* renamed from: a */
        public final C60104a mo97711a() {
            return new C60104a(this.f136999i, this.f137000j, this.f136991a, this.f137001k, this.f136992b, this.f136993c, this.f137002l, this.f136994d, this.f136995e, this.f137003m, this.f136996f, this.f137004n, this.f136997g, this.f137005o, this.f136998h);
        }

        /* renamed from: a */
        public final C60105a mo97709a(AbstractC78597a aVar) {
            C89219l.m154721d(aVar, "");
            this.f137005o = aVar;
            return this;
        }

        /* renamed from: b */
        public final C60105a mo97712b(String str) {
            C89219l.m154721d(str, "");
            this.f137001k = str;
            return this;
        }

        /* renamed from: a */
        public final C60105a mo97710a(String str) {
            C89219l.m154721d(str, "");
            this.f137000j = str;
            return this;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C60104a(java.lang.String r17, com.p2082ss.android.ugc.aweme.music.model.Music r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, boolean r24, java.lang.String r25, java.lang.Integer r26, int r27) {
        /*
            r16 = this;
            r1 = r27
            r11 = r24
            r10 = r23
            r9 = r22
            r8 = r21
            r2 = r17
            r3 = r18
            r4 = r19
            r6 = r20
            r0 = r1 & 2
            r13 = 0
            if (r0 == 0) goto L_0x0018
            r2 = r13
        L_0x0018:
            r0 = r1 & 4
            if (r0 == 0) goto L_0x001d
            r3 = r13
        L_0x001d:
            r0 = r1 & 8
            if (r0 == 0) goto L_0x0022
            r4 = r13
        L_0x0022:
            r0 = r1 & 32
            if (r0 == 0) goto L_0x0027
            r6 = r13
        L_0x0027:
            r0 = r1 & 128(0x80, float:1.794E-43)
            java.lang.String r12 = ""
            if (r0 == 0) goto L_0x002e
            r8 = r12
        L_0x002e:
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0033
            r9 = r12
        L_0x0033:
            r0 = r1 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0038
            r10 = r12
        L_0x0038:
            r0 = r1 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x003e
            r0 = 1
            r11 = 1
        L_0x003e:
            r0 = r1 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0054
        L_0x0042:
            r0 = r1 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x0051
        L_0x0046:
            r1 = 0
            r5 = 0
            r7 = 0
            r14 = 0
            r15 = 0
            r0 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        L_0x0051:
            r13 = r26
            goto L_0x0046
        L_0x0054:
            r12 = r25
            goto L_0x0042
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.model.p3458a.C60104a.<init>(java.lang.String, com.ss.android.ugc.aweme.music.model.Music, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.Integer, int):void");
    }

    public C60104a(String str, String str2, Music music, String str3, String str4, String str5, boolean z, String str6, String str7, String str8, boolean z2, String str9, Integer num, AbstractC78597a aVar, AbstractC78598b bVar) {
        C89219l.m154721d(str6, "");
        C89219l.m154721d(str7, "");
        C89219l.m154721d(str8, "");
        C89219l.m154721d(str9, "");
        this.f136976a = str;
        this.f136977b = str2;
        this.f136978c = music;
        this.f136979d = str3;
        this.f136980e = str4;
        this.f136981f = str5;
        this.f136982g = z;
        this.f136983h = str6;
        this.f136984i = str7;
        this.f136985j = str8;
        this.f136986k = z2;
        this.f136987l = str9;
        this.f136988m = num;
        this.f136989n = aVar;
        this.f136990o = bVar;
    }
}
