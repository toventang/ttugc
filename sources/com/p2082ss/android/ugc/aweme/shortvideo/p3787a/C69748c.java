package com.p2082ss.android.ugc.aweme.shortvideo.p3787a;

import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.AbstractC1204m;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.facebook.common.p1836h.C24117a;
import com.facebook.imagepipeline.p1885j.AbstractC24453b;
import com.facebook.imagepipeline.p1885j.AbstractC24454c;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.shortvideo.util.AbstractC73999bo;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.a.c */
public final class C69748c extends RecyclerView.AbstractC1350a<C69750a> {

    /* renamed from: a */
    private int f155873a;

    /* renamed from: b */
    private int f155874b;

    /* renamed from: c */
    private float f155875c = 1.2f;

    /* renamed from: d */
    private int f155876d;

    /* renamed from: e */
    private int f155877e;

    /* renamed from: f */
    private AbstractC73999bo f155878f;

    static {
        Covode.recordClassIndex(82154);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ C69750a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m123281a(viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f155877e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.a.c$a */
    public static class C69750a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        ImageView f155882a;

        /* renamed from: b */
        C24117a<AbstractC24454c> f155883b;

        static {
            Covode.recordClassIndex(82156);
        }

        C69750a(View view) {
            super(view);
            this.f155882a = (ImageView) view.findViewById(R.id.c0f);
            view.setOnClickListener(new View.OnClickListener() {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.p3787a.C69748c.C69750a.View$OnClickListenerC697511 */

                static {
                    Covode.recordClassIndex(82157);
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    C69750a.this.getLayoutPosition();
                }
            });
        }
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m123281a(ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(9625);
        C69750a aVar = new C69750a(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.api, viewGroup, false));
        try {
            if (aVar.itemView.getParent() != null) {
                try {
                    a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(aVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) aVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(aVar.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = aVar.getClass().getName();
        MethodCollector.m26664o(9625);
        return aVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onBindViewHolder(C69750a aVar, int i) {
        final C69750a aVar2 = aVar;
        C24117a.m45712c(aVar2.f155883b);
        final int min = (int) Math.min(((float) i) * this.f155875c * 1000.0f, (float) this.f155874b);
        aVar2.f155882a.setTag(String.valueOf(min));
        RecyclerView.C1367j jVar = (RecyclerView.C1367j) aVar2.f155882a.getLayoutParams();
        jVar.height = this.f155873a;
        jVar.width = this.f155873a;
        jVar.setMargins(0, 0, 0, 0);
        if (i <= 0 || i >= this.f155877e - 1) {
            int i2 = this.f155873a;
            int i3 = i2 >> 1;
            int i4 = this.f155877e;
            if (i == i4 - 1) {
                if (i == 0) {
                    float f = this.f155875c;
                    double d = (double) (((float) this.f155874b) % (f * 1000.0f));
                    Double.isNaN(d);
                    double d2 = (double) (f * 1000.0f);
                    Double.isNaN(d2);
                    double d3 = (d * 1.0d) / d2;
                    double d4 = (double) i2;
                    Double.isNaN(d4);
                    jVar.width = (int) (d3 * d4);
                    jVar.setMargins(i3, 0, this.f155876d, 0);
                }
            } else if (i == 0) {
                jVar.width = i2;
                jVar.setMargins(i3, 0, 0, 0);
            }
            if (i == i4 - 1) {
                float f2 = this.f155875c;
                float f3 = ((float) this.f155874b) % (f2 * 1000.0f);
                if (f3 == 0.0f) {
                    f3 = f2 * 1000.0f;
                }
                double d5 = (double) f3;
                Double.isNaN(d5);
                double d6 = (double) (f2 * 1000.0f);
                Double.isNaN(d6);
                double d7 = (d5 * 1.0d) / d6;
                double d8 = (double) i2;
                Double.isNaN(d8);
                jVar.width = (int) (d7 * d8);
                if (i < 5) {
                    jVar.setMargins(0, 0, i3 + this.f155876d, 0);
                } else {
                    jVar.setMargins(0, 0, i3, 0);
                }
            }
        } else {
            jVar.width = this.f155873a;
            aVar2.f155882a.setPadding(0, 0, 0, 0);
        }
        aVar2.f155882a.setLayoutParams(jVar);
        aVar2.f155882a.setScaleType(ImageView.ScaleType.CENTER_CROP);
        aVar2.f155882a.setImageBitmap(null);
        AbstractC73999bo boVar = this.f155878f;
        if (boVar != null) {
            boVar.mo116375a(min, new AbstractC73999bo.AbstractC74000a() {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.p3787a.C69748c.C697491 */

                static {
                    Covode.recordClassIndex(82155);
                }

                @Override // com.p2082ss.android.ugc.aweme.shortvideo.util.AbstractC73999bo.AbstractC74000a
                /* renamed from: a */
                public final void mo110114a(C24117a<AbstractC24454c> aVar) {
                    Bitmap d = ((AbstractC24453b) aVar.mo39695a()).mo40296d();
                    if (d != null && !d.isRecycled() && aVar2.f155882a != null && aVar2.f155882a.getTag().equals(new StringBuilder().append(min).toString())) {
                        aVar2.f155883b = aVar;
                        aVar2.f155882a.setImageBitmap(d);
                    }
                }
            });
        }
    }

    public C69748c(AbstractC1204m mVar, int i, int i2, int i3, String str, int i4, int i5, int i6) {
        this.f155873a = i;
        this.f155874b = i2;
        this.f155876d = i3;
        this.f155877e = i6;
        if (str != null) {
            this.f155878f = AVExternalServiceImpl.m113114a().abilityService().effectService().getVideoCoverBitmapCache(mVar, str, i4, i5, i6);
        }
    }
}
