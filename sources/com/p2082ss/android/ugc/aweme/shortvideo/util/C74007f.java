package com.p2082ss.android.ugc.aweme.shortvideo.util;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.common.utility.C13617h;
import com.bytedance.common.utility.p910e.C13611a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.google.gson.C27910f;
import com.google.p1998c.p1999a.C27252o;
import com.p2082ss.android.ttve.nativePort.C30731d;
import com.p2082ss.android.ugc.asve.p2217f.C31097e;
import com.p2082ss.android.ugc.asve.p2217f.C31098f;
import com.p2082ss.android.ugc.aweme.C40899cz;
import com.p2082ss.android.ugc.aweme.account.model.AbstractC32846a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity;
import com.p2082ss.android.ugc.aweme.internal.AVCommerceServiceImpl;
import com.p2082ss.android.ugc.aweme.internal.IInternalCommerceService;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import com.p2082ss.android.ugc.aweme.p2730de.C40964c;
import com.p2082ss.android.ugc.aweme.p2730de.C40982q;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63253l;
import com.p2082ss.android.ugc.aweme.services.effect.EffectService;
import com.p2082ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p2082ss.android.ugc.aweme.shortvideo.C69840ar;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.C70621cx;
import com.p2082ss.android.ugc.aweme.shortvideo.C70622cy;
import com.p2082ss.android.ugc.aweme.shortvideo.C71815es;
import com.p2082ss.android.ugc.aweme.shortvideo.model.Mission;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MissionUser;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.shortvideo.model.RecordPresetResource;
import com.p2082ss.android.ugc.aweme.shortvideo.model.RecordScene;
import com.p2082ss.android.ugc.aweme.shortvideo.p3854r.C72724a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.VideoRecordNewActivity;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.VideoRecordPermissionActivity;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.permissionmanager.C73766c;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.task.C73806f;
import com.p2082ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.p2082ss.android.ugc.aweme.shortvideo.upload.C73917r;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73975b;
import com.p2082ss.android.ugc.aweme.sticker.p3970p.C75462e;
import com.p2082ss.android.ugc.aweme.sticker.p3970p.C75466g;
import com.p2082ss.android.ugc.aweme.story.publish.StoryPublishServiceImpl;
import com.p2082ss.android.ugc.aweme.ttep.C79202ac;
import com.p2082ss.android.ugc.aweme.ttep.TTEPEffectPreviewActivity;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80510gr;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.android.ugc.tools.view.p4366e.ProgressDialogC84958b;
import com.p2082ss.android.ugc.trill.R;
import dmt.p4542av.video.p4549f.C88264d;
import dmt.p4542av.video.p4549f.C88267g;
import dmt.p4542av.video.p4549f.C88269i;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import p077b.C1731i;
import p077b.C1743j;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.f */
public final class C74007f {

    /* renamed from: a */
    private static C27252o f166101a;

    static {
        Covode.recordClassIndex(86757);
    }

    /* renamed from: a */
    public static void m130161a(Activity activity, Intent intent) {
        if (intent == null || activity == null || m130173b(intent)) {
            C84911q.m145928d("unable to start activity,isAppBackground " + C40964c.C40968c.f95804a.mo70144a());
            return;
        }
        C40899cz a = C40899cz.C40900a.m82377a();
        intent.putExtra("sdk_load_ve_so_status", C73987bf.m130120a(C30731d.f73581a));
        intent.putExtra("preload_ve_so_task_status", a.getPreLoadVESoStatus().toStatusCode());
        intent.putExtra("preload_ve_so_cost_time", a.getPreLoadVESoCostTime());
        C73975b.C73976a.f166071a.recordPerformanceLog("pre_enter_record_page", new C74017g(a));
        if (intent.getBooleanExtra("need_refresh_filter_data", false)) {
            C73806f.m129872a(new C88264d());
        }
        C80510gr.m139527a("camera_start");
        C31097e.f74515a = System.currentTimeMillis();
        if (intent.getLongExtra("extra_start_record_time", 0) == 0) {
            intent.putExtra("extra_start_record_time", System.currentTimeMillis());
        }
        C63238c.m114590a(C71815es.m126788a());
        boolean booleanExtra = intent.getBooleanExtra("extra_need_permission_activity", false);
        if (!C73766c.m129818a(intent).mo116239a(activity) || booleanExtra) {
            intent.setClass(activity, VideoRecordPermissionActivity.class);
            m130171b(activity, intent);
            return;
        }
        C73975b.C73976a.f166071a.step("av_video_record_init", "startToolPermissionActivity");
        boolean booleanExtra2 = intent.getBooleanExtra("enter_record_directly_from_system", false);
        boolean booleanExtra3 = intent.getBooleanExtra("recreate_record_activity_support", false);
        if (booleanExtra2) {
            C80510gr.m139532a("camera_error", "2");
        } else if (VideoRecordPermissionActivity.m129482b(intent) && C63238c.m114591a()) {
            C80510gr.m139533a("camera_error", "2", "recording");
        } else if (intent.getBooleanExtra("extra_allow_multiple_entrance", false) || VideoRecordPermissionActivity.m129480a(intent) || VideoRecordPermissionActivity.m129482b(intent) || !C63238c.m114591a() || booleanExtra3) {
            if (C63244g.m114602a().mo73287o().mo104784d()) {
                if (StoryPublishServiceImpl.m135314a().isStoryPublishing()) {
                    AVExternalServiceImpl.m113114a().storyService().showPublishingToast(activity);
                    C40982q.m82522a("record", new C69840ar().mo110189a("event", "isPublishing").mo110191a());
                    C80510gr.m139533a("camera_error", "2", "publishing");
                    return;
                }
            } else if (StoryPublishServiceImpl.m135314a().isPublishing(activity)) {
                AVExternalServiceImpl.m113114a().storyService().showPublishingToast(activity);
                C40982q.m82522a("record", new C69840ar().mo110189a("event", "isPublishing").mo110191a());
                C80510gr.m139533a("camera_error", "2", "publishing");
                return;
            }
            C39162r.m79460a("av_memory_log", new C84425b().mo129406a("scene", "entering_record").mo129406a("shoot_way", m130159a(intent, "shoot_way")).mo129406a("creation_id", m130159a(intent, "creation_id")).mo129406a("enter_from", m130159a(intent, "enter_from")).mo129404a("dalvikPss", C73964ar.f166038a.f166040c).mo129404a("nativePss", C73964ar.f166038a.f166041d).mo129404a("otherPss", C73964ar.f166038a.f166043f).mo129404a("totalPss", C73964ar.f166038a.f166042e).f188764a);
            m130176c(activity, intent);
        } else {
            C84911q.m145921a("Recording status:" + C63238c.m114592b() + " recreatedSupport: " + booleanExtra3);
            C40982q.m82522a("record", new C69840ar().mo110189a("event", "isRecording").mo110189a("user_info", C63238c.m114592b()).mo110191a());
            new C79459a(m130150a(activity)).mo123050a(R.string.bzt).mo123053a();
            C80510gr.m139533a("camera_error", "2", "recording");
        }
    }

    /* renamed from: a */
    public static void m130167a(Intent intent) {
        if (TextUtils.isEmpty(m130159a(intent, "creation_id"))) {
            intent.putExtra("creation_id", UUID.randomUUID().toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0203  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x004a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m130162a(final android.app.Activity r15, final android.content.Intent r16, p4600h.p4611f.p4612a.AbstractC89172b<java.util.List<android.os.Bundle>, p4600h.C89391z> r17) {
        /*
        // Method dump skipped, instructions count: 531
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.util.C74007f.m130162a(android.app.Activity, android.content.Intent, h.f.a.b):void");
    }

    /* renamed from: a */
    public static void m130163a(Activity activity, Intent intent, List<Bundle> list) {
        boolean z;
        Object valueOf;
        if (!intent.getBooleanExtra("MUSIC_ID_INVALID", false)) {
            long a = f166101a.mo45339a(TimeUnit.MILLISECONDS);
            C73975b.C73976a.f166071a.step("av_video_record_init", "goRecordActivity");
            Intent intent2 = new Intent();
            if (!m130178d(intent) && intent.hasExtra("record_preset_resource")) {
                intent.removeExtra("record_preset_resource");
            }
            boolean booleanExtra = intent.getBooleanExtra("show_no_splash_ad", false);
            boolean booleanExtra2 = intent.getBooleanExtra("sticker_pannel_show", false);
            boolean booleanExtra3 = intent.getBooleanExtra("enter_record_from_other_platform", false);
            String a2 = m130159a(intent, "shoot_way");
            String a3 = m130159a(intent, "creation_id");
            String a4 = m130159a(intent, "enter_from");
            int intExtra = intent.getIntExtra("draft_to_edit_from", 0);
            int intExtra2 = intent.getIntExtra("extra_video_length", 0);
            if (booleanExtra3) {
                C70005cr.m123611a().mo70083a((C69905c) null);
                C70005cr.m123611a().mo110456f();
            }
            if (booleanExtra) {
                C63238c.f143576c.mo93783l();
            }
            String a5 = m130159a(intent, "mission_data");
            if (TextUtils.equals(a2, "mission") && !TextUtils.isEmpty(a5)) {
                Mission mission = (Mission) new C27910f().mo46670a(a5, Mission.class);
                if (!TextUtils.isEmpty(mission.getStickerId())) {
                    z = false;
                    mission.setStickerToasted(false);
                } else {
                    z = false;
                }
                if (!TextUtils.isEmpty(mission.getMusicId())) {
                    z = z;
                    mission.setMusicToasted(z);
                }
                if (mission.getChallengeNames() != null && !mission.getChallengeNames().isEmpty()) {
                    mission.setChallengeToasted(z);
                }
                if (mission.getMentionedUsers() != null && !mission.getMentionedUsers().isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    for (MissionUser missionUser : mission.getMentionedUsers()) {
                        missionUser.setNickname(missionUser.getNickname().toLowerCase(Locale.getDefault()));
                        arrayList.add(missionUser);
                    }
                    mission.setMentionedUsers(arrayList);
                    mission.setUserToasted(false);
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    mission = mission;
                    jSONObject.put("mission", new JSONObject(new C27910f().mo46674b(mission)));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                intent2.putExtra("commerce_data_in_tools_line", jSONObject.toString());
                AbstractC32846a e2 = C63238c.f143594u.mo93906e();
                C84425b a6 = new C84425b().mo129406a("creation_id", a3).mo129406a("shoot_way", a2).mo129406a("mission_id", mission.getMissionId()).mo129406a("page_source", mission.getEnterFrom());
                String str = "0";
                if (e2 == null) {
                    valueOf = str;
                } else {
                    valueOf = Integer.valueOf(e2.mo58670m());
                }
                C84425b a7 = a6.mo129405a("creator_followers", valueOf);
                if (!C63253l.f143623a.mo73330z().mo93832j()) {
                    str = "1";
                }
                C39162r.m79460a("shoot", a7.mo129406a("creator_type", str).f188764a);
            }
            intent2.putExtra("sticker_pannel_show", booleanExtra2);
            intent2.putExtra("enter_record_from_other_platform", booleanExtra3);
            intent2.putExtra("draft_to_edit_from", intExtra);
            intent2.putExtra("star_atlas_object", m130159a(intent, "star_atlas_object"));
            intent2.putExtra("extra_video_length", intExtra2);
            if (!TextUtils.isEmpty(a4)) {
                intent2.putExtra("enter_from", a4);
            }
            RecordPresetResource recordPresetResource = (RecordPresetResource) intent.getParcelableExtra("record_preset_resource");
            if (list != null) {
                for (Bundle bundle : list) {
                    intent2.putExtras(bundle);
                    if (recordPresetResource != null) {
                        recordPresetResource = m130158a(recordPresetResource, bundle);
                    }
                }
            }
            if (recordPresetResource != null) {
                intent2.putExtra("record_preset_resource", (Parcelable) recordPresetResource);
            }
            Bundle c = m130174c(intent);
            if (c != null) {
                intent2.putExtras(c);
            }
            if (!TextUtils.isEmpty(m130159a(intent, "micro_app_class"))) {
                intent2.putExtra("micro_app_class", m130159a(intent, "micro_app_class"));
            }
            if (TextUtils.isEmpty(a2)) {
                intent2.putExtra("shoot_way", "no_shoot_way");
            }
            if (TextUtils.isEmpty(a3)) {
                a3 = UUID.randomUUID().toString();
                intent2.putExtra("creation_id", a3);
            }
            if (intent2.getLongExtra("extra_start_record_time", 0) == 0) {
                intent2.putExtra("extra_start_record_time", System.currentTimeMillis());
            }
            C70622cy.m124766a(new C70621cx(a2, a3, a4));
            C73917r.m130007a(a3);
            C73806f.m129872a(new C88267g());
            intent2.putExtra("extra_start_record_download_res_time", a);
            if (!intent.hasExtra("stitch_params")) {
                C73975b.C73976a.f166071a.step("av_video_record_init", "real start activity");
                activity.runOnUiThread(new RunnableC74026p(activity, intent2));
            } else if (!"draft_again".equals(a2)) {
                C72724a.m128203a().mo62195a(activity, (StitchParams) intent.getParcelableExtra("stitch_params"), a3);
            } else {
                intent2.putExtra("stitch_params", intent.getParcelableExtra("stitch_params"));
                C73975b.C73976a.f166071a.step("av_video_record_init", "real start activity");
                activity.runOnUiThread(new RunnableC74025o(activity, intent2));
            }
        }
    }

    /* renamed from: a */
    static final /* synthetic */ Void m130160a(String str, Intent intent, Context context, C1743j jVar) {
        try {
            AVChallenge a = C63238c.f143577d.mo93807a(str);
            C70005cr.m123611a().mo110450a(a);
            String challenge2str = RecordScene.challenge2str(a);
            SharedPreferences.Editor edit = C34822d.m71158a(C63247i.f143610a, "publish", 0).edit();
            edit.putString("challenge", challenge2str);
            C13611a.m24460a(edit);
            Bundle bundle = new Bundle();
            bundle.putSerializable("challenge", a);
            if (a == null || a.getStickerId() == null) {
                jVar.mo5555a(bundle);
                return null;
            } else if (!m130178d(intent)) {
                m130166a(context, a.getStickerId(), bundle, jVar, false);
                return null;
            } else {
                m130165a(context, a.getStickerId(), bundle, jVar);
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            jVar.mo5554a(e);
            return null;
        }
    }

    /* renamed from: a */
    private static void m130166a(Context context, String str, Bundle bundle, C1743j<Bundle> jVar, boolean z) {
        C31098f.m64301a(new C74036r(context, z, str, bundle, jVar));
    }

    /* renamed from: a */
    private static void m130165a(Context context, String str, Bundle bundle, C1743j<Bundle> jVar) {
        C31098f.m64301a(new C74037s(context, str, jVar, bundle));
    }

    /* renamed from: a */
    public static void m130164a(Context context, Intent intent) {
        C84349a.m145093a(intent, context);
        context.startActivity(intent);
    }

    /* renamed from: c */
    private static Bundle m130174c(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static Context m130150a(Activity activity) {
        Context applicationContext = activity.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    /* renamed from: b */
    public static boolean m130173b(Intent intent) {
        if (!C40964c.C40968c.f95804a.mo70144a() || !intent.getBooleanExtra("intercept_background", true)) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private static boolean m130178d(Intent intent) {
        boolean z;
        boolean downloadEffectOrMusicAfterEnterCamera = AVExternalServiceImpl.m113114a().configService().avsettingsConfig().downloadEffectOrMusicAfterEnterCamera();
        String a = m130159a(intent, "shoot_way");
        String a2 = m130159a(intent, "mission_data");
        if (!TextUtils.equals(a, "mission") || TextUtils.isEmpty(a2)) {
            z = false;
        } else {
            z = true;
        }
        Parcelable parcelableExtra = intent.getParcelableExtra("record_preset_resource");
        if (!downloadEffectOrMusicAfterEnterCamera || parcelableExtra == null || z) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static C1731i<Bundle> m130156a(String str) {
        String str2;
        Bundle bundle = new Bundle();
        try {
            str2 = C63238c.f143594u.mo93896a(str, null).mo58666i();
        } catch (Exception unused) {
            str2 = "";
        }
        C1743j jVar = new C1743j();
        if (!str2.isEmpty()) {
            bundle.putString("host_name", str2);
        }
        jVar.mo5555a(bundle);
        return jVar.f5610a;
    }

    /* renamed from: a */
    private static C1731i<Bundle> m130151a(Context context, String str) {
        return m130154a(context, str, "", false);
    }

    /* renamed from: b */
    private static void m130171b(Activity activity, Intent intent) {
        C84349a.m145093a(intent, activity);
        activity.startActivity(intent);
    }

    /* renamed from: b */
    private static C1731i<Bundle> m130168b(Context context, final String str) {
        final C1743j jVar = new C1743j();
        if (TextUtils.isEmpty(str)) {
            jVar.mo5555a(new Bundle());
            return jVar.f5610a;
        }
        EffectService.getInstance().createMvEffectPlatform(context).mo78906a(str, (Map<String, String>) null, new IFetchEffectListener() {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.util.C74007f.C740103 */

            static {
                Covode.recordClassIndex(86760);
            }

            @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
            public final void onStart(Effect effect) {
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final /* synthetic */ void onSuccess(Effect effect) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("reuse_mvtheme_enter", true);
                bundle.putString("extra_bind_mv_id", str);
                bundle.putParcelable("extra_mv_effect", effect);
                jVar.mo5555a(bundle);
            }

            @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
            public final void onFail(Effect effect, ExceptionResult exceptionResult) {
                Exception exception = exceptionResult.getException();
                if (exception == null) {
                    exception = new Exception("downloadBindMovieEffect Failed");
                }
                exception.printStackTrace();
                jVar.mo5554a(exception);
            }
        });
        return jVar.f5610a;
    }

    /* renamed from: c */
    private static C1731i<Bundle> m130175c(Context context, String str) {
        ArrayList arrayList = new ArrayList();
        C1743j jVar = new C1743j();
        ProgressDialogC84958b b = ProgressDialogC84958b.m146021b(context, context.getResources().getString(R.string.g1j));
        b.setIndeterminate(true);
        C1731i.m5640b(new CallableC74022l(context, str, b, jVar, arrayList), C1731i.f5562a);
        return jVar.f5610a;
    }

    /* renamed from: b */
    private static C1731i<Bundle> m130169b(String str, Intent intent) {
        boolean z;
        Music music = (Music) intent.getSerializableExtra("sticker_music");
        String a = m130159a(intent, "sticker_with_music_file_path");
        C1743j jVar = new C1743j();
        Bundle bundle = new Bundle();
        IInternalCommerceService h = AVCommerceServiceImpl.m102988h();
        if (!h.mo93962a() || !h.mo93964a(music)) {
            z = true;
        } else {
            z = false;
        }
        if (music != null && z) {
            C69905c b = C63238c.f143581h.mo101543b(music.convertToMusicModel());
            C75462e.m132332a(str, a);
            b.setMusicPriority(2);
            C70005cr.m123611a().mo70083a(b);
            bundle.putString("path", a);
        }
        jVar.mo5555a(bundle);
        return jVar.f5610a;
    }

    /* renamed from: c */
    private static void m130176c(Activity activity, Intent intent) {
        C73975b.C73976a.f166071a.step("av_video_record_init", "startVideoRecordActivity");
        C73806f.m129872a(new C88269i());
        C63238c.m114590a(C71815es.m126788a());
        m130162a(activity, intent, new C74018h(activity, intent));
    }

    /* renamed from: b */
    public static boolean m130172b(Context context, Intent intent) {
        if (!C63238c.m114591a() || !intent.getBooleanExtra("extra_clear_dialog_show_needed", true)) {
            return false;
        }
        C17197a.C17200a a = new C17197a.C17200a(context).mo27189a(R.string.fhv);
        a.mo27194b(R.string.fhu);
        a.mo27195b(R.string.a8y, DialogInterface$OnClickListenerC74019i.f166136a, false).mo27190a(R.string.as0, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC74020j(context, intent), false).mo27193a().mo27184b();
        return true;
    }

    /* renamed from: c */
    public static void m130177c(Context context, Intent intent) {
        if (intent != null) {
            if (C63244g.m114602a().mo73255A().mo93901a()) {
                intent.setClass(context, FTCVideoRecordNewActivity.class);
            } else if (C79202ac.m138055a(intent)) {
                intent.setClass(context, TTEPEffectPreviewActivity.class);
            } else {
                intent.setClass(context, VideoRecordNewActivity.class);
            }
        }
    }

    /* renamed from: a */
    private static C1731i<Bundle> m130157a(String str, Intent intent) {
        C1743j jVar = new C1743j();
        ArrayList<String> a = C75466g.m132343a(str);
        Bundle bundle = new Bundle();
        if (!C13617h.m24465a(a)) {
            bundle.putStringArrayList("reuse_sticker_ids", a);
            bundle.putString("event_shoot_event_track", "");
            com.p2082ss.ugc.effectplatform.model.Effect effect = (com.p2082ss.ugc.effectplatform.model.Effect) intent.getParcelableExtra("music_with_sticker_effect");
            if (effect != null) {
                bundle.putParcelable("first_sticker", effect);
                if (effect.getMusic() != null && !effect.getMusic().isEmpty()) {
                    String a2 = C75462e.m132331a(effect.getMusic().get(0));
                    if (!TextUtils.isEmpty(a2)) {
                        bundle.putString("path", a2);
                    }
                }
            }
        }
        jVar.mo5555a(bundle);
        return jVar.f5610a;
    }

    /* renamed from: a */
    private static RecordPresetResource m130158a(RecordPresetResource recordPresetResource, Bundle bundle) {
        MusicModel a;
        Effect effect;
        ArrayList<String> stringArrayList;
        if (recordPresetResource == null) {
            return null;
        }
        if (bundle == null) {
            return recordPresetResource;
        }
        if (bundle.containsKey("reuse_sticker_ids") && (stringArrayList = bundle.getStringArrayList("reuse_sticker_ids")) != null && !stringArrayList.isEmpty()) {
            recordPresetResource.setEffectId(stringArrayList.get(0));
        }
        if (bundle.containsKey("first_sticker") && (effect = (Effect) bundle.getParcelable("first_sticker")) != null) {
            recordPresetResource.setEffect(effect);
        }
        if (!(C70005cr.m123611a().f156482a == null || (a = C63244g.m114602a().mo73291s().mo101740a(C70005cr.m123611a().f156482a)) == null)) {
            recordPresetResource.setMusicId(a.getMusicId());
            recordPresetResource.setMusicModel(a);
        }
        return recordPresetResource;
    }

    /* renamed from: a */
    public static String m130159a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static C1731i<Bundle> m130152a(Context context, String str, Intent intent) {
        C1743j jVar = new C1743j();
        C1731i.m5640b(new CallableC74035q(str, intent, context, jVar), C1731i.f5562a);
        return jVar.f5610a;
    }

    /* renamed from: a */
    private static C1731i<Bundle> m130153a(Context context, String str, String str2) {
        C1743j jVar = new C1743j();
        ArrayList<String> a = C75466g.m132343a(str);
        if (C13617h.m24465a(a)) {
            jVar.mo5555a(new Bundle());
            return jVar.f5610a;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("reuse_sticker_ids", a);
        bundle.putString("event_shoot_event_track", str2);
        m130165a(context, a.get(0), bundle, jVar);
        return jVar.f5610a;
    }

    /* renamed from: a */
    private static C1731i<Bundle> m130155a(Context context, String str, boolean z) {
        C1743j jVar = new C1743j();
        ProgressDialogC84958b b = ProgressDialogC84958b.m146021b(context, context.getResources().getString(R.string.g1j));
        b.setIndeterminate(true);
        C1731i.m5640b(new CallableC74021k(context, str, z, b, jVar), C1731i.f5562a);
        return jVar.f5610a;
    }

    /* renamed from: a */
    private static C1731i<Bundle> m130154a(Context context, String str, String str2, boolean z) {
        C1743j jVar = new C1743j();
        ArrayList<String> a = C75466g.m132343a(str);
        if (C13617h.m24465a(a)) {
            jVar.mo5555a(new Bundle());
            return jVar.f5610a;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("reuse_sticker_ids", a);
        bundle.putString("event_shoot_event_track", str2);
        m130166a(context, a.get(0), bundle, jVar, z);
        return jVar.f5610a;
    }
}
