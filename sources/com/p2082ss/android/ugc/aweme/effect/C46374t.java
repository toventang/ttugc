package com.p2082ss.android.ugc.aweme.effect;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.recyclerview.widget.C1445j;
import androidx.recyclerview.widget.RecyclerView;
import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.effect.C46397z;
import com.p2082ss.android.ugc.aweme.effect.p2889b.C46300a;
import com.p2082ss.android.ugc.aweme.effect.p2891c.C46343b;
import com.p2082ss.android.ugc.aweme.effect.p2891c.C46349c;
import com.p2082ss.android.ugc.aweme.effect.p2894d.C46352a;
import com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63190ap;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.model.VEEffectSelectOp;
import com.p2082ss.android.ugc.aweme.themechange.base.AVDmtHorizontalImageTextLayout;
import com.p2082ss.android.ugc.aweme.themechange.base.AVDmtTextView;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.tools.utils.C84913s;
import com.p2082ss.android.ugc.trill.R;
import dmt.p4542av.video.C88271g;
import dmt.p4542av.video.C88292p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.effect.t */
public final class C46374t extends AbstractC46335c {

    /* renamed from: n */
    public static final C46375a f108083n = new C46375a((byte) 0);

    /* renamed from: i */
    public C46397z f108084i;

    /* renamed from: j */
    public EditEffectVideoModel f108085j;

    /* renamed from: k */
    public C46349c f108086k;

    /* renamed from: l */
    public boolean f108087l;

    /* renamed from: m */
    public C46352a f108088m;

    /* renamed from: o */
    private boolean f108089o;

    /* renamed from: p */
    private final AbstractC89244h f108090p = C89250i.m154777a(new LinkedHashSet());

    /* renamed from: q */
    private final AbstractC89244h f108091q = C89250i.m154777a(new ArrayList());

    /* renamed from: r */
    private final AbstractC89244h f108092r = C89250i.m154777a(new ArrayList());

    /* renamed from: s */
    private HashMap f108093s;

    static {
        Covode.recordClassIndex(54951);
    }

    /* renamed from: h */
    private final Set<Effect> m89471h() {
        return (Set) this.f108090p.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.effect.AbstractC46335c
    /* renamed from: b */
    public final View mo78822b(int i) {
        if (this.f108093s == null) {
            this.f108093s = new HashMap();
        }
        View view = (View) this.f108093s.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f108093s.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.effect.AbstractC46335c
    /* renamed from: f */
    public final void mo78827f() {
        HashMap hashMap = this.f108093s;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.effect.AbstractC46335c, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo78827f();
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.t$a */
    public static final class C46375a {
        static {
            Covode.recordClassIndex(54952);
        }

        private C46375a() {
        }

        public /* synthetic */ C46375a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C46374t m89481a(List<? extends Effect> list, String str, boolean z) {
            C89219l.m154721d(list, "");
            C89219l.m154721d(str, "");
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("effect_list", (ArrayList) C89070n.m154585g((Collection) list));
            bundle.putString("effect_category", str);
            bundle.putBoolean("motio_toast", z);
            C46374t tVar = new C46374t();
            tVar.setArguments(bundle);
            return tVar;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.effect.AbstractC46380u
    /* renamed from: g */
    public final void mo78874g() {
        C46349c cVar = this.f108086k;
        if (cVar == null) {
            C89219l.m154710a("motionEffectControll");
        }
        for (Map.Entry<Integer, C46343b> entry : cVar.f108042c.entrySet()) {
            entry.getValue().f108027c = false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.t$d */
    public static final class C46378d extends RecyclerView.AbstractC1371n {

        /* renamed from: a */
        final /* synthetic */ C46374t f108096a;

        static {
            Covode.recordClassIndex(54955);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C46378d(C46374t tVar) {
            this.f108096a = tVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4753a(RecyclerView recyclerView, int i) {
            boolean z;
            C89219l.m154721d(recyclerView, "");
            super.mo4753a(recyclerView, i);
            C46374t tVar = this.f108096a;
            if (i == 0) {
                z = true;
            } else {
                z = false;
            }
            tVar.f108087l = z;
            C46374t tVar2 = this.f108096a;
            tVar2.mo78873a(tVar2.f108087l);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4754a(RecyclerView recyclerView, int i, int i2) {
            C89219l.m154721d(recyclerView, "");
            super.mo4754a(recyclerView, i, i2);
            C46374t tVar = this.f108096a;
            tVar.mo78873a(tVar.f108087l);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ EditEffectVideoModel m89468a(C46374t tVar) {
        EditEffectVideoModel editEffectVideoModel = tVar.f108085j;
        if (editEffectVideoModel == null) {
            C89219l.m154710a("mViewModel");
        }
        return editEffectVideoModel;
    }

    /* renamed from: b */
    public static final /* synthetic */ C46397z m89469b(C46374t tVar) {
        C46397z zVar = tVar.f108084i;
        if (zVar == null) {
            C89219l.m154710a("mEffectAdapter");
        }
        return zVar;
    }

    /* renamed from: c */
    public static final /* synthetic */ C46349c m89470c(C46374t tVar) {
        C46349c cVar = tVar.f108086k;
        if (cVar == null) {
            C89219l.m154710a("motionEffectControll");
        }
        return cVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.effect.p2889b.p2890a.AbstractC46311b
    /* renamed from: a */
    public final void mo78804a(Effect effect) {
        C89219l.m154721d(effect, "");
        int indexOf = mo78823b().indexOf(effect);
        if (indexOf >= 0) {
            C46397z zVar = this.f108084i;
            if (zVar == null) {
                C89219l.m154710a("mEffectAdapter");
            }
            zVar.mo78739a(indexOf, 8);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.effect.p2889b.p2890a.AbstractC46311b
    /* renamed from: c */
    public final void mo78806c(Effect effect) {
        int indexOf;
        if (effect != null && (indexOf = mo78823b().indexOf(effect)) >= 0) {
            C46397z zVar = this.f108084i;
            if (zVar == null) {
                C89219l.m154710a("mEffectAdapter");
            }
            zVar.mo78739a(indexOf, 32);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (!this.f108089o) {
            return;
        }
        if (z) {
            mo78873a(true);
        } else {
            mo78873a(false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.t$b */
    static final class C46376b<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C46374t f108094a;

        static {
            Covode.recordClassIndex(54953);
        }

        C46376b(C46374t tVar) {
            this.f108094a = tVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            C88292p pVar = (C88292p) obj;
            if (pVar == null) {
                return;
            }
            if (pVar.f200341g == 3) {
                this.f108094a.f108007g.clear();
                AVDmtHorizontalImageTextLayout aVDmtHorizontalImageTextLayout = (AVDmtHorizontalImageTextLayout) this.f108094a.mo78822b(R.id.erg);
                C89219l.m154716b(aVDmtHorizontalImageTextLayout, "");
                aVDmtHorizontalImageTextLayout.setVisibility(8);
            } else if (pVar.f200341g == 4) {
                for (int length = pVar.f200335a.length - 1; length >= 0; length--) {
                    if (this.f108094a.f108007g.isEmpty()) {
                        AVDmtHorizontalImageTextLayout aVDmtHorizontalImageTextLayout2 = (AVDmtHorizontalImageTextLayout) this.f108094a.mo78822b(R.id.erg);
                        C89219l.m154716b(aVDmtHorizontalImageTextLayout2, "");
                        aVDmtHorizontalImageTextLayout2.setVisibility(8);
                        return;
                    }
                    int i = pVar.f200335a[length];
                    int size = this.f108094a.f108007g.size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        }
                        EffectPointModel effectPointModel = this.f108094a.f108007g.get(size);
                        C89219l.m154716b(effectPointModel, "");
                        if (effectPointModel.getIndex() == i) {
                            this.f108094a.f108007g.remove(size);
                            break;
                        }
                        size--;
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.t$e */
    static final class View$OnClickListenerC46379e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C46374t f108097a;

        static {
            Covode.recordClassIndex(54956);
        }

        View$OnClickListenerC46379e(C46374t tVar) {
            this.f108097a = tVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!this.f108097a.f108007g.isEmpty()) {
                EffectPointModel effectPointModel = (EffectPointModel) C89070n.m154586h((List) this.f108097a.f108007g);
                C88271g<C88292p> h = C46374t.m89468a(this.f108097a).mo78623a().mo78857h();
                int index = effectPointModel.getIndex();
                String uuid = effectPointModel.getUuid();
                C88292p pVar = new C88292p();
                pVar.f200341g = 2;
                pVar.f200335a = new int[]{index};
                pVar.f200336b = new String[]{uuid};
                h.setValue(pVar);
                this.f108097a.f108007g.remove(this.f108097a.f108007g.size() - 1);
                if (this.f108097a.f108007g.isEmpty()) {
                    AVDmtHorizontalImageTextLayout aVDmtHorizontalImageTextLayout = (AVDmtHorizontalImageTextLayout) this.f108097a.mo78822b(R.id.erg);
                    C89219l.m154716b(aVDmtHorizontalImageTextLayout, "");
                    aVDmtHorizontalImageTextLayout.setVisibility(8);
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.effect.p2889b.p2890a.AbstractC46311b
    /* renamed from: b */
    public final void mo78805b(Effect effect) {
        C89219l.m154721d(effect, "");
        C63244g.m114602a().mo73295w();
        int indexOf = mo78823b().indexOf(effect);
        if (indexOf >= 0) {
            C46397z zVar = this.f108084i;
            if (zVar == null) {
                C89219l.m154710a("mEffectAdapter");
            }
            zVar.mo78739a(indexOf, 16);
            C46352a aVar = this.f108088m;
            if (aVar == null) {
                C89219l.m154710a("mTouchStateHolder");
            }
            if (indexOf == aVar.f108048b && aVar.f108047a == 0 && !m89471h().contains(effect)) {
                C46352a aVar2 = this.f108088m;
                if (aVar2 == null) {
                    C89219l.m154710a("mTouchStateHolder");
                }
                Integer valueOf = Integer.valueOf(aVar2.f108047a);
                C46352a aVar3 = this.f108088m;
                if (aVar3 == null) {
                    C89219l.m154710a("mTouchStateHolder");
                }
                mo78872a(valueOf, aVar3.f108049c);
                if (this.f108088m == null) {
                    C89219l.m154710a("mTouchStateHolder");
                }
                m89471h().add(effect);
                C63244g.m114602a().mo73295w();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.effect.AbstractC46335c, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        int i;
        super.onActivityCreated(bundle);
        this.f108089o = true;
        ActivityC0945e activity = getActivity();
        if (activity != null) {
            AVDmtHorizontalImageTextLayout aVDmtHorizontalImageTextLayout = (AVDmtHorizontalImageTextLayout) mo78822b(R.id.erg);
            C89219l.m154716b(aVDmtHorizontalImageTextLayout, "");
            if (this.f108007g.isEmpty()) {
                i = 8;
            } else {
                i = 0;
            }
            aVDmtHorizontalImageTextLayout.setVisibility(i);
            AbstractC1174ac a = C1181ae.m3881a(activity, (C1175ad.AbstractC1177b) null).mo3983a(EditEffectVideoModel.class);
            C89219l.m154716b(a, "");
            EditEffectVideoModel editEffectVideoModel = (EditEffectVideoModel) a;
            this.f108085j = editEffectVideoModel;
            if (editEffectVideoModel == null) {
                C89219l.m154710a("mViewModel");
            }
            editEffectVideoModel.mo78623a().mo78857h().observe(this, new C46376b(this));
        }
    }

    /* renamed from: a */
    public final void mo78873a(boolean z) {
        RecyclerView.ViewHolder viewHolder;
        int k = mo78824c().mo4371k();
        int m = mo78824c().mo4373m();
        if (k <= m) {
            while (true) {
                RecyclerView recyclerView = (RecyclerView) mo78822b(R.id.dh0);
                if (recyclerView != null) {
                    viewHolder = recyclerView.mo4451f(k);
                } else {
                    viewHolder = null;
                }
                if (viewHolder instanceof C46397z.C46399b) {
                    ((C46397z.C46399b) viewHolder).mo78882a(z);
                }
                if (k != m) {
                    k++;
                } else {
                    return;
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.effect.AbstractC46335c
    /* renamed from: a */
    public final void mo78820a(C1445j.C1450d dVar, List<? extends EffectModel> list) {
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(list, "");
        C46397z zVar = this.f108084i;
        if (zVar == null) {
            C89219l.m154710a("mEffectAdapter");
        }
        dVar.mo4951a(zVar);
        mo78821a(list);
        C46397z zVar2 = this.f108084i;
        if (zVar2 == null) {
            C89219l.m154710a("mEffectAdapter");
        }
        zVar2.mo78740a(this.f108004d);
    }

    /* renamed from: a */
    public final void mo78872a(Integer num, EffectModel effectModel) {
        if (num != null) {
            num.intValue();
            if (effectModel != null) {
                EditEffectVideoModel editEffectVideoModel = this.f108085j;
                if (editEffectVideoModel == null) {
                    C89219l.m154710a("mViewModel");
                }
                editEffectVideoModel.mo78630g().setValue(VEEffectSelectOp.selectFilter(num.intValue(), effectModel));
                EditEffectVideoModel editEffectVideoModel2 = this.f108085j;
                if (editEffectVideoModel2 == null) {
                    C89219l.m154710a("mViewModel");
                }
                ArrayList<EffectPointModel> g = editEffectVideoModel2.mo78623a().mo78856g();
                if (!g.isEmpty()) {
                    this.f108007g.add(g.get(g.size() - 1));
                } else {
                    C63244g.m114602a().mo73263I().mo101628a("add effect failed");
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.effect.AbstractC46335c, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        this.f108088m = new C46352a();
        ActivityC0945e activity = getActivity();
        if (activity == null) {
            C89219l.m154715b();
        }
        C89219l.m154716b(activity, "");
        this.f108086k = new C46349c(activity);
        C46397z zVar = new C46397z((RecyclerView) mo78822b(R.id.dh0), this.f108006f);
        this.f108084i = zVar;
        zVar.mo78740a(this.f108004d);
        C46397z zVar2 = this.f108084i;
        if (zVar2 == null) {
            C89219l.m154710a("mEffectAdapter");
        }
        zVar2.f108120a = new C46377c(this);
        RecyclerView recyclerView = (RecyclerView) mo78822b(R.id.dh0);
        C89219l.m154716b(recyclerView, "");
        C46397z zVar3 = this.f108084i;
        if (zVar3 == null) {
            C89219l.m154710a("mEffectAdapter");
        }
        recyclerView.setAdapter(zVar3);
        ((RecyclerView) mo78822b(R.id.dh0)).mo4405a(new C46378d(this));
        if (C89219l.m154714a((Object) "trans", (Object) mo78818a())) {
            AVDmtTextView aVDmtTextView = (AVDmtTextView) mo78822b(R.id.erk);
            C89219l.m154716b(aVDmtTextView, "");
            aVDmtTextView.setText(getString(R.string.bld));
        } else if (C89219l.m154714a((Object) "motion", (Object) mo78818a())) {
            AVDmtTextView aVDmtTextView2 = (AVDmtTextView) mo78822b(R.id.erk);
            C89219l.m154716b(aVDmtTextView2, "");
            aVDmtTextView2.setText(getString(R.string.d4q));
        }
        C84913s.m145936a(mo78822b(R.id.erg), 0.5f);
        ((AVDmtHorizontalImageTextLayout) mo78822b(R.id.erg)).setOnClickListener(new View$OnClickListenerC46379e(this));
        mo78826e();
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.t$c */
    static final class C46377c implements C46397z.AbstractC46398a {

        /* renamed from: a */
        final /* synthetic */ C46374t f108095a;

        static {
            Covode.recordClassIndex(54954);
        }

        C46377c(C46374t tVar) {
            this.f108095a = tVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.effect.C46397z.AbstractC46398a
        /* renamed from: a */
        public final void mo78875a(int i, int i2, EffectModel effectModel) {
            AbstractC46415f a;
            AbstractC46415f a2;
            String str;
            AbstractC46415f a3;
            EditEffectVideoModel a4 = C46374t.m89468a(this.f108095a);
            ArrayList<EffectPointModel> g = a4.mo78623a().mo78856g();
            Effect effect = this.f108095a.mo78823b().get(i2);
            if (5 == i) {
                this.f108095a.mo78819a(i2);
                if (this.f108095a.f108006f == null || (a3 = C46300a.C46301a.m89337a()) == null || !a3.mo78914a(effect)) {
                    C46300a aVar = this.f108095a.f108006f;
                    if (aVar != null) {
                        aVar.mo78790a(effect);
                    }
                } else {
                    a4.mo78630g().setValue(VEEffectSelectOp.selectTrans(effectModel));
                    AVDmtHorizontalImageTextLayout aVDmtHorizontalImageTextLayout = (AVDmtHorizontalImageTextLayout) this.f108095a.mo78822b(R.id.erg);
                    C89219l.m154716b(aVDmtHorizontalImageTextLayout, "");
                    aVDmtHorizontalImageTextLayout.setVisibility(0);
                    if (!g.isEmpty()) {
                        this.f108095a.f108007g.add(g.get(g.size() - 1));
                    } else {
                        C63244g.m114602a().mo73263I().mo101628a("add effect fail");
                    }
                    C46374t.m89469b(this.f108095a).mo78739a(i2, 16);
                }
            } else if (i == 0) {
                if (this.f108095a.f108005e) {
                    C46349c c = C46374t.m89470c(this.f108095a);
                    if (c.f108042c.get(Integer.valueOf(i2)) == null) {
                        MessageCenter.addListener(c);
                        c.f108042c.put(Integer.valueOf(i2), new C46343b(true));
                        c.f108043d = i2;
                    } else {
                        for (Map.Entry<Integer, C46343b> entry : c.f108042c.entrySet()) {
                            if (entry.getKey().intValue() == i2 && !entry.getValue().f108026b) {
                                MessageCenter.addListener(c);
                                entry.getValue().f108026b = true;
                                entry.getValue().f108025a = 0;
                                c.f108043d = i2;
                            }
                        }
                    }
                }
                this.f108095a.mo78819a(i2);
                if (this.f108095a.f108006f == null || (a2 = C46300a.C46301a.m89337a()) == null || !a2.mo78914a(effect)) {
                    C46300a aVar2 = this.f108095a.f108006f;
                    if (aVar2 != null) {
                        aVar2.mo78790a(effect);
                    }
                } else {
                    if (TextUtils.isEmpty(effectModel.resDir)) {
                        AbstractC63190ap I = C63244g.m114602a().mo73263I();
                        StringBuilder sb = new StringBuilder("applyFilter_resdir_null:");
                        if (effectModel.key != null) {
                            str = effectModel.key;
                        } else {
                            str = "";
                        }
                        I.mo101640b(sb.append(str).toString());
                    }
                    this.f108095a.mo78872a(Integer.valueOf(i), effectModel);
                    C46374t.m89469b(this.f108095a).mo78739a(i2, 16);
                }
            } else if (1 == i) {
                if (this.f108095a.f108005e) {
                    C46374t.m89470c(this.f108095a).mo78847a(i2);
                }
                if (!(this.f108095a.f108006f == null || (a = C46300a.C46301a.m89337a()) == null || !a.mo78914a(effect))) {
                    a4.mo78630g().setValue(VEEffectSelectOp.selectFilter(i, effectModel));
                    AVDmtHorizontalImageTextLayout aVDmtHorizontalImageTextLayout2 = (AVDmtHorizontalImageTextLayout) this.f108095a.mo78822b(R.id.erg);
                    C89219l.m154716b(aVDmtHorizontalImageTextLayout2, "");
                    aVDmtHorizontalImageTextLayout2.setVisibility(0);
                }
            }
            C46352a aVar3 = this.f108095a.f108088m;
            if (aVar3 == null) {
                C89219l.m154710a("mTouchStateHolder");
            }
            C89219l.m154716b(effectModel, "");
            C89219l.m154721d(effectModel, "");
            aVar3.f108047a = i;
            aVar3.f108048b = i2;
            aVar3.f108049c = effectModel;
        }
    }
}
