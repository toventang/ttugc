package com.p2082ss.android.ugc.aweme.share;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdkapi.C11755f;
import com.bytedance.android.livesdkapi.depend.p683e.AbstractC11665b;
import com.bytedance.android.livesdkapi.depend.p683e.C11666c;
import com.bytedance.android.livesdkapi.service.AbstractC11846d;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.p2085a.p2086a.p2087a.C29339a;
import com.p2082ss.android.socialbase.downloader.downloader.Downloader;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.DialogC30985a;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.C33594aj;
import com.p2082ss.android.ugc.aweme.app.SharePrefCache;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.share.ShareInfo;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.discover.model.Challenge;
import com.p2082ss.android.ugc.aweme.feed.model.ACLCommonShare;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeACLShare;
import com.p2082ss.android.ugc.aweme.feed.p2949i.AbstractC49691s;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49672ag;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.View$OnClickListenerC50111bg;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.C50384h;
import com.p2082ss.android.ugc.aweme.feed.share.C49929c;
import com.p2082ss.android.ugc.aweme.feed.share.p2966a.p2967a.AbstractC49927b;
import com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.RuntimeBehaviorServiceImpl;
import com.p2082ss.android.ugc.aweme.framework.services.IUserService;
import com.p2082ss.android.ugc.aweme.livewallpaper.p3419f.CallableC58904g;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.p3070im.IIMAdapterService;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.service.IMAdapterServiceImpl;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63220bg;
import com.p2082ss.android.ugc.aweme.profile.AbstractC63510e;
import com.p2082ss.android.ugc.aweme.profile.experiment.C63753j;
import com.p2082ss.android.ugc.aweme.profile.model.GeneralPermission;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.qna.model.C66289b;
import com.p2082ss.android.ugc.aweme.qna.services.QnaService;
import com.p2082ss.android.ugc.aweme.services.BaseUserService;
import com.p2082ss.android.ugc.aweme.services.function.FunctionSupportService;
import com.p2082ss.android.ugc.aweme.services.function.IFunctionKey;
import com.p2082ss.android.ugc.aweme.services.watermark.IWaterMarkService;
import com.p2082ss.android.ugc.aweme.share.DialogC69418s;
import com.p2082ss.android.ugc.aweme.share.ShareDependService;
import com.p2082ss.android.ugc.aweme.share.business.C68879a;
import com.p2082ss.android.ugc.aweme.share.improve.C68963a;
import com.p2082ss.android.ugc.aweme.share.improve.p3755a.C68974ab;
import com.p2082ss.android.ugc.aweme.share.improve.p3755a.C68989ah;
import com.p2082ss.android.ugc.aweme.share.improve.p3755a.C68996ak;
import com.p2082ss.android.ugc.aweme.share.improve.p3755a.C69001an;
import com.p2082ss.android.ugc.aweme.share.improve.p3755a.C69002ao;
import com.p2082ss.android.ugc.aweme.share.improve.p3755a.C69003ap;
import com.p2082ss.android.ugc.aweme.share.improve.p3755a.C69004aq;
import com.p2082ss.android.ugc.aweme.share.improve.p3755a.C69005ar;
import com.p2082ss.android.ugc.aweme.share.improve.p3755a.C69044e;
import com.p2082ss.android.ugc.aweme.share.improve.p3755a.p3756a.C68968a;
import com.p2082ss.android.ugc.aweme.share.improve.p3755a.p3756a.C68969b;
import com.p2082ss.android.ugc.aweme.share.improve.p3755a.p3756a.C68970c;
import com.p2082ss.android.ugc.aweme.share.improve.p3755a.p3756a.C68971d;
import com.p2082ss.android.ugc.aweme.share.improve.p3757b.C69109b;
import com.p2082ss.android.ugc.aweme.share.improve.p3758c.C69123a;
import com.p2082ss.android.ugc.aweme.share.improve.p3758c.C69124b;
import com.p2082ss.android.ugc.aweme.share.improve.p3760e.C69190a;
import com.p2082ss.android.ugc.aweme.share.improve.p3760e.C69196b;
import com.p2082ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import com.p2082ss.android.ugc.aweme.share.improve.pkg.C69257a;
import com.p2082ss.android.ugc.aweme.share.improve.pkg.C69258b;
import com.p2082ss.android.ugc.aweme.share.improve.pkg.C69260c;
import com.p2082ss.android.ugc.aweme.share.improve.pkg.C69261d;
import com.p2082ss.android.ugc.aweme.share.improve.pkg.C69262e;
import com.p2082ss.android.ugc.aweme.share.improve.pkg.C69263f;
import com.p2082ss.android.ugc.aweme.share.improve.pkg.C69264g;
import com.p2082ss.android.ugc.aweme.share.improve.pkg.C69265h;
import com.p2082ss.android.ugc.aweme.share.improve.pkg.C69266i;
import com.p2082ss.android.ugc.aweme.share.improve.pkg.C69267j;
import com.p2082ss.android.ugc.aweme.share.improve.pkg.C69268k;
import com.p2082ss.android.ugc.aweme.share.improve.pkg.ChallengeSharePackage;
import com.p2082ss.android.ugc.aweme.share.improve.pkg.LiveSharePackage;
import com.p2082ss.android.ugc.aweme.share.improve.pkg.MusicSharePackage;
import com.p2082ss.android.ugc.aweme.share.improve.pkg.PlaylistSharePackage;
import com.p2082ss.android.ugc.aweme.share.improve.pkg.QnASharePackage;
import com.p2082ss.android.ugc.aweme.share.improve.pkg.StickerSharePackage;
import com.p2082ss.android.ugc.aweme.share.improve.pkg.UserSharePackage;
import com.p2082ss.android.ugc.aweme.share.p3745c.AbstractC68903b;
import com.p2082ss.android.ugc.aweme.share.p3746d.AbstractC68912f;
import com.p2082ss.android.ugc.aweme.share.p3746d.C68907b;
import com.p2082ss.android.ugc.aweme.share.p3746d.C68909c;
import com.p2082ss.android.ugc.aweme.share.p3746d.C68913g;
import com.p2082ss.android.ugc.aweme.share.p3767m.C69317i;
import com.p2082ss.android.ugc.aweme.share.qrcode.UserQRCodeActivity;
import com.p2082ss.android.ugc.aweme.share.silent.C69458h;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69645h;
import com.p2082ss.android.ugc.aweme.sharer.C69652m;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.C69684e;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.C69692g;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.DialogC69695i;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.bar.ShareChannelBar;
import com.p2082ss.android.ugc.aweme.sticker.model.C75445g;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.aweme.utils.C80636z;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.aweme.video.local.C80754a;
import com.p2082ss.android.ugc.p4257c.C81912a;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.ugc.trill.share.base.C85162b;
import java.util.ArrayList;
import java.util.List;
import p077b.C1731i;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.ShareServiceImpl */
public final class ShareServiceImpl implements ShareService {

    /* renamed from: a */
    public static final C68829a f153927a = new C68829a((byte) 0);

    static {
        Covode.recordClassIndex(81126);
    }

    /* renamed from: com.ss.android.ugc.aweme.share.ShareServiceImpl$a */
    public static final class C68829a {
        static {
            Covode.recordClassIndex(81127);
        }

        private C68829a() {
        }

        public /* synthetic */ C68829a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.share.ShareService
    /* renamed from: c */
    public final AbstractC68912f mo109418c() {
        return C68913g.f154168c;
    }

    @Override // com.p2082ss.android.ugc.aweme.share.ShareService
    /* renamed from: a */
    public final DialogC69695i mo109399a(Activity activity, Fragment fragment, Aweme aweme, AbstractC49691s<C49672ag> sVar, Bundle bundle) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(fragment, "");
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(sVar, "");
        C89219l.m154721d(bundle, "");
        C89219l.m154721d(activity, "");
        C89219l.m154721d(fragment, "");
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(sVar, "");
        C89219l.m154721d(bundle, "");
        String string = bundle.getString("event_type", "");
        int i = bundle.getInt("page_type");
        C89219l.m154716b(string, "");
        AwemeSharePackage a = AwemeSharePackage.C69206a.m122313a(aweme, activity, i, string, null, 16);
        a.f155492i.putAll(bundle);
        C69684e.C69686b a2 = new C69684e.C69686b().mo109824a(a);
        C69190a.C69191a.m122290a(a2, false, C17873f.m33102j(), true);
        a2.f155584o = false;
        a2.f155579j = R.string.d4h;
        if (C80636z.m139818c(aweme)) {
            a2.f155584o = true;
            a.f155492i.putString("is_friend_private", "true");
        } else {
            a2.f155573d = true;
        }
        new C49929c(aweme, true, activity, a2, sVar, string, i, "share_board").mo84978a();
        C68900c.m121588a(a2, string, aweme);
        DialogC69695i a3 = ShareDependService.C68822a.m121324a().mo109326a(activity, a2.mo109831a(), R.style.wn);
        a3.show();
        return a3;
    }

    @Override // com.p2082ss.android.ugc.aweme.share.ShareService
    /* renamed from: a */
    public final void mo109403a(Activity activity, Music music, C69692g gVar, List<? extends Aweme> list, String str) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(gVar, "");
        C89219l.m154721d(activity, "");
        C89219l.m154721d(gVar, "");
        if (music != null && music.getShareInfo() != null) {
            if (list == null) {
                list = C89086z.INSTANCE;
            }
            C89219l.m154721d(music, "");
            C89219l.m154721d(activity, "");
            C89219l.m154721d(list, "");
            SharePackage.C69654a a = new SharePackage.C69654a().mo109803a("music");
            String mid = music.getMid();
            C89219l.m154716b(mid, "");
            SharePackage.C69654a b = a.mo109806b(mid);
            ShareInfo shareInfo = music.getShareInfo();
            C89219l.m154716b(shareInfo, "");
            String shareTitle = shareInfo.getShareTitle();
            C89219l.m154716b(shareTitle, "");
            SharePackage.C69654a c = b.mo109807c(shareTitle);
            ShareInfo shareInfo2 = music.getShareInfo();
            C89219l.m154716b(shareInfo2, "");
            String shareDesc = shareInfo2.getShareDesc();
            C89219l.m154716b(shareDesc, "");
            SharePackage.C69654a d = c.mo109808d(shareDesc);
            ShareInfo shareInfo3 = music.getShareInfo();
            C89219l.m154716b(shareInfo3, "");
            String c2 = C69124b.m122228c(C69124b.m122226b(shareInfo3.getShareUrl()));
            if (c2 == null) {
                c2 = "";
            }
            MusicSharePackage musicSharePackage = new MusicSharePackage(d.mo109809e(c2));
            Bundle bundle = musicSharePackage.f155492i;
            bundle.putString("app_name", activity.getString(R.string.u8));
            bundle.putString("thumb_url", C34577e.m70587a(music.getCoverThumb()));
            bundle.putSerializable("video_cover", music.getCoverMedium());
            bundle.putString("music_id", music.getMid());
            bundle.putString("process_id", str);
            bundle.putString("music_name", music.getMusicName());
            bundle.putInt("user_count", music.getUserCount());
            bundle.putSerializable("cover_thumb", music.getCoverThumb());
            C69123a.m122221a(bundle, "aweme_cover_list", list);
            musicSharePackage.f155492i.putString("enter_from", "single_song");
            musicSharePackage.f155492i.putString("enter_method", "button");
            C69684e.C69686b bVar = new C69684e.C69686b();
            bVar.mo109824a(musicSharePackage);
            C69317i.m122515a(bVar, ShareDependService.C68822a.m121324a().mo109325a(musicSharePackage, ""));
            C69196b.m122294a(bVar, true, activity, true);
            bVar.mo109823a(new C69109b());
            bVar.mo109827a(new C69002ao(music));
            if (SmartRouter.canOpen("//qrcodev2")) {
                bVar.mo109827a(new C68969b(music));
            }
            bVar.mo109826a(gVar);
            ShareDependService.C68822a.m121324a().mo109326a(activity, bVar.mo109831a(), R.style.wi).show();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.share.ShareService
    /* renamed from: a */
    public final void mo109400a(Activity activity, ShareInfo shareInfo, String str, String str2, C69692g gVar) {
        String str3 = "";
        C89219l.m154721d(gVar, str3);
        C89219l.m154721d(gVar, str3);
        if (activity != null && shareInfo != null && str != null) {
            SharePackage.C69654a b = new SharePackage.C69654a().mo109803a("playlist").mo109806b(str);
            String shareTitle = shareInfo.getShareTitle();
            C89219l.m154716b(shareTitle, str3);
            SharePackage.C69654a c = b.mo109807c(shareTitle);
            String shareDesc = shareInfo.getShareDesc();
            C89219l.m154716b(shareDesc, str3);
            SharePackage.C69654a d = c.mo109808d(shareDesc);
            String shareUrl = shareInfo.getShareUrl();
            if (shareUrl != null) {
                str3 = shareUrl;
            }
            PlaylistSharePackage playlistSharePackage = new PlaylistSharePackage(d.mo109809e(str3));
            Bundle bundle = playlistSharePackage.f155492i;
            bundle.putString("app_name", activity.getString(R.string.u8));
            bundle.putString("process_id", str2);
            playlistSharePackage.f155492i.putString("enter_from", "single_song");
            playlistSharePackage.f155492i.putString("enter_method", "button");
            C69684e.C69686b bVar = new C69684e.C69686b();
            bVar.mo109824a(playlistSharePackage);
            C69196b.m122294a(bVar, true, activity, true);
            bVar.mo109823a(new C69109b());
            bVar.f155584o = false;
            bVar.f155593x = true;
            bVar.mo109826a(gVar);
            ShareDependService.C68822a.m121324a().mo109326a(activity, bVar.mo109831a(), R.style.wi).show();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.share.ShareService
    /* renamed from: a */
    public final void mo109405a(Activity activity, C75445g gVar, String str, List<? extends Aweme> list, String str2) {
        String str3;
        String str4;
        String shareDesc;
        C89219l.m154721d(activity, "");
        C89219l.m154721d(activity, "");
        if (gVar != null && gVar.shareInfo != null) {
            C89219l.m154721d(gVar, "");
            C89219l.m154721d(activity, "");
            SharePackage.C69654a a = new SharePackage.C69654a().mo109803a("sticker");
            String str5 = gVar.f169545id;
            C89219l.m154716b(str5, "");
            SharePackage.C69654a b = a.mo109806b(str5);
            ShareInfo shareInfo = gVar.shareInfo;
            String str6 = " ";
            if (shareInfo == null || (str3 = shareInfo.getShareTitle()) == null) {
                str3 = str6;
            }
            SharePackage.C69654a c = b.mo109807c(str3);
            ShareInfo shareInfo2 = gVar.shareInfo;
            if (!(shareInfo2 == null || (shareDesc = shareInfo2.getShareDesc()) == null)) {
                str6 = shareDesc;
            }
            SharePackage.C69654a d = c.mo109808d(str6);
            ShareInfo shareInfo3 = gVar.shareInfo;
            String b2 = C69124b.m122226b(shareInfo3 != null ? shareInfo3.getShareUrl() : null);
            if (b2 == null) {
                b2 = "";
            }
            StickerSharePackage stickerSharePackage = new StickerSharePackage(d.mo109809e(b2));
            Bundle bundle = stickerSharePackage.f155492i;
            bundle.putString("app_name", activity.getString(R.string.u8));
            bundle.putSerializable("video_cover", gVar.iconUrl);
            bundle.putString("sticker_id", gVar.f169545id);
            bundle.putString("sticker_name", gVar.name);
            bundle.putLong("user_count", gVar.userCount);
            if (str == null) {
                str4 = "";
            } else {
                str4 = str;
            }
            bundle.putString("group_id", str4);
            bundle.putString("user_id", gVar.ownerId);
            if (str2 == null) {
                str2 = "";
            }
            bundle.putString("log_pb", str2);
            C69123a.m122221a(bundle, "aweme_cover_list", list);
            stickerSharePackage.f155492i.putString("enter_from", "prop_page");
            stickerSharePackage.f155492i.putString("enter_method", "button");
            StickerSharePackage.C69239a.C69240a aVar = new StickerSharePackage.C69239a.C69240a(gVar);
            C69684e.C69686b bVar = new C69684e.C69686b();
            C69317i.m122515a(bVar, ShareDependService.C68823b.m121325a(ShareDependService.C68822a.m121324a(), stickerSharePackage, null, 6));
            C68863ah.f154027a.mo109409a((ShareService) bVar, (C69684e.C69686b) activity, (Activity) true);
            bVar.mo109824a(stickerSharePackage);
            bVar.mo109823a(new C69109b());
            if (!TextUtils.isEmpty(gVar.ownerId)) {
                bVar.mo109827a(new C69004aq(gVar));
            }
            bVar.mo109827a(new C68971d(gVar, str));
            bVar.mo109826a(aVar);
            ShareDependService.C68823b.m121326a(ShareDependService.C68822a.m121324a(), activity, bVar.mo109831a()).show();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.share.ShareService
    /* renamed from: a */
    public final void mo109404a(Activity activity, C66289b bVar, C69692g gVar, String str) {
        String str2;
        C89219l.m154721d(activity, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(gVar, "");
        C89219l.m154721d(activity, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(gVar, "");
        SharePackage.C69654a c = new SharePackage.C69654a().mo109803a("qna").mo109806b(String.valueOf(bVar.f149023b)).mo109807c(bVar.f149024c);
        ShareInfo shareInfo = bVar.f149026e;
        String str3 = null;
        if (shareInfo == null || (str2 = shareInfo.getShareDesc()) == null) {
            str2 = "";
        }
        SharePackage.C69654a d = c.mo109808d(str2);
        ShareInfo shareInfo2 = bVar.f149026e;
        if (shareInfo2 != null) {
            str3 = shareInfo2.getShareUrl();
        }
        String c2 = C69124b.m122228c(C69124b.m122226b(str3));
        if (c2 == null) {
            c2 = "";
        }
        QnASharePackage qnASharePackage = new QnASharePackage(d.mo109809e(c2));
        qnASharePackage.f155492i.putLong("qna_id", bVar.f149023b);
        qnASharePackage.f155492i.putString("qna_name", bVar.f149024c);
        qnASharePackage.f155492i.putInt("user_count", bVar.f149025d);
        qnASharePackage.f155492i.putString("app_name", activity.getString(R.string.u8));
        qnASharePackage.f155492i.putString("process_id", str);
        C69123a.m122221a(qnASharePackage.f155492i, "aweme_cover_list", bVar.f149027f);
        qnASharePackage.f155492i.putString("enter_from", "qa_detail");
        qnASharePackage.f155492i.putString("enter_method", "button");
        C69684e.C69686b bVar2 = new C69684e.C69686b();
        bVar2.mo109824a(qnASharePackage);
        boolean z = bVar.f149026e != null;
        C69317i.m122515a(bVar2, ShareDependService.C68822a.m121324a().mo109325a(qnASharePackage, ""));
        C69196b.m122294a(bVar2, z, activity, z);
        if (QnaService.m117969a().enablePublicQna()) {
            C68989ah ahVar = new C68989ah(bVar);
            C89219l.m154721d(bVar2, "");
            bVar2.mo109827a(ahVar);
        }
        bVar2.mo109827a(new C69003ap(bVar));
        if (z) {
            if (SmartRouter.canOpen("//qrcodev2")) {
                bVar2.mo109827a(new C68970c(bVar));
            }
            bVar2.mo109823a(new C69109b());
        }
        bVar2.mo109826a(gVar);
        ShareDependService.C68822a.m121324a().mo109326a(activity, bVar2.mo109831a(), R.style.wi).show();
    }

    @Override // com.p2082ss.android.ugc.aweme.share.ShareService
    /* renamed from: a */
    public final void mo109408a(Handler handler, Activity activity, User user, List<? extends Aweme> list) {
        String str;
        C89219l.m154721d(activity, "");
        C89219l.m154721d(activity, "");
        if (user != null && user.getShareInfo() != null) {
            UserSharePackage a = UserSharePackage.C69241a.m122365a(user, activity, list);
            String str2 = C80580in.m139694g(user) ? "personal_homepage" : "others_homepage";
            a.f155492i.putString("enter_from", str2);
            a.f155492i.putString("enter_method", "button");
            C69684e.C69686b bVar = new C69684e.C69686b();
            C69317i.m122515a(bVar, ShareDependService.C68823b.m121325a(ShareDependService.C68822a.m121324a(), a, str2, 4));
            C68863ah.f154027a.mo109409a((ShareService) bVar, (C69684e.C69686b) activity, (Activity) true);
            GeneralPermission generalPermission = user.getGeneralPermission();
            if (generalPermission != null) {
                str = generalPermission.getShareProfileToast();
            } else {
                str = null;
            }
            boolean z = false;
            if (!TextUtils.isEmpty(str)) {
                bVar.f155584o = false;
            }
            if (C31575b.m65865g().isMe(user.getUid()) || !user.isSecret()) {
                bVar.mo109823a(new C69109b());
            } else {
                bVar.f155573d = true;
                bVar.f155584o = false;
            }
            if (handler != null) {
                bVar.mo109827a(new C69005ar(user));
                IAccountUserService g = C31575b.m65865g();
                C89219l.m154716b(g, "");
                if (g.isLogin()) {
                    bVar.mo109827a(new C69044e(user, handler));
                }
                IIMAdapterService d = IMAdapterServiceImpl.m101068d();
                C89219l.m154716b(d, "");
                if (d.mo90130b() || IMAdapterServiceImpl.m101068d().mo90131c()) {
                    z = true;
                }
                if (!user.isBlock && IMAdapterServiceImpl.m101068d().mo90129a() && !C80580in.m139687c() && !z) {
                    bVar.mo109827a(new C68974ab(handler));
                }
                SharePrefCache inst = SharePrefCache.inst();
                C89219l.m154716b(inst, "");
                C33594aj<Boolean> removeFollowerSwitch = inst.getRemoveFollowerSwitch();
                C89219l.m154716b(removeFollowerSwitch, "");
                Boolean c = removeFollowerSwitch.mo59941c();
                C89219l.m154716b(c, "");
                if (c.booleanValue() && user.getFollowerStatus() == 1) {
                    bVar.mo109827a(new C68996ak(handler));
                }
            }
            bVar.mo109824a(a);
            bVar.mo109826a(new UserSharePackage.C69241a.C69242a(a, str2, activity, user, handler));
            C69684e a2 = bVar.mo109831a();
            if (!activity.isFinishing()) {
                ShareDependService.C68823b.m121326a(ShareDependService.C68822a.m121324a(), activity, a2).show();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.share.ShareService
    /* renamed from: a */
    public final void mo109401a(Activity activity, Challenge challenge, List<? extends Aweme> list, String str, boolean z, String str2, String str3, String str4) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(activity, "");
        if (challenge != null && challenge.getShareInfo() != null) {
            C89219l.m154721d(challenge, "");
            C89219l.m154721d(activity, "");
            SharePackage.C69654a a = new SharePackage.C69654a().mo109803a("challenge");
            String cid = challenge.getCid();
            C89219l.m154716b(cid, "");
            SharePackage.C69654a b = a.mo109806b(cid);
            ShareInfo shareInfo = challenge.getShareInfo();
            C89219l.m154716b(shareInfo, "");
            String shareTitle = shareInfo.getShareTitle();
            C89219l.m154716b(shareTitle, "");
            SharePackage.C69654a c = b.mo109807c(shareTitle);
            ShareInfo shareInfo2 = challenge.getShareInfo();
            C89219l.m154716b(shareInfo2, "");
            String shareDesc = shareInfo2.getShareDesc();
            C89219l.m154716b(shareDesc, "");
            SharePackage.C69654a d = c.mo109808d(shareDesc);
            ShareInfo shareInfo3 = challenge.getShareInfo();
            C89219l.m154716b(shareInfo3, "");
            String c2 = C69124b.m122228c(C69124b.m122226b(shareInfo3.getShareUrl()));
            if (c2 == null) {
                c2 = "";
            }
            ChallengeSharePackage challengeSharePackage = new ChallengeSharePackage(d.mo109809e(c2));
            Bundle bundle = challengeSharePackage.f155492i;
            bundle.putString("app_name", activity.getString(R.string.u8));
            User author = challenge.getAuthor();
            String str5 = null;
            bundle.putString("uid_for_share", author != null ? author.getUid() : null);
            bundle.putString("challenge_id", challenge.getCid());
            bundle.putString("process_id", str3);
            bundle.putString("challenge_name", challenge.getChallengeName());
            bundle.putLong("view_count", challenge.getDisplayCount());
            bundle.putBoolean("is_commerce", challenge.isCommerce());
            C69123a.m122221a(bundle, "cover_thumb", list);
            challengeSharePackage.f155492i.putString("enter_from", "challenge");
            challengeSharePackage.f155492i.putString("enter_method", "button");
            challengeSharePackage.f155492i.putString("extra_parent_tag_id", str4);
            ChallengeSharePackage.C69211a.C69212a aVar = new ChallengeSharePackage.C69211a.C69212a(challenge);
            C69684e.C69686b bVar = new C69684e.C69686b();
            C69317i.m122515a(bVar, ShareDependService.C68823b.m121325a(ShareDependService.C68822a.m121324a(), challengeSharePackage, "challenge", 4));
            C68863ah.f154027a.mo109409a((ShareService) bVar, (C69684e.C69686b) activity, (Activity) true);
            bVar.mo109823a(new C69109b());
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            String curUserId = g.getCurUserId();
            User author2 = challenge.getAuthor();
            if (author2 != null) {
                str5 = author2.getUid();
            }
            if (TextUtils.isEmpty(curUserId) || TextUtils.isEmpty(str5) || !TextUtils.equals(curUserId, str5)) {
                bVar.mo109827a(new C69001an(challenge));
            }
            if (!FunctionSupportService.INSTANCE.notSupport(IFunctionKey.QR_CODE)) {
                bVar.mo109827a(new C68968a(challenge, z, str, str2, str3));
            }
            bVar.mo109826a(aVar);
            bVar.mo109824a(challengeSharePackage);
            ShareDependService.C68823b.m121326a(ShareDependService.C68822a.m121324a(), activity, bVar.mo109831a()).show();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01ee  */
    @Override // com.p2082ss.android.ugc.aweme.share.ShareService
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo109402a(android.app.Activity r9, com.p2082ss.android.ugc.aweme.feed.model.LiveEvent r10, com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69690f r11, com.bytedance.ies.web.p1285a.C18288a r12) {
        /*
        // Method dump skipped, instructions count: 498
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.share.ShareServiceImpl.mo109402a(android.app.Activity, com.ss.android.ugc.aweme.feed.model.LiveEvent, com.ss.android.ugc.aweme.sharer.ui.f, com.bytedance.ies.web.a.a):void");
    }

    @Override // com.p2082ss.android.ugc.aweme.share.ShareService
    /* renamed from: a */
    public final boolean mo109413a(String str, String str2, Context context) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(context, "");
        AbstractC69581b a = C68963a.C68964a.m121651a(str);
        if (a != null) {
            return a.mo61913a((AbstractC69645h) new C69652m(str2), context);
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.share.ShareService
    /* renamed from: a */
    public final boolean mo109410a() {
        return C16048b.m29633a().mo25421a(false, "download_video_with_mute", false);
    }

    @Override // com.p2082ss.android.ugc.aweme.share.ShareService
    /* renamed from: a */
    public final void mo109406a(Context context) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(context, "");
        C33744d a = new C33744d().mo59983a("enter_from", C68909c.f154158f);
        Aweme aweme = C68909c.f154157e;
        C39162r.m79460a("download_cancel", a.mo59983a("group_id", aweme != null ? aweme.getAid() : null).mo59980a("is_downloading", C68909c.m121606b() ? 1 : 0).f79943a);
        C85162b.f190526z = true;
        C68909c.f154155c = true;
        if (C68909c.f154153a) {
            C89219l.m154721d(context, "");
            Downloader.getInstance(context).cancel(C80754a.f180559c);
            C68909c.f154153a = false;
            RuntimeBehaviorServiceImpl.m94812c().mo85865a("download_cancel");
        } else if (C68909c.f154154b) {
            IWaterMarkService b = C68907b.f154150d.mo5560b();
            if (b != null) {
                b.cancelWaterMark();
            }
            C68909c.f154154b = false;
            RuntimeBehaviorServiceImpl.m94812c().mo85865a("water_mark_cancel");
        }
        C80720e.m139931c(C68907b.f154148b);
        C80720e.m139931c(C68907b.f154149c);
        ShareDependService.C68822a.m121324a().mo109344a(false);
        AbstractC49927b bVar = C68907b.f154147a;
        if (bVar != null) {
            bVar.mo84975a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.share.ShareService
    /* renamed from: a */
    public final void mo109409a(C69684e.C69686b bVar, Activity activity, boolean z) {
        C89219l.m154721d(bVar, "");
        C69196b.m122294a(bVar, z, activity, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003d, code lost:
        if (r5 != null) goto L_0x0027;
     */
    @Override // com.p2082ss.android.ugc.aweme.share.ShareService
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo109412a(com.p2082ss.android.ugc.aweme.shortvideo.C69905c r5, java.lang.String r6) {
        /*
            r4 = this;
            r3 = 1
            r0 = 0
            if (r5 == 0) goto L_0x003c
            if (r6 == 0) goto L_0x003c
            java.util.List<java.lang.String> r0 = com.p2082ss.android.ugc.aweme.share.C69486v.f155224a
            if (r0 == 0) goto L_0x003c
            boolean r0 = r5.isMuteShare()
            if (r0 == 0) goto L_0x003c
            java.util.List<java.lang.String> r2 = com.p2082ss.android.ugc.aweme.share.C69486v.f155224a
            if (r2 != 0) goto L_0x0017
            p4600h.p4611f.p4613b.C89219l.m154715b()
        L_0x0017:
            java.lang.String r1 = r6.toLowerCase()
            java.lang.String r0 = ""
            p4600h.p4611f.p4613b.C89219l.m154716b(r1, r0)
            boolean r0 = r2.contains(r1)
            if (r0 == 0) goto L_0x003c
            r1 = 1
        L_0x0027:
            boolean r0 = r5.isPreventDownload()
            if (r0 == 0) goto L_0x0040
            boolean r0 = com.p2082ss.android.ugc.aweme.language.C58071d.m104915i()
            if (r0 == 0) goto L_0x0040
            com.ss.android.ugc.aweme.share.ShareService r0 = com.p2082ss.android.ugc.aweme.share.C68863ah.f154027a
            boolean r0 = r0.mo109410a()
            if (r0 == 0) goto L_0x0040
        L_0x003b:
            return r3
        L_0x003c:
            r1 = 0
            if (r5 == 0) goto L_0x0040
            goto L_0x0027
        L_0x0040:
            r3 = r1
            goto L_0x003b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.share.ShareServiceImpl.mo109412a(com.ss.android.ugc.aweme.shortvideo.c, java.lang.String):boolean");
    }

    @Override // com.p2082ss.android.ugc.aweme.share.ShareService
    /* renamed from: a */
    public final boolean mo109411a(Aweme aweme) {
        ACLCommonShare downloadGeneral;
        ACLCommonShare downloadMaskPanel;
        if (aweme == null) {
            return false;
        }
        if (C89219l.m154714a((Object) C68900c.f154110a, (Object) "long_press_download")) {
            AwemeACLShare awemeACLShareInfo = aweme.getAwemeACLShareInfo();
            if (awemeACLShareInfo == null || (downloadMaskPanel = awemeACLShareInfo.getDownloadMaskPanel()) == null || !downloadMaskPanel.getMute()) {
                return false;
            }
            return true;
        }
        AwemeACLShare awemeACLShareInfo2 = aweme.getAwemeACLShareInfo();
        if (awemeACLShareInfo2 == null || (downloadGeneral = awemeACLShareInfo2.getDownloadGeneral()) == null || !downloadGeneral.getMute()) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.share.ShareService
    /* renamed from: b */
    public final AbstractC63220bg mo109416b() {
        return new C69458h();
    }

    /* renamed from: d */
    public static ShareService m121448d() {
        MethodCollector.m26663i(4510);
        Object a = C81908b.m141854a(ShareService.class, false);
        if (a != null) {
            ShareService shareService = (ShareService) a;
            MethodCollector.m26664o(4510);
            return shareService;
        }
        if (C81908b.f183325dV == null) {
            synchronized (ShareService.class) {
                try {
                    if (C81908b.f183325dV == null) {
                        C81908b.f183325dV = new ShareServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(4510);
                    throw th;
                }
            }
        }
        ShareServiceImpl shareServiceImpl = (ShareServiceImpl) C81908b.f183325dV;
        MethodCollector.m26664o(4510);
        return shareServiceImpl;
    }

    /* renamed from: com.ss.android.ugc.aweme.share.ShareServiceImpl$b */
    static final class RunnableC68830b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Activity f153928a;

        /* renamed from: b */
        final /* synthetic */ View$OnClickListenerC50111bg f153929b;

        /* renamed from: c */
        final /* synthetic */ Aweme f153930c;

        static {
            Covode.recordClassIndex(81128);
        }

        RunnableC68830b(Activity activity, View$OnClickListenerC50111bg bgVar, Aweme aweme) {
            this.f153928a = activity;
            this.f153929b = bgVar;
            this.f153930c = aweme;
        }

        public final void run() {
            Aweme aweme;
            View view;
            if (!this.f153928a.isFinishing() && (aweme = this.f153930c) != null && aweme.getAuthor() != null && aweme.getVideo() != null) {
                this.f153929b.f115678f = this.f153928a;
                this.f153929b.mo85244c();
                View$OnClickListenerC50111bg bgVar = this.f153929b;
                bgVar.f115681i = AwemeService.m70060b().mo60677a(this.f153930c);
                C34577e.m70593a(bgVar.f115680h, bgVar.f115681i.getVideo().getCover(), (int) C13628n.m24520b(bgVar.f115678f, 49.0f), (int) C13628n.m24520b(bgVar.f115678f, 59.0f));
                if (bgVar.f115681i != null && bgVar.f115681i.isPrivate() && (view = bgVar.f115677e) != null) {
                    TextView textView = (TextView) view.findViewById(R.id.f6m);
                    TextView textView2 = (TextView) view.findViewById(R.id.euz);
                    User currentUser = BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUser();
                    if (textView != null && textView2 != null && currentUser != null) {
                        Context context = textView.getContext();
                        if (C63753j.f144516a) {
                            textView.setText(context.getString(R.string.etg));
                            textView2.setText(context.getString(R.string.etf));
                        }
                    }
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.share.ShareService
    /* renamed from: b */
    public final void mo109417b(Activity activity) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(activity, "");
        Intent intent = new Intent(activity, UserQRCodeActivity.class);
        C84349a.m145093a(intent, activity);
        activity.startActivity(intent);
    }

    @Override // com.p2082ss.android.ugc.aweme.share.ShareService
    /* renamed from: a */
    public final ShareChannelBar mo109398a(Activity activity) {
        MethodCollector.m26663i(8059);
        C89219l.m154721d(activity, "");
        C89219l.m154721d(activity, "");
        View inflate = activity.getLayoutInflater().inflate(R.layout.ayl, (ViewGroup) null);
        if (inflate != null) {
            ShareChannelBar shareChannelBar = (ShareChannelBar) inflate;
            MethodCollector.m26664o(8059);
            return shareChannelBar;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.sharer.ui.bar.ShareChannelBar");
        MethodCollector.m26664o(8059);
        throw nullPointerException;
    }

    @Override // com.p2082ss.android.ugc.aweme.share.ShareService
    /* renamed from: a */
    public final void mo109407a(Context context, boolean z) {
        if (context != null) {
            C1731i.m5640b(new CallableC58904g(context, z), C1731i.f5562a);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0150  */
    @Override // com.p2082ss.android.ugc.aweme.share.ShareService
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p2082ss.android.ugc.aweme.share.p3745c.AbstractC68903b mo109394a(android.app.Activity r16, com.p2082ss.android.ugc.aweme.feed.model.Aweme r17) {
        /*
        // Method dump skipped, instructions count: 373
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.share.ShareServiceImpl.mo109394a(android.app.Activity, com.ss.android.ugc.aweme.feed.model.Aweme):com.ss.android.ugc.aweme.share.c.b");
    }

    @Override // com.p2082ss.android.ugc.aweme.share.ShareService
    /* renamed from: c */
    public final SharePackage mo109419c(Activity activity, C11666c cVar, AbstractC11665b bVar) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(bVar, "");
        return LiveSharePackage.C69226a.m122338a(cVar, activity);
    }

    @Override // com.p2082ss.android.ugc.aweme.share.ShareService
    /* renamed from: a */
    public final AbstractC68903b mo109395a(Activity activity, Aweme aweme, int i) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(aweme, "");
        View$OnClickListenerC50111bg bgVar = new View$OnClickListenerC50111bg();
        if (i > 0) {
            bgVar.f115673a = i;
        }
        C29339a.m58753a(new RunnableC68830b(activity, bgVar, aweme), 150);
        return bgVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.share.ShareService
    /* renamed from: a */
    public final AbstractC69358o mo109396a(User user, Activity activity, AbstractC63510e eVar) {
        String str;
        int i;
        MethodCollector.m26663i(7386);
        C89219l.m154721d(activity, "");
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(activity, "");
        C89219l.m154721d(eVar, "");
        if (user == null || user.getShareInfo() == null) {
            MethodCollector.m26664o(7386);
            return null;
        }
        UserSharePackage a = UserSharePackage.C69241a.m122365a(user, activity, null);
        if (C80580in.m139694g(user)) {
            str = "personal_homepage";
        } else {
            str = "others_homepage";
        }
        a.f155492i.putString("enter_from", str);
        a.f155492i.putString("enter_method", "button");
        C69684e.C69686b bVar = new C69684e.C69686b();
        if (!ShareDependService.C68822a.m121324a().mo109350c()) {
            C69317i.m122515a(bVar, ShareDependService.C68823b.m121325a(ShareDependService.C68822a.m121324a(), a, str, 4));
        }
        C68863ah.f154027a.mo109409a((ShareService) bVar, (C69684e.C69686b) activity, (Activity) true);
        bVar.f155579j = R.string.fre;
        bVar.f155584o = false;
        LayoutInflater from = LayoutInflater.from(activity);
        if (C81912a.f183421a && C80580in.m139694g(user)) {
            i = R.layout.az1;
        } else if (UserSharePackage.C69241a.m122368a(user)) {
            i = R.layout.az0;
        } else {
            i = R.layout.az3;
        }
        bVar.f155585p = from.inflate(i, (ViewGroup) null);
        if (C31575b.m65865g().isMe(user.getUid()) || !user.isSecret()) {
            bVar.mo109823a(new C69109b());
            C39162r.m79460a("share_person_show", new C33744d().mo59983a("enter_method", "click_head").mo59983a("enter_from", str).mo59983a("author_id", user.getUid()).f79943a);
        } else {
            bVar.f155573d = true;
        }
        bVar.mo109824a(a);
        bVar.mo109826a(new UserSharePackage.C69241a.C69243b(a, str, activity, user));
        DialogC30985a aVar = new DialogC30985a(user, activity, eVar, bVar.mo109831a(), (byte) 0);
        MethodCollector.m26664o(7386);
        return aVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.share.ShareService
    /* renamed from: b */
    public final Dialog mo109415b(Activity activity, C11666c cVar, AbstractC11665b bVar) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(bVar, "");
        LiveSharePackage a = LiveSharePackage.C69226a.m122338a(cVar, activity);
        C89219l.m154721d(activity, "");
        C89219l.m154721d(cVar, "");
        ArrayList arrayList = new ArrayList();
        if (cVar.f27802I) {
            if (cVar.f27808O) {
                arrayList.add(new C69265h(new C69267j(activity, cVar), 10));
            } else {
                arrayList.add(new C69265h(new C69263f(activity, cVar), 10));
            }
        }
        if (cVar.f27803J) {
            if (cVar.f27808O) {
                arrayList.add(new C69265h(new C69258b(cVar), 15));
            } else {
                arrayList.add(new C69265h(new C69262e(cVar), 15));
            }
        }
        C69684e a2 = LiveSharePackage.C69226a.m122339a(activity, cVar, arrayList, bVar, a);
        DialogC69418s.C69419a.C69420a aVar = new DialogC69418s.C69419a.C69420a(a2.f155558j, a2.f155561m, a2.f155550b, LiveSharePackage.C69226a.m122340a(activity, cVar));
        C89219l.m154721d(activity, "");
        C89219l.m154721d(a, "");
        C89219l.m154721d(aVar, "");
        return new DialogC69418s(activity, aVar, new C50384h(a, aVar));
    }

    @Override // com.p2082ss.android.ugc.aweme.share.ShareService
    /* renamed from: a */
    public final Dialog mo109393a(Activity activity, C11666c cVar, AbstractC11665b bVar) {
        boolean z;
        C89219l.m154721d(activity, "");
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(activity, "");
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(bVar, "");
        LiveSharePackage a = LiveSharePackage.C69226a.m122338a(cVar, activity);
        ArrayList arrayList = new ArrayList();
        if (cVar.f27813c != -1) {
            IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
            C89219l.m154716b(createIUserServicebyMonsterPlugin, "");
            if (!C89219l.m154714a((Object) createIUserServicebyMonsterPlugin.getCurrentUserID(), (Object) String.valueOf(cVar.f27814d))) {
                if (TextUtils.equals(cVar.f27836z, "live_links")) {
                    arrayList.add(new C69265h(new C69261d(activity, cVar), 10));
                } else if (cVar.f27808O) {
                    arrayList.add(new C69265h(new C69267j(activity, cVar), 10));
                } else {
                    arrayList.add(new C69265h(new C69266i(activity, cVar), 10));
                }
            }
            arrayList.add(new C69265h(new C69260c(activity, cVar), 20));
            AbstractC11846d a2 = C11755f.m20713a();
            if (a2 != null && a2.mo13041v()) {
                arrayList.add(new C69265h(new C69268k(activity, cVar), 30));
            }
            if (cVar.f27828r) {
                arrayList.add(new C69265h(new C69264g(cVar), 40));
            }
            AbstractC11846d a3 = C11755f.m20713a();
            if (a3 != null) {
                z = a3.mo13042w();
            } else {
                z = false;
            }
            AbstractC11846d a4 = C11755f.m20713a();
            if (a4 != null && a4.mo13007a(cVar.f27836z, cVar.f27794A) && z) {
                if (cVar.f27808O) {
                    arrayList.add(new C69265h(new C69258b(cVar), 15));
                } else {
                    arrayList.add(new C69265h(new C69257a(cVar), 15));
                }
            }
        }
        return ShareDependService.C68822a.m121324a().mo109326a(activity, LiveSharePackage.C69226a.m122339a(activity, cVar, arrayList, bVar, a), R.style.wn);
    }

    @Override // com.p2082ss.android.ugc.aweme.share.ShareService
    /* renamed from: a */
    public final SharePackage mo109397a(Context context, Aweme aweme, String str, String str2) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(aweme, "");
        if (str == null) {
            str = "";
        }
        return AwemeSharePackage.C69206a.m122312a(aweme, context, 0, str, str2);
    }

    @Override // com.p2082ss.android.ugc.aweme.share.ShareService
    /* renamed from: b */
    public final Dialog mo109414b(Activity activity, Fragment fragment, Aweme aweme, AbstractC49691s<C49672ag> sVar, Bundle bundle) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(fragment, "");
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(sVar, "");
        C89219l.m154721d(bundle, "");
        return new C68879a(activity, fragment, aweme, sVar, bundle).mo109449a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0341, code lost:
        if (r2.getPrivateStatus() == 1) goto L_0x01ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x053d, code lost:
        if (com.p2082ss.android.ugc.aweme.utils.C80580in.m139681a(r6.getAuthorUid()) == false) goto L_0x03fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x027a, code lost:
        if (r0.f154078o.isFinishing() == false) goto L_0x027c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0326, code lost:
        if (((com.bytedance.ies.uikit.p1279a.AbstractC18234b) r2).af_() != false) goto L_0x027c;
     */
    @Override // com.p2082ss.android.ugc.aweme.share.ShareService
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.app.Dialog mo109392a(android.app.Activity r24, androidx.fragment.app.Fragment r25, com.p2082ss.android.ugc.aweme.feed.model.Aweme r26, boolean r27, com.p2082ss.android.ugc.aweme.feed.p2949i.AbstractC49691s<com.p2082ss.android.ugc.aweme.feed.p2949i.C49672ag> r28, android.os.Bundle r29) {
        /*
        // Method dump skipped, instructions count: 1464
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.share.ShareServiceImpl.mo109392a(android.app.Activity, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.feed.model.Aweme, boolean, com.ss.android.ugc.aweme.feed.i.s, android.os.Bundle):android.app.Dialog");
    }
}
