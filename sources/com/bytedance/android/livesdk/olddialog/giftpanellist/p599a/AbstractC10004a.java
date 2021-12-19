package com.bytedance.android.livesdk.olddialog.giftpanellist.p599a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1445j;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.android.livesdk.dialogv2.p516b.C8345a;
import com.bytedance.android.livesdk.dialogv2.p516b.C8346b;
import com.bytedance.android.livesdk.dialogv2.p516b.C8347c;
import com.bytedance.android.livesdk.dialogv2.p516b.C8348d;
import com.bytedance.android.livesdk.firstrecharge.C8729d;
import com.bytedance.android.livesdk.gift.model.p553a.AbstractC8811a;
import com.bytedance.android.livesdk.gift.model.p553a.AbstractC8812b;
import com.bytedance.android.livesdk.livesetting.gift.LiveFirstRechargeStyleSetting;
import com.bytedance.android.livesdk.model.C9543b;
import com.bytedance.android.livesdk.model.C9904t;
import com.bytedance.android.livesdk.olddialog.giftpanellist.p601c.AbstractC10019b;
import com.bytedance.android.livesdk.olddialog.giftpanellist.p601c.AbstractC10037n;
import com.bytedance.android.livesdk.olddialog.giftpanellist.p601c.C10011a;
import com.bytedance.android.livesdk.olddialog.giftpanellist.p601c.C10026f;
import com.bytedance.android.livesdk.olddialog.giftpanellist.p601c.C10027g;
import com.bytedance.android.livesdk.olddialog.giftpanellist.p601c.C10031j;
import com.bytedance.android.livesdk.olddialog.giftpanellist.p601c.C10035m;
import com.bytedance.android.livesdk.olddialog.widget.LiveNewGiftPanelWidget;
import com.bytedance.android.livesdk.p668y.p671c.C11599a;
import com.bytedance.android.livesdk.service.p621a.C10631a;
import com.bytedance.android.livesdk.service.p624b.C10698b;
import com.bytedance.android.livesdk.service.p625c.p626a.C10703a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.olddialog.giftpanellist.a.a */
public abstract class AbstractC10004a extends RecyclerView.AbstractC1350a<AbstractC10019b> implements AbstractC10019b.AbstractC10022a {

    /* renamed from: a */
    public AbstractC10019b f24301a;

    /* renamed from: b */
    public long f24302b;

    /* renamed from: c */
    public final Context f24303c;

    /* renamed from: d */
    public AbstractC10006a f24304d;

    /* renamed from: e */
    public long f24305e;

    /* renamed from: f */
    public final LinkedList<AbstractC8812b<? extends C9543b>> f24306f = new LinkedList<>();

    /* renamed from: g */
    public long f24307g;

    /* renamed from: h */
    public DataChannel f24308h;

    /* renamed from: i */
    public LiveNewGiftPanelWidget.AbstractC10048a f24309i;

    /* renamed from: j */
    private AbstractC8812b f24310j;

    /* renamed from: k */
    private final boolean f24311k;

    /* renamed from: l */
    private boolean f24312l;

    /* renamed from: m */
    private AbstractC10037n f24313m = new AbstractC10037n() {
        /* class com.bytedance.android.livesdk.olddialog.giftpanellist.p599a.AbstractC10004a.C100051 */

        static {
            Covode.recordClassIndex(11559);
        }

        @Override // com.bytedance.android.livesdk.olddialog.giftpanellist.p601c.AbstractC10037n
        /* renamed from: a */
        public final void mo16828a() {
            if (AbstractC10004a.this.f24304d != null) {
                AbstractC10004a.this.f24304d.mo16834b();
            }
        }
    };

    /* renamed from: com.bytedance.android.livesdk.olddialog.giftpanellist.a.a$a */
    public interface AbstractC10006a {
        static {
            Covode.recordClassIndex(11560);
        }

        /* renamed from: a */
        void mo16829a();

        /* renamed from: a */
        void mo16830a(int i);

        /* renamed from: a */
        void mo16831a(int i, int i2);

        /* renamed from: a */
        void mo16832a(AbstractC8812b bVar, String str, String str2);

        /* renamed from: a */
        void mo16833a(String str, String str2);

        /* renamed from: b */
        void mo16834b();
    }

    static {
        Covode.recordClassIndex(11558);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public /* synthetic */ AbstractC10019b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m18479a(this, viewGroup, i);
    }

    @Override // com.bytedance.android.livesdk.olddialog.giftpanellist.p601c.AbstractC10019b.AbstractC10022a
    /* renamed from: a */
    public final AbstractC8812b mo16816a() {
        return this.f24310j;
    }

    /* renamed from: b */
    public final void mo16824b() {
        AbstractC10019b bVar = this.f24301a;
        if (bVar != null) {
            bVar.mo16851h();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public int getItemCount() {
        return this.f24306f.size();
    }

    /* renamed from: c */
    public final void mo16827c() {
        AbstractC10019b bVar = this.f24301a;
        if (bVar != null && !(bVar instanceof C10031j)) {
            bVar.mo16849b(this.f24302b);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public /* bridge */ /* synthetic */ void onViewDetachedFromWindow(AbstractC10019b bVar) {
        super.onViewDetachedFromWindow(bVar);
    }

    /* renamed from: d */
    private void m18480d(long j) {
        AbstractC10019b bVar = this.f24301a;
        if (bVar != null) {
            bVar.mo16847a(j);
        }
    }

    @Override // com.bytedance.android.livesdk.olddialog.giftpanellist.p601c.AbstractC10019b.AbstractC10022a
    /* renamed from: a */
    public final void mo16820a(AbstractC10019b bVar) {
        this.f24301a = bVar;
    }

    @Override // com.bytedance.android.livesdk.olddialog.giftpanellist.p601c.AbstractC10019b.AbstractC10022a
    /* renamed from: b */
    public final boolean mo16825b(long j) {
        if (this.f24305e != j) {
            return false;
        }
        this.f24305e = 0;
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public long getItemId(int i) {
        return this.f24306f.get(i).mo14676d();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public int getItemViewType(int i) {
        return this.f24306f.get(i).f21694a;
    }

    /* renamed from: a */
    public final void mo16818a(long j) {
        if (!C8729d.f21542u.mo15009d() || (LiveFirstRechargeStyleSetting.INSTANCE.getValue() && !C8729d.f21542u.mo15010e())) {
            this.f24307g = j;
        } else if (C8729d.f21542u.mo15011f()) {
            this.f24307g = C8729d.f21542u.mo15013i();
        } else {
            this.f24307g = 0;
        }
    }

    /* renamed from: c */
    public final int mo16826c(long j) {
        Iterator<AbstractC8812b<? extends C9543b>> it = this.f24306f.iterator();
        int i = 0;
        while (it.hasNext()) {
            AbstractC8812b<? extends C9543b> next = it.next();
            if (next.mo14676d() == j && next.f21694a != 0) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: a */
    public final void mo16823a(List<AbstractC8812b<? extends C9543b>> list) {
        int i;
        int size = (((list.size() - 1) / 8) + 1) * 8;
        AbstractC8812b[] bVarArr = new AbstractC8812b[size];
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            bVarArr[i3] = new C8345a();
        }
        for (AbstractC8812b<? extends C9543b> bVar : list) {
            int i4 = i2 / 8;
            int i5 = i2 % 8;
            if (i5 < 4) {
                i = i5 * 2;
            } else {
                i = ((i5 - 4) * 2) + 1;
            }
            int i6 = i + (i4 * 8);
            i2++;
            if (i6 < size) {
                bVarArr[i6] = bVar;
            }
        }
        List asList = Arrays.asList(bVarArr);
        C1445j.m4922a(new C10698b(this.f24306f, asList), true).mo4951a(this);
        this.f24306f.clear();
        this.f24306f.addAll(asList);
    }

    @Override // com.bytedance.android.livesdk.olddialog.giftpanellist.p601c.AbstractC10019b.AbstractC10022a
    /* renamed from: a */
    public final void mo16822a(String str, String str2) {
        this.f24304d.mo16833a(str, str2);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public /* synthetic */ void onBindViewHolder(AbstractC10019b bVar, int i) {
        AbstractC10019b bVar2 = bVar;
        AbstractC8812b<? extends C9543b> bVar3 = this.f24306f.get(i);
        if (bVar3 == null) {
            return;
        }
        if (bVar3.f21694a == 0) {
            bVar2.itemView.setVisibility(4);
            return;
        }
        if (this.f24307g == bVar3.mo14676d()) {
            this.f24301a = bVar2;
            this.f24310j = bVar3;
            bVar2.mo16838b();
            this.f24301a.mo16849b(this.f24302b);
            if (bVar3 instanceof C8347c) {
                LiveNewGiftPanelWidget.AbstractC10048a aVar = this.f24309i;
                Long valueOf = Long.valueOf(bVar3.mo14676d());
                Boolean.valueOf(this.f24311k);
                aVar.mo16878a(true, valueOf, ((AbstractC8811a) bVar3).mo14677e());
            }
        }
        if (bVar3.f21694a == 9) {
            boolean e = C8729d.f21542u.mo15010e();
            if (bVar2 instanceof C10011a) {
                ((C10011a) bVar2).f24319a = e;
            }
        }
        bVar2.mo16836a(bVar3, i / 8);
    }

    /* renamed from: a */
    public AbstractC10019b mo16817a(ViewGroup viewGroup, int i) {
        AbstractC10019b gVar;
        if (i == 1) {
            gVar = new C10027g(C1764a.m5927a(LayoutInflater.from(this.f24303c), R.layout.b_p, viewGroup, false));
        } else if (i == 2) {
            gVar = new C10031j(C1764a.m5927a(LayoutInflater.from(this.f24303c), R.layout.b_s, viewGroup, false));
        } else if (i == 9) {
            gVar = new C10011a(C1764a.m5927a(LayoutInflater.from(this.f24303c), R.layout.b_o, viewGroup, false));
        } else if (i != 10) {
            gVar = new C10026f(C1764a.m5927a(LayoutInflater.from(this.f24303c), R.layout.b_s, viewGroup, false));
        } else {
            gVar = new C10035m(C1764a.m5927a(LayoutInflater.from(this.f24303c), R.layout.b_t, viewGroup, false), this.f24313m);
        }
        gVar.mo16837a(this);
        gVar.f24345i = this.f24308h;
        return gVar;
    }

    @Override // com.bytedance.android.livesdk.olddialog.giftpanellist.p601c.AbstractC10019b.AbstractC10022a
    /* renamed from: a */
    public final void mo16819a(AbstractC8812b bVar, AbstractC10019b bVar2) {
        String str;
        String str2;
        AbstractC10006a aVar = this.f24304d;
        if (aVar != null) {
            aVar.mo16829a();
        }
        this.f24307g = bVar.mo14676d();
        boolean z = false;
        if (this.f24310j != bVar) {
            C10631a.C10632a.C10633a.f25635a.f25634a = false;
            C10703a.C10704a.C10705a.f25783a.mo17630a();
            if (bVar instanceof C8347c) {
                LiveNewGiftPanelWidget.AbstractC10048a aVar2 = this.f24309i;
                Long valueOf = Long.valueOf(bVar.mo14676d());
                Boolean.valueOf(this.f24311k);
                aVar2.mo16878a(false, valueOf, ((AbstractC8811a) bVar).mo14677e());
            }
            AbstractC10019b bVar3 = this.f24301a;
            if (bVar3 != null) {
                bVar3.mo16851h();
                this.f24301a.mo16839c();
            }
            bVar2.mo16838b();
            this.f24301a = bVar2;
            if (C11599a.C11601a.f27757a.f27752a && !(bVar2 instanceof C10031j)) {
                mo16827c();
            }
            this.f24310j = bVar;
        } else if (this.f24304d != null) {
            if (((C9904t) bVar.f21695b).f23995L != null) {
                z = ((C9904t) bVar.f21695b).f23995L.f24023b;
            }
            if (((bVar instanceof C8347c) || ((bVar instanceof C8346b) && C8729d.f21542u.mo15010e())) && !C11599a.C11601a.f27757a.f27752a && !z) {
                if (!((C9904t) bVar.f21695b).mo16601a()) {
                    m18480d(bVar.mo14676d());
                }
                AbstractC10006a aVar3 = this.f24304d;
                if (C10631a.C10632a.C10633a.f25635a.f25634a) {
                    str = "call";
                } else {
                    str = "click";
                }
                if (bVar2.mo16841e()) {
                    str2 = "1";
                } else {
                    str2 = "0";
                }
                aVar3.mo16832a(bVar, str, str2);
            } else if (bVar instanceof C8348d) {
                if (!bVar.mo14679g()) {
                    m18480d(bVar.mo14676d());
                }
                this.f24304d.mo16832a(bVar, "", "");
            } else if ((bVar instanceof C8346b) && !C11599a.C11601a.f27757a.f27752a) {
                C8729d.f21542u.mo15003a(this.f24303c, "first_recharge");
            }
        }
    }

    @Override // com.bytedance.android.livesdk.olddialog.giftpanellist.p601c.AbstractC10019b.AbstractC10022a
    /* renamed from: a */
    public final void mo16821a(AbstractC10019b bVar, long j, AbstractC8812b bVar2) {
        AbstractC10006a aVar = this.f24304d;
        if (aVar != null) {
            aVar.mo16829a();
        }
        this.f24307g = j;
        if (this.f24310j != bVar2) {
            AbstractC10019b bVar3 = this.f24301a;
            if (bVar3 != null) {
                bVar3.mo16851h();
                bVar.mo16839c();
            }
            bVar.mo16838b();
            this.f24301a = bVar;
            this.f24310j = bVar2;
        }
    }

    AbstractC10004a(Context context, AbstractC10006a aVar, boolean z) {
        this.f24303c = context;
        this.f24304d = aVar;
        this.f24311k = z;
        this.f24312l = true;
        this.f24302b = C11599a.C11601a.f27757a.f27754c;
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m18479a(AbstractC10004a aVar, ViewGroup viewGroup, int i) {
        boolean a;
        AbstractC10019b a2 = aVar.mo16817a(viewGroup, i);
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
        return a2;
    }
}
