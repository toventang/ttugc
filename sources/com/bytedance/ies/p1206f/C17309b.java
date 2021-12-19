package com.bytedance.ies.p1206f;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.LruCache;
import com.bytedance.common.utility.p910e.C13611a;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import java.util.Objects;
import java.util.Set;

/* renamed from: com.bytedance.ies.f.b */
public final class C17309b {

    /* renamed from: b */
    public static String f41588b = "default_app_sp";

    /* renamed from: c */
    private static LruCache<String, C17309b> f41589c;

    /* renamed from: e */
    private static int f41590e = 3;

    /* renamed from: a */
    public final SharedPreferences f41591a;

    /* renamed from: d */
    private SharedPreferences.Editor f41592d;

    /* renamed from: a */
    public final void mo27621a() {
        SharedPreferences.Editor editor = this.f41592d;
        if (editor != null) {
            C13611a.m24460a(editor);
        }
    }

    static {
        Covode.recordClassIndex(19793);
    }

    /* renamed from: b */
    private void m32050b() {
        if (this.f41592d == null) {
            this.f41592d = this.f41591a.edit();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.f.b$1 */
    public static /* synthetic */ class C173101 {

        /* renamed from: a */
        static final /* synthetic */ int[] f41593a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0038 */
        static {
            /*
                r0 = 19794(0x4d52, float:2.7737E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.bytedance.ies.f.b$a[] r0 = com.bytedance.ies.p1206f.C17309b.EnumC17311a.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.bytedance.ies.p1206f.C17309b.C173101.f41593a = r2
                com.bytedance.ies.f.b$a r0 = com.bytedance.ies.p1206f.C17309b.EnumC17311a.STRING     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.bytedance.ies.p1206f.C17309b.C173101.f41593a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.bytedance.ies.f.b$a r0 = com.bytedance.ies.p1206f.C17309b.EnumC17311a.INTEGER     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = com.bytedance.ies.p1206f.C17309b.C173101.f41593a     // Catch:{ NoSuchFieldError -> 0x002d }
                com.bytedance.ies.f.b$a r0 = com.bytedance.ies.p1206f.C17309b.EnumC17311a.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                int[] r2 = com.bytedance.ies.p1206f.C17309b.C173101.f41593a     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.bytedance.ies.f.b$a r0 = com.bytedance.ies.p1206f.C17309b.EnumC17311a.FLOAT     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                int[] r2 = com.bytedance.ies.p1206f.C17309b.C173101.f41593a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.bytedance.ies.f.b$a r0 = com.bytedance.ies.p1206f.C17309b.EnumC17311a.LONG     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r0 = 5
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r2 = com.bytedance.ies.p1206f.C17309b.C173101.f41593a     // Catch:{ NoSuchFieldError -> 0x004e }
                com.bytedance.ies.f.b$a r0 = com.bytedance.ies.p1206f.C17309b.EnumC17311a.STRING_SET     // Catch:{ NoSuchFieldError -> 0x004e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r0 = 6
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r2 = com.bytedance.ies.p1206f.C17309b.C173101.f41593a     // Catch:{ NoSuchFieldError -> 0x0059 }
                com.bytedance.ies.f.b$a r0 = com.bytedance.ies.p1206f.C17309b.EnumC17311a.ALL     // Catch:{ NoSuchFieldError -> 0x0059 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0059 }
                r0 = 7
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.p1206f.C17309b.C173101.<clinit>():void");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.f.b$a */
    public enum EnumC17311a {
        STRING,
        INTEGER,
        BOOLEAN,
        FLOAT,
        LONG,
        STRING_SET,
        ALL;

        static {
            Covode.recordClassIndex(19795);
        }
    }

    /* renamed from: b */
    public final void mo27623b(String str, Object obj) {
        mo27619a(str, obj);
        mo27621a();
    }

    private C17309b(Context context, String str) {
        this.f41591a = C34822d.m71158a(context, str, 0);
    }

    /* renamed from: a */
    public final String mo27620a(String str, String str2) {
        return (String) m32049a(str, EnumC17311a.STRING, str2);
    }

    /* renamed from: a */
    public final int mo27617a(String str, int i) {
        return ((Integer) m32049a(str, EnumC17311a.INTEGER, Integer.valueOf(i))).intValue();
    }

    /* renamed from: a */
    public static C17309b m32048a(Context context, String str) {
        Objects.requireNonNull(context, "null context!!");
        if (f41589c == null) {
            f41589c = new LruCache<>(f41590e);
        }
        C17309b bVar = f41589c.get(str);
        if (bVar != null) {
            return bVar;
        }
        C17309b bVar2 = new C17309b(context, str);
        f41589c.put(str, bVar2);
        return bVar2;
    }

    /* renamed from: a */
    public final long mo27618a(String str, long j) {
        return ((Long) m32049a(str, EnumC17311a.LONG, Long.valueOf(j))).longValue();
    }

    /* renamed from: a */
    public final C17309b mo27619a(String str, Object obj) {
        m32050b();
        if (obj instanceof String) {
            this.f41592d.putString(str, (String) obj);
        } else if (obj instanceof Integer) {
            this.f41592d.putInt(str, ((Integer) obj).intValue());
        } else if (obj instanceof Boolean) {
            this.f41592d.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof Float) {
            this.f41592d.putFloat(str, ((Float) obj).floatValue());
        } else if (obj instanceof Long) {
            this.f41592d.putLong(str, ((Long) obj).longValue());
        } else if (obj instanceof Set) {
            this.f41592d.putStringSet(str, (Set) obj);
        } else {
            this.f41592d.putString(str, String.valueOf(obj));
        }
        return this;
    }

    /* renamed from: a */
    public final boolean mo27622a(String str, boolean z) {
        return ((Boolean) m32049a(str, EnumC17311a.BOOLEAN, Boolean.valueOf(z))).booleanValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private <T> T m32049a(String str, EnumC17311a aVar, Object obj) {
        switch (C173101.f41593a[aVar.ordinal()]) {
            case 1:
                return (T) this.f41591a.getString(str, (String) obj);
            case 2:
                return (T) Integer.valueOf(this.f41591a.getInt(str, ((Integer) obj).intValue()));
            case 3:
                return (T) Boolean.valueOf(this.f41591a.getBoolean(str, ((Boolean) obj).booleanValue()));
            case 4:
                return (T) Float.valueOf(this.f41591a.getFloat(str, ((Float) obj).floatValue()));
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                return (T) Long.valueOf(this.f41591a.getLong(str, ((Long) obj).longValue()));
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                return (T) this.f41591a.getStringSet(str, (Set) obj);
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                return (T) this.f41591a.getAll();
            default:
                return obj;
        }
    }
}
