package com.p2082ss.ttvideoengine.p4421n.p4422a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRAudioStream;
import com.bytedance.vcloud.abrmodule.ABRResult;
import com.bytedance.vcloud.abrmodule.ABRResultElement;
import com.bytedance.vcloud.abrmodule.ABRVideoStream;
import com.bytedance.vcloud.abrmodule.DefaultABRModule;
import com.bytedance.vcloud.abrmodule.IABRModule;
import com.p2082ss.ttvideoengine.C86307af;
import com.p2082ss.ttvideoengine.EnumC86649v;
import com.p2082ss.ttvideoengine.p4407a.C86299a;
import com.p2082ss.ttvideoengine.p4417j.AbstractC86517e;
import com.p2082ss.ttvideoengine.p4417j.C86534o;
import com.p2082ss.ttvideoengine.p4417j.C86537q;
import com.p2082ss.ttvideoengine.p4421n.AbstractC86589c;
import com.p2082ss.ttvideoengine.p4421n.C86578b;
import com.p2082ss.ttvideoengine.p4428q.C86614c;
import com.p2082ss.ttvideoengine.p4429r.C86627c;
import com.p2082ss.ttvideoengine.p4429r.C86628d;
import com.p2082ss.ttvideoengine.p4430s.C86633c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.ttvideoengine.n.a.a */
public final class C86576a implements AbstractC86589c {

    /* renamed from: c */
    private static int f195065c = 4;

    /* renamed from: a */
    private final int f195066a;

    /* renamed from: b */
    private final int f195067b;

    static {
        Covode.recordClassIndex(101804);
    }

    /* renamed from: com.ss.ttvideoengine.n.a.a$a */
    enum EnumC86577a {
        SCREEN_WIDTH,
        SCREEN_HEIGHT,
        DISPLAY_WIDTH,
        DISPLAY_HEIGHT,
        WIFI_DEFAULT_RESOLUTION_INDEX,
        WIFI_DEFAULT_RESOLUTION_QUALITY,
        CELLULAR_MAX_RESOLUTION_INDEX,
        CELLULAR_MAX_RESOLUTION_QUALITY,
        USER_EXPECTED_RESOLUTION_INDEX,
        USER_EXPECTED_RESOLUTION_QUALITY,
        GRACIE_MAX_RESOLUTION_INDEX,
        GRACIE_MAX_RESOLUTION_QUALITY,
        DOWNGRADE_RESOLUTION_INDEX,
        DOWNGRADE_RESOLUTION_QUALITY,
        SR_STRATEGY_CONFIG;

        static {
            Covode.recordClassIndex(101805);
        }
    }

    /* renamed from: a */
    public static void m149949a(int i) {
        f195065c = i;
    }

    @Override // com.p2082ss.ttvideoengine.p4421n.AbstractC86589c
    /* renamed from: a */
    public final C86578b mo137832a(AbstractC86517e eVar, Map<Integer, Object> map) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        C86627c cVar;
        boolean z;
        float f;
        float f2;
        float f3;
        float f4;
        int i10;
        C86628d dVar;
        int i11;
        boolean z2;
        if (eVar == null) {
            return new C86578b(new C86633c("kTTVideoSelector", -7999, "null video model"));
        }
        if (map != null) {
            Object obj = map.get(Integer.valueOf(EnumC86577a.SCREEN_WIDTH.ordinal()));
            if (obj instanceof Integer) {
                i3 = ((Integer) obj).intValue();
            } else {
                i3 = -1;
            }
            Object obj2 = map.get(Integer.valueOf(EnumC86577a.SCREEN_HEIGHT.ordinal()));
            if (obj2 instanceof Integer) {
                i8 = ((Integer) obj2).intValue();
            } else {
                i8 = -1;
            }
            Object obj3 = map.get(Integer.valueOf(EnumC86577a.DISPLAY_WIDTH.ordinal()));
            if (obj3 instanceof Integer) {
                i = ((Integer) obj3).intValue();
            } else {
                i = -1;
            }
            Object obj4 = map.get(Integer.valueOf(EnumC86577a.DISPLAY_HEIGHT.ordinal()));
            if (obj4 instanceof Integer) {
                i2 = ((Integer) obj4).intValue();
            } else {
                i2 = -1;
            }
            Object obj5 = map.get(Integer.valueOf(EnumC86577a.SR_STRATEGY_CONFIG.ordinal()));
            if (obj5 instanceof C86628d) {
                dVar = (C86628d) obj5;
            } else {
                dVar = null;
            }
            i9 = m149948a(EnumC86577a.WIFI_DEFAULT_RESOLUTION_INDEX.ordinal(), EnumC86577a.WIFI_DEFAULT_RESOLUTION_QUALITY.ordinal(), map, eVar);
            i6 = m149948a(EnumC86577a.USER_EXPECTED_RESOLUTION_INDEX.ordinal(), EnumC86577a.USER_EXPECTED_RESOLUTION_QUALITY.ordinal(), map, eVar);
            i4 = m149948a(EnumC86577a.CELLULAR_MAX_RESOLUTION_INDEX.ordinal(), EnumC86577a.CELLULAR_MAX_RESOLUTION_QUALITY.ordinal(), map, eVar);
            i5 = m149948a(EnumC86577a.GRACIE_MAX_RESOLUTION_INDEX.ordinal(), EnumC86577a.GRACIE_MAX_RESOLUTION_QUALITY.ordinal(), map, eVar);
            i7 = m149948a(EnumC86577a.DOWNGRADE_RESOLUTION_INDEX.ordinal(), EnumC86577a.DOWNGRADE_RESOLUTION_QUALITY.ordinal(), map, eVar);
            if (dVar != null) {
                cVar = new C86627c();
                if (eVar.mo137743a(AbstractC86517e.EnumC86518a.DASH)) {
                    i11 = 2;
                } else {
                    i11 = 0;
                }
                if (eVar.mo137743a(AbstractC86517e.EnumC86518a.MP4)) {
                    i11 |= 1;
                }
                dVar.mo137894c(i11);
                dVar.mo137895d(eVar.mo137734a(3));
                List<C86534o> b = eVar.mo137745b();
                if (b != null && b.size() > 0) {
                    Iterator<C86534o> it = b.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        String b2 = it.next().mo137726b(32);
                        if (b2 != null && b2.toLowerCase().contains("hdr")) {
                            z2 = true;
                            break;
                        }
                    }
                }
                z2 = false;
                dVar.mo137888a(z2);
                cVar.mo137885a(dVar);
            }
            cVar = null;
        } else {
            i7 = -1;
            i5 = -1;
            i3 = -1;
            i8 = -1;
            i = -1;
            i2 = -1;
            i9 = -1;
            i6 = -1;
            i4 = -1;
            cVar = null;
        }
        IABRModule b3 = C86299a.m148585a().mo137120b();
        if (b3 == null) {
            b3 = new DefaultABRModule();
            z = false;
        } else {
            z = true;
        }
        b3.setIntOptionForKey(14, this.f195066a);
        b3.setIntOptionForKey(6, i);
        b3.setIntOptionForKey(7, i2);
        b3.setIntOptionForKey(34, i3);
        b3.setIntOptionForKey(35, i8);
        b3.setLongOptionForKey(12, (long) i9);
        b3.setLongOptionForKey(2, (long) i4);
        b3.setLongOptionForKey(13, (long) i5);
        b3.setLongOptionForKey(22, (long) i6);
        b3.setLongOptionForKey(33, (long) i7);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<C86534o> b4 = eVar.mo137745b();
        if (b4 == null) {
            b4 = Collections.emptyList();
        }
        for (C86534o oVar : b4) {
            if (oVar != null) {
                if (oVar.mo137723a() == C86537q.f194867a) {
                    ABRVideoStream aBRVideoStream = new ABRVideoStream();
                    String b5 = oVar.mo137726b(15);
                    aBRVideoStream.setStreamId(b5);
                    aBRVideoStream.setBandWidth(oVar.mo137724a(3));
                    aBRVideoStream.setCodec(oVar.mo137726b(8));
                    int a = oVar.mo137724a(1);
                    int a2 = oVar.mo137724a(2);
                    aBRVideoStream.setWidth(a);
                    aBRVideoStream.setHeight(a2);
                    aBRVideoStream.setFrameRate(-1);
                    aBRVideoStream.setSegmentDuration(5000);
                    if (!TextUtils.isEmpty(b5)) {
                        arrayList.add(aBRVideoStream);
                    }
                    aBRVideoStream.setSupportSR(0);
                    if (cVar != null) {
                        Integer num = cVar.f195210a.f195230i;
                        Integer num2 = cVar.f195210a.f195231j;
                        if (num != null && num2 != null && a <= num.intValue() && a2 <= num2.intValue()) {
                            aBRVideoStream.setSupportSR(1);
                        }
                    }
                    EnumC86649v c = oVar.mo137729c();
                    if (c != null) {
                        i10 = c.getIndex();
                    } else {
                        i10 = -1;
                    }
                    String b6 = oVar.mo137726b(32);
                    if (b6 != null) {
                        try {
                            i10 = Integer.parseInt(b6);
                        } catch (NumberFormatException unused) {
                        }
                    }
                    aBRVideoStream.setResolution(i10);
                } else {
                    ABRAudioStream aBRAudioStream = new ABRAudioStream();
                    String b7 = oVar.mo137726b(15);
                    aBRAudioStream.setStreamId(b7);
                    aBRAudioStream.setBandWidth(oVar.mo137724a(3));
                    aBRAudioStream.setCodec(oVar.mo137726b(8));
                    aBRAudioStream.setSampleRate(-1);
                    aBRAudioStream.setSegmentDuration(5000);
                    if (!TextUtils.isEmpty(b7)) {
                        arrayList2.add(aBRAudioStream);
                    }
                }
            }
        }
        b3.setMediaInfo(arrayList, arrayList2);
        float f5 = 0.0f;
        if (C86614c.f195160b != null) {
            Map<String, String> downloadSpeed = C86614c.f195160b.getDownloadSpeed(C86537q.f194867a);
            if (!(downloadSpeed == null || downloadSpeed.get("download_speed") == null)) {
                f5 = Float.parseFloat(downloadSpeed.get("download_speed"));
            }
            f = C86614c.f195160b.getPredictSpeed(0);
            f2 = C86614c.f195160b.getLastPredictConfidence();
            f3 = C86614c.f195160b.getAverageDownloadSpeed(C86537q.f194867a, 3, false);
            f4 = C86614c.f195160b.getAverageDownloadSpeed(C86537q.f194867a, f195065c, false);
        } else {
            f = 0.0f;
            f2 = 0.0f;
            f3 = 0.0f;
            f4 = 0.0f;
        }
        b3.setFloatOptionForKey(25, f5);
        b3.setFloatOptionForKey(23, f);
        b3.setFloatOptionForKey(24, f2);
        b3.setFloatOptionForKey(27, f3);
        b3.setFloatOptionForKey(28, f4);
        b3.setIntOptionForKey(21, C86307af.m148603a().f192812a);
        if (cVar != null) {
            b3.setIntOptionForKey(39, cVar.mo137886b() ? 1 : 0);
            b3.setIntOptionForKey(40, cVar.f195213d ? 1 : 0);
            b3.setSRBenchmarkMap(cVar.f195218i);
        }
        ABRResult onceSelect = b3.onceSelect(this.f195067b, this.f195066a);
        if (z) {
            String b8 = eVar.mo137744b(2);
            if (TextUtils.isEmpty(b8)) {
                C86299a.m148585a().mo137119a(b3);
            } else {
                C86299a a3 = C86299a.m148585a();
                a3.f192761a.lock();
                b3.stop();
                a3.f192763c.put(b8, b3);
                a3.f192762b.remove(b8);
                a3.f192762b.add(b8);
                a3.f192761a.unlock();
            }
        } else {
            b3.release();
        }
        if (onceSelect == null) {
            return new C86578b(new C86633c("kTTVideoSelector", -7997, "null abr result"));
        }
        int i12 = 0;
        while (true) {
            if (i12 >= onceSelect.size()) {
                break;
            }
            ABRResultElement aBRResultElement = onceSelect.get(i12);
            if (aBRResultElement.getMediaType() == C86537q.f194867a) {
                long bitrate = aBRResultElement.getBitrate();
                if (bitrate > 0) {
                    long j = -1;
                    C86534o oVar2 = null;
                    for (C86534o oVar3 : b4) {
                        if (!(oVar3 == null || oVar3.mo137723a() == C86537q.f194868b || oVar3.mo137729c() == null)) {
                            long a4 = (long) oVar3.mo137724a(3);
                            if (j < 0 || Math.abs(a4 - bitrate) < j) {
                                j = Math.abs(a4 - bitrate);
                                oVar2 = oVar3;
                            }
                        }
                    }
                    if (oVar2 != null) {
                        return new C86578b(oVar2);
                    }
                }
            } else {
                i12++;
            }
        }
        return new C86578b(new C86633c("kTTVideoSelector", -7999, "null video info fit bitrate"));
    }

    /* renamed from: a */
    private static int m149948a(int i, int i2, Map<Integer, Object> map, AbstractC86517e eVar) {
        int i3;
        Object obj = map.get(Integer.valueOf(i));
        if (obj instanceof Integer) {
            i3 = ((Integer) obj).intValue();
        } else {
            i3 = -1;
        }
        Object obj2 = map.get(Integer.valueOf(i2));
        if ((i3 == -1 || i3 == EnumC86649v.Auto.getIndex()) && obj2 == null) {
            return -1;
        }
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.clear();
        if (obj2 instanceof String) {
            hashMap.put(32, obj2);
        }
        C86534o a = eVar.mo137739a(EnumC86649v.valueOf(i3), hashMap, true);
        if (a != null) {
            return a.mo137724a(3);
        }
        return -1;
    }
}
