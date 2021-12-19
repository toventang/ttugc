package com.p2082ss.android.ugc.aweme.p3452ml.p3454ab;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.ml.ab.f */
public final class C59991f {

    /* renamed from: a */
    public static final SmartSceneReportConfig f136640a = null;

    /* renamed from: b */
    public static float f136641b;

    /* renamed from: c */
    public static float f136642c;

    /* renamed from: d */
    public static final C59991f f136643d = new C59991f();

    /* renamed from: e */
    private static SmartSceneReportConfig f136644e;

    /* renamed from: f */
    private static boolean f136645f;

    /* renamed from: g */
    private static boolean f136646g;

    /* renamed from: h */
    private static List<String> f136647h;

    private C59991f() {
    }

    static {
        Covode.recordClassIndex(70429);
    }

    /* renamed from: a */
    public static boolean m109509a(String str) {
        List<String> list;
        if (!f136645f) {
            SmartSceneReportConfig smartSceneReportConfig = (SmartSceneReportConfig) C16048b.m29633a().mo25416a(false, "ml_scene_report_config", SmartSceneReportConfig.class, f136640a);
            f136644e = smartSceneReportConfig;
            if (smartSceneReportConfig != null) {
                f136646g = smartSceneReportConfig.getEnable();
                f136641b = smartSceneReportConfig.getInitRate();
                f136642c = smartSceneReportConfig.getRunRate();
                String ignoreScene = smartSceneReportConfig.getIgnoreScene();
                if (ignoreScene != null) {
                    list = C89361p.m154915b(ignoreScene, new String[]{","});
                } else {
                    list = null;
                }
                f136647h = list;
            }
            f136645f = true;
        }
        if (!f136646g) {
            return false;
        }
        List<String> list2 = f136647h;
        if (list2 == null || !C89070n.m154556a((Iterable) list2, (Object) str)) {
            return true;
        }
        return false;
    }
}
