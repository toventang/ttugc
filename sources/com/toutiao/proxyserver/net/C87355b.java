package com.toutiao.proxyserver.net;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.baselib.network.http.C14612a;
import com.bytedance.frameworks.baselib.network.http.p995g.C14759i;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.client.C22027b;
import com.bytedance.ttnet.p1703d.C22944d;
import com.bytedance.ttnet.utils.RetrofitUtils;
import com.toutiao.proxyserver.C87349k;
import com.toutiao.proxyserver.C87383u;
import com.toutiao.proxyserver.p4490b.C87297c;
import com.toutiao.proxyserver.p4493e.C87312c;
import com.toutiao.proxyserver.p4495g.C87328b;
import java.io.IOException;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import okhttp3.AbstractC90057i;
import okhttp3.AbstractC90189o;
import okhttp3.AbstractC90202u;
import okhttp3.C90029ac;
import okhttp3.C90034ae;
import okhttp3.C90198s;
import okhttp3.C90208y;
import okhttp3.EnumC90211z;
import okhttp3.Request;

/* renamed from: com.toutiao.proxyserver.net.b */
public final class C87355b {

    /* renamed from: a */
    public static final Map<Long, C87297c> f198009a = new ConcurrentHashMap();

    /* renamed from: b */
    public static final Map<Long, Pair<String, List<InetAddress>>> f198010b = new ConcurrentHashMap();

    /* renamed from: c */
    private static C90208y f198011c;

    static {
        Covode.recordClassIndex(103252);
    }

    /* renamed from: a */
    private static synchronized C90208y m151609a() {
        C90208y yVar;
        synchronized (C87355b.class) {
            MethodCollector.m26663i(12555);
            if (f198011c == null) {
                C90208y.C90210a aVar = new C90208y.C90210a();
                if (!C87383u.f198101u) {
                    aVar.mo145089a(Collections.singletonList(EnumC90211z.HTTP_1_1));
                }
                aVar.mo145088a(10000, TimeUnit.MILLISECONDS).mo145098b(10000, TimeUnit.MILLISECONDS).mo145102c(10000, TimeUnit.MILLISECONDS);
                aVar.mo145094a(new AbstractC90189o() {
                    /* class com.toutiao.proxyserver.net.C87355b.C873561 */

                    static {
                        Covode.recordClassIndex(103253);
                    }

                    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
                    @Override // okhttp3.AbstractC90189o
                    /* renamed from: a */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final java.util.List<java.net.InetAddress> mo23717a(java.lang.String r7) {
                        /*
                        // Method dump skipped, instructions count: 109
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.toutiao.proxyserver.net.C87355b.C873561.mo23717a(java.lang.String):java.util.List");
                    }
                });
                aVar.f204935e.add(new AbstractC90202u() {
                    /* class com.toutiao.proxyserver.net.C87355b.C873572 */

                    static {
                        Covode.recordClassIndex(103254);
                    }

                    @Override // okhttp3.AbstractC90202u
                    public final C90029ac intercept(AbstractC90202u.AbstractC90203a aVar) {
                        Request a = aVar.mo144856a();
                        Request.C90016a newBuilder = a.newBuilder();
                        long a2 = C87383u.m151656a();
                        final C87297c cVar = new C87297c();
                        cVar.f197866a = a.header("Vpwp-Raw-Key");
                        cVar.f197869d = a.url().toString();
                        try {
                            if (a.header("local_url_index") != null) {
                                cVar.f197878m = Integer.valueOf(a.header("local_url_index")).intValue();
                            }
                            if (a.header("local_url_count") != null) {
                                cVar.f197879n = Integer.valueOf(a.header("local_url_count")).intValue();
                            }
                        } catch (Exception unused) {
                        }
                        newBuilder.mo144690a(Object.class, Long.valueOf(a2));
                        if (!C87383u.f198077B) {
                            newBuilder.mo144699b("Vpwp-Raw-Key");
                        }
                        newBuilder.mo144699b("local_url_index");
                        newBuilder.mo144699b("local_url_count");
                        C87355b.f198009a.put(Long.valueOf(a2), cVar);
                        Request a3 = newBuilder.mo144698a();
                        try {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            C90029ac a4 = aVar.mo144857a(a3);
                            cVar.f197874i = SystemClock.elapsedRealtime() - elapsedRealtime;
                            cVar.f197877l = a4.f204107c;
                            try {
                                cVar.f197875j = Integer.parseInt(a4.mo144718a("Content-Length", "0"));
                            } catch (Exception unused2) {
                                cVar.f197875j = 0;
                            }
                            try {
                                cVar.f197876k = new HashMap();
                                cVar.f197876k.put("X-Cache", a4.mo144718a("X-Cache", null));
                                cVar.f197876k.put("X-M-Cache", a4.mo144718a("X-M-Cache", null));
                                cVar.f197876k.put("X-Cache-Remote", a4.mo144718a("X-Cache-Remote", null));
                                cVar.f197876k.put("Server-Timing", C87355b.m151607a(a4.f204110f));
                            } catch (Exception unused3) {
                                cVar.f197876k = null;
                            }
                            C87355b.f198009a.remove(a3.tag());
                            Pair<String, List<InetAddress>> remove = C87355b.f198010b.remove(a3.tag());
                            if (remove != null) {
                                cVar.f197867b = (String) remove.first;
                                if (remove.second != null) {
                                    cVar.f197868c = remove.second.toString();
                                }
                            }
                            C87328b.m151562b(new Runnable() {
                                /* class com.toutiao.proxyserver.net.C87355b.C873572.RunnableC873581 */

                                static {
                                    Covode.recordClassIndex(103255);
                                }

                                public final void run() {
                                    if (C87383u.f198087g != null) {
                                        C87383u.f198087g.mo124036a(cVar);
                                    }
                                }
                            });
                            return a4;
                        } catch (IOException e) {
                            if ((e instanceof SocketTimeoutException) || (e instanceof ConnectException)) {
                                cVar.f197877l = -104;
                            } else {
                                cVar.f197877l = -10000;
                            }
                            throw e;
                        } catch (Throwable th) {
                            C87355b.f198009a.remove(a3.tag());
                            Pair<String, List<InetAddress>> remove2 = C87355b.f198010b.remove(a3.tag());
                            if (remove2 != null) {
                                cVar.f197867b = (String) remove2.first;
                                if (remove2.second != null) {
                                    cVar.f197868c = remove2.second.toString();
                                }
                            }
                            C87328b.m151562b(new Runnable() {
                                /* class com.toutiao.proxyserver.net.C87355b.C873572.RunnableC873581 */

                                static {
                                    Covode.recordClassIndex(103255);
                                }

                                public final void run() {
                                    if (C87383u.f198087g != null) {
                                        C87383u.f198087g.mo124036a(cVar);
                                    }
                                }
                            });
                            throw th;
                        }
                    }
                });
                aVar.f204936f.add(new AbstractC90202u() {
                    /* class com.toutiao.proxyserver.net.C87355b.C873593 */

                    static {
                        Covode.recordClassIndex(103256);
                    }

                    @Override // okhttp3.AbstractC90202u
                    public final C90029ac intercept(AbstractC90202u.AbstractC90203a aVar) {
                        Socket b;
                        String str;
                        String str2;
                        InetSocketAddress inetSocketAddress;
                        Socket b2;
                        String str3;
                        String str4;
                        InetSocketAddress inetSocketAddress2;
                        Request a = aVar.mo144856a();
                        String header = a.header("User-Agent");
                        InetAddress inetAddress = null;
                        try {
                            C90029ac a2 = aVar.mo144857a(a);
                            C87297c cVar = C87355b.f198009a.get(a.tag());
                            if (cVar != null) {
                                AbstractC90057i b3 = aVar.mo144859b();
                                if (b3 == null) {
                                    b2 = null;
                                } else {
                                    b2 = b3.mo144779b();
                                }
                                if (b2 != null) {
                                    InetAddress localAddress = b2.getLocalAddress();
                                    if (localAddress == null || localAddress.isAnyLocalAddress()) {
                                        str3 = null;
                                    } else {
                                        str3 = localAddress.getHostAddress();
                                    }
                                    InetAddress inetAddress2 = b2.getInetAddress();
                                    if (inetAddress2 != null) {
                                        str4 = inetAddress2.getHostAddress();
                                    } else {
                                        str4 = null;
                                    }
                                    if (TextUtils.isEmpty(str3)) {
                                        str3 = C87383u.f198086f;
                                    }
                                    if (!TextUtils.isEmpty(str3)) {
                                        C87383u.f198086f = str3;
                                    }
                                    if (TextUtils.isEmpty(str4)) {
                                        C90034ae a3 = b3.mo144778a();
                                        if (a3 == null) {
                                            inetSocketAddress2 = null;
                                        } else {
                                            inetSocketAddress2 = a3.f204139c;
                                        }
                                        if (inetSocketAddress2 != null) {
                                            inetAddress = inetSocketAddress2.getAddress();
                                        }
                                        if (inetAddress != null) {
                                            str4 = inetAddress.getHostAddress();
                                        }
                                    }
                                    cVar.f197871f = str3;
                                    cVar.f197872g = str4;
                                    C87349k.C87350a.f198001a.mo141390a(cVar.f197869d, cVar);
                                    cVar.f197870e = a.url().toString();
                                    cVar.f197873h = header;
                                }
                            }
                            return a2;
                        } catch (IOException e) {
                            throw e;
                        } catch (Throwable th) {
                            C87297c cVar2 = C87355b.f198009a.get(a.tag());
                            if (cVar2 != null) {
                                AbstractC90057i b4 = aVar.mo144859b();
                                if (b4 == null) {
                                    b = null;
                                } else {
                                    b = b4.mo144779b();
                                }
                                if (b != null) {
                                    InetAddress localAddress2 = b.getLocalAddress();
                                    if (localAddress2 == null || localAddress2.isAnyLocalAddress()) {
                                        str = null;
                                    } else {
                                        str = localAddress2.getHostAddress();
                                    }
                                    InetAddress inetAddress3 = b.getInetAddress();
                                    if (inetAddress3 != null) {
                                        str2 = inetAddress3.getHostAddress();
                                    } else {
                                        str2 = null;
                                    }
                                    if (TextUtils.isEmpty(str)) {
                                        str = C87383u.f198086f;
                                    }
                                    if (!TextUtils.isEmpty(str)) {
                                        C87383u.f198086f = str;
                                    }
                                    if (TextUtils.isEmpty(str2)) {
                                        C90034ae a4 = b4.mo144778a();
                                        if (a4 == null) {
                                            inetSocketAddress = null;
                                        } else {
                                            inetSocketAddress = a4.f204139c;
                                        }
                                        if (inetSocketAddress != null) {
                                            inetAddress = inetSocketAddress.getAddress();
                                        }
                                        if (inetAddress != null) {
                                            str2 = inetAddress.getHostAddress();
                                        }
                                    }
                                    cVar2.f197871f = str;
                                    cVar2.f197872g = str2;
                                    C87349k.C87350a.f198001a.mo141390a(cVar2.f197869d, cVar2);
                                    cVar2.f197870e = a.url().toString();
                                    cVar2.f197873h = header;
                                }
                            }
                            throw th;
                        }
                    }
                });
                f198011c = aVar.mo145103d();
            }
            yVar = f198011c;
            MethodCollector.m26664o(12555);
        }
        return yVar;
    }

    /* renamed from: a */
    private static List<C22027b> m151608a(List<C87360c> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (C87360c cVar : list) {
            arrayList.add(new C22027b(cVar.f198014a, cVar.f198015b));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static String m151607a(C90198s sVar) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < sVar.f204855a.length / 2; i++) {
            if ("Server-Timing".equals(sVar.mo145027a(i))) {
                sb.append(sVar.mo145031b(i)).append(",");
            }
        }
        if (sb.length() > 0) {
            return sb.toString().substring(0, sb.length() - 1);
        }
        return "";
    }

    /* renamed from: b */
    private static C90198s m151610b(List<C87360c> list) {
        String str;
        String str2;
        C90198s.C90199a aVar = new C90198s.C90199a();
        for (C87360c cVar : list) {
            if (C87383u.f198096p) {
                str = cVar.f198014a;
                StringBuilder sb = null;
                int length = str.length();
                for (int i = 0; i < length; i++) {
                    char charAt = str.charAt(i);
                    if (charAt <= ' ' || charAt >= 127) {
                        if (sb == null) {
                            sb = new StringBuilder(str.substring(0, i));
                        }
                    } else if (sb != null) {
                        sb.append(charAt);
                    }
                }
                if (sb != null) {
                    str = sb.toString();
                }
                str2 = C87328b.m151559b(cVar.f198015b);
            } else {
                str = cVar.f198014a;
                str2 = cVar.f198015b;
            }
            aVar.mo145039a(str, str2);
        }
        return aVar.mo145040a();
    }

    /* renamed from: a */
    public static C87354a m151606a(C87361d dVar) {
        AbstractC21983b head;
        if (dVar.mo141399b("Accept-Encoding") == null) {
            dVar.f198018c.add(new C87360c("Accept-Encoding", "identity"));
        }
        boolean z = false;
        for (C87360c cVar : dVar.f198018c) {
            if (TextUtils.equals(cVar.f198014a, "cache_scene") && TextUtils.equals(cVar.f198015b, "music")) {
                z = true;
            }
        }
        if (C87383u.f198092l || z) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Pair<String, String> a = C14759i.m27066a(dVar.f198016a, linkedHashMap);
            String str = (String) a.second;
            INetApi iNetApi = (INetApi) RetrofitUtils.m43281a((String) a.first, INetApi.class);
            if (iNetApi != null) {
                C22944d dVar2 = new C22944d();
                dVar2.f35400c = dVar.f198019d;
                dVar2.f35401d = dVar.f198020e;
                dVar2.f35402e = dVar.f198021f;
                List<C22027b> a2 = m151608a(dVar.f198018c);
                if ("GET".equals(dVar.f198017b)) {
                    head = iNetApi.get(str, linkedHashMap, a2, dVar2);
                } else {
                    head = iNetApi.head(str, linkedHashMap, a2, dVar2);
                }
                C87312c.m151524b("HttpExcutor", "use ttnet retrofit", null);
                if (!C87364f.f198033R.getAndSet(true)) {
                    C14612a.f35346L = 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x009c: SPUT  
                          (wrap: com.toutiao.proxyserver.net.f$1 : 0x0099: CONSTRUCTOR  (r0v34 com.toutiao.proxyserver.net.f$1) =  call: com.toutiao.proxyserver.net.f.1.<init>():void type: CONSTRUCTOR)
                         com.bytedance.frameworks.baselib.network.http.a.L com.bytedance.frameworks.baselib.network.http.a$a in method: com.toutiao.proxyserver.net.b.a(com.toutiao.proxyserver.net.d):com.toutiao.proxyserver.net.a, file: classes4.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0099: CONSTRUCTOR  (r0v34 com.toutiao.proxyserver.net.f$1) =  call: com.toutiao.proxyserver.net.f.1.<init>():void type: CONSTRUCTOR in method: com.toutiao.proxyserver.net.b.a(com.toutiao.proxyserver.net.d):com.toutiao.proxyserver.net.a, file: classes4.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:439)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                        	... 29 more
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.toutiao.proxyserver.net.f, state: GENERATED_AND_UNLOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                        	... 33 more
                        */
                    /*
                    // Method dump skipped, instructions count: 275
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.toutiao.proxyserver.net.C87355b.m151606a(com.toutiao.proxyserver.net.d):com.toutiao.proxyserver.net.a");
                }
            }
