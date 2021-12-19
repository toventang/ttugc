package com.bytedance.bdlocation.service;

import android.content.Context;
import com.bytedance.bdlocation.C13182f;
import com.bytedance.bdlocation.p846a.C13149a;
import com.bytedance.bdlocation.p846a.C13153b;
import com.bytedance.bdlocation.p846a.C13154c;
import com.bytedance.bdlocation.p846a.C13156e;
import com.bytedance.bdlocation.p848c.C13162b;
import com.bytedance.bdlocation.p853f.C13183a;
import com.bytedance.bpea.basics.AbstractC13343d;
import com.bytedance.bpea.basics.C13340a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import java.util.concurrent.ExecutorService;

/* renamed from: com.bytedance.bdlocation.service.k */
public class C13211k {

    /* renamed from: a */
    public static String f32286a = "bdlocation_upload_cold_start";

    /* renamed from: c */
    static boolean f32287c = true;

    /* renamed from: e */
    private static volatile C13211k f32288e;

    /* renamed from: b */
    Context f32289b;

    /* renamed from: d */
    ExecutorService f32290d;

    /* renamed from: f */
    private C13149a f32291f;

    /* renamed from: g */
    private C13156e f32292g = this.f32291f.f32034a;

    static {
        Covode.recordClassIndex(15160);
    }

    private C13211k(Context context) {
        C40787l.C40788a a = C40787l.m82269a(EnumC40793o.FIXED);
        a.f95505c = 1;
        this.f32290d = C40780g.m82242a(a.mo70028a());
        this.f32289b = context;
        C13149a aVar = new C13149a(f32286a);
        this.f32291f = aVar;
        aVar.mo21243a(C13153b.f32049h * 1000);
    }

    /* renamed from: a */
    public static C13211k m23757a(Context context) {
        MethodCollector.m26663i(3804);
        if (f32288e == null) {
            synchronized (C13211k.class) {
                try {
                    if (f32288e == null) {
                        f32288e = new C13211k(context);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(3804);
                    throw th;
                }
            }
        }
        C13211k kVar = f32288e;
        MethodCollector.m26664o(3804);
        return kVar;
    }

    /* renamed from: a */
    public final synchronized void mo21336a(AbstractC13343d dVar) {
        MethodCollector.m26663i(3856);
        try {
            C13183a aVar = C13190a.m23731a().f32206a;
            long currentTimeMillis = System.currentTimeMillis();
            long b = aVar.mo21285b("firstUploadTime");
            if (b == 0) {
                aVar.mo21284a("firstUploadTime", currentTimeMillis);
                b = currentTimeMillis;
            }
            long b2 = aVar.mo21285b("last_upload_interval");
            int a = aVar.mo21281a("uploadCount");
            C13162b.m23689c("BDRegionLocation upload: time", "UploadScheduleController--requestUploadLocation:--lastuploadTime:" + b2 + "--thisTIme:" + currentTimeMillis + "-interval:" + ((C13153b.f32049h * 1000) / 1000));
            if (currentTimeMillis - b > C13153b.f32050i * 1000) {
                aVar.mo21284a("firstUploadTime", currentTimeMillis);
                aVar.mo21283a("uploadCount", 0);
                a = 0;
            }
            C13162b.m23689c("BDRegionLocation uploadCount:", "---" + a + "--MaxuploadCount:" + C13153b.f32051j);
            if (a >= C13153b.f32051j) {
                C13162b.m23689c("BDRegionLocation upload: count", "Over max times");
            } else if (currentTimeMillis - b2 < C13153b.f32049h * 1000) {
                C13162b.m23689c("BDRegionLocation upload: time", "Not yet reported time");
            } else {
                if (dVar != null) {
                    f32286a = dVar.certToken();
                    this.f32292g.f32079a = dVar.certToken();
                }
                if (C13153b.m23676d() || !C13153b.f32047f) {
                    SystemBaseLocationImpl.uploadDeviceStatus(this.f32289b, this.f32292g);
                    C13162b.m23689c("BDRegionLocation upload: isRestrictedModeOn", "start uploadDeviceStatus");
                    MethodCollector.m26664o(3856);
                    return;
                } else if (!C13182f.m23712b() || !C13182f.m23709a()) {
                    SystemBaseLocationImpl.uploadDeviceStatus(this.f32289b, this.f32292g);
                    C13162b.m23689c("BDRegionLocation upload: uploadDeviceStatus", "start uploadDeviceStatus");
                    MethodCollector.m26664o(3856);
                    return;
                } else {
                    try {
                        C13162b.m23689c("BDRegionLocation upload: getLocation", "start getLocation");
                        this.f32291f.mo21243a(0);
                        this.f32291f.mo21242a(dVar);
                        MethodCollector.m26664o(3856);
                        return;
                    } catch (C13154c e) {
                        C13162b.m23686a("UploadSchedule: getLocation error", e);
                        MethodCollector.m26664o(3856);
                        return;
                    } catch (C13340a e2) {
                        C13162b.m23686a("UploadSchedule: BPEA Cert error", e2);
                        MethodCollector.m26664o(3856);
                        return;
                    }
                }
            }
            C13162b.m23689c("BDRegionLocation upload", "check rule failed");
            MethodCollector.m26664o(3856);
        } catch (Exception e3) {
            C13162b.m23686a(f32286a, e3);
            MethodCollector.m26664o(3856);
        }
    }
}
