package com.p2082ss.android.ugc.aweme.p4173ug.dynamicresource;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.p1733u.C23435d;
import com.bytedance.p1733u.EnumC23438f;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ug.dynamicresource.h */
public final class C79615h implements Comparable<C79615h> {

    /* renamed from: m */
    public static final C79616a f178636m = new C79616a((byte) 0);

    /* renamed from: n */
    private static String f178637n = "";

    /* renamed from: a */
    public final String f178638a;

    /* renamed from: b */
    public final EnumC79619k f178639b;

    /* renamed from: c */
    public final String f178640c;

    /* renamed from: d */
    public final EnumC79613f f178641d;

    /* renamed from: e */
    public final String f178642e;

    /* renamed from: f */
    public final int f178643f;

    /* renamed from: g */
    public final boolean f178644g;

    /* renamed from: h */
    public final Integer f178645h;

    /* renamed from: i */
    public EnumC79614g f178646i;

    /* renamed from: j */
    public String f178647j;

    /* renamed from: k */
    public int f178648k;

    /* renamed from: l */
    public Map<AbstractC79602a<?>, Class<?>> f178649l;

    public final int hashCode() {
        String str = this.f178638a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        EnumC79619k kVar = this.f178639b;
        int hashCode2 = (hashCode + (kVar != null ? kVar.hashCode() : 0)) * 31;
        String str2 = this.f178640c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        EnumC79613f fVar = this.f178641d;
        int hashCode4 = (hashCode3 + (fVar != null ? fVar.hashCode() : 0)) * 31;
        String str3 = this.f178642e;
        int hashCode5 = (((hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.f178643f) * 31;
        boolean z = this.f178644g;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode5 + i2) * 31;
        Integer num = this.f178645h;
        int hashCode6 = (i5 + (num != null ? num.hashCode() : 0)) * 31;
        EnumC79614g gVar = this.f178646i;
        int hashCode7 = (hashCode6 + (gVar != null ? gVar.hashCode() : 0)) * 31;
        String str4 = this.f178647j;
        int hashCode8 = (((hashCode7 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.f178648k) * 31;
        Map<AbstractC79602a<?>, Class<?>> map = this.f178649l;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode8 + i;
    }

    public final String toString() {
        return "DynamicResourceStrategy(key=" + this.f178638a + ", type=" + this.f178639b + ", cdnUrl=" + this.f178640c + ", priority=" + this.f178641d + ", hash=" + this.f178642e + ", size=" + this.f178643f + ", enable=" + this.f178644g + ", fallback=" + this.f178645h + ", status=" + this.f178646i + ", localPath=" + this.f178647j + ", failureCount=" + this.f178648k + ", callbacks=" + this.f178649l + ")";
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.dynamicresource.h$a */
    public static final class C79616a {
        static {
            Covode.recordClassIndex(92828);
        }

        private C79616a() {
        }

        public /* synthetic */ C79616a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(92827);
    }

    /* renamed from: d */
    private final String m138407d() {
        int i = C79617i.f178650a[this.f178639b.ordinal()];
        if (i == 1) {
            return C79618j.f178652b;
        }
        if (i == 2) {
            return C79618j.f178653c;
        }
        if (i != 3) {
            return "";
        }
        return C79618j.f178654d;
    }

    /* renamed from: e */
    private String m138408e() {
        return mo123155a() + '/' + mo123157b();
    }

    /* renamed from: b */
    public final String mo123157b() {
        return this.f178642e + m138407d();
    }

    /* renamed from: c */
    public final boolean mo123158c() {
        String e = m138408e();
        if (m138406a(e)) {
            this.f178647j = e;
            this.f178646i = EnumC79614g.SUCCESS;
            return true;
        }
        this.f178647j = "";
        if (this.f178646i != EnumC79614g.SUCCESS) {
            return false;
        }
        this.f178646i = EnumC79614g.IDLE;
        return false;
    }

    /* renamed from: a */
    public final String mo123155a() {
        String str;
        String str2 = f178637n;
        if (str2 == null || str2.length() == 0) {
            Context a = C17867d.m33078a();
            File a2 = C23435d.m44110a(a, EnumC23438f.PREFER_SD_CARD);
            String str3 = "";
            if (a2 != null) {
                str = a2.getPath();
            } else if (m138405a(a) == null) {
                File externalStorageDirectory = Environment.getExternalStorageDirectory();
                C89219l.m154716b(externalStorageDirectory, str3);
                str = externalStorageDirectory.getPath();
            } else {
                File a3 = m138405a(a);
                if (a3 != null) {
                    str = a3.getPath();
                } else {
                    str = null;
                }
            }
            String a4 = C89219l.m154704a(str, (Object) ("/" + C79618j.f178651a + '/'));
            if (a4 != null) {
                str3 = a4;
            }
            f178637n = str3;
        }
        return f178637n + this.f178638a;
    }

    /* renamed from: a */
    public final void mo123156a(EnumC79614g gVar) {
        C89219l.m154721d(gVar, "");
        this.f178646i = gVar;
    }

    /* renamed from: a */
    private static File m138405a(Context context) {
        if (!TextUtils.isEmpty(null)) {
            return context.getExternalFilesDir(null);
        }
        if (C58016d.f132223d != null && C58016d.f132224e) {
            return C58016d.f132223d;
        }
        File externalFilesDir = context.getExternalFilesDir(null);
        C58016d.f132223d = externalFilesDir;
        return externalFilesDir;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C79615h)) {
            return false;
        }
        C79615h hVar = (C79615h) obj;
        if (!C89219l.m154714a((Object) this.f178638a, (Object) hVar.f178638a) || !C89219l.m154714a((Object) this.f178642e, (Object) hVar.f178642e)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m138406a(String str) {
        if (str.length() <= 0 || !new File(str).exists()) {
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(C79615h hVar) {
        C79615h hVar2 = hVar;
        C89219l.m154721d(hVar2, "");
        int i = this.f178648k;
        int i2 = hVar2.f178648k;
        if (i < i2) {
            return 1;
        }
        if (i > i2) {
            return -1;
        }
        if (this.f178641d.getValue() > hVar2.f178641d.getValue() || (this.f178641d.getValue() == hVar2.f178641d.getValue() && this.f178643f > hVar2.f178643f)) {
            return 1;
        }
        if (this.f178641d.getValue() == hVar2.f178641d.getValue() && this.f178643f == hVar2.f178643f) {
            return 0;
        }
        return -1;
    }

    public /* synthetic */ C79615h(String str, EnumC79619k kVar, String str2, EnumC79613f fVar, String str3, int i, Integer num) {
        this(str, kVar, str2, fVar, str3, i, true, num, EnumC79614g.IDLE, "", new LinkedHashMap());
    }

    private C79615h(String str, EnumC79619k kVar, String str2, EnumC79613f fVar, String str3, int i, boolean z, Integer num, EnumC79614g gVar, String str4, Map<AbstractC79602a<?>, Class<?>> map) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(gVar, "");
        C89219l.m154721d(str4, "");
        C89219l.m154721d(map, "");
        this.f178638a = str;
        this.f178639b = kVar;
        this.f178640c = str2;
        this.f178641d = fVar;
        this.f178642e = str3;
        this.f178643f = i;
        this.f178644g = true;
        this.f178645h = num;
        this.f178646i = gVar;
        this.f178647j = str4;
        this.f178648k = 0;
        this.f178649l = map;
    }
}
