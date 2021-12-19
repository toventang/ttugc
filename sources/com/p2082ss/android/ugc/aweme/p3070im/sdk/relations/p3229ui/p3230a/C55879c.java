package com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.p3230a;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SectionIndexer;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55083f;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.p3230a.AbstractC55867a;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.ui.a.c */
public class C55879c extends AbstractC55867a implements SectionIndexer {

    /* renamed from: m */
    public SectionIndexer f127381m;

    /* renamed from: n */
    public C55881b f127382n = new C55881b();

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.ui.a.c$b */
    public static final class C55881b {

        /* renamed from: a */
        public int f127384a = -1;

        /* renamed from: b */
        public boolean f127385b;

        /* renamed from: c */
        public boolean f127386c;

        /* renamed from: d */
        public String f127387d;

        static {
            Covode.recordClassIndex(65671);
        }
    }

    static {
        Covode.recordClassIndex(65669);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.p3230a.AbstractC55867a
    public /* synthetic */ AbstractC55867a.C55871b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m101672a(this, viewGroup, i);
    }

    public Object[] getSections() {
        SectionIndexer sectionIndexer = this.f127381m;
        if (sectionIndexer != null) {
            return sectionIndexer.getSections();
        }
        return new String[]{" "};
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.p3230a.AbstractC55867a
    public int getItemCount() {
        if (this.f127343c != null) {
            return this.f127343c.size() + mo92722b();
        }
        return mo92722b();
    }

    public int getPositionForSection(int i) {
        SectionIndexer sectionIndexer = this.f127381m;
        if (sectionIndexer != null) {
            return sectionIndexer.getPositionForSection(i);
        }
        return -1;
    }

    public int getSectionForPosition(int i) {
        SectionIndexer sectionIndexer = this.f127381m;
        if (sectionIndexer != null) {
            return sectionIndexer.getSectionForPosition(i);
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.p3230a.AbstractC55867a
    public int getItemViewType(int i) {
        if (mo92723b(i)) {
            return 1;
        }
        return super.getItemViewType(i - mo92722b());
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.p3230a.AbstractC55867a
    /* renamed from: a */
    public final String mo92715a(IMContact iMContact) {
        IMUser a = C55083f.m100745a(iMContact);
        if (a == null) {
            return null;
        }
        if (TextUtils.isEmpty(a.getRemarkName()) || TextUtils.isEmpty(a.getNickName())) {
            return a.getSignature();
        }
        return C17867d.m33078a().getString(R.string.cfl, a.getNickName());
    }

    /* renamed from: c */
    public final C55881b mo92742c(int i) {
        if (this.f127382n.f127384a == i) {
            return this.f127382n;
        }
        this.f127382n.f127384a = i;
        int sectionForPosition = getSectionForPosition(i);
        boolean z = false;
        if (sectionForPosition == -1 || getPositionForSection(sectionForPosition) != i) {
            this.f127382n.f127385b = false;
            this.f127382n.f127387d = null;
        } else {
            this.f127382n.f127385b = true;
            this.f127382n.f127387d = (String) getSections()[sectionForPosition];
        }
        C55881b bVar = this.f127382n;
        if (getPositionForSection(sectionForPosition + 1) - 1 == i) {
            z = true;
        }
        bVar.f127386c = z;
        return this.f127382n;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.ui.a.c$a */
    public class C55880a extends AbstractC55867a.C55871b {
        static {
            Covode.recordClassIndex(65670);
        }

        public C55880a(View view) {
            super(view);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.p3230a.AbstractC55867a
    /* renamed from: a */
    public AbstractC55867a.C55871b mo92714a(ViewGroup viewGroup, int i) {
        return new C55880a(this.f127347g);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.p3230a.AbstractC55867a
    public /* synthetic */ void onBindViewHolder(AbstractC55867a.C55871b bVar, int i) {
        onBindViewHolder(bVar, i);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.p3230a.AbstractC55867a
    /* renamed from: a */
    public final void mo92717a(AbstractC55867a.C55871b bVar, int i) {
        if (!mo92723b(i)) {
            int b = i - mo92722b();
            bVar.mo92729a((IMContact) this.f127343c.get(b), b);
        }
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m101672a(C55879c cVar, ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(3778);
        AbstractC55867a.C55871b a2 = cVar.mo92714a(viewGroup, i);
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
        MethodCollector.m26664o(3778);
        return a2;
    }
}
