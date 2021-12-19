package com.p2082ss.android.ugc.aweme.social.widget.card.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.dialog.C23013a;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.C23035c;
import com.bytedance.tux.dialog.p1712a.C23019c;
import com.bytedance.tux.dialog.p1713b.AbstractC23034g;
import com.bytedance.tux.dialog.p1713b.C23024a;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.bytedance.tux.dialog.p1713b.C23028c;
import com.bytedance.tux.dialog.p1713b.C23033f;
import com.bytedance.tux.dialog.p1715d.C23045a;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1722h.C23163i;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33943c;
import com.p2082ss.android.ugc.aweme.metrics.C59256u;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.social.p3914a.C74710e;
import com.p2082ss.android.ugc.aweme.social.p3914a.EnumC74709d;
import com.p2082ss.android.ugc.aweme.social.widget.C74743a;
import com.p2082ss.android.ugc.aweme.social.widget.card.AbstractC74782d;
import com.p2082ss.android.ugc.aweme.social.widget.card.p3922c.C74777c;
import com.p2082ss.android.ugc.aweme.social.widget.card.rec.cell.C74826b;
import com.p2082ss.android.ugc.aweme.social.widget.card.rec.cell.RecUserSelectCell;
import com.p2082ss.android.ugc.aweme.social.widget.card.rec.p3923vm.SelectedCardVM;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89546bf;
import kotlinx.coroutines.C89624i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.social.widget.card.view.b */
public final class C74891b implements AbstractC74782d {

    /* renamed from: a */
    public AbstractC89172b<? super List<? extends IMUser>, C89391z> f168360a;

    /* renamed from: b */
    public AbstractC89171a<C89391z> f168361b;

    /* renamed from: c */
    public PowerList f168362c;

    /* renamed from: d */
    public TuxButton f168363d;

    /* renamed from: e */
    public SelectedCardVM f168364e;

    /* renamed from: f */
    public final C74743a f168365f;

    /* renamed from: g */
    public final int f168366g;

    /* renamed from: h */
    private C23013a f168367h;

    /* renamed from: i */
    private TuxTextView f168368i;

    /* renamed from: j */
    private TuxTextView f168369j;

    /* renamed from: k */
    private final AbstractC89244h f168370k;

    /* renamed from: l */
    private final AbstractC89244h f168371l = C89250i.m154773a((AbstractC89171a) new C74892a(this));

    static {
        Covode.recordClassIndex(87754);
    }

    /* renamed from: f */
    public final EnumC74709d mo117940f() {
        return (EnumC74709d) this.f168371l.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.social.widget.card.view.b$f */
    static final class C74898f extends AbstractC89220m implements AbstractC89171a<MAFDialogController$maxHeightLayoutManager$2$1> {

        /* renamed from: a */
        final /* synthetic */ C74891b f168378a;

        static {
            Covode.recordClassIndex(87761);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74898f(C74891b bVar) {
            super(0);
            this.f168378a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ MAFDialogController$maxHeightLayoutManager$2$1 invoke() {
            this.f168378a.f168365f.mo117794a();
            return new MAFDialogController$maxHeightLayoutManager$2$1(this);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.social.widget.card.AbstractC74782d
    /* renamed from: c */
    public final void mo117842c() {
        C23013a aVar = this.f168367h;
        if (aVar == null) {
            C89219l.m154710a("attachDialog");
        }
        aVar.dismiss();
    }

    @Override // com.p2082ss.android.ugc.aweme.social.widget.card.AbstractC74782d
    /* renamed from: b */
    public final void mo117841b() {
        C23013a aVar = this.f168367h;
        if (aVar == null) {
            C89219l.m154710a("attachDialog");
        }
        if (!aVar.f54483c.isShowing()) {
            C23013a aVar2 = this.f168367h;
            if (aVar2 == null) {
                C89219l.m154710a("attachDialog");
            }
            aVar2.mo37396b().show();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.social.widget.card.view.b$a */
    static final class C74892a extends AbstractC89220m implements AbstractC89171a<EnumC74709d> {

        /* renamed from: a */
        final /* synthetic */ C74891b f168372a;

        static {
            Covode.recordClassIndex(87755);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74892a(C74891b bVar) {
            super(0);
            this.f168372a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ EnumC74709d invoke() {
            int i = this.f168372a.f168366g;
            if (i == C74710e.f167928b) {
                return EnumC74709d.GROUP_1;
            }
            if (i == C74710e.f167929c) {
                return EnumC74709d.GROUP_2;
            }
            if (i == C74710e.f167930d) {
                return EnumC74709d.GROUP_3;
            }
            if (i == C74710e.f167931e) {
                return EnumC74709d.GROUP_4;
            }
            throw new IllegalStateException("online version can't execute the function!");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.social.widget.card.AbstractC74782d
    /* renamed from: a */
    public final boolean mo117840a() {
        C23013a aVar = this.f168367h;
        if (aVar == null) {
            C89219l.m154710a("attachDialog");
        }
        return aVar.f54483c.isShowing();
    }

    /* renamed from: e */
    public final C23033f mo117939e() {
        List<C23033f> list;
        C23013a aVar = this.f168367h;
        if (aVar == null) {
            C89219l.m154710a("attachDialog");
        }
        AbstractC23034g action = aVar.f54481a.getAction();
        if (!(action instanceof C23025b)) {
            action = null;
        }
        C23025b bVar = (C23025b) action;
        if (bVar == null || (list = bVar.f54512a) == null) {
            return null;
        }
        return (C23033f) C89070n.m154561b((List) list, 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.social.widget.card.AbstractC74782d
    /* renamed from: d */
    public final void mo117843d() {
        SelectedCardVM selectedCardVM = this.f168364e;
        if (selectedCardVM == null) {
            C89219l.m154710a("selectedCardVM");
        }
        selectedCardVM.f168238h.removeObservers(this.f168365f);
        selectedCardVM.f168240j.removeObservers(this.f168365f);
        selectedCardVM.f168242l.removeObservers(this.f168365f);
        selectedCardVM.f168244n.removeObservers(this.f168365f);
        SelectedCardVM selectedCardVM2 = this.f168364e;
        if (selectedCardVM2 == null) {
            C89219l.m154710a("selectedCardVM");
        }
        selectedCardVM2.f168237g.postValue(C89086z.INSTANCE);
        selectedCardVM2.f168239i.postValue(0);
        selectedCardVM2.f168241k.postValue(C89086z.INSTANCE);
        selectedCardVM2.f168243m.postValue(false);
    }

    @Override // com.p2082ss.android.ugc.aweme.social.widget.card.AbstractC74782d
    /* renamed from: a */
    public final void mo117837a(AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(aVar, "");
        this.f168361b = aVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.social.widget.card.view.b$i */
    static final class C74901i<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C74891b f168381a;

        static {
            Covode.recordClassIndex(87764);
        }

        C74901i(C74891b bVar) {
            this.f168381a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            AbstractC89172b<? super List<? extends IMUser>, C89391z> bVar = this.f168381a.f168360a;
            if (bVar != null) {
                C89219l.m154716b(obj, "");
                bVar.invoke(obj);
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ SelectedCardVM m131455a(C74891b bVar) {
        SelectedCardVM selectedCardVM = bVar.f168364e;
        if (selectedCardVM == null) {
            C89219l.m154710a("selectedCardVM");
        }
        return selectedCardVM;
    }

    /* renamed from: com.ss.android.ugc.aweme.social.widget.card.view.b$c */
    static final class C74894c extends AbstractC89220m implements AbstractC89172b<C23013a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C74891b f168374a;

        static {
            Covode.recordClassIndex(87757);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74894c(C74891b bVar) {
            super(1);
            this.f168374a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23013a aVar) {
            C89219l.m154721d(aVar, "");
            C74891b.m131455a(this.f168374a).mo117905a("show");
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.social.widget.card.view.b$e */
    static final class C74896e extends AbstractC89220m implements AbstractC89172b<TuxButton, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C74891b f168376a;

        static {
            Covode.recordClassIndex(87759);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74896e(C74891b bVar) {
            super(1);
            this.f168376a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(TuxButton tuxButton) {
            TuxButton tuxButton2 = tuxButton;
            C89219l.m154721d(tuxButton2, "");
            this.f168376a.f168363d = tuxButton2;
            tuxButton2.setOnClickListener(new View.OnClickListener(this) {
                /* class com.p2082ss.android.ugc.aweme.social.widget.card.view.C74891b.C74896e.View$OnClickListenerC748971 */

                /* renamed from: a */
                final /* synthetic */ C74896e f168377a;

                static {
                    Covode.recordClassIndex(87760);
                }

                {
                    this.f168377a = r1;
                }

                public final void onClick(View view) {
                    ArrayList arrayList;
                    ClickAgent.onClick(view);
                    SelectedCardVM a = C74891b.m131455a(this.f168377a.f168376a);
                    List<C74826b> value = a.f168237g.getValue();
                    if (value != null) {
                        ArrayList arrayList2 = new ArrayList();
                        for (T t : value) {
                            if (t.f168177b) {
                                arrayList2.add(t);
                            }
                        }
                        ArrayList<C74826b> arrayList3 = arrayList2;
                        ArrayList arrayList4 = new ArrayList(C89070n.m154526a((Iterable) arrayList3, 10));
                        for (C74826b bVar : arrayList3) {
                            arrayList4.add(bVar.f168176a);
                        }
                        arrayList = arrayList4;
                    } else {
                        arrayList = C89086z.INSTANCE;
                    }
                    if (!arrayList.isEmpty()) {
                        a.f168234d = true;
                        a.mo117905a("send");
                        a.mo117906a(arrayList);
                        AbstractC89568bz unused = C89624i.m155555a(a.f168235e, C89546bf.f203267b, null, new SelectedCardVM.C74857b(a, arrayList, null), 2);
                    }
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.social.widget.card.view.b$g */
    static final class C74899g<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C74891b f168379a;

        static {
            Covode.recordClassIndex(87762);
        }

        C74899g(C74891b bVar) {
            this.f168379a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            List list = (List) obj;
            if (list != null) {
                PowerList powerList = this.f168379a.f168362c;
                if (powerList == null) {
                    C89219l.m154710a("recPowerList");
                }
                powerList.getState().mo28138b(list);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.social.widget.card.view.b$j */
    static final class C74902j<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C74891b f168382a;

        static {
            Covode.recordClassIndex(87765);
        }

        C74902j(C74891b bVar) {
            this.f168382a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            boolean z;
            Boolean bool = (Boolean) obj;
            TuxButton tuxButton = this.f168382a.f168363d;
            if (tuxButton == null) {
                C89219l.m154710a("primaryButton");
            }
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            tuxButton.setLoading(z);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.social.widget.card.AbstractC74782d
    /* renamed from: a */
    public final void mo117838a(AbstractC89172b<? super List<? extends IMUser>, C89391z> bVar) {
        C89219l.m154721d(bVar, "");
        this.f168360a = bVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.social.widget.card.view.b$b */
    static final class C74893b extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C74891b f168373a;

        static {
            Covode.recordClassIndex(87756);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74893b(C74891b bVar) {
            super(1);
            this.f168373a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23025b bVar) {
            C23025b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            bVar2.mo37416a(this.f168373a.mo117940f().getPrimary(), (AbstractC89172b<? super C23024a, C89391z>) null);
            bVar2.mo37418b(this.f168373a.mo117940f().getSecondary(), (AbstractC89172b<? super C23024a, C89391z>) null);
            bVar2.f54513b = this.f168373a.mo117940f().getBtnForceVertical();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.social.widget.card.view.b$d */
    static final class C74895d extends AbstractC89220m implements AbstractC89172b<C23013a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C74891b f168375a;

        static {
            Covode.recordClassIndex(87758);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74895d(C74891b bVar) {
            super(1);
            this.f168375a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23013a aVar) {
            AbstractC89171a<C89391z> aVar2;
            C89219l.m154721d(aVar, "");
            if (!C74891b.m131455a(this.f168375a).f168234d && (aVar2 = this.f168375a.f168361b) != null) {
                aVar2.invoke();
            }
            SelectedCardVM a = C74891b.m131455a(this.f168375a);
            if (!a.f168234d) {
                a.mo117905a("cancel");
                List<C74826b> value = a.f168238h.getValue();
                if (value != null) {
                    Iterator<T> it = value.iterator();
                    while (it.hasNext()) {
                        C74777c.m131288a(it.next().f168176a, a.f168231a, a.f168232b, C59256u.EnumC59257a.CLOSE, a.f168233c);
                    }
                }
            }
            a.f168245o.clear();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.social.widget.card.view.b$h */
    static final class C74900h<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C74891b f168380a;

        static {
            Covode.recordClassIndex(87763);
        }

        C74900h(C74891b bVar) {
            this.f168380a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            boolean z;
            Integer num = (Integer) obj;
            C23033f e = this.f168380a.mo117939e();
            if (e != null) {
                String string = this.f168380a.f168365f.mo117794a().getString(this.f168380a.mo117940f().getPrimary());
                C89219l.m154716b(string, "");
                if (num != null && num.intValue() == 0) {
                    z = false;
                } else {
                    z = true;
                }
                e.mo37430a(z);
                if (num.intValue() > 1) {
                    string = string + " (" + num + ')';
                }
                e.mo37429a(string);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.social.widget.card.AbstractC74782d
    /* renamed from: a */
    public final void mo117839a(List<? extends User> list) {
        int title;
        C89219l.m154721d(list, "");
        SelectedCardVM selectedCardVM = this.f168364e;
        if (selectedCardVM == null) {
            C89219l.m154710a("selectedCardVM");
        }
        C89219l.m154721d(list, "");
        C33943c<List<C74826b>> cVar = selectedCardVM.f168237g;
        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C74826b(it.next()));
        }
        cVar.postValue(arrayList);
        selectedCardVM.f168239i.postValue(Integer.valueOf(list.size()));
        Integer multiTitle = mo117940f().getMultiTitle();
        if (multiTitle != null) {
            title = multiTitle.intValue();
        } else {
            title = mo117940f().getTitle();
        }
        if (list.size() > 1) {
            TuxTextView tuxTextView = this.f168368i;
            if (tuxTextView == null) {
                C89219l.m154710a("titleView");
            }
            tuxTextView.setText(title);
            return;
        }
        TuxTextView tuxTextView2 = this.f168368i;
        if (tuxTextView2 == null) {
            C89219l.m154710a("titleView");
        }
        tuxTextView2.setText(mo117940f().getTitle());
    }

    public C74891b(C74743a aVar, int i) {
        C89219l.m154721d(aVar, "");
        this.f168365f = aVar;
        this.f168366g = i;
        AbstractC89244h a = C89250i.m154773a((AbstractC89171a) new C74898f(this));
        this.f168370k = a;
        PowerList powerList = new PowerList(aVar.mo117794a());
        powerList.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        powerList.setLayoutManager((LinearLayoutManager) a.getValue());
        powerList.mo28083a(RecUserSelectCell.class);
        this.f168362c = powerList;
        View view = null;
        View a2 = C1764a.m5927a(LayoutInflater.from(aVar.mo117794a()), R.layout.ar3, null, false);
        View findViewById = a2.findViewById(R.id.eit);
        C89219l.m154716b(findViewById, "");
        this.f168368i = (TuxTextView) findViewById;
        View findViewById2 = a2.findViewById(R.id.ai1);
        C89219l.m154716b(findViewById2, "");
        this.f168369j = (TuxTextView) findViewById2;
        TuxTextView tuxTextView = this.f168368i;
        if (tuxTextView == null) {
            C89219l.m154710a("titleView");
        }
        tuxTextView.setText(mo117940f().getTitle());
        TuxTextView tuxTextView2 = this.f168369j;
        if (tuxTextView2 == null) {
            C89219l.m154710a("descView");
        }
        tuxTextView2.setText(mo117940f().getDesc());
        C23023b a3 = C23035c.m43448a(aVar.mo117794a());
        C89219l.m154716b(a2, "");
        C23023b a4 = a3.mo37408a(new C23045a(a2));
        PowerList powerList2 = this.f168362c;
        if (powerList2 == null) {
            C89219l.m154710a("recPowerList");
        }
        this.f168367h = ((C23023b) C23028c.m43435a(C23019c.m43408a(a4, powerList2), new C74893b(this)).mo37484b(new C74894c(this)).mo37481a(new C74895d(this))).mo37405a();
        PowerList powerList3 = this.f168362c;
        if (powerList3 == null) {
            C89219l.m154710a("recPowerList");
        }
        ViewParent parent = powerList3.getParent();
        View view2 = parent instanceof View ? parent : view;
        if (view2 != null) {
            C23163i.m43668b(view2, 0, null, 0, null, false, 26);
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.weight = 1.0f;
            view2.setLayoutParams(layoutParams2);
        }
        C23013a aVar2 = this.f168367h;
        if (aVar2 == null) {
            C89219l.m154710a("attachDialog");
        }
        View findViewById3 = aVar2.f54483c.findViewById(R.id.a1m);
        C89219l.m154709a((Object) findViewById3, "");
        ViewGroup.LayoutParams layoutParams3 = findViewById3.getLayoutParams();
        Objects.requireNonNull(layoutParams3, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
        LinearLayout.LayoutParams layoutParams5 = layoutParams4;
        layoutParams5.weight = 0.0f;
        layoutParams5.height = -2;
        findViewById3.setLayoutParams(layoutParams4);
        C23033f e = mo117939e();
        if (e != null) {
            e.mo37428a(new C74896e(this));
        }
        AbstractC1174ac a5 = new C1175ad(aVar).mo3983a(SelectedCardVM.class);
        C89219l.m154716b(a5, "");
        SelectedCardVM selectedCardVM = (SelectedCardVM) a5;
        this.f168364e = selectedCardVM;
        if (selectedCardVM == null) {
            C89219l.m154710a("selectedCardVM");
        }
        String str = aVar.f168003b;
        C89219l.m154721d(str, "");
        selectedCardVM.f168231a = str;
        C89219l.m154721d("share_pop_up", "");
        selectedCardVM.f168232b = "share_pop_up";
        selectedCardVM.f168233c = C59256u.EnumC59259c.POP_UP;
        SelectedCardVM selectedCardVM2 = this.f168364e;
        if (selectedCardVM2 == null) {
            C89219l.m154710a("selectedCardVM");
        }
        selectedCardVM2.f168238h.observe(aVar, new C74899g(this));
        SelectedCardVM selectedCardVM3 = this.f168364e;
        if (selectedCardVM3 == null) {
            C89219l.m154710a("selectedCardVM");
        }
        selectedCardVM3.f168240j.observe(aVar, new C74900h(this));
        SelectedCardVM selectedCardVM4 = this.f168364e;
        if (selectedCardVM4 == null) {
            C89219l.m154710a("selectedCardVM");
        }
        selectedCardVM4.f168242l.observe(aVar, new C74901i(this));
        SelectedCardVM selectedCardVM5 = this.f168364e;
        if (selectedCardVM5 == null) {
            C89219l.m154710a("selectedCardVM");
        }
        selectedCardVM5.f168244n.observe(aVar, new C74902j(this));
    }
}
