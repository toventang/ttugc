package com.p2082ss.android.ugc.aweme.account.agegate.p2236a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.bytedance.tux.table.cell.AbstractC23293c;
import com.bytedance.tux.table.cell.TuxTextCell;
import com.p2082ss.android.ugc.aweme.account.agegate.model.C31540a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.agegate.a.a */
public final class C31382a extends RecyclerView.AbstractC1350a<C31383a> {

    /* renamed from: a */
    public final List<C31540a> f75161a = new ArrayList();

    /* renamed from: b */
    public final Context f75162b;

    static {
        Covode.recordClassIndex(38090);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ C31383a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m65611a(this, viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f75161a.size();
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.a.a$a */
    public static final class C31383a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final TuxTextCell f75163a;

        static {
            Covode.recordClassIndex(38091);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31383a(View view) {
            super(view);
            C89219l.m154721d(view, "");
            View findViewById = view.findViewById(R.id.br);
            C89219l.m154716b(findViewById, "");
            this.f75163a = (TuxTextCell) findViewById;
        }
    }

    public C31382a(Context context) {
        C89219l.m154721d(context, "");
        this.f75162b = context;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onBindViewHolder(C31383a aVar, int i) {
        C31383a aVar2 = aVar;
        C89219l.m154721d(aVar2, "");
        C31540a aVar3 = this.f75161a.get(i);
        aVar2.f75163a.setTitle(aVar3.f75429b);
        TuxTextCell tuxTextCell = aVar2.f75163a;
        AbstractC23293c.C23308i iVar = new AbstractC23293c.C23308i(this.f75162b);
        iVar.mo37959c(aVar3.f75430c);
        iVar.mo37957a(new C31384b(iVar, this, aVar3, i));
        tuxTextCell.setAccessory(iVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.a.a$b */
    static final class C31384b implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC23293c.C23308i f75164a;

        /* renamed from: b */
        final /* synthetic */ C31382a f75165b;

        /* renamed from: c */
        final /* synthetic */ C31540a f75166c;

        /* renamed from: d */
        final /* synthetic */ int f75167d;

        static {
            Covode.recordClassIndex(38092);
        }

        C31384b(AbstractC23293c.C23308i iVar, C31382a aVar, C31540a aVar2, int i) {
            this.f75164a = iVar;
            this.f75165b = aVar;
            this.f75166c = aVar2;
            this.f75167d = i;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            boolean z2;
            C89219l.m154721d(compoundButton, "");
            if (this.f75164a.mo37960g()) {
                C31382a aVar = this.f75165b;
                int i = this.f75167d;
                int i2 = 0;
                for (T t : aVar.f75161a) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        C89070n.m154520a();
                    }
                    T t2 = t;
                    if (i2 == i) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    t2.f75430c = z2;
                    i2 = i3;
                }
                aVar.notifyDataSetChanged();
                AbstractC89171a<C89391z> aVar2 = this.f75166c.f75428a;
                if (aVar2 != null) {
                    aVar2.invoke();
                }
            }
        }
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m65611a(C31382a aVar, ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(11042);
        C89219l.m154721d(viewGroup, "");
        View a2 = C1764a.m5927a(LayoutInflater.from(aVar.f75162b), R.layout.fu, viewGroup, false);
        C89219l.m154716b(a2, "");
        C31383a aVar2 = new C31383a(a2);
        try {
            if (aVar2.itemView.getParent() != null) {
                try {
                    a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(aVar2.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) aVar2.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(aVar2.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = aVar2.getClass().getName();
        MethodCollector.m26664o(11042);
        return aVar2;
    }
}
