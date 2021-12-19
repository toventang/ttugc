package com.p2082ss.android.ugc.aweme.view.p4230b;

import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.model.AbstractC60142d;
import com.p2082ss.android.ugc.aweme.model.AbstractC60154n;
import com.p2082ss.android.ugc.aweme.model.AbstractC60160s;
import com.p2082ss.android.ugc.aweme.model.AbstractC60162u;
import com.p2082ss.android.ugc.aweme.model.C60143e;
import com.p2082ss.android.ugc.aweme.model.C60145g;
import com.p2082ss.android.ugc.aweme.model.C60146h;
import com.p2082ss.android.ugc.aweme.model.C60148j;
import com.p2082ss.android.ugc.aweme.model.C60157q;
import com.p2082ss.android.ugc.aweme.model.C60159r;
import com.p2082ss.android.ugc.aweme.p2398bn.C34891a;
import com.p2082ss.android.ugc.aweme.view.p4229a.C81129f;
import com.p2082ss.android.ugc.aweme.viewModel.ProfileNaviEditorViewModel;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.view.b.a */
public final class C81152a extends AbstractC81172f implements C81129f.AbstractC81130a {

    /* renamed from: b */
    public static final C81153a f181346b = new C81153a((byte) 0);

    /* renamed from: a */
    public AbstractC60162u f181347a;

    /* renamed from: c */
    private SparseArray f181348c;

    static {
        Covode.recordClassIndex(94480);
    }

    @Override // com.p2082ss.android.ugc.aweme.view.p4230b.AbstractC81172f
    /* renamed from: a */
    public final int mo124609a() {
        return R.layout.aom;
    }

    @Override // com.p2082ss.android.ugc.aweme.view.p4230b.AbstractC81172f
    /* renamed from: a */
    public final View mo124610a(int i) {
        if (this.f181348c == null) {
            this.f181348c = new SparseArray();
        }
        View view = (View) this.f181348c.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f181348c.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.view.p4230b.AbstractC81172f
    /* renamed from: c */
    public final void mo124612c() {
        SparseArray sparseArray = this.f181348c;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.view.p4230b.AbstractC81172f
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo124612c();
    }

    /* renamed from: com.ss.android.ugc.aweme.view.b.a$a */
    public static final class C81153a {
        static {
            Covode.recordClassIndex(94481);
        }

        private C81153a() {
        }

        public /* synthetic */ C81153a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.view.p4230b.AbstractC81172f
    /* renamed from: b */
    public final void mo124611b() {
        RecyclerView recyclerView;
        if (this.f181347a != null) {
            RecyclerView recyclerView2 = (RecyclerView) mo124610a(R.id.d86);
            if (recyclerView2 != null) {
                getContext();
                recyclerView2.setLayoutManager(new LinearLayoutManager(1, false));
            }
            mo124635d();
            C60157q qVar = C60159r.f137138a;
            if (qVar != null && (recyclerView = (RecyclerView) mo124610a(R.id.d86)) != null) {
                AbstractC60162u uVar = this.f181347a;
                if (uVar == null) {
                    C89219l.m154715b();
                }
                recyclerView.setAdapter(new C81129f(qVar, uVar, this));
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.view.p4229a.C81129f.AbstractC81130a
    /* renamed from: a */
    public final void mo124590a(AbstractC60142d dVar) {
        String str;
        C89219l.m154721d(dVar, "");
        AbstractC60162u uVar = this.f181347a;
        if (uVar != null) {
            str = uVar.mo97836a();
        } else {
            str = null;
        }
        String a = dVar.mo97815a();
        C89219l.m154721d(a, "");
        C39162r.m79460a("click_edit_avatar_detail", new C33744d().mo59983a("item_tab", str).mo59983a("item_subcategory", a).f79943a);
        ProfileNaviEditorViewModel d = mo124635d();
        C89219l.m154721d(dVar, "");
        d.mo33689c(new ProfileNaviEditorViewModel.C81331e(dVar));
    }

    @Override // com.p2082ss.android.ugc.aweme.view.p4229a.C81129f.AbstractC81130a
    /* renamed from: b */
    public final void mo124593b(AbstractC60142d dVar) {
        String str;
        C89219l.m154721d(dVar, "");
        AbstractC60162u uVar = this.f181347a;
        if (uVar != null) {
            str = uVar.mo97836a();
        } else {
            str = null;
        }
        String a = dVar.mo97815a();
        C89219l.m154721d(a, "");
        C39162r.m79460a("click_avatar_flip", new C33744d().mo59983a("item_tab", str).mo59983a("item_subcategory", a).f79943a);
        ProfileNaviEditorViewModel d = mo124635d();
        C89219l.m154721d(dVar, "");
        if (dVar.mo97824j() != null) {
            C60146h j = dVar.mo97824j();
            if (j == null) {
                C89219l.m154715b();
            }
            if (j.f137093b == 0) {
                C60146h j2 = dVar.mo97824j();
                if (j2 == null) {
                    C89219l.m154715b();
                }
                j2.f137093b = 1;
            } else {
                C60146h j3 = dVar.mo97824j();
                if (j3 == null) {
                    C89219l.m154715b();
                }
                j3.f137093b = 0;
            }
            d.mo33690d(new ProfileNaviEditorViewModel.C81334h(dVar));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.view.p4229a.C81129f.AbstractC81130a
    /* renamed from: a */
    public final void mo124592a(AbstractC60160s sVar) {
        String str;
        C60143e eVar;
        C89219l.m154721d(sVar, "");
        String a = sVar.mo97825a();
        AbstractC60162u uVar = this.f181347a;
        String str2 = null;
        if (uVar != null) {
            str = uVar.mo97836a();
        } else {
            str = null;
        }
        String a2 = sVar.mo97827c().mo97815a();
        C60145g i = sVar.mo97827c().mo97823i();
        if (!(i == null || (eVar = i.f137091b) == null)) {
            str2 = eVar.f137087c;
        }
        C34891a.m71269a(a, str, a2, str2);
        ProfileNaviEditorViewModel d = mo124635d();
        C89219l.m154721d(sVar, "");
        if (sVar instanceof AbstractC60154n) {
            AbstractC60154n b = ProfileNaviEditorViewModel.m141050b(sVar.mo97827c());
            if (b == null || (!C89219l.m154714a((Object) b.mo97825a(), (Object) sVar.mo97825a()))) {
                AbstractC60154n nVar = (AbstractC60154n) sVar;
                AbstractC60154n b2 = ProfileNaviEditorViewModel.m141050b(nVar.mo97827c());
                if (b2 == null || !C89219l.m154714a((Object) b2.mo97825a(), (Object) nVar.mo97825a())) {
                    String a3 = ProfileNaviEditorViewModel.m141047a(nVar.mo97827c());
                    d.aB_();
                    C60157q qVar = C60159r.f137138a;
                    if (qVar != null) {
                        C89219l.m154721d(a3, "");
                        qVar.f137134c.put(a3, nVar);
                    }
                    if (b2 != null) {
                        d.mo33690d(new ProfileNaviEditorViewModel.C81347u(b2));
                    }
                }
                d.mo124839a(nVar);
            }
        } else if (sVar instanceof C60148j) {
            d.aB_();
            C60157q qVar2 = C60159r.f137138a;
            if (qVar2 != null) {
                String a4 = sVar.mo97827c().mo97815a();
                C89219l.m154721d(a4, "");
                C89219l.m154721d(sVar, "");
                qVar2.f137135d.put(a4, sVar);
            }
            d.mo33690d(new ProfileNaviEditorViewModel.C81348v(sVar));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.view.p4229a.C81129f.AbstractC81130a
    /* renamed from: a */
    public final void mo124591a(AbstractC60142d dVar, C60143e eVar) {
        String str;
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(eVar, "");
        mo124635d();
        AbstractC60154n b = ProfileNaviEditorViewModel.m141050b(dVar);
        String str2 = null;
        if (b != null) {
            str = b.mo97825a();
        } else {
            str = null;
        }
        AbstractC60162u uVar = this.f181347a;
        if (uVar != null) {
            str2 = uVar.mo97836a();
        }
        C34891a.m71269a(str, str2, dVar.mo97815a(), eVar.f137087c);
        ProfileNaviEditorViewModel d = mo124635d();
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(eVar, "");
        if (eVar.f137087c != null && dVar.mo97823i() != null) {
            C60145g i = dVar.mo97823i();
            if (i == null) {
                C89219l.m154715b();
            }
            i.f137091b = eVar;
            d.mo33690d(new ProfileNaviEditorViewModel.C81327a(eVar));
        }
    }
}
