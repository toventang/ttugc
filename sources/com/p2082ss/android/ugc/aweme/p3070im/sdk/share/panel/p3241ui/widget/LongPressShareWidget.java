package com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.p3241ui.widget;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.widget.DmtEditText;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.input.TuxCheckBox;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p2082ss.android.ugc.aweme.metrics.C59256u;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3171b.C55058a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3171b.C55059b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55076b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55082e;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55172ad;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55213i;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55219n;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55232u;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.p3184b.C55191a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.base.Widget;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.p3223b.C55732c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3220a.C55708a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3220a.C55712b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3233a.C55940a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3234b.p3235a.AbstractC55947a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3234b.p3235a.AbstractC55948b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3234b.p3236b.C55949a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3234b.p3236b.C55956g;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3245ui.p3247b.C56090a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.p3238a.p3239a.C55966a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.p3238a.p3239a.C55967b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.p3238a.p3239a.C55968c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.p3241ui.p3242a.C55971a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.p3241ui.p3244c.C55989b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.p3241ui.p3244c.C55994c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.p3241ui.p3244c.C55997d;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.p3241ui.view.C56036b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.viewmodel.AbstractC56081a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.viewmodel.SharePanelViewModel;
import com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56220e;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56253f;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56256i;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMConversation;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3252c.C56204e;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3252c.C56214i;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import com.p2082ss.android.ugc.aweme.p3070im.service.share.p3264a.AbstractC56263a;
import com.p2082ss.android.ugc.aweme.p3070im.service.share.p3264a.AbstractC56264b;
import com.p2082ss.android.ugc.aweme.p3070im.service.share.p3265b.C56268a;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.aweme.social.p3916c.C74721a;
import com.p2082ss.android.ugc.aweme.social.p3916c.C74722b;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.widget.LongPressShareWidget */
public final class LongPressShareWidget extends Widget implements AbstractC33974au, AbstractC55948b, AbstractC56081a {

    /* renamed from: h */
    public static final C56039a f127772h = new C56039a((byte) 0);

    /* renamed from: a */
    final Context f127773a;

    /* renamed from: b */
    public final SharePanelViewModel f127774b;

    /* renamed from: c */
    public RecyclerView f127775c;

    /* renamed from: d */
    C56055a f127776d;

    /* renamed from: e */
    DmtEditText f127777e;

    /* renamed from: f */
    public final C56268a f127778f;

    /* renamed from: g */
    public final AbstractC56264b f127779g;

    /* renamed from: i */
    private C56036b f127780i;

    /* renamed from: j */
    private ViewGroup f127781j;

    /* renamed from: k */
    private C55971a f127782k;

    /* renamed from: l */
    private List<IMContact> f127783l = new ArrayList();

    /* renamed from: m */
    private TuxButton f127784m;

    /* renamed from: n */
    private RemoteImageView f127785n;

    /* renamed from: o */
    private final NestedScrollView.AbstractC0813b f127786o;

    static {
        Covode.recordClassIndex(65833);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3234b.p3235a.AbstractC55948b
    /* renamed from: b */
    public final void mo92817b(boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3234b.p3235a.AbstractC55948b
    /* renamed from: c */
    public final void mo92818c(boolean z) {
    }

    @Override // androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.base.Widget
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.widget.LongPressShareWidget$a */
    public static final class C56039a {
        static {
            Covode.recordClassIndex(65835);
        }

        private C56039a() {
        }

        public /* synthetic */ C56039a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.base.Widget
    /* renamed from: a */
    public final void mo92300a() {
        super.mo92300a();
        getLifecycle().mo4013b(this.f127774b);
    }

    /* renamed from: b */
    private static int m101890b() {
        C56256i iMSetting;
        AbstractC56220e b = C55076b.m100723b();
        if (b == null || (iMSetting = b.getIMSetting()) == null) {
            return 10;
        }
        return iMSetting.f128311c;
    }

    /* renamed from: c */
    private final void m101891c() {
        TextView textView = this.f127778f.f128348f;
        if (textView != null) {
            textView.setVisibility(0);
        }
        ViewGroup viewGroup = this.f127778f.f128344b;
        if (viewGroup == null) {
            C89219l.m154715b();
        }
        this.f127781j = viewGroup;
        m101892d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.widget.LongPressShareWidget$c */
    public static final class C56041c implements AbstractC55947a {

        /* renamed from: a */
        final /* synthetic */ LongPressShareWidget f127790a;

        /* renamed from: b */
        final /* synthetic */ String f127791b;

        /* renamed from: c */
        final /* synthetic */ SharePackage f127792c;

        /* renamed from: d */
        final /* synthetic */ List f127793d;

        /* renamed from: e */
        final /* synthetic */ String f127794e;

        static {
            Covode.recordClassIndex(65837);
        }

        C56041c(LongPressShareWidget longPressShareWidget, String str, SharePackage sharePackage, List list, String str2) {
            this.f127790a = longPressShareWidget;
            this.f127791b = str;
            this.f127792c = sharePackage;
            this.f127793d = list;
            this.f127794e = str2;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3234b.p3235a.AbstractC55947a
        /* renamed from: a */
        public final void mo92815a() {
            C55956g.m101813a(this.f127791b, this.f127792c, this.f127793d);
            AbstractC56264b bVar = this.f127790a.f127779g;
            SharePackage sharePackage = this.f127792c;
            this.f127793d.size();
            bVar.mo90151c(sharePackage);
            C55712b.m101459a(this.f127792c, this.f127794e, C89070n.m154585g((Collection) this.f127793d));
            if (C89219l.m154714a((Object) "live_event", (Object) this.f127792c.f155487d)) {
                for (IMContact iMContact : this.f127793d) {
                    C55708a.m101454a(C55708a.f127082a, "livesdk_live_event_share", this.f127792c, iMContact);
                }
            }
        }
    }

    /* renamed from: e */
    private final void m101893e() {
        View view;
        if (C56214i.m102128a() && (view = this.f127775c) != null) {
            while (view.getParent() != null && (view.getParent() instanceof View)) {
                if (view.getParent() instanceof NestedScrollView) {
                    ViewParent parent = view.getParent();
                    Objects.requireNonNull(parent, "null cannot be cast to non-null type androidx.core.widget.NestedScrollView");
                    NestedScrollView nestedScrollView = (NestedScrollView) parent;
                    if (nestedScrollView != null) {
                        nestedScrollView.setOnScrollChangeListener(this.f127786o);
                        nestedScrollView.scrollBy(0, 1);
                        return;
                    }
                    return;
                }
                ViewParent parent2 = view.getParent();
                Objects.requireNonNull(parent2, "null cannot be cast to non-null type android.view.View");
                view = (View) parent2;
            }
        }
    }

    /* renamed from: f */
    private final void m101894f() {
        String sb;
        if (!this.f127774b.f127872c) {
            TuxButton tuxButton = this.f127784m;
            if (tuxButton == null) {
                C89219l.m154710a("sendTv");
            }
            if (this.f127774b.mo92938b().size() == 1) {
                TuxButton tuxButton2 = this.f127784m;
                if (tuxButton2 == null) {
                    C89219l.m154710a("sendTv");
                }
                sb = tuxButton2.getResources().getString(R.string.ch4);
            } else {
                C56055a aVar = this.f127776d;
                if (aVar == null || !aVar.f127842b) {
                    StringBuilder sb2 = new StringBuilder();
                    TuxButton tuxButton3 = this.f127784m;
                    if (tuxButton3 == null) {
                        C89219l.m154710a("sendTv");
                    }
                    sb = sb2.append(tuxButton3.getResources().getString(R.string.fic)).append('(').append(this.f127774b.mo92938b().size()).append(')').toString();
                } else {
                    sb = this.f127773a.getString(R.string.c61);
                }
            }
            tuxButton.setText(sb);
        }
    }

    /* renamed from: d */
    private final void m101892d() {
        ViewGroup viewGroup;
        MethodCollector.m26663i(4433);
        ViewGroup viewGroup2 = this.f127778f.f128344b;
        if (viewGroup2 != null) {
            viewGroup2.removeAllViews();
        }
        List<IMContact> list = this.f127783l;
        if (list != null) {
            for (T t : list) {
                if (t instanceof C55966a) {
                    C55994c cVar = new C55994c(this.f127778f.f128358j, this.f127774b);
                    cVar.mo92856a(t);
                    ViewGroup viewGroup3 = this.f127778f.f128344b;
                    if (viewGroup3 != null) {
                        viewGroup3.addView(cVar);
                    }
                } else {
                    C55989b bVar = new C55989b(this.f127778f.f128358j, this.f127774b, this.f127779g);
                    bVar.mo92854a(t);
                    ViewGroup viewGroup4 = this.f127778f.f128344b;
                    if (viewGroup4 != null) {
                        viewGroup4.addView(bVar);
                    }
                }
            }
        }
        List<IMContact> list2 = this.f127783l;
        if (list2 != null && !list2.isEmpty() && ((viewGroup = this.f127778f.f128344b) == null || viewGroup.getVisibility() != 0)) {
            ViewGroup viewGroup5 = this.f127778f.f128344b;
            if (viewGroup5 != null) {
                viewGroup5.setVisibility(0);
            }
            TextView textView = this.f127778f.f128348f;
            if (textView != null) {
                textView.setVisibility(0);
                MethodCollector.m26664o(4433);
                return;
            }
        }
        MethodCollector.m26664o(4433);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.widget.LongPressShareWidget$d */
    public static final class C56042d implements AbstractC56263a {

        /* renamed from: a */
        final /* synthetic */ LongPressShareWidget f127795a;

        static {
            Covode.recordClassIndex(65838);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C56042d(LongPressShareWidget longPressShareWidget) {
            this.f127795a = longPressShareWidget;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.service.share.p3264a.AbstractC56263a
        /* renamed from: a */
        public final void mo92900a(SharePackage sharePackage) {
            C89219l.m154721d(sharePackage, "");
            this.f127795a.f127779g.mo90151c(sharePackage);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.service.share.p3264a.AbstractC56263a
        /* renamed from: b */
        public final void mo92901b(SharePackage sharePackage) {
            C89219l.m154721d(sharePackage, "");
            this.f127795a.f127779g.mo90150b(sharePackage);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3234b.p3235a.AbstractC55948b
    /* renamed from: a */
    public final void mo92816a(boolean z) {
        this.f127774b.f127871b = z;
        C55971a aVar = this.f127782k;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
        m101894f();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.widget.LongPressShareWidget$b */
    static final class C56040b extends AbstractC89220m implements AbstractC89172b<C19638h, C89391z> {

        /* renamed from: a */
        final /* synthetic */ LongPressShareWidget f127789a;

        static {
            Covode.recordClassIndex(65836);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56040b(LongPressShareWidget longPressShareWidget) {
            super(1);
            this.f127789a = longPressShareWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C19638h hVar) {
            C19638h hVar2 = hVar;
            this.f127789a.mo92899d(false);
            if (hVar2 != null) {
                this.f127789a.f127778f.f128359k.f155492i.putBoolean("is_new_group", true);
                this.f127789a.mo92898c(C89070n.m154524c(C55082e.m100743b(hVar2)));
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.viewmodel.AbstractC56081a
    /* renamed from: a */
    public final void mo92894a(IMContact iMContact) {
        C89219l.m154721d(iMContact, "");
        C55971a aVar = this.f127782k;
        if (aVar != null) {
            C89219l.m154721d(iMContact, "");
            int i = 0;
            for (IMContact iMContact2 : aVar.mo92842a()) {
                if (!C89219l.m154714a(iMContact2, iMContact)) {
                    i++;
                } else if (i != -1) {
                    aVar.f127632a.add(Integer.valueOf(i));
                    aVar.notifyItemChanged(i, true);
                    return;
                } else {
                    return;
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.viewmodel.AbstractC56081a
    /* renamed from: b */
    public final void mo92897b(List<? extends IMContact> list) {
        C89219l.m154721d(list, "");
        C55971a aVar = this.f127782k;
        if (aVar != null) {
            C89219l.m154721d(list, "");
            int size = aVar.mo92842a().size() - 1;
            IMContact remove = aVar.mo92842a().remove(size);
            aVar.mo92842a().addAll(list);
            aVar.mo92842a().add(remove);
            aVar.notifyItemRangeInserted(size, list.size());
        }
    }

    /* renamed from: d */
    public final void mo92899d(boolean z) {
        this.f127774b.f127872c = z;
        TuxButton tuxButton = this.f127784m;
        if (tuxButton == null) {
            C89219l.m154710a("sendTv");
        }
        tuxButton.setLoading(z);
        if (z) {
            TuxButton tuxButton2 = this.f127784m;
            if (tuxButton2 == null) {
                C89219l.m154710a("sendTv");
            }
            tuxButton2.setBackgroundResource(R.color.bh);
            return;
        }
        C56055a aVar = this.f127776d;
        if (aVar != null) {
            aVar.f127843c = false;
        }
        TuxButton tuxButton3 = this.f127784m;
        if (tuxButton3 == null) {
            C89219l.m154710a("sendTv");
        }
        tuxButton3.setBackgroundResource(R.drawable.aqz);
        m101894f();
    }

    /* renamed from: a */
    private final void m101889a(C56253f fVar) {
        C55968c cVar;
        boolean z;
        this.f127778f.f128343a.dismiss();
        this.f127779g.mo90147a("chat_merge", this.f127778f.f128359k);
        C56042d dVar = new C56042d(this);
        String string = this.f127778f.f128359k.f155492i.getString("author_user_name", "");
        int i = this.f127778f.f128359k.f155492i.getInt("share_im_limit_tip_type", -1);
        Activity activity = null;
        if (i <= 0 || TextUtils.isEmpty(string)) {
            cVar = null;
        } else {
            C89219l.m154716b(string, "");
            cVar = new C55968c(string, i);
        }
        Context context = this.f127773a;
        if (context instanceof Activity) {
            activity = context;
        }
        Activity activity2 = activity;
        if (activity2 != null) {
            SharePackage sharePackage = this.f127778f.f128359k;
            Set<IMContact> e = this.f127774b.mo92941e();
            C56055a aVar = this.f127776d;
            if (aVar == null || !aVar.f127842b) {
                z = false;
            } else {
                z = true;
            }
            C56090a.m101987a(activity2, sharePackage, fVar, (Set<? extends IMContact>) e, true, (AbstractC56263a) dVar, z, cVar).show();
            C55059b.m100687a(this.f127778f.f128359k, "long_press");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.widget.LongPressShareWidget$e */
    static final class View$OnClickListenerC56043e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LongPressShareWidget f127796a;

        static {
            Covode.recordClassIndex(65839);
        }

        View$OnClickListenerC56043e(LongPressShareWidget longPressShareWidget) {
            this.f127796a = longPressShareWidget;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!this.f127796a.f127774b.f127872c && !C55232u.m101003a(view, 500)) {
                LongPressShareWidget longPressShareWidget = this.f127796a;
                if (!longPressShareWidget.f127779g.mo90149a(longPressShareWidget.f127778f.f128359k)) {
                    C56244a.m102185a("LongPressShareWidget", "cancel share by callback");
                    return;
                }
                List<IMContact> g = C89070n.m154585g((Collection) longPressShareWidget.f127774b.mo92938b());
                if (!g.isEmpty()) {
                    DmtEditText dmtEditText = longPressShareWidget.f127777e;
                    if (dmtEditText == null) {
                        C89219l.m154710a("editText");
                    }
                    Editable text = dmtEditText.getText();
                    if (text == null || text.length() <= 6000) {
                        C56055a aVar = longPressShareWidget.f127776d;
                        if (aVar == null || !aVar.f127842b) {
                            longPressShareWidget.mo92898c(g);
                            return;
                        }
                        C56055a aVar2 = longPressShareWidget.f127776d;
                        if (aVar2 != null) {
                            Boolean valueOf = Boolean.valueOf(aVar2.mo92914a(new C56040b(longPressShareWidget)));
                            if (valueOf.booleanValue()) {
                                valueOf.booleanValue();
                                longPressShareWidget.mo92899d(true);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    new C79459a(longPressShareWidget.f127773a).mo123050a(R.string.cey).mo123053a();
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.viewmodel.AbstractC56081a
    /* renamed from: a */
    public final void mo92895a(List<? extends IMContact> list) {
        C89219l.m154721d(list, "");
        if (list == null || list.isEmpty()) {
            RecyclerView recyclerView = this.f127775c;
            if (recyclerView != null) {
                recyclerView.setVisibility(8);
            }
            ViewGroup viewGroup = this.f127781j;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
                return;
            }
            return;
        }
        C55971a aVar = this.f127782k;
        Integer num = null;
        if (aVar != null) {
            List<IMContact> a = aVar.mo92842a();
            if (!(list == null || list.isEmpty() || a == null)) {
                a.clear();
                if (list == null) {
                    C89219l.m154715b();
                }
                a.addAll(list);
                a.add(new C55966a());
                aVar.notifyDataSetChanged();
            }
            StringBuilder sb = new StringBuilder("setData: ");
            if (list != null) {
                num = Integer.valueOf(list.size());
            }
            C56244a.m102190b("LongPressShareListAdapter", sb.append(num).append(", ").append(aVar.mo92842a().size()).toString());
            m101893e();
            C55940a.m101782a(this.f127778f.f128359k);
        } else if (this.f127781j != null) {
            C55966a aVar2 = new C55966a();
            List<IMContact> list2 = this.f127783l;
            if (list != null && !list.isEmpty() && list2 != null) {
                if (list == null) {
                    C89219l.m154715b();
                }
                if (list.size() > 3) {
                    list = list.subList(0, 3);
                }
                list2.clear();
                if (list == null) {
                    C89219l.m154715b();
                }
                list2.addAll(list);
                list2.add(aVar2);
                m101892d();
            }
        }
    }

    /* renamed from: c */
    public final void mo92898c(List<IMContact> list) {
        SharePackage sharePackage = this.f127778f.f128359k;
        sharePackage.f155492i.putInt("friends_shared_cnt", C55191a.m100904a(list));
        String str = null;
        if (list.size() > 1) {
            C55940a.m101783a(sharePackage, (BaseContent) null, list.size());
        }
        this.f127779g.mo90150b(sharePackage);
        String a = C55058a.m100681a();
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            if (t instanceof IMUser) {
                arrayList.add(t);
            }
        }
        ArrayList<IMUser> arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(C89070n.m154526a((Iterable) arrayList2, 10));
        for (IMUser iMUser : arrayList2) {
            arrayList3.add(iMUser.getUid());
        }
        String obj = arrayList3.toString();
        Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
        String substring = obj.substring(1, obj.length() - 1);
        C89219l.m154716b(substring, "");
        int size = arrayList2.size();
        Bundle bundle = this.f127778f.f128359k.f155492i;
        bundle.putString("shareIdList", substring);
        bundle.putInt("chat_cnt", size);
        bundle.putInt("group_chat_cnt", list.size() - size);
        DmtEditText dmtEditText = this.f127777e;
        if (dmtEditText == null) {
            C89219l.m154710a("editText");
        }
        Editable text = dmtEditText.getText();
        if (text != null) {
            str = text.toString();
        }
        DmtEditText dmtEditText2 = this.f127777e;
        if (dmtEditText2 == null) {
            C89219l.m154710a("editText");
        }
        KeyboardUtils.m70897c(dmtEditText2);
        C56041c cVar = new C56041c(this, a, sharePackage, list, str);
        ArrayList arrayList4 = new ArrayList();
        for (T t2 : list) {
            if (t2 instanceof IMConversation) {
                arrayList4.add(t2);
            }
        }
        if (!arrayList4.isEmpty()) {
            C55949a.m101802a(list, str, sharePackage, (BaseContent) null, a, (String) null, cVar);
        } else {
            C55949a.m101804a(list, str, sharePackage, a, false, (AbstractC55947a) cVar);
        }
    }

    public LongPressShareWidget(C56268a aVar, AbstractC56264b bVar) {
        SharePackage sharePackage;
        Bundle bundle;
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(bVar, "");
        MethodCollector.m26663i(5036);
        this.f127778f = aVar;
        this.f127779g = bVar;
        Context context = aVar.f128358j;
        this.f127773a = context;
        create();
        aVar.f128359k.f155492i.putString("enter_method", "long_press");
        SharePanelViewModel a = SharePanelViewModel.C56071a.m101975a(aVar.f128359k, this, aVar.f128350h, C55732c.EnumC55734b.LONG_PRESS, 0, 16);
        this.f127774b = a;
        getLifecycle().mo4012a(a);
        if (aVar.f128346d != null) {
            RecyclerView recyclerView = aVar.f128346d;
            if (recyclerView == null) {
                C89219l.m154715b();
            }
            this.f127775c = recyclerView;
            C55971a aVar2 = new C55971a(a, bVar);
            this.f127782k = aVar2;
            RecyclerView recyclerView2 = this.f127775c;
            if (recyclerView2 != null) {
                recyclerView2.setAdapter(aVar2);
            }
            RecyclerView recyclerView3 = this.f127775c;
            if (recyclerView3 != null) {
                recyclerView3.setLayoutManager(new LinearLayoutManager(1, false));
            }
            FrameLayout frameLayout = aVar.f128345c;
            if (!(frameLayout == null || (sharePackage = a.f127873d) == null || (bundle = sharePackage.f155492i) == null)) {
                String string = bundle.getString("author_user_name", null);
                int i = bundle.getInt("share_im_limit_tip_type", -1);
                if (i > 0 && !TextUtils.isEmpty(string)) {
                    C56036b bVar2 = new C56036b(context, (byte) 0);
                    this.f127780i = bVar2;
                    bVar2.setWidget(this);
                    frameLayout.addView(this.f127780i);
                    C56036b bVar3 = this.f127780i;
                    if (bVar3 != null) {
                        C89219l.m154716b(string, "");
                        bVar3.mo92889a(new C55968c(string, i));
                    }
                }
            }
            if (C56204e.m102119c()) {
                View a2 = C1764a.m5927a(LayoutInflater.from(context), R.layout.a7f, aVar.f128347e, true);
                View findViewById = a2.findViewById(R.id.cmw);
                C89219l.m154716b(findViewById, "");
                findViewById.setVisibility(0);
                View findViewById2 = a2.findViewById(R.id.cmv);
                C89219l.m154716b(findViewById2, "");
                this.f127777e = (DmtEditText) findViewById2;
                View findViewById3 = a2.findViewById(R.id.cmu);
                C89219l.m154716b(findViewById3, "");
                this.f127785n = (RemoteImageView) findViewById3;
                DmtEditText dmtEditText = this.f127777e;
                if (dmtEditText == null) {
                    C89219l.m154710a("editText");
                }
                InputFilter[] inputFilterArr = new InputFilter[1];
                DmtEditText dmtEditText2 = this.f127777e;
                if (dmtEditText2 == null) {
                    C89219l.m154710a("editText");
                }
                inputFilterArr[0] = new C55172ad(dmtEditText2);
                dmtEditText.setFilters(inputFilterArr);
                View a3 = C1764a.m5927a(LayoutInflater.from(context), R.layout.a7g, aVar.f128347e, true);
                View findViewById4 = a3.findViewById(R.id.dv_);
                C89219l.m154716b(findViewById4, "");
                TuxButton tuxButton = (TuxButton) findViewById4;
                this.f127784m = tuxButton;
                if (tuxButton == null) {
                    C89219l.m154710a("sendTv");
                }
                tuxButton.setVisibility(0);
                TuxButton tuxButton2 = this.f127784m;
                if (tuxButton2 == null) {
                    C89219l.m154710a("sendTv");
                }
                tuxButton2.setOnClickListener(new View$OnClickListenerC56043e(this));
                if (C55213i.m100955a()) {
                    View findViewById5 = a3.findViewById(R.id.bc6);
                    C89219l.m154716b(findViewById5, "");
                    View findViewById6 = a3.findViewById(R.id.a4l);
                    C89219l.m154716b(findViewById6, "");
                    C56055a aVar3 = new C56055a(new C55967b((LinearLayout) findViewById5, (TuxCheckBox) findViewById6), aVar.f128359k, this);
                    aVar3.mo92917c();
                    this.f127776d = aVar3;
                }
            }
        } else if (aVar.f128344b != null) {
            m101891c();
        }
        this.f127786o = new NestedScrollView.AbstractC0813b(this) {
            /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.p3241ui.widget.LongPressShareWidget.C560381 */

            /* renamed from: a */
            final /* synthetic */ LongPressShareWidget f127787a;

            /* renamed from: b */
            private int f127788b;

            static {
                Covode.recordClassIndex(65834);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f127787a = r1;
            }

            @Override // androidx.core.widget.NestedScrollView.AbstractC0813b
            /* renamed from: a */
            public final void mo381a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
                C74721a aVar;
                String str;
                Bundle bundle;
                C89219l.m154721d(nestedScrollView, "");
                NestedScrollView.AbstractC0813b bVar = this.f127787a.f127778f.f128351i;
                if (bVar != null) {
                    bVar.mo381a(nestedScrollView, i, i2, i3, i4);
                }
                RecyclerView recyclerView = this.f127787a.f127775c;
                if (recyclerView != null) {
                    int childCount = recyclerView.getChildCount();
                    for (int i5 = this.f127788b; i5 < childCount; i5++) {
                        RecyclerView.ViewHolder a = recyclerView.mo4392a(i5, false);
                        if (a != null) {
                            int top = recyclerView.getTop();
                            View view = a.itemView;
                            C89219l.m154716b(view, "");
                            if (top + view.getTop() < nestedScrollView.getHeight() + i2) {
                                if (!(a instanceof C55997d)) {
                                    a = null;
                                }
                                C55997d dVar = (C55997d) a;
                                if (!(dVar == null || (aVar = dVar.f127685a) == null)) {
                                    SharePanelViewModel sharePanelViewModel = this.f127787a.f127774b;
                                    C89219l.m154721d(aVar, "");
                                    C55219n nVar = sharePanelViewModel.f127877h;
                                    String uid = aVar.getUid();
                                    if (!TextUtils.isEmpty(uid)) {
                                        nVar.f126297a.edit().putInt("maf_user_show_count_".concat(String.valueOf(uid)), nVar.mo92201a(uid) + 1).commit();
                                    }
                                    C59256u uVar = new C59256u();
                                    SharePackage sharePackage = sharePanelViewModel.f127873d;
                                    if (sharePackage == null || (bundle = sharePackage.f155492i) == null || (str = bundle.getString("enter_from")) == null) {
                                        str = "";
                                    }
                                    C59256u a2 = uVar.mo96834a(str);
                                    a2.f135350a = C59256u.EnumC59259c.CARD;
                                    C59256u a3 = a2.mo96832a(C74722b.m131180a(aVar));
                                    a3.f135352b = C59256u.EnumC59257a.SHOW;
                                    a3.mo96837o("long_press").mo96792f();
                                }
                            } else {
                                this.f127788b = i5;
                                return;
                            }
                        }
                    }
                    this.f127788b = recyclerView.getChildCount();
                }
            }
        };
        a.mo92940d();
        MethodCollector.m26664o(5036);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0028, code lost:
        if (r19 != false) goto L_0x002a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00dd  */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.viewmodel.AbstractC56081a
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo92896a(com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact r18, boolean r19) {
        /*
        // Method dump skipped, instructions count: 377
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.p3241ui.widget.LongPressShareWidget.mo92896a(com.ss.android.ugc.aweme.im.service.model.IMContact, boolean):boolean");
    }
}
