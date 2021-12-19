package com.p2082ss.android.ugc.playerkit.videoview.p4329d;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.simkit.AbstractC74608c;
import com.p2082ss.android.ugc.aweme.simkit.AbstractC74616d;
import com.p2082ss.android.ugc.playerkit.model.C84199c;
import com.p2082ss.android.ugc.playerkit.model.C84222t;
import com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84232a;
import com.p2082ss.android.ugc.playerkit.videoview.p4326a.C84252b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.ugc.playerkit.videoview.d.m */
public final class C84277m implements AbstractC84271g {

    /* renamed from: a */
    private long f188467a = 2400000;

    /* renamed from: b */
    private List<AbstractC84278n> f188468b;

    /* renamed from: c */
    private boolean f188469c;

    /* renamed from: d */
    private long f188470d;

    static {
        Covode.recordClassIndex(98192);
    }

    @Override // com.p2082ss.android.ugc.playerkit.videoview.p4329d.AbstractC84271g
    /* renamed from: b */
    public final C84222t mo129300b(C84232a aVar) {
        String str;
        String str2;
        if (aVar == null) {
            return null;
        }
        C84222t tVar = new C84222t();
        tVar.f188223a = aVar.getId();
        String str3 = "";
        if (aVar.getLang() != null) {
            str = aVar.getLang();
        } else {
            str = str3;
        }
        tVar.f188224b = str;
        tVar.f188225c = aVar.getLanguageId();
        if (aVar.getUrl() != null) {
            str2 = aVar.getUrl();
        } else {
            str2 = str3;
        }
        tVar.f188226d = str2;
        tVar.f188227e = aVar.getExpire();
        if (aVar.getCaptionFormat() != null) {
            str3 = aVar.getCaptionFormat();
        }
        tVar.f188228f = str3;
        tVar.f188229g = aVar.getSubId();
        return tVar;
    }

    @Override // com.p2082ss.android.ugc.playerkit.videoview.p4329d.AbstractC84271g
    /* renamed from: a */
    public final C84222t mo129299a(C84232a aVar) {
        String str;
        if (aVar == null) {
            return null;
        }
        String.valueOf(aVar.getSubId());
        if (aVar.getUrl() == null) {
            return null;
        }
        C84252b bVar = new C84252b();
        bVar.f188429b = String.valueOf(aVar.getSubId());
        String[] strArr = new String[0];
        if (aVar.getUrl() != null) {
            strArr = new String[]{aVar.getUrl()};
        }
        long createTime = aVar.getCreateTime();
        long expire = aVar.getExpire();
        if (C84199c.f187979a.forceHttps()) {
            for (int i = 0; i < strArr.length; i++) {
                String str2 = strArr[0];
                if (str2 != null && str2.startsWith("http") && !str2.startsWith("https")) {
                    str2 = str2.replaceFirst("http", "https");
                }
                strArr[0] = str2;
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
                    if (expire <= 0 || !this.f188469c) {
                        if (SystemClock.elapsedRealtime() - createTime < this.f188467a) {
                            arrayList.add(strArr[i2]);
                        }
                    } else if (System.currentTimeMillis() / 1000 < this.f188470d + expire) {
                        arrayList.add(strArr[i2]);
                    }
                }
            }
        }
        bVar.f188428a = (String[]) arrayList.toArray(new String[0]);
        C84222t tVar = new C84222t();
        C84276l lVar = new C84276l(aVar, bVar.f188429b, bVar.f188428a);
        C84274j a2 = new C84281o(this.f188468b, lVar, 0).mo129304a(lVar);
        tVar.f188223a = aVar.getId();
        String str3 = "";
        if (aVar.getLang() != null) {
            str = aVar.getLang();
        } else {
            str = str3;
        }
        tVar.f188224b = str;
        tVar.f188225c = aVar.getLanguageId();
        if (a2 == null || a2.f188462a == null) {
            tVar.f188226d = str3;
        } else {
            tVar.f188226d = a2.f188462a;
        }
        tVar.f188227e = aVar.getExpire();
        if (aVar.getCaptionFormat() != null) {
            str3 = aVar.getCaptionFormat();
        }
        tVar.f188228f = str3;
        tVar.f188229g = aVar.getSubId();
        return tVar;
    }

    public C84277m(List<AbstractC84278n> list, long j) {
        this.f188468b = list.isEmpty() ? Collections.singletonList(AbstractC84278n.f188471b) : list;
        this.f188467a = j;
        this.f188469c = AbstractC74616d.m131036a().mo117290b().getSimPlayerExperiment().enableCdnUrlExpiredExperiment();
        this.f188470d = AbstractC74616d.m131036a().mo117290b().getSimPlayerExperiment().cdnUrlExpiredOffset();
    }
}
