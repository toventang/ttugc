package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.like.p3117ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.controller.helper.C54881c;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.like.ui.b */
public final class C54248b {

    /* renamed from: a */
    public static final C54248b f124271a = new C54248b();

    /* renamed from: b */
    private static final AbstractC89244h f124272b = C89250i.m154773a((AbstractC89171a) C54249a.f124273a);

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.like.ui.b$b */
    public static final class C54250b {
        @AbstractC27891c(mo46611a = "required_min_version")

        /* renamed from: a */
        public int f124274a = 180100;

        static {
            Covode.recordClassIndex(63940);
        }
    }

    private C54248b() {
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.like.ui.b$a */
    static final class C54249a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        public static final C54249a f124273a = new C54249a();

        static {
            Covode.recordClassIndex(63939);
        }

        C54249a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            return C54881c.f125656a.mo46674b(new C54250b());
        }
    }

    static {
        Covode.recordClassIndex(63938);
    }

    /* renamed from: a */
    public static String m99500a(C19538ai aiVar) {
        C89219l.m154721d(aiVar, "");
        if (aiVar.getMsgType() != 5) {
            return "";
        }
        String str = (String) f124272b.getValue();
        C89219l.m154716b(str, "");
        return str;
    }
}
