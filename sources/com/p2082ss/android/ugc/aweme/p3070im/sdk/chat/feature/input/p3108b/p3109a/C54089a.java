package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.p3108b.p3109a;

import androidx.p025c.C0484a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import java.util.Map;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.b.a.a */
public final class C54089a {

    /* renamed from: a */
    public static final C54089a f123951a = new C54089a();

    private C54089a() {
    }

    static {
        Covode.recordClassIndex(63766);
    }

    /* renamed from: a */
    public static /* synthetic */ void m99276a(String str) {
        C54091b bVar = C54091b.f123953a;
        C89219l.m154721d(str, "");
        C89219l.m154721d(bVar, "");
        C0484a aVar = new C0484a();
        aVar.put("to_user_id", str);
        bVar.invoke("auto_emoji_show", aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.b.a.a$a */
    public static final /* synthetic */ class C54090a extends C89217j implements AbstractC89183m<String, Map<String, String>, C89391z> {

        /* renamed from: a */
        public static final C54090a f123952a = new C54090a();

        static {
            Covode.recordClassIndex(63767);
        }

        C54090a() {
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
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.b.a.a$b */
    public static final /* synthetic */ class C54091b extends C89217j implements AbstractC89183m<String, Map<String, String>, C89391z> {

        /* renamed from: a */
        public static final C54091b f123953a = new C54091b();

        static {
            Covode.recordClassIndex(63768);
        }

        C54091b() {
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
