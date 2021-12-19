package com.p2082ss.android.ugc.aweme.view.p4229a;

import android.graphics.Color;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.lighten.p1477a.EnumC20767w;
import com.bytedance.services.apm.api.C22708a;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.model.api.p3459a.C60107b;
import com.p2082ss.android.ugc.aweme.model.api.p3459a.C60113g;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.view.a.h */
public final class C81140h extends RecyclerView.AbstractC1350a<C81143c> {

    /* renamed from: c */
    public static final C81141a f181325c = new C81141a((byte) 0);

    /* renamed from: a */
    public List<C60107b> f181326a;

    /* renamed from: b */
    public AbstractC81142b f181327b;

    /* renamed from: com.ss.android.ugc.aweme.view.a.h$b */
    public interface AbstractC81142b {
        static {
            Covode.recordClassIndex(94470);
        }

        /* renamed from: a */
        void mo124598a();

        /* renamed from: a */
        void mo124599a(C60107b bVar);
    }

    static {
        Covode.recordClassIndex(94468);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemViewType(int i) {
        return i == 0 ? 0 : 1;
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ C81143c onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m140895a(viewGroup, i);
    }

    /* renamed from: com.ss.android.ugc.aweme.view.a.h$a */
    public static final class C81141a {
        static {
            Covode.recordClassIndex(94469);
        }

        private C81141a() {
        }

        public /* synthetic */ C81141a(byte b) {
            this();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f181326a.size() + 1;
    }

    /* renamed from: com.ss.android.ugc.aweme.view.a.h$c */
    public static final class C81143c extends RecyclerView.ViewHolder {

        /* renamed from: a */
        private final SmartImageView f181328a;

        /* renamed from: b */
        private final FrameLayout f181329b;

        static {
            Covode.recordClassIndex(94471);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.view.a.h$c$a */
        public static final class View$OnClickListenerC81144a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ AbstractC81142b f181330a;

            /* renamed from: b */
            final /* synthetic */ C60107b f181331b;

            static {
                Covode.recordClassIndex(94472);
            }

            View$OnClickListenerC81144a(AbstractC81142b bVar, C60107b bVar2) {
                this.f181330a = bVar;
                this.f181331b = bVar2;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                this.f181330a.mo124599a(this.f181331b);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.view.a.h$c$b */
        public static final class View$OnClickListenerC81145b implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ AbstractC81142b f181332a;

            static {
                Covode.recordClassIndex(94473);
            }

            View$OnClickListenerC81145b(AbstractC81142b bVar) {
                this.f181332a = bVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                this.f181332a.mo124598a();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C81143c(View view) {
            super(view);
            C89219l.m154721d(view, "");
            this.f181328a = (SmartImageView) view.findViewById(R.id.d95);
            this.f181329b = (FrameLayout) view.findViewById(R.id.d96);
        }

        /* renamed from: a */
        private final void m140899a(AbstractC81142b bVar) {
            View findViewById = this.itemView.findViewById(R.id.d93);
            C89219l.m154716b(findViewById, "");
            View view = this.itemView;
            C89219l.m154716b(view, "");
            ((TuxTextView) findViewById).setText(view.getContext().getString(R.string.a0g));
            ((TuxIconView) this.itemView.findViewById(R.id.d92)).setIconRes(R.raw.icon_plus_small);
            this.itemView.setOnClickListener(new View$OnClickListenerC81145b(bVar));
        }

        /* renamed from: a */
        private final void m140898a(C60107b bVar, AbstractC81142b bVar2) {
            UrlModel thumbnailUrl;
            List<String> urlList;
            String str;
            this.itemView.setOnClickListener(new View$OnClickListenerC81144a(bVar2, bVar));
            try {
                String background_color = bVar.getBackground_color();
                if (background_color == null || background_color.length() == 0) {
                    str = "#A5E6FF";
                } else {
                    str = bVar.getBackground_color();
                }
                this.f181329b.setBackgroundColor(Color.parseColor(str));
            } catch (Exception unused) {
            }
            List<C60113g> staticImage = bVar.getStaticImage();
            if (staticImage != null && (true ^ staticImage.isEmpty()) && (thumbnailUrl = staticImage.get(0).getThumbnailUrl()) != null && (urlList = thumbnailUrl.getUrlList()) != null && urlList.size() > 0) {
                C20766v a = C20761r.m39057a(Uri.parse(urlList.get(0)));
                SmartImageView smartImageView = this.f181328a;
                C89219l.m154716b(smartImageView, "");
                a.f49105b = smartImageView.getContext();
                a.f49092E = this.f181328a;
                a.f49125v = EnumC20767w.CENTER_INSIDE;
                a.mo34186c();
            }
        }

        /* renamed from: a */
        public final void mo124600a(C60107b bVar, int i, AbstractC81142b bVar2) {
            C89219l.m154721d(bVar2, "");
            if (i == 0) {
                m140899a(bVar2);
            } else if (bVar != null) {
                m140898a(bVar, bVar2);
            }
        }
    }

    public C81140h(List<C60107b> list, AbstractC81142b bVar) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(bVar, "");
        this.f181326a = list;
        this.f181327b = bVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onBindViewHolder(C81143c cVar, int i) {
        C81143c cVar2 = cVar;
        C89219l.m154721d(cVar2, "");
        if (getItemViewType(i) == 0) {
            cVar2.mo124600a(null, 0, this.f181327b);
        } else {
            cVar2.mo124600a(this.f181326a.get(i - 1), 1, this.f181327b);
        }
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m140895a(ViewGroup viewGroup, int i) {
        View a;
        boolean a2;
        MethodCollector.m26663i(4688);
        C89219l.m154721d(viewGroup, "");
        if (i == 0) {
            a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.ap5, viewGroup, false);
        } else {
            a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.ap6, viewGroup, false);
        }
        C89219l.m154716b(a, "");
        C81143c cVar = new C81143c(a);
        try {
            if (cVar.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
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
        MethodCollector.m26664o(4688);
        return cVar;
    }
}
