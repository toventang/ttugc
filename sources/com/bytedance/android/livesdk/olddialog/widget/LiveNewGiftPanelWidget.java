package com.bytedance.android.livesdk.olddialog.widget;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.C4139e;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.C8312d;
import com.bytedance.android.livesdk.chatroom.p499ui.SSGridLayoutManager;
import com.bytedance.android.livesdk.dialogv2.p516b.C8346b;
import com.bytedance.android.livesdk.dialogv2.p516b.C8347c;
import com.bytedance.android.livesdk.dialogv2.p516b.C8348d;
import com.bytedance.android.livesdk.dialogv2.p516b.C8349e;
import com.bytedance.android.livesdk.dialogv2.viewmodel.C8374a;
import com.bytedance.android.livesdk.firstrecharge.C8729d;
import com.bytedance.android.livesdk.firstrecharge.C8740e;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.gift.model.Prop;
import com.bytedance.android.livesdk.gift.model.p553a.AbstractC8811a;
import com.bytedance.android.livesdk.gift.model.p553a.AbstractC8812b;
import com.bytedance.android.livesdk.gift.p548d.C8802f;
import com.bytedance.android.livesdk.gift.p548d.C8805i;
import com.bytedance.android.livesdk.livesetting.gift.LiveFirstRechargeStyleSetting;
import com.bytedance.android.livesdk.model.C9543b;
import com.bytedance.android.livesdk.model.C9904t;
import com.bytedance.android.livesdk.olddialog.giftpanellist.p599a.AbstractC10004a;
import com.bytedance.android.livesdk.olddialog.giftpanellist.p599a.C10007b;
import com.bytedance.android.livesdk.olddialog.giftpanellist.p599a.C10008c;
import com.bytedance.android.livesdk.olddialog.giftpanellist.p600b.C10009a;
import com.bytedance.android.livesdk.olddialog.giftpanellist.p600b.C10010b;
import com.bytedance.android.livesdk.olddialog.p597a.C9993a;
import com.bytedance.android.livesdk.olddialog.viewmodel.C10041a;
import com.bytedance.android.livesdk.olddialog.viewmodel.GiftDialogViewModel;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.p561j.C9119ed;
import com.bytedance.android.livesdk.p668y.p670b.C11596a;
import com.bytedance.android.livesdk.p668y.p670b.C11597b;
import com.bytedance.android.livesdk.p668y.p670b.C11598c;
import com.bytedance.android.livesdk.performance.C10095g;
import com.bytedance.android.livesdk.service.C10630a;
import com.bytedance.android.livesdk.service.C10760d;
import com.bytedance.android.livesdk.service.assets.GiftManager;
import com.bytedance.android.livesdk.service.p621a.C10635b;
import com.bytedance.android.livesdk.service.p624b.C10700d;
import com.bytedance.android.livesdk.service.p625c.p626a.C10703a;
import com.bytedance.android.livesdk.service.p625c.p626a.C10715e;
import com.bytedance.android.livesdk.service.p625c.p628c.C10725a;
import com.bytedance.android.livesdk.service.p625c.p628c.C10731d;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdk.widget.p659a.C11370a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import p4560f.p4561a.p4565b.C88411a;
import p4600h.p4611f.p4612a.AbstractC89172b;

public class LiveNewGiftPanelWidget extends LiveWidget implements AbstractC10004a.AbstractC10006a, AbstractC33974au {

    /* renamed from: a */
    RecyclerView f24417a;

    /* renamed from: b */
    public int f24418b;

    /* renamed from: c */
    public GiftDialogViewModel.EnumC10040b f24419c;

    /* renamed from: d */
    final LinkedList<GiftPage> f24420d = new LinkedList<>();

    /* renamed from: e */
    public final LinkedList<Prop> f24421e = new LinkedList<>();

    /* renamed from: f */
    public AbstractC10004a f24422f;

    /* renamed from: g */
    public C10041a f24423g;

    /* renamed from: h */
    public boolean f24424h;

    /* renamed from: i */
    public long f24425i;

    /* renamed from: j */
    public String f24426j;

    /* renamed from: k */
    public boolean f24427k = true;

    /* renamed from: l */
    public boolean f24428l = false;

    /* renamed from: m */
    public boolean f24429m = false;

    /* renamed from: n */
    int f24430n;

    /* renamed from: o */
    int f24431o;

    /* renamed from: p */
    boolean f24432p = true;

    /* renamed from: q */
    private LiveTextView f24433q;

    /* renamed from: r */
    private Room f24434r;

    /* renamed from: s */
    private int f24435s;

    /* renamed from: t */
    private boolean f24436t;

    /* renamed from: u */
    private LinkedList<AbstractC8812b<? extends C9543b>> f24437u;

    /* renamed from: v */
    private int f24438v = 0;

    /* renamed from: w */
    private final C88411a f24439w = new C88411a();

    /* renamed from: x */
    private boolean f24440x = false;

    /* renamed from: y */
    private boolean f24441y = true;

    /* renamed from: z */
    private GiftPage f24442z;

    /* renamed from: com.bytedance.android.livesdk.olddialog.widget.LiveNewGiftPanelWidget$a */
    public interface AbstractC10048a {
        static {
            Covode.recordClassIndex(11610);
        }

        /* renamed from: a */
        void mo16878a(Boolean bool, Long l, int i);
    }

    static {
        Covode.recordClassIndex(11605);
    }

    @Override // com.bytedance.android.livesdk.olddialog.giftpanellist.p599a.AbstractC10004a.AbstractC10006a
    /* renamed from: a */
    public final void mo16829a() {
        this.f24428l = true;
    }

    @Override // com.bytedance.android.widget.Widget
    public int getLayoutId() {
        return R.layout.bg_;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static class GiftSSGridLayoutManager extends SSGridLayoutManager {

        /* renamed from: L */
        public boolean f24446L = true;

        static {
            Covode.recordClassIndex(11609);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1362i
        /* renamed from: f */
        public final boolean mo4366f() {
            if (!super.mo4366f() || !this.f24446L) {
                return false;
            }
            return true;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1362i
        /* renamed from: g */
        public final boolean mo4368g() {
            if (!super.mo4368g() || !this.f24446L) {
                return false;
            }
            return true;
        }

        public GiftSSGridLayoutManager(Context context) {
            super(2, 0);
        }
    }

    @Override // com.bytedance.android.livesdk.olddialog.giftpanellist.p599a.AbstractC10004a.AbstractC10006a
    /* renamed from: b */
    public final void mo16834b() {
        this.dataChannel.mo28320c(C8802f.class, new C8805i("gift"));
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void onDestroy() {
        super.onDestroy();
        this.f24439w.mo142944a();
        this.f24423g.f24386b.removeObservers(this);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void onCreate() {
        super.onCreate();
        C10725a.C10726a.C10727a.f25846a.mo17647a();
        if (C8729d.f21542u.mo15010e() || (!C8729d.f21542u.mo15010e() && !LiveFirstRechargeStyleSetting.INSTANCE.getValue() && C8729d.f21542u.mo15009d())) {
            C8740e.m17059a();
        }
        this.f24417a = (RecyclerView) this.contentView.findViewById(R.id.bae);
        LiveTextView liveTextView = (LiveTextView) this.containerView.findViewById(R.id.av8);
        this.f24433q = liveTextView;
        liveTextView.setVisibility(0);
        if (this.dataChannel != null) {
            this.f24434r = (Room) this.dataChannel.mo28318b(C9093de.class);
            this.f24436t = ((Boolean) this.dataChannel.mo28318b(C9119ed.class)).booleanValue();
            this.f24439w.mo142945a(C6779a.m14563a().mo13052a(C10760d.class).mo143289d(new C10063m(this)));
            this.f24439w.mo142945a(C6779a.m14563a().mo13052a(C10630a.class).mo143289d(new C10064n(this)));
            this.f24439w.mo142945a(C6779a.m14563a().mo13052a(C11596a.class).mo143289d(new C10065o(this)));
            this.f24439w.mo142945a(C6779a.m14563a().mo13052a(C11597b.class).mo143289d(new C10066p(this)));
            this.f24439w.mo142945a(C6779a.m14563a().mo13052a(C11598c.class).mo143289d(new C10067q(this)));
        }
        if (this.f24424h) {
            this.f24422f = new C10007b(this.context, this);
        } else {
            this.f24422f = new C10008c(this.context, this);
        }
        this.f24422f.f24308h = this.dataChannel;
        C10041a aVar = this.f24423g;
        if (!(aVar == null || aVar.f24391g == null || this.f24423g.f24391g.getValue() == null)) {
            this.f24422f.f24305e = this.f24423g.f24391g.getValue().longValue();
        }
        this.f24422f.f24309i = new C10068r(this);
        this.f24417a.setAdapter(this.f24422f);
        this.f24422f.f24304d = this;
        this.f24422f.mo16818a(this.f24425i);
        this.f24417a.setLayoutManager(new GiftSSGridLayoutManager(this.context));
        this.f24417a.setHasFixedSize(true);
        this.f24417a.setItemViewCacheSize(16);
        this.f24417a.setClipChildren(false);
        this.f24417a.mo4405a(new RecyclerView.AbstractC1371n() {
            /* class com.bytedance.android.livesdk.olddialog.widget.LiveNewGiftPanelWidget.C100451 */

            static {
                Covode.recordClassIndex(11606);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
            /* renamed from: a */
            public final void mo4753a(RecyclerView recyclerView, int i) {
                super.mo4753a(recyclerView, i);
                LiveNewGiftPanelWidget.this.f24428l = true;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
            /* renamed from: a */
            public final void mo4754a(RecyclerView recyclerView, int i, int i2) {
                super.mo4754a(recyclerView, i, i2);
            }
        });
        C10095g.m18633a(this.f24417a);
        C100462 r1 = new C11370a() {
            /* class com.bytedance.android.livesdk.olddialog.widget.LiveNewGiftPanelWidget.C100462 */

            static {
                Covode.recordClassIndex(11607);
            }

            @Override // com.bytedance.android.livesdk.widget.p659a.AbstractC11375c, com.bytedance.android.livesdk.widget.p659a.C11370a
            /* renamed from: a */
            public final View mo16877a(RecyclerView.AbstractC1362i iVar) {
                View a = super.mo16877a(iVar);
                if (a == null) {
                    return null;
                }
                LiveNewGiftPanelWidget.this.f24418b = RecyclerView.AbstractC1362i.m4426e(a);
                LiveNewGiftPanelWidget liveNewGiftPanelWidget = LiveNewGiftPanelWidget.this;
                liveNewGiftPanelWidget.mo16874b(liveNewGiftPanelWidget.f24418b);
                return a;
            }

            @Override // com.bytedance.android.livesdk.widget.p659a.AbstractC11375c, com.bytedance.android.livesdk.widget.p659a.C11370a
            /* renamed from: a */
            public final int mo16876a(RecyclerView.AbstractC1362i iVar, int i, int i2) {
                LiveNewGiftPanelWidget.this.f24418b = super.mo16876a(iVar, i, i2);
                LiveNewGiftPanelWidget liveNewGiftPanelWidget = LiveNewGiftPanelWidget.this;
                liveNewGiftPanelWidget.mo16874b(liveNewGiftPanelWidget.f24418b);
                return LiveNewGiftPanelWidget.this.f24418b;
            }
        };
        if (((C11370a) r1).f27326b > 0) {
            ((C11370a) r1).f27326b = 2;
            if (r1.f27327c > 0) {
                r1.f27327c = 4;
                r1.mo18253a(this.f24417a);
                this.f24417a.mo4405a(new RecyclerView.AbstractC1371n() {
                    /* class com.bytedance.android.livesdk.olddialog.widget.LiveNewGiftPanelWidget.C100473 */

                    static {
                        Covode.recordClassIndex(11608);
                    }

                    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
                    /* renamed from: a */
                    public final void mo4753a(RecyclerView recyclerView, int i) {
                        if (i != 0) {
                            LiveNewGiftPanelWidget liveNewGiftPanelWidget = LiveNewGiftPanelWidget.this;
                            liveNewGiftPanelWidget.mo16874b(liveNewGiftPanelWidget.f24418b);
                            super.mo4753a(recyclerView, i);
                        }
                    }
                });
                this.f24423g.f24386b.observe(this, new C10059i(this));
                this.dataChannel.mo28309a((AbstractC1204m) this, C8312d.class, (AbstractC89172b) new C10060j(this));
                return;
            }
            throw new IllegalArgumentException("column must be greater than zero");
        }
        throw new IllegalArgumentException("row must be greater than zero");
    }

    @Override // com.bytedance.android.livesdk.olddialog.giftpanellist.p599a.AbstractC10004a.AbstractC10006a
    /* renamed from: a */
    public final void mo16830a(int i) {
        this.f24417a.mo4413b(0);
        this.f24417a.postDelayed(new RunnableC10062l(this, i), 100);
    }

    /* renamed from: b */
    public final void mo16875b(List<Prop> list) {
        if (list != null) {
            LinkedList<AbstractC8812b<? extends C9543b>> linkedList = new LinkedList<>();
            for (Prop prop : list) {
                linkedList.addLast(new C8348d(prop));
            }
            m18579a(linkedList);
        }
    }

    /* renamed from: b */
    public final void mo16874b(int i) {
        int i2 = i / 8;
        if (i2 >= 0 && i2 < this.f24435s) {
            if (i2 != this.f24438v) {
                this.f24438v = i2;
                C10635b.C10636a.C10637a.f25639a.f25638a = false;
            }
            this.dataChannel.mo28319c(C8312d.class);
            C10703a aVar = C10703a.C10704a.C10705a.f25783a;
            if (aVar.f25779a != i2) {
                aVar.mo17630a();
            }
            C10009a aVar2 = new C10009a();
            aVar2.f24316b = i2;
            aVar2.f24315a = this.f24435s;
            this.f24423g.f24390f.setValue(aVar2);
            if (this.f24428l && 5 != this.f24423g.f24386b.getValue().intValue()) {
                C8374a.C8375a.C8376a.f20718a.f20716j = this.f24423g.f24386b.getValue().intValue();
                C10715e.f25799h.mo17640a(aVar2.f24316b, this.f24430n, this.f24442z, false, this.f24426j);
            }
            C10725a.C10726a.C10727a.f25846a.mo17648a(i2);
        }
    }

    /* renamed from: a */
    public final void mo16872a(List<GiftPage> list) {
        if (!(list == null || list.isEmpty())) {
            List<GiftPage> arrayList = new ArrayList<>(5);
            C27910f fVar = C4139e.C4140a.f11576c;
            for (GiftPage giftPage : list) {
                arrayList.add(fVar.mo46670a(fVar.mo46674b(giftPage), GiftPage.class));
            }
            this.f24420d.clear();
            this.f24420d.addAll(arrayList);
            Iterator<GiftPage> it = this.f24420d.iterator();
            while (it.hasNext()) {
                GiftPage next = it.next();
                if (this.f24419c == GiftDialogViewModel.EnumC10040b.GUEST) {
                    GiftManager.filterInteractNotSupportGift(next.gifts, this.f24436t);
                } else {
                    GiftManager.filterNotSupportGift(next.gifts, this.f24436t);
                }
                GiftManager.filterNotDisplayedOnPanel(next.gifts);
                GiftManager.filterFirstAndCallbackGifts(next.gifts);
            }
            if (!this.f24429m) {
                this.f24429m = true;
                mo16873a(arrayList, (Integer) 1);
            }
        }
    }

    /* renamed from: a */
    private void m18579a(LinkedList<AbstractC8812b<? extends C9543b>> linkedList) {
        int i;
        long j;
        boolean z;
        LinkedList<AbstractC8812b<? extends C9543b>> linkedList2;
        LinkedList<AbstractC8812b<? extends C9543b>> linkedList3;
        if (this.f24422f != null) {
            C10731d.C10732a.C10733a.f25859a.mo17660a(linkedList);
            if (linkedList.size() > 0) {
                i = ((linkedList.size() - 1) / 8) + 1;
            } else {
                i = 0;
            }
            this.f24435s = i;
            this.f24422f.mo16823a(linkedList);
            this.f24422f.notifyDataSetChanged();
            if (linkedList.isEmpty()) {
                this.f24433q.setVisibility(0);
            } else {
                this.f24433q.setVisibility(8);
            }
            if (this.f24428l) {
                AbstractC10004a aVar = this.f24422f;
                if (aVar.mo16826c(aVar.f24307g) != -1 || (linkedList3 = this.f24437u) == null || linkedList3.isEmpty()) {
                    AbstractC10004a aVar2 = this.f24422f;
                    this.f24417a.postDelayed(new RunnableC10070t(this, ((aVar2.mo16826c(aVar2.f24307g) / 8) * 8) + 7), 50);
                    C10009a aVar3 = new C10009a();
                    aVar3.f24315a = this.f24435s;
                    AbstractC10004a aVar4 = this.f24422f;
                    aVar3.f24316b = aVar4.mo16826c(aVar4.f24307g) / 8;
                    this.f24423g.f24390f.setValue(aVar3);
                    C10725a.C10726a.C10727a.f25846a.mo17648a(aVar3.f24316b);
                    return;
                }
                this.f24422f.mo16818a(this.f24437u.get(0).mo14676d());
                this.f24417a.postDelayed(new RunnableC10069s(this), 50);
                return;
            }
            long a = C9993a.m18475a(this.context, "default_dialog_item");
            if (this.f24442z.pageType != C9993a.m18474a(this.context, "sp_gift_page_type", -1) && !this.f24437u.isEmpty()) {
                a = this.f24437u.get(0).mo14676d();
            }
            if (this.f24423g.f24391g.getValue() != null) {
                j = this.f24423g.f24391g.getValue().longValue();
                if (j != 0) {
                    a = j;
                }
            } else {
                j = 0;
            }
            C10009a aVar5 = new C10009a();
            aVar5.f24316b = 0;
            aVar5.f24315a = this.f24435s;
            this.f24423g.f24390f.setValue(aVar5);
            C10725a.C10726a.C10727a.f25846a.mo17648a(0);
            if (C8729d.f21542u.mo15009d() && (!LiveFirstRechargeStyleSetting.INSTANCE.getValue() || C8729d.f21542u.mo15010e())) {
                if (C8729d.f21542u.mo15011f()) {
                    a = C8729d.f21542u.mo15013i();
                } else {
                    a = 0;
                }
            }
            if (this.f24422f.mo16826c(a) != -1) {
                this.f24417a.postDelayed(new RunnableC10061k(this, ((this.f24422f.mo16826c(a) / 8) * 8) + 7), 50);
                aVar5.f24315a = this.f24435s;
                aVar5.f24316b = this.f24422f.mo16826c(a) / 8;
                this.f24423g.f24390f.setValue(aVar5);
                C10725a.C10726a.C10727a.f25846a.mo17648a(aVar5.f24316b);
            } else {
                this.f24417a.mo4413b(0);
            }
            if (this.f24422f.mo16826c(a) != -1 || (linkedList2 = this.f24437u) == null || linkedList2.isEmpty()) {
                this.f24422f.mo16818a(a);
            } else if (j == 0) {
                this.f24422f.mo16818a(this.f24437u.get(0).mo14676d());
                a = this.f24437u.get(0).mo14676d();
            } else {
                C11226ao.m19883a(C3966y.m9669e(), "This gift is currently unavailable", 0);
            }
            this.f24422f.f24305e = a;
            if (!this.f24440x) {
                this.f24440x = true;
                C10715e eVar = C10715e.f25799h;
                int i2 = aVar5.f24316b;
                if (this.f24419c == GiftDialogViewModel.EnumC10040b.GUEST) {
                    z = true;
                } else {
                    z = false;
                }
                eVar.mo17641a(i2, z, this.f24430n, this.f24442z, this.f24426j, this.f24423g.f24386b.getValue());
                C10715e.f25799h.mo17639a(aVar5.f24316b, this.f24430n, this.f24442z, this.f24426j);
                this.f24438v = aVar5.f24316b;
            } else if (!this.f24432p) {
                this.f24432p = true;
                C8374a.C8375a.C8376a.f20718a.f20716j = this.f24423g.f24386b.getValue().intValue();
                C10635b.C10636a.C10637a.f25639a.f25638a = false;
                C10715e.f25799h.mo17640a(aVar5.f24316b, this.f24430n, this.f24442z, true, this.f24426j);
            }
        }
    }

    @Override // com.bytedance.android.livesdk.olddialog.giftpanellist.p599a.AbstractC10004a.AbstractC10006a
    /* renamed from: a */
    public final void mo16833a(String str, String str2) {
        this.f24423g.f24388d.setValue(new C10010b(str, str2));
    }

    @Override // com.bytedance.android.livesdk.olddialog.giftpanellist.p599a.AbstractC10004a.AbstractC10006a
    /* renamed from: a */
    public final void mo16831a(int i, int i2) {
        C10009a aVar = new C10009a();
        aVar.f24316b = i;
        aVar.f24315a = i2;
        this.f24435s = i2;
        this.f24423g.f24390f.setValue(aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo16873a(List<GiftPage> list, Integer num) {
        C10041a aVar = this.f24423g;
        if (!(aVar == null || aVar.f24386b == null || this.f24423g.f24386b.getValue() == null)) {
            if ((this.f24423g.f24386b.getValue().equals(num) || !this.f24427k) && list != null && !list.isEmpty()) {
                if (!this.f24427k) {
                    this.f24427k = true;
                }
                for (int i = 0; i < list.size(); i++) {
                    GiftPage giftPage = list.get(i);
                    if (giftPage.pageType == num.intValue()) {
                        LinkedList<AbstractC8812b<? extends C9543b>> linkedList = new LinkedList<>();
                        for (C9904t tVar : giftPage.gifts) {
                            if (tVar.f24000e == 3) {
                                linkedList.addLast(new C8349e(tVar));
                            } else {
                                linkedList.addLast(new C8347c(tVar));
                            }
                        }
                        this.f24431o = this.f24423g.f24386b.getValue().intValue();
                        this.f24437u = linkedList;
                        this.f24442z = giftPage;
                        this.f24430n = i;
                        if (giftPage.pageType != 5) {
                            C10715e.f25799h.mo17644a(giftPage.gifts);
                        }
                        if (this.f24431o == 1 && (C8729d.f21542u.mo15010e() || (!C8729d.f21542u.mo15010e() && !LiveFirstRechargeStyleSetting.INSTANCE.getValue() && C8729d.f21542u.mo15009d()))) {
                            C9904t g = C8729d.f21542u.mo15012g();
                            C9904t h = C8729d.m17036h();
                            if (C8729d.f21542u.mo15011f()) {
                                if (g != null) {
                                    linkedList.addFirst(new C8346b(g));
                                }
                            } else if (h != null) {
                                linkedList.addFirst(new C8346b(h));
                            }
                        }
                        C10725a.C10726a.C10727a.f25846a.mo17649a(num.intValue(), linkedList);
                        m18579a(linkedList);
                        return;
                    }
                }
            }
        }
    }

    @Override // com.bytedance.android.livesdk.olddialog.giftpanellist.p599a.AbstractC10004a.AbstractC10006a
    /* renamed from: a */
    public final void mo16832a(AbstractC8812b bVar, String str, String str2) {
        GiftDialogViewModel.EnumC10039a aVar;
        AbstractC8811a aVar2 = (AbstractC8811a) bVar;
        if (aVar2 != null) {
            if (aVar2.f21694a != 2) {
                aVar = GiftDialogViewModel.EnumC10039a.GIFT;
            } else {
                aVar = GiftDialogViewModel.EnumC10039a.PROP;
            }
            C10700d dVar = new C10700d(aVar, aVar2.mo14676d(), aVar2.mo14679g());
            if (aVar2.f21695b instanceof C9904t) {
                C9904t tVar = (C9904t) aVar2.f21695b;
                dVar.f25764f = tVar.f24001f;
                dVar.f25775q = tVar.f23993J;
                boolean z = true;
                if (tVar.f24000e == 1) {
                    z = false;
                }
                dVar.f25769k = z;
                dVar.f25771m = this.f24430n;
                dVar.f25770l = this.f24442z.pageName;
                dVar.f25772n = this.f24442z.pageType;
                dVar.f25773o = str;
                dVar.f25774p = str2;
            }
            this.f24423g.f24387c.postValue(dVar);
        }
    }
}
