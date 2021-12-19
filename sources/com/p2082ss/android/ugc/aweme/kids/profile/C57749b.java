package com.p2082ss.android.ugc.aweme.kids.profile;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.services.apm.api.C22708a;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageView;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.kids.profile.AbstractC57776e;
import com.p2082ss.android.ugc.aweme.kids.profile.HeaderDetailActivity;
import com.p2082ss.android.ugc.aweme.kids.profile.utils.AbstractC57782a;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.services.external.ability.IAVInfoService;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.trill.R;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.profile.b */
public final class C57749b extends RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> {

    /* renamed from: b */
    public static final C57750a f131752b = new C57750a((byte) 0);

    /* renamed from: a */
    List<AbstractC57776e> f131753a = new ArrayList();

    /* renamed from: c */
    private final AbstractC89172b<AbstractC57782a, C89391z> f131754c;

    static {
        Covode.recordClassIndex(67735);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemViewType(int i) {
        return i != 0 ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m104475a(this, viewGroup, i);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.profile.b$a */
    public static final class C57750a {
        static {
            Covode.recordClassIndex(67736);
        }

        private C57750a() {
        }

        public /* synthetic */ C57750a(byte b) {
            this();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f131753a.size();
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.profile.b$b */
    public static final class C57751b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final AbstractC89172b<AbstractC57782a, C89391z> f131755a;

        static {
            Covode.recordClassIndex(67737);
        }

        /* renamed from: com.ss.android.ugc.aweme.kids.profile.b$b$b */
        public static final class C57753b implements IAVInfoService.IGetInfoCallback<Bitmap> {

            /* renamed from: a */
            final /* synthetic */ SmartImageView f131758a;

            static {
                Covode.recordClassIndex(67739);
            }

            C57753b(SmartImageView smartImageView) {
                this.f131758a = smartImageView;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.p2082ss.android.ugc.aweme.services.external.ability.IAVInfoService.IGetInfoCallback
            public final /* synthetic */ void finish(Bitmap bitmap) {
                Bitmap bitmap2 = bitmap;
                if (bitmap2 != null) {
                    this.f131758a.setImageBitmap(bitmap2);
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.kids.profile.b$b$a */
        static final class View$OnClickListenerC57752a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C57751b f131756a;

            /* renamed from: b */
            final /* synthetic */ C43223c f131757b;

            static {
                Covode.recordClassIndex(67738);
            }

            View$OnClickListenerC57752a(C57751b bVar, C43223c cVar) {
                this.f131756a = bVar;
                this.f131757b = cVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                AbstractC89172b<AbstractC57782a, C89391z> bVar = this.f131756a.f131755a;
                View view2 = this.f131756a.itemView;
                C89219l.m154716b(view2, "");
                bVar.invoke(new AbstractC57782a.C57783a(view2, this.f131757b));
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.b<? super com.ss.android.ugc.aweme.kids.profile.utils.a, h.z> */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57751b(View view, AbstractC89172b<? super AbstractC57782a, C89391z> bVar) {
            super(view);
            C89219l.m154721d(view, "");
            C89219l.m154721d(bVar, "");
            this.f131755a = bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.profile.b$c */
    public static final class C57754c extends RecyclerView.ViewHolder {
        static {
            Covode.recordClassIndex(67740);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57754c(View view) {
            super(view);
            C89219l.m154721d(view, "");
        }

        /* renamed from: com.ss.android.ugc.aweme.kids.profile.b$c$a */
        static final class View$OnClickListenerC57755a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C57754c f131759a;

            /* renamed from: b */
            final /* synthetic */ C57743a f131760b;

            static {
                Covode.recordClassIndex(67741);
            }

            View$OnClickListenerC57755a(C57754c cVar, C57743a aVar) {
                this.f131759a = cVar;
                this.f131760b = aVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                View view2 = this.f131759a.itemView;
                C89219l.m154716b(view2, "");
                if (view2.getContext() instanceof Activity) {
                    View view3 = this.f131759a.itemView;
                    C89219l.m154716b(view3, "");
                    Context context = view3.getContext();
                    Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
                    HeaderDetailActivity.C57741a.m104467a((Activity) context, view, this.f131760b.f131747e);
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.b<? super com.ss.android.ugc.aweme.kids.profile.utils.a, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public C57749b(AbstractC89172b<? super AbstractC57782a, C89391z> bVar) {
        C89219l.m154721d(bVar, "");
        this.f131754c = bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C89219l.m154721d(viewHolder, "");
        if ((viewHolder instanceof C57754c) && (this.f131753a.get(i) instanceof AbstractC57776e.C57778b)) {
            AbstractC57776e eVar = this.f131753a.get(i);
            Objects.requireNonNull(eVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.kids.profile.ProfileVideoData.KidsProfileHeader");
            C57754c cVar = (C57754c) viewHolder;
            C57743a aVar = ((AbstractC57776e.C57778b) eVar).f131794a;
            C89219l.m154721d(aVar, "");
            AvatarImageView avatarImageView = (AvatarImageView) cVar.itemView.findViewById(R.id.bdz);
            C34577e.m70592a(avatarImageView, aVar.f131743a);
            avatarImageView.setOnClickListener(new C57754c.View$OnClickListenerC57755a(cVar, aVar));
            View findViewById = cVar.itemView.findViewById(R.id.c2h);
            C89219l.m154716b(findViewById, "");
            ((TuxTextView) findViewById).setText(aVar.f131746d);
        } else if ((viewHolder instanceof C57751b) && (this.f131753a.get(i) instanceof AbstractC57776e.C57777a)) {
            AbstractC57776e eVar2 = this.f131753a.get(i);
            Objects.requireNonNull(eVar2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.kids.profile.ProfileVideoData.DraftVideo");
            C57751b bVar = (C57751b) viewHolder;
            C43223c cVar2 = ((AbstractC57776e.C57777a) eVar2).f131793a;
            C89219l.m154721d(cVar2, "");
            View findViewById2 = bVar.itemView.findViewById(R.id.afn);
            C89219l.m154716b(findViewById2, "");
            SmartImageView smartImageView = (SmartImageView) findViewById2;
            if (cVar2.mo73701k()) {
                String o = cVar2.mo73714o();
                if (C80720e.m139927b(o)) {
                    C20766v a = C20761r.m39059a(new File(o));
                    a.f49092E = smartImageView;
                    a.mo34179a("DraftBoxViewHolder").mo34186c();
                }
            } else if (cVar2.mo73713n()) {
                String p = cVar2.mo73718p();
                if (C80720e.m139927b(p)) {
                    C20766v a2 = C20761r.m39059a(new File(p));
                    a2.f49092E = smartImageView;
                    a2.mo34179a("DraftBoxViewHolder").mo34186c();
                }
            } else {
                AVExternalServiceImpl.m113114a().abilityService().infoService().videoCover(cVar2, new C57751b.C57753b(smartImageView));
            }
            bVar.itemView.setOnClickListener(new C57751b.View$OnClickListenerC57752a(bVar, cVar2));
        }
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m104475a(C57749b bVar, ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder viewHolder;
        MethodCollector.m26663i(11457);
        C89219l.m154721d(viewGroup, "");
        boolean z = true;
        if (i == 0) {
            View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.adn, viewGroup, false);
            C89219l.m154716b(a, "");
            viewHolder = new C57754c(a);
        } else if (i != 1) {
            View a2 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.adj, viewGroup, false);
            C89219l.m154716b(a2, "");
            viewHolder = new C57751b(a2, bVar.f131754c);
        } else {
            View a3 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.adj, viewGroup, false);
            C89219l.m154716b(a3, "");
            viewHolder = new C57751b(a3, bVar.f131754c);
        }
        try {
            if (viewHolder.itemView.getParent() != null) {
                try {
                    z = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
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
        MethodCollector.m26664o(11457);
        return viewHolder;
    }
}
