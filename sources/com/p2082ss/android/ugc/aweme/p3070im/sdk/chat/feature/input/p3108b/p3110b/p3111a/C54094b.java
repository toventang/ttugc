package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.p3108b.p3110b.p3111a;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.p037h.p038a.C0733d;
import androidx.fragment.app.AbstractC0939a;
import androidx.fragment.app.C0940b;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.emoji.p2897b.AbstractC46452f;
import com.p2082ss.android.ugc.aweme.emoji.p2897b.C46450d;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.p3108b.p3110b.p3112b.C54101a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.b.b.a.b */
public final class C54094b extends RecyclerView.AbstractC1350a<C46450d<AbstractC46452f>> {

    /* renamed from: a */
    public final C54101a f123960a;

    static {
        Covode.recordClassIndex(63771);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ C46450d<AbstractC46452f> onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m99283a(this, viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f123960a.f123973e.mo79062c();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.b.b.a.b$a */
    public final class C54095a extends C46450d<AbstractC46452f> {

        /* renamed from: a */
        public RemoteImageView f123961a;

        static {
            Covode.recordClassIndex(63772);
        }

        @Override // com.p2082ss.android.ugc.aweme.emoji.p2897b.C46450d
        /* renamed from: a */
        public final void mo78979a() {
            View findViewById = this.itemView.findViewById(R.id.ee6);
            C89219l.m154716b(findViewById, "");
            this.f123961a = (RemoteImageView) findViewById;
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.b.b.a.b$a$b */
        static final class View$OnClickListenerC54097b implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C54095a f123964a;

            /* renamed from: b */
            final /* synthetic */ int f123965b;

            static {
                Covode.recordClassIndex(63774);
            }

            View$OnClickListenerC54097b(C54095a aVar, int i) {
                this.f123964a = aVar;
                this.f123965b = i;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                RemoteImageView remoteImageView = this.f123964a.f123961a;
                if (remoteImageView == null) {
                    C89219l.m154710a("tabIv");
                }
                if (!remoteImageView.isSelected()) {
                    C54094b.this.f123960a.mo78984a(this.f123965b);
                }
            }
        }

        public C54095a(View view) {
            super(view);
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.b.b.a.b$a$a */
        static final class C54096a implements AbstractC0939a {

            /* renamed from: a */
            final /* synthetic */ AbstractC46452f f123963a;

            static {
                Covode.recordClassIndex(63773);
            }

            C54096a(AbstractC46452f fVar) {
                this.f123963a = fVar;
            }

            @Override // androidx.fragment.app.AbstractC0939a
            /* renamed from: a */
            public final void mo3449a(View view, C0733d dVar) {
                C89219l.m154721d(view, "");
                C89219l.m154721d(dVar, "");
                if (!TextUtils.isEmpty(this.f123963a.mo78970e())) {
                    view.setContentDescription(this.f123963a.mo78970e());
                }
                dVar.mo2834a((CharSequence) TextView.class.getName());
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
        @Override // com.p2082ss.android.ugc.aweme.emoji.p2897b.C46450d
        /* renamed from: a */
        public final /* synthetic */ void mo78981a(AbstractC46452f fVar, int i) {
            AbstractC46452f fVar2 = fVar;
            C89219l.m154721d(fVar2, "");
            RemoteImageView remoteImageView = this.f123961a;
            if (remoteImageView == null) {
                C89219l.m154710a("tabIv");
            }
            boolean z = false;
            remoteImageView.setPadding(0, 0, 0, 0);
            if (fVar2.mo78975j() == 2) {
                View view = this.itemView;
                C89219l.m154716b(view, "");
                int b = (int) C13628n.m24520b(view.getContext(), 6.0f);
                RemoteImageView remoteImageView2 = this.f123961a;
                if (remoteImageView2 == null) {
                    C89219l.m154710a("tabIv");
                }
                remoteImageView2.setPadding(b, b, b, b);
                RemoteImageView remoteImageView3 = this.f123961a;
                if (remoteImageView3 == null) {
                    C89219l.m154710a("tabIv");
                }
                C34577e.m70608b(remoteImageView3, fVar2.mo78966b(), -1, -1);
            } else {
                if (fVar2.mo78975j() == 1) {
                    View view2 = this.itemView;
                    C89219l.m154716b(view2, "");
                    int b2 = (int) C13628n.m24520b(view2.getContext(), 6.0f);
                    RemoteImageView remoteImageView4 = this.f123961a;
                    if (remoteImageView4 == null) {
                        C89219l.m154710a("tabIv");
                    }
                    remoteImageView4.setPadding(b2, b2, b2, b2);
                }
                if (fVar2.mo78964a() > 0) {
                    RemoteImageView remoteImageView5 = this.f123961a;
                    if (remoteImageView5 == null) {
                        C89219l.m154710a("tabIv");
                    }
                    remoteImageView5.setImageResource(fVar2.mo78964a());
                } else {
                    Drawable d = fVar2.mo78969d();
                    if (d != null) {
                        RemoteImageView remoteImageView6 = this.f123961a;
                        if (remoteImageView6 == null) {
                            C89219l.m154710a("tabIv");
                        }
                        remoteImageView6.setImageDrawable(d);
                    }
                }
            }
            if (!TextUtils.isEmpty(fVar2.mo78970e())) {
                RemoteImageView remoteImageView7 = this.f123961a;
                if (remoteImageView7 == null) {
                    C89219l.m154710a("tabIv");
                }
                C0940b.m3152a(remoteImageView7, new C54096a(fVar2));
            }
            int i2 = C54094b.this.f123960a.f123973e.f108451c;
            RemoteImageView remoteImageView8 = this.f123961a;
            if (remoteImageView8 == null) {
                C89219l.m154710a("tabIv");
            }
            if (i == i2) {
                z = true;
            }
            remoteImageView8.setSelected(z);
            RemoteImageView remoteImageView9 = this.f123961a;
            if (remoteImageView9 == null) {
                C89219l.m154710a("tabIv");
            }
            remoteImageView9.setOnClickListener(new View$OnClickListenerC54097b(this, i));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.b.b.a.b$b */
    public final class C54098b extends C46450d<AbstractC46452f> {

        /* renamed from: a */
        public TextView f123966a;

        static {
            Covode.recordClassIndex(63775);
        }

        @Override // com.p2082ss.android.ugc.aweme.emoji.p2897b.C46450d
        /* renamed from: a */
        public final void mo78979a() {
            View findViewById = this.itemView.findViewById(R.id.ee6);
            C89219l.m154716b(findViewById, "");
            this.f123966a = (TextView) findViewById;
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.b.b.a.b$b$b */
        static final class View$OnClickListenerC54100b implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C54098b f123969a;

            /* renamed from: b */
            final /* synthetic */ int f123970b;

            static {
                Covode.recordClassIndex(63777);
            }

            View$OnClickListenerC54100b(C54098b bVar, int i) {
                this.f123969a = bVar;
                this.f123970b = i;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                TextView textView = this.f123969a.f123966a;
                if (textView == null) {
                    C89219l.m154710a("tabIv");
                }
                if (!textView.isSelected()) {
                    C54094b.this.f123960a.mo78984a(this.f123970b);
                }
            }
        }

        public C54098b(View view) {
            super(view);
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.b.b.a.b$b$a */
        static final class C54099a implements AbstractC0939a {

            /* renamed from: a */
            final /* synthetic */ AbstractC46452f f123968a;

            static {
                Covode.recordClassIndex(63776);
            }

            C54099a(AbstractC46452f fVar) {
                this.f123968a = fVar;
            }

            @Override // androidx.fragment.app.AbstractC0939a
            /* renamed from: a */
            public final void mo3449a(View view, C0733d dVar) {
                C89219l.m154721d(view, "");
                C89219l.m154721d(dVar, "");
                if (!TextUtils.isEmpty(this.f123968a.mo78970e())) {
                    view.setContentDescription(this.f123968a.mo78970e());
                }
                dVar.mo2834a((CharSequence) TextView.class.getName());
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
        @Override // com.p2082ss.android.ugc.aweme.emoji.p2897b.C46450d
        /* renamed from: a */
        public final /* synthetic */ void mo78981a(AbstractC46452f fVar, int i) {
            AbstractC46452f fVar2 = fVar;
            C89219l.m154721d(fVar2, "");
            TextView textView = this.f123966a;
            if (textView == null) {
                C89219l.m154710a("tabIv");
            }
            boolean z = false;
            textView.setPadding(0, 0, 0, 0);
            if (fVar2.mo78975j() == 5) {
                TextView textView2 = this.f123966a;
                if (textView2 == null) {
                    C89219l.m154710a("tabIv");
                }
                textView2.setText(fVar2.mo78968c());
            }
            if (!TextUtils.isEmpty(fVar2.mo78970e())) {
                TextView textView3 = this.f123966a;
                if (textView3 == null) {
                    C89219l.m154710a("tabIv");
                }
                C0940b.m3152a(textView3, new C54099a(fVar2));
            }
            int i2 = C54094b.this.f123960a.f123973e.f108451c;
            TextView textView4 = this.f123966a;
            if (textView4 == null) {
                C89219l.m154710a("tabIv");
            }
            if (i == i2) {
                z = true;
            }
            textView4.setSelected(z);
            TextView textView5 = this.f123966a;
            if (textView5 == null) {
                C89219l.m154710a("tabIv");
            }
            textView5.setOnClickListener(new View$OnClickListenerC54100b(this, i));
        }
    }

    public C54094b(C54101a aVar) {
        C89219l.m154721d(aVar, "");
        this.f123960a = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemViewType(int i) {
        return this.f123960a.f123973e.mo79061b(i).mo78975j();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onBindViewHolder(C46450d<AbstractC46452f> dVar, int i) {
        C46450d<AbstractC46452f> dVar2 = dVar;
        C89219l.m154721d(dVar2, "");
        dVar2.mo78981a(this.f123960a.f123973e.mo79061b(i), i);
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m99283a(C54094b bVar, ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder viewHolder;
        boolean a;
        MethodCollector.m26663i(4297);
        C89219l.m154721d(viewGroup, "");
        if (i == 5) {
            viewHolder = new C54098b(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.yu, viewGroup, false));
        } else {
            viewHolder = new C54095a(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.ys, viewGroup, false));
        }
        try {
            if (viewHolder.itemView.getParent() != null) {
                try {
                    a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a) {
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
        MethodCollector.m26664o(4297);
        return viewHolder;
    }
}
