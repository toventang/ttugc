package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.p3107a;

import androidx.p025c.C0484a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3171b.C55059b;
import java.util.Map;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.a.b */
public final class C54086b {

    /* renamed from: a */
    public static final C54086b f123948a = new C54086b();

    private C54086b() {
    }

    static {
        Covode.recordClassIndex(63763);
    }

    /* renamed from: a */
    public static /* synthetic */ void m99274a(String str) {
        C54088b bVar = C54088b.f123950a;
        C89219l.m154721d(str, "");
        C89219l.m154721d(bVar, "");
        C0484a aVar = new C0484a();
        aVar.put("enter_from", str);
        String str2 = C55059b.f126008b;
        if (str2 != null) {
            aVar.put("process_id", str2);
        }
        bVar.invoke("show_keyboard", aVar);
    }

    /* renamed from: b */
    public static /* synthetic */ void m99275b(String str) {
        C54087a aVar = C54087a.f123949a;
        C89219l.m154721d(str, "");
        C89219l.m154721d(aVar, "");
        C0484a aVar2 = new C0484a();
        aVar2.put("enter_from", str);
        String str2 = C55059b.f126008b;
        if (str2 != null) {
            aVar2.put("process_id", str2);
        }
        aVar.invoke("show_emoji_panel", aVar2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.a.b$a */
    public static final /* synthetic */ class C54087a extends C89217j implements AbstractC89183m<String, Map<String, String>, C89391z> {

        /* renamed from: a */
        public static final C54087a f123949a = new C54087a();

        static {
            Covode.recordClassIndex(63764);
        }

        C54087a() {
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
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.a.b$b */
    public static final /* synthetic */ class C54088b extends C89217j implements AbstractC89183m<String, Map<String, String>, C89391z> {

        /* renamed from: a */
        public static final C54088b f123950a = new C54088b();

        static {
            Covode.recordClassIndex(63765);
        }

        C54088b() {
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
