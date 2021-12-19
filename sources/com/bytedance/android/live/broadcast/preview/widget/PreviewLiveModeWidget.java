package com.bytedance.android.live.broadcast.preview.widget;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.android.live.broadcast.C3802x;
import com.bytedance.android.live.broadcast.api.p185c.C3051c;
import com.bytedance.android.live.core.widget.HorizontalTabScrollView;
import com.bytedance.android.live.p250i.p251a.AbstractC4357d;
import com.bytedance.android.live.p379n.AbstractC5771e;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorScreenshotEnableSetting;
import com.bytedance.android.livesdk.p425aa.C6497a;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p561j.C9010ad;
import com.bytedance.android.livesdk.p561j.C9011ae;
import com.bytedance.android.livesdk.p561j.C9078cq;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdkapi.depend.model.live.C11729j;
import com.bytedance.android.livesdkapi.depend.model.live.EnumC11728i;
import com.bytedance.android.livesdkapi.p699l.C11825a;
import com.bytedance.android.livesdkapi.p699l.C11826b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

public final class PreviewLiveModeWidget extends LiveWidget implements AbstractC33974au {

    /* renamed from: a */
    ArrayList<C3598b> f9944a = new ArrayList<>(0);

    /* renamed from: b */
    public boolean f9945b;

    /* renamed from: c */
    private int f9946c = -1;

    /* renamed from: d */
    private final C11826b f9947d;

    /* renamed from: e */
    private final C11825a f9948e;

    /* renamed from: f */
    private final boolean f9949f;

    /* renamed from: g */
    private final boolean f9950g;

    /* renamed from: h */
    private final boolean f9951h;

    /* renamed from: i */
    private boolean f9952i;

    static {
        Covode.recordClassIndex(4094);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bgj;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.widget.PreviewLiveModeWidget$a */
    static final class C3597a extends RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> {

        /* renamed from: a */
        public final ArrayList<C3598b> f9953a;

        static {
            Covode.recordClassIndex(4095);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return m9030a(viewGroup, i);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
        public final int getItemCount() {
            return this.f9953a.size();
        }

        public C3597a(ArrayList<C3598b> arrayList) {
            C89219l.m154721d(arrayList, "");
            this.f9953a = arrayList;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int i2;
            float f;
            Resources resources;
            String string;
            String str = "";
            C89219l.m154721d(viewHolder, str);
            if (viewHolder instanceof C3599c) {
                C3598b bVar = this.f9953a.get(i);
                C89219l.m154716b(bVar, str);
                C3598b bVar2 = bVar;
                View view = viewHolder.itemView;
                C89219l.m154716b(view, str);
                Context context = view.getContext();
                int i3 = bVar2.f9955b;
                if (bVar2.f9954a) {
                    i2 = bVar2.f9956c;
                } else {
                    i2 = bVar2.f9957d;
                }
                if (bVar2.f9954a) {
                    f = 0.9f;
                } else {
                    f = 0.5f;
                }
                C3599c cVar = (C3599c) viewHolder;
                cVar.f9960b.setBackgroundResource(i2);
                TextView textView = cVar.f9959a;
                if (!(context == null || (resources = context.getResources()) == null || (string = resources.getString(i3)) == null)) {
                    str = string;
                }
                textView.setText(str);
                cVar.f9959a.setAlpha(f);
            }
        }

        /* renamed from: a */
        private static RecyclerView.ViewHolder m9030a(ViewGroup viewGroup, int i) {
            boolean a;
            MethodCollector.m26663i(8158);
            C89219l.m154721d(viewGroup, "");
            View a2 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.bgq, viewGroup, false);
            C89219l.m154716b(a2, "");
            C3599c cVar = new C3599c(a2);
            try {
                if (cVar.itemView.getParent() != null) {
                    try {
                        a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                    } catch (Exception unused) {
                    }
                    if (a) {
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(cVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                        C22708a.m42800a(stringBuffer.toString());
                        ViewGroup viewGroup2 = (ViewGroup) cVar.itemView.getParent();
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(cVar.itemView);
                        }
                    }
                }
            } catch (Exception e) {
                C63423ai.m115002a(e);
                C51423a.m95786a(e);
            }
            C80493gg.f180088a = cVar.getClass().getName();
            MethodCollector.m26664o(8158);
            return cVar;
        }
    }

    /* renamed from: b */
    private static boolean m9020b() {
        if (Build.VERSION.SDK_INT >= 21) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final HorizontalTabScrollView mo8884a() {
        View view = getView();
        if (!(view instanceof HorizontalTabScrollView)) {
            view = null;
        }
        return (HorizontalTabScrollView) view;
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.widget.PreviewLiveModeWidget$f */
    static final class RunnableC3602f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ PreviewLiveModeWidget f9963a;

        static {
            Covode.recordClassIndex(4100);
        }

        RunnableC3602f(PreviewLiveModeWidget previewLiveModeWidget) {
            this.f9963a = previewLiveModeWidget;
        }

        public final void run() {
            PreviewLiveModeWidget previewLiveModeWidget = this.f9963a;
            Object b = previewLiveModeWidget.dataChannel.mo28318b(C3802x.class);
            if (b == null) {
                C89219l.m154715b();
            }
            int size = previewLiveModeWidget.f9944a.size();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                C3598b bVar = previewLiveModeWidget.f9944a.get(i2);
                C89219l.m154716b(bVar, "");
                if (bVar.f9958e == b) {
                    i = i2;
                    break;
                }
                i2++;
            }
            HorizontalTabScrollView a = previewLiveModeWidget.mo8884a();
            if (a != null) {
                a.mo9401a(i);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0080, code lost:
        if (com.bytedance.android.livesdk.utils.C11279p.m20012a(r0) != false) goto L_0x0082;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x009c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PreviewLiveModeWidget() {
        /*
        // Method dump skipped, instructions count: 164
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.preview.widget.PreviewLiveModeWidget.<init>():void");
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        AbstractC5771e dnsOptimizer;
        super.onCreate();
        AbstractC4357d dVar = (AbstractC4357d) C6193a.m13435a(AbstractC4357d.class);
        if (!(dVar == null || (dnsOptimizer = dVar.getDnsOptimizer()) == null)) {
            dnsOptimizer.mo11510a();
        }
        C6497a a = C3051c.C3052a.m8360b("ttlive_fetch_pc_mode_all").mo12633b("preview").mo12625a("support_pc_mode", Boolean.valueOf(this.f9950g));
        boolean z = true;
        a.f16147c = true;
        a.mo12632a();
        if (!this.f9951h || !m9020b() || !LiveAnchorScreenshotEnableSetting.INSTANCE.enable()) {
            z = false;
        }
        if (this.f9949f) {
            this.f9944a.add(new C3598b(R.string.dw1, 2131234323, 2131234324, EnumC11728i.VIDEO));
        }
        if (z) {
            this.f9944a.add(new C3598b(R.string.e9t, 2131234320, 2131234321, EnumC11728i.SCREEN_RECORD));
        }
        if (this.f9950g) {
            this.f9944a.add(new C3598b(R.string.e9l, 2131234309, 2131234310, EnumC11728i.THIRD_PARTY));
        }
        if (this.f9952i) {
            this.f9944a.add(new C3598b(R.string.e_y, 2131234311, 2131234312, EnumC11728i.LIVE_STUDIO));
        }
        HorizontalTabScrollView a2 = mo8884a();
        if (a2 != null) {
            a2.setAdapter(new C3597a(this.f9944a));
        }
        HorizontalTabScrollView a3 = mo8884a();
        if (a3 != null) {
            a3.f11037a.mo4404a(new HorizontalTabScrollView.C4025e(a3.getContext(), a3.f11037a, new C3600d(this), (byte) 0));
        }
        HorizontalTabScrollView a4 = mo8884a();
        if (a4 != null) {
            C3601e eVar = new C3601e(this);
            HorizontalTabScrollView.C4028g gVar = a4.f11038b;
            if (gVar.f11049b == null) {
                gVar.f11049b = new ArrayList();
            }
            gVar.f11049b.add(eVar);
        }
        View view = getView();
        if (view != null) {
            view.post(new RunnableC3602f(this));
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.mo28310a(C9078cq.class, (AbstractC89172b) new C3603g(this)).mo28310a(C9010ad.class, (AbstractC89172b) new C3604h(this));
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.widget.PreviewLiveModeWidget$d */
    static final class C3600d implements HorizontalTabScrollView.AbstractC4023c {

        /* renamed from: a */
        final /* synthetic */ PreviewLiveModeWidget f9961a;

        static {
            Covode.recordClassIndex(4098);
        }

        C3600d(PreviewLiveModeWidget previewLiveModeWidget) {
            this.f9961a = previewLiveModeWidget;
        }

        @Override // com.bytedance.android.live.core.widget.HorizontalTabScrollView.AbstractC4023c
        /* renamed from: a */
        public final void mo8890a(int i) {
            this.f9961a.mo8885a(i);
        }
    }

    /* renamed from: f */
    private final void m9024f(int i) {
        if (this.f9946c != i) {
            this.f9946c = i;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.widget.PreviewLiveModeWidget$g */
    static final class C3603g extends AbstractC89220m implements AbstractC89172b<C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ PreviewLiveModeWidget f9964a;

        static {
            Covode.recordClassIndex(4101);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3603g(PreviewLiveModeWidget previewLiveModeWidget) {
            super(1);
            this.f9964a = previewLiveModeWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C89391z zVar) {
            C89219l.m154721d(zVar, "");
            this.f9964a.mo8887a(EnumC11728i.LIVE_STUDIO, false);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.widget.PreviewLiveModeWidget$h */
    static final class C3604h extends AbstractC89220m implements AbstractC89172b<EnumC11728i, C89391z> {

        /* renamed from: a */
        final /* synthetic */ PreviewLiveModeWidget f9965a;

        static {
            Covode.recordClassIndex(4102);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3604h(PreviewLiveModeWidget previewLiveModeWidget) {
            super(1);
            this.f9965a = previewLiveModeWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(EnumC11728i iVar) {
            EnumC11728i iVar2 = iVar;
            C89219l.m154721d(iVar2, "");
            this.f9965a.mo8887a(iVar2, true);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    private final void m9019a(EnumC11728i iVar) {
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.mo28315b(C3802x.class, iVar);
        }
    }

    /* renamed from: c */
    private final boolean m9021c(int i) {
        if (i < 0 || i > this.f9944a.size() - 1) {
            return false;
        }
        return true;
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.widget.PreviewLiveModeWidget$e */
    static final class C3601e implements HorizontalTabScrollView.AbstractC4024d {

        /* renamed from: a */
        final /* synthetic */ PreviewLiveModeWidget f9962a;

        static {
            Covode.recordClassIndex(4099);
        }

        C3601e(PreviewLiveModeWidget previewLiveModeWidget) {
            this.f9962a = previewLiveModeWidget;
        }

        @Override // com.bytedance.android.live.core.widget.HorizontalTabScrollView.AbstractC4024d
        /* renamed from: a */
        public final void mo8891a(int i) {
            this.f9962a.mo8888b(i);
            if (this.f9962a.f9945b) {
                this.f9962a.mo8886a(i, false);
            }
            this.f9962a.f9945b = true;
        }
    }

    /* renamed from: e */
    private final void m9023e(int i) {
        if (this.f9946c != i) {
            HorizontalTabScrollView a = mo8884a();
            if (a != null) {
                a.mo9402b(this.f9946c);
            }
            HorizontalTabScrollView a2 = mo8884a();
            if (a2 != null) {
                a2.mo9402b(i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.broadcast.preview.widget.PreviewLiveModeWidget$c */
    public static final class C3599c extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final TextView f9959a;

        /* renamed from: b */
        public final ImageView f9960b;

        static {
            Covode.recordClassIndex(4097);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3599c(View view) {
            super(view);
            C89219l.m154721d(view, "");
            View findViewById = view.findViewById(R.id.egx);
            C89219l.m154716b(findViewById, "");
            this.f9959a = (TextView) findViewById;
            View findViewById2 = view.findViewById(R.id.icon_iv);
            C89219l.m154716b(findViewById2, "");
            this.f9960b = (ImageView) findViewById2;
        }
    }

    /* renamed from: d */
    private final void m9022d(int i) {
        int i2 = this.f9946c;
        if (i2 != i) {
            if (m9021c(i2)) {
                C3598b bVar = this.f9944a.get(this.f9946c);
                C89219l.m154716b(bVar, "");
                bVar.f9954a = false;
            }
            if (m9021c(i)) {
                C3598b bVar2 = this.f9944a.get(i);
                C89219l.m154716b(bVar2, "");
                bVar2.f9954a = true;
            }
        }
    }

    /* renamed from: a */
    public final void mo8885a(int i) {
        HorizontalTabScrollView a = mo8884a();
        if (a != null) {
            a.mo9401a(i);
        }
    }

    /* renamed from: b */
    public final void mo8888b(int i) {
        m9022d(i);
        m9023e(i);
        m9024f(i);
        if (m9021c(i)) {
            String a = C11729j.m20684a(this.f9944a.get(i).f9958e);
            C6501b a2 = C6501b.C6502a.m13948a("livesdk_live_take_type_show");
            AbstractC6872f b = C11115u.m19743a().mo17915b();
            C89219l.m154716b(b, "");
            a2.mo12646a("anchor_id", b.mo13161c()).mo12644a(a).mo12655b();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006a  */
    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setWidgetCallback(com.bytedance.android.widget.Widget.AbstractC12236a r5) {
        /*
        // Method dump skipped, instructions count: 130
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.preview.widget.PreviewLiveModeWidget.setWidgetCallback(com.bytedance.android.widget.Widget$a):void");
    }

    /* renamed from: a */
    public final void mo8886a(int i, boolean z) {
        if (m9021c(i)) {
            C3598b bVar = this.f9944a.get(i);
            C89219l.m154716b(bVar, "");
            C3598b bVar2 = bVar;
            if (z) {
                DataChannel dataChannel = this.dataChannel;
                if (dataChannel != null) {
                    dataChannel.mo28315b(C9011ae.class, bVar2.f9958e);
                    return;
                }
                return;
            }
            m9019a(bVar2.f9958e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0043, code lost:
        if (r0 != false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0056, code lost:
        if (com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorScreenshotEnableSetting.INSTANCE.enable() != false) goto L_0x001a;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8887a(com.bytedance.android.livesdkapi.depend.model.live.EnumC11728i r4, boolean r5) {
        /*
        // Method dump skipped, instructions count: 104
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.preview.widget.PreviewLiveModeWidget.mo8887a(com.bytedance.android.livesdkapi.depend.model.live.i, boolean):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.broadcast.preview.widget.PreviewLiveModeWidget$b */
    public static final class C3598b {

        /* renamed from: a */
        public boolean f9954a = false;

        /* renamed from: b */
        public final int f9955b;

        /* renamed from: c */
        public final int f9956c;

        /* renamed from: d */
        public final int f9957d;

        /* renamed from: e */
        public final EnumC11728i f9958e;

        static {
            Covode.recordClassIndex(4096);
        }

        public C3598b(int i, int i2, int i3, EnumC11728i iVar) {
            C89219l.m154721d(iVar, "");
            this.f9955b = i;
            this.f9956c = i2;
            this.f9957d = i3;
            this.f9958e = iVar;
        }
    }
}
