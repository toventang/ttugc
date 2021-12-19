package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.p3090a.p3091a;

import androidx.p025c.C0484a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.emoji.p2904g.C46534a;
import java.util.List;
import java.util.Map;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.a.a.a */
public final class C53835a {

    /* renamed from: a */
    public static final C53835a f123452a = new C53835a();

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.a.a.a$a */
    public static final class C53836a {

        /* renamed from: a */
        static String f123453a = "greeting_emoji_alert_show";

        /* renamed from: b */
        static String f123454b = "greeting_emoji_alert_close";

        /* renamed from: c */
        public static String f123455c = "greeting_emoji";

        /* renamed from: d */
        public static final C53836a f123456d = new C53836a();

        private C53836a() {
        }

        static {
            Covode.recordClassIndex(63496);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.a.a.a$b */
    public static final class C53837b {

        /* renamed from: a */
        public static String f123457a = "emoji_id";

        /* renamed from: b */
        public static final C53837b f123458b = new C53837b();

        private C53837b() {
        }

        static {
            Covode.recordClassIndex(63497);
        }
    }

    private C53835a() {
    }

    static {
        Covode.recordClassIndex(63495);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.a.a.a$c */
    public static final /* synthetic */ class C53838c extends C89217j implements AbstractC89183m<String, Map<String, String>, C89391z> {

        /* renamed from: a */
        public static final C53838c f123459a = new C53838c();

        static {
            Covode.recordClassIndex(63498);
        }

        C53838c() {
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

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.a.a.a$d */
    public static final /* synthetic */ class C53839d extends C89217j implements AbstractC89183m<String, Map<String, String>, C89391z> {

        /* renamed from: a */
        public static final C53839d f123460a = new C53839d();

        static {
            Covode.recordClassIndex(63499);
        }

        C53839d() {
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
    public static /* synthetic */ void m99077a(String str, String str2, List list, boolean z) {
        C53838c cVar = C53838c.f123459a;
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(list, "");
        C89219l.m154721d(cVar, "");
        C0484a aVar = new C0484a();
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append(((C46534a) list.get(i)).getId());
            if (i != list.size() - 1) {
                sb.append(",");
            }
        }
        aVar.put("conversation_id", str2);
        aVar.put("to_user_id", str);
        String str3 = C53837b.f123457a;
        String sb2 = sb.toString();
        C89219l.m154716b(sb2, "");
        aVar.put(str3, sb2);
        if (z) {
            cVar.invoke(C53836a.f123454b, aVar);
        } else {
            cVar.invoke(C53836a.f123453a, aVar);
        }
    }
}
