package com.bytedance.android.livesdk.dialogv2.widget;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1213t;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.C4139e;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.C8312d;
import com.bytedance.android.livesdk.dialogv2.p515a.C8332a;
import com.bytedance.android.livesdk.dialogv2.p515a.C8337b;
import com.bytedance.android.livesdk.dialogv2.p516b.C8346b;
import com.bytedance.android.livesdk.dialogv2.p516b.C8347c;
import com.bytedance.android.livesdk.dialogv2.p516b.C8349e;
import com.bytedance.android.livesdk.dialogv2.viewmodel.C8374a;
import com.bytedance.android.livesdk.dialogv2.viewmodel.LiveGiftDialogViewModel;
import com.bytedance.android.livesdk.firstrecharge.C8729d;
import com.bytedance.android.livesdk.firstrecharge.C8740e;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.gift.model.p553a.AbstractC8812b;
import com.bytedance.android.livesdk.model.C9543b;
import com.bytedance.android.livesdk.model.C9904t;
import com.bytedance.android.livesdk.olddialog.viewmodel.GiftDialogViewModel;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p561j.C9076co;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.p561j.C9119ed;
import com.bytedance.android.livesdk.p640t.C10890a;
import com.bytedance.android.livesdk.performance.C10095g;
import com.bytedance.android.livesdk.service.C10630a;
import com.bytedance.android.livesdk.service.C10695b;
import com.bytedance.android.livesdk.service.C10702c;
import com.bytedance.android.livesdk.service.assets.GiftManager;
import com.bytedance.android.livesdk.service.p621a.C10631a;
import com.bytedance.android.livesdk.service.p621a.C10635b;
import com.bytedance.android.livesdk.service.p621a.C10639c;
import com.bytedance.android.livesdk.service.p625c.p626a.C10703a;
import com.bytedance.android.livesdk.service.p625c.p626a.C10711d;
import com.bytedance.android.livesdk.service.p625c.p626a.C10715e;
import com.bytedance.android.livesdk.service.p625c.p628c.C10725a;
import com.bytedance.android.livesdk.service.p625c.p628c.C10731d;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdk.utils.p653a.C11200a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4601a.C89037ac;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

public final class LiveGiftPanelWidget extends LiveWidget implements C8332a.AbstractC8333a, AbstractC33974au {

    /* renamed from: a */
    public RecyclerView f20757a;

    /* renamed from: b */
    public C8332a f20758b;

    /* renamed from: c */
    public ArrayList<GiftPage> f20759c = new ArrayList<>();

    /* renamed from: d */
    public boolean f20760d;

    /* renamed from: e */
    public int f20761e = 1;

    /* renamed from: f */
    public final LiveGiftDialogViewModel f20762f;

    /* renamed from: g */
    private LiveTextView f20763g;

    /* renamed from: h */
    private LinkedList<AbstractC8812b<? extends C9543b>> f20764h;

    /* renamed from: i */
    private final C88411a f20765i = new C88411a();

    /* renamed from: j */
    private Room f20766j;

    /* renamed from: k */
    private boolean f20767k;

    /* renamed from: l */
    private boolean f20768l = true;

    /* renamed from: m */
    private final LinkedList<Integer> f20769m = new LinkedList<>();

    /* renamed from: n */
    private final LinkedList<Long> f20770n = new LinkedList<>();

    /* renamed from: o */
    private final Map<Long, Integer> f20771o = new LinkedHashMap();

    /* renamed from: p */
    private boolean f20772p = true;

    static {
        Covode.recordClassIndex(9238);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bg2;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.dialogv2.widget.LiveGiftPanelWidget$d */
    public static final class RunnableC8399d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ LiveGiftPanelWidget f20777a;

        static {
            Covode.recordClassIndex(9242);
        }

        RunnableC8399d(LiveGiftPanelWidget liveGiftPanelWidget) {
            this.f20777a = liveGiftPanelWidget;
        }

        public final void run() {
            this.f20777a.mo14720b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.dialogv2.widget.LiveGiftPanelWidget$e */
    public static final class RunnableC8400e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ LiveGiftPanelWidget f20778a;

        /* renamed from: b */
        final /* synthetic */ int f20779b;

        static {
            Covode.recordClassIndex(9243);
        }

        RunnableC8400e(LiveGiftPanelWidget liveGiftPanelWidget, int i) {
            this.f20778a = liveGiftPanelWidget;
            this.f20779b = i;
        }

        public final void run() {
            RecyclerView recyclerView = this.f20778a.f20757a;
            if (recyclerView != null) {
                recyclerView.mo4413b(this.f20779b);
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        C1213t<Integer> tVar;
        super.onDestroy();
        this.f20765i.mo142944a();
        C8332a aVar = this.f20758b;
        if (aVar != null) {
            aVar.f20623b.mo142944a();
        }
        LiveGiftDialogViewModel liveGiftDialogViewModel = this.f20762f;
        if (liveGiftDialogViewModel != null && (tVar = liveGiftDialogViewModel.f20705a) != null) {
            tVar.removeObservers(this);
        }
    }

    /* renamed from: c */
    private final void m16606c() {
        Iterator<GiftPage> it = this.f20759c.iterator();
        while (it.hasNext()) {
            GiftPage next = it.next();
            if (C8374a.C8375a.C8376a.f20718a.f20709c == GiftDialogViewModel.EnumC10040b.GUEST) {
                GiftManager.filterInteractNotSupportGift(next.gifts, this.f20767k);
            } else {
                GiftManager.filterNotSupportGift(next.gifts, this.f20767k);
            }
            GiftManager.filterNotDisplayedOnPanel(next.gifts);
            GiftManager.filterFirstAndCallbackGifts(next.gifts);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.dialogv2.widget.LiveGiftPanelWidget$a */
    public static final class RunnableC8396a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ LiveGiftPanelWidget f20773a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89237d f20774b;

        static {
            Covode.recordClassIndex(9239);
        }

        RunnableC8396a(LiveGiftPanelWidget liveGiftPanelWidget, C89233z.C89237d dVar) {
            this.f20773a = liveGiftPanelWidget;
            this.f20774b = dVar;
        }

        public final void run() {
            int i;
            this.f20773a.mo14720b();
            boolean z = C10631a.C10632a.C10633a.f25635a.f25634a;
            long j = C8374a.C8375a.C8376a.f20718a.f20712f;
            boolean f = C3966y.m9670f();
            int i2 = C8374a.C8375a.C8376a.f20718a.f20713g;
            String tabName = GiftManager.inst().getTabName(C8374a.C8375a.C8376a.f20718a.f20713g);
            int a = this.f20773a.mo14670a(Long.valueOf(C8374a.C8375a.C8376a.f20718a.f20712f));
            C9904t findGiftById = GiftManager.inst().findGiftById(this.f20774b.element);
            if (findGiftById != null) {
                i = findGiftById.f24001f;
            } else {
                i = 0;
            }
            C10715e.m19282a(z, j, f, i2, tabName, a, Integer.valueOf(i));
        }
    }

    /* renamed from: a */
    public final void mo14717a() {
        int i;
        C1213t<Integer> tVar;
        Integer value;
        this.f20759c.clear();
        ArrayList arrayList = new ArrayList(5);
        C27910f fVar = C4139e.C4140a.f11576c;
        GiftManager inst = GiftManager.inst();
        C89219l.m154716b(inst, "");
        for (GiftPage giftPage : inst.getGiftPageList()) {
            Object a = fVar.mo46670a(fVar.mo46674b(giftPage), GiftPage.class);
            C89219l.m154716b(a, "");
            arrayList.add(a);
        }
        LiveGiftDialogViewModel liveGiftDialogViewModel = this.f20762f;
        if (liveGiftDialogViewModel == null || (tVar = liveGiftDialogViewModel.f20705a) == null || (value = tVar.getValue()) == null) {
            i = 1;
        } else {
            i = value.intValue();
        }
        this.f20761e = i;
        C8374a.C8375a.C8376a.f20718a.f20716j = this.f20761e;
        this.f20759c.clear();
        this.f20759c.addAll(arrayList);
        m16606c();
        mo14719a(this.f20759c);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        Room room;
        boolean z;
        boolean z2;
        C1213t<Integer> tVar;
        Boolean bool;
        Boolean bool2;
        super.onCreate();
        C10725a.C10726a.C10727a.f25846a.mo17647a();
        if (C8729d.f21542u.mo15010e() || (!C8729d.f21542u.mo15010e() && C8729d.f21542u.mo15009d())) {
            C8740e.m17059a();
        }
        this.f20757a = (RecyclerView) this.contentView.findViewById(R.id.bae);
        LiveTextView liveTextView = (LiveTextView) this.containerView.findViewById(R.id.av8);
        this.f20763g = liveTextView;
        if (liveTextView != null) {
            liveTextView.setVisibility(0);
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            room = (Room) dataChannel.mo28318b(C9093de.class);
        } else {
            room = null;
        }
        this.f20766j = room;
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 == null || (bool2 = (Boolean) dataChannel2.mo28318b(C9119ed.class)) == null) {
            z = false;
        } else {
            z = bool2.booleanValue();
        }
        this.f20767k = z;
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 == null || (bool = (Boolean) dataChannel3.mo28318b(C9076co.class)) == null) {
            z2 = true;
        } else {
            z2 = bool.booleanValue();
        }
        this.f20768l = z2;
        LiveGiftDialogViewModel liveGiftDialogViewModel = this.f20762f;
        if (!(liveGiftDialogViewModel == null || (tVar = liveGiftDialogViewModel.f20705a) == null)) {
            tVar.observe(this, new C8401f(this));
        }
        this.f20765i.mo142945a(C6779a.m14563a().mo13052a(C10695b.class).mo143289d(new C8402g(this)));
        this.f20765i.mo142945a(C6779a.m14563a().mo13052a(C10630a.class).mo143289d(new C8403h(this)));
        this.f20765i.mo142945a(C6779a.m14563a().mo13052a(C10702c.class).mo143289d(new C8404i(this)));
        C8337b bVar = new C8337b(this.dataChannel, this.f20762f);
        this.f20758b = bVar;
        C89219l.m154721d(this, "");
        bVar.f20624c = this;
        RecyclerView recyclerView = this.f20757a;
        if (recyclerView != null) {
            recyclerView.setAdapter(this.f20758b);
        }
        GridLayoutManager gridLayoutManager = new GridLayoutManager(4, 1, false);
        RecyclerView recyclerView2 = this.f20757a;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(gridLayoutManager);
        }
        RecyclerView recyclerView3 = this.f20757a;
        if (recyclerView3 != null) {
            recyclerView3.setClipChildren(false);
        }
        RecyclerView recyclerView4 = this.f20757a;
        if (recyclerView4 != null) {
            C10095g.m18633a(recyclerView4);
        }
        RecyclerView recyclerView5 = this.f20757a;
        if (recyclerView5 != null) {
            recyclerView5.mo4405a(new C8405j(this));
        }
        mo14717a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x008c, code lost:
        if ((r0 instanceof com.bytedance.android.livesdk.dialogv2.p516b.C8348d) != false) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00d0, code lost:
        if ((r0 instanceof com.bytedance.android.livesdk.dialogv2.p516b.C8348d) != false) goto L_0x00d2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x01ee A[LOOP:0: B:12:0x002f->B:125:0x01ee, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x023e A[EDGE_INSN: B:183:0x023e->B:150:0x023e ?: BREAK  , SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14720b() {
        /*
        // Method dump skipped, instructions count: 849
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.dialogv2.widget.LiveGiftPanelWidget.mo14720b():void");
    }

    /* renamed from: com.bytedance.android.livesdk.dialogv2.widget.LiveGiftPanelWidget$j */
    public static final class C8405j extends RecyclerView.AbstractC1371n {

        /* renamed from: a */
        final /* synthetic */ LiveGiftPanelWidget f20784a;

        static {
            Covode.recordClassIndex(9248);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C8405j(LiveGiftPanelWidget liveGiftPanelWidget) {
            this.f20784a = liveGiftPanelWidget;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4753a(RecyclerView recyclerView, int i) {
            RecyclerView.AbstractC1362i iVar;
            RecyclerView.AbstractC1362i iVar2;
            int i2;
            C89219l.m154721d(recyclerView, "");
            super.mo4753a(recyclerView, i);
            this.f20784a.dataChannel.mo28319c(C8312d.class);
            int i3 = 0;
            LinearLayoutManager linearLayoutManager = null;
            if (i == 0) {
                LiveGiftPanelWidget liveGiftPanelWidget = this.f20784a;
                C10703a.C10704a.C10705a.f25783a.mo17630a();
                RecyclerView recyclerView2 = liveGiftPanelWidget.f20757a;
                if (recyclerView2 != null) {
                    iVar2 = recyclerView2.getLayoutManager();
                } else {
                    iVar2 = null;
                }
                if (iVar2 instanceof GridLayoutManager) {
                    linearLayoutManager = iVar2;
                }
                LinearLayoutManager linearLayoutManager2 = (LinearLayoutManager) linearLayoutManager;
                if (linearLayoutManager2 != null) {
                    i2 = linearLayoutManager2.mo4373m();
                } else {
                    i2 = 0;
                }
                C10711d dVar = C10711d.C10712a.C10713a.f25797a;
                int i4 = (i2 / 4) + 1;
                if (dVar.f25795a != -1) {
                    C6501b.C6502a.m13948a("gift_panel_scroll").mo12639a().mo12651a("tab_name", GiftManager.inst().getTabName(C8374a.C8375a.C8376a.f20718a.f20713g)).mo12651a("gift_dialog_request_id", C10639c.f25641a).mo12645a("tab_location", GiftManager.inst().getTabLocation(C8374a.C8375a.C8376a.f20718a.f20716j)).mo12645a("end_row_location", i4).mo12645a("scroll_rows", Math.abs(i4 - dVar.f25795a)).mo12646a("scroll_duration", C11200a.m19851a() - dVar.f25796b).mo12645a("start_row_location", dVar.f25795a).mo12651a("send_gift_scene", C10890a.m19496b().getDesc()).mo12655b();
                    if (dVar.f25795a == i4) {
                        dVar.f25795a = -1;
                        dVar.f25796b = -1;
                        return;
                    }
                    dVar.f25795a = -1;
                    dVar.f25796b = -1;
                }
                C10635b.C10636a.C10637a.f25639a.f25638a = false;
                liveGiftPanelWidget.mo14720b();
                return;
            }
            RecyclerView recyclerView3 = this.f20784a.f20757a;
            if (recyclerView3 != null) {
                iVar = recyclerView3.getLayoutManager();
            } else {
                iVar = null;
            }
            if (iVar instanceof GridLayoutManager) {
                linearLayoutManager = iVar;
            }
            LinearLayoutManager linearLayoutManager3 = linearLayoutManager;
            if (linearLayoutManager3 != null) {
                i3 = linearLayoutManager3.mo4373m();
            }
            C10711d dVar2 = C10711d.C10712a.C10713a.f25797a;
            int i5 = (i3 / 4) + 1;
            if (dVar2.f25795a == -1) {
                dVar2.f25795a = i5;
                dVar2.f25796b = C11200a.m19851a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.dialogv2.widget.LiveGiftPanelWidget$b */
    public static final class C8397b extends AbstractC89220m implements AbstractC89172b<Integer, Boolean> {

        /* renamed from: a */
        public static final C8397b f20775a = new C8397b();

        static {
            Covode.recordClassIndex(9240);
        }

        C8397b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(Integer num) {
            num.intValue();
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.dialogv2.widget.LiveGiftPanelWidget$c */
    public static final class C8398c extends AbstractC89220m implements AbstractC89172b<Long, Boolean> {

        /* renamed from: a */
        public static final C8398c f20776a = new C8398c();

        static {
            Covode.recordClassIndex(9241);
        }

        C8398c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(Long l) {
            l.longValue();
            return true;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.dialogv2.widget.LiveGiftPanelWidget$h */
    static final class C8403h<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ LiveGiftPanelWidget f20782a;

        static {
            Covode.recordClassIndex(9246);
        }

        C8403h(LiveGiftPanelWidget liveGiftPanelWidget) {
            this.f20782a = liveGiftPanelWidget;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            LiveGiftPanelWidget liveGiftPanelWidget = this.f20782a;
            C8332a aVar = liveGiftPanelWidget.f20758b;
            if (aVar != null) {
                aVar.mo14665a();
            }
            liveGiftPanelWidget.f20760d = false;
            liveGiftPanelWidget.mo14719a(liveGiftPanelWidget.f20759c);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.dialogv2.widget.LiveGiftPanelWidget$f */
    static final class C8401f<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ LiveGiftPanelWidget f20780a;

        static {
            Covode.recordClassIndex(9244);
        }

        C8401f(LiveGiftPanelWidget liveGiftPanelWidget) {
            this.f20780a = liveGiftPanelWidget;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            int i = this.f20780a.f20761e;
            if (num == null || i != num.intValue()) {
                LiveGiftPanelWidget liveGiftPanelWidget = this.f20780a;
                C89219l.m154716b(num, "");
                liveGiftPanelWidget.f20761e = num.intValue();
                C8374a.C8375a.C8376a.f20718a.f20716j = this.f20780a.f20761e;
                LiveGiftPanelWidget liveGiftPanelWidget2 = this.f20780a;
                liveGiftPanelWidget2.mo14719a(liveGiftPanelWidget2.f20759c);
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.dialogv2.widget.LiveGiftPanelWidget$g */
    static final class C8402g<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ LiveGiftPanelWidget f20781a;

        static {
            Covode.recordClassIndex(9245);
        }

        C8402g(LiveGiftPanelWidget liveGiftPanelWidget) {
            this.f20781a = liveGiftPanelWidget;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            if (C8729d.f21542u.mo15010e() && C8729d.f21542u.mo15009d()) {
                C8374a.C8375a.C8376a.f20718a.f20713g = 1;
                C8332a aVar = this.f20781a.f20758b;
                if (aVar != null) {
                    aVar.mo14665a();
                }
                this.f20781a.f20760d = false;
                LiveGiftPanelWidget liveGiftPanelWidget = this.f20781a;
                liveGiftPanelWidget.mo14719a(liveGiftPanelWidget.f20759c);
            }
        }
    }

    public LiveGiftPanelWidget(LiveGiftDialogViewModel liveGiftDialogViewModel) {
        this.f20762f = liveGiftDialogViewModel;
    }

    /* renamed from: com.bytedance.android.livesdk.dialogv2.widget.LiveGiftPanelWidget$i */
    static final class C8404i<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ LiveGiftPanelWidget f20783a;

        static {
            Covode.recordClassIndex(9247);
        }

        C8404i(LiveGiftPanelWidget liveGiftPanelWidget) {
            this.f20783a = liveGiftPanelWidget;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C1213t<Integer> tVar;
            C8374a.C8375a.C8376a.f20718a.f20713g = 1;
            LiveGiftDialogViewModel liveGiftDialogViewModel = this.f20783a.f20762f;
            if (!(liveGiftDialogViewModel == null || (tVar = liveGiftDialogViewModel.f20705a) == null)) {
                tVar.setValue(1);
            }
            C8332a aVar = this.f20783a.f20758b;
            if (aVar != null) {
                aVar.mo14665a();
            }
            GiftPage giftPage = this.f20783a.f20759c.get(0);
            C89219l.m154716b(giftPage, "");
            LinkedList<AbstractC8812b<? extends C9543b>> linkedList = new LinkedList<>();
            for (C9904t tVar2 : giftPage.gifts) {
                C89219l.m154716b(tVar2, "");
                if (tVar2.f24000e == 3) {
                    linkedList.addLast(new C8349e(tVar2));
                } else {
                    linkedList.addLast(new C8347c(tVar2));
                }
            }
            C9904t g = C8729d.f21542u.mo15012g();
            if (g != null) {
                linkedList.addFirst(new C8346b(g));
            }
            this.f20783a.mo14718a(linkedList);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0072 A[LOOP:0: B:11:0x001e->B:35:0x0072, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x007e A[EDGE_INSN: B:41:0x007e->B:39:0x007e ?: BREAK  , SYNTHETIC] */
    @Override // com.bytedance.android.livesdk.dialogv2.p515a.C8332a.AbstractC8333a
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo14670a(java.lang.Long r10) {
        /*
        // Method dump skipped, instructions count: 127
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.dialogv2.widget.LiveGiftPanelWidget.mo14670a(java.lang.Long):int");
    }

    /* renamed from: a */
    public final void mo14718a(LinkedList<AbstractC8812b<? extends C9543b>> linkedList) {
        C1213t<Integer> tVar;
        Integer value;
        int a;
        RecyclerView recyclerView;
        long j;
        C1213t<Integer> tVar2;
        Integer value2;
        long j2;
        if (this.f20758b != null) {
            C10731d.C10732a.C10733a.f25859a.mo17660a(linkedList);
            if (linkedList.isEmpty()) {
                LiveTextView liveTextView = this.f20763g;
                if (liveTextView != null) {
                    liveTextView.setVisibility(0);
                }
            } else {
                LiveTextView liveTextView2 = this.f20763g;
                if (liveTextView2 != null) {
                    liveTextView2.setVisibility(8);
                }
            }
            C89233z.C89237d dVar = new C89233z.C89237d();
            dVar.element = C8374a.C8375a.C8376a.f20718a.f20712f;
            if (!this.f20760d) {
                this.f20760d = true;
                C8374a.C8375a.C8376a.f20718a.mo14698a();
                dVar.element = C8374a.C8375a.C8376a.f20718a.f20712f;
                Long l = C8374a.C8375a.C8376a.f20718a.f20707a;
                long j3 = 0;
                if (l != null) {
                    j = l.longValue();
                } else {
                    j = 0;
                }
                if (m16605a(linkedList, dVar.element) == -1 && linkedList.size() > 0) {
                    AbstractC8812b<? extends C9543b> bVar = linkedList.get(0);
                    if (bVar != null) {
                        j2 = bVar.mo14676d();
                    } else {
                        j2 = 0;
                    }
                    dVar.element = j2;
                }
                if (j != 0) {
                    dVar.element = j;
                    if (m16605a(linkedList, dVar.element) == -1) {
                        C11226ao.m19883a(C3966y.m9669e(), "This gift is currently unavailable", 0);
                    }
                }
                LiveGiftDialogViewModel liveGiftDialogViewModel = this.f20762f;
                if (!(liveGiftDialogViewModel == null || (tVar2 = liveGiftDialogViewModel.f20705a) == null || (value2 = tVar2.getValue()) == null || value2.intValue() != 1 || !C8729d.f21542u.mo15009d())) {
                    if (C8729d.f21542u.mo15011f()) {
                        j3 = C8729d.f21542u.mo15013i();
                    }
                    dVar.element = j3;
                }
                C8374a.C8375a.C8376a.f20718a.f20712f = dVar.element;
                if (this.f20772p) {
                    this.f20772p = false;
                    LinkedList<AbstractC8812b<? extends C9543b>> linkedList2 = this.f20764h;
                    if (linkedList2 != null) {
                        C10725a.C10726a.C10727a.f25846a.mo17649a(C8374a.C8375a.C8376a.f20718a.f20713g, linkedList2);
                    }
                    C10635b.C10636a.C10637a.f25639a.f25638a = true;
                    RecyclerView recyclerView2 = this.f20757a;
                    if (recyclerView2 != null) {
                        recyclerView2.postDelayed(new RunnableC8396a(this, dVar), 300);
                    }
                }
            } else {
                LinkedList<AbstractC8812b<? extends C9543b>> linkedList3 = this.f20764h;
                if (linkedList3 != null) {
                    C10725a.C10726a.C10727a.f25846a.mo17649a(C8374a.C8375a.C8376a.f20718a.f20716j, linkedList3);
                }
                C10635b.C10636a.C10637a.f25639a.f25638a = false;
                C89070n.m154537a((List) this.f20769m, (AbstractC89172b) C8397b.f20775a);
                C89070n.m154537a((List) this.f20770n, (AbstractC89172b) C8398c.f20776a);
                RecyclerView recyclerView3 = this.f20757a;
                if (recyclerView3 != null) {
                    recyclerView3.postDelayed(new RunnableC8399d(this), 100);
                }
            }
            C8332a aVar = this.f20758b;
            if (aVar != null) {
                aVar.mo14668a(linkedList);
            }
            int i = C8374a.C8375a.C8376a.f20718a.f20713g;
            LiveGiftDialogViewModel liveGiftDialogViewModel2 = this.f20762f;
            if (!(liveGiftDialogViewModel2 == null || (tVar = liveGiftDialogViewModel2.f20705a) == null || (value = tVar.getValue()) == null || i != value.intValue() || (a = m16605a(linkedList, dVar.element)) == -1 || (recyclerView = this.f20757a) == null)) {
                recyclerView.postDelayed(new RunnableC8400e(this, a), 20);
            }
            C10703a.C10704a.C10705a.f25783a.mo17630a();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        r0 = 1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14719a(java.util.List<? extends com.bytedance.android.livesdk.gift.model.GiftPage> r8) {
        /*
        // Method dump skipped, instructions count: 194
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.dialogv2.widget.LiveGiftPanelWidget.mo14719a(java.util.List):void");
    }

    /* renamed from: a */
    private static int m16605a(LinkedList<AbstractC8812b<? extends C9543b>> linkedList, long j) {
        if (linkedList == null) {
            return -1;
        }
        for (C89037ac acVar : C89070n.m154593m(linkedList)) {
            T t = acVar.f202767b;
            if (t != null && t.mo14676d() == j) {
                return acVar.f202766a;
            }
        }
        return -1;
    }
}
