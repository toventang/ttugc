package com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.layout;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.C48027ac;
import com.p2082ss.android.ugc.aweme.feed.helper.C49648o;
import com.p2082ss.android.ugc.aweme.feed.helper.C49653t;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.p2973a.AbstractC50367m;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.p2973a.C50358f;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.p2973a.C50359g;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.p2973a.C50361h;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.p2973a.C50366l;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.metrics.C59246k;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.layout.b */
public final class C50392b extends LinearLayout {

    /* renamed from: a */
    private TextView f116344a = ((TextView) findViewById(R.id.df2));

    /* renamed from: b */
    private SparseArray f116345b;

    static {
        Covode.recordClassIndex(59524);
    }

    /* renamed from: a */
    private View m94501a() {
        if (this.f116345b == null) {
            this.f116345b = new SparseArray();
        }
        View view = (View) this.f116345b.get(R.id.amy);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.amy);
        this.f116345b.put(R.id.amy, findViewById);
        return findViewById;
    }

    public C50392b(Context context) {
        super(context);
        MethodCollector.m26663i(4449);
        View.inflate(getContext(), R.layout.sf, this);
        int b = (int) C13628n.m24520b(getContext(), 16.0f);
        setPadding(b, 0, b, 0);
        setOrientation(1);
        setBackgroundResource(R.drawable.sk);
        MethodCollector.m26664o(4449);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.layout.b$a */
    public static final class View$OnClickListenerC50393a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC50367m f116346a;

        /* renamed from: b */
        final /* synthetic */ C50394c f116347b;

        static {
            Covode.recordClassIndex(59525);
        }

        View$OnClickListenerC50393a(AbstractC50367m mVar, C50394c cVar) {
            this.f116346a = mVar;
            this.f116347b = cVar;
        }

        public final void onClick(View view) {
            String str;
            String str2;
            ClickAgent.onClick(view);
            AbstractC50367m mVar = this.f116346a;
            if (mVar instanceof C50358f) {
                C50358f fVar = (C50358f) mVar;
                if (fVar != null) {
                    C89219l.m154716b(view, "");
                    C50394c cVar = this.f116347b;
                    C89219l.m154721d(view, "");
                    C89219l.m154721d(cVar, "");
                    C33744d a = new C33744d().mo59983a("enter_from", fVar.f116287a.f116265c);
                    Aweme aweme = fVar.f116287a.f116264b;
                    String str3 = null;
                    if (aweme != null) {
                        str = aweme.getAid();
                    } else {
                        str = null;
                    }
                    C33744d a2 = a.mo59983a("group_id", str);
                    Aweme aweme2 = fVar.f116287a.f116264b;
                    if (aweme2 != null) {
                        str2 = aweme2.getAuthorUid();
                    } else {
                        str2 = null;
                    }
                    C39162r.m79460a("block_videos", a2.mo59983a("author_id", str2).mo59983a("log_pb", C48027ac.C48028a.f111257a.mo80055a(C59208ac.m108763b(fVar.f116287a.f116264b))).mo59983a("reason_id", cVar.f116348a).mo59983a("reason_text", cVar.f116349b).mo59983a("music_id", C59208ac.m108770d(fVar.f116287a.f116264b)).mo59983a("enter_method", "long_press").mo59983a("click_method", "button").f79943a);
                    C59246k f = new C59246k().mo96814a(fVar.f116287a.f116265c).mo96749g(fVar.f116287a.f116264b);
                    f.f135235a = C59208ac.m108771e(fVar.f116287a.f116264b);
                    f.f135236b = C59208ac.m108758a(fVar.f116287a.f116264b);
                    f.f135237c = "long_press";
                    f.f135238d = C59208ac.m108763b(fVar.f116287a.f116264b);
                    f.mo96792f();
                    if (!TextUtils.isEmpty(fVar.f116287a.f116265c)) {
                        Aweme aweme3 = fVar.f116287a.f116264b;
                        if (aweme3 != null) {
                            str3 = aweme3.getAid();
                        }
                        if (!TextUtils.isEmpty(str3)) {
                            Aweme aweme4 = fVar.f116287a.f116264b;
                            if (aweme4 == null) {
                                C89219l.m154715b();
                            }
                            String aid = aweme4.getAid();
                            C89219l.m154716b(aid, "");
                            C49653t.m93096a(new C49648o(aid, 2, System.currentTimeMillis(), fVar.f116287a.f116265c));
                            Aweme aweme5 = fVar.f116287a.f116264b;
                            if (aweme5 == null) {
                                C89219l.m154715b();
                            }
                            String aid2 = aweme5.getAid();
                            C89219l.m154716b(aid2, "");
                            C49653t.m93096a(new C49648o(aid2, 3, System.currentTimeMillis(), fVar.f116287a.f116265c));
                        }
                    }
                    C50361h hVar = new C50361h();
                    hVar.mo67838a(new C50359g());
                    hVar.mo67839a_(fVar);
                    hVar.mo57616a(fVar.f116287a.f116264b, cVar.f116348a);
                    fVar.f116288b.dismiss();
                }
            } else if ((mVar instanceof C50366l) && mVar != null) {
                C89219l.m154716b(view, "");
                mVar.mo85531b(view);
            }
        }
    }

    /* renamed from: a */
    private void m94502a(C50394c cVar, AbstractC50367m mVar) {
        C89219l.m154721d(cVar, "");
        TextView textView = this.f116344a;
        if (textView != null) {
            String str = cVar.f116349b;
            if (str == null) {
                str = "";
            }
            textView.setText(str);
        }
        setOnClickListener(new View$OnClickListenerC50393a(mVar, cVar));
    }

    /* renamed from: a */
    public final void mo85561a(C50394c cVar, AbstractC50367m mVar, boolean z) {
        C89219l.m154721d(cVar, "");
        m94502a(cVar, mVar);
        if (z) {
            View a = m94501a();
            C89219l.m154716b(a, "");
            a.setVisibility(4);
            return;
        }
        View a2 = m94501a();
        C89219l.m154716b(a2, "");
        a2.setVisibility(0);
    }
}
