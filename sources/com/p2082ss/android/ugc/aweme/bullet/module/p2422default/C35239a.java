package com.p2082ss.android.ugc.aweme.bullet.module.p2422default;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16183k;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.web.p1285a.AbstractC18293d;
import com.bytedance.ies.web.p1285a.C18288a;
import com.bytedance.ies.xbridge.model.p1341b.C18742c;
import com.bytedance.ies.xbridge.platform.lynx.C18842b;
import com.bytedance.ies.xbridge.platform.p1350a.p1351a.C18811a;
import com.bytedance.ies.xbridge.platform.p1352b.C18829c;
import com.p2082ss.android.sdk.webview.p2175a.C30238d;
import com.p2082ss.android.sdk.webview.p2175a.C30242g;
import com.p2082ss.android.sdk.webview.p2175a.C30243h;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.bullet.bridge.commerce.AdInfoMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.commerce.AsyncGoodsEditInfoMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.commerce.FetchFeedsAwemeDataMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.commerce.OpenECommerceLegalModalMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.commerce.OpenGoodDetailMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.commerce.PayMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.commerce.TaoCommandMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.commerce.WXMiniPayMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.common.AppInstalledMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.common.BdturingMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.common.BindPhoneMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.common.BroadcastMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.common.CloseCurrentPanelMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.common.CopyContentMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.common.FetchMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.common.FileSelectionMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.common.GalleryPreviewMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.common.GetAbTestMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.common.GetNativeItemMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.common.GetSettingsMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.common.GetThemeMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.common.InitPIPOSdkMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.common.IsAppInstalledMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.common.LaunchChatMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.common.LoginMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.common.LoginWithPlatform;
import com.p2082ss.android.ugc.aweme.bullet.bridge.common.LogoutMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.common.MiniAppPreloadMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.common.NoticePermissionMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.common.OpenAdPanelPageMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.common.OpenCalendarMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.common.OpenPhoneAreaMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.common.OpenScanMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.common.ReloadMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.common.RequestMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.common.SetNativeItemMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.common.SetScrollTopMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.common.ShareOpenPlatformMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.common.ShowDmtToastMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.common.UploadFileMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.framework.AppInfoMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.framework.BulletGetAppInfoMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.framework.BulletUserInfoMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.framework.CloseMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.framework.ComponentDidMountMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.framework.DarkModeMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.framework.GetAppInfoMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.framework.GetContainerIdMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.framework.LoadFeedsFlowMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.framework.LoadFeedsMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.framework.MonitorLogMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.framework.OpenAwemeDetailMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.framework.OpenBrowserMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.framework.OpenFeedsFlowMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.framework.OpenHalfDialogMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.framework.OpenLongVideoMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.framework.OpenSchemaMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.framework.OpenShortVideoMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.framework.RecordParamMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.framework.ReportCustomEventMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.framework.RoutePopMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.framework.RoutePushMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.framework.SendLogMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.framework.SendLogV3Method;
import com.p2082ss.android.ugc.aweme.bullet.bridge.framework.SetStatusBarMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.framework.ShowToastMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.framework.UserInfoMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.main.CardRelayoutMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.p2412a.C34968a;
import com.p2082ss.android.ugc.aweme.bullet.bridge.p2413ad.AdThirdTrackMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.p2413ad.DownloadAppClickMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.p2413ad.FeedLearnMoreButtonClick;
import com.p2082ss.android.ugc.aweme.bullet.bridge.p2413ad.LoadGeckoResourcesMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.p2413ad.LocalPhoneNoMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.p2413ad.MessageTipMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.p2413ad.OpenAdUrlMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.p2413ad.OpenRechargePanel;
import com.p2082ss.android.ugc.aweme.bullet.bridge.p2413ad.SendAdLogMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.p2413ad.StartFeedButtonAnimationMethod;
import com.p2082ss.android.ugc.aweme.bullet.bridge.p2413ad.VideoFollowButtonClick;
import com.p2082ss.android.ugc.aweme.bullet.bridge.p2413ad.VideoFollowStatus;
import com.p2082ss.android.ugc.aweme.bullet.utils.C35300b;
import com.p2082ss.android.ugc.aweme.commercialize.e_commerce.service.ShoppingAdsServiceImpl;
import com.p2082ss.android.ugc.aweme.component.music.MusicService;
import com.p2082ss.android.ugc.aweme.ecommerce.ECommerceService;
import com.p2082ss.android.ugc.aweme.i18n.xbridge.p3065b.C53517a;
import com.p2082ss.android.ugc.aweme.i18n.xbridge.p3067c.C53556a;
import com.p2082ss.android.ugc.aweme.influencer.ECommerceLiveBridgeMethodServiceImpl;
import com.p2082ss.android.ugc.aweme.p2929fe.method.DownloadFileMethod;
import com.p2082ss.android.ugc.aweme.search.C67446h;
import com.p2082ss.android.ugc.aweme.service.EOYServiceImpl;
import com.p2082ss.android.ugc.aweme.service.IEOYService;
import com.p2082ss.android.ugc.aweme.share.ShareH5Service;
import com.p2082ss.android.ugc.aweme.tcm.impl.anchor.GetContainerDataMethod;
import com.p2082ss.android.ugc.aweme.web.jsbridge.C81595aa;
import com.p2082ss.android.ugc.aweme.web.jsbridge.C81604e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.module.default.a */
public final class C35239a {

    /* renamed from: a */
    public static final C35239a f83253a = new C35239a();

    private C35239a() {
    }

    static {
        Covode.recordClassIndex(42404);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.bullet.module.default.a$a */
    public static final class C35240a extends AbstractC89220m implements AbstractC89172b<C16248b, AbstractC16183k> {

        /* renamed from: a */
        public static final C35240a f83254a = new C35240a();

        static {
            Covode.recordClassIndex(42405);
        }

        C35240a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AbstractC16183k invoke(C16248b bVar) {
            C16248b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            return new CloseMethod(bVar2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.bullet.module.default.a$aa */
    public static final class C35241aa extends AbstractC89220m implements AbstractC89172b<C16248b, AbstractC16183k> {

        /* renamed from: a */
        public static final C35241aa f83255a = new C35241aa();

        static {
            Covode.recordClassIndex(42406);
        }

        C35241aa() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AbstractC16183k invoke(C16248b bVar) {
            C16248b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            return new MonitorLogMethod(bVar2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.bullet.module.default.a$ab */
    public static final class C35242ab extends AbstractC89220m implements AbstractC89172b<C16248b, AbstractC16183k> {

        /* renamed from: a */
        public static final C35242ab f83256a = new C35242ab();

        static {
            Covode.recordClassIndex(42407);
        }

        C35242ab() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AbstractC16183k invoke(C16248b bVar) {
            C16248b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            return new OpenSchemaMethod(bVar2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.bullet.module.default.a$ac */
    public static final class C35243ac extends AbstractC89220m implements AbstractC89172b<C16248b, AbstractC16183k> {

        /* renamed from: a */
        public static final C35243ac f83257a = new C35243ac();

        static {
            Covode.recordClassIndex(42408);
        }

        C35243ac() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AbstractC16183k invoke(C16248b bVar) {
            C16248b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            return ShareH5Service.C68827a.m121397a().mo109372a(bVar2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.bullet.module.default.a$ad */
    public static final class C35244ad extends AbstractC89220m implements AbstractC89172b<C16248b, AbstractC16183k> {

        /* renamed from: a */
        public static final C35244ad f83258a = new C35244ad();

        static {
            Covode.recordClassIndex(42409);
        }

        C35244ad() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AbstractC16183k invoke(C16248b bVar) {
            C16248b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            return ShareH5Service.C68827a.m121397a().mo109383b(bVar2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.bullet.module.default.a$ae */
    public static final class C35245ae extends AbstractC89220m implements AbstractC89172b<C16248b, AbstractC16183k> {

        /* renamed from: a */
        public static final C35245ae f83259a = new C35245ae();

        static {
            Covode.recordClassIndex(42410);
        }

        C35245ae() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AbstractC16183k invoke(C16248b bVar) {
            C16248b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            return new ShowToastMethod(bVar2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.bullet.module.default.a$b */
    public static final class C35246b extends AbstractC89220m implements AbstractC89172b<C16248b, AbstractC16183k> {

        /* renamed from: a */
        public static final C35246b f83260a = new C35246b();

        static {
            Covode.recordClassIndex(42411);
        }

        C35246b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AbstractC16183k invoke(C16248b bVar) {
            C16248b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            return new OpenBrowserMethod(bVar2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.bullet.module.default.a$c */
    public static final class C35247c extends AbstractC89220m implements AbstractC89172b<C16248b, AbstractC16183k> {

        /* renamed from: a */
        public static final C35247c f83261a = new C35247c();

        static {
            Covode.recordClassIndex(42412);
        }

        C35247c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AbstractC16183k invoke(C16248b bVar) {
            C16248b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            return new AppInfoMethod(bVar2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.bullet.module.default.a$d */
    public static final class C35248d extends AbstractC89220m implements AbstractC89172b<C16248b, AbstractC16183k> {

        /* renamed from: a */
        public static final C35248d f83262a = new C35248d();

        static {
            Covode.recordClassIndex(42413);
        }

        C35248d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AbstractC16183k invoke(C16248b bVar) {
            C16248b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            return new GetAppInfoMethod(bVar2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.bullet.module.default.a$e */
    public static final class C35249e extends AbstractC89220m implements AbstractC89172b<C16248b, AbstractC16183k> {

        /* renamed from: a */
        public static final C35249e f83263a = new C35249e();

        static {
            Covode.recordClassIndex(42414);
        }

        C35249e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AbstractC16183k invoke(C16248b bVar) {
            C16248b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            return new ComponentDidMountMethod(bVar2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.bullet.module.default.a$f */
    public static final class C35250f extends AbstractC89220m implements AbstractC89172b<C16248b, AbstractC16183k> {

        /* renamed from: a */
        public static final C35250f f83264a = new C35250f();

        static {
            Covode.recordClassIndex(42415);
        }

        C35250f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AbstractC16183k invoke(C16248b bVar) {
            C16248b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            return new LoadFeedsFlowMethod(bVar2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.bullet.module.default.a$g */
    public static final class C35251g extends AbstractC89220m implements AbstractC89172b<C16248b, AbstractC16183k> {

        /* renamed from: a */
        public static final C35251g f83265a = new C35251g();

        static {
            Covode.recordClassIndex(42416);
        }

        C35251g() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AbstractC16183k invoke(C16248b bVar) {
            C16248b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            return new OpenFeedsFlowMethod(bVar2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.bullet.module.default.a$h */
    public static final class C35252h extends AbstractC89220m implements AbstractC89172b<C16248b, AbstractC16183k> {

        /* renamed from: a */
        public static final C35252h f83266a = new C35252h();

        static {
            Covode.recordClassIndex(42417);
        }

        C35252h() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AbstractC16183k invoke(C16248b bVar) {
            C16248b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            return new OpenAwemeDetailMethod(bVar2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.bullet.module.default.a$i */
    public static final class C35253i extends AbstractC89220m implements AbstractC89172b<C16248b, AbstractC16183k> {

        /* renamed from: a */
        public static final C35253i f83267a = new C35253i();

        static {
            Covode.recordClassIndex(42418);
        }

        C35253i() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AbstractC16183k invoke(C16248b bVar) {
            C16248b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            return new LoadFeedsMethod(bVar2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.bullet.module.default.a$j */
    public static final class C35254j extends AbstractC89220m implements AbstractC89172b<C16248b, AbstractC16183k> {

        /* renamed from: a */
        public static final C35254j f83268a = new C35254j();

        static {
            Covode.recordClassIndex(42419);
        }

        C35254j() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AbstractC16183k invoke(C16248b bVar) {
            C16248b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            return new DarkModeMethod(bVar2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.bullet.module.default.a$k */
    public static final class C35255k extends AbstractC89220m implements AbstractC89172b<C16248b, AbstractC16183k> {

        /* renamed from: a */
        public static final C35255k f83269a = new C35255k();

        static {
            Covode.recordClassIndex(42420);
        }

        C35255k() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AbstractC16183k invoke(C16248b bVar) {
            C16248b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            return new RoutePopMethod(bVar2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.bullet.module.default.a$l */
    public static final class C35256l extends AbstractC89220m implements AbstractC89172b<C16248b, AbstractC16183k> {

        /* renamed from: a */
        public static final C35256l f83270a = new C35256l();

        static {
            Covode.recordClassIndex(42421);
        }

        C35256l() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AbstractC16183k invoke(C16248b bVar) {
            C16248b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            return new UserInfoMethod(bVar2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.bullet.module.default.a$m */
    public static final class C35257m extends AbstractC89220m implements AbstractC89172b<C16248b, AbstractC16183k> {

        /* renamed from: a */
        public static final C35257m f83271a = new C35257m();

        static {
            Covode.recordClassIndex(42422);
        }

        C35257m() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AbstractC16183k invoke(C16248b bVar) {
            C16248b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            return new RoutePushMethod(bVar2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.bullet.module.default.a$n */
    public static final class C35258n extends AbstractC89220m implements AbstractC89172b<C16248b, AbstractC16183k> {

        /* renamed from: a */
        public static final C35258n f83272a = new C35258n();

        static {
            Covode.recordClassIndex(42423);
        }

        C35258n() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AbstractC16183k invoke(C16248b bVar) {
            C16248b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            return new OpenShortVideoMethod(bVar2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.bullet.module.default.a$o */
    public static final class C35259o extends AbstractC89220m implements AbstractC89172b<C16248b, AbstractC16183k> {

        /* renamed from: a */
        public static final C35259o f83273a = new C35259o();

        static {
            Covode.recordClassIndex(42424);
        }

        C35259o() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AbstractC16183k invoke(C16248b bVar) {
            C16248b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            return new OpenLongVideoMethod(bVar2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.bullet.module.default.a$p */
    public static final class C35260p extends AbstractC89220m implements AbstractC89172b<C16248b, AbstractC16183k> {

        /* renamed from: a */
        public static final C35260p f83274a = new C35260p();

        static {
            Covode.recordClassIndex(42425);
        }

        C35260p() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AbstractC16183k invoke(C16248b bVar) {
            C16248b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            return new OpenHalfDialogMethod(bVar2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.bullet.module.default.a$q */
    public static final class C35261q extends AbstractC89220m implements AbstractC89172b<C16248b, AbstractC16183k> {

        /* renamed from: a */
        public static final C35261q f83275a = new C35261q();

        static {
            Covode.recordClassIndex(42426);
        }

        C35261q() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AbstractC16183k invoke(C16248b bVar) {
            C16248b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            return new BulletUserInfoMethod(bVar2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.bullet.module.default.a$r */
    public static final class C35262r extends AbstractC89220m implements AbstractC89172b<C16248b, AbstractC16183k> {

        /* renamed from: a */
        public static final C35262r f83276a = new C35262r();

        static {
            Covode.recordClassIndex(42427);
        }

        C35262r() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AbstractC16183k invoke(C16248b bVar) {
            C16248b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            return new BulletGetAppInfoMethod(bVar2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.bullet.module.default.a$s */
    public static final class C35263s extends AbstractC89220m implements AbstractC89172b<C16248b, AbstractC16183k> {

        /* renamed from: a */
        public static final C35263s f83277a = new C35263s();

        static {
            Covode.recordClassIndex(42428);
        }

        C35263s() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AbstractC16183k invoke(C16248b bVar) {
            C16248b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            return new RecordParamMethod(bVar2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.bullet.module.default.a$t */
    public static final class C35264t extends AbstractC89220m implements AbstractC89172b<C16248b, AbstractC16183k> {

        /* renamed from: a */
        public static final C35264t f83278a = new C35264t();

        static {
            Covode.recordClassIndex(42429);
        }

        C35264t() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AbstractC16183k invoke(C16248b bVar) {
            C16248b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            return new ReportCustomEventMethod(bVar2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.bullet.module.default.a$u */
    public static final class C35265u extends AbstractC89220m implements AbstractC89172b<C16248b, AbstractC16183k> {

        /* renamed from: a */
        public static final C35265u f83279a = new C35265u();

        static {
            Covode.recordClassIndex(42430);
        }

        C35265u() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AbstractC16183k invoke(C16248b bVar) {
            C16248b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            return new GetContainerIdMethod(bVar2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.bullet.module.default.a$v */
    public static final class C35266v extends AbstractC89220m implements AbstractC89172b<C16248b, AbstractC16183k> {

        /* renamed from: a */
        public static final C35266v f83280a = new C35266v();

        static {
            Covode.recordClassIndex(42431);
        }

        C35266v() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AbstractC16183k invoke(C16248b bVar) {
            C16248b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            return new LoadGeckoResourcesMethod(bVar2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.bullet.module.default.a$w */
    public static final class C35267w extends AbstractC89220m implements AbstractC89172b<C16248b, AbstractC16183k> {

        /* renamed from: a */
        public static final C35267w f83281a = new C35267w();

        static {
            Covode.recordClassIndex(42432);
        }

        C35267w() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AbstractC16183k invoke(C16248b bVar) {
            C16248b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            return new SendLogMethod(bVar2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.bullet.module.default.a$x */
    public static final class C35268x extends AbstractC89220m implements AbstractC89172b<C16248b, AbstractC16183k> {

        /* renamed from: a */
        public static final C35268x f83282a = new C35268x();

        static {
            Covode.recordClassIndex(42433);
        }

        C35268x() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AbstractC16183k invoke(C16248b bVar) {
            C16248b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            return new ShareOpenPlatformMethod(bVar2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.bullet.module.default.a$y */
    public static final class C35269y extends AbstractC89220m implements AbstractC89172b<C16248b, AbstractC16183k> {

        /* renamed from: a */
        public static final C35269y f83283a = new C35269y();

        static {
            Covode.recordClassIndex(42434);
        }

        C35269y() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AbstractC16183k invoke(C16248b bVar) {
            C16248b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            return new SetStatusBarMethod(bVar2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.bullet.module.default.a$z */
    public static final class C35270z extends AbstractC89220m implements AbstractC89172b<C16248b, AbstractC16183k> {

        /* renamed from: a */
        public static final C35270z f83284a = new C35270z();

        static {
            Covode.recordClassIndex(42435);
        }

        C35270z() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AbstractC16183k invoke(C16248b bVar) {
            C16248b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            return new SendLogV3Method(bVar2);
        }
    }

    /* renamed from: e */
    private static List<AbstractC16183k> m72176e(C16248b bVar) {
        return C89070n.m154516a(new CardRelayoutMethod(bVar));
    }

    /* renamed from: g */
    private static List<AbstractC16183k> m72178g(C16248b bVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new DownloadAppClickMethod(bVar));
        arrayList.add(new GetContainerDataMethod(bVar));
        return arrayList;
    }

    /* renamed from: d */
    private static List<AbstractC16183k> m72175d(C16248b bVar) {
        C53517a.m98737a();
        C53556a.m98767a();
        C18742c cVar = new C18742c();
        cVar.mo29770a(Context.class, bVar.mo25832c(Context.class));
        cVar.mo29770a(C16248b.class, bVar);
        return C18811a.m34906a(cVar, bVar, C89070n.m154522b(new C18842b(), new C18829c()));
    }

    /* renamed from: f */
    private static List<AbstractC16183k> m72177f(C16248b bVar) {
        return C89070n.m154522b(new AsyncGoodsEditInfoMethod(bVar), new OpenGoodDetailMethod(bVar), new FetchFeedsAwemeDataMethod(bVar), new PayMethod(bVar), new WXMiniPayMethod(bVar), new OpenECommerceLegalModalMethod(bVar), new TaoCommandMethod(bVar), new AdInfoMethod(bVar), new CloseCurrentPanelMethod(bVar));
    }

    /* renamed from: h */
    private static List<AbstractC16183k> m72179h(C16248b bVar) {
        ArrayList arrayList = new ArrayList();
        C18288a aVar = (C18288a) bVar.mo25832c(C18288a.class);
        Object c = bVar.mo25832c(Context.class);
        if (!(aVar == null || c == null)) {
            arrayList.add(C35300b.m72243a(bVar, "openAweme", new C81604e(new WeakReference(c), aVar), AbstractC16183k.EnumC16184a.PROTECT));
            arrayList.add(C35300b.m72243a(bVar, "openRecord", new C81595aa(new WeakReference(c), aVar), AbstractC16183k.EnumC16184a.PROTECT));
            arrayList.add(C35300b.m72243a(bVar, "downloadMedia", new DownloadFileMethod(aVar).attach(new WeakReference<>(c)), AbstractC16183k.EnumC16184a.PROTECT));
        }
        return arrayList;
    }

    /* renamed from: i */
    private static List<AbstractC16183k> m72180i(C16248b bVar) {
        Map<String, AbstractC18293d> javaMethods;
        ArrayList arrayList = new ArrayList();
        C18288a aVar = (C18288a) bVar.mo25832c(C18288a.class);
        Object c = bVar.mo25832c(Context.class);
        if (!(aVar == null || c == null || (javaMethods = C31575b.m65866h().getJavaMethods(new WeakReference<>(c), aVar)) == null)) {
            for (Map.Entry<String, AbstractC18293d> entry : javaMethods.entrySet()) {
                if (!TextUtils.equals(entry.getKey(), "localPhoneNo")) {
                    String key = entry.getKey();
                    C89219l.m154716b(key, "");
                    AbstractC18293d value = entry.getValue();
                    C89219l.m154716b(value, "");
                    arrayList.add(C35300b.m72242a(bVar, key, value));
                }
            }
        }
        arrayList.add(new LocalPhoneNoMethod(bVar));
        return arrayList;
    }

    /* renamed from: j */
    private static List<AbstractC16183k> m72181j(C16248b bVar) {
        ArrayList arrayList = new ArrayList();
        Object c = bVar.mo25832c(C18288a.class);
        Object c2 = bVar.mo25832c(Context.class);
        if (!(c == null || c2 == null)) {
            arrayList.add(C35300b.m72243a(bVar, "copyToClipboard", new C30238d(new WeakReference(c2)), AbstractC16183k.EnumC16184a.PROTECT));
            if (SettingsManager.m29616a().mo25400a("jsb_open_third_app", false)) {
                arrayList.add(C35300b.m72243a(bVar, "openThirdApp", new C30243h(new WeakReference(c2)), AbstractC16183k.EnumC16184a.PROTECT));
            }
            arrayList.add(C35300b.m72243a(bVar, "open", new C30242g(new WeakReference(c2)), AbstractC16183k.EnumC16184a.PROTECT));
        }
        return arrayList;
    }

    /* renamed from: k */
    private static List<AbstractC16183k> m72182k(C16248b bVar) {
        return C89070n.m154522b(new SendAdLogMethod(bVar), new MessageTipMethod(bVar), new OpenAdUrlMethod(bVar), new AdThirdTrackMethod(bVar), new StartFeedButtonAnimationMethod(bVar), new FeedLearnMoreButtonClick(bVar), new VideoFollowButtonClick(bVar), new VideoFollowStatus(bVar));
    }

    /* renamed from: a */
    public static List<AbstractC16183k> m72172a(C16248b bVar) {
        List<AbstractC16183k> list;
        C89219l.m154721d(bVar, "");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(m72174c(bVar));
        arrayList.addAll(m72175d(bVar));
        arrayList.addAll(m72173b(bVar));
        arrayList.addAll(m72176e(bVar));
        List<AbstractC16183k> a = MusicService.m81198m().mo69298a(bVar);
        C89219l.m154716b(a, "");
        arrayList.addAll(a);
        arrayList.addAll(C67446h.f151111a.mo106194a(bVar));
        arrayList.addAll(m72177f(bVar));
        arrayList.addAll(m72178g(bVar));
        arrayList.addAll(ECommerceLiveBridgeMethodServiceImpl.m102573a().mo93513a(bVar));
        arrayList.addAll(m72179h(bVar));
        arrayList.addAll(m72180i(bVar));
        arrayList.addAll(m72181j(bVar));
        arrayList.addAll(m72182k(bVar));
        arrayList.addAll(C34968a.m71442a(bVar));
        arrayList.addAll(ECommerceService.createIECommerceServicebyMonsterPlugin(false).getJSMethods(bVar));
        arrayList.addAll(ShoppingAdsServiceImpl.m76354d().mo65744a(bVar));
        IEOYService b = EOYServiceImpl.m120048b();
        if (b == null || (list = b.mo106956a(bVar)) == null) {
            list = C89086z.INSTANCE;
        }
        arrayList.addAll(list);
        return arrayList;
    }

    /* renamed from: b */
    private static List<AbstractC16183k> m72173b(C16248b bVar) {
        return C89070n.m154522b(new BridgeProxy("close", bVar, C35240a.f83254a), new BridgeProxy("userInfo", bVar, C35256l.f83270a), new BridgeProxy("sendLog", bVar, C35267w.f83281a), new BridgeProxy("sendLogV3", bVar, C35270z.f83284a), new BridgeProxy("monitorLog", bVar, C35241aa.f83255a), new BridgeProxy("openSchema", bVar, C35242ab.f83256a), new BridgeProxy("share", bVar, C35243ac.f83257a), new BridgeProxy("shareSearch", bVar, C35244ad.f83258a), new BridgeProxy("showToast", bVar, C35245ae.f83259a), new BridgeProxy("openBrowser", bVar, C35246b.f83260a), new BridgeProxy("appInfo", bVar, C35247c.f83261a), new BridgeProxy("getAppInfo", bVar, C35248d.f83262a), new BridgeProxy("componentDidMount", bVar, C35249e.f83263a), new BridgeProxy("loadFeedsFlow", bVar, C35250f.f83264a), new BridgeProxy("openFeedsFlow", bVar, C35251g.f83265a), new BridgeProxy("openAwemeDetail", bVar, C35252h.f83266a), new BridgeProxy("loadFeeds", bVar, C35253i.f83267a), new BridgeProxy("darkMode", bVar, C35254j.f83268a), new BridgeProxy("routePop", bVar, C35255k.f83269a), new BridgeProxy("routePush", bVar, C35257m.f83271a), new BridgeProxy("open_short_video", bVar, C35258n.f83272a), new BridgeProxy("open_long_video", bVar, C35259o.f83273a), new BridgeProxy("openHalfDialog", bVar, C35260p.f83274a), new BridgeProxy("uniUserInfo", bVar, C35261q.f83275a), new BridgeProxy("uniAppInfo", bVar, C35262r.f83276a), new BridgeProxy("openRecord", bVar, C35263s.f83277a), new BridgeProxy("reportCustomEvent", bVar, C35264t.f83278a), new BridgeProxy("getContainerId", bVar, C35265u.f83279a), new BridgeProxy("loadGeckoResources", bVar, C35266v.f83280a), new BridgeProxy("shareOpenPlatform", bVar, C35268x.f83282a), new BridgeProxy("setStatusBar", bVar, C35269y.f83283a));
    }

    /* renamed from: c */
    private static List<AbstractC16183k> m72174c(C16248b bVar) {
        return C89070n.m154522b(new FetchMethod(bVar), new RequestMethod(bVar), new GetNativeItemMethod(bVar), new SetNativeItemMethod(bVar), new GetSettingsMethod(bVar), new BroadcastMethod(bVar), new InitPIPOSdkMethod(bVar), new SetScrollTopMethod(bVar), new ShowDmtToastMethod(bVar), new OpenBrowserMethod(bVar), new UploadFileMethod(bVar), new GalleryPreviewMethod(bVar), new OpenScanMethod(bVar), new FileSelectionMethod(bVar), new BindPhoneMethod(bVar), new IsAppInstalledMethod(bVar), new NoticePermissionMethod(bVar), new LoginMethod(bVar), new LoginWithPlatform(bVar), new LogoutMethod(bVar), new MiniAppPreloadMethod(bVar), new OpenPhoneAreaMethod(bVar), new OpenRechargePanel(bVar), new GetAbTestMethod(bVar), new ReloadMethod(bVar), new CopyContentMethod(bVar), new GetThemeMethod(bVar), new OpenAdPanelPageMethod(bVar), new OpenCalendarMethod(bVar), new BdturingMethod(bVar), new LaunchChatMethod(bVar), new AppInstalledMethod(bVar));
    }
}
