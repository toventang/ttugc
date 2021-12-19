package com.p2082ss.android.ugc.aweme.share;

import android.app.Activity;
import android.app.Dialog;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.core.content.C0643b;
import androidx.core.p037h.C0792v;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1722h.C23163i;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.base.utils.C34723i;
import com.p2082ss.android.ugc.aweme.experiment.C46971gf;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3171b.C55058a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3220a.C55708a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3220a.C55712b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3234b.C55946a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3234b.p3235a.AbstractC55947a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3234b.p3236b.C55949a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3234b.p3236b.C55956g;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.p3238a.p3239a.C55966a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.p3241ui.p3242a.C55974b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.viewmodel.AbstractC56081a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.viewmodel.SharePanelViewModel;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.u16.controller.IMUnder16ProxyImpl;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMConversation;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3260j.AbstractC56234c;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import com.p2082ss.android.ugc.aweme.p3070im.service.share.p3264a.AbstractC56264b;
import com.p2082ss.android.ugc.aweme.share.p3743a.C68848a;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.C69684e;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.bar.MicroShareChannelBar;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.ak */
public final class C68866ak extends C69295m implements AbstractC56081a {

    /* renamed from: q */
    public static final C68867a f154033q = new C68867a((byte) 0);

    /* renamed from: p */
    public final AbstractC56264b f154034p;

    /* renamed from: r */
    private C55974b f154035r;

    /* renamed from: s */
    private TuxTextView f154036s = ((TuxTextView) this.f154120a.findViewById(R.id.euz));

    /* renamed from: t */
    private final Activity f154037t;

    /* renamed from: u */
    private final Aweme f154038u;

    static {
        Covode.recordClassIndex(81167);
    }

    /* renamed from: com.ss.android.ugc.aweme.share.ak$a */
    public static final class C68867a {
        static {
            Covode.recordClassIndex(81168);
        }

        private C68867a() {
        }

        public /* synthetic */ C68867a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.dmt.p1194ui.frameworkui.AbstractC17242a, com.p2082ss.android.ugc.aweme.share.AbstractC68904d
    /* renamed from: a */
    public final void mo27278a() {
        if (!C46971gf.m90249b()) {
            mo109462f();
        }
    }

    @Override // com.bytedance.ies.dmt.p1194ui.frameworkui.AbstractC17242a, com.p2082ss.android.ugc.aweme.share.AbstractC68904d
    /* renamed from: b */
    public final void mo27279b() {
        if (C46971gf.m90249b()) {
            mo109462f();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.ak$b */
    static final class C68868b implements AbstractC55947a {

        /* renamed from: a */
        final /* synthetic */ C68866ak f154039a;

        /* renamed from: b */
        final /* synthetic */ String f154040b;

        /* renamed from: c */
        final /* synthetic */ List f154041c;

        static {
            Covode.recordClassIndex(81169);
        }

        C68868b(C68866ak akVar, String str, List list) {
            this.f154039a = akVar;
            this.f154040b = str;
            this.f154041c = list;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3234b.p3235a.AbstractC55947a
        /* renamed from: a */
        public final void mo92815a() {
            C55956g.m101813a(this.f154040b, this.f154039a.f154129j.f155557i, this.f154041c);
            AbstractC56264b bVar = this.f154039a.f154034p;
            if (bVar != null) {
                SharePackage sharePackage = this.f154039a.f154129j.f155557i;
                this.f154041c.size();
                bVar.mo90151c(sharePackage);
            }
            C55712b.m101459a(this.f154039a.f154129j.f155557i, "", C89070n.m154585g((Collection) this.f154041c));
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.share.AbstractC68904d
    /* renamed from: e */
    public final void mo109442e() {
        if (C46971gf.m90249b()) {
            Activity activity = this.f154122c;
            C89219l.m154716b(activity, "");
            Window window = activity.getWindow();
            C89219l.m154716b(window, "");
            showAtLocation(window.getDecorView(), 80, 0, -C34723i.m70932e(this.f154037t));
            return;
        }
        super.mo109442e();
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.viewmodel.AbstractC56081a
    /* renamed from: a */
    public final void mo92894a(IMContact iMContact) {
        C89219l.m154721d(iMContact, "");
        C89219l.m154721d(iMContact, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.viewmodel.AbstractC56081a
    /* renamed from: b */
    public final void mo92897b(List<? extends IMContact> list) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(list, "");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005e, code lost:
        if (r1.equals(r0) != false) goto L_0x0030;
     */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.viewmodel.AbstractC56081a
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo92895a(java.util.List<? extends com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact> r4) {
        /*
        // Method dump skipped, instructions count: 124
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.share.C68866ak.mo92895a(java.util.List):void");
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.viewmodel.AbstractC56081a
    /* renamed from: a */
    public final boolean mo92896a(IMContact iMContact, boolean z) {
        C89219l.m154721d(iMContact, "");
        if (IMUnder16ProxyImpl.m102047n().mo93021c()) {
            IMUnder16ProxyImpl.m102047n().mo93026h();
            return false;
        } else if (!(iMContact instanceof C55966a) || this == null) {
            AbstractC56264b bVar = this.f154034p;
            if (bVar == null || bVar.mo90149a(this.f154129j.f155557i)) {
                List c = C89070n.m154524c(iMContact);
                this.f154129j.f155557i.f155492i.putBoolean("is_ad", this.f154038u.isAd());
                C55708a.m101453a(C55708a.f127082a, this.f154129j.f155557i, iMContact, false, null, 0, null, null, 120);
                String a = C55058a.m100681a();
                SharePackage sharePackage = this.f154129j.f155557i;
                AbstractC56264b bVar2 = this.f154034p;
                if (bVar2 != null) {
                    bVar2.mo90150b(sharePackage);
                }
                C55946a.m101789a(this.f154129j.f155557i, c);
                SharePackage sharePackage2 = this.f154129j.f155557i;
                C89219l.m154721d(sharePackage2, "");
                C89219l.m154721d(iMContact, "");
                sharePackage2.f155492i.putInt("is_create_group_chat", 0);
                if (iMContact instanceof IMUser) {
                    sharePackage2.f155492i.putInt("friends_shared_cnt", 1);
                } else if (iMContact instanceof IMConversation) {
                    sharePackage2.f155492i.putInt("friends_shared_cnt", ((IMConversation) iMContact).getConversationMemberCount());
                }
                C68868b bVar3 = new C68868b(this, a, c);
                ArrayList arrayList = new ArrayList();
                for (Object obj : c) {
                    if (obj instanceof IMConversation) {
                        arrayList.add(obj);
                    }
                }
                if (!arrayList.isEmpty()) {
                    C55949a.m101802a(c, "", this.f154129j.f155557i, (BaseContent) null, a, (String) null, bVar3);
                } else {
                    C55949a.m101804a((List<IMContact>) c, "", this.f154129j.f155557i, a, false, (AbstractC55947a) bVar3);
                }
                mo85245d();
                return false;
            }
            C56244a.m102185a("ShareSuccessPopWindow", "cancel share by callback");
            return false;
        } else {
            AbstractC56234c shareService = IMService.createIIMServicebyMonsterPlugin(false).getShareService();
            if (shareService != null) {
                Activity activity = this.f154037t;
                C69684e.C69686b bVar4 = new C69684e.C69686b();
                bVar4.f155583n = this.f154129j.f155557i;
                Dialog a2 = shareService.mo92292a(activity, bVar4.mo109831a(), null, 0, this.f154034p);
                if (a2 != null) {
                    a2.show();
                }
            }
            C55708a.m101453a(C55708a.f127082a, this.f154129j.f155557i, null, true, null, 0, null, null, 120);
            mo85245d();
            return false;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68866ak(Activity activity, C69684e eVar, Aweme aweme, AbstractC56264b bVar) {
        super(activity, eVar, aweme);
        int i;
        C89219l.m154721d(activity, "");
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(aweme, "");
        this.f154037t = activity;
        this.f154038u = aweme;
        this.f154034p = bVar;
        RemoteImageView remoteImageView = this.f154121b;
        C89219l.m154716b(remoteImageView, "");
        remoteImageView.setVisibility(8);
        this.f154129j.f155557i.f155492i.putString("enter_method", "publish_then_share");
        this.f154129j.f155557i.f155492i.putString("enter_from", "publish_share_panel");
        if (C46971gf.m90249b()) {
            i = R.drawable.bii;
            setAnimationStyle(R.style.v7);
            setOutsideTouchable(true);
            setFocusable(true);
            int dimensionPixelOffset = activity.getResources().getDimensionPixelOffset(R.dimen.sj);
            int dimensionPixelOffset2 = activity.getResources().getDimensionPixelOffset(R.dimen.sh);
            int dimensionPixelOffset3 = activity.getResources().getDimensionPixelOffset(R.dimen.si);
            LinearLayout linearLayout = this.f154128i;
            if (linearLayout != null) {
                linearLayout.setPadding(0, dimensionPixelOffset3, 0, dimensionPixelOffset);
            }
            C11279p.m19999a(((C69295m) this).f154857n, dimensionPixelOffset);
            MicroShareChannelBar microShareChannelBar = this.f154131l;
            if (microShareChannelBar != null) {
                C23163i.m43668b(microShareChannelBar, 0, Integer.valueOf(dimensionPixelOffset), 0, 0, false, 16);
            }
            TuxTextView tuxTextView = this.f154036s;
            if (tuxTextView != null) {
                C23163i.m43668b(tuxTextView, Integer.valueOf(dimensionPixelOffset2), 0, 0, 0, false, 16);
            }
        } else {
            int dimensionPixelOffset4 = activity.getResources().getDimensionPixelOffset(R.dimen.sj);
            LinearLayout linearLayout2 = this.f154128i;
            C89219l.m154716b(linearLayout2, "");
            C23163i.m43668b(linearLayout2, Integer.valueOf(dimensionPixelOffset4), Integer.valueOf(dimensionPixelOffset4), Integer.valueOf(dimensionPixelOffset4), Integer.valueOf(dimensionPixelOffset4), false, 16);
            i = R.drawable.big;
        }
        C0792v.m2746a(this.f154128i, C0643b.m2369a(activity, i));
        if (C46971gf.m90248a() != 1 && !IMUnder16ProxyImpl.m102047n().mo93022d()) {
            SharePanelViewModel a = SharePanelViewModel.C56071a.m101975a(this.f154129j.f155557i, this, C89086z.INSTANCE, null, 0, 24);
            a.mo92940d();
            this.f154035r = new C68848a(activity, a);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0, false);
            RecyclerView recyclerView = ((C69295m) this).f154857n;
            if (recyclerView != null) {
                recyclerView.setAdapter(this.f154035r);
                recyclerView.setLayoutManager(linearLayoutManager);
                return;
            }
            return;
        }
        RecyclerView recyclerView2 = ((C69295m) this).f154857n;
        if (recyclerView2 != null) {
            recyclerView2.setVisibility(8);
        }
    }
}
