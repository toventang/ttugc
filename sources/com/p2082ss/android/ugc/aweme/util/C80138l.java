package com.p2082ss.android.ugc.aweme.util;

import android.text.style.ForegroundColorSpan;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.setting.C68719x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.util.l */
public final class C80138l {

    /* renamed from: a */
    public static final C80138l f179557a = new C80138l();

    private C80138l() {
    }

    static {
        Covode.recordClassIndex(93382);
    }

    /* renamed from: a */
    public static List<C80140b> m138902a(String str) {
        String str2;
        C89219l.m154721d(str, "");
        List<String> c = C68719x.m121154c();
        if (c == null || c.isEmpty()) {
            return C89086z.INSTANCE;
        }
        int length = str.length();
        Boolean[] boolArr = new Boolean[length];
        for (int i = 0; i < length; i++) {
            boolArr[i] = false;
        }
        Iterator<T> it = C68719x.m121154c().iterator();
        while (it.hasNext()) {
            Matcher matcher = Pattern.compile(it.next()).matcher(str);
            while (matcher.find()) {
                int end = matcher.end();
                for (int start = matcher.start(); start < end; start++) {
                    boolArr[start] = true;
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < length; i2++) {
            if (boolArr[i2].booleanValue()) {
                str2 = "1";
            } else {
                str2 = "0";
            }
            sb.append(str2);
        }
        Matcher matcher2 = Pattern.compile("1+").matcher(sb);
        while (matcher2.find()) {
            arrayList.add(new C80140b(matcher2.start(), matcher2.end()));
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0086, code lost:
        r6.add(new com.p2082ss.android.ugc.aweme.util.C80138l.C80139a(new android.text.style.ForegroundColorSpan(r8), r9.f179561a, r9.f179562b));
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m138903a(android.widget.TextView r13) {
        /*
        // Method dump skipped, instructions count: 238
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.util.C80138l.m138903a(android.widget.TextView):boolean");
    }

    /* renamed from: com.ss.android.ugc.aweme.util.l$b */
    public static final class C80140b {
        @AbstractC27891c(mo46611a = "start")

        /* renamed from: a */
        public final int f179561a;
        @AbstractC27891c(mo46611a = "end")

        /* renamed from: b */
        public final int f179562b;

        static {
            Covode.recordClassIndex(93384);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C80140b)) {
                return false;
            }
            C80140b bVar = (C80140b) obj;
            return this.f179561a == bVar.f179561a && this.f179562b == bVar.f179562b;
        }

        public final int hashCode() {
            return (this.f179561a * 31) + this.f179562b;
        }

        public final String toString() {
            return "HighlightInfo(start=" + this.f179561a + ", end=" + this.f179562b + ")";
        }

        public C80140b(int i, int i2) {
            this.f179561a = i;
            this.f179562b = i2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.util.l$a */
    public static final class C80139a {

        /* renamed from: a */
        public final ForegroundColorSpan f179558a;

        /* renamed from: b */
        public final int f179559b;

        /* renamed from: c */
        public final int f179560c;

        static {
            Covode.recordClassIndex(93383);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C80139a)) {
                return false;
            }
            C80139a aVar = (C80139a) obj;
            return C89219l.m154714a(this.f179558a, aVar.f179558a) && this.f179559b == aVar.f179559b && this.f179560c == aVar.f179560c;
        }

        public final int hashCode() {
            ForegroundColorSpan foregroundColorSpan = this.f179558a;
            return ((((foregroundColorSpan != null ? foregroundColorSpan.hashCode() : 0) * 31) + this.f179559b) * 31) + this.f179560c;
        }

        public final String toString() {
            return "HighLightSpan(span=" + this.f179558a + ", start=" + this.f179559b + ", end=" + this.f179560c + ")";
        }

        public C80139a(ForegroundColorSpan foregroundColorSpan, int i, int i2) {
            C89219l.m154721d(foregroundColorSpan, "");
            this.f179558a = foregroundColorSpan;
            this.f179559b = i;
            this.f179560c = i2;
        }
    }
}
