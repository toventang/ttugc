package com.p2082ss.android.ugc.aweme.lancet.ssretrofitchain;

import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.p1612c.AbstractC22021a;
import com.p2082ss.android.ugc.aweme.lancet.ssretrofitchain.AbstractC58051c;
import com.p2082ss.android.ugc.aweme.p2404bs.C34932b;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.lancet.ssretrofitchain.VerifyInterceptor */
public class VerifyInterceptor implements AbstractC22021a {

    /* renamed from: a */
    private static final boolean f132271a = false;

    static {
        Covode.recordClassIndex(68081);
    }

    @Override // com.bytedance.retrofit2.p1612c.AbstractC22021a
    public C22099u intercept(AbstractC22021a.AbstractC22022a aVar) {
        if (!(aVar.mo35812c() instanceof C34932b)) {
            return m104868a(aVar);
        }
        C34932b bVar = (C34932b) aVar.mo35812c();
        if (bVar.f82415W > 0) {
            long uptimeMillis = SystemClock.uptimeMillis() - bVar.f82415W;
            bVar.mo61814a(bVar.f82417Y, uptimeMillis);
            bVar.mo61815b(bVar.f82417Y, uptimeMillis);
        }
        bVar.mo61813a(getClass().getSimpleName());
        bVar.f82415W = SystemClock.uptimeMillis();
        C22099u a = m104868a(aVar);
        if (bVar.f82416X > 0) {
            long uptimeMillis2 = SystemClock.uptimeMillis() - bVar.f82416X;
            String simpleName = getClass().getSimpleName();
            bVar.mo61814a(simpleName, uptimeMillis2);
            bVar.mo61816c(simpleName, uptimeMillis2);
        }
        bVar.f82416X = SystemClock.uptimeMillis();
        return a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x010d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0086 A[ADDED_TO_REGION, EDGE_INSN: B:58:0x0086->B:34:0x0086 ?: BREAK  , SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.bytedance.retrofit2.C22099u m104868a(com.bytedance.retrofit2.p1612c.AbstractC22021a.AbstractC22022a r8) {
        /*
        // Method dump skipped, instructions count: 271
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.lancet.ssretrofitchain.VerifyInterceptor.m104868a(com.bytedance.retrofit2.c.a$a):com.bytedance.retrofit2.u");
    }

    /* renamed from: a */
    private static Request m104867a(Request request, AbstractC58051c.C58052a aVar) {
        if (f132271a) {
            request.getUrl();
        }
        Uri.Builder buildUpon = Uri.parse(request.getUrl()).buildUpon();
        for (Map.Entry<String, String> entry : aVar.f132290c.entrySet()) {
            if (f132271a) {
                entry.getKey();
                entry.getValue();
            }
            if (!TextUtils.isEmpty(entry.getKey()) && !TextUtils.isEmpty(entry.getValue())) {
                buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
            }
        }
        return request.newBuilder().mo35838a(buildUpon.build().toString()).mo35840a();
    }
}
