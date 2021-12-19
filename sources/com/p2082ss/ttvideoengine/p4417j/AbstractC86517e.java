package com.p2082ss.ttvideoengine.p4417j;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ttvideoengine.EnumC86649v;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.j.e */
public interface AbstractC86517e {
    static {
        Covode.recordClassIndex(101745);
    }

    /* renamed from: a */
    int mo137734a(int i);

    /* renamed from: a */
    int mo137735a(String str);

    /* renamed from: a */
    C86534o mo137736a(EnumC86649v vVar, int i, Map<Integer, String> map);

    /* renamed from: a */
    C86534o mo137737a(EnumC86649v vVar, int i, Map<Integer, String> map, boolean z);

    /* renamed from: a */
    C86534o mo137738a(EnumC86649v vVar, Map<Integer, String> map);

    /* renamed from: a */
    C86534o mo137739a(EnumC86649v vVar, Map<Integer, String> map, boolean z);

    /* renamed from: a */
    String mo137740a(EnumC86649v vVar);

    /* renamed from: a */
    void mo137741a(HashMap<String, EnumC86649v> hashMap);

    /* renamed from: a */
    boolean mo137742a();

    /* renamed from: a */
    boolean mo137743a(EnumC86518a aVar);

    /* renamed from: b */
    String mo137744b(int i);

    /* renamed from: b */
    List<C86534o> mo137745b();

    /* renamed from: b */
    String[] mo137746b(EnumC86649v vVar, Map<Integer, String> map);

    /* renamed from: c */
    List<C86530k> mo137747c();

    /* renamed from: c */
    boolean mo137748c(int i);

    /* renamed from: d */
    long mo137749d(int i);

    /* renamed from: d */
    EnumC86519b mo137750d();

    /* renamed from: e */
    float mo137751e(int i);

    /* renamed from: e */
    String mo137752e();

    /* renamed from: f */
    String[] mo137753f();

    /* renamed from: g */
    String mo137754g();

    /* renamed from: h */
    String mo137755h();

    /* renamed from: i */
    EnumC86649v[] mo137756i();

    /* renamed from: j */
    JSONObject mo137757j();

    /* renamed from: k */
    boolean mo137758k();

    /* renamed from: l */
    boolean mo137759l();

    /* renamed from: m */
    String mo137760m();

    /* renamed from: n */
    JSONObject mo137761n();

    /* renamed from: com.ss.ttvideoengine.j.e$b */
    public enum EnumC86519b {
        None,
        LIVE,
        VOD,
        BARE;

        static {
            Covode.recordClassIndex(101747);
        }
    }

    /* renamed from: com.ss.ttvideoengine.j.e$a */
    public enum EnumC86518a {
        NONE,
        MP4,
        DASH,
        HLS,
        MP3;

        static {
            Covode.recordClassIndex(101746);
        }
    }
}
