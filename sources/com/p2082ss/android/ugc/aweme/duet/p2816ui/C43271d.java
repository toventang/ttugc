package com.p2082ss.android.ugc.aweme.duet.p2816ui;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.AbstractC0974l;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.p1710c.C23005c;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.tux.status.TuxStatusView;
import com.p2082ss.android.ugc.aweme.IDuetDownloadService;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.challenge.p2454ui.AbstractC35600b;
import com.p2082ss.android.ugc.aweme.detail.AbstractC41102a;
import com.p2082ss.android.ugc.aweme.detail.p2742a.C41104b;
import com.p2082ss.android.ugc.aweme.duet.p2814a.C43256c;
import com.p2082ss.android.ugc.aweme.duet.p2815b.C43258a;
import com.p2082ss.android.ugc.aweme.duet.p2816ui.C43266a;
import com.p2082ss.android.ugc.aweme.duet.p2816ui.C43286f;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.p3043g.p3044a.AbstractC52856g;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.C64117cn;
import com.p2082ss.android.ugc.aweme.shortvideo.DuetDownloadService;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4166g.C79440a;
import com.p2082ss.android.ugc.aweme.views.AutoRTLImageView;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.duet.ui.d */
public final class C43271d extends AbstractC35600b implements AbstractC43296h {

    /* renamed from: l */
    public static final C43272a f101017l = new C43272a((byte) 0);

    /* renamed from: N */
    private final AbstractC89244h f101018N = C89250i.m154773a((AbstractC89171a) new C43276d(this));

    /* renamed from: O */
    private final AbstractC89244h f101019O = C89250i.m154773a((AbstractC89171a) new C43278f(this));

    /* renamed from: P */
    private SparseArray f101020P;

    /* renamed from: d */
    public String f101021d;

    /* renamed from: e */
    public String f101022e;

    /* renamed from: j */
    public String f101023j;

    /* renamed from: k */
    public C43266a f101024k;

    /* renamed from: m */
    private String f101025m;

    /* renamed from: n */
    private String f101026n;

    /* renamed from: o */
    private C43258a f101027o;

    /* renamed from: p */
    private final AbstractC89244h f101028p = C89250i.m154773a((AbstractC89171a) new C43273b(this));

    /* renamed from: q */
    private float f101029q;

    /* renamed from: r */
    private float f101030r;

    /* renamed from: s */
    private boolean f101031s;

    /* renamed from: t */
    private final AbstractC89244h f101032t = C89250i.m154773a((AbstractC89171a) new C43277e(this));

    /* renamed from: u */
    private final AbstractC89244h f101033u = C89250i.m154773a((AbstractC89171a) new C43283k(this));

    static {
        Covode.recordClassIndex(51476);
    }

    /* renamed from: c */
    private final AbstractC43284e m86376c() {
        return (AbstractC43284e) this.f101028p.getValue();
    }

    /* renamed from: d */
    private final View m86377d() {
        return (View) this.f101032t.getValue();
    }

    /* renamed from: e */
    private final TextView m86378e() {
        return (TextView) this.f101033u.getValue();
    }

    /* renamed from: g */
    private final TuxStatusView m86379g() {
        return (TuxStatusView) this.f101019O.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.p2082ss.android.ugc.aweme.detail.AbstractC41102a
    /* renamed from: H */
    public final boolean mo61043H() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.AbstractC41102a
    /* renamed from: a */
    public final String mo62627a(int i) {
        return "duet_page";
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.AbstractC41102a
    /* renamed from: h */
    public final int mo62639h() {
        return R.layout.b39;
    }

    /* renamed from: com.ss.android.ugc.aweme.duet.ui.d$a */
    public static final class C43272a {
        static {
            Covode.recordClassIndex(51477);
        }

        private C43272a() {
        }

        public /* synthetic */ C43272a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.AbstractC41102a
    /* renamed from: i */
    public final String mo62640i() {
        String str = this.f101021d;
        if (str == null) {
            return "";
        }
        return str;
    }

    /* renamed from: com.ss.android.ugc.aweme.duet.ui.d$d */
    static final class C43276d extends AbstractC89220m implements AbstractC89171a<View> {

        /* renamed from: a */
        final /* synthetic */ C43271d f101037a;

        static {
            Covode.recordClassIndex(51481);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43276d(C43271d dVar) {
            super(0);
            this.f101037a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ View invoke() {
            return this.f101037a.requireActivity().findViewById(R.id.bdv);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.duet.ui.d$e */
    static final class C43277e extends AbstractC89220m implements AbstractC89171a<View> {

        /* renamed from: a */
        final /* synthetic */ C43271d f101038a;

        static {
            Covode.recordClassIndex(51482);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43277e(C43271d dVar) {
            super(0);
            this.f101038a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ View invoke() {
            return this.f101038a.requireActivity().findViewById(R.id.e6q);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.duet.ui.d$f */
    static final class C43278f extends AbstractC89220m implements AbstractC89171a<TuxStatusView> {

        /* renamed from: a */
        final /* synthetic */ C43271d f101039a;

        static {
            Covode.recordClassIndex(51483);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43278f(C43271d dVar) {
            super(0);
            this.f101039a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxStatusView invoke() {
            return this.f101039a.requireActivity().findViewById(R.id.e7i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.duet.ui.d$k */
    static final class C43283k extends AbstractC89220m implements AbstractC89171a<TextView> {

        /* renamed from: a */
        final /* synthetic */ C43271d f101044a;

        static {
            Covode.recordClassIndex(51488);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43283k(C43271d dVar) {
            super(0);
            this.f101044a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TextView invoke() {
            return this.f101044a.requireActivity().findViewById(R.id.aq6);
        }
    }

    /* renamed from: j */
    private static boolean m86380j() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, com.p2082ss.android.ugc.aweme.detail.AbstractC41102a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f101020P;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.duet.ui.d$b */
    static final class C43273b extends AbstractC89220m implements AbstractC89171a<AbstractC43284e> {

        /* renamed from: a */
        final /* synthetic */ C43271d f101034a;

        static {
            Covode.recordClassIndex(51478);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43273b(C43271d dVar) {
            super(0);
            this.f101034a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC43284e invoke() {
            ActivityC0945e requireActivity = this.f101034a.requireActivity();
            C89219l.m154716b(requireActivity, "");
            C432741 r1 = new AbstractC89171a<String>(this) {
                /* class com.p2082ss.android.ugc.aweme.duet.p2816ui.C43271d.C43273b.C432741 */

                /* renamed from: a */
                final /* synthetic */ C43273b f101035a;

                static {
                    Covode.recordClassIndex(51479);
                }

                {
                    this.f101035a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ String invoke() {
                    String str = this.f101035a.f101034a.f101023j;
                    if (str == null) {
                        C89219l.m154715b();
                    }
                    return str;
                }
            };
            C89219l.m154721d(requireActivity, "");
            C89219l.m154721d(r1, "");
            return new C43286f(requireActivity, r1);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.duet.ui.d$g */
    static final class C43279g extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C43271d f101040a;

        static {
            Covode.recordClassIndex(51484);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43279g(C43271d dVar) {
            super(0);
            this.f101040a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f101040a.mo73792b();
            C43271d.m86375a(this.f101040a).mo62677j();
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.duet.ui.d$j */
    public static final class C43282j extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C43271d f101043a;

        static {
            Covode.recordClassIndex(51487);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43282j(C43271d dVar) {
            super(0);
            this.f101043a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f101043a.mo73792b();
            C43271d.m86375a(this.f101043a).mo62677j();
            return C89391z.f203057a;
        }
    }

    /* renamed from: m */
    private static boolean m86381m() {
        if (C58029j.f132253e && C58029j.m104846b() && !C58029j.m104847c()) {
            return C58029j.f132253e;
        }
        boolean j = m86380j();
        C58029j.f132253e = j;
        return j;
    }

    /* renamed from: b */
    public final void mo73792b() {
        m86379g().setVisibility(0);
        getContext();
        if (!m86381m()) {
            new C23144b(this).mo37640e(R.string.dcq).mo37637b();
            m86379g().setStatus(C79440a.m138169a(new TuxStatusView.C23263c(), new C43282j(this)));
            return;
        }
        m86379g().mo37867a();
        C43258a aVar = this.f101027o;
        if (aVar == null) {
            C89219l.m154710a("detailPresenter");
        }
        aVar.mo57616a(this.f101023j);
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.AbstractC41102a
    /* renamed from: l */
    public final AbstractC0974l mo62643l() {
        String str;
        this.f96076I = new ArrayList();
        this.f96077J = new ArrayList();
        this.f83959a = new ArrayList();
        boolean z = false;
        Fragment a = getChildFragmentManager().mo3551a(AbstractC41102a.f96067v + 0);
        boolean z2 = a instanceof C43266a;
        C43266a aVar = a;
        if (!z2) {
            String str2 = this.f101023j;
            if (str2 == null) {
                C89219l.m154715b();
            }
            String str3 = this.f101021d;
            String str4 = this.f101023j;
            if (str4 == null) {
                C89219l.m154715b();
            }
            C43269b bVar = new C43269b(str4);
            C89219l.m154721d("duet_page", "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d("", "");
            C89219l.m154721d("duet_page", "");
            C89219l.m154721d(bVar, "");
            C43266a aVar2 = new C43266a();
            Bundle bundle = new Bundle();
            bundle.putInt(C43266a.f101007I, 24);
            bundle.putString(C43266a.f101008J, "duet_page");
            bundle.putString(C43266a.f101009K, str2);
            String[] strArr = new String[2];
            strArr[0] = C43266a.C43267a.m86373a(str2);
            if (str3 != null) {
                str = C43266a.C43267a.m86373a(str3);
            } else {
                str = null;
            }
            strArr[1] = str;
            bundle.putString("top_aweme_ids", C89070n.m154551a(C89070n.m154522b(strArr), ", ", "[", "]", 0, (CharSequence) null, (AbstractC89172b) null, 56));
            bundle.putBoolean("extra_challenge_is_hashtag", false);
            bundle.putString("extra_challenge_hashtag_name", "");
            bundle.putString(C43266a.f101010L, "duet_page");
            aVar2.setArguments(bundle);
            aVar2.f84111G = bVar;
            C43266a aVar3 = aVar2;
            if (this.f96074G == 0) {
                z = true;
            }
            aVar3.f84141z = z;
            aVar3.f84105A = true;
            aVar = aVar2;
        }
        Objects.requireNonNull(aVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.duet.ui.DuetAwemeListFragment");
        this.f101024k = (C43266a) aVar;
        List list = this.f96076I;
        C43266a aVar4 = this.f101024k;
        if (aVar4 == null) {
            C89219l.m154710a("mListFragment");
        }
        list.add(aVar4);
        List list2 = this.f96077J;
        C43266a aVar5 = this.f101024k;
        if (aVar5 == null) {
            C89219l.m154710a("mListFragment");
        }
        list2.add(aVar5);
        this.f83959a.add(20);
        return new C64117cn(getChildFragmentManager(), this.f96077J, this.f83959a);
    }

    /* renamed from: com.ss.android.ugc.aweme.duet.ui.d$i */
    static final class View$OnClickListenerC43281i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C43271d f101042a;

        static {
            Covode.recordClassIndex(51486);
        }

        View$OnClickListenerC43281i(C43271d dVar) {
            this.f101042a = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            ActivityC0945e activity = this.f101042a.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C43266a m86375a(C43271d dVar) {
        C43266a aVar = dVar.f101024k;
        if (aVar == null) {
            C89219l.m154710a("mListFragment");
        }
        return aVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.duet.ui.d$h */
    static final class C43280h extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        public static final C43280h f101041a = new C43280h();

        static {
            Covode.recordClassIndex(51485);
        }

        C43280h() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f54431a = R.raw.icon_large_no_video;
            aVar2.f54435e = Integer.valueOf((int) R.attr.bd);
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.AbstractC41102a
    /* renamed from: a */
    public final AbstractC52856g mo70349a(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        Context requireContext = requireContext();
        C89219l.m154716b(requireContext, "");
        return new C41104b(requireContext, viewGroup);
    }

    /* renamed from: com.ss.android.ugc.aweme.duet.ui.d$c */
    static final class View$OnClickListenerC43275c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C43271d f101036a;

        static {
            Covode.recordClassIndex(51480);
        }

        View$OnClickListenerC43275c(C43271d dVar) {
            this.f101036a = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            Map<String, String> a = C89041ag.m154421a(C89387v.m154943a("group_id", this.f101036a.f101021d), C89387v.m154943a("author_id", this.f101036a.f101022e), C89387v.m154943a("enter_from", "duet_page"));
            IDuetDownloadService a2 = DuetDownloadService.m123152a();
            String str = this.f101036a.f101023j;
            if (str == null) {
                C89219l.m154715b();
            }
            ActivityC0945e requireActivity = this.f101036a.requireActivity();
            C89219l.m154716b(requireActivity, "");
            a2.mo57215a(str, requireActivity, "duet_page", a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.AbstractC41102a
    /* renamed from: a */
    public final void mo62630a(Bundle bundle) {
        String str;
        String str2;
        String str3;
        String string;
        String str4 = "";
        if (bundle == null || (str = bundle.getString("enter_method")) == null) {
            str = str4;
        }
        this.f101025m = str;
        if (bundle == null || (str2 = bundle.getString("enter_from")) == null) {
            str2 = str4;
        }
        this.f101026n = str2;
        String str5 = null;
        if (bundle != null) {
            str3 = bundle.getString("id");
        } else {
            str3 = null;
        }
        this.f101021d = str3;
        if (bundle != null) {
            str5 = bundle.getString("author_id");
        }
        this.f101022e = str5;
        if (!(bundle == null || (string = bundle.getString("origin_item_id")) == null)) {
            str4 = string;
        }
        this.f101023j = str4;
    }

    @Override // com.p2082ss.android.ugc.aweme.duet.p2816ui.AbstractC43296h
    /* renamed from: a */
    public final void mo73790a(C43256c cVar) {
        C89219l.m154721d(cVar, "");
        if (af_()) {
            if (cVar.f100987c == null || TextUtils.isEmpty(cVar.f100987c.getUri())) {
                m86379g().setVisibility(0);
                TuxStatusView.C23263c a = new TuxStatusView.C23263c().mo37877a(C23005c.m43393a(C43280h.f101041a));
                String string = getString(R.string.h8k);
                C89219l.m154716b(string, "");
                m86379g().setStatus(a.mo37878a((CharSequence) string));
                return;
            }
            this.f101031s = true;
            m86379g().setVisibility(8);
            m86376c().mo73796a(cVar);
            C43286f.EnumC43287a a2 = C43286f.EnumC43287a.C43288a.m86397a(cVar.f100989e);
            if (a2 == null) {
                return;
            }
            if (a2 == C43286f.EnumC43287a.REMIND_DUET_NOT_ALLOWED || a2 == C43286f.EnumC43287a.REMIND_SOUND_NOT_READY) {
                m86377d().setVisibility(8);
                cb_();
                return;
            }
            m86377d().setVisibility(0);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.duet.p2816ui.AbstractC43296h
    /* renamed from: a */
    public final void mo73791a(Exception exc) {
        C89219l.m154721d(exc, "");
        if (af_()) {
            new C23144b(this).mo37640e(R.string.dcq).mo37637b();
            if (this.f101031s) {
                m86379g().setVisibility(8);
                return;
            }
            m86379g().setVisibility(0);
            m86379g().setStatus(C79440a.m138169a(new TuxStatusView.C23263c(), new C43279g(this)));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.challenge.p2454ui.AbstractC35600b, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, com.p2082ss.android.ugc.aweme.detail.AbstractC41102a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        m86376c().mo73795a(view);
        super.onViewCreated(view, bundle);
        m86377d().setOnClickListener(new View$OnClickListenerC43275c(this));
        C43258a aVar = new C43258a();
        this.f101027o = aVar;
        aVar.mo67839a_(this);
        if (this.f101020P == null) {
            this.f101020P = new SparseArray();
        }
        View view2 = (View) this.f101020P.get(R.id.pi);
        if (view2 == null) {
            View view3 = getView();
            if (view3 == null) {
                view2 = null;
            } else {
                view2 = view3.findViewById(R.id.pi);
                this.f101020P.put(R.id.pi, view2);
            }
        }
        ((AutoRTLImageView) view2).setOnClickListener(new View$OnClickListenerC43281i(this));
        mo73792b();
    }

    @Override // com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout.AbstractC39210b, com.p2082ss.android.ugc.aweme.detail.AbstractC41102a
    /* renamed from: b */
    public final void mo62635b(int i, int i2) {
        super.mo62635b(i, i2);
        float f = 0.0f;
        if (this.f101029q == 0.0f && m86378e().getVisibility() == 0) {
            int bottom = m86378e().getBottom();
            View view = this.f96068A;
            C89219l.m154716b(view, "");
            this.f101029q = (float) (bottom - view.getBottom());
        }
        if (this.f101030r == 0.0f) {
            int bottom2 = ((View) this.f101018N.getValue()).getBottom();
            View view2 = this.f96068A;
            C89219l.m154716b(view2, "");
            this.f101030r = (float) (bottom2 - view2.getBottom());
        }
        float f2 = this.f101029q;
        float f3 = (((float) i) - f2) / (this.f101030r - f2);
        if (((double) f3) > 0.2d) {
            f = f3;
            if (f > 1.0f) {
                f = 1.0f;
            }
        }
        View view3 = this.f96068A;
        C89219l.m154716b(view3, "");
        view3.setAlpha(f);
    }
}
