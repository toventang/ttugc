package com.p2082ss.android.ugc.trill.setting;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.bytedance.tux.table.cell.AbstractC23293c;
import com.bytedance.tux.table.cell.TuxTextCell;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.trill.setting.j */
public final class C85146j extends RecyclerView.AbstractC1350a<C85148b> {

    /* renamed from: a */
    public AbstractC85147a f190501a;

    /* renamed from: b */
    private Context f190502b;

    /* renamed from: c */
    private List<C85149c> f190503c;

    /* renamed from: com.ss.android.ugc.trill.setting.j$a */
    public interface AbstractC85147a {
        static {
            Covode.recordClassIndex(99187);
        }

        /* renamed from: b */
        void mo130058b(int i);
    }

    static {
        Covode.recordClassIndex(99186);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ C85148b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m146402a(this, viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        List<C85149c> list = this.f190503c;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* renamed from: com.ss.android.ugc.trill.setting.j$d */
    static final class C85150d extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C85146j f190507a;

        /* renamed from: b */
        final /* synthetic */ C85149c f190508b;

        /* renamed from: c */
        final /* synthetic */ int f190509c;

        static {
            Covode.recordClassIndex(99190);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C85150d(C85146j jVar, C85149c cVar, int i) {
            super(0);
            this.f190507a = jVar;
            this.f190508b = cVar;
            this.f190509c = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            AbstractC85147a aVar = this.f190507a.f190501a;
            if (aVar != null) {
                aVar.mo130058b(this.f190509c);
            }
            return false;
        }
    }

    /* renamed from: a */
    public final void mo130074a(List<C85149c> list) {
        C89219l.m154721d(list, "");
        this.f190503c = list;
    }

    /* renamed from: com.ss.android.ugc.trill.setting.j$b */
    public static final class C85148b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public TuxTextCell f190504a;

        static {
            Covode.recordClassIndex(99188);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C85148b(View view) {
            super(view);
            C89219l.m154721d(view, "");
            View findViewById = view.findViewById(R.id.fgy);
            C89219l.m154716b(findViewById, "");
            this.f190504a = (TuxTextCell) findViewById;
        }
    }

    /* renamed from: com.ss.android.ugc.trill.setting.j$c */
    public static final class C85149c {

        /* renamed from: a */
        public final String f190505a;

        /* renamed from: b */
        public final boolean f190506b;

        static {
            Covode.recordClassIndex(99189);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C85149c)) {
                return false;
            }
            C85149c cVar = (C85149c) obj;
            return C89219l.m154714a(this.f190505a, cVar.f190505a) && this.f190506b == cVar.f190506b;
        }

        public final int hashCode() {
            String str = this.f190505a;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            boolean z = this.f190506b;
            if (z) {
                z = true;
            }
            int i = z ? 1 : 0;
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            return hashCode + i;
        }

        public final String toString() {
            return "VoiceItemData(title=" + this.f190505a + ", isChecked=" + this.f190506b + ")";
        }

        public C85149c(String str, boolean z) {
            C89219l.m154721d(str, "");
            this.f190505a = str;
            this.f190506b = z;
        }
    }

    public C85146j(Context context, AbstractC85147a aVar) {
        C89219l.m154721d(aVar, "");
        this.f190502b = context;
        this.f190501a = aVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onBindViewHolder(C85148b bVar, int i) {
        C85148b bVar2 = bVar;
        C89219l.m154721d(bVar2, "");
        List<C85149c> list = this.f190503c;
        if (list != null && !list.isEmpty()) {
            List<C85149c> list2 = this.f190503c;
            if (list2 == null) {
                C89219l.m154715b();
            }
            C85149c cVar = list2.get(i);
            bVar2.f190504a.setTitle(cVar.f190505a);
            AbstractC23293c.AbstractC23296b accessory = bVar2.f190504a.getAccessory();
            Objects.requireNonNull(accessory, "null cannot be cast to non-null type com.bytedance.tux.table.cell.TuxCellAccessory.Radio");
            AbstractC23293c.AbstractC23299e eVar = (AbstractC23293c.AbstractC23299e) accessory;
            eVar.mo37959c(cVar.f190506b);
            eVar.mo37958a(new C85150d(this, cVar, i));
            List<C85149c> list3 = this.f190503c;
            if (list3 == null) {
                C89219l.m154715b();
            }
            if (i != list3.size() - 1) {
                bVar2.f190504a.setWithSeparator(true);
            }
        }
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m146402a(C85146j jVar, ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(4793);
        C89219l.m154721d(viewGroup, "");
        View a2 = C1764a.m5927a(LayoutInflater.from(jVar.f190502b), R.layout.ay6, viewGroup, false);
        C89219l.m154716b(a2, "");
        C85148b bVar = new C85148b(a2);
        try {
            if (bVar.itemView.getParent() != null) {
                try {
                    a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(bVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) bVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(bVar.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = bVar.getClass().getName();
        MethodCollector.m26664o(4793);
        return bVar;
    }
}
