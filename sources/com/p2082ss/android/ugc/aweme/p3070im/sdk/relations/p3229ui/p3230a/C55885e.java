package com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.p3230a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxCheckBox;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageView;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.p3230a.AbstractC55867a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.ui.a.e */
public final class C55885e extends C55879c {
    static {
        Covode.recordClassIndex(65675);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.p3230a.AbstractC55867a, com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.p3230a.C55879c
    public final /* synthetic */ AbstractC55867a.C55871b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m101686a(this, viewGroup, i);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.ui.a.e$a */
    public class C55886a extends AbstractC55867a.C55871b {

        /* renamed from: e */
        public AvatarImageView f127398e;

        /* renamed from: g */
        private TextView f127400g;

        /* renamed from: h */
        private TextView f127401h;

        /* renamed from: i */
        private TextView f127402i;

        /* renamed from: j */
        private TextView f127403j;

        /* renamed from: k */
        private ImageView f127404k;

        /* renamed from: l */
        private ImageView f127405l;

        /* renamed from: m */
        private TuxIconView f127406m;

        /* renamed from: n */
        private View f127407n;

        /* renamed from: o */
        private LinearLayout f127408o;

        static {
            Covode.recordClassIndex(65676);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.p3230a.AbstractC55867a.C55871b, com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.base.C55289a
        /* renamed from: b */
        public final void mo92308b() {
            super.mo92308b();
            this.f127407n = this.itemView.findViewById(R.id.c93);
            this.f127408o = (LinearLayout) this.itemView.findViewById(R.id.ejf);
            this.f127401h = (TextView) this.itemView.findViewById(R.id.title_tv);
            this.f127405l = (ImageView) this.itemView.findViewById(R.id.bmp);
            this.f127403j = (TextView) this.itemView.findViewById(R.id.bmr);
            this.f127356a = (TuxCheckBox) this.itemView.findViewById(R.id.a4l);
            this.f127398e = (AvatarImageView) this.itemView.findViewById(R.id.on);
            this.f127404k = (ImageView) this.itemView.findViewById(R.id.fbe);
            this.f127400g = (TextView) this.itemView.findViewById(R.id.cpq);
            this.f127402i = (TextView) this.itemView.findViewById(R.id.akb);
            this.f127406m = (TuxIconView) this.itemView.findViewById(R.id.b6o);
        }

        public C55886a(View view) {
            super(view);
        }

        /* JADX WARNING: Removed duplicated region for block: B:31:0x00a5  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x00b3  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x00f1  */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x012f  */
        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.p3230a.AbstractC55867a.C55871b
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo92729a(com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact r10, int r11) {
            /*
            // Method dump skipped, instructions count: 668
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.p3230a.C55885e.C55886a.mo92729a(com.ss.android.ugc.aweme.im.service.model.IMContact, int):void");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.p3230a.AbstractC55867a
    /* renamed from: a */
    public final void mo92716a(int i) {
        int b = i - mo92722b();
        if (b >= 0 && b < this.f127343c.size()) {
            Object obj = this.f127343c.get(b);
            for (int i2 = 0; i2 < this.f127343c.size(); i2++) {
                if (obj.equals(this.f127343c.get(i2))) {
                    notifyItemChanged(mo92722b() + i2);
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.p3230a.AbstractC55867a, com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.p3230a.C55879c
    /* renamed from: a */
    public final AbstractC55867a.C55871b mo92714a(ViewGroup viewGroup, int i) {
        int i2;
        if (i == 1 && this.f127347g != null) {
            return super.mo92714a(viewGroup, i);
        }
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 0) {
            i2 = R.layout.a6d;
        } else {
            i2 = R.layout.a6e;
        }
        return new C55886a(C1764a.m5927a(from, i2, viewGroup, false));
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m101686a(C55885e eVar, ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(3976);
        AbstractC55867a.C55871b a2 = eVar.mo92714a(viewGroup, i);
        try {
            if (a2.itemView.getParent() != null) {
                try {
                    a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(a2.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) a2.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(a2.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = a2.getClass().getName();
        MethodCollector.m26664o(3976);
        return a2;
    }
}
