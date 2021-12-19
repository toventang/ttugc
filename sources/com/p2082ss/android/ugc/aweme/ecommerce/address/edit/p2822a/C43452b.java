package com.p2082ss.android.ugc.aweme.ecommerce.address.edit.p2822a;

import android.text.Editable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
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
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.a.b */
public final class C43452b {

    /* renamed from: f */
    public static final C43456c f101367f = new C43456c((byte) 0);

    /* renamed from: a */
    public int f101368a = -1;

    /* renamed from: b */
    public int f101369b = -1;

    /* renamed from: c */
    public final RecyclerView f101370c;

    /* renamed from: d */
    public List<String> f101371d;

    /* renamed from: e */
    public final AbstractC89172b<String, C89391z> f101372e;

    static {
        Covode.recordClassIndex(51681);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.a.b$c */
    public static final class C43456c {
        static {
            Covode.recordClassIndex(51685);
        }

        private C43456c() {
        }

        public /* synthetic */ C43456c(byte b) {
            this();
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.a.b$c$a */
        static final class C43457a extends AbstractC89220m implements AbstractC89172b<String, C89391z> {

            /* renamed from: a */
            final /* synthetic */ EditText f101377a;

            static {
                Covode.recordClassIndex(51686);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C43457a(EditText editText) {
                super(1);
                this.f101377a = editText;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(String str) {
                String str2 = str;
                C89219l.m154721d(str2, "");
                Editable text = this.f101377a.getText();
                if (TextUtils.isEmpty(text)) {
                    this.f101377a.setText(str2);
                } else {
                    if (text == null) {
                        C89219l.m154715b();
                    }
                    int a = C89361p.m154888a((CharSequence) text.toString(), "@", 0, false, 6);
                    if (a != -1) {
                        text.replace(a, text.length(), str2);
                    } else {
                        text.append((CharSequence) str2);
                    }
                }
                return C89391z.f203057a;
            }
        }

        /* renamed from: a */
        public static C43452b m86515a(RecyclerView recyclerView, EditText editText) {
            List list;
            List<String> f;
            C89219l.m154721d(recyclerView, "");
            C89219l.m154721d(editText, "");
            List<String> a = C43451a.m86513a();
            if (a == null || (f = C89070n.m154580f((Iterable) a)) == null) {
                list = null;
            } else {
                ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) f, 10));
                for (String str : f) {
                    if (!C89361p.m154929e((CharSequence) str, (CharSequence) "@")) {
                        str = "@".concat(String.valueOf(str));
                    }
                    arrayList.add(str);
                }
                list = C89070n.m154585g((Collection) arrayList);
            }
            return new C43452b(recyclerView, list, new C43457a(editText));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.a.b$a */
    public final class C43453a extends RecyclerView.AbstractC1350a<C43454b> {
        static {
            Covode.recordClassIndex(51682);
        }

        /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
        public final /* synthetic */ C43454b onCreateViewHolder(ViewGroup viewGroup, int i) {
            return m86514a(this, viewGroup, i);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
        public final int getItemCount() {
            List<String> list = C43452b.this.f101371d;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C43453a() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
        public final /* synthetic */ void onBindViewHolder(C43454b bVar, int i) {
            String str;
            boolean z;
            C43454b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            List<String> list = C43452b.this.f101371d;
            if (list != null && (str = (String) C89070n.m154561b((List) list, i)) != null) {
                if (C43452b.this.f101369b == i) {
                    z = true;
                } else {
                    z = false;
                }
                C89219l.m154721d(str, "");
                bVar2.f101374a.setText(str);
                bVar2.f101374a.setSelected(z);
            }
        }

        /* renamed from: a */
        private static RecyclerView.ViewHolder m86514a(C43453a aVar, ViewGroup viewGroup, int i) {
            boolean a;
            MethodCollector.m26663i(9228);
            C89219l.m154721d(viewGroup, "");
            View a2 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.ol, viewGroup, false);
            C43452b bVar = C43452b.this;
            if (a2 != null) {
                C43454b bVar2 = new C43454b(bVar, (TextView) a2);
                try {
                    if (bVar2.itemView.getParent() != null) {
                        try {
                            a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                        } catch (Exception unused) {
                        }
                        if (a) {
                            StringBuffer stringBuffer = new StringBuffer();
                            stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(bVar2.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                            C22708a.m42800a(stringBuffer.toString());
                            ViewGroup viewGroup2 = (ViewGroup) bVar2.itemView.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(bVar2.itemView);
                            }
                        }
                    }
                } catch (Exception e) {
                    C63423ai.m115002a(e);
                    C51423a.m95786a(e);
                }
                C80493gg.f180088a = bVar2.getClass().getName();
                MethodCollector.m26664o(9228);
                return bVar2;
            }
            NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            MethodCollector.m26664o(9228);
            throw nullPointerException;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.a.b$b */
    public final class C43454b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final TextView f101374a;

        /* renamed from: b */
        final /* synthetic */ C43452b f101375b;

        static {
            Covode.recordClassIndex(51683);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43454b(C43452b bVar, TextView textView) {
            super(textView);
            C89219l.m154721d(textView, "");
            this.f101375b = bVar;
            this.f101374a = textView;
            textView.setOnClickListener(new View.OnClickListener(this) {
                /* class com.p2082ss.android.ugc.aweme.ecommerce.address.edit.p2822a.C43452b.C43454b.View$OnClickListenerC434551 */

                /* renamed from: a */
                final /* synthetic */ C43454b f101376a;

                static {
                    Covode.recordClassIndex(51684);
                }

                {
                    this.f101376a = r1;
                }

                /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: h.f.a.b<java.lang.String, h.z> */
                /* JADX WARN: Multi-variable type inference failed */
                public final void onClick(View view) {
                    Object b;
                    ClickAgent.onClick(view);
                    C43454b bVar = this.f101376a;
                    int adapterPosition = bVar.getAdapterPosition();
                    List<String> list = bVar.f101375b.f101371d;
                    if (list != null && (b = C89070n.m154561b((List) list, adapterPosition)) != null) {
                        bVar.f101375b.f101368a = bVar.f101375b.f101369b;
                        bVar.f101375b.f101369b = adapterPosition;
                        if (bVar.f101375b.f101368a != -1) {
                            RecyclerView.AbstractC1350a adapter = bVar.f101375b.f101370c.getAdapter();
                            if (adapter == null) {
                                C89219l.m154715b();
                            }
                            adapter.notifyItemChanged(bVar.f101375b.f101368a);
                        }
                        RecyclerView.AbstractC1350a adapter2 = bVar.f101375b.f101370c.getAdapter();
                        if (adapter2 == null) {
                            C89219l.m154715b();
                        }
                        adapter2.notifyItemChanged(bVar.f101375b.f101369b);
                        bVar.f101375b.f101372e.invoke(b);
                    }
                }
            });
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: h.f.a.b<? super java.lang.String, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public C43452b(RecyclerView recyclerView, List<String> list, AbstractC89172b<? super String, C89391z> bVar) {
        C89219l.m154721d(recyclerView, "");
        C89219l.m154721d(bVar, "");
        this.f101370c = recyclerView;
        this.f101371d = list;
        this.f101372e = bVar;
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        List<String> list2 = this.f101371d;
        if (list2 == null || !(!list2.isEmpty())) {
            recyclerView.setVisibility(8);
        } else if (recyclerView.getAdapter() == null) {
            recyclerView.setAdapter(new C43453a());
        } else {
            RecyclerView.AbstractC1350a adapter = recyclerView.getAdapter();
            if (adapter == null) {
                C89219l.m154715b();
            }
            adapter.notifyDataSetChanged();
        }
    }
}
