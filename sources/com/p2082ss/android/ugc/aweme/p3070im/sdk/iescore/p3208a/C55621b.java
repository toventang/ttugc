package com.p2082ss.android.ugc.aweme.p3070im.sdk.iescore.p3208a;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.C17419b;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17427b;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17429c;
import com.bytedance.ies.p1208im.core.api.p1216f.C17455a;
import com.bytedance.ies.p1208im.core.api.p1216f.C17457c;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.bytedance.p1399im.core.proto.MessageBody;
import com.p2082ss.android.ugc.aweme.emoji.systembigemoji.C46616a;
import com.p2082ss.android.ugc.aweme.lego.p3392b.C58166a;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.EmojiContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.SayHelloContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.SystemContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3170a.C55050c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55099j;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55102l;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3177h.p3178a.C55127a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3177h.p3178a.C55133d;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3177h.p3178a.C55134e;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55197c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55214j;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55231t;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55235x;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.notification.p3211a.C55654e;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3252c.C56201b;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3252c.C56206g;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import java.util.Map;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.iescore.a.b */
public final class C55621b implements AbstractC17429c {

    /* renamed from: a */
    public static final C55621b f126875a = new C55621b();

    /* renamed from: b */
    private static final AbstractC89244h f126876b = C89250i.m154773a((AbstractC89171a) C55622a.f126877a);

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17429c
    /* renamed from: a */
    public final C17455a mo27803a() {
        return (C17455a) f126876b.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.iescore.a.b$c */
    static final class RunnableC55624c implements Runnable {

        /* renamed from: a */
        public static final RunnableC55624c f126879a = new RunnableC55624c();

        static {
            Covode.recordClassIndex(65405);
        }

        RunnableC55624c() {
        }

        public final void run() {
            C55621b.m101321e();
        }
    }

    private C55621b() {
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.iescore.a.b$b */
    static final class RunnableC55623b implements Runnable {

        /* renamed from: a */
        public static final RunnableC55623b f126878a = new RunnableC55623b();

        static {
            Covode.recordClassIndex(65404);
        }

        RunnableC55623b() {
        }

        public final void run() {
            C55621b.f126875a.mo92533d();
        }
    }

    static {
        Covode.recordClassIndex(65402);
    }

    /* renamed from: f */
    private static int[] m101322f() {
        if (C56201b.m102110a()) {
            return new int[]{0, 1};
        }
        return new int[]{0};
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17429c
    /* renamed from: b */
    public final void mo27809b() {
        if (C56206g.m102125b()) {
            C40780g.m82248e().execute(RunnableC55623b.f126878a);
        } else {
            mo92533d();
        }
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17429c
    /* renamed from: c */
    public final void mo27811c() {
        if (C56206g.m102125b()) {
            C40780g.m82248e().execute(RunnableC55624c.f126879a);
        } else {
            m101321e();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.iescore.a.b$a */
    static final class C55622a extends AbstractC89220m implements AbstractC89171a<C17455a> {

        /* renamed from: a */
        public static final C55622a f126877a = new C55622a();

        static {
            Covode.recordClassIndex(65403);
        }

        C55622a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C17455a invoke() {
            C17455a aVar = new C17455a();
            aVar.mo27862a(new int[]{0, 1});
            aVar.mo27863b(new int[]{0, 1});
            aVar.f41793c = 100;
            aVar.f41799i = ((Boolean) C58166a.f132447g.getValue()).booleanValue();
            return aVar;
        }
    }

    /* renamed from: e */
    public static void m101321e() {
        C56244a.m102191c("ClientBridgeImpl", "onSDKLogout: " + C55197c.m100917a() + ", " + C55197c.m100919b());
        C55102l.C55104a.m100801a().mo92016e();
        C55099j.m100779b();
        C55654e.f126932b.mo92550g();
    }

    /* renamed from: d */
    public final void mo92533d() {
        int[] f = m101322f();
        mo27803a().mo27862a(f);
        mo27803a().mo27863b(f);
        C17419b.m32261a().mo27890a(f);
        C17419b.m32261a().mo27894b(f);
        C56244a.m102191c("ClientBridgeImpl", "onSDKLogin: " + C55197c.m100919b());
        C55099j.m100778a();
        C55102l.C55104a.m100801a().mo92014c();
        C55654e.f126932b.mo92548e();
        if (C55050c.m100668a()) {
            C46616a.m89980a(true);
        }
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17429c
    /* renamed from: a */
    public final int mo27802a(C17457c cVar) {
        C89219l.m154721d(cVar, "");
        return C55231t.m100994a(cVar);
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17429c
    /* renamed from: a */
    public final void mo27806a(C19538ai aiVar) {
        C89219l.m154721d(aiVar, "");
        Map<String, String> localExt = aiVar.getLocalExt();
        C89219l.m154716b(localExt, "");
        localExt.put("send_sdk_time", String.valueOf(SystemClock.uptimeMillis()));
        if (C55197c.m100919b().equals(String.valueOf(AbstractC17427b.C17428a.m32311c(aiVar.getConversationId())))) {
            aiVar.setMsgStatus(2);
        }
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17429c
    /* renamed from: a */
    public final MessageBody mo27804a(MessageBody messageBody) {
        long j;
        C89219l.m154721d(messageBody, "");
        Integer num = messageBody.message_type;
        if (num != null && num.intValue() == 1) {
            try {
                if (!TextUtils.isEmpty(messageBody.content)) {
                    long h = C17867d.m33087h();
                    SystemContent systemContent = (SystemContent) C55214j.m100957a(messageBody.content, SystemContent.class);
                    long minVersion = systemContent.getMinVersion();
                    if (systemContent.getMaxVersion() == 0) {
                        j = h;
                    } else {
                        j = systemContent.getMaxVersion();
                    }
                    if (minVersion <= h) {
                        if (j > h) {
                            C56244a.m102191c("DmHelper", "filter system message:".concat(String.valueOf(systemContent)));
                            return null;
                        }
                    }
                }
            } catch (Exception unused) {
                return messageBody;
            }
        }
        Integer num2 = messageBody.message_type;
        if (num2 != null && num2.intValue() == 1002) {
            try {
                if (!TextUtils.isEmpty(messageBody.content) && ((SayHelloContent) C55214j.m100957a(messageBody.content, SayHelloContent.class)).getType() == 100200) {
                    return null;
                }
            } catch (Exception unused2) {
            }
        }
        return messageBody;
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17429c
    /* renamed from: a */
    public final void mo27808a(AbstractC89172b<? super AbstractC17429c, C89391z> bVar) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(bVar, "");
        new Handler(Looper.getMainLooper()).post(new AbstractC17429c.C17430a.RunnableC17431a(bVar));
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17429c
    /* renamed from: b */
    public final void mo27810b(int i, int i2) {
        C56244a.m102190b("ClientBridgeImpl", "onPullMsg inbox=" + i + " reason=" + i2);
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17429c
    /* renamed from: a */
    public final void mo27805a(int i, int i2) {
        C56244a.m102190b("ClientBridgeImpl", "onSDKInitState inbox=" + i + " result=" + i2);
        if (i2 == 0) {
            boolean unused = C55127a.f126154a.mo92038a(new C55134e(i), false);
        } else if (i2 == 1) {
            C55127a.f126154a.mo92037a(new C55134e(i), new C55133d(false));
        } else if (i2 == 2) {
            C55127a.f126154a.mo92037a(new C55134e(i), new C55133d(true));
        }
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17429c
    /* renamed from: a */
    public final void mo27807a(C19638h hVar, C19538ai aiVar, C17457c cVar) {
        C17457c cVar2;
        C89219l.m154721d(hVar, "");
        C89219l.m154721d(aiVar, "");
        C89219l.m154721d(cVar, "");
        String str = null;
        if (!(cVar instanceof BaseContent)) {
            cVar2 = null;
        } else {
            cVar2 = cVar;
        }
        BaseContent baseContent = (BaseContent) cVar2;
        if (baseContent != null) {
            if (aiVar.getMsgType() == 5 && (baseContent instanceof EmojiContent) && baseContent.getType() == 504 && !((EmojiContent) baseContent).isUpdateConversationTime()) {
                aiVar.addLocalExt("awe:create_time", String.valueOf(System.currentTimeMillis()));
                aiVar.setCreatedAt(hVar.getUpdatedTime() + 1);
            }
            Long sendStartTime = baseContent.getSendStartTime();
            if (sendStartTime != null) {
                str = String.valueOf(sendStartTime.longValue());
            }
            aiVar.addLocalExt("send_time", str);
        }
        String valueOf = String.valueOf(cVar.hashCode());
        String a = C55235x.m101007a(valueOf, "process_id");
        if (!TextUtils.isEmpty(a)) {
            aiVar.addLocalExt("process_id", a);
        }
        String a2 = C55235x.m101007a(valueOf, "enter_from");
        if (!TextUtils.isEmpty(a2)) {
            aiVar.addLocalExt("enter_from", a2);
        }
        String a3 = C55235x.m101007a(valueOf, "message_type");
        if (!TextUtils.isEmpty(a3)) {
            aiVar.addLocalExt("message_type", a3);
        }
        String a4 = C55235x.m101007a(valueOf, "enter_method");
        if (!TextUtils.isEmpty(a4)) {
            aiVar.addLocalExt("enter_method", a4);
        }
        String a5 = C55235x.m101007a(valueOf, "is_share_pop_up");
        if (a5 != null && a5.length() != 0) {
            aiVar.addLocalExt("is_share_pop_up", a5);
        }
    }
}
