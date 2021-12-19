package com.bytedance.bdturing;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.bdturing.p864d.AbstractC13269a;
import com.bytedance.bdturing.twiceverify.AbstractC13312b;
import com.bytedance.covode.number.Covode;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: com.bytedance.bdturing.c */
public final class C13252c {

    /* renamed from: A */
    public boolean f32366A;

    /* renamed from: B */
    public int f32367B;

    /* renamed from: C */
    public String f32368C;

    /* renamed from: D */
    public boolean f32369D;

    /* renamed from: E */
    public String f32370E;

    /* renamed from: F */
    public String f32371F;

    /* renamed from: G */
    public AbstractC13282f f32372G;

    /* renamed from: H */
    private HashMap<Integer, Pair<String, String>> f32373H;

    /* renamed from: a */
    public EnumC13254b f32374a;

    /* renamed from: b */
    public String f32375b;

    /* renamed from: c */
    public String f32376c;

    /* renamed from: d */
    public String f32377d;

    /* renamed from: e */
    public String f32378e;

    /* renamed from: f */
    public String f32379f;

    /* renamed from: g */
    public String f32380g;

    /* renamed from: h */
    public String f32381h;

    /* renamed from: i */
    public String f32382i;

    /* renamed from: j */
    public String f32383j;

    /* renamed from: k */
    public String f32384k;

    /* renamed from: l */
    public String f32385l;

    /* renamed from: m */
    public String f32386m;

    /* renamed from: n */
    public String f32387n;

    /* renamed from: o */
    public Context f32388o;

    /* renamed from: p */
    public String f32389p;

    /* renamed from: q */
    public boolean f32390q;

    /* renamed from: r */
    JSONObject f32391r;

    /* renamed from: s */
    JSONObject f32392s;

    /* renamed from: t */
    JSONObject f32393t;

    /* renamed from: u */
    public AbstractC13268d f32394u;

    /* renamed from: v */
    public AbstractC13269a f32395v;

    /* renamed from: w */
    public AbstractC13312b f32396w;

    /* renamed from: x */
    public boolean f32397x;

    /* renamed from: y */
    public String f32398y;

    /* renamed from: z */
    public String f32399z;

    /* renamed from: com.bytedance.bdturing.c$a */
    public static class C13253a {

        /* renamed from: a */
        public EnumC13254b f32400a = EnumC13254b.REGION_CN;

        /* renamed from: b */
        public String f32401b;

        /* renamed from: c */
        public String f32402c;

        /* renamed from: d */
        public String f32403d;

        /* renamed from: e */
        public String f32404e;

        /* renamed from: f */
        public String f32405f = "";

        /* renamed from: g */
        public String f32406g;

        /* renamed from: h */
        public Context f32407h;

        /* renamed from: i */
        public String f32408i;

        /* renamed from: j */
        public String f32409j;

        /* renamed from: k */
        public String f32410k;

        /* renamed from: l */
        public boolean f32411l = true;

        /* renamed from: m */
        public boolean f32412m = true;

        /* renamed from: n */
        public AbstractC13268d f32413n;

        /* renamed from: o */
        public AbstractC13269a f32414o;

        /* renamed from: p */
        public AbstractC13312b f32415p;

        /* renamed from: q */
        public String f32416q;

        /* renamed from: r */
        public String f32417r;

        /* renamed from: s */
        public AbstractC13282f f32418s;

        static {
            Covode.recordClassIndex(15215);
        }
    }

    static {
        Covode.recordClassIndex(15214);
    }

    /* renamed from: com.bytedance.bdturing.c$b */
    public enum EnumC13254b {
        REGION_CN("cn"),
        REGION_SINGAPOER("sg"),
        REGION_USA_EAST("va"),
        REGION_INDIA("in"),
        REGION_BOE("boe");
        

        /* renamed from: a */
        private String f32420a;

        public final String getName() {
            return this.f32420a;
        }

        static {
            Covode.recordClassIndex(15216);
        }

        private EnumC13254b(String str) {
            this.f32420a = str;
        }
    }

    /* renamed from: a */
    public final Pair<String, String> mo21418a() {
        return this.f32373H.get(2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        return "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo21420b() {
        /*
            r3 = this;
            java.lang.String r2 = ""
            java.lang.String r1 = r3.f32389p
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0017, all -> 0x0015 }
            if (r0 == 0) goto L_0x0012
            java.util.Locale r0 = java.util.Locale.getDefault()     // Catch:{ Exception -> 0x0017, all -> 0x0015 }
            java.lang.String r1 = r0.toString()     // Catch:{ Exception -> 0x0017, all -> 0x0015 }
        L_0x0012:
            if (r1 != 0) goto L_0x001a
            goto L_0x0019
        L_0x0015:
            r0 = move-exception
            throw r0
        L_0x0017:
            if (r1 != 0) goto L_0x001a
        L_0x0019:
            return r2
        L_0x001a:
            r2 = r1
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.bdturing.C13252c.mo21420b():java.lang.String");
    }

    /* renamed from: a */
    public final C13252c mo21419a(EnumC13254b bVar) {
        this.f32374a = bVar;
        return this;
    }

    private C13252c(C13253a aVar) {
        String str;
        String str2;
        String[] split;
        this.f32379f = "2.2.1.i18n";
        this.f32383j = "Android";
        this.f32384k = new StringBuilder().append(Build.VERSION.SDK_INT).toString();
        this.f32386m = Build.BRAND;
        this.f32387n = Build.MODEL;
        this.f32373H = new HashMap<>();
        this.f32391r = null;
        this.f32392s = null;
        this.f32393t = null;
        this.f32398y = null;
        this.f32399z = null;
        this.f32366A = true;
        this.f32368C = null;
        this.f32369D = false;
        this.f32372G = null;
        this.f32374a = aVar.f32400a;
        this.f32375b = aVar.f32401b;
        this.f32376c = aVar.f32402c;
        this.f32377d = aVar.f32403d;
        this.f32378e = aVar.f32404e;
        this.f32380g = aVar.f32405f;
        this.f32382i = aVar.f32406g;
        Locale locale = Locale.getDefault();
        if (TextUtils.isEmpty(aVar.f32416q)) {
            str = locale.toString();
        } else {
            str = aVar.f32416q;
        }
        this.f32389p = str;
        this.f32394u = aVar.f32413n;
        this.f32395v = aVar.f32414o;
        this.f32396w = aVar.f32415p;
        this.f32372G = aVar.f32418s;
        if (TextUtils.isEmpty(aVar.f32416q) && (str2 = this.f32389p) != null && (split = str2.split("_")) != null && split.length > 2) {
            this.f32389p = split[0] + "_" + split[1];
        }
        try {
            this.f32386m = URLEncoder.encode(Build.BRAND, "utf-8");
            this.f32387n = URLEncoder.encode(Build.MODEL, "utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        this.f32381h = aVar.f32408i;
        this.f32385l = aVar.f32409j;
        this.f32370E = aVar.f32410k;
        this.f32371F = aVar.f32417r;
        this.f32388o = aVar.f32407h;
        this.f32390q = aVar.f32411l;
        this.f32397x = aVar.f32412m;
    }

    public /* synthetic */ C13252c(C13253a aVar, byte b) {
        this(aVar);
    }
}
