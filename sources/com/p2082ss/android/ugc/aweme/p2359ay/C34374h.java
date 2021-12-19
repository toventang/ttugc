package com.p2082ss.android.ugc.aweme.p2359ay;

import android.net.Uri;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.lighten.p1477a.p1478a.AbstractC20715b;
import com.bytedance.lighten.p1477a.p1478a.C20714a;
import com.p2082ss.android.ugc.aweme.base.C34602l;
import com.p2082ss.android.ugc.aweme.utils.C80527hd;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.ay.h */
public final class C34374h extends AbstractC20715b.AbstractC20716a {

    /* renamed from: com.ss.android.ugc.aweme.ay.h$a */
    public static final class C34375a implements AbstractC20715b<Object, C20714a> {

        /* renamed from: b */
        public static final C34375a f81265b = new C34375a();

        /* renamed from: c */
        public static final C34376a f81266c = new C34376a((byte) 0);

        /* renamed from: a */
        public final String f81267a = "ImageUrlModelConverter";

        /* renamed from: d */
        private final boolean f81268d = false;

        /* renamed from: e */
        private Pattern f81269e;

        /* renamed from: f */
        private String f81270f;

        /* renamed from: g */
        private boolean f81271g;

        /* renamed from: h */
        private boolean f81272h = true;

        /* renamed from: com.ss.android.ugc.aweme.ay.h$a$a */
        public static final class C34376a {
            static {
                Covode.recordClassIndex(41320);
            }

            private C34376a() {
            }

            public /* synthetic */ C34376a(byte b) {
                this();
            }
        }

        static {
            Covode.recordClassIndex(41319);
        }

        public C34375a() {
            m70352a();
        }

        /* JADX WARNING: Removed duplicated region for block: B:30:0x0043 A[Catch:{ all -> 0x0060 }] */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x0053 A[Catch:{ all -> 0x0060 }] */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x0054 A[Catch:{ all -> 0x0060 }] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private java.util.regex.Pattern m70352a() {
            /*
            // Method dump skipped, instructions count: 101
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p2359ay.C34374h.C34375a.m70352a():java.util.regex.Pattern");
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.lighten.p1477a.p1478a.AbstractC20715b
        /* renamed from: a */
        public final /* synthetic */ C20714a mo34126a(Object obj, C20766v vVar) {
            C89219l.m154721d(vVar, "");
            if (!(obj instanceof C34602l)) {
                return null;
            }
            return m70351a((C34602l) obj, vVar.f49113j, vVar.f49114k);
        }

        /* renamed from: a */
        private static void m70353a(C34602l lVar, boolean z, boolean z2) {
            String str;
            ArrayList arrayList;
            C89219l.m154721d(lVar, "");
            if (!z || !z2) {
                str = "ilog=not_shrink";
            } else {
                str = "ilog=not_shrink_test";
            }
            List<String> list = lVar.f81655b;
            if (list != null) {
                ArrayList arrayList2 = new ArrayList(C89070n.m154526a((Iterable) list, 10));
                for (T t : list) {
                    C89219l.m154716b(t, "");
                    arrayList2.add(C89361p.m154929e((CharSequence) t, (CharSequence) "?") ? ((String) t) + '&' + str : ((String) t) + '?' + str);
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            lVar.f81655b = arrayList;
        }

        /* renamed from: a */
        private C20714a m70351a(C34602l lVar, int i, int i2) {
            boolean z;
            Matcher matcher;
            String str;
            C89219l.m154721d(lVar, "");
            if (!this.f81272h) {
                return new C20714a(lVar.f81655b);
            }
            if (i <= 0 || i2 <= 0) {
                if (this.f81268d) {
                    C80527hd.m139598a(new Object[]{this.f81267a, "ImageCropUtils.convertedImageUrls(ImageCropUtils.kt:48)\n", lVar.f81654a + " no size error, return " + lVar.f81655b});
                }
                return new C20714a(lVar.f81655b);
            } else if (!this.f81271g) {
                m70353a(lVar, false, false);
                if (this.f81268d) {
                    C80527hd.m139598a(new Object[]{this.f81267a, "ImageCropUtils.convertedImageUrls(ImageCropUtils.kt:48)\n", lVar.f81654a + " not open, return " + lVar.f81655b});
                }
                return new C20714a(lVar.f81655b);
            } else {
                String str2 = lVar.f81654a;
                if (str2 == null || str2.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (this.f81268d) {
                        C80527hd.m139598a(new Object[]{this.f81267a, "ImageCropUtils.convertedImageUrls(ImageCropUtils.kt:56)\n", "no uri error, return " + lVar.f81655b});
                    }
                    return new C20714a(lVar.f81655b);
                }
                if (C89361p.m154874b(str2, "large/", false)) {
                    str2 = C89361p.m154873b(str2, "large/", "", false);
                }
                List<String> list = lVar.f81655b;
                if (list == null || list.isEmpty()) {
                    if (this.f81268d) {
                        C80527hd.m139598a(new Object[]{this.f81267a, "ImageCropUtils.convertedImageUrls(ImageCropUtils.kt:56)\n", "empty image list error, return " + lVar.f81655b});
                    }
                    return new C20714a(lVar.f81655b);
                }
                Pattern a = m70352a();
                if (a == null || (matcher = a.matcher(str2)) == null || !matcher.matches()) {
                    m70353a(lVar, true, true);
                    if (this.f81268d) {
                        C80527hd.m139598a(new Object[]{this.f81267a, "ImageCropUtils.convertedImageUrls(ImageCropUtils.kt:56)\n", str2 + " not match error, return " + lVar.f81655b});
                    }
                    return new C20714a(lVar.f81655b);
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    try {
                        Uri parse = Uri.parse(it.next());
                        Locale locale = Locale.US;
                        String str3 = this.f81270f;
                        if (str3 == null) {
                            C89219l.m154715b();
                        }
                        C89219l.m154716b(parse, "");
                        String a2 = C1764a.m5929a(locale, str3, Arrays.copyOf(new Object[]{parse.getScheme(), parse.getHost(), str2, Integer.valueOf(i), Integer.valueOf(i2)}, 5));
                        C89219l.m154716b(a2, "");
                        if (C89361p.m154929e((CharSequence) a2, (CharSequence) "?")) {
                            str = a2 + "&ilog=shrink";
                        } else {
                            str = a2 + "?ilog=shrink";
                        }
                        if (str != null) {
                            linkedHashSet.add(str);
                        }
                    } catch (Exception unused) {
                    }
                }
                if (!linkedHashSet.isEmpty()) {
                    list.addAll(0, linkedHashSet);
                }
                if (this.f81268d) {
                    C80527hd.m139598a(new Object[]{this.f81267a, "ImageCropUtils.convertedImageUrls(ImageCropUtils.kt:67)\n", str2 + " match, return " + lVar.f81655b});
                }
                return new C20714a(lVar.f81655b);
            }
        }
    }

    static {
        Covode.recordClassIndex(41318);
    }

    @Override // com.bytedance.lighten.p1477a.p1478a.AbstractC20715b.AbstractC20716a
    /* renamed from: a */
    public final AbstractC20715b<Object, C20714a> mo34127a() {
        return C34375a.f81265b;
    }
}
