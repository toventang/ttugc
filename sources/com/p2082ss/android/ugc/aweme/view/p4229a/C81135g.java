package com.p2082ss.android.ugc.aweme.view.p4229a;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
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
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.model.C60161t;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.view.a.g */
public final class C81135g extends RecyclerView.AbstractC1350a<C81138c> {

    /* renamed from: b */
    public static final C81136a f181319b = new C81136a((byte) 0);

    /* renamed from: a */
    public List<C60161t> f181320a;

    /* renamed from: c */
    private final AbstractC81137b f181321c;

    /* renamed from: com.ss.android.ugc.aweme.view.a.g$b */
    public interface AbstractC81137b {
        static {
            Covode.recordClassIndex(94465);
        }

        /* renamed from: a */
        void mo124596a(C60161t tVar);
    }

    static {
        Covode.recordClassIndex(94463);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ C81138c onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m140893a(viewGroup, i);
    }

    /* renamed from: com.ss.android.ugc.aweme.view.a.g$a */
    public static final class C81136a {
        static {
            Covode.recordClassIndex(94464);
        }

        private C81136a() {
        }

        public /* synthetic */ C81136a(byte b) {
            this();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        List<C60161t> list = this.f181320a;
        if (list == null) {
            return 22;
        }
        return list.size() + 2;
    }

    /* renamed from: com.ss.android.ugc.aweme.view.a.g$c */
    public static final class C81138c extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final SmartImageView f181322a;

        static {
            Covode.recordClassIndex(94466);
        }

        /* renamed from: com.ss.android.ugc.aweme.view.a.g$c$a */
        static final class View$OnClickListenerC81139a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ AbstractC81137b f181323a;

            /* renamed from: b */
            final /* synthetic */ C60161t f181324b;

            static {
                Covode.recordClassIndex(94467);
            }

            View$OnClickListenerC81139a(AbstractC81137b bVar, C60161t tVar) {
                this.f181323a = bVar;
                this.f181324b = tVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                this.f181323a.mo124596a(this.f181324b);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C81138c(View view) {
            super(view);
            C89219l.m154721d(view, "");
            this.f181322a = (SmartImageView) view.findViewById(R.id.e70);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemViewType(int i) {
        if (i < 2) {
            return 0;
        }
        if (this.f181320a == null) {
            return 2;
        }
        return 1;
    }

    public C81135g(List<C60161t> list, AbstractC81137b bVar) {
        C89219l.m154721d(bVar, "");
        this.f181320a = list;
        this.f181321c = bVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onBindViewHolder(C81138c cVar, int i) {
        List<C60161t> list;
        C60161t tVar;
        C81138c cVar2 = cVar;
        C89219l.m154721d(cVar2, "");
        if (getItemViewType(i) == 1 && (list = this.f181320a) != null && (tVar = list.get(i - 2)) != null) {
            AbstractC81137b bVar = this.f181321c;
            C89219l.m154721d(tVar, "");
            C89219l.m154721d(bVar, "");
            cVar2.itemView.setOnClickListener(new C81138c.View$OnClickListenerC81139a(bVar, tVar));
            View view = cVar2.itemView;
            C89219l.m154716b(view, "");
            if (view.getBackground() instanceof AnimationDrawable) {
                View view2 = cVar2.itemView;
                C89219l.m154716b(view2, "");
                Drawable background = view2.getBackground();
                Objects.requireNonNull(background, "null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable");
                ((AnimationDrawable) background).stop();
            }
            C20766v a = C20761r.m39057a(Uri.parse(tVar.f137145a));
            SmartImageView smartImageView = cVar2.f181322a;
            C89219l.m154716b(smartImageView, "");
            a.f49105b = smartImageView.getContext();
            a.f49092E = cVar2.f181322a;
            a.mo34186c();
        }
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m140893a(ViewGroup viewGroup, int i) {
        View a;
        boolean a2;
        MethodCollector.m26663i(4643);
        C89219l.m154721d(viewGroup, "");
        if (i == 0) {
            a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.ap1, viewGroup, false);
            C89219l.m154716b(a, "");
        } else if (i != 2) {
            a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.ap2, viewGroup, false);
            C89219l.m154716b(a, "");
        } else {
            a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.ap2, viewGroup, false);
            C89219l.m154716b(a, "");
            Drawable background = a.getBackground();
            if (background != null) {
                AnimationDrawable animationDrawable = (AnimationDrawable) background;
                animationDrawable.setEnterFadeDuration(10);
                animationDrawable.setExitFadeDuration(300);
                animationDrawable.setOneShot(false);
                animationDrawable.start();
            } else {
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable");
                MethodCollector.m26664o(4643);
                throw nullPointerException;
            }
        }
        C81138c cVar = new C81138c(a);
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
        MethodCollector.m26664o(4643);
        return cVar;
    }
}
