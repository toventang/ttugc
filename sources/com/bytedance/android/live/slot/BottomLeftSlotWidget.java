package com.bytedance.android.live.slot;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdk.p561j.C9114dz;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class BottomLeftSlotWidget extends LiveRecyclableWidget implements IIconSlot.AbstractC6148a, WeakHandler.IHandler, AbstractC33974au {

    /* renamed from: a */
    AbstractC6189w f15252a;

    /* renamed from: b */
    ImageView f15253b;

    /* renamed from: c */
    View f15254c;

    /* renamed from: d */
    TextView f15255d;

    /* renamed from: e */
    ImageView f15256e;

    /* renamed from: f */
    IIconSlot.SlotViewModel f15257f;

    /* renamed from: g */
    Queue<C6165ah> f15258g;

    /* renamed from: h */
    Map<C6165ah, IIconSlot.SlotViewModel> f15259h;

    /* renamed from: i */
    IIconSlot.EnumC6150c f15260i;

    /* renamed from: j */
    LiveTextView f15261j;

    /* renamed from: k */
    private boolean f15262k;

    static {
        Covode.recordClassIndex(6812);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: a */
    public final void mo12012a() {
        this.f15256e.setVisibility(8);
        this.f15255d.setVisibility(8);
        this.f15254c.setVisibility(8);
    }

    @Override // com.bytedance.android.widget.Widget
    public int getLayoutId() {
        boolean z;
        if (this.dataChannel == null || !Boolean.TRUE.equals(this.dataChannel.mo28318b(C9114dz.class))) {
            z = false;
        } else {
            z = true;
        }
        this.f15262k = z;
        if (z) {
            return R.layout.bfd;
        }
        return R.layout.bfc;
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onUnload() {
        IIconSlot.SlotViewModel slotViewModel = this.f15257f;
        if (slotViewModel != null) {
            slotViewModel.mo12057a(this);
        }
        Queue<C6165ah> queue = this.f15258g;
        if (queue != null) {
            queue.clear();
        }
        Map<C6165ah, IIconSlot.SlotViewModel> map = this.f15259h;
        if (map != null) {
            for (IIconSlot.SlotViewModel slotViewModel2 : map.values()) {
                slotViewModel2.mo12057a(this);
            }
            this.f15259h.clear();
        }
        this.f15252a.onDestroy();
        getLifecycle().mo4013b(this.f15252a);
    }

    @Override // com.bytedance.android.live.slot.IIconSlot.AbstractC6148a
    /* renamed from: a */
    public final void mo8828a(IIconSlot.EnumC6150c cVar) {
        this.f15260i = cVar;
    }

    /* renamed from: a */
    public final void mo12015a(boolean z) {
        if (z) {
            show();
        } else {
            hide();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onInit(Object[] objArr) {
        this.f15253b = (ImageView) findViewById(R.id.ekf);
        this.f15255d = (TextView) findViewById(R.id.ek_);
        this.f15256e = (ImageView) findViewById(R.id.ek9);
        this.f15254c = findViewById(R.id.ekc);
        if (this.f15262k) {
            this.f15261j = (LiveTextView) findViewById(R.id.ekj);
        }
        hide();
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onLoad(Object[] objArr) {
        AbstractC6189w createIconSlotController = ((ISlotService) C6193a.m13435a(ISlotService.class)).createIconSlotController((ActivityC0945e) getContext(), this, IIconSlot.EnumC6149b.SLOT_LIVE_WATCHER_TOOLBAR, IIconSlot.EnumC6150c.PRIORITY);
        this.f15252a = createIconSlotController;
        createIconSlotController.mo12058a(this.dataChannel);
        this.f15252a.mo12059a((ActivityC0945e) getContext(), IIconSlot.EnumC6149b.SLOT_LIVE_WATCHER_TOOLBAR);
        this.f15258g = new PriorityBlockingQueue(3, new Comparator<C6165ah>() {
            /* class com.bytedance.android.live.slot.BottomLeftSlotWidget.C61171 */

            static {
                Covode.recordClassIndex(6813);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // java.util.Comparator
            public final /* bridge */ /* synthetic */ int compare(C6165ah ahVar, C6165ah ahVar2) {
                return ahVar.f15397a - ahVar2.f15397a;
            }
        });
        this.f15259h = new HashMap();
        getLifecycle().mo4012a(this.f15252a);
    }

    /* renamed from: a */
    public final void mo12013a(Drawable drawable, Drawable drawable2) {
        if (!this.f15262k || drawable2 == null) {
            this.f15253b.setImageDrawable(drawable);
        } else {
            this.f15253b.setImageDrawable(drawable2);
        }
    }

    /* renamed from: a */
    public final void mo12014a(final IIconSlot iIconSlot, final IIconSlot.SlotViewModel slotViewModel) {
        slotViewModel.f15357h.observe(this, new AbstractC1214u<Drawable>() {
            /* class com.bytedance.android.live.slot.BottomLeftSlotWidget.C61235 */

            static {
                Covode.recordClassIndex(6819);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // androidx.lifecycle.AbstractC1214u
            public final /* synthetic */ void onChanged(Drawable drawable) {
                int i;
                Drawable drawable2 = drawable;
                if (Boolean.TRUE.equals(slotViewModel.f15350a.getValue())) {
                    BottomLeftSlotWidget.this.mo12012a();
                    ImageView imageView = BottomLeftSlotWidget.this.f15256e;
                    if (drawable2 == null) {
                        i = 8;
                    } else {
                        i = 0;
                    }
                    imageView.setVisibility(i);
                    BottomLeftSlotWidget.this.f15256e.setImageDrawable(drawable2);
                }
            }
        });
        slotViewModel.f15353d.observe(this, new AbstractC1214u<Boolean>() {
            /* class com.bytedance.android.live.slot.BottomLeftSlotWidget.C61246 */

            static {
                Covode.recordClassIndex(6820);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // androidx.lifecycle.AbstractC1214u
            public final /* synthetic */ void onChanged(Boolean bool) {
                Boolean bool2 = bool;
                if (Boolean.TRUE.equals(slotViewModel.f15350a.getValue())) {
                    int i = 0;
                    if (bool2 == null) {
                        bool2 = false;
                    }
                    if (slotViewModel.f15357h.getValue() == null && TextUtils.isEmpty(slotViewModel.f15352c.getValue())) {
                        BottomLeftSlotWidget.this.mo12012a();
                        View view = BottomLeftSlotWidget.this.f15254c;
                        if (!bool2.booleanValue()) {
                            i = 8;
                        }
                        view.setVisibility(i);
                    }
                }
            }
        });
        slotViewModel.f15352c.observe(this, new AbstractC1214u<String>() {
            /* class com.bytedance.android.live.slot.BottomLeftSlotWidget.C61257 */

            static {
                Covode.recordClassIndex(6821);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // androidx.lifecycle.AbstractC1214u
            public final /* synthetic */ void onChanged(String str) {
                int i;
                String str2 = str;
                if (Boolean.TRUE.equals(slotViewModel.f15350a.getValue()) && slotViewModel.f15357h.getValue() == null) {
                    BottomLeftSlotWidget.this.mo12012a();
                    TextView textView = BottomLeftSlotWidget.this.f15255d;
                    if (TextUtils.isEmpty(str2)) {
                        i = 8;
                    } else {
                        i = 0;
                    }
                    textView.setVisibility(i);
                    BottomLeftSlotWidget.this.f15255d.setText(str2);
                }
            }
        });
        slotViewModel.f15354e.observe(this, new AbstractC1214u<Drawable>() {
            /* class com.bytedance.android.live.slot.BottomLeftSlotWidget.C61268 */

            static {
                Covode.recordClassIndex(6822);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // androidx.lifecycle.AbstractC1214u
            public final /* synthetic */ void onChanged(Drawable drawable) {
                Drawable drawable2 = drawable;
                if (Boolean.TRUE.equals(slotViewModel.f15350a.getValue())) {
                    BottomLeftSlotWidget.this.mo12013a(drawable2, slotViewModel.f15355f.getValue());
                }
            }
        });
        slotViewModel.f15355f.observe(this, new AbstractC1214u<Drawable>() {
            /* class com.bytedance.android.live.slot.BottomLeftSlotWidget.C61279 */

            static {
                Covode.recordClassIndex(6823);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // androidx.lifecycle.AbstractC1214u
            public final /* synthetic */ void onChanged(Drawable drawable) {
                Drawable drawable2 = drawable;
                if (Boolean.TRUE.equals(slotViewModel.f15350a.getValue())) {
                    BottomLeftSlotWidget.this.mo12013a(slotViewModel.f15354e.getValue(), drawable2);
                }
            }
        });
        if (this.f15262k) {
            slotViewModel.f15358i.observe(this, new C6170f(this, slotViewModel));
        }
        getView().setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.android.live.slot.BottomLeftSlotWidget.View$OnClickListenerC611810 */

            static {
                Covode.recordClassIndex(6814);
            }

            public final void onClick(View view) {
                AbstractC6162ae a = iIconSlot.mo12055a();
                if (a != null) {
                    a.mo12082a(BottomLeftSlotWidget.this.getView(), "during_live");
                } else if (!TextUtils.isEmpty(null)) {
                    ((IActionHandlerService) C6193a.m13435a(IActionHandlerService.class)).handleWithoutHost(BottomLeftSlotWidget.this.context, Uri.parse(null).toString());
                }
            }
        });
    }

    @Override // com.bytedance.android.live.slot.IIconSlot.AbstractC6148a
    /* renamed from: a */
    public final void mo8829a(final AbstractC6157ab abVar, final IIconSlot.SlotViewModel slotViewModel) {
        this.f15257f = slotViewModel;
        if (slotViewModel != null && getView() != null) {
            this.f15257f.f15350a.postValue(true);
            slotViewModel.f15351b.observe(this, new AbstractC1214u<Boolean>() {
                /* class com.bytedance.android.live.slot.BottomLeftSlotWidget.C61224 */

                static {
                    Covode.recordClassIndex(6818);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // androidx.lifecycle.AbstractC1214u
                public final /* synthetic */ void onChanged(Boolean bool) {
                    String str;
                    Boolean bool2 = bool;
                    if (Boolean.TRUE.equals(slotViewModel.f15350a.getValue())) {
                        BottomLeftSlotWidget.this.mo12015a(bool2.booleanValue());
                        if (Boolean.TRUE.equals(bool2)) {
                            abVar.mo12073a("during_live");
                        }
                        if (Boolean.TRUE.equals(bool2)) {
                            str = abVar.mo12080g();
                        } else {
                            str = "";
                        }
                        C6160ac.m13402a(str);
                    }
                }
            });
            mo12014a((IIconSlot) abVar.mo12079f(), slotViewModel);
        }
    }

    @Override // com.bytedance.android.live.slot.IIconSlot.AbstractC6148a
    /* renamed from: a */
    public final void mo8830a(final C6165ah ahVar, final IIconSlot.SlotViewModel slotViewModel) {
        this.f15258g.add(ahVar);
        this.f15259h.put(ahVar, slotViewModel);
        if (this.f15260i == IIconSlot.EnumC6150c.FIRST) {
            slotViewModel.f15351b.observe(this, new AbstractC1214u<Boolean>() {
                /* class com.bytedance.android.live.slot.BottomLeftSlotWidget.C611911 */

                static {
                    Covode.recordClassIndex(6815);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // androidx.lifecycle.AbstractC1214u
                public final /* synthetic */ void onChanged(Boolean bool) {
                    Boolean bool2 = bool;
                    String str = "";
                    if (Boolean.TRUE.equals(slotViewModel.f15350a.getValue())) {
                        BottomLeftSlotWidget.this.mo12015a(bool2.booleanValue());
                        if (Boolean.TRUE.equals(bool2)) {
                            ahVar.f15398b.mo12073a("during_live");
                        }
                        if (Boolean.TRUE.equals(bool2)) {
                            str = ahVar.f15398b.mo12080g();
                        }
                        C6160ac.m13402a(str);
                        return;
                    }
                    Iterator<C6165ah> it = BottomLeftSlotWidget.this.f15258g.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            slotViewModel.f15350a.setValue(true);
                            break;
                        }
                        C6165ah next = it.next();
                        IIconSlot.SlotViewModel slotViewModel = BottomLeftSlotWidget.this.f15259h.get(next);
                        if (ahVar != next && Boolean.TRUE.equals(slotViewModel.f15350a.getValue())) {
                            break;
                        }
                    }
                    if (Boolean.TRUE.equals(slotViewModel.f15350a.getValue())) {
                        BottomLeftSlotWidget.this.mo12015a(bool2.booleanValue());
                        if (Boolean.TRUE.equals(bool2)) {
                            ahVar.f15398b.mo12073a("during_live");
                        }
                        if (Boolean.TRUE.equals(bool2)) {
                            str = ahVar.f15398b.mo12080g();
                        }
                        C6160ac.m13402a(str);
                    }
                }
            });
        } else if (this.f15260i == IIconSlot.EnumC6150c.LAST) {
            slotViewModel.f15351b.observe(this, new AbstractC1214u<Boolean>() {
                /* class com.bytedance.android.live.slot.BottomLeftSlotWidget.C61202 */

                static {
                    Covode.recordClassIndex(6816);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // androidx.lifecycle.AbstractC1214u
                public final /* synthetic */ void onChanged(Boolean bool) {
                    Boolean bool2 = bool;
                    String str = "";
                    if (Boolean.TRUE.equals(slotViewModel.f15350a.getValue())) {
                        BottomLeftSlotWidget.this.mo12015a(bool2.booleanValue());
                        if (Boolean.TRUE.equals(bool2)) {
                            ahVar.f15398b.mo12073a("during_live");
                        }
                        if (Boolean.TRUE.equals(bool2)) {
                            str = ahVar.f15398b.mo12080g();
                        }
                        C6160ac.m13402a(str);
                        return;
                    }
                    for (C6165ah ahVar : BottomLeftSlotWidget.this.f15258g) {
                        IIconSlot.SlotViewModel slotViewModel = BottomLeftSlotWidget.this.f15259h.get(ahVar);
                        if (ahVar != ahVar && Boolean.TRUE.equals(slotViewModel.f15350a.getValue())) {
                            slotViewModel.f15350a.postValue(false);
                        }
                    }
                    slotViewModel.f15350a.setValue(true);
                    BottomLeftSlotWidget.this.mo12015a(bool2.booleanValue());
                    BottomLeftSlotWidget.this.mo12014a((IIconSlot) ahVar.f15398b.mo12079f(), slotViewModel);
                    if (Boolean.TRUE.equals(bool2)) {
                        ahVar.f15398b.mo12073a("during_live");
                    }
                    if (Boolean.TRUE.equals(bool2)) {
                        str = ahVar.f15398b.mo12080g();
                    }
                    C6160ac.m13402a(str);
                }
            });
        } else if (this.f15260i == IIconSlot.EnumC6150c.PRIORITY) {
            slotViewModel.f15351b.observe(this, new AbstractC1214u<Boolean>() {
                /* class com.bytedance.android.live.slot.BottomLeftSlotWidget.C61213 */

                static {
                    Covode.recordClassIndex(6817);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ff, code lost:
                    if (r7 == false) goto L_?;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
                    return;
                 */
                @Override // androidx.lifecycle.AbstractC1214u
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final /* synthetic */ void onChanged(java.lang.Boolean r11) {
                    /*
                    // Method dump skipped, instructions count: 445
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.slot.BottomLeftSlotWidget.C61213.onChanged(java.lang.Object):void");
                }
            });
        }
    }
}
