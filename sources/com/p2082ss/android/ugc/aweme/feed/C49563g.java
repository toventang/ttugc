package com.p2082ss.android.ugc.aweme.feed;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.AbstractC0976n;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.SharePrefCache;
import com.p2082ss.android.ugc.aweme.awemeservice.RequestIdService;
import com.p2082ss.android.ugc.aweme.comment.CommentServiceImpl;
import com.p2082ss.android.ugc.aweme.comment.p2484a.C36179e;
import com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36416b;
import com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36418d;
import com.p2082ss.android.ugc.aweme.comment.p2495i.C36493c;
import com.p2082ss.android.ugc.aweme.comment.p2495i.C36500h;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38255s;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.MobClick;
import com.p2082ss.android.ugc.aweme.favorites.p2926h.C47436b;
import com.p2082ss.android.ugc.aweme.favorites.p2928ui.C47732r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2949i.AbstractC49691s;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49672ag;
import com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49748e;
import com.p2082ss.android.ugc.aweme.feed.p2969u.C49979o;
import com.p2082ss.android.ugc.aweme.feed.p2969u.C49981p;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.C50318j;
import com.p2082ss.android.ugc.aweme.feed.param.FeedParamProvider;
import com.p2082ss.android.ugc.aweme.feed.share.C49914a;
import com.p2082ss.android.ugc.aweme.forward.statistics.ForwardStatisticsServiceImpl;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.login.p3424b.C58956a;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.mix.api.AbstractC59387a;
import com.p2082ss.android.ugc.aweme.mix.api.AbstractC59392f;
import com.p2082ss.android.ugc.aweme.mix.services.MixFeedService;
import com.p2082ss.android.ugc.aweme.p2436cc.C35434c;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3252c.C56216k;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.setting.C68056ch;
import com.p2082ss.android.ugc.aweme.share.C68859af;
import com.p2082ss.android.ugc.aweme.share.C68863ah;
import com.p2082ss.android.ugc.aweme.utils.C80636z;
import com.p2082ss.android.ugc.trill.R;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.feed.g */
public final class C49563g extends AbstractC49420e implements AbstractC36416b, AbstractC59392f {

    /* renamed from: a */
    public C49981p f113994a;

    /* renamed from: k */
    private AbstractC49691s<C49672ag> f113995k;

    /* renamed from: l */
    private AbstractC49748e f113996l;

    /* renamed from: m */
    private Dialog f113997m;

    /* renamed from: n */
    private String f113998n;

    /* renamed from: o */
    private String f113999o;

    /* renamed from: p */
    private String f114000p;

    /* renamed from: q */
    private String f114001q;

    /* renamed from: r */
    private String f114002r = "";

    static {
        Covode.recordClassIndex(58404);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2944e.C49431d
    /* renamed from: c */
    public final Activity mo81058c() {
        return this.f113599b;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2944e.C49431d
    /* renamed from: d */
    public final Context mo81059d() {
        return this.f113599b;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2944e.C49431d
    /* renamed from: e */
    public final Fragment mo81060e() {
        return this.f113600c;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2944e.C49431d
    /* renamed from: f */
    public final String mo81061f() {
        return this.f113603f;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2944e.C49431d
    /* renamed from: b */
    public final void mo81056b() {
        super.mo81056b();
        C49981p pVar = this.f113994a;
        if (pVar != null) {
            pVar.mo67840h();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.share.AbstractC69360q
    /* renamed from: g */
    public final void mo81315g() {
        Dialog dialog = this.f113997m;
        if (dialog != null && dialog.isShowing()) {
            this.f113997m.dismiss();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.AbstractC49420e
    /* renamed from: a */
    public final void mo81047a() {
        C49981p pVar = new C49981p(this.f113599b);
        this.f113994a = pVar;
        pVar.mo67838a(new C49979o());
        try {
            AbstractC0952i i = mo81063i();
            Fragment a = i.mo3551a(UGCMonitor.EVENT_COMMENT);
            if (a != null) {
                AbstractC0976n a2 = i.mo3552a();
                a2.mo3455a(a);
                a2.mo3467b();
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.AbstractC49420e
    /* renamed from: a */
    public final void mo81048a(String str) {
        this.f114002r = str;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2944e.C49431d
    /* renamed from: b */
    public final void mo81057b(String str) {
        this.f113603f = str;
    }

    /* renamed from: c */
    private JSONObject m92881c(Aweme aweme) {
        return m92879a(RequestIdService.m70076a().mo60695b(aweme, this.f113602e), aweme);
    }

    /* renamed from: a */
    private static int m92878a(Aweme aweme) {
        if (C80636z.m139818c(aweme)) {
            return 2;
        }
        if (aweme.getAuthor().isSecret()) {
            return 1;
        }
        return -1;
    }

    /* renamed from: d */
    private void m92883d(Aweme aweme) {
        Activity activity = this.f113599b;
        if (activity != null && !activity.isFinishing() && (activity instanceof ActivityC0945e)) {
            C47732r.C47733a.m90789a((ActivityC0945e) activity, aweme, this.f113601d);
        }
    }

    /* renamed from: b */
    private static boolean m92880b(Aweme aweme) {
        boolean z;
        boolean booleanValue = SharePrefCache.inst().getIsPrivateAvailable().mo59941c().booleanValue();
        boolean d = C80636z.m139819d(aweme);
        if (aweme.getAuthor() == null || !C13627m.m24499a(C31575b.m65865g().getCurUserId(), aweme.getAuthor().getUid())) {
            z = false;
        } else {
            z = true;
        }
        if (!booleanValue || !d || !z) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36416b
    /* renamed from: a */
    public final void mo63701a(C36493c cVar) {
        String str;
        C38255s aid;
        long commentCount;
        String e;
        Aweme aweme = cVar.f86307a;
        if (aweme != null) {
            if (this.f113599b == null) {
                C36179e.m73733b("getActivity() is null");
                return;
            }
            boolean z = true;
            if (!C59208ac.m108774h(aweme) || !aweme.isProhibited()) {
                C36500h requestId = new C36500h(aweme.getAid()).setRequestId(m92881c(aweme).optString("request_id"));
                if (aweme.getAuthor() != null) {
                    str = aweme.getAuthor().getUid();
                } else {
                    str = "";
                }
                C36500h enableComment = ((C36500h) requestId.setAuthorUid(str)).setEventType(this.f113601d).setSource(0).setMyProfile(this.f113605h).setPlayListId(this.f114000p).setPlayListIdKey(this.f113999o).setPlayListType(this.f113998n).setPageType(this.f113602e).setTabName(this.f114001q).setEnableComment(!aweme.isCmtSwt());
                if (aweme.getAdCommentStruct() == null) {
                    aid = null;
                } else {
                    aid = aweme.getAdCommentStruct().setAid(aweme.getAid());
                }
                C36500h commentClose = enableComment.setAdCommentStruct(aid).setCommentClose(CommentServiceImpl.m73664e().mo63307c(aweme));
                if (CommentServiceImpl.m73664e().mo63307c(aweme) || CommentServiceImpl.m73664e().mo63304b(aweme)) {
                    z = false;
                }
                C36500h isLongItem = commentClose.setCommentLimited(z).setForceHideKeyboard(cVar.f86311e).forceRefresh(cVar.f86313g).setScrollToTop(cVar.f86309c).setCreationId(cVar.f86320n).setIsLongItem(0);
                if (aweme.getStatistics() == null) {
                    commentCount = 0;
                } else {
                    commentCount = aweme.getStatistics().getCommentCount();
                }
                C36500h newsId = isLongItem.setCommentCount(commentCount).setSearchId(FeedParamProvider.C49809a.m93270a(this.f113599b).getSearchId()).setNeedAutoLikeComment(cVar.f86304A).setNeedShowReplyPanel(cVar.f86305B).setSearchResultId(FeedParamProvider.C49809a.m93270a(this.f113599b).getSearchResultId()).setLocatePageType(cVar.f86324r).setEnterMethod(cVar.f86314h).setCommentEnterMethod(this.f113601d).setLastGroupId(FeedParamProvider.C49809a.m93270a(this.f113599b).getLastGroupId()).setPreviousPage(this.f113606i).setFromGroupId(this.f113607j).setNewsId(FeedParamProvider.C49809a.m93270a(this.f113599b).getNewsId());
                if (!TextUtils.isEmpty(cVar.f86308b)) {
                    newsId.setInsertCids(cVar.f86308b, cVar.f86310d, cVar.f86312f);
                }
                if (!TextUtils.isEmpty(cVar.f86306C)) {
                    newsId.setInsertVid(cVar.f86306C);
                }
                if (!TextUtils.isEmpty(cVar.f86325s)) {
                    newsId.setInsertLikeUserIds(cVar.f86325s);
                    newsId.setLikeUserCount(cVar.f86326t);
                }
                if (TextUtils.equals("click_comment_chain", this.f113601d)) {
                    newsId.setEnterMethod(this.f113603f);
                }
                if (!TextUtils.isEmpty(cVar.f86329w)) {
                    newsId.setSearchId(cVar.f86329w);
                }
                if (TextUtils.equals("click_comment_icon", cVar.f86314h) && TextUtils.equals("challenge", this.f113601d)) {
                    newsId.setTagId(cVar.f86331y);
                    newsId.setParentTagId(cVar.f86332z);
                }
                if (!TextUtils.isEmpty(cVar.f86330x)) {
                    e = cVar.f86330x;
                } else {
                    e = C59208ac.m108771e(aweme);
                }
                newsId.setSearchResultId(e);
                AbstractC36418d a = CommentServiceImpl.m73664e().mo63279a(this.f113599b, aweme, newsId);
                if (a != null) {
                    if (!a.isAdded() && aweme.getAuthor() != null && aweme.isCmtSwt()) {
                        if (aweme.getAuthor().isAdFake() || aweme.isAd()) {
                            C51423a.m95792b("CommentForbidRight", " aweme id = " + aweme.getAid() + " author id = " + aweme.getAuthorUid() + " current uid = " + C31575b.m65865g().getCurUserId());
                        } else {
                            C51423a.m95792b("CommentForbidError", " aweme id = " + aweme.getAid() + " author id = " + aweme.getAuthorUid() + " current uid = " + C31575b.m65865g().getCurUserId());
                        }
                    }
                    a.mo63706a(new C49609h(this, aweme));
                    return;
                }
                return;
            }
            new C23144b(this.f113599b).mo37640e(R.string.a8t).mo37637b();
        }
    }

    /* renamed from: a */
    private JSONObject m92879a(JSONObject jSONObject, Aweme aweme) {
        boolean z;
        if (this.f113604g != null) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            try {
                jSONObject.put("enter_from", this.f113601d);
                if ("like_banner".equals(this.f113604g)) {
                    jSONObject.put("previous_page", this.f113604g);
                } else {
                    jSONObject.put("enter_method", this.f113604g);
                }
                if (aweme == null || aweme.getAwemeType() != 2) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    jSONObject.put("is_photo", 1);
                } else {
                    jSONObject.put("is_photo", 0);
                }
                jSONObject.put("author_id", aweme.getAuthorUid());
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return jSONObject;
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo81313a(final Aweme aweme, C49672ag agVar) {
        if (agVar.f114315a == 20) {
            this.f113994a.mo85027a(aweme, 0);
            if (aweme.getStatus() == null || aweme.getStatus().isPrivate()) {
                String uid = C31575b.m65865g().getCurUser().getUid();
                User author = aweme.getAuthor();
                if (author != null && TextUtils.equals(author.getUid(), uid)) {
                    new C17197a.C17200a(this.f113599b).mo27194b(R.string.et1).mo27195b(R.string.a8y, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                        /* class com.p2082ss.android.ugc.aweme.feed.C49563g.DialogInterface$OnClickListenerC495652 */

                        static {
                            Covode.recordClassIndex(58406);
                        }

                        public final void onClick(DialogInterface dialogInterface, int i) {
                            C39162r.onEvent(new MobClick().setEventName("private_permission").setLabelName("cancel").setValue(aweme.getAid()));
                        }
                    }, false).mo27190a(R.string.cta, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                        /* class com.p2082ss.android.ugc.aweme.feed.C49563g.DialogInterface$OnClickListenerC495641 */

                        static {
                            Covode.recordClassIndex(58405);
                        }

                        public final void onClick(DialogInterface dialogInterface, int i) {
                            C49563g.this.f113994a.mo57616a(aweme.getAid(), 1);
                            C39162r.onEvent(new MobClick().setEventName("private_permission").setLabelName("confirm").setValue(aweme.getAid()));
                        }
                    }, false).mo27193a().mo27184b();
                }
            }
        }
        if (!TextUtils.equals("homepage_follow", this.f113601d)) {
            CommentServiceImpl.m73664e().mo63294a(this.f113601d, aweme, m92881c(aweme), ForwardStatisticsServiceImpl.m95759b().mo86842a());
        }
    }

    /* renamed from: c */
    private void m92882c(Activity activity, Aweme aweme, C68859af afVar) {
        Bundle bundle = new Bundle();
        bundle.putString("play_list_type", this.f113998n);
        bundle.putString("play_list_id_key", this.f113999o);
        bundle.putString("play_list_id_value", this.f114000p);
        bundle.putString("play_list_id", this.f114000p);
        bundle.putString("play_list_type", this.f113998n);
        bundle.putString("play_list_id_key", this.f113999o);
        bundle.putString("tab_name", this.f114001q);
        bundle.putString("event_type", this.f113996l.mo84304g(true));
        bundle.putString("enter_method", this.f113604g);
        bundle.putInt("share_im_limit_tip_type", m92878a(aweme));
        bundle.putString("author_user_name", aweme.getAuthor().getUniqueId());
        bundle.putString("creation_id", this.f114002r);
        bundle.putString("previousPage", FeedParamProvider.C49809a.m93270a(this.f113599b).getPreviousPage());
        bundle.putString("previousPagePosition", FeedParamProvider.C49809a.m93270a(this.f113599b).getPreviousPagePosition());
        bundle.putString("category_name", FeedParamProvider.C49809a.m93270a(this.f113599b).getCategoryName());
        if (afVar != null) {
            afVar.mo109437a(bundle);
        }
        this.f113997m = C68863ah.f154027a.mo109392a(activity, this.f113600c, aweme, m92880b(aweme), this.f113995k, bundle);
    }

    @Override // com.p2082ss.android.ugc.aweme.share.AbstractC69360q
    /* renamed from: a */
    public final void mo81311a(Activity activity, Aweme aweme, C68859af afVar) {
        Activity activity2 = activity;
        if (activity2 == null) {
            activity2 = this.f113599b;
        }
        if (activity2 != null && !activity2.isFinishing() && aweme.getVideo() != null) {
            if (C56216k.m102133c()) {
                if (C49914a.m93723a(aweme)) {
                    new C23144b(activity2).mo37640e(R.string.a9j).mo37637b();
                } else {
                    m92882c(activity2, aweme, afVar);
                }
            } else if (C47436b.m90458a(aweme, this.f113601d)) {
                m92883d(aweme);
            } else if ((!C59208ac.m108774h(aweme) || !aweme.isProhibited()) && !C58956a.m108316b(aweme)) {
                if (m92880b(aweme)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("play_list_type", this.f113998n);
                    bundle.putString("play_list_id_key", this.f113999o);
                    bundle.putString("play_list_id_value", this.f114000p);
                    bundle.putString("play_list_id", this.f114000p);
                    bundle.putString("play_list_type", this.f113998n);
                    bundle.putString("play_list_id_key", this.f113999o);
                    bundle.putString("tab_name", this.f114001q);
                    bundle.putString("event_type", this.f113996l.mo84304g(true));
                    bundle.putString("enter_method", this.f113604g);
                    if (afVar != null) {
                        afVar.mo109437a(bundle);
                    }
                    this.f113997m = C68863ah.f154027a.mo109399a(activity2, this.f113600c, aweme, this.f113995k, bundle);
                    return;
                }
                C35434c.m72461a("share_panel");
                m92882c(activity2, aweme, afVar);
            } else if (activity2 instanceof ActivityC0945e) {
                C50318j.C50319a.m94417a((ActivityC0945e) activity2, aweme, this.f113995k);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.share.AbstractC69360q
    /* renamed from: b */
    public final void mo81314b(Activity activity, Aweme aweme, C68859af afVar) {
        Activity activity2 = activity;
        if (activity2 == null) {
            activity2 = this.f113599b;
        }
        if (activity2 != null && !activity2.isFinishing()) {
            if (C47436b.m90458a(aweme, this.f113601d)) {
                m92883d(aweme);
            } else if ((!C59208ac.m108774h(aweme) || !aweme.isProhibited()) && !C58956a.m108316b(aweme)) {
                Bundle bundle = new Bundle();
                bundle.putString("play_list_type", this.f113998n);
                bundle.putString("play_list_id_key", this.f113999o);
                bundle.putString("play_list_id_value", this.f114000p);
                bundle.putString("play_list_id", this.f114000p);
                bundle.putString("play_list_type", this.f113998n);
                bundle.putString("play_list_id_key", this.f113999o);
                bundle.putString("tab_name", this.f114001q);
                bundle.putString("event_type", this.f113996l.mo84304g(true));
                bundle.putString("enter_method", this.f113604g);
                bundle.putString("creation_id", this.f114002r);
                if (afVar != null) {
                    afVar.mo109437a(bundle);
                }
                this.f113997m = C68863ah.f154027a.mo109414b(activity2, this.f113600c, aweme, this.f113995k, bundle);
            } else if (activity2 instanceof ActivityC0945e) {
                C50318j.C50319a.m94417a((ActivityC0945e) activity2, aweme, this.f113995k);
            }
        }
    }

    public C49563g(String str, int i, AbstractC49691s<C49672ag> sVar, AbstractC49748e eVar) {
        super(str, i);
        this.f113995k = sVar;
        this.f113996l = eVar;
        C68056ch.m120361a();
    }

    @Override // com.p2082ss.android.ugc.aweme.mix.api.AbstractC59392f
    /* renamed from: a */
    public final void mo81310a(Activity activity, Aweme aweme, AbstractC59387a aVar, String str, String str2) {
        MixFeedService.m109435k().mo97307a(activity, aweme, aVar, str, str2);
    }

    @Override // com.p2082ss.android.ugc.aweme.mix.api.AbstractC59392f
    /* renamed from: a */
    public final void mo81312a(Activity activity, Aweme aweme, String str, String str2, String str3, String str4) {
        MixFeedService.m109435k().mo97308a(activity, aweme, str, str2, str3, str4);
    }
}
