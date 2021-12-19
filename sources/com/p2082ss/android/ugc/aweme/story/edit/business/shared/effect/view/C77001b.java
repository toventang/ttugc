package com.p2082ss.android.ugc.aweme.story.edit.business.shared.effect.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.effect.EffectModel;
import com.p2082ss.android.ugc.aweme.effect.p2888a.AbstractC46264a;
import com.p2082ss.android.ugc.aweme.effect.p2889b.C46300a;
import com.p2082ss.android.ugc.aweme.effect.p2889b.p2890a.AbstractC46311b;
import com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.effectmanager.common.model.UrlModel;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.effect.view.b */
public final class C77001b extends AbstractC46264a<C77004c> implements AbstractC46311b {

    /* renamed from: g */
    public static final Effect f172756g;

    /* renamed from: h */
    public static final C77002a f172757h = new C77002a((byte) 0);

    /* renamed from: a */
    public List<Effect> f172758a = new ArrayList();

    /* renamed from: b */
    public int f172759b;

    /* renamed from: d */
    public int f172760d = -1;

    /* renamed from: e */
    public final C46300a f172761e;

    /* renamed from: f */
    public final AbstractC89187q<Effect, EffectModel, Integer, C89391z> f172762f;

    /* renamed from: i */
    private final C77003b f172763i = new C77003b(this);

    /* renamed from: j */
    private final RecyclerView f172764j;

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m134615a(this, viewGroup, i);
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.effect.view.b$a */
    public static final class C77002a {
        static {
            Covode.recordClassIndex(90001);
        }

        private C77002a() {
        }

        public /* synthetic */ C77002a(byte b) {
            this();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f107835c.size();
    }

    static {
        Covode.recordClassIndex(90000);
        Effect effect = new Effect(null, 1, null);
        effect.setName("");
        effect.setHint("");
        effect.setEffectId("-1");
        effect.setIconUrl(new UrlModel(new com.p2082ss.ugc.effectplatform.model.UrlModel(C89070n.m154516a(""), null, 2, null)));
        effect.setUnzipPath("");
        effect.setExtra("");
        f172756g = effect;
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.effect.view.b$b */
    public static final class C77003b implements AbstractC89172b<Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C77001b f172765a;

        static {
            Covode.recordClassIndex(90002);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C77003b(C77001b bVar) {
            this.f172765a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Integer num) {
            mo120546a(num.intValue());
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public final void mo120546a(int i) {
            this.f172765a.f172760d = i;
            if (i != this.f172765a.f172759b) {
                if (i == 0) {
                    this.f172765a.f172762f.invoke(null, null, Integer.valueOf(i));
                    return;
                }
                EffectModel effectModel = this.f172765a.f107835c.get(i);
                Effect effect = (Effect) C89070n.m154561b((List) this.f172765a.f172758a, i);
                if (effect != null) {
                    this.f172765a.mo120545c(i);
                    AbstractC46415f a = C46300a.C46301a.m89337a();
                    if (a == null || !a.mo78914a(effect)) {
                        this.f172765a.f172761e.mo78790a(effect);
                    } else {
                        this.f172765a.f172762f.invoke(effect, effectModel, Integer.valueOf(i));
                    }
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.effect.p2889b.p2890a.AbstractC46311b
    /* renamed from: a */
    public final void mo78804a(Effect effect) {
        C89219l.m154721d(effect, "");
        int indexOf = this.f172758a.indexOf(effect);
        if (indexOf >= 0) {
            mo78739a(indexOf, 8);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.effect.p2889b.p2890a.AbstractC46311b
    /* renamed from: b */
    public final void mo78805b(Effect effect) {
        C89219l.m154721d(effect, "");
        int indexOf = this.f172758a.indexOf(effect);
        if (indexOf >= 0) {
            mo78739a(indexOf, 16);
            if (indexOf == this.f172760d) {
                this.f172763i.mo120546a(indexOf);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.effect.p2889b.p2890a.AbstractC46311b
    /* renamed from: c */
    public final void mo78806c(Effect effect) {
        int indexOf;
        if (effect != null && (indexOf = this.f172758a.indexOf(effect)) >= 0) {
            mo78739a(indexOf, 32);
        }
    }

    /* renamed from: b */
    public final void mo120544b(int i) {
        int i2;
        this.f172760d = -1;
        if (i >= 0 && i < this.f107835c.size() && i != (i2 = this.f172759b)) {
            notifyItemChanged(i2, false);
            this.f172759b = i;
            notifyItemChanged(i, true);
        }
    }

    /* renamed from: a */
    public final int mo120542a(EffectModel effectModel) {
        int i = 0;
        if (effectModel != null) {
            Iterator<EffectModel> it = this.f107835c.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                } else if (C89219l.m154714a((Object) it.next().key, (Object) effectModel.key)) {
                    break;
                } else {
                    i2++;
                }
            }
            i = Math.max(0, i2);
        }
        mo120544b(i);
        return i;
    }

    /* renamed from: c */
    public final void mo120545c(int i) {
        if (C63244g.m114602a().mo73278f().mo73334c() >= 0 && i < this.f172758a.size()) {
            int size = this.f172758a.size();
            for (int i2 = i + 1; i2 < size; i2++) {
                AbstractC46415f a = C46300a.C46301a.m89337a();
                if (a == null || !a.mo78914a(this.f172758a.get(i2))) {
                    if (i2 != -1) {
                        this.f172761e.mo78790a(this.f172758a.get(i2));
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final EffectModel mo120543a(String str) {
        T t = null;
        if (str == null) {
            return null;
        }
        Iterator<T> it = this.f107835c.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (C89219l.m154714a((Object) next.key, (Object) str)) {
                t = next;
                break;
            }
        }
        return t;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(C77004c cVar, int i) {
        C89219l.m154721d(cVar, "");
        if (i == 0) {
            cVar.mo120547a(i, null, 4, this.f172759b);
            return;
        }
        cVar.mo120547a(i, this.f107835c.get(i), mo78738a(i), this.f172759b);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.f.a.q<? super com.ss.android.ugc.effectmanager.effect.model.Effect, ? super com.ss.android.ugc.aweme.effect.EffectModel, ? super java.lang.Integer, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C77001b(RecyclerView recyclerView, C46300a aVar, AbstractC89187q<? super Effect, ? super EffectModel, ? super Integer, C89391z> qVar) {
        super(recyclerView, aVar);
        C89219l.m154721d(recyclerView, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(qVar, "");
        this.f172764j = recyclerView;
        this.f172761e = aVar;
        this.f172762f = qVar;
        aVar.mo78789a(this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List list) {
        C77004c cVar = (C77004c) viewHolder;
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(list, "");
        if (list.isEmpty()) {
            onBindViewHolder(cVar, i);
            return;
        }
        Object obj = list.get(0);
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Boolean");
        cVar.mo120548a(((Boolean) obj).booleanValue());
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m134615a(C77001b bVar, ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(4886);
        C89219l.m154721d(viewGroup, "");
        View a2 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.b2a, viewGroup, false);
        C89219l.m154716b(a2, "");
        C77004c cVar = new C77004c(a2, bVar.f172763i);
        try {
            if (cVar.itemView.getParent() != null) {
                try {
                    a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(cVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) cVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(cVar.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = cVar.getClass().getName();
        MethodCollector.m26664o(4886);
        return cVar;
    }
}
