package com.p2082ss.android.ugc.aweme.kids.liked.p3361a;

import android.content.Context;
import android.view.View;
import androidx.core.app.C0576b;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.p1710c.C23005c;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.tux.status.TuxStatusView;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.kids.common.p3331ui.awemegrid.AbstractC57377c;
import com.p2082ss.android.ugc.aweme.kids.common.p3331ui.awemegrid.KidsAwemeGridViewModel;
import com.p2082ss.android.ugc.aweme.kids.liked.p3362b.C57734a;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4166g.C79440a;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.liked.a.b */
public final class C57724b extends AbstractC57377c {

    /* renamed from: j */
    public static final C57725a f131710j = new C57725a((byte) 0);

    /* renamed from: k */
    private HashMap f131711k;

    static {
        Covode.recordClassIndex(67701);
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.common.p3331ui.awemegrid.AbstractC57377c
    /* renamed from: a */
    public final void mo94637a() {
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.common.p3331ui.awemegrid.AbstractC57377c
    /* renamed from: b */
    public final boolean mo94639b() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.common.p3331ui.awemegrid.AbstractC57377c
    /* renamed from: c */
    public final String mo94640c() {
        return "like";
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.common.p3331ui.awemegrid.AbstractC57377c
    /* renamed from: m */
    public final void mo94646m() {
        HashMap hashMap = this.f131711k;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.common.p3331ui.awemegrid.AbstractC57377c, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo94646m();
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.liked.a.b$a */
    public static final class C57725a {
        static {
            Covode.recordClassIndex(67702);
        }

        private C57725a() {
        }

        public /* synthetic */ C57725a(byte b) {
            this();
        }
    }

    private C57724b() {
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.liked.a.b$c */
    static final /* synthetic */ class C57727c extends C89217j implements AbstractC89171a<C89391z> {
        static {
            Covode.recordClassIndex(67704);
        }

        C57727c(C57724b bVar) {
            super(0, bVar, C57724b.class, "tryRefreshList", "tryRefreshList()V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            ((C57724b) this.receiver).mo95043n();
            return C89391z.f203057a;
        }
    }

    /* renamed from: o */
    private static boolean m104434o() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: p */
    private static boolean m104435p() {
        if (C58029j.f132256h && C58029j.m104846b() && !C58029j.m104847c()) {
            return C58029j.f132256h;
        }
        boolean o = m104434o();
        C58029j.f132256h = o;
        return o;
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.common.p3331ui.awemegrid.AbstractC57377c
    /* renamed from: d */
    public final View mo94641d() {
        MethodCollector.m26663i(3753);
        Context context = getContext();
        if (context != null) {
            View view = new View(context);
            MethodCollector.m26664o(3753);
            return view;
        }
        MethodCollector.m26664o(3753);
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.common.p3331ui.awemegrid.AbstractC57377c
    /* renamed from: j */
    public final void mo94644j() {
        TuxStatusView tuxStatusView = this.f130786e;
        if (tuxStatusView != null) {
            tuxStatusView.setStatus(C79440a.m138171b(new TuxStatusView.C23263c(), new C57727c(this)));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.common.p3331ui.awemegrid.AbstractC57377c
    /* renamed from: g */
    public final void mo94643g() {
        TuxStatusView tuxStatusView = this.f130786e;
        if (tuxStatusView != null) {
            TuxStatusView.C23263c a = new TuxStatusView.C23263c().mo37877a(C23005c.m43393a(C57726b.f131712a));
            String string = getString(R.string.crp);
            C89219l.m154716b(string, "");
            TuxStatusView.C23263c a2 = a.mo37879a(string);
            String string2 = getString(R.string.cro);
            C89219l.m154716b(string2, "");
            tuxStatusView.setStatus(a2.mo37878a((CharSequence) string2));
        }
        TuxStatusView tuxStatusView2 = this.f130786e;
        if (tuxStatusView2 != null) {
            tuxStatusView2.setVisibility(0);
        }
    }

    /* renamed from: n */
    public final void mo95043n() {
        if (af_()) {
            getContext();
            if (!m104435p()) {
                new C23144b(this).mo37640e(R.string.dcq).mo37637b();
                mo94644j();
                return;
            }
            mo94642e();
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onResume() {
        C1213t<List<Aweme>> tVar;
        List<Aweme> value;
        KidsAwemeGridViewModel kidsAwemeGridViewModel;
        C1213t<List<Aweme>> tVar2;
        super.onResume();
        KidsAwemeGridViewModel kidsAwemeGridViewModel2 = this.f130784c;
        if (!(kidsAwemeGridViewModel2 == null || (tVar = kidsAwemeGridViewModel2.f130763a) == null || (value = tVar.getValue()) == null)) {
            List<Aweme> g = C89070n.m154585g((Collection) value);
            if (!g.isEmpty()) {
                boolean z = false;
                Iterator<Aweme> it = g.iterator();
                while (it.hasNext()) {
                    if (!it.next().isLike()) {
                        it.remove();
                        z = true;
                    }
                }
                if (!(!z || (kidsAwemeGridViewModel = this.f130784c) == null || (tVar2 = kidsAwemeGridViewModel.f130763a) == null)) {
                    tVar2.postValue(g);
                }
            }
        }
        getContext();
        if (!m104435p()) {
            new C23144b(this).mo37640e(R.string.dcq).mo37637b();
        }
    }

    public /* synthetic */ C57724b(byte b) {
        this();
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.liked.a.b$b */
    static final class C57726b extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        public static final C57726b f131712a = new C57726b();

        static {
            Covode.recordClassIndex(67703);
        }

        C57726b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f54431a = R.raw.icon_large_heart;
            aVar2.f54435e = Integer.valueOf((int) R.attr.bd);
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.common.p3331ui.awemegrid.AbstractC57377c
    /* renamed from: a */
    public final void mo94638a(View view, Aweme aweme) {
        List<Aweme> list;
        C1213t<List<Aweme>> tVar;
        if (!C58001a.m104815a(view, 1200)) {
            if (!(aweme == null || getActivity() == null)) {
                getContext();
                if (!m104435p()) {
                    new C23144b(this).mo37640e(R.string.dcq).mo37637b();
                    return;
                }
            }
            KidsAwemeGridViewModel kidsAwemeGridViewModel = this.f130784c;
            String str = null;
            if (kidsAwemeGridViewModel == null || (tVar = kidsAwemeGridViewModel.f130763a) == null || (list = tVar.getValue()) == null) {
                list = C89086z.INSTANCE;
            }
            C89219l.m154721d(list, "");
            C57734a.f131724a = new WeakReference<>(list);
            SmartRoute buildRoute = SmartRouter.buildRoute(getActivity(), "//kids/like/feed");
            if (aweme != null) {
                str = aweme.getAid();
            }
            SmartRoute withParam = buildRoute.withParam("current_id", str);
            if (view != null) {
                C0576b b = C0576b.m2193b(view, view.getWidth(), view.getHeight());
                C89219l.m154716b(b, "");
                withParam.withBundleAnimation(b.mo2564a());
            }
            withParam.open();
        }
    }
}
