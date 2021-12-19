package com.p2082ss.android.ugc.aweme.shortvideo;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1214u;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.C13617h;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.C39163s;
import com.p2082ss.android.ugc.aweme.common.LogPbBean;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63178ak;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.shortvideo.eventtrack.HashTagMobHelper;
import com.p2082ss.android.ugc.aweme.shortvideo.model.AVSearchChallengeList;
import com.p2082ss.android.ugc.aweme.shortvideo.model.RecommendWordMob;
import com.p2082ss.android.ugc.aweme.shortvideo.view.HashTagMentionEditText;
import com.p2082ss.android.ugc.aweme.utils.C80345dj;
import com.p2082ss.android.ugc.aweme.utils.C80564i;
import com.p2082ss.android.ugc.aweme.video.hashtag.AbstractC80743d;
import com.p2082ss.android.ugc.aweme.video.hashtag.C80733a;
import com.p2082ss.android.ugc.aweme.video.hashtag.C80735b;
import com.p2082ss.android.ugc.aweme.video.hashtag.C80737c;
import com.p2082ss.android.ugc.aweme.video.hashtag.helper.BaseTitleHelper;
import com.p2082ss.android.ugc.aweme.video.hashtag.helper.C80746a;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.bf */
public final class C69881bf implements AbstractC1214u<C33942b>, AbstractC63178ak.AbstractC63179a<AVChallenge>, AbstractC63178ak.AbstractC63183e, AbstractC80743d {

    /* renamed from: a */
    public static String f156130a = "video_challenge";

    /* renamed from: b */
    public static String f156131b = "photo_publish";

    /* renamed from: c */
    public static String f156132c = "challenge_create";

    /* renamed from: d */
    public RecyclerView f156133d;

    /* renamed from: e */
    public DmtStatusView f156134e;

    /* renamed from: f */
    public C71804ej f156135f;

    /* renamed from: g */
    public String f156136g;

    /* renamed from: h */
    public AbstractC63178ak.AbstractC63182d f156137h;

    /* renamed from: i */
    public AbstractC63178ak.AbstractC63181c f156138i;

    /* renamed from: j */
    public AbstractC63178ak.AbstractC63180b f156139j;

    /* renamed from: k */
    public boolean f156140k;

    /* renamed from: l */
    public C80737c f156141l;

    /* renamed from: m */
    public ArrayList<C80735b> f156142m = new ArrayList<>();

    /* renamed from: n */
    public AbstractC63178ak.C63184f f156143n;

    /* renamed from: o */
    public BaseTitleHelper f156144o;

    /* renamed from: p */
    public HashTagMobHelper f156145p;

    /* renamed from: q */
    public String f156146q;

    /* renamed from: r */
    public boolean f156147r = false;

    /* renamed from: s */
    private ViewGroup f156148s;

    /* renamed from: t */
    private ViewGroup f156149t;

    /* renamed from: u */
    private ViewGroup f156150u;

    /* renamed from: v */
    private ViewGroup f156151v;

    /* renamed from: w */
    private FrameLayout f156152w;

    /* renamed from: x */
    private boolean f156153x;

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63178ak.AbstractC63179a
    /* renamed from: a */
    public final void mo101620a() {
        m123435b(null);
    }

    static {
        Covode.recordClassIndex(82290);
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63178ak.AbstractC63183e
    /* renamed from: b */
    public final void mo101623b() {
        m123433a(0);
        this.f156133d.setVisibility(8);
        this.f156134e.mo27384f();
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63178ak.AbstractC63183e
    /* renamed from: c */
    public final void mo101624c() {
        m123433a(0);
        this.f156133d.setVisibility(8);
        this.f156134e.mo27387h();
    }

    /* renamed from: d */
    public final void mo110221d() {
        this.f156148s.setVisibility(8);
        this.f156149t.setVisibility(0);
        this.f156142m.clear();
        this.f156141l.notifyDataSetChanged();
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63178ak.AbstractC63179a
    /* renamed from: a */
    public final void mo101621a(List<AVChallenge> list) {
        m123435b(list);
    }

    /* renamed from: a */
    private void m123433a(int i) {
        FrameLayout frameLayout = this.f156152w;
        if (frameLayout != null) {
            frameLayout.setVisibility(i);
        }
        DmtStatusView dmtStatusView = this.f156134e;
        if (dmtStatusView != null) {
            dmtStatusView.setVisibility(i);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.AbstractC1214u
    public final /* synthetic */ void onChanged(C33942b bVar) {
        String str;
        C33942b bVar2 = bVar;
        if (bVar2 != null && TextUtils.equals(bVar2.f80277a, AbstractC63178ak.f143521a) && (str = this.f156136g) != null && str.endsWith("#")) {
            mo110220a("");
        }
    }

    /* renamed from: b */
    private void m123435b(List<AVChallenge> list) {
        m123434a("", null);
        List<C80735b> a = C80746a.m140000a(list, this.f156137h.mo93809a());
        if (a.isEmpty()) {
            m123433a(0);
            this.f156133d.setVisibility(8);
            this.f156134e.mo27385g();
            return;
        }
        m123433a(8);
        this.f156133d.setVisibility(0);
        this.f156142m.clear();
        this.f156142m.addAll(a);
        this.f156141l.f180517a = true;
        this.f156141l.notifyDataSetChanged();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.hashtag.AbstractC80743d
    /* renamed from: a */
    public final void mo110219a(AVChallenge aVChallenge) {
        mo110221d();
        this.f156140k = false;
        HashTagMentionEditText hashTagMentionEditText = this.f156135f.f160912c;
        int selectionStart = hashTagMentionEditText.getSelectionStart();
        String substring = hashTagMentionEditText.getText().toString().substring(0, selectionStart);
        if (C80345dj.m139307a(substring) || substring.endsWith("#")) {
            C80733a b = C80345dj.m139309b(substring, aVChallenge.getChallengeName());
            hashTagMentionEditText.getText().replace(substring.lastIndexOf("#"), selectionStart, b.f180509c);
            hashTagMentionEditText.mo116502a(true);
            String trim = b.f180509c.trim();
            if (!C80345dj.m139307a(trim)) {
                hashTagMentionEditText.f166462C.add(trim);
            }
        }
    }

    /* renamed from: a */
    public final void mo110220a(String str) {
        if (!C63238c.f143594u.mo93901a()) {
            this.f156150u.setVisibility(8);
            if (this.f156151v.getVisibility() == 0) {
                ActivityC0945e eVar = (ActivityC0945e) C80564i.m139647a(this.f156151v.getContext());
                Fragment a = eVar.getSupportFragmentManager().mo3551a("publish_add_video");
                if (a != null) {
                    eVar.getSupportFragmentManager().mo3552a().mo3455a(a).mo3467b();
                }
                this.f156151v.setVisibility(8);
            }
            this.f156148s.setVisibility(0);
            if (TextUtils.isEmpty(str)) {
                this.f156153x = true;
                this.f156139j.mo93916a(1);
                return;
            }
            this.f156153x = false;
            this.f156138i.mo93915a(str, f156132c);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63178ak.AbstractC63183e
    /* renamed from: a */
    public final void mo101622a(AVSearchChallengeList aVSearchChallengeList) {
        if (!this.f156153x) {
            if (aVSearchChallengeList != null) {
                m123434a(aVSearchChallengeList.keyword, aVSearchChallengeList.logPb);
            }
            String str = null;
            List<C71852g> list = aVSearchChallengeList == null ? null : aVSearchChallengeList.items;
            this.f156142m.clear();
            if (!this.f156140k || C13617h.m24465a(list)) {
                m123433a(0);
                this.f156133d.setVisibility(8);
                this.f156134e.mo27385g();
                this.f156148s.setVisibility(8);
                this.f156149t.setVisibility(0);
            } else {
                HashTagMobHelper hashTagMobHelper = this.f156145p;
                if (hashTagMobHelper != null) {
                    hashTagMobHelper.f160960b = aVSearchChallengeList.logPb;
                    this.f156145p.f160962d = aVSearchChallengeList.keyword;
                    this.f156145p.f160961c = aVSearchChallengeList.recommendWordMob;
                }
                String str2 = aVSearchChallengeList.keyword;
                C80737c cVar = this.f156141l;
                LogPbBean logPbBean = aVSearchChallengeList.logPb;
                cVar.f180518b = str2;
                cVar.f180519c = logPbBean;
                for (int i = 0; i < list.size(); i++) {
                    C71852g gVar = list.get(i);
                    ArrayList<C80735b> arrayList = this.f156142m;
                    boolean z = true;
                    if (i != 0 || !C16048b.m29633a().mo25421a(true, "display_new_challenge_as_not_found", false) || !gVar.f161024a.isNew(str2)) {
                        z = false;
                    }
                    arrayList.add(C80735b.m139992a(gVar, z));
                }
                HashTagMobHelper hashTagMobHelper2 = this.f156145p;
                Integer valueOf = Integer.valueOf(this.f156142m.size());
                if (valueOf != null) {
                    valueOf.intValue();
                    C39163s a = new C39163s().mo67941a("words_num", String.valueOf(valueOf.intValue())).mo67941a("words_source", "sug").mo67941a("search_position", "challenge_create").mo67941a("raw_query", hashTagMobHelper2.f160962d).mo67941a("rank", "-1");
                    RecommendWordMob recommendWordMob = hashTagMobHelper2.f160961c;
                    C39163s a2 = a.mo67941a("query_id", recommendWordMob != null ? recommendWordMob.getQueryId() : null);
                    if (hashTagMobHelper2.f160960b == null) {
                        str = "";
                    } else {
                        LogPbBean logPbBean2 = hashTagMobHelper2.f160960b;
                        if (logPbBean2 != null) {
                            str = logPbBean2.getImprId();
                        }
                    }
                    C39162r.m79461a("trending_show", a2.mo67941a("impr_id", str).mo67942a());
                }
                this.f156134e.mo27382d();
                m123433a(8);
                this.f156133d.setVisibility(0);
                this.f156148s.setVisibility(0);
                this.f156149t.setVisibility(8);
            }
            this.f156141l.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    private static void m123434a(String str, LogPbBean logPbBean) {
        C39163s sVar = new C39163s();
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        C39163s a = sVar.mo67941a("search_keyword", str);
        if (logPbBean != null) {
            str2 = C63238c.f143575b.mo46674b(logPbBean);
        }
        C39162r.m79463b("search_tag", a.mo67941a("log_pb", str2).mo67942a());
    }

    public C69881bf(String str, C71804ej ejVar, View view) {
        this.f156146q = str;
        this.f156135f = ejVar;
        ejVar.f160926q = C63238c.f143594u.mo93904c();
        this.f156133d = (RecyclerView) view.findViewById(R.id.bdf);
        this.f156148s = (ViewGroup) view.findViewById(R.id.bdj);
        this.f156149t = (ViewGroup) view.findViewById(R.id.uk);
        this.f156150u = (ViewGroup) view.findViewById(R.id.gp);
        this.f156151v = (ViewGroup) view.findViewById(R.id.gz);
        this.f156134e = (DmtStatusView) view.findViewById(R.id.e7i);
        this.f156152w = (FrameLayout) view.findViewById(R.id.e7p);
        ViewGroup viewGroup = this.f156148s;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) viewGroup.getLayoutParams();
        layoutParams.topMargin = (int) (((float) layoutParams.topMargin) + C84912r.m145930a(viewGroup.getContext(), 8.0f));
        viewGroup.setLayoutParams(layoutParams);
    }
}
