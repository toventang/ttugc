package com.p2082ss.android.ugc.aweme.discover.p2797ui.search.jsbridge.bullet;

import android.app.Activity;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16183k;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67509az;
import com.p2082ss.android.ugc.aweme.services.AsyncAVService;
import com.p2082ss.android.ugc.aweme.services.IExternalService;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.RecordConfig;
import java.util.UUID;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet.OpenEffectRecordMethod */
public final class OpenEffectRecordMethod extends BaseBridgeMethod implements AbstractC33974au {

    /* renamed from: b */
    public static final C42928b f100094b = new C42928b((byte) 0);

    /* renamed from: c */
    private final String f100095c = "open_effect_record";

    /* renamed from: d */
    private AbstractC16183k.EnumC16184a f100096d = AbstractC16183k.EnumC16184a.PRIVATE;

    static {
        Covode.recordClassIndex(51042);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet.OpenEffectRecordMethod$a */
    public static final class C42927a implements IExternalService.ServiceLoadCallback {

        /* renamed from: a */
        final /* synthetic */ Activity f100097a;

        /* renamed from: b */
        final /* synthetic */ String f100098b;

        /* renamed from: c */
        final /* synthetic */ RecordConfig.Builder f100099c;

        static {
            Covode.recordClassIndex(51043);
        }

        @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onDismiss() {
            IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
        }

        @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onFailed() {
            IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
        }

        @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onOK() {
            IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
        }

        @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onLoad(AsyncAVService asyncAVService, long j) {
            C89219l.m154721d(asyncAVService, "");
            asyncAVService.uiService().recordService().startRecord(this.f100097a, this.f100099c.build());
        }

        C42927a(Activity activity, String str, RecordConfig.Builder builder) {
            this.f100097a = activity;
            this.f100098b = str;
            this.f100099c = builder;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet.OpenEffectRecordMethod$b */
    public static final class C42928b {
        static {
            Covode.recordClassIndex(51044);
        }

        private C42928b() {
        }

        public /* synthetic */ C42928b(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q, com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16164e
    /* renamed from: b */
    public final AbstractC16183k.EnumC16184a mo25723b() {
        return this.f100096d;
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f100095c;
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16164e
    /* renamed from: a */
    public final void mo25722a(AbstractC16183k.EnumC16184a aVar) {
        C89219l.m154721d(aVar, "");
        this.f100096d = aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OpenEffectRecordMethod(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    public final void mo61866a(JSONObject jSONObject, BaseBridgeMethod.AbstractC34965a aVar) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aVar, "");
        if (jSONObject.has("prop_id")) {
            String optString = jSONObject.optString("prop_id");
            try {
                String optString2 = jSONObject.optString("enter_from");
                String optString3 = jSONObject.optString("enter_method");
                String optString4 = jSONObject.optString("shoot_entrance");
                String optString5 = jSONObject.optString("shoot_way");
                String uuid = UUID.randomUUID().toString();
                C89219l.m154716b(uuid, "");
                RecordConfig.Builder enterFrom = new RecordConfig.Builder().sticker(optString).creationId(uuid).enterFrom("search_result");
                Activity j = C17873f.m33102j();
                if (j != null) {
                    IExternalService a = AVExternalServiceImpl.m113114a();
                    C89219l.m154716b(optString4, "");
                    a.asyncService(j, optString4, new C42927a(j, optString4, enterFrom));
                }
                ((C67509az) ((C67509az) new C67509az().mo106460p(optString3)).mo106459o(optString2)).mo106447t(optString5).mo106448u(optString4).mo106446s(optString).mo106445r(uuid).mo96792f();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", 1);
                aVar.mo61874a(jSONObject2);
            } catch (Exception e) {
                aVar.mo61871a(0, e.getMessage());
            }
        }
    }
}
