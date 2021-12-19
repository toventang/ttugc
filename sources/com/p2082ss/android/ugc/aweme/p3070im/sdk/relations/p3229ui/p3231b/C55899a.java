package com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.p3231b;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1181ae;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.p3184b.C55196f;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.p3187a.p3188a.AbstractC55249a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.AbstractC55815d;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a.AbstractC55764d;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3220a.C55708a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.p3230a.AbstractC55867a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.view.C55913b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.view.View$OnTouchListenerC55918c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.viewmodel.C55939a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.viewmodel.RelationViewModel;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.p3238a.p3239a.C55968c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.p3241ui.view.C56036b;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.aweme.utils.C80398en;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89206ad;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.ui.b.a */
public final class C55899a extends AbstractC34586a implements View$OnTouchListenerC55918c.AbstractC55920b {

    /* renamed from: b */
    public static final C55900a f127435b = new C55900a((byte) 0);

    /* renamed from: a */
    public View$OnTouchListenerC55918c f127436a;

    /* renamed from: c */
    private View f127437c;

    /* renamed from: d */
    private SharePackage f127438d;

    /* renamed from: e */
    private boolean f127439e;

    /* renamed from: j */
    private LinkedHashSet<IMContact> f127440j;

    /* renamed from: k */
    private boolean f127441k;

    /* renamed from: l */
    private BaseContent f127442l;

    /* renamed from: m */
    private boolean f127443m;

    /* renamed from: n */
    private String f127444n = "";

    /* renamed from: o */
    private int f127445o = -1;

    /* renamed from: p */
    private RelationViewModel f127446p;

    /* renamed from: q */
    private HashMap f127447q;

    static {
        Covode.recordClassIndex(65690);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.ui.b.a$a */
    public static final class C55900a {
        static {
            Covode.recordClassIndex(65691);
        }

        private C55900a() {
        }

        public /* synthetic */ C55900a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.view.View$OnTouchListenerC55918c.AbstractC55920b
    /* renamed from: a */
    public final void mo92758a() {
        RelationViewModel relationViewModel = this.f127446p;
        if (relationViewModel != null) {
            relationViewModel.f127572c.mo92622h();
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f127447q;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        View$OnTouchListenerC55918c cVar = this.f127436a;
        if (cVar != null) {
            cVar.mo92803m();
        }
        View$OnTouchListenerC55918c cVar2 = this.f127436a;
        if (cVar2 != null) {
            cVar2.f127545r = null;
        }
        RelationViewModel relationViewModel = this.f127446p;
        if (relationViewModel != null) {
            relationViewModel.f127572c.mo92618d();
            relationViewModel.f127572c.mo92712m();
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        View$OnTouchListenerC55918c cVar = this.f127436a;
        if (cVar != null) {
            cVar.mo92797g();
        }
        RelationViewModel relationViewModel = this.f127446p;
        if (relationViewModel != null) {
            List<IMContact> e = relationViewModel.f127572c.mo92619e();
            relationViewModel.f127570a.setValue(new AbstractC55249a.C55253c(e));
            if (!e.isEmpty()) {
                Objects.requireNonNull(e, "null cannot be cast to non-null type kotlin.collections.MutableList<com.ss.android.ugc.aweme.im.service.model.IMContact>");
                relationViewModel.mo92512a(C89206ad.m154682d(e), relationViewModel.f127572c.mo92620f());
                return;
            }
            relationViewModel.f127572c.mo92621g();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.ui.b.a$c */
    static final class C55902c<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C55899a f127450a;

        static {
            Covode.recordClassIndex(65693);
        }

        C55902c(C55899a aVar) {
            this.f127450a = aVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            AbstractC55249a aVar = (AbstractC55249a) obj;
            if (aVar instanceof AbstractC55249a.C55253c) {
                return;
            }
            if (aVar instanceof AbstractC55249a.C55254d) {
                View$OnTouchListenerC55918c cVar = this.f127450a.f127436a;
                if (cVar != null) {
                    AbstractC55249a.C55254d dVar = (AbstractC55249a.C55254d) aVar;
                    cVar.mo92781a((List) dVar.f126348a.getFirst(), (CharSequence) dVar.f126348a.getSecond());
                }
            } else if (aVar instanceof AbstractC55249a.AbstractC55251b) {
                Object obj2 = ((AbstractC55249a.AbstractC55251b) aVar).f126345a;
                Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Throwable");
                C56244a.m102188a((Throwable) obj2);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.view.View$OnTouchListenerC55918c.AbstractC55920b
    /* renamed from: a */
    public final void mo92759a(String str) {
        C89219l.m154721d(str, "");
        RelationViewModel relationViewModel = this.f127446p;
        if (relationViewModel != null) {
            C89219l.m154721d(str, "");
            if (str.length() == 0) {
                relationViewModel.f127570a.setValue(new AbstractC55249a.C55254d(relationViewModel.f127572c.mo92619e()));
            } else {
                relationViewModel.f127572c.mo92711a(str.toString());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.ui.b.a$b */
    static final class C55901b<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ RelationViewModel f127448a;

        /* renamed from: b */
        final /* synthetic */ C55899a f127449b;

        static {
            Covode.recordClassIndex(65692);
        }

        C55901b(RelationViewModel relationViewModel, C55899a aVar) {
            this.f127448a = relationViewModel;
            this.f127449b = aVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            AbstractC55249a aVar = (AbstractC55249a) obj;
            if (aVar instanceof AbstractC55249a.C55253c) {
                View$OnTouchListenerC55918c cVar = this.f127449b.f127436a;
                if (cVar != null) {
                    cVar.mo92802l();
                }
            } else if (aVar instanceof AbstractC55249a.C55254d) {
                View$OnTouchListenerC55918c cVar2 = this.f127449b.f127436a;
                if (cVar2 != null) {
                    cVar2.mo92782a(this.f127448a.mo92813a(), this.f127448a.mo92814b());
                }
                View$OnTouchListenerC55918c cVar3 = this.f127449b.f127436a;
                if (cVar3 != null) {
                    cVar3.mo92780a((List<? extends IMContact>) ((AbstractC55249a.C55254d) aVar).f126348a);
                }
            } else if (aVar instanceof AbstractC55249a.AbstractC55251b) {
                Object obj2 = ((AbstractC55249a.AbstractC55251b) aVar).f126345a;
                Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Throwable");
                C56244a.m102188a((Throwable) obj2);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            SharePackage sharePackage = (SharePackage) arguments.getParcelable("share_package");
            this.f127438d = sharePackage;
            if (sharePackage != null) {
                C55708a.m101453a(C55708a.f127082a, this.f127438d, null, true, null, 0, null, null, 120);
                SharePackage sharePackage2 = this.f127438d;
                if (sharePackage2 == null) {
                    C89219l.m154715b();
                }
                String string = sharePackage2.f155492i.getString("author_user_name", "");
                C89219l.m154716b(string, "");
                this.f127444n = string;
                SharePackage sharePackage3 = this.f127438d;
                if (sharePackage3 == null) {
                    C89219l.m154715b();
                }
                this.f127445o = sharePackage3.f155492i.getInt("share_im_limit_tip_type", -1);
            }
            this.f127442l = (BaseContent) arguments.getSerializable("share_content");
            this.f127439e = arguments.getBoolean("key_relation_list_use_sort", false);
            BaseContent.wrapForward(this.f127442l, arguments.getLong("forward_origin_msgid"));
            this.f127441k = arguments.getBoolean("extra_no_title");
            this.f127440j = (LinkedHashSet) arguments.getSerializable("key_selected_contact");
        }
        boolean b = C80398en.m139371b();
        this.f127443m = b;
        SharePackage sharePackage4 = this.f127438d;
        boolean z = this.f127439e;
        C89219l.m154721d(this, "");
        AbstractC1174ac a = C1181ae.m3879a(this, new C55939a(sharePackage4, z, b)).mo3983a(RelationViewModel.class);
        C89219l.m154716b(a, "");
        RelationViewModel relationViewModel = (RelationViewModel) a;
        this.f127446p = relationViewModel;
        if (relationViewModel != null) {
            relationViewModel.f127572c.mo92615a((AbstractC55764d<IMContact>) relationViewModel);
            relationViewModel.f127572c.mo92710a((AbstractC55815d) relationViewModel);
        }
        RelationViewModel relationViewModel2 = this.f127446p;
        if (relationViewModel2 != null) {
            relationViewModel2.f127570a.observe(this, new C55901b(relationViewModel2, this));
            relationViewModel2.f127571b.observe(this, new C55902c(this));
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public final void onViewCreated(View view, Bundle bundle) {
        FrameLayout frameLayout;
        LinkedHashSet<IMContact> linkedHashSet;
        String str;
        String str2;
        Bundle bundle2;
        Bundle bundle3;
        Bundle bundle4;
        Bundle bundle5;
        View$OnTouchListenerC55918c cVar;
        List<Integer> list;
        List<String> list2;
        MethodCollector.m26663i(3580);
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        View view2 = this.f127437c;
        C56036b bVar = null;
        if (C55196f.m100911a(getActivity()) && view2 != null) {
            if (this.f127443m) {
                ActivityC0945e activity = getActivity();
                if (activity != null) {
                    boolean z = this.f127441k;
                    RelationViewModel relationViewModel = this.f127446p;
                    if (relationViewModel != null) {
                        list = relationViewModel.mo92813a();
                    } else {
                        list = null;
                    }
                    RelationViewModel relationViewModel2 = this.f127446p;
                    if (relationViewModel2 != null) {
                        list2 = relationViewModel2.mo92814b();
                    } else {
                        list2 = null;
                    }
                    cVar = new C55913b(activity, view2, z, list, list2);
                } else {
                    NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.app.Activity");
                    MethodCollector.m26664o(3580);
                    throw nullPointerException;
                }
            } else {
                ActivityC0945e activity2 = getActivity();
                if (activity2 != null) {
                    cVar = new View$OnTouchListenerC55918c(activity2, view2, this.f127441k);
                } else {
                    NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type android.app.Activity");
                    MethodCollector.m26664o(3580);
                    throw nullPointerException2;
                }
            }
            this.f127436a = cVar;
        }
        View$OnTouchListenerC55918c cVar2 = this.f127436a;
        if (cVar2 != null) {
            cVar2.f127545r = this;
        }
        View$OnTouchListenerC55918c cVar3 = this.f127436a;
        if (cVar3 != null) {
            cVar3.f127534g = this.f127438d;
            SharePackage sharePackage = cVar3.f127534g;
            if (sharePackage == null || (bundle5 = sharePackage.f155492i) == null) {
                str = null;
            } else {
                str = bundle5.getString("multi_share_msg");
            }
            cVar3.f127543p = str;
            SharePackage sharePackage2 = cVar3.f127534g;
            if (sharePackage2 == null || (bundle4 = sharePackage2.f155492i) == null || (str2 = bundle4.getString("aid", "")) == null) {
                str2 = "";
            }
            cVar3.f127544q = str2;
            SharePackage sharePackage3 = cVar3.f127534g;
            if (!(sharePackage3 == null || (bundle3 = sharePackage3.f155492i) == null)) {
                bundle3.remove("multi_share_msg");
            }
            SharePackage sharePackage4 = cVar3.f127534g;
            if (!(sharePackage4 == null || (bundle2 = sharePackage4.f155492i) == null)) {
                bundle2.remove("aid");
            }
            cVar3.mo92799i();
        }
        View$OnTouchListenerC55918c cVar4 = this.f127436a;
        if (cVar4 != null) {
            cVar4.f127535h = this.f127442l;
        }
        View$OnTouchListenerC55918c cVar5 = this.f127436a;
        if (!(cVar5 == null || (linkedHashSet = this.f127440j) == null)) {
            AbstractC55867a aVar = cVar5.f127542o;
            if (aVar != null) {
                aVar.f127346f = linkedHashSet;
            }
            cVar5.mo92800j();
            cVar5.mo92798h();
            cVar5.mo92797g();
        }
        if (this.f127445o > 0 && !TextUtils.isEmpty(this.f127444n)) {
            ActivityC0945e activity3 = getActivity();
            if (activity3 != null) {
                C89219l.m154716b(activity3, "");
                bVar = new C56036b(activity3, (byte) 0);
            }
            View view3 = this.f127437c;
            if (!(view3 == null || (frameLayout = (FrameLayout) view3.findViewById(R.id.dxy)) == null)) {
                frameLayout.addView(bVar);
            }
            C55968c cVar6 = new C55968c(this.f127444n, this.f127445o);
            if (bVar != null) {
                bVar.mo92889a(cVar6);
                MethodCollector.m26664o(3580);
                return;
            }
        }
        MethodCollector.m26664o(3580);
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a;
        C89219l.m154721d(layoutInflater, "");
        if (this.f127443m) {
            a = C1764a.m5927a(layoutInflater, R.layout.a4v, viewGroup, false);
        } else {
            a = C1764a.m5927a(layoutInflater, R.layout.a4u, viewGroup, false);
        }
        this.f127437c = a;
        return a;
    }
}
