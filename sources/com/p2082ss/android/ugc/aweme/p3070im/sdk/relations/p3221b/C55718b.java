package com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3221b;

import android.icu.text.AlphabeticIndex;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import com.p2082ss.android.ugc.aweme.utils.C80398en;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.b.b */
public final class C55718b {

    /* renamed from: a */
    public static final C55718b f127092a = new C55718b();

    /* renamed from: b */
    private static final AbstractC55725c f127093b;

    /* renamed from: c */
    private static final Locale f127094c;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.b.b$c */
    static class C55721c implements AbstractC55725c {

        /* renamed from: b */
        public static final C55722a f127096b = new C55722a((byte) 0);

        /* renamed from: a */
        public final AlphabeticIndex.ImmutableIndex<?> f127097a;

        /* renamed from: c */
        private final int f127098c;

        static {
            Covode.recordClassIndex(65507);
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.b.b$c$a */
        public static final class C55722a {
            static {
                Covode.recordClassIndex(65508);
            }

            private C55722a() {
            }

            public /* synthetic */ C55722a(byte b) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final int mo92597a() {
            return this.f127098c + 1;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3221b.AbstractC55725c
        /* renamed from: a */
        public final String mo92595a(String str) {
            int c;
            if (C55717a.m101462a(str) || (c = mo92598c(str)) < 0 || c >= this.f127098c + 1) {
                return "#";
            }
            AlphabeticIndex.Bucket<?> bucket = this.f127097a.getBucket(c);
            C89219l.m154716b(bucket, "");
            String label = bucket.getLabel();
            C89219l.m154716b(label, "");
            return label;
        }

        /* renamed from: c */
        public int mo92598c(String str) {
            boolean z;
            if (str == null || str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return -1;
            }
            try {
                int bucketIndex = this.f127097a.getBucketIndex(str);
                AlphabeticIndex.Bucket<?> bucket = this.f127097a.getBucket(bucketIndex);
                C89219l.m154716b(bucket, "");
                if (bucket.getLabelType() != AlphabeticIndex.Bucket.LabelType.NORMAL) {
                    return -1;
                }
                return bucketIndex;
            } catch (ArrayIndexOutOfBoundsException e) {
                C56244a.m102188a(e);
                return -1;
            }
        }

        public C55721c(List<Locale> list) {
            C89219l.m154721d(list, "");
            AlphabeticIndex maxLabelCount = new AlphabeticIndex(list.get(0)).setMaxLabelCount(100);
            C89219l.m154716b(maxLabelCount, "");
            Iterator<Locale> it = list.iterator();
            while (it.hasNext()) {
                maxLabelCount.addLabels(it.next());
            }
            AlphabeticIndex.ImmutableIndex<?> buildImmutableIndex = maxLabelCount.buildImmutableIndex();
            C89219l.m154716b(buildImmutableIndex, "");
            this.f127097a = buildImmutableIndex;
            this.f127098c = buildImmutableIndex.getBucketCount();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
            if (r1 < 10) goto L_0x0027;
         */
        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3221b.AbstractC55725c
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String mo92596b(java.lang.String r8) {
            /*
                r7 = this;
                r0 = 0
                r6 = 1
                if (r8 == 0) goto L_0x000a
                int r0 = r8.length()
                if (r0 != 0) goto L_0x0010
            L_0x000a:
                r0 = 1
            L_0x000b:
                java.lang.String r5 = "0"
                if (r0 == 0) goto L_0x0012
                return r5
            L_0x0010:
                r0 = 0
                goto L_0x000b
            L_0x0012:
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r3 = 0
                r2 = 0
            L_0x0019:
                int r0 = r8.length()
                if (r2 >= r0) goto L_0x003f
                int r1 = r7.mo92594a(r8, r2)
                r0 = 10
                if (r1 >= r0) goto L_0x002a
            L_0x0027:
                r4.append(r5)
            L_0x002a:
                r0 = 99
                if (r1 != r0) goto L_0x0030
                int r2 = r2 + 1
            L_0x0030:
                java.lang.String r0 = java.lang.String.valueOf(r1)
                r4.append(r0)
                int r3 = r3 + 1
                int r2 = r2 + r6
                r0 = 12
                if (r3 >= r0) goto L_0x0041
                goto L_0x0019
            L_0x003f:
                r1 = 0
                goto L_0x0027
            L_0x0041:
                java.lang.String r1 = r4.toString()
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154716b(r1, r0)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3221b.C55718b.C55721c.mo92596b(java.lang.String):java.lang.String");
        }

        /* renamed from: a */
        public int mo92594a(String str, int i) {
            C89219l.m154721d(str, "");
            String substring = str.substring(i, i + 1);
            C89219l.m154716b(substring, "");
            int c = mo92598c(substring);
            if (c != -1) {
                return c;
            }
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                return ((this.f127098c + 1) + charAt) - 65;
            }
            if (Character.isLowerCase(charAt)) {
                return (((this.f127098c + 1) + charAt) - 97) + 26;
            }
            if (Character.isDigit(charAt)) {
                return (((this.f127098c + 1) + charAt) - 48) + 52;
            }
            if (C55717a.m101463b(charAt)) {
                return this.f127098c + 1 + 62;
            }
            String substring2 = str.substring(i);
            C89219l.m154716b(substring2, "");
            if (C55717a.m101462a(substring2)) {
                return 99;
            }
            return this.f127098c + 1 + 63;
        }
    }

    private C55718b() {
    }

    static {
        AbstractC55725c bVar;
        Covode.recordClassIndex(65504);
        Locale a = C80398en.m139370a();
        C89219l.m154716b(a, "");
        f127094c = a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(a);
        if (Build.VERSION.SDK_INT > 24) {
            String language = a.getLanguage();
            Locale locale = Locale.CHINESE;
            C89219l.m154716b(locale, "");
            if (C89219l.m154714a((Object) language, (Object) locale.getLanguage())) {
                bVar = new C55719a(arrayList);
            } else {
                Locale locale2 = Locale.ENGLISH;
                C89219l.m154716b(locale2, "");
                if (C89219l.m154714a((Object) language, (Object) locale2.getLanguage())) {
                    bVar = new C55719a(arrayList);
                } else {
                    Locale locale3 = Locale.JAPANESE;
                    C89219l.m154716b(locale3, "");
                    if (C89219l.m154714a((Object) language, (Object) locale3.getLanguage())) {
                        Locale locale4 = Locale.CHINESE;
                        C89219l.m154716b(locale4, "");
                        arrayList.add(locale4);
                        bVar = new C55723d(arrayList);
                    } else {
                        Locale locale5 = Locale.KOREAN;
                        C89219l.m154716b(locale5, "");
                        if (C89219l.m154714a((Object) language, (Object) locale5.getLanguage())) {
                            bVar = new C55724e(arrayList);
                        } else {
                            bVar = new C55721c(arrayList);
                        }
                    }
                }
            }
        } else {
            bVar = new C55720b();
        }
        f127093b = bVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.b.b$a */
    static final class C55719a extends C55721c {
        static {
            Covode.recordClassIndex(65505);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55719a(List<Locale> list) {
            super(list);
            C89219l.m154721d(list, "");
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3221b.C55718b.C55721c
        /* renamed from: a */
        public final int mo92594a(String str, int i) {
            C89219l.m154721d(str, "");
            String substring = str.substring(i, i + 1);
            C89219l.m154716b(substring, "");
            int c = mo92598c(substring);
            char charAt = str.charAt(i);
            if (i != 0 && Character.isLowerCase(charAt)) {
                c += 26;
            }
            if (c != -1) {
                return c;
            }
            if (Character.isDigit(charAt)) {
                return ((mo92597a() + charAt) - 48) + 26;
            }
            if (C55717a.m101463b(charAt)) {
                return mo92597a() + 36;
            }
            String substring2 = str.substring(i);
            C89219l.m154716b(substring2, "");
            if (C55717a.m101462a(substring2)) {
                return 99;
            }
            return mo92597a() + 37;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.b.b$d */
    static final class C55723d extends C55721c {
        static {
            Covode.recordClassIndex(65509);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55723d(List<Locale> list) {
            super(list);
            C89219l.m154721d(list, "");
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3221b.C55718b.C55721c
        /* renamed from: c */
        public final int mo92598c(String str) {
            boolean z;
            if (str == null || str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return -1;
            }
            int c = super.mo92598c(str);
            if (c == -1) {
                return super.mo92598c(C55717a.m101465c(str));
            }
            return c;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.b.b$e */
    static final class C55724e extends C55721c {
        static {
            Covode.recordClassIndex(65510);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55724e(List<Locale> list) {
            super(list);
            C89219l.m154721d(list, "");
        }
    }

    /* renamed from: a */
    public static final String m101466a(String str) {
        String a = f127093b.mo92595a(str);
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: b */
    public static final String m101467b(String str) {
        String b = f127093b.mo92596b(str);
        C89219l.m154716b(b, "");
        return b;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.b.b$b */
    static final class C55720b implements AbstractC55725c {

        /* renamed from: a */
        private final boolean f127095a = C80398en.m139371b();

        static {
            Covode.recordClassIndex(65506);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3221b.AbstractC55725c
        /* renamed from: a */
        public final String mo92595a(String str) {
            boolean z = this.f127095a;
            String str2 = "#";
            if (!TextUtils.isEmpty(str)) {
                char charAt = str.charAt(0);
                if ((charAt >= 19968 && charAt <= 40869) || C55717a.m101461a(charAt)) {
                    str2 = C55717a.m101465c(str).substring(0, 1).toUpperCase();
                    if (TextUtils.isEmpty(str2)) {
                        str2 = str.substring(0, 1).toUpperCase();
                    }
                } else if (!Character.isDigit(charAt) && !C55717a.m101463b(charAt) && !C55717a.m101462a(str) && !z) {
                    str2 = str.substring(0, 1);
                }
            }
            C89219l.m154716b(str2, "");
            return str2;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0030, code lost:
            if (r5 < 10) goto L_0x0032;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0035, code lost:
            if (r5 == 64) goto L_0x0037;
         */
        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3221b.AbstractC55725c
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String mo92596b(java.lang.String r8) {
            /*
            // Method dump skipped, instructions count: 140
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3221b.C55718b.C55720b.mo92596b(java.lang.String):java.lang.String");
        }
    }
}
