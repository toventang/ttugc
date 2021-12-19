package com.p2082ss.android.common.p2130b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.common.p2130b.p2131a.C29812a;
import com.p2082ss.android.common.util.AbstractC29839b;
import com.p2082ss.android.common.util.AbstractC29840c;
import com.p2082ss.android.common.util.C29842e;
import com.p2082ss.android.http.p2146a.AbstractC29926a;
import com.p2082ss.android.http.p2146a.p2149b.C29934d;
import com.p2082ss.android.http.p2146a.p2149b.C29935e;
import java.util.List;
import org.apache.http.client.RedirectHandler;

/* renamed from: com.ss.android.common.b.a */
public interface AbstractC29811a {
    static {
        Covode.recordClassIndex(36216);
    }

    /* renamed from: a */
    String mo52087a(int i, int i2, String str, List<AbstractC29926a> list);

    /* renamed from: a */
    String mo25639a(int i, int i2, String str, List<C29934d> list, C29812a aVar, AbstractC29818c[] cVarArr);

    /* renamed from: a */
    String mo25640a(int i, int i2, String str, List<AbstractC29926a> list, boolean z, boolean z2, C29935e eVar, boolean z3);

    /* renamed from: a */
    String mo25641a(int i, int i2, String str, List<C29934d> list, boolean z, AbstractC29818c[] cVarArr, List<AbstractC29926a> list2);

    /* renamed from: a */
    String mo25642a(int i, int i2, String str, byte[] bArr, String str2, String str3);

    /* renamed from: a */
    String mo25643a(int i, int i2, String str, byte[] bArr, String str2, String str3, List<AbstractC29926a> list);

    /* renamed from: a */
    String mo25644a(int i, String str, C29812a aVar, AbstractC29840c<Long> cVar, long j, AbstractC29818c[] cVarArr);

    /* renamed from: a */
    boolean mo25645a(int i, String str, String str2, String str3, String str4, AbstractC29839b<String> bVar, String str5, C29842e eVar, List<C29934d> list, String[] strArr, int[] iArr);

    /* renamed from: a */
    boolean mo25646a(int i, String str, StringBuffer stringBuffer, StringBuffer stringBuffer2, StringBuffer stringBuffer3, AbstractC29839b<String> bVar, String str2, C29842e eVar, List<C29934d> list, String[] strArr, int[] iArr, RedirectHandler redirectHandler);

    /* renamed from: a */
    byte[] mo25647a(int i, String str);

    /* renamed from: b */
    String mo52088b(int i, int i2, String str, List<C29934d> list, boolean z, AbstractC29818c[] cVarArr, List<AbstractC29926a> list2);

    /* renamed from: b */
    String mo52089b(int i, int i2, String str, byte[] bArr, String str2, String str3, List<AbstractC29926a> list);
}
