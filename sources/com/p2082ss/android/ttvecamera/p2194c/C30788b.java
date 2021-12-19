package com.p2082ss.android.ttvecamera.p2194c;

import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ttvecamera.C30853j;
import com.p2082ss.android.ttvecamera.C30969o;
import com.p2082ss.android.ttvecamera.p2194c.C30783a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ttvecamera.c.b */
public final class C30788b implements C30783a.AbstractC30787d {

    /* renamed from: a */
    public static final Map<C30783a.EnumC30784a, C30783a.EnumC30786c> f73723a;

    static {
        Covode.recordClassIndex(37413);
        HashMap hashMap = new HashMap();
        f73723a = hashMap;
        hashMap.put(C30783a.EnumC30784a.DEPTH_OUTPUT, C30783a.EnumC30786c.STRING);
        hashMap.put(C30783a.EnumC30784a.PREVIEW_SIZE, C30783a.EnumC30786c.STRING);
        hashMap.put(C30783a.EnumC30784a.FPS_RANGE, C30783a.EnumC30786c.STRING);
        hashMap.put(C30783a.EnumC30784a.MANUAL_3A, C30783a.EnumC30786c.STRING);
        hashMap.put(C30783a.EnumC30784a.HIGH_SPEED_VIDEO_FPS_RANGE, C30783a.EnumC30786c.STRING);
        hashMap.put(C30783a.EnumC30784a.SUPPORT_APERTURES, C30783a.EnumC30786c.STRING);
        hashMap.put(C30783a.EnumC30784a.LOGICAL_MULTI_CAMERA, C30783a.EnumC30786c.STRING);
    }

    /* renamed from: com.ss.android.ttvecamera.c.b$1 */
    static /* synthetic */ class C307891 {

        /* renamed from: a */
        static final /* synthetic */ int[] f73724a;

        /* renamed from: b */
        static final /* synthetic */ int[] f73725b;

        /* JADX WARNING: Can't wrap try/catch for region: R(25:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|20|(2:21|22)|23|25|26|27|28|29|30|31|32|(3:33|34|36)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|20|21|22|23|25|26|27|28|29|30|31|32|(3:33|34|36)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|(2:1|2)|3|5|6|7|(2:9|10)|11|13|14|15|17|18|19|20|21|22|23|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0075 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x007f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0089 */
        static {
            /*
            // Method dump skipped, instructions count: 148
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ttvecamera.p2194c.C30788b.C307891.<clinit>():void");
        }
    }

    @Override // com.p2082ss.android.ttvecamera.p2194c.C30783a.AbstractC30787d
    /* renamed from: a */
    public final C30783a.EnumC30786c mo55749a(C30783a.EnumC30784a aVar) {
        Map<C30783a.EnumC30784a, C30783a.EnumC30786c> map = f73723a;
        if (map.get(aVar) == null) {
            return C30783a.EnumC30786c.UNKNOWN;
        }
        return map.get(aVar);
    }

    @Override // com.p2082ss.android.ttvecamera.p2194c.C30783a.AbstractC30787d
    /* renamed from: a */
    public final void mo55750a(List<C30783a.C30785b> list) {
        String str;
        String str2;
        for (C30783a.C30785b bVar : list) {
            switch (C307891.f73725b[bVar.f73719a.ordinal()]) {
                case 1:
                    str = "te_record_camera_depth_capacity";
                    break;
                case 2:
                    str = "te_record_camera_support_preview_size";
                    break;
                case 3:
                    str = "te_record_camera_support_fps_range";
                    break;
                case 4:
                    str = "te_record_camera_manual_3a_capability";
                    break;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    str = "te_record_camera_high_speed_video_fps_range";
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    str = "te_record_camera_support_apertures";
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    str = "te_record_camera_logical_multi_camera_capacity";
                    break;
                default:
                    C30969o.m63688c("TECameraCapabilityKBUpload", "key is null, capability is incorrect!");
                    continue;
            }
            int i = C307891.f73724a[bVar.f73720b.ordinal()];
            if (i == 1 || i == 2) {
                C30853j.m63557a(str, ((Long) bVar.f73721c).longValue());
            } else if (i == 3) {
                C30853j.m63556a(str, ((Double) bVar.f73721c).doubleValue());
            } else if (i == 4) {
                if (((Boolean) bVar.f73721c).booleanValue()) {
                    str2 = "true";
                } else {
                    str2 = "false";
                }
                C30853j.m63558a(str, str2);
            } else if (i == 5) {
                C30853j.m63558a(str, (String) bVar.f73721c);
            }
        }
    }
}
