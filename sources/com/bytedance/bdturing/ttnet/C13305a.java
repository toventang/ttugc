package com.bytedance.bdturing.ttnet;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.client.C22027b;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.ttnet.utils.RetrofitUtils;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.bdturing.ttnet.a */
public final class C13305a {
    static {
        Covode.recordClassIndex(15270);
    }

    /* renamed from: a */
    public static void m23925a() {
        HashMap hashMap = new HashMap();
        hashMap.put("x-vc-bdturing-sdk-version", "2.2.1.i18n");
        RetrofitUtils.m43285a(new TTNetUtil$2(hashMap));
    }

    /* renamed from: a */
    private static INetworkApi m23923a(String str) {
        return (INetworkApi) RetrofitUtils.m43288b(str).mo35884a(INetworkApi.class);
    }

    /* renamed from: a */
    private static List<C22027b> m23924a(Map<String, String> map) {
        LinkedList linkedList = new LinkedList();
        if (map != null) {
            for (String str : map.keySet()) {
                linkedList.add(new C22027b(str, map.get(str)));
            }
        }
        return linkedList;
    }

    /* renamed from: a */
    private static byte[] m23926a(InputStream inputStream) {
        MethodCollector.m26663i(4680);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                MethodCollector.m26664o(4680);
                return byteArray;
            }
        }
    }

    /* renamed from: a */
    public static byte[] m23927a(String str, Map<String, String> map) {
        try {
            C22099u<TypedInput> execute = m23923a(str).doGet(true, str, null, m23924a(map)).execute();
            if (execute.f52261a.f52040b == 200) {
                return m23926a(execute.f52262b.mo11577in());
            }
        } catch (Exception unused) {
        }
        return new byte[0];
    }

    /* renamed from: a */
    public static byte[] m23928a(String str, final byte[] bArr, Map<String, String> map) {
        try {
            C22099u<TypedInput> execute = m23923a(str).doPost(str, null, new TypedOutput() {
                /* class com.bytedance.bdturing.ttnet.C13305a.C133061 */

                static {
                    Covode.recordClassIndex(15271);
                }

                @Override // com.bytedance.retrofit2.mime.TypedOutput
                public final String fileName() {
                    return null;
                }

                @Override // com.bytedance.retrofit2.mime.TypedOutput
                public final String md5Stub() {
                    return null;
                }

                @Override // com.bytedance.retrofit2.mime.TypedOutput
                public final String mimeType() {
                    return null;
                }

                @Override // com.bytedance.retrofit2.mime.TypedOutput
                public final long length() {
                    return (long) bArr.length;
                }

                @Override // com.bytedance.retrofit2.mime.TypedOutput
                public final void writeTo(OutputStream outputStream) {
                    MethodCollector.m26663i(3245);
                    outputStream.write(bArr);
                    MethodCollector.m26664o(3245);
                }
            }, m23924a(map)).execute();
            if (execute.f52261a.f52040b == 200) {
                return m23926a(execute.f52262b.mo11577in());
            }
        } catch (Exception unused) {
        }
        return new byte[0];
    }
}
