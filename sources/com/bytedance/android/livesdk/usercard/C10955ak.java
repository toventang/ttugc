package com.bytedance.android.livesdk.usercard;

import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.p218f.C3951p;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.livesdk.chatroom.p499ui.C7916dp;
import com.bytedance.common.utility.C13628n;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.usercard.ak */
public final class C10955ak extends RecyclerView.AbstractC1350a<C10956a> {

    /* renamed from: a */
    public View.OnClickListener f26336a;

    /* renamed from: b */
    private boolean f26337b;

    /* renamed from: c */
    private List<ImageModel> f26338c;

    static {
        Covode.recordClassIndex(12570);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ C10956a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m19575a(this, viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        List<ImageModel> list = this.f26338c;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public C10955ak(boolean z) {
        this.f26337b = z;
    }

    /* renamed from: a */
    public final void mo17815a(List<ImageModel> list) {
        if (!C13603b.m24435a((Collection) list)) {
            if (this.f26338c == null) {
                this.f26338c = new ArrayList();
            }
            this.f26338c.clear();
            this.f26338c.addAll(list);
            notifyDataSetChanged();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.usercard.ak$a */
    public static class C10956a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final int f26339a;

        /* renamed from: b */
        ImageView f26340b = ((ImageView) this.itemView.findViewById(R.id.eqb));

        /* renamed from: c */
        TextView f26341c;

        /* renamed from: d */
        boolean f26342d;

        static {
            Covode.recordClassIndex(12571);
        }

        public C10956a(View view, boolean z) {
            super(view);
            this.f26342d = z;
            TextView textView = (TextView) this.itemView.findViewById(R.id.eqc);
            this.f26341c = textView;
            textView.setMovementMethod(new LinkMovementMethod());
            this.f26339a = C3966y.m9653a(16.0f);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onBindViewHolder(C10956a aVar, int i) {
        C10956a aVar2 = aVar;
        if (!C13603b.m24435a((Collection) this.f26338c) && i < this.f26338c.size()) {
            ImageModel imageModel = this.f26338c.get(i);
            View.OnClickListener onClickListener = this.f26336a;
            if (imageModel == null) {
                return;
            }
            if (imageModel.getImageType() == 7 || imageModel.getImageType() == 5 || imageModel.getImageType() == 6) {
                C13628n.m24510a(aVar2.f26340b, 8);
            } else if (imageModel.getImageType() == 3) {
                C13628n.m24510a(aVar2.f26340b, 8);
                C13628n.m24510a(aVar2.f26341c, 0);
                String a = C3966y.m9657a((int) R.string.edj);
                if (aVar2.f26342d) {
                    SpannableString spannableString = new SpannableString(a);
                    spannableString.setSpan(new C7916dp(a, C3966y.m9663b((int) R.color.a0q), C3966y.m9653a(11.0f), C3966y.m9663b((int) R.color.a0p), C3966y.m9653a(9.0f)), 0, spannableString.length(), 33);
                    aVar2.f26341c.setText(spannableString);
                    return;
                }
                aVar2.f26341c.setText(a);
            } else {
                C3951p.m9626a(aVar2.f26340b, imageModel, -1, -1, true, 0, new C3951p.AbstractC3953a() {
                    /* class com.bytedance.android.livesdk.usercard.C10955ak.C10956a.C109571 */

                    static {
                        Covode.recordClassIndex(12572);
                    }

                    @Override // com.bytedance.android.live.core.p218f.C3951p.AbstractC3953a
                    /* renamed from: a */
                    public final void mo9301a(ImageModel imageModel) {
                    }

                    @Override // com.bytedance.android.live.core.p218f.C3951p.AbstractC3953a
                    /* renamed from: a */
                    public final void mo9303a(ImageModel imageModel, Exception exc) {
                    }

                    @Override // com.bytedance.android.live.core.p218f.C3951p.AbstractC3953a
                    /* renamed from: a */
                    public final void mo9302a(ImageModel imageModel, int i, int i2) {
                        if (i2 > 0 && i > 0) {
                            ViewGroup.LayoutParams layoutParams = C10956a.this.f26340b.getLayoutParams();
                            int i3 = C10956a.this.f26339a;
                            layoutParams.height = i3;
                            layoutParams.width = (i * i3) / i2;
                            C10956a.this.f26340b.setLayoutParams(layoutParams);
                        }
                    }
                });
                View view = aVar2.itemView;
                if (view != null) {
                    view.setOnClickListener(onClickListener);
                    view.setClickable(true);
                }
                aVar2.itemView.setTag(imageModel);
            }
        }
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m19575a(C10955ak akVar, ViewGroup viewGroup, int i) {
        int i2;
        boolean a;
        MethodCollector.m26663i(2083);
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (akVar.f26337b) {
            i2 = R.layout.bdh;
        } else {
            i2 = R.layout.bdg;
        }
        C10956a aVar = new C10956a(C1764a.m5927a(from, i2, viewGroup, false), akVar.f26337b);
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
        MethodCollector.m26664o(2083);
        return aVar;
    }
}
