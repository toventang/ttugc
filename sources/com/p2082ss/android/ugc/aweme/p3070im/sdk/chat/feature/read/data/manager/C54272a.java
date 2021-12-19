package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.read.data.manager;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3171b.C55060c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.read.data.manager.a */
public final class C54272a {

    /* renamed from: e */
    public static final C54273a f124320e = new C54273a((byte) 0);

    /* renamed from: a */
    public C19538ai f124321a;

    /* renamed from: b */
    public int f124322b = -1;

    /* renamed from: c */
    boolean f124323c;

    /* renamed from: d */
    public final C19638h f124324d;

    /* renamed from: f */
    private C19538ai f124325f;

    static {
        Covode.recordClassIndex(63964);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.read.data.manager.a$a */
    public static final class C54273a {
        static {
            Covode.recordClassIndex(63965);
        }

        private C54273a() {
        }

        public /* synthetic */ C54273a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo91357a() {
        C19538ai aiVar = this.f124321a;
        if (aiVar == null || C89219l.m154714a(this.f124325f, aiVar)) {
            C19538ai aiVar2 = this.f124321a;
            if (aiVar2 != null) {
                Long.valueOf(aiVar2.getMsgId());
            }
            C19538ai aiVar3 = this.f124325f;
            if (aiVar3 != null) {
                Long.valueOf(aiVar3.getMsgId());
                return;
            }
            return;
        }
        this.f124325f = this.f124321a;
        mo91358a("replied");
    }

    /* renamed from: a */
    public final void mo91358a(String str) {
        C55060c.m100700a(this.f124324d, str);
    }

    public C54272a(C19638h hVar) {
        C89219l.m154721d(hVar, "");
        this.f124324d = hVar;
    }
}
