package com.p2082ss.android.ugc.aweme.net.p3493f;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.baselib.network.http.p995g.C14759i;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.C22092q;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.client.C22027b;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedFile;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.mime.TypedString;
import com.bytedance.retrofit2.p1612c.AbstractC22021a;
import com.bytedance.ttnet.p1703d.C22944d;
import com.bytedance.ttnet.utils.RetrofitUtils;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.p2082ss.android.common.p2130b.AbstractC29811a;
import com.p2082ss.android.common.p2130b.AbstractC29818c;
import com.p2082ss.android.common.p2130b.p2131a.C29812a;
import com.p2082ss.android.common.util.AbstractC29839b;
import com.p2082ss.android.common.util.AbstractC29840c;
import com.p2082ss.android.common.util.C29842e;
import com.p2082ss.android.common.util.NetworkUtils;
import com.p2082ss.android.http.p2146a.AbstractC29926a;
import com.p2082ss.android.http.p2146a.p2147a.C29929b;
import com.p2082ss.android.http.p2146a.p2149b.C29931a;
import com.p2082ss.android.http.p2146a.p2149b.C29934d;
import com.p2082ss.android.http.p2146a.p2149b.C29935e;
import com.p2082ss.android.ugc.aweme.net.IIESNetworkApi;
import java.io.File;
import java.io.InputStream;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import org.apache.http.client.RedirectHandler;

/* renamed from: com.ss.android.ugc.aweme.net.f.e */
public class C61347e implements AbstractC29811a {

    /* renamed from: e */
    private static Map<String, C22092q> f139322e = new HashMap();

    /* renamed from: a */
    C22944d f139323a;

    /* renamed from: b */
    AbstractC61346d f139324b;

    /* renamed from: c */
    private final String f139325c = " cronet/1.0.3.2";

    /* renamed from: d */
    private List<AbstractC22021a> f139326d = new ArrayList();

    @Override // com.p2082ss.android.common.p2130b.AbstractC29811a
    /* renamed from: a */
    public final byte[] mo25647a(int i, String str) {
        T t;
        if (C13627m.m24498a(str)) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Pair<String, String> a = C14759i.m27066a(str, linkedHashMap);
        String str2 = (String) a.second;
        IIESNetworkApi a2 = m111055a((String) a.first);
        if (a2 != null) {
            C22099u<TypedInput> execute = a2.downloadFile(true, i, str2, linkedHashMap).execute();
            if (execute.f52261a.mo35845a() && (t = execute.f52262b) != null) {
                InputStream in = t.mo11577in();
                String a3 = m111058a(execute.f52261a.f52042d, "Content-Length");
                long j = -1;
                if (a3 != null) {
                    j = Long.parseLong(a3);
                }
                return NetworkUtils.stream2ByteArray(i, in, j);
            }
        }
        return null;
    }

    @Override // com.p2082ss.android.common.p2130b.AbstractC29811a
    /* renamed from: a */
    public final boolean mo25645a(int i, final String str, String str2, String str3, String str4, AbstractC29839b<String> bVar, String str5, C29842e eVar, List<C29934d> list, String[] strArr, int[] iArr) {
        Throwable th;
        MethodCollector.m26663i(4513);
        if (C13627m.m24498a(str)) {
            MethodCollector.m26664o(4513);
            return false;
        }
        ArrayList arrayList = new ArrayList();
        String str6 = null;
        try {
            String userAgent = NetworkUtils.getUserAgent();
            if (TextUtils.isEmpty(userAgent)) {
                userAgent = userAgent + " cronet/1.0.3.2";
            }
            arrayList.add(new C22027b("User-Agent", userAgent));
            if (list != null) {
                for (C29934d dVar : list) {
                    arrayList.add(new C22027b(dVar.f71419a, dVar.f71420b));
                }
            }
            if (eVar == null || !eVar.f71185a) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Pair<String, String> a = C14759i.m27066a(str, linkedHashMap);
                String str7 = (String) a.second;
                IIESNetworkApi a2 = m111055a((String) a.first);
                if (a2 != null) {
                    final AbstractC21983b<TypedInput> downloadFile = a2.downloadFile(true, i, str7, linkedHashMap, arrayList, this.f139323a);
                    C22099u<TypedInput> execute = downloadFile.execute();
                    if (execute.f52261a.mo35845a()) {
                        T t = execute.f52262b;
                        if (t != null) {
                            InputStream in = t.mo11577in();
                            List<C22027b> list2 = execute.f52261a.f52042d;
                            long j = -1;
                            if (list2 != null && !list2.isEmpty()) {
                                for (C22027b bVar2 : list2) {
                                    if ("Content-Length".equals(bVar2.f52037a)) {
                                        String str8 = bVar2.f52038b;
                                        if (!TextUtils.isEmpty(str8)) {
                                            j = Long.parseLong(str8);
                                        }
                                    } else if ("Content-Encoding".equals(bVar2.f52037a)) {
                                        String str9 = bVar2.f52038b;
                                        if (!TextUtils.isEmpty(str9) && "gzip".equalsIgnoreCase(str9)) {
                                            in = new GZIPInputStream(in);
                                        }
                                    } else if ("x-snssdk.remoteaddr".equals(bVar2.f52037a)) {
                                        str6 = bVar2.f52038b;
                                    }
                                }
                            }
                            if (iArr != null) {
                                try {
                                    if (iArr.length > 0) {
                                        iArr[0] = 0;
                                        if (j <= 2147483647L) {
                                            iArr[0] = (int) j;
                                        }
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    m111059a(strArr, str6);
                                    MethodCollector.m26664o(4513);
                                    throw th;
                                }
                            }
                            boolean stream2File = NetworkUtils.stream2File(in, j, new NetworkUtils.AbstractC29836i() {
                                /* class com.p2082ss.android.ugc.aweme.net.p3493f.C61347e.C613481 */

                                static {
                                    Covode.recordClassIndex(71981);
                                }

                                @Override // com.p2082ss.android.common.util.NetworkUtils.AbstractC29836i
                                /* renamed from: b */
                                public final void mo25649b() {
                                    AbstractC21983b bVar = downloadFile;
                                    if (bVar != null) {
                                        bVar.cancel();
                                    }
                                }

                                @Override // com.p2082ss.android.common.util.NetworkUtils.AbstractC29836i
                                /* renamed from: a */
                                public final URI mo25648a() {
                                    try {
                                        return new URI(str);
                                    } catch (Exception unused) {
                                        return null;
                                    }
                                }
                            }, i, str2, str3, str4, bVar, str5, eVar);
                            m111059a(strArr, str6);
                            MethodCollector.m26664o(4513);
                            return stream2File;
                        }
                    } else {
                        C29929b bVar3 = new C29929b(execute.f52261a.f52040b, m111058a(execute.f52261a.f52042d, "Reason-Phrase"));
                        MethodCollector.m26664o(4513);
                        throw bVar3;
                    }
                }
                m111059a(strArr, (String) null);
                MethodCollector.m26664o(4513);
                return false;
            }
            m111059a(strArr, (String) null);
            MethodCollector.m26664o(4513);
            return false;
        } catch (Throwable th3) {
            th = th3;
            m111059a(strArr, str6);
            MethodCollector.m26664o(4513);
            throw th;
        }
    }

    @Override // com.p2082ss.android.common.p2130b.AbstractC29811a
    /* renamed from: a */
    public final boolean mo25646a(int i, String str, StringBuffer stringBuffer, StringBuffer stringBuffer2, StringBuffer stringBuffer3, AbstractC29839b<String> bVar, String str2, C29842e eVar, List<C29934d> list, String[] strArr, int[] iArr, RedirectHandler redirectHandler) {
        return mo25645a(i, str, stringBuffer.toString(), stringBuffer2.toString(), stringBuffer3.toString(), bVar, str2, eVar, list, strArr, iArr);
    }

    @Override // com.p2082ss.android.common.p2130b.AbstractC29811a
    /* renamed from: a */
    public final String mo25644a(int i, String str, C29812a aVar, AbstractC29840c<Long> cVar, long j, AbstractC29818c[] cVarArr) {
        MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
        for (C29812a.AbstractC29815c cVar2 : aVar.f71146a) {
            if (cVar2 instanceof C29812a.C29816d) {
                multipartTypedOutput.addPart(cVar2.mo52093a(), new TypedString((String) cVar2.mo52094b()));
            } else if (cVar2 instanceof C29812a.C29813a) {
                C29812a.C29813a aVar2 = (C29812a.C29813a) cVar2;
                multipartTypedOutput.addPart(aVar2.f71147a, new TypedByteArray(null, aVar2.f71148b, aVar2.f71149c));
            } else if (cVar2 instanceof C29812a.C29814b) {
                multipartTypedOutput.addPart(cVar2.mo52093a(), new TypedFile(null, (File) cVar2.mo52094b()));
            }
        }
        return m111056a(i, str, (Map<String, String>) null, multipartTypedOutput, (List<C22027b>) null, this.f139323a, cVarArr);
    }

    @Override // com.p2082ss.android.common.p2130b.AbstractC29811a
    /* renamed from: a */
    public final String mo25641a(int i, int i2, String str, List<C29934d> list, boolean z, AbstractC29818c[] cVarArr, List<AbstractC29926a> list2) {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (C29934d dVar : list) {
            hashMap.put(dVar.f71419a, dVar.f71420b);
        }
        if (list2 != null) {
            for (AbstractC29926a aVar : list2) {
                arrayList.add(new C22027b(aVar.mo52240a(), aVar.mo52241b()));
            }
        }
        return m111056a(i2, str, hashMap, (TypedOutput) null, arrayList, this.f139323a, cVarArr);
    }

    @Override // com.p2082ss.android.common.p2130b.AbstractC29811a
    /* renamed from: a */
    public final String mo25642a(int i, int i2, String str, byte[] bArr, String str2, String str3) {
        return mo25643a(i, i2, str, bArr, str2, str3, (List<AbstractC29926a>) null);
    }

    @Override // com.p2082ss.android.common.p2130b.AbstractC29811a
    /* renamed from: a */
    public final String mo25643a(int i, int i2, String str, byte[] bArr, String str2, String str3, List<AbstractC29926a> list) {
        ArrayList arrayList = new ArrayList();
        if (str2 != null) {
            arrayList.add(new C22027b("Content-Encoding", str2));
        }
        if (str3 != null && str3.length() > 0) {
            arrayList.add(new C22027b("Content-Type", str3));
        }
        if (list != null) {
            for (AbstractC29926a aVar : list) {
                arrayList.add(new C22027b(aVar.mo52240a(), aVar.mo52241b()));
            }
        }
        return m111056a(i2, str, (Map<String, String>) null, new TypedByteArray(str3, bArr, new String[0]), arrayList, this.f139323a, (AbstractC29818c[]) null);
    }

    static {
        Covode.recordClassIndex(71980);
    }

    /* renamed from: com.ss.android.ugc.aweme.net.f.e$a */
    public static class C61349a implements AbstractC29818c {

        /* renamed from: a */
        AbstractC21983b f139330a;

        static {
            Covode.recordClassIndex(71982);
        }

        public C61349a(AbstractC21983b bVar) {
            this.f139330a = bVar;
        }
    }

    /* renamed from: a */
    public final C61347e mo98956a(AbstractC22021a aVar) {
        if (aVar != null) {
            this.f139326d.add(aVar);
        }
        return this;
    }

    /* renamed from: a */
    private IIESNetworkApi m111055a(String str) {
        if (C13627m.m24498a(str)) {
            return null;
        }
        C22092q qVar = f139322e.get(str);
        if (qVar == null) {
            qVar = RetrofitUtils.m43277a(str, this.f139326d);
            f139322e.put(str, qVar);
        }
        return (IIESNetworkApi) RetrofitUtils.m43280a(qVar, IIESNetworkApi.class);
    }

    /* renamed from: a */
    private static void m111059a(String[] strArr, String str) {
        if (strArr != null && strArr.length != 0 && !TextUtils.isEmpty(str)) {
            try {
                strArr[0] = str;
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    private static String m111058a(List<C22027b> list, String str) {
        if (list == null || TextUtils.isEmpty(str)) {
            return null;
        }
        for (C22027b bVar : list) {
            if (str.equalsIgnoreCase(bVar.f52037a)) {
                return bVar.f52038b;
            }
        }
        return null;
    }

    @Override // com.p2082ss.android.common.p2130b.AbstractC29811a
    /* renamed from: a */
    public final String mo52087a(int i, int i2, String str, List<AbstractC29926a> list) {
        if (C13627m.m24498a(str)) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            try {
                for (AbstractC29926a aVar : list) {
                    String a = aVar.mo52240a();
                    String b = aVar.mo52241b();
                    if (a != null && a.length() > 0) {
                        arrayList.add(new C22027b(a, b));
                    }
                }
            } catch (Exception e) {
                NetworkUtils.handleApiError(str, e, System.currentTimeMillis() - currentTimeMillis, null);
                e.printStackTrace();
                throw e;
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Pair<String, String> a2 = C14759i.m27066a(str, linkedHashMap);
        String str2 = (String) a2.second;
        IIESNetworkApi a3 = m111055a((String) a2.first);
        if (a3 == null) {
            return null;
        }
        AbstractC61346d dVar = this.f139324b;
        if (dVar != null) {
            dVar.mo98954a(str);
        }
        AbstractC21983b<String> doDetete = a3.doDetete(i2, str2, linkedHashMap, arrayList, this.f139323a);
        long currentTimeMillis2 = System.currentTimeMillis();
        C22099u<String> execute = doDetete.execute();
        AbstractC61346d dVar2 = this.f139324b;
        if (dVar2 != null) {
            dVar2.mo98955b(str);
        }
        long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis2;
        if (NetworkUtils.getCommandListener() != null) {
            String a4 = NetworkUtils.getCommandListener().mo52118a();
            if (!C13627m.m24498a(a4)) {
                ArrayList arrayList2 = new ArrayList();
                for (C22027b bVar : execute.f52261a.f52042d) {
                    if (a4.equalsIgnoreCase(bVar.f52037a)) {
                        arrayList2.add(bVar.f52038b);
                    }
                }
                NetworkUtils.getCommandListener().mo52119a(arrayList2);
            }
        }
        if (execute.f52261a.mo35845a()) {
            T t = execute.f52262b;
            NetworkUtils.handleTimeStampFromResponse(t);
            NetworkUtils.handleApiOk(str, currentTimeMillis3, null);
            return t;
        }
        throw new C29929b(execute.f52261a.f52040b, m111058a(execute.f52261a.f52042d, "Reason-Phrase"));
    }

    @Override // com.p2082ss.android.common.p2130b.AbstractC29811a
    /* renamed from: a */
    public final String mo25639a(int i, int i2, String str, List<C29934d> list, C29812a aVar, AbstractC29818c[] cVarArr) {
        List<C22027b> arrayList = new ArrayList<>();
        MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
        for (C29934d dVar : list) {
            multipartTypedOutput.addPart(dVar.f71419a, new TypedString(dVar.f71420b));
        }
        for (C29812a.AbstractC29815c cVar : aVar.f71146a) {
            if (cVar instanceof C29812a.C29816d) {
                multipartTypedOutput.addPart(cVar.mo52093a(), new TypedString((String) cVar.mo52094b()));
            } else if (cVar instanceof C29812a.C29813a) {
                C29812a.C29813a aVar2 = (C29812a.C29813a) cVar;
                multipartTypedOutput.addPart(aVar2.f71147a, new TypedByteArray(null, aVar2.f71148b, aVar2.f71149c));
            } else if (cVar instanceof C29812a.C29814b) {
                multipartTypedOutput.addPart(cVar.mo52093a(), new TypedFile(null, (File) cVar.mo52094b()));
            }
        }
        return m111056a(i2, str, (Map<String, String>) null, multipartTypedOutput, arrayList, this.f139323a, cVarArr);
    }

    /* renamed from: a */
    private String m111056a(int i, String str, Map<String, String> map, TypedOutput typedOutput, List<C22027b> list, Object obj, AbstractC29818c[] cVarArr) {
        return m111057a(UGCMonitor.TYPE_POST, i, str, map, typedOutput, list, obj, cVarArr);
    }

    /* renamed from: b */
    private String m111060b(int i, String str, Map<String, String> map, TypedOutput typedOutput, List<C22027b> list, Object obj, AbstractC29818c[] cVarArr) {
        return m111057a("put", i, str, map, typedOutput, list, obj, cVarArr);
    }

    @Override // com.p2082ss.android.common.p2130b.AbstractC29811a
    /* renamed from: b */
    public final String mo52088b(int i, int i2, String str, List<C29934d> list, boolean z, AbstractC29818c[] cVarArr, List<AbstractC29926a> list2) {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (C29934d dVar : list) {
            hashMap.put(dVar.f71419a, dVar.f71420b);
        }
        if (list2 != null) {
            for (AbstractC29926a aVar : list2) {
                arrayList.add(new C22027b(aVar.mo52240a(), aVar.mo52241b()));
            }
        }
        return m111060b(i2, str, hashMap, (TypedOutput) null, arrayList, this.f139323a, cVarArr);
    }

    @Override // com.p2082ss.android.common.p2130b.AbstractC29811a
    /* renamed from: b */
    public final String mo52089b(int i, int i2, String str, byte[] bArr, String str2, String str3, List<AbstractC29926a> list) {
        ArrayList arrayList = new ArrayList();
        if (str2 != null) {
            arrayList.add(new C22027b("Content-Encoding", str2));
        }
        if (str3 != null && str3.length() > 0) {
            arrayList.add(new C22027b("Content-Type", str3));
        }
        if (list != null) {
            for (AbstractC29926a aVar : list) {
                arrayList.add(new C22027b(aVar.mo52240a(), aVar.mo52241b()));
            }
        }
        return m111060b(i2, str, (Map<String, String>) null, new TypedByteArray(str3, bArr, new String[0]), arrayList, this.f139323a, (AbstractC29818c[]) null);
    }

    /* renamed from: a */
    private String m111057a(String str, int i, String str2, Map<String, String> map, TypedOutput typedOutput, List<C22027b> list, Object obj, AbstractC29818c[] cVarArr) {
        AbstractC21983b<String> bVar;
        Map<String, String> map2 = map;
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            return null;
        }
        if ("get".equals(str)) {
            throw new RuntimeException("doInternal does not support get");
        } else if (!"delete".equals(str)) {
            long currentTimeMillis = System.currentTimeMillis();
            try {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Pair<String, String> a = C14759i.m27066a(str2, linkedHashMap);
                String str3 = (String) a.second;
                IIESNetworkApi a2 = m111055a((String) a.first);
                if (a2 == null) {
                    return null;
                }
                if (typedOutput == null) {
                    if (map2 == null) {
                        map2 = new HashMap<>();
                    }
                    if ("put".equals(str)) {
                        bVar = a2.doPut(i, str3, linkedHashMap, map2, list, obj);
                    } else {
                        bVar = a2.doPost(i, str3, linkedHashMap, map2, list, obj);
                    }
                } else if ("put".equals(str)) {
                    bVar = a2.putBody(i, str3, linkedHashMap, typedOutput, list, obj);
                } else {
                    bVar = a2.postBody(i, str3, linkedHashMap, typedOutput, list, obj);
                }
                if (cVarArr != null && cVarArr.length > 0) {
                    cVarArr[0] = new C61349a(bVar);
                }
                long currentTimeMillis2 = System.currentTimeMillis();
                AbstractC61346d dVar = this.f139324b;
                if (dVar != null) {
                    dVar.mo98954a(str2);
                }
                C22099u<String> execute = bVar.execute();
                AbstractC61346d dVar2 = this.f139324b;
                if (dVar2 != null) {
                    dVar2.mo98955b(str2);
                }
                long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis2;
                m111058a(execute.f52261a.f52042d, "X-TT-LOGID");
                if (NetworkUtils.getCommandListener() != null) {
                    String a3 = NetworkUtils.getCommandListener().mo52118a();
                    if (!C13627m.m24498a(a3)) {
                        ArrayList arrayList = new ArrayList();
                        for (C22027b bVar2 : execute.f52261a.f52042d) {
                            if (a3.equalsIgnoreCase(bVar2.f52037a)) {
                                arrayList.add(bVar2.f52038b);
                            }
                        }
                        NetworkUtils.getCommandListener().mo52119a(arrayList);
                    }
                }
                if (execute.f52261a.mo35845a()) {
                    T t = execute.f52262b;
                    NetworkUtils.handleTimeStampFromResponse(t);
                    NetworkUtils.handleApiOk(str2, currentTimeMillis3, null);
                    return t;
                }
                throw new C29929b(execute.f52261a.f52040b, m111058a(execute.f52261a.f52042d, "Reason-Phrase"));
            } catch (Exception e) {
                NetworkUtils.handleApiError(str2, e, System.currentTimeMillis() - currentTimeMillis, null);
                e.printStackTrace();
                throw e;
            }
        } else {
            throw new RuntimeException("doInternal temporary does not support delete ");
        }
    }

    @Override // com.p2082ss.android.common.p2130b.AbstractC29811a
    /* renamed from: a */
    public final String mo25640a(int i, int i2, String str, List<AbstractC29926a> list, boolean z, boolean z2, C29935e eVar, boolean z3) {
        if (C13627m.m24498a(str)) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            try {
                for (AbstractC29926a aVar : list) {
                    String a = aVar.mo52240a();
                    String b = aVar.mo52241b();
                    if (a != null && a.length() > 0) {
                        arrayList.add(new C22027b(a, b));
                    }
                }
            } catch (Exception e) {
                NetworkUtils.handleApiError(str, e, System.currentTimeMillis() - currentTimeMillis, null);
                e.printStackTrace();
                throw e;
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Pair<String, String> a2 = C14759i.m27066a(str, linkedHashMap);
        String str2 = (String) a2.second;
        IIESNetworkApi a3 = m111055a((String) a2.first);
        if (a3 == null) {
            return null;
        }
        AbstractC61346d dVar = this.f139324b;
        if (dVar != null) {
            dVar.mo98954a(str);
        }
        AbstractC21983b<String> doGet = a3.doGet(true, i2, str2, linkedHashMap, arrayList, this.f139323a);
        long currentTimeMillis2 = System.currentTimeMillis();
        C22099u<String> execute = doGet.execute();
        AbstractC61346d dVar2 = this.f139324b;
        if (dVar2 != null) {
            dVar2.mo98955b(str);
        }
        long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis2;
        m111058a(execute.f52261a.f52042d, "X-TT-LOGID");
        if (NetworkUtils.getCommandListener() != null) {
            String a4 = NetworkUtils.getCommandListener().mo52118a();
            if (!C13627m.m24498a(a4)) {
                ArrayList arrayList2 = new ArrayList();
                for (C22027b bVar : execute.f52261a.f52042d) {
                    if (a4.equalsIgnoreCase(bVar.f52037a)) {
                        arrayList2.add(bVar.f52038b);
                    }
                }
                NetworkUtils.getCommandListener().mo52119a(arrayList2);
            }
        }
        if (eVar != null) {
            for (C22027b bVar2 : execute.f52261a.f52042d) {
                String str3 = bVar2.f52037a;
                if ("ETag".equalsIgnoreCase(str3) || "Last-Modified".equalsIgnoreCase(str3) || "Cache-Control".equalsIgnoreCase(str3) || "X-SS-SIGN".equalsIgnoreCase(str3) || "X-TT-LOGID".equalsIgnoreCase(str3)) {
                    eVar.mo52260a(new C29931a(str3, bVar2.f52038b));
                }
            }
        }
        if (execute.f52261a.mo35845a()) {
            T t = execute.f52262b;
            NetworkUtils.handleTimeStampFromResponse(t);
            NetworkUtils.handleApiOk(str, currentTimeMillis3, null);
            return t;
        }
        throw new C29929b(execute.f52261a.f52040b, m111058a(execute.f52261a.f52042d, "Reason-Phrase"));
    }
}
