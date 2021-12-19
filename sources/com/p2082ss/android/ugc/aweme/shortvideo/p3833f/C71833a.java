package com.p2082ss.android.ugc.aweme.shortvideo.p3833f;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.common.utility.p910e.C13611a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import com.p2082ss.android.ugc.aweme.p2730de.C40973h;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.C70651du;
import com.p2082ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.p2082ss.android.ugc.aweme.shortvideo.ClientCherEffectParam;
import com.p2082ss.android.ugc.aweme.shortvideo.DraftUpdateServiceImpl;
import com.p2082ss.android.ugc.aweme.shortvideo.model.ExtractFramesModelExtKt;
import com.p2082ss.android.ugc.aweme.shortvideo.model.RecordScene;
import com.p2082ss.android.ugc.aweme.shortvideo.p3850p.C72477c;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.TimeSpeedModelExtension;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import com.p2082ss.android.ugc.aweme.utils.C80357ds;
import java.util.ArrayList;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.f.a */
public final class C71833a {
    static {
        Covode.recordClassIndex(84379);
    }

    /* renamed from: a */
    public static void m126850a(Map<String, Object> map) {
        if (map != null && !map.isEmpty()) {
            SharedPreferences.Editor edit = C34822d.m71158a(C63247i.f143610a, "publish", 0).edit();
            edit.putString("video_record_metadata", C80357ds.m139323a(map));
            C13611a.m24460a(edit);
        }
    }

    /* renamed from: c */
    public static int m126853c() {
        return C34822d.m71158a(C63247i.f143610a, "publish", 0).getInt("shoot_mode", 0);
    }

    /* renamed from: d */
    public static int m126855d() {
        return C34822d.m71158a(C63247i.f143610a, "publish", 0).getInt("checkpoint_scene", 3);
    }

    /* renamed from: a */
    public static void m126843a() {
        C73991bj.m130128a("PublishSharedPref reset");
        SharedPreferences.Editor edit = C34822d.m71158a(C63247i.f143610a, "publish", 0).edit();
        edit.putString("music_path", "");
        edit.putString("music_model", "");
        edit.putInt("music_start", 0);
        edit.putInt("face_beauty", 0);
        edit.putString("segment_video", "");
        edit.putInt("hard_encode", 0);
        edit.putString("mp4_path", "");
        edit.putString("duet_video_path", "");
        edit.putBoolean("shoutout_params", false);
        edit.putString("duet_audio_path", "");
        edit.putString("creation_id", "");
        edit.putInt("record_mode", 0);
        edit.putString("challenge", "");
        edit.putString("comment_video_moodel", "");
        edit.putInt("checkpoint_scene", 3);
        C13611a.m24460a(edit);
        C72477c.m127864a("normal").mo114742d();
    }

    /* renamed from: b */
    public static RecordScene m126851b() {
        RecordScene recordScene = new RecordScene();
        SharedPreferences a = C34822d.m71158a(C63247i.f143610a, "publish", 0);
        recordScene.musicPath = a.getString("music_path", "");
        recordScene.musicStart = a.getInt("music_start", 0);
        recordScene.videoSegments = CameraComponentModel.m123137a(a.getString("segment_video", ""));
        recordScene.faceBeauty = a.getInt("face_beauty", 0);
        recordScene.hardEncode = a.getInt("hard_encode", 0);
        recordScene.mp4Path = a.getString("mp4_path", "");
        recordScene.maxDuration = a.getLong("max_duration", 15000);
        recordScene.duetAudioPath = a.getString("duet_audio_path", "");
        recordScene.duetVideoPath = a.getString("duet_video_path", "");
        recordScene.shootMode = a.getInt("shoot_mode", 0);
        recordScene.shootedShootMode = a.getInt("shooted_shoot_mode", -1);
        recordScene.creationId = a.getString("creation_id", "");
        if (TextUtils.isEmpty(recordScene.creationId)) {
            recordScene.creationId = UUID.randomUUID().toString();
        }
        recordScene.recordBGMDelay = a.getInt("record_bgm_delay", 0);
        if (recordScene.loudnessBalanceParam != null) {
            recordScene.loudnessBalanceParam.setBgmLoudness((double) a.getFloat("edit_bgm_loudness", 0.0f));
            recordScene.loudnessBalanceParam.setPeakLoudness((double) a.getFloat("edit_peak_loudness", 0.0f));
            recordScene.loudnessBalanceParam.setAvgLoudness((double) a.getFloat("edit_avg_loudness", 0.0f));
        }
        recordScene.recordMode = a.getInt("record_mode", 0);
        recordScene.filterLabels = a.getString("filter_labels", "");
        recordScene.filterIds = a.getString("filter_ids", "");
        recordScene.filterValues = a.getString("filter_values", "");
        recordScene.challengeStr = a.getString("challenge", "");
        recordScene.sharedARModel = RecordScene.string2SharedARModel(a.getString("shared_ar", ""));
        recordScene.commentVideoModel = RecordScene.string2CommentVideoModel(a.getString("comment_video_moodel", ""));
        recordScene.reactionParams = RecordScene.string2ReactionParams(a.getString("reaction", ""));
        recordScene.isShoutout = a.getBoolean("shoutout_params", false);
        recordScene.stitchParams = RecordScene.string2StitchParams(a.getString("stitch_params", ""));
        recordScene.extractFramesModel = ExtractFramesModelExtKt.string2Model(a.getString("shot_extract_frame", ""));
        recordScene.cherEffectParam = RecordScene.getCherEffectParam(a.getString("ve_cher_effect_param", ""));
        recordScene.videoRecordMetadata = C80357ds.m139324a(a.getString("video_record_metadata", ""));
        try {
            recordScene.musicModel = DraftUpdateServiceImpl.createDraftUpdateServicebyMonsterPlugin(false).transformNewAVMusic(a.getString("music_model", ""));
        } catch (Throwable unused) {
        }
        return recordScene;
    }

    /* renamed from: a */
    public static void m126844a(int i) {
        SharedPreferences.Editor edit = C34822d.m71158a(C63247i.f143610a, "publish", 0).edit();
        edit.putInt("hard_encode", i);
        C13611a.m24460a(edit);
    }

    /* renamed from: b */
    public static void m126852b(int i) {
        SharedPreferences.Editor edit = C34822d.m71158a(C63247i.f143610a, "publish", 0).edit();
        edit.putInt("shoot_mode", i);
        C13611a.m24460a(edit);
    }

    /* renamed from: c */
    public static void m126854c(int i) {
        SharedPreferences.Editor edit = C34822d.m71158a(C63247i.f143610a, "publish", 0).edit();
        edit.putInt("shooted_shoot_mode", i);
        C13611a.m24460a(edit);
    }

    /* renamed from: a */
    public static void m126845a(CommentVideoModel commentVideoModel) {
        SharedPreferences.Editor edit = C34822d.m71158a(C63247i.f143610a, "publish", 0).edit();
        if (commentVideoModel != null) {
            edit.putString("comment_video_moodel", C63244g.m114602a().mo73261G().mo46674b(commentVideoModel));
        } else {
            edit.remove("comment_video_moodel");
        }
        C13611a.m24460a(edit);
    }

    /* renamed from: d */
    public static void m126856d(int i) {
        SharedPreferences.Editor edit = C34822d.m71158a(C63247i.f143610a, "publish", 0).edit();
        edit.putInt("checkpoint_scene", i);
        C13611a.m24460a(edit);
    }

    /* renamed from: a */
    public static void m126846a(ClientCherEffectParam clientCherEffectParam) {
        SharedPreferences.Editor edit = C34822d.m71158a(C63247i.f143610a, "publish", 0).edit();
        if (clientCherEffectParam != null) {
            edit.putString("ve_cher_effect_param", C63244g.m114602a().mo73261G().mo46674b(clientCherEffectParam));
        } else {
            edit.remove("ve_cher_effect_param");
        }
        C13611a.m24460a(edit);
    }

    /* renamed from: a */
    public static void m126847a(String str) {
        SharedPreferences.Editor edit = C34822d.m71158a(C63247i.f143610a, "publish", 0).edit();
        edit.putString("creation_id", str);
        C13611a.m24460a(edit);
    }

    /* renamed from: a */
    public static void m126849a(ArrayList<TimeSpeedModelExtension> arrayList) {
        SharedPreferences.Editor edit = C34822d.m71158a(C63247i.f143610a, "publish", 0).edit();
        edit.putString("segment_video", C70651du.m124878a(arrayList));
        C13611a.m24460a(edit);
        C72477c.m127864a("normal").mo114741c();
    }

    /* renamed from: a */
    public static void m126848a(String str, C69905c cVar, int i) {
        String str2;
        SharedPreferences.Editor edit = C34822d.m71158a(C63247i.f143610a, "publish", 0).edit();
        edit.putString("music_path", str);
        if (cVar != null) {
            try {
                str2 = C40973h.m82494a().mo46674b(cVar);
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                if (cVar.getMusicWaveData() != null) {
                    float[] musicWaveData = cVar.getMusicWaveData();
                    int length = musicWaveData.length;
                    for (int i2 = 0; i2 < length; i2++) {
                        sb.append(musicWaveData[i2] + ",");
                    }
                }
                C73991bj.m130128a("music id:" + cVar.getMusicId() + "; music name:" + cVar.getName() + "; music wave data:" + sb.toString());
                throw e;
            }
        } else {
            str2 = "";
        }
        edit.putString("music_model", str2);
        edit.putInt("music_start", i);
        C13611a.m24460a(edit);
    }
}
