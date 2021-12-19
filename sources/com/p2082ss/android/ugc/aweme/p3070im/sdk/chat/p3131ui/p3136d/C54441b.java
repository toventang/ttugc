package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3136d;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.C1481r;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17420a;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.p1793c.p1794a.C23758a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3132a.AbstractC54386c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.view.ChatLinearLayoutManager;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55190b;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.d.b */
public final class C54441b {

    /* renamed from: p */
    public static final C54442a f124700p = new C54442a((byte) 0);

    /* renamed from: a */
    public boolean f124701a;

    /* renamed from: b */
    boolean f124702b;

    /* renamed from: c */
    public boolean f124703c;

    /* renamed from: d */
    public boolean f124704d;

    /* renamed from: e */
    public long f124705e;

    /* renamed from: f */
    public long f124706f;

    /* renamed from: g */
    public int f124707g = -1;

    /* renamed from: h */
    final Context f124708h;

    /* renamed from: i */
    public int f124709i;

    /* renamed from: j */
    final View f124710j;

    /* renamed from: k */
    final TextView f124711k;

    /* renamed from: l */
    public final ChatLinearLayoutManager f124712l;

    /* renamed from: m */
    public final View f124713m;

    /* renamed from: n */
    public final RecyclerView f124714n;

    /* renamed from: o */
    public final AbstractC54386c f124715o;

    /* renamed from: q */
    private int f124716q;

    /* renamed from: r */
    private final C54447f f124717r;

    static {
        Covode.recordClassIndex(64146);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.d.b$a */
    public static final class C54442a {
        static {
            Covode.recordClassIndex(64147);
        }

        private C54442a() {
        }

        public /* synthetic */ C54442a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.d.b$d */
    static final class C54445d implements AbstractC54386c.AbstractC54392b {

        /* renamed from: a */
        final /* synthetic */ C54441b f124720a;

        static {
            Covode.recordClassIndex(64150);
        }

        C54445d(C54441b bVar) {
            this.f124720a = bVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3132a.AbstractC54386c.AbstractC54392b
        /* renamed from: a */
        public final void mo91330a() {
            if (this.f124720a.f124704d) {
                this.f124720a.mo91511b();
                return;
            }
            C54441b bVar = this.f124720a;
            if (bVar.f124715o.getItemCount() > 0 && bVar.f124706f > 0 && !bVar.f124702b) {
                bVar.f124702b = true;
                bVar.f124714n.post(new RunnableC54443b(bVar));
            }
        }
    }

    /* renamed from: a */
    public final void mo91510a() {
        float width;
        if (C80471gb.m139482a()) {
            width = -((float) this.f124710j.getWidth());
        } else {
            width = (float) this.f124710j.getWidth();
        }
        this.f124710j.startAnimation(C55190b.m100902a(0.0f, width));
        C13628n.m24510a(this.f124710j, 8);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.d.b$b */
    static final class RunnableC54443b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C54441b f124718a;

        static {
            Covode.recordClassIndex(64148);
        }

        RunnableC54443b(C54441b bVar) {
            this.f124718a = bVar;
        }

        public final void run() {
            String string;
            ChatLinearLayoutManager chatLinearLayoutManager = this.f124718a.f124712l;
            if (chatLinearLayoutManager != null) {
                int k = chatLinearLayoutManager.mo4371k();
                if (this.f124718a.f124706f > ((long) ((chatLinearLayoutManager.mo4373m() - k) + 1))) {
                    C54441b bVar = this.f124718a;
                    long j = bVar.f124706f;
                    if (j > 99) {
                        string = bVar.f124708h.getResources().getString(R.string.cib, bVar.f124708h.getResources().getString(R.string.ci_));
                        C89219l.m154716b(string, "");
                    } else {
                        string = bVar.f124708h.getResources().getString(R.string.cib, String.valueOf(j));
                        C89219l.m154716b(string, "");
                    }
                    TextView textView = bVar.f124711k;
                    C89219l.m154716b(textView, "");
                    textView.setText(string);
                    bVar.f124710j.setVisibility(0);
                    bVar.f124710j.startAnimation(C55190b.m100902a(C13628n.m24520b(bVar.f124708h, 120.0f), 0.0f));
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0010  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo91511b() {
        /*
        // Method dump skipped, instructions count: 203
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3136d.C54441b.mo91511b():void");
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.d.b$e */
    public static final class C54446e extends RecyclerView.AbstractC1371n {

        /* renamed from: a */
        final /* synthetic */ C54441b f124721a;

        static {
            Covode.recordClassIndex(64151);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C54446e(C54441b bVar) {
            this.f124721a = bVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4753a(RecyclerView recyclerView, int i) {
            int i2;
            C89219l.m154721d(recyclerView, "");
            super.mo4753a(recyclerView, i);
            if (i == 0 && this.f124721a.f124703c) {
                ChatLinearLayoutManager chatLinearLayoutManager = this.f124721a.f124712l;
                if (chatLinearLayoutManager != null) {
                    i2 = chatLinearLayoutManager.mo91519C();
                } else {
                    i2 = -1;
                }
                if (i2 == this.f124721a.f124707g) {
                    recyclerView.mo4395a(0, -this.f124721a.f124709i);
                    this.f124721a.f124703c = false;
                    return;
                }
                recyclerView.mo4435d(this.f124721a.f124707g);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4754a(RecyclerView recyclerView, int i, int i2) {
            ChatLinearLayoutManager chatLinearLayoutManager;
            int C;
            C89219l.m154721d(recyclerView, "");
            super.mo4754a(recyclerView, i, i2);
            C54441b bVar = this.f124721a;
            if (bVar.f124710j.getVisibility() != 8 && (chatLinearLayoutManager = bVar.f124712l) != null && (C = chatLinearLayoutManager.mo91519C()) >= 0 && C < bVar.f124715o.getItemCount()) {
                C19538ai b = bVar.f124715o.mo91466b(C);
                C89219l.m154716b(b, "");
                if (b == null) {
                    return;
                }
                if (b.getIndex() <= bVar.f124705e) {
                    bVar.mo91510a();
                } else if (C == bVar.f124715o.getItemCount() - 1 && !bVar.f124715o.f124578h) {
                    bVar.mo91510a();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.d.b$c */
    static final class View$OnClickListenerC54444c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C54441b f124719a;

        static {
            Covode.recordClassIndex(64149);
        }

        View$OnClickListenerC54444c(C54441b bVar) {
            this.f124719a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (this.f124719a.f124705e != -1 && !this.f124719a.f124701a) {
                this.f124719a.f124701a = true;
                this.f124719a.mo91510a();
                this.f124719a.mo91511b();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.d.b$f */
    public static final class C54447f extends C1481r {

        /* renamed from: f */
        final /* synthetic */ C54441b f124722f;

        static {
            Covode.recordClassIndex(64152);
        }

        @Override // androidx.recyclerview.widget.C1481r
        /* renamed from: c */
        public final int mo5016c() {
            return -1;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54447f(C54441b bVar, Context context) {
            super(context);
            this.f124722f = bVar;
        }
    }

    public C54441b(View view, RecyclerView recyclerView, AbstractC54386c cVar) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(recyclerView, "");
        C89219l.m154721d(cVar, "");
        this.f124713m = view;
        this.f124714n = recyclerView;
        this.f124715o = cVar;
        Context context = view.getContext();
        C89219l.m154716b(context, "");
        this.f124708h = context;
        this.f124709i = (int) C13628n.m24520b(context, 60.0f);
        View findViewById = view.findViewById(R.id.f9m);
        ChatLinearLayoutManager chatLinearLayoutManager = null;
        if (C80471gb.m139482a()) {
            float a = C23758a.m44906a(16);
            float a2 = C23758a.m44906a(16);
            C89219l.m154716b(findViewById, "");
            Drawable background = findViewById.getBackground();
            GradientDrawable gradientDrawable = (GradientDrawable) (!(background instanceof GradientDrawable) ? null : background);
            if (gradientDrawable != null) {
                gradientDrawable.setCornerRadii(new float[]{0.0f, 0.0f, a, a, a2, a2, 0.0f, 0.0f});
            }
        }
        C89219l.m154716b(findViewById, "");
        this.f124710j = findViewById;
        this.f124711k = (TextView) view.findViewById(R.id.f9l);
        if (recyclerView.getLayoutManager() instanceof ChatLinearLayoutManager) {
            RecyclerView.AbstractC1362i layoutManager = recyclerView.getLayoutManager();
            Objects.requireNonNull(layoutManager, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.chat.ui.view.ChatLinearLayoutManager");
            chatLinearLayoutManager = (ChatLinearLayoutManager) layoutManager;
        }
        this.f124712l = chatLinearLayoutManager;
        this.f124717r = new C54447f(this, recyclerView.getContext());
        findViewById.setVisibility(8);
        findViewById.setOnClickListener(new View$OnClickListenerC54444c(this));
        C19638h a3 = AbstractC17420a.C17421a.m32276a().mo27720a(cVar.f124584n.getConversationId());
        if (a3 != null) {
            this.f124705e = a3.getReadIndex();
            this.f124706f = a3.getUnreadCount();
        }
        cVar.mo91464a(new C54445d(this));
        recyclerView.mo4405a(new C54446e(this));
    }
}
