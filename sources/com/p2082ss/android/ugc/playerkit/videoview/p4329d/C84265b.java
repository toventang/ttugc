package com.p2082ss.android.ugc.playerkit.videoview.p4329d;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.simkit.AbstractC74608c;
import com.p2082ss.android.ugc.aweme.simkit.AbstractC74616d;
import com.p2082ss.android.ugc.playerkit.model.C84199c;
import com.p2082ss.android.ugc.playerkit.model.C84221s;
import com.p2082ss.android.ugc.playerkit.session.C84229a;
import com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84235d;
import com.p2082ss.android.ugc.playerkit.videoview.p4326a.C84251a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.ugc.playerkit.videoview.d.b */
public final class C84265b implements AbstractC84270f {

    /* renamed from: a */
    private long f188453a = 2400000;

    /* renamed from: b */
    private List<AbstractC84278n> f188454b;

    /* renamed from: c */
    private boolean f188455c;

    /* renamed from: d */
    private long f188456d;

    static {
        Covode.recordClassIndex(98180);
    }

    @Override // com.p2082ss.android.ugc.playerkit.videoview.p4329d.AbstractC84270f
    /* renamed from: b */
    public final C84221s mo129296b(C84235d dVar) {
        int i;
        int i2;
        float f;
        if (dVar == null) {
            return null;
        }
        C84221s sVar = new C84221s();
        sVar.f188215a = 1;
        String str = "";
        sVar.f188216b = str;
        if (dVar.getUrlList() != null && !dVar.getUrlList().isEmpty()) {
            sVar.f188216b = dVar.getUrlList().get(0);
        }
        if (dVar.getBitRate() != null) {
            i = dVar.getBitRate().intValue();
        } else {
            i = 0;
        }
        sVar.f188217c = i;
        if (dVar.getInfoId() != null) {
            i2 = dVar.getInfoId().intValue();
        } else {
            i2 = -1;
        }
        sVar.f188218d = i2;
        float f2 = 0.0f;
        if (dVar.getLoudness() != null) {
            f = dVar.getLoudness().floatValue();
        } else {
            f = 0.0f;
        }
        sVar.f188219e = f;
        if (dVar.getPeak() != null) {
            f2 = dVar.getPeak().floatValue();
        }
        sVar.f188220f = f2;
        if (dVar.getUrlKey() != null) {
            str = dVar.getUrlKey();
        }
        sVar.f188221g = str;
        sVar.f188222h = false;
        return sVar;
    }

    @Override // com.p2082ss.android.ugc.playerkit.videoview.p4329d.AbstractC84270f
    /* renamed from: a */
    public final C84221s mo129295a(C84235d dVar) {
        int i;
        float f;
        if (dVar == null) {
            return null;
        }
        dVar.getUrlKey();
        int i2 = 0;
        if (dVar.getUrlKey() == null || TextUtils.isEmpty(dVar.getUrlKey()) || dVar.getUrlList() == null || dVar.getUrlList().isEmpty()) {
            return null;
        }
        C84251a aVar = new C84251a();
        aVar.f188426b = dVar.getUrlKey();
        aVar.f188427c = dVar.getFileCheckSum();
        int size = dVar.getUrlList().size();
        String[] strArr = new String[size];
        dVar.getUrlList().toArray(strArr);
        long createTime = dVar.getCreateTime();
        long longValue = dVar.getCdnUrlExpired().longValue();
        if (C84199c.f187979a.forceHttps()) {
            for (int i3 = 0; i3 < size; i3++) {
                String str = strArr[i3];
                if (str != null && str.startsWith("http") && !str.startsWith("https")) {
                    str = str.replaceFirst("http", "https");
                }
                strArr[i3] = str;
            }
        }
        ArrayList arrayList = new ArrayList();
        AbstractC74608c a = AbstractC74616d.m131036a();
        for (int i4 = 0; i4 < size; i4++) {
            if (strArr[i4] != null) {
                if ((strArr[i4].contains("aweme/v1/play") || strArr[i4].contains("aweme/v2/play")) && a.mo117290b().getCommonConfig().getCommonParamsProcessor() != null) {
                    arrayList.add(a.mo117290b().getCommonConfig().getCommonParamsProcessor().mo117327a(strArr[i4]));
                } else {
                    Arrays.toString(strArr);
                    if (longValue <= 0 || !this.f188455c) {
                        if (SystemClock.elapsedRealtime() - createTime < this.f188453a) {
                            arrayList.add(strArr[i4]);
                        }
                    } else if (System.currentTimeMillis() / 1000 < this.f188456d + longValue) {
                        arrayList.add(strArr[i4]);
                    }
                }
            }
        }
        aVar.f188425a = (String[]) arrayList.toArray(new String[0]);
        C84229a.f188297a.mo129049a(aVar.f188426b, aVar.f188427c);
        C84221s sVar = new C84221s();
        C84264a aVar2 = new C84264a(dVar, aVar.f188426b, aVar.f188425a);
        C84274j a2 = new C84281o(this.f188454b, aVar2, 0).mo129302a(aVar2);
        sVar.f188215a = 1;
        String str2 = "";
        if (a2 == null || a2.f188462a == null) {
            sVar.f188216b = str2;
        } else {
            sVar.f188216b = a2.f188462a;
        }
        if (dVar.getBitRate() != null) {
            i2 = dVar.getBitRate().intValue();
        }
        sVar.f188217c = i2;
        if (dVar.getInfoId() != null) {
            i = dVar.getInfoId().intValue();
        } else {
            i = -1;
        }
        sVar.f188218d = i;
        float f2 = 0.0f;
        if (dVar.getLoudness() != null) {
            f = dVar.getLoudness().floatValue();
        } else {
            f = 0.0f;
        }
        sVar.f188219e = f;
        if (dVar.getPeak() != null) {
            f2 = dVar.getPeak().floatValue();
        }
        sVar.f188220f = f2;
        if (dVar.getUrlKey() != null) {
            str2 = dVar.getUrlKey();
        }
        sVar.f188221g = str2;
        if (a2 != null) {
            sVar.f188222h = a2.f188463b;
        }
        return sVar;
    }

    public C84265b(List<AbstractC84278n> list, long j) {
        this.f188454b = list.isEmpty() ? Collections.singletonList(AbstractC84278n.f188471b) : list;
        this.f188453a = j;
        this.f188455c = AbstractC74616d.m131036a().mo117290b().getSimPlayerExperiment().enableCdnUrlExpiredExperiment();
        this.f188456d = AbstractC74616d.m131036a().mo117290b().getSimPlayerExperiment().cdnUrlExpiredOffset();
    }
}
