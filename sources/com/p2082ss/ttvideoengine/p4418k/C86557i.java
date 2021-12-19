package com.p2082ss.ttvideoengine.p4418k;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.ttvideoengine.p4418k.AbstractC86561j;
import com.p2082ss.ttvideoengine.p4430s.C86633c;
import com.p2082ss.ttvideoengine.p4430s.C86641i;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.AbstractC90031ad;
import okhttp3.AbstractC90049e;
import okhttp3.AbstractC90051f;
import okhttp3.C90022aa;
import okhttp3.C90029ac;
import okhttp3.C90204w;
import okhttp3.C90208y;
import okhttp3.Request;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.k.i */
public class C86557i extends AbstractC86561j {

    /* renamed from: a */
    public static final C90204w f195015a = C90204w.m156843b("application/json");

    /* renamed from: c */
    private static C90208y f195016c;

    /* renamed from: e */
    private static boolean f195017e = true;

    /* renamed from: f */
    private static int f195018f = 10;

    /* renamed from: b */
    public int f195019b;

    /* renamed from: d */
    private AbstractC90049e f195020d;

    @Override // com.p2082ss.ttvideoengine.p4418k.AbstractC86561j
    /* renamed from: a */
    public final void mo101097a() {
        AbstractC90049e eVar = this.f195020d;
        if (eVar != null && !eVar.mo144712d()) {
            this.f195020d.mo144710c();
        }
    }

    static {
        Covode.recordClassIndex(101785);
    }

    public C86557i() {
        MethodCollector.m26663i(2642);
        if (f195016c == null) {
            synchronized (C86557i.class) {
                try {
                    m149819b();
                } finally {
                    MethodCollector.m26664o(2642);
                }
            }
            return;
        }
        MethodCollector.m26664o(2642);
    }

    /* renamed from: b */
    private static void m149819b() {
        if (f195016c == null) {
            f195016c = new C90208y.C90210a().mo145088a(10, TimeUnit.SECONDS).mo145102c(10, TimeUnit.SECONDS).mo145098b(10, TimeUnit.SECONDS).mo145103d();
        }
    }

    @Override // com.p2082ss.ttvideoengine.p4418k.AbstractC86561j
    /* renamed from: a */
    public final void mo101098a(String str, final AbstractC86561j.AbstractC86562a aVar) {
        MethodCollector.m26663i(2658);
        synchronized (C86557i.class) {
            try {
                m149819b();
            } catch (Throwable th) {
                MethodCollector.m26664o(2658);
                throw th;
            }
        }
        C90022aa a = C90022aa.m156235a(f195016c, new Request.C90016a().mo144691a(str).mo144698a(), false);
        this.f195020d = a;
        a.mo144708a(new AbstractC90051f() {
            /* class com.p2082ss.ttvideoengine.p4418k.C86557i.C865581 */

            static {
                Covode.recordClassIndex(101786);
            }

            @Override // okhttp3.AbstractC90051f
            public final void onFailure(AbstractC90049e eVar, IOException iOException) {
                C86557i.this.f195019b = 2;
                aVar.mo137467a(null, new C86633c("", -9994, iOException.toString()));
            }

            @Override // okhttp3.AbstractC90051f
            public final void onResponse(AbstractC90049e eVar, C90029ac acVar) {
                JSONObject jSONObject;
                int i;
                Exception e;
                AbstractC90031ad adVar = acVar.f204111g;
                try {
                    jSONObject = new JSONObject(adVar.string());
                    i = -1;
                    e = null;
                    try {
                        if (!acVar.mo144720a()) {
                            e = new Exception("http fail");
                            i = acVar.f204107c;
                        }
                    } catch (Throwable th) {
                        if (adVar != null) {
                            try {
                                adVar.close();
                                throw th;
                            } catch (Exception unused) {
                                throw th;
                            }
                        } else {
                            throw th;
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    jSONObject = null;
                    i = -9979;
                }
                if (adVar != null) {
                    try {
                        adVar.close();
                    } catch (Exception unused2) {
                    }
                }
                if (e == null) {
                    aVar.mo137467a(jSONObject, null);
                } else {
                    aVar.mo137467a(jSONObject, new C86633c("", i, e.toString()));
                }
            }
        });
        MethodCollector.m26664o(2658);
    }

    /* renamed from: a */
    private void m149818a(Request request, final AbstractC86561j.AbstractC86562a aVar) {
        MethodCollector.m26663i(2674);
        synchronized (C86557i.class) {
            try {
                int i = this.f195019b;
                if (i != 3) {
                    if (i != 1) {
                        this.f195019b = 1;
                        C90022aa a = C90022aa.m156235a(f195016c, request, false);
                        this.f195020d = a;
                        a.mo144708a(new AbstractC90051f() {
                            /* class com.p2082ss.ttvideoengine.p4418k.C86557i.C865592 */

                            static {
                                Covode.recordClassIndex(101787);
                            }

                            @Override // okhttp3.AbstractC90051f
                            public final void onFailure(AbstractC90049e eVar, IOException iOException) {
                                C86557i.this.f195019b = 2;
                                aVar.mo137467a(null, new C86633c("", -9994, iOException.toString()));
                            }

                            /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
                                r7 = -1;
                             */
                            /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
                                r6 = r12.f204111g;
                             */
                            /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
                                r0 = r6.string();
                                r4 = new org.json.JSONObject(r0);
                             */
                            /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
                                com.p2082ss.ttvideoengine.p4430s.C86641i.m150113b("TTHTTPNetwork", "startTask onResponse body:".concat(java.lang.String.valueOf(r0)));
                                r3 = null;
                             */
                            /* JADX WARNING: Code restructure failed: missing block: B:18:0x003a, code lost:
                                r0 = e;
                             */
                            /* JADX WARNING: Code restructure failed: missing block: B:19:0x003c, code lost:
                                r0 = e;
                             */
                            /* JADX WARNING: Code restructure failed: missing block: B:20:0x003d, code lost:
                                r4 = null;
                             */
                            /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
                                r3 = r0.toString();
                                r0.printStackTrace();
                                r7 = -9994;
                             */
                            /* JADX WARNING: Code restructure failed: missing block: B:24:0x004b, code lost:
                                if (r12.mo144720a() == false) goto L_0x004d;
                             */
                            /* JADX WARNING: Code restructure failed: missing block: B:25:0x004d, code lost:
                                r3 = r12.f204108d;
                                r7 = r12.f204107c;
                             */
                            /* JADX WARNING: Code restructure failed: missing block: B:26:0x0051, code lost:
                                if (r6 != null) goto L_0x0053;
                             */
                            /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
                                r6.close();
                             */
                            /* JADX WARNING: Code restructure failed: missing block: B:29:0x0056, code lost:
                                if (r3 == null) goto L_0x0058;
                             */
                            /* JADX WARNING: Code restructure failed: missing block: B:31:0x0058, code lost:
                                r7.mo137467a(r4, null);
                                com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(2399);
                             */
                            /* JADX WARNING: Code restructure failed: missing block: B:32:0x0060, code lost:
                                return;
                             */
                            /* JADX WARNING: Code restructure failed: missing block: B:33:0x0061, code lost:
                                r7.mo137467a(r4, new com.p2082ss.ttvideoengine.p4430s.C86633c("", -9994, r7, r3));
                                com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(2399);
                             */
                            /* JADX WARNING: Code restructure failed: missing block: B:34:0x0070, code lost:
                                return;
                             */
                            /* JADX WARNING: Code restructure failed: missing block: B:35:0x0071, code lost:
                                r0 = th;
                             */
                            /* JADX WARNING: Code restructure failed: missing block: B:36:0x0072, code lost:
                                if (r6 != null) goto L_0x0074;
                             */
                            /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
                                r6.close();
                             */
                            /* JADX WARNING: Code restructure failed: missing block: B:39:0x0078, code lost:
                                r0 = th;
                             */
                            /* JADX WARNING: Code restructure failed: missing block: B:40:0x0079, code lost:
                                com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(2399);
                             */
                            /* JADX WARNING: Code restructure failed: missing block: B:42:0x007c, code lost:
                                throw r0;
                             */
                            @Override // okhttp3.AbstractC90051f
                            /* Code decompiled incorrectly, please refer to instructions dump. */
                            public final void onResponse(okhttp3.AbstractC90049e r11, okhttp3.C90029ac r12) {
                                /*
                                // Method dump skipped, instructions count: 131
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.ttvideoengine.p4418k.C86557i.C865592.onResponse(okhttp3.e, okhttp3.ac):void");
                            }
                        });
                        MethodCollector.m26664o(2674);
                        return;
                    }
                }
                C86641i.m150110a("TTHTTPNetwork", "_startTask status error, return. " + this.f195019b);
            } finally {
                MethodCollector.m26664o(2674);
            }
        }
    }

    @Override // com.p2082ss.ttvideoengine.p4418k.AbstractC86561j
    /* renamed from: b */
    public final void mo101100b(String str, Map<String, String> map, AbstractC86561j.AbstractC86562a aVar) {
        MethodCollector.m26663i(2646);
        synchronized (C86557i.class) {
            try {
                m149819b();
            } catch (Throwable th) {
                MethodCollector.m26664o(2646);
                throw th;
            }
        }
        Request.C90016a a = new Request.C90016a().mo144691a(str);
        if (map != null) {
            for (String str2 : map.keySet()) {
                a.mo144692a(str2, map.get(str2));
            }
        }
        m149818a(a.mo144698a(), aVar);
        MethodCollector.m26664o(2646);
    }

    @Override // com.p2082ss.ttvideoengine.p4418k.AbstractC86561j
    /* renamed from: a */
    public final void mo101099a(String str, Map<String, String> map, AbstractC86561j.AbstractC86562a aVar) {
        MethodCollector.m26663i(2648);
        synchronized (C86557i.class) {
            try {
                m149819b();
            } catch (Throwable th) {
                MethodCollector.m26664o(2648);
                throw th;
            }
        }
        Request.C90016a a = new Request.C90016a().mo144691a(str);
        if (map != null && map.size() > 0) {
            for (String str2 : map.keySet()) {
                a.mo144700b(str2, map.get(str2));
            }
        }
        m149818a(a.mo144698a(), aVar);
        MethodCollector.m26664o(2648);
    }

    @Override // com.p2082ss.ttvideoengine.p4418k.AbstractC86561j
    /* renamed from: a */
    public final void mo137818a(String str, Map<String, String> map, final AbstractC86561j.AbstractC86563b bVar) {
        MethodCollector.m26663i(2712);
        synchronized (C86557i.class) {
            try {
                m149819b();
            } catch (Throwable th) {
                MethodCollector.m26664o(2712);
                throw th;
            }
        }
        Request.C90016a a = new Request.C90016a().mo144691a(str);
        if (map != null && map.size() > 0) {
            for (String str2 : map.keySet()) {
                a.mo144700b(str2, map.get(str2));
            }
        }
        C90022aa a2 = C90022aa.m156235a(f195016c, a.mo144698a(), false);
        this.f195020d = a2;
        a2.mo144708a(new AbstractC90051f() {
            /* class com.p2082ss.ttvideoengine.p4418k.C86557i.C865603 */

            static {
                Covode.recordClassIndex(101788);
            }

            @Override // okhttp3.AbstractC90051f
            public final void onFailure(AbstractC90049e eVar, IOException iOException) {
                C86641i.m150113b("TTHTTPNetwork", "startTask onFailure: " + iOException.toString());
                bVar.mo137776a(null, new C86633c("", -9994, iOException.toString()));
            }

            @Override // okhttp3.AbstractC90051f
            public final void onResponse(AbstractC90049e eVar, C90029ac acVar) {
                String str;
                int i;
                AbstractC90031ad adVar = acVar.f204111g;
                try {
                    String string = adVar.string();
                    C86641i.m150113b("TTHTTPNetwork", "startTask onResponse body:".concat(String.valueOf(string)));
                    if (!acVar.mo144720a()) {
                        str = acVar.f204108d;
                        i = acVar.f204107c;
                    } else {
                        i = 0;
                        str = null;
                    }
                    adVar.close();
                    if (str == null) {
                        bVar.mo137776a(string, null);
                    } else if (i == -9979) {
                        bVar.mo137776a(null, new C86633c("", -9979, i, str));
                    } else {
                        bVar.mo137776a(string, new C86633c("", -9994, i, str));
                    }
                } catch (Throwable th) {
                    if (adVar != null) {
                        adVar.close();
                        throw th;
                    }
                    throw th;
                }
            }
        });
        MethodCollector.m26664o(2712);
    }
}
