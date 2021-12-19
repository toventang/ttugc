package android.p003ss.com.vboost;

import android.content.Context;
import android.p003ss.com.vboost.p006c.C0029c;
import android.p003ss.com.vboost.p007d.C0051f;
import android.p003ss.com.vboost.p008e.C0059a;
import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: android.ss.com.vboost.a */
public class C0004a {

    /* renamed from: a */
    private static final String f3a = C0004a.class.getSimpleName();

    /* renamed from: b */
    private static final EnumC0058e f4b = EnumC0058e.LEVEL_9;

    /* renamed from: c */
    private static final EnumC0058e f5c = EnumC0058e.LEVEL_9;

    /* renamed from: d */
    private static final EnumC0058e f6d = EnumC0058e.LEVEL_3;

    /* renamed from: e */
    private static final EnumC0058e f7e = EnumC0058e.LEVEL_3;

    /* renamed from: f */
    private static final EnumC0058e f8f = EnumC0058e.LEVEL_9;

    /* renamed from: g */
    private static final EnumC0058e f9g = EnumC0058e.LEVEL_9;

    /* renamed from: h */
    private static final EnumC0058e f10h = EnumC0058e.LEVEL_3;

    /* renamed from: i */
    private static final EnumC0058e f11i = EnumC0058e.LEVEL_3;

    /* renamed from: j */
    private static final EnumC0058e f12j = EnumC0058e.LEVEL_9;

    /* renamed from: k */
    private static final EnumC0058e f13k = EnumC0058e.LEVEL_9;

    /* renamed from: l */
    private static final EnumC0058e f14l = EnumC0058e.LEVEL_3;

    /* renamed from: m */
    private static final EnumC0058e f15m = EnumC0058e.LEVEL_3;

    /* renamed from: n */
    private static final EnumC0058e f16n = EnumC0058e.LEVEL_9;

    /* renamed from: o */
    private static final EnumC0058e f17o = EnumC0058e.LEVEL_9;

    /* renamed from: p */
    private static final EnumC0058e f18p = EnumC0058e.LEVEL_3;

    /* renamed from: q */
    private static final EnumC0058e f19q = EnumC0058e.LEVEL_3;

    /* renamed from: r */
    private static final EnumC0058e f20r = EnumC0058e.LEVEL_9;

    /* renamed from: s */
    private static final EnumC0058e f21s = EnumC0058e.LEVEL_9;

    /* renamed from: t */
    private static final EnumC0058e f22t = EnumC0058e.LEVEL_3;

    /* renamed from: u */
    private static final EnumC0058e f23u = EnumC0058e.LEVEL_3;

    /* renamed from: v */
    private static volatile long f24v = 0;

    /* renamed from: w */
    private static SparseArray<C0026c> f25w = new SparseArray<>();

    static {
        Covode.recordClassIndex(7);
    }

    /* renamed from: a */
    public static void m5a(HashSet<Integer> hashSet) {
        C0051f fVar = C0051f.C0054a.f206a;
        Iterator<Integer> it = hashSet.iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            synchronized (fVar.f199h) {
                fVar.f199h.append(next.intValue(), true);
            }
        }
    }

    /* renamed from: a */
    public static void m4a(Context context) {
        if (C0059a.m96a()) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("registerApplication", 0);
                C0059a.m95a("vboost_event_launch", jSONObject);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        if (C0051f.f192j) {
            if (!C0051f.f191i) {
                if (C0059a.m96a()) {
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("registerApplication", 1);
                        C0059a.m95a("vboost_event_launch", jSONObject2);
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                }
                C0029c.f107a = context;
                C0029c.m64a();
                C0051f.f191i = true;
            } else if (C0059a.m96a()) {
                try {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("registerApplication", -1);
                    C0059a.m95a("vboost_event_launch", jSONObject3);
                } catch (JSONException e3) {
                    e3.printStackTrace();
                }
            }
        } else if (C0059a.m96a()) {
            try {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("registerApplication", -1);
                C0059a.m95a("vboost_event_launch", jSONObject4);
            } catch (JSONException e4) {
                e4.printStackTrace();
            }
        }
        if (C0059a.m96a()) {
            try {
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("registerApplication", 2);
                C0059a.m95a("vboost_event_launch", jSONObject5);
            } catch (JSONException e5) {
                e5.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static int m2a(EnumC0044d dVar, int i) {
        C0026c cVar = new C0026c(CapabilityType.PRESET_SCENE, dVar);
        cVar.f98c = (long) i;
        C0051f.C0054a.f206a.mo41a(cVar);
        return 1;
    }

    /* renamed from: a */
    public static int m3a(EnumC0044d dVar, EnumC0065f fVar) {
        if (fVar == EnumC0065f.END) {
            C0026c cVar = f25w.get(dVar.getId());
            if (cVar == null) {
                dVar.getDesc();
                return 0;
            }
            cVar.f103h = true;
            C0051f.C0054a.f206a.mo41a(cVar);
            f25w.remove(dVar.getId());
        } else {
            C0026c cVar2 = new C0026c(CapabilityType.PRESET_SCENE, dVar);
            cVar2.f103h = false;
            if (C0051f.C0054a.f206a.mo41a(cVar2) != null) {
                f25w.put(dVar.getId(), cVar2);
            }
        }
        return 1;
    }
}
