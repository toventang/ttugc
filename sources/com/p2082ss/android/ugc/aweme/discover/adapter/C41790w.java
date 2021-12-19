package com.p2082ss.android.ugc.aweme.discover.adapter;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.core.content.C0643b;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17300a;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17303d;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.utils.C34715b;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.commerce_challenge_impl.service.CommerceChallengeServiceImpl;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38228an;
import com.p2082ss.android.ugc.aweme.discover.alading.C41827d;
import com.p2082ss.android.ugc.aweme.discover.alading.C41828e;
import com.p2082ss.android.ugc.aweme.discover.helper.C42014f;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.p2789b.C42317b;
import com.p2082ss.android.ugc.aweme.discover.mob.C42452d;
import com.p2082ss.android.ugc.aweme.discover.mob.C42467o;
import com.p2082ss.android.ugc.aweme.discover.model.Challenge;
import com.p2082ss.android.ugc.aweme.discover.model.Position;
import com.p2082ss.android.ugc.aweme.discover.model.SearchChallenge;
import com.p2082ss.android.ugc.aweme.discover.p2787m.C42292a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.i18n.C53437b;
import com.p2082ss.android.ugc.aweme.metrics.C59253r;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.search.C67361d;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67496as;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67542d;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67568r;
import com.p2082ss.android.ugc.aweme.search.p3696l.C67591a;
import com.p2082ss.android.ugc.aweme.search.p3696l.C67641m;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.w */
public final class C41790w extends AbstractView$OnAttachStateChangeListenerC41671b {

    /* renamed from: a */
    TextView f97476a;

    /* renamed from: b */
    TextView f97477b;

    /* renamed from: c */
    ViewStub f97478c;

    /* renamed from: d */
    C41828e f97479d;

    /* renamed from: e */
    Challenge f97480e;

    /* renamed from: f */
    boolean f97481f;

    /* renamed from: g */
    String f97482g;

    /* renamed from: h */
    public String f97483h;

    /* renamed from: i */
    AbstractC41794a f97484i;

    /* renamed from: m */
    public Boolean f97485m = false;

    /* renamed from: n */
    public String f97486n = "";

    /* renamed from: o */
    public int f97487o = -1;

    /* renamed from: p */
    private C41827d f97488p;

    /* renamed from: q */
    private ViewGroup f97489q;

    /* renamed from: r */
    private String f97490r;

    /* renamed from: s */
    private C42014f f97491s = null;

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.w$a */
    public interface AbstractC41794a {
        static {
            Covode.recordClassIndex(49709);
        }
    }

    static {
        Covode.recordClassIndex(49705);
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.adapter.AbstractView$OnAttachStateChangeListenerC41671b
    /* renamed from: I */
    public final View mo70834I() {
        return this.itemView;
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.w$b */
    protected static class View$OnAttachStateChangeListenerC41795b implements View.OnAttachStateChangeListener, Runnable {

        /* renamed from: a */
        C38228an f97496a;

        /* renamed from: b */
        boolean f97497b;

        /* renamed from: c */
        private final View f97498c;

        /* renamed from: d */
        private final String f97499d;

        /* renamed from: e */
        private boolean f97500e;

        static {
            Covode.recordClassIndex(49710);
        }

        public final void run() {
            if (this.f97500e) {
                if (this.f97496a != null) {
                    if (!C34729o.m70960b(this.f97498c)) {
                        this.f97497b = false;
                    } else if (!this.f97497b) {
                        this.f97497b = true;
                    }
                }
                this.f97498c.postDelayed(this, 500);
            }
        }

        public final void onViewAttachedToWindow(View view) {
            this.f97500e = true;
            this.f97497b = false;
            run();
        }

        public final void onViewDetachedFromWindow(View view) {
            this.f97500e = false;
            this.f97497b = false;
            this.f97498c.removeCallbacks(this);
        }

        private View$OnAttachStateChangeListenerC41795b(View view, String str) {
            this.f97498c = view;
            this.f97499d = str;
        }

        /* renamed from: a */
        public static void m83748a(View view, String str) {
            View.OnAttachStateChangeListener bVar = new View$OnAttachStateChangeListenerC41795b(view, str);
            view.addOnAttachStateChangeListener(bVar);
            view.setTag(R.id.drd, bVar);
        }
    }

    /* renamed from: b */
    public final void mo70948b(String str) {
        int adapterPosition = getAdapterPosition();
        Challenge challenge = this.f97480e;
        if (challenge != null && this.f97484i == null) {
            C67568r F = mo70877F();
            if (F.f151306a) {
                View view = this.itemView;
                String str2 = F.f151311f;
                String cid = challenge.getCid();
                String a = C42467o.m84876a(this.f97482g);
                int i = this.f97487o;
                C42452d.m84858a(view, cid, adapterPosition);
                String a2 = C42452d.m84857a();
                C59253r rVar = (C59253r) new C59253r().mo96742b();
                rVar.f135340q = cid;
                rVar.f135341r = str;
                C42467o.m84878a(adapterPosition, str2, a2, ((C59253r) rVar.mo96827o(C42467o.m84875a(3)).mo96743b(String.valueOf(i)).mo96744c()).mo96828p(a2), 3, a);
                C42467o.m84882b(3, cid, str2);
                return;
            }
            View view2 = this.itemView;
            String str3 = F.f151311f;
            String requestId = challenge.getRequestId();
            String cid2 = challenge.getCid();
            String a3 = C42467o.m84876a(this.f97482g);
            String a4 = C42452d.m84857a();
            String cid3 = challenge.getCid();
            C42452d.m84858a(view2, cid2, adapterPosition);
            C59253r rVar2 = (C59253r) new C59253r().mo96742b();
            rVar2.f135340q = cid2;
            rVar2.f135341r = str;
            C42467o.m84878a(adapterPosition, str3, requestId, ((C59253r) rVar2.mo96827o(C42467o.m84875a(2)).mo96743b(String.valueOf(adapterPosition)).mo96744c()).mo96828p(requestId).mo96810l(a4).mo96804f(cid3), 2, a3);
            C42467o.m84882b(2, cid2, str3);
        }
    }

    /* renamed from: a */
    public static C41790w m83742a(ViewGroup viewGroup, String str) {
        View a = C67641m.m119786a(viewGroup, R.layout.aut);
        View$OnAttachStateChangeListenerC41795b.m83748a(a, str);
        return new C41790w(a, str);
    }

    private C41790w(final View view, String str) {
        super(view);
        this.f97476a = (TextView) view.findViewById(R.id.ete);
        this.f97477b = (TextView) view.findViewById(R.id.f0p);
        this.f97478c = (ViewStub) view.findViewById(R.id.drb);
        this.f97484i = null;
        this.f97490r = str;
        view.setOnClickListener(new View.OnClickListener() {
            /* class com.p2082ss.android.ugc.aweme.discover.adapter.C41790w.View$OnClickListenerC417911 */

            static {
                Covode.recordClassIndex(49706);
            }

            public final void onClick(View view) {
                String str;
                ClickAgent.onClick(view);
                if (!C58001a.m104815a(view, 1200)) {
                    CommerceChallengeServiceImpl.m75741e().mo65383a(C41790w.this.f97480e);
                    String uuid = UUID.randomUUID().toString();
                    C41790w.this.mo70948b(uuid);
                    SmartRoute withParam = SmartRouter.buildRoute(view.getContext(), "//challenge/detail").withParam("id", C41790w.this.f97480e.getCid()).withParam("enter_from", C41790w.this.f97483h).withParam("process_id", uuid);
                    if (CommerceChallengeServiceImpl.m75741e().mo65392b(C41790w.this.f97480e)) {
                        str = "1";
                    } else {
                        str = "0";
                    }
                    withParam.withParam("is_commerce", str).withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_CHALLENGE_TYPE", C41790w.this.f97480e.getSubType()).open();
                    if (C41790w.this.f97481f) {
                        ((C67496as) ((C67542d) C42317b.m84680b(C41790w.this.mo70877F()).mo106497x("hot_challenge")).mo106496w("1").mo106487g(C41790w.this.f97480e.getCid())).mo106440B("click_info").mo96786a("hashtags_name", C41790w.this.f97480e.getSearchChaName()).mo96792f();
                    } else {
                        ((C67496as) ((C67542d) C42317b.m84680b(C41790w.this.mo70877F()).mo106497x("tag")).mo106496w("0").mo106487g(C41790w.this.f97480e.getCid())).mo106439A("click_info").mo96786a("hashtags_name", C41790w.this.f97480e.getSearchChaName()).mo96792f();
                    }
                    if (C41790w.this.f97485m.booleanValue()) {
                        CommerceChallengeServiceImpl.m75741e().mo65391b(C41790w.this.f97486n, C41790w.this.f97480e.getSearchChaName());
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo70947a(SearchChallenge searchChallenge, String str) {
        MethodCollector.m26663i(8573);
        if (searchChallenge == null) {
            MethodCollector.m26664o(8573);
            return;
        }
        Challenge challenge = searchChallenge.getChallenge();
        if (challenge != null) {
            if (challenge.getHighlightInfoList() != null) {
                this.f97476a.setTypeface(C17300a.m32029a().mo27610a(C17303d.f41567a));
                this.f97476a.setTextColor(C0643b.m2378c(this.itemView.getContext(), R.color.c4));
                this.f97491s = new C42014f(new C42014f.AbstractC42017c() {
                    /* class com.p2082ss.android.ugc.aweme.discover.adapter.C41790w.C417922 */

                    static {
                        Covode.recordClassIndex(49707);
                    }

                    @Override // com.p2082ss.android.ugc.aweme.discover.helper.C42014f.AbstractC42017c
                    /* renamed from: a */
                    public final List<C67361d> mo70843a() {
                        Challenge challenge = C41790w.this.f97480e;
                        if (challenge != null) {
                            return challenge.getHighlightInfoList();
                        }
                        return null;
                    }

                    @Override // com.p2082ss.android.ugc.aweme.discover.helper.C42014f.AbstractC42017c
                    /* renamed from: a */
                    public final List<Object> mo70844a(String str, String str2, Position position) {
                        if ("search_cha_name".equals(str2)) {
                            return new ArrayList<Object>() {
                                /* class com.p2082ss.android.ugc.aweme.discover.adapter.C41790w.C417922.C417931 */

                                static {
                                    Covode.recordClassIndex(49708);
                                }

                                {
                                    add(new C42292a(C17300a.m32029a().mo27610a(C17303d.f41573g)));
                                    add(new ForegroundColorSpan(C0643b.m2378c(C41790w.this.itemView.getContext(), R.color.bx)));
                                }
                            };
                        }
                        return null;
                    }
                });
            } else {
                this.f97476a.setTypeface(C17300a.m32029a().mo27610a(C17303d.f41573g));
                this.f97476a.setTextColor(C0643b.m2378c(this.itemView.getContext(), R.color.bx));
                this.f97491s = null;
            }
        }
        this.f97482g = str;
        if (searchChallenge.getChallenge() != null) {
            this.f97480e = searchChallenge.getChallenge();
        }
        this.f97477b.setText(this.itemView.getContext().getString(R.string.aac, C53437b.m98615a(this.f97480e.getDisplayCount())));
        SpannableString a = C34715b.m70904a(this.f97476a.getContext(), this.f97480e.getSearchChaName(), searchChallenge.getPosition());
        C42014f fVar = this.f97491s;
        if (fVar != null) {
            fVar.mo71199a(a, "search_cha_name", 0);
        }
        UrlModel a2 = CommerceChallengeServiceImpl.m75741e().mo65376a(this.f97480e.getSearchChaName(), this.f97480e.isCommerce(), false);
        if (a2 != null) {
            this.f97485m = true;
            this.f97486n = "search_hashtag";
            if (this.f97481f) {
                this.f97486n = "search_hashtag_top";
            }
            CommerceChallengeServiceImpl.m75741e().mo65388a(this.f97476a.getContext(), this.f97480e.getSearchChaName(), a2, a, this.f97476a, this.f97486n);
        } else {
            this.f97485m = false;
            this.f97476a.setText(a);
        }
        View view = this.itemView;
        C38228an adData = searchChallenge.getAdData();
        Object tag = view.getTag(R.id.drd);
        if (tag instanceof View$OnAttachStateChangeListenerC41795b) {
            View$OnAttachStateChangeListenerC41795b bVar = (View$OnAttachStateChangeListenerC41795b) tag;
            if (bVar.f97496a != adData) {
                if (adData == null) {
                    bVar.f97496a = null;
                } else {
                    bVar.f97496a = adData;
                    bVar.f97497b = false;
                    bVar.run();
                }
            }
        }
        if (searchChallenge.hasAwemeList()) {
            if (this.f97489q == null) {
                this.f97478c.setLayoutInflater(new C67591a(this.f97478c.getContext()));
                this.f97489q = (ViewGroup) this.f97478c.inflate();
                this.f97488p = new C41827d(this.f97489q);
            }
            if (this.f97489q != null) {
                if (this.f97479d == null) {
                    this.f97479d = new C41828e(this.f97488p);
                }
                this.f97479d.mo70984a(mo70877F());
                this.f97479d.f97570c = new C41796x(this);
                C41828e eVar = this.f97479d;
                C89219l.m154721d(searchChallenge, "");
                eVar.f97568a = searchChallenge;
                SearchChallenge searchChallenge2 = eVar.f97568a;
                if (searchChallenge2 == null) {
                    C89219l.m154715b();
                }
                List<Aweme> awemes = searchChallenge2.getAwemes();
                C89219l.m154716b(awemes, "");
                eVar.mo70973a(awemes);
                this.f97479d.f97569b = new C41797y(this);
                ViewGroup viewGroup = this.f97489q;
                if (viewGroup != null) {
                    viewGroup.setVisibility(0);
                    this.f97489q.setPadding(0, (int) C13628n.m24520b(mo70878G(), 4.0f), 0, 0);
                }
                HashMap hashMap = new HashMap();
                hashMap.put("token_type", "hot_challenge");
                if (searchChallenge.getChallenge() != null) {
                    hashMap.put("search_result_id", searchChallenge.getChallenge().getCid());
                    hashMap.put("hashtags_name", searchChallenge.getChallenge().getSearchChaName());
                    hashMap.put("rank", String.valueOf(getAdapterPosition()));
                    ((C67542d) C42317b.m84679a(mo70877F()).mo106497x("hot_challenge")).mo106496w("1").mo106487g(searchChallenge.getChallenge().getCid()).mo96786a("hashtags_name", searchChallenge.getChallenge().getSearchChaName()).mo96792f();
                }
                this.f97481f = true;
                MethodCollector.m26664o(8573);
                return;
            }
        } else {
            ViewGroup viewGroup2 = this.f97489q;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(8);
            }
            if (searchChallenge.getChallenge() != null) {
                ((C67542d) C42317b.m84679a(mo70877F()).mo106497x("tag")).mo106496w("0").mo106487g(searchChallenge.getChallenge().getCid()).mo106479a(Integer.valueOf(getAdapterPosition())).mo96786a("hashtags_name", searchChallenge.getChallenge().getSearchChaName()).mo96792f();
            }
        }
        MethodCollector.m26664o(8573);
    }
}
