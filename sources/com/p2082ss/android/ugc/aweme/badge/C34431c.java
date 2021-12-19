package com.p2082ss.android.ugc.aweme.badge;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.loader.SmartCircleImageView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.services.apm.api.C22708a;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.badge.c */
public final class C34431c extends RecyclerView.AbstractC1350a<C34433b> {

    /* renamed from: c */
    public static Integer f81364c;

    /* renamed from: d */
    public static String f81365d;

    /* renamed from: e */
    public static final C34432a f81366e = new C34432a((byte) 0);

    /* renamed from: a */
    public AbstractC34450j f81367a;

    /* renamed from: b */
    public final List<C34448h> f81368b;

    /* renamed from: f */
    private final User f81369f;

    static {
        Covode.recordClassIndex(41379);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ C34433b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m70414a(viewGroup, i);
    }

    /* renamed from: com.ss.android.ugc.aweme.badge.c$a */
    public static final class C34432a {
        static {
            Covode.recordClassIndex(41380);
        }

        private C34432a() {
        }

        public /* synthetic */ C34432a(byte b) {
            this();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        List<C34448h> list = this.f81368b;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* renamed from: com.ss.android.ugc.aweme.badge.c$b */
    public static final class C34433b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final String f81370a = "EditProfileBadgeAdapter";

        /* renamed from: b */
        SmartCircleImageView f81371b;

        /* renamed from: c */
        SmartImageView f81372c;

        /* renamed from: d */
        TuxTextView f81373d;

        /* renamed from: e */
        private ConstraintLayout f81374e;

        static {
            Covode.recordClassIndex(41381);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34433b(View view) {
            super(view);
            C89219l.m154721d(view, "");
            this.f81371b = (SmartCircleImageView) view.findViewById(R.id.ar6);
            this.f81372c = (SmartImageView) view.findViewById(R.id.ar9);
            this.f81373d = (TuxTextView) view.findViewById(R.id.ar8);
            this.f81374e = (ConstraintLayout) view.findViewById(R.id.ar7);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.badge.c$c */
    static final class View$OnClickListenerC34434c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C34431c f81375a;

        /* renamed from: b */
        final /* synthetic */ int f81376b;

        static {
            Covode.recordClassIndex(41382);
        }

        View$OnClickListenerC34434c(C34431c cVar, int i) {
            this.f81375a = cVar;
            this.f81376b = i;
        }

        public final void onClick(View view) {
            C34448h hVar;
            ClickAgent.onClick(view);
            C34431c.f81364c = Integer.valueOf(this.f81376b);
            AbstractC34450j jVar = this.f81375a.f81367a;
            List<C34448h> list = this.f81375a.f81368b;
            if (list != null) {
                hVar = (C34448h) C89070n.m154561b((List) list, this.f81376b);
            } else {
                hVar = null;
            }
            jVar.mo60866a(hVar);
            this.f81375a.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m70414a(ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(5641);
        C89219l.m154721d(viewGroup, "");
        View a2 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.ayn, viewGroup, false);
        C89219l.m154716b(a2, "");
        C34433b bVar = new C34433b(a2);
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
        MethodCollector.m26664o(5641);
        return bVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b1, code lost:
        if (p4600h.p4611f.p4613b.C89219l.m154714a((java.lang.Object) r1, (java.lang.Object) r0) != false) goto L_0x00b3;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void onBindViewHolder(com.p2082ss.android.ugc.aweme.badge.C34431c.C34433b r6, int r7) {
        /*
        // Method dump skipped, instructions count: 219
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.badge.C34431c.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003c, code lost:
        if (r0 == null) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C34431c(com.p2082ss.android.ugc.aweme.badge.AbstractC34450j r3, java.util.List<com.p2082ss.android.ugc.aweme.badge.C34448h> r4, com.p2082ss.android.ugc.aweme.profile.model.User r5) {
        /*
            r2 = this;
            java.lang.String r0 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r3, r0)
            p4600h.p4611f.p4613b.C89219l.m154721d(r5, r0)
            r2.<init>()
            r2.f81367a = r3
            r2.f81368b = r4
            r2.f81369f = r5
            com.ss.android.ugc.aweme.profile.model.ProfileBadgeStruct r0 = r5.getProfileBadge()
            r1 = 0
            if (r0 == 0) goto L_0x0047
            java.lang.String r0 = r0.getUrl()
            if (r0 == 0) goto L_0x0047
            com.ss.android.ugc.aweme.profile.model.ProfileBadgeStruct r0 = r5.getProfileBadge()
            if (r0 == 0) goto L_0x0047
            boolean r0 = r0.getShouldShow()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            if (r0 == 0) goto L_0x0047
            com.ss.android.ugc.aweme.profile.model.ProfileBadgeStruct r0 = r5.getProfileBadge()
            if (r0 == 0) goto L_0x005c
            boolean r0 = r0.getShouldShow()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            if (r0 != 0) goto L_0x0041
        L_0x003e:
            p4600h.p4611f.p4613b.C89219l.m154715b()
        L_0x0041:
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0051
        L_0x0047:
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            com.p2082ss.android.ugc.aweme.badge.C34431c.f81364c = r0
        L_0x004e:
            com.p2082ss.android.ugc.aweme.badge.C34431c.f81365d = r1
            return
        L_0x0051:
            com.ss.android.ugc.aweme.profile.model.ProfileBadgeStruct r0 = r5.getProfileBadge()
            if (r0 == 0) goto L_0x004e
            java.lang.String r1 = r0.getUrl()
            goto L_0x004e
        L_0x005c:
            r0 = r1
            goto L_0x003e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.badge.C34431c.<init>(com.ss.android.ugc.aweme.badge.j, java.util.List, com.ss.android.ugc.aweme.profile.model.User):void");
    }
}
