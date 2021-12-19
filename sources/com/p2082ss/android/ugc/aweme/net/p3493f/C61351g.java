package com.p2082ss.android.ugc.aweme.net.p3493f;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.p995g.C14759i;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.client.C22027b;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedFile;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.mime.TypedString;
import com.p2082ss.android.common.p2130b.AbstractC29811a;
import com.p2082ss.android.common.p2130b.AbstractC29818c;
import com.p2082ss.android.common.p2130b.p2131a.C29812a;
import com.p2082ss.android.common.util.AbstractC29839b;
import com.p2082ss.android.common.util.AbstractC29840c;
import com.p2082ss.android.common.util.C29842e;
import com.p2082ss.android.http.p2146a.AbstractC29926a;
import com.p2082ss.android.http.p2146a.p2149b.C29934d;
import com.p2082ss.android.http.p2146a.p2149b.C29935e;
import com.p2082ss.android.ugc.aweme.net.IIESNetworkApi;
import com.p2082ss.android.ugc.aweme.net.p3493f.C61347e;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.apache.http.client.RedirectHandler;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.net.f.g */
public final class C61351g implements AbstractC29811a {

    /* renamed from: a */
    public final String f139332a = ("https://" + C17867d.f42587k.f42569a);

    /* renamed from: b */
    public final AbstractC29811a f139333b;

    static {
        Covode.recordClassIndex(71984);
    }

    @Override // com.p2082ss.android.common.p2130b.AbstractC29811a
    /* renamed from: a */
    public final boolean mo25645a(int i, String str, String str2, String str3, String str4, AbstractC29839b<String> bVar, String str5, C29842e eVar, List<C29934d> list, String[] strArr, int[] iArr) {
        return this.f139333b.mo25645a(i, str, str2, str3, str4, bVar, str5, eVar, list, strArr, iArr);
    }

    @Override // com.p2082ss.android.common.p2130b.AbstractC29811a
    /* renamed from: a */
    public final boolean mo25646a(int i, String str, StringBuffer stringBuffer, StringBuffer stringBuffer2, StringBuffer stringBuffer3, AbstractC29839b<String> bVar, String str2, C29842e eVar, List<C29934d> list, String[] strArr, int[] iArr, RedirectHandler redirectHandler) {
        return this.f139333b.mo25646a(i, str, stringBuffer, stringBuffer2, stringBuffer3, bVar, str2, eVar, list, strArr, iArr, redirectHandler);
    }

    @Override // com.p2082ss.android.common.p2130b.AbstractC29811a
    /* renamed from: a */
    public final String mo25644a(int i, String str, C29812a aVar, AbstractC29840c<Long> cVar, long j, AbstractC29818c[] cVarArr) {
        String a = this.f139333b.mo25644a(i, str, aVar, cVar, j, cVarArr);
        C89219l.m154716b(a, "");
        return a;
    }

    @Override // com.p2082ss.android.common.p2130b.AbstractC29811a
    /* renamed from: a */
    public final String mo25642a(int i, int i2, String str, byte[] bArr, String str2, String str3) {
        C89219l.m154721d(str, "");
        return mo25643a(i, i2, str, bArr, str2, str3, (List<AbstractC29926a>) null);
    }

    @Override // com.p2082ss.android.common.p2130b.AbstractC29811a
    /* renamed from: a */
    public final String mo25643a(int i, int i2, String str, byte[] bArr, String str2, String str3, List<AbstractC29926a> list) {
        C89219l.m154721d(str, "");
        ArrayList<C22027b> b = m111080b(list);
        m111079a(str2, b, str3);
        return m111077a(i2, str, new HashMap(), new TypedByteArray(str3, bArr, new String[0]), b, (AbstractC29818c[]) null);
    }

    public C61351g(AbstractC29811a aVar) {
        C89219l.m154721d(aVar, "");
        this.f139333b = aVar;
    }

    /* renamed from: a */
    private static HashMap<String, String> m111078a(List<C29934d> list) {
        HashMap<String, String> hashMap = new HashMap<>();
        if (list != null) {
            for (C29934d dVar : list) {
                String str = dVar.f71419a;
                C89219l.m154716b(str, "");
                String str2 = dVar.f71420b;
                C89219l.m154716b(str2, "");
                hashMap.put(str, str2);
            }
        }
        return hashMap;
    }

    /* renamed from: b */
    private static ArrayList<C22027b> m111080b(List<AbstractC29926a> list) {
        ArrayList<C22027b> arrayList = new ArrayList<>();
        if (list != null) {
            for (AbstractC29926a aVar : list) {
                String a = aVar.mo52240a();
                String b = aVar.mo52241b();
                if (a != null && a.length() > 0) {
                    arrayList.add(new C22027b(a, b));
                }
            }
        }
        return arrayList;
    }

    @Override // com.p2082ss.android.common.p2130b.AbstractC29811a
    /* renamed from: a */
    public final byte[] mo25647a(int i, String str) {
        byte[] a = this.f139333b.mo25647a(i, str);
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: a */
    private static void m111079a(String str, ArrayList<C22027b> arrayList, String str2) {
        if (str != null) {
            arrayList.add(new C22027b("Content-Encoding", str));
        }
        if (str2 != null && str2.length() > 0) {
            arrayList.add(new C22027b("Content-Type", str2));
        }
    }

    @Override // com.p2082ss.android.common.p2130b.AbstractC29811a
    /* renamed from: a */
    public final String mo52087a(int i, int i2, String str, List<AbstractC29926a> list) {
        C89219l.m154721d(str, "");
        return m111077a(i2, str, new HashMap(), (TypedOutput) null, m111080b(list), (AbstractC29818c[]) null);
    }

    /* renamed from: a */
    private static String m111077a(int i, String str, Map<String, String> map, TypedOutput typedOutput, List<C22027b> list, AbstractC29818c[] cVarArr) {
        AbstractC21983b<String> doPost;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Pair<String, String> a = C14759i.m27066a(str, linkedHashMap);
        String str2 = (String) a.second;
        IIESNetworkApi iIESNetworkApi = (IIESNetworkApi) RetrofitFactory.m33635a().mo28817b((String) a.first).mo28832d().mo28858a(IIESNetworkApi.class);
        if (typedOutput != null) {
            doPost = iIESNetworkApi.postBody(i, str2, linkedHashMap, typedOutput, list, null);
            C89219l.m154716b(doPost, "");
        } else {
            doPost = iIESNetworkApi.doPost(i, str2, linkedHashMap, map, list, null);
            C89219l.m154716b(doPost, "");
        }
        if (!(cVarArr == null || cVarArr.length == 0)) {
            cVarArr[0] = new C61347e.C61349a(doPost);
        }
        T t = doPost.execute().f52262b;
        C89219l.m154716b(t, "");
        return t;
    }

    @Override // com.p2082ss.android.common.p2130b.AbstractC29811a
    /* renamed from: a */
    public final String mo25639a(int i, int i2, String str, List<C29934d> list, C29812a aVar, AbstractC29818c[] cVarArr) {
        C89219l.m154721d(str, "");
        MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
        if (list != null) {
            for (C29934d dVar : list) {
                multipartTypedOutput.addPart(dVar.f71419a, new TypedString(dVar.f71420b));
            }
        }
        if (aVar != null) {
            for (C29812a.AbstractC29815c cVar : aVar.f71146a) {
                if (cVar instanceof C29812a.C29816d) {
                    Object b = cVar.mo52094b();
                    Objects.requireNonNull(b, "null cannot be cast to non-null type kotlin.String");
                    multipartTypedOutput.addPart(cVar.mo52093a(), new TypedString((String) b));
                } else if (cVar instanceof C29812a.C29813a) {
                    C29812a.C29813a aVar2 = (C29812a.C29813a) cVar;
                    byte[] bArr = aVar2.f71148b;
                    Objects.requireNonNull(bArr, "null cannot be cast to non-null type kotlin.ByteArray");
                    multipartTypedOutput.addPart(aVar2.f71147a, new TypedByteArray(null, bArr, aVar2.f71149c));
                } else if (cVar instanceof C29812a.C29814b) {
                    Object b2 = cVar.mo52094b();
                    Objects.requireNonNull(b2, "null cannot be cast to non-null type java.io.File");
                    multipartTypedOutput.addPart(cVar.mo52093a(), new TypedFile(null, (File) b2));
                }
            }
        }
        return m111077a(i2, str, new HashMap(), multipartTypedOutput, (List<C22027b>) null, cVarArr);
    }

    @Override // com.p2082ss.android.common.p2130b.AbstractC29811a
    /* renamed from: b */
    public final String mo52088b(int i, int i2, String str, List<C29934d> list, boolean z, AbstractC29818c[] cVarArr, List<AbstractC29926a> list2) {
        C89219l.m154721d(str, "");
        return m111077a(i2, str, m111078a(list), (TypedOutput) null, m111080b(list2), (AbstractC29818c[]) null);
    }

    @Override // com.p2082ss.android.common.p2130b.AbstractC29811a
    /* renamed from: b */
    public final String mo52089b(int i, int i2, String str, byte[] bArr, String str2, String str3, List<AbstractC29926a> list) {
        C89219l.m154721d(str, "");
        ArrayList<C22027b> b = m111080b(list);
        m111079a(str2, b, str3);
        return m111077a(i2, str, new HashMap(), new TypedByteArray(str3, bArr, new String[0]), b, (AbstractC29818c[]) null);
    }

    @Override // com.p2082ss.android.common.p2130b.AbstractC29811a
    /* renamed from: a */
    public final String mo25641a(int i, int i2, String str, List<C29934d> list, boolean z, AbstractC29818c[] cVarArr, List<AbstractC29926a> list2) {
        C89219l.m154721d(str, "");
        return m111077a(i2, str, m111078a(list), (TypedOutput) null, m111080b(list2), cVarArr);
    }

    @Override // com.p2082ss.android.common.p2130b.AbstractC29811a
    /* renamed from: a */
    public final String mo25640a(int i, int i2, String str, List<AbstractC29926a> list, boolean z, boolean z2, C29935e eVar, boolean z3) {
        T t = ((IIESNetworkApi) RetrofitFactory.m33635a().mo28817b(this.f139332a).mo28832d().mo28858a(IIESNetworkApi.class)).doGet(true, i2, str, new HashMap(), m111080b(list), null).execute().f52262b;
        C89219l.m154716b(t, "");
        return t;
    }
}
