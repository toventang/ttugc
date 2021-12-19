package com.p2082ss.android.ugc.aweme.notification.p3521c;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.notification.utils.C62281s;
import com.p2082ss.android.ugc.aweme.notification.utils.ShareFromWebHelper;
import com.p2082ss.android.ugc.aweme.notification.view.template.AbstractC62329c;
import com.p2082ss.android.ugc.aweme.notification.view.template.C62339d;
import com.p2082ss.android.ugc.aweme.notification.view.template.C62341f;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.RecordConfig;
import com.p2082ss.android.ugc.aweme.shortvideo.view.ProgressDialogC74145d;
import com.p2082ss.android.ugc.trill.R;
import org.json.JSONObject;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.c.f */
public final class C61923f implements AbstractC62329c {
    static {
        Covode.recordClassIndex(72672);
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.view.template.AbstractC62329c
    /* renamed from: a */
    public final void mo100001a(C62339d dVar) {
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(dVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.view.template.AbstractC62329c
    /* renamed from: a */
    public final boolean mo100002a(C62341f fVar) {
        Context context;
        C89219l.m154721d(fVar, "");
        View view = fVar.f141475b;
        if (view != null) {
            context = view.getContext();
        } else {
            context = null;
        }
        if (view == null) {
            return true;
        }
        int id = view.getId();
        try {
            String str = fVar.f141474a.f139892h;
            JSONObject jSONObject = new JSONObject(new JSONObject(fVar.f141474a.f139893i).optString("business_extra"));
            String optString = jSONObject.optString("notice_type");
            if (optString != null) {
                int hashCode = optString.hashCode();
                if (hashCode != -1061766843) {
                    if (hashCode == 735840708 && optString.equals("share_sound.success")) {
                        String optString2 = jSONObject.optString("client_key");
                        if (str == null) {
                            C89219l.m154715b();
                        }
                        C89219l.m154716b(optString2, "");
                        C89219l.m154721d(str, "");
                        C89219l.m154721d(optString2, "");
                        Uri parse = Uri.parse(str);
                        C89219l.m154716b(parse, "");
                        String queryParameter = parse.getQueryParameter("music_id");
                        String queryParameter2 = parse.getQueryParameter("share_id");
                        String queryParameter3 = parse.getQueryParameter("shoot_way");
                        if (queryParameter3 == null) {
                            queryParameter3 = "share_sound";
                        }
                        C89219l.m154716b(queryParameter3, "");
                        if (id == R.id.cu6 && context != null) {
                            if (queryParameter == null) {
                                C89219l.m154715b();
                            }
                            if (queryParameter2 == null) {
                                C89219l.m154715b();
                            }
                            C89219l.m154721d(context, "");
                            C89219l.m154721d(queryParameter, "");
                            C89219l.m154721d(queryParameter2, "");
                            C89219l.m154721d(queryParameter3, "");
                            C89219l.m154721d(optString2, "");
                            C39162r.m79460a("shoot", new C33744d().mo59983a("shoot_way", queryParameter3).mo59983a("open_platform_share_id", queryParameter2).mo59983a("channel", optString2).f79943a);
                            AVExternalServiceImpl.m113114a().asyncService(context, queryParameter3, new C62281s.C62282a(context, new RecordConfig.Builder().shootWay(queryParameter3).musicId(queryParameter).shareId(queryParameter2).clientId(optString2)));
                        }
                    }
                } else if (optString.equals("share_video_web.success")) {
                    if (str == null) {
                        C89219l.m154715b();
                    }
                    C89219l.m154721d(str, "");
                    Uri parse2 = Uri.parse(str);
                    C89219l.m154716b(parse2, "");
                    String queryParameter4 = parse2.getQueryParameter("video_id");
                    String queryParameter5 = parse2.getQueryParameter("client_name");
                    String queryParameter6 = parse2.getQueryParameter("share_id");
                    String queryParameter7 = parse2.getQueryParameter("shoot_way");
                    if (queryParameter7 == null) {
                        queryParameter7 = "share_video_web";
                    }
                    C89219l.m154716b(queryParameter7, "");
                    String queryParameter8 = parse2.getQueryParameter("client_key");
                    if (context != null) {
                        C89219l.m154721d(context, "");
                        C89219l.m154721d(queryParameter7, "");
                        ProgressDialogC74145d a = ProgressDialogC74145d.m130371a(context, context.getResources().getString(R.string.dvs));
                        C89219l.m154716b(a, "");
                        a.setIndeterminate(true);
                        a.setProgress(0);
                        ShareFromWebHelper.f141284a.getVideoInfo(queryParameter4).mo5534a(new ShareFromWebHelper.C62248c(queryParameter4, a, queryParameter7, queryParameter6, queryParameter8, queryParameter5, context), C1731i.f5564c, null);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }
}
