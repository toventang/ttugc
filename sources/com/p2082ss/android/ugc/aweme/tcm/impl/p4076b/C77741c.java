package com.p2082ss.android.ugc.aweme.tcm.impl.p4076b;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.p1721g.C23144b;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.common.C39053a;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63199ax;
import com.p2082ss.android.ugc.aweme.profile.model.TcmConfig;
import com.p2082ss.android.ugc.aweme.services.publish.AVPublishContentType;
import com.p2082ss.android.ugc.aweme.services.publish.ExtensionMisc;
import com.p2082ss.android.ugc.aweme.services.publish.IAVMentionEditText;
import com.p2082ss.android.ugc.aweme.services.publish.IAVPublishExtension;
import com.p2082ss.android.ugc.aweme.services.publish.PublishOutput;
import com.p2082ss.android.ugc.aweme.shortvideo.model.PublishExtensionModel;
import com.p2082ss.android.ugc.aweme.shortvideo.model.StarAtlasPublishModel;
import com.p2082ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import com.p2082ss.android.ugc.aweme.tcm.api.p4074b.C77731c;
import com.p2082ss.android.ugc.aweme.tcm.impl.p4079d.C77762e;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import org.json.JSONObject;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tcm.impl.b.c */
public final class C77741c implements IAVPublishExtension<StarAtlasPublishModel> {

    /* renamed from: g */
    public static final C77742a f174326g = new C77742a((byte) 0);

    /* renamed from: a */
    public C77751e f174327a;

    /* renamed from: b */
    public IAVMentionEditText f174328b;

    /* renamed from: c */
    public Context f174329c;

    /* renamed from: d */
    public ExtensionMisc f174330d;

    /* renamed from: e */
    public float f174331e = 1.0f;

    /* renamed from: f */
    public final float f174332f = 0.5f;

    /* renamed from: h */
    private Fragment f174333h;

    static {
        Covode.recordClassIndex(90801);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final ViewGroup getAnchorListContent() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final String getName() {
        return "StarAtlasPublishExtension";
    }

    @Override // com.p2082ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // com.p2082ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onDestroy() {
    }

    @Override // com.p2082ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onPublish(PublishOutput publishOutput) {
        C89219l.m154721d(publishOutput, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onSaveInstanceState(Bundle bundle) {
        C89219l.m154721d(bundle, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void setLeftIcon(int i) {
    }

    @Override // com.p2082ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void setRightIcon(C22999a aVar) {
        C89219l.m154721d(aVar, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.tcm.impl.b.c$a */
    public static final class C77742a {
        static {
            Covode.recordClassIndex(90802);
        }

        private C77742a() {
        }

        public /* synthetic */ C77742a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onCreateFinish() {
        IAVPublishExtension.DefaultImpls.onCreateFinish(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onResume() {
        IAVPublishExtension.DefaultImpls.onResume(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final UrlModel getAnchorIconUrl() {
        return IAVPublishExtension.DefaultImpls.getAnchorIconUrl(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final String getAnchorText() {
        return IAVPublishExtension.DefaultImpls.getAnchorText(this);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.p2082ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final /* synthetic */ StarAtlasPublishModel provideExtensionData() {
        return new StarAtlasPublishModel();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onEnterChildrenMode() {
        C77751e eVar = this.f174327a;
        if (eVar == null) {
            C89219l.m154710a("delegate");
        }
        eVar.setVisibility(8);
    }

    /* renamed from: com.ss.android.ugc.aweme.tcm.impl.b.c$c */
    static final class C77744c extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C77741c f174335a;

        /* renamed from: b */
        final /* synthetic */ ExtensionMisc f174336b;

        static {
            Covode.recordClassIndex(90804);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77744c(C77741c cVar, ExtensionMisc extensionMisc) {
            super(0);
            this.f174335a = cVar;
            this.f174336b = extensionMisc;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            IAVMentionEditText iAVMentionEditText;
            C39053a value = this.f174336b.getExtensionDataRepo().getUpdateAnchor().getValue();
            if ((value == null || value.getBusinessType() != 6) && (iAVMentionEditText = this.f174335a.f174328b) != null) {
                iAVMentionEditText.removeStarAtlas();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tcm.impl.b.c$b */
    static final class C77743b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C77741c f174334a;

        static {
            Covode.recordClassIndex(90803);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77743b(C77741c cVar) {
            super(0);
            this.f174334a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0059, code lost:
            if (r4 != null) goto L_0x003f;
         */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ p4600h.C89391z invoke() {
            /*
                r10 = this;
                com.ss.android.ugc.aweme.tcm.impl.b.c r0 = r10.f174334a
                android.content.Context r2 = r0.f174329c
                com.ss.android.ugc.aweme.tcm.impl.b.c r0 = r10.f174334a
                com.ss.android.ugc.aweme.services.publish.IAVMentionEditText r4 = r0.f174328b
                com.ss.android.ugc.aweme.profile.model.TcmConfig r0 = com.p2082ss.android.ugc.aweme.tcm.impl.p4079d.C77762e.m135852a()
                r1 = 0
                if (r0 == 0) goto L_0x005c
                com.ss.android.ugc.aweme.profile.model.BCHashtag r0 = r0.getBcHashtag()
                if (r0 == 0) goto L_0x005c
                java.lang.String r3 = r0.getAd()
            L_0x0019:
                boolean r0 = android.text.TextUtils.isEmpty(r3)
                if (r0 != 0) goto L_0x0056
                if (r4 == 0) goto L_0x0025
                java.util.List r1 = r4.getStarAtlasExtraList()
            L_0x0025:
                boolean r0 = com.bytedance.common.utility.collection.C13603b.m24435a(r1)
                if (r0 == 0) goto L_0x0056
                if (r2 == 0) goto L_0x0059
                android.content.res.Resources r1 = r2.getResources()
                if (r1 == 0) goto L_0x0059
                r0 = 2131099676(0x7f06001c, float:1.7811712E38)
                int r0 = r1.getColor(r0)
                if (r4 == 0) goto L_0x0056
                r4.setStarAtlasMentionTextColor(r0)
            L_0x003f:
                r5 = 1
                if (r3 != 0) goto L_0x0045
                p4600h.p4611f.p4613b.C89219l.m154715b()
            L_0x0045:
                r2 = 0
                java.lang.String r1 = "#"
                java.lang.String r0 = ""
                java.lang.String r6 = p4600h.p4622m.C89361p.m154869a(r3, r1, r0, r2)
                r9 = 1
                java.lang.String r7 = ""
                java.lang.String r8 = ""
                r4.addMentionText(r5, r6, r7, r8, r9)
            L_0x0056:
                h.z r0 = p4600h.C89391z.f203057a
                return r0
            L_0x0059:
                if (r4 == 0) goto L_0x0056
                goto L_0x003f
            L_0x005c:
                r3 = r1
                goto L_0x0019
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.tcm.impl.p4076b.C77741c.C77743b.invoke():java.lang.Object");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void callbackAnchors(List<CreateAnchorInfo> list) {
        C89219l.m154721d(list, "");
        IAVPublishExtension.DefaultImpls.callbackAnchors(this, list);
    }

    /* renamed from: com.ss.android.ugc.aweme.tcm.impl.b.c$d */
    static final class View$OnClickListenerC77745d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C77741c f174337a;

        /* renamed from: b */
        final /* synthetic */ PublishOutput f174338b;

        /* renamed from: c */
        final /* synthetic */ AVPublishContentType f174339c;

        /* renamed from: d */
        final /* synthetic */ Fragment f174340d;

        static {
            Covode.recordClassIndex(90805);
        }

        View$OnClickListenerC77745d(C77741c cVar, PublishOutput publishOutput, AVPublishContentType aVPublishContentType, Fragment fragment) {
            this.f174337a = cVar;
            this.f174338b = publishOutput;
            this.f174339c = aVPublishContentType;
            this.f174340d = fragment;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            String str = null;
            if (C77746d.m135842a() || !C77741c.m135840a(this.f174338b, this.f174339c)) {
                C77740b.m135839a(this.f174340d.getActivity(), C77741c.m135840a(this.f174338b, this.f174339c), null);
                return;
            }
            C23144b bVar = new C23144b(this.f174340d);
            Context context = this.f174340d.getContext();
            if (context != null) {
                str = context.getString(R.string.g2c);
            }
            bVar.mo37635a(str).mo37637b();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onBackPressed(PublishOutput publishOutput) {
        String str;
        C89219l.m154721d(publishOutput, "");
        ExtensionMisc extensionMisc = this.f174330d;
        if (extensionMisc == null) {
            C89219l.m154710a("extensionMisc");
        }
        AbstractC63199ax.AbstractC63200a publishExtensionDataContainer = extensionMisc.getPublishExtensionDataContainer();
        if (publishExtensionDataContainer != null) {
            str = publishExtensionDataContainer.mo101676a();
        } else {
            str = null;
        }
        PublishExtensionModel fromString = PublishExtensionModel.fromString(str);
        C89219l.m154716b(fromString, "");
        fromString.isStarAtlas = false;
        fromString.starAtlasContent = "";
        fromString.brandedContentType = "0";
        ExtensionMisc extensionMisc2 = this.f174330d;
        if (extensionMisc2 == null) {
            C89219l.m154710a("extensionMisc");
        }
        AbstractC63199ax.AbstractC63200a publishExtensionDataContainer2 = extensionMisc2.getPublishExtensionDataContainer();
        if (publishExtensionDataContainer2 != null) {
            publishExtensionDataContainer2.mo101679a(new C27910f().mo46674b(fromString));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onSaveDraft(PublishOutput publishOutput) {
        String str;
        C89219l.m154721d(publishOutput, "");
        ExtensionMisc extensionMisc = this.f174330d;
        if (extensionMisc == null) {
            C89219l.m154710a("extensionMisc");
        }
        AbstractC63199ax.AbstractC63200a publishExtensionDataContainer = extensionMisc.getPublishExtensionDataContainer();
        if (publishExtensionDataContainer != null) {
            str = publishExtensionDataContainer.mo101676a();
        } else {
            str = null;
        }
        PublishExtensionModel fromString = PublishExtensionModel.fromString(str);
        fromString.outerStarAtlas = "";
        C89219l.m154716b(fromString, "");
        fromString.isStarAtlas = false;
        fromString.starAtlasContent = "";
        fromString.brandedContentType = "0";
        ExtensionMisc extensionMisc2 = this.f174330d;
        if (extensionMisc2 == null) {
            C89219l.m154710a("extensionMisc");
        }
        AbstractC63199ax.AbstractC63200a publishExtensionDataContainer2 = extensionMisc2.getPublishExtensionDataContainer();
        if (publishExtensionDataContainer2 != null) {
            publishExtensionDataContainer2.mo101679a(new C27910f().mo46674b(fromString));
        }
    }

    /* renamed from: a */
    public static boolean m135840a(PublishOutput publishOutput, AVPublishContentType aVPublishContentType) {
        String musicId = publishOutput.getMusicId();
        if (musicId == null || musicId.length() == 0 || aVPublishContentType != AVPublishContentType.Video || publishOutput.isCommercialMusic() || publishOutput.isOriginalSound()) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C89219l.m154721d(strArr, "");
        C89219l.m154721d(iArr, "");
        IAVPublishExtension.DefaultImpls.onRequestPermissionsResult(this, i, strArr, iArr);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onCreate(Fragment fragment, LinearLayout linearLayout, Bundle bundle, AVPublishContentType aVPublishContentType, PublishOutput publishOutput, ExtensionMisc extensionMisc, IAVPublishExtension.Callback callback) {
        View findViewById;
        String str;
        String optString;
        MethodCollector.m26663i(11202);
        C89219l.m154721d(fragment, "");
        C89219l.m154721d(linearLayout, "");
        C89219l.m154721d(aVPublishContentType, "");
        C89219l.m154721d(publishOutput, "");
        C89219l.m154721d(extensionMisc, "");
        C89219l.m154721d(callback, "");
        this.f174330d = extensionMisc;
        this.f174329c = fragment.getContext();
        this.f174333h = fragment;
        View view = fragment.getView();
        if (view == null || (findViewById = view.findViewById(R.id.ass)) == null) {
            NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.services.publish.IAVMentionEditText");
            MethodCollector.m26664o(11202);
            throw nullPointerException;
        }
        this.f174328b = (IAVMentionEditText) findViewById;
        C77751e eVar = new C77751e(linearLayout.getContext());
        linearLayout.addView(eVar, new LinearLayout.LayoutParams(-1, (int) C13628n.m24520b(linearLayout.getContext(), 52.0f)));
        eVar.setGravity(16);
        eVar.setOrientation(0);
        eVar.setVisibility(8);
        this.f174327a = eVar;
        extensionMisc.getExtensionDataRepo().setAddStarAtlasTag(new C77743b(this));
        extensionMisc.getExtensionDataRepo().setRemoveStarAtlasTag(new C77744c(this, extensionMisc));
        C77751e eVar2 = this.f174327a;
        if (eVar2 == null) {
            C89219l.m154710a("delegate");
        }
        eVar2.setExtensionDataRepo(extensionMisc.getExtensionDataRepo());
        C77751e eVar3 = this.f174327a;
        if (eVar3 == null) {
            C89219l.m154710a("delegate");
        }
        eVar3.setPublishExtensionDataContainer(extensionMisc.getPublishExtensionDataContainer());
        C77751e eVar4 = this.f174327a;
        if (eVar4 == null) {
            C89219l.m154710a("delegate");
        }
        eVar4.setTitle(R.string.g0d);
        C77751e eVar5 = this.f174327a;
        if (eVar5 == null) {
            C89219l.m154710a("delegate");
        }
        eVar5.setSubtitle("");
        C77751e eVar6 = this.f174327a;
        if (eVar6 == null) {
            C89219l.m154710a("delegate");
        }
        eVar6.setOnClickListener(new View$OnClickListenerC77745d(this, publishOutput, aVPublishContentType, fragment));
        AbstractC63199ax.AbstractC63200a publishExtensionDataContainer = extensionMisc.getPublishExtensionDataContainer();
        if (publishExtensionDataContainer != null) {
            str = publishExtensionDataContainer.mo101676a();
        } else {
            str = null;
        }
        PublishExtensionModel fromString = PublishExtensionModel.fromString(str);
        String str2 = fromString.outerStarAtlas;
        if (!(str2 == null || str2.length() == 0)) {
            C77739a.m135838a(true);
        }
        TcmConfig a = C77762e.m135852a();
        if (a == null || !a.isTcmCreator()) {
            MethodCollector.m26664o(11202);
            return;
        }
        if (!C77746d.m135842a()) {
            if (m135840a(publishOutput, aVPublishContentType)) {
                C77751e eVar7 = this.f174327a;
                if (eVar7 == null) {
                    C89219l.m154710a("delegate");
                }
                eVar7.setAlpha(this.f174332f);
            } else {
                C77751e eVar8 = this.f174327a;
                if (eVar8 == null) {
                    C89219l.m154710a("delegate");
                }
                eVar8.setAlpha(this.f174331e);
            }
        }
        C77751e eVar9 = this.f174327a;
        if (eVar9 == null) {
            C89219l.m154710a("delegate");
        }
        eVar9.setVisibility(0);
        if (this.f174327a == null) {
            C89219l.m154710a("delegate");
        }
        C77731c.m135807b("0");
        C77731c.m135805a(null);
        String str3 = fromString.outerStarAtlas;
        if (!(str3 == null || str3.length() == 0)) {
            JSONObject jSONObject = new JSONObject(fromString.outerStarAtlas);
            if (C89219l.m154714a((Object) jSONObject.optString("recordParam"), (Object) "tcm") && (optString = jSONObject.optString("campaignInfo")) != null) {
                C77751e eVar10 = this.f174327a;
                if (eVar10 == null) {
                    C89219l.m154710a("delegate");
                }
                eVar10.setStarAtlasContent(optString);
                C77751e eVar11 = this.f174327a;
                if (eVar11 == null) {
                    C89219l.m154710a("delegate");
                }
                eVar11.setBrandedContentType("1");
                MethodCollector.m26664o(11202);
                return;
            }
        }
        MethodCollector.m26664o(11202);
    }
}
