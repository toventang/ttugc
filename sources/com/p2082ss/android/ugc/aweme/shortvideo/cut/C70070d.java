package com.p2082ss.android.ugc.aweme.shortvideo.cut;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.api.AnchorAutoSelectionService;
import com.p2082ss.android.ugc.aweme.api.C33531a;
import com.p2082ss.android.ugc.aweme.api.C33537f;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.common.C39053a;
import com.p2082ss.android.ugc.aweme.common.C39078ad;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.C70637di;
import com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.C70155ad;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.C70156ae;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.C70241b;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C70455f;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C70463h;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C71518t;
import com.p2082ss.android.ugc.aweme.shortvideo.model.CreativeFlowData;
import com.p2082ss.android.ugc.aweme.shortvideo.p3793af.C69823b;
import com.p2082ss.android.ugc.aweme.shoutouts.C74418d;
import com.p2082ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import com.p2082ss.android.ugc.aweme.tools.p4082b.C77816g;
import com.p2082ss.android.ugc.aweme.tools.p4082b.EnumC77814e;
import com.p2082ss.android.ugc.aweme.utils.C80537hk;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p077b.C1731i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.d */
public final class C70070d {

    /* renamed from: a */
    public static final C70070d f156681a = new C70070d();

    private C70070d() {
    }

    static {
        Covode.recordClassIndex(82490);
    }

    /* renamed from: a */
    private static String m123695a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static void m123696a(Intent intent, C70241b bVar) {
        List<VideoSegment> list = bVar.f157038a;
        StringBuilder sb = new StringBuilder();
        for (VideoSegment videoSegment : list) {
            if (!TextUtils.isEmpty(videoSegment.f156721m)) {
                sb.append(videoSegment.f156721m).append(",");
            }
        }
        String sb2 = sb.toString();
        C89219l.m154716b(sb2, "");
        if (!TextUtils.isEmpty(sb2)) {
            Objects.requireNonNull(sb2, "null cannot be cast to non-null type java.lang.String");
            String substring = sb2.substring(0, sb2.length() - 1);
            C89219l.m154716b(substring, "");
            intent.putExtra("md5", substring);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v5, resolved type: java.util.ArrayList<com.ss.android.ugc.aweme.shortvideo.AVChallenge> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static void m123697a(C70155ad adVar, Intent intent) {
        C71518t tVar;
        String str;
        String str2;
        String str3;
        String str4;
        List<String> list;
        int i;
        boolean z;
        Integer height;
        Integer width;
        Workspace workspace;
        C89219l.m154721d(adVar, "");
        C89219l.m154721d(intent, "");
        adVar.f156846d = intent.getLongExtra("min_duration", C70637di.m124840a());
        String a = m123695a(intent, "path");
        if (!TextUtils.isEmpty(a) && (workspace = adVar.f156851i) != null) {
            workspace.mo110090a(a);
        }
        if (intent.getSerializableExtra("av_challenge") != null) {
            adVar.f156847e.clear();
            ArrayList<AVChallenge> arrayList = adVar.f156847e;
            Serializable serializableExtra = intent.getSerializableExtra("av_challenge");
            Objects.requireNonNull(serializableExtra, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.AVChallenge");
            arrayList.add(serializableExtra);
        }
        if (intent.getSerializableExtra("av_challenge_list") != null) {
            Serializable serializableExtra2 = intent.getSerializableExtra("av_challenge_list");
            Objects.requireNonNull(serializableExtra2, "null cannot be cast to non-null type kotlin.collections.ArrayList<com.ss.android.ugc.aweme.shortvideo.AVChallenge> /* = java.util.ArrayList<com.ss.android.ugc.aweme.shortvideo.AVChallenge> */");
            ArrayList<AVChallenge> arrayList2 = (ArrayList) serializableExtra2;
            C89219l.m154721d(arrayList2, "");
            adVar.f156847e = arrayList2;
        }
        adVar.f156848f = m123695a(intent, "micro_app_id");
        String str5 = null;
        if (intent.getSerializableExtra("micro_app_info") == null) {
            tVar = null;
        } else {
            Serializable serializableExtra3 = intent.getSerializableExtra("micro_app_info");
            Objects.requireNonNull(serializableExtra3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.MicroAppModel");
            tVar = (C71518t) serializableExtra3;
        }
        adVar.f156849g = tVar;
        adVar.f156864v.setExtraShareOptions((HashMap) intent.getSerializableExtra("_aweme_open_sdk_extra_share_options"));
        int i2 = 0;
        adVar.f156850h = intent.getBooleanExtra("enter_record_from_other_platform", false);
        adVar.f156852j = (C39078ad) intent.getSerializableExtra("extra_share_context");
        adVar.f156853k = intent.getIntExtra("extra_stick_point_type", 0);
        adVar.f156854l = m123695a(intent, "shoot_way");
        adVar.f156863u = (C74418d) intent.getSerializableExtra("shout_out_data");
        CreativeFlowData creativeFlowData = (CreativeFlowData) intent.getParcelableExtra("creative_flow_data");
        if (creativeFlowData != null) {
            C89219l.m154721d(creativeFlowData, "");
            adVar.f156864v = creativeFlowData;
        }
        adVar.f156858p = m123695a(intent, "music_origin");
        adVar.f156855m = intent.getBooleanExtra("from_background_video", false);
        adVar.f156842C = (BackgroundVideoCompileConfigure) intent.getParcelableExtra("background_video_compile_configure");
        adVar.f156856n = intent.getLongExtra("background_video_max_length", 15000);
        adVar.f156857o = m123695a(intent, "creation_id");
        adVar.f156861s = m123695a(intent, "share_id");
        adVar.f156862t = m123695a(intent, "channel");
        adVar.f156865w = intent.getIntExtra("is_rivate", 0);
        adVar.f156860r = intent.getBooleanExtra("draft_to_cut", false);
        adVar.f156859q = intent.getBooleanExtra("extra_enter_from_live", false);
        adVar.f156867y = intent.getLongExtra("extra_start_enter_cut_page", System.currentTimeMillis());
        adVar.f156868z = (C39053a) intent.getSerializableExtra("auto_selected_anchor");
        adVar.f156841B = m123695a(intent, "open_platform_client_key");
        adVar.f156840A = m123695a(intent, "open_platform_extra");
        C39078ad adVar2 = adVar.f156852j;
        if (adVar2 != null) {
            str = adVar2.mAnchorSourceType;
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            C39078ad adVar3 = adVar.f156852j;
            if (adVar3 != null) {
                str2 = adVar3.mClientKey;
            } else {
                str2 = null;
            }
            C39078ad adVar4 = adVar.f156852j;
            if (adVar4 != null) {
                str3 = adVar4.mOpenPlatformExtra;
            } else {
                str3 = null;
            }
            C39078ad adVar5 = adVar.f156852j;
            if (adVar5 != null) {
                str4 = adVar5.mAnchorSourceType;
            } else {
                str4 = null;
            }
            C1731i<C33531a> a2 = AnchorAutoSelectionService.C33529a.m68692a(str2, str3, str4, 3);
            a2.mo5547f();
            C33531a d = a2.mo5545d();
            if (d != null && d.f79638a == 0 && d.f79640c != null) {
                CreateAnchorInfo createAnchorInfo = d.f79640c;
                if (createAnchorInfo == null) {
                    C89219l.m154715b();
                }
                UrlModel urlModel = new UrlModel();
                C33537f fVar = d.f79642e;
                if (fVar != null) {
                    list = fVar.getUrlList();
                } else {
                    list = null;
                }
                urlModel.setUrlList(list);
                C33537f fVar2 = d.f79642e;
                if (fVar2 != null) {
                    str5 = fVar2.getUri();
                }
                urlModel.setUri(str5);
                C33537f fVar3 = d.f79642e;
                if (fVar3 == null || (width = fVar3.getWidth()) == null) {
                    i = 0;
                } else {
                    i = width.intValue();
                }
                urlModel.setWidth(i);
                C33537f fVar4 = d.f79642e;
                if (!(fVar4 == null || (height = fVar4.getHeight()) == null)) {
                    i2 = height.intValue();
                }
                urlModel.setHeight(i2);
                int type = createAnchorInfo.getType();
                String content = createAnchorInfo.getContent();
                String keyword = createAnchorInfo.getKeyword();
                String url = createAnchorInfo.getUrl();
                String extra = createAnchorInfo.getExtra();
                Boolean bool = d.f79641d;
                if (bool != null) {
                    z = bool.booleanValue();
                } else {
                    z = true;
                }
                adVar.f156868z = new C39053a(type, content, keyword, null, 4, null, urlModel, z, url, null, null, extra, null, 5672, null);
            }
        }
    }

    /* renamed from: a */
    public static Intent m123694a(Intent intent, C70155ad adVar, C70241b bVar, long j) {
        boolean z;
        int i;
        int i2;
        C89219l.m154721d(adVar, "");
        C89219l.m154721d(bVar, "");
        List<VideoSegment> list = bVar.f157038a;
        Workspace workspace = adVar.f156851i;
        Intent intent2 = new Intent(intent);
        intent2.putExtra("dir", C70637di.f158101d);
        intent2.putExtra("extra_start_enter_edit_page", j);
        intent2.putExtra("extra_import_compile_cost_time", System.currentTimeMillis() - j);
        intent2.putExtra("content_source", "upload");
        intent2.putExtra("content_type", C70463h.m124285a(bVar.f157040c));
        intent2.putExtra("enable_music_path_check", false);
        intent2.putExtra("fromCut", true);
        intent2.putExtra("origin", 0);
        intent2.putExtra("extra_stick_point_type", adVar.f156853k);
        intent2.putExtra("shout_out_data", adVar.f156863u);
        intent2.putExtra("is_rivate", adVar.f156865w);
        intent2.putExtra("share_id", adVar.f156861s);
        intent2.putExtra("channel", adVar.f156862t);
        C89219l.m154721d(adVar, "");
        if (adVar.f156849g != null || !TextUtils.isEmpty(adVar.f156848f)) {
            z = false;
        } else {
            z = true;
        }
        intent2.putExtra("back_to_main_after_publish", z);
        ArrayList<AVChallenge> arrayList = adVar.f156847e;
        Objects.requireNonNull(arrayList, "null cannot be cast to non-null type java.io.Serializable");
        intent2.putExtra("challenge", arrayList);
        intent2.putExtra("enter_record_from_other_platform", C70156ae.m123857a(adVar));
        intent2.putExtra("micro_app_id", adVar.f156848f);
        intent2.putExtra("micro_app_info", adVar.f156849g);
        intent2.putExtra("music_origin", adVar.f156858p);
        intent2.putExtra("creative_flow_data", (Parcelable) adVar.f156864v);
        intent2.putExtra("upload_video_type", bVar.f157041d);
        intent2.putExtra("extra_is_change_speed", bVar.f157042e);
        intent2.putExtra("fromMultiCut", bVar.f157041d);
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            i = 0;
            while (it.hasNext()) {
                if (it.next().f156732x && (i = i + 1) < 0) {
                    C89070n.m154523b();
                }
            }
        } else {
            i = 0;
        }
        intent2.putExtra("extra_photo_count", i);
        intent2.putExtra("extra_video_count", list.size() - i);
        if (bVar.f157040c) {
            i2 = -1;
        } else {
            i2 = (int) bVar.f157039b;
        }
        intent2.putExtra("preview_video_length", i2);
        m123696a(intent2, bVar);
        String a = m123695a(intent, "hashtag");
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList2 = new ArrayList();
        C70080k.m123730a(adVar.f156849g, sb, arrayList2);
        if (sb.length() == 0 && C80537hk.m139613a(a)) {
            String[] strArr = new String[1];
            if (a == null) {
                a = "";
            }
            strArr[0] = a;
            C70080k.m123731a(C89070n.m154525d(strArr), sb);
        }
        if (!TextUtils.isEmpty(sb.toString())) {
            intent2.putExtra("video_title", sb.toString());
        }
        if (!arrayList2.isEmpty()) {
            intent2.putExtra("struct_list", arrayList2);
        }
        intent2.putExtra("extra_stickpoint_mode", bVar.f157040c);
        if (bVar.f157040c) {
            String c = C70455f.m124271c(bVar.f157043f);
            Application application = C63247i.f143610a;
            C89219l.m154716b(application, "");
            Context applicationContext = application.getApplicationContext();
            if (C58003a.f132201c && applicationContext == null) {
                applicationContext = C58003a.f132199a;
            }
            if (C69823b.m123388a(c, applicationContext) && workspace != null) {
                workspace.mo110090a(c);
            }
            C70005cr.m123611a().mo70083a(bVar.f157043f);
        }
        if (bVar.f157041d) {
            if (bVar.f157040c) {
                C70005cr.m123611a().mo70083a(bVar.f157043f);
            } else {
                if (workspace != null) {
                    workspace.mo110094d();
                }
                C70005cr.m123611a().mo70083a((C69905c) null);
            }
        }
        intent2.putExtra("auto_selected_anchor", adVar.f156868z);
        intent2.putExtra("open_platform_client_key", adVar.f156841B);
        intent2.putExtra("open_platform_extra", adVar.f156840A);
        long j2 = 0;
        Iterator<T> it2 = bVar.f157038a.iterator();
        while (it2.hasNext()) {
            j2 += it2.next().f156710b;
        }
        intent2.putExtra("extra_import_total_video_duration", j2);
        C77816g.m135931a(intent, intent2, EnumC77814e.CUT, EnumC77814e.EDIT);
        return intent2;
    }
}
