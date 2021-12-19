package com.p2082ss.android.ugc.aweme.p2929fe.method;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.livesdkapi.depend.p680d.p682b.AbstractC11635b;
import com.bytedance.android.livesdkapi.depend.p680d.p682b.C11637d;
import com.bytedance.android.livesdkapi.p701n.C11840a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.C18288a;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.live.ILiveOuterService;
import com.p2082ss.android.ugc.aweme.live.LiveOuterService;
import com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.fe.method.OpenRechargePanel */
public final class OpenRechargePanel extends BaseCommonJavaMethod implements AbstractC33974au {
    static {
        Covode.recordClassIndex(56538);
    }

    private OpenRechargePanel(byte b) {
        this();
    }

    @Override // androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    private /* synthetic */ OpenRechargePanel() {
        this((C18288a) null);
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.OpenRechargePanel$a */
    public static final class C47870a implements C11840a.AbstractC11842b {

        /* renamed from: a */
        final /* synthetic */ OpenRechargePanel f110882a;

        static {
            Covode.recordClassIndex(56539);
        }

        @Override // com.bytedance.android.livesdkapi.p701n.C11840a.AbstractC11842b
        /* renamed from: a */
        public final void mo18915a() {
            OpenRechargePanel openRechargePanel = this.f110882a;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", 1);
            openRechargePanel.sendEvent("coinsRechargeStatus", jSONObject, 3);
        }

        @Override // com.bytedance.android.livesdkapi.p701n.C11840a.AbstractC11842b
        /* renamed from: b */
        public final void mo18916b() {
            OpenRechargePanel openRechargePanel = this.f110882a;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", 0);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("error_code", 10001);
            jSONObject.put("args", jSONObject2);
            openRechargePanel.sendEvent("coinsRechargeStatus", jSONObject, 3);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C47870a(OpenRechargePanel openRechargePanel) {
            this.f110882a = openRechargePanel;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.OpenRechargePanel$b */
    public static final class C47871b implements AbstractC11635b {

        /* renamed from: a */
        final /* synthetic */ OpenRechargePanel f110883a;

        static {
            Covode.recordClassIndex(56540);
        }

        @Override // com.bytedance.android.livesdkapi.depend.p680d.p682b.AbstractC11635b
        /* renamed from: a */
        public final void mo18418a(int i, int i2, String str) {
            C89219l.m154721d(str, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C47871b(OpenRechargePanel openRechargePanel) {
            this.f110883a = openRechargePanel;
        }

        @Override // com.bytedance.android.livesdkapi.depend.p680d.p682b.AbstractC11635b
        /* renamed from: a */
        public final void mo18419a(long j) {
            OpenRechargePanel openRechargePanel = this.f110883a;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", 1);
            openRechargePanel.sendEvent("coinsRechargeStatus", jSONObject, 3);
        }

        @Override // com.bytedance.android.livesdkapi.depend.p680d.p682b.AbstractC11635b
        /* renamed from: a */
        public final void mo18420a(Exception exc, String str) {
            C89219l.m154721d(exc, "");
            C89219l.m154721d(str, "");
            OpenRechargePanel openRechargePanel = this.f110883a;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", 0);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("error_code", 10001);
            jSONObject.put("args", jSONObject2);
            openRechargePanel.sendEvent("coinsRechargeStatus", jSONObject, 3);
        }
    }

    public OpenRechargePanel(C18288a aVar) {
        super(aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.AbstractC47813a aVar) {
        long j;
        String str;
        JSONObject jSONObject2;
        Bundle bundle = new Bundle();
        int i = 0;
        if (jSONObject != null) {
            i = jSONObject.optInt("key_bundle_charge_source", 0);
        }
        long j2 = 0;
        if (jSONObject != null) {
            j = jSONObject.optLong("diamond_count", 0);
            j2 = jSONObject.optLong("total_diamond_acount_needed", 0);
        } else {
            j = 0;
        }
        if (jSONObject != null) {
            str = jSONObject.optString("charge_reason");
            jSONObject2 = jSONObject.optJSONObject("track_info");
        } else {
            str = null;
            jSONObject2 = null;
        }
        bundle.putInt("key_bundle_charge_source", i);
        bundle.putLong("key_bundle_need_coins", j);
        bundle.putString("KEY_CHARGE_REASON", str);
        bundle.putLong("key_bundle_total_coins", j2);
        if (i == 5 || this.mContextRef == null) {
            AbstractC81915c.m141874a(new C11840a(new C47870a(this), bundle, C11840a.C11841a.m20842a(jSONObject2)));
        } else {
            Context context = (Context) this.mContextRef.get();
            if (context instanceof ActivityC0945e) {
                C11637d dVar = new C11637d();
                dVar.mo18421a(C11840a.C11841a.m20842a(jSONObject2));
                ILiveOuterService s = LiveOuterService.m107269s();
                C89219l.m154716b(s, "");
                ActivityC0945e eVar = (ActivityC0945e) context;
                s.mo95830d().mo12973a(eVar, new C47871b(this), bundle, dVar).showNow(eVar.getSupportFragmentManager(), getClass().getSimpleName());
            } else {
                return;
            }
        }
        if (aVar != null) {
            aVar.mo79886a((Object) null);
        }
    }
}
