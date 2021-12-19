package com.p2082ss.android.ugc.aweme.shortvideo;

import android.text.TextUtils;
import com.C1764a;
import com.bytedance.common.utility.C13617h;
import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.C27252o;
import com.p2082ss.android.ugc.aweme.beauty.C34806c;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.photo.p3546a.C62856b;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63199ax;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.property.C65357b;
import com.p2082ss.android.ugc.aweme.publish.core.upload.C65524d;
import com.p2082ss.android.ugc.aweme.publish.p3619f.C65611c;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70976bp;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.p3885v.p3887b.C74080a;
import com.p2082ss.android.ugc.aweme.shortvideo.upload.UploadSpeedInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.upload.p3881b.C73850a;
import com.p2082ss.android.ugc.aweme.shortvideo.upload.p3884d.C73896b;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73979bb;
import com.p2082ss.android.ugc.aweme.utils.C80540hn;
import com.p2082ss.android.ugc.gamora.editor.C82041c;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.utils.C84896h;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import com.p2082ss.android.ugc.tools.utils.C84906m;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import dmt.p4542av.video.C88168aj;
import dmt.p4542av.video.C88257f;
import dmt.p4542av.video.C88278m;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p4600h.C89378p;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.eq */
public final class C71813eq {

    /* renamed from: a */
    public long f160942a;

    /* renamed from: b */
    private double f160943b;

    /* renamed from: c */
    private C27252o f160944c;

    /* renamed from: d */
    private final AbstractC71893j f160945d;

    /* renamed from: e */
    private final int f160946e;

    /* renamed from: f */
    private final String f160947f;

    /* renamed from: g */
    private final String f160948g;

    /* renamed from: h */
    private final Object f160949h;

    /* renamed from: i */
    private final String f160950i;

    /* renamed from: j */
    private final C73896b f160951j;

    /* renamed from: k */
    private final int f160952k;

    static {
        Covode.recordClassIndex(84358);
    }

    /* renamed from: a */
    public static boolean m126784a(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel.hasStickers() || videoPublishEditModel.mTimeEffect != null || C13617h.m24466b(videoPublishEditModel.mEffectList) || videoPublishEditModel.mSelectedId != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo113473a(boolean z, List<C65524d> list) {
        String str;
        float f;
        this.f160944c = C27252o.m54255b(C80540hn.f180153b);
        C84425b a = new C84425b().mo129406a("resolution", "");
        String str2 = "0";
        String str3 = "1";
        if (C65357b.m117043a()) {
            str = str3;
        } else {
            str = str2;
        }
        C84425b a2 = a.mo129406a("is_hardcode", str).mo129406a("bite_rate", new StringBuilder().append(C65357b.m117047c()).toString()).mo129406a("video_quality", new StringBuilder().append(C65357b.m117048d()).toString()).mo129406a("_perf_monitor", str3).mo129403a("publish_type", this.f160952k);
        if (z) {
            str2 = str3;
        }
        C84425b a3 = a2.mo129406a("is_click_publish", str2).mo129406a("fps", new StringBuilder().append(this.f160943b).toString());
        int i = 0;
        if (this.f160946e == 0) {
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) this.f160949h;
            a3.mo129406a("creation_id", videoPublishEditModel.creationId);
            a3.mo129404a("upload_probe_speed", videoPublishEditModel.uploadSpeedInfo.getSpeed());
            C69890bl.m123457a(a3, videoPublishEditModel);
            a3.mo129403a("source_duration", videoPublishEditModel.getPreviewInfo().getPreviewVideoLength());
            String str4 = this.f160950i;
            C89219l.m154721d(a3, "");
            C89219l.m154721d(str4, "");
            C89219l.m154721d(videoPublishEditModel, "");
            if (list != null) {
                long currentTimeMillis = System.currentTimeMillis();
                long c = C73850a.m129926c();
                long j = -1;
                if (c != -1) {
                    j = (currentTimeMillis - c) / 1000;
                }
                C84425b a4 = a3.mo129406a("publish_id", str4);
                UploadSpeedInfo uploadSpeedInfo = videoPublishEditModel.uploadSpeedInfo;
                if (uploadSpeedInfo != null) {
                    f = (float) uploadSpeedInfo.getSpeed();
                } else {
                    f = -1.0f;
                }
                C84425b a5 = a4.mo129405a("upload_probe_speed", Float.valueOf(f));
                AbstractC63199ax axVar = C63238c.f143591r;
                C89219l.m154716b(axVar, "");
                C84425b a6 = a5.mo129403a("internet_speed", axVar.mo93940d()).mo129404a("last_upload_speed", C73850a.m129925b() / 1024).mo129404a("last_time_diff", j);
                C65524d dVar = (C65524d) C89070n.m154583g((List) list);
                if (dVar != null) {
                    i = dVar.mo104656a();
                }
                a6.mo129403a("adapt_chunk_size", i);
            }
        }
        if (C63238c.f143594u.mo93901a()) {
            str3 = "2";
        }
        a3.mo129406a("is_child_mode", str3);
        C39162r.m79460a("video_publish_start", a3.f188764a);
    }

    /* renamed from: a */
    public final void mo113472a(boolean z, String str, String str2, boolean z2, C65611c cVar) {
        String str3;
        String str4;
        String str5;
        int i;
        int i2;
        int i3;
        String str6;
        String str7;
        String str8;
        int bitrate;
        String str9;
        String resolution;
        int fps;
        long j;
        C73850a.m129924a().storeLong("upload_finish_timestamp", System.currentTimeMillis());
        C84425b bVar = new C84425b();
        String str10 = "0";
        if (z) {
            str3 = "1";
        } else {
            str3 = str10;
        }
        C84425b a = bVar.mo129406a("status", str3).mo129406a("fail_info", str);
        if (C65357b.m117043a()) {
            str4 = "1";
        } else {
            str4 = str10;
        }
        C84425b a2 = a.mo129406a("record_code_type", str4);
        if (C65357b.m117046b()) {
            str5 = "1";
        } else {
            str5 = str10;
        }
        C84425b a3 = a2.mo129406a("compose_code_type", str5).mo129406a("bite_rate", new StringBuilder().append(C65357b.m117047c()).toString()).mo129406a("video_quality", new StringBuilder().append(C65357b.m117048d()).toString()).mo129406a("_perf_monitor", "1").mo129403a("publish_type", this.f160952k).mo129406a("fps", new StringBuilder().append(this.f160943b).toString()).mo129403a("is_hd_setting", C88278m.m153408a(this.f160949h) ? 1 : 0).mo129406a("content_source", this.f160947f).mo129406a("content_type", this.f160948g);
        if (cVar != null) {
            if (cVar.f147851a != null) {
                a3.mo129403a("video_https_type", cVar.f147851a.f147895j);
            }
            if (cVar.f147853c != null) {
                a3.mo129403a("image_https_type", cVar.f147853c.f147864j);
            }
            if (cVar.f147854d != null) {
                a3.mo129403a("frame_https_type", cVar.f147854d.f147864j);
            }
        }
        if (this.f160944c.f64413a) {
            this.f160944c.mo45341c();
        }
        long a4 = this.f160944c.mo45339a(TimeUnit.MILLISECONDS);
        this.f160942a = a4;
        a3.mo129404a("origin_upload_dur_ms", a4);
        a3.mo129403a("download_internet_speed_kbps", C63238c.f143591r.mo93940d());
        C73896b bVar2 = this.f160951j;
        if (bVar2 != null) {
            a3.mo129404a("synthetic_dur_ms", bVar2.mo116345d()).mo129404a("upload_wait_time_ms", this.f160951j.mo116343b().mo116300c());
            this.f160942a -= this.f160951j.f165907a.mo45339a(TimeUnit.MILLISECONDS);
        }
        a3.mo129404a("duration", this.f160942a);
        if (this.f160942a - this.f160951j.mo116343b().mo116300c() > 0) {
            this.f160942a -= this.f160951j.mo116343b().mo116300c();
        }
        long d = (this.f160945d.mo113557d(this.f160949h) * 1000) / this.f160942a;
        C73850a.m129924a().storeLong("upload_speed", d);
        int i4 = 0;
        a3.mo129406a("upload_speed", C1764a.m5929a(Locale.US, "%.2f", new Object[]{Float.valueOf(((float) d) / 1024.0f)}));
        if (!z) {
            a3.mo129406a("error_code", str2);
        }
        if (this.f160946e == 0) {
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) this.f160949h;
            VideoFileInfo b = C88168aj.m153238b(videoPublishEditModel.mOutputFile);
            if (b != null) {
                i = b.getCodecType();
            } else {
                i = -1;
            }
            int[] a5 = C73979bb.m130117a(videoPublishEditModel.getPreviewInfo());
            if (a5 != null) {
                i2 = a5[8];
            } else {
                i2 = -1;
            }
            C89378p<Integer, Integer> a6 = C84906m.m145912a(videoPublishEditModel);
            if (a6.getFirst().intValue() + a6.getSecond().intValue() > 1) {
                i3 = 1;
            } else if (a6.getFirst().intValue() + a6.getSecond().intValue() == 1) {
                i3 = 0;
            } else {
                i3 = -1;
            }
            if (C84902i.m145892a(videoPublishEditModel.mParallelUploadOutputFile)) {
                str6 = C1764a.m5929a(Locale.US, "%d", new Object[]{Long.valueOf(C84896h.m145876i(videoPublishEditModel.mParallelUploadOutputFile) / 1024)});
            } else if (C84902i.m145892a(videoPublishEditModel.mOutputFile)) {
                str6 = C1764a.m5929a(Locale.US, "%d", new Object[]{Long.valueOf(C84896h.m145876i(videoPublishEditModel.mOutputFile) / 1024)});
            } else {
                str6 = null;
            }
            if (!TextUtils.isEmpty(videoPublishEditModel.mShootWay) && !TextUtils.isEmpty(videoPublishEditModel.clientId) && !TextUtils.isEmpty(videoPublishEditModel.shareId)) {
                a3.mo129406a("shoot_way", videoPublishEditModel.mShootWay);
                a3.mo129406a("channel", videoPublishEditModel.clientId);
                a3.mo129406a("open_platform_share_id", videoPublishEditModel.shareId);
            }
            C84425b a7 = a3.mo129406a("creation_id", videoPublishEditModel.creationId).mo129406a("filter_id_list", VideoPublishEditModel.translateNullFilter(videoPublishEditModel.mCurFilterIds)).mo129406a("prop_list", videoPublishEditModel.mStickerID);
            if (z2) {
                str7 = "1";
            } else {
                str7 = str10;
            }
            C84425b a8 = a7.mo129406a("is_click_publish", str7).mo129406a("effect_list", videoPublishEditModel.getEditEffectList()).mo129406a("original_resolution", C70976bp.m125319o(videoPublishEditModel)).mo129406a("info_sticker_list", videoPublishEditModel.getInfoStickerList());
            if (videoPublishEditModel.mSelectedId == 0) {
                str8 = str10;
            } else {
                str8 = "1";
            }
            C84425b a9 = a8.mo129406a("video_edit_page_filter", str8);
            if (b == null) {
                bitrate = 0;
            } else {
                bitrate = b.getBitrate();
            }
            C84425b a10 = a9.mo129403a("file_bitrate", bitrate);
            if (videoPublishEditModel.isSyntheticHardEncode) {
                str9 = "hardcoding";
            } else {
                str9 = "softcoding";
            }
            C84425b a11 = a10.mo129406a("compose_coding", str9);
            if (C88257f.m153371d(videoPublishEditModel)) {
                str10 = "1";
            }
            C84425b a12 = a11.mo129406a("is_reencode", str10).mo129403a("is_open_foreground", videoPublishEditModel.isOpenForegroundPublish ? 1 : 0).mo129403a("is_background_publish", videoPublishEditModel.isBackgroundPublish ? 1 : 0).mo129406a("file_size", str6).mo129403a("codec_type", i).mo129403a("source_codec_type", i2).mo129403a("is_multi_content", i3);
            if (b == null) {
                resolution = "";
            } else {
                resolution = b.getResolution();
            }
            C84425b a13 = a12.mo129406a("resolution", resolution).mo129407a("beautify_used", videoPublishEditModel.faceBeautyOpen).mo129406a("beautify_info", C34806c.f82228a).mo129404a("upload_probe_speed", videoPublishEditModel.uploadSpeedInfo.getSpeed());
            if (b == null) {
                fps = 0;
            } else {
                fps = b.getFps();
            }
            C84425b a14 = a13.mo129403a("file_fps", fps).mo129403a("is_filter", m126784a(videoPublishEditModel) ? 1 : 0).mo129403a("is_multi_video", !C82041c.C82042a.m142088a(videoPublishEditModel) ? 1 : 0).mo129403a("sw_conf_preset", -1).mo129403a("is_hd_video", C88278m.m153410b(videoPublishEditModel) ? 1 : 0).mo129403a("sw_conf_crf", -1);
            if (b != null) {
                j = b.getDuration();
            } else {
                j = -1;
            }
            a14.mo129404a("source_duration", j);
            C88278m.m153400a(videoPublishEditModel, a3);
            C88278m.m153409b(videoPublishEditModel, a3);
            if (videoPublishEditModel.hardcodeAdaptiveResult != null) {
                a3.mo129405a("hw_opt_bitrate_set_result", Float.valueOf(videoPublishEditModel.hardcodeAdaptiveResult.getHwOptBitrate()));
                a3.mo129405a("pre_bitrate_status", Float.valueOf(videoPublishEditModel.hardcodeAdaptiveResult.getPreBitrateStatus()));
            }
            a3.mo129405a("select_gear_by_upload_speed", videoPublishEditModel.getUploadSpeedSettingsIndex());
            if (videoPublishEditModel.getPreviewInfo() != null && !videoPublishEditModel.getPreviewInfo().getVideoList().isEmpty()) {
                EditVideoSegment editVideoSegment = videoPublishEditModel.getPreviewInfo().getVideoList().get(0);
                VideoFileInfo videoFileInfo = editVideoSegment.getVideoFileInfo();
                a3.mo129406a("src_resolution", videoFileInfo.getWidth() + "*" + videoFileInfo.getHeight());
                a3.mo129406a("pre_resolution", videoFileInfo.getWidth() + "*" + videoFileInfo.getHeight());
                a3.mo129403a("src_fps", videoFileInfo.getFps());
                a3.mo129403a("pre_fps", videoFileInfo.getFps());
                a3.mo129403a("src_bitrate", videoFileInfo.getBitrate());
                VideoCutInfo videoCutInfo = editVideoSegment.getVideoCutInfo();
                if (videoCutInfo != null) {
                    a3.mo129404a("src_duration", videoCutInfo.getEnd() - videoCutInfo.getStart());
                } else {
                    a3.mo129404a("src_duration", videoFileInfo.getDuration());
                }
                C69890bl.m123457a(a3, videoPublishEditModel);
            }
        }
        if (C63244g.m114602a().mo73287o().mo104784d()) {
            i4 = C63244g.m114602a().mo73287o().mo104785e();
        }
        a3.mo129403a("publish_cnt", i4);
        C74080a.m130260a(a3, this.f160949h);
        C39162r.m79460a("video_publish_end", a3.f188764a);
        C84911q.m145928d("PublishDurationMonitor VideoUploadDurationInMs: " + this.f160942a);
    }

    public C71813eq(Object obj, AbstractC71893j jVar, int i, C73896b bVar, String str, int i2) {
        this.f160945d = jVar;
        this.f160946e = i;
        this.f160949h = obj;
        this.f160952k = i2;
        this.f160951j = bVar;
        if (obj instanceof VideoPublishEditModel) {
            this.f160948g = C71817eu.m126792c((VideoPublishEditModel) obj);
        } else {
            this.f160948g = C62856b.m113273b(i);
        }
        this.f160947f = C62856b.m113272a(i, obj);
        if (i == 0) {
            this.f160943b = (double) ((VideoPublishEditModel) obj).videoFps();
        }
        this.f160950i = str;
    }
}
