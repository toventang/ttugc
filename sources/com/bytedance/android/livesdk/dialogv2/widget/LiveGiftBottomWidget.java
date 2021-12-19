package com.bytedance.android.livesdk.dialogv2.widget;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.drawable.Animatable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1213t;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.wallet.AbstractC6332d;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.C6903bd;
import com.bytedance.android.livesdk.C6904be;
import com.bytedance.android.livesdk.dialogv2.viewmodel.C8374a;
import com.bytedance.android.livesdk.dialogv2.viewmodel.LiveGiftDialogViewModel;
import com.bytedance.android.livesdk.dialogv2.widget.C8406a;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.livesetting.wallet.HideChargeIconForUserSetting;
import com.bytedance.android.livesdk.olddialog.widget.C10071u;
import com.bytedance.android.livesdk.p450an.C6800c;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6805b;
import com.bytedance.android.livesdk.p452ao.C6806c;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.service.assets.GiftManager;
import com.bytedance.android.livesdk.service.p621a.C10640d;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.util.rxutils.autodispose.AbstractC11181z;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17301b;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17303d;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.ies.sdk.widgets.WidgetExtendsKt;
import com.facebook.drawee.p1851c.C24202c;
import com.facebook.fresco.animation.p1867c.C24290a;
import com.facebook.fresco.animation.p1867c.C24296c;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4613b.C89219l;

public final class LiveGiftBottomWidget extends LiveWidget implements C8406a.AbstractC8407a, AbstractC33974au {

    /* renamed from: a */
    public RecyclerView f20720a;

    /* renamed from: b */
    public LiveGiftDialogViewModel f20721b;

    /* renamed from: c */
    String f20722c;

    /* renamed from: d */
    public List<? extends GiftPage> f20723d;

    /* renamed from: e */
    private C8406a f20724e;

    /* renamed from: f */
    private TextView f20725f;

    /* renamed from: g */
    private View f20726g;

    /* renamed from: h */
    private View f20727h;

    /* renamed from: i */
    private View f20728i;

    /* renamed from: j */
    private long f20729j;

    /* renamed from: k */
    private View f20730k;

    /* renamed from: com.bytedance.android.livesdk.dialogv2.widget.LiveGiftBottomWidget$d */
    static final class View$OnClickListenerC8381d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LiveGiftBottomWidget f20735a;

        static {
            Covode.recordClassIndex(9221);
        }

        View$OnClickListenerC8381d(LiveGiftBottomWidget liveGiftBottomWidget) {
            this.f20735a = liveGiftBottomWidget;
        }

        public final void onClick(View view) {
        }
    }

    /* renamed from: com.bytedance.android.livesdk.dialogv2.widget.LiveGiftBottomWidget$f */
    static final class C8383f<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ LiveGiftBottomWidget f20737a;

        static {
            Covode.recordClassIndex(9223);
        }

        C8383f(LiveGiftBottomWidget liveGiftBottomWidget) {
            this.f20737a = liveGiftBottomWidget;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(9217);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bg0;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.dialogv2.widget.LiveGiftBottomWidget$a */
    public static final class RunnableC8378a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ LiveGiftBottomWidget f20731a;

        /* renamed from: b */
        final /* synthetic */ int f20732b;

        static {
            Covode.recordClassIndex(9218);
        }

        RunnableC8378a(LiveGiftBottomWidget liveGiftBottomWidget, int i) {
            this.f20731a = liveGiftBottomWidget;
            this.f20732b = i;
        }

        public final void run() {
            RecyclerView recyclerView = this.f20731a.f20720a;
            if (recyclerView != null) {
                recyclerView.mo4413b(this.f20732b);
            }
        }
    }

    /* renamed from: b */
    public final void mo14704b() {
        View view = this.f20730k;
        if (view != null && view.getVisibility() == 0) {
            C6805b<Boolean> bVar = AbstractC6804a.f17008cD;
            C89219l.m154716b(bVar, "");
            C6806c.m14603a((C6800c) bVar, (Object) false);
            view.setVisibility(8);
        }
        if (C10640d.C10641a.f25646a.mo17551a(C10640d.EnumC10643c.RECHARGE_DIALOG)) {
            this.dataChannel.mo28320c(C6904be.class, new C6903bd("click", 0, "normal", C8374a.C8375a.C8376a.f20718a.f20711e));
        }
    }

    /* renamed from: a */
    public final void mo14701a() {
        int a;
        RecyclerView recyclerView;
        if (this.f20723d != null) {
            ArrayList arrayList = new ArrayList(8);
            List<? extends GiftPage> list = this.f20723d;
            if (list == null) {
                C89219l.m154715b();
            }
            for (GiftPage giftPage : list) {
                if (giftPage.display && giftPage.pageType != 5) {
                    C10071u uVar = new C10071u();
                    uVar.f24478a = giftPage.pageName;
                    uVar.f24479b = giftPage.pageType;
                    uVar.f24480c = giftPage.pagePanelBanner;
                    arrayList.add(uVar);
                }
            }
            C8406a aVar = this.f20724e;
            if (aVar != null) {
                aVar.mo14726a(arrayList);
            }
            if (arrayList.size() <= 1) {
                RecyclerView recyclerView2 = this.f20720a;
                if (recyclerView2 != null) {
                    recyclerView2.setVisibility(8);
                    return;
                }
                return;
            }
            RecyclerView recyclerView3 = this.f20720a;
            if (recyclerView3 != null) {
                recyclerView3.setVisibility(0);
            }
            C8406a aVar2 = this.f20724e;
            if (!(aVar2 == null || (a = aVar2.mo14724a()) <= 0 || (recyclerView = this.f20720a) == null)) {
                recyclerView.postDelayed(new RunnableC8378a(this, a), 20);
            }
        }
    }

    /* renamed from: c */
    private final void m16599c() {
        View view;
        C1213t<Integer> tVar;
        Integer value;
        LiveGiftDialogViewModel liveGiftDialogViewModel = this.f20721b;
        if (liveGiftDialogViewModel != null && (tVar = liveGiftDialogViewModel.f20705a) != null && (value = tVar.getValue()) != null && value.intValue() == 5) {
            return;
        }
        if (!GiftManager.inst().hideBottomBar() && !HideChargeIconForUserSetting.INSTANCE.getValue()) {
            C6805b<Boolean> bVar = AbstractC6804a.f17008cD;
            C89219l.m154716b(bVar, "");
            Boolean a = bVar.mo13066a();
            C89219l.m154716b(a, "");
            if (a.booleanValue()) {
                AbstractC6332d walletCenter = ((IWalletService) C6193a.m13435a(IWalletService.class)).walletCenter();
                C89219l.m154716b(walletCenter, "");
                if (walletCenter.mo12380e().getValidUser() && (view = this.f20730k) != null) {
                    view.setVisibility(0);
                }
            }
            if (this.f20729j > 0) {
                View view2 = this.f20728i;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
                View view3 = this.f20726g;
                if (view3 != null) {
                    view3.setVisibility(0);
                    return;
                }
                return;
            }
            View view4 = this.f20728i;
            if (view4 != null) {
                view4.setVisibility(0);
            }
            View view5 = this.f20726g;
            if (view5 != null) {
                view5.setVisibility(8);
            }
        } else if (this.f20729j > 0) {
            View view6 = this.f20728i;
            if (view6 != null) {
                view6.setVisibility(8);
            }
            View view7 = this.f20726g;
            if (view7 != null) {
                view7.setVisibility(0);
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        C1213t<Integer> tVar;
        Integer value;
        C1213t<Integer> tVar2;
        super.onCreate();
        this.f20725f = (TextView) findViewById(R.id.qc);
        this.f20728i = findViewById(R.id.csq);
        this.f20726g = findViewById(R.id.df_);
        this.f20727h = findViewById(R.id.cma);
        this.f20730k = findViewById(R.id.dfc);
        LiveGiftDialogViewModel liveGiftDialogViewModel = this.f20721b;
        Integer num = null;
        if (!(liveGiftDialogViewModel == null || (tVar2 = liveGiftDialogViewModel.f20705a) == null)) {
            num = tVar2.getValue();
        }
        if (num != null) {
            LiveGiftDialogViewModel liveGiftDialogViewModel2 = this.f20721b;
            if (liveGiftDialogViewModel2 == null || (tVar = liveGiftDialogViewModel2.f20705a) == null || (value = tVar.getValue()) == null || value.intValue() != 5) {
                m16599c();
            } else {
                if (this.f20722c != null) {
                    View view = this.f20727h;
                    if (view != null) {
                        view.setVisibility(0);
                    }
                } else {
                    View view2 = this.f20727h;
                    if (view2 != null) {
                        view2.setVisibility(8);
                    }
                }
                View view3 = this.f20726g;
                if (view3 != null) {
                    view3.setVisibility(8);
                }
            }
            View view4 = this.f20728i;
            if (view4 != null) {
                view4.setOnClickListener(new View$OnClickListenerC8379b(this));
            }
            View view5 = this.f20726g;
            if (view5 != null) {
                view5.setOnClickListener(new View$OnClickListenerC8380c(this));
            }
            View view6 = this.f20727h;
            if (view6 != null) {
                view6.setOnClickListener(new View$OnClickListenerC8381d(this));
            }
            LiveTextView liveTextView = (LiveTextView) findViewById(R.id.dfe);
            LiveTextView liveTextView2 = (LiveTextView) findViewById(R.id.a7s);
            C89219l.m154716b(liveTextView, "");
            liveTextView.setTypeface(C17301b.m32033a().mo27611a(C17303d.f41573g));
            C89219l.m154716b(liveTextView2, "");
            liveTextView2.setTypeface(C17301b.m32033a().mo27611a(C17303d.f41573g));
            ImageView imageView = (ImageView) findViewById(R.id.l3);
            ImageView imageView2 = (ImageView) findViewById(R.id.l4);
            ImageView imageView3 = (ImageView) findViewById(R.id.l5);
            if (C3966y.m9672g()) {
                C89219l.m154716b(imageView, "");
                imageView.setBackground(C3966y.m9665c(2131234716));
                C89219l.m154716b(imageView2, "");
                imageView2.setBackground(C3966y.m9665c(2131234716));
                C89219l.m154716b(imageView3, "");
                imageView3.setBackground(C3966y.m9665c(2131234716));
            }
        }
        AbstractC6332d walletCenter = ((IWalletService) C6193a.m13435a(IWalletService.class)).walletCenter();
        C89219l.m154716b(walletCenter, "");
        mo14702a(walletCenter.mo12373b());
        ((AbstractC11181z) ((IWalletService) C6193a.m13435a(IWalletService.class)).walletCenter().mo12364a().mo143274a(WidgetExtendsKt.autoDispose(this))).mo17950a(new C8382e(this), new C8383f(this));
        this.f20720a = (RecyclerView) findViewById(R.id.cs3);
        getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.mo4356b(0);
        RecyclerView recyclerView = this.f20720a;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(linearLayoutManager);
        }
        C8406a aVar = new C8406a();
        this.f20724e = aVar;
        aVar.f20785a = this.f20721b;
        C8406a aVar2 = this.f20724e;
        if (aVar2 != null) {
            aVar2.f20786b = this;
        }
        C8406a aVar3 = this.f20724e;
        if (aVar3 != null) {
            DataChannel dataChannel = this.dataChannel;
            C89219l.m154716b(dataChannel, "");
            C89219l.m154721d(dataChannel, "");
            aVar3.f20789e = dataChannel;
        }
        RecyclerView recyclerView2 = this.f20720a;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.f20724e);
        }
        mo14701a();
    }

    /* renamed from: com.bytedance.android.livesdk.dialogv2.widget.LiveGiftBottomWidget$g */
    public static final class C8384g extends C24202c<Object> {

        /* renamed from: a */
        final /* synthetic */ LiveGiftBottomWidget f20738a;

        /* renamed from: b */
        final /* synthetic */ int f20739b;

        static {
            Covode.recordClassIndex(9224);
        }

        /* renamed from: com.bytedance.android.livesdk.dialogv2.widget.LiveGiftBottomWidget$g$a */
        public static final class C8385a extends C24296c {

            /* renamed from: a */
            final /* synthetic */ C8384g f20740a;

            static {
                Covode.recordClassIndex(9225);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C8385a(C8384g gVar) {
                this.f20740a = gVar;
            }

            @Override // com.facebook.fresco.animation.p1867c.AbstractC24295b, com.facebook.fresco.animation.p1867c.C24296c
            /* renamed from: b */
            public final void mo9285b(C24290a aVar) {
                C89219l.m154721d(aVar, "");
                LiveGiftBottomWidget liveGiftBottomWidget = this.f20740a.f20738a;
                String concat = "+".concat(String.valueOf(this.f20740a.f20739b));
                TextView textView = (TextView) liveGiftBottomWidget.findViewById(R.id.gi);
                C89219l.m154716b(textView, "");
                textView.setText(concat);
                textView.setVisibility(0);
                ObjectAnimator duration = ObjectAnimator.ofFloat(textView, "alpha", 0.0f, 1.0f).setDuration(400L);
                C89219l.m154716b(duration, "");
                ObjectAnimator duration2 = ObjectAnimator.ofFloat(textView, "alpha", 1.0f, 0.0f).setDuration(350L);
                C89219l.m154716b(duration2, "");
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.play(duration);
                animatorSet.play(duration2).after(700);
                ObjectAnimator duration3 = ObjectAnimator.ofFloat(textView, "translationY", 0.0f, -35.0f).setDuration(300L);
                C89219l.m154716b(duration3, "");
                ObjectAnimator duration4 = ObjectAnimator.ofFloat(textView, "translationY", -35.0f, -40.0f).setDuration(700L);
                C89219l.m154716b(duration4, "");
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.play(duration3);
                animatorSet2.play(duration4).after(300);
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.playTogether(animatorSet, animatorSet2);
                animatorSet3.start();
            }
        }

        public C8384g(LiveGiftBottomWidget liveGiftBottomWidget, int i) {
            this.f20738a = liveGiftBottomWidget;
            this.f20739b = i;
        }

        @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
        public final void onFinalImageSet(String str, Object obj, Animatable animatable) {
            C89219l.m154721d(str, "");
            if (animatable instanceof C24290a) {
                ((C24290a) animatable).mo40070a(new C8385a(this));
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.dialogv2.widget.LiveGiftBottomWidget$b */
    static final class View$OnClickListenerC8379b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LiveGiftBottomWidget f20733a;

        static {
            Covode.recordClassIndex(9219);
        }

        View$OnClickListenerC8379b(LiveGiftBottomWidget liveGiftBottomWidget) {
            this.f20733a = liveGiftBottomWidget;
        }

        public final void onClick(View view) {
            this.f20733a.mo14704b();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.dialogv2.widget.LiveGiftBottomWidget$c */
    static final class View$OnClickListenerC8380c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LiveGiftBottomWidget f20734a;

        static {
            Covode.recordClassIndex(9220);
        }

        View$OnClickListenerC8380c(LiveGiftBottomWidget liveGiftBottomWidget) {
            this.f20734a = liveGiftBottomWidget;
        }

        public final void onClick(View view) {
            this.f20734a.mo14704b();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.dialogv2.widget.LiveGiftBottomWidget$e */
    static final class C8382e<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ LiveGiftBottomWidget f20736a;

        static {
            Covode.recordClassIndex(9222);
        }

        C8382e(LiveGiftBottomWidget liveGiftBottomWidget) {
            this.f20736a = liveGiftBottomWidget;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            LiveGiftBottomWidget liveGiftBottomWidget = this.f20736a;
            if (liveGiftBottomWidget.isViewValid()) {
                AbstractC6332d walletCenter = ((IWalletService) C6193a.m13435a(IWalletService.class)).walletCenter();
                C89219l.m154716b(walletCenter, "");
                liveGiftBottomWidget.mo14702a(walletCenter.mo12373b());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo14702a(long j) {
        String str;
        TextView textView = this.f20725f;
        if (textView != null) {
            AbstractC6872f b = C11115u.m19743a().mo17915b();
            C89219l.m154716b(b, "");
            if (b.mo13165e()) {
                str = m16598b(j);
            } else {
                str = "0";
            }
            textView.setText(str);
        }
        this.f20729j = j;
        m16599c();
    }

    /* renamed from: b */
    private static String m16598b(long j) {
        if (10000 <= j && 999999 >= j) {
            double d = (double) j;
            Double.isNaN(d);
            StringBuilder sb = new StringBuilder();
            String a = C1764a.m5929a(Locale.getDefault(), "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(d / 1000.0d)}, 1));
            C89219l.m154716b(a, "");
            return sb.append(a).append("K").toString();
        } else if (j >= 1000000) {
            double d2 = (double) j;
            Double.isNaN(d2);
            StringBuilder sb2 = new StringBuilder();
            String a2 = C1764a.m5929a(Locale.getDefault(), "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(d2 / 1000000.0d)}, 1));
            C89219l.m154716b(a2, "");
            return sb2.append(a2).append("M").toString();
        } else if (j < 1000) {
            return String.valueOf(j);
        } else {
            String stringBuffer = new StringBuffer(String.valueOf(j)).insert(1, ',').toString();
            C89219l.m154716b(stringBuffer, "");
            return stringBuffer;
        }
    }

    @Override // com.bytedance.android.livesdk.dialogv2.widget.C8406a.AbstractC8407a
    /* renamed from: a */
    public final void mo14703a(boolean z) {
        View view;
        if (z) {
            View view2 = this.f20727h;
            if (view2 != null) {
                view2.setVisibility(8);
            }
            m16599c();
            return;
        }
        View view3 = this.f20726g;
        if (view3 != null) {
            view3.setVisibility(8);
        }
        View view4 = this.f20728i;
        if (view4 != null) {
            view4.setVisibility(8);
        }
        if (this.f20722c != null && (view = this.f20727h) != null) {
            view.setVisibility(0);
        }
    }
}
