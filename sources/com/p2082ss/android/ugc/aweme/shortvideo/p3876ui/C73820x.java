package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.p1710c.C23005c;
import com.bytedance.tux.p1721g.C23144b;
import com.google.gson.C27910f;
import com.google.p1998c.p1999a.C27258s;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.C36087ck;
import com.p2082ss.android.ugc.aweme.EnumC31359ab;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.AnchorListManager;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.commercialize.p2535b.C37609a;
import com.p2082ss.android.ugc.aweme.commercialize.p2535b.DialogC37619b;
import com.p2082ss.android.ugc.aweme.commercialize.p2535b.p2536a.C37610a;
import com.p2082ss.android.ugc.aweme.commercialize.p2535b.p2537b.C37623a;
import com.p2082ss.android.ugc.aweme.common.C39053a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.experiment.C46847dp;
import com.p2082ss.android.ugc.aweme.framework.services.IUserService;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.multi.maker.C60273p;
import com.p2082ss.android.ugc.aweme.p2312an.C33497b;
import com.p2082ss.android.ugc.aweme.p2479ck.C36125t;
import com.p2082ss.android.ugc.aweme.p2929fe.method.C47959j;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63199ax;
import com.p2082ss.android.ugc.aweme.services.BaseUserService;
import com.p2082ss.android.ugc.aweme.services.publish.AVPublishContentType;
import com.p2082ss.android.ugc.aweme.services.publish.ExtensionMisc;
import com.p2082ss.android.ugc.aweme.services.publish.IAVMentionEditText;
import com.p2082ss.android.ugc.aweme.services.publish.IAVPublishExtension;
import com.p2082ss.android.ugc.aweme.services.publish.MultiAnchorPublishModel;
import com.p2082ss.android.ugc.aweme.services.publish.PublishOutput;
import com.p2082ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct;
import com.p2082ss.android.ugc.aweme.shortvideo.model.PublishExtensionModel;
import com.p2082ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import com.p2082ss.android.ugc.aweme.utils.C80187aa;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import com.p2082ss.android.ugc.aweme.utils.C80537hk;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.aweme.wiki.AddWikiActivity;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89070n;
import p4600h.p4602b.C89090a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.x */
public final class C73820x implements IAVPublishExtension<MultiAnchorPublishModel>, AbstractC90252i, AbstractC90253j {

    /* renamed from: a */
    public final int f165724a = 2;

    /* renamed from: b */
    public C36087ck f165725b;

    /* renamed from: c */
    public Fragment f165726c;

    /* renamed from: d */
    public ExtensionMisc f165727d;

    /* renamed from: e */
    public AVPublishContentType f165728e;

    /* renamed from: f */
    public PublishOutput f165729f;

    /* renamed from: g */
    public DialogC37619b f165730g;

    /* renamed from: h */
    private PublishExtensionModel f165731h;

    /* renamed from: i */
    private String f165732i;

    /* renamed from: j */
    private UrlModel f165733j;

    static {
        Covode.recordClassIndex(86565);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final String getName() {
        return "MultiAnchorPublishExtension";
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(158, new RunnableC90250g(C73820x.class, "onAsyncAnchor", C37609a.class, ThreadMode.MAIN, 0, false));
        hashMap.put(234, new RunnableC90250g(C73820x.class, "onJsBroacastReceiver", C47959j.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.x$h */
    static final class C73829h extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        public static final C73829h f165747a = new C73829h();

        static {
            Covode.recordClassIndex(86574);
        }

        C73829h() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ C89391z invoke() {
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final UrlModel getAnchorIconUrl() {
        return this.f165733j;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final String getAnchorText() {
        return this.f165732i;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onCreateFinish() {
        IAVPublishExtension.DefaultImpls.onCreateFinish(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onResume() {
        IAVPublishExtension.DefaultImpls.onResume(this);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.p2082ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final /* synthetic */ MultiAnchorPublishModel provideExtensionData() {
        return new MultiAnchorPublishModel();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.x$b */
    static final class C73823b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ AnchorPublishStruct f165738a;

        /* renamed from: b */
        final /* synthetic */ List f165739b;

        /* renamed from: c */
        final /* synthetic */ C73820x f165740c;

        /* renamed from: d */
        final /* synthetic */ View f165741d;

        static {
            Covode.recordClassIndex(86568);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C73823b(AnchorPublishStruct anchorPublishStruct, List list, C73820x xVar, View view) {
            super(0);
            this.f165738a = anchorPublishStruct;
            this.f165739b = list;
            this.f165740c = xVar;
            this.f165741d = view;
        }

        /* renamed from: a */
        private static boolean m129891a() {
            try {
                return C34719f.C34720a.f82009a.mo61395c();
            } catch (Exception unused) {
                return false;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f165741d.getContext();
            if (!C58029j.f132253e || !C58029j.m104846b() || C58029j.m104847c()) {
                C58029j.f132253e = m129891a();
            }
            if (!C58029j.f132253e) {
                new C23144b(this.f165741d).mo37640e(R.string.axx).mo37637b();
                DialogC37619b bVar = this.f165740c.f165730g;
                if (bVar != null) {
                    bVar.dismiss();
                }
            } else {
                C39162r.m79460a("add_label", new C33744d().mo59983a("enter_from", "label_panel").mo59980a("business_type", this.f165738a.type).mo59980a("new_tag", this.f165738a.isNew ? 1 : 0).mo59983a("anchor_type", AnchorListManager.m70431a(this.f165738a)).f79943a);
                C33744d dVar = new C33744d();
                IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
                String str = "";
                C89219l.m154716b(createIUserServicebyMonsterPlugin, str);
                C39162r.m79460a("tiktokec_video_add_link_click", dVar.mo59983a("author_id", createIUserServicebyMonsterPlugin.getCurrentUserID()).mo59983a("page_name", "video_add_link").mo59983a("EVENT_ORIGIN_FEATURE", "TEMAI").mo59980a("button_for", this.f165738a.type).f79943a);
                int i = this.f165738a.type;
                if (i == EnumC31359ab.WIKIPEDIA.getTYPE()) {
                    if (!this.f165738a.enable) {
                        Context context = C73820x.m129881a(this.f165740c).getContext();
                        if (context != null) {
                            new C23144b(C73820x.m129881a(this.f165740c)).mo37635a(context.getString(R.string.hbw)).mo37637b();
                        }
                    } else {
                        Context context2 = C73820x.m129886b(this.f165740c).getContext();
                        C89219l.m154716b(context2, str);
                        String str2 = this.f165738a.webUrl;
                        if (str2 == null) {
                            str2 = str;
                        }
                        C89378p[] pVarArr = new C89378p[4];
                        pVarArr[0] = C89387v.m154943a("title", C73820x.m129881a(this.f165740c).getString(R.string.ayd));
                        String shootWay = this.f165740c.mo116265a().getMobParam().getShootWay();
                        if (shootWay == null) {
                            shootWay = str;
                        }
                        pVarArr[1] = C89387v.m154943a("shoot_way", shootWay);
                        String creationId = this.f165740c.mo116265a().getMobParam().getCreationId();
                        if (creationId != null) {
                            str = creationId;
                        }
                        pVarArr[2] = C89387v.m154943a("creation_id", str);
                        pVarArr[3] = C89387v.m154943a("show_keyboard", "true");
                        AddWikiActivity.C81638a.m141514a(context2, str2, C89041ag.m154421a(pVarArr), C89041ag.m154415a());
                        DialogC37619b bVar2 = this.f165740c.f165730g;
                        if (bVar2 != null) {
                            bVar2.dismiss();
                        }
                    }
                } else if (i == EnumC31359ab.YELP.getTYPE()) {
                    Context context3 = C73820x.m129886b(this.f165740c).getContext();
                    C89219l.m154716b(context3, str);
                    String str3 = this.f165738a.webUrl;
                    if (str3 == null) {
                        str3 = str;
                    }
                    C89378p[] pVarArr2 = new C89378p[5];
                    String shootWay2 = this.f165740c.mo116265a().getMobParam().getShootWay();
                    if (shootWay2 == null) {
                        shootWay2 = str;
                    }
                    pVarArr2[0] = C89387v.m154943a("shoot_way", shootWay2);
                    String creationId2 = this.f165740c.mo116265a().getMobParam().getCreationId();
                    if (creationId2 != null) {
                        str = creationId2;
                    }
                    pVarArr2[1] = C89387v.m154943a("creation_id", str);
                    pVarArr2[2] = C89387v.m154943a("host_filter", "true");
                    pVarArr2[3] = C89387v.m154943a("anchor_type", "Yelp");
                    pVarArr2[4] = C89387v.m154943a("addButton", "true");
                    AddWikiActivity.C81638a.m141514a(context3, str3, C89041ag.m154421a(pVarArr2), C89041ag.m154415a());
                    DialogC37619b bVar3 = this.f165740c.f165730g;
                    if (bVar3 != null) {
                        bVar3.dismiss();
                    }
                } else if (i == EnumC31359ab.TRIP_ADVISOR.getTYPE()) {
                    Context context4 = C73820x.m129886b(this.f165740c).getContext();
                    C89219l.m154716b(context4, str);
                    String str4 = this.f165738a.webUrl;
                    if (str4 == null) {
                        str4 = str;
                    }
                    C89378p[] pVarArr3 = new C89378p[5];
                    String shootWay3 = this.f165740c.mo116265a().getMobParam().getShootWay();
                    if (shootWay3 == null) {
                        shootWay3 = str;
                    }
                    pVarArr3[0] = C89387v.m154943a("shoot_way", shootWay3);
                    String creationId3 = this.f165740c.mo116265a().getMobParam().getCreationId();
                    if (creationId3 != null) {
                        str = creationId3;
                    }
                    pVarArr3[1] = C89387v.m154943a("creation_id", str);
                    pVarArr3[2] = C89387v.m154943a("host_filter", "true");
                    pVarArr3[3] = C89387v.m154943a("anchor_type", "TripAdvisor");
                    pVarArr3[4] = C89387v.m154943a("addButton", "true");
                    AddWikiActivity.C81638a.m141514a(context4, str4, C89041ag.m154421a(pVarArr3), C89041ag.m154415a());
                    DialogC37619b bVar4 = this.f165740c.f165730g;
                    if (bVar4 != null) {
                        bVar4.dismiss();
                    }
                } else if (i == EnumC31359ab.NEWS.getTYPE()) {
                    C73820x xVar = this.f165740c;
                    Integer valueOf = Integer.valueOf(EnumC31359ab.NEWS.getTYPE());
                    List list = this.f165739b;
                    if (list != null && (!(list instanceof Collection) || !list.isEmpty())) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            int i2 = ((AnchorPublishStruct) it.next()).type;
                            if (valueOf != null && i2 == valueOf.intValue()) {
                                if (xVar != null) {
                                    Context requireContext = C73820x.m129881a(this.f165740c).requireContext();
                                    C89219l.m154716b(requireContext, str);
                                    C89219l.m154721d(requireContext, str);
                                    SmartRouter.buildRoute(requireContext, "//main/link_anchor_add").open();
                                }
                            }
                        }
                    }
                    DialogC37619b bVar5 = this.f165740c.f165730g;
                    if (bVar5 != null) {
                        bVar5.dismiss();
                    }
                } else if (i == EnumC31359ab.ANCHOR_SHOP_LINK.getTYPE()) {
                    PublishOutput publishOutput = this.f165740c.f165729f;
                    if (publishOutput == null) {
                        C89219l.m154710a("publishOutput");
                    }
                    AVPublishContentType aVPublishContentType = this.f165740c.f165728e;
                    if (aVPublishContentType == null) {
                        C89219l.m154710a("contentType");
                    }
                    C89219l.m154721d(publishOutput, str);
                    C89219l.m154721d(aVPublishContentType, str);
                    if (!C80537hk.m139613a(publishOutput.getMusicId()) || aVPublishContentType != AVPublishContentType.Video || publishOutput.isCommercialMusic() || publishOutput.isOriginalSound()) {
                        String str5 = this.f165738a.webUrl;
                        if (str5 != null) {
                            C36125t.m73596a(C36125t.m73591a(), C73820x.m129881a(this.f165740c).getActivity(), str5);
                        }
                    } else {
                        new C23144b(C73820x.m129886b(this.f165740c)).mo37640e(R.string.cv6).mo37637b();
                    }
                    DialogC37619b bVar6 = this.f165740c.f165730g;
                    if (bVar6 != null) {
                        bVar6.dismiss();
                    }
                } else if (i == EnumC31359ab.LIVE_EVENT.getTYPE()) {
                    SmartRouter.buildRoute(C73820x.m129881a(this.f165740c).getContext(), this.f165738a.scheme).withParam("shoot_way", this.f165740c.mo116265a().getMobParam().getShootWay()).withParam("creation_id", this.f165740c.mo116265a().getMobParam().getCreationId()).withParam("title", this.f165738a.title).withParam(StringSet.type, this.f165738a.type).withParam("subtype", this.f165738a.subtype).open();
                    DialogC37619b bVar7 = this.f165740c.f165730g;
                    if (bVar7 != null) {
                        bVar7.dismiss();
                    }
                } else {
                    AnchorPublishStruct anchorPublishStruct = this.f165738a;
                    C89219l.m154721d(anchorPublishStruct, str);
                    String str6 = anchorPublishStruct.scheme;
                    if (str6 != null && str6.length() > 0) {
                        if (this.f165738a.isNew) {
                            this.f165738a.isNew = false;
                            AnchorListManager.f81423d--;
                            DialogC37619b bVar8 = this.f165740c.f165730g;
                            if (bVar8 == null) {
                                C89219l.m154715b();
                            }
                            C37610a aVar = bVar8.f88934b;
                            if (aVar != null) {
                                aVar.notifyDataSetChanged();
                            }
                            AnchorListManager.f81425f.mo60888c(this.f165738a);
                            this.f165740c.mo116267c();
                        }
                        SmartRouter.buildRoute(C73820x.m129881a(this.f165740c).getContext(), this.f165738a.scheme).withParam("shoot_way", this.f165740c.mo116265a().getMobParam().getShootWay()).withParam("creation_id", this.f165740c.mo116265a().getMobParam().getCreationId()).withParam("title", this.f165738a.title).withParam(StringSet.type, this.f165738a.type).withParam("subtype", this.f165738a.subtype).open();
                        DialogC37619b bVar9 = this.f165740c.f165730g;
                        if (bVar9 != null) {
                            bVar9.dismiss();
                        }
                    }
                }
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final ViewGroup getAnchorListContent() {
        C36087ck ckVar = this.f165725b;
        if (ckVar == null) {
            C89219l.m154710a("delegate");
        }
        return ckVar.getAnchorListContent();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onEnterChildrenMode() {
        C36087ck ckVar = this.f165725b;
        if (ckVar == null) {
            C89219l.m154710a("delegate");
        }
        ckVar.setVisibility(8);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.x$f */
    static final class RunnableC73827f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C73820x f165743a;

        /* renamed from: b */
        final /* synthetic */ ExtensionMisc f165744b;

        /* renamed from: c */
        final /* synthetic */ ArrayList f165745c;

        static {
            Covode.recordClassIndex(86572);
        }

        RunnableC73827f(C73820x xVar, ExtensionMisc extensionMisc, ArrayList arrayList) {
            this.f165743a = xVar;
            this.f165744b = extensionMisc;
            this.f165745c = arrayList;
        }

        public final void run() {
            this.f165744b.getExtensionDataRepo().getUpdateAnchors().setValue(C73820x.m129882a(this.f165745c));
        }
    }

    /* renamed from: b */
    static boolean m129887b() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: c */
    public final void mo116267c() {
        if (AnchorListManager.m70436b()) {
            C36087ck ckVar = this.f165725b;
            if (ckVar == null) {
                C89219l.m154710a("delegate");
            }
            ckVar.mo63228b();
            return;
        }
        C36087ck ckVar2 = this.f165725b;
        if (ckVar2 == null) {
            C89219l.m154710a("delegate");
        }
        ckVar2.mo63229c();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onDestroy() {
        EventBus.m156962a().mo145395b(this);
        Map<String, AnchorPublishStruct> c = AnchorListManager.m70437c();
        if (c != null) {
            for (Map.Entry<String, AnchorPublishStruct> entry : c.entrySet()) {
                entry.getValue().setOnClickAction(C73829h.f165747a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.x$a */
    static final class RunnableC73821a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C73820x f165734a;

        /* renamed from: b */
        final /* synthetic */ List f165735b;

        static {
            Covode.recordClassIndex(86566);
        }

        RunnableC73821a(C73820x xVar, List list) {
            this.f165734a = xVar;
            this.f165735b = list;
        }

        public final void run() {
            boolean z;
            final ArrayList arrayList = new ArrayList();
            for (CreateAnchorInfo createAnchorInfo : this.f165735b) {
                int type = createAnchorInfo.getType();
                String content = createAnchorInfo.getContent();
                String keyword = createAnchorInfo.getKeyword();
                UrlModel urlModel = new UrlModel();
                urlModel.setUrlList(C89070n.m154525d(createAnchorInfo.getIconUrl()));
                urlModel.setUri(Uri.decode(createAnchorInfo.getIconUrl()));
                String subtype = createAnchorInfo.getSubtype();
                if (createAnchorInfo.getType() == 40) {
                    z = true;
                } else {
                    z = false;
                }
                arrayList.add(new C39053a(type, content, keyword, null, null, null, urlModel, z, null, createAnchorInfo.getLanguage(), createAnchorInfo.getAddTime(), createAnchorInfo.getExtra(), subtype, 312, null));
            }
            List<C39053a> value = this.f165734a.mo116265a().getExtensionDataRepo().getUpdateAnchors().getValue();
            if (value != null) {
                Iterator<T> it = value.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
            }
            View view = C73820x.m129881a(this.f165734a).getView();
            if (view != null) {
                view.post(new Runnable(this) {
                    /* class com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.C73820x.RunnableC73821a.RunnableC738221 */

                    /* renamed from: a */
                    final /* synthetic */ RunnableC73821a f165736a;

                    static {
                        Covode.recordClassIndex(86567);
                    }

                    {
                        this.f165736a = r1;
                    }

                    public final void run() {
                        this.f165736a.f165734a.mo116265a().getExtensionDataRepo().getUpdateAnchors().setValue(C73820x.m129882a(arrayList));
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public final ExtensionMisc mo116265a() {
        ExtensionMisc extensionMisc = this.f165727d;
        if (extensionMisc == null) {
            C89219l.m154710a("extensionMisc");
        }
        return extensionMisc;
    }

    /* renamed from: a */
    public static final /* synthetic */ Fragment m129881a(C73820x xVar) {
        Fragment fragment = xVar.f165726c;
        if (fragment == null) {
            C89219l.m154710a("fragment");
        }
        return fragment;
    }

    /* renamed from: b */
    public static final /* synthetic */ C36087ck m129886b(C73820x xVar) {
        C36087ck ckVar = xVar.f165725b;
        if (ckVar == null) {
            C89219l.m154710a("delegate");
        }
        return ckVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onBackPressed(PublishOutput publishOutput) {
        C89219l.m154721d(publishOutput, "");
        IAVPublishExtension.DefaultImpls.onBackPressed(this, publishOutput);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onPublish(PublishOutput publishOutput) {
        C89219l.m154721d(publishOutput, "");
        IAVPublishExtension.DefaultImpls.onPublish(this, publishOutput);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onSaveDraft(PublishOutput publishOutput) {
        C89219l.m154721d(publishOutput, "");
        IAVPublishExtension.DefaultImpls.onSaveDraft(this, publishOutput);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onSaveInstanceState(Bundle bundle) {
        C89219l.m154721d(bundle, "");
        IAVPublishExtension.DefaultImpls.onSaveInstanceState(this, bundle);
    }

    /* renamed from: a */
    public static ArrayList<C39053a> m129882a(ArrayList<C39053a> arrayList) {
        ArrayList<C39053a> arrayList2 = new ArrayList<>();
        for (T t : arrayList) {
            if (!m129885a((C39053a) t, (List<C39053a>) arrayList2)) {
                arrayList2.add(t);
            }
        }
        return arrayList2;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void setLeftIcon(int i) {
        C36087ck ckVar = this.f165725b;
        if (ckVar == null) {
            C89219l.m154710a("delegate");
        }
        RemoteImageView leftIcon = ckVar.getLeftIcon();
        if (leftIcon != null) {
            leftIcon.setImageResource(i);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void setRightIcon(C22999a aVar) {
        C89219l.m154721d(aVar, "");
        C36087ck ckVar = this.f165725b;
        if (ckVar == null) {
            C89219l.m154710a("delegate");
        }
        TuxIconView rightIcon = ckVar.getRightIcon();
        if (rightIcon != null) {
            rightIcon.setTuxIcon(aVar);
        }
    }

    /* renamed from: a */
    private final List<C39053a> m129883a(C39053a aVar) {
        ArrayList arrayList = new ArrayList();
        ExtensionMisc extensionMisc = this.f165727d;
        if (extensionMisc == null) {
            C89219l.m154710a("extensionMisc");
        }
        List<C39053a> value = extensionMisc.getExtensionDataRepo().getUpdateAnchors().getValue();
        if (value != null) {
            Iterator<T> it = value.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        }
        arrayList.add(aVar);
        return m129882a(arrayList);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void callbackAnchors(List<CreateAnchorInfo> list) {
        C89219l.m154721d(list, "");
        if (this.f165725b != null) {
            Fragment fragment = this.f165726c;
            if (fragment == null) {
                C89219l.m154710a("fragment");
            }
            ActivityC0945e activity = fragment.getActivity();
            if (activity != null) {
                activity.runOnUiThread(new RunnableC73821a(this, list));
            }
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onAsyncAnchor(C37609a aVar) {
        C39053a aVar2;
        if (!(aVar == null || (aVar2 = aVar.f88909a) == null)) {
            aVar2.setAddTime(Long.valueOf(SystemClock.elapsedRealtime()));
            ExtensionMisc extensionMisc = this.f165727d;
            if (extensionMisc == null) {
                C89219l.m154710a("extensionMisc");
            }
            extensionMisc.getExtensionDataRepo().getUpdateAnchors().setValue(m129883a(aVar2));
        }
        DialogC37619b bVar = this.f165730g;
        if (bVar != null) {
            bVar.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.x$g */
    static final class C73828g extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ Fragment f165746a;

        static {
            Covode.recordClassIndex(86573);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C73828g(Fragment fragment) {
            super(1);
            this.f165746a = fragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f54431a = R.raw.icon_chevron_right_offset_ltr;
            aVar2.f54434d = Integer.valueOf(this.f165746a.getResources().getColor(R.color.c5));
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            aVar2.f54432b = C89241a.m154730a(TypedValue.applyDimension(1, 16.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            C89219l.m154709a((Object) system2, "");
            aVar2.f54433c = C89241a.m154730a(TypedValue.applyDimension(1, 16.0f, system2.getDisplayMetrics()));
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.x$e */
    static final /* synthetic */ class C73826e extends C89217j implements AbstractC89172b<View, C89391z> {
        static {
            Covode.recordClassIndex(86571);
        }

        C73826e(C73820x xVar) {
            super(1, xVar, C73820x.class, "onAddClick", "onAddClick(Landroid/view/View;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(View view) {
            View view2 = view;
            C89219l.m154721d(view2, "");
            C73820x xVar = (C73820x) this.receiver;
            ExtensionMisc extensionMisc = xVar.f165727d;
            if (extensionMisc == null) {
                C89219l.m154710a("extensionMisc");
            }
            List<C39053a> value = extensionMisc.getExtensionDataRepo().getUpdateAnchors().getValue();
            if (value != null) {
                if (value.size() >= 10) {
                    new C23144b(view2).mo37640e(R.string.th).mo37637b();
                } else {
                    view2.getContext();
                    if (!C58029j.f132253e || !C58029j.m104846b() || C58029j.m104847c()) {
                        C58029j.f132253e = C73820x.m129887b();
                    }
                    if (!C58029j.f132253e) {
                        new C23144b(view2).mo37640e(R.string.axx).mo37637b();
                    } else {
                        C39162r.m79460a("open_label_panel", new C33744d().mo59980a("awareness_dot", AnchorListManager.m70436b() ? 1 : 0).f79943a);
                        if (xVar.f165730g == null) {
                            List<AnchorPublishStruct> f = AnchorListManager.f81425f.mo60889f();
                            if (f != null) {
                                Iterator<T> it = f.iterator();
                                while (it.hasNext()) {
                                    it.next().enable = true;
                                }
                                Context context = view2.getContext();
                                C89219l.m154716b(context, "");
                                Fragment fragment = xVar.f165726c;
                                if (fragment == null) {
                                    C89219l.m154710a("fragment");
                                }
                                xVar.f165730g = new DialogC37619b(context, f, fragment);
                                for (T t : f) {
                                    ExtensionMisc extensionMisc2 = xVar.f165727d;
                                    if (extensionMisc2 == null) {
                                        C89219l.m154710a("extensionMisc");
                                    }
                                    t.setExtensionMisc(extensionMisc2);
                                    t.setOnClickAction(new C73823b(t, f, xVar, view2));
                                }
                            }
                        }
                        DialogC37619b bVar = xVar.f165730g;
                        if (bVar == null) {
                            C89219l.m154715b();
                        }
                        bVar.show();
                    }
                }
            }
            return C89391z.f203057a;
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onJsBroacastReceiver(C47959j jVar) {
        C89219l.m154721d(jVar, "");
        try {
            String string = jVar.f111077b.getString("eventName");
            if (string != null && C89219l.m154714a((Object) string, (Object) "anchor_merch_pick_content") && jVar.f111077b.has("data")) {
                String optString = jVar.f111077b.optString("data");
                C39162r.m79460a("rd_tiktokec_shop_anchor_jsb_add_event", new C33744d().mo59983a("jsb_param", optString).mo59983a("where", getName()).f79943a);
                JSONObject jSONObject = new JSONObject(optString);
                int optInt = jSONObject.optInt(StringSet.type, EnumC31359ab.ANCHOR_SHOP_LINK.getTYPE());
                String optString2 = jSONObject.optString("keyword", "");
                String optString3 = jSONObject.optString("subtype", "");
                String optString4 = jSONObject.optString("url", "");
                C89219l.m154716b(optString, "");
                C39053a aVar = new C39053a(optInt, optString, optString2, null, 1, null, null, false, optString4, null, Long.valueOf(SystemClock.elapsedRealtime()), null, optString3, 2792, null);
                ExtensionMisc extensionMisc = this.f165727d;
                if (extensionMisc == null) {
                    C89219l.m154710a("extensionMisc");
                }
                extensionMisc.getExtensionDataRepo().getUpdateAnchors().setValue(m129883a(aVar));
            }
        } catch (Exception e) {
            e.printStackTrace();
            C39162r.m79460a("rd_tiktokec_shop_anchor_exception", new C33744d().mo59983a("e_stack_trace", C27258s.m54268b(e)).mo59982a("extra_data", jVar.f111077b).mo59983a("where", getName()).f79943a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.x$i */
    public static final class C73830i extends AbstractC89220m implements AbstractC89172b<View, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C39053a f165748a;

        /* renamed from: b */
        final /* synthetic */ C73820x f165749b;

        /* renamed from: c */
        final /* synthetic */ List f165750c;

        static {
            Covode.recordClassIndex(86575);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C73830i(C39053a aVar, C73820x xVar, List list) {
            super(1);
            this.f165748a = aVar;
            this.f165749b = xVar;
            this.f165750c = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(View view) {
            Integer num;
            C89219l.m154721d(view, "");
            List<C39053a> value = this.f165749b.mo116265a().getExtensionDataRepo().getUpdateAnchors().getValue();
            View view2 = null;
            if (!(value instanceof ArrayList)) {
                value = null;
            }
            ArrayList arrayList = (ArrayList) value;
            if (arrayList != null) {
                arrayList.remove(this.f165748a);
                this.f165749b.mo116266a(this.f165750c, arrayList);
            }
            this.f165749b.mo116265a().getExtensionDataRepo().getUpdateAnchors().setValue(arrayList);
            if (this.f165748a.getBusinessType() == EnumC31359ab.ANCHOR_SHOP_LINK.getTYPE() || this.f165748a.getBusinessType() == EnumC31359ab.ANCHOR_SHOP_WINDOW.getTYPE()) {
                if (arrayList != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : arrayList) {
                        C39053a aVar = (C39053a) obj;
                        if (aVar.getBusinessType() == EnumC31359ab.ANCHOR_SHOP_LINK.getTYPE() || aVar.getBusinessType() == EnumC31359ab.ANCHOR_SHOP_WINDOW.getTYPE()) {
                            arrayList2.add(obj);
                        }
                    }
                    num = Integer.valueOf(arrayList2.size());
                } else {
                    num = null;
                }
                if (C73820x.m129886b(this.f165749b).getVisibility() == 0 && num != null && num.intValue() == 0) {
                    View view3 = C73820x.m129881a(this.f165749b).getView();
                    if (view3 != null) {
                        view2 = view3.findViewById(R.id.ass);
                    }
                    Objects.requireNonNull(view2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.services.publish.IAVMentionEditText");
                    IAVMentionEditText iAVMentionEditText = (IAVMentionEditText) view2;
                    if (iAVMentionEditText != null) {
                        iAVMentionEditText.removeHashTag();
                    }
                }
                C39162r.m79460a("delete_label", new C33744d().mo59983a("enter_from", "video_publish_page").mo59983a("shoot_way", this.f165749b.mo116265a().getMobParam().getShootWay()).mo59983a("creation_id", this.f165749b.mo116265a().getMobParam().getCreationId()).mo59980a("business_type", this.f165748a.getBusinessType()).f79943a);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.x$d */
    static final class C73825d<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C73820x f165742a;

        static {
            Covode.recordClassIndex(86570);
        }

        C73825d(C73820x xVar) {
            this.f165742a = xVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            List<String> urlList;
            JSONObject jSONObject;
            List<String> urlList2;
            String language;
            String str;
            T t;
            List<T> list = (List) obj;
            C73820x xVar = this.f165742a;
            if (list == null) {
                C36087ck ckVar = xVar.f165725b;
                if (ckVar == null) {
                    C89219l.m154710a("delegate");
                }
                ckVar.mo63227a();
                return;
            }
            Fragment fragment = xVar.f165726c;
            if (fragment == null) {
                C89219l.m154710a("fragment");
            }
            View view = fragment.getView();
            View findViewById = view != null ? view.findViewById(R.id.ass) : null;
            Objects.requireNonNull(findViewById, "null cannot be cast to non-null type com.ss.android.ugc.aweme.services.publish.IAVMentionEditText");
            IAVMentionEditText iAVMentionEditText = (IAVMentionEditText) findViewById;
            List<AnchorPublishStruct> f = AnchorListManager.f81425f.mo60889f();
            if (f != null) {
                Iterator<T> it = f.iterator();
                loop0:
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    T t2 = t;
                    if (t2.type == EnumC31359ab.ANCHOR_SHOP_LINK.getTYPE() || t2.type == EnumC31359ab.ANCHOR_SHOP_WINDOW.getTYPE()) {
                        C36087ck ckVar2 = xVar.f165725b;
                        if (ckVar2 == null) {
                            C89219l.m154710a("delegate");
                        }
                        if (ckVar2.getVisibility() == 0 && (!(list instanceof Collection) || !list.isEmpty())) {
                            for (T t3 : list) {
                                if (t3.getBusinessType() != EnumC31359ab.ANCHOR_SHOP_LINK.getTYPE()) {
                                    if (t3.getBusinessType() == EnumC31359ab.ANCHOR_SHOP_WINDOW.getTYPE()) {
                                        break loop0;
                                    }
                                } else {
                                    break loop0;
                                }
                            }
                            continue;
                        }
                    }
                }
                T t4 = t;
                if (t4 != null) {
                    Fragment fragment2 = xVar.f165726c;
                    if (fragment2 == null) {
                        C89219l.m154710a("fragment");
                    }
                    fragment2.getContext();
                    String str2 = t4.hashtag;
                    if (!(str2 == null || C89361p.m154870a((CharSequence) str2) || iAVMentionEditText == null)) {
                        iAVMentionEditText.addHashTag(str2);
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            for (T t5 : list) {
                arrayList.add(t5);
            }
            if (arrayList.size() > 1) {
                C89070n.m154530a((List) arrayList, (Comparator) new C73824c());
            }
            xVar.mo116266a(f, arrayList);
            ExtensionMisc extensionMisc = xVar.f165727d;
            if (extensionMisc == null) {
                C89219l.m154710a("extensionMisc");
            }
            AbstractC63199ax.AbstractC63200a publishExtensionDataContainer = extensionMisc.getPublishExtensionDataContainer();
            PublishExtensionModel fromString = PublishExtensionModel.fromString(publishExtensionDataContainer != null ? publishExtensionDataContainer.mo101676a() : null);
            ArrayList arrayList2 = new ArrayList();
            for (T t6 : arrayList) {
                String str3 = "";
                if (!t6.getCanDelete()) {
                    int businessType = t6.getBusinessType();
                    String title = t6.getTitle();
                    if (title == null) {
                        title = str3;
                    }
                    String url = t6.getUrl();
                    if (url == null) {
                        url = str3;
                    }
                    String language2 = t6.getLanguage();
                    if (language2 != null) {
                        str3 = language2;
                    }
                    String anchorContent = t6.getAnchorContent();
                    UrlModel anchorIcon = t6.getAnchorIcon();
                    arrayList2.add(new CreateAnchorInfo(businessType, title, url, str3, anchorContent, (anchorIcon == null || (urlList = anchorIcon.getUrlList()) == null) ? null : urlList.get(0), t6.getAddTime(), t6.getExtra(), null, null, t6.getSubtype(), Boolean.valueOf(t6.getCanDelete()), 768, null));
                } else if (t6.getBusinessType() == EnumC31359ab.WIKIPEDIA.getTYPE()) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("add_from", xVar.f165724a);
                    String jSONObject3 = jSONObject2.toString();
                    C89219l.m154716b(jSONObject3, str3);
                    C37623a aVar = (C37623a) new C27910f().mo46670a(t6.getAnchorContent(), (Class) C37623a.class);
                    if (aVar == null || (str = aVar.f88944b) == null || str.length() <= 0) {
                        language = t6.getLanguage();
                    } else if (aVar != null) {
                        language = aVar.f88944b;
                    } else {
                        language = null;
                    }
                    int businessType2 = t6.getBusinessType();
                    String title2 = t6.getTitle();
                    if (title2 == null) {
                        title2 = str3;
                    }
                    String url2 = t6.getUrl();
                    if (url2 == null) {
                        url2 = str3;
                    }
                    if (language != null) {
                        str3 = language;
                    }
                    arrayList2.add(new CreateAnchorInfo(businessType2, title2, url2, str3, jSONObject3, "https://p16.tiktokcdn.com/obj/tiktok-obj/wiki_anchor_new.png", t6.getAddTime(), null, null, null, t6.getSubtype(), Boolean.valueOf(t6.getCanDelete()), 896, null));
                } else {
                    if (t6.getAnchorContent().length() == 0) {
                        jSONObject = new JSONObject();
                        jSONObject.put("add_from", xVar.f165724a);
                    } else {
                        jSONObject = new JSONObject(t6.getAnchorContent());
                        if (!jSONObject.has("add_from")) {
                            jSONObject.put("add_from", xVar.f165724a);
                        }
                    }
                    String jSONObject4 = jSONObject.toString();
                    C89219l.m154716b(jSONObject4, str3);
                    t6.setAnchorContent(jSONObject4);
                    int businessType3 = t6.getBusinessType();
                    String title3 = t6.getTitle();
                    if (title3 == null) {
                        title3 = str3;
                    }
                    String url3 = t6.getUrl();
                    if (url3 == null) {
                        url3 = str3;
                    }
                    String language3 = t6.getLanguage();
                    if (language3 != null) {
                        str3 = language3;
                    }
                    String anchorContent2 = t6.getAnchorContent();
                    UrlModel anchorIcon2 = t6.getAnchorIcon();
                    arrayList2.add(new CreateAnchorInfo(businessType3, title3, url3, str3, anchorContent2, (anchorIcon2 == null || (urlList2 = anchorIcon2.getUrlList()) == null) ? null : urlList2.get(0), t6.getAddTime(), t6.getExtra(), null, null, t6.getSubtype(), Boolean.valueOf(t6.getCanDelete()), 768, null));
                }
            }
            fromString.createAnchorInfos = arrayList2;
            ExtensionMisc extensionMisc2 = xVar.f165727d;
            if (extensionMisc2 == null) {
                C89219l.m154710a("extensionMisc");
            }
            AbstractC63199ax.AbstractC63200a publishExtensionDataContainer2 = extensionMisc2.getPublishExtensionDataContainer();
            if (publishExtensionDataContainer2 != null) {
                publishExtensionDataContainer2.mo101679a(PublishExtensionModel.toString(fromString));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.x$c */
    public static final class C73824c<T> implements Comparator {
        static {
            Covode.recordClassIndex(86569);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C89090a.m154604a(t.getAddTime(), t2.getAddTime());
        }
    }

    /* renamed from: a */
    private static boolean m129885a(C39053a aVar, List<C39053a> list) {
        for (T t : list) {
            if (t != null) {
                if (!C46847dp.m90162a() || C80580in.m139689d()) {
                    if (C89219l.m154714a((Object) aVar.getTitle(), (Object) t.getTitle()) && aVar.getBusinessType() == EnumC31359ab.PROP.getTYPE()) {
                    }
                } else if (!C89219l.m154714a((Object) aVar.getTitle(), (Object) t.getTitle())) {
                    continue;
                } else if ((C60273p.C60274a.m109958a(aVar.getExtra()) == 3 || C60273p.C60274a.m109958a(t.getExtra()) == 3) && !C89219l.m154714a((Object) aVar.getExtra(), (Object) t.getExtra())) {
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private final void m129884a(String str, String str2) {
        Collection<AnchorPublishStruct> values;
        T t;
        ExtensionMisc extensionMisc = this.f165727d;
        if (extensionMisc == null) {
            C89219l.m154710a("extensionMisc");
        }
        String creationId = extensionMisc.getMobParam().getCreationId();
        Map<String, AnchorPublishStruct> c = AnchorListManager.m70437c();
        String str3 = null;
        if (!(c == null || (values = c.values()) == null)) {
            Iterator<T> it = values.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (t.type == EnumC31359ab.LIVE_EVENT.getTYPE()) {
                    break;
                }
            }
            T t2 = t;
            if (t2 != null) {
                str3 = t2.logExtra;
            }
        }
        C33744d dVar = new C33744d();
        dVar.mo59983a("anchor_entry", str).mo59983a("enter_from", "video_post_page").mo59983a("shoot_way", "live_event").mo59983a("creation_id", creationId).mo59983a("live_event_id", str2).mo59980a("is_auto", 1);
        if (!(str3 == null || str3.length() == 0)) {
            JSONObject jSONObject = new JSONObject(str3);
            Iterator<String> keys = jSONObject.keys();
            C89219l.m154716b(keys, "");
            while (keys.hasNext()) {
                String next = keys.next();
                dVar.mo59983a(next, jSONObject.get(next).toString());
            }
        }
        C39162r.m79460a("choose_anchor", dVar.f79943a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v35, types: [com.ss.android.ugc.aweme.ck$d] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r0v54, types: [com.ss.android.ugc.aweme.ck$d] */
    /* JADX WARN: Type inference failed for: r5v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a8, code lost:
        if (r1 != null) goto L_0x00c8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x02a5  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x0133 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x013a  */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo116266a(java.util.List<com.p2082ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct> r17, java.util.List<com.p2082ss.android.ugc.aweme.common.C39053a> r18) {
        /*
        // Method dump skipped, instructions count: 978
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.C73820x.mo116266a(java.util.List, java.util.List):void");
    }

    @Override // com.p2082ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onActivityResult(int i, int i2, Intent intent) {
        IAVPublishExtension.DefaultImpls.onActivityResult(this, i, i2, intent);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C89219l.m154721d(strArr, "");
        C89219l.m154721d(iArr, "");
        IAVPublishExtension.DefaultImpls.onRequestPermissionsResult(this, i, strArr, iArr);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onCreate(Fragment fragment, LinearLayout linearLayout, Bundle bundle, AVPublishContentType aVPublishContentType, PublishOutput publishOutput, ExtensionMisc extensionMisc, IAVPublishExtension.Callback callback) {
        String str;
        String str2;
        Map a;
        String str3;
        String str4;
        String str5;
        boolean z;
        MethodCollector.m26663i(8630);
        C89219l.m154721d(fragment, "");
        C89219l.m154721d(linearLayout, "");
        C89219l.m154721d(aVPublishContentType, "");
        C89219l.m154721d(publishOutput, "");
        C89219l.m154721d(extensionMisc, "");
        C89219l.m154721d(callback, "");
        this.f165726c = fragment;
        this.f165727d = extensionMisc;
        this.f165728e = aVPublishContentType;
        this.f165729f = publishOutput;
        extensionMisc.getExtensionDataRepo().getUpdateAnchors().observe(fragment, new C73825d(this));
        Context context = linearLayout.getContext();
        C89219l.m154716b(context, "");
        C36087ck ckVar = new C36087ck(context);
        linearLayout.addView(ckVar, -1, -2);
        linearLayout.getMinimumHeight();
        C13628n.m24520b(linearLayout.getContext(), 52.0f);
        this.f165725b = ckVar;
        ckVar.setClickable(false);
        C36087ck ckVar2 = this.f165725b;
        if (ckVar2 == null) {
            C89219l.m154710a("delegate");
        }
        ckVar2.setOnAddClickListener(new C73826e(this));
        EventBus.m156966a(EventBus.m156962a(), this);
        Map<String, AnchorPublishStruct> c = AnchorListManager.m70437c();
        if (c == null || c.isEmpty()) {
            C36087ck ckVar3 = this.f165725b;
            if (ckVar3 == null) {
                C89219l.m154710a("delegate");
            }
            LinearLayout linearLayout2 = ckVar3.f85273d;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(8);
            }
            LinearLayout linearLayout3 = ckVar3.f85275f;
            if (linearLayout3 != null) {
                linearLayout3.setVisibility(8);
            }
        }
        mo116267c();
        ArrayList arrayList = new ArrayList();
        List<C39053a> value = extensionMisc.getExtensionDataRepo().getUpdateAnchors().getValue();
        if (value != null) {
            Iterator<T> it = value.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        }
        AbstractC63199ax.AbstractC63200a publishExtensionDataContainer = extensionMisc.getPublishExtensionDataContainer();
        if (publishExtensionDataContainer != null) {
            str = publishExtensionDataContainer.mo101676a();
        } else {
            str = null;
        }
        PublishExtensionModel fromString = PublishExtensionModel.fromString(str);
        C89219l.m154716b(fromString, "");
        this.f165731h = fromString;
        if (fromString == null) {
            C89219l.m154710a("data");
        }
        List<CreateAnchorInfo> list = fromString.createAnchorInfos;
        if (list != null && !list.isEmpty()) {
            for (T t : list) {
                int type = t.getType();
                String content = t.getContent();
                if (content == null) {
                    content = "";
                }
                String keyword = t.getKeyword();
                if (keyword == null) {
                    keyword = "";
                }
                UrlModel urlModel = new UrlModel();
                urlModel.setUrlList(C89070n.m154525d(t.getIconUrl()));
                urlModel.setUri(Uri.decode(t.getIconUrl()));
                String url = t.getUrl();
                String language = t.getLanguage();
                Long addTime = t.getAddTime();
                String subtype = t.getSubtype();
                Boolean canDelete = t.getCanDelete();
                if (canDelete != null) {
                    z = canDelete.booleanValue();
                } else {
                    z = true;
                }
                arrayList.add(new C39053a(type, content, keyword, null, null, null, urlModel, z, url, language, addTime, null, subtype, 2104, null));
            }
        }
        PublishExtensionModel publishExtensionModel = this.f165731h;
        if (publishExtensionModel == null) {
            C89219l.m154710a("data");
        }
        if (publishExtensionModel.anchorBusinessType != EnumC31359ab.NO_TYPE.getTYPE()) {
            try {
                PublishExtensionModel publishExtensionModel2 = this.f165731h;
                if (publishExtensionModel2 == null) {
                    C89219l.m154710a("data");
                }
                String str6 = publishExtensionModel2.anchorContent;
                if (str6 == null) {
                    str6 = "";
                }
                str2 = new JSONObject(str6).optString("url");
                C89219l.m154716b(str2, "");
            } catch (Exception unused) {
                str2 = "";
            }
            PublishExtensionModel publishExtensionModel3 = this.f165731h;
            if (publishExtensionModel3 == null) {
                C89219l.m154710a("data");
            }
            if (publishExtensionModel3.anchorBusinessType == EnumC31359ab.WIKIPEDIA.getTYPE()) {
                C27910f a2 = C80342dg.m139300a();
                PublishExtensionModel publishExtensionModel4 = this.f165731h;
                if (publishExtensionModel4 == null) {
                    C89219l.m154710a("data");
                }
                C37623a aVar = (C37623a) a2.mo46670a(publishExtensionModel4.anchorContent, C37623a.class);
                if (aVar == null || (str5 = aVar.f88944b) == null) {
                    str5 = "";
                }
                PublishExtensionModel publishExtensionModel5 = this.f165731h;
                if (publishExtensionModel5 == null) {
                    C89219l.m154710a("data");
                }
                int i = publishExtensionModel5.anchorBusinessType;
                PublishExtensionModel publishExtensionModel6 = this.f165731h;
                if (publishExtensionModel6 == null) {
                    C89219l.m154710a("data");
                }
                String str7 = publishExtensionModel6.anchorContent;
                if (str7 == null) {
                    str7 = "";
                }
                C89219l.m154716b(str7, "");
                PublishExtensionModel publishExtensionModel7 = this.f165731h;
                if (publishExtensionModel7 == null) {
                    C89219l.m154710a("data");
                }
                String str8 = publishExtensionModel7.anchorTitle;
                if (str8 == null) {
                    str8 = "";
                }
                PublishExtensionModel publishExtensionModel8 = this.f165731h;
                if (publishExtensionModel8 == null) {
                    C89219l.m154710a("data");
                }
                String str9 = publishExtensionModel8.anchorTag;
                if (str9 == null) {
                    str9 = "";
                }
                PublishExtensionModel publishExtensionModel9 = this.f165731h;
                if (publishExtensionModel9 == null) {
                    C89219l.m154710a("data");
                }
                Integer valueOf = Integer.valueOf(publishExtensionModel9.source);
                PublishExtensionModel publishExtensionModel10 = this.f165731h;
                if (publishExtensionModel10 == null) {
                    C89219l.m154710a("data");
                }
                String str10 = publishExtensionModel10.anchorId;
                if (str10 == null) {
                    str10 = "";
                }
                PublishExtensionModel publishExtensionModel11 = this.f165731h;
                if (publishExtensionModel11 == null) {
                    C89219l.m154710a("data");
                }
                UrlModel urlModel2 = publishExtensionModel11.anchorIcon;
                Long valueOf2 = Long.valueOf(SystemClock.elapsedRealtime());
                PublishExtensionModel publishExtensionModel12 = this.f165731h;
                if (publishExtensionModel12 == null) {
                    C89219l.m154710a("data");
                }
                arrayList.add(new C39053a(i, str7, str8, str9, valueOf, str10, urlModel2, true, null, str5, valueOf2, null, publishExtensionModel12.anchorSubtype, 2304, null));
                PublishExtensionModel publishExtensionModel13 = this.f165731h;
                if (publishExtensionModel13 == null) {
                    C89219l.m154710a("data");
                }
                publishExtensionModel13.anchorBusinessType = EnumC31359ab.NO_TYPE.getTYPE();
                AbstractC63199ax.AbstractC63200a publishExtensionDataContainer2 = extensionMisc.getPublishExtensionDataContainer();
                if (publishExtensionDataContainer2 != null) {
                    PublishExtensionModel publishExtensionModel14 = this.f165731h;
                    if (publishExtensionModel14 == null) {
                        C89219l.m154710a("data");
                    }
                    publishExtensionDataContainer2.mo101679a(PublishExtensionModel.toString(publishExtensionModel14));
                }
            } else {
                PublishExtensionModel publishExtensionModel15 = this.f165731h;
                if (publishExtensionModel15 == null) {
                    C89219l.m154710a("data");
                }
                if (publishExtensionModel15.anchorBusinessType == EnumC31359ab.LIVE_EVENT.getTYPE()) {
                    PublishExtensionModel publishExtensionModel16 = this.f165731h;
                    if (publishExtensionModel16 == null) {
                        C89219l.m154710a("data");
                    }
                    if (C80537hk.m139613a(publishExtensionModel16.anchorContent)) {
                        PublishExtensionModel publishExtensionModel17 = this.f165731h;
                        if (publishExtensionModel17 == null) {
                            C89219l.m154710a("data");
                        }
                        try {
                            str3 = C80187aa.C80188a.m139012d(Long.parseLong(((CreateAnchorInfo) C80342dg.m139301a(publishExtensionModel17.anchorContent, CreateAnchorInfo.class)).getTime()));
                        } catch (Exception unused2) {
                            str3 = "";
                        }
                        try {
                            PublishExtensionModel publishExtensionModel18 = this.f165731h;
                            if (publishExtensionModel18 == null) {
                                C89219l.m154710a("data");
                            }
                            str4 = new JSONObject(publishExtensionModel18.anchorContent).getString("third_id");
                        } catch (Exception unused3) {
                            str4 = "";
                        }
                        String string = fragment.getResources().getString(R.string.boy);
                        if (string == null) {
                            string = "LIVE Events";
                        }
                        C89219l.m154716b(string, "");
                        PublishExtensionModel publishExtensionModel19 = this.f165731h;
                        if (publishExtensionModel19 == null) {
                            C89219l.m154710a("data");
                        }
                        int i2 = publishExtensionModel19.anchorBusinessType;
                        PublishExtensionModel publishExtensionModel20 = this.f165731h;
                        if (publishExtensionModel20 == null) {
                            C89219l.m154710a("data");
                        }
                        String str11 = publishExtensionModel20.anchorContent;
                        if (str11 == null) {
                            str11 = "";
                        }
                        C89219l.m154716b(str11, "");
                        PublishExtensionModel publishExtensionModel21 = this.f165731h;
                        if (publishExtensionModel21 == null) {
                            C89219l.m154710a("data");
                        }
                        String str12 = publishExtensionModel21.anchorTitle;
                        if (str12 == null) {
                            str12 = string + ": " + str3;
                        }
                        PublishExtensionModel publishExtensionModel22 = this.f165731h;
                        if (publishExtensionModel22 == null) {
                            C89219l.m154710a("data");
                        }
                        String str13 = publishExtensionModel22.anchorTag;
                        if (str13 == null) {
                            str13 = "";
                        }
                        PublishExtensionModel publishExtensionModel23 = this.f165731h;
                        if (publishExtensionModel23 == null) {
                            C89219l.m154710a("data");
                        }
                        Integer valueOf3 = Integer.valueOf(publishExtensionModel23.source);
                        PublishExtensionModel publishExtensionModel24 = this.f165731h;
                        if (publishExtensionModel24 == null) {
                            C89219l.m154710a("data");
                        }
                        String str14 = publishExtensionModel24.anchorId;
                        if (str14 == null) {
                            str14 = "";
                        }
                        PublishExtensionModel publishExtensionModel25 = this.f165731h;
                        if (publishExtensionModel25 == null) {
                            C89219l.m154710a("data");
                        }
                        UrlModel urlModel3 = publishExtensionModel25.anchorIcon;
                        PublishExtensionModel publishExtensionModel26 = this.f165731h;
                        if (publishExtensionModel26 == null) {
                            C89219l.m154710a("data");
                        }
                        arrayList.add(new C39053a(i2, str11, str12, str13, valueOf3, str14, urlModel3, false, null, null, null, null, publishExtensionModel26.anchorSubtype, 3968, null));
                        C89219l.m154716b(str4, "");
                        m129884a(string, str4);
                        PublishExtensionModel publishExtensionModel27 = this.f165731h;
                        if (publishExtensionModel27 == null) {
                            C89219l.m154710a("data");
                        }
                        publishExtensionModel27.anchorBusinessType = EnumC31359ab.NO_TYPE.getTYPE();
                        AbstractC63199ax.AbstractC63200a publishExtensionDataContainer3 = extensionMisc.getPublishExtensionDataContainer();
                        if (publishExtensionDataContainer3 != null) {
                            PublishExtensionModel publishExtensionModel28 = this.f165731h;
                            if (publishExtensionModel28 == null) {
                                C89219l.m154710a("data");
                            }
                            publishExtensionDataContainer3.mo101679a(PublishExtensionModel.toString(publishExtensionModel28));
                        }
                    }
                }
                PublishExtensionModel publishExtensionModel29 = this.f165731h;
                if (publishExtensionModel29 == null) {
                    C89219l.m154710a("data");
                }
                String str15 = publishExtensionModel29.anchorContent;
                if (str15 == null || (a = (HashMap) C80342dg.m139300a().mo46670a(str15, (Class) new HashMap().getClass())) == null) {
                    a = C89041ag.m154415a();
                }
                if (!C89219l.m154714a(a.get("common_type"), (Object) true)) {
                    PublishExtensionModel publishExtensionModel30 = this.f165731h;
                    if (publishExtensionModel30 == null) {
                        C89219l.m154710a("data");
                    }
                    int i3 = publishExtensionModel30.anchorBusinessType;
                    PublishExtensionModel publishExtensionModel31 = this.f165731h;
                    if (publishExtensionModel31 == null) {
                        C89219l.m154710a("data");
                    }
                    String str16 = publishExtensionModel31.anchorContent;
                    if (str16 == null) {
                        str16 = "";
                    }
                    C89219l.m154716b(str16, "");
                    PublishExtensionModel publishExtensionModel32 = this.f165731h;
                    if (publishExtensionModel32 == null) {
                        C89219l.m154710a("data");
                    }
                    String str17 = publishExtensionModel32.anchorTitle;
                    if (str17 == null) {
                        str17 = "";
                    }
                    PublishExtensionModel publishExtensionModel33 = this.f165731h;
                    if (publishExtensionModel33 == null) {
                        C89219l.m154710a("data");
                    }
                    String str18 = publishExtensionModel33.anchorTag;
                    if (str18 == null) {
                        str18 = "";
                    }
                    PublishExtensionModel publishExtensionModel34 = this.f165731h;
                    if (publishExtensionModel34 == null) {
                        C89219l.m154710a("data");
                    }
                    Integer valueOf4 = Integer.valueOf(publishExtensionModel34.source);
                    PublishExtensionModel publishExtensionModel35 = this.f165731h;
                    if (publishExtensionModel35 == null) {
                        C89219l.m154710a("data");
                    }
                    String str19 = publishExtensionModel35.anchorId;
                    if (str19 == null) {
                        str19 = "";
                    }
                    PublishExtensionModel publishExtensionModel36 = this.f165731h;
                    if (publishExtensionModel36 == null) {
                        C89219l.m154710a("data");
                    }
                    UrlModel urlModel4 = publishExtensionModel36.anchorIcon;
                    Long valueOf5 = Long.valueOf(SystemClock.elapsedRealtime());
                    PublishExtensionModel publishExtensionModel37 = this.f165731h;
                    if (publishExtensionModel37 == null) {
                        C89219l.m154710a("data");
                    }
                    arrayList.add(new C39053a(i3, str16, str17, str18, valueOf4, str19, urlModel4, true, str2, null, valueOf5, null, publishExtensionModel37.anchorSubtype, 2560, null));
                    PublishExtensionModel publishExtensionModel38 = this.f165731h;
                    if (publishExtensionModel38 == null) {
                        C89219l.m154710a("data");
                    }
                    publishExtensionModel38.anchorBusinessType = EnumC31359ab.NO_TYPE.getTYPE();
                    AbstractC63199ax.AbstractC63200a publishExtensionDataContainer4 = extensionMisc.getPublishExtensionDataContainer();
                    if (publishExtensionDataContainer4 != null) {
                        PublishExtensionModel publishExtensionModel39 = this.f165731h;
                        if (publishExtensionModel39 == null) {
                            C89219l.m154710a("data");
                        }
                        publishExtensionDataContainer4.mo101679a(PublishExtensionModel.toString(publishExtensionModel39));
                    }
                }
            }
        }
        ActivityC0945e activity = fragment.getActivity();
        if (activity != null) {
            activity.runOnUiThread(new RunnableC73827f(this, extensionMisc, arrayList));
        }
        if (C33497b.m68620a()) {
            setLeftIcon(2131232668);
            setRightIcon(C23005c.m43393a(new C73828g(fragment)));
            ViewGroup anchorListContent = getAnchorListContent();
            if (anchorListContent != null) {
                ViewGroup.LayoutParams layoutParams = anchorListContent.getLayoutParams();
                if (layoutParams != null) {
                    RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                    Resources system = Resources.getSystem();
                    C89219l.m154709a((Object) system, "");
                    layoutParams2.setMarginStart(C89241a.m154730a(TypedValue.applyDimension(1, 16.0f, system.getDisplayMetrics())));
                    anchorListContent.setLayoutParams(layoutParams2);
                } else {
                    NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                    MethodCollector.m26664o(8630);
                    throw nullPointerException;
                }
            }
        }
        MethodCollector.m26664o(8630);
    }
}
