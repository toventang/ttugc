package com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui;

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
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.services.apm.api.C22708a;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.C32331a;
import com.p2082ss.android.ugc.aweme.account.p2233a.p2235b.C31376a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
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

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.f */
public final class C32783f {

    /* renamed from: g */
    public static final C32787c f78123g = new C32787c((byte) 0);

    /* renamed from: a */
    public boolean f78124a;

    /* renamed from: b */
    public int f78125b = -1;

    /* renamed from: c */
    public int f78126c = -1;

    /* renamed from: d */
    public final RecyclerView f78127d;

    /* renamed from: e */
    public List<String> f78128e;

    /* renamed from: f */
    public final AbstractC89172b<String, C89391z> f78129f;

    static {
        Covode.recordClassIndex(39562);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.f$c */
    public static final class C32787c {
        static {
            Covode.recordClassIndex(39566);
        }

        private C32787c() {
        }

        public /* synthetic */ C32787c(byte b) {
            this();
        }

        /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.f$c$a */
        static final class C32788a extends AbstractC89220m implements AbstractC89172b<String, C89391z> {

            /* renamed from: a */
            final /* synthetic */ EditText f78134a;

            /* renamed from: b */
            final /* synthetic */ String f78135b;

            /* renamed from: c */
            final /* synthetic */ String f78136c;

            static {
                Covode.recordClassIndex(39567);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C32788a(EditText editText, String str, String str2) {
                super(1);
                this.f78134a = editText;
                this.f78135b = str;
                this.f78136c = str2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(String str) {
                String str2 = str;
                C89219l.m154721d(str2, "");
                Editable text = this.f78134a.getText();
                if (TextUtils.isEmpty(text)) {
                    this.f78134a.setText(str2);
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
                C39162r.m79460a("choose_recommend_email_suffix", new C31376a().mo57399a("enter_from", this.f78135b).mo57399a("enter_method", this.f78136c).f75156a);
                return C89391z.f203057a;
            }
        }

        /* renamed from: a */
        public static C32783f m67382a(RecyclerView recyclerView, EditText editText, String str, String str2) {
            List list;
            List<String> f;
            C89219l.m154721d(recyclerView, "");
            C89219l.m154721d(editText, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            List<String> a = C32331a.m66700a();
            if (a == null || (f = C89070n.m154580f((Iterable) a)) == null) {
                list = null;
            } else {
                ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) f, 10));
                for (String str3 : f) {
                    if (!C89361p.m154929e((CharSequence) str3, (CharSequence) "@")) {
                        str3 = "@".concat(String.valueOf(str3));
                    }
                    arrayList.add(str3);
                }
                list = C89070n.m154585g((Collection) arrayList);
            }
            return new C32783f(recyclerView, list, new C32788a(editText, str, str2));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.f$a */
    public final class C32784a extends RecyclerView.AbstractC1350a<C32785b> {
        static {
            Covode.recordClassIndex(39563);
        }

        /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
        public final /* synthetic */ C32785b onCreateViewHolder(ViewGroup viewGroup, int i) {
            return m67381a(this, viewGroup, i);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
        public final int getItemCount() {
            int i;
            MethodCollector.m26663i(11123);
            synchronized (C32783f.this) {
                try {
                    List<String> list = C32783f.this.f78128e;
                    if (list != null) {
                        i = list.size();
                    } else {
                        i = 0;
                    }
                } finally {
                    MethodCollector.m26664o(11123);
                }
            }
            return i;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C32784a() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
        public final /* synthetic */ void onBindViewHolder(C32785b bVar, int i) {
            String str;
            boolean z;
            MethodCollector.m26663i(11118);
            C32785b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            synchronized (C32783f.this) {
                try {
                    List<String> list = C32783f.this.f78128e;
                    if (!(list == null || (str = (String) C89070n.m154561b((List) list, i)) == null)) {
                        if (C32783f.this.f78126c == i) {
                            z = true;
                        } else {
                            z = false;
                        }
                        C89219l.m154721d(str, "");
                        bVar2.f78131a.setText(str);
                        int b = (int) C13628n.m24520b(C17867d.m33078a(), 5.5f);
                        int b2 = (int) C13628n.m24520b(C17867d.m33078a(), 8.0f);
                        if (!bVar2.f78132b.f78124a || bVar2.getAdapterPosition() != 0) {
                            bVar2.f78131a.setSelected(z);
                            bVar2.f78131a.setBackground(bVar2.f78131a.getResources().getDrawable(R.drawable.hg));
                            bVar2.f78131a.setTextColor(bVar2.f78131a.getResources().getColor(R.color.bx));
                            bVar2.f78131a.setPadding(b2, b, b2, b);
                        } else {
                            bVar2.f78131a.setBackground(bVar2.f78131a.getResources().getDrawable(R.color.c9));
                            bVar2.f78131a.setTextColor(bVar2.f78131a.getResources().getColor(R.color.c5));
                            bVar2.f78131a.setPadding(0, b, 0, b);
                        }
                    }
                } finally {
                    MethodCollector.m26664o(11118);
                }
            }
        }

        /* renamed from: a */
        private static RecyclerView.ViewHolder m67381a(C32784a aVar, ViewGroup viewGroup, int i) {
            C32785b bVar;
            boolean a;
            MethodCollector.m26663i(11125);
            C89219l.m154721d(viewGroup, "");
            if (i == 0) {
                View a2 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.gp, viewGroup, false);
                C32783f fVar = C32783f.this;
                if (a2 != null) {
                    bVar = new C32785b(fVar, (TuxTextView) a2);
                } else {
                    NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.bytedance.tux.input.TuxTextView");
                    MethodCollector.m26664o(11125);
                    throw nullPointerException;
                }
            } else {
                View a3 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.gi, viewGroup, false);
                C32783f fVar2 = C32783f.this;
                if (a3 != null) {
                    bVar = new C32785b(fVar2, (TuxTextView) a3);
                } else {
                    NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type com.bytedance.tux.input.TuxTextView");
                    MethodCollector.m26664o(11125);
                    throw nullPointerException2;
                }
            }
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
            MethodCollector.m26664o(11125);
            return bVar;
        }
    }

    /* renamed from: a */
    public final void mo58585a(List<String> list) {
        List<String> list2;
        MethodCollector.m26663i(13122);
        synchronized (this) {
            if (list != null) {
                try {
                    list2 = C89070n.m154585g((Collection) list);
                } catch (Throwable th) {
                    MethodCollector.m26664o(13122);
                    throw th;
                }
            } else {
                list2 = null;
            }
            this.f78128e = list2;
            if (list2 != null && !list2.isEmpty()) {
                if (this.f78127d.getVisibility() != 0) {
                    this.f78127d.mo4413b(0);
                    this.f78127d.setVisibility(0);
                }
                if (this.f78124a) {
                    List<String> list3 = this.f78128e;
                    if (list3 == null) {
                        C89219l.m154715b();
                    }
                    String string = this.f78127d.getContext().getString(R.string.app);
                    C89219l.m154716b(string, "");
                    list3.add(0, string);
                }
                if (this.f78127d.getAdapter() == null) {
                    this.f78127d.setAdapter(new C32784a());
                } else {
                    RecyclerView.AbstractC1350a adapter = this.f78127d.getAdapter();
                    if (adapter == null) {
                        C89219l.m154715b();
                    }
                    adapter.notifyDataSetChanged();
                }
            } else if (this.f78127d.getVisibility() != 8) {
                this.f78127d.setVisibility(8);
            }
        }
        MethodCollector.m26664o(13122);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.f$b */
    public final class C32785b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final TextView f78131a;

        /* renamed from: b */
        final /* synthetic */ C32783f f78132b;

        static {
            Covode.recordClassIndex(39564);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32785b(C32783f fVar, TextView textView) {
            super(textView);
            C89219l.m154721d(textView, "");
            this.f78132b = fVar;
            this.f78131a = textView;
            textView.setOnClickListener(new View.OnClickListener(this) {
                /* class com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.C32783f.C32785b.View$OnClickListenerC327861 */

                /* renamed from: a */
                final /* synthetic */ C32785b f78133a;

                static {
                    Covode.recordClassIndex(39565);
                }

                {
                    this.f78133a = r1;
                }

                /* JADX DEBUG: Multi-variable search result rejected for r0v14, resolved type: h.f.a.b<java.lang.String, h.z> */
                /* JADX WARN: Multi-variable type inference failed */
                public final void onClick(View view) {
                    List<String> list;
                    Object b;
                    ClickAgent.onClick(view);
                    C32785b bVar = this.f78133a;
                    int adapterPosition = bVar.getAdapterPosition();
                    if ((!bVar.f78132b.f78124a || adapterPosition != 0) && (list = bVar.f78132b.f78128e) != null && (b = C89070n.m154561b((List) list, adapterPosition)) != null) {
                        bVar.f78132b.f78125b = bVar.f78132b.f78126c;
                        bVar.f78132b.f78126c = adapterPosition;
                        if (bVar.f78132b.f78125b != -1) {
                            RecyclerView.AbstractC1350a adapter = bVar.f78132b.f78127d.getAdapter();
                            if (adapter == null) {
                                C89219l.m154715b();
                            }
                            adapter.notifyItemChanged(bVar.f78132b.f78125b);
                        }
                        RecyclerView.AbstractC1350a adapter2 = bVar.f78132b.f78127d.getAdapter();
                        if (adapter2 == null) {
                            C89219l.m154715b();
                        }
                        adapter2.notifyItemChanged(bVar.f78132b.f78126c);
                        bVar.f78132b.f78129f.invoke(b);
                    }
                }
            });
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: h.f.a.b<? super java.lang.String, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public C32783f(RecyclerView recyclerView, List<String> list, AbstractC89172b<? super String, C89391z> bVar) {
        C89219l.m154721d(recyclerView, "");
        C89219l.m154721d(bVar, "");
        this.f78127d = recyclerView;
        this.f78128e = list;
        this.f78129f = bVar;
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        List<String> list2 = this.f78128e;
        if (list2 == null || !(!list2.isEmpty())) {
            recyclerView.setVisibility(8);
            return;
        }
        if (this.f78124a) {
            List<String> list3 = this.f78128e;
            if (list3 == null) {
                C89219l.m154715b();
            }
            String string = recyclerView.getContext().getString(R.string.app);
            C89219l.m154716b(string, "");
            list3.add(0, string);
        }
        if (recyclerView.getAdapter() == null) {
            recyclerView.setAdapter(new C32784a());
            return;
        }
        RecyclerView.AbstractC1350a adapter = recyclerView.getAdapter();
        if (adapter == null) {
            C89219l.m154715b();
        }
        adapter.notifyDataSetChanged();
    }
}
