package com.bytedance.apm.impl;

import com.bytedance.apm.p789q.C12580d;
import com.bytedance.apm.p789q.C12585h;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.cronet.p986b.C14652c;
import com.bytedance.frameworks.baselib.network.http.p983b.C14620c;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.client.C22027b;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.services.apm.api.C22710c;
import com.bytedance.services.apm.api.IHttpService;
import com.bytedance.ttnet.utils.RetrofitUtils;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DefaultTTNetImpl implements IHttpService {
    static {
        Covode.recordClassIndex(14304);
    }

    public static byte[] toByteArray(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 != read) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                inputStream.close();
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    private List<C22027b> convertHeaderMap(Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry != null) {
                    arrayList.add(new C22027b(entry.getKey(), entry.getValue()));
                }
            }
        }
        return arrayList;
    }

    @Override // com.bytedance.services.apm.api.IHttpService
    public C22710c doGet(String str, Map<String, String> map) {
        C22099u<TypedInput> execute = ((RetrofitMonitorService) RetrofitUtils.m43281a(str, RetrofitMonitorService.class)).fetch(str, map, false).execute();
        return new C22710c(execute.f52261a.f52040b, toByteArray(execute.f52262b.mo11577in()));
    }

    private C22710c doUploadFiles(String str, List<File> list, Map<String, String> map) {
        return C12580d.m22657a(str, list, map);
    }

    @Override // com.bytedance.services.apm.api.IHttpService
    public C22710c uploadFiles(String str, List<File> list, Map<String, String> map) {
        return doUploadFiles(str, list, map);
    }

    @Override // com.bytedance.services.apm.api.IHttpService
    public C22710c doPost(String str, byte[] bArr, Map<String, String> map) {
        int i = 0;
        AbstractC21983b<TypedInput> report = ((RetrofitMonitorService) RetrofitUtils.m43281a(str, RetrofitMonitorService.class)).report(str, new TypedByteArray("application/json; charset=utf-8", bArr, new String[0]), convertHeaderMap(map), false);
        HashMap hashMap = new HashMap();
        byte[] bArr2 = null;
        try {
            C22099u<TypedInput> execute = report.execute();
            bArr2 = toByteArray(execute.f52262b.mo11577in());
            List<C22027b> list = execute.f52261a.f52042d;
            if (!C12585h.m22682a(list)) {
                for (C22027b bVar : list) {
                    hashMap.put(bVar.f52037a, bVar.f52038b);
                }
            }
            i = execute.f52261a.f52040b;
        } catch (Throwable th) {
            try {
                if (th instanceof C14620c) {
                    i = th.getStatusCode();
                }
                if (th instanceof C14652c) {
                    i = ((C14652c) th).getStatusCode();
                }
            } catch (Exception unused) {
            }
        }
        return new C22710c(i, hashMap, bArr2);
    }
}
