package com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3164ui.p3166b;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC1483t;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.controller.p3149a.AbstractC54866a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3146b.p3147a.C54846b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3164ui.p3167c.C55003a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3164ui.p3169e.C55009a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3164ui.p3169e.C55010b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3164ui.p3169e.C55012c;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3261k.AbstractC56237a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.ui.b.a */
public final class C55000a extends AbstractC1483t<AbstractC56237a, RecyclerView.ViewHolder> {

    /* renamed from: c */
    public static final int f125899c = ((int) C13628n.m24520b(C17867d.m33078a(), 8.0f));

    /* renamed from: d */
    public static final int f125900d = ((int) C13628n.m24520b(C17867d.m33078a(), 72.0f));

    /* renamed from: e */
    public static final C55001a f125901e = new C55001a((byte) 0);

    /* renamed from: b */
    public final List<C55012c> f125902b = new ArrayList();

    /* renamed from: f */
    private final AbstractC54866a f125903f;

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m100617a(this, viewGroup, i);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.ui.b.a$a */
    public static final class C55001a {
        static {
            Covode.recordClassIndex(64727);
        }

        private C55001a() {
        }

        public /* synthetic */ C55001a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(64726);
    }

    /* renamed from: a */
    public final synchronized boolean mo91959a() {
        MethodCollector.m26663i(3409);
        if (this.f4921a.f4672f.isEmpty() || (this.f4921a.f4672f.size() == 1 && (this.f4921a.f4672f.get(0) instanceof C54846b))) {
            MethodCollector.m26664o(3409);
            return true;
        }
        MethodCollector.m26664o(3409);
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.ui.b.a$b */
    public static final class C55002b extends AbstractC89220m implements AbstractC89172b<C55012c, Boolean> {

        /* renamed from: a */
        public static final C55002b f125904a = new C55002b();

        static {
            Covode.recordClassIndex(64728);
        }

        C55002b() {
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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C55000a(AbstractC54866a aVar) {
        super(new C55003a());
        C89219l.m154721d(aVar, "");
        this.f125903f = aVar;
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemViewType(int i) {
        if (this.f4921a.f4672f.get(i) instanceof C54846b) {
            return 10005;
        }
        if (i != 0) {
            return 10002;
        }
        return 10003;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        C89219l.m154721d(viewHolder, "");
        super.onViewAttachedToWindow(viewHolder);
        if (viewHolder instanceof C55012c) {
            ((C55012c) viewHolder).mo91967b();
            this.f125902b.add(viewHolder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        C89219l.m154721d(viewHolder, "");
        super.onViewDetachedFromWindow(viewHolder);
        if (viewHolder instanceof C55012c) {
            ((C55012c) viewHolder).mo91969c();
            this.f125902b.remove(viewHolder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C89219l.m154721d(viewHolder, "");
        if (viewHolder instanceof C55012c) {
            ((C55012c) viewHolder).mo91966a((AbstractC56237a) mo5017a(i));
        }
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m100617a(C55000a aVar, ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder viewHolder;
        boolean a;
        MethodCollector.m26663i(3400);
        C89219l.m154721d(viewGroup, "");
        if (i == 10003) {
            AbstractC54866a aVar2 = aVar.f125903f;
            C89219l.m154721d(viewGroup, "");
            C89219l.m154721d(aVar2, "");
            View a2 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.a6o, viewGroup, false);
            C89219l.m154716b(a2, "");
            viewHolder = new C55010b(a2, aVar2);
        } else if (i != 10005) {
            viewHolder = new C55012c(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.a6n, viewGroup, false), aVar.f125903f);
        } else {
            View a3 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.a6l, viewGroup, false);
            C89219l.m154716b(a3, "");
            viewHolder = new C55009a(a3);
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
        MethodCollector.m26664o(3400);
        return viewHolder;
    }
}
