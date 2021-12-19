package com.p2082ss.android.ugc.aweme.p2929fe.method.upload;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.tools.utils.C84896h;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.fe.method.upload.d */
public final class C47984d extends RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> {

    /* renamed from: k */
    public static final C47985a f111131k = new C47985a((byte) 0);

    /* renamed from: a */
    List<Integer> f111132a;

    /* renamed from: b */
    public List<Integer> f111133b;

    /* renamed from: c */
    public List<C48000f> f111134c;

    /* renamed from: d */
    public boolean f111135d;

    /* renamed from: e */
    public AbstractC89183m<? super View, ? super String, C89391z> f111136e;

    /* renamed from: f */
    public AbstractC89172b<? super List<C48000f>, C89391z> f111137f;

    /* renamed from: g */
    final Context f111138g;

    /* renamed from: h */
    public final int f111139h;

    /* renamed from: i */
    final long f111140i;

    /* renamed from: j */
    final boolean f111141j;

    /* renamed from: l */
    private final ArrayList<MediaModel> f111142l = new ArrayList<>();

    /* renamed from: m */
    private final int f111143m;

    /* renamed from: n */
    private final Boolean f111144n;

    /* renamed from: o */
    private final double f111145o = 1.0d;

    static {
        Covode.recordClassIndex(56703);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final long getItemId(int i) {
        return (long) i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m90973a(this, viewGroup, i);
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.d$a */
    public static final class C47985a {
        static {
            Covode.recordClassIndex(56704);
        }

        private C47985a() {
        }

        public /* synthetic */ C47985a(byte b) {
            this();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f111142l.size();
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.d$b */
    public static final class C47986b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public RemoteImageView f111146a;

        /* renamed from: b */
        public TextView f111147b;

        /* renamed from: c */
        public FrameLayout f111148c;

        /* renamed from: d */
        public View f111149d;

        /* renamed from: e */
        public String f111150e;

        static {
            Covode.recordClassIndex(56705);
        }

        /* renamed from: a */
        public final void mo80010a() {
            TextView textView = this.f111147b;
            if (textView != null) {
                textView.setText("");
            }
            TextView textView2 = this.f111147b;
            if (textView2 != null) {
                textView2.setBackgroundResource(R.drawable.b0y);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47986b(View view) {
            super(view);
            C89219l.m154721d(view, "");
        }

        /* renamed from: a */
        public final void mo80011a(int i) {
            TextView textView = this.f111147b;
            if (textView != null) {
                textView.setText(String.valueOf(i + 1));
            }
            TextView textView2 = this.f111147b;
            if (textView2 != null) {
                textView2.setBackgroundResource(R.drawable.b0z);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.d$c */
    static final class RunnableC47987c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View f111151a;

        /* renamed from: b */
        final /* synthetic */ C47984d f111152b;

        /* renamed from: c */
        final /* synthetic */ int f111153c;

        static {
            Covode.recordClassIndex(56706);
        }

        RunnableC47987c(View view, C47984d dVar, int i) {
            this.f111151a = view;
            this.f111152b = dVar;
            this.f111153c = i;
        }

        public final void run() {
            this.f111151a.setVisibility(4);
            this.f111151a.setAlpha(1.0f);
            this.f111152b.notifyItemChanged(this.f111153c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.d$d */
    static final class RunnableC47988d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C47984d f111154a;

        /* renamed from: b */
        final /* synthetic */ int f111155b;

        /* renamed from: c */
        final /* synthetic */ int f111156c;

        static {
            Covode.recordClassIndex(56707);
        }

        RunnableC47988d(C47984d dVar, int i, int i2) {
            this.f111154a = dVar;
            this.f111155b = i;
            this.f111156c = i2;
        }

        public final void run() {
            if (this.f111155b == this.f111154a.f111139h) {
                this.f111154a.notifyDataSetChanged();
            } else {
                this.f111154a.notifyItemChanged(this.f111156c);
            }
            AbstractC89172b<? super List<C48000f>, C89391z> bVar = this.f111154a.f111137f;
            if (bVar != null) {
                bVar.invoke(this.f111154a.f111134c);
            }
        }
    }

    /* renamed from: a */
    public final void mo80009a(Collection<? extends MediaModel> collection) {
        C89219l.m154721d(collection, "");
        this.f111142l.clear();
        this.f111142l.addAll(collection);
        m90974a(this.f111142l.size());
        notifyDataSetChanged();
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.d$e */
    static final class View$OnClickListenerC47989e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C47984d f111157a;

        /* renamed from: b */
        final /* synthetic */ int f111158b;

        /* renamed from: c */
        final /* synthetic */ C47986b f111159c;

        static {
            Covode.recordClassIndex(56708);
        }

        View$OnClickListenerC47989e(C47984d dVar, int i, C47986b bVar) {
            this.f111157a = dVar;
            this.f111158b = i;
            this.f111159c = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!this.f111157a.f111135d) {
                if (this.f111158b < 0) {
                    List<Integer> list = this.f111157a.f111133b;
                    if (list == null) {
                        C89219l.m154715b();
                    }
                    if (list.size() >= this.f111157a.f111139h) {
                        return;
                    }
                }
                AbstractC89183m<? super View, ? super String, C89391z> mVar = this.f111157a.f111136e;
                if (mVar != null) {
                    C89219l.m154716b(view, "");
                    mVar.invoke(view, C84896h.m145871d(this.f111159c.f111150e).toString());
                }
            }
        }
    }

    /* renamed from: a */
    private final void m90974a(int i) {
        List<Integer> list = this.f111133b;
        if (list == null) {
            this.f111133b = new ArrayList();
        } else {
            list.clear();
        }
        List<Integer> list2 = this.f111132a;
        if (list2 == null) {
            this.f111132a = new ArrayList();
        } else {
            list2.clear();
        }
        for (int i2 = 0; i2 < i; i2++) {
            List<Integer> list3 = this.f111132a;
            if (list3 != null) {
                list3.add(-1);
            }
        }
    }

    /* renamed from: a */
    private final void m90975a(View view) {
        ViewGroup.LayoutParams layoutParams;
        if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width != this.f111143m) {
            int i = layoutParams.height;
            int i2 = this.f111143m;
            double d = (double) i2;
            double d2 = this.f111145o;
            Double.isNaN(d);
            if (i != ((int) (d * d2))) {
                layoutParams.width = i2;
                double d3 = (double) this.f111143m;
                double d4 = this.f111145o;
                Double.isNaN(d3);
                layoutParams.height = (int) (d3 * d4);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.d$f */
    static final class View$OnClickListenerC47990f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C47984d f111160a;

        /* renamed from: b */
        final /* synthetic */ C47986b f111161b;

        /* renamed from: c */
        final /* synthetic */ MediaModel f111162c;

        static {
            Covode.recordClassIndex(56709);
        }

        View$OnClickListenerC47990f(C47984d dVar, C47986b bVar, MediaModel mediaModel) {
            this.f111160a = dVar;
            this.f111161b = bVar;
            this.f111162c = mediaModel;
        }

        /* JADX WARNING: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:78:0x016f  */
        /* JADX WARNING: Removed duplicated region for block: B:81:0x0188  */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x0193  */
        /* JADX WARNING: Removed duplicated region for block: B:87:0x01a2  */
        /* JADX WARNING: Removed duplicated region for block: B:90:0x01ad  */
        /* JADX WARNING: Removed duplicated region for block: B:93:0x01bd  */
        /* JADX WARNING: Removed duplicated region for block: B:96:0x01e0  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r16) {
            /*
            // Method dump skipped, instructions count: 521
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p2929fe.method.upload.C47984d.View$OnClickListenerC47990f.onClick(android.view.View):void");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        float f;
        C89219l.m154721d(viewHolder, "");
        C47986b bVar = (C47986b) viewHolder;
        m90975a(bVar.f111146a);
        m90975a(bVar.f111149d);
        MediaModel mediaModel = this.f111142l.get(i);
        C89219l.m154716b(mediaModel, "");
        MediaModel mediaModel2 = mediaModel;
        List<Integer> list = this.f111132a;
        if (list == null) {
            C89219l.m154715b();
        }
        int intValue = list.get(i).intValue();
        int i2 = 0;
        float f2 = 1.0f;
        if (intValue >= 0) {
            bVar.mo80011a(intValue);
            View view = bVar.f111149d;
            if (view != null) {
                view.setVisibility(0);
            }
            f = 1.1f;
        } else {
            bVar.mo80010a();
            View view2 = bVar.f111149d;
            if (view2 != null) {
                view2.setVisibility(4);
            }
            List<Integer> list2 = this.f111133b;
            if (list2 != null) {
                i2 = list2.size();
            }
            if (i2 >= this.f111139h) {
                f2 = 0.5f;
            } else {
                f2 = 1.0f;
            }
            f = 1.0f;
        }
        RemoteImageView remoteImageView = bVar.f111146a;
        if (remoteImageView != null) {
            if (remoteImageView.getAlpha() != f2) {
                remoteImageView.setAlpha(f2);
            }
            if (remoteImageView.getScaleX() != f) {
                remoteImageView.setScaleX(f);
                remoteImageView.setScaleY(f);
            }
        }
        if (!TextUtils.equals(bVar.f111150e, mediaModel2.f134662b)) {
            bVar.f111150e = mediaModel2.f134662b;
            RemoteImageView remoteImageView2 = bVar.f111146a;
            String uri = C84896h.m145871d(bVar.f111150e).toString();
            int i3 = this.f111143m;
            C34577e.m70608b(remoteImageView2, uri, i3, i3);
        }
        bVar.itemView.setOnClickListener(new View$OnClickListenerC47989e(this, intValue, bVar));
        FrameLayout frameLayout = bVar.f111148c;
        if (frameLayout != null) {
            frameLayout.setOnClickListener(new View$OnClickListenerC47990f(this, bVar, mediaModel2));
        }
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m90973a(C47984d dVar, ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(6998);
        C89219l.m154721d(viewGroup, "");
        View a2 = C1764a.m5927a(LayoutInflater.from(dVar.f111138g), R.layout.v5, viewGroup, false);
        C89219l.m154716b(a2, "");
        C47986b bVar = new C47986b(a2);
        bVar.f111146a = (RemoteImageView) a2.findViewById(R.id.cj3);
        bVar.f111147b = (TextView) a2.findViewById(R.id.bla);
        bVar.f111148c = (FrameLayout) a2.findViewById(R.id.b4o);
        bVar.f111149d = a2.findViewById(R.id.dx3);
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
        MethodCollector.m26664o(6998);
        return bVar;
    }

    public C47984d(Context context, int i, int i2, long j, boolean z, Boolean bool) {
        C89219l.m154721d(context, "");
        this.f111138g = context;
        this.f111139h = i2;
        this.f111140i = j;
        this.f111141j = z;
        this.f111144n = bool;
        context.getResources().getDimensionPixelOffset(R.dimen.gp);
        this.f111143m = ((C13628n.m24504a(context) - ((i - 1) * ((int) C13628n.m24520b(context, 1.5f)))) + 0) / i;
    }
}
