package com.p2082ss.android.ugc.aweme.tools.mvtemplate.thumbnail;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.shortvideo.C70636dh;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.AbstractC78837a;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.MvThemeData;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.thumbnail.a */
public final class C79000a extends RecyclerView.AbstractC1350a<C79002b> {

    /* renamed from: f */
    public static final C79001a f177533f = new C79001a((byte) 0);

    /* renamed from: a */
    public final List<MvThemeData> f177534a = new ArrayList();

    /* renamed from: b */
    public AbstractC78837a f177535b;

    /* renamed from: c */
    public AbstractC79003c f177536c;

    /* renamed from: d */
    public boolean f177537d = true;

    /* renamed from: e */
    public boolean f177538e = true;

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.thumbnail.a$c */
    public interface AbstractC79003c {
        static {
            Covode.recordClassIndex(92163);
        }

        /* renamed from: a */
        void mo122762a(int i);
    }

    static {
        Covode.recordClassIndex(92160);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ C79002b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m137827a(viewGroup, i);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.thumbnail.a$a */
    public static final class C79001a {
        static {
            Covode.recordClassIndex(92161);
        }

        private C79001a() {
        }

        public /* synthetic */ C79001a(byte b) {
            this();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f177534a.size() + 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemViewType(int i) {
        if (i == 0 || i == getItemCount() - 1) {
            return 0;
        }
        return 1;
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.thumbnail.a$d */
    static final class View$OnClickListenerC79004d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC79003c f177541a;

        /* renamed from: b */
        final /* synthetic */ C79002b f177542b;

        /* renamed from: c */
        final /* synthetic */ int f177543c;

        static {
            Covode.recordClassIndex(92164);
        }

        View$OnClickListenerC79004d(AbstractC79003c cVar, C79002b bVar, int i) {
            this.f177541a = cVar;
            this.f177542b = bVar;
            this.f177543c = i;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C89219l.m154716b(view, "");
            this.f177541a.mo122762a(this.f177543c - 1);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.thumbnail.a$b */
    public static final class C79002b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final SimpleDraweeView f177539a;

        /* renamed from: b */
        public final View f177540b;

        static {
            Covode.recordClassIndex(92162);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C79002b(View view) {
            super(view);
            C89219l.m154721d(view, "");
            View findViewById = view.findViewById(R.id.buh);
            C89219l.m154716b(findViewById, "");
            this.f177539a = (SimpleDraweeView) findViewById;
            View findViewById2 = view.findViewById(R.id.cg3);
            C89219l.m154716b(findViewById2, "");
            this.f177540b = findViewById2;
        }
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m137827a(ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(5488);
        C89219l.m154721d(viewGroup, "");
        View a2 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.aa8, viewGroup, false);
        C89219l.m154716b(a2, "");
        C79002b bVar = new C79002b(a2);
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
        MethodCollector.m26664o(5488);
        return bVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onBindViewHolder(C79002b bVar, int i) {
        AbstractC78837a aVar;
        C79002b bVar2 = bVar;
        C89219l.m154721d(bVar2, "");
        if (this.f177537d && getItemCount() - i <= 5 && (aVar = this.f177535b) != null) {
            aVar.mo122688a();
        }
        int i2 = 0;
        if (i == 0) {
            Context context = bVar2.f177539a.getContext();
            C89219l.m154716b(context, "");
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams((C70636dh.m124831b(context) / 2) - (C79005b.m137829a(context) / 2), 0);
            View view = bVar2.itemView;
            C89219l.m154716b(view, "");
            view.setLayoutParams(layoutParams);
        } else if (i == getItemCount() - 1) {
            Context context2 = bVar2.f177539a.getContext();
            C89219l.m154716b(context2, "");
            ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams((C70636dh.m124831b(context2) / 2) - (C79005b.m137829a(context2) / 2), -1);
            View view2 = bVar2.itemView;
            C89219l.m154716b(view2, "");
            view2.setLayoutParams(layoutParams2);
            bVar2.f177539a.setVisibility(8);
            View view3 = bVar2.f177540b;
            if (!this.f177538e) {
                i2 = 8;
            }
            view3.setVisibility(i2);
        } else {
            bVar2.f177539a.setImageURI(this.f177534a.get(i - 1).mo122673g());
            AbstractC79003c cVar = this.f177536c;
            if (cVar != null) {
                bVar2.f177539a.setOnClickListener(new View$OnClickListenerC79004d(cVar, bVar2, i));
            }
        }
    }
}
