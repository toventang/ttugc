package com.facebook.net;

import android.net.Uri;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.p1612c.AbstractC22021a;
import com.bytedance.ttnet.p1703d.C22940b;
import com.bytedance.ttnet.p1703d.C22944d;
import com.facebook.common.p1839k.C24134g;
import com.facebook.net.C24907h;
import com.p2082ss.android.ugc.aweme.p2404bs.C34932b;
import com.p2082ss.p2083a.p2084a.AbstractC29335a;
import java.util.List;

class RetryInterceptManager$1 implements AbstractC22021a {

    /* renamed from: a */
    final /* synthetic */ C24907h f59081a;

    static {
        Covode.recordClassIndex(29082);
    }

    @Override // com.bytedance.retrofit2.p1612c.AbstractC22021a
    public C22099u intercept(AbstractC22021a.AbstractC22022a aVar) {
        if (!(aVar.mo35812c() instanceof C34932b)) {
            return m47717a(aVar);
        }
        C34932b bVar = (C34932b) aVar.mo35812c();
        if (bVar.f82415W > 0) {
            long uptimeMillis = SystemClock.uptimeMillis() - bVar.f82415W;
            bVar.mo61814a(bVar.f82417Y, uptimeMillis);
            bVar.mo61815b(bVar.f82417Y, uptimeMillis);
        }
        bVar.mo61813a(getClass().getSimpleName());
        bVar.f82415W = SystemClock.uptimeMillis();
        C22099u a = m47717a(aVar);
        if (bVar.f82416X > 0) {
            long uptimeMillis2 = SystemClock.uptimeMillis() - bVar.f82416X;
            String simpleName = getClass().getSimpleName();
            bVar.mo61814a(simpleName, uptimeMillis2);
            bVar.mo61816c(simpleName, uptimeMillis2);
        }
        bVar.f82416X = SystemClock.uptimeMillis();
        return a;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:19:0x0094 */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.facebook.net.RetryInterceptManager$1] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [com.bytedance.retrofit2.u] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* renamed from: a */
    private C22099u m47717a(AbstractC22021a.AbstractC22022a aVar) {
        Exception e;
        RetryInterceptManager$1 retryInterceptManager$1;
        C22944d dVar;
        List<Uri> list;
        RetryInterceptManager$1 retryInterceptManager$12 = this;
        int i = 0;
        while (true) {
            boolean z = true;
            try {
                Request a = aVar.mo35809a();
                Object extraInfo = a.getExtraInfo();
                if ((extraInfo instanceof C24892b) && (list = ((C24892b) extraInfo).f59083v) != null && list.size() - 1 >= i) {
                    Uri uri = list.get(i);
                    if (C24134g.m45737b(uri)) {
                        a = new Request(a.getMethod(), uri.toString(), a.getHeaders(), a.getBody(), a.getPriorityLevel(), a.isResponseStreaming(), a.getMaxLength(), a.isAddCommonParam(), a.getExtraInfo());
                    }
                }
                if (retryInterceptManager$12.f59081a.mo40785b()) {
                    Object extraInfo2 = a.getExtraInfo();
                    if (extraInfo2 instanceof C22944d) {
                        dVar = (C22944d) extraInfo2;
                    } else {
                        dVar = new C22944d();
                    }
                    dVar.f35400c = (long) retryInterceptManager$12.f59081a.f59129a.get(i).intValue();
                    dVar.f35401d = (long) retryInterceptManager$12.f59081a.f59130b.get(i).intValue();
                    a.setExtraInfo(dVar);
                }
                try {
                    retryInterceptManager$12 = aVar.mo35810a(a);
                    try {
                        if (retryInterceptManager$12 instanceof C22099u) {
                            Object obj = retryInterceptManager$12.f52261a.f52044f;
                            if (obj instanceof C22940b) {
                                ((C22940b) obj).f35383z.put("retryCount", i);
                            }
                        }
                    } catch (Exception unused) {
                    }
                    return retryInterceptManager$12;
                } catch (Exception e2) {
                    e = e2;
                    retryInterceptManager$1 = retryInterceptManager$12;
                }
            } catch (Exception e3) {
                e = e3;
                retryInterceptManager$1 = retryInterceptManager$12;
                if (!retryInterceptManager$1.f59081a.mo40785b()) {
                    break;
                }
                String message = e.getMessage();
                if ("request canceled".equals(message) || "Canceled".equals(message) || "network not available".equals(message)) {
                    z = false;
                }
                if (!z) {
                    break;
                }
                i++;
                if (i < retryInterceptManager$1.f59081a.f59131c) {
                    AbstractC29335a.m58736d("RetryInterceptManager", "[intercept] retryNum: ".concat(String.valueOf(i)));
                    retryInterceptManager$12 = retryInterceptManager$1;
                } else {
                    throw new C24907h.C24908a(e, i);
                }
                throw e;
            }
            AbstractC29335a.m58736d("RetryInterceptManager", "[intercept] retryNum: ".concat(String.valueOf(i)));
            retryInterceptManager$12 = retryInterceptManager$1;
        }
        throw e;
    }
}
