package com.p2082ss.android.ugc.aweme.emoji.emojichoose;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.C0940b;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.emoji.p2897b.AbstractC46452f;
import com.p2082ss.android.ugc.aweme.emoji.p2897b.AbstractC46453g;
import com.p2082ss.android.ugc.aweme.emoji.p2897b.C46450d;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.emoji.emojichoose.q */
public final class C46520q extends RecyclerView.AbstractC1350a<C46450d> {

    /* renamed from: a */
    public AbstractC46453g f108455a;

    /* renamed from: b */
    public boolean f108456b;

    static {
        Covode.recordClassIndex(55107);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ C46450d onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m89799a(this, viewGroup, i);
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.emojichoose.q$a */
    public class C46521a extends C46450d<AbstractC46452f> {

        /* renamed from: a */
        public RemoteImageView f108457a;

        static {
            Covode.recordClassIndex(55108);
        }

        @Override // com.p2082ss.android.ugc.aweme.emoji.p2897b.C46450d
        /* renamed from: a */
        public final void mo78979a() {
            this.f108457a = (RemoteImageView) this.itemView.findViewById(R.id.ee6);
        }

        C46521a(View view) {
            super(view);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
        @Override // com.p2082ss.android.ugc.aweme.emoji.p2897b.C46450d
        /* renamed from: a */
        public final /* synthetic */ void mo78981a(AbstractC46452f fVar, final int i) {
            int i2;
            boolean z;
            AbstractC46452f fVar2 = fVar;
            if (fVar2.mo78975j() == 2) {
                C34577e.m70608b(this.f108457a, fVar2.mo78966b(), -1, -1);
            } else if (fVar2.mo78964a() > 0) {
                this.f108457a.setImageResource(fVar2.mo78964a());
            } else {
                Drawable d = fVar2.mo78969d();
                if (d != null) {
                    this.f108457a.setImageDrawable(d);
                }
            }
            if (!TextUtils.isEmpty(fVar2.mo78970e())) {
                C0940b.m3152a(this.f108457a, new C46525r(fVar2));
            }
            if (C46520q.this.f108456b) {
                i2 = C46520q.this.f108455a.mo78985b().f108451c;
            } else {
                i2 = C46520q.this.f108455a.mo78983a().f108435c;
            }
            RemoteImageView remoteImageView = this.f108457a;
            if (i == i2) {
                z = true;
            } else {
                z = false;
            }
            remoteImageView.setSelected(z);
            this.f108457a.setOnClickListener(new View.OnClickListener() {
                /* class com.p2082ss.android.ugc.aweme.emoji.emojichoose.C46520q.C46521a.View$OnClickListenerC465221 */

                static {
                    Covode.recordClassIndex(55109);
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    if (!C46521a.this.f108457a.isSelected()) {
                        C46520q.this.f108455a.mo78984a(i);
                    }
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.emojichoose.q$b */
    public class C46523b extends C46450d<AbstractC46452f> {

        /* renamed from: a */
        public TextView f108461a;

        static {
            Covode.recordClassIndex(55110);
        }

        @Override // com.p2082ss.android.ugc.aweme.emoji.p2897b.C46450d
        /* renamed from: a */
        public final void mo78979a() {
            this.f108461a = (TextView) this.itemView.findViewById(R.id.ee6);
        }

        C46523b(View view) {
            super(view);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
        @Override // com.p2082ss.android.ugc.aweme.emoji.p2897b.C46450d
        /* renamed from: a */
        public final /* synthetic */ void mo78981a(AbstractC46452f fVar, final int i) {
            int i2;
            AbstractC46452f fVar2 = fVar;
            boolean z = false;
            this.f108461a.setPadding(0, 0, 0, 0);
            if (fVar2.mo78975j() == 5) {
                this.f108461a.setText(fVar2.mo78968c());
            }
            if (!TextUtils.isEmpty(fVar2.mo78970e())) {
                C0940b.m3152a(this.f108461a, new C46526s(fVar2));
            }
            if (C46520q.this.f108456b) {
                i2 = C46520q.this.f108455a.mo78985b().f108451c;
            } else {
                i2 = C46520q.this.f108455a.mo78983a().f108435c;
            }
            TextView textView = this.f108461a;
            if (i == i2) {
                z = true;
            }
            textView.setSelected(z);
            this.f108461a.setOnClickListener(new View.OnClickListener() {
                /* class com.p2082ss.android.ugc.aweme.emoji.emojichoose.C46520q.C46523b.View$OnClickListenerC465241 */

                static {
                    Covode.recordClassIndex(55111);
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    if (!C46523b.this.f108461a.isSelected()) {
                        C46520q.this.f108455a.mo78984a(i);
                    }
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        if (this.f108456b) {
            return this.f108455a.mo78985b().mo79062c();
        }
        return this.f108455a.mo78983a().mo79027b();
    }

    public C46520q(AbstractC46453g gVar) {
        this.f108455a = gVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemViewType(int i) {
        if (this.f108456b) {
            return this.f108455a.mo78985b().mo79061b(i).mo78975j();
        }
        return this.f108455a.mo78983a().mo79031e(i).mo78975j();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onBindViewHolder(C46450d dVar, int i) {
        C46450d dVar2 = dVar;
        if (this.f108456b) {
            dVar2.mo78981a(this.f108455a.mo78985b().mo79061b(i), i);
        } else {
            dVar2.mo78981a(this.f108455a.mo78983a().mo79031e(i), i);
        }
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m89799a(C46520q qVar, ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder viewHolder;
        boolean a;
        MethodCollector.m26663i(12824);
        if (i == 5) {
            viewHolder = new C46523b(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.yt, viewGroup, false));
        } else {
            viewHolder = new C46521a(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.yr, viewGroup, false));
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
        MethodCollector.m26664o(12824);
        return viewHolder;
    }
}
