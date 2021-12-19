package com.bytedance.android.livesdk.dialogv2.p515a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C1213t;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.android.livesdk.dialogv2.p517c.C8350a;
import com.bytedance.android.livesdk.dialogv2.p517c.C8358b;
import com.bytedance.android.livesdk.dialogv2.p517c.C8359c;
import com.bytedance.android.livesdk.dialogv2.p517c.C8366d;
import com.bytedance.android.livesdk.dialogv2.p517c.C8371e;
import com.bytedance.android.livesdk.dialogv2.viewmodel.C8374a;
import com.bytedance.android.livesdk.dialogv2.viewmodel.LiveGiftDialogViewModel;
import com.bytedance.android.livesdk.firstrecharge.C8729d;
import com.bytedance.android.livesdk.gift.model.p553a.AbstractC8812b;
import com.bytedance.android.livesdk.model.C9543b;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p668y.p670b.C11596a;
import com.bytedance.android.livesdk.p668y.p670b.C11597b;
import com.bytedance.android.livesdk.p668y.p670b.C11598c;
import com.bytedance.android.livesdk.p668y.p671c.C11599a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.util.LinkedList;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.dialogv2.a.a */
public class C8332a extends RecyclerView.AbstractC1350a<C8350a> implements C8350a.AbstractC8351a {

    /* renamed from: a */
    public C8350a f20622a;

    /* renamed from: b */
    public final C88411a f20623b = new C88411a();

    /* renamed from: c */
    public AbstractC8333a f20624c;

    /* renamed from: d */
    private final LinkedList<AbstractC8812b<? extends C9543b>> f20625d = new LinkedList<>();

    /* renamed from: e */
    private final DataChannel f20626e;

    /* renamed from: f */
    private final LiveGiftDialogViewModel f20627f;

    /* renamed from: com.bytedance.android.livesdk.dialogv2.a.a$a */
    public interface AbstractC8333a {
        static {
            Covode.recordClassIndex(9171);
        }

        /* renamed from: a */
        int mo14670a(Long l);
    }

    static {
        Covode.recordClassIndex(9170);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public /* synthetic */ C8350a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m16489a(this, viewGroup, i);
    }

    /* renamed from: a */
    public final void mo14665a() {
        C8350a aVar = this.f20622a;
        if (aVar != null) {
            aVar.mo14687f();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public int getItemCount() {
        return this.f20625d.size();
    }

    /* renamed from: com.bytedance.android.livesdk.dialogv2.a.a$c */
    static final class C8335c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C8332a f20629a;

        static {
            Covode.recordClassIndex(9173);
        }

        C8335c(C8332a aVar) {
            this.f20629a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C8332a aVar = this.f20629a;
            C11599a.C11601a.f27757a.f27752a = false;
            C8350a aVar2 = aVar.f20622a;
            if (aVar2 != null) {
                aVar2.mo14688g();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo14667a(Long l) {
        C8350a aVar = this.f20622a;
        if (aVar != null) {
            aVar.mo14682a(l);
        }
    }

    @Override // com.bytedance.android.livesdk.dialogv2.p517c.C8350a.AbstractC8351a
    /* renamed from: b */
    public final int mo14669b(Long l) {
        AbstractC8333a aVar = this.f20624c;
        if (aVar != null) {
            return aVar.mo14670a(l);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public int getItemViewType(int i) {
        AbstractC8812b<? extends C9543b> bVar = this.f20625d.get(i);
        if (bVar != null) {
            return bVar.f21694a;
        }
        return 0;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public /* synthetic */ void onViewDetachedFromWindow(C8350a aVar) {
        C8350a aVar2 = aVar;
        C89219l.m154721d(aVar2, "");
        super.onViewDetachedFromWindow(aVar2);
        aVar2.mo14689h();
    }

    /* renamed from: com.bytedance.android.livesdk.dialogv2.a.a$b */
    static final class C8334b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C8332a f20628a;

        static {
            Covode.recordClassIndex(9172);
        }

        C8334b(C8332a aVar) {
            this.f20628a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            long j;
            C11596a aVar = (C11596a) obj;
            C8332a aVar2 = this.f20628a;
            if (aVar != null) {
                j = aVar.f27751a;
            } else {
                j = 0;
            }
            aVar2.mo14667a(Long.valueOf(j));
        }
    }

    /* renamed from: com.bytedance.android.livesdk.dialogv2.a.a$d */
    static final class C8336d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C8332a f20630a;

        static {
            Covode.recordClassIndex(9174);
        }

        C8336d(C8332a aVar) {
            this.f20630a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C8332a aVar = this.f20630a;
            C11599a.C11601a.f27757a.f27752a = true;
            C8350a aVar2 = aVar.f20622a;
            if (aVar2 != null) {
                aVar2.mo14688g();
            }
            C11599a aVar3 = C11599a.C11601a.f27757a;
            C89219l.m154716b(aVar3, "");
            aVar.mo14667a(Long.valueOf(aVar3.f27754c));
        }
    }

    @Override // com.bytedance.android.livesdk.dialogv2.p517c.C8350a.AbstractC8351a
    /* renamed from: a */
    public final void mo14666a(C8350a aVar) {
        C89219l.m154721d(aVar, "");
        C8350a aVar2 = this.f20622a;
        if (aVar2 != null) {
            aVar2.mo14687f();
        }
        C8350a aVar3 = this.f20622a;
        if (aVar3 != null) {
            aVar3.mo14684c();
        }
        this.f20622a = aVar;
    }

    /* renamed from: a */
    public final void mo14668a(LinkedList<AbstractC8812b<? extends C9543b>> linkedList) {
        this.f20625d.clear();
        if (linkedList != null) {
            this.f20625d.addAll(linkedList);
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C89219l.m154721d(recyclerView, "");
        super.onAttachedToRecyclerView(recyclerView);
        this.f20623b.mo142945a(C6779a.m14563a().mo13052a(C11596a.class).mo143289d(new C8334b(this)));
        this.f20623b.mo142945a(C6779a.m14563a().mo13052a(C11597b.class).mo143289d(new C8335c(this)));
        this.f20623b.mo142945a(C6779a.m14563a().mo13052a(C11598c.class).mo143289d(new C8336d(this)));
    }

    public C8332a(DataChannel dataChannel, LiveGiftDialogViewModel liveGiftDialogViewModel) {
        this.f20626e = dataChannel;
        this.f20627f = liveGiftDialogViewModel;
    }

    /* renamed from: a */
    public C8350a mo14664a(ViewGroup viewGroup, int i) {
        C89219l.m154721d(viewGroup, "");
        if (i == 1) {
            View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.b_p, viewGroup, false);
            C89219l.m154716b(a, "");
            return new C8366d(a);
        } else if (i == 9) {
            View a2 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.b_o, viewGroup, false);
            C89219l.m154716b(a2, "");
            return new C8359c(a2);
        } else if (i != 10) {
            View a3 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.b_s, viewGroup, false);
            C89219l.m154716b(a3, "");
            return new C8358b(a3);
        } else {
            View a4 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.b_t, viewGroup, false);
            C89219l.m154716b(a4, "");
            return new C8371e(a4);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public /* synthetic */ void onBindViewHolder(C8350a aVar, int i) {
        Integer num;
        C1213t<Integer> tVar;
        C1213t<Integer> tVar2;
        Integer value;
        Integer num2;
        C1213t<Integer> tVar3;
        C8350a aVar2 = aVar;
        C89219l.m154721d(aVar2, "");
        AbstractC8812b<? extends C9543b> bVar = this.f20625d.get(i);
        if (bVar != null) {
            C89219l.m154716b(bVar, "");
            if (bVar.f21694a == 0) {
                View view = aVar2.itemView;
                C89219l.m154716b(view, "");
                view.setVisibility(4);
                return;
            }
            if (bVar.f21694a == 10) {
                LiveGiftDialogViewModel liveGiftDialogViewModel = this.f20627f;
                if (liveGiftDialogViewModel == null || (tVar3 = liveGiftDialogViewModel.f20705a) == null || (num2 = tVar3.getValue()) == null) {
                    num2 = 1;
                }
                C89219l.m154716b(num2, "");
                aVar2.mo14681a(bVar, num2.intValue(), this.f20626e);
            }
            if (C8374a.C8375a.C8376a.f20718a.f20712f == bVar.mo14676d()) {
                int i2 = C8374a.C8375a.C8376a.f20718a.f20713g;
                LiveGiftDialogViewModel liveGiftDialogViewModel2 = this.f20627f;
                if (!(liveGiftDialogViewModel2 == null || (tVar2 = liveGiftDialogViewModel2.f20705a) == null || (value = tVar2.getValue()) == null || i2 != value.intValue())) {
                    this.f20622a = aVar2;
                }
            }
            if (bVar.f21694a == 9) {
                boolean e = C8729d.f21542u.mo15010e();
                if (aVar2 instanceof C8359c) {
                    ((C8359c) aVar2).f20672m = e;
                }
            }
            C89219l.m154721d(this, "");
            aVar2.f20656i = this;
            LiveGiftDialogViewModel liveGiftDialogViewModel3 = this.f20627f;
            if (liveGiftDialogViewModel3 == null || (tVar = liveGiftDialogViewModel3.f20705a) == null || (num = tVar.getValue()) == null) {
                num = 1;
            }
            C89219l.m154716b(num, "");
            aVar2.mo14681a(bVar, num.intValue(), this.f20626e);
        }
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m16489a(C8332a aVar, ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(5374);
        C8350a a2 = aVar.mo14664a(viewGroup, i);
        try {
            if (a2.itemView.getParent() != null) {
                try {
                    a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(a2.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) a2.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(a2.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = a2.getClass().getName();
        MethodCollector.m26664o(5374);
        return a2;
    }
}
