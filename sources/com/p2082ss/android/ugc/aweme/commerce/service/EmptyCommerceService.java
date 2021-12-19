package com.p2082ss.android.ugc.aweme.commerce.service;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commerce.service.p2521a.C37534a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commerce.service.EmptyCommerceService */
public class EmptyCommerceService implements ICommerceService {
    public static final C37532a Companion = new C37532a((byte) 0);

    static {
        Covode.recordClassIndex(44922);
    }

    /* renamed from: com_ss_android_ugc_aweme_commerce_service_EmptyCommerceService_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m75655xbc0aed59(String str, String str2) {
        return 0;
    }

    /* renamed from: com.ss.android.ugc.aweme.commerce.service.EmptyCommerceService$a */
    public static final class C37532a {
        static {
            Covode.recordClassIndex(44923);
        }

        private C37532a() {
        }

        public /* synthetic */ C37532a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commerce.service.ICommerceService
    public Aweme getAwemeById(String str) {
        m75655xbc0aed59("EmptyCommerceService", "Some Error Happen");
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.commerce.service.ICommerceService
    public void logCommerceEvents(String str, C37534a aVar) {
        C89219l.m154721d(str, "");
        m75655xbc0aed59("EmptyCommerceService", "Some Error Happen");
    }
}
