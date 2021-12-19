package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.p3841a;

import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.shortvideo.widget.C74303r;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.a.b */
public final class C71992b extends RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> {

    /* renamed from: a */
    public final List<Bitmap> f161323a = new ArrayList(7);

    /* renamed from: b */
    private final int f161324b;

    /* renamed from: c */
    private final int f161325c;

    /* renamed from: d */
    private int f161326d = 1;

    static {
        Covode.recordClassIndex(84632);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m127083a(this, viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f161323a.size() / this.f161326d;
    }

    public C71992b(int i, int i2) {
        this.f161324b = i;
        this.f161325c = i2;
        this.f161326d = 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Bitmap bitmap = this.f161323a.get(i);
        ImageView imageView = (ImageView) viewHolder.itemView;
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        }
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m127083a(C71992b bVar, ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(10445);
        ImageView imageView = (ImageView) C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.b2x, viewGroup, false);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.height = bVar.f161325c;
        layoutParams.width = bVar.f161324b;
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(layoutParams);
        C74303r rVar = new C74303r(imageView);
        try {
            if (rVar.itemView.getParent() != null) {
                try {
                    a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(rVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) rVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(rVar.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = rVar.getClass().getName();
        MethodCollector.m26664o(10445);
        return rVar;
    }
}
