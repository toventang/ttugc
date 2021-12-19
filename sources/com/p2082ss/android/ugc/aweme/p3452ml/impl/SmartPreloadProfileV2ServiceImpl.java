package com.p2082ss.android.ugc.aweme.p3452ml.impl;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.p890c.p891a.p892a.p893a.C13468b;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.p3452ml.api.ISmartPreloadProfileV2Service;
import com.p2082ss.android.ugc.aweme.p3452ml.api.SmartPreloadProfileV2Service;
import com.p2082ss.android.ugc.aweme.p3452ml.p3456c.C60021c;
import com.p2082ss.android.ugc.aweme.p3452ml.p3456c.C60023d;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ml.impl.SmartPreloadProfileV2ServiceImpl */
public final class SmartPreloadProfileV2ServiceImpl extends SmartPreloadProfileV2Service {

    /* renamed from: a */
    public static final C60064a f136873a = new C60064a((byte) 0);

    /* renamed from: b */
    private boolean f136874b;

    /* renamed from: c */
    private boolean f136875c;

    /* renamed from: d */
    private boolean f136876d;

    static {
        Covode.recordClassIndex(70535);
    }

    /* renamed from: com.ss.android.ugc.aweme.ml.impl.SmartPreloadProfileV2ServiceImpl$a */
    public static final class C60064a {
        static {
            Covode.recordClassIndex(70536);
        }

        private C60064a() {
        }

        public /* synthetic */ C60064a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.api.ISmartPreloadProfileV2Service
    public final boolean ensureEvaluatorAvailable() {
        boolean z = true;
        if (this.f136876d) {
            return true;
        }
        C60021c cVar = C60021c.C60022a.f136711a;
        if (cVar.f136709a == null || !cVar.f136709a.mo53464b()) {
            z = false;
        }
        this.f136876d = z;
        return z;
    }

    /* renamed from: a */
    public static ISmartPreloadProfileV2Service m109541a() {
        MethodCollector.m26663i(13504);
        Object a = C81908b.m141854a(ISmartPreloadProfileV2Service.class, false);
        if (a != null) {
            ISmartPreloadProfileV2Service iSmartPreloadProfileV2Service = (ISmartPreloadProfileV2Service) a;
            MethodCollector.m26664o(13504);
            return iSmartPreloadProfileV2Service;
        }
        if (C81908b.f183257cG == null) {
            synchronized (ISmartPreloadProfileV2Service.class) {
                try {
                    if (C81908b.f183257cG == null) {
                        C81908b.f183257cG = new SmartPreloadProfileV2ServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(13504);
                    throw th;
                }
            }
        }
        SmartPreloadProfileV2Service smartPreloadProfileV2Service = (SmartPreloadProfileV2Service) C81908b.f183257cG;
        MethodCollector.m26664o(13504);
        return smartPreloadProfileV2Service;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.api.ISmartPreloadProfileV2Service
    public final float smartJudge(Aweme aweme, Map<String, Object> map, Map<String, Object> map2) {
        float f;
        C89219l.m154721d(map, "");
        C89219l.m154721d(map2, "");
        float f2 = -1.0f;
        if (aweme == null) {
            return -1.0f;
        }
        if (SmartPreloadProfileV2Service.debug) {
            aweme.getAid();
        }
        if (C60021c.C60022a.f136711a.f136710b != null) {
            this.f136874b = true;
            this.f136875c = false;
            try {
                if (SmartPreloadProfileV2Service.debug) {
                    System.currentTimeMillis();
                }
                if (SmartPreloadProfileV2Service.debug) {
                    System.currentTimeMillis();
                }
                C60021c cVar = C60021c.C60022a.f136711a;
                if (cVar.f136709a != null) {
                    C60023d dVar = cVar.f136709a;
                    try {
                        if (!dVar.mo53465c() || map == null || map.isEmpty() || !dVar.mo53464b()) {
                            SmartPreloadProfileV2Service.getDebug();
                        } else {
                            if (SmartPreloadProfileV2Service.getDebug()) {
                                for (String str : map.keySet()) {
                                    map.get(str);
                                }
                            }
                            Map<String, Float> hashMap = new HashMap<>();
                            List<String> a = dVar.f71806b.mo53455a(map, dVar.mo53460a(), dVar.f71808d.output, dVar.f71808d.feature_list, hashMap);
                            if (SmartPreloadProfileV2Service.getDebug()) {
                                for (String str2 : hashMap.keySet()) {
                                    hashMap.get(str2);
                                }
                            }
                            if (map2 != null && a.size() > 0) {
                                String str3 = a.get(0);
                                boolean equals = TextUtils.equals(str3, "leave");
                                Float f3 = hashMap.get(str3);
                                map2.put("label", a.get(0));
                                if (f3 == null) {
                                    f = -1.0f;
                                } else if (equals) {
                                    f = 1.0f - f3.floatValue();
                                } else {
                                    f = f3.floatValue();
                                }
                                map2.put("probability", Float.valueOf(f));
                            }
                        }
                    } catch (Exception e) {
                        C13468b.m24210a(e);
                    }
                }
                if (SmartPreloadProfileV2Service.debug) {
                    System.currentTimeMillis();
                }
                if (map2.containsKey("label")) {
                    long j = 0;
                    if (SmartPreloadProfileV2Service.debug) {
                        j = System.currentTimeMillis();
                    }
                    Object obj = map2.get("label");
                    if (obj != null) {
                        String str4 = (String) obj;
                        Object obj2 = map2.get("probability");
                        if (SmartPreloadProfileV2Service.debug) {
                            new StringBuilder("SmartPreloadProfileV2Service aid:").append(aweme.getAid()).append(" out:").append(str4).append(" probability:").append(obj2).append(" outCost:").append(System.currentTimeMillis() - j);
                        }
                        if (obj2 instanceof Float) {
                            f2 = ((Number) obj2).floatValue();
                        }
                        this.f136874b = false;
                        return f2;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                this.f136875c = true;
                if (SmartPreloadProfileV2Service.debug) {
                    System.currentTimeMillis();
                    aweme.getAid();
                }
                this.f136874b = false;
            } catch (Throwable unused) {
            }
        }
        return -1.0f;
    }
}
