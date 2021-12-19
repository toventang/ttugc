package com.bytedance.android.alog;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import java.io.File;
import java.util.ArrayList;

public class Alog {

    /* renamed from: a */
    public static final int f7991a = EnumC2681d.SAFE.value;

    /* renamed from: b */
    public static final int f7992b = EnumC2684g.RAW.value;

    /* renamed from: c */
    public static final int f7993c = EnumC2682e.DEFAULT.value;

    /* renamed from: d */
    public static final int f7994d = EnumC2680c.ZSTD.value;

    /* renamed from: e */
    public static final int f7995e = EnumC2683f.TEA_16.value;

    /* renamed from: f */
    public static final int f7996f = EnumC2678a.EC_SECP256K1.value;

    /* renamed from: g */
    public static final ArrayList<String> f7997g = new ArrayList<>();

    /* renamed from: h */
    public static boolean f7998h = false;

    /* renamed from: i */
    public int f7999i;

    /* renamed from: j */
    public String f8000j;

    /* renamed from: k */
    public String f8001k;

    /* renamed from: l */
    public int f8002l;

    /* renamed from: m */
    public int f8003m;

    /* renamed from: n */
    public String f8004n;

    /* renamed from: o */
    public String f8005o;

    /* renamed from: p */
    public long f8006p;

    /* renamed from: q */
    private Context f8007q;

    private static native void nativeAsyncFlush(long j);

    private static native long nativeCreate(int i, boolean z, String str, String str2, int i2, int i3, int i4, String str3, int i5, int i6, String str4, int i7, int i8, int i9, int i10, int i11, int i12, String str5);

    private static native void nativeDestroy(long j);

    public static native long nativeGetLegacyFlushFuncAddr();

    public static native long nativeGetLegacyGetLogFileDirFuncAddr();

    static native long nativeGetLegacyWriteFuncAddr();

    public static native long nativeGetNativeWriteFuncAddr();

    public static native void nativeSetDefaultInstance(long j);

    private static native void nativeSetLevel(long j, int i);

    private static native void nativeSetSyslog(long j, boolean z);

    private static native void nativeSyncFlush(long j);

    private static native void nativeTimedSyncFlush(long j, int i);

    private static native void nativeWrite(long j, int i, String str, String str2);

    public static native void nativeWriteAsyncMsg(long j, int i, String str, String str2, long j2, long j3);

    public void finalize() {
        try {
            super.finalize();
        } finally {
            mo7194a();
        }
    }

    /* renamed from: b */
    public final void mo7198b() {
        MethodCollector.m26663i(3865);
        long j = this.f8006p;
        if (j != 0) {
            nativeAsyncFlush(j);
        }
        MethodCollector.m26664o(3865);
    }

    /* renamed from: c */
    public final void mo7200c() {
        MethodCollector.m26663i(3990);
        long j = this.f8006p;
        if (j != 0) {
            nativeSyncFlush(j);
        }
        MethodCollector.m26664o(3990);
    }

    /* renamed from: com.bytedance.android.alog.Alog$a */
    public enum EnumC2678a {
        NONE(0),
        EC_SECP256K1(1),
        EC_SECP256R1(2);
        
        public final int value;

        static {
            Covode.recordClassIndex(3067);
        }

        private EnumC2678a(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.android.alog.Alog$c */
    public enum EnumC2680c {
        NONE(0),
        ZLIB(1),
        ZSTD(2);
        
        public final int value;

        static {
            Covode.recordClassIndex(3069);
        }

        private EnumC2680c(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.android.alog.Alog$d */
    public enum EnumC2681d {
        SPEED(0),
        SAFE(1);
        
        public final int value;

        static {
            Covode.recordClassIndex(3070);
        }

        private EnumC2681d(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.android.alog.Alog$e */
    public enum EnumC2682e {
        DEFAULT(0),
        LEGACY(1);
        
        public final int value;

        static {
            Covode.recordClassIndex(3071);
        }

        private EnumC2682e(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.android.alog.Alog$f */
    public enum EnumC2683f {
        NONE(0),
        TEA_16(1),
        TEA_32(2),
        TEA_64(3);
        
        public final int value;

        static {
            Covode.recordClassIndex(3072);
        }

        private EnumC2683f(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.android.alog.Alog$g */
    public enum EnumC2684g {
        RAW(0),
        ISO_8601(1);
        
        public final int value;

        static {
            Covode.recordClassIndex(3073);
        }

        private EnumC2684g(int i) {
            this.value = i;
        }
    }

    static {
        Covode.recordClassIndex(3065);
    }

    /* renamed from: a */
    public final void mo7194a() {
        MethodCollector.m26663i(3849);
        synchronized (this) {
            try {
                long j = this.f8006p;
                if (j != 0) {
                    this.f8007q = null;
                    this.f7999i = 6;
                    nativeDestroy(j);
                    this.f8006p = 0;
                }
            } finally {
                MethodCollector.m26664o(3849);
            }
        }
    }

    /* renamed from: com.bytedance.android.alog.Alog$b */
    public static class C2679b {

        /* renamed from: a */
        public int f8011a;

        /* renamed from: b */
        public boolean f8012b;

        /* renamed from: c */
        public String f8013c;

        /* renamed from: d */
        public int f8014d = 2097152;

        /* renamed from: e */
        public int f8015e = 20971520;

        /* renamed from: f */
        public int f8016f = 7;

        /* renamed from: g */
        public String f8017g;

        /* renamed from: h */
        public int f8018h = 65536;

        /* renamed from: i */
        public int f8019i = 196608;

        /* renamed from: j */
        public String f8020j = "b012e20c9aab1cb5257aca2069cb79a9339b3a2224f771c78d64972137936eaf0b2f7ebd8d46c2607e1d7fe7723d40b147b8ecfa8fe2eaeee05210c75822381a";

        /* renamed from: k */
        private Context f8021k;

        /* renamed from: l */
        private String f8022l;

        /* renamed from: m */
        private String f8023m;

        /* renamed from: n */
        private int f8024n = Alog.f7991a;

        /* renamed from: o */
        private int f8025o = Alog.f7992b;

        /* renamed from: p */
        private int f8026p = Alog.f7993c;

        /* renamed from: q */
        private int f8027q = Alog.f7994d;

        /* renamed from: r */
        private int f8028r = Alog.f7995e;

        /* renamed from: s */
        private int f8029s = Alog.f7996f;

        static {
            Covode.recordClassIndex(3068);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
            if (r37.f8013c != null) goto L_0x0065;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x003e, code lost:
            r2 = r37.f8021k;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0044, code lost:
            if (android.text.TextUtils.isEmpty(null) != false) goto L_0x0128;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0046, code lost:
            r1 = r2.getExternalFilesDir(null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x004a, code lost:
            if (r1 == null) goto L_0x010b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x004c, code lost:
            r37.f8013c = r1.getPath() + "/alog";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0067, code lost:
            if (r37.f8017g != null) goto L_0x0084;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0069, code lost:
            r37.f8017g = m7767a(r37.f8021k) + "/alog";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0086, code lost:
            if (r37.f8023m != null) goto L_0x0090;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0088, code lost:
            r37.f8023m = com.bytedance.android.alog.C2689d.m7783a(r37.f8021k);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0090, code lost:
            r2 = (r37.f8018h / 4096) * 4096;
            r37.f8018h = r2;
            r3 = (r37.f8019i / 4096) * 4096;
            r37.f8019i = r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a0, code lost:
            if (r2 >= 4096) goto L_0x00a4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a2, code lost:
            r37.f8018h = 4096;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a4, code lost:
            r2 = r37.f8018h;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a8, code lost:
            if (r3 >= (r2 * 2)) goto L_0x00ae;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x00aa, code lost:
            r37.f8019i = r2 * 2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ae, code lost:
            r16 = new com.bytedance.android.alog.Alog(r37.f8021k, r37.f8011a, r37.f8012b, r37.f8022l, r37.f8013c, r37.f8014d, r37.f8015e, r37.f8016f, r37.f8017g, r37.f8018h, r37.f8019i, r37.f8023m, r37.f8024n, r37.f8025o, r37.f8026p, r37.f8027q, r37.f8028r, r37.f8029s, r37.f8020j);
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(4142);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x010a, code lost:
            return r16;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x010b, code lost:
            r37.f8013c = m7767a(r37.f8021k) + "/alog";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x012a, code lost:
            if (com.p2082ss.android.ugc.aweme.lancet.C58016d.f132223d == null) goto L_0x0130;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x012e, code lost:
            if (com.p2082ss.android.ugc.aweme.lancet.C58016d.f132224e != false) goto L_0x0136;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x0130, code lost:
            com.p2082ss.android.ugc.aweme.lancet.C58016d.f132223d = r2.getExternalFilesDir(null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x0136, code lost:
            r1 = com.p2082ss.android.ugc.aweme.lancet.C58016d.f132223d;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.android.alog.Alog mo7210a() {
            /*
            // Method dump skipped, instructions count: 322
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.alog.Alog.C2679b.mo7210a():com.bytedance.android.alog.Alog");
        }

        /* renamed from: a */
        public final C2679b mo7203a(EnumC2678a aVar) {
            this.f8029s = aVar.value;
            return this;
        }

        /* renamed from: a */
        public final C2679b mo7204a(EnumC2680c cVar) {
            this.f8027q = cVar.value;
            return this;
        }

        /* renamed from: a */
        private static File m7767a(Context context) {
            if (C58016d.f132222c != null && C58016d.f132224e) {
                return C58016d.f132222c;
            }
            File filesDir = context.getFilesDir();
            C58016d.f132222c = filesDir;
            return filesDir;
        }

        /* renamed from: a */
        public final C2679b mo7205a(EnumC2681d dVar) {
            this.f8024n = dVar.value;
            return this;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x003a, code lost:
            if (r1 != null) goto L_0x003c;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C2679b(android.content.Context r3) {
            /*
                r2 = this;
                r2.<init>()
                r0 = 2097152(0x200000, float:2.938736E-39)
                r2.f8014d = r0
                r0 = 20971520(0x1400000, float:3.526483E-38)
                r2.f8015e = r0
                r0 = 7
                r2.f8016f = r0
                r0 = 65536(0x10000, float:9.18355E-41)
                r2.f8018h = r0
                r0 = 196608(0x30000, float:2.75506E-40)
                r2.f8019i = r0
                int r0 = com.bytedance.android.alog.Alog.f7991a
                r2.f8024n = r0
                int r0 = com.bytedance.android.alog.Alog.f7992b
                r2.f8025o = r0
                int r0 = com.bytedance.android.alog.Alog.f7993c
                r2.f8026p = r0
                int r0 = com.bytedance.android.alog.Alog.f7994d
                r2.f8027q = r0
                int r0 = com.bytedance.android.alog.Alog.f7995e
                r2.f8028r = r0
                int r0 = com.bytedance.android.alog.Alog.f7996f
                r2.f8029s = r0
                java.lang.String r0 = "b012e20c9aab1cb5257aca2069cb79a9339b3a2224f771c78d64972137936eaf0b2f7ebd8d46c2607e1d7fe7723d40b147b8ecfa8fe2eaeee05210c75822381a"
                r2.f8020j = r0
                android.content.Context r1 = r3.getApplicationContext()
                boolean r0 = com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a.f132201c
                if (r0 != 0) goto L_0x0040
            L_0x003a:
                if (r1 == 0) goto L_0x003d
            L_0x003c:
                r3 = r1
            L_0x003d:
                r2.f8021k = r3
                return
            L_0x0040:
                if (r1 == 0) goto L_0x0043
                goto L_0x003c
            L_0x0043:
                android.app.Application r1 = com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a.f132199a
                goto L_0x003a
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.alog.Alog.C2679b.<init>(android.content.Context):void");
        }

        /* renamed from: a */
        public final C2679b mo7206a(EnumC2682e eVar) {
            this.f8026p = eVar.value;
            return this;
        }

        /* renamed from: a */
        public final C2679b mo7207a(EnumC2683f fVar) {
            this.f8028r = fVar.value;
            return this;
        }

        /* renamed from: a */
        public final C2679b mo7208a(EnumC2684g gVar) {
            this.f8025o = gVar.value;
            return this;
        }

        /* renamed from: a */
        public final C2679b mo7209a(String str) {
            if (!TextUtils.isEmpty(str)) {
                if (str.contains("-")) {
                    str = str.replace("-", "");
                }
                if (str.contains("_")) {
                    str = str.replace("_", "");
                }
                if (!TextUtils.isEmpty(str)) {
                    this.f8022l = str;
                }
            }
            return this;
        }
    }

    /* renamed from: a */
    public static synchronized void m7759a(AbstractC2687b bVar) {
        synchronized (Alog.class) {
            MethodCollector.m26663i(3684);
            if (f7998h) {
                MethodCollector.m26664o(3684);
                return;
            }
            bVar.mo7212a();
            f7998h = true;
            MethodCollector.m26664o(3684);
        }
    }

    /* renamed from: b */
    public final void mo7199b(int i) {
        MethodCollector.m26663i(4004);
        long j = this.f8006p;
        if (j != 0) {
            nativeSetLevel(j, i);
        }
        MethodCollector.m26664o(4004);
    }

    /* renamed from: a */
    public final void mo7195a(int i) {
        MethodCollector.m26663i(3995);
        long j = this.f8006p;
        if (j != 0) {
            nativeTimedSyncFlush(j, i);
        }
        MethodCollector.m26664o(3995);
    }

    /* renamed from: a */
    public final void mo7197a(boolean z) {
        MethodCollector.m26663i(4068);
        long j = this.f8006p;
        if (j != 0) {
            nativeSetSyslog(j, z);
        }
        MethodCollector.m26664o(4068);
    }

    /* renamed from: a */
    public final void mo7196a(int i, String str, String str2) {
        MethodCollector.m26663i(3862);
        long j = this.f8006p;
        if (!(j == 0 || i < this.f7999i || str == null || str2 == null)) {
            nativeWrite(j, i, str, str2);
        }
        MethodCollector.m26664o(3862);
    }

    public Alog(Context context, int i, boolean z, String str, String str2, int i2, int i3, int i4, String str3, int i5, int i6, String str4, int i7, int i8, int i9, int i10, int i11, int i12, String str5) {
        MethodCollector.m26663i(3799);
        this.f8007q = context;
        this.f7999i = i;
        this.f8000j = str2;
        this.f8001k = str3;
        this.f8002l = i5;
        this.f8003m = i6 / i5;
        this.f8005o = str;
        this.f8006p = nativeCreate(i, z, str, str2, i2, i3, i4, str3, i5, i6, str4, i7, i8, i9, i10, i11, i12, str5);
        MethodCollector.m26664o(3799);
    }
}
