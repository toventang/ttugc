package com.p2082ss.android.ugc.aweme.live.livehostimpl;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.app.ActivityC0218d;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.android.livesdk.model.AbstractC9514aa;
import com.bytedance.android.livesdkapi.depend.AbstractC11622a;
import com.bytedance.android.livesdkapi.depend.AbstractC11624b;
import com.bytedance.android.livesdkapi.host.AbstractC11818m;
import com.bytedance.android.livesdkapi.host.AbstractC11819n;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.android.livesdkapi.host.p694b.AbstractC11798a;
import com.bytedance.android.livesdkapi.p691g.AbstractC11763d;
import com.bytedance.android.livesdkapi.p691g.AbstractC11764e;
import com.bytedance.android.livesdkapi.view.AbstractC11872a;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.p1469l.C20688a;
import com.facebook.drawee.p1845a.p1846a.C24182c;
import com.facebook.drawee.p1845a.p1846a.C24185e;
import com.facebook.drawee.view.C24262c;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.common.C24361b;
import com.facebook.imagepipeline.common.C24364e;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.facebook.imagepipeline.p1890o.C24639c;
import com.google.p1998c.p1999a.AbstractC27255q;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService;
import com.p2082ss.android.ugc.aweme.compliance.business.serviceimpl.BanAppealServiceImpl;
import com.p2082ss.android.ugc.aweme.framework.services.IStickerService;
import com.p2082ss.android.ugc.aweme.language.C58071d;
import com.p2082ss.android.ugc.aweme.live.AbstractC58634g;
import com.p2082ss.android.ugc.aweme.live.ILiveHostOuterService;
import com.p2082ss.android.ugc.aweme.live.LiveHostOuterService;
import com.p2082ss.android.ugc.aweme.profile.AbstractC63755f;
import com.p2082ss.android.ugc.aweme.profile.IProfileService;
import com.p2082ss.android.ugc.aweme.profile.ProfileServiceImpl;
import com.p2082ss.android.ugc.aweme.sticker.IStickerViewService;
import com.p2082ss.android.ugc.aweme.sticker.p3967n.AbstractC75448a;
import com.p2082ss.android.ugc.aweme.tools.live.sticker.StickerViewServiceImpl;
import com.p2082ss.android.ugc.aweme.utils.ActivityStack;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4565b.AbstractC88412b;

/* renamed from: com.ss.android.ugc.aweme.live.livehostimpl.i */
public final class C58686i implements IHostApp {

    /* renamed from: a */
    private int f133603a = -1;

    static {
        Covode.recordClassIndex(68988);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostApp
    public final AbstractC11763d avatarBorderController() {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostApp
    public final void checkAndShowGuide(ActivityC0945e eVar, String str, String str2) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostApp
    public final void checkBindHelpShow(ActivityC0945e eVar, String str) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostApp
    public final void enterRecorderActivity(Activity activity) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostApp
    public final String getBgBroadcastServiceName() {
        return "com.ss.android.ugc.aweme.live.livehostimpl.BgBroadcastService";
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostApp
    public final Uri getUriForFile(Context context, File file) {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostApp
    public final void initImageLib() {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostApp
    public final AbstractC11764e liveCircleView(Context context) {
        return null;
    }

    @Override // com.bytedance.android.live.base.AbstractC2953a
    public final void onInit() {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostApp
    public final Dialog showDialog(Context context, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, AbstractC11872a aVar, CharSequence charSequence4, AbstractC11872a aVar2, AbstractC11798a aVar3) {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostApp
    public final void startBindMobileFullFragment(Activity activity, String str, String str2, AbstractC11818m mVar) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostApp
    public final void startBindPhoneDialogFragment(Activity activity, String str, String str2, AbstractC11818m mVar) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostApp
    public final boolean startVideoRecordActivity(Activity activity, String str) {
        return true;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostApp
    public final void transCloudControlCommand(JSONObject jSONObject) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostApp
    public final int getCurrentPage() {
        return this.f133603a;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostApp
    public final Activity getTopActivity() {
        return ActivityStack.getTopActivity();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostApp
    public final boolean getPushLiveState() {
        IProfileService g = ProfileServiceImpl.m114884g();
        if (g != null) {
            return g.mo101965c();
        }
        return true;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostApp
    public final void hideStickerView() {
        IStickerViewService createIStickerViewServicebyMonsterPlugin = StickerViewServiceImpl.createIStickerViewServicebyMonsterPlugin(false);
        if (createIStickerViewServicebyMonsterPlugin != null) {
            createIStickerViewServicebyMonsterPlugin.hideStickerView();
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostApp
    public final boolean isAppForeground() {
        return ActivityLifeObserver.getInstance().isForeground();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostApp
    public final boolean isInMusicallyRegion() {
        if (!C58071d.m104909c()) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostApp
    public final boolean isShowStickerView() {
        IStickerViewService createIStickerViewServicebyMonsterPlugin = StickerViewServiceImpl.createIStickerViewServicebyMonsterPlugin(false);
        if (createIStickerViewServicebyMonsterPlugin != null) {
            return createIStickerViewServicebyMonsterPlugin.isShowStickerView();
        }
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostApp
    public final List<Class> getLiveActivityClass() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(((AbstractC58634g) C20688a.m38943b(AbstractC58634g.class)).mo95867b().mo34105a());
        return arrayList;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostApp
    public final void setCurrentPage(int i) {
        this.f133603a = i;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostApp
    public final void tryDownloadGiftImage(String str) {
        C34577e.m70609b(str);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostApp
    public final void tryDownloadImage(String str) {
        C34577e.m70609b(str);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostApp
    public final Class getHostActivity(int i) {
        return ((AbstractC58634g) C20688a.m13435a(AbstractC58634g.class)).mo95865a(i);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostApp
    public final boolean isNotificationEnabled(Context context) {
        IProfileService g = ProfileServiceImpl.m114884g();
        if (g != null) {
            return g.mo101963b(context);
        }
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostApp
    public final void openWallet(Activity activity) {
        ILiveHostOuterService p = LiveHostOuterService.m107232p();
        if (p != null) {
            p.mo95807b(activity, "page_charge");
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostApp
    public final AbstractC88412b registerAppEnterForeBackgroundCallback(AbstractC11622a aVar) {
        return C17873f.m33100h().mo143289d(new C58698q(aVar));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0009, code lost:
        if (r4 != 3) goto L_0x000b;
     */
    @Override // com.bytedance.android.livesdkapi.host.IHostApp
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Typeface getHostTypeface(int r4) {
        /*
            r3 = this;
            r2 = 3
            r1 = 2
            r0 = 1
            if (r4 == 0) goto L_0x000b
            if (r4 == r0) goto L_0x0017
            if (r4 == r1) goto L_0x0015
            if (r4 == r2) goto L_0x000c
        L_0x000b:
            r2 = 1
        L_0x000c:
            com.bytedance.ies.dmt.ui.widget.util.a r0 = com.bytedance.ies.dmt.p1194ui.widget.util.C17300a.m32029a()
            android.graphics.Typeface r0 = r0.mo27609a(r2)
            return r0
        L_0x0015:
            r2 = 4
            goto L_0x000c
        L_0x0017:
            r2 = 2
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.live.livehostimpl.C58686i.getHostTypeface(int):android.graphics.Typeface");
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostApp
    public final void registerLifeCycleCallback(AbstractC11624b bVar) {
        bVar.mo12840a(C17873f.f42636l);
        C17873f.m33092a().mo143289d(new C58691j(bVar));
        AbstractC88979t<Activity> b = C17873f.m33094b();
        bVar.getClass();
        b.mo143289d(new C58692k(bVar));
        AbstractC88979t<Activity> c = C17873f.m33095c();
        bVar.getClass();
        c.mo143289d(new C58693l(bVar));
        AbstractC88979t<Activity> d = C17873f.m33096d();
        bVar.getClass();
        d.mo143289d(new C58694m(bVar));
        AbstractC88979t<Activity> e = C17873f.m33097e();
        bVar.getClass();
        e.mo143289d(new C58695n(bVar));
        AbstractC88979t<Activity> f = C17873f.m33098f();
        bVar.getClass();
        f.mo143289d(new C58696o(bVar));
        C17873f.m33100h().mo143289d(new C58697p(bVar));
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostApp
    public final void jumpToAgsStatusPage(Context context, String str) {
        IBanAppealService f = BanAppealServiceImpl.m80219f();
        if (f != null) {
            f.mo68602a(context, str);
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostApp
    public final void bindGifImage(View view, String str, Bitmap.Config config) {
        if (view instanceof SimpleDraweeView) {
            C24262c cVar = (C24262c) view;
            REQUEST request = null;
            if (str != null && !str.isEmpty()) {
                C24361b a = new ImageDecodeOptionsBuilder().setBitmapConfig(config).mo40153a(1).mo40154a();
                C24639c a2 = C24639c.m47149a(Uri.parse(str));
                a2.f58554e = C24364e.f57785d;
                a2.f58555f = a;
                request = (REQUEST) a2.mo40483a();
            }
            C24185e b = C24182c.m45843b();
            b.f57306j = true;
            b.f57299c = request;
            cVar.setController(b.mo39827e());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0036, code lost:
        if (r1 == null) goto L_0x0038;
     */
    @Override // com.bytedance.android.livesdkapi.host.IHostApp
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.util.Pair<java.lang.String, android.graphics.drawable.Drawable> getBreathShareAnimShareRes(android.content.Context r4, java.lang.String r5, java.lang.String r6) {
        /*
            r3 = this;
            r2 = 0
            if (r4 != 0) goto L_0x0004
            return r2
        L_0x0004:
            boolean r0 = r4 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0044
            com.ss.android.ugc.aweme.share.ShareExtService r0 = com.p2082ss.android.ugc.aweme.share.ShareExtServiceImpl.m121353e()
            android.app.Activity r4 = (android.app.Activity) r4
            android.graphics.drawable.Drawable r1 = r0.mo109354a(r4, r5)
            if (r1 != 0) goto L_0x0041
            com.ss.android.ugc.aweme.share.ShareExtService r0 = com.p2082ss.android.ugc.aweme.share.ShareExtServiceImpl.m121353e()
            android.graphics.drawable.Drawable r1 = r0.mo109353a(r4)
            java.lang.String r5 = com.p2082ss.android.ugc.aweme.feed.C48314ai.m91750c()
            com.ss.android.ugc.aweme.sharer.b r0 = com.p2082ss.android.ugc.aweme.share.improve.C68963a.C68964a.m121652a(r5, r4)
            if (r0 != 0) goto L_0x003e
            java.lang.String r0 = "other"
            boolean r0 = com.bytedance.common.utility.C13627m.m24499a(r5, r0)
            if (r0 != 0) goto L_0x003e
        L_0x002e:
            com.ss.android.ugc.aweme.share.ShareExtService r0 = com.p2082ss.android.ugc.aweme.share.ShareExtServiceImpl.m121353e()
            android.graphics.drawable.Drawable r1 = r0.mo109354a(r4, r6)
            if (r1 != 0) goto L_0x0042
        L_0x0038:
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r2, r1)
            return r0
        L_0x003e:
            if (r1 != 0) goto L_0x0041
            goto L_0x002e
        L_0x0041:
            r6 = r5
        L_0x0042:
            r2 = r6
            goto L_0x0038
        L_0x0044:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.live.livehostimpl.C58686i.getBreathShareAnimShareRes(android.content.Context, java.lang.String, java.lang.String):android.util.Pair");
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostApp
    public final void showStickerView(ActivityC0218d dVar, AbstractC0952i iVar, final String str, FrameLayout frameLayout, final AbstractC11819n nVar) {
        IStickerViewService createIStickerViewServicebyMonsterPlugin = StickerViewServiceImpl.createIStickerViewServicebyMonsterPlugin(false);
        if (createIStickerViewServicebyMonsterPlugin != null) {
            createIStickerViewServicebyMonsterPlugin.setPixelLoopStickerPresenterSupplier(new AbstractC27255q<AbstractC75448a>() {
                /* class com.p2082ss.android.ugc.aweme.live.livehostimpl.C58686i.C586871 */

                /* renamed from: c */
                private AbstractC75448a f133606c;

                static {
                    Covode.recordClassIndex(68989);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // com.google.p1998c.p1999a.AbstractC27255q
                /* renamed from: b */
                public final /* synthetic */ AbstractC75448a mo5560b() {
                    if (this.f133606c == null) {
                        this.f133606c = new AbstractC75448a() {
                            /* class com.p2082ss.android.ugc.aweme.live.livehostimpl.C58686i.C586871.C586881 */

                            static {
                                Covode.recordClassIndex(68990);
                            }

                            @Override // com.p2082ss.android.ugc.aweme.sticker.p3967n.AbstractC75448a
                            /* renamed from: a */
                            public final int mo96112a(String str, String str2) {
                                return nVar.mo8920a(str, str2);
                            }
                        };
                    }
                    return this.f133606c;
                }
            });
            createIStickerViewServicebyMonsterPlugin.showStickerView(dVar, iVar, str, frameLayout, new IStickerViewService.AbstractC75242a() {
                /* class com.p2082ss.android.ugc.aweme.live.livehostimpl.C58686i.C586892 */

                static {
                    Covode.recordClassIndex(68991);
                }

                @Override // com.p2082ss.android.ugc.aweme.sticker.IStickerViewService.AbstractC75242a
                /* renamed from: a */
                public final void mo96113a() {
                    nVar.mo8922a(str);
                }

                @Override // com.p2082ss.android.ugc.aweme.sticker.IStickerViewService.AbstractC75242a
                /* renamed from: b */
                public final void mo96116b() {
                    nVar.mo8924b(str);
                }

                @Override // com.p2082ss.android.ugc.aweme.sticker.IStickerViewService.AbstractC75242a
                /* renamed from: a */
                public final void mo96114a(IStickerService.FaceSticker faceSticker) {
                    nVar.mo8921a(C58676ak.m107825a(faceSticker));
                }

                @Override // com.p2082ss.android.ugc.aweme.sticker.IStickerViewService.AbstractC75242a
                /* renamed from: b */
                public final void mo96117b(IStickerService.FaceSticker faceSticker) {
                    nVar.mo8923b(C58676ak.m107825a(faceSticker));
                }

                @Override // com.p2082ss.android.ugc.aweme.sticker.IStickerViewService.AbstractC75242a
                /* renamed from: a */
                public final void mo96115a(String str) {
                    nVar.mo8925c(str);
                }
            });
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostApp
    public final void showNotificationTipDialog(String str, String str2, String str3, int i, View view, final String str4, final IHostApp.C11789a aVar, boolean z, final AbstractC9514aa aaVar) {
        IProfileService g = ProfileServiceImpl.m114884g();
        if (g != null) {
            g.mo101960a(str, str2, str3, i, z, view, new AbstractC63755f() {
                /* class com.p2082ss.android.ugc.aweme.live.livehostimpl.C58686i.C586903 */

                static {
                    Covode.recordClassIndex(68992);
                }

                @Override // com.p2082ss.android.ugc.aweme.profile.AbstractC63755f
                /* renamed from: c */
                public final String mo96121c() {
                    return str4;
                }

                @Override // com.p2082ss.android.ugc.aweme.profile.AbstractC63755f
                /* renamed from: b */
                public final void mo96120b() {
                    aaVar.mo13796a();
                }

                @Override // com.p2082ss.android.ugc.aweme.profile.AbstractC63755f
                /* renamed from: a */
                public final AbstractC63755f.C63756a mo96118a() {
                    return new AbstractC63755f.C63756a(aVar.f28169a, aVar.f28170b, aVar.f28171c, aVar.f28172d, aVar.f28173e);
                }

                @Override // com.p2082ss.android.ugc.aweme.profile.AbstractC63755f
                /* renamed from: a */
                public final void mo96119a(int i) {
                    aaVar.mo13797a(i);
                }
            });
        }
    }
}
