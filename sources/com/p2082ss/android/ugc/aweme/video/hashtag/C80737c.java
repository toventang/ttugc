package com.p2082ss.android.ugc.aweme.video.hashtag;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.C39163s;
import com.p2082ss.android.ugc.aweme.common.LogPbBean;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.i18n.C53437b;
import com.p2082ss.android.ugc.aweme.internal.AVCommerceServiceImpl;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p2082ss.android.ugc.aweme.shortvideo.eventtrack.HashTagMobHelper;
import com.p2082ss.android.ugc.aweme.shortvideo.model.RecommendWordMob;
import com.p2082ss.android.ugc.aweme.shortvideo.view.C74158q;
import com.p2082ss.android.ugc.aweme.shortvideo.view.C74160s;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.video.hashtag.c */
public final class C80737c extends RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> {

    /* renamed from: a */
    public boolean f180517a;

    /* renamed from: b */
    public String f180518b;

    /* renamed from: c */
    public LogPbBean f180519c;

    /* renamed from: d */
    private List<C80735b> f180520d;

    /* renamed from: e */
    private Context f180521e;

    /* renamed from: f */
    private AbstractC80743d f180522f;

    /* renamed from: g */
    private HashTagMobHelper f180523g;

    static {
        Covode.recordClassIndex(94025);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m139995a(this, viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f180520d.size();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.video.hashtag.c$b */
    public static class C80742b extends C74160s<C74158q> {
        static {
            Covode.recordClassIndex(94030);
        }

        public C80742b(C74158q qVar) {
            super(qVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemViewType(int i) {
        return this.f180520d.get(i).f180511b;
    }

    /* renamed from: com.ss.android.ugc.aweme.video.hashtag.c$a */
    public static class C80741a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        TextView f180534a;

        /* renamed from: b */
        ImageView f180535b;

        /* renamed from: c */
        TextView f180536c;

        /* renamed from: d */
        LinearLayout f180537d;

        /* renamed from: e */
        ImageView f180538e;

        static {
            Covode.recordClassIndex(94029);
        }

        public C80741a(View view) {
            super(view);
            this.f180534a = (TextView) view.findViewById(R.id.bdh);
            this.f180535b = (ImageView) view.findViewById(R.id.bde);
            this.f180536c = (TextView) view.findViewById(R.id.bdg);
            this.f180537d = (LinearLayout) view.findViewById(R.id.acq);
            this.f180538e = (ImageView) view.findViewById(R.id.blu);
        }
    }

    /* renamed from: a */
    private void m139996a(C80735b bVar, int i) {
        HashTagMobHelper hashTagMobHelper = this.f180523g;
        if (hashTagMobHelper != null) {
            hashTagMobHelper.mo113480a(bVar, Integer.valueOf(i));
            if (TextUtils.equals(bVar.f180515f, "search")) {
                this.f180523g.mo113483b(bVar, Integer.valueOf(i));
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onBindViewHolder(final RecyclerView.ViewHolder viewHolder, final int i) {
        final C80735b bVar;
        int i2;
        if (i < 0 || i >= this.f180520d.size()) {
            bVar = null;
        } else {
            bVar = this.f180520d.get(i);
        }
        final String str = "";
        if ((viewHolder instanceof C80741a) && bVar != null) {
            String challengeName = bVar.f180510a.getChallengeName();
            if (challengeName == null) {
                challengeName = str;
            }
            if (!challengeName.startsWith("#")) {
                challengeName = "#".concat(String.valueOf(challengeName));
            }
            if (TextUtils.equals(bVar.f180515f, "search")) {
                str = "search_hashtag";
            } else if (TextUtils.equals(bVar.f180515f, "history")) {
                str = "history_hashtag";
            } else if (TextUtils.equals(bVar.f180515f, "recommendation")) {
                str = "thumb_up_hashtag";
            }
            C80741a aVar = (C80741a) viewHolder;
            final boolean a = AVCommerceServiceImpl.m102988h().mo93963a(this.f180521e, challengeName, aVar.f180534a, true, str);
            AVChallenge aVChallenge = bVar.f180510a;
            String str2 = this.f180518b;
            int i3 = 0;
            if (i != 0 || !aVChallenge.isNew(str2)) {
                String a2 = C53437b.m98615a(aVChallenge.getViewCount());
                aVar.f180536c.setText(aVar.f180536c.getResources().getQuantityString(R.plurals.cw, (int) aVChallenge.getViewCount(), a2));
                aVar.f180536c.setTextColor(aVar.f180536c.getResources().getColor(R.color.c5));
            } else {
                aVar.f180536c.setText(R.string.ffi);
                aVar.f180536c.setTextColor(aVar.f180536c.getResources().getColor(R.color.bi));
            }
            TextView textView = aVar.f180536c;
            if (!bVar.f180513d) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            textView.setVisibility(i2);
            aVar.f180538e.setVisibility(4);
            int i4 = bVar.f180512c;
            ImageView imageView = aVar.f180535b;
            if (!this.f180517a || i4 <= 0) {
                i3 = 8;
            }
            imageView.setVisibility(i3);
            if (i4 > 0) {
                aVar.f180535b.setImageResource(i4);
            }
            viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
                /* class com.p2082ss.android.ugc.aweme.video.hashtag.C80737c.View$OnClickListenerC807381 */

                static {
                    Covode.recordClassIndex(94026);
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    C80737c.this.mo123903a(bVar, i, a, str);
                }
            });
            if (bVar.f180514e != null) {
                bVar.f180514e.mo62517a(this.f180521e, i);
            }
            if (bVar.f180511b == 2) {
                aVar.f180537d.setOnTouchListener(new View.OnTouchListener() {
                    /* class com.p2082ss.android.ugc.aweme.video.hashtag.C80737c.View$OnTouchListenerC807392 */

                    static {
                        Covode.recordClassIndex(94027);
                    }

                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        if (motionEvent.getAction() == 0) {
                            ((C80741a) viewHolder).f180537d.setAlpha(0.5f);
                            return false;
                        } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                            return false;
                        } else {
                            ((C80741a) viewHolder).f180537d.setAlpha(1.0f);
                            return false;
                        }
                    }
                });
            }
            m139996a(bVar, i);
        } else if ((viewHolder instanceof C80742b) && bVar != null) {
            String challengeName2 = bVar.f180510a.getChallengeName();
            if (challengeName2 != null) {
                str = challengeName2;
            }
            if (!str.startsWith("#")) {
                str = "#".concat(String.valueOf(str));
            }
            C74160s sVar = (C74160s) viewHolder;
            ((C74158q) sVar.f166562a).setTagName(str);
            ((C74158q) sVar.f166562a).setOnClickListener(new View.OnClickListener() {
                /* class com.p2082ss.android.ugc.aweme.video.hashtag.C80737c.View$OnClickListenerC807403 */

                static {
                    Covode.recordClassIndex(94028);
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    C80737c.this.mo123903a(bVar, i, false, "");
                }
            });
            m139996a(bVar, i);
        }
    }

    public C80737c(Context context, List list, AbstractC80743d dVar) {
        if (context instanceof ActivityC0945e) {
            this.f180523g = (HashTagMobHelper) C1181ae.m3881a((ActivityC0945e) context, (C1175ad.AbstractC1177b) null).mo3983a(HashTagMobHelper.class);
        }
        this.f180520d = list;
        this.f180521e = context;
        this.f180522f = dVar;
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m139995a(C80737c cVar, ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder viewHolder;
        boolean a;
        MethodCollector.m26663i(9836);
        if (i == 2) {
            viewHolder = new C80741a(C1764a.m5927a(LayoutInflater.from(cVar.f180521e), R.layout.a_e, viewGroup, false));
        } else if (i != 3) {
            viewHolder = null;
        } else {
            viewHolder = new C80742b(new C74158q(cVar.f180521e));
        }
        try {
            if (viewHolder.itemView.getParent() != null) {
                try {
                    a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(viewHolder.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) viewHolder.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(viewHolder.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = viewHolder.getClass().getName();
        MethodCollector.m26664o(9836);
        return viewHolder;
    }

    /* renamed from: a */
    public final void mo123903a(C80735b bVar, int i, boolean z, String str) {
        String str2;
        if (z) {
            AVCommerceServiceImpl.m102988h().mo93961a(str, bVar.f180510a.challengeName);
        }
        AbstractC80743d dVar = this.f180522f;
        if (dVar != null) {
            dVar.mo110219a(bVar.f180510a);
        }
        if (bVar.f180514e != null) {
            bVar.f180514e.mo62518b(this.f180521e, i);
        }
        HashTagMobHelper hashTagMobHelper = this.f180523g;
        if (hashTagMobHelper != null) {
            String str3 = null;
            hashTagMobHelper.mo113482a("click_tag_button", bVar, Integer.valueOf(i), null);
            if (TextUtils.equals(bVar.f180515f, "search")) {
                HashTagMobHelper hashTagMobHelper2 = this.f180523g;
                Integer valueOf = Integer.valueOf(i);
                if (valueOf != null) {
                    valueOf.intValue();
                    String str4 = bVar.f180510a.cid;
                    C39163s a = new C39163s().mo67941a("words_content", bVar.f180510a.challengeName).mo67941a("words_position", String.valueOf(valueOf.intValue())).mo67941a("words_source", "sug").mo67941a("search_position", "challenge_create").mo67941a("raw_query", hashTagMobHelper2.f160962d).mo67941a("rank", "-1");
                    RecommendWordMob recommendWordMob = hashTagMobHelper2.f160961c;
                    if (recommendWordMob != null) {
                        str2 = recommendWordMob.getQueryId();
                    } else {
                        str2 = null;
                    }
                    C39163s a2 = a.mo67941a("query_id", str2).mo67941a("group_id", str4);
                    if (hashTagMobHelper2.f160960b != null && !bVar.f180516g) {
                        LogPbBean logPbBean = hashTagMobHelper2.f160960b;
                        if (logPbBean != null) {
                            str3 = logPbBean.getImprId();
                        }
                    } else {
                        str3 = "";
                    }
                    C39162r.m79461a("trending_words_click", a2.mo67941a("impr_id", str3).mo67942a());
                }
            }
        }
    }
}
