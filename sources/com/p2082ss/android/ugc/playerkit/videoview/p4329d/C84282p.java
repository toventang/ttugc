package com.p2082ss.android.ugc.playerkit.videoview.p4329d;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.simkit.AbstractC74608c;
import com.p2082ss.android.ugc.aweme.simkit.AbstractC74616d;
import com.p2082ss.android.ugc.playerkit.exp.C84190a;
import com.p2082ss.android.ugc.playerkit.exp.C84191b;
import com.p2082ss.android.ugc.playerkit.model.C84197a;
import com.p2082ss.android.ugc.playerkit.model.C84199c;
import com.p2082ss.android.ugc.playerkit.model.C84209m;
import com.p2082ss.android.ugc.playerkit.model.C84223u;
import com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84241i;
import com.p2082ss.android.ugc.playerkit.videoview.p4326a.C84253c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.ugc.playerkit.videoview.d.p */
public final class C84282p implements AbstractC84272h {

    /* renamed from: e */
    private static AbstractC84283a f188477e;

    /* renamed from: a */
    private long f188478a = 2400000;

    /* renamed from: b */
    private List<AbstractC84278n> f188479b;

    /* renamed from: c */
    private boolean f188480c;

    /* renamed from: d */
    private long f188481d;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.playerkit.videoview.d.p$a */
    public interface AbstractC84283a {

        /* renamed from: com.ss.android.ugc.playerkit.videoview.d.p$a$a */
        public static class C84284a implements AbstractC84283a {
            static {
                Covode.recordClassIndex(98199);
            }

            @Override // com.p2082ss.android.ugc.playerkit.videoview.p4329d.C84282p.AbstractC84283a
            /* renamed from: a */
            public final C84253c mo129307a(C84286c cVar) {
                return null;
            }

            @Override // com.p2082ss.android.ugc.playerkit.videoview.p4329d.C84282p.AbstractC84283a
            /* renamed from: a */
            public final void mo129308a(C84286c cVar, C84253c cVar2) {
            }
        }

        static {
            Covode.recordClassIndex(98198);
        }

        /* renamed from: a */
        C84253c mo129307a(C84286c cVar);

        /* renamed from: a */
        void mo129308a(C84286c cVar, C84253c cVar2);
    }

    static {
        Covode.recordClassIndex(98197);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.playerkit.videoview.d.p$b */
    public static class C84285b implements AbstractC84283a {

        /* renamed from: a */
        public static ConcurrentHashMap<Integer, C84287d> f188482a = new ConcurrentHashMap<>();

        private C84285b() {
        }

        static {
            Covode.recordClassIndex(98200);
        }

        /* synthetic */ C84285b(byte b) {
            this();
        }

        @Override // com.p2082ss.android.ugc.playerkit.videoview.p4329d.C84282p.AbstractC84283a
        /* renamed from: a */
        public final C84253c mo129307a(C84286c cVar) {
            int hashCode = cVar.hashCode();
            C84287d dVar = f188482a.get(Integer.valueOf(hashCode));
            if (dVar == null) {
                return null;
            }
            if (SystemClock.elapsedRealtime() - dVar.f188488a < 600000) {
                if (cVar.f188483a != null) {
                    cVar.f188483a.getSourceId();
                }
                return dVar.f188489b;
            }
            f188482a.remove(Integer.valueOf(hashCode));
            return null;
        }

        @Override // com.p2082ss.android.ugc.playerkit.videoview.p4329d.C84282p.AbstractC84283a
        /* renamed from: a */
        public final void mo129308a(C84286c cVar, C84253c cVar2) {
            if (cVar2.f188433d != null && cVar2.f188433d.getQualityType() > 0) {
                int hashCode = cVar.hashCode();
                f188482a.put(Integer.valueOf(hashCode), new C84287d(cVar2, (byte) 0));
                if (cVar.f188483a != null) {
                    cVar.f188483a.getSourceId();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.playerkit.videoview.d.p$c */
    public static class C84286c {

        /* renamed from: a */
        final C84241i f188483a;

        /* renamed from: b */
        final C84209m.EnumC84214e f188484b;

        /* renamed from: c */
        final boolean f188485c;

        /* renamed from: d */
        final boolean f188486d;

        /* renamed from: e */
        final boolean f188487e = false;

        static {
            Covode.recordClassIndex(98201);
        }

        public final int hashCode() {
            int i;
            C84241i iVar = this.f188483a;
            int i2 = 0;
            if (iVar != null) {
                i = iVar.hashCode();
            } else {
                i = 0;
            }
            int i3 = i * 31;
            C84209m.EnumC84214e eVar = this.f188484b;
            if (eVar != null) {
                i2 = eVar.hashCode();
            }
            return ((((((i3 + i2) * 31) + (this.f188485c ? 1 : 0)) * 31) + (this.f188486d ? 1 : 0)) * 31) + (this.f188487e ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                C84286c cVar = (C84286c) obj;
                if (this.f188485c != cVar.f188485c || this.f188486d != cVar.f188486d || this.f188487e != cVar.f188487e) {
                    return false;
                }
                C84241i iVar = this.f188483a;
                if (iVar == null ? cVar.f188483a != null : !iVar.equals(cVar.f188483a)) {
                    return false;
                }
                if (this.f188484b == cVar.f188484b) {
                    return true;
                }
            }
            return false;
        }

        public C84286c(C84241i iVar, C84209m.EnumC84214e eVar, boolean z) {
            this.f188483a = iVar;
            this.f188484b = eVar;
            this.f188485c = z;
        }
    }

    /* renamed from: a */
    private static AbstractC84283a m144939a() {
        AbstractC84283a aVar;
        if (f188477e == null) {
            if (((Boolean) ((C84190a) C84191b.f187897a.getValue()).mo128997a()).booleanValue()) {
                aVar = new C84285b((byte) 0);
            } else {
                aVar = new AbstractC84283a.C84284a();
            }
            f188477e = aVar;
        }
        return f188477e;
    }

    /* renamed from: com.ss.android.ugc.playerkit.videoview.d.p$d */
    static class C84287d {

        /* renamed from: a */
        final long f188488a;

        /* renamed from: b */
        final C84253c f188489b;

        static {
            Covode.recordClassIndex(98202);
        }

        private C84287d(C84253c cVar) {
            this.f188488a = SystemClock.elapsedRealtime();
            this.f188489b = cVar;
        }

        /* synthetic */ C84287d(C84253c cVar, byte b) {
            this(cVar);
        }
    }

    /* renamed from: a */
    private static String m144940a(String str) {
        if (str == null || !str.startsWith("http") || str.startsWith("https")) {
            return str;
        }
        return str.replaceFirst("http", "https");
    }

    @Override // com.p2082ss.android.ugc.playerkit.videoview.p4329d.AbstractC84272h
    /* renamed from: a */
    public final C84253c mo124208a(C84241i iVar, C84209m.EnumC84214e eVar) {
        return m144942b(iVar, eVar, false, false);
    }

    public C84282p(List<AbstractC84278n> list, long j) {
        this.f188479b = list.isEmpty() ? Collections.singletonList(AbstractC84278n.f188471b) : list;
        this.f188478a = j;
        this.f188480c = AbstractC74616d.m131036a().mo117290b().getSimPlayerExperiment().enableCdnUrlExpiredExperiment();
        this.f188481d = AbstractC74616d.m131036a().mo117290b().getSimPlayerExperiment().cdnUrlExpiredOffset();
    }

    @Override // com.p2082ss.android.ugc.playerkit.videoview.p4329d.AbstractC84272h
    /* renamed from: a */
    public final C84223u mo124206a(C84241i iVar, C84209m.EnumC84214e eVar, boolean z) {
        return mo124207a(iVar, eVar, z, false);
    }

    /* renamed from: a */
    public static List<String> m144941a(String[] strArr, long j, long j2) {
        long defaultCDNTimeoutTime = (long) AbstractC74616d.m131036a().mo117290b().getCommonConfig().getDefaultCDNTimeoutTime();
        boolean enableCdnUrlExpiredExperiment = AbstractC74616d.m131036a().mo117290b().getSimPlayerExperiment().enableCdnUrlExpiredExperiment();
        long cdnUrlExpiredOffset = AbstractC74616d.m131036a().mo117290b().getSimPlayerExperiment().cdnUrlExpiredOffset();
        if (C84199c.f187979a.forceHttps()) {
            for (int i = 0; i < strArr.length; i++) {
                strArr[i] = m144940a(strArr[i]);
            }
        }
        ArrayList arrayList = new ArrayList();
        AbstractC74608c a = AbstractC74616d.m131036a();
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (strArr[i2] != null) {
                if ((strArr[i2].contains("aweme/v1/play") || strArr[i2].contains("aweme/v2/play")) && a.mo117290b().getCommonConfig().getCommonParamsProcessor() != null) {
                    arrayList.add(a.mo117290b().getCommonConfig().getCommonParamsProcessor().mo117327a(strArr[i2]));
                } else {
                    Arrays.toString(strArr);
                    if (j2 <= 0 || !enableCdnUrlExpiredExperiment) {
                        if (SystemClock.elapsedRealtime() - j < defaultCDNTimeoutTime) {
                            arrayList.add(strArr[i2]);
                        }
                    } else if (System.currentTimeMillis() / 1000 < j2 + cdnUrlExpiredOffset) {
                        arrayList.add(strArr[i2]);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    private List<String> m144943b(String[] strArr, long j, long j2) {
        if (C84199c.f187979a.forceHttps()) {
            for (int i = 0; i < strArr.length; i++) {
                strArr[i] = m144940a(strArr[i]);
            }
        }
        ArrayList arrayList = new ArrayList();
        AbstractC74608c a = AbstractC74616d.m131036a();
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (strArr[i2] != null) {
                if ((strArr[i2].contains("aweme/v1/play") || strArr[i2].contains("aweme/v2/play")) && a.mo117290b().getCommonConfig().getCommonParamsProcessor() != null) {
                    arrayList.add(a.mo117290b().getCommonConfig().getCommonParamsProcessor().mo117327a(strArr[i2]));
                } else {
                    Arrays.toString(strArr);
                    if (j2 <= 0 || !this.f188480c) {
                        if (SystemClock.elapsedRealtime() - j < this.f188478a) {
                            arrayList.add(strArr[i2]);
                        }
                    } else if (System.currentTimeMillis() / 1000 < this.f188481d + j2) {
                        arrayList.add(strArr[i2]);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    private C84253c m144942b(C84241i iVar, C84209m.EnumC84214e eVar, boolean z, boolean z2) {
        return m144944c(iVar, eVar, z, z2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x009f  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.p2082ss.android.ugc.playerkit.videoview.p4326a.C84253c m144944c(com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84241i r13, com.p2082ss.android.ugc.playerkit.model.C84209m.EnumC84214e r14, boolean r15, boolean r16) {
        /*
        // Method dump skipped, instructions count: 334
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.playerkit.videoview.p4329d.C84282p.m144944c(com.ss.android.ugc.playerkit.simapicommon.a.i, com.ss.android.ugc.playerkit.model.m$e, boolean, boolean):com.ss.android.ugc.playerkit.videoview.a.c");
    }

    @Override // com.p2082ss.android.ugc.playerkit.videoview.p4329d.AbstractC84272h
    /* renamed from: a */
    public final C84223u mo124207a(C84241i iVar, C84209m.EnumC84214e eVar, boolean z, boolean z2) {
        C84223u a;
        if (iVar != null) {
            if (iVar.isColdBoot() && C84191b.m144781h() && (a = C84267d.f188457a.mo129297a(iVar)) != null) {
                return a;
            }
            if (AbstractC74616d.m131036a().mo117290b() != null && AbstractC74616d.m131036a().mo117290b().getCommonConfig() != null && AbstractC74616d.m131036a().mo117290b().getCommonConfig().isSkipSelectBitrate(iVar) && !TextUtils.isEmpty(AbstractC74616d.m131036a().mo117290b().getCommonConfig().getLocalVideoPath(iVar))) {
                AbstractC74616d.m131036a().mo117290b().getCommonConfig().getLocalVideoPath(iVar);
                C84223u uVar = new C84223u();
                uVar.f188230a = AbstractC74616d.m131036a().mo117290b().getCommonConfig().getLocalVideoPath(iVar);
                uVar.f188233d = AbstractC74616d.m131036a().mo117290b().getCommonConfig().checkIsBytevc1InCache(iVar);
                return uVar;
            }
        }
        C84253c b = m144942b(iVar, eVar, z, z2);
        C84223u uVar2 = new C84223u();
        if (b != null) {
            C84273i iVar2 = new C84273i(iVar, b.f188432c, b.f188430a);
            C84274j a2 = new C84281o(this.f188479b, iVar2, 0).mo129303a(iVar2);
            uVar2.f188230a = a2.f188462a;
            uVar2.f188237h = a2.f188463b;
            uVar2.f188233d = b.f188431b;
            if (b.f188433d != null) {
                uVar2.f188234e = new C84197a(b.f188433d.getBitRate(), b.f188433d.getGearName(), b.f188433d.getQualityType(), b.f188433d.isBytevc1(), b.f188433d.getUrlKey(), b.f188433d.urlList(), b.f188433d.getChecksum(), b.f188433d.getSize());
            }
            if (iVar != null) {
                uVar2.f188231b = iVar.getRatio();
            }
            uVar2.f188235f = b.f188432c;
            uVar2.f188238i = b.f188435f;
            if (b.f188433d != null) {
                uVar2.f188236g = b.f188434e;
            } else if (iVar != null) {
                uVar2.f188236g = iVar.getFileCheckSum();
            }
        }
        return uVar2;
    }
}
