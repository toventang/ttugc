package com.p2082ss.android.ugc.aweme.emoji.p2903f;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.base.utils.View$OnTouchListenerC34732p;
import com.p2082ss.android.ugc.aweme.emoji.p2897b.AbstractC46454h;
import com.p2082ss.android.ugc.aweme.emoji.p2897b.C46447a;
import com.p2082ss.android.ugc.aweme.emoji.p2906i.p2913c.C46579b;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.emoji.f.a */
public final class C46527a extends RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> {

    /* renamed from: b */
    public static int f108467b = 20000;

    /* renamed from: a */
    ArrayList<C46447a> f108468a;

    /* renamed from: c */
    private int f108469c;

    /* renamed from: d */
    private boolean f108470d;

    /* renamed from: e */
    private AbstractC46454h f108471e;

    /* renamed from: f */
    private final View f108472f;

    /* renamed from: g */
    private boolean f108473g;

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m89806a(this, viewGroup, i);
    }

    static {
        Covode.recordClassIndex(55114);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        int i;
        int i2 = 0;
        if (this.f108472f == null) {
            i = 0;
        } else {
            i = 1;
        }
        ArrayList<C46447a> arrayList = this.f108468a;
        if (arrayList != null) {
            i2 = arrayList.size();
        }
        return i2 + i;
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.f.a$a */
    public static final class View$OnClickListenerC46528a extends RecyclerView.ViewHolder implements View.OnClickListener {
        static {
            Covode.recordClassIndex(55115);
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
        }

        public View$OnClickListenerC46528a(View view) {
            super(view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.f.a$b */
    public static final class View$OnClickListenerC46529b extends RecyclerView.ViewHolder implements View.OnClickListener {

        /* renamed from: a */
        RemoteImageView f108474a;

        /* renamed from: b */
        C46447a f108475b;

        /* renamed from: c */
        private AbstractC46454h f108476c;

        static {
            Covode.recordClassIndex(55116);
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C46447a aVar = this.f108475b;
            if (aVar != null) {
                this.f108476c.mo64589a(aVar.f108223c, 2);
            }
        }

        public View$OnClickListenerC46529b(View view, AbstractC46454h hVar, int i, boolean z) {
            super(view);
            RemoteImageView remoteImageView = (RemoteImageView) view.findViewById(R.id.aua);
            this.f108474a = remoteImageView;
            this.f108476c = hVar;
            remoteImageView.setOnClickListener(this);
            if (z) {
                this.f108474a.setOnTouchListener(View$OnTouchListenerC34732p.f82022a);
            }
            if (i > 0) {
                this.f108474a.getLayoutParams().height = i;
                this.f108474a.getLayoutParams().width = i;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.f.a$c */
    public static final class View$OnClickListenerC46530c extends RecyclerView.ViewHolder implements View.OnClickListener {

        /* renamed from: a */
        TextView f108477a;

        /* renamed from: b */
        C46447a f108478b;

        /* renamed from: c */
        private View f108479c;

        /* renamed from: d */
        private AbstractC46454h f108480d;

        static {
            Covode.recordClassIndex(55117);
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C46447a aVar = this.f108478b;
            if (aVar != null) {
                this.f108480d.mo64589a(aVar.f108223c, 2);
            }
        }

        public View$OnClickListenerC46530c(View view, AbstractC46454h hVar, int i, boolean z) {
            super(view);
            this.f108479c = view.findViewById(R.id.au8);
            this.f108477a = (TextView) view.findViewById(R.id.aum);
            this.f108480d = hVar;
            this.f108479c.setOnClickListener(this);
            if (z) {
                this.f108477a.setOnTouchListener(View$OnTouchListenerC34732p.f82022a);
            }
            if (i > 0) {
                this.f108477a.getLayoutParams().height = i;
                this.f108477a.getLayoutParams().width = i;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemViewType(int i) {
        if (this.f108473g) {
            return R.layout.yj;
        }
        if (this.f108472f != null && i == this.f108468a.size()) {
            return f108467b;
        }
        return R.layout.yi;
    }

    public C46527a(AbstractC46454h hVar, View view) {
        this(hVar, view, -1, false);
        this.f108473g = true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (viewHolder instanceof View$OnClickListenerC46529b) {
            View$OnClickListenerC46529b bVar = (View$OnClickListenerC46529b) viewHolder;
            C46447a aVar = this.f108468a.get(i);
            if (aVar != null) {
                bVar.f108475b = aVar;
                C46579b.m89900a(bVar.f108474a, aVar);
                if (!TextUtils.isEmpty(aVar.f108223c)) {
                    bVar.f108474a.setContentDescription(aVar.f108223c);
                }
            }
        } else if (viewHolder instanceof View$OnClickListenerC46530c) {
            View$OnClickListenerC46530c cVar = (View$OnClickListenerC46530c) viewHolder;
            C46447a aVar2 = this.f108468a.get(i);
            if (aVar2 != null) {
                cVar.f108478b = aVar2;
                if (!TextUtils.isEmpty(aVar2.f108223c)) {
                    cVar.f108477a.setText(aVar2.f108223c);
                }
            }
        }
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m89806a(C46527a aVar, ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder viewHolder;
        boolean a;
        MethodCollector.m26663i(12776);
        if (i == R.layout.yi) {
            viewHolder = new View$OnClickListenerC46529b(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.yi, viewGroup, false), aVar.f108471e, aVar.f108469c, aVar.f108470d);
        } else if (i == R.layout.yj) {
            viewHolder = new View$OnClickListenerC46530c(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.yj, viewGroup, false), aVar.f108471e, aVar.f108469c, aVar.f108470d);
        } else {
            viewHolder = new View$OnClickListenerC46528a(aVar.f108472f);
            viewHolder.setIsRecyclable(false);
        }
        try {
            if (viewHolder.itemView.getParent() != null) {
                try {
                    a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a) {
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
        MethodCollector.m26664o(12776);
        return viewHolder;
    }

    private C46527a(AbstractC46454h hVar, View view, int i, boolean z) {
        this.f108468a = new ArrayList<>();
        this.f108471e = hVar;
        this.f108472f = view;
        this.f108469c = -1;
        this.f108470d = false;
    }
}
