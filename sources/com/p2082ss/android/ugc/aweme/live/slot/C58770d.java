package com.p2082ss.android.ugc.aweme.live.slot;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1213t;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.slot.AbstractC6157ab;
import com.bytedance.android.live.slot.AbstractC6166b;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdk.AbstractC11293v;
import com.bytedance.android.livesdk.p562k.DialogC9146a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.live.slot.C58763c;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.live.slot.d */
public final class C58770d extends RecyclerView.AbstractC1350a<C58771a> {

    /* renamed from: a */
    public final List<AbstractC6157ab<IIconSlot, IIconSlot.SlotViewModel, IIconSlot.EnumC6149b>> f133755a = new ArrayList();

    /* renamed from: b */
    public final AbstractC11293v f133756b;

    /* renamed from: c */
    public final IIconSlot.EnumC6149b f133757c;

    /* renamed from: d */
    public final C58763c.C58766a f133758d;

    static {
        Covode.recordClassIndex(69078);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ C58771a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m107986a(viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f133755a.size();
    }

    /* renamed from: com.ss.android.ugc.aweme.live.slot.d$a */
    public static final class C58771a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final View f133759a;

        static {
            Covode.recordClassIndex(69079);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58771a(View view) {
            super(view);
            C89219l.m154721d(view, "");
            this.f133759a = view;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.live.slot.d$b */
    static final class C58772b<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C58771a f133760a;

        static {
            Covode.recordClassIndex(69080);
        }

        C58772b(C58771a aVar) {
            this.f133760a = aVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            String str = (String) obj;
            C89219l.m154721d(str, "");
            LiveTextView liveTextView = (LiveTextView) this.f133760a.f133759a.findViewById(R.id.title);
            C89219l.m154716b(liveTextView, "");
            liveTextView.setText(str);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.live.slot.d$c */
    static final class C58773c<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C58771a f133761a;

        static {
            Covode.recordClassIndex(69081);
        }

        C58773c(C58771a aVar) {
            this.f133761a = aVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Drawable drawable = (Drawable) obj;
            C89219l.m154721d(drawable, "");
            ((ImageView) this.f133761a.f133759a.findViewById(R.id.bh1)).setImageDrawable(drawable);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.live.slot.d$d */
    static final class C58774d<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C58771a f133762a;

        static {
            Covode.recordClassIndex(69082);
        }

        C58774d(C58771a aVar) {
            this.f133762a = aVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            String str = (String) obj;
            C89219l.m154721d(str, "");
            C58771a aVar = this.f133762a;
            if (str == null || str.length() <= 0) {
                LiveTextView liveTextView = (LiveTextView) aVar.f133759a.findViewById(R.id.ay3);
                C89219l.m154716b(liveTextView, "");
                liveTextView.setText((CharSequence) null);
                return;
            }
            LiveTextView liveTextView2 = (LiveTextView) aVar.f133759a.findViewById(R.id.ay3);
            C89219l.m154716b(liveTextView2, "");
            String a = C1764a.m5928a("(%s)", Arrays.copyOf(new Object[]{str}, 1));
            C89219l.m154716b(a, "");
            liveTextView2.setText(a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.live.slot.d$e */
    static final class View$OnClickListenerC58775e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C58770d f133763a;

        /* renamed from: b */
        final /* synthetic */ AbstractC6157ab f133764b;

        static {
            Covode.recordClassIndex(69083);
        }

        View$OnClickListenerC58775e(C58770d dVar, AbstractC6157ab abVar) {
            this.f133763a = dVar;
            this.f133764b = abVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:71:0x0236  */
        /* JADX WARNING: Removed duplicated region for block: B:78:0x0252  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r22) {
            /*
            // Method dump skipped, instructions count: 702
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.live.slot.C58770d.View$OnClickListenerC58775e.onClick(android.view.View):void");
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onBindViewHolder(C58771a aVar, int i) {
        AbstractC6157ab<IIconSlot, IIconSlot.SlotViewModel, IIconSlot.EnumC6149b> abVar;
        AbstractC1174ac acVar;
        C58771a aVar2 = aVar;
        C89219l.m154721d(aVar2, "");
        AbstractC6157ab<IIconSlot, IIconSlot.SlotViewModel, IIconSlot.EnumC6149b> abVar2 = this.f133755a.get(i);
        IIconSlot.SlotViewModel slotViewModel = null;
        if (!(abVar2 instanceof AbstractC6166b)) {
            abVar = null;
        } else {
            abVar = abVar2;
        }
        AbstractC6166b bVar = (AbstractC6166b) abVar;
        if (bVar != null) {
            acVar = bVar.f15402a;
        } else {
            acVar = null;
        }
        if (acVar instanceof IIconSlot.SlotViewModel) {
            slotViewModel = acVar;
        }
        IIconSlot.SlotViewModel slotViewModel2 = slotViewModel;
        if (slotViewModel2 != null) {
            C1213t<String> tVar = slotViewModel2.f15359j;
            if (tVar != null) {
                tVar.observe(this.f133756b, new C58772b(aVar2));
            }
            C1213t<Drawable> tVar2 = slotViewModel2.f15356g;
            if (tVar2 != null) {
                tVar2.observe(this.f133756b, new C58773c(aVar2));
            }
            C1213t<String> tVar3 = slotViewModel2.f15352c;
            if (tVar3 != null) {
                tVar3.observe(this.f133756b, new C58774d(aVar2));
            }
        }
        aVar2.f133759a.setOnClickListener(new View$OnClickListenerC58775e(this, abVar2));
        boolean z = true;
        int i2 = 0;
        if (i == getItemCount() - 1) {
            z = false;
        }
        View findViewById = aVar2.f133759a.findViewById(R.id.amc);
        C89219l.m154716b(findViewById, "");
        if (!z) {
            i2 = 8;
        }
        findViewById.setVisibility(i2);
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m107986a(ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(1183);
        C89219l.m154721d(viewGroup, "");
        View a2 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.bd_, viewGroup, false);
        C89219l.m154716b(a2, "");
        C58771a aVar = new C58771a(a2);
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
        MethodCollector.m26664o(1183);
        return aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.live.slot.d$f */
    public static final class DialogInterface$OnClickListenerC58776f implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C58770d f133765a;

        /* renamed from: b */
        final /* synthetic */ AbstractC6157ab f133766b;

        /* renamed from: c */
        final /* synthetic */ DialogC9146a f133767c;

        /* renamed from: d */
        final /* synthetic */ View f133768d;

        static {
            Covode.recordClassIndex(69084);
        }

        DialogInterface$OnClickListenerC58776f(C58770d dVar, AbstractC6157ab abVar, DialogC9146a aVar, View view) {
            this.f133765a = dVar;
            this.f133766b = abVar;
            this.f133767c = aVar;
            this.f133768d = view;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x00f1  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x00c4 A[ADDED_TO_REGION] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(final android.content.DialogInterface r13, int r14) {
            /*
            // Method dump skipped, instructions count: 270
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.live.slot.C58770d.DialogInterface$OnClickListenerC58776f.onClick(android.content.DialogInterface, int):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.live.slot.d$g */
    static final class DialogInterface$OnClickListenerC58779g implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C58770d f133780a;

        /* renamed from: b */
        final /* synthetic */ AbstractC6157ab f133781b;

        static {
            Covode.recordClassIndex(69087);
        }

        DialogInterface$OnClickListenerC58779g(C58770d dVar, AbstractC6157ab abVar) {
            this.f133780a = dVar;
            this.f133781b = abVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x00e5  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x00c6 A[ADDED_TO_REGION] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.content.DialogInterface r13, int r14) {
            /*
            // Method dump skipped, instructions count: 258
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.live.slot.C58770d.DialogInterface$OnClickListenerC58779g.onClick(android.content.DialogInterface, int):void");
        }
    }

    public C58770d(AbstractC11293v vVar, IIconSlot.EnumC6149b bVar, C58763c.C58766a aVar) {
        C89219l.m154721d(vVar, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(aVar, "");
        this.f133756b = vVar;
        this.f133757c = bVar;
        this.f133758d = aVar;
    }
}
