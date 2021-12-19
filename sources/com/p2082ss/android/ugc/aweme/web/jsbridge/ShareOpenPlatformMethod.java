package com.p2082ss.android.ugc.aweme.web.jsbridge;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1184ui.common.p1188d.C17040e;
import com.bytedance.ies.web.p1285a.C18288a;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.IAccountService;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.api.AnchorAutoSelectionService;
import com.p2082ss.android.ugc.aweme.api.C33531a;
import com.p2082ss.android.ugc.aweme.api.C33537f;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.common.C39053a;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.HomeTabViewModel;
import com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.bottom.p3057a.C53318b;
import com.p2082ss.android.ugc.aweme.metrics.C59213ah;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod;
import com.p2082ss.android.ugc.aweme.p4071t.C77717b;
import com.p2082ss.android.ugc.aweme.services.AsyncAVService;
import com.p2082ss.android.ugc.aweme.services.IExternalService;
import com.p2082ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.IRecordService;
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

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.ShareOpenPlatformMethod */
public final class ShareOpenPlatformMethod extends BaseCommonJavaMethod implements AbstractC33974au {

    /* renamed from: e */
    public static final C81566a f182389e = new C81566a((byte) 0);

    /* renamed from: a */
    public String f182390a;

    /* renamed from: b */
    public String f182391b;

    /* renamed from: d */
    public String f182392d;

    static {
        Covode.recordClassIndex(94960);
    }

    private ShareOpenPlatformMethod(byte b) {
        this();
    }

    @Override // androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.web.jsbridge.ShareOpenPlatformMethod$a */
    public static final class C81566a {
        static {
            Covode.recordClassIndex(94961);
        }

        private C81566a() {
        }

        public /* synthetic */ C81566a(byte b) {
            this();
        }
    }

    private /* synthetic */ ShareOpenPlatformMethod() {
        this((C18288a) null);
    }

    public ShareOpenPlatformMethod(C18288a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public final void mo125265a(JSONObject jSONObject) {
        List<String> list;
        int i;
        Integer height;
        Integer width;
        String str = null;
        if (jSONObject != null) {
            Integer valueOf = Integer.valueOf(jSONObject.getInt("action_type"));
            String string = jSONObject.getString("anchor_source_type");
            String string2 = jSONObject.getString("extra");
            if (valueOf != null) {
                boolean z = true;
                if (valueOf.intValue() == 1 && C80537hk.m139613a(string)) {
                    C1731i<C33531a> a = AnchorAutoSelectionService.C33529a.m68692a(this.f182392d, string2, string, 4);
                    a.mo5547f();
                    C33531a d = a.mo5545d();
                    if (d.f79638a == 0) {
                        CreateAnchorInfo createAnchorInfo = d.f79640c;
                        UrlModel urlModel = new UrlModel();
                        C33537f fVar = d.f79642e;
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
                        int i2 = 0;
                        if (fVar3 == null || (width = fVar3.getWidth()) == null) {
                            i = 0;
                        } else {
                            i = width.intValue();
                        }
                        urlModel.setWidth(i);
                        C33537f fVar4 = d.f79642e;
                        if (!(fVar4 == null || (height = fVar4.getHeight()) == null)) {
                            i2 = height.intValue();
                        }
                        urlModel.setHeight(i2);
                        long currentTimeMillis = System.currentTimeMillis();
                        C80492gf.m139513a();
                        C89233z.C89238e eVar = new C89233z.C89238e();
                        eVar.element = (T) new RecordConfig.Builder().creationId(UUID.randomUUID().toString()).shootWay("direct_shoot").groupId(C59213ah.f134853b).fromMain(true).startRecordTime(currentTimeMillis).musicType(1).translationType(C68088c.m120390a()).enterFrom(this.f182390a).enterMethod(this.f182391b);
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
                            eVar.element = (T) t.setAutoSelectedAnchor(new C39053a(type, content, keyword, null, 4, null, urlModel, z, url, null, null, extra, null, 5672, null)).setOpenPlatformExtra(string2).setOpenPlatformClientKey(this.f182392d);
                        }
                        IExternalService a2 = AVExternalServiceImpl.m113114a();
                        Context actContext = getActContext();
                        C89219l.m154716b(actContext, "");
                        a2.asyncServiceForMainRecordService(actContext, "direct_shoot", new C81568c(this, eVar));
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.web.jsbridge.ShareOpenPlatformMethod$b */
    public static final class C81567b implements IAccountService.AbstractC31277g {

        /* renamed from: a */
        final /* synthetic */ ShareOpenPlatformMethod f182393a;

        /* renamed from: b */
        final /* synthetic */ JSONObject f182394b;

        static {
            Covode.recordClassIndex(94962);
        }

        C81567b(ShareOpenPlatformMethod shareOpenPlatformMethod, JSONObject jSONObject) {
            this.f182393a = shareOpenPlatformMethod;
            this.f182394b = jSONObject;
        }

        @Override // com.p2082ss.android.ugc.aweme.IAccountService.AbstractC31277g
        public final void onResult(int i, int i2, Object obj) {
            if (i == 1 && i2 == 1) {
                this.f182393a.mo125265a(this.f182394b);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.web.jsbridge.ShareOpenPlatformMethod$c */
    public static final class C81568c extends SimpleServiceLoadCallback {

        /* renamed from: a */
        final /* synthetic */ ShareOpenPlatformMethod f182395a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89238e f182396b;

        static {
            Covode.recordClassIndex(94963);
        }

        C81568c(ShareOpenPlatformMethod shareOpenPlatformMethod, C89233z.C89238e eVar) {
            this.f182395a = shareOpenPlatformMethod;
            this.f182396b = eVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onLoad(AsyncAVService asyncAVService, long j) {
            C53318b bVar;
            C89219l.m154721d(asyncAVService, "");
            ActivityC0945e a = C11279p.m20001a(this.f182395a.getActContext());
            Activity activity = null;
            if (a == null || (bVar = (C53318b) HomeTabViewModel.C53309a.m98315a(a).mo89735a("PUBLISH")) == null || !bVar.mo89776k()) {
                IRecordService recordService = asyncAVService.uiService().recordService();
                Context actContext = this.f182395a.getActContext();
                C89219l.m154716b(actContext, "");
                recordService.startRecord(actContext, this.f182396b.element.build());
            } else {
                IRecordService recordService2 = asyncAVService.uiService().recordService();
                Context actContext2 = this.f182395a.getActContext();
                C89219l.m154716b(actContext2, "");
                recordService2.startSpecialPlusEntrance(actContext2, this.f182396b.element.build());
                bVar.mo89775j();
            }
            Context actContext3 = this.f182395a.getActContext();
            C89219l.m154716b(actContext3, "");
            while (true) {
                if (actContext3 != null) {
                    if (!(actContext3 instanceof Activity)) {
                        if (!(actContext3 instanceof ContextWrapper)) {
                            break;
                        }
                        actContext3 = ((ContextWrapper) actContext3).getBaseContext();
                    } else {
                        activity = (Activity) actContext3;
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

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.AbstractC47813a aVar) {
        String str;
        String str2;
        String str3 = null;
        if (jSONObject != null) {
            try {
                str2 = jSONObject.getString("client_key");
            } catch (JSONException unused) {
            }
        } else {
            str2 = null;
        }
        this.f182392d = str2;
        if (jSONObject != null) {
            try {
                str = jSONObject.getString("enter_from");
            } catch (JSONException unused2) {
            }
        } else {
            str = null;
        }
        this.f182390a = str;
        if (jSONObject != null) {
            str3 = jSONObject.getString("enter_method");
        }
        this.f182391b = str3;
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        if (!g.isLogin()) {
            Activity a = C17040e.m31504a(getActContext());
            if (a != null) {
                IAccountService.C31274d dVar = new IAccountService.C31274d();
                dVar.f74960a = a;
                dVar.f74961b = this.f182390a;
                dVar.f74962c = this.f182391b;
                dVar.f74964e = new C81567b(this, jSONObject);
                C31575b.m65860b().showLoginAndRegisterView(dVar.mo57084a());
                return;
            }
            return;
        }
        mo125265a(jSONObject);
    }
}
