package com.p2082ss.android.ugc.aweme.publish.p3620g;

import android.app.Application;
import com.bytedance.common.utility.C13624l;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.facebook.common.p1832d.C24098m;
import com.p2082ss.android.ugc.aweme.edit.TTStoryUploadModel;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.property.C65444e;
import com.p2082ss.android.ugc.aweme.publish.AbstractC65677j;
import com.p2082ss.android.ugc.aweme.publish.p3620g.p3622b.AbstractC65626d;
import com.p2082ss.android.ugc.aweme.publish.p3620g.p3623c.C65630a;
import com.p2082ss.android.ugc.aweme.setting.C68065d;
import com.p2082ss.android.ugc.aweme.shortvideo.C69840ar;
import com.p2082ss.android.ugc.aweme.shortvideo.C71817eu;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.C71412a;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.EnumC72679r;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.EnumC72680s;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.EnumC72682u;
import p4600h.C89376n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.publish.g.b */
public final class C65622b {

    /* renamed from: a */
    private String f147940a;

    /* renamed from: b */
    private VideoPublishEditModel f147941b;

    /* renamed from: c */
    private EnumC72679r f147942c;

    /* renamed from: d */
    private EnumC72682u f147943d = EnumC72682u.VIDEO;

    /* renamed from: e */
    private final C69840ar f147944e;

    static {
        Covode.recordClassIndex(77113);
    }

    /* renamed from: a */
    public final C65622b mo104800a() {
        String str;
        C69840ar arVar = this.f147944e;
        Application application = C63247i.f143610a;
        if (C58029j.f132252d == C13624l.EnumC13625a.UNKNOWN || !C58029j.m104846b() || C58029j.m104847c()) {
            C58029j.f132252d = C13624l.m24487c(application);
        }
        C13624l.EnumC13625a aVar = C58029j.f132252d;
        if (aVar != null) {
            switch (C65629c.f147952a[aVar.ordinal()]) {
                case 1:
                case 2:
                    break;
                case 3:
                    str = "mobile";
                    break;
                case 4:
                    str = "2G";
                    break;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    str = "3G";
                    break;
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                    str = "4G";
                    break;
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                    str = "5G";
                    break;
                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                    str = "wifi";
                    break;
                default:
                    throw new C89376n();
            }
            arVar.mo110189a("network_type", str);
            return this;
        }
        str = "unknown";
        arVar.mo110189a("network_type", str);
        return this;
    }

    /* renamed from: c */
    public final C65622b mo104809c() {
        int i;
        String str;
        C69840ar arVar = this.f147944e;
        VideoPublishEditModel videoPublishEditModel = this.f147941b;
        if (videoPublishEditModel == null) {
            C89219l.m154710a("editModel");
        }
        if (videoPublishEditModel.ttStoryUploadModel != null) {
            i = 1;
        } else {
            i = 0;
        }
        arVar.mo110187a("is_story", Integer.valueOf(i));
        VideoPublishEditModel videoPublishEditModel2 = this.f147941b;
        if (videoPublishEditModel2 == null) {
            C89219l.m154710a("editModel");
        }
        if (videoPublishEditModel2.isStoryEditMode) {
            str = "story_shoot_page";
        } else {
            str = "video_shoot_page";
        }
        arVar.mo110189a("shoot_page", str);
        VideoPublishEditModel videoPublishEditModel3 = this.f147941b;
        if (videoPublishEditModel3 == null) {
            C89219l.m154710a("editModel");
        }
        TTStoryUploadModel tTStoryUploadModel = videoPublishEditModel3.ttStoryUploadModel;
        if (tTStoryUploadModel != null) {
            arVar.mo110187a("clip_index", Integer.valueOf(tTStoryUploadModel.getIndex()));
            arVar.mo110187a("clips_cnt", Integer.valueOf(tTStoryUploadModel.getTotalCount()));
        }
        return this;
    }

    /* renamed from: b */
    public final C65622b mo104808b() {
        C69840ar arVar = this.f147944e;
        VideoPublishEditModel videoPublishEditModel = this.f147941b;
        if (videoPublishEditModel == null) {
            C89219l.m154710a("editModel");
        }
        arVar.mo110189a("content_type", C71817eu.m126792c(videoPublishEditModel));
        VideoPublishEditModel videoPublishEditModel2 = this.f147941b;
        if (videoPublishEditModel2 == null) {
            C89219l.m154710a("editModel");
        }
        arVar.mo110189a("content_source", C71817eu.m126793d(videoPublishEditModel2));
        VideoPublishEditModel videoPublishEditModel3 = this.f147941b;
        if (videoPublishEditModel3 == null) {
            C89219l.m154710a("editModel");
        }
        arVar.mo110189a("shoot_way", videoPublishEditModel3.mShootWay);
        arVar.mo110185a("is_long_video_allowed", Boolean.valueOf(C65444e.m117163a()));
        arVar.mo110188a("long_video_threshold", Long.valueOf(C68065d.m120371a()));
        VideoPublishEditModel videoPublishEditModel4 = this.f147941b;
        if (videoPublishEditModel4 == null) {
            C89219l.m154710a("editModel");
        }
        arVar.mo110187a("videoLength", Integer.valueOf(videoPublishEditModel4.getVideoLength()));
        VideoPublishEditModel videoPublishEditModel5 = this.f147941b;
        if (videoPublishEditModel5 == null) {
            C89219l.m154710a("editModel");
        }
        arVar.mo110188a("duration", Long.valueOf(C71412a.m126107b(videoPublishEditModel5.getPreviewInfo())));
        VideoPublishEditModel videoPublishEditModel6 = this.f147941b;
        if (videoPublishEditModel6 == null) {
            C89219l.m154710a("editModel");
        }
        if (videoPublishEditModel6.isMvThemeVideoType()) {
            VideoPublishEditModel videoPublishEditModel7 = this.f147941b;
            if (videoPublishEditModel7 == null) {
                C89219l.m154710a("editModel");
            }
            if (videoPublishEditModel7.uploadMiscInfoStruct != null) {
                VideoPublishEditModel videoPublishEditModel8 = this.f147941b;
                if (videoPublishEditModel8 == null) {
                    C89219l.m154710a("editModel");
                }
                arVar.mo110189a("mv_id", videoPublishEditModel8.uploadMiscInfoStruct.mvThemeId);
            }
        }
        VideoPublishEditModel videoPublishEditModel9 = this.f147941b;
        if (videoPublishEditModel9 == null) {
            C89219l.m154710a("editModel");
        }
        arVar.mo110185a("is_fast_import", Boolean.valueOf(C71817eu.m126805p(videoPublishEditModel9)));
        VideoPublishEditModel videoPublishEditModel10 = this.f147941b;
        if (videoPublishEditModel10 == null) {
            C89219l.m154710a("editModel");
        }
        arVar.mo110185a("has_subtitle", Boolean.valueOf(videoPublishEditModel10.hasSubtitle()));
        VideoPublishEditModel videoPublishEditModel11 = this.f147941b;
        if (videoPublishEditModel11 == null) {
            C89219l.m154710a("editModel");
        }
        arVar.mo110187a("segment_count", Integer.valueOf(videoPublishEditModel11.segmentCounts()));
        return this;
    }

    /* renamed from: a */
    public final C65622b mo104802a(VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(videoPublishEditModel, "");
        this.f147941b = videoPublishEditModel;
        return this;
    }

    public C65622b(C69840ar arVar) {
        C89219l.m154721d(arVar, "");
        this.f147944e = arVar;
    }

    /* renamed from: a */
    public final C65622b mo104803a(EnumC72679r rVar) {
        C89219l.m154721d(rVar, "");
        this.f147942c = rVar;
        return this;
    }

    /* renamed from: a */
    public final C65622b mo104804a(EnumC72682u uVar) {
        C89219l.m154721d(uVar, "");
        this.f147943d = uVar;
        return this;
    }

    /* renamed from: a */
    public final C65622b mo104801a(AbstractC65626d dVar) {
        C89219l.m154721d(dVar, "");
        C69840ar arVar = this.f147944e;
        arVar.mo110187a("error_code", Integer.valueOf(dVar.mo104810a()));
        arVar.mo110189a("error_source", dVar.mo104811b().getDesc());
        String c = C24098m.m45633c(dVar.f147949a);
        C89219l.m154716b(c, "");
        arVar.mo110189a("exception", c);
        arVar.mo110189a("server_log_id", C65630a.m117455d(dVar.f147949a));
        return this;
    }

    /* renamed from: a */
    public final C65622b mo104805a(String str) {
        C89219l.m154721d(str, "");
        this.f147940a = str;
        return this;
    }

    /* renamed from: a */
    public final C65622b mo104806a(boolean z) {
        C69840ar arVar = this.f147944e;
        String str = this.f147940a;
        if (str == null) {
            C89219l.m154710a("publishId");
        }
        arVar.mo110189a("publish_id", str);
        arVar.mo110189a("publish_scene", this.f147943d.getDesc());
        EnumC72679r rVar = this.f147942c;
        if (rVar == null) {
            C89219l.m154710a("publishNode");
        }
        arVar.mo110189a("publish_node", rVar.getDesc());
        arVar.mo110185a("retry_publish", Boolean.valueOf(z));
        return this;
    }

    /* renamed from: a */
    public final C69840ar mo104807a(EnumC72680s sVar) {
        C89219l.m154721d(sVar, "");
        C69840ar arVar = this.f147944e;
        arVar.mo110189a("event_type", sVar.getDesc());
        AbstractC65677j l = C63244g.m114602a().mo73287o().mo104792l();
        StringBuilder append = new StringBuilder("Publish Node: ").append(sVar.getDesc()).append(", thread: ");
        Thread currentThread = Thread.currentThread();
        C89219l.m154716b(currentThread, "");
        l.mo104817a("build_publish_monitor_metrics", append.append(currentThread.getName()).toString());
        return arVar;
    }
}
