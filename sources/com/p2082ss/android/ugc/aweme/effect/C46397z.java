package com.p2082ss.android.ugc.aweme.effect;

import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.effect.p2888a.AbstractC46264a;
import com.p2082ss.android.ugc.aweme.effect.p2889b.C46300a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.sticker.View$OnTouchListenerC75885t;
import com.p2082ss.android.ugc.aweme.themechange.base.AVDmtImageView;
import com.p2082ss.android.ugc.aweme.themechange.base.AVDmtTextView;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.aweme.views.CircleDraweeView;
import com.p2082ss.android.ugc.tools.p4340c.C84407b;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.effect.z */
public final class C46397z extends AbstractC46264a<C46399b> {

    /* renamed from: a */
    public AbstractC46398a f108120a;

    /* renamed from: com.ss.android.ugc.aweme.effect.z$a */
    public interface AbstractC46398a {
        static {
            Covode.recordClassIndex(54975);
        }

        /* renamed from: a */
        void mo78875a(int i, int i2, EffectModel effectModel);
    }

    static {
        Covode.recordClassIndex(54974);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m89505a(this, viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f107835c.size();
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.z$b */
    public class C46399b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        AVDmtImageView f108121a;

        /* renamed from: b */
        AVDmtTextView f108122b;

        /* renamed from: c */
        CircleDraweeView f108123c;

        /* renamed from: d */
        ObjectAnimator f108124d;

        /* renamed from: e */
        int f108125e = 1;

        static {
            Covode.recordClassIndex(54976);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo78881a() {
            ObjectAnimator objectAnimator = this.f108124d;
            if (objectAnimator != null && objectAnimator.isRunning()) {
                this.f108124d.cancel();
            }
            this.f108121a.setRotation(0.0f);
            this.f108121a.setImageResource(2131230945);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo78882a(boolean z) {
            this.f108123c.mo125081a(z);
        }

        public C46399b(View view) {
            super(view);
            CircleDraweeView circleDraweeView = (CircleDraweeView) view.findViewById(R.id.e91);
            this.f108123c = circleDraweeView;
            circleDraweeView.f181796d = true;
            AVDmtTextView aVDmtTextView = (AVDmtTextView) view.findViewById(R.id.e9l);
            this.f108122b = aVDmtTextView;
            aVDmtTextView.mo796a();
            this.f108122b.setHorizontalFadingEdgeEnabled(true);
            AVDmtTextView aVDmtTextView2 = this.f108122b;
            aVDmtTextView2.setFadingEdgeLength((int) C13628n.m24520b(aVDmtTextView2.getContext(), 4.0f));
            this.f108121a = (AVDmtImageView) view.findViewById(R.id.bv8);
            this.f108123c.setOnTouchListener(new View$OnTouchListenerC46265aa(this));
            this.f108123c.setOnClickListener(new View$OnClickListenerC46266ab(this));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemViewType(int i) {
        if (C89219l.m154714a((Object) "trans", (Object) this.f107835c.get(i).category)) {
            return 2;
        }
        return 1;
    }

    public C46397z(RecyclerView recyclerView, C46300a aVar) {
        super(recyclerView, aVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C46399b bVar = (C46399b) viewHolder;
        EffectModel effectModel = this.f107835c.get(i);
        int a = mo78738a(i);
        if (effectModel != null) {
            bVar.f108122b.setText(effectModel.name);
            if (!TextUtils.isEmpty(effectModel.iconUrl) && !effectModel.iconUrl.equals(bVar.f108123c.getTag())) {
                if (C46360i.m89449a(effectModel)) {
                    bVar.f108123c.setImageDrawable(bVar.f108123c.getResources().getDrawable(C63247i.f143610a.getResources().getIdentifier(effectModel.iconUrl, "drawable", C63247i.f143610a.getPackageName())));
                } else {
                    C84407b.m145191a(bVar.f108123c, effectModel.iconUrl, Bitmap.Config.RGB_565);
                }
                bVar.f108123c.setTag(effectModel.iconUrl);
            }
            if (bVar.f108125e != a) {
                bVar.f108125e = a;
                if (a == 2) {
                    bVar.mo78881a();
                    bVar.f108121a.setVisibility(0);
                } else if (a == 4) {
                    bVar.f108121a.setVisibility(8);
                } else if (a == 8) {
                    bVar.f108121a.setVisibility(0);
                    bVar.f108121a.setImageResource(2131230947);
                    bVar.f108124d = ObjectAnimator.ofFloat(bVar.f108121a, "rotation", 0.0f, 360.0f);
                    bVar.f108124d.setDuration(800L);
                    bVar.f108124d.setRepeatMode(1);
                    bVar.f108124d.setRepeatCount(-1);
                    bVar.f108124d.setInterpolator(new LinearInterpolator());
                    bVar.f108124d.start();
                } else if (a == 16) {
                    bVar.mo78881a();
                    bVar.f108121a.setVisibility(8);
                } else if (a == 32) {
                    bVar.f108121a.setVisibility(0);
                    bVar.mo78881a();
                }
            }
        }
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m89505a(C46397z zVar, ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(6724);
        C46399b bVar = new C46399b(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.a_3, viewGroup, false));
        if (i == 2) {
            bVar.f108123c.setOnTouchListener(new View$OnTouchListenerC75885t(1.2f, 100, bVar.f108123c));
        } else {
            bVar.f108123c.setOnClickListener(null);
        }
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
        MethodCollector.m26664o(6724);
        return bVar;
    }
}
