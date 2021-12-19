package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.p3186d;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.p1408d.C19600ay;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.CheckMessage;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55197c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55214j;
import java.util.HashMap;
import java.util.Map;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.utils.d.a */
public final class C55204a {

    /* renamed from: a */
    public static final C55204a f126271a = new C55204a();

    private C55204a() {
    }

    static {
        Covode.recordClassIndex(64949);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.utils.d.a$b */
    public static final class C55206b<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C55206b f126275a = new C55206b();

        static {
            Covode.recordClassIndex(64951);
        }

        C55206b() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            HashMap hashMap = new HashMap();
            hashMap.put("error_msg", "report error");
            C89219l.m154716b(th, "");
            hashMap.put("error_desc", th);
            C55197c.m100920b("send_msg_error", hashMap);
            C51423a.m95786a((Exception) new RuntimeException(th));
        }
    }

    /* renamed from: a */
    public static int m100944a(Map<String, String> map) {
        int i;
        try {
            i = ((CheckMessage) C55214j.m100957a(map.get("s:send_response_check_msg"), CheckMessage.class)).status_code;
            if (i != 0) {
                return i;
            }
            String str = map.get("s:err_code");
            if (str == null) {
                return i;
            }
            try {
                if (!TextUtils.isEmpty(str)) {
                    return Integer.parseInt(str);
                }
                return i;
            } catch (Exception unused) {
                return i;
            }
        } catch (Exception unused2) {
            i = 0;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.utils.d.a$a */
    public static final class C55205a<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ boolean f126272a;

        /* renamed from: b */
        final /* synthetic */ long f126273b;

        /* renamed from: c */
        final /* synthetic */ C19600ay f126274c;

        static {
            Covode.recordClassIndex(64950);
        }

        public C55205a(boolean z, long j, C19600ay ayVar) {
            this.f126272a = z;
            this.f126273b = j;
            this.f126274c = ayVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:123:0x02c3, code lost:
            if (r3.put("sdk_metrics_valid", r17) == null) goto L_0x02c5;
         */
        /* JADX WARNING: Removed duplicated region for block: B:106:0x0235  */
        /* JADX WARNING: Removed duplicated region for block: B:112:0x024b  */
        /* JADX WARNING: Removed duplicated region for block: B:115:0x025b  */
        /* JADX WARNING: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x01ab  */
        /* JADX WARNING: Removed duplicated region for block: B:77:0x01b6  */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x01bc  */
        /* JADX WARNING: Removed duplicated region for block: B:85:0x01ce A[Catch:{ Exception -> 0x0215 }] */
        /* JADX WARNING: Removed duplicated region for block: B:88:0x01da A[Catch:{ Exception -> 0x0215 }] */
        /* JADX WARNING: Removed duplicated region for block: B:89:0x01e4 A[Catch:{ Exception -> 0x0215 }] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void accept(java.lang.Object r28) {
            /*
            // Method dump skipped, instructions count: 727
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.p3186d.C55204a.C55205a.accept(java.lang.Object):void");
        }
    }
}
