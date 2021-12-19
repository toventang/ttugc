package com.p2082ss.android.ugc.aweme.feed.p2969u;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.C12290b;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.p1121b.p1122a.C16105a;
import com.bytedance.monitor.collector.C21478d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c;
import com.p2082ss.android.ugc.aweme.common.p2633e.C39101b;
import com.p2082ss.android.ugc.aweme.common.p2633e.C39108i;
import com.p2082ss.android.ugc.aweme.experiment.C46724b;
import com.p2082ss.android.ugc.aweme.experiment.C46832dk;
import com.p2082ss.android.ugc.aweme.experiment.C46930fg;
import com.p2082ss.android.ugc.aweme.feed.C50520x;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.FeedAppLogParams;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49685m;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49698y;
import com.p2082ss.android.ugc.aweme.feed.p2959p.p2961b.C49806f;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.journey.AbstractC56869p;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.legoImp.service.MainLooperOptService;
import com.p2082ss.android.ugc.aweme.logger.C58945a;
import com.p2082ss.android.ugc.aweme.player.p3548a.C62891a;
import com.p2082ss.android.ugc.aweme.utils.C80444fq;
import com.p2082ss.android.ugc.aweme.utils.C80446fr;
import com.p2082ss.android.ugc.aweme.utils.EnumC80443fp;
import com.p2082ss.android.ugc.aweme.video.C80662ac;
import com.p2082ss.android.ugc.aweme.video.C81079v;
import com.p2082ss.android.ugc.aweme.video.preload.C80860b;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.mediakit.medialoader.AVMDLDataLoader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.feed.u.l */
public final class C49976l extends C39101b<C49968d> {

    /* renamed from: a */
    public boolean f115287a;

    /* renamed from: b */
    public AbstractC49992x f115288b;

    /* renamed from: c */
    public boolean f115289c;

    /* renamed from: d */
    public AbstractC49987t f115290d;

    /* renamed from: e */
    public int f115291e;

    /* renamed from: f */
    private boolean f115292f;

    /* renamed from: g */
    private String f115293g = "";

    /* renamed from: l */
    private Fragment f115294l;

    /* renamed from: m */
    private String f115295m;

    /* renamed from: n */
    private C50520x f115296n;

    /* renamed from: o */
    private int f115297o;

    /* renamed from: p */
    private long f115298p;

    /* renamed from: q */
    private boolean f115299q;

    /* renamed from: r */
    private boolean f115300r;

    /* renamed from: s */
    private volatile boolean f115301s;

    static {
        Covode.recordClassIndex(59088);
    }

    /* renamed from: b */
    private static String m93829b(int i) {
        return i != 1 ? i != 2 ? i != 4 ? "" : "load_more" : "load_latest" : "refresh";
    }

    /* renamed from: c */
    private static String m93830c(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "" : "homepage_fresh" : "homepage_follow" : "homepage_hot";
    }

    /* renamed from: d */
    static final /* synthetic */ Object m93831d() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", 200);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C12290b.m22064a("feed_error", jSONObject);
        return null;
    }

    /* renamed from: e */
    private void m93832e() {
        if (this.f115287a) {
            this.f115287a = false;
            ((C49968d) this.f92286h).f115243a = false;
        }
        AbstractC81915c.m141874a(new C49698y());
    }

    /* renamed from: f */
    private FeedAppLogParams m93833f() {
        return new FeedAppLogParams(this.f92286h.mData, ((C49968d) this.f92286h).f115244b, ((AbstractC39100a) this.f92286h).getItems());
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c, com.p2082ss.android.ugc.aweme.common.AbstractC39159o, com.p2082ss.android.ugc.aweme.common.p2633e.C39101b
    /* renamed from: c */
    public final void mo57528c() {
        Aweme aweme;
        boolean z;
        if (!this.f115301s && C46832dk.m90152c()) {
            MainLooperOptService mainLooperOptService = (MainLooperOptService) C58221f.m105143a(MainLooperOptService.class);
            if (mainLooperOptService.mo95727a(mainLooperOptService.f132761c, mainLooperOptService.f132763e, 0)) {
                MainLooperOptService.f132757a.booleanValue();
            }
            C21478d.f50922d = true;
            this.f115301s = true;
        }
        C51423a.m95784a(4, "FeedFetchModel", "FeedFetchPresenter called onSuccess!");
        C58945a.C58947b.f134185a.mo96429b("feed_ui_post_msg_to_feed_ui", false);
        C58945a.C58947b.f134185a.mo96429b("cold_boot_start_to_feed_ui", false);
        C58945a.C58947b.f134185a.mo96429b("method_first_feed_request", false);
        C58945a.C58947b.f134185a.mo96429b("feed_post_cache_message_to_success", false);
        C58945a.C58947b.f134185a.mo96429b("feed_render_to_ui", false);
        C58945a.C58947b.f134185a.mo96429b("player_prerender_to_ui", false);
        if (C58945a.C58947b.f134185a.mo96426a("feed_parse_to_ui") && !C58945a.C58947b.f134185a.mo96430b("feed_parse_to_ui")) {
            C58945a.C58947b.f134185a.mo96429b("feed_parse_to_ui", true);
        }
        if (!C58945a.C58947b.f134185a.mo96426a("feed_ui_duration")) {
            C58945a.C58947b.f134185a.mo96425a("feed_ui_duration", true);
        }
        C58945a.C58947b.f134185a.mo96429b("cold_boot_main_focus_to_feed_success", false);
        if (C58945a.C58947b.f134185a.mo96426a("cold_boot_new_user_journey_pause_to_data_fetched")) {
            C58945a.C58947b.f134185a.mo96429b("cold_boot_new_user_journey_pause_to_data_fetched", false);
        }
        if (C46724b.f108901b) {
            C80446fr.m139456a(5000);
        }
        Boolean bool = true;
        C49806f.f114571a.set(bool.booleanValue());
        this.f115296n.mo85841a(1, this.f115293g, m93833f());
        this.f115296n.mo85842a(1, this.f115293g, m93833f(), null);
        if (this.f92286h.mData != null && this.f92286h.mData.isFromLocalCache) {
            this.f92286h.mData.isFromLocalCache = false;
        }
        m93832e();
        AbstractC49992x xVar = this.f115288b;
        if (xVar != null) {
            if (!this.f115292f || this.f115289c) {
                z = true;
            } else {
                z = false;
            }
            xVar.mo70483c(z);
        }
        this.f115292f = false;
        this.f115289c = false;
        if (!(this.f92286h.mData == null || this.f92286h.mData.getItems() == null || this.f92286h.mData.getItems().size() <= 0)) {
            C58945a.C58947b.f134185a.mo96425a("preload_feed_item", false);
            List<Aweme> items = this.f92286h.mData.getItems();
            if (!C46930fg.f109366a || this.f115300r || items == null || items.size() == 0 || items.size() <= 0 || (aweme = items.get(0)) == null || !C80860b.m140277b(C80860b.m140276a(aweme.getAid()))) {
                if (C80444fq.C80445a.f180026a.mo123743a(EnumC80443fp.FEED_FIRST_VIDEO_PRELOAD)) {
                    C80662ac.m139885a(items);
                }
                this.f115300r = true;
            }
            C58945a.C58947b.f134185a.mo96429b("preload_feed_item", false);
            Aweme aweme2 = this.f92286h.mData.getItems().get(0);
            if (aweme2 != null && aweme2.getVideo() != null && C16048b.m29633a().mo25412a(true, "player_precreateplayer", 0) == 1 && C80444fq.C80445a.f180026a.mo123743a(EnumC80443fp.PLAYER_FIRST_VIDEO_PREPARED)) {
                C81079v.m140776O().mo123936a(aweme2);
            }
        }
        if (!this.f115299q) {
            AVMDLDataLoader.tryLoadVcnverifylib();
            this.f115299q = true;
        }
        C58945a.C58947b.f134185a.mo96425a("feed_fetch_super_onsuccess", false);
        if (((C49968d) this.f92286h).f115245c) {
            this.f115290d.mo84887d(((AbstractC39100a) this.f92286h).getItems(), ((AbstractC39100a) this.f92286h).isHasMore());
        } else {
            super.mo57528c();
        }
        C58945a.C58947b.f134185a.mo96429b("feed_fetch_super_onsuccess", false);
        if (this.f92286h.mData != null) {
            this.f115298p = SystemClock.elapsedRealtime();
            C62891a aVar = C62891a.C62892a.f142629a;
            String requestId = this.f92286h.mData.getRequestId();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (requestId != null) {
                aVar.f142628a.put(requestId, Long.valueOf(elapsedRealtime));
            }
        }
        if (this.f92286h != null && !C13603b.m24435a((Collection) ((AbstractC39100a) this.f92286h).getItems())) {
            AbstractC56869p a = AbstractC56869p.C56870a.m103133a();
            List items2 = ((AbstractC39100a) this.f92286h).getItems();
            if (a.f129513f) {
                a.f129513f = false;
                a.f129514g = 0;
            } else if (a.f129514g == -1) {
                a.f129514g = 2;
            }
            if ((a.f129514g == 2 || a.f129514g == 0) && items2 != null && (!items2.isEmpty()) && ((Aweme) items2.get(0)).isFakeResponse()) {
                a.f129514g = 1;
            }
        }
        if (this.f92286h.mData == null || this.f92286h.mData.getItems() == null || this.f92286h.mData.getItems().isEmpty()) {
            C1731i.m5640b(CallableC49978n.f115303a, C39162r.m79452a());
        }
        if (!(this.f92286h == null || this.f92286h.mData == null || !this.f92286h.mData.isFromUnusedFeed)) {
            this.f92286h.mData.isFromUnusedFeed = false;
            AbstractC81915c.m141874a(new C49685m("from_full_recommend"));
        }
        if (C58945a.C58947b.f134185a.mo96426a("feed_ui_duration") && !C58945a.C58947b.f134185a.mo96430b("feed_ui_duration")) {
            C58945a.C58947b.f134185a.mo96429b("feed_ui_duration", true);
        }
        if (!C58945a.C58947b.f134185a.mo96426a("feed_ui_to_video")) {
            C58945a.C58947b.f134185a.mo96425a("feed_ui_to_video", true);
        }
        C58945a.C58947b.f134185a.mo96425a("feed_ui_to_texture_available", false);
    }

    /* renamed from: b */
    public final boolean mo85023b(Object... objArr) {
        this.f115297o = 5;
        return mo57616a(objArr);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.C39101b, com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39105f
    /* renamed from: a */
    public final boolean mo59500a(C39108i iVar) {
        if (this.f92299k != null) {
            return this.f92299k.mo62670a(iVar);
        }
        return false;
    }

    public C49976l(Fragment fragment) {
        this.f115294l = fragment;
        this.f115296n = new C50520x(fragment);
    }

    /* renamed from: b */
    static final /* synthetic */ Object m93828b(Exception exc) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", C16105a.m29903a(exc, (String[]) null));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C12290b.m22064a("feed_error", jSONObject);
        return null;
    }

    /* renamed from: a */
    public final void mo85021a(String str) {
        if (!TextUtils.isEmpty(str) && ((AbstractC39100a) this.f92286h).getItems() != null) {
            for (int size = ((AbstractC39100a) this.f92286h).getItems().size() - 1; size >= 0; size--) {
                Aweme aweme = (Aweme) ((AbstractC39100a) this.f92286h).getItems().get(size);
                if (aweme != null && TextUtils.equals(str, aweme.getAuthorUid())) {
                    ((AbstractC39100a) this.f92286h).getItems().remove(size);
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c, com.p2082ss.android.ugc.aweme.common.AbstractC39159o, com.p2082ss.android.ugc.aweme.common.p2633e.C39101b
    /* renamed from: a_ */
    public final void mo57526a_(Exception exc) {
        boolean z;
        C51423a.m95784a(4, "FeedFetchModel", "FeedFetchPresenter called onFailed!");
        this.f115296n.mo85841a(0, this.f115293g, null);
        this.f115296n.mo85842a(0, this.f115293g, null, exc);
        if (exc != null && !TextUtils.isEmpty(exc.getMessage())) {
            C1731i.m5640b(new CallableC49977m(exc), C39162r.m79452a());
            AbstractC56869p a = AbstractC56869p.C56870a.m103133a();
            try {
                if (a.f129514g == -1) {
                    a.f129514g = C16105a.m29903a(exc, (String[]) null);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        m93832e();
        AbstractC49992x xVar = this.f115288b;
        if (xVar != null) {
            if (!this.f115292f || this.f115289c) {
                z = true;
            } else {
                z = false;
            }
            xVar.mo70483c(z);
        }
        this.f115292f = false;
        this.f115289c = false;
        super.mo57526a_(exc);
        C58221f.m105152d();
    }

    /* renamed from: b */
    public final boolean mo85022b(Object obj) {
        List items = ((AbstractC39100a) this.f92286h).getItems();
        if (C13603b.m24435a((Collection) items)) {
            items = new ArrayList();
        }
        if (items.size() < 0) {
            return false;
        }
        items.add(0, obj);
        ((AbstractC39100a) this.f92286h).setItems(items);
        if (this.f92287i == null) {
            return true;
        }
        if (((AbstractC39100a) this.f92286h).isDataEmpty()) {
            ((AbstractC39102c) this.f92287i).mo59525f();
            return true;
        }
        mo59499a(items, 0);
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c
    /* renamed from: a */
    public final boolean mo57616a(Object... objArr) {
        this.f115293g = m93829b(((Integer) objArr[0]).intValue());
        if (5 == this.f115297o) {
            this.f115293g = "press_back";
        }
        this.f115295m = m93830c(((Integer) objArr[1]).intValue());
        C51423a.m95791b(4, "FeedFetchModel", "FeedFetchPresenter sendRequest on:" + this.f115295m);
        this.f115296n.mo85843a(this.f115293g);
        AbstractC49992x xVar = this.f115288b;
        if (xVar != null) {
            xVar.mo70483c(this.f115289c);
        }
        boolean a = super.mo57616a(objArr);
        this.f115292f = a;
        return a;
    }
}
