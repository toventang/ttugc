package com.p2082ss.android.ugc.aweme.contentlanguage;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.dmt.p1194ui.common.views.CommonItemView;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.app.SharePrefCache;
import com.p2082ss.android.ugc.aweme.contentlanguage.C40220l;
import com.p2082ss.android.ugc.aweme.contentlanguage.viewmodel.ContentPreferenceViewModel;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3728a.C68343a;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.contentlanguage.d */
public final class C40190d extends RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> implements AbstractC1204m, C40220l.AbstractC40222a {

    /* renamed from: a */
    public ArrayList<C68343a> f94364a = new ArrayList<>();

    /* renamed from: b */
    final Activity f94365b;

    /* renamed from: c */
    public final ContentPreferenceViewModel f94366c;

    /* renamed from: d */
    C40220l f94367d;

    static {
        Covode.recordClassIndex(47985);
    }

    @Override // com.p2082ss.android.ugc.aweme.contentlanguage.C40220l.AbstractC40222a
    /* renamed from: a */
    public final void mo69392a(Throwable th) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemViewType(int i) {
        return i == 0 ? 0 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m81302a(viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        int i;
        ArrayList<C68343a> arrayList = this.f94364a;
        if (arrayList != null) {
            i = arrayList.size();
        } else {
            i = 0;
        }
        return i + 1;
    }

    @Override // androidx.lifecycle.AbstractC1204m
    public final AbstractC1196i getLifecycle() {
        Activity activity = this.f94365b;
        if (activity instanceof AbstractC1204m) {
            return ((AbstractC1204m) activity).getLifecycle();
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.contentlanguage.C40220l.AbstractC40222a
    /* renamed from: a */
    public final void mo69391a() {
        String str = "";
        for (int i = 0; i < this.f94366c.mo69433c().getValue().size(); i++) {
            str = str + this.f94366c.mo69433c().getValue().get(i).getLanguageCode() + ",";
        }
        SharePrefCache.inst().getUserAddLanguages().mo59940b(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.contentlanguage.d$a */
    public static class C40191a extends RecyclerView.ViewHolder {
        static {
            Covode.recordClassIndex(47986);
        }

        C40191a(View view) {
            super(view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.contentlanguage.d$b */
    public static class C40192b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        CommonItemView f94368a;

        static {
            Covode.recordClassIndex(47987);
        }

        public C40192b(View view) {
            super(view);
            this.f94368a = (CommonItemView) view;
        }
    }

    public C40190d(Activity activity) {
        this.f94365b = activity;
        ContentPreferenceViewModel contentPreferenceViewModel = (ContentPreferenceViewModel) C1181ae.m3881a((ActivityC0945e) activity, (C1175ad.AbstractC1177b) null).mo3983a(ContentPreferenceViewModel.class);
        this.f94366c = contentPreferenceViewModel;
        contentPreferenceViewModel.mo69433c().observe(this, new C40193e(this));
        C40220l lVar = new C40220l();
        this.f94367d = lVar;
        lVar.f94418b = this;
        if (activity instanceof AbstractC1204m) {
            ((AbstractC1204m) activity).getLifecycle().mo4012a(new ContentLanguageAdapter$1(this));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (getItemCount() != 1 && (viewHolder instanceof C40192b)) {
            C40192b bVar = (C40192b) viewHolder;
            C68343a aVar = this.f94364a.get(i - 1);
            if (aVar.getLocalName() != null) {
                bVar.f94368a.setLeftText(aVar.getLocalName());
                bVar.f94368a.setRightIconRes(2131232483);
                bVar.f94368a.setOnClickListener(new View$OnClickListenerC40194f(this, aVar));
            }
        }
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m81302a(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder viewHolder;
        boolean a;
        MethodCollector.m26663i(4700);
        if (i == 0) {
            viewHolder = new C40191a(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.adu, viewGroup, false));
        } else {
            viewHolder = new C40192b(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.a93, viewGroup, false));
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
        MethodCollector.m26664o(4700);
        return viewHolder;
    }
}
