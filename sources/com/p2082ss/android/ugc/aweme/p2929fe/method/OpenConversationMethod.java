package com.p2082ss.android.ugc.aweme.p2929fe.method;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.C18288a;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.challenge.p2454ui.p2455a.C35570b;
import com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3251b.C56197d;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89206ad;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.fe.method.OpenConversationMethod */
public final class OpenConversationMethod extends BaseCommonJavaMethod implements AbstractC33974au, AbstractC90252i, AbstractC90253j {

    /* renamed from: a */
    public static final C47865a f110870a = new C47865a((byte) 0);

    /* renamed from: b */
    private HashMap<String, BaseCommonJavaMethod.AbstractC47813a> f110871b;

    static {
        Covode.recordClassIndex(56530);
    }

    private OpenConversationMethod(byte b) {
        this();
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(391, new RunnableC90250g(OpenConversationMethod.class, "onSelectedChatMsg", C56197d.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.OpenConversationMethod$a */
    public static final class C47865a {
        static {
            Covode.recordClassIndex(56531);
        }

        private C47865a() {
        }

        public /* synthetic */ C47865a(byte b) {
            this();
        }
    }

    private /* synthetic */ OpenConversationMethod() {
        this((C18288a) null);
    }

    public OpenConversationMethod(C18288a aVar) {
        super(aVar);
        this.f110871b = new HashMap<>();
    }

    @AbstractC90264r
    public final void onSelectedChatMsg(C56197d dVar) {
        C89219l.m154721d(dVar, "");
        String str = dVar.f128194b;
        if (C35570b.m72676a(str)) {
            HashMap<String, BaseCommonJavaMethod.AbstractC47813a> hashMap = this.f110871b;
            Objects.requireNonNull(hashMap, "null cannot be cast to non-null type kotlin.collections.Map<K, *>");
            if (hashMap.containsKey(str)) {
                HashMap<String, BaseCommonJavaMethod.AbstractC47813a> hashMap2 = this.f110871b;
                Objects.requireNonNull(hashMap2, "null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
                BaseCommonJavaMethod.AbstractC47813a aVar = (BaseCommonJavaMethod.AbstractC47813a) C89206ad.m154686h(hashMap2).remove(str);
                if (aVar != null) {
                    if (C35570b.m72676a(dVar.f128193a)) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.putOpt("msgList", dVar.f128193a);
                        aVar.mo79887a(jSONObject, 1, "");
                    } else {
                        aVar.mo79885a(0, "");
                    }
                }
            }
        }
        HashMap<String, BaseCommonJavaMethod.AbstractC47813a> hashMap3 = this.f110871b;
        if (hashMap3 == null || hashMap3.isEmpty()) {
            EventBus.m156962a().mo145395b(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a8, code lost:
        if (r1 != null) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ac, code lost:
        if (r1 != null) goto L_0x003c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0095  */
    @Override // com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handle(org.json.JSONObject r10, com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod.AbstractC47813a r11) {
        /*
        // Method dump skipped, instructions count: 177
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p2929fe.method.OpenConversationMethod.handle(org.json.JSONObject, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod$a):void");
    }
}
