package com.p2082ss.android.ugc.aweme.shortvideo.upload;

import android.app.Application;
import com.bytedance.common.utility.C13624l;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.deviceregister.DeviceRegisterManager;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.publish.p3619f.C65612d;
import com.p2082ss.android.ugc.aweme.publish.p3619f.C65614f;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.C89376n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.ad */
public final class C73844ad {

    /* renamed from: a */
    public final List<String> f165765a = new ArrayList();

    static {
        Covode.recordClassIndex(86590);
    }

    /* renamed from: c */
    private final void m129909c() {
        m129908a("uid", C63244g.m114602a().mo73255A().mo93904c());
    }

    /* renamed from: d */
    private final void m129910d() {
        String deviceId = DeviceRegisterManager.getDeviceId();
        if (deviceId == null || deviceId.length() == 0) {
            deviceId = "0";
        }
        m129908a("did", deviceId);
    }

    /* renamed from: e */
    private final void m129911e() {
        m129908a("appid", String.valueOf(C63244g.m114602a().mo73295w().mo93771b()));
    }

    /* renamed from: h */
    private final void m129914h() {
        String c = C63244g.m114602a().mo73297y().mo93849c();
        if (c == null) {
            c = "";
        }
        m129908a("carrier_region", c);
    }

    /* renamed from: b */
    public final void mo116304b() {
        m129911e();
        m129910d();
        m129909c();
        m129912f();
        m129913g();
        m129914h();
    }

    /* renamed from: f */
    private final void m129912f() {
        m129908a("version_code", String.valueOf(C63244g.m114602a().mo73267M()));
        m129908a("update_version_code", String.valueOf(C63244g.m114602a().mo73268N()));
    }

    /* renamed from: g */
    private final void m129913g() {
        String str;
        Application application = C63247i.f143610a;
        if (C58029j.f132252d == C13624l.EnumC13625a.UNKNOWN || !C58029j.m104846b() || C58029j.m104847c()) {
            C58029j.f132252d = C13624l.m24487c(application);
        }
        C13624l.EnumC13625a aVar = C58029j.f132252d;
        C89219l.m154716b(aVar, "");
        switch (C73845ae.f165766a[aVar.ordinal()]) {
            case 1:
            case 2:
                str = "null";
                break;
            case 3:
                str = "mobile";
                break;
            case 4:
                str = "2G";
                break;
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                str = "3G";
                break;
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                str = "4G";
                break;
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                str = "5G";
                break;
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                str = "wifi";
                break;
            default:
                throw new C89376n();
        }
        m129908a("net_type", str);
    }

    /* renamed from: a */
    public final String mo116301a() {
        if (this.f165765a.isEmpty()) {
            return "";
        }
        Iterator<T> it = this.f165765a.iterator();
        if (it.hasNext()) {
            String next = it.next();
            while (it.hasNext()) {
                next = next + '&' + ((String) it.next());
            }
            String str = next;
            C84911q.m145921a("UploaderServerParam: ".concat(String.valueOf(str)));
            return str;
        }
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }

    /* renamed from: a */
    public final void mo116302a(C65612d dVar) {
        C89219l.m154721d(dVar, "");
        String str = dVar.f147865k;
        if (str != null && str.length() != 0) {
            m129908a("store_region", str);
        }
    }

    /* renamed from: a */
    public final void mo116303a(C65614f fVar) {
        C89219l.m154721d(fVar, "");
        String str = fVar.f147901p;
        if (str == null || str.length() == 0) {
            str = C63244g.m114602a().mo73297y().mo93847a();
        }
        C89219l.m154716b(str, "");
        m129908a("Region", str);
        String str2 = fVar.f147880C;
        if (str2 != null && str2.length() != 0) {
            m129908a("StoreRegion", str2);
        }
    }

    /* renamed from: a */
    private void m129908a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f165765a.add(str + '=' + str2);
    }
}
