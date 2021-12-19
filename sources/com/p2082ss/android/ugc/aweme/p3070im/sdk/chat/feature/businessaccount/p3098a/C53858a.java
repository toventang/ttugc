package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.p3098a;

import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import java.util.Map;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.a.a */
public final class C53858a {

    /* renamed from: a */
    public static final C53858a f123503a = new C53858a();

    /* renamed from: c */
    private static String m99120c(int i) {
        switch (i) {
            case 1:
                return "save_success";
            case 2:
                return "cancel_save";
            case 3:
                return "discard_edit";
            case 4:
                return "cancel_discard";
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                return "submit_success";
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                return "cancel_submit";
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                return "delete_keyword";
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                return "cancel_delete";
            default:
                return "";
        }
    }

    private C53858a() {
    }

    static {
        Covode.recordClassIndex(63518);
    }

    /* renamed from: a */
    public static /* synthetic */ void m99114a(int i) {
        C53861c cVar = C53861c.f123506a;
        C89219l.m154721d(cVar, "");
        Map<String, String> map = new C33744d().mo59983a("status", m99120c(i)).f79943a;
        C89219l.m154716b(map, "");
        cVar.invoke("edit_welcome_message", map);
    }

    /* renamed from: b */
    public static /* synthetic */ void m99119b(int i) {
        C53860b bVar = C53860b.f123505a;
        C89219l.m154721d(bVar, "");
        Map<String, String> map = new C33744d().mo59983a("status", m99120c(i)).f79943a;
        C89219l.m154716b(map, "");
        bVar.invoke("edit_auto_reply_keyword", map);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.a.a$a */
    public static final /* synthetic */ class C53859a extends C89217j implements AbstractC89183m<String, Map<String, String>, C89391z> {

        /* renamed from: a */
        public static final C53859a f123504a = new C53859a();

        static {
            Covode.recordClassIndex(63519);
        }

        C53859a() {
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

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.a.a$b */
    public static final /* synthetic */ class C53860b extends C89217j implements AbstractC89183m<String, Map<String, String>, C89391z> {

        /* renamed from: a */
        public static final C53860b f123505a = new C53860b();

        static {
            Covode.recordClassIndex(63520);
        }

        C53860b() {
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

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.a.a$c */
    public static final /* synthetic */ class C53861c extends C89217j implements AbstractC89183m<String, Map<String, String>, C89391z> {

        /* renamed from: a */
        public static final C53861c f123506a = new C53861c();

        static {
            Covode.recordClassIndex(63521);
        }

        C53861c() {
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

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.a.a$d */
    public static final /* synthetic */ class C53862d extends C89217j implements AbstractC89183m<String, Map<String, String>, C89391z> {

        /* renamed from: a */
        public static final C53862d f123507a = new C53862d();

        static {
            Covode.recordClassIndex(63522);
        }

        C53862d() {
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

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.a.a$e */
    public static final /* synthetic */ class C53863e extends C89217j implements AbstractC89183m<String, Map<String, String>, C89391z> {

        /* renamed from: a */
        public static final C53863e f123508a = new C53863e();

        static {
            Covode.recordClassIndex(63523);
        }

        C53863e() {
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

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.a.a$f */
    public static final /* synthetic */ class C53864f extends C89217j implements AbstractC89183m<String, Map<String, String>, C89391z> {

        /* renamed from: a */
        public static final C53864f f123509a = new C53864f();

        static {
            Covode.recordClassIndex(63524);
        }

        C53864f() {
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

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static void m99116a(String str, int i, AbstractC89183m<? super String, ? super Map<String, String>, C89391z> mVar) {
        String str2;
        C89219l.m154721d(str, "");
        C89219l.m154721d(mVar, "");
        C33744d a = new C33744d().mo59983a("enter_from", str);
        if (i == 1) {
            str2 = "business_welcome_message";
        } else if (i == 2) {
            str2 = "business_auto_reply";
        } else {
            return;
        }
        Map<String, String> map = a.mo59983a("target", str2).f79943a;
        C89219l.m154716b(map, "");
        mVar.invoke("enter_business_message_edit", map);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static void m99118a(String str, int i, boolean z, AbstractC89183m<? super String, ? super Map<String, String>, C89391z> mVar) {
        String str2;
        String str3;
        C89219l.m154721d(str, "");
        C89219l.m154721d(mVar, "");
        C33744d a = new C33744d().mo59983a("enter_from", str);
        if (i == 1) {
            str2 = "welcome_message";
        } else if (i == 2) {
            str2 = "auto_reply";
        } else {
            return;
        }
        C33744d a2 = a.mo59983a("target", str2);
        if (z) {
            str3 = "on";
        } else {
            str3 = "off";
        }
        Map<String, String> map = a2.mo59983a("status", str3).f79943a;
        C89219l.m154716b(map, "");
        mVar.invoke("switch_business_message_button", map);
    }
}
