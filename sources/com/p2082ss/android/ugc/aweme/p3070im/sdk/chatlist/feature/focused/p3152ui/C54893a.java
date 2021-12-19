package com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.focused.p3152ui;

import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC1483t;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.inbox.widget.AbstractC56519a;
import com.p2082ss.android.ugc.aweme.inbox.widget.C56520b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.controller.p3149a.AbstractC54866a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.focused.p3152ui.p3153a.C54896a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.focused.p3152ui.p3153a.C54899b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.focused.viewmodel.AbstractC54913a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3164ui.p3167c.C55003a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3164ui.p3169e.C55012c;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3261k.AbstractC56237a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.focused.ui.a */
public final class C54893a extends AbstractC1483t<AbstractC56237a, RecyclerView.ViewHolder> {

    /* renamed from: d */
    public static final C54894a f125677d = new C54894a((byte) 0);

    /* renamed from: b */
    final SparseArray<C56520b> f125678b;

    /* renamed from: c */
    final List<C55012c> f125679c;

    /* renamed from: e */
    private final AbstractC54913a f125680e;

    /* renamed from: f */
    private final AbstractC54866a f125681f;

    static {
        Covode.recordClassIndex(64614);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m100515a(this, viewGroup, i);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.focused.ui.a$a */
    public static final class C54894a {
        static {
            Covode.recordClassIndex(64615);
        }

        private C54894a() {
        }

        public /* synthetic */ C54894a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.focused.ui.a$b */
    public static final class C54895b extends AbstractC89220m implements AbstractC89172b<C55012c, Boolean> {

        /* renamed from: a */
        public static final C54895b f125682a = new C54895b();

        static {
            Covode.recordClassIndex(64616);
        }

        C54895b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(C55012c cVar) {
            C89219l.m154721d(cVar, "");
            return true;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final long getItemId(int i) {
        return (long) ((AbstractC56237a) mo5017a(i)).hashCode();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemViewType(int i) {
        if (mo5017a(i) instanceof C54899b) {
            return 0;
        }
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        C89219l.m154721d(viewHolder, "");
        super.onViewAttachedToWindow(viewHolder);
        if (viewHolder instanceof C55012c) {
            ((C55012c) viewHolder).mo91967b();
            this.f125679c.add(viewHolder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        C89219l.m154721d(viewHolder, "");
        super.onViewDetachedFromWindow(viewHolder);
        if (viewHolder instanceof C55012c) {
            ((C55012c) viewHolder).mo91969c();
            this.f125679c.remove(viewHolder);
        }
    }

    public /* synthetic */ C54893a(AbstractC54913a aVar, AbstractC54866a aVar2) {
        this(aVar, aVar2, new C55003a());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C89219l.m154721d(viewHolder, "");
        if (viewHolder instanceof C55012c) {
            ((C55012c) viewHolder).mo91966a((AbstractC56237a) mo5017a(i));
        } else if (viewHolder instanceof C54896a) {
            C54896a aVar = (C54896a) viewHolder;
            Object a = mo5017a(i);
            Objects.requireNonNull(a, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.chatlist.feature.focused.ui.showprevious.ShowPreviousMessageSession");
            C54899b bVar = (C54899b) a;
            C89219l.m154721d(bVar, "");
            aVar.itemView.setOnClickListener(new C54896a.View$OnClickListenerC54898b(aVar, bVar));
            if (bVar.f128238q > 0) {
                aVar.f125685b.setBadgeCount(bVar.f128238q);
                aVar.f125685b.setVisibility(0);
                aVar.f125684a.setVisibility(8);
            } else if (bVar.f128239r) {
                aVar.f125685b.setVisibility(8);
                aVar.f125684a.setVisibility(0);
            } else {
                aVar.f125684a.setVisibility(8);
                aVar.f125685b.setVisibility(8);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C54893a(AbstractC54913a aVar, AbstractC54866a aVar2, C55003a aVar3) {
        super(aVar3);
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar2, "");
        C89219l.m154721d(aVar3, "");
        this.f125680e = aVar;
        this.f125681f = aVar2;
        this.f125678b = new SparseArray<>();
        setHasStableIds(true);
        this.f125679c = new ArrayList();
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m100515a(C54893a aVar, ViewGroup viewGroup, int i) {
        AbstractC56519a aVar2;
        boolean a;
        MethodCollector.m26663i(5422);
        C89219l.m154721d(viewGroup, "");
        if (i != 0) {
            aVar2 = new C55012c(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.a6k, viewGroup, false), aVar.f125681f);
        } else {
            AbstractC54913a aVar3 = aVar.f125680e;
            C89219l.m154721d(viewGroup, "");
            C89219l.m154721d(aVar3, "");
            View a2 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.a6m, viewGroup, false);
            C89219l.m154716b(a2, "");
            aVar2 = new C54896a(a2, aVar3);
        }
        C56520b bVar = aVar.f125678b.get(i);
        if (bVar != null) {
            aVar2.mo87499a(bVar);
        }
        RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) aVar2;
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
        MethodCollector.m26664o(5422);
        return viewHolder;
    }
}
