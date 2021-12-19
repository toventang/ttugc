package com.p2082ss.android.ugc.aweme.net.p3493f;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.common.p2130b.AbstractC29811a;
import com.p2082ss.android.common.p2130b.AbstractC29818c;
import com.p2082ss.android.common.p2130b.p2131a.C29812a;
import com.p2082ss.android.common.util.AbstractC29839b;
import com.p2082ss.android.common.util.AbstractC29840c;
import com.p2082ss.android.common.util.C29842e;
import com.p2082ss.android.http.p2146a.AbstractC29926a;
import com.p2082ss.android.http.p2146a.p2149b.C29934d;
import com.p2082ss.android.http.p2146a.p2149b.C29935e;
import java.util.List;
import org.apache.http.client.RedirectHandler;

/* renamed from: com.ss.android.ugc.aweme.net.f.b */
public abstract class AbstractC61344b implements AbstractC29811a {

    /* renamed from: a */
    protected AbstractC29811a f139318a;

    /* renamed from: b */
    protected Context f139319b;

    static {
        Covode.recordClassIndex(71977);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract AbstractC29811a mo98953a();

    @Override // com.p2082ss.android.common.p2130b.AbstractC29811a
    /* renamed from: a */
    public final byte[] mo25647a(int i, String str) {
        if (this.f139318a == null) {
            this.f139318a = mo98953a();
        }
        return this.f139318a.mo25647a(i, str);
    }

    @Override // com.p2082ss.android.common.p2130b.AbstractC29811a
    /* renamed from: a */
    public final boolean mo25646a(int i, String str, StringBuffer stringBuffer, StringBuffer stringBuffer2, StringBuffer stringBuffer3, AbstractC29839b<String> bVar, String str2, C29842e eVar, List<C29934d> list, String[] strArr, int[] iArr, RedirectHandler redirectHandler) {
        if (this.f139318a == null) {
            this.f139318a = mo98953a();
        }
        return this.f139318a.mo25646a(i, str, stringBuffer, stringBuffer2, stringBuffer3, bVar, str2, eVar, list, strArr, iArr, redirectHandler);
    }

    public AbstractC61344b(Context context) {
        this.f139319b = context;
    }

    @Override // com.p2082ss.android.common.p2130b.AbstractC29811a
    /* renamed from: a */
    public final String mo52087a(int i, int i2, String str, List<AbstractC29926a> list) {
        AbstractC29811a aVar = this.f139318a;
        if (aVar == null) {
            return null;
        }
        return aVar.mo52087a(i, i2, str, list);
    }

    @Override // com.p2082ss.android.common.p2130b.AbstractC29811a
    /* renamed from: a */
    public final String mo25639a(int i, int i2, String str, List<C29934d> list, C29812a aVar, AbstractC29818c[] cVarArr) {
        if (this.f139318a == null) {
            this.f139318a = mo98953a();
        }
        return this.f139318a.mo25639a(i, i2, str, list, aVar, cVarArr);
    }

    @Override // com.p2082ss.android.common.p2130b.AbstractC29811a
    /* renamed from: a */
    public final String mo25642a(int i, int i2, String str, byte[] bArr, String str2, String str3) {
        if (this.f139318a == null) {
            this.f139318a = mo98953a();
        }
        return this.f139318a.mo25642a(i, i2, str, bArr, str2, str3);
    }

    @Override // com.p2082ss.android.common.p2130b.AbstractC29811a
    /* renamed from: a */
    public final String mo25644a(int i, String str, C29812a aVar, AbstractC29840c<Long> cVar, long j, AbstractC29818c[] cVarArr) {
        if (this.f139318a == null) {
            this.f139318a = mo98953a();
        }
        return this.f139318a.mo25644a(i, str, aVar, cVar, j, cVarArr);
    }

    @Override // com.p2082ss.android.common.p2130b.AbstractC29811a
    /* renamed from: b */
    public final String mo52088b(int i, int i2, String str, List<C29934d> list, boolean z, AbstractC29818c[] cVarArr, List<AbstractC29926a> list2) {
        AbstractC29811a aVar = this.f139318a;
        if (aVar == null) {
            return null;
        }
        return aVar.mo52088b(i, i2, str, list, z, cVarArr, list2);
    }

    @Override // com.p2082ss.android.common.p2130b.AbstractC29811a
    /* renamed from: b */
    public final String mo52089b(int i, int i2, String str, byte[] bArr, String str2, String str3, List<AbstractC29926a> list) {
        AbstractC29811a aVar = this.f139318a;
        if (aVar == null) {
            return null;
        }
        return aVar.mo52089b(i, i2, str, bArr, str2, str3, list);
    }

    @Override // com.p2082ss.android.common.p2130b.AbstractC29811a
    /* renamed from: a */
    public final String mo25641a(int i, int i2, String str, List<C29934d> list, boolean z, AbstractC29818c[] cVarArr, List<AbstractC29926a> list2) {
        if (this.f139318a == null) {
            this.f139318a = mo98953a();
        }
        return this.f139318a.mo25641a(i, i2, str, list, z, cVarArr, list2);
    }

    @Override // com.p2082ss.android.common.p2130b.AbstractC29811a
    /* renamed from: a */
    public final String mo25643a(int i, int i2, String str, byte[] bArr, String str2, String str3, List<AbstractC29926a> list) {
        if (this.f139318a == null) {
            this.f139318a = mo98953a();
        }
        return this.f139318a.mo25643a(i, i2, str, bArr, str2, str3, list);
    }

    @Override // com.p2082ss.android.common.p2130b.AbstractC29811a
    /* renamed from: a */
    public final String mo25640a(int i, int i2, String str, List<AbstractC29926a> list, boolean z, boolean z2, C29935e eVar, boolean z3) {
        if (this.f139318a == null) {
            this.f139318a = mo98953a();
        }
        return this.f139318a.mo25640a(i, i2, str, list, z, z2, eVar, z3);
    }

    @Override // com.p2082ss.android.common.p2130b.AbstractC29811a
    /* renamed from: a */
    public final boolean mo25645a(int i, String str, String str2, String str3, String str4, AbstractC29839b<String> bVar, String str5, C29842e eVar, List<C29934d> list, String[] strArr, int[] iArr) {
        if (this.f139318a == null) {
            this.f139318a = mo98953a();
        }
        return this.f139318a.mo25645a(i, str, str2, str3, str4, bVar, str5, eVar, list, strArr, iArr);
    }
}
