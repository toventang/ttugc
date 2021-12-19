package com.bytedance.android.livesdk.p424a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.android.live.broadcast.model.C3265j;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.a.u */
public final class C6493u extends RecyclerView.AbstractC1350a<C6494a> {

    /* renamed from: a */
    public final List<C3265j> f16132a;

    /* renamed from: b */
    public Integer f16133b;

    /* renamed from: c */
    public C3265j f16134c;

    /* renamed from: d */
    public AbstractC89172b<? super C3265j, C89391z> f16135d;

    /* renamed from: e */
    public final Context f16136e;

    /* renamed from: f */
    public final boolean f16137f;

    static {
        Covode.recordClassIndex(7229);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ C6494a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m13883a(this, viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f16132a.size();
    }

    public /* synthetic */ C6493u(Context context) {
        this(context, true);
    }

    /* renamed from: a */
    public final void mo12621a(List<C3265j> list) {
        C89219l.m154721d(list, "");
        this.f16132a.clear();
        this.f16132a.addAll(list);
        this.f16133b = null;
        this.f16134c = null;
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public final void mo12620a(C3265j jVar) {
        C89219l.m154721d(jVar, "");
        int indexOf = this.f16132a.indexOf(jVar);
        Integer num = this.f16133b;
        if ((num == null || indexOf != num.intValue()) && indexOf >= 0) {
            Integer num2 = this.f16133b;
            this.f16133b = Integer.valueOf(indexOf);
            this.f16134c = jVar;
            notifyItemChanged(indexOf);
            if (num2 != null) {
                notifyItemChanged(num2.intValue());
            }
            AbstractC89172b<? super C3265j, C89391z> bVar = this.f16135d;
            if (bVar != null) {
                bVar.invoke(jVar);
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.a.u$a */
    public final class C6494a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final TextView f16138a;

        /* renamed from: b */
        public final RadioButton f16139b;

        /* renamed from: c */
        final /* synthetic */ C6493u f16140c;

        /* renamed from: d */
        private final View f16141d;

        static {
            Covode.recordClassIndex(7230);
        }

        /* renamed from: com.bytedance.android.livesdk.a.u$a$a */
        static final class View$OnClickListenerC6495a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C6494a f16142a;

            static {
                Covode.recordClassIndex(7231);
            }

            View$OnClickListenerC6495a(C6494a aVar) {
                this.f16142a = aVar;
            }

            public final void onClick(View view) {
                Integer num = this.f16142a.f16140c.f16133b;
                this.f16142a.f16140c.f16133b = Integer.valueOf(this.f16142a.getAdapterPosition());
                this.f16142a.f16140c.f16134c = this.f16142a.f16140c.f16132a.get(this.f16142a.getAdapterPosition());
                Integer num2 = this.f16142a.f16140c.f16133b;
                if (num2 != null) {
                    int intValue = num2.intValue();
                    this.f16142a.f16140c.notifyItemChanged(intValue);
                    AbstractC89172b<? super C3265j, C89391z> bVar = this.f16142a.f16140c.f16135d;
                    if (bVar != null) {
                        bVar.invoke(this.f16142a.f16140c.f16132a.get(intValue));
                    }
                }
                if (num != null) {
                    this.f16142a.f16140c.notifyItemChanged(num.intValue());
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6494a(C6493u uVar, View view) {
            super(view);
            C89219l.m154721d(view, "");
            this.f16140c = uVar;
            View findViewById = view.findViewById(R.id.cow);
            C89219l.m154716b(findViewById, "");
            TextView textView = (TextView) findViewById;
            this.f16138a = textView;
            View findViewById2 = view.findViewById(R.id.cox);
            C89219l.m154716b(findViewById2, "");
            RadioButton radioButton = (RadioButton) findViewById2;
            this.f16139b = radioButton;
            View findViewById3 = view.findViewById(R.id.c93);
            C89219l.m154716b(findViewById3, "");
            this.f16141d = findViewById3;
            View$OnClickListenerC6495a aVar = new View$OnClickListenerC6495a(this);
            radioButton.setOnClickListener(aVar);
            view.setOnClickListener(aVar);
            if (!uVar.f16137f) {
                textView.setTextColor(-1);
                findViewById3.setBackgroundColor(Color.parseColor("#80FFFFFF"));
            }
        }
    }

    public C6493u(Context context, boolean z) {
        C89219l.m154721d(context, "");
        this.f16136e = context;
        this.f16137f = z;
        this.f16132a = new ArrayList();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onBindViewHolder(C6494a aVar, int i) {
        String quantityString;
        C6494a aVar2 = aVar;
        C89219l.m154721d(aVar2, "");
        TextView textView = aVar2.f16138a;
        C3265j jVar = this.f16132a.get(i);
        Context context = this.f16136e;
        C89219l.m154721d(jVar, "");
        C89219l.m154721d(context, "");
        boolean z = false;
        if (jVar.f9352a == -1) {
            quantityString = context.getString(R.string.ee1);
            C89219l.m154716b(quantityString, "");
        } else if (jVar.f9352a < 60) {
            quantityString = context.getResources().getQuantityString(R.plurals.gb, (int) jVar.f9352a, Integer.valueOf((int) jVar.f9352a));
            C89219l.m154716b(quantityString, "");
        } else {
            Resources resources = context.getResources();
            int i2 = (int) (jVar.f9352a / 60);
            quantityString = resources.getQuantityString(R.plurals.ga, i2, Integer.valueOf(i2));
            C89219l.m154716b(quantityString, "");
        }
        textView.setText(quantityString);
        RadioButton radioButton = aVar2.f16139b;
        Integer num = this.f16133b;
        if (num != null && i == num.intValue()) {
            z = true;
        }
        radioButton.setChecked(z);
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m13883a(C6493u uVar, ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(3888);
        C89219l.m154721d(viewGroup, "");
        View a2 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.b_j, viewGroup, false);
        C89219l.m154716b(a2, "");
        C6494a aVar = new C6494a(uVar, a2);
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
        MethodCollector.m26664o(3888);
        return aVar;
    }
}
