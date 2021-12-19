package com.p2082ss.android.ugc.aweme.notification.service;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.IIMService;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.service.a */
public final class C62239a {

    /* renamed from: a */
    public static final C62240a f141267a = new C62240a((byte) 0);

    static {
        Covode.recordClassIndex(73009);
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.service.a$a */
    public static final class C62240a {
        static {
            Covode.recordClassIndex(73010);
        }

        private C62240a() {
        }

        /* renamed from: a */
        public static IIMService m112592a() {
            IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
            C89219l.m154716b(createIIMServicebyMonsterPlugin, "");
            return createIIMServicebyMonsterPlugin;
        }

        public /* synthetic */ C62240a(byte b) {
            this();
        }
    }
}
