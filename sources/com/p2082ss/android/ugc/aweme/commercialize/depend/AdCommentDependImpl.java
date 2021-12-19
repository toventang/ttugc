package com.p2082ss.android.ugc.aweme.commercialize.depend;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.C16041a;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.bytedance.router.SmartRouter;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.comment.CommentServiceImpl;
import com.p2082ss.android.ugc.aweme.comment.widgets.CommentHeaderWidget;
import com.p2082ss.android.ugc.aweme.comment.widgets.NewCommentAdWidget;
import com.p2082ss.android.ugc.aweme.commercialize.link.p2574a.C38036a;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38164aj;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38182f;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38189j;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38214ac;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38255s;
import com.p2082ss.android.ugc.aweme.commercialize.p2570im.C38024a;
import com.p2082ss.android.ugc.aweme.commercialize.p2571j.AbstractC38029b;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38681bh;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38767w;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.compliance.api.services.report.IReportService;
import com.p2082ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.p2082ss.android.ugc.aweme.feed.model.live.RoomFeedCellStruct;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.AwemeFEConfigs;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.LinkPlan;
import com.p2082ss.android.ugc.aweme.model.TextExtraStruct;
import com.p2082ss.android.ugc.aweme.p2282ad.comment.depend.IAdCommentDepend;
import com.p2082ss.android.ugc.aweme.profile.C63419ae;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.report.C67105b;
import com.p2082ss.android.ugc.aweme.setting.model.C68174d;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.depend.AdCommentDependImpl */
public final class AdCommentDependImpl implements IAdCommentDepend {

    /* renamed from: a */
    private final AbstractC89244h f89017a = C89250i.m154773a((AbstractC89171a) C37650a.f89018a);

    static {
        Covode.recordClassIndex(45078);
    }

    /* renamed from: c */
    private final C37696y m75904c() {
        return (C37696y) this.f89017a.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.comment.depend.IAdCommentDepend
    /* renamed from: a */
    public final boolean mo59068a(String str) {
        return C38024a.m77085a(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.comment.depend.IAdCommentDepend
    /* renamed from: a */
    public final boolean mo59066a(Context context, Aweme aweme, int i, AbstractC38029b bVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(bVar, "");
        return C38767w.m78666a(context, aweme, i, bVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.comment.depend.IAdCommentDepend
    /* renamed from: a */
    public final void mo59061a(Context context, String str, String str2) {
        m75904c();
        if (!C38767w.m78643a(context, str, false)) {
            Intent intent = new Intent(context, CrossPlatformActivity.class);
            if (!TextUtils.isEmpty(str2)) {
                intent.setData(Uri.parse(str2));
                C84349a.m145093a(intent, context);
                context.startActivity(intent);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.comment.depend.IAdCommentDepend
    /* renamed from: a */
    public final void mo59060a(Context context, String str) {
        m75904c();
        Aweme b = AwemeService.m70060b().mo60684b(str);
        if (context instanceof Activity) {
            IReportService a = C39223a.m79587a();
            Activity activity = (Activity) context;
            C89219l.m154721d(b, "");
            C89219l.m154721d("landing_page", "");
            C89219l.m154721d("ad", "");
            HashMap hashMap = new HashMap();
            C38214ac a2 = C38681bh.m78486a(b);
            String str2 = null;
            hashMap.put("log_extra", a2 != null ? a2.logExtra : null);
            if (a2 != null) {
                str2 = a2.creativeId;
            }
            hashMap.put("cid", str2);
            Uri.Builder builder = new Uri.Builder();
            String b2 = new C27910f().mo46674b(hashMap);
            C89219l.m154716b(b2, "");
            a.mo68694b(activity, C67105b.m118758a(builder, b, "landing_page", "ad", b2));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.comment.depend.IAdCommentDepend
    /* renamed from: a */
    public final void mo59059a(Context context, User user) {
        if (user != null && context != null) {
            SmartRouter.buildRoute(context, "aweme://user/profile/").withParam("uid", user.getUid()).withParam("sec_user_id", user.getSecUid()).withParam("profile_enterprise_type", C63419ae.f143971a.mo101949a(user)).open();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.comment.depend.IAdCommentDepend
    /* renamed from: a */
    public final void mo59064a(String str, Context context, C38214ac acVar, Aweme aweme, String str2) {
        C38036a.C38037a a = new C38036a.C38037a().mo66311a(acVar).mo66312a(aweme);
        a.f89882e = true;
        C38036a.C38037a a2 = a.mo66314a(true).mo66313a(str);
        if (str2 == null) {
            str2 = "";
        }
        C89219l.m154721d(str2, "");
        a2.f89885h = str2;
        C38189j.m77473a(context, a2.mo66315a());
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.comment.depend.IAdCommentDepend
    /* renamed from: a */
    public final void mo59063a(AwemeRawAd awemeRawAd) {
        if (awemeRawAd != null) {
            C38164aj.m77369a("click", awemeRawAd.getClickTrackUrlList(), awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), new C37651b(awemeRawAd));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.comment.depend.IAdCommentDepend
    /* renamed from: a */
    public final boolean mo59067a(Aweme aweme) {
        C89219l.m154721d(aweme, "");
        C38214ac a = C38681bh.m78486a(aweme);
        return a != null && a.linkType == 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0063, code lost:
        if (r6 != null) goto L_0x002f;
     */
    @Override // com.p2082ss.android.ugc.aweme.p2282ad.comment.depend.IAdCommentDepend
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo59065a(java.lang.String r11, java.lang.String r12, com.p2082ss.android.ugc.aweme.feed.model.Aweme r13, boolean r14) {
        /*
        // Method dump skipped, instructions count: 102
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.commercialize.depend.AdCommentDependImpl.mo59065a(java.lang.String, java.lang.String, com.ss.android.ugc.aweme.feed.model.Aweme, boolean):void");
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.comment.depend.IAdCommentDepend
    /* renamed from: a */
    public final void mo59062a(Context context, String str, String str2, String str3) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("refer", str2);
            jSONObject.put("log_extra", str3);
            jSONObject.put("is_ad_event", "1");
        } catch (JSONException unused) {
        }
        C38189j.m77494a(context, "draw_ad", "replay", jSONObject, str, 0);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.depend.AdCommentDependImpl$a */
    static final class C37650a extends AbstractC89220m implements AbstractC89171a<C37696y> {

        /* renamed from: a */
        public static final C37650a f89018a = new C37650a();

        static {
            Covode.recordClassIndex(45079);
        }

        C37650a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C37696y invoke() {
            return new C37696y();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.comment.depend.IAdCommentDepend
    /* renamed from: a */
    public final String mo59051a() {
        LinkPlan linkPlan;
        try {
            C89219l.m154716b(C68174d.m120420a(), "");
            AwemeFEConfigs e = C68174d.m120424e();
            if (e == null || (linkPlan = e.getLinkPlan()) == null) {
                return null;
            }
            return linkPlan.getInfo();
        } catch (C16041a e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public static IAdCommentDepend m75903b() {
        MethodCollector.m26663i(8427);
        Object a = C81908b.m141854a(IAdCommentDepend.class, false);
        if (a != null) {
            IAdCommentDepend iAdCommentDepend = (IAdCommentDepend) a;
            MethodCollector.m26664o(8427);
            return iAdCommentDepend;
        }
        if (C81908b.f183179ai == null) {
            synchronized (IAdCommentDepend.class) {
                try {
                    if (C81908b.f183179ai == null) {
                        C81908b.f183179ai = new AdCommentDependImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(8427);
                    throw th;
                }
            }
        }
        AdCommentDependImpl adCommentDependImpl = (AdCommentDependImpl) C81908b.f183179ai;
        MethodCollector.m26664o(8427);
        return adCommentDependImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.comment.depend.IAdCommentDepend
    /* renamed from: a */
    public final Widget mo59050a(AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(aVar, "");
        return new NewCommentAdWidget(aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.comment.depend.IAdCommentDepend
    /* renamed from: b */
    public final Widget mo59069b(AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(aVar, "");
        return new CommentHeaderWidget(aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.comment.depend.IAdCommentDepend
    /* renamed from: b */
    public final String mo59070b(C38255s sVar) {
        C89219l.m154721d(sVar, "");
        return CommentServiceImpl.m73664e().mo63300b(sVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.comment.depend.IAdCommentDepend
    /* renamed from: a */
    public final List<TextExtraStruct> mo59053a(C38255s sVar) {
        C89219l.m154721d(sVar, "");
        return CommentServiceImpl.m73664e().mo63283a(sVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.depend.AdCommentDependImpl$b */
    static final class C37651b extends AbstractC89220m implements AbstractC89183m<C38182f.C38184b, Boolean, C38182f.C38184b> {

        /* renamed from: a */
        final /* synthetic */ AwemeRawAd f89019a;

        static {
            Covode.recordClassIndex(45080);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37651b(AwemeRawAd awemeRawAd) {
            super(2);
            this.f89019a = awemeRawAd;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C38182f.C38184b invoke(C38182f.C38184b bVar, Boolean bool) {
            C38182f.C38184b a;
            C38182f.C38184b bVar2 = bVar;
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(bVar2, "");
            if (booleanValue) {
                a = bVar2.mo66498b(this.f89019a);
            } else {
                a = bVar2.mo66489a(this.f89019a);
            }
            C89219l.m154716b(a, "");
            return a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.comment.depend.IAdCommentDepend
    /* renamed from: a */
    public final void mo59056a(Context context, Aweme aweme) {
        C38214ac a = C38681bh.m78486a(aweme);
        if (a == null) {
            return;
        }
        if (a.linkType == 0) {
            C38767w.m78627a(context, a, aweme, true);
        } else if (a.linkType == 1) {
            C38767w.m78627a(context, a, aweme, true);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.comment.depend.IAdCommentDepend
    /* renamed from: a */
    public final void mo59055a(Context context, C38214ac acVar, Aweme aweme) {
        m75904c();
        C38767w.m78627a(context, acVar, aweme, true);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.comment.depend.IAdCommentDepend
    /* renamed from: a */
    public final List<TextExtraStruct> mo59052a(Context context, Aweme aweme, C38255s sVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(sVar, "");
        return CommentServiceImpl.m73664e().mo63282a(context, aweme, sVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.comment.depend.IAdCommentDepend
    /* renamed from: a */
    public final List<TextExtraStruct> mo59054a(C38255s sVar, AwemeRawAd awemeRawAd, AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(sVar, "");
        C89219l.m154721d(aVar, "");
        return CommentServiceImpl.m73664e().mo63284a(sVar, awemeRawAd, aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.comment.depend.IAdCommentDepend
    /* renamed from: a */
    public final void mo59057a(Context context, Aweme aweme, String str) {
        C89219l.m154721d(context, "");
        JSONObject a = C38189j.m77468a(context, aweme, false, (Map<String, String>) null);
        if (!TextUtils.isEmpty(str)) {
            try {
                a.put("refer", str);
                HashMap hashMap = new HashMap();
                hashMap.put("anchor_id", C38189j.m77501b(aweme));
                hashMap.put("room_id", C38189j.m77461a(aweme));
                a.put("ad_extra_data", new C27910f().mo46674b(hashMap));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        C38189j.m77510b(context, UGCMonitor.EVENT_COMMENT, aweme, a);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.comment.depend.IAdCommentDepend
    /* renamed from: a */
    public final void mo59058a(Context context, Aweme aweme, String str, String str2) {
        String str3;
        LiveRoomStruct newLiveRoomData;
        LiveRoomStruct newLiveRoomData2;
        C38182f.C38184b b = C38182f.m77418a().mo66497b(aweme);
        b.f90211a = str;
        b.f90212b = str2;
        b.mo66495a(context);
        if (aweme != null) {
            C18129a.C18130a a = C18129a.m33746a(str, str2, aweme.getAwemeRawAd());
            String str4 = null;
            if (aweme.isLive()) {
                RoomFeedCellStruct roomFeedCellStruct = aweme.getRoomFeedCellStruct();
                if (!(roomFeedCellStruct == null || (newLiveRoomData2 = roomFeedCellStruct.getNewLiveRoomData()) == null)) {
                    str3 = String.valueOf(newLiveRoomData2.getAnchorId());
                }
                str3 = null;
            } else {
                if (aweme.getAuthor() != null) {
                    User author = aweme.getAuthor();
                    C89219l.m154716b(author, "");
                    if (author.isLive()) {
                        User author2 = aweme.getAuthor();
                        C89219l.m154716b(author2, "");
                        str3 = author2.getUid().toString();
                    }
                }
                str3 = null;
            }
            C18129a.C18130a a2 = a.mo28897a("anchor_id", str3);
            if (aweme.isLive()) {
                RoomFeedCellStruct roomFeedCellStruct2 = aweme.getRoomFeedCellStruct();
                if (!(roomFeedCellStruct2 == null || (newLiveRoomData = roomFeedCellStruct2.getNewLiveRoomData()) == null)) {
                    str4 = String.valueOf(newLiveRoomData.f114485id);
                }
            } else if (aweme.getAuthor() != null) {
                User author3 = aweme.getAuthor();
                C89219l.m154716b(author3, "");
                if (author3.isLive()) {
                    str4 = String.valueOf(aweme.getAuthor().roomId);
                }
            }
            a2.mo28897a("room_id", str4).mo28902c();
        }
    }
}
