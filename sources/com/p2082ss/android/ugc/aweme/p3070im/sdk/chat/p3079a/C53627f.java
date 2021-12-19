package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3079a;

import androidx.p025c.C0484a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import java.util.Map;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.a.f */
public final class C53627f {

    /* renamed from: a */
    public static final C53627f f123051a = new C53627f();

    private C53627f() {
    }

    static {
        Covode.recordClassIndex(63207);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.a.f$a */
    public static final /* synthetic */ class C53628a extends C89217j implements AbstractC89183m<String, Map<String, String>, C89391z> {

        /* renamed from: a */
        public static final C53628a f123052a = new C53628a();

        static {
            Covode.recordClassIndex(63208);
        }

        C53628a() {
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

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.a.f$b */
    static final /* synthetic */ class C53629b extends C89217j implements AbstractC89183m<String, Map<String, String>, C89391z> {

        /* renamed from: a */
        public static final C53629b f123053a = new C53629b();

        static {
            Covode.recordClassIndex(63209);
        }

        C53629b() {
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

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.a.f$c */
    public static final /* synthetic */ class C53630c extends C89217j implements AbstractC89183m<String, Map<String, String>, C89391z> {

        /* renamed from: a */
        public static final C53630c f123054a = new C53630c();

        static {
            Covode.recordClassIndex(63210);
        }

        C53630c() {
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

    /* renamed from: a */
    public static void m98869a(boolean z, String str) {
        String str2;
        C53629b bVar = C53629b.f123053a;
        C89219l.m154721d(bVar, "");
        if (z) {
            str2 = "group";
        } else {
            str2 = "private";
        }
        C0484a aVar = new C0484a();
        aVar.put("enter_from", "chat");
        aVar.put("chat_type", str2);
        aVar.put("target", str);
        bVar.invoke("message_long_press_feedback", aVar);
    }
}
