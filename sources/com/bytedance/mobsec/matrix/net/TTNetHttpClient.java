package com.bytedance.mobsec.matrix.net;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.client.C22027b;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.p1610b.AbstractC21991ae;
import com.bytedance.retrofit2.p1610b.AbstractC21993ag;
import com.bytedance.retrofit2.p1610b.AbstractC21994b;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22004l;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import java.util.List;
import p4646ms.p4647bd.p4648o.C89889h;

public final class TTNetHttpClient extends AbstractC21418a {

    public interface TTNetInterface {
        static {
            Covode.recordClassIndex(25040);
        }

        @AbstractC22000h
        @AbstractC21991ae
        AbstractC21983b<TypedInput> get(@AbstractC21993ag String str, @AbstractC22004l List<C22027b> list);

        @AbstractC22012t
        @AbstractC21991ae
        AbstractC21983b<TypedInput> post(@AbstractC21993ag String str, @AbstractC22004l List<C22027b> list, @AbstractC21994b TypedByteArray typedByteArray);
    }

    static {
        Covode.recordClassIndex(25039);
    }

    /* renamed from: a */
    private static String m40202a(List<C22027b> list) {
        MethodCollector.m26663i(1358);
        if (list == null || list.size() <= 0) {
            MethodCollector.m26664o(1358);
            return null;
        }
        for (C22027b bVar : list) {
            if (bVar != null && ((String) C89889h.m155966a(16777217, 0, 0, "0d6ce6", new byte[]{57, 43, 81, 3, 23, 45, 60, 66, 110, 55})).equalsIgnoreCase(bVar.f52037a)) {
                String str = bVar.f52038b;
                MethodCollector.m26664o(1358);
                return str;
            }
        }
        MethodCollector.m26664o(1358);
        return null;
    }

    @Override // com.bytedance.mobsec.matrix.net.AbstractC21418a
    /* renamed from: a */
    public final Object[] mo35018a(String str, String str2) {
        return m40203a(str, (byte[]) null, str2, (String) null, false);
    }

    @Override // com.bytedance.mobsec.matrix.net.AbstractC21418a
    /* renamed from: a */
    public final Object[] mo35019a(String str, byte[] bArr, String str2) {
        return m40203a(str, bArr, str2, (String) null, true);
    }

    @Override // com.bytedance.mobsec.matrix.net.AbstractC21418a
    /* renamed from: b */
    public final Object[] mo35020b(String str, String str2) {
        return m40203a(str, (byte[]) null, (String) null, str2, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x0378 A[Catch:{ all -> 0x03a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0379 A[Catch:{ all -> 0x03a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x038e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Object[] m40203a(java.lang.String r29, byte[] r30, java.lang.String r31, java.lang.String r32, boolean r33) {
        /*
        // Method dump skipped, instructions count: 948
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.mobsec.matrix.net.TTNetHttpClient.m40203a(java.lang.String, byte[], java.lang.String, java.lang.String, boolean):java.lang.Object[]");
    }
}
