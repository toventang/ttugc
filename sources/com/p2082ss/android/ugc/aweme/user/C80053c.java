package com.p2082ss.android.ugc.aweme.user;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.user.c */
public final class C80053c {

    /* renamed from: h */
    public static final C80054a f179383h = new C80054a((byte) 0);
    @AbstractC27891c(mo46611a = "uid")

    /* renamed from: a */
    public final String f179384a;
    @AbstractC27891c(mo46611a = "short_id")

    /* renamed from: b */
    public final String f179385b;
    @AbstractC27891c(mo46611a = "unique_id")

    /* renamed from: c */
    public final String f179386c;
    @AbstractC27891c(mo46611a = "nickname")

    /* renamed from: d */
    public String f179387d;
    @AbstractC27891c(mo46611a = "avatar_url")

    /* renamed from: e */
    public String f179388e;
    @AbstractC27891c(mo46611a = "sec_uid")

    /* renamed from: f */
    public final String f179389f;
    @AbstractC27891c(mo46611a = "app_id")

    /* renamed from: g */
    public final long f179390g;

    static {
        Covode.recordClassIndex(93284);
    }

    public C80053c() {
        this(null, null, null, null, null, null, 0, 127);
    }

    /* renamed from: com.ss.android.ugc.aweme.user.c$a */
    public static final class C80054a {
        static {
            Covode.recordClassIndex(93285);
        }

        private C80054a() {
        }

        public /* synthetic */ C80054a(byte b) {
            this();
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x004e  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static com.p2082ss.android.ugc.aweme.user.C80053c m138788a(com.p2082ss.android.ugc.aweme.profile.model.User r10) {
            /*
                java.lang.String r8 = ""
                p4600h.p4611f.p4613b.C89219l.m154721d(r10, r8)
                com.ss.android.ugc.aweme.user.c r2 = new com.ss.android.ugc.aweme.user.c
                java.lang.String r3 = r10.getUid()
                p4600h.p4611f.p4613b.C89219l.m154716b(r3, r8)
                java.lang.String r4 = r10.getShortId()
                p4600h.p4611f.p4613b.C89219l.m154716b(r4, r8)
                java.lang.String r5 = r10.getUniqueId()
                p4600h.p4611f.p4613b.C89219l.m154716b(r5, r8)
                java.lang.String r6 = r10.getNickname()
                p4600h.p4611f.p4613b.C89219l.m154716b(r6, r8)
                com.ss.android.ugc.aweme.base.model.UrlModel r0 = r10.getAvatarThumb()
                if (r0 == 0) goto L_0x003d
                com.ss.android.ugc.aweme.base.model.UrlModel r0 = r10.getAvatarThumb()
                p4600h.p4611f.p4613b.C89219l.m154716b(r0, r8)
                java.util.List r0 = r0.getUrlList()
                r1 = 0
                if (r0 == 0) goto L_0x003d
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L_0x0050
            L_0x003d:
                r7 = r8
            L_0x003e:
                p4600h.p4611f.p4613b.C89219l.m154716b(r7, r8)
                java.lang.String r0 = r10.getSecUid()
                if (r0 != 0) goto L_0x004e
            L_0x0047:
                int r0 = com.bytedance.ies.ugc.appcontext.C17867d.f42590n
                long r9 = (long) r0
                r2.<init>(r3, r4, r5, r6, r7, r8, r9)
                return r2
            L_0x004e:
                r8 = r0
                goto L_0x0047
            L_0x0050:
                com.ss.android.ugc.aweme.base.model.UrlModel r0 = r10.getAvatarThumb()
                p4600h.p4611f.p4613b.C89219l.m154716b(r0, r8)
                java.util.List r0 = r0.getUrlList()
                java.lang.Object r7 = r0.get(r1)
                java.lang.String r7 = (java.lang.String) r7
                goto L_0x003e
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.user.C80053c.C80054a.m138788a(com.ss.android.ugc.aweme.profile.model.User):com.ss.android.ugc.aweme.user.c");
        }
    }

    /* renamed from: a */
    public final String mo123504a() {
        String str = this.f179386c;
        if (str == null || str.length() == 0) {
            return this.f179385b;
        }
        return this.f179386c;
    }

    public C80053c(String str, String str2, String str3, String str4, String str5, String str6, long j) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        C89219l.m154721d(str5, "");
        C89219l.m154721d(str6, "");
        this.f179384a = str;
        this.f179385b = str2;
        this.f179386c = str3;
        this.f179387d = str4;
        this.f179388e = str5;
        this.f179389f = str6;
        this.f179390g = j;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C80053c(java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, long r16, int r18) {
        /*
            r9 = this;
            r5 = r14
            r1 = r10
            r2 = r11
            r3 = r12
            r7 = r16
            r4 = r13
            r0 = r18 & 1
            java.lang.String r6 = ""
            if (r0 == 0) goto L_0x000e
            r1 = r6
        L_0x000e:
            r0 = r18 & 2
            if (r0 == 0) goto L_0x0013
            r2 = r6
        L_0x0013:
            r0 = r18 & 4
            if (r0 == 0) goto L_0x0018
            r3 = r6
        L_0x0018:
            r0 = r18 & 8
            if (r0 == 0) goto L_0x001d
            r4 = r6
        L_0x001d:
            r0 = r18 & 16
            if (r0 == 0) goto L_0x0022
            r5 = r6
        L_0x0022:
            r0 = r18 & 32
            if (r0 == 0) goto L_0x0032
        L_0x0026:
            r0 = r18 & 64
            if (r0 == 0) goto L_0x002d
            int r0 = com.bytedance.ies.ugc.appcontext.C17867d.f42590n
            long r7 = (long) r0
        L_0x002d:
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x0032:
            r6 = r15
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.user.C80053c.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, int):void");
    }
}
