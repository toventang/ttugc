package com.p2082ss.android.ugc.aweme.shortvideo;

import android.content.Context;
import android.content.Intent;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.common.utility.C13617h;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.p2082ss.android.ugc.aweme.common.C39053a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.draft.model.DuetExtraInfo;
import com.p2082ss.android.ugc.aweme.filter.StrArray;
import com.p2082ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63253l;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.property.C65357b;
import com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace.C69744c;
import com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.p2082ss.android.ugc.aweme.shortvideo.duet.C70659a;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C71518t;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.model.AVETParameterKt;
import com.p2082ss.android.ugc.aweme.shortvideo.model.ExtraMentionUserModel;
import com.p2082ss.android.ugc.aweme.shortvideo.model.GameDuetResource;
import com.p2082ss.android.ugc.aweme.shortvideo.model.RecordPresetResource;
import com.p2082ss.android.ugc.aweme.shortvideo.model.RecordScene;
import com.p2082ss.android.ugc.aweme.shortvideo.model.ShootExtraData;
import com.p2082ss.android.ugc.aweme.shortvideo.p3793af.C69823b;
import com.p2082ss.android.ugc.aweme.shortvideo.p3833f.C71833a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3836i.C71883i;
import com.p2082ss.android.ugc.aweme.shortvideo.p3836i.C71888m;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.TimeSpeedModelExtension;
import com.p2082ss.android.ugc.aweme.shortvideo.reaction.ReactionParams;
import com.p2082ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.p2082ss.android.ugc.aweme.shoutouts.C74418d;
import com.p2082ss.android.ugc.aweme.sticker.data.QaStruct;
import com.p2082ss.android.ugc.aweme.tools.p4082b.C77816g;
import com.p2082ss.android.ugc.aweme.tools.p4082b.EnumC77814e;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectTemplate;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.dn */
public final class C70643dn {
    static {
        Covode.recordClassIndex(83109);
    }

    /* renamed from: a */
    private static ShortVideoContext m124851a(Intent intent) {
        if (C63244g.m114602a().mo73255A().mo93901a()) {
            return m124863c(intent);
        }
        return m124859b(intent);
    }

    /* renamed from: b */
    private static void m124862b(ShortVideoContext shortVideoContext) {
        if (shortVideoContext.f155817b.mo109889b()) {
            shortVideoContext.mo110001a(C71883i.m126948a(shortVideoContext.f155817b.f155659o.f155682d, shortVideoContext.f155817b.f155659o.f155681c));
        } else if (shortVideoContext.f155817b.mo109890c()) {
            shortVideoContext.mo110001a(C71883i.m126948a(shortVideoContext.f155817b.f155660p.f155723a.wavPath, shortVideoContext.f155817b.f155660p.f155723a.videoPath));
        } else {
            String str = null;
            if (shortVideoContext.f155817b.mo109888a()) {
                str = shortVideoContext.f155817b.f155652h.mo110093c();
            }
            shortVideoContext.mo110001a(C71888m.m126958a(str));
        }
        C84911q.m145928d("maxduration is " + shortVideoContext.f155817b.f155646b);
    }

    /* renamed from: a */
    public static void m124856a(ShortVideoContext shortVideoContext) {
        String str;
        shortVideoContext.f155823h = null;
        if (shortVideoContext.f155817b.mo109889b()) {
            str = shortVideoContext.f155817b.f155659o.f155682d;
        } else if (shortVideoContext.f155817b.mo109890c()) {
            str = shortVideoContext.f155817b.f155660p.f155723a.wavPath;
        } else {
            str = null;
        }
        shortVideoContext.mo110011a(str);
        if (!TextUtils.isEmpty(shortVideoContext.f155817b.f155669y)) {
            shortVideoContext.f155817b.f155652h.mo110090a(shortVideoContext.f155817b.f155669y);
        } else {
            shortVideoContext.f155817b.f155652h.mo110094d();
        }
        m124862b(shortVideoContext);
        shortVideoContext.f155822g = (int) shortVideoContext.f155817b.f155646b;
        shortVideoContext.f155819d = null;
    }

    /* renamed from: c */
    private static ShortVideoContext m124863c(Intent intent) {
        ShortVideoContext shortVideoContext = new ShortVideoContext(new CameraComponentModel(0));
        shortVideoContext.f155742C = AVETParameterKt.generateAVETParam(intent);
        shortVideoContext.f155830o = m124853a(intent, "creation_id");
        shortVideoContext.f155831p = m124853a(intent, "shoot_way");
        shortVideoContext.f155833r = m124853a(intent, "shoot_from");
        shortVideoContext.f155837v = m124853a(intent, "enter_from");
        shortVideoContext.f155740A = 0;
        shortVideoContext.mo110005a(C69744c.m123266a());
        shortVideoContext.f155763X = intent.getIntExtra("shoot_mode", 0);
        shortVideoContext.mo110011a(m124853a(intent, "path"));
        if (!TextUtils.isEmpty(shortVideoContext.f155817b.f155669y)) {
            shortVideoContext.f155817b.f155652h.mo110090a(shortVideoContext.f155817b.f155669y);
        }
        shortVideoContext.mo110035k();
        intent.getSerializableExtra("music_model");
        shortVideoContext.mo110024d(new C69835am().mo110181a());
        if (shortVideoContext.f155763X != 12) {
            shortVideoContext.mo110021c(C70659a.m124890a(shortVideoContext));
        }
        m124862b(shortVideoContext);
        shortVideoContext.mo110023d(intent.getIntExtra("music_start", 0));
        shortVideoContext.f155822g = (int) shortVideoContext.f155817b.f155646b;
        shortVideoContext.mo110000a(C63238c.f143588o.getVideoWidth());
        shortVideoContext.mo110015b(C63238c.f143588o.getVideoHeight());
        shortVideoContext.mo110006a(new C70650dt());
        shortVideoContext.mo110016b(0L);
        shortVideoContext.mo110019c(C65357b.m117043a() ? 1 : 0);
        shortVideoContext.mo110028e(C70645dp.m124866a().mo110180a());
        shortVideoContext.f155813aw = m124853a(intent, "filter_business_sticker");
        shortVideoContext.f155758S = intent.getBooleanExtra("use_preset_sticker_at_first", shortVideoContext.f155758S);
        shortVideoContext.f155762W = m124853a(intent, "tag_id");
        if (TextUtils.isEmpty(shortVideoContext.f155757R)) {
            shortVideoContext.f155757R = m124853a(intent, "sticker_id");
        }
        if (intent.hasExtra("extra_mention_uid") && intent.hasExtra("extra_mention_user_name")) {
            shortVideoContext.f155802al = ExtraMentionUserModel.Companion.newInstance(m124853a(intent, "extra_mention_uid"), m124853a(intent, "extra_mention_user_name"));
        }
        shortVideoContext.f155791aa = true;
        shortVideoContext.f155769aC = m124853a(intent, "effect_meta_info");
        shortVideoContext.f155770aD = m124853a(intent, "effect_image");
        C77816g.m135932a(intent, C72700q.m128163a(shortVideoContext));
        return shortVideoContext;
    }

    /* renamed from: a */
    private static void m124858a(C74418d dVar) {
        String str;
        if (dVar != null) {
            if (C74418d.MODE_EDIT.equals(dVar.getShoutOutsMode())) {
                str = "video_post_page";
            } else {
                str = "shoutouts_congratulations_page";
            }
            if (C74418d.MODE_SEND.equals(dVar.getShoutOutsMode())) {
                str = "order_detail_page";
            }
            C84425b bVar = new C84425b();
            bVar.mo129406a("reviewed", new StringBuilder().append(dVar.getReviewed()).toString());
            bVar.mo129406a("enter_from", str);
            bVar.mo129406a("shoot_way", C74418d.shootWay);
            if (dVar.getOrderId() != null) {
                bVar.mo129406a("order_id", dVar.getOrderId());
            }
            C39162r.m79460a("shoot", bVar.f188764a);
        }
    }

    /* renamed from: b */
    private static ShortVideoContext m124859b(Intent intent) {
        boolean z;
        boolean z2;
        String a;
        boolean z3;
        EffectTemplate effectTemplate;
        C70005cr.m123611a().mo110453c();
        ShortVideoContext shortVideoContext = new ShortVideoContext(new CameraComponentModel(0));
        shortVideoContext.f155742C = AVETParameterKt.generateAVETParam(intent);
        shortVideoContext.f155830o = m124853a(intent, "creation_id");
        shortVideoContext.f155831p = m124853a(intent, "shoot_way");
        shortVideoContext.f155833r = m124853a(intent, "shoot_from");
        shortVideoContext.f155837v = m124853a(intent, "enter_from");
        shortVideoContext.f155740A = 0;
        shortVideoContext.mo110005a(C69744c.m123266a());
        shortVideoContext.f155763X = intent.getIntExtra("shoot_mode", 0);
        shortVideoContext.f155838w = m124853a(intent, "enter_method");
        shortVideoContext.f155759T = (RecordPresetResource) intent.getParcelableExtra("record_preset_resource");
        shortVideoContext.f155760U = Boolean.valueOf(intent.getBooleanExtra("show_cancel_after_pin_prop", false));
        boolean booleanExtra = intent.getBooleanExtra("publish_with_anim", false);
        if (!"direct_shoot".equals(shortVideoContext.f155831p) || !AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getStoryService().mo93871e() || C63244g.m114602a().mo73255A().mo93901a() || AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getStoryService().mo93868b()) {
            z = false;
        } else {
            z = true;
        }
        C70005cr.m123611a();
        if (booleanExtra || z) {
            z2 = true;
        } else {
            z2 = false;
        }
        C70005cr.f156479k = Boolean.valueOf(z2);
        String a2 = m124853a(intent, "shoutouts_mode");
        if (C74418d.MODE_CREATE.equals(a2)) {
            C70005cr.m123611a().mo110454d();
            shortVideoContext.f155765Z = new C74418d();
            shortVideoContext.f155765Z.setShoutOutsMode(C74418d.MODE_CREATE);
            shortVideoContext.f155831p = C74418d.shootWay;
        }
        shortVideoContext.f155766a.setTag("tag");
        if ("4".equals(a2)) {
            C70005cr.m123611a().mo110454d();
            String a3 = m124853a(intent, "shout_out_order_id");
            if (!TextUtils.isEmpty(a3)) {
                shortVideoContext.f155765Z = new C74418d();
                shortVideoContext.f155765Z.setOrderId(a3);
                shortVideoContext.f155765Z.setShoutOutsMode(C74418d.MODE_SEND);
                shortVideoContext.f155831p = C74418d.shootWay;
            }
        }
        if ("3".equals(a2)) {
            C70005cr.m123611a().mo110454d();
            shortVideoContext.f155765Z = (C74418d) intent.getSerializableExtra("shout_out_data");
            shortVideoContext.f155765Z.setShoutOutsMode(C74418d.MODE_EDIT);
            shortVideoContext.f155831p = C74418d.shootWay;
        }
        m124858a(shortVideoContext.f155765Z);
        shortVideoContext.f155817b.f155659o.f155681c = m124853a(intent, "duet_video_path");
        shortVideoContext.f155817b.f155659o.f155682d = m124853a(intent, "duet_audio_path");
        shortVideoContext.f155817b.f155659o.f155680b = m124853a(intent, "duet_from");
        shortVideoContext.f155776aJ = (User) intent.getSerializableExtra("duet_author");
        shortVideoContext.f155817b.f155659o.f155679a = m124853a(intent, "duet_hash_tag");
        shortVideoContext.f155817b.f155659o.f155686h = intent.getIntExtra("duet_video_width", 0);
        shortVideoContext.f155817b.f155659o.f155687i = intent.getIntExtra("duet_video_height", -1);
        shortVideoContext.f155817b.f155659o.f155692n = intent.getBooleanExtra("duet_from_duet_sticker", false) ? 1 : 0;
        shortVideoContext.f155785aS = intent.getBooleanExtra("duet_from_duet_button", false) ? 1 : 0;
        shortVideoContext.f155817b.f155659o.f155695q = (Effect) intent.getParcelableExtra("duet_layout_effect");
        shortVideoContext.f155784aR = shortVideoContext.f155817b.f155659o.f155692n;
        shortVideoContext.f155817b.f155659o.f155691m = intent.getBooleanExtra("duet_default_mic", false);
        shortVideoContext.f155777aK = (User) intent.getSerializableExtra("reaction_from_author");
        shortVideoContext.f155817b.f155660p.f155723a = (ReactionParams) intent.getParcelableExtra("reaction_params");
        if (shortVideoContext.f155817b.mo109889b()) {
            a = shortVideoContext.f155817b.f155659o.f155682d;
        } else if (shortVideoContext.f155817b.mo109890c()) {
            a = shortVideoContext.f155817b.f155660p.f155723a.wavPath;
        } else {
            a = m124853a(intent, "path");
        }
        shortVideoContext.mo110011a(a);
        if (shortVideoContext.f155763X == 12) {
            StitchParams stitchParams = (StitchParams) intent.getParcelableExtra("stitch_params");
            shortVideoContext.mo110009a(stitchParams);
            if (!TextUtils.isEmpty(stitchParams.getMusicPath()) && stitchParams.getMusicStart() >= 0) {
                shortVideoContext.mo110011a(stitchParams.getMusicPath());
            }
        } else {
            shortVideoContext.mo110035k();
        }
        shortVideoContext.f155835t = m124853a(intent, "reuse_giphy_gifs");
        shortVideoContext.f155766a.setShootExtraData((ShootExtraData) intent.getParcelableExtra("extra_shoot_data"));
        if (!TextUtils.isEmpty(shortVideoContext.f155817b.f155669y)) {
            shortVideoContext.f155817b.f155652h.mo110090a(shortVideoContext.f155817b.f155669y);
        }
        if (intent.hasExtra("extra_bind_mv_id")) {
            shortVideoContext.f155801ak = m124853a(intent, "extra_bind_mv_id");
        }
        intent.getSerializableExtra("music_model");
        shortVideoContext.mo110024d(new C69835am().mo110181a());
        if (shortVideoContext.f155763X != 12) {
            shortVideoContext.mo110021c(C70659a.m124890a(shortVideoContext));
        }
        shortVideoContext.f155772aF = intent.getIntExtra("extra_video_length", 0);
        m124862b(shortVideoContext);
        shortVideoContext.mo110023d(intent.getIntExtra("music_start", 0));
        shortVideoContext.f155822g = (int) shortVideoContext.f155817b.f155646b;
        shortVideoContext.mo110000a(C63238c.f143588o.getVideoWidth());
        shortVideoContext.mo110015b(C63238c.f143588o.getVideoHeight());
        shortVideoContext.mo110006a(new C70650dt());
        shortVideoContext.mo110016b(0L);
        shortVideoContext.mo110019c(C65357b.m117043a() ? 1 : 0);
        shortVideoContext.mo110028e(C70645dp.m124866a().mo110180a());
        shortVideoContext.f155799ai = intent.getBooleanExtra("extra_to_status", false);
        List<AVChallenge> list = C70005cr.m123611a().f156485d;
        if (C13617h.m24466b(list) && list.get(0) != null) {
            AVChallenge aVChallenge = list.get(0);
            if (!TextUtils.isEmpty(aVChallenge.getStickerId())) {
                shortVideoContext.f155757R = list.get(0).getStickerId();
                shortVideoContext.f155761V = list.get(0).getStickerId();
                shortVideoContext.f155758S = true;
            } else {
                shortVideoContext.f155758S = intent.getBooleanExtra("use_preset_sticker_at_first", false);
            }
            shortVideoContext.f155799ai = aVChallenge.mStatus.booleanValue();
        }
        if (!C13617h.m24466b(list) || TextUtils.isEmpty(list.get(0).getStickerId())) {
            shortVideoContext.f155758S = intent.getBooleanExtra("use_preset_sticker_at_first", false);
        } else {
            shortVideoContext.f155757R = list.get(0).getStickerId();
            shortVideoContext.f155761V = list.get(0).getStickerId();
            shortVideoContext.f155758S = true;
        }
        shortVideoContext.f155813aw = m124853a(intent, "filter_business_sticker");
        shortVideoContext.f155758S = intent.getBooleanExtra("use_preset_sticker_at_first", shortVideoContext.f155758S);
        shortVideoContext.f155762W = m124853a(intent, "tag_id");
        if (TextUtils.isEmpty(shortVideoContext.f155757R)) {
            shortVideoContext.f155757R = m124853a(intent, "sticker_id");
            shortVideoContext.f155761V = m124853a(intent, "sticker_id");
        }
        if (TextUtils.isEmpty(shortVideoContext.f155761V) && (effectTemplate = (EffectTemplate) intent.getParcelableExtra("first_sticker")) != null) {
            shortVideoContext.f155761V = effectTemplate.getEffectId();
        }
        shortVideoContext.mo110008a((GameDuetResource) intent.getParcelableExtra("duet_sticker_game"));
        shortVideoContext.f155796af = (C71518t) intent.getSerializableExtra("micro_app_info");
        if (intent.getBooleanExtra("enter_record_from_other_platform", false) || shortVideoContext.f155796af != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        shortVideoContext.f155797ag = z3;
        shortVideoContext.f155798ah = intent.getBooleanExtra("to_live", false);
        shortVideoContext.f155828m = m124853a(intent, "extra_live_source_params");
        shortVideoContext.f155800aj = intent.getBooleanExtra("extra_only_show_live_tab", false);
        if (intent.hasExtra("extra_mention_uid") && intent.hasExtra("extra_mention_user_name")) {
            shortVideoContext.f155802al = ExtraMentionUserModel.Companion.newInstance(m124853a(intent, "extra_mention_uid"), m124853a(intent, "extra_mention_user_name"));
        }
        shortVideoContext.f155825j = (CommentVideoModel) intent.getSerializableExtra("comment_video_model");
        C71833a.m126845a(shortVideoContext.f155825j);
        shortVideoContext.f155826k = (QaStruct) intent.getSerializableExtra("question_answer_video_model");
        shortVideoContext.f155791aa = true;
        shortVideoContext.f155769aC = m124853a(intent, "effect_meta_info");
        shortVideoContext.f155770aD = m124853a(intent, "effect_image");
        shortVideoContext.f155782aP = m124853a(intent, "is_west_window_exist");
        shortVideoContext.f155787aU = (C39053a) intent.getSerializableExtra("auto_selected_anchor");
        shortVideoContext.f155788aV = m124853a(intent, "open_platform_extra");
        shortVideoContext.f155789aW = m124853a(intent, "open_platform_client_key");
        C77816g.m135932a(intent, C72700q.m128163a(shortVideoContext));
        return shortVideoContext;
    }

    /* renamed from: a */
    private static String m124853a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static ShortVideoContext m124852a(Intent intent, Context context) {
        int intExtra = intent.getIntExtra("restore", 0);
        if (intExtra == 0) {
            return m124851a(intent);
        }
        if (intExtra == 1) {
            return m124860b(intent, context);
        }
        if (intExtra != 2) {
            return m124851a(intent);
        }
        return m124864c(intent, context);
    }

    /* renamed from: a */
    public static void m124854a(Intent intent, ShortVideoContext shortVideoContext) {
        RetakeVideoContext retakeVideoContext = (RetakeVideoContext) intent.getParcelableExtra("retake_video");
        shortVideoContext.mo110020c(retakeVideoContext.f155731a);
        shortVideoContext.mo110037m();
        shortVideoContext.mo110017b(true);
        if (retakeVideoContext.f155735e != null) {
            shortVideoContext.mo110006a(new C70650dt(retakeVideoContext.f155735e.editSegments));
        }
        shortVideoContext.f155817b.mo109891d().clear();
        shortVideoContext.f155817b.f155652h.mo110092b(retakeVideoContext.f155736f);
        shortVideoContext.mo110004a(retakeVideoContext);
        if (retakeVideoContext.f155737g != null) {
            shortVideoContext.mo110009a(retakeVideoContext.f155737g);
        } else {
            shortVideoContext.mo110035k();
        }
        String str = retakeVideoContext.f155735e.curMultiEditVideoRecordData.musicPath;
        boolean isPlaySingleSegmentMusic = retakeVideoContext.f155735e.curMultiEditVideoRecordData.isPlaySingleSegmentMusic();
        if (str == null || !isPlaySingleSegmentMusic) {
            m124856a(shortVideoContext);
            return;
        }
        shortVideoContext.mo110023d(retakeVideoContext.f155735e.curMultiEditVideoRecordData.musicTrimIn);
        shortVideoContext.f155817b.f155652h.mo110090a(str);
        shortVideoContext.mo110011a(str);
    }

    /* renamed from: b */
    public static void m124861b(Intent intent, ShortVideoContext shortVideoContext) {
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("original_segments");
        int intExtra = intent.getIntExtra("original_music_start", 0);
        C69905c cVar = C70005cr.m123611a().f156482a;
        shortVideoContext.mo110020c(0L);
        shortVideoContext.mo110037m();
        shortVideoContext.mo110017b(false);
        shortVideoContext.mo110004a((RetakeVideoContext) null);
        shortVideoContext.mo110006a(new C70650dt(parcelableArrayListExtra));
        shortVideoContext.mo110016b((long) TimeSpeedModelExtension.calculateRealTime(shortVideoContext.f155817b.f155650f));
        shortVideoContext.f155817b.f155652h.mo110092b(C70638dj.f158102e);
        if (cVar != null) {
            String b = C63253l.f143623a.mo73306b().mo101748b(cVar);
            shortVideoContext.f155817b.f155652h.mo110090a(b);
            shortVideoContext.mo110011a(b);
            shortVideoContext.mo110023d(intExtra);
        } else {
            m124856a(shortVideoContext);
        }
        if (intent.hasExtra("stitch_params")) {
            shortVideoContext.mo110009a((StitchParams) intent.getParcelableExtra("stitch_params"));
        } else {
            shortVideoContext.mo110035k();
        }
    }

    /* renamed from: a */
    private static void m124855a(MediaMetadataRetriever mediaMetadataRetriever, String str) {
        MethodCollector.m26663i(10415);
        if (str != null) {
            try {
                FileInputStream fileInputStream = new FileInputStream(str);
                try {
                    mediaMetadataRetriever.setDataSource(fileInputStream.getFD(), 0, 576460752303423487L);
                    fileInputStream.close();
                    MethodCollector.m26664o(10415);
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    MethodCollector.m26664o(10415);
                    throw th;
                }
            } catch (FileNotFoundException e) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException(e);
                MethodCollector.m26664o(10415);
                throw illegalArgumentException;
            } catch (IOException e2) {
                IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException(e2);
                MethodCollector.m26664o(10415);
                throw illegalArgumentException2;
            }
        } else {
            IllegalArgumentException illegalArgumentException3 = new IllegalArgumentException("path == null");
            MethodCollector.m26664o(10415);
            throw illegalArgumentException3;
        }
    }

    /* renamed from: a */
    private static void m124857a(ShortVideoContext shortVideoContext, Context context) {
        if (shortVideoContext.f155817b.mo109888a()) {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            if (!C69823b.m123388a(shortVideoContext.f155817b.f155652h.mo110093c(), context)) {
                shortVideoContext.f155822g = (int) shortVideoContext.f155817b.f155646b;
                return;
            }
            try {
                if (C69823b.m123387a(shortVideoContext.f155817b.f155652h.mo110093c())) {
                    m124855a(mediaMetadataRetriever, shortVideoContext.f155817b.f155652h.mo110093c());
                } else {
                    mediaMetadataRetriever.setDataSource(context, Uri.parse(shortVideoContext.f155817b.f155652h.mo110093c()));
                }
                shortVideoContext.f155822g = Integer.parseInt(mediaMetadataRetriever.extractMetadata(9));
            } catch (Exception unused) {
                shortVideoContext.f155822g = (int) shortVideoContext.f155817b.f155646b;
            }
        } else {
            shortVideoContext.f155822g = (int) shortVideoContext.f155817b.f155646b;
        }
    }

    /* renamed from: b */
    private static ShortVideoContext m124860b(Intent intent, Context context) {
        int i;
        int i2;
        boolean z;
        ShortVideoContext shortVideoContext = new ShortVideoContext(new CameraComponentModel(1));
        shortVideoContext.f155742C = AVETParameterKt.generateAVETParam(intent);
        shortVideoContext.f155831p = m124853a(intent, "shoot_way");
        shortVideoContext.f155833r = m124853a(intent, "shoot_from");
        shortVideoContext.mo110005a((Workspace) intent.getParcelableExtra("workspace"));
        shortVideoContext.f155818c = intent.getIntExtra("draft_to_edit_from", 0);
        if (shortVideoContext.f155817b.f155652h.mo110093c() != null && C69823b.m123388a(shortVideoContext.f155817b.f155652h.mo110093c(), context)) {
            shortVideoContext.mo110011a(shortVideoContext.f155817b.f155652h.mo110093c());
        }
        if (intent.hasExtra("extra_bind_mv_id")) {
            shortVideoContext.f155801ak = m124853a(intent, "extra_bind_mv_id");
        }
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) intent.getSerializableExtra("video_edit_model");
        int[] recordVideoSize = videoPublishEditModel.getRecordVideoSize();
        if (recordVideoSize.length < 2) {
            shortVideoContext.mo110000a(C63244g.m114602a().mo73280h().getVideoWidth());
            i2 = C63244g.m114602a().mo73280h().getVideoHeight();
        } else {
            if (recordVideoSize[0] == 0) {
                i = C63244g.m114602a().mo73280h().getVideoWidth();
            } else {
                i = recordVideoSize[0];
            }
            shortVideoContext.mo110000a(i);
            if (recordVideoSize[1] == 0) {
                i2 = C63244g.m114602a().mo73280h().getVideoHeight();
            } else {
                i2 = recordVideoSize[1];
            }
        }
        shortVideoContext.mo110015b(i2);
        shortVideoContext.f155763X = videoPublishEditModel.mShootMode;
        shortVideoContext.f155764Y = videoPublishEditModel.mShootedShootMode;
        if (videoPublishEditModel.creativeFlowData != null) {
            shortVideoContext.f155766a = videoPublishEditModel.creativeFlowData;
        }
        shortVideoContext.mo110024d(videoPublishEditModel.mDurationMode);
        shortVideoContext.mo110021c(videoPublishEditModel.isMuted);
        shortVideoContext.f155830o = videoPublishEditModel.creationId;
        shortVideoContext.f155740A = videoPublishEditModel.draftId;
        shortVideoContext.f155741B = videoPublishEditModel.newDraftId;
        shortVideoContext.mo110034j().setDraftId(videoPublishEditModel.draftId);
        shortVideoContext.mo110034j().setNewDraftId(videoPublishEditModel.newDraftId);
        shortVideoContext.mo110034j().setCreationId(videoPublishEditModel.creationId);
        shortVideoContext.f155784aR = videoPublishEditModel.duetFromDuetSticker;
        shortVideoContext.f155817b.f155659o.f155692n = videoPublishEditModel.duetFromDuetSticker;
        DuetExtraInfo duetExtraInfo = (DuetExtraInfo) intent.getParcelableExtra(DuetExtraInfo.class.getName());
        if (duetExtraInfo != null) {
            DuetContext duetContext = shortVideoContext.f155817b.f155659o;
            duetContext.f155681c = duetExtraInfo.getDuetVideoPath();
            duetContext.f155682d = duetExtraInfo.getDuetAudioPath();
            duetContext.f155686h = duetExtraInfo.getDuetVideoWidth();
            duetContext.f155687i = duetExtraInfo.getDuetVideoHeight();
            duetContext.f155693o = duetExtraInfo.getDuetLayoutMode();
            duetContext.f155694p = duetExtraInfo.getDuetLayoutDirection();
            duetContext.f155680b = m124853a(intent, "duet_from");
            duetContext.f155688j = m124853a(intent, "extra_duet_layout");
            shortVideoContext.mo110000a(C63238c.f143588o.getVideoWidth());
            shortVideoContext.mo110015b(C63238c.f143588o.getVideoHeight());
        }
        shortVideoContext.mo110003a(new RecordContext(StrArray.from(videoPublishEditModel.mRecordFilterLabels), StrArray.from(videoPublishEditModel.mRecordFilterIds), StrArray.from(videoPublishEditModel.mRecordFilterValues), new StrArray(), new StrArray(), new StrArray()));
        if (intent.hasExtra("stitch_params")) {
            shortVideoContext.mo110009a((StitchParams) intent.getParcelableExtra("stitch_params"));
        } else {
            shortVideoContext.mo110035k();
        }
        RecordScene recordScene = C70005cr.m123611a().f156497q;
        if (recordScene == null || recordScene.isSegmentsNotValid()) {
            shortVideoContext.mo110006a(new C70650dt());
            shortVideoContext.mo110016b(0L);
            shortVideoContext.mo110019c(C65357b.m117043a() ? 1 : 0);
            shortVideoContext.mo110028e(true);
            String str = null;
            if (shortVideoContext.f155817b.mo109888a() && C69823b.m123388a(shortVideoContext.f155817b.f155652h.mo110093c(), context)) {
                str = shortVideoContext.f155817b.f155652h.mo110093c();
            }
            shortVideoContext.mo110001a(C71888m.m126958a(str));
            shortVideoContext.f155822g = (int) shortVideoContext.f155817b.f155646b;
        } else {
            shortVideoContext.mo110006a(new C70650dt(recordScene.videoSegments));
            shortVideoContext.mo110016b((long) TimeSpeedModelExtension.calculateRealTime(shortVideoContext.f155817b.f155650f));
            shortVideoContext.mo110023d(recordScene.musicStart);
            shortVideoContext.mo110019c(recordScene.hardEncode);
            if (recordScene.faceBeauty > 0) {
                z = true;
            } else {
                z = false;
            }
            shortVideoContext.mo110028e(z);
            shortVideoContext.mo110001a(recordScene.maxDuration);
            m124857a(shortVideoContext, context);
            shortVideoContext.f155819d = recordScene.audioTrack;
        }
        shortVideoContext.f155745F = videoPublishEditModel.title;
        shortVideoContext.f155746G = videoPublishEditModel.chain;
        shortVideoContext.f155747H = videoPublishEditModel.disableDeleteChain;
        shortVideoContext.f155748I = videoPublishEditModel.structList;
        shortVideoContext.f155823h = videoPublishEditModel.mMusicOrigin;
        shortVideoContext.f155749J = videoPublishEditModel.isPrivate;
        shortVideoContext.f155750K = videoPublishEditModel.excludeUserList;
        shortVideoContext.f155751L = videoPublishEditModel.allowRecommend;
        if (!TextUtils.isEmpty(videoPublishEditModel.pic2VideoSource)) {
            String[] split = videoPublishEditModel.pic2VideoSource.split(",");
            if (split.length > 0) {
                shortVideoContext.f155767aA.addAll(Arrays.asList(split));
            }
        }
        shortVideoContext.f155816az = 0;
        shortVideoContext.f155752M = true;
        shortVideoContext.f155832q = true;
        C77816g.m135934a(C72700q.m128164a(videoPublishEditModel), C72700q.m128163a(shortVideoContext), EnumC77814e.DRAFT, EnumC77814e.RECORD);
        shortVideoContext.mo110007a(videoPublishEditModel.extractFramesModel);
        shortVideoContext.f155810at = videoPublishEditModel.draftEditTransferModel;
        shortVideoContext.mo110012a(videoPublishEditModel.metadataMap);
        shortVideoContext.f155825j = videoPublishEditModel.commentVideoModel;
        shortVideoContext.f155826k = videoPublishEditModel.qaStruct;
        if (intent.hasExtra("extra_ve_cher_effect_param")) {
            shortVideoContext.mo110002a((ClientCherEffectParam) intent.getParcelableExtra("extra_ve_cher_effect_param"));
        }
        int intExtra = intent.getIntExtra("retake_shoot_mode", -1);
        if (intExtra == 1) {
            m124854a(intent, shortVideoContext);
        } else if (intExtra == 2) {
            m124861b(intent, shortVideoContext);
        }
        shortVideoContext.f155806ap = videoPublishEditModel.publishStage;
        shortVideoContext.f155778aL = C71817eu.m126797h(videoPublishEditModel);
        shortVideoContext.f155753N = videoPublishEditModel.isPhotoMvMusic;
        shortVideoContext.f155755P = videoPublishEditModel.isDraftMusicIllegal;
        shortVideoContext.f155774aH = videoPublishEditModel.recordBgmDelay;
        shortVideoContext.f155782aP = videoPublishEditModel.isWestWindowExistStr;
        shortVideoContext.f155807aq = videoPublishEditModel.loudnessBalanceParam;
        shortVideoContext.f155787aU = (C39053a) intent.getSerializableExtra("auto_selected_anchor");
        shortVideoContext.f155788aV = m124853a(intent, "open_platform_extra");
        shortVideoContext.f155789aW = m124853a(intent, "open_platform_client_key");
        return shortVideoContext;
    }

    /* renamed from: c */
    private static ShortVideoContext m124864c(Intent intent, Context context) {
        boolean z;
        ShortVideoContext shortVideoContext = new ShortVideoContext(new CameraComponentModel(2));
        shortVideoContext.f155742C = AVETParameterKt.generateAVETParam(intent);
        shortVideoContext.f155831p = m124853a(intent, "shoot_way");
        shortVideoContext.f155833r = m124853a(intent, "shoot_from");
        shortVideoContext.mo110005a(C69744c.m123266a());
        boolean z2 = false;
        shortVideoContext.f155740A = 0;
        shortVideoContext.f155806ap = 50;
        intent.getSerializableExtra("music_model");
        if (intent.hasExtra("extra_bind_mv_id")) {
            shortVideoContext.f155801ak = m124853a(intent, "extra_bind_mv_id");
        }
        shortVideoContext.mo110000a(C63238c.f143588o.getVideoWidth());
        shortVideoContext.mo110015b(C63238c.f143588o.getVideoHeight());
        if (!AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getStoryService().mo93871e() || C63244g.m114602a().mo73255A().mo93901a() || AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getStoryService().mo93868b()) {
            z = false;
        } else {
            z = true;
        }
        C70005cr.m123611a();
        C70005cr.f156479k = Boolean.valueOf(z);
        if (intent.hasExtra("stitch_params")) {
            shortVideoContext.mo110009a((StitchParams) intent.getParcelableExtra("stitch_params"));
        } else {
            shortVideoContext.mo110035k();
        }
        RecordScene b = C71833a.m126851b();
        shortVideoContext.mo110024d(C63244g.m114602a().mo73277e().getDurationMode(true));
        if (b.isSegmentsNotValid()) {
            shortVideoContext.mo110034j().setCreationId(UUID.randomUUID().toString());
            shortVideoContext.f155830o = UUID.randomUUID().toString();
            shortVideoContext.mo110006a(new C70650dt());
            shortVideoContext.mo110016b(0L);
            shortVideoContext.mo110019c(C65357b.m117043a() ? 1 : 0);
            shortVideoContext.mo110028e(true);
            String str = null;
            if (shortVideoContext.f155817b.mo109888a() && C69823b.m123388a(shortVideoContext.f155817b.f155652h.mo110093c(), context)) {
                str = shortVideoContext.f155817b.f155652h.mo110093c();
            }
            shortVideoContext.mo110001a(C71888m.m126958a(str));
            m124857a(shortVideoContext, context);
        } else {
            shortVideoContext.mo110034j().setCreationId(b.creationId);
            shortVideoContext.f155830o = b.creationId;
            shortVideoContext.mo110006a(new C70650dt(b.videoSegments));
            shortVideoContext.mo110016b((long) TimeSpeedModelExtension.calculateRealTime(shortVideoContext.f155817b.f155650f));
            shortVideoContext.mo110011a(b.musicPath);
            if (!TextUtils.isEmpty(b.musicPath)) {
                shortVideoContext.f155817b.f155652h.mo110090a(b.musicPath);
            }
            shortVideoContext.mo110023d(b.musicStart);
            shortVideoContext.mo110019c(b.hardEncode);
            if (b.faceBeauty > 0) {
                z2 = true;
            }
            shortVideoContext.mo110028e(z2);
            shortVideoContext.mo110001a(b.maxDuration);
            m124857a(shortVideoContext, context);
            shortVideoContext.f155819d = b.audioTrack;
            C70005cr.m123611a().mo70083a(b.musicModel);
            shortVideoContext.f155817b.f155660p.f155723a = b.reactionParams;
            shortVideoContext.f155756Q = b.sharedARModel;
            shortVideoContext.f155743D.f155846a = b.stitchParams;
            shortVideoContext.mo110007a(b.extractFramesModel);
            shortVideoContext.mo110003a(new RecordContext(StrArray.from(b.filterLabels), StrArray.from(b.filterIds), StrArray.from(b.filterValues), new StrArray(), new StrArray(), new StrArray(), new StrArray()));
            shortVideoContext.mo110002a(b.cherEffectParam);
            shortVideoContext.mo110012a(b.videoRecordMetadata);
            shortVideoContext.f155825j = b.commentVideoModel;
            shortVideoContext.f155764Y = b.shootedShootMode;
            C70005cr.m123611a().mo110450a(b.getChallengeFromStr());
            shortVideoContext.f155774aH = b.recordBGMDelay;
            shortVideoContext.f155807aq = b.loudnessBalanceParam;
            shortVideoContext.f155787aU = (C39053a) intent.getSerializableExtra("auto_selected_anchor");
            shortVideoContext.f155788aV = m124853a(intent, "open_platform_extra");
            shortVideoContext.f155789aW = m124853a(intent, "open_platform_client_key");
        }
        return shortVideoContext;
    }
}
