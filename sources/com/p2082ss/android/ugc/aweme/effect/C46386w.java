package com.p2082ss.android.ugc.aweme.effect;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.lifecycle.C1213t;
import androidx.recyclerview.widget.C1445j;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.effect.C46327bm;
import com.p2082ss.android.ugc.aweme.effect.p2889b.C46300a;
import com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.model.VEEffectSelectOp;
import com.p2082ss.android.ugc.aweme.themechange.base.AVDmtHorizontalImageTextLayout;
import com.p2082ss.android.ugc.aweme.themechange.base.AVDmtTextView;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.trill.R;
import dmt.p4542av.video.C88290o;
import dmt.p4542av.video.C88292p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.effect.w */
public final class C46386w extends AbstractC46335c {

    /* renamed from: k */
    public static final C46387a f108101k = new C46387a((byte) 0);

    /* renamed from: i */
    public EditEffectVideoModel f108102i;

    /* renamed from: j */
    public C46327bm f108103j;

    /* renamed from: l */
    private HashMap f108104l;

    static {
        Covode.recordClassIndex(54963);
    }

    @Override // com.p2082ss.android.ugc.aweme.effect.AbstractC46335c
    /* renamed from: b */
    public final View mo78822b(int i) {
        if (this.f108104l == null) {
            this.f108104l = new HashMap();
        }
        View view = (View) this.f108104l.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f108104l.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.effect.AbstractC46335c
    /* renamed from: f */
    public final void mo78827f() {
        HashMap hashMap = this.f108104l;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.effect.AbstractC46380u
    /* renamed from: g */
    public final void mo78874g() {
    }

    @Override // com.p2082ss.android.ugc.aweme.effect.AbstractC46335c, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo78827f();
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.w$a */
    public static final class C46387a {
        static {
            Covode.recordClassIndex(54964);
        }

        private C46387a() {
        }

        public /* synthetic */ C46387a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C46386w m89497a(List<? extends Effect> list, String str) {
            C89219l.m154721d(list, "");
            C89219l.m154721d(str, "");
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("effect_list", (ArrayList) C89070n.m154585g((Collection) list));
            bundle.putString("effect_category", str);
            C46386w wVar = new C46386w();
            wVar.setArguments(bundle);
            return wVar;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ EditEffectVideoModel m89488a(C46386w wVar) {
        EditEffectVideoModel editEffectVideoModel = wVar.f108102i;
        if (editEffectVideoModel == null) {
            C89219l.m154710a("mViewModel");
        }
        return editEffectVideoModel;
    }

    /* renamed from: b */
    public static final /* synthetic */ C46327bm m89489b(C46386w wVar) {
        C46327bm bmVar = wVar.f108103j;
        if (bmVar == null) {
            C89219l.m154710a("mEffectAdapter");
        }
        return bmVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.effect.p2889b.p2890a.AbstractC46311b
    /* renamed from: a */
    public final void mo78804a(Effect effect) {
        C89219l.m154721d(effect, "");
        int indexOf = mo78823b().indexOf(effect);
        if (indexOf >= 0) {
            C46327bm bmVar = this.f108103j;
            if (bmVar == null) {
                C89219l.m154710a("mEffectAdapter");
            }
            bmVar.mo78739a(indexOf, 8);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.effect.p2889b.p2890a.AbstractC46311b
    /* renamed from: b */
    public final void mo78805b(Effect effect) {
        C89219l.m154721d(effect, "");
        int indexOf = mo78823b().indexOf(effect);
        if (indexOf >= 0) {
            C46327bm bmVar = this.f108103j;
            if (bmVar == null) {
                C89219l.m154710a("mEffectAdapter");
            }
            bmVar.mo78739a(indexOf, 16);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.effect.p2889b.p2890a.AbstractC46311b
    /* renamed from: c */
    public final void mo78806c(Effect effect) {
        int indexOf;
        if (effect != null && (indexOf = mo78823b().indexOf(effect)) >= 0) {
            C46327bm bmVar = this.f108103j;
            if (bmVar == null) {
                C89219l.m154710a("mEffectAdapter");
            }
            bmVar.mo78739a(indexOf, 32);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.w$c */
    static final class C46389c<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C46386w f108106a;

        static {
            Covode.recordClassIndex(54966);
        }

        C46389c(C46386w wVar) {
            this.f108106a = wVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Float f = (Float) obj;
            if (f == null || f.floatValue() <= 0.0f) {
                AVDmtTextView aVDmtTextView = (AVDmtTextView) this.f108106a.mo78822b(R.id.erk);
                C89219l.m154716b(aVDmtTextView, "");
                aVDmtTextView.setText(this.f108106a.getString(R.string.yb));
                return;
            }
            String a = C1764a.m5929a(Locale.getDefault(), "%.1f", Arrays.copyOf(new Object[]{f}, 1));
            C89219l.m154716b(a, "");
            AVDmtTextView aVDmtTextView2 = (AVDmtTextView) this.f108106a.mo78822b(R.id.erk);
            C89219l.m154716b(aVDmtTextView2, "");
            aVDmtTextView2.setText(this.f108106a.getString(R.string.bkk, a));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.effect.AbstractC46335c, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        ActivityC0945e activity = getActivity();
        if (activity != null) {
            AbstractC1174ac a = C1181ae.m3881a(activity, (C1175ad.AbstractC1177b) null).mo3983a(EditEffectVideoModel.class);
            C89219l.m154716b(a, "");
            EditEffectVideoModel editEffectVideoModel = (EditEffectVideoModel) a;
            this.f108102i = editEffectVideoModel;
            if (editEffectVideoModel == null) {
                C89219l.m154710a("mViewModel");
            }
            editEffectVideoModel.mo78623a().mo78857h().observe(this, new C46388b(this));
            EditEffectVideoModel editEffectVideoModel2 = this.f108102i;
            if (editEffectVideoModel2 == null) {
                C89219l.m154710a("mViewModel");
            }
            editEffectVideoModel2.mo78628e().observe(this, new C46389c(this));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.w$b */
    static final class C46388b<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C46386w f108105a;

        static {
            Covode.recordClassIndex(54965);
        }

        C46388b(C46386w wVar) {
            this.f108105a = wVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            C88292p pVar = (C88292p) obj;
            if (pVar == null) {
                return;
            }
            if (pVar.f200341g == 3) {
                this.f108105a.f108007g.clear();
                AVDmtHorizontalImageTextLayout aVDmtHorizontalImageTextLayout = (AVDmtHorizontalImageTextLayout) this.f108105a.mo78822b(R.id.erg);
                C89219l.m154716b(aVDmtHorizontalImageTextLayout, "");
                aVDmtHorizontalImageTextLayout.setVisibility(8);
            } else if (pVar != null) {
                if (pVar.f200341g == 4) {
                    for (int length = pVar.f200335a.length - 1; length >= 0 && !this.f108105a.f108007g.isEmpty(); length--) {
                        EffectPointModel effectPointModel = this.f108105a.f108007g.get(0);
                        C89219l.m154716b(effectPointModel, "");
                        if (effectPointModel.getIndex() == pVar.f200335a[length]) {
                            C46386w.m89489b(this.f108105a).mo78811a((EffectPointModel) null);
                            EffectPointModel remove = this.f108105a.f108007g.remove(0);
                            C89219l.m154716b(remove, "");
                            EffectPointModel effectPointModel2 = remove;
                            C46386w.m89488a(this.f108105a).mo78623a().mo78857h().setValue(C88292p.m153425a(effectPointModel2.getIndex(), effectPointModel2.getUuid()));
                            return;
                        }
                    }
                } else if (pVar.f200341g == 9) {
                    C46386w.m89489b(this.f108105a).mo78811a((EffectPointModel) null);
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.effect.AbstractC46335c
    /* renamed from: a */
    public final void mo78820a(C1445j.C1450d dVar, List<? extends EffectModel> list) {
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(list, "");
        C46327bm bmVar = this.f108103j;
        if (bmVar == null) {
            C89219l.m154710a("mEffectAdapter");
        }
        dVar.mo4951a(bmVar);
        mo78821a(list);
        C46327bm bmVar2 = this.f108103j;
        if (bmVar2 == null) {
            C89219l.m154710a("mEffectAdapter");
        }
        bmVar2.mo78740a(this.f108004d);
        C46327bm bmVar3 = this.f108103j;
        if (bmVar3 == null) {
            C89219l.m154710a("mEffectAdapter");
        }
        if ((!bmVar3.f107835c.isEmpty()) && (!this.f108007g.isEmpty())) {
            C46327bm bmVar4 = this.f108103j;
            if (bmVar4 == null) {
                C89219l.m154710a("mEffectAdapter");
            }
            bmVar4.mo78811a(this.f108007g.get(0));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.effect.AbstractC46335c, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        AVDmtTextView aVDmtTextView = (AVDmtTextView) mo78822b(R.id.erk);
        C89219l.m154716b(aVDmtTextView, "");
        aVDmtTextView.setText(getString(R.string.yb));
        C46327bm bmVar = new C46327bm((RecyclerView) mo78822b(R.id.dh0), this.f108006f);
        this.f108103j = bmVar;
        bmVar.mo78740a(this.f108004d);
        C46327bm bmVar2 = this.f108103j;
        if (bmVar2 == null) {
            C89219l.m154710a("mEffectAdapter");
        }
        if ((!bmVar2.f107835c.isEmpty()) && (!this.f108007g.isEmpty())) {
            C46327bm bmVar3 = this.f108103j;
            if (bmVar3 == null) {
                C89219l.m154710a("mEffectAdapter");
            }
            bmVar3.mo78811a(this.f108007g.get(0));
        }
        C46327bm bmVar4 = this.f108103j;
        if (bmVar4 == null) {
            C89219l.m154710a("mEffectAdapter");
        }
        bmVar4.f107984a = new C46390d(this);
        RecyclerView recyclerView = (RecyclerView) mo78822b(R.id.dh0);
        C89219l.m154716b(recyclerView, "");
        C46327bm bmVar5 = this.f108103j;
        if (bmVar5 == null) {
            C89219l.m154710a("mEffectAdapter");
        }
        recyclerView.setAdapter(bmVar5);
        AVDmtHorizontalImageTextLayout aVDmtHorizontalImageTextLayout = (AVDmtHorizontalImageTextLayout) mo78822b(R.id.erg);
        C89219l.m154716b(aVDmtHorizontalImageTextLayout, "");
        aVDmtHorizontalImageTextLayout.setVisibility(8);
        mo78826e();
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.w$d */
    static final class C46390d implements C46327bm.AbstractC46328a {

        /* renamed from: a */
        final /* synthetic */ C46386w f108107a;

        static {
            Covode.recordClassIndex(54967);
        }

        C46390d(C46386w wVar) {
            this.f108107a = wVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.effect.C46327bm.AbstractC46328a
        /* renamed from: a */
        public final void mo78812a(EffectModel effectModel, int i, int i2) {
            AbstractC46415f a;
            EffectPointModel remove;
            AbstractC46415f a2;
            EditEffectVideoModel a3 = C46386w.m89488a(this.f108107a);
            Effect effect = this.f108107a.mo78823b().get(i2);
            if (i != 2) {
                this.f108107a.mo78819a(i2);
                if (this.f108107a.f108006f == null || (a = C46300a.C46301a.m89337a()) == null || !a.mo78914a(effect)) {
                    C46300a aVar = this.f108107a.f108006f;
                    if (aVar != null) {
                        aVar.mo78790a(effect);
                        return;
                    }
                    return;
                }
                C1213t<VEEffectSelectOp> g = a3.mo78630g();
                if (this.f108107a.f108007g.isEmpty()) {
                    remove = null;
                } else {
                    remove = this.f108107a.f108007g.remove(0);
                }
                g.setValue(VEEffectSelectOp.selectSticker(effectModel, remove));
                C1213t<C88290o> h = a3.mo78631h();
                String str = effectModel.hint;
                C88290o oVar = new C88290o((byte) 0);
                if (str == null) {
                    str = "";
                }
                C89219l.m154721d(str, "");
                oVar.f200332a = str;
                oVar.f200333b = InteractFirstFrameTimeOutDurationSetting.DEFAULT;
                h.setValue(oVar);
                AVDmtTextView aVDmtTextView = (AVDmtTextView) this.f108107a.mo78822b(R.id.erk);
                C89219l.m154716b(aVDmtTextView, "");
                aVDmtTextView.setText(this.f108107a.getString(R.string.yb));
                ArrayList<EffectPointModel> g2 = a3.mo78623a().mo78856g();
                if (!g2.isEmpty()) {
                    this.f108107a.f108007g.add(g2.get(g2.size() - 1));
                } else {
                    C63244g.m114602a().mo73263I().mo101628a("add effect fail");
                }
            } else if (this.f108107a.f108006f != null && (a2 = C46300a.C46301a.m89337a()) != null && a2.mo78914a(effect)) {
                if (!this.f108107a.f108007g.isEmpty()) {
                    EffectPointModel remove2 = this.f108107a.f108007g.remove(0);
                    C89219l.m154716b(remove2, "");
                    EffectPointModel effectPointModel = remove2;
                    a3.mo78623a().mo78857h().setValue(C88292p.m153425a(effectPointModel.getIndex(), effectPointModel.getUuid()));
                }
                AVDmtTextView aVDmtTextView2 = (AVDmtTextView) this.f108107a.mo78822b(R.id.erk);
                C89219l.m154716b(aVDmtTextView2, "");
                aVDmtTextView2.setText(this.f108107a.getString(R.string.yb));
            }
        }
    }
}
