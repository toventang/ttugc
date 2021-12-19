package com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3145a;

import androidx.p025c.C0484a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import java.util.Map;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.a.b */
public final class C54833b {

    /* renamed from: a */
    public static final C54833b f125603a = new C54833b();

    private C54833b() {
    }

    static {
        Covode.recordClassIndex(64552);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.a.b$a */
    public static final /* synthetic */ class C54834a extends C89217j implements AbstractC89183m<String, Map<String, String>, C89391z> {

        /* renamed from: a */
        public static final C54834a f125604a = new C54834a();

        static {
            Covode.recordClassIndex(64553);
        }

        C54834a() {
            super(2, C39162r.class, "onEventV3", "onEventV3(Ljava/lang/String;Ljava/util/Map;)V", 0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(String str, Map<String, String> map) {
            C39162r.m79460a(str, map);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.a.b$b */
    public static final /* synthetic */ class C54835b extends C89217j implements AbstractC89183m<String, Map<String, String>, C89391z> {

        /* renamed from: a */
        public static final C54835b f125605a = new C54835b();

        static {
            Covode.recordClassIndex(64554);
        }

        C54835b() {
            super(2, C39162r.class, "onEventV3", "onEventV3(Ljava/lang/String;Ljava/util/Map;)V", 0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(String str, Map<String, String> map) {
            C39162r.m79460a(str, map);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.a.b$c */
    public static final /* synthetic */ class C54836c extends C89217j implements AbstractC89183m<String, Map<String, String>, C89391z> {

        /* renamed from: a */
        public static final C54836c f125606a = new C54836c();

        static {
            Covode.recordClassIndex(64555);
        }

        C54836c() {
            super(2, C39162r.class, "onEventV3", "onEventV3(Ljava/lang/String;Ljava/util/Map;)V", 0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(String str, Map<String, String> map) {
            C39162r.m79460a(str, map);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.a.b$d */
    public static final /* synthetic */ class C54837d extends C89217j implements AbstractC89183m<String, Map<String, String>, C89391z> {

        /* renamed from: a */
        public static final C54837d f125607a = new C54837d();

        static {
            Covode.recordClassIndex(64556);
        }

        C54837d() {
            super(2, C39162r.class, "onEventV3", "onEventV3(Ljava/lang/String;Ljava/util/Map;)V", 0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(String str, Map<String, String> map) {
            C39162r.m79460a(str, map);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.a.b$e */
    public static final /* synthetic */ class C54838e extends C89217j implements AbstractC89183m<String, Map<String, String>, C89391z> {

        /* renamed from: a */
        public static final C54838e f125608a = new C54838e();

        static {
            Covode.recordClassIndex(64557);
        }

        C54838e() {
            super(2, C39162r.class, "onEventV3", "onEventV3(Ljava/lang/String;Ljava/util/Map;)V", 0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(String str, Map<String, String> map) {
            C39162r.m79460a(str, map);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m100430a(String str, boolean z) {
        String str2;
        C54834a aVar = C54834a.f125604a;
        C89219l.m154721d(aVar, "");
        C0484a aVar2 = new C0484a();
        aVar2.put("enter_from", "message_rec");
        aVar2.put("platform", str);
        if (z) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        aVar2.put("is_auth", str2);
        aVar2.put("previous_page", "message_rec");
        aVar.invoke("authorize_card_show", aVar2);
    }

    /* renamed from: a */
    public static void m100429a(String str, String str2, AbstractC89183m<? super String, ? super Map<String, String>, C89391z> mVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(mVar, "");
        C0484a aVar = new C0484a();
        aVar.put("enter_from", "chat");
        aVar.put("to_user_id", str2);
        mVar.invoke(str, aVar);
    }

    /* renamed from: b */
    public static void m100432b(String str, String str2, AbstractC89183m<? super String, ? super Map<String, String>, C89391z> mVar) {
        C89219l.m154721d(mVar, "");
        C0484a aVar = new C0484a();
        aVar.put("enter_from", "chat");
        aVar.put("target", str);
        aVar.put("to_user_id", str2);
        mVar.invoke("block_confirm", aVar);
    }
}
