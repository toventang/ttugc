package com.p2082ss.android.ugc.aweme.mvtemplate.view;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.AbstractC0974l;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.tux.status.TuxStatusView;
import com.bytedance.tux.widget.spring.EnumC23427e;
import com.bytedance.tux.widget.spring.EnumC23429g;
import com.bytedance.tux.widget.spring.SpringLayout;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.challenge.p2454ui.AbstractC35600b;
import com.p2082ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.detail.AbstractC41102a;
import com.p2082ss.android.ugc.aweme.detail.C41247m;
import com.p2082ss.android.ugc.aweme.feed.C48027ac;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49672ag;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.mvtemplate.api.MovieDetailAPi;
import com.p2082ss.android.ugc.aweme.mvtemplate.impl.MovieReuseServiceImpl;
import com.p2082ss.android.ugc.aweme.mvtemplate.p3486a.C61248d;
import com.p2082ss.android.ugc.aweme.mvtemplate.p3486a.C61249e;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.p2406bu.p2407a.C34939a;
import com.p2082ss.android.ugc.aweme.p3043g.p3044a.AbstractC52856g;
import com.p2082ss.android.ugc.aweme.p4205v.p4206a.AbstractC80640c;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.C64117cn;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MvModel;
import com.p2082ss.android.ugc.aweme.tools.detail.IMovieReuseService;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4161b.C79365a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4166g.C79440a;
import com.p2082ss.android.ugc.aweme.views.AutoRTLImageView;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.mvtemplate.view.f */
public final class C61267f extends AbstractC35600b implements AbstractC61260a, AbstractC90252i, AbstractC90253j {

    /* renamed from: m */
    public static final C61268a f139138m = new C61268a((byte) 0);

    /* renamed from: N */
    private String f139139N;

    /* renamed from: O */
    private String f139140O;

    /* renamed from: P */
    private MvModel f139141P;

    /* renamed from: Q */
    private String f139142Q;

    /* renamed from: R */
    private String f139143R;

    /* renamed from: S */
    private boolean f139144S;

    /* renamed from: T */
    private final AbstractC89244h f139145T = C89250i.m154773a((AbstractC89171a) new C61269b(this));

    /* renamed from: U */
    private final AbstractC89244h f139146U = C89250i.m154773a((AbstractC89171a) new C61280m(this));

    /* renamed from: V */
    private boolean f139147V;

    /* renamed from: W */
    private SparseArray f139148W;

    /* renamed from: d */
    public String f139149d;

    /* renamed from: e */
    public Integer f139150e;

    /* renamed from: j */
    public C61263c f139151j;

    /* renamed from: k */
    public String f139152k;

    /* renamed from: l */
    public final LogPbBean f139153l = new LogPbBean();

    /* renamed from: n */
    private final AbstractC89244h f139154n = C89250i.m154773a((AbstractC89171a) new C61272e(this));

    /* renamed from: o */
    private final AbstractC89244h f139155o = C89250i.m154773a((AbstractC89171a) new C61279l(this));

    /* renamed from: p */
    private final AbstractC89244h f139156p = C89250i.m154773a((AbstractC89171a) new C61273f(this));

    /* renamed from: q */
    private final AbstractC89244h f139157q = C89250i.m154773a((AbstractC89171a) new C61271d(this));

    /* renamed from: r */
    private C34939a f139158r;

    /* renamed from: s */
    private float f139159s;

    /* renamed from: t */
    private float f139160t;

    /* renamed from: u */
    private String f139161u;

    static {
        Covode.recordClassIndex(71884);
    }

    /* renamed from: d */
    private final View m110921d() {
        return (View) this.f139154n.getValue();
    }

    /* renamed from: e */
    private final TextView m110922e() {
        return (TextView) this.f139155o.getValue();
    }

    /* renamed from: g */
    private final TuxStatusView m110923g() {
        return (TuxStatusView) this.f139156p.getValue();
    }

    /* renamed from: j */
    private final View m110924j() {
        return (View) this.f139157q.getValue();
    }

    /* renamed from: m */
    private final AbstractC80640c m110925m() {
        return (AbstractC80640c) this.f139145T.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.AbstractC41102a
    /* renamed from: a */
    public final String mo62627a(int i) {
        return "movie";
    }

    /* renamed from: b */
    public final View mo98793b(int i) {
        if (this.f139148W == null) {
            this.f139148W = new SparseArray();
        }
        View view = (View) this.f139148W.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f139148W.put(i, findViewById);
        return findViewById;
    }

    /* renamed from: b */
    public final AbstractC61281g mo98794b() {
        return (AbstractC61281g) this.f139146U.getValue();
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(2, new RunnableC90250g(C61267f.class, "onVideoEvent", C49672ag.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.AbstractC41102a
    /* renamed from: h */
    public final int mo62639h() {
        return R.layout.a16;
    }

    @AbstractC90264r
    public final void onVideoEvent(C49672ag agVar) {
        C89219l.m154721d(agVar, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.mvtemplate.view.f$a */
    public static final class C61268a {
        static {
            Covode.recordClassIndex(71885);
        }

        private C61268a() {
        }

        public /* synthetic */ C61268a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.AbstractC41102a
    /* renamed from: i */
    public final String mo62640i() {
        String str = this.f139149d;
        if (str == null) {
            return "";
        }
        return str;
    }

    /* renamed from: com.ss.android.ugc.aweme.mvtemplate.view.f$b */
    static final class C61269b extends AbstractC89220m implements AbstractC89171a<AbstractC80640c> {

        /* renamed from: a */
        final /* synthetic */ C61267f f139162a;

        static {
            Covode.recordClassIndex(71886);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C61269b(C61267f fVar) {
            super(0);
            this.f139162a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC80640c invoke() {
            return this.f139162a.mo98794b().mo98787a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mvtemplate.view.f$d */
    static final class C61271d extends AbstractC89220m implements AbstractC89171a<View> {

        /* renamed from: a */
        final /* synthetic */ C61267f f139164a;

        static {
            Covode.recordClassIndex(71888);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C61271d(C61267f fVar) {
            super(0);
            this.f139164a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ View invoke() {
            return this.f139164a.requireActivity().findViewById(R.id.bdv);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mvtemplate.view.f$e */
    static final class C61272e extends AbstractC89220m implements AbstractC89171a<View> {

        /* renamed from: a */
        final /* synthetic */ C61267f f139165a;

        static {
            Covode.recordClassIndex(71889);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C61272e(C61267f fVar) {
            super(0);
            this.f139165a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ View invoke() {
            return this.f139165a.requireActivity().findViewById(R.id.e6q);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mvtemplate.view.f$f */
    static final class C61273f extends AbstractC89220m implements AbstractC89171a<TuxStatusView> {

        /* renamed from: a */
        final /* synthetic */ C61267f f139166a;

        static {
            Covode.recordClassIndex(71890);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C61273f(C61267f fVar) {
            super(0);
            this.f139166a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxStatusView invoke() {
            return this.f139166a.mo98793b(R.id.e7i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mvtemplate.view.f$g */
    static final /* synthetic */ class C61274g extends C89217j implements AbstractC89171a<C89391z> {
        static {
            Covode.recordClassIndex(71891);
        }

        C61274g(C61267f fVar) {
            super(0, fVar, C61267f.class, "refresh", "refresh()V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            ((C61267f) this.receiver).mo98795c();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mvtemplate.view.f$h */
    static final /* synthetic */ class C61275h extends C89217j implements AbstractC89171a<C89391z> {
        static {
            Covode.recordClassIndex(71892);
        }

        C61275h(C61267f fVar) {
            super(0, fVar, C61267f.class, "refresh", "refresh()V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            ((C61267f) this.receiver).mo98795c();
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.mvtemplate.view.f$k */
    public static final /* synthetic */ class C61278k extends C89217j implements AbstractC89171a<C89391z> {
        static {
            Covode.recordClassIndex(71895);
        }

        C61278k(C61267f fVar) {
            super(0, fVar, C61267f.class, "refresh", "refresh()V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            ((C61267f) this.receiver).mo98795c();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mvtemplate.view.f$l */
    static final class C61279l extends AbstractC89220m implements AbstractC89171a<TextView> {

        /* renamed from: a */
        final /* synthetic */ C61267f f139169a;

        static {
            Covode.recordClassIndex(71896);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C61279l(C61267f fVar) {
            super(0);
            this.f139169a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TextView invoke() {
            return this.f139169a.requireActivity().findViewById(R.id.cmf);
        }
    }

    /* renamed from: q */
    private static boolean m110926q() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, com.p2082ss.android.ugc.aweme.detail.AbstractC41102a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f139148W;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mvtemplate.view.f$m */
    static final class C61280m extends AbstractC89220m implements AbstractC89171a<AbstractC61281g> {

        /* renamed from: a */
        final /* synthetic */ C61267f f139170a;

        static {
            Covode.recordClassIndex(71897);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C61280m(C61267f fVar) {
            super(0);
            this.f139170a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC61281g invoke() {
            Context requireContext = this.f139170a.requireContext();
            C89219l.m154716b(requireContext, "");
            String str = this.f139170a.f139149d;
            if (str == null) {
                str = "";
            }
            C89219l.m154721d(requireContext, "");
            C89219l.m154721d(str, "");
            return new C61261b(requireContext, str);
        }
    }

    /* renamed from: r */
    private static boolean m110927r() {
        if (C58029j.f132253e && C58029j.m104846b() && !C58029j.m104847c()) {
            return C58029j.f132253e;
        }
        boolean q = m110926q();
        C58029j.f132253e = q;
        return q;
    }

    /* renamed from: com.ss.android.ugc.aweme.mvtemplate.view.f$j */
    static final class C61277j extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C61267f f139168a;

        static {
            Covode.recordClassIndex(71894);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C61277j(C61267f fVar) {
            super(0);
            this.f139168a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            String str;
            this.f139168a.mo98795c();
            C61263c cVar = this.f139168a.f139151j;
            if (cVar == null) {
                C89219l.m154710a("mHotFragment");
            }
            cVar.mo62677j();
            C33744d dVar = new C33744d();
            Integer num = this.f139168a.f139150e;
            if (num != null && num.intValue() == 1) {
                str = "jianying_mv_page";
            } else {
                str = "mv_page";
            }
            C39162r.m79460a("refresh_page", dVar.mo59983a("enter_from", str).f79943a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: c */
    public final void mo98795c() {
        getContext();
        if (!m110927r()) {
            ((SpringLayout) mo98793b(R.id.e5k)).setRefreshing(false);
            new C23144b(this).mo37640e(R.string.dcq).mo37637b();
            if (!this.f139147V) {
                m110923g().setVisibility(0);
                m110923g().setStatus(C79440a.m138169a(new TuxStatusView.C23263c(), new C61278k(this)));
                return;
            }
            return;
        }
        if (!this.f139147V) {
            m110923g().setVisibility(0);
            m110923g().mo37867a();
        }
        C34939a aVar = this.f139158r;
        if (aVar != null) {
            Object[] objArr = new Object[6];
            objArr[0] = "";
            objArr[1] = this.f139149d;
            objArr[2] = this.f139150e;
            objArr[3] = null;
            objArr[4] = this.f139142Q;
            String str = this.f139143R;
            if (str == null) {
                C89219l.m154710a("cutSameSdkVersion");
            }
            objArr[5] = str;
            aVar.mo57616a(objArr);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.AbstractC41102a
    /* renamed from: l */
    public final AbstractC0974l mo62643l() {
        this.f96076I = new ArrayList();
        this.f96077J = new ArrayList();
        this.f83959a = new ArrayList();
        boolean z = false;
        Fragment a = getChildFragmentManager().mo3551a(AbstractC41102a.f96067v + 0);
        boolean z2 = a instanceof C61263c;
        C61263c cVar = a;
        if (!z2) {
            String str = this.f139149d;
            C61265d dVar = new C61265d();
            C89219l.m154721d("movie", "");
            C89219l.m154721d("", "");
            C89219l.m154721d("from_detail_activity", "");
            C89219l.m154721d(dVar, "");
            C61263c cVar2 = new C61263c();
            Bundle bundle = new Bundle();
            bundle.putInt(C61263c.f139129K, 20);
            bundle.putString(C61263c.f139130L, "movie");
            bundle.putString(C61263c.f139131M, str);
            bundle.putBoolean("extra_challenge_is_hashtag", false);
            bundle.putString("extra_challenge_hashtag_name", "");
            bundle.putString(C61263c.f139132N, "from_detail_activity");
            cVar2.setArguments(bundle);
            cVar2.f84111G = dVar;
            C61263c cVar3 = cVar2;
            if (this.f96074G == 0) {
                z = true;
            }
            cVar3.f84141z = z;
            cVar3.f84105A = true;
            cVar = cVar2;
        }
        Objects.requireNonNull(cVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.mvtemplate.view.MovieDetailAwemeListFragment");
        this.f139151j = (C61263c) cVar;
        List list = this.f96076I;
        C61263c cVar4 = this.f139151j;
        if (cVar4 == null) {
            C89219l.m154710a("mHotFragment");
        }
        list.add(cVar4);
        List list2 = this.f96077J;
        C61263c cVar5 = this.f139151j;
        if (cVar5 == null) {
            C89219l.m154710a("mHotFragment");
        }
        list2.add(cVar5);
        this.f83959a.add(20);
        return new C64117cn(getChildFragmentManager(), this.f96077J, this.f83959a);
    }

    /* renamed from: com.ss.android.ugc.aweme.mvtemplate.view.f$i */
    static final class View$OnClickListenerC61276i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C61267f f139167a;

        static {
            Covode.recordClassIndex(71893);
        }

        View$OnClickListenerC61276i(C61267f fVar) {
            this.f139167a = fVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            ActivityC0945e activity = this.f139167a.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.AbstractC41102a
    /* renamed from: a */
    public final AbstractC52856g mo70349a(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        return m110925m().mo70369a(viewGroup);
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.AbstractC41102a
    /* renamed from: a */
    public final void mo62630a(Bundle bundle) {
        String str;
        String str2;
        String str3;
        String str4;
        Integer num;
        if (bundle == null || (str = bundle.getString("mv_id")) == null) {
            str = "";
        }
        this.f139149d = str;
        this.f96075H = false;
        if (bundle == null || (str2 = bundle.getString("enter_method")) == null) {
            str2 = "";
        }
        this.f139161u = str2;
        if (bundle == null || (str3 = bundle.getString("enter_from")) == null) {
            str3 = "";
        }
        this.f139139N = str3;
        if (bundle == null || (str4 = bundle.getString("group_id")) == null) {
            str4 = "";
        }
        this.f139152k = str4;
        if (bundle != null) {
            num = Integer.valueOf(bundle.getInt(StringSet.type, 0));
        } else {
            num = null;
        }
        this.f139150e = num;
        this.f139142Q = null;
        String cutsameSdkVersion = AVExternalServiceImpl.m113114a().configService().shortVideoConfig().cutsameSdkVersion();
        C89219l.m154716b(cutsameSdkVersion, "");
        this.f139143R = cutsameSdkVersion;
    }

    /* renamed from: com.ss.android.ugc.aweme.mvtemplate.view.f$c */
    static final class View$OnClickListenerC61270c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C61267f f139163a;

        static {
            Covode.recordClassIndex(71887);
        }

        View$OnClickListenerC61270c(C61267f fVar) {
            this.f139163a = fVar;
        }

        public final void onClick(View view) {
            String str;
            String str2;
            String str3;
            ClickAgent.onClick(view);
            IMovieReuseService a = MovieReuseServiceImpl.m110905a();
            C61267f fVar = this.f139163a;
            String str4 = fVar.f139149d;
            Integer num = this.f139163a.f139150e;
            if (num != null) {
                num.intValue();
            }
            a.mo98783b(fVar, str4);
            C33744d dVar = new C33744d();
            Integer num2 = this.f139163a.f139150e;
            String str5 = "jianying_mv_page";
            if (num2 != null && num2.intValue() == 1) {
                str = str5;
            } else {
                str = "mv_page";
            }
            C33744d a2 = dVar.mo59983a("shoot_way", str);
            Integer num3 = this.f139163a.f139150e;
            if (num3 == null || num3.intValue() != 1) {
                str5 = "mv_page";
            }
            C33744d a3 = a2.mo59983a("enter_from", str5);
            Integer num4 = this.f139163a.f139150e;
            if (num4 != null && num4.intValue() == 1) {
                str2 = "click_jianying_mv_publish";
            } else {
                str2 = "click_mv_publish";
            }
            C33744d a4 = a3.mo59983a("enter_method", str2).mo59983a("mv_id", this.f139163a.f139149d).mo59983a("log_pb", C48027ac.C48028a.f111257a.mo80054a(this.f139163a.f139153l)).mo59983a("group_id", this.f139163a.f139152k);
            Integer num5 = this.f139163a.f139150e;
            if (num5 != null && num5.intValue() == 1) {
                str3 = "jianying_mv";
            } else {
                str3 = "mv";
            }
            C39162r.m79460a("shoot", a4.mo59983a("content_type", str3).mo59983a("content_source", "upload").f79943a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.mvtemplate.view.AbstractC61260a
    /* renamed from: a */
    public final void mo98786a(Exception exc) {
        C89219l.m154721d(exc, "");
        SpringLayout springLayout = (SpringLayout) mo98793b(R.id.e5k);
        if (springLayout != null) {
            springLayout.setRefreshing(false);
        }
        if (af_()) {
            new C23144b(this).mo37640e(R.string.dcq).mo37637b();
            if (this.f139147V) {
                m110923g().setVisibility(8);
                return;
            }
            m110923g().setVisibility(0);
            m110923g().setStatus(C79440a.m138169a(new TuxStatusView.C23263c(), new C61274g(this)));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.mvtemplate.view.AbstractC61260a
    /* renamed from: a */
    public final void mo98785a(C61248d dVar) {
        String str;
        String imprId;
        String extra;
        String str2;
        String str3 = "";
        C89219l.m154721d(dVar, str3);
        SpringLayout springLayout = (SpringLayout) mo98793b(R.id.e5k);
        if (springLayout != null) {
            springLayout.setRefreshing(false);
        }
        if (af_()) {
            if (dVar.f139078c == null && dVar.f139079d == null) {
                this.f139147V = false;
                new C23144b(this).mo37640e(R.string.dcq).mo37637b();
                m110923g().setVisibility(0);
                m110923g().setStatus(C79440a.m138169a(new TuxStatusView.C23263c(), new C61275h(this)));
                return;
            }
            this.f139141P = dVar.f139078c;
            String str4 = null;
            if (CommerceMediaServiceImpl.m77578f().mo66511a()) {
                try {
                    MvModel mvModel = this.f139141P;
                    if (mvModel == null || (extra = mvModel.getExtra()) == null || extra.length() == 0) {
                        m110921d().setVisibility(8);
                    } else {
                        MvModel mvModel2 = this.f139141P;
                        if (mvModel2 != null) {
                            str2 = mvModel2.getExtra();
                        } else {
                            str2 = null;
                        }
                        if (!new JSONObject(str2).optBoolean("is_commerce_music", false)) {
                            m110921d().setVisibility(8);
                        }
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
            C61263c cVar = this.f139151j;
            if (cVar == null) {
                C89219l.m154710a("mHotFragment");
            }
            cVar.f139134I = dVar.f139078c;
            C61263c cVar2 = this.f139151j;
            if (cVar2 == null) {
                C89219l.m154710a("mHotFragment");
            }
            cVar2.f139135J = this.f139152k;
            this.f139147V = true;
            m110923g().setVisibility(8);
            Integer num = this.f139150e;
            int i = MovieDetailAPi.f139096a;
            if (num != null && num.intValue() == i) {
                TextView textView = this.f96085z;
                C89219l.m154716b(textView, str3);
                C61249e eVar = dVar.f139079d;
                if (eVar != null) {
                    str4 = eVar.f139086e;
                }
                textView.setText(str4);
            } else {
                TextView textView2 = this.f96085z;
                C89219l.m154716b(textView2, str3);
                MvModel mvModel3 = dVar.f139078c;
                if (mvModel3 != null) {
                    str4 = mvModel3.getName();
                }
                textView2.setText(str4);
            }
            mo98794b().mo98789a(dVar);
            LogPbBean logPbBean = dVar.f139080e;
            if (!(logPbBean == null || (imprId = logPbBean.getImprId()) == null)) {
                str3 = imprId;
            }
            this.f139140O = str3;
            this.f139153l.setImprId(str3);
            C33744d a = new C33744d().mo59983a("enter_from", this.f139139N).mo59983a("log_pb", C48027ac.C48028a.f111257a.mo80054a(this.f139153l)).mo59983a("group_id", this.f139152k).mo59983a("mv_id", this.f139149d).mo59983a("enter_method", this.f139161u);
            Integer num2 = this.f139150e;
            if (num2 != null && num2.intValue() == 1) {
                str = "jianying_mv";
            } else {
                str = "mv";
            }
            C39162r.m79460a("enter_mv_detail", a.mo59983a("mv_type", str).f79943a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout.AbstractC39210b, com.p2082ss.android.ugc.aweme.detail.AbstractC41102a
    /* renamed from: a */
    public final void mo62628a(float f, float f2) {
        this.f139144S = C41247m.m83131a(f, f2, this.f139144S, this);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout.AbstractC39210b, com.p2082ss.android.ugc.aweme.detail.AbstractC41102a
    /* renamed from: b */
    public final void mo62635b(int i, int i2) {
        super.mo62635b(i, i2);
        float f = 0.0f;
        if (this.f139160t == 0.0f && m110922e().getVisibility() == 0) {
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            int a = C89241a.m154730a(TypedValue.applyDimension(1, 58.0f, system.getDisplayMetrics())) + m110922e().getBottom();
            View view = this.f96068A;
            C89219l.m154716b(view, "");
            this.f139160t = (float) (a - view.getBottom());
        }
        if (this.f139159s == 0.0f) {
            int bottom = m110924j().getBottom();
            View view2 = this.f96068A;
            C89219l.m154716b(view2, "");
            this.f139159s = (float) (bottom - view2.getBottom());
        }
        float f2 = (float) i;
        float f3 = this.f139160t;
        float f4 = (f2 - f3) / (this.f139159s - f3);
        if (((double) f4) > 0.2d) {
            f = f4;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        View view3 = this.f96068A;
        C89219l.m154716b(view3, "");
        view3.setAlpha(f);
        TextView textView = this.f96085z;
        C89219l.m154716b(textView, "");
        View j = m110924j();
        float f5 = this.f139159s;
        C89219l.m154721d(textView, "");
        C89219l.m154721d(j, "");
        textView.setAlpha(f);
        j.setAlpha(1.0f - (f2 / f5));
        this.f139144S = C41247m.m83132a(f, this.f139144S, this);
    }

    @Override // com.p2082ss.android.ugc.aweme.challenge.p2454ui.AbstractC35600b, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, com.p2082ss.android.ugc.aweme.detail.AbstractC41102a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        mo98794b().mo98788a(view);
        AbstractC80640c m = m110925m();
        View findViewById = view.findViewById(R.id.e6t);
        C89219l.m154716b(findViewById, "");
        m.mo70370a((RelativeLayout) findViewById);
        super.onViewCreated(view, bundle);
        if (TextUtils.isEmpty(this.f139149d)) {
            ActivityC0945e activity = getActivity();
            if (activity != null) {
                activity.finish();
                return;
            }
            return;
        }
        C34939a aVar = new C34939a();
        this.f139158r = aVar;
        aVar.mo67839a_(this);
        ((AutoRTLImageView) mo98793b(R.id.pi)).setOnClickListener(new View$OnClickListenerC61276i(this));
        if (m110921d().getVisibility() == 0) {
            m110921d().setOnClickListener(new View$OnClickListenerC61270c(this));
        }
        if (C79365a.m138152a()) {
            ((SpringLayout) mo98793b(R.id.e5k)).setOnRefreshListener(new C61277j(this));
        } else {
            ((SpringLayout) mo98793b(R.id.e5k)).setNestedHeader(null);
            ((SpringLayout) mo98793b(R.id.e5k)).setScrollMode(EnumC23429g.NONE);
            ((SpringLayout) mo98793b(R.id.e5k)).setOverScrollMode(EnumC23427e.NONE);
        }
        mo98795c();
    }
}
