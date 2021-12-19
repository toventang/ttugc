package com.p2082ss.android.ugc.aweme.p3070im.sdk.privacy.p3214b.p3215a;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.bytedance.tux.table.cell.TuxTextCell;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39257p;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.privacy.p3214b.p3218d.C55702a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.privacy.viewmodel.MessagingPrivacyViewModel;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.privacy.b.a.a */
public final class C55689a extends RecyclerView.AbstractC1350a<C55702a> {

    /* renamed from: d */
    public static final C55690a f127035d = new C55690a((byte) 0);

    /* renamed from: a */
    public int f127036a = -1;

    /* renamed from: b */
    public final MessagingPrivacyViewModel f127037b;

    /* renamed from: c */
    public final List<C39257p> f127038c;

    static {
        Covode.recordClassIndex(65472);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ C55702a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m101443a(viewGroup, i);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.privacy.b.a.a$a */
    public static final class C55690a {
        static {
            Covode.recordClassIndex(65473);
        }

        private C55690a() {
        }

        public /* synthetic */ C55690a(byte b) {
            this();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f127038c.size();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.privacy.b.a.a$b */
    static final class C55691b implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ C55689a f127039a;

        /* renamed from: b */
        final /* synthetic */ C39257p f127040b;

        static {
            Covode.recordClassIndex(65474);
        }

        C55691b(C55689a aVar, C39257p pVar) {
            this.f127039a = aVar;
            this.f127040b = pVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (z) {
                MessagingPrivacyViewModel messagingPrivacyViewModel = this.f127039a.f127037b;
                C39257p pVar = this.f127040b;
                C89219l.m154721d(pVar, "");
                messagingPrivacyViewModel.f127070d.setValue(pVar);
            }
        }
    }

    public C55689a(MessagingPrivacyViewModel messagingPrivacyViewModel, List<C39257p> list) {
        C89219l.m154721d(messagingPrivacyViewModel, "");
        C89219l.m154721d(list, "");
        this.f127037b = messagingPrivacyViewModel;
        this.f127038c = list;
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m101443a(ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(3105);
        C89219l.m154721d(viewGroup, "");
        Context context = viewGroup.getContext();
        C89219l.m154716b(context, "");
        C55702a aVar = new C55702a(new TuxTextCell(context, null, 0, 6));
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
        MethodCollector.m26664o(3105);
        return aVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005c, code lost:
        if (r0 != null) goto L_0x005e;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void onBindViewHolder(com.p2082ss.android.ugc.aweme.p3070im.sdk.privacy.p3214b.p3218d.C55702a r9, int r10) {
        /*
        // Method dump skipped, instructions count: 137
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.privacy.p3214b.p3215a.C55689a.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int, java.util.List] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onBindViewHolder(C55702a aVar, int i, List list) {
        C55702a aVar2 = aVar;
        C89219l.m154721d(aVar2, "");
        C89219l.m154721d(list, "");
        if (list.isEmpty()) {
            super.onBindViewHolder(aVar2, i, list);
            return;
        }
        Object obj = list.get(0);
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Boolean");
        aVar2.mo92579a(((Boolean) obj).booleanValue());
    }
}
