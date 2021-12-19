package com.p2082ss.android.ugc.aweme.shortvideo.p3895y;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.commercialize.splash.p1262f.C17964b;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.app.C33836o;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.utils.C34718e;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.services.AsyncAVService;
import com.p2082ss.android.ugc.aweme.services.IExternalService;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.EffectConfig;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.LiveParams;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.RecordConfig;
import com.p2082ss.android.ugc.aweme.shortvideo.model.RecordPresetResource;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import java.util.HashMap;
import java.util.Set;
import java.util.UUID;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.y.a */
public final class C74325a {

    /* renamed from: a */
    public static final C74325a f167152a = new C74325a();

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.y.a$a */
    public static final class C74326a implements IExternalService.ServiceLoadCallback {

        /* renamed from: a */
        final /* synthetic */ Activity f167153a;

        /* renamed from: b */
        final /* synthetic */ RecordConfig.Builder f167154b;

        static {
            Covode.recordClassIndex(87098);
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

        public C74326a(Activity activity, RecordConfig.Builder builder) {
            this.f167153a = activity;
            this.f167154b = builder;
        }

        @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onLoad(AsyncAVService asyncAVService, long j) {
            C89219l.m154721d(asyncAVService, "");
            asyncAVService.uiService().recordService().startRecord(this.f167153a, this.f167154b.build());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.y.a$b */
    public static final class C74327b implements IExternalService.ServiceLoadCallback {

        /* renamed from: a */
        final /* synthetic */ Activity f167155a;

        /* renamed from: b */
        final /* synthetic */ RecordConfig.Builder f167156b;

        static {
            Covode.recordClassIndex(87099);
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

        public C74327b(Activity activity, RecordConfig.Builder builder) {
            this.f167155a = activity;
            this.f167156b = builder;
        }

        @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onLoad(AsyncAVService asyncAVService, long j) {
            C89219l.m154721d(asyncAVService, "");
            asyncAVService.uiService().recordService().startRecord(this.f167155a, this.f167156b.build());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.y.a$c */
    public static final class C74328c implements IExternalService.ServiceLoadCallback {

        /* renamed from: a */
        final /* synthetic */ Activity f167157a;

        /* renamed from: b */
        final /* synthetic */ RecordConfig.Builder f167158b;

        static {
            Covode.recordClassIndex(87100);
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

        C74328c(Activity activity, RecordConfig.Builder builder) {
            this.f167157a = activity;
            this.f167158b = builder;
        }

        @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onLoad(AsyncAVService asyncAVService, long j) {
            C89219l.m154721d(asyncAVService, "");
            asyncAVService.uiService().recordService().startRecord(this.f167157a, this.f167158b.build());
        }
    }

    private C74325a() {
    }

    static {
        Covode.recordClassIndex(87097);
    }

    /* renamed from: a */
    public static void m130796a(Activity activity, Intent intent) {
        C84349a.m145093a(intent, activity);
        activity.startActivity(intent);
    }

    /* renamed from: a */
    public static void m130797a(Activity activity, Uri uri) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(uri, "");
        C33836o a = C33836o.m69201a();
        C89219l.m154716b(a, "");
        boolean a2 = a.f80094a.mo89311a();
        RecordConfig.Builder builder = new RecordConfig.Builder();
        builder.permissionActivityRequired(true);
        m130799a(activity, builder, uri);
        if (a2) {
            AVExternalServiceImpl.m113114a().asyncService(activity, "route", new C74328c(activity, builder));
            return;
        }
        Intent intent = new Intent();
        intent.getFlags();
        intent.setFlags(C74329b.m130801a(activity, intent));
        new Bundle();
        intent.putExtra("EXTRA_AV_RECORD_CONFIG", builder.build());
        intent.putExtras(intent.putExtra("enter_record_from_other_platform", true));
        m130796a(activity, intent);
    }

    /* renamed from: a */
    private static void m130800a(Uri uri, RecordConfig.Builder builder) {
        if (TextUtils.equals("retarget", uri.getQueryParameter("gd_label"))) {
            C39162r.m79460a("shoot", new C33744d().mo59983a("shoot_way", "retarget").f79943a);
        }
        boolean booleanQueryParameter = uri.getBooleanQueryParameter("auto_shoot", false);
        String queryParameter = uri.getQueryParameter("camera_position");
        builder.autoStartRecording(booleanQueryParameter);
        if (queryParameter != null) {
            int hashCode = queryParameter.hashCode();
            if (hashCode != 3015911) {
                if (hashCode == 97705513 && queryParameter.equals("front")) {
                    builder.cameraFacing(1);
                }
            } else if (queryParameter.equals("back")) {
                builder.cameraFacing(0);
            }
        }
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        if (!(queryParameterNames == null || queryParameterNames.isEmpty())) {
            for (String str : queryParameterNames) {
                String queryParameter2 = uri.getQueryParameter(str);
                if (str != null) {
                    switch (str.hashCode()) {
                        case -1195408547:
                            if (str.equals("sticker_id")) {
                                builder.sticker(queryParameter2).usePresetSticker(true);
                                break;
                            } else {
                                continue;
                            }
                        case -818786127:
                            if (str.equals("enter_from")) {
                                builder.enterFrom(queryParameter2);
                                break;
                            } else {
                                continue;
                            }
                        case -719156057:
                            if (str.equals("filter_business")) {
                                builder.filterBuinessSticker(queryParameter2);
                                break;
                            } else {
                                continue;
                            }
                        case 3552126:
                            if (str.equals("tabs")) {
                                builder.tabs(queryParameter2);
                                break;
                            } else {
                                continue;
                            }
                        case 1046359873:
                            if (str.equals("commerce_data_in_tools_line")) {
                                builder.commercialData(queryParameter2);
                                break;
                            } else {
                                continue;
                            }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static void m130799a(Activity activity, RecordConfig.Builder builder, Uri uri) {
        String queryParameter = uri.getQueryParameter("from");
        if (queryParameter == null || queryParameter.length() == 0) {
            queryParameter = "schema";
        }
        if (!TextUtils.isEmpty(uri.getQueryParameter("enter_from"))) {
            queryParameter = uri.getQueryParameter("enter_from");
        }
        builder.shootWay(queryParameter);
        String host = uri.getHost();
        if (host != null) {
            int hashCode = host.hashCode();
            if (hashCode != -891901482) {
                if (hashCode != 305667899) {
                    if (hashCode != 1534905333 || !host.equals("openShoot")) {
                        return;
                    }
                } else if (!host.equals("openRecord")) {
                    return;
                }
                m130798a(activity, uri, builder);
            } else if (host.equals("studio")) {
                m130800a(uri, builder);
            }
        }
    }

    /* renamed from: a */
    private static void m130798a(Activity activity, Uri uri, RecordConfig.Builder builder) {
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        String path = uri.getPath();
        if (path == null) {
            path = "";
        }
        C89219l.m154716b(path, "");
        String queryParameter4 = uri.getQueryParameter("recordParam");
        String queryParameter5 = uri.getQueryParameter("shoutouts");
        String queryParameter6 = uri.getQueryParameter("orderId");
        if (TextUtils.isEmpty(queryParameter6)) {
            queryParameter6 = uri.getQueryParameter("order_id");
        }
        String queryParameter7 = uri.getQueryParameter("recordOrigin");
        String queryParameter8 = uri.getQueryParameter("uid");
        String queryParameter9 = uri.getQueryParameter("nickname");
        boolean booleanQueryParameter = uri.getBooleanQueryParameter("sticker_pannel_show", false);
        String queryParameter10 = uri.getQueryParameter("tab");
        if (TextUtils.isEmpty(path) || !C89361p.m154874b(path, "/detail/", false)) {
            queryParameter = uri.getQueryParameter("id");
        } else {
            queryParameter = uri.getLastPathSegment();
        }
        String queryParameter11 = uri.getQueryParameter("mv_id");
        String queryParameter12 = uri.getQueryParameter("effect_meta_info");
        String queryParameter13 = uri.getQueryParameter("effect_image");
        boolean booleanQueryParameter2 = uri.getBooleanQueryParameter("auto_shoot", false);
        String queryParameter14 = uri.getQueryParameter("camera_position");
        boolean booleanQueryParameter3 = uri.getBooleanQueryParameter("record_tab_only", false);
        String queryParameter15 = uri.getQueryParameter("source_params");
        String queryParameter16 = uri.getQueryParameter("session");
        String queryParameter17 = uri.getQueryParameter("host_uid");
        String queryParameter18 = uri.getQueryParameter(StringSet.type);
        builder.autoStartRecording(booleanQueryParameter2);
        if (queryParameter14 != null) {
            int hashCode = queryParameter14.hashCode();
            if (hashCode != 3015911) {
                if (hashCode == 97705513 && queryParameter14.equals("front")) {
                    builder.cameraFacing(1);
                }
            } else if (queryParameter14.equals("back")) {
                builder.cameraFacing(0);
            }
        }
        builder.showStickerPanel(booleanQueryParameter).mvStickerId(queryParameter11);
        if (queryParameter7 != null) {
            int hashCode2 = queryParameter7.hashCode();
            if (hashCode2 != -887328209) {
                if (hashCode2 == 1036042802 && queryParameter7.equals("jsBridge") && C89219l.m154714a((Object) uri.getQueryParameter("from"), (Object) "dou_plus")) {
                    String uuid = UUID.randomUUID().toString();
                    C89219l.m154716b(uuid, "");
                    C39162r.m79460a("shoot", new C33744d().mo59983a("shoot_way", "dou_plus").mo59983a("creation_id", uuid).f79943a);
                }
            } else if (queryParameter7.equals("system")) {
                builder.shootWay("other_platform_camera");
                IExternalService a = AVExternalServiceImpl.m113114a();
                if (a.configService().shortVideoConfig().isRecording() || a.publishService().inPublishPage(activity)) {
                    builder.fromSystem(true);
                } else {
                    C17964b.f42784c = true;
                }
            }
        }
        if (queryParameter4 != null) {
            switch (queryParameter4.hashCode()) {
                case -2090378579:
                    if (queryParameter4.equals("withStickerPanel")) {
                        builder.showStickerPanel(true);
                        C34718e.m70911a("system_camera_stickers");
                        break;
                    }
                    break;
                case -1890252483:
                    if (queryParameter4.equals("sticker")) {
                        if (!"activity".equals(uri.getQueryParameter("come_from"))) {
                            builder.usePresetSticker(true);
                        } else if (queryParameter != null) {
                            builder.autoUseSticker(queryParameter);
                        }
                        builder.sticker(queryParameter);
                        EffectConfig effectConfig = new EffectConfig();
                        effectConfig.setEffectMetaInfo(queryParameter12);
                        effectConfig.setEffectImage(queryParameter13);
                        builder.effectConfig(effectConfig);
                        break;
                    }
                    break;
                case 114654:
                    if (queryParameter4.equals("tcm")) {
                        HashMap<String, String> hashMap = new HashMap<>();
                        for (String str : uri.getQueryParameterNames()) {
                            C89219l.m154716b(str, "");
                            hashMap.put(str, uri.getQueryParameter(str));
                        }
                        builder.starAtlasConfig(hashMap);
                        builder.shootWay("tcm_upload");
                        break;
                    }
                    break;
                case 104263205:
                    if (queryParameter4.equals("music")) {
                        builder.musicId(queryParameter);
                        break;
                    }
                    break;
                case 1069449612:
                    if (queryParameter4.equals("mission")) {
                        HashMap<String, String> hashMap2 = new HashMap<>();
                        for (String str2 : uri.getQueryParameterNames()) {
                            C89219l.m154716b(str2, "");
                            hashMap2.put(str2, uri.getQueryParameter(str2));
                        }
                        builder.missionConfig(hashMap2);
                        break;
                    }
                    break;
                case 1158383506:
                    if (queryParameter4.equals("donation")) {
                        String uuid2 = UUID.randomUUID().toString();
                        C89219l.m154716b(uuid2, "");
                        builder.shootWay("christmas_h5").creationId(uuid2).donationId(queryParameter);
                        C39162r.m79460a("shoot", new C33744d().mo59983a("shoot_way", "christmas_h5").mo59983a("creation_id", uuid2).f79943a);
                        break;
                    }
                    break;
                case 1402633315:
                    if (queryParameter4.equals("challenge")) {
                        builder.challengeId(queryParameter);
                        break;
                    }
                    break;
            }
        }
        if (!TextUtils.isEmpty(queryParameter8) && !TextUtils.isEmpty(queryParameter9)) {
            if (queryParameter8 == null) {
                C89219l.m154715b();
            }
            if (queryParameter9 == null) {
                C89219l.m154715b();
            }
            builder.mentionUser(queryParameter8, queryParameter9);
        }
        String queryParameter19 = uri.getQueryParameter("from_special_plus");
        if (queryParameter19 != null && (!TextUtils.isEmpty(queryParameter19))) {
            builder.fromSpecialPlus(TextUtils.equals("1", queryParameter19));
            builder.translationType(3);
        }
        if (!TextUtils.isEmpty(queryParameter5)) {
            builder.shoutoutMode(queryParameter5);
        }
        if (!TextUtils.isEmpty(queryParameter6)) {
            builder.shoutoutOrderID(queryParameter6);
        }
        builder.liveParams(new LiveParams(queryParameter15, Boolean.valueOf(booleanQueryParameter3)));
        if (queryParameter10 != null && queryParameter10.hashCode() == 3322092 && queryParameter10.equals("live")) {
            builder.defaultTab(2);
        }
        if (queryParameter18 != null) {
            int hashCode3 = queryParameter18.hashCode();
            if (hashCode3 != -191457939) {
                if (hashCode3 != 801456043) {
                    if (hashCode3 == 1684536965 && queryParameter18.equals("use_sticker")) {
                        String queryParameter20 = uri.getQueryParameter("sticker_id");
                        if (queryParameter20 != null) {
                            builder.sticker(queryParameter20).autoUseSticker(queryParameter20);
                        }
                        if (queryParameter16 != null) {
                            builder.sharedARSessionId(queryParameter16);
                        }
                        if (queryParameter17 != null) {
                            builder.sharedARHostId(queryParameter17);
                        }
                    }
                } else if (queryParameter18.equals("use_challenge") && (queryParameter3 = uri.getQueryParameter("challenge_id")) != null) {
                    builder.challengeId(queryParameter3);
                }
            } else if (queryParameter18.equals("use_music") && (queryParameter2 = uri.getQueryParameter("music_id")) != null) {
                builder.musicId(queryParameter2);
            }
        }
        if (AVExternalServiceImpl.m113114a().configService().avsettingsConfig().downloadEffectOrMusicAfterEnterCamera()) {
            builder.recordPresetResource(new RecordPresetResource(builder.build().getAutoUseSticker(), null, builder.build().getMusicId(), null));
        }
    }
}
