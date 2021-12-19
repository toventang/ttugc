package com.bytedance.android.live.effect.p242c;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.p218f.C3941k;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.effect.model.FilterModel;
import com.bytedance.android.live.effect.p242c.C4208j;
import com.bytedance.android.livesdk.livesetting.effect.LiveNewEffectPanelSetting;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.effectmanager.common.model.UrlModel;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.live.effect.c.c */
public final class C4195c extends RecyclerView.AbstractC1350a<C4197b> {

    /* renamed from: a */
    List<FilterModel> f11652a;

    /* renamed from: b */
    int f11653b;

    /* renamed from: c */
    AbstractC4196a f11654c;

    /* renamed from: d */
    private Context f11655d;

    /* renamed from: com.bytedance.android.live.effect.c.c$a */
    public interface AbstractC4196a {
        static {
            Covode.recordClassIndex(4766);
        }

        /* renamed from: a */
        void mo9915a(int i);
    }

    static {
        Covode.recordClassIndex(4765);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ C4197b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m10277a(this, viewGroup, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.effect.c.c$b */
    public static class C4197b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final View f11656a;

        /* renamed from: b */
        public View f11657b;

        /* renamed from: c */
        public HSImageView f11658c;

        /* renamed from: d */
        public TextView f11659d;

        /* renamed from: e */
        public ImageView f11660e;

        /* renamed from: f */
        private View f11661f;

        static {
            Covode.recordClassIndex(4767);
        }

        /* renamed from: a */
        public final void mo9916a() {
            this.f11661f.setVisibility(4);
        }

        C4197b(View view) {
            super(view);
            this.f11657b = view.findViewById(R.id.ty);
            this.f11658c = (HSImageView) view.findViewById(R.id.bt7);
            this.f11659d = (TextView) view.findViewById(R.id.ezz);
            this.f11656a = view.findViewById(R.id.bxi);
            this.f11661f = view.findViewById(R.id.bqy);
            this.f11660e = (ImageView) view.findViewById(R.id.bxy);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f11652a.size();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onBindViewHolder(C4197b bVar, int i) {
        boolean z;
        int i2;
        int b;
        C4197b bVar2 = bVar;
        FilterModel filterModel = this.f11652a.get(i);
        if (i == this.f11653b) {
            z = true;
        } else {
            z = false;
        }
        View view = bVar2.f11657b;
        if (z) {
            i2 = 0;
        } else {
            i2 = 4;
        }
        view.setVisibility(i2);
        if (z) {
            b = C3966y.m9663b((int) R.color.uz);
        } else {
            b = C3966y.m9663b((int) R.color.x9);
        }
        bVar2.f11659d.setTextColor(b);
        int filterType = filterModel.getFilterType();
        if (filterType == 0) {
            bVar2.f11658c.setImageResource(R.drawable.bqs);
            if (bVar2.f11660e != null) {
                bVar2.f11660e.setVisibility(0);
            }
            bVar2.f11659d.setText(filterModel.getLocalFilter().getName());
            bVar2.f11656a.setVisibility(8);
            bVar2.mo9916a();
        } else if (filterType == 1) {
            bVar2.f11658c.setImageDrawable(C3966y.m9665c(filterModel.getLocalFilter().getCoverResId()));
            bVar2.f11659d.setText(filterModel.getLocalFilter().getName());
            bVar2.f11656a.setVisibility(8);
            if (bVar2.f11660e != null) {
                bVar2.f11660e.setVisibility(8);
            }
            bVar2.mo9916a();
        } else if (filterType == 2) {
            HSImageView hSImageView = bVar2.f11658c;
            UrlModel iconUrl = filterModel.getEffect().getIconUrl();
            ImageModel imageModel = new ImageModel();
            imageModel.setUri(iconUrl.getUri());
            imageModel.setUrls(iconUrl.getUrlList());
            C3941k.m9601a(hSImageView, imageModel);
            bVar2.f11659d.setText(filterModel.getEffect().getName());
            if (C4208j.C4212b.f11691a.mo9900c(filterModel)) {
                bVar2.f11656a.setVisibility(0);
            } else {
                bVar2.f11656a.setVisibility(8);
            }
            bVar2.mo9916a();
            if (bVar2.f11660e != null) {
                bVar2.f11660e.setVisibility(8);
            }
        }
        bVar2.itemView.setOnClickListener(new View$OnClickListenerC4198d(this, i, bVar2));
    }

    public C4195c(Context context, List<FilterModel> list, AbstractC4196a aVar) {
        this.f11655d = context;
        this.f11652a = list == null ? new ArrayList<>() : list;
        this.f11653b = AbstractC6804a.f16886O.mo13066a().intValue();
        this.f11654c = aVar;
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m10277a(C4195c cVar, ViewGroup viewGroup, int i) {
        int i2;
        boolean a;
        MethodCollector.m26663i(7057);
        if (LiveNewEffectPanelSetting.INSTANCE.useNewPanel()) {
            i2 = R.layout.b7v;
        } else {
            i2 = R.layout.b_w;
        }
        C4197b bVar = new C4197b(C1764a.m5927a(LayoutInflater.from(cVar.f11655d), i2, viewGroup, false));
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
        MethodCollector.m26664o(7057);
        return bVar;
    }
}
