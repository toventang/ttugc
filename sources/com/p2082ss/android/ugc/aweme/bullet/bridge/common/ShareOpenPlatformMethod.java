package com.p2082ss.android.ugc.aweme.bullet.bridge.common;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.bullet.p1184ui.common.p1188d.C17040e;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.IAccountService;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.api.AnchorAutoSelectionService;
import com.p2082ss.android.ugc.aweme.api.C33531a;
import com.p2082ss.android.ugc.aweme.api.C33537f;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p2082ss.android.ugc.aweme.common.C39053a;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.HomeTabViewModel;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.bottom.p3057a.C53318b;
import com.p2082ss.android.ugc.aweme.metrics.C59213ah;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.p4071t.C77717b;
import com.p2082ss.android.ugc.aweme.services.AsyncAVService;
import com.p2082ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.RecordConfig;
import com.p2082ss.android.ugc.aweme.setting.p3721i.C68088c;
import com.p2082ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import com.p2082ss.android.ugc.aweme.turbo.api.C79340b;
import com.p2082ss.android.ugc.aweme.utils.C80492gf;
import com.p2082ss.android.ugc.aweme.utils.C80537hk;
import java.util.List;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.ShareOpenPlatformMethod */
public final class ShareOpenPlatformMethod extends BaseBridgeMethod implements AbstractC33974au {

    /* renamed from: e */
    public static final C35047a f82669e = new C35047a((byte) 0);

    /* renamed from: b */
    public String f82670b;

    /* renamed from: c */
    public String f82671c;

    /* renamed from: d */
    public String f82672d;

    static {
        Covode.recordClassIndex(42155);
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return "shareOpenPlatform";
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.ShareOpenPlatformMethod$a */
    public static final class C35047a {
        static {
            Covode.recordClassIndex(42156);
        }

        private C35047a() {
        }

        public /* synthetic */ C35047a(byte b) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShareOpenPlatformMethod(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    /* renamed from: b */
    public final void mo61893b(JSONObject jSONObject) {
        List<String> list;
        int i;
        Integer height;
        Integer width;
        int i2 = jSONObject.getInt("action_type");
        String string = jSONObject.getString("anchor_source_type");
        String string2 = jSONObject.getString("extra");
        boolean z = true;
        if (i2 == 1 && C80537hk.m139613a(string)) {
            C1731i<C33531a> a = AnchorAutoSelectionService.C33529a.m68692a(this.f82672d, string2, string, 4);
            a.mo5547f();
            C33531a d = a.mo5545d();
            if (d.f79638a == 0) {
                CreateAnchorInfo createAnchorInfo = d.f79640c;
                UrlModel urlModel = new UrlModel();
                C33537f fVar = d.f79642e;
                String str = null;
                if (fVar != null) {
                    list = fVar.getUrlList();
                } else {
                    list = null;
                }
                urlModel.setUrlList(list);
                C33537f fVar2 = d.f79642e;
                if (fVar2 != null) {
                    str = fVar2.getUri();
                }
                urlModel.setUri(str);
                C33537f fVar3 = d.f79642e;
                int i3 = 0;
                if (fVar3 == null || (width = fVar3.getWidth()) == null) {
                    i = 0;
                } else {
                    i = width.intValue();
                }
                urlModel.setWidth(i);
                C33537f fVar4 = d.f79642e;
                if (!(fVar4 == null || (height = fVar4.getHeight()) == null)) {
                    i3 = height.intValue();
                }
                urlModel.setHeight(i3);
                long currentTimeMillis = System.currentTimeMillis();
                C80492gf.m139513a();
                C89233z.C89238e eVar = new C89233z.C89238e();
                eVar.element = (T) new RecordConfig.Builder().creationId(UUID.randomUUID().toString()).shootWay("direct_shoot").groupId(C59213ah.f134853b).fromMain(true).startRecordTime(currentTimeMillis).musicType(1).translationType(C68088c.m120390a()).enterFrom(this.f82670b).enterMethod(this.f82671c);
                if (createAnchorInfo != null) {
                    T t = eVar.element;
                    int type = createAnchorInfo.getType();
                    String content = createAnchorInfo.getContent();
                    String keyword = createAnchorInfo.getKeyword();
                    String url = createAnchorInfo.getUrl();
                    String extra = createAnchorInfo.getExtra();
                    Boolean bool = d.f79641d;
                    if (bool != null) {
                        z = bool.booleanValue();
                    }
                    eVar.element = (T) t.setAutoSelectedAnchor(new C39053a(type, content, keyword, null, 4, null, urlModel, z, url, null, null, extra, null, 5672, null)).setOpenPlatformExtra(string2).setOpenPlatformClientKey(this.f82672d);
                }
                Context e = mo26893e();
                if (e != null) {
                    AVExternalServiceImpl.m113114a().asyncServiceForMainRecordService(e, "direct_shoot", new C35049c(e, eVar));
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.ShareOpenPlatformMethod$b */
    public static final class C35048b implements IAccountService.AbstractC31277g {

        /* renamed from: a */
        final /* synthetic */ ShareOpenPlatformMethod f82673a;

        /* renamed from: b */
        final /* synthetic */ JSONObject f82674b;

        static {
            Covode.recordClassIndex(42157);
        }

        C35048b(ShareOpenPlatformMethod shareOpenPlatformMethod, JSONObject jSONObject) {
            this.f82673a = shareOpenPlatformMethod;
            this.f82674b = jSONObject;
        }

        @Override // com.p2082ss.android.ugc.aweme.IAccountService.AbstractC31277g
        public final void onResult(int i, int i2, Object obj) {
            if (i == 1 && i2 == 1) {
                this.f82673a.mo61893b(this.f82674b);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.ShareOpenPlatformMethod$c */
    public static final class C35049c extends SimpleServiceLoadCallback {

        /* renamed from: a */
        final /* synthetic */ Context f82675a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89238e f82676b;

        static {
            Covode.recordClassIndex(42158);
        }

        C35049c(Context context, C89233z.C89238e eVar) {
            this.f82675a = context;
            this.f82676b = eVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onLoad(AsyncAVService asyncAVService, long j) {
            C53318b bVar;
            C89219l.m154721d(asyncAVService, "");
            ActivityC0945e a = C11279p.m20001a(this.f82675a);
            Activity activity = null;
            if (a == null || (bVar = (C53318b) HomeTabViewModel.C53309a.m98315a(a).mo89735a("PUBLISH")) == null || !bVar.mo89776k()) {
                asyncAVService.uiService().recordService().startRecord(this.f82675a, this.f82676b.element.build());
            } else {
                asyncAVService.uiService().recordService().startSpecialPlusEntrance(this.f82675a, this.f82676b.element.build());
                bVar.mo89775j();
            }
            Context context = this.f82675a;
            while (true) {
                if (context != null) {
                    if (!(context instanceof Activity)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        }
                        context = ((ContextWrapper) context).getBaseContext();
                    } else {
                        activity = (Activity) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            C77717b.m135747a(activity, "PUBLISH");
            C79340b.m138147a().openCamera();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    public final void mo61866a(JSONObject jSONObject, BaseBridgeMethod.AbstractC34965a aVar) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aVar, "");
        try {
            this.f82672d = jSONObject.getString("client_key");
        } catch (JSONException unused) {
        }
        try {
            this.f82670b = jSONObject.getString("enter_from");
            this.f82671c = jSONObject.getString("enter_method");
        } catch (JSONException unused2) {
        }
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        if (!g.isLogin()) {
            Activity a = C17040e.m31504a(mo26893e());
            if (a != null) {
                IAccountService.C31274d dVar = new IAccountService.C31274d();
                dVar.f74960a = a;
                dVar.f74961b = this.f82670b;
                dVar.f74962c = this.f82671c;
                dVar.f74964e = new C35048b(this, jSONObject);
                C31575b.m65860b().showLoginAndRegisterView(dVar.mo57084a());
                return;
            }
            return;
        }
        mo61893b(jSONObject);
    }
}
