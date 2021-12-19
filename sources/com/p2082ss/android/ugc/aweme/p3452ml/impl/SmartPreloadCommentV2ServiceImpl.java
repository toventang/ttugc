package com.p2082ss.android.ugc.aweme.p3452ml.impl;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.p890c.p891a.p892a.p893a.C13468b;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.p3452ml.api.ISmartPreloadCommentV2Service;
import com.p2082ss.android.ugc.aweme.p3452ml.api.SmartPreloadCommentV2Service;
import com.p2082ss.android.ugc.aweme.p3452ml.p3456c.C60018a;
import com.p2082ss.android.ugc.aweme.p3452ml.p3456c.C60020b;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ml.impl.SmartPreloadCommentV2ServiceImpl */
public final class SmartPreloadCommentV2ServiceImpl extends SmartPreloadCommentV2Service {

    /* renamed from: a */
    public static final C60063a f136869a = new C60063a((byte) 0);

    /* renamed from: b */
    private boolean f136870b;

    /* renamed from: c */
    private boolean f136871c;

    /* renamed from: d */
    private boolean f136872d;

    static {
        Covode.recordClassIndex(70533);
    }

    /* renamed from: com.ss.android.ugc.aweme.ml.impl.SmartPreloadCommentV2ServiceImpl$a */
    public static final class C60063a {
        static {
            Covode.recordClassIndex(70534);
        }

        private C60063a() {
        }

        public /* synthetic */ C60063a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.api.ISmartPreloadCommentV2Service
    public final boolean ensureEvaluatorAvailable() {
        boolean z = true;
        if (this.f136872d) {
            return true;
        }
        C60018a aVar = C60018a.C60019a.f136708a;
        if (aVar.f136706a == null || !aVar.f136706a.mo53464b()) {
            z = false;
        }
        this.f136872d = z;
        return z;
    }

    /* renamed from: a */
    public static ISmartPreloadCommentV2Service m109540a() {
        MethodCollector.m26663i(10984);
        Object a = C81908b.m141854a(ISmartPreloadCommentV2Service.class, false);
        if (a != null) {
            ISmartPreloadCommentV2Service iSmartPreloadCommentV2Service = (ISmartPreloadCommentV2Service) a;
            MethodCollector.m26664o(10984);
            return iSmartPreloadCommentV2Service;
        }
        if (C81908b.f183256cF == null) {
            synchronized (ISmartPreloadCommentV2Service.class) {
                try {
                    if (C81908b.f183256cF == null) {
                        C81908b.f183256cF = new SmartPreloadCommentV2ServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(10984);
                    throw th;
                }
            }
        }
        SmartPreloadCommentV2Service smartPreloadCommentV2Service = (SmartPreloadCommentV2Service) C81908b.f183256cF;
        MethodCollector.m26664o(10984);
        return smartPreloadCommentV2Service;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.api.ISmartPreloadCommentV2Service
    public final float smartJudge(Aweme aweme, Map<String, Object> map, Map<String, Object> map2) {
        float f;
        C89219l.m154721d(map, "");
        C89219l.m154721d(map2, "");
        float f2 = -1.0f;
        if (aweme == null) {
            return -1.0f;
        }
        if (SmartPreloadCommentV2Service.debug) {
            aweme.getAid();
        }
        if (C60018a.C60019a.f136708a.f136707b != null) {
            this.f136870b = true;
            this.f136871c = false;
            try {
                if (SmartPreloadCommentV2Service.debug) {
                    System.currentTimeMillis();
                }
                if (SmartPreloadCommentV2Service.debug) {
                    System.currentTimeMillis();
                }
                C60018a aVar = C60018a.C60019a.f136708a;
                if (aVar.f136706a != null) {
                    C60020b bVar = aVar.f136706a;
                    try {
                        if (!bVar.mo53465c() || map == null || map.isEmpty() || !bVar.mo53464b()) {
                            SmartPreloadCommentV2Service.getDebug();
                        } else {
                            if (SmartPreloadCommentV2Service.getDebug()) {
                                for (String str : map.keySet()) {
                                    map.get(str);
                                }
                            }
                            Map<String, Float> hashMap = new HashMap<>();
                            List<String> a = bVar.f71806b.mo53455a(map, bVar.mo53460a(), bVar.f71808d.output, bVar.f71808d.feature_list, hashMap);
                            if (SmartPreloadCommentV2Service.getDebug()) {
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
                if (SmartPreloadCommentV2Service.debug) {
                    System.currentTimeMillis();
                }
                if (map2.containsKey("label")) {
                    long j = 0;
                    if (SmartPreloadCommentV2Service.debug) {
                        j = System.currentTimeMillis();
                    }
                    Object obj = map2.get("label");
                    if (obj != null) {
                        String str4 = (String) obj;
                        Object obj2 = map2.get("probability");
                        if (SmartPreloadCommentV2Service.debug) {
                            new StringBuilder("SmartPreloadCommentV2Service aid:").append(aweme.getAid()).append(" out:").append(str4).append(" probability:").append(obj2).append(" outCost:").append(System.currentTimeMillis() - j);
                        }
                        if (obj2 instanceof Float) {
                            f2 = ((Number) obj2).floatValue();
                        }
                        this.f136870b = false;
                        return f2;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                this.f136871c = true;
                if (SmartPreloadCommentV2Service.debug) {
                    System.currentTimeMillis();
                    aweme.getAid();
                }
                this.f136870b = false;
            } catch (Throwable unused) {
            }
        }
        return -1.0f;
    }
}
