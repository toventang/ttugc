package com.p2082ss.android.ugc.aweme.utils;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.C70622cy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.utils.d */
public final class C80322d {

    /* renamed from: a */
    public static final C80322d f179844a = new C80322d();

    /* renamed from: b */
    private static final List<AbstractC80410ev> f179845b;

    /* renamed from: c */
    private static final boolean f179846c = false;

    private C80322d() {
    }

    static {
        Covode.recordClassIndex(93590);
        ArrayList arrayList = new ArrayList();
        f179845b = arrayList;
        C63244g.m114602a().mo73295w();
        arrayList.add(new AbstractC80410ev() {
            /* class com.p2082ss.android.ugc.aweme.utils.C80322d.C803231 */

            static {
                Covode.recordClassIndex(93591);
            }

            /* renamed from: a */
            private static boolean m139255a(String str, String str2) {
                if (TextUtils.equals(str, "im_story")) {
                    return true;
                }
                if (!TextUtils.equals(str, "story") || !TextUtils.equals(str2, "from_chat")) {
                    return false;
                }
                return true;
            }

            @Override // com.p2082ss.android.ugc.aweme.utils.AbstractC80410ev
            /* renamed from: a */
            public final boolean mo123702a(String str, Map<String, String> map) {
                String str2;
                C89219l.m154721d(str, "");
                String str3 = null;
                if (map != null) {
                    str2 = map.get("shoot_way");
                    str3 = map.get("enter_from");
                } else {
                    str2 = null;
                }
                return m139255a(str2, str3);
            }

            @Override // com.p2082ss.android.ugc.aweme.utils.AbstractC80410ev
            /* renamed from: a */
            public final boolean mo123703a(String str, JSONObject jSONObject) {
                String str2;
                C89219l.m154721d(str, "");
                String str3 = null;
                if (jSONObject != null) {
                    str2 = jSONObject.optString("shoot_way", "");
                    str3 = jSONObject.optString("enter_from", "");
                } else {
                    str2 = null;
                }
                return m139255a(str2, str3);
            }
        });
        arrayList.add(new AbstractC80410ev() {
            /* class com.p2082ss.android.ugc.aweme.utils.C80322d.C803242 */

            static {
                Covode.recordClassIndex(93592);
            }

            @Override // com.p2082ss.android.ugc.aweme.utils.AbstractC80410ev
            /* renamed from: a */
            public final boolean mo123702a(String str, Map<String, String> map) {
                String str2;
                C89219l.m154721d(str, "");
                if (C89361p.m154874b(str, "tool_performance_", false)) {
                    String str3 = null;
                    if (map != null) {
                        str2 = map.get("tool_performance_");
                    } else {
                        str2 = null;
                    }
                    if (TextUtils.isEmpty(str2) && map != null) {
                        String str4 = C70622cy.f158052a.f158050b;
                        if (str4 == null) {
                            str4 = "no_creationId";
                        }
                        map.put("creation_id", str4);
                    }
                    if (map != null) {
                        str3 = map.get("shoot_way");
                    }
                    if (TextUtils.isEmpty(str3) && map != null) {
                        String str5 = C70622cy.f158052a.f158049a;
                        if (str5 == null) {
                            str5 = "no_shootWay";
                        }
                        map.put("shoot_way", str5);
                    }
                }
                return false;
            }

            @Override // com.p2082ss.android.ugc.aweme.utils.AbstractC80410ev
            /* renamed from: a */
            public final boolean mo123703a(String str, JSONObject jSONObject) {
                String str2;
                C89219l.m154721d(str, "");
                if (C89361p.m154874b(str, "tool_performance_", false)) {
                    String str3 = null;
                    if (jSONObject != null) {
                        str2 = jSONObject.optString("creation_id", "");
                    } else {
                        str2 = null;
                    }
                    if (TextUtils.isEmpty(str2) && jSONObject != null) {
                        String str4 = C70622cy.f158052a.f158050b;
                        if (str4 == null) {
                            str4 = "no_creationId";
                        }
                        jSONObject.put("creation_id", str4);
                    }
                    if (jSONObject != null) {
                        str3 = jSONObject.optString("shoot_way", "");
                    }
                    if (TextUtils.isEmpty(str3) && jSONObject != null) {
                        String str5 = C70622cy.f158052a.f158049a;
                        if (str5 == null) {
                            str5 = "no_shootWay";
                        }
                        jSONObject.put("shoot_way", str5);
                    }
                }
                return false;
            }
        });
        arrayList.add(new AbstractC80410ev() {
            /* class com.p2082ss.android.ugc.aweme.utils.C80322d.C803253 */

            static {
                Covode.recordClassIndex(93593);
            }

            @Override // com.p2082ss.android.ugc.aweme.utils.AbstractC80410ev
            /* renamed from: a */
            public final boolean mo123702a(String str, Map<String, String> map) {
                C89219l.m154721d(str, "");
                if (C89219l.m154714a((Object) str, (Object) "shoot") && map != null && map.containsKey("is_ui_shoot")) {
                    String str2 = null;
                    if (!(1 == 0 || this == null)) {
                        if (map != null) {
                            str2 = map.get("is_ui_shoot");
                        }
                        return C89219l.m154714a((Object) str2, (Object) "true");
                    }
                }
                return false;
            }

            @Override // com.p2082ss.android.ugc.aweme.utils.AbstractC80410ev
            /* renamed from: a */
            public final boolean mo123703a(String str, JSONObject jSONObject) {
                C89219l.m154721d(str, "");
                if (!C89219l.m154714a((Object) str, (Object) "shoot") || jSONObject == null || !jSONObject.has("is_ui_shoot") || this == null || jSONObject == null || !jSONObject.optBoolean("is_ui_shoot", false)) {
                    return false;
                }
                return true;
            }
        });
    }

    /* renamed from: a */
    private static String m139250a(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return "";
        }
        String b = C80342dg.m139300a().mo46674b(map);
        C89219l.m154716b(b, "");
        return b;
    }

    /* renamed from: a */
    public static void m139251a(String str, Map<String, String> map) {
        C89219l.m154721d(str, "");
        if (m139253b(str, map)) {
            try {
                C63244g.m114602a().mo73263I().mo101634a(str, map);
                if (f179846c) {
                    m139250a(map);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    private static boolean m139253b(String str, Map<String, String> map) {
        List<AbstractC80410ev> list = f179845b;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().mo123702a(str, map)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static void m139252a(String str, JSONObject jSONObject) {
        C89219l.m154721d(str, "");
        if (m139254b(str, jSONObject)) {
            try {
                C63244g.m114602a().mo73263I().mo101641b(str, jSONObject);
                if (!f179846c) {
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    private static boolean m139254b(String str, JSONObject jSONObject) {
        List<AbstractC80410ev> list = f179845b;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().mo123703a(str, jSONObject)) {
                return false;
            }
        }
        return true;
    }
}
