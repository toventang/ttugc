package com.p2082ss.android.ugc.aweme.comment.gift;

import android.os.Handler;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.C0277d;
import androidx.core.content.C0643b;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1214u;
import com.C1764a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.DmtButton;
import com.bytedance.ies.dmt.p1194ui.widget.DmtLoadingLayout;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.tux.input.TuxTextView;
import com.google.android.material.tabs.TabLayout;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.comment.gift.model.GiftPage;
import com.p2082ss.android.ugc.aweme.comment.gift.model.GiftResponse;
import com.p2082ss.android.ugc.aweme.comment.gift.model.GiftResult;
import com.p2082ss.android.ugc.aweme.comment.gift.model.GiftStruct;
import com.p2082ss.android.ugc.aweme.comment.gift.model.GiftViewModel;
import com.p2082ss.android.ugc.aweme.comment.p2490d.C36409f;
import com.p2082ss.android.ugc.aweme.comment.util.AbstractC37189c;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.setting.services.IVideoGiftService;
import com.p2082ss.android.ugc.aweme.setting.services.VideoGiftService;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.comment.gift.b */
public final class C36434b {

    /* renamed from: j */
    public static final C36436a f86126j = new C36436a((byte) 0);

    /* renamed from: a */
    public String f86127a = "Classic";

    /* renamed from: b */
    public View f86128b;

    /* renamed from: c */
    public final C36458f f86129c;

    /* renamed from: d */
    public final ActivityC0945e f86130d;

    /* renamed from: e */
    public final GiftViewModel f86131e;

    /* renamed from: f */
    public final AbstractC37189c f86132f;

    /* renamed from: g */
    public final String f86133g;

    /* renamed from: h */
    public final String f86134h;

    /* renamed from: i */
    public final String f86135i;

    /* renamed from: k */
    private final String f86136k;

    /* renamed from: l */
    private final String f86137l;

    /* renamed from: m */
    private final Fragment f86138m;

    /* renamed from: n */
    private final ViewGroup f86139n;

    static {
        Covode.recordClassIndex(43732);
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.gift.b$a */
    public static final class C36436a {
        static {
            Covode.recordClassIndex(43734);
        }

        private C36436a() {
        }

        public /* synthetic */ C36436a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.gift.b$b */
    static final class RunnableC36437b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C36434b f86141a;

        static {
            Covode.recordClassIndex(43735);
        }

        RunnableC36437b(C36434b bVar) {
            this.f86141a = bVar;
        }

        public final void run() {
            ActivityC0945e eVar = this.f86141a.f86130d;
            C89219l.m154721d(eVar, "");
            DialogC36450d dVar = new DialogC36450d(eVar);
            Window window = dVar.getWindow();
            if (window != null) {
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.gravity = 17;
                attributes.flags = attributes.flags | 2 | 32 | 262144;
                window.setAttributes(attributes);
                window.setBackgroundDrawableResource(R.drawable.lu);
            }
            dVar.show();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.gift.b$d */
    public static final class C36439d implements TabLayout.AbstractC26717c {

        /* renamed from: a */
        final /* synthetic */ C36434b f86143a;

        static {
            Covode.recordClassIndex(43737);
        }

        @Override // com.google.android.material.tabs.TabLayout.AbstractC26716b
        /* renamed from: b */
        public final void mo9937b(TabLayout.C26722f fVar) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C36439d(C36434b bVar) {
            this.f86143a = bVar;
        }

        @Override // com.google.android.material.tabs.TabLayout.AbstractC26716b
        /* renamed from: a */
        public final void mo9936a(TabLayout.C26722f fVar) {
            CharSequence charSequence;
            String str;
            C36434b bVar = this.f86143a;
            if (fVar != null) {
                charSequence = fVar.f63309c;
            } else {
                charSequence = null;
            }
            bVar.f86127a = String.valueOf(charSequence);
            C36434b bVar2 = this.f86143a;
            String str2 = bVar2.f86127a;
            C33744d dVar = new C33744d();
            if (str2 == null || (str = str2.toString()) == null) {
                str = "";
            }
            C33744d a = dVar.mo59983a("to_gift_tab", str).mo59983a("enter_from", bVar2.f86133g).mo59983a("group_id", bVar2.f86134h).mo59983a("author_id", bVar2.f86135i);
            C89219l.m154716b(a, "");
            C39162r.m79460a("change_gift_tab", a.f79943a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.gift.b$e */
    static final class C36440e<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ GiftChooseViewPager f86144a;

        static {
            Covode.recordClassIndex(43738);
        }

        C36440e(GiftChooseViewPager giftChooseViewPager) {
            this.f86144a = giftChooseViewPager;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (num != null) {
                this.f86144a.setCurrentItem(num.intValue());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.gift.b$c */
    static final class View$OnClickListenerC36438c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C36434b f86142a;

        static {
            Covode.recordClassIndex(43736);
        }

        View$OnClickListenerC36438c(C36434b bVar) {
            this.f86142a = bVar;
        }

        public final void onClick(View view) {
            DmtStatusView dmtStatusView;
            ClickAgent.onClick(view);
            View view2 = this.f86142a.f86128b;
            if (!(view2 == null || (dmtStatusView = (DmtStatusView) view2.findViewById(R.id.e7i)) == null)) {
                dmtStatusView.mo27384f();
            }
            this.f86142a.f86131e.mo63844e();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.gift.b$j */
    static final class View$OnClickListenerC36445j implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C36434b f86155a;

        static {
            Covode.recordClassIndex(43743);
        }

        View$OnClickListenerC36445j(C36434b bVar) {
            this.f86155a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f86155a.mo63771a("click_recharge");
            this.f86155a.f86129c.mo63786a("video_gift_panel_recharge_clicked");
        }
    }

    /* renamed from: a */
    public final void mo63771a(String str) {
        C33744d a = new C33744d().mo59983a("enter_method", str).mo59983a("enter_from", this.f86133g).mo59983a("group_id", this.f86134h).mo59983a("author_id", this.f86135i).mo59982a("current_balance", this.f86131e.mo63843d().getValue());
        C89219l.m154716b(a, "");
        C39162r.m79460a("enter_coin_recharge", a.f79943a);
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.gift.b$g */
    static final class C36442g<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C36434b f86148a;

        /* renamed from: b */
        final /* synthetic */ DmtButton f86149b;

        static {
            Covode.recordClassIndex(43740);
        }

        C36442g(C36434b bVar, DmtButton dmtButton) {
            this.f86148a = bVar;
            this.f86149b = dmtButton;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            GiftStruct giftStruct = (GiftStruct) obj;
            if (giftStruct != null) {
                long diamondCount = (long) giftStruct.getDiamondCount();
                Long value = this.f86148a.f86131e.mo63843d().getValue();
                if (value == null) {
                    value = -1L;
                }
                C89219l.m154716b(value, "");
                if (diamondCount <= value.longValue()) {
                    this.f86149b.setEnabled(true);
                    this.f86149b.setBackgroundResource(R.drawable.n0);
                    this.f86149b.setTextColor(C0643b.m2378c(this.f86148a.f86130d, R.color.a9));
                    return;
                }
            }
            this.f86149b.setEnabled(false);
            this.f86149b.setBackgroundResource(R.drawable.n1);
            this.f86149b.setTextColor(C0643b.m2378c(this.f86148a.f86130d, R.color.bz));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.gift.b$i */
    static final class View$OnClickListenerC36444i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C36434b f86154a;

        static {
            Covode.recordClassIndex(43742);
        }

        View$OnClickListenerC36444i(C36434b bVar) {
            this.f86154a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f86154a.f86132f.mo64623a();
            C33744d a = new C33744d().mo59983a("enter_method", "gift_dialog").mo59983a("enter_from", this.f86154a.f86133g).mo59983a("group_id", this.f86154a.f86134h).mo59983a("author_id", this.f86154a.f86135i);
            Long value = this.f86154a.f86131e.mo63843d().getValue();
            if (value == null) {
                value = -1L;
            }
            C89219l.m154716b(value, "");
            C39162r.m79460a("video_gift_send_click", a.mo59981a("current_balance", value.longValue()).f79943a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.gift.b$f */
    static final class C36441f<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C36434b f86145a;

        /* renamed from: b */
        final /* synthetic */ GiftChooseViewPager f86146b;

        /* renamed from: c */
        final /* synthetic */ DmtLoadingLayout f86147c;

        static {
            Covode.recordClassIndex(43739);
        }

        C36441f(C36434b bVar, GiftChooseViewPager giftChooseViewPager, DmtLoadingLayout dmtLoadingLayout) {
            this.f86145a = bVar;
            this.f86146b = giftChooseViewPager;
            this.f86147c = dmtLoadingLayout;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            GiftResult giftPageList;
            List<GiftPage> giftPageList2;
            LinearLayout linearLayout;
            DmtStatusView dmtStatusView;
            DmtStatusView dmtStatusView2;
            LinearLayout linearLayout2;
            if (obj == null) {
                View view = this.f86145a.f86128b;
                if (!(view == null || (linearLayout2 = (LinearLayout) view.findViewById(R.id.bad)) == null)) {
                    linearLayout2.setVisibility(8);
                }
                View view2 = this.f86145a.f86128b;
                if (view2 != null && (dmtStatusView2 = (DmtStatusView) view2.findViewById(R.id.e7i)) != null) {
                    dmtStatusView2.mo27387h();
                    return;
                }
                return;
            }
            View view3 = this.f86145a.f86128b;
            if (!(view3 == null || (dmtStatusView = (DmtStatusView) view3.findViewById(R.id.e7i)) == null)) {
                dmtStatusView.setVisibility(8);
            }
            View view4 = this.f86145a.f86128b;
            if (!(view4 == null || (linearLayout = (LinearLayout) view4.findViewById(R.id.bad)) == null)) {
                linearLayout.setVisibility(0);
            }
            GiftResponse value = this.f86145a.f86131e.mo63835a().getValue();
            if (value == null || (giftPageList = value.getGiftPageList()) == null || (giftPageList2 = giftPageList.getGiftPageList()) == null || !(!giftPageList2.isEmpty())) {
                this.f86146b.setVisibility(8);
                this.f86147c.setVisibility(0);
                return;
            }
            this.f86146b.setVisibility(0);
            this.f86147c.setVisibility(8);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.gift.b$h */
    static final class C36443h<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C36434b f86150a;

        /* renamed from: b */
        final /* synthetic */ DmtButton f86151b;

        /* renamed from: c */
        final /* synthetic */ DmtLoadingLayout f86152c;

        /* renamed from: d */
        final /* synthetic */ TextView f86153d;

        static {
            Covode.recordClassIndex(43741);
        }

        C36443h(C36434b bVar, DmtButton dmtButton, DmtLoadingLayout dmtLoadingLayout, TextView textView) {
            this.f86150a = bVar;
            this.f86151b = dmtButton;
            this.f86152c = dmtLoadingLayout;
            this.f86153d = textView;
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x005f  */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x0096  */
        @Override // androidx.lifecycle.AbstractC1214u
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void onChanged(java.lang.Object r9) {
            /*
            // Method dump skipped, instructions count: 161
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.comment.gift.C36434b.C36443h.onChanged(java.lang.Object):void");
        }
    }

    public C36434b(Fragment fragment, ViewGroup viewGroup, ActivityC0945e eVar, GiftViewModel giftViewModel, AbstractC37189c cVar, String str, String str2, String str3) {
        TabLayout tabLayout;
        GiftChooseViewPager giftChooseViewPager;
        DmtLoadingLayout dmtLoadingLayout;
        DmtLoadingLayout dmtLoadingLayout2;
        TextView textView;
        DmtButton dmtButton;
        TextView textView2;
        DmtStatusView dmtStatusView;
        C89219l.m154721d(fragment, "");
        C89219l.m154721d(viewGroup, "");
        ActivityC0945e eVar2 = eVar;
        C89219l.m154721d(eVar2, "");
        C89219l.m154721d(giftViewModel, "");
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        this.f86138m = fragment;
        this.f86139n = viewGroup;
        this.f86130d = eVar2;
        this.f86131e = giftViewModel;
        this.f86132f = cVar;
        this.f86133g = str;
        this.f86134h = str2;
        this.f86135i = str3;
        this.f86129c = new C36458f(fragment, eVar2, giftViewModel, str, str2, str3);
        this.f86136k = "GIFT_INFO_REPO";
        this.f86137l = "IS_PRIVACY_PROMOTION_SHOWN";
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.ij, viewGroup, false);
        this.f86128b = a;
        if (a != null) {
            tabLayout = (TabLayout) a.findViewById(R.id.bar);
        } else {
            tabLayout = null;
        }
        Objects.requireNonNull(tabLayout, "null cannot be cast to non-null type com.google.android.material.tabs.TabLayout");
        View view = this.f86128b;
        if (view != null) {
            giftChooseViewPager = (GiftChooseViewPager) view.findViewById(R.id.bas);
        } else {
            giftChooseViewPager = null;
        }
        Objects.requireNonNull(giftChooseViewPager, "null cannot be cast to non-null type com.ss.android.ugc.aweme.comment.gift.GiftChooseViewPager");
        View view2 = this.f86128b;
        if (view2 != null) {
            dmtLoadingLayout = (DmtLoadingLayout) view2.findViewById(R.id.baf);
        } else {
            dmtLoadingLayout = null;
        }
        Objects.requireNonNull(dmtLoadingLayout, "null cannot be cast to non-null type com.bytedance.ies.dmt.ui.widget.DmtLoadingLayout");
        View view3 = this.f86128b;
        if (view3 != null) {
            dmtLoadingLayout2 = (DmtLoadingLayout) view3.findViewById(R.id.a7f);
        } else {
            dmtLoadingLayout2 = null;
        }
        Objects.requireNonNull(dmtLoadingLayout2, "null cannot be cast to non-null type com.bytedance.ies.dmt.ui.widget.DmtLoadingLayout");
        View view4 = this.f86128b;
        if (view4 != null) {
            textView = (TextView) view4.findViewById(R.id.a7d);
        } else {
            textView = null;
        }
        Objects.requireNonNull(textView, "null cannot be cast to non-null type android.widget.TextView");
        View view5 = this.f86128b;
        if (!(view5 == null || (dmtStatusView = (DmtStatusView) view5.findViewById(R.id.e7i)) == null)) {
            TuxTextView tuxTextView = new TuxTextView(new C0277d(dmtStatusView.getContext(), R.style.w9), null, 0, 6);
            String a2 = C3966y.m9657a((int) R.string.h8p);
            if (a2 == null) {
                C89219l.m154715b();
            }
            String a3 = C3966y.m9657a((int) R.string.h8q);
            if (a3 == null) {
                C89219l.m154715b();
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C89361p.m154854b("\n                  " + a2 + "\n                  " + a3 + "\n                  "));
            int length = a2.length() + 1 + a3.length();
            spannableStringBuilder.setSpan(new ForegroundColorSpan(C0643b.m2378c(eVar2, R.color.c5)), 0, a2.length(), 17);
            eVar2 = eVar2;
            spannableStringBuilder.setSpan(new ForegroundColorSpan(C0643b.m2378c(eVar2, R.color.bh)), a2.length(), length, 17);
            tuxTextView.setText(spannableStringBuilder);
            tuxTextView.setMovementMethod(LinkMovementMethod.getInstance());
            tuxTextView.setOnClickListener(new View$OnClickListenerC36438c(this));
            DmtStatusView.C17269a c = DmtStatusView.C17269a.m31905a(dmtStatusView.getContext()).mo27408c(tuxTextView);
            c.f41304g = 0;
            dmtStatusView.setBuilder(c);
        }
        giftChooseViewPager.setScrollable(true);
        giftChooseViewPager.setAdapter(new C36446c(fragment, eVar2, giftViewModel, str, str2, str3));
        Objects.requireNonNull(giftChooseViewPager, "null cannot be cast to non-null type androidx.viewpager.widget.ViewPager");
        tabLayout.setupWithViewPager(giftChooseViewPager);
        tabLayout.addOnTabSelectedListener(new C36439d(this));
        giftViewModel.f86232g.observe(eVar2, new C36440e(giftChooseViewPager));
        giftViewModel.mo63835a().observe(eVar2, new C36441f(this, giftChooseViewPager, dmtLoadingLayout));
        View view6 = this.f86128b;
        if (view6 != null) {
            dmtButton = (DmtButton) view6.findViewById(R.id.dvi);
        } else {
            dmtButton = null;
        }
        Objects.requireNonNull(dmtButton, "null cannot be cast to non-null type com.bytedance.ies.dmt.ui.widget.DmtButton");
        giftViewModel.mo63841b().observe(eVar2, new C36442g(this, dmtButton));
        giftViewModel.mo63843d().observe(eVar2, new C36443h(this, dmtButton, dmtLoadingLayout2, textView));
        dmtButton.setOnClickListener(new View$OnClickListenerC36444i(this));
        View view7 = this.f86128b;
        if (view7 != null) {
            textView2 = (TextView) view7.findViewById(R.id.dfb);
        } else {
            textView2 = null;
        }
        Objects.requireNonNull(textView2, "null cannot be cast to non-null type android.widget.TextView");
        textView2.setOnClickListener(new View$OnClickListenerC36445j(this));
        giftViewModel.mo63839a("", eVar2, 0, 0);
        IVideoGiftService l = VideoGiftService.m120814l();
        if (!l.mo108912j() && C36409f.m74109a()) {
            new Handler(Looper.getMainLooper()).post(new RunnableC36437b(this));
            l.mo108913k();
            C39162r.m79460a("show_gift_list_interstitial", new C33744d().mo59983a("enter_from", str).mo59983a("enter_method", "show_gifters_list_gift").mo59983a("group_id", str2).mo59983a("author_id", str3).f79943a);
        }
        giftViewModel.mo63841b().observe(eVar2, new AbstractC1214u(this) {
            /* class com.p2082ss.android.ugc.aweme.comment.gift.C36434b.C364351 */

            /* renamed from: a */
            final /* synthetic */ C36434b f86140a;

            static {
                Covode.recordClassIndex(43733);
            }

            {
                this.f86140a = r1;
            }

            @Override // androidx.lifecycle.AbstractC1214u
            public final /* synthetic */ void onChanged(Object obj) {
                GiftStruct giftStruct = (GiftStruct) obj;
                if (giftStruct != null) {
                    Long value = this.f86140a.f86131e.mo63843d().getValue();
                    if (value == null) {
                        value = -1L;
                    }
                    if (value.longValue() >= 0) {
                        long diamondCount = (long) giftStruct.getDiamondCount();
                        Long value2 = this.f86140a.f86131e.mo63843d().getValue();
                        if (value2 == null) {
                            value2 = -1L;
                        }
                        C89219l.m154716b(value2, "");
                        if (diamondCount > value2.longValue()) {
                            this.f86140a.mo63771a("select_gift");
                            this.f86140a.f86129c.mo63786a("video_gift_select_insufficient_balance");
                        }
                    }
                }
            }
        });
    }
}
