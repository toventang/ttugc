package com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3145a;

import androidx.p025c.C0484a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17420a;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.inbox.p3267b.C56318b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3171b.C55058a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3171b.C55059b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55080c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.p3198a.p3199a.C55339a;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3261k.AbstractC56237a;
import java.util.Map;
import java.util.concurrent.Callable;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.a.a */
public final class C54823a {

    /* renamed from: a */
    public static final C54823a f125589a = new C54823a();

    private C54823a() {
    }

    static {
        Covode.recordClassIndex(64542);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.a.a$f */
    public static final class CallableC54829f<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ AbstractC17420a f125595a;

        /* renamed from: b */
        final /* synthetic */ AbstractC56237a f125596b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89183m f125597c;

        static {
            Covode.recordClassIndex(64548);
        }

        public CallableC54829f(AbstractC17420a aVar, AbstractC56237a aVar2, AbstractC89183m mVar) {
            this.f125595a = aVar;
            this.f125596b = aVar2;
            this.f125597c = mVar;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            C19638h a = this.f125595a.mo27720a(this.f125596b.bL_());
            if (a == null) {
                return null;
            }
            this.f125597c.invoke("chat_show", C89041ag.m154419a(C89041ag.m154419a(C54823a.m100423a(this.f125596b), C89387v.m154943a("is_master", String.valueOf(C55339a.m101154c(a)))), C89387v.m154943a("chat_type", "group")));
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.a.a$h */
    public static final class CallableC54831h<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ AbstractC17420a f125599a;

        /* renamed from: b */
        final /* synthetic */ AbstractC56237a f125600b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89183m f125601c;

        static {
            Covode.recordClassIndex(64550);
        }

        public CallableC54831h(AbstractC17420a aVar, AbstractC56237a aVar2, AbstractC89183m mVar) {
            this.f125599a = aVar;
            this.f125600b = aVar2;
            this.f125601c = mVar;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            C19638h a = this.f125599a.mo27720a(this.f125600b.bL_());
            if (a == null) {
                return null;
            }
            this.f125601c.invoke("chat_show", C89041ag.m154419a(C89041ag.m154419a(C54823a.m100423a(this.f125600b), C89387v.m154943a("to_user_id", String.valueOf(C55080c.m100729a(a)))), C89387v.m154943a("chat_type", "private")));
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static Map<String, String> m100423a(AbstractC56237a aVar) {
        String str;
        String str2;
        String str3;
        C89378p[] pVarArr = new C89378p[6];
        pVarArr[0] = C89387v.m154943a("chat_type", "private");
        pVarArr[1] = C89387v.m154943a("conversation_id", aVar.bL_());
        if (C56318b.m102311b()) {
            str = "notification_page";
        } else {
            str = "chat_list";
        }
        pVarArr[2] = C89387v.m154943a("enter_from", str);
        if (aVar.f128240s) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        pVarArr[3] = C89387v.m154943a("is_top", str2);
        pVarArr[4] = C89387v.m154943a("unread_cnt", String.valueOf(aVar.f128238q));
        if (aVar.f128238q > 0) {
            str3 = "number_dot";
        } else if (aVar.f128239r) {
            str3 = "yellow_dot";
        } else {
            str3 = "";
        }
        pVarArr[5] = C89387v.m154943a("notice_type", str3);
        return C89041ag.m154421a(pVarArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.a.a$a */
    public static final /* synthetic */ class C54824a extends C89217j implements AbstractC89183m<String, Map<String, String>, C89391z> {

        /* renamed from: a */
        public static final C54824a f125590a = new C54824a();

        static {
            Covode.recordClassIndex(64543);
        }

        C54824a() {
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
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.a.a$b */
    public static final /* synthetic */ class C54825b extends C89217j implements AbstractC89183m<String, Map<String, String>, C89391z> {

        /* renamed from: a */
        public static final C54825b f125591a = new C54825b();

        static {
            Covode.recordClassIndex(64544);
        }

        C54825b() {
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
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.a.a$c */
    public static final /* synthetic */ class C54826c extends C89217j implements AbstractC89183m<String, Map<String, String>, C89391z> {

        /* renamed from: a */
        public static final C54826c f125592a = new C54826c();

        static {
            Covode.recordClassIndex(64545);
        }

        C54826c() {
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

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.a.a$d */
    public static final /* synthetic */ class C54827d extends C89217j implements AbstractC89183m<String, Map<String, String>, C89391z> {

        /* renamed from: a */
        public static final C54827d f125593a = new C54827d();

        static {
            Covode.recordClassIndex(64546);
        }

        C54827d() {
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

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.a.a$e */
    public static final /* synthetic */ class C54828e extends C89217j implements AbstractC89183m<String, Map<String, String>, C89391z> {

        /* renamed from: a */
        public static final C54828e f125594a = new C54828e();

        static {
            Covode.recordClassIndex(64547);
        }

        C54828e() {
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

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.a.a$g */
    public static final /* synthetic */ class C54830g extends C89217j implements AbstractC89183m<String, Map<String, String>, C89391z> {

        /* renamed from: a */
        public static final C54830g f125598a = new C54830g();

        static {
            Covode.recordClassIndex(64549);
        }

        C54830g() {
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
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.a.a$i */
    public static final /* synthetic */ class C54832i extends C89217j implements AbstractC89183m<String, Map<String, String>, C89391z> {

        /* renamed from: a */
        public static final C54832i f125602a = new C54832i();

        static {
            Covode.recordClassIndex(64551);
        }

        C54832i() {
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
    public static /* synthetic */ void m100424a(int i, int i2) {
        C54832i iVar = C54832i.f125602a;
        C89219l.m154721d(iVar, "");
        C0484a aVar = new C0484a();
        if (i2 < 0) {
            aVar.put("total_chat_cnt", String.valueOf(i));
        } else {
            aVar.put("total_chat_cnt", String.valueOf(i));
            aVar.put("show_chat_cnt", String.valueOf(i2));
        }
        iVar.invoke("show_chat_list", aVar);
    }

    /* renamed from: b */
    public static /* synthetic */ void m100427b(String str, int i) {
        String str2;
        C54825b bVar = C54825b.f125591a;
        C89219l.m154721d(bVar, "");
        C0484a aVar = new C0484a();
        if (i == 1) {
            str2 = "message_box";
        } else {
            str2 = "message";
        }
        aVar.put("enter_from", str2);
        aVar.put("target", str);
        aVar.put("chat_type", C55058a.m100682a(i));
        bVar.invoke("chat_list_delete_confirm", aVar);
    }

    /* renamed from: a */
    public static /* synthetic */ void m100425a(String str, int i) {
        String str2;
        C54826c cVar = C54826c.f125592a;
        C89219l.m154721d(cVar, "");
        C0484a aVar = new C0484a();
        if (i == 1) {
            str2 = "message_box";
        } else {
            str2 = "message";
        }
        aVar.put("enter_from", str2);
        aVar.put("target", str);
        aVar.put("chat_type", C55058a.m100682a(i));
        cVar.invoke("chat_list_feedback", aVar);
    }

    /* renamed from: a */
    public static /* synthetic */ void m100426a(String str, int i, String str2, String str3) {
        C54824a aVar = C54824a.f125590a;
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(aVar, "");
        C0484a aVar2 = new C0484a();
        aVar2.put("enter_from", str);
        aVar2.put("num", String.valueOf(i));
        aVar2.put("enter_method", str2);
        aVar2.put("notice_type", str3);
        aVar.invoke("enter_chat_list", aVar2);
        C55059b.m100694b("enter_from", str);
        C55059b.m100694b("enter_method", str2);
    }
}
