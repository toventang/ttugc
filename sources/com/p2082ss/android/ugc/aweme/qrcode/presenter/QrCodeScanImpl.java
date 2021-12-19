package com.p2082ss.android.ugc.aweme.qrcode.presenter;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.mvtemplate.impl.MovieReuseServiceImpl;
import com.p2082ss.android.ugc.aweme.qrcode.p3656e.C66400b;
import com.p2082ss.android.ugc.aweme.services.IMainService;
import com.p2082ss.android.ugc.aweme.services.MainServiceImpl;
import com.p2082ss.android.ugc.aweme.tools.detail.IMovieReuseService;
import java.util.ArrayList;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.qrcode.presenter.QrCodeScanImpl */
public final class QrCodeScanImpl implements QrCodeScanService {
    static {
        Covode.recordClassIndex(77951);
    }

    @Override // com.p2082ss.android.ugc.aweme.qrcode.presenter.QrCodeScanService
    /* renamed from: a */
    public final void mo105338a() {
        C66400b.f149302a = false;
    }

    /* renamed from: b */
    public static QrCodeScanService m118122b() {
        Object a = C81908b.m141854a(QrCodeScanService.class, false);
        if (a != null) {
            return (QrCodeScanService) a;
        }
        return new QrCodeScanImpl();
    }

    @Override // com.p2082ss.android.ugc.aweme.qrcode.presenter.QrCodeScanService
    /* renamed from: a */
    public final String mo105337a(String str) {
        C89219l.m154721d(str, "");
        String securityUrl = MainServiceImpl.createIMainServicebyMonsterPlugin(false).getSecurityUrl(str);
        C89219l.m154716b(securityUrl, "");
        return securityUrl;
    }

    @Override // com.p2082ss.android.ugc.aweme.qrcode.presenter.QrCodeScanService
    /* renamed from: a */
    public final void mo105339a(Context context, String str) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        MainServiceImpl.createIMainServicebyMonsterPlugin(false).openDeepLinkActivity(context, str);
    }

    @Override // com.p2082ss.android.ugc.aweme.qrcode.presenter.QrCodeScanService
    /* renamed from: a */
    public final void mo105341a(Context context, ArrayList<String> arrayList) {
        C89219l.m154721d(arrayList, "");
        SmartRouter.buildRoute(context, "//stickers/detail").withParam("extra_stickers", arrayList).withParam("extra_sticker_from", "reuse").open();
    }

    @Override // com.p2082ss.android.ugc.aweme.qrcode.presenter.QrCodeScanService
    /* renamed from: b */
    public final void mo105345b(Context context, String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        SmartRouter.buildRoute(context, "//music/detail").withParam("id", str).withParam("extra_music_from", str2).open();
    }

    @Override // com.p2082ss.android.ugc.aweme.qrcode.presenter.QrCodeScanService
    /* renamed from: c */
    public final void mo105346c(Context context, String str, String str2) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        SmartRouter.buildRoute(context, "//challenge/detail").withParam("id", str).withParam("extra_challenge_from", str2).open();
    }

    @Override // com.p2082ss.android.ugc.aweme.qrcode.presenter.QrCodeScanService
    /* renamed from: a */
    public final void mo105340a(Context context, String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        SmartRouter.buildRoute(context, "//aweme/detail").withParam("id", str).withParam("refer", str2).open();
    }

    @Override // com.p2082ss.android.ugc.aweme.qrcode.presenter.QrCodeScanService
    /* renamed from: a */
    public final void mo105342a(String str, Activity activity, IMovieReuseService.AbstractC78107b bVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(activity, "");
        C89219l.m154721d(bVar, "");
        MovieReuseServiceImpl.m110905a().mo98782a(str, activity, bVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.qrcode.presenter.QrCodeScanService
    /* renamed from: a */
    public final boolean mo105344a(Activity activity, String str, String str2) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(str2, "");
        return MainServiceImpl.createIMainServicebyMonsterPlugin(false).checkIsMinAppVersionNotSatisfied(activity, str, str2);
    }

    @Override // com.p2082ss.android.ugc.aweme.qrcode.presenter.QrCodeScanService
    /* renamed from: a */
    public final void mo105343a(String str, String str2, Activity activity, boolean z, IMainService.DownLoadFinishListener downLoadFinishListener) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(activity, "");
        C89219l.m154721d(downLoadFinishListener, "");
        MainServiceImpl.createIMainServicebyMonsterPlugin(false).downloadStickerHelper(str, str2, activity, z, downLoadFinishListener);
    }
}
