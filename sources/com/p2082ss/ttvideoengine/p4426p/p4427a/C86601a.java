package com.p2082ss.ttvideoengine.p4426p.p4427a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.ttvideoengine.C86540k;
import com.p2082ss.ttvideoengine.p4426p.AbstractC86608b;
import com.p2082ss.ttvideoengine.p4426p.C86599a;
import com.p2082ss.ttvideoengine.p4426p.C86610c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.ttvideoengine.p.a.a */
public final class C86601a {

    /* renamed from: a */
    private static final List<EnumC86604b> f195129a = Collections.unmodifiableList(Arrays.asList(EnumC86604b.BYTEVC2_SOFTWARE, EnumC86604b.BYTEVC1_HARDWARE, EnumC86604b.BYTEVC1_SOFTWARE, EnumC86604b.H264_HARDWARE, EnumC86604b.H264_SOFTWARE));

    /* renamed from: b */
    private static final List<EnumC86604b> f195130b = Collections.unmodifiableList(Arrays.asList(EnumC86604b.BYTEVC1_HARDWARE, EnumC86604b.H264_HARDWARE, EnumC86604b.BYTEVC2_SOFTWARE, EnumC86604b.BYTEVC1_SOFTWARE, EnumC86604b.H264_SOFTWARE));

    /* renamed from: c */
    private static final List<EnumC86604b> f195131c = Collections.unmodifiableList(Arrays.asList(EnumC86604b.H264_SOFTWARE, EnumC86604b.H264_HARDWARE, EnumC86604b.BYTEVC1_SOFTWARE, EnumC86604b.BYTEVC1_HARDWARE));

    /* renamed from: com.ss.ttvideoengine.p.a.a$c */
    public static class C86605c {

        /* renamed from: a */
        public final EnumC86604b f195135a;

        /* renamed from: b */
        public EnumC86604b f195136b;

        /* renamed from: c */
        public final AbstractC86608b f195137c;

        /* renamed from: d */
        public final C86599a.C86600a f195138d;

        static {
            Covode.recordClassIndex(101833);
        }

        public final String toString() {
            return "ResolveResult{dimension=" + this.f195135a + ", correctedDimension=" + this.f195136b + '}';
        }

        public C86605c(AbstractC86608b bVar, EnumC86604b bVar2, C86599a.C86600a aVar) {
            this.f195137c = bVar;
            this.f195135a = bVar2;
            this.f195138d = aVar;
        }
    }

    /* renamed from: com.ss.ttvideoengine.p.a.a$1 */
    static /* synthetic */ class C866021 {

        /* renamed from: a */
        static final /* synthetic */ int[] f195132a;

        /* renamed from: b */
        static final /* synthetic */ int[] f195133b;

        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|18|20) */
        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|(2:1|2)|3|5|6|7|9|10|11|12|13|14|15|16|17|18|20) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0054 */
        static {
            /*
                r0 = 101830(0x18dc6, float:1.42694E-40)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.ss.ttvideoengine.p.b$a[] r0 = com.p2082ss.ttvideoengine.p4426p.AbstractC86608b.EnumC86609a.values()
                int r0 = r0.length
                int[] r1 = new int[r0]
                com.p2082ss.ttvideoengine.p4426p.p4427a.C86601a.C866021.f195133b = r1
                r3 = 1
                com.ss.ttvideoengine.p.b$a r0 = com.p2082ss.ttvideoengine.p4426p.AbstractC86608b.EnumC86609a.DIRECT_URL_SOURCE     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r1[r0] = r3     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                r2 = 2
                int[] r1 = com.p2082ss.ttvideoengine.p4426p.p4427a.C86601a.C866021.f195133b     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.ss.ttvideoengine.p.b$a r0 = com.p2082ss.ttvideoengine.p4426p.AbstractC86608b.EnumC86609a.VID_PLAY_AUTH_TOKEN_SOURCE     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r1[r0] = r2     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                com.ss.ttvideoengine.p.a.a$b[] r0 = com.p2082ss.ttvideoengine.p4426p.p4427a.C86601a.EnumC86604b.values()
                int r0 = r0.length
                int[] r1 = new int[r0]
                com.p2082ss.ttvideoengine.p4426p.p4427a.C86601a.C866021.f195132a = r1
                com.ss.ttvideoengine.p.a.a$b r0 = com.p2082ss.ttvideoengine.p4426p.p4427a.C86601a.EnumC86604b.BYTEVC1_HARDWARE     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r1[r0] = r3     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                int[] r1 = com.p2082ss.ttvideoengine.p4426p.p4427a.C86601a.C866021.f195132a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.ss.ttvideoengine.p.a.a$b r0 = com.p2082ss.ttvideoengine.p4426p.p4427a.C86601a.EnumC86604b.BYTEVC1_SOFTWARE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r1[r0] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r2 = com.p2082ss.ttvideoengine.p4426p.p4427a.C86601a.C866021.f195132a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.ss.ttvideoengine.p.a.a$b r0 = com.p2082ss.ttvideoengine.p4426p.p4427a.C86601a.EnumC86604b.BYTEVC2_SOFTWARE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r2 = com.p2082ss.ttvideoengine.p4426p.p4427a.C86601a.C866021.f195132a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.ss.ttvideoengine.p.a.a$b r0 = com.p2082ss.ttvideoengine.p4426p.p4427a.C86601a.EnumC86604b.H264_HARDWARE     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r2 = com.p2082ss.ttvideoengine.p4426p.p4427a.C86601a.C866021.f195132a     // Catch:{ NoSuchFieldError -> 0x005f }
                com.ss.ttvideoengine.p.a.a$b r0 = com.p2082ss.ttvideoengine.p4426p.p4427a.C86601a.EnumC86604b.H264_SOFTWARE     // Catch:{ NoSuchFieldError -> 0x005f }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x005f }
                r0 = 5
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x005f }
            L_0x005f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.ttvideoengine.p4426p.p4427a.C86601a.C866021.<clinit>():void");
        }
    }

    /* renamed from: com.ss.ttvideoengine.p.a.a$a */
    public static final class C86603a {
        static {
            Covode.recordClassIndex(101831);
        }

        /* renamed from: a */
        public static String m150001a() {
            return "4_h = " + C86540k.m149778d() + ", b_h = " + C86540k.m149775a() + ", b_s = " + C86540k.m149777c() + ", b_s_cap = " + C86540k.m149779e() + ", b2_s = " + C86540k.m149776b();
        }
    }

    /* renamed from: com.ss.ttvideoengine.p.a.a$b */
    public enum EnumC86604b {
        BYTEVC1_HARDWARE(1, "bytevc1"),
        BYTEVC1_SOFTWARE(0, "bytevc1"),
        BYTEVC2_SOFTWARE(0, "bytevc2"),
        H264_HARDWARE(1, "h264"),
        H264_SOFTWARE(0, "h264");
        
        public final int decoder;
        public final String encodeType;

        static {
            Covode.recordClassIndex(101832);
        }

        private EnumC86604b(int i, String str) {
            this.decoder = i;
            this.encodeType = str;
        }
    }

    static {
        Covode.recordClassIndex(101829);
    }

    /* renamed from: a */
    public static C86605c m149999a(AbstractC86608b bVar, List<EnumC86604b> list) {
        List<EnumC86604b> list2 = f195131c;
        ArrayList arrayList = new ArrayList();
        for (EnumC86604b bVar2 : list2) {
            int i = C866021.f195132a[bVar2.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                throw new IllegalArgumentException("unsupported dimension! ".concat(String.valueOf(bVar2)));
                            }
                        } else if (C86540k.m149778d() != 1) {
                            continue;
                        }
                    } else if (C86540k.m149776b() != 1) {
                        continue;
                    }
                } else if (C86540k.m149777c() != 1) {
                    continue;
                }
            } else if (C86540k.m149775a() != 1) {
                continue;
            }
            int i2 = C866021.f195132a[bVar2.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (!(i2 == 3 || i2 == 4 || i2 == 5)) {
                        throw new IllegalArgumentException("unsupported dimension! ".concat(String.valueOf(bVar2)));
                    }
                } else if (C86540k.m149779e() != 1) {
                }
            }
            arrayList.add(bVar2);
        }
        AbstractC86608b.EnumC86609a a = bVar.mo137865a();
        int i3 = C866021.f195133b[a.ordinal()];
        if (i3 == 1) {
            return m149998a((C86599a) bVar, arrayList, list);
        }
        if (i3 == 2) {
            return m150000a((C86610c) bVar, arrayList, list);
        }
        throw new IllegalArgumentException("unsupported type! ".concat(String.valueOf(a)));
    }

    /* renamed from: a */
    private static C86605c m149998a(C86599a aVar, List<EnumC86604b> list, List<EnumC86604b> list2) {
        for (EnumC86604b bVar : list) {
            if (list2 == null || !list2.contains(bVar)) {
                for (C86599a.C86600a aVar2 : Collections.unmodifiableList(aVar.f195123a)) {
                    if (TextUtils.equals(aVar2.f195128d, bVar.encodeType)) {
                        return new C86605c(aVar, bVar, aVar2);
                    }
                }
                continue;
            }
        }
        return null;
    }

    /* renamed from: a */
    private static C86605c m150000a(C86610c cVar, List<EnumC86604b> list, List<EnumC86604b> list2) {
        for (EnumC86604b bVar : list) {
            if ((list2 == null || !list2.contains(bVar)) && (cVar.f195147c == null || TextUtils.equals(cVar.f195147c, bVar.encodeType))) {
                return new C86605c(cVar, bVar, null);
            }
        }
        return null;
    }
}
