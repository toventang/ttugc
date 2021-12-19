package com.bytedance.android.livesdk.chatroom.p499ui;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0945e;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.android.live.base.model.C2962b;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.p218f.C3951p;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.core.widget.C4031a;
import com.bytedance.android.live.p176b.AbstractC2928f;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.browser.p462c.AbstractC6956d;
import com.bytedance.android.livesdk.browser.p462c.AbstractC6963e;
import com.bytedance.android.livesdk.chatroom.C7260a;
import com.bytedance.android.livesdk.chatroom.p488c.C7370ac;
import com.bytedance.android.livesdk.model.C9533aq;
import com.bytedance.android.livesdk.p449am.C6779a;
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
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.dv */
public final class C7923dv extends RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> {

    /* renamed from: d */
    private static final C7924a f19723d = new C7924a((byte) 0);

    /* renamed from: a */
    final List<C9533aq> f19724a = new ArrayList();

    /* renamed from: b */
    String f19725b = "";

    /* renamed from: c */
    private final ActivityC0945e f19726c;

    static {
        Covode.recordClassIndex(8718);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m16058a(viewGroup, i);
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.dv$a */
    static final class C7924a {
        static {
            Covode.recordClassIndex(8719);
        }

        private C7924a() {
        }

        public /* synthetic */ C7924a(byte b) {
            this();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f19724a.size() + 1;
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.dv$b */
    public static final class C7925b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final ImageView f19727a;

        /* renamed from: b */
        final ImageView f19728b;

        /* renamed from: c */
        final TextView f19729c;

        /* renamed from: d */
        final TextView f19730d;

        static {
            Covode.recordClassIndex(8720);
        }

        /* renamed from: com.bytedance.android.livesdk.chatroom.ui.dv$b$b */
        static final class View$OnClickListenerC7927b implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C9533aq f19733a;

            static {
                Covode.recordClassIndex(8722);
            }

            View$OnClickListenerC7927b(C9533aq aqVar) {
                this.f19733a = aqVar;
            }

            public final void onClick(View view) {
                C6779a.m14563a().mo13053a(new C7370ac(this.f19733a));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7925b(View view) {
            super(view);
            C89219l.m154721d(view, "");
            this.f19727a = (ImageView) view.findViewById(R.id.e8b);
            this.f19728b = (ImageView) view.findViewById(R.id.e8d);
            this.f19729c = (TextView) view.findViewById(R.id.e8e);
            this.f19730d = (TextView) view.findViewById(R.id.e8c);
        }

        /* renamed from: com.bytedance.android.livesdk.chatroom.ui.dv$b$a */
        static final class View$OnClickListenerC7926a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C9533aq f19731a;

            /* renamed from: b */
            final /* synthetic */ ActivityC0945e f19732b;

            static {
                Covode.recordClassIndex(8721);
            }

            View$OnClickListenerC7926a(C9533aq aqVar, ActivityC0945e eVar) {
                this.f19731a = aqVar;
                this.f19732b = eVar;
            }

            public final void onClick(View view) {
                String str;
                AbstractC6956d webViewManager;
                C9533aq aqVar = this.f19731a;
                if (aqVar == null || (str = aqVar.f23148d) == null) {
                    str = "";
                }
                AbstractC6956d.C6958b a = AbstractC6963e.m14871a(str).mo13259a(0, 0, 0, 0);
                a.f17407k = -1;
                double b = (double) C3966y.m9662b();
                Double.isNaN(b);
                a.f17399c = (int) C3966y.m9668e((int) (b * 0.7d));
                a.f17398b = (int) C3966y.m9668e(C3966y.m9664c());
                a.f17406j = 80;
                AbstractC2928f fVar = (AbstractC2928f) C6193a.m13435a(AbstractC2928f.class);
                C4031a aVar = null;
                if (!(fVar == null || (webViewManager = fVar.webViewManager()) == null)) {
                    aVar = webViewManager.mo13246a(a, new C7260a(a.f17397a, this.f19731a, null));
                }
                C4031a.m9839a(this.f19732b, aVar);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemViewType(int i) {
        if (i == getItemCount() - 1) {
            return 2;
        }
        return 1;
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.dv$c */
    public static final class C7928c extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final String f19734a = "Tiltify";

        /* renamed from: b */
        final TextView f19735b;

        static {
            Covode.recordClassIndex(8723);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7928c(View view) {
            super(view);
            C89219l.m154721d(view, "");
            this.f19735b = (TextView) view.findViewById(R.id.e8g);
        }

        /* renamed from: com.bytedance.android.livesdk.chatroom.ui.dv$c$a */
        static final class View$OnClickListenerC7929a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ String f19736a;

            /* renamed from: b */
            final /* synthetic */ ActivityC0945e f19737b;

            static {
                Covode.recordClassIndex(8724);
            }

            View$OnClickListenerC7929a(String str, ActivityC0945e eVar) {
                this.f19736a = str;
                this.f19737b = eVar;
            }

            public final void onClick(View view) {
                AbstractC6956d webViewManager;
                String str = this.f19736a;
                if (str == null) {
                    str = "";
                }
                AbstractC6956d.C6958b a = AbstractC6963e.m14871a(str).mo13259a(0, 0, 0, 0);
                a.f17407k = -1;
                double b = (double) C3966y.m9662b();
                Double.isNaN(b);
                a.f17399c = (int) C3966y.m9668e((int) (b * 0.7d));
                a.f17398b = (int) C3966y.m9668e(C3966y.m9664c());
                a.f17406j = 80;
                AbstractC2928f fVar = (AbstractC2928f) C6193a.m13435a(AbstractC2928f.class);
                C4031a aVar = null;
                if (!(fVar == null || (webViewManager = fVar.webViewManager()) == null)) {
                    aVar = webViewManager.mo13246a(a, new C7260a(a.f17397a, null, null));
                }
                C4031a.m9839a(this.f19737b, aVar);
            }
        }
    }

    public C7923dv(ActivityC0945e eVar) {
        C89219l.m154721d(eVar, "");
        this.f19726c = eVar;
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m16058a(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder viewHolder;
        MethodCollector.m26663i(1911);
        C89219l.m154721d(viewGroup, "");
        boolean z = true;
        if (i == 1) {
            View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.ba5, viewGroup, false);
            C89219l.m154716b(a, "");
            viewHolder = new C7925b(a);
        } else if (i == 2) {
            View a2 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.ba6, viewGroup, false);
            C89219l.m154716b(a2, "");
            viewHolder = new C7928c(a2);
        } else {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("wrong view type");
            MethodCollector.m26664o(1911);
            throw illegalArgumentException;
        }
        try {
            if (viewHolder.itemView.getParent() != null) {
                try {
                    z = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
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
        MethodCollector.m26664o(1911);
        return viewHolder;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        String str;
        String str2;
        ImageModel imageModel;
        C2962b bVar;
        C89219l.m154721d(viewHolder, "");
        if (viewHolder instanceof C7925b) {
            C7925b bVar2 = (C7925b) viewHolder;
            ActivityC0945e eVar = this.f19726c;
            C9533aq aqVar = (C9533aq) C89070n.m154561b((List) this.f19724a, i);
            C89219l.m154721d(eVar, "");
            TextView textView = bVar2.f19729c;
            C89219l.m154716b(textView, "");
            if (aqVar != null) {
                str = aqVar.f23145a;
            } else {
                str = null;
            }
            textView.setText(str);
            TextView textView2 = bVar2.f19730d;
            C89219l.m154716b(textView2, "");
            if (aqVar != null) {
                str2 = aqVar.f23146b;
            } else {
                str2 = null;
            }
            textView2.setText(str2);
            bVar2.f19727a.setImageDrawable(null);
            ImageView imageView = bVar2.f19727a;
            if (aqVar == null || (bVar = aqVar.f23147c) == null) {
                imageModel = new ImageModel();
            } else {
                imageModel = bVar.mo7782a();
            }
            C3951p.m9621a(imageView, imageModel);
            bVar2.f19728b.setOnClickListener(new C7925b.View$OnClickListenerC7926a(aqVar, eVar));
            bVar2.itemView.setOnClickListener(new C7925b.View$OnClickListenerC7927b(aqVar));
        } else if (viewHolder instanceof C7928c) {
            C7928c cVar = (C7928c) viewHolder;
            ActivityC0945e eVar2 = this.f19726c;
            String str3 = this.f19725b;
            C89219l.m154721d(eVar2, "");
            String a = C3966y.m9660a((int) R.string.eg9, cVar.f19734a);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a);
            C89219l.m154716b(a, "");
            int a2 = C89361p.m154888a((CharSequence) a, cVar.f19734a, 0, false, 6);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#FE2C55")), a2, cVar.f19734a.length() + a2, 33);
            TextView textView3 = cVar.f19735b;
            C89219l.m154716b(textView3, "");
            textView3.setText(spannableStringBuilder);
            cVar.f19735b.setOnClickListener(new C7928c.View$OnClickListenerC7929a(str3, eVar2));
        }
    }
}
