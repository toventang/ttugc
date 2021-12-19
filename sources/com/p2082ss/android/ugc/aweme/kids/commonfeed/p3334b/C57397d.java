package com.p2082ss.android.ugc.aweme.kids.commonfeed.p3334b;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.services.apm.api.C22708a;
import com.bytedance.tux.table.cell.AbstractC23293c;
import com.bytedance.tux.table.cell.TuxTextCell;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.kids.common.p3330c.C57355f;
import com.p2082ss.android.ugc.aweme.kids.commonfeed.report.p3346a.C57459a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.b.d */
public final class C57397d extends RecyclerView.AbstractC1350a<C57398a> {

    /* renamed from: a */
    public final List<C57459a> f130844a = new ArrayList();

    /* renamed from: b */
    public final Context f130845b;

    static {
        Covode.recordClassIndex(67317);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final long getItemId(int i) {
        return (long) i;
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ C57398a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m104017a(this, viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f130844a.size();
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.b.d$a */
    public static final class C57398a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final TuxTextCell f130846a;

        static {
            Covode.recordClassIndex(67318);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57398a(View view) {
            super(view);
            C89219l.m154721d(view, "");
            View findViewById = view.findViewById(R.id.df5);
            C89219l.m154716b(findViewById, "");
            this.f130846a = (TuxTextCell) findViewById;
        }
    }

    public C57397d(Context context) {
        C89219l.m154721d(context, "");
        this.f130845b = context;
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.b.d$c */
    static final class C57400c extends AbstractC89220m implements AbstractC89172b<ImageView, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C20766v f130849a;

        static {
            Covode.recordClassIndex(67320);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57400c(C20766v vVar) {
            super(1);
            this.f130849a = vVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(ImageView imageView) {
            ImageView imageView2 = imageView;
            C89219l.m154721d(imageView2, "");
            ViewGroup.LayoutParams layoutParams = imageView2.getLayoutParams();
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            layoutParams.width = C89241a.m154730a(TypedValue.applyDimension(1, 20.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            C89219l.m154709a((Object) system2, "");
            layoutParams.height = C89241a.m154730a(TypedValue.applyDimension(1, 20.0f, system2.getDisplayMetrics()));
            imageView2.setLayoutParams(layoutParams);
            C20766v vVar = this.f130849a;
            vVar.f49093F = imageView2;
            vVar.mo34186c();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.b.d$b */
    static final class C57399b implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC23293c.C23298d f130847a;

        /* renamed from: b */
        final /* synthetic */ C57459a f130848b;

        static {
            Covode.recordClassIndex(67319);
        }

        C57399b(AbstractC23293c.C23298d dVar, C57459a aVar) {
            this.f130847a = dVar;
            this.f130848b = aVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            C89219l.m154721d(compoundButton, "");
            AbstractC89172b<? super Boolean, C89391z> bVar = this.f130848b.f131025a;
            if (bVar != null) {
                bVar.invoke(Boolean.valueOf(this.f130847a.mo37960g()));
            }
            if (this.f130847a.mo37960g()) {
                C57355f.m103962a("choose_report_reason", new C33743c().mo59976a("object_type", "video").mo59976a("reason_id", String.valueOf(this.f130848b.f131029e)).mo59977a());
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0047  */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void onBindViewHolder(com.p2082ss.android.ugc.aweme.kids.commonfeed.p3334b.C57397d.C57398a r6, int r7) {
        /*
        // Method dump skipped, instructions count: 108
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.kids.commonfeed.p3334b.C57397d.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m104017a(C57397d dVar, ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(6591);
        C89219l.m154721d(viewGroup, "");
        View a2 = C1764a.m5927a(LayoutInflater.from(dVar.f130845b), R.layout.ad0, viewGroup, false);
        C89219l.m154716b(a2, "");
        C57398a aVar = new C57398a(a2);
        try {
            if (aVar.itemView.getParent() != null) {
                try {
                    a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(aVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) aVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(aVar.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = aVar.getClass().getName();
        MethodCollector.m26664o(6591);
        return aVar;
    }
}
