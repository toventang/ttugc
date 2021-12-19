package com.p2082ss.android.ugc.aweme.feed.api;

import android.app.Activity;
import android.os.Build;
import android.os.SystemClock;
import android.widget.Toast;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.p1612c.AbstractC22021a;
import com.p2082ss.android.ugc.aweme.p2404bs.C34932b;
import com.p2082ss.android.ugc.aweme.utils.C80567ic;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.feed.api.ComplianceEncryptCheckInterceptor */
public final class ComplianceEncryptCheckInterceptor implements AbstractC22021a {
    static {
        Covode.recordClassIndex(57070);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.api.ComplianceEncryptCheckInterceptor$a */
    public static final class CallableC48322a<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ Request f111980a;

        static {
            Covode.recordClassIndex(57071);
        }

        CallableC48322a(Request request) {
            this.f111980a = request;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            String str;
            Activity j = C17873f.m33102j();
            StringBuilder sb = new StringBuilder("Missing Compliance Encrypt param! ");
            Request request = this.f111980a;
            if (request != null) {
                str = request.getUrl();
            } else {
                str = null;
            }
            Toast makeText = Toast.makeText(j, sb.append(str).toString(), 1);
            if (Build.VERSION.SDK_INT == 25) {
                C80567ic.m139657a(makeText);
            }
            makeText.show();
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    private static C22099u<?> m91765a(AbstractC22021a.AbstractC22022a aVar) {
        Request request;
        String url;
        if (aVar != null) {
            request = aVar.mo35809a();
        } else {
            request = null;
        }
        if (request == null || (url = request.getUrl()) == null || !C89361p.m154908a((CharSequence) url, (CharSequence) "cmpl_enc", false)) {
            C1731i.m5640b(new CallableC48322a(request), C1731i.f5564c);
        }
        if (aVar != null) {
            return aVar.mo35810a(request);
        }
        return null;
    }

    @Override // com.bytedance.retrofit2.p1612c.AbstractC22021a
    public final C22099u intercept(AbstractC22021a.AbstractC22022a aVar) {
        if (!(aVar.mo35812c() instanceof C34932b)) {
            return m91765a(aVar);
        }
        C34932b bVar = (C34932b) aVar.mo35812c();
        if (bVar.f82415W > 0) {
            long uptimeMillis = SystemClock.uptimeMillis() - bVar.f82415W;
            bVar.mo61814a(bVar.f82417Y, uptimeMillis);
            bVar.mo61815b(bVar.f82417Y, uptimeMillis);
        }
        bVar.mo61813a(getClass().getSimpleName());
        bVar.f82415W = SystemClock.uptimeMillis();
        C22099u<?> a = m91765a(aVar);
        if (bVar.f82416X > 0) {
            long uptimeMillis2 = SystemClock.uptimeMillis() - bVar.f82416X;
            String simpleName = getClass().getSimpleName();
            bVar.mo61814a(simpleName, uptimeMillis2);
            bVar.mo61816c(simpleName, uptimeMillis2);
        }
        bVar.f82416X = SystemClock.uptimeMillis();
        return a;
    }
}
