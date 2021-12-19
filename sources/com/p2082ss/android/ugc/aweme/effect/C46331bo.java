package com.p2082ss.android.ugc.aweme.effect;

import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.C0643b;
import androidx.core.graphics.C0699a;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.sticker.View$OnTouchListenerC75885t;
import com.p2082ss.android.ugc.aweme.themechange.base.AVDmtTextView;
import com.p2082ss.android.ugc.aweme.themechange.base.C77795c;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.aweme.views.CircleDraweeView;
import com.p2082ss.android.ugc.tools.view.C84916a;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.effect.bo */
public final class C46331bo extends RecyclerView.AbstractC1350a<C46333b> {

    /* renamed from: a */
    public List<EffectModel> f107992a;

    /* renamed from: b */
    public AbstractC46332a f107993b;

    /* renamed from: c */
    public int f107994c;

    /* renamed from: com.ss.android.ugc.aweme.effect.bo$a */
    public interface AbstractC46332a {
        static {
            Covode.recordClassIndex(54909);
        }

        /* renamed from: a */
        boolean mo78816a(int i, boolean z);
    }

    static {
        Covode.recordClassIndex(54908);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ C46333b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m89356a(this, viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f107992a.size();
    }

    /* renamed from: a */
    public final void mo78815a(int i) {
        notifyItemChanged(this.f107994c);
        this.f107994c = i;
        notifyItemChanged(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.effect.bo$b */
    public class C46333b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        CircleDraweeView f107995a;

        /* renamed from: b */
        AVDmtTextView f107996b;

        /* renamed from: c */
        View f107997c;

        static {
            Covode.recordClassIndex(54910);
        }

        C46333b(View view) {
            super(view);
            this.f107995a = (CircleDraweeView) view.findViewById(R.id.e91);
            this.f107996b = (AVDmtTextView) view.findViewById(R.id.e9l);
            this.f107997c = view.findViewById(R.id.e86);
            this.f107996b.setStatusTextColor(C0643b.m2378c(view.getContext(), R.color.bh));
            this.f107996b.mo796a();
            this.f107996b.setHorizontalFadingEdgeEnabled(true);
            AVDmtTextView aVDmtTextView = this.f107996b;
            aVDmtTextView.setFadingEdgeLength((int) C13628n.m24520b(aVDmtTextView.getContext(), 4.0f));
            this.f107995a.setOnClickListener(new View$OnClickListenerC46334bp(this));
            this.f107995a.setOnTouchListener(new View$OnTouchListenerC75885t(1.2f, 100, this.f107997c));
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onBindViewHolder(C46333b bVar, int i) {
        int i2;
        C46333b bVar2 = bVar;
        EffectModel effectModel = C46331bo.this.f107992a.get(i);
        Drawable drawable = bVar2.f107995a.getResources().getDrawable(effectModel.imagePath);
        if (!effectModel.isEnabled) {
            i2 = 127;
        } else {
            i2 = 255;
        }
        if (i == 0) {
            int b = (int) C13628n.m24520b(bVar2.f107995a.getContext(), 12.0f);
            int color = bVar2.itemView.getContext().getResources().getColor(R.color.a8);
            drawable = C77795c.m135911a(drawable);
            bVar2.f107995a.setImageDrawable(drawable);
            bVar2.f107995a.setPadding(b, b, b, b);
            bVar2.f107995a.setBackground(C84916a.m145946a(color, color, 0));
        } else {
            bVar2.f107995a.setBackground(drawable);
        }
        SpannableString spannableString = new SpannableString(effectModel.name);
        spannableString.setSpan(new ForegroundColorSpan(C0699a.m2464b(C0643b.m2378c(C63247i.f143610a, R.color.l), i2)), 0, spannableString.length(), 17);
        drawable.setAlpha(i2);
        bVar2.f107996b.setText(spannableString);
        if (i == C46331bo.this.f107994c) {
            bVar2.f107996b.mo121358a(true);
            bVar2.f107996b.setSelected(true);
            bVar2.f107997c.setBackground(bVar2.f107997c.getResources().getDrawable(R.drawable.eg));
            return;
        }
        bVar2.f107996b.mo121358a(false);
        bVar2.f107996b.setSelected(false);
        bVar2.f107997c.setBackground(null);
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m89356a(C46331bo boVar, ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(5984);
        C46333b bVar = new C46333b(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.a_5, viewGroup, false));
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
        MethodCollector.m26664o(5984);
        return bVar;
    }
}
