package com.bytedance.android.livesdk.rank.impl.view;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.live.core.p218f.C3941k;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.gift.model.C8856t;
import com.bytedance.android.livesdk.gift.p548d.C8797a;
import com.bytedance.android.livesdk.gift.p548d.C8798b;
import com.bytedance.android.livesdk.gift.p548d.C8799c;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.rank.api.model.C10352f;
import com.bytedance.android.livesdk.rank.api.p606a.C10333b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4613b.C89219l;
import p4628j.p4629a.p4630a.AbstractC89396c;

/* renamed from: com.bytedance.android.livesdk.rank.impl.view.a */
public final class C10583a extends AbstractC89396c<C10352f, C10584a> {
    static {
        Covode.recordClassIndex(12171);
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.view.a$a */
    public static final class C10584a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        HSImageView f25555a;

        /* renamed from: b */
        public LiveTextView f25556b;

        /* renamed from: c */
        public View f25557c;

        /* renamed from: d */
        public LiveTextView f25558d;

        /* renamed from: e */
        LiveGiftBoostCountDownView f25559e;

        /* renamed from: f */
        C88411a f25560f = new C88411a();

        static {
            Covode.recordClassIndex(12172);
        }

        /* renamed from: com.bytedance.android.livesdk.rank.impl.view.a$a$b */
        static final class C10586b<T> implements AbstractC88433f {

            /* renamed from: a */
            final /* synthetic */ C10584a f25562a;

            static {
                Covode.recordClassIndex(12174);
            }

            C10586b(C10584a aVar) {
                this.f25562a = aVar;
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(Object obj) {
                CharSequence charSequence;
                View findViewById = this.f25562a.itemView.findViewById(R.id.tm);
                C89219l.m154716b(findViewById, "");
                findViewById.setVisibility(8);
                View view = this.f25562a.f25557c;
                if (view != null) {
                    view.setVisibility(0);
                }
                LiveTextView liveTextView = this.f25562a.f25558d;
                if (liveTextView != null) {
                    LiveTextView liveTextView2 = this.f25562a.f25556b;
                    if (liveTextView2 != null) {
                        charSequence = liveTextView2.getText();
                    } else {
                        charSequence = null;
                    }
                    liveTextView.setText(charSequence);
                }
            }
        }

        /* renamed from: com.bytedance.android.livesdk.rank.impl.view.a$a$a */
        static final class C10585a<T> implements AbstractC88433f {

            /* renamed from: a */
            final /* synthetic */ C10584a f25561a;

            static {
                Covode.recordClassIndex(12173);
            }

            C10585a(C10584a aVar) {
                this.f25561a = aVar;
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(Object obj) {
                Resources resources;
                Resources resources2;
                C8799c cVar = (C8799c) obj;
                LiveTextView liveTextView = this.f25561a.f25558d;
                if (liveTextView != null) {
                    String str = null;
                    if (!C3966y.m9672g()) {
                        View view = this.f25561a.itemView;
                        C89219l.m154716b(view, "");
                        Context context = view.getContext();
                        if (!(context == null || (resources2 = context.getResources()) == null)) {
                            str = resources2.getString(R.string.efi, String.valueOf(cVar.f21676a));
                        }
                    } else {
                        View view2 = this.f25561a.itemView;
                        C89219l.m154716b(view2, "");
                        Context context2 = view2.getContext();
                        if (!(context2 == null || (resources = context2.getResources()) == null)) {
                            str = resources.getString(R.string.efj, String.valueOf(cVar.f21676a));
                        }
                    }
                    liveTextView.setText(str);
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10584a(View view) {
            super(view);
            C89219l.m154721d(view, "");
            this.f25555a = (HSImageView) view.findViewById(R.id.tp);
            this.f25559e = (LiveGiftBoostCountDownView) view.findViewById(R.id.tv);
            this.f25557c = view.findViewById(R.id.tu);
            this.f25556b = (LiveTextView) view.findViewById(R.id.tx);
            this.f25558d = (LiveTextView) view.findViewById(R.id.to);
        }

        /* renamed from: com.bytedance.android.livesdk.rank.impl.view.a$a$c */
        static final class C10587c<T> implements AbstractC88433f {

            /* renamed from: a */
            final /* synthetic */ C10584a f25563a;

            static {
                Covode.recordClassIndex(12175);
            }

            C10587c(C10584a aVar) {
                this.f25563a = aVar;
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(Object obj) {
                LiveTextView liveTextView;
                Resources resources;
                Resources resources2;
                ArrayList<Long> arrayList = ((C8797a) obj).f21674a;
                int size = arrayList.size();
                if (size > 0 && (liveTextView = this.f25563a.f25556b) != null) {
                    String str = null;
                    if (!C3966y.m9672g()) {
                        View view = this.f25563a.itemView;
                        C89219l.m154716b(view, "");
                        Context context = view.getContext();
                        if (!(context == null || (resources2 = context.getResources()) == null)) {
                            Long l = arrayList.get(size - 1);
                            C89219l.m154716b(l, "");
                            str = resources2.getString(R.string.efi, ((IGiftService) C6193a.m13435a(IGiftService.class)).getAmountString(l.longValue()));
                        }
                    } else {
                        View view2 = this.f25563a.itemView;
                        C89219l.m154716b(view2, "");
                        Context context2 = view2.getContext();
                        if (!(context2 == null || (resources = context2.getResources()) == null)) {
                            Long l2 = arrayList.get(size - 1);
                            C89219l.m154716b(l2, "");
                            str = resources.getString(R.string.efj, ((IGiftService) C6193a.m13435a(IGiftService.class)).getAmountString(l2.longValue()));
                        }
                    }
                    liveTextView.setText(str);
                }
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder] */
    @Override // p4628j.p4629a.p4630a.AbstractC89396c
    /* renamed from: b */
    public final /* synthetic */ void mo11658b(C10584a aVar) {
        C10584a aVar2 = aVar;
        C89219l.m154721d(aVar2, "");
        aVar2.f25560f.mo142944a();
        C6779a.m14563a().mo13053a(new C8798b(false));
        aVar2.f25560f.mo142944a();
        super.mo11658b(aVar2);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder] */
    @Override // p4628j.p4629a.p4630a.AbstractC89396c
    /* renamed from: a */
    public final /* synthetic */ void mo11656a(C10584a aVar) {
        Resources resources;
        Resources resources2;
        C10584a aVar2 = aVar;
        C89219l.m154721d(aVar2, "");
        super.mo11656a(aVar2);
        AbstractC2953a a = C6193a.m13435a(IGiftService.class);
        C89219l.m154716b(a, "");
        C8856t boostChartInfo = ((IGiftService) a).getBoostChartInfo();
        if (boostChartInfo.f21771b) {
            HSImageView hSImageView = aVar2.f25555a;
            if (hSImageView != null) {
                C3941k.m9607a(hSImageView, "tiktok_live_basic_resource", boostChartInfo.f21774e);
            }
            View view = aVar2.f25557c;
            if (view != null) {
                view.setVisibility(0);
            }
            LiveTextView liveTextView = aVar2.f25558d;
            if (liveTextView != null) {
                String str = null;
                if (!C3966y.m9672g()) {
                    View view2 = aVar2.itemView;
                    C89219l.m154716b(view2, "");
                    Context context = view2.getContext();
                    if (!(context == null || (resources2 = context.getResources()) == null)) {
                        str = resources2.getString(R.string.efi, ((IGiftService) C6193a.m13435a(IGiftService.class)).getAmountString(boostChartInfo.f21770a));
                    }
                } else {
                    View view3 = aVar2.itemView;
                    C89219l.m154716b(view3, "");
                    Context context2 = view3.getContext();
                    if (!(context2 == null || (resources = context2.getResources()) == null)) {
                        str = resources.getString(R.string.efj, ((IGiftService) C6193a.m13435a(IGiftService.class)).getAmountString(boostChartInfo.f21770a));
                    }
                }
                liveTextView.setText(str);
            }
            aVar2.f25560f.mo142945a(C6779a.m14563a().mo13052a(C8799c.class).mo143289d(new C10584a.C10585a(aVar2)));
        } else if (boostChartInfo.f21772c) {
            View findViewById = aVar2.itemView.findViewById(R.id.tm);
            C89219l.m154716b(findViewById, "");
            findViewById.setVisibility(0);
            HSImageView hSImageView2 = aVar2.f25555a;
            if (hSImageView2 != null) {
                C3941k.m9607a(hSImageView2, "tiktok_live_basic_resource", boostChartInfo.f21774e);
            }
            LiveGiftBoostCountDownView liveGiftBoostCountDownView = aVar2.f25559e;
            if (liveGiftBoostCountDownView != null) {
                liveGiftBoostCountDownView.setTimer(boostChartInfo.f21773d);
            }
            aVar2.f25560f.mo142945a(C6779a.m14563a().mo13052a(C10333b.class).mo143289d(new C10584a.C10586b(aVar2)));
            aVar2.f25560f.mo142945a(C6779a.m14563a().mo13052a(C8797a.class).mo143289d(new C10584a.C10587c(aVar2)));
            C6779a.m14563a().mo13053a(new C8798b(true));
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, java.lang.Object] */
    @Override // p4628j.p4629a.p4630a.AbstractC89396c
    /* renamed from: a */
    public final /* synthetic */ void mo10140a(C10584a aVar, C10352f fVar) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(fVar, "");
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // p4628j.p4629a.p4630a.AbstractC89396c
    /* renamed from: a */
    public final /* synthetic */ C10584a mo10368a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.b_2, viewGroup, false);
        C89219l.m154716b(a, "");
        return new C10584a(a);
    }
}
