package com.p2082ss.android.ugc.aweme.feed.p2944e;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.p2082ss.android.p2085a.p2086a.p2087a.C29339a;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.base.utils.C34722h;
import com.p2082ss.android.ugc.aweme.commercialize.C38000g;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.discover.mob.C42470r;
import com.p2082ss.android.ugc.aweme.discover.mob.ISearchResultStatistics;
import com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48147ag;
import com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai;
import com.p2082ss.android.ugc.aweme.feed.background.C49286c;
import com.p2082ss.android.ugc.aweme.feed.experiment.C49510c;
import com.p2082ss.android.ugc.aweme.feed.helper.C49615a;
import com.p2082ss.android.ugc.aweme.feed.helper.C49648o;
import com.p2082ss.android.ugc.aweme.feed.helper.C49653t;
import com.p2082ss.android.ugc.aweme.feed.model.Audio;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49849am;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50532ah;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50539g;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50545m;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50560y;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import com.p2082ss.android.ugc.aweme.feed.param.FeedParamProvider;
import com.p2082ss.android.ugc.aweme.legacy.SearchResultStatisticsImpl;
import com.p2082ss.android.ugc.aweme.metrics.AbstractC59233c;
import com.p2082ss.android.ugc.aweme.metrics.AbstractC59242h;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.metrics.C59223ar;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.player.p3548a.C62904e;
import com.p2082ss.android.ugc.aweme.poi_api.service.C63134c;
import com.p2082ss.android.ugc.aweme.shortvideo.p3837j.C71904j;
import com.p2082ss.android.ugc.aweme.story.C77260g;
import com.p2082ss.android.ugc.aweme.story.p4019b.C76598h;
import com.p2082ss.android.ugc.aweme.story.p4019b.C76599i;
import com.p2082ss.android.ugc.aweme.story.p4025d.C76706a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.upvote.event.C79900c;
import com.p2082ss.android.ugc.aweme.utils.C80632w;
import com.p2082ss.android.ugc.aweme.video.util.C81078d;
import com.p2082ss.android.ugc.playerkit.model.C84208l;
import com.p2082ss.android.ugc.playerkit.model.C84215n;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.e.f */
public final class C49433f extends C49445o {
    static {
        Covode.recordClassIndex(58246);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.feed.p2944e.C49445o
    /* renamed from: a */
    public final boolean mo81071a() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.feed.p2944e.C49445o
    /* renamed from: g */
    public final boolean mo81073g() {
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.feed.p2944e.C49445o
    /* renamed from: k */
    public final boolean mo81074k() {
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.feed.p2944e.C49445o
    /* renamed from: l */
    public final boolean mo81075l() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.feed.p2944e.C49445o
    /* renamed from: m */
    public final boolean mo81076m() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.feed.p2944e.C49445o
    /* renamed from: o */
    public final boolean mo81078o() {
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.feed.p2944e.C49445o
    /* renamed from: p */
    public final boolean mo81079p() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.feed.p2944e.C49445o
    /* renamed from: n */
    public final boolean mo81077n() {
        return mo81072a(true);
    }

    /* renamed from: q */
    public static boolean m92538q() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.feed.p2944e.C49445o
    /* renamed from: a */
    public final void mo81067a(Aweme aweme) {
        super.mo81067a(aweme);
        mo81186a(aweme, mo81174M(), true);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.feed.p2944e.C49445o
    /* renamed from: a */
    public final boolean mo81072a(boolean z) {
        boolean z2;
        if (!z || !mo81208t()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((this.f113600c.getUserVisibleHint() || C49286c.m92321a()) && ((this.f113652a || C49286c.m92321a()) && z2 && !AVExternalServiceImpl.m113114a().publishService().needRestore())) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static String m92536a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static void m92537a(C49812b bVar, AbstractC59242h hVar) {
        if (bVar.extra != null) {
            HashMap<String, String> hashMap = bVar.extra;
            if (hashMap.containsKey("token_type")) {
                hVar.mo96786a("token_type", hashMap.get("token_type"));
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.feed.p2944e.C49445o
    /* renamed from: a */
    public final void mo81068a(C84208l lVar, AbstractC48149ai aiVar) {
        Video video;
        Audio audio;
        long j;
        super.mo81068a(lVar, aiVar);
        if (mo81062h()) {
            if (m92620a(aiVar, lVar.f188032a)) {
                AbstractC48147ag p = aiVar.mo80225p();
                if (m92618a(p)) {
                    p.onPlayFailed(lVar);
                } else if (C50539g.m94752e(aiVar)) {
                    C38000g.m77057h().mo67247a(aiVar.mo80206b(), lVar);
                    if (!C37699a.m76277aw(aiVar.mo80206b()) || mo81206r().mo65995a() == null) {
                        video = aiVar.mo80206b().getVideo();
                        audio = aiVar.mo80206b().getAudio();
                    } else {
                        video = mo81206r().mo65995a();
                        audio = null;
                    }
                    if (lVar.f188034c && video.getVideoModelStr() != null) {
                        if (C37699a.m76277aw(aiVar.mo80206b())) {
                            video.setRationAndSourceId(mo81206r().mo65996b());
                        } else {
                            video.setRationAndSourceId(m92630c(aiVar));
                        }
                        mo81196a(m92630c(aiVar), false);
                        mo81174M().mo123934a(p.mo80233x());
                        mo81174M().mo123925a(video, audio, C81078d.m140774a(aiVar.mo80206b()), true, 0, true, false, m92623b(video, aiVar.mo80108W()));
                        mo81201b(lVar, aiVar);
                        return;
                    } else if (lVar.f188033b) {
                        if (C37699a.m76277aw(aiVar.mo80206b())) {
                            video.setRationAndSourceId(mo81206r().mo65996b());
                        } else {
                            video.setRationAndSourceId(m92630c(aiVar));
                        }
                        mo81188a(video, false);
                        mo81196a(m92630c(aiVar), false);
                        mo81174M().mo123934a(p.mo80233x());
                        if (!(aiVar.mo80206b() == null || aiVar.mo80206b().getVideo() == null)) {
                            aiVar.mo80206b().getVideo().setBitRate(null);
                            VideoUrlModel playAddrH264 = aiVar.mo80206b().getVideo().getPlayAddrH264();
                            if (playAddrH264 != null) {
                                playAddrH264.setBitRate(null);
                            }
                            mo81174M().mo123929a(playAddrH264, video.isNeedSetCookie(), m92623b(aiVar.mo80206b().getVideo(), aiVar.mo80108W()));
                        }
                        mo81201b(lVar, aiVar);
                        return;
                    } else {
                        new C79459a(mo81058c()).mo123052a(C34722h.m70923b(R.string.dph)).mo123053a();
                        p.onPlayFailed(lVar);
                        AbstractC49849am s = mo81207s();
                        if (s != null) {
                            s.mo81101at();
                        }
                        mo81201b(lVar, aiVar);
                        if (video != null && video.getPlayAddr() != null) {
                            if (this.f113728u != 0) {
                                j = SystemClock.elapsedRealtime() - this.f113728u;
                                this.f113728u = 0;
                            } else {
                                j = 0;
                            }
                            new C62904e.C62905a().mo100916a(String.valueOf(j)).mo100913a(mo81060e()).mo100915a(video).mo100914a(aiVar).mo100912a(0).mo100918b(mo81210v()).mo100917a(C49286c.m92321a()).f142785a.mo100911a();
                            C29339a.m58752a(new RunnableC49434g(this, lVar, video, aiVar));
                            if (s != null) {
                                s.mo84720b(0);
                            }
                            this.f113728u = 0;
                        } else {
                            return;
                        }
                    }
                }
            }
            mo81190a(new C71904j(1));
        }
    }

    public C49433f(String str, int i, AbstractC49849am amVar) {
        super(str, i, amVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.feed.p2944e.C49445o
    /* renamed from: a */
    public final void mo81070a(String str, AbstractC49849am amVar, Aweme aweme) {
        boolean z;
        String str2;
        boolean z2;
        String str3;
        String str4;
        boolean z3;
        super.mo81070a(str, amVar, aweme);
        if (amVar != null) {
            try {
                amVar.mo81107az();
            } catch (JSONException e) {
                e.printStackTrace();
                return;
            }
        }
        JSONObject u = mo81209u();
        if (amVar != null) {
            u.put("enter_from", amVar.mo81096g(false));
            u.put("content_source", amVar.mo81085aj());
            if (!TextUtils.isEmpty(amVar.mo81086ak())) {
                u.put("enter_method", amVar.mo81086ak());
            }
        }
        u.put("has_tts", C50532ah.m94733i(aweme));
        u.put("has_cla", C50532ah.m94732h(aweme));
        String str5 = "0";
        if (!C49510c.m92750d()) {
            mo81059d();
            C39162r.m79459a("video_play", "finish", str, str5, u);
        }
        if (aweme == null || aweme.getBottomBarModel() == null) {
            z = false;
        } else {
            z = true;
        }
        if (!this.f113725r) {
            if (aweme == null || aweme.getMusic() == null) {
                str2 = "";
            } else {
                str2 = String.valueOf(aweme.getMusic().getId());
            }
            if (amVar != null) {
                if (!C49510c.m92750d()) {
                    C49812b as = amVar.mo81094as();
                    if (TextUtils.isEmpty(this.f113724q) && aweme != null) {
                        this.f113724q = C59223ar.m108854c(aweme);
                    }
                    C59223ar a = new C59223ar().mo96774a(this.f113601d);
                    a.f135057d = this.f113604g;
                    C59223ar f = a.mo96749g(aweme);
                    f.f135064u = z;
                    f.f135030ab = as.getChallengeId();
                    f.f135035ag = as.getTagLine();
                    f.f135029aa = String.valueOf(amVar.mo81110aE());
                    f.f135011Z = as.getProcessId();
                    String str6 = this.f113724q;
                    f.f135012a = str;
                    f.f135055b = str6;
                    f.f135056c = C59208ac.m108759a(aweme, this.f113602e);
                    f.f135031ac = as.getmImprId();
                    C59223ar arVar = (C59223ar) f.mo96799a(Boolean.valueOf(C50545m.m94765b(aweme)));
                    if (aweme == null || !aweme.isHighlighted()) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    arVar.f135010Y = z2;
                    arVar.f135036ah = str2;
                    arVar.f135039ak = as.getPlaylistSearchId();
                    arVar.f135038aj = as.getIsFromVideo();
                    arVar.f135037ai = as.getCategoryName();
                    if (C50532ah.m94734j(aweme)) {
                        str3 = "1";
                    } else {
                        str3 = str5;
                    }
                    arVar.f135044ap = str3;
                    if (C50532ah.m94735k(aweme)) {
                        str4 = "1";
                    } else {
                        str4 = str5;
                    }
                    arVar.f135043ao = str4;
                    arVar.f135040al = this.f113601d;
                    arVar.f135042an = as.getPlaylistPreviousPage();
                    arVar.f135048at = as.getIsFromPlaylist();
                    arVar.f135041am = as.getLastGroupId();
                    if (as.getNewsId() != null) {
                        arVar.f135047as = as.getNewsId();
                    }
                    m92537a(as, arVar);
                    if (m92622a(this.f113601d, amVar.mo70446M())) {
                        if (aweme != null && aweme.isTop()) {
                            str5 = "1";
                        }
                        arVar.mo96803e(str5);
                    }
                    if (C76706a.m134278d(aweme)) {
                        AbstractC59233c unused = C76598h.m134180a(arVar, C77260g.f173332a.mo120157e().mo120171a(aweme.getAuthorUid()), aweme, C76599i.m134188a(as), null, null);
                    }
                    if (!TextUtils.isEmpty(((C49445o) this).f113601d) && aweme != null && !TextUtils.isEmpty(aweme.getAid())) {
                        C49653t.m93096a(new C49648o(aweme.getAid(), 0, System.currentTimeMillis(), ((C49445o) this).f113601d));
                    }
                    arVar.f135062s = amVar.mo81083ah();
                    C59223ar arVar2 = (C59223ar) arVar.mo96801c(amVar.mo70446M());
                    arVar2.f135064u = z;
                    arVar2.f135063t = FeedParamProvider.C49809a.m93270a(mo81059d()).getPreviousPagePosition();
                    arVar2.f135060q = amVar.mo81092aq();
                    arVar2.f135061r = amVar.mo81093ar();
                    arVar2.f135059p = amVar.mo81091ap();
                    ((C59223ar) arVar2.mo96801c(amVar.mo70446M()).mo96802d(C59208ac.m108764b(aweme, this.f113602e))).mo96773a(as).f135058e = amVar.mo81085aj();
                    if (!TextUtils.isEmpty(amVar.mo81086ak())) {
                        arVar.f135057d = amVar.mo81086ak();
                    }
                    arVar.mo96788a(C50560y.m94792b(as.getPreviousPage(), as.getFromGroupId()));
                    arVar.mo96807i(as.getListItemId());
                    arVar.mo96805g(as.getListResultType());
                    arVar.mo96809j(as.getSearchThirdItemId());
                    arVar.f135031ac = as.getmImprId();
                    arVar.f135034af = as.getSearchType();
                    arVar.f135032ad = as.getSearchKeyword();
                    arVar.mo96810l(as.getSearchId());
                    String searchResultId = as.getSearchResultId();
                    if (TextUtils.equals(this.f113601d, "general_search") && TextUtils.isEmpty(searchResultId)) {
                        searchResultId = C59208ac.m108771e(aweme);
                    }
                    arVar.mo96804f(searchResultId);
                    if (aweme != null) {
                        arVar.f135045aq = aweme.getCaptionReturnCount();
                        arVar.f135046ar = aweme.getCaptionLength();
                    }
                    arVar.mo96788a(C80632w.m139800a(aweme, "video_play_finish", this.f113601d));
                    if (!(C63134c.f143478d == null || C63134c.m114157a() == null)) {
                        arVar.mo96788a(C63134c.m114157a().mo101451a(as.getPagePoiId(), aweme));
                    }
                    if (aweme != null) {
                        C79900c.m138667a(arVar, aweme, this.f113601d);
                    }
                    if (!C17873f.f42636l) {
                        arVar.mo96792f();
                    }
                    String ah = amVar.mo81083ah();
                    String previousPagePosition = FeedParamProvider.C49809a.m93270a(mo81059d()).getPreviousPagePosition();
                    if (this.f113601d.equals("playlist")) {
                        ah = as.getPlaylistPreviousPage();
                    }
                    if (TextUtils.equals(ah, "search_result") || TextUtils.equals(ah, "general_search") || TextUtils.equals(ah, "search_for_you_list")) {
                        long playlistOffset = as.getPlaylistOffset() + ((long) amVar.mo81113g(aweme));
                        ISearchResultStatistics a2 = SearchResultStatisticsImpl.m104992a();
                        String str7 = this.f113601d;
                        if (TextUtils.equals(ah, "search_result") || TextUtils.equals(ah, "search_for_you_list")) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        a2.mo71657a(new C42470r("search_video_play_finish", aweme, str7, -1, z3, ah, previousPagePosition, playlistOffset));
                    }
                } else if (aweme != null) {
                    String g = amVar.mo81096g(true);
                    C89219l.m154721d(aweme, "");
                    C89219l.m154721d(g, "");
                    C49615a.m93040a(aweme, g, "audio_play_finish", (Map<String, String>) null);
                }
            }
            this.f113725r = true;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.feed.p2944e.C49445o
    /* renamed from: a */
    public final void mo81069a(C84215n nVar, AbstractC48149ai aiVar, String str, AbstractC49849am amVar, Aweme aweme, JSONObject jSONObject) {
        String str2;
        Intent intent;
        super.mo81069a(nVar, aiVar, str, amVar, aweme, jSONObject);
        Context d = mo81059d();
        int i = this.f113602e;
        if (!this.f113725r) {
            String str3 = null;
            if (!(d instanceof Activity) || (intent = ((Activity) d).getIntent()) == null || !intent.getBooleanExtra("from_notification", false)) {
                str2 = null;
            } else {
                str2 = m92536a(intent, "rule_id");
            }
            if (aweme != null) {
                str3 = aweme.getAid();
            }
            C1731i.m5640b(new CallableC49435h(this, aweme, str3, d, str, i, amVar, jSONObject, str2), C39162r.m79452a());
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x03ca  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x032a  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0366  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x037a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object mo81066a(com.p2082ss.android.ugc.aweme.feed.model.Aweme r22, java.lang.String r23, android.content.Context r24, java.lang.String r25, int r26, com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49849am r27, org.json.JSONObject r28, java.lang.String r29) {
        /*
        // Method dump skipped, instructions count: 1149
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.p2944e.C49433f.mo81066a(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, android.content.Context, java.lang.String, int, com.ss.android.ugc.aweme.feed.q.am, org.json.JSONObject, java.lang.String):java.lang.Object");
    }
}
