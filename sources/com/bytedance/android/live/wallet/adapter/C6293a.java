package com.bytedance.android.live.wallet.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.uikit.p411c.C6229a;
import com.bytedance.android.live.wallet.AbstractC6332d;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.model.BalanceStruct;
import com.bytedance.android.live.wallet.model.BalanceStructExtra;
import com.bytedance.android.live.wallet.model.C6384g;
import com.bytedance.android.live.wallet.model.CurrencyInfo;
import com.bytedance.android.live.wallet.model.RevenueExchange;
import com.bytedance.android.live.wallet.model.UserBalance;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdk.utils.View$OnTouchListenerC11219ai;
import com.bytedance.android.livesdk.wallet.C11314c;
import com.bytedance.android.livesdk.widget.C11424f;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.util.Arrays;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.wallet.adapter.a */
public final class C6293a extends RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> {

    /* renamed from: a */
    public int f15727a;

    /* renamed from: b */
    public final AbstractC6295b f15728b;

    /* renamed from: c */
    public int f15729c;

    /* renamed from: d */
    public int f15730d;

    /* renamed from: e */
    public int f15731e;

    /* renamed from: f */
    public int f15732f;

    /* renamed from: g */
    private final Drawable f15733g;

    /* renamed from: h */
    private final List<C11314c> f15734h;

    /* renamed from: com.bytedance.android.live.wallet.adapter.a$b */
    public interface AbstractC6295b {
        static {
            Covode.recordClassIndex(7009);
        }

        /* renamed from: a */
        void mo12307a(int i, int i2);

        /* renamed from: a */
        void mo12308a(C11314c cVar, int i);

        /* renamed from: a */
        void mo12309a(boolean z, int i, C11314c cVar);
    }

    static {
        Covode.recordClassIndex(7007);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m13613a(this, viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f15734h.size();
    }

    /* renamed from: com.bytedance.android.live.wallet.adapter.a$d */
    static final class View$OnClickListenerC6297d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BalanceStructExtra f15743a;

        /* renamed from: b */
        final /* synthetic */ C6293a f15744b;

        /* renamed from: c */
        final /* synthetic */ BalanceStruct f15745c;

        /* renamed from: d */
        final /* synthetic */ RecyclerView.ViewHolder f15746d;

        static {
            Covode.recordClassIndex(7011);
        }

        View$OnClickListenerC6297d(BalanceStructExtra balanceStructExtra, C6293a aVar, BalanceStruct balanceStruct, RecyclerView.ViewHolder viewHolder) {
            this.f15743a = balanceStructExtra;
            this.f15744b = aVar;
            this.f15745c = balanceStruct;
            this.f15746d = viewHolder;
        }

        public final void onClick(View view) {
            this.f15744b.f15728b.mo12307a(-1, this.f15744b.f15732f);
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.adapter.a$e */
    static final class View$OnClickListenerC6298e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C6293a f15747a;

        /* renamed from: b */
        final /* synthetic */ RecyclerView.ViewHolder f15748b;

        /* renamed from: c */
        final /* synthetic */ C6384g f15749c;

        static {
            Covode.recordClassIndex(7012);
        }

        View$OnClickListenerC6298e(C6293a aVar, RecyclerView.ViewHolder viewHolder, C6384g gVar) {
            this.f15747a = aVar;
            this.f15748b = viewHolder;
            this.f15749c = gVar;
        }

        public final void onClick(View view) {
            this.f15747a.f15728b.mo12307a(-2, this.f15747a.f15732f);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemViewType(int i) {
        return this.f15734h.get(i).f27060f;
    }

    /* renamed from: com.bytedance.android.live.wallet.adapter.a$c */
    public static final class C6296c extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final TextView f15739a;

        /* renamed from: b */
        public final TextView f15740b;

        /* renamed from: c */
        public final ViewGroup f15741c;

        /* renamed from: d */
        public final TextView f15742d;

        static {
            Covode.recordClassIndex(7010);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6296c(View view) {
            super(view);
            C89219l.m154721d(view, "");
            this.f15739a = (TextView) view.findViewById(R.id.al0);
            this.f15740b = (TextView) view.findViewById(R.id.d6d);
            this.f15741c = (ViewGroup) view.findViewById(R.id.ccl);
            this.f15742d = (TextView) view.findViewById(R.id.bb7);
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.adapter.a$f */
    static final class View$OnClickListenerC6299f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C6293a f15750a;

        /* renamed from: b */
        final /* synthetic */ C11314c f15751b;

        /* renamed from: c */
        final /* synthetic */ int f15752c;

        static {
            Covode.recordClassIndex(7013);
        }

        View$OnClickListenerC6299f(C6293a aVar, C11314c cVar, int i) {
            this.f15750a = aVar;
            this.f15751b = cVar;
            this.f15752c = i;
        }

        public final void onClick(View view) {
            this.f15750a.f15728b.mo12308a(this.f15751b, 0);
            this.f15750a.f15727a = this.f15752c;
            this.f15750a.notifyDataSetChanged();
            this.f15750a.f15731e = -1;
            this.f15750a.f15729c = -1;
            this.f15750a.f15730d = -1;
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.adapter.a$a */
    public final class C6294a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ C6293a f15735a;

        /* renamed from: b */
        private final TextView f15736b;

        /* renamed from: c */
        private final TextView f15737c;

        /* renamed from: d */
        private final ImageView f15738d;

        static {
            Covode.recordClassIndex(7008);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6294a(C6293a aVar, View view) {
            super(view);
            C89219l.m154721d(view, "");
            this.f15735a = aVar;
            this.f15736b = (TextView) view.findViewById(R.id.awa);
            this.f15737c = (TextView) view.findViewById(R.id.aw5);
            this.f15738d = (ImageView) view.findViewById(R.id.aw2);
        }

        /* renamed from: a */
        public final void mo12316a(String str, long j, long j2, int i, int i2) {
            String str2;
            Drawable c = C3966y.m9665c(2131234435);
            int i3 = 1;
            if (c != null) {
                int a = C3966y.m9653a(13.0f);
                c.setBounds(0, 0, a, a);
                C11424f fVar = new C11424f(c);
                StringBuilder sb = new StringBuilder();
                if (str == null) {
                    str = "";
                }
                StringBuilder append = sb.append(str);
                double d = (double) j;
                double pow = Math.pow(10.0d, 2.0d);
                Double.isNaN(d);
                String a2 = C1764a.m5928a("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(d / pow)}, 1));
                C89219l.m154716b(a2, "");
                String sb2 = append.append(a2).append(" ( ").toString();
                String str3 = ". " + j2 + " )";
                View view = this.itemView;
                C89219l.m154716b(view, "");
                String string = view.getContext().getString(i2, sb2 + str3);
                C89219l.m154716b(string, "");
                SpannableString spannableString = new SpannableString(string);
                spannableString.setSpan(fVar, string.length() - str3.length(), (string.length() - str3.length()) + 1, 33);
                TextView textView = this.f15737c;
                if (textView != null) {
                    textView.setText(spannableString);
                }
            }
            if (this.f15735a.f15732f == 2) {
                TextView textView2 = this.f15736b;
                if (textView2 != null) {
                    textView2.setEnabled(true);
                }
                TextView textView3 = this.f15737c;
                if (textView3 != null) {
                    textView3.setEnabled(true);
                }
                ImageView imageView = this.f15738d;
                if (imageView != null) {
                    imageView.setEnabled(true);
                }
            } else {
                TextView textView4 = this.f15736b;
                if (textView4 != null) {
                    textView4.setEnabled(false);
                }
                TextView textView5 = this.f15737c;
                if (textView5 != null) {
                    textView5.setEnabled(false);
                }
                ImageView imageView2 = this.f15738d;
                if (imageView2 != null) {
                    imageView2.setEnabled(false);
                }
            }
            C6501b a3 = C6501b.C6502a.m13948a("livesdk_recharge_exchange_entrance_show").mo12639a().mo12651a("request_page", "live_detail");
            if (i == -1) {
                str2 = "ug_exchange";
            } else {
                str2 = "anchor_income";
            }
            C6501b a4 = a3.mo12651a("charge_reason", str2);
            if (this.f15735a.f15732f != 2) {
                i3 = 0;
            }
            a4.mo12645a("could_exchange", i3).mo12645a("is_anchor", C11279p.m20029f() ? 1 : 0).mo12655b();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        long j;
        int i2;
        UserBalance userBalance;
        Context context;
        C89219l.m154721d(viewHolder, "");
        String str = null;
        if (viewHolder instanceof C6296c) {
            C11314c cVar = this.f15734h.get(i);
            if (cVar.f27060f == 0) {
                C6296c cVar2 = (C6296c) viewHolder;
                TextView textView = cVar2.f15739a;
                if (textView != null) {
                    textView.setText(String.valueOf(cVar.f27058d));
                }
                Drawable drawable = this.f15733g;
                if (drawable != null) {
                    ViewGroup viewGroup = cVar2.f15741c;
                    if (viewGroup != null) {
                        context = viewGroup.getContext();
                    } else {
                        context = null;
                    }
                    if (C6229a.m13521a(context)) {
                        TextView textView2 = cVar2.f15739a;
                        if (textView2 != null) {
                            textView2.setCompoundDrawables(null, null, drawable, null);
                        }
                    } else {
                        TextView textView3 = cVar2.f15739a;
                        if (textView3 != null) {
                            textView3.setCompoundDrawables(drawable, null, null, null);
                        }
                    }
                }
            } else {
                TextView textView4 = ((C6296c) viewHolder).f15739a;
                if (textView4 != null) {
                    View view = viewHolder.itemView;
                    C89219l.m154716b(view, "");
                    textView4.setText(view.getContext().getString(R.string.dy6));
                }
            }
            AbstractC2953a a = C6193a.m13435a(IGiftService.class);
            C89219l.m154716b(a, "");
            if (((IGiftService) a).isFirstRecharge() && cVar.f27059e > 0) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("+");
                stringBuffer.append(cVar.f27059e);
                View view2 = viewHolder.itemView;
                C89219l.m154716b(view2, "");
                if (C6229a.m13521a(view2.getContext())) {
                    int i3 = Build.VERSION.SDK_INT;
                    TextView textView5 = ((C6296c) viewHolder).f15742d;
                    if (textView5 != null) {
                        textView5.setBackground(C3966y.m9665c(R.drawable.br9));
                    }
                }
                C6296c cVar3 = (C6296c) viewHolder;
                TextView textView6 = cVar3.f15742d;
                if (textView6 != null) {
                    textView6.setText(stringBuffer.toString());
                }
                TextView textView7 = cVar3.f15742d;
                if (textView7 != null) {
                    textView7.setVisibility(0);
                }
            }
            if (i == this.f15727a) {
                ViewGroup viewGroup2 = ((C6296c) viewHolder).f15741c;
                if (viewGroup2 != null) {
                    viewGroup2.setBackground(C3966y.m9665c(R.drawable.bwr));
                }
            } else {
                ViewGroup viewGroup3 = ((C6296c) viewHolder).f15741c;
                if (viewGroup3 != null) {
                    viewGroup3.setBackground(C3966y.m9665c(R.drawable.bws));
                }
            }
            if (cVar.f27060f == 0) {
                TextView textView8 = ((C6296c) viewHolder).f15740b;
                if (textView8 != null) {
                    textView8.setText(cVar.f27057c);
                }
            } else {
                TextView textView9 = ((C6296c) viewHolder).f15740b;
                if (textView9 != null) {
                    View view3 = viewHolder.itemView;
                    C89219l.m154716b(view3, "");
                    textView9.setText(view3.getContext().getString(R.string.dy7));
                }
            }
            viewHolder.itemView.setOnTouchListener(new View$OnTouchListenerC11219ai());
            viewHolder.itemView.setOnClickListener(new View$OnClickListenerC6299f(this, cVar, i));
        } else if (viewHolder instanceof C6294a) {
            int itemViewType = getItemViewType(i);
            if (itemViewType == -2) {
                AbstractC6332d walletCenter = ((IWalletService) C6193a.m13435a(IWalletService.class)).walletCenter();
                C89219l.m154716b(walletCenter, "");
                C6384g f = walletCenter.mo12382f();
                C89219l.m154716b(f, "");
                BalanceStructExtra balanceStructExtra = f.f15958d;
                if (balanceStructExtra != null) {
                    C6294a aVar = (C6294a) viewHolder;
                    CurrencyInfo currencyInfo = balanceStructExtra.getCurrencyInfo();
                    if (currencyInfo != null) {
                        str = currencyInfo.getSymbol();
                    }
                    RevenueExchange revenueExchange = f.f15957c;
                    if (revenueExchange != null) {
                        j = revenueExchange.getBalance();
                    } else {
                        j = 0;
                    }
                    long maxCoins = balanceStructExtra.getMaxCoins();
                    RevenueExchange revenueExchange2 = f.f15957c;
                    if (revenueExchange2 == null || !revenueExchange2.isRevenue()) {
                        i2 = R.string.e2l;
                    } else {
                        i2 = R.string.e2m;
                    }
                    aVar.mo12316a(str, j, maxCoins, -2, i2);
                    viewHolder.itemView.setOnClickListener(new View$OnClickListenerC6298e(this, viewHolder, f));
                }
            } else if (itemViewType != -1) {
                C11279p.m20006a(viewHolder.itemView);
            } else {
                AbstractC6332d walletCenter2 = ((IWalletService) C6193a.m13435a(IWalletService.class)).walletCenter();
                C89219l.m154716b(walletCenter2, "");
                BalanceStruct e = walletCenter2.mo12380e();
                BalanceStructExtra exchangeInfo = e.getExchangeInfo();
                if (exchangeInfo != null && (userBalance = e.getUserBalance()) != null) {
                    C6294a aVar2 = (C6294a) viewHolder;
                    CurrencyInfo currencyInfo2 = exchangeInfo.getCurrencyInfo();
                    if (currencyInfo2 != null) {
                        str = currencyInfo2.getSymbol();
                    }
                    aVar2.mo12316a(str, userBalance.getBalance(), exchangeInfo.getMaxCoins(), -1, R.string.e0n);
                    viewHolder.itemView.setOnClickListener(new View$OnClickListenerC6297d(exchangeInfo, this, e, viewHolder));
                }
            }
        }
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m13613a(C6293a aVar, ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder viewHolder;
        boolean a;
        MethodCollector.m26663i(11417);
        C89219l.m154721d(viewGroup, "");
        if (i == -1 || i == -2) {
            View a2 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.b9s, viewGroup, false);
            C89219l.m154716b(a2, "");
            viewHolder = new C6294a(aVar, a2);
        } else {
            View a3 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.b9k, viewGroup, false);
            C89219l.m154716b(a3, "");
            viewHolder = new C6296c(a3);
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
        MethodCollector.m26664o(11417);
        return viewHolder;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.util.List<? extends com.bytedance.android.livesdk.wallet.c> */
    /* JADX WARN: Multi-variable type inference failed */
    public C6293a(List<? extends C11314c> list, AbstractC6295b bVar, int i, int i2, int i3, int i4) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(bVar, "");
        this.f15734h = list;
        this.f15728b = bVar;
        this.f15729c = i;
        this.f15730d = i2;
        this.f15731e = i3;
        this.f15732f = i4;
        Drawable c = C3966y.m9665c(2131234435);
        this.f15733g = c;
        int a = C3966y.m9653a(16.0f);
        int i5 = 0;
        if (c != null) {
            c.setBounds(0, 0, a, a);
        }
        this.f15727a = this.f15732f != 2 ? 1 : i5;
        int i6 = this.f15729c;
        if (i6 != -1) {
            this.f15727a = i6;
        } else {
            int i7 = this.f15730d;
            if (i7 != -1) {
                this.f15727a = i7;
            } else {
                int i8 = this.f15731e;
                if (i8 != -1) {
                    this.f15727a = i8;
                }
            }
        }
        if (this.f15727a < list.size()) {
            bVar.mo12308a((C11314c) list.get(this.f15727a), 1);
        }
    }
}
