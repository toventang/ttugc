package com.bytedance.android.live.liveinteract.multiguest.p316a.p317a;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.android.live.core.p218f.C3941k;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.effect.api.C4147a;
import com.bytedance.android.livesdkapi.depend.model.C11672a;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.bytedance.android.live.liveinteract.multiguest.a.a.c */
public final class C5130c extends RecyclerView.AbstractC1350a<C5133b> {

    /* renamed from: a */
    public AbstractC5132a f13313a;

    /* renamed from: b */
    public String f13314b = "";

    /* renamed from: c */
    private List<C11672a> f13315c;

    /* renamed from: d */
    private int f13316d;

    /* renamed from: e */
    private int f13317e;

    /* renamed from: f */
    private View.OnClickListener f13318f = new View.OnClickListener() {
        /* class com.bytedance.android.live.liveinteract.multiguest.p316a.p317a.C5130c.View$OnClickListenerC51311 */

        static {
            Covode.recordClassIndex(5723);
        }

        public final void onClick(View view) {
            if (view.getTag(R.id.bky) instanceof C11672a) {
                C11672a aVar = (C11672a) view.getTag(R.id.bky);
                if (!TextUtils.equals(C5130c.this.f13314b, aVar.f27894b)) {
                    C5130c.this.f13314b = aVar.f27894b;
                    C5130c.this.notifyDataSetChanged();
                    if (TextUtils.equals(C5130c.this.f13314b, "")) {
                        C5130c.this.f13313a.mo10864b(aVar);
                    } else if (aVar.f27904l) {
                        C5130c.this.f13313a.mo10864b(aVar);
                    } else if (!aVar.f27905m) {
                        C5130c.this.f13313a.mo10863a(aVar);
                    }
                }
            }
        }
    };

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.a.a.c$a */
    public interface AbstractC5132a {
        static {
            Covode.recordClassIndex(5724);
        }

        /* renamed from: a */
        void mo10863a(C11672a aVar);

        /* renamed from: b */
        void mo10864b(C11672a aVar);
    }

    static {
        Covode.recordClassIndex(5722);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ C5133b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m11345a(this, viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        List<C11672a> list = this.f13315c;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.a.a.c$b */
    public class C5133b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        View f13320a;

        /* renamed from: b */
        View f13321b;

        /* renamed from: c */
        View f13322c;

        /* renamed from: d */
        HSImageView f13323d;

        /* renamed from: e */
        View f13324e;

        static {
            Covode.recordClassIndex(5725);
        }

        C5133b(View view) {
            super(view);
            this.f13320a = view.findViewById(R.id.c88);
            this.f13321b = view.findViewById(R.id.dkh);
            this.f13322c = view.findViewById(R.id.px);
            this.f13323d = (HSImageView) view.findViewById(R.id.bky);
            this.f13324e = view.findViewById(R.id.cfa);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onBindViewHolder(C5133b bVar, int i) {
        boolean z;
        C5133b bVar2 = bVar;
        C11672a aVar = this.f13315c.get(i);
        if (TextUtils.equals(aVar.f27894b, "")) {
            bVar2.f13323d.setImageResource(2131234474);
        } else {
            C3941k.m9601a(bVar2.f13323d, aVar.f27896d.mo7782a());
        }
        if (TextUtils.equals(this.f13314b, aVar.f27894b)) {
            bVar2.f13322c.setVisibility(0);
        } else {
            bVar2.f13322c.setVisibility(8);
        }
        bVar2.f13323d.setTag(R.id.bky, aVar);
        bVar2.f13323d.setOnClickListener(this.f13318f);
        boolean z2 = true;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (i != getItemCount() - 1) {
            z2 = false;
        }
        ConstraintLayout.C0547a aVar2 = (ConstraintLayout.C0547a) bVar2.f13320a.getLayoutParams();
        if (aVar2 == null) {
            aVar2 = new ConstraintLayout.C0547a(-2, -1);
        }
        ConstraintLayout.C0547a aVar3 = (ConstraintLayout.C0547a) bVar2.f13321b.getLayoutParams();
        if (aVar3 == null) {
            aVar3 = new ConstraintLayout.C0547a(-2, -1);
        }
        ViewGroup.LayoutParams layoutParams = bVar2.itemView.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-2, -1);
        }
        if (z) {
            aVar2.width = this.f13316d;
            aVar3.width = this.f13316d / 2;
        } else if (z2) {
            aVar2.width = this.f13316d / 2;
            aVar3.width = this.f13316d;
        } else {
            aVar2.width = this.f13316d / 2;
            aVar3.width = this.f13316d / 2;
        }
        layoutParams.width = aVar2.width + aVar3.width + this.f13317e;
        bVar2.itemView.setLayoutParams(layoutParams);
        bVar2.f13320a.setLayoutParams(aVar2);
        bVar2.f13321b.setLayoutParams(aVar3);
        if (aVar.f27905m) {
            bVar2.f13324e.setVisibility(0);
        } else {
            bVar2.f13324e.setVisibility(8);
        }
    }

    public C5130c(Context context, List<C11672a> list, AbstractC5132a aVar) {
        this.f13315c = list;
        this.f13313a = aVar;
        int a = C13628n.m24504a(context);
        int b = (int) C13628n.m24520b(context, 56.0f);
        this.f13317e = b;
        this.f13316d = (a - (b * 5)) / 6;
    }

    /* renamed from: a */
    public final void mo10861a(String str, C11672a aVar, int i) {
        if (C4147a.f11585c.equals(str)) {
            String str2 = aVar.f27894b;
            for (C11672a aVar2 : this.f13315c) {
                if (TextUtils.equals(str2, aVar2.f27894b)) {
                    if (i == 2) {
                        aVar2.f27905m = false;
                        aVar2.f27904l = true;
                        if (TextUtils.equals(aVar2.f27894b, this.f13314b)) {
                            this.f13313a.mo10864b(aVar2);
                        }
                    } else if (i == 3) {
                        aVar2.f27905m = false;
                    } else if (i == 1) {
                        aVar2.f27905m = true;
                    }
                    notifyDataSetChanged();
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m11345a(C5130c cVar, ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(5166);
        C5133b bVar = new C5133b(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.be5, viewGroup, false));
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
        MethodCollector.m26664o(5166);
        return bVar;
    }
}
