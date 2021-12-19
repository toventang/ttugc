package com.p2082ss.android.ugc.aweme.search.p3696l.p3697a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.C14612a;
import com.bytedance.ies.ugc.aweme.network.p1264a.C18087e;
import com.p2082ss.android.common.p2132c.C29819a;
import com.p2082ss.android.ugc.aweme.app.api.AbstractC33631g;
import com.p2082ss.android.ugc.aweme.app.api.C33633i;
import com.p2082ss.android.ugc.aweme.performance.C62845i;
import com.p2082ss.android.ugc.aweme.search.model.C67678d;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.search.l.a.h */
public final class C67606h {

    /* renamed from: a */
    public static final Map<Integer, C67607i> f151453a = new LinkedHashMap();

    /* renamed from: b */
    public static C67607i f151454b;

    /* renamed from: c */
    public static final C67606h f151455c = new C67606h();

    /* renamed from: d */
    private static long f151456d;

    private C67606h() {
    }

    static {
        Covode.recordClassIndex(79245);
    }

    /* renamed from: a */
    public static C67607i m119736a(C67678d dVar) {
        if (dVar == null) {
            return C67608j.f151482a;
        }
        C67607i iVar = f151453a.get(Integer.valueOf(dVar.getId()));
        if (iVar == null) {
            return C67608j.f151482a;
        }
        return iVar;
    }

    /* renamed from: a */
    private static void m119737a(JSONObject jSONObject) {
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            Object obj = jSONObject.get(keys.next());
            if (((obj instanceof Integer) && ((Number) obj).intValue() < 0) || ((obj instanceof Long) && ((Number) obj).longValue() < 0)) {
                keys.remove();
            }
        }
    }

    /* renamed from: b */
    public static void m119738b(C67678d dVar) {
        Map<Integer, C67607i> map;
        C67607i iVar;
        C18087e.C18088a aVar;
        String str;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        Integer num6;
        Integer num7;
        C33633i.C33634a aVar2;
        String str2;
        C33633i.C33634a aVar3;
        String str3;
        C33633i.C33634a aVar4;
        String str4;
        C33633i.C33634a aVar5;
        String str5;
        C33633i.C33634a aVar6;
        String str6;
        C33633i.C33634a aVar7;
        String str7;
        C33633i.C33634a aVar8;
        String str8;
        if (dVar != null && (iVar = (map = f151453a).get(Integer.valueOf(dVar.getId()))) != null && iVar.f151457a != 0 && iVar.f151469m != -1) {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                iVar.f151475s = (int) (currentTimeMillis - iVar.f151457a);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("tab_type", iVar.f151477u);
                jSONObject.put("trigger_type", iVar.f151458b);
                jSONObject.put("itemCount", iVar.f151465i);
                jSONObject.put("cost", iVar.f151475s);
                jSONObject.put("netLogId", iVar.f151468l);
                jSONObject.put("status", iVar.f151469m);
                jSONObject.put("errorMsg", iVar.f151470n);
                jSONObject.put("errorCode", iVar.f151471o);
                jSONObject.put("tick_search_start", iVar.f151457a);
                int i = 0;
                if (iVar.f151464h != null) {
                    AbstractC33631g gVar = iVar.f151464h;
                    if (gVar == null) {
                        C89219l.m154715b();
                    }
                    C33633i requestLog = gVar.getRequestLog();
                    if (requestLog != null) {
                        C33633i.C33635b bVar = requestLog.f79820a;
                        if (bVar != null) {
                            str = bVar.f79830a;
                        } else {
                            str = null;
                        }
                        jSONObject.put("libcore", str);
                        C33633i.C33636c cVar = requestLog.f79821b;
                        if (cVar == null || (aVar8 = cVar.f79831a) == null || (str8 = aVar8.f79822a) == null) {
                            num = null;
                        } else {
                            num = Integer.valueOf(Integer.parseInt(str8));
                        }
                        jSONObject.put("body_recv", num);
                        C33633i.C33636c cVar2 = requestLog.f79821b;
                        if (cVar2 == null || (aVar7 = cVar2.f79831a) == null || (str7 = aVar7.f79823b) == null) {
                            num2 = null;
                        } else {
                            num2 = Integer.valueOf(Integer.parseInt(str7));
                        }
                        jSONObject.put("dns", num2);
                        C33633i.C33636c cVar3 = requestLog.f79821b;
                        if (cVar3 == null || (aVar6 = cVar3.f79831a) == null || (str6 = aVar6.f79824c) == null) {
                            num3 = null;
                        } else {
                            num3 = Integer.valueOf(Integer.parseInt(str6));
                        }
                        jSONObject.put("inner", num3);
                        C33633i.C33636c cVar4 = requestLog.f79821b;
                        if (cVar4 == null || (aVar5 = cVar4.f79831a) == null || (str5 = aVar5.f79825d) == null) {
                            num4 = null;
                        } else {
                            num4 = Integer.valueOf(Integer.parseInt(str5));
                        }
                        jSONObject.put("rtt", num4);
                        C33633i.C33636c cVar5 = requestLog.f79821b;
                        if (cVar5 == null || (aVar4 = cVar5.f79831a) == null || (str4 = aVar4.f79826e) == null) {
                            num5 = null;
                        } else {
                            num5 = Integer.valueOf(Integer.parseInt(str4));
                        }
                        jSONObject.put("send", num5);
                        C33633i.C33636c cVar6 = requestLog.f79821b;
                        if (cVar6 == null || (aVar3 = cVar6.f79831a) == null || (str3 = aVar3.f79828g) == null) {
                            num6 = null;
                        } else {
                            num6 = Integer.valueOf(Integer.parseInt(str3));
                        }
                        jSONObject.put("tcp", num6);
                        C33633i.C33636c cVar7 = requestLog.f79821b;
                        if (cVar7 == null || (aVar2 = cVar7.f79831a) == null || (str2 = aVar2.f79829h) == null) {
                            num7 = null;
                        } else {
                            num7 = Integer.valueOf(Integer.parseInt(str2));
                        }
                        jSONObject.put("ttfb", num7);
                    }
                    AbstractC33631g gVar2 = iVar.f151464h;
                    if (gVar2 == null) {
                        C89219l.m154715b();
                    }
                    C14612a requestInfo = gVar2.getRequestInfo();
                    if (requestInfo != null) {
                        if (requestInfo.f35375r > 0) {
                            jSONObject.put("timing_total", requestInfo.f35375r);
                            jSONObject.put("requestStart", requestInfo.f35362e);
                            jSONObject.put("appLevelRequestStart", requestInfo.f35360c);
                            int optInt = jSONObject.optInt("inner");
                            if (optInt > 0) {
                                jSONObject.put("timing_net", requestInfo.f35375r - ((long) optInt));
                            }
                        }
                        C18087e eVar = iVar.f151474r;
                        if (eVar != null) {
                            List<C18087e.C18088a> a = eVar.mo28847a();
                            if (iVar.f151467k == 1 && a.size() >= 2) {
                                aVar = a.get(1);
                            } else if (iVar.f151467k == 0 && a.size() >= 3) {
                                aVar = a.get(2);
                            } else if (iVar.f151467k != -1 || a.size() <= 0) {
                                C89219l.m154716b(a, "");
                                if (!a.isEmpty()) {
                                    aVar = a.get(a.size() - 1);
                                }
                            } else {
                                aVar = a.get(0);
                            }
                            if (aVar != null) {
                                int i2 = ((int) (aVar.f43062c - requestInfo.f35362e)) + aVar.f43061b;
                                int i3 = (((int) (aVar.f43063d - aVar.f43062c)) - aVar.f43061b) - aVar.f43060a;
                                int i4 = aVar.f43060a + i3;
                                if (i2 > 0) {
                                    jSONObject.put("timing_total", i2);
                                    jSONObject.put("client_cost", iVar.f151475s - i2);
                                }
                                if (i4 > 0) {
                                    jSONObject.put("timing_gap_end", i4);
                                }
                                if (i3 > 0) {
                                    jSONObject.put("chunk_data_parsing_cost", i3);
                                }
                            }
                        }
                        if (iVar.f151469m == 2) {
                            jSONObject.put("cancel_search_time", iVar.f151475s);
                        }
                        jSONObject.put("view_draw_cost", currentTimeMillis - iVar.f151459c);
                    }
                }
                m119737a(jSONObject);
                jSONObject.put("is_first_search", iVar.f151472p);
                iVar.mo106607e();
                jSONObject.put("chunk_data_reading_cost", iVar.f151466j);
                jSONObject.put("hit_chunk_cache", iVar.f151467k);
                if (C62845i.m113257a()) {
                    i = 1;
                }
                jSONObject.put("is_poor_performance", i);
                jSONObject.put("keyword", dVar.getKeyword());
                jSONObject.put("cursor", iVar.f151478v);
                jSONObject.put("network_type", iVar.f151463g);
                C29819a.m60077a("search_trigger_refresh_monitor_v2", jSONObject);
                jSONObject.put("native_user_on_bind_view_holder_cost", iVar.f151473q);
                iVar.f151479w = true;
                map.remove(Integer.valueOf(dVar.getId()));
                f151454b = null;
            } catch (Exception e) {
                e.printStackTrace();
                iVar.f151479w = true;
                f151453a.remove(Integer.valueOf(dVar.getId()));
                f151454b = null;
            } catch (Throwable th) {
                iVar.f151479w = true;
                f151453a.remove(Integer.valueOf(dVar.getId()));
                f151454b = null;
                throw th;
            }
        }
    }

    /* renamed from: a */
    public static C67607i m119735a(int i, C67678d dVar) {
        C89219l.m154721d(dVar, "");
        long currentTimeMillis = System.currentTimeMillis();
        f151456d = currentTimeMillis;
        if (currentTimeMillis - f151456d < 1000) {
            return null;
        }
        C67678d copy = dVar.copy();
        C89219l.m154716b(copy, "");
        C67607i iVar = new C67607i(copy);
        iVar.f151457a = currentTimeMillis;
        iVar.f151458b = i;
        f151453a.put(Integer.valueOf(copy.getId()), iVar);
        f151454b = iVar;
        return iVar;
    }
}
