package com.p2082ss.android.ugc.aweme.account.login.p2254a;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C0643b;
import androidx.core.content.p032a.C0637f;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.account.experiment.C31650h;
import com.p2082ss.android.ugc.aweme.account.login.p2254a.C31818d;
import com.p2082ss.android.ugc.aweme.account.login.p2254a.C31844m;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.a.j */
public final class C31840j extends RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> {

    /* renamed from: b */
    public static final C31841a f76089b = new C31841a((byte) 0);

    /* renamed from: a */
    public AbstractC31817c f76090a;

    /* renamed from: c */
    private AbstractC31843l f76091c;

    /* renamed from: d */
    private final Set<Integer> f76092d = new LinkedHashSet();

    /* renamed from: e */
    private final List<C31828h> f76093e;

    /* renamed from: f */
    private final boolean f76094f;

    /* renamed from: g */
    private final int f76095g;

    /* renamed from: h */
    private final boolean f76096h;

    /* renamed from: i */
    private final boolean f76097i;

    static {
        Covode.recordClassIndex(38582);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m66178a(this, viewGroup, i);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.a.j$a */
    public static final class C31841a {
        static {
            Covode.recordClassIndex(38583);
        }

        private C31841a() {
        }

        public /* synthetic */ C31841a(byte b) {
            this();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f76093e.size();
    }

    /* renamed from: a */
    public final void mo57782a(AbstractC31843l lVar) {
        C89219l.m154721d(lVar, "");
        this.f76091c = lVar;
    }

    /* renamed from: a */
    public final void mo57783a(List<Integer> list) {
        C89219l.m154721d(list, "");
        this.f76092d.clear();
        this.f76092d.addAll(list);
    }

    /* renamed from: b */
    public final void mo57784b(List<? extends C31828h> list) {
        C89219l.m154721d(list, "");
        this.f76093e.clear();
        this.f76093e.addAll(list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemViewType(int i) {
        Object b = C89070n.m154561b((List) this.f76093e, i);
        if (C89219l.m154714a(b, C31827g.f76065a)) {
            return 0;
        }
        if (C89219l.m154714a(b, C31816b.f76045a)) {
            return 3;
        }
        if (C89219l.m154714a(b, C31842k.f76098a)) {
            return 2;
        }
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        C89219l.m154721d(viewHolder, "");
        if (getItemViewType(i) == 1) {
            C31826f fVar = (C31826f) viewHolder;
            C31828h hVar = this.f76093e.get(i);
            C31815a aVar = new C31815a(this.f76092d.contains(Integer.valueOf(i)), (long) (((i - this.f76095g) - 1) * 50));
            C89219l.m154721d(hVar, "");
            C89219l.m154721d(aVar, "");
            fVar.f76060a.setImageResource(hVar.f76067b);
            fVar.f76064e.setOnClickListener(hVar.f76068c);
            if (aVar.f76043a) {
                fVar.f76064e.setAlpha(0.0f);
            } else {
                fVar.f76064e.setAlpha(1.0f);
            }
            if (hVar.f76070e) {
                fVar.f76062c.setTextColor(C0643b.m2378c(fVar.f76064e.getContext(), R.color.l));
                fVar.f76060a.setColorFilter(C0643b.m2378c(fVar.f76064e.getContext(), R.color.l), PorterDuff.Mode.SRC_IN);
                fVar.f76061b.setBackground(C0643b.m2369a(fVar.f76064e.getContext(), (int) R.drawable.ig));
            }
            String string = fVar.f76064e.getContext().getString(hVar.f76069d);
            C89219l.m154716b(string, "");
            fVar.f76062c.setText(string);
            float measureText = fVar.f76062c.getPaint().measureText(string);
            if (C13628n.m24520b(fVar.f76064e.getContext(), 96.0f) + measureText > fVar.f76063d) {
                ViewGroup.LayoutParams layoutParams = fVar.f76062c.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ConstraintLayout.C0547a aVar2 = (ConstraintLayout.C0547a) layoutParams;
                aVar2.f2233J = 0;
                aVar2.f2278p = R.id.bh1;
                aVar2.f2267e = R.id.bh1;
                aVar2.f2279q = -1;
                aVar2.f2266d = -1;
                if (measureText + C13628n.m24520b(fVar.f76064e.getContext(), 58.0f) > fVar.f76063d) {
                    fVar.f76064e.setPadding(fVar.f76064e.getPaddingLeft(), (int) C13628n.m24520b(fVar.f76064e.getContext(), 8.0f), fVar.f76064e.getPaddingRight(), (int) C13628n.m24520b(fVar.f76064e.getContext(), 8.0f));
                }
                aVar2.leftMargin = (int) C13628n.m24520b(fVar.f76064e.getContext(), 12.0f);
                int i3 = Build.VERSION.SDK_INT;
                aVar2.setMarginStart(aVar2.leftMargin);
            } else {
                ViewGroup.LayoutParams layoutParams2 = fVar.f76062c.getLayoutParams();
                Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ConstraintLayout.C0547a aVar3 = (ConstraintLayout.C0547a) layoutParams2;
                aVar3.f2233J = 1;
                aVar3.f2278p = -1;
                aVar3.f2267e = -1;
                aVar3.f2279q = 0;
                aVar3.f2266d = 0;
                fVar.f76064e.setPadding(fVar.f76064e.getPaddingLeft(), (int) C13628n.m24520b(fVar.f76064e.getContext(), 13.0f), fVar.f76064e.getPaddingRight(), (int) C13628n.m24520b(fVar.f76064e.getContext(), 13.0f));
                aVar3.leftMargin = 0;
                int i4 = Build.VERSION.SDK_INT;
                aVar3.setMarginStart(0);
            }
            fVar.f76062c.setLayoutParams(fVar.f76062c.getLayoutParams());
            if (!aVar.f76043a) {
                fVar.f76064e.setAlpha(1.0f);
            } else if (fVar.f76064e.getAlpha() != 1.0f) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(fVar.f76064e, "alpha", 0.0f, 1.0f);
                C89219l.m154716b(ofFloat, "");
                ofFloat.setDuration(300L);
                ofFloat.setStartDelay(aVar.f76044b);
                ofFloat.start();
            }
        } else if (getItemViewType(i) == 2) {
            C31844m mVar = (C31844m) viewHolder;
            AbstractC31843l lVar = this.f76091c;
            mVar.f76099a = lVar;
            ((View) mVar.f76100b.getValue()).setOnClickListener(new C31844m.View$OnClickListenerC31845a(lVar));
        } else if (getItemViewType(i) == 3) {
            C31818d dVar = (C31818d) viewHolder;
            AbstractC31817c cVar = this.f76090a;
            dVar.f76047b = cVar;
            View view = dVar.itemView;
            C89219l.m154716b(view, "");
            Context context = view.getContext();
            dVar.mo57770b().setOnClickListener(new C31818d.View$OnClickListenerC31819a(cVar));
            dVar.mo57771c().setText(context.getString(R.string.c9b));
            C31650h hVar2 = C31650h.f75706b;
            View view2 = dVar.itemView;
            C89219l.m154716b(view2, "");
            Context context2 = view2.getContext();
            C89219l.m154716b(context2, "");
            String a = hVar2.mo57653a(context2);
            if (a != null) {
                dVar.mo57771c().setText(a);
            }
            TuxTextView tuxTextView = (TuxTextView) dVar.f76046a.getValue();
            if (C31650h.f75706b.mo57654a()) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            tuxTextView.setVisibility(i2);
            if (C31650h.f75706b.mo57655b()) {
                ConstraintLayout b = dVar.mo57770b();
                View view3 = dVar.itemView;
                C89219l.m154716b(view3, "");
                b.setBackgroundColor(C0637f.m2349b(view3.getResources(), R.color.bh, null));
                TextView c = dVar.mo57771c();
                View view4 = dVar.itemView;
                C89219l.m154716b(view4, "");
                c.setTextColor(C0637f.m2349b(view4.getResources(), R.color.a9, null));
            } else {
                ConstraintLayout b2 = dVar.mo57770b();
                View view5 = dVar.itemView;
                C89219l.m154716b(view5, "");
                b2.setBackgroundColor(C0637f.m2349b(view5.getResources(), R.color.t, null));
                ConstraintLayout b3 = dVar.mo57770b();
                View view6 = dVar.itemView;
                C89219l.m154716b(view6, "");
                b3.setBackground(C0643b.m2369a(view6.getContext(), (int) R.drawable.hr));
                TextView c2 = dVar.mo57771c();
                View view7 = dVar.itemView;
                C89219l.m154716b(view7, "");
                c2.setTextColor(C0637f.m2349b(view7.getResources(), R.color.bx, null));
            }
            dVar.mo57769a().setVisibility(8);
            if (C31650h.f75706b.mo57656d()) {
                C89219l.m154716b(context, "");
                dVar.mo57769a().setImageDrawable(C0637f.m2348a(context.getResources(), R.drawable.it, null));
                dVar.mo57769a().setVisibility(0);
            }
        }
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m66178a(C31840j jVar, ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder viewHolder;
        boolean a;
        int i2;
        int i3;
        MethodCollector.m26663i(10859);
        C89219l.m154721d(viewGroup, "");
        if (i == 0) {
            LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
            if (jVar.f76097i) {
                i2 = R.layout.gt;
            } else {
                i2 = R.layout.gs;
            }
            View a2 = C1764a.m5927a(from, i2, viewGroup, false);
            C89219l.m154716b(a2, "");
            viewHolder = new C31824e(a2, jVar.f76094f);
        } else if (i == 2) {
            LayoutInflater from2 = LayoutInflater.from(viewGroup.getContext());
            if (jVar.f76097i) {
                i3 = R.layout.go;
            } else {
                i3 = R.layout.gn;
            }
            View a3 = C1764a.m5927a(from2, i3, viewGroup, false);
            C89219l.m154716b(a3, "");
            viewHolder = new C31844m(a3);
        } else if (i != 3) {
            View a4 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.gm, viewGroup, false);
            C89219l.m154716b(a4, "");
            viewHolder = new C31826f(a4);
        } else {
            View a5 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.gk, viewGroup, false);
            C89219l.m154716b(a5, "");
            viewHolder = new C31818d(a5);
        }
        try {
            if (viewHolder.itemView.getParent() != null) {
                try {
                    a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(viewHolder.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) viewHolder.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(viewHolder.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = viewHolder.getClass().getName();
        MethodCollector.m26664o(10859);
        return viewHolder;
    }

    public C31840j(List<C31828h> list, boolean z, int i, boolean z2, boolean z3) {
        C89219l.m154721d(list, "");
        this.f76093e = list;
        this.f76094f = z;
        this.f76095g = i;
        this.f76096h = z2;
        this.f76097i = z3;
    }
}
