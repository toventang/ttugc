package com.p2082ss.android.ugc.aweme.lancet.ssretrofitchain;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.client.C22027b;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p2082ss.android.ugc.aweme.lancet.ssretrofitchain.C58057g;
import com.p2082ss.android.ugc.aweme.sec.C67828e;
import com.p2082ss.android.ugc.aweme.sec.SecApiImpl;

/* renamed from: com.ss.android.ugc.aweme.lancet.ssretrofitchain.ResponseExtraParser */
public final class ResponseExtraParser {

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.lancet.ssretrofitchain.ResponseExtraParser$OldErrorModel */
    public static class OldErrorModel {
        Data data;

        static {
            Covode.recordClassIndex(68079);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.lancet.ssretrofitchain.ResponseExtraParser$OldErrorModel$Data */
        public static class Data {
            String description;
            int error_code;
            String verify_center_decision_conf;
            String verify_center_secondary_decision_conf;

            static {
                Covode.recordClassIndex(68080);
            }

            Data() {
            }
        }

        OldErrorModel() {
        }
    }

    static {
        Covode.recordClassIndex(68078);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0051, code lost:
        if (r9.equals("error_code") != false) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a6, code lost:
        if (r9.equals("status_code") != false) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00aa, code lost:
        if (r5.f132295a > 0) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ac, code lost:
        r5.f132295a = r6.mo46634n();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00bf, code lost:
        r6.mo46635o();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.p2082ss.android.ugc.aweme.lancet.ssretrofitchain.C58057g m104864a(java.lang.String r13) {
        /*
        // Method dump skipped, instructions count: 324
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.lancet.ssretrofitchain.ResponseExtraParser.m104864a(java.lang.String):com.ss.android.ugc.aweme.lancet.ssretrofitchain.g");
    }

    /* renamed from: a */
    public static C58057g m104865a(String str, C22099u uVar) {
        long j;
        C58057g gVar = null;
        if (uVar == null) {
            return null;
        }
        T t = uVar.f52262b;
        if (t != null) {
            if (t instanceof BaseResponse) {
                return m104866a(str, t, uVar);
            }
            if (t instanceof String) {
                return m104864a(t.toString());
            }
            if (t instanceof FeedItemList) {
                T t2 = t;
                if (t2 == null) {
                    return null;
                }
                C58057g.C58058a aVar = new C58057g.C58058a();
                int i = t2.status_code;
                if (i == 0) {
                    i = t2.error_code;
                }
                aVar.f132295a = i;
                aVar.f132296b = t2.status_msg;
                if (t2.extra != null) {
                    j = t2.extra.now;
                } else {
                    j = -1;
                }
                return new C58057g(aVar, j);
            }
        }
        if (uVar.f52261a == null || uVar.f52261a.f52043e == null) {
            return null;
        }
        C22027b a = uVar.f52261a.mo35844a("Transfer-Encoding");
        if (a != null && "chunked".equalsIgnoreCase(a.f52038b)) {
            return null;
        }
        try {
            System.currentTimeMillis();
            gVar = m104864a(C67828e.m120017a(uVar.f52261a));
            return gVar;
        } catch (Throwable unused) {
            return gVar;
        }
    }

    /* renamed from: a */
    private static C58057g m104866a(String str, BaseResponse baseResponse, C22099u uVar) {
        long j;
        if (baseResponse == null) {
            return null;
        }
        if (SecApiImpl.m119993a().isCaptchaUrl(str)) {
            try {
                return m104864a(C67828e.m120017a(uVar.f52261a));
            } catch (Exception unused) {
            }
        }
        C58057g.C58058a aVar = new C58057g.C58058a();
        aVar.f132295a = baseResponse.status_code;
        aVar.f132296b = baseResponse.status_msg;
        if (baseResponse.extra != null) {
            j = baseResponse.extra.now;
        } else {
            j = -1;
        }
        return new C58057g(aVar, j);
    }
}
