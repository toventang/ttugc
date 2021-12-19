package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.reply.feature.p3118a.p3119a;

import androidx.p025c.C0484a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import java.util.Map;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.a.a.a */
public final class C54283a {

    /* renamed from: a */
    public static final C54283a f124346a = new C54283a();

    private C54283a() {
    }

    static {
        Covode.recordClassIndex(63977);
    }

    /* renamed from: a */
    public static final void m99563a(String str) {
        C54284a aVar = C54284a.f124347a;
        C89219l.m154721d(str, "");
        C89219l.m154721d(aVar, "");
        C0484a aVar2 = new C0484a();
        aVar2.put("enter_from", str);
        aVar.invoke("share_comment_toast", aVar2);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.a.a.a$a */
    static final /* synthetic */ class C54284a extends C89217j implements AbstractC89183m<String, Map<String, String>, C89391z> {

        /* renamed from: a */
        public static final C54284a f124347a = new C54284a();

        static {
            Covode.recordClassIndex(63978);
        }

        C54284a() {
            super(2, C39162r.class, "onEventV3", "onEventV3(Ljava/lang/String;Ljava/util/Map;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(String str, Map<String, String> map) {
            C39162r.m79460a(str, map);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.a.a.a$b */
    public static final /* synthetic */ class C54285b extends C89217j implements AbstractC89183m<String, Map<String, String>, C89391z> {

        /* renamed from: a */
        public static final C54285b f124348a = new C54285b();

        static {
            Covode.recordClassIndex(63979);
        }

        C54285b() {
            super(2, C39162r.class, "onEventV3", "onEventV3(Ljava/lang/String;Ljava/util/Map;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(String str, Map<String, String> map) {
            C39162r.m79460a(str, map);
            return C89391z.f203057a;
        }
    }
}
