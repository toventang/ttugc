package com.bytedance.android.livesdk.olddialog.widget;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.olddialog.viewmodel.C10041a;
import com.bytedance.android.livesdk.service.p625c.p626a.C10715e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.olddialog.widget.a */
public final class C10049a extends RecyclerView.AbstractC1350a {

    /* renamed from: a */
    List<C10071u> f24447a = new ArrayList();

    /* renamed from: b */
    public C10041a f24448b;

    /* renamed from: c */
    public AbstractC10051a f24449c;

    /* renamed from: d */
    View f24450d = null;

    /* renamed from: e */
    int f24451e;

    /* renamed from: f */
    public DataChannel f24452f = null;

    /* renamed from: com.bytedance.android.livesdk.olddialog.widget.a$a */
    public interface AbstractC10051a {
        static {
            Covode.recordClassIndex(11613);
        }

        /* renamed from: a */
        void mo16870a(boolean z);
    }

    static {
        Covode.recordClassIndex(11611);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m18598a(viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f24447a.size();
    }

    /* renamed from: a */
    public final int mo16879a() {
        List<C10071u> list = this.f24447a;
        if (!(list == null || list.size() == 0)) {
            for (int i = 0; i < this.f24447a.size(); i++) {
                if (this.f24447a.get(i).f24479b == this.f24451e) {
                    return i;
                }
            }
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemViewType(int i) {
        return this.f24447a.get(i).f24479b;
    }

    /* renamed from: a */
    public final void mo16880a(List<C10071u> list) {
        int i;
        this.f24447a = list;
        C10041a aVar = this.f24448b;
        if (aVar == null || aVar.f24386b == null || this.f24448b.f24386b.getValue() == null) {
            i = 0;
        } else {
            i = this.f24448b.f24386b.getValue().intValue();
        }
        this.f24451e = i;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onBindViewHolder(final RecyclerView.ViewHolder viewHolder, int i) {
        if (viewHolder instanceof C10072v) {
            C10072v vVar = (C10072v) viewHolder;
            vVar.mo16890a(this.f24447a.get(i).f24478a, this.f24447a.get(i).f24480c);
            vVar.f24482b.setOnClickListener(new View.OnClickListener() {
                /* class com.bytedance.android.livesdk.olddialog.widget.C10049a.View$OnClickListenerC100501 */

                static {
                    Covode.recordClassIndex(11612);
                }

                public final void onClick(View view) {
                    C10049a aVar = C10049a.this;
                    int intValue = ((Integer) view.getTag()).intValue();
                    if (intValue != aVar.f24451e) {
                        if (aVar.f24450d != null && (aVar.f24450d instanceof TextView)) {
                            ((TextView) aVar.f24450d).setTextColor(Color.parseColor("#88FFFFFF"));
                        }
                        aVar.f24450d = view;
                        if (view instanceof TextView) {
                            ((TextView) view).setTextColor(Color.parseColor("#E6FFFFFF"));
                        }
                        aVar.f24448b.f24386b.setValue(Integer.valueOf(intValue));
                        aVar.f24451e = intValue;
                        if (intValue == 5) {
                            aVar.f24449c.mo16870a(false);
                        } else {
                            aVar.f24449c.mo16870a(true);
                        }
                        for (C10071u uVar : aVar.f24447a) {
                            if (uVar.f24479b == intValue) {
                                C10715e.m19283b(uVar.f24478a);
                                return;
                            }
                        }
                    }
                }
            });
            if (((Integer) vVar.f24482b.getTag()).intValue() == this.f24451e) {
                this.f24450d = vVar.f24482b;
                vVar.f24482b.setTextColor(Color.parseColor("#E6FFFFFF"));
                return;
            }
            vVar.f24482b.setTextColor(Color.parseColor("#88FFFFFF"));
        }
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m18598a(ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(7256);
        LiveTextView liveTextView = new LiveTextView(viewGroup.getContext());
        liveTextView.setTextSize(14.0f);
        liveTextView.setGravity(17);
        liveTextView.setTag(Integer.valueOf(i));
        RecyclerView.C1367j jVar = new RecyclerView.C1367j(-2, -2);
        jVar.rightMargin = C3966y.m9653a(16.0f);
        liveTextView.setLayoutParams(jVar);
        C10072v vVar = new C10072v(liveTextView);
        try {
            if (vVar.itemView.getParent() != null) {
                try {
                    a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(vVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) vVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(vVar.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = vVar.getClass().getName();
        MethodCollector.m26664o(7256);
        return vVar;
    }
}
