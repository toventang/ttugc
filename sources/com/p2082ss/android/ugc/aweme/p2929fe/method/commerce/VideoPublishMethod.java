package com.p2082ss.android.ugc.aweme.p2929fe.method.commerce;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.C18288a;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.challenge.p2454ui.p2455a.C35570b;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod;
import com.p2082ss.android.ugc.aweme.services.AsyncAVService;
import com.p2082ss.android.ugc.aweme.services.IExternalService;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.EditConfig;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.VideoMedia;
import com.p2082ss.android.ugc.aweme.utils.C80313cs;
import java.util.UUID;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.fe.method.commerce.VideoPublishMethod */
public final class VideoPublishMethod extends BaseCommonJavaMethod implements AbstractC33974au {

    /* renamed from: a */
    public static final C47933a f111012a = new C47933a((byte) 0);

    static {
        Covode.recordClassIndex(56639);
    }

    private VideoPublishMethod(byte b) {
        this();
    }

    @Override // androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.commerce.VideoPublishMethod$a */
    public static final class C47933a {
        static {
            Covode.recordClassIndex(56640);
        }

        private C47933a() {
        }

        public /* synthetic */ C47933a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.commerce.VideoPublishMethod$b */
    public static final class C47934b implements IExternalService.ServiceLoadCallback {

        /* renamed from: a */
        final /* synthetic */ String f111013a;

        /* renamed from: b */
        final /* synthetic */ VideoPublishMethod f111014b;

        /* renamed from: c */
        final /* synthetic */ JSONObject f111015c;

        /* renamed from: d */
        final /* synthetic */ JSONObject f111016d;

        static {
            Covode.recordClassIndex(56641);
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
            EditConfig.Builder builder = new EditConfig.Builder();
            VideoMedia videoMedia = new VideoMedia(this.f111013a);
            Bundle bundle = new Bundle();
            bundle.putString("cc_vid", this.f111015c.optString("vid"));
            bundle.putBoolean("edit_publish_session_end_together", true);
            videoMedia.setExtraBundle(bundle);
            EditConfig.Builder creationId = builder.mediaInfo(videoMedia).creationId(UUID.randomUUID().toString());
            String optString = this.f111015c.optString("vid");
            C89219l.m154716b(optString, "");
            asyncAVService.uiService().editService().startEdit(this.f111014b.getActContext(), creationId.ccvid(optString).shootWay("enterprise_service_center").build());
            this.f111016d.put("code", 1);
        }

        C47934b(String str, VideoPublishMethod videoPublishMethod, JSONObject jSONObject, JSONObject jSONObject2) {
            this.f111013a = str;
            this.f111014b = videoPublishMethod;
            this.f111015c = jSONObject;
            this.f111016d = jSONObject2;
        }
    }

    private /* synthetic */ VideoPublishMethod() {
        this((C18288a) null);
    }

    public VideoPublishMethod(C18288a aVar) {
        super(aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.AbstractC47813a aVar) {
        String optString;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("code", -1);
        if (!(jSONObject == null || (optString = jSONObject.optString("path")) == null)) {
            boolean a = C35570b.m72676a(optString);
            if (!a) {
                jSONObject2.put("reason", "path should not be empty");
            } else if (a) {
                if (!C80313cs.m139231a(optString)) {
                    jSONObject2.put("reason", "filePath doesn't exists");
                } else {
                    AVExternalServiceImpl.m113114a().asyncService("enterprise_service_center", new C47934b(optString, this, jSONObject, jSONObject2));
                }
            }
        }
        if (aVar != null) {
            aVar.mo79888a(jSONObject2);
        }
    }
}
