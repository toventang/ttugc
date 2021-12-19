package com.bytedance.android.livesdk.p450an.p451a;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.core.widget.C0823h;
import androidx.fragment.app.AbstractC0952i;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.design.C4079b;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.android.live.design.widget.LiveSwitch;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.p450an.C6800c;
import com.bytedance.android.livesdk.p450an.p451a.C6791b;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6805b;
import com.bytedance.android.livesdk.p452ao.C6806c;
import com.bytedance.android.livesdk.p643ui.C10935a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.android.livesdk.an.a.a */
public final class C6783a extends C10935a {

    /* renamed from: a */
    public C6787b f16824a;

    /* renamed from: b */
    public List<? extends C6805b<?>> f16825b;

    /* renamed from: c */
    private RecyclerView f16826c;

    /* renamed from: d */
    private LiveEditText f16827d;

    /* renamed from: e */
    private HashMap f16828e;

    static {
        Covode.recordClassIndex(7521);
    }

    /* renamed from: com.bytedance.android.livesdk.an.a.a$b */
    public static final class C6787b extends RecyclerView.AbstractC1350a<C6784a> {

        /* renamed from: a */
        public List<? extends C6805b<?>> f16838a;

        /* renamed from: b */
        public AbstractC89183m<? super C6805b<?>, ? super Integer, C89391z> f16839b;

        static {
            Covode.recordClassIndex(7525);
        }

        /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
        public final /* synthetic */ C6784a onCreateViewHolder(ViewGroup viewGroup, int i) {
            return m14572a(this, viewGroup, i);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
        public final int getItemCount() {
            return this.f16838a.size();
        }

        public C6787b(List<? extends C6805b<?>> list, AbstractC89183m<? super C6805b<?>, ? super Integer, C89391z> mVar) {
            C89219l.m154721d(list, "");
            C89219l.m154721d(mVar, "");
            this.f16838a = list;
            this.f16839b = mVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
        public final /* synthetic */ void onBindViewHolder(C6784a aVar, int i) {
            Object obj;
            C6784a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            C6805b bVar = (C6805b) this.f16838a.get(i);
            C6784a.m14571a(aVar2.f16830b, aVar2.f16829a, bVar);
            if (bVar != null) {
                obj = bVar.mo13066a();
            } else {
                obj = null;
            }
            if (obj instanceof Boolean) {
                LiveSwitch liveSwitch = aVar2.f16831c;
                if (liveSwitch != null) {
                    liveSwitch.setVisibility(0);
                }
                LiveSwitch liveSwitch2 = aVar2.f16831c;
                if (liveSwitch2 != null) {
                    C89219l.m154716b(bVar, "");
                    Object a = bVar.mo13066a();
                    Objects.requireNonNull(a, "null cannot be cast to non-null type kotlin.Boolean");
                    liveSwitch2.setChecked(((Boolean) a).booleanValue());
                }
                LiveSwitch liveSwitch3 = aVar2.f16831c;
                if (liveSwitch3 != null) {
                    liveSwitch3.setOnCheckedChangeListener(new C6784a.C6785a(aVar2, bVar));
                }
            } else {
                LiveSwitch liveSwitch4 = aVar2.f16831c;
                if (liveSwitch4 != null) {
                    liveSwitch4.setVisibility(8);
                }
            }
            aVar2.itemView.setOnClickListener(new C6784a.View$OnClickListenerC6786b(aVar2, bVar, i));
        }

        /* renamed from: a */
        private static RecyclerView.ViewHolder m14572a(C6787b bVar, ViewGroup viewGroup, int i) {
            boolean a;
            MethodCollector.m26663i(10964);
            C89219l.m154721d(viewGroup, "");
            View a2 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.b_e, viewGroup, false);
            C89219l.m154716b(a2, "");
            C6784a aVar = new C6784a(a2, bVar.f16839b);
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
            MethodCollector.m26664o(10964);
            return aVar;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.an.a.a$d */
    static final class C6789d extends AbstractC89220m implements AbstractC89183m<C6805b<?>, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C6783a f16841a;

        static {
            Covode.recordClassIndex(7527);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6789d(C6783a aVar) {
            super(2);
            this.f16841a = aVar;
        }

        /* renamed from: com.bytedance.android.livesdk.an.a.a$d$a */
        static final class C6790a extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ C6789d f16842a;

            /* renamed from: b */
            final /* synthetic */ C6805b f16843b;

            /* renamed from: c */
            final /* synthetic */ int f16844c;

            static {
                Covode.recordClassIndex(7528);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C6790a(C6789d dVar, C6805b bVar, int i) {
                super(0);
                this.f16842a = dVar;
                this.f16843b = bVar;
                this.f16844c = i;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                C6787b bVar = this.f16842a.f16841a.f16824a;
                if (bVar != null) {
                    bVar.notifyItemChanged(this.f16844c);
                }
                return C89391z.f203057a;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C6805b<?> bVar, Integer num) {
            AbstractC0952i fragmentManager;
            C6805b<?> bVar2 = bVar;
            int intValue = num.intValue();
            C89219l.m154721d(bVar2, "");
            if (!(bVar2.mo13066a() instanceof Boolean) && (fragmentManager = this.f16841a.getFragmentManager()) != null) {
                C89219l.m154716b(fragmentManager, "");
                C6790a aVar = new C6790a(this, bVar2, intValue);
                C89219l.m154721d(fragmentManager, "");
                C89219l.m154721d(bVar2, "");
                C89219l.m154721d(aVar, "");
                C6791b.f16846d = bVar2;
                C6791b bVar3 = new C6791b();
                bVar3.show(fragmentManager, "KevaTestDialog");
                bVar3.f16848a = new C6791b.C6792a.C6793a(bVar2, aVar, bVar3);
                bVar3.mo13059e();
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f16828e;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public C6783a() {
        ArrayList arrayList = new ArrayList();
        Field[] declaredFields = AbstractC6804a.class.getDeclaredFields();
        for (Field field : declaredFields) {
            C89219l.m154716b(field, "");
            field.setAccessible(true);
            Object obj = field.get(AbstractC6804a.class);
            if (obj instanceof C6805b) {
                C6800c cVar = (C6800c) obj;
                arrayList.add(new C6805b(cVar.f16860a, cVar.mo13066a()));
            }
        }
        this.f16825b = arrayList;
    }

    /* renamed from: com.bytedance.android.livesdk.an.a.a$c */
    public static final class C6788c implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ C6783a f16840a;

        static {
            Covode.recordClassIndex(7526);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C6788c(C6783a aVar) {
            this.f16840a = aVar;
        }

        public final void afterTextChanged(Editable editable) {
            String str;
            if (editable != null) {
                String valueOf = String.valueOf(editable);
                Objects.requireNonNull(valueOf, "null cannot be cast to non-null type kotlin.CharSequence");
                String obj = C89361p.m154910b((CharSequence) valueOf).toString();
                List<? extends C6805b<?>> list = this.f16840a.f16825b;
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = list.iterator();
                while (true) {
                    str = "";
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    Pattern compile = Pattern.compile("(?i)".concat(String.valueOf(obj)));
                    String str2 = next.f16860a;
                    if (str2 != null) {
                        str = str2;
                    }
                    if (compile.matcher(str).find()) {
                        arrayList.add(next);
                    }
                }
                ArrayList arrayList2 = arrayList;
                C6787b bVar = this.f16840a.f16824a;
                if (bVar != null) {
                    C89219l.m154721d(arrayList2, str);
                    bVar.f16838a = arrayList2;
                    bVar.notifyDataSetChanged();
                }
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.an.a.a$a */
    public static final class C6784a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final LiveTextView f16829a;

        /* renamed from: b */
        public final LiveTextView f16830b;

        /* renamed from: c */
        final LiveSwitch f16831c;

        /* renamed from: d */
        public AbstractC89183m<? super C6805b<?>, ? super Integer, C89391z> f16832d;

        static {
            Covode.recordClassIndex(7522);
        }

        /* renamed from: com.bytedance.android.livesdk.an.a.a$a$b */
        static final class View$OnClickListenerC6786b implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C6784a f16835a;

            /* renamed from: b */
            final /* synthetic */ C6805b f16836b;

            /* renamed from: c */
            final /* synthetic */ int f16837c;

            static {
                Covode.recordClassIndex(7524);
            }

            View$OnClickListenerC6786b(C6784a aVar, C6805b bVar, int i) {
                this.f16835a = aVar;
                this.f16836b = bVar;
                this.f16837c = i;
            }

            public final void onClick(View view) {
                C6805b bVar = this.f16836b;
                if (bVar != null) {
                    this.f16835a.f16832d.invoke(bVar, Integer.valueOf(this.f16837c));
                }
            }
        }

        /* renamed from: com.bytedance.android.livesdk.an.a.a$a$a */
        static final class C6785a implements CompoundButton.OnCheckedChangeListener {

            /* renamed from: a */
            final /* synthetic */ C6784a f16833a;

            /* renamed from: b */
            final /* synthetic */ C6805b f16834b;

            static {
                Covode.recordClassIndex(7523);
            }

            C6785a(C6784a aVar, C6805b bVar) {
                this.f16833a = aVar;
                this.f16834b = bVar;
            }

            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                C6805b bVar = this.f16834b;
                C89219l.m154716b(bVar, "");
                C6806c.m14603a(bVar, Boolean.valueOf(z));
                C6784a.m14571a(this.f16833a.f16830b, this.f16833a.f16829a, this.f16834b);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6784a(View view, AbstractC89183m<? super C6805b<?>, ? super Integer, C89391z> mVar) {
            super(view);
            C89219l.m154721d(view, "");
            C89219l.m154721d(mVar, "");
            this.f16832d = mVar;
            this.f16829a = (LiveTextView) view.findViewById(R.id.exw);
            this.f16830b = (LiveTextView) view.findViewById(R.id.f6w);
            this.f16831c = (LiveSwitch) view.findViewById(R.id.brn);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: java.lang.Object */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public static void m14571a(LiveTextView liveTextView, LiveTextView liveTextView2, C6805b<?> bVar) {
            Object obj;
            Object a;
            String str;
            Object a2;
            Class<?> cls;
            String cls2;
            List<String> b;
            Object obj2 = null;
            if (bVar == null || (a2 = bVar.mo13066a()) == null || (cls = a2.getClass()) == null || (cls2 = cls.toString()) == null || (b = C89361p.m154915b(cls2, new String[]{"."})) == null) {
                obj = null;
            } else {
                obj = C89070n.m154586h((List) b);
            }
            String str2 = "";
            if (liveTextView2 != null) {
                Object[] objArr = new Object[1];
                if (bVar == null || (str = bVar.f16860a) == null) {
                    str = str2;
                }
                objArr[0] = str;
                liveTextView2.setText(C3966y.m9660a((int) R.string.gvf, objArr));
            }
            if (bVar != null) {
                obj2 = bVar.mo13066a();
            }
            if (obj2 instanceof String) {
                C89219l.m154716b(bVar, str2);
                if (bVar.mo13066a().toString().length() > 100) {
                    String obj3 = bVar.mo13066a().toString();
                    Objects.requireNonNull(obj3, "null cannot be cast to non-null type java.lang.String");
                    String substring = obj3.substring(0, 100);
                    C89219l.m154716b(substring, str2);
                    if (liveTextView != null) {
                        liveTextView.setText(C3966y.m9660a((int) R.string.gvg, obj, substring));
                        return;
                    }
                    return;
                }
            }
            if (liveTextView != null) {
                Object[] objArr2 = new Object[2];
                objArr2[0] = obj;
                if (!(bVar == null || (a = bVar.mo13066a()) == 0)) {
                    str2 = a;
                }
                objArr2[1] = str2;
                liveTextView.setText(C3966y.m9660a((int) R.string.gvg, objArr2));
            }
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        if (this.f16827d == null) {
            this.f16827d = (LiveEditText) view.findViewWithTag("search_view");
        }
        LiveEditText liveEditText = this.f16827d;
        if (liveEditText != null) {
            liveEditText.addTextChangedListener(new C6788c(this));
        }
        if (this.f16826c == null) {
            this.f16826c = (RecyclerView) view.findViewWithTag("recycler_view");
        }
        this.f16824a = new C6787b(this.f16825b, new C6789d(this));
        RecyclerView recyclerView = this.f16826c;
        if (recyclerView != null) {
            getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        }
        RecyclerView recyclerView2 = this.f16826c;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.f16824a);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView;
        MethodCollector.m26663i(9097);
        C89219l.m154721d(layoutInflater, "");
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        linearLayout.setBackground(C3966y.m9665c(R.drawable.bsd));
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        LiveTextView liveTextView = new LiveTextView(layoutInflater.getContext());
        C0823h.m2907a(liveTextView, (int) R.style.k4);
        liveTextView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        liveTextView.setPadding(C3966y.m9653a(16.0f), C3966y.m9653a(8.0f), C3966y.m9653a(16.0f), C3966y.m9653a(8.0f));
        liveTextView.setText(C3966y.m9657a((int) R.string.gvj));
        liveTextView.setBackgroundColor(Color.parseColor("#55112233"));
        liveTextView.setTextColor(-1);
        linearLayout.addView(liveTextView);
        LiveEditText liveEditText = new LiveEditText(layoutInflater.getContext());
        this.f16827d = liveEditText;
        C0823h.m2907a(liveEditText, (int) R.style.k7);
        liveEditText.setTag("search_view");
        liveEditText.setLayoutParams(new LinearLayout.LayoutParams(-1, C3966y.m9653a(50.0f)));
        liveEditText.setPadding(C3966y.m9653a(16.0f), 0, C3966y.m9653a(16.0f), 0);
        liveEditText.setMaxLines(1);
        liveEditText.setGravity(16);
        liveEditText.setHint("input search keywords");
        liveEditText.setSingleLine();
        liveEditText.setFocusable(true);
        liveEditText.setFocusableInTouchMode(true);
        linearLayout.addView(this.f16827d);
        liveEditText.setBackgroundColor(C4079b.m9889a(liveEditText, (int) R.attr.al4));
        liveEditText.setImeOptions(3);
        liveEditText.requestFocus();
        RecyclerView recyclerView2 = new RecyclerView(layoutInflater.getContext());
        this.f16826c = recyclerView2;
        recyclerView2.setTag("recycler_view");
        RecyclerView recyclerView3 = this.f16826c;
        if (recyclerView3 != null) {
            recyclerView3.setScrollBarSize(C3966y.m9653a(3.0f));
        }
        if (Build.VERSION.SDK_INT >= 29 && (recyclerView = this.f16826c) != null) {
            recyclerView.setVerticalScrollbarThumbDrawable(new ColorDrawable(-7829368));
        }
        RecyclerView recyclerView4 = this.f16826c;
        if (recyclerView4 != null) {
            recyclerView4.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        }
        linearLayout.addView(this.f16826c);
        MethodCollector.m26664o(9097);
        return linearLayout;
    }
}
