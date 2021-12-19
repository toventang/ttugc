package com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.p3241ui.widget;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1213t;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.extensions.C12793o;
import com.bytedance.assem.arch.extensions.C12794p;
import com.bytedance.assem.arch.extensions.C12795q;
import com.bytedance.assem.arch.extensions.C12796r;
import com.bytedance.assem.arch.viewModel.AbstractC12846h;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.C12854k;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.widget.DmtEditText;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.lighten.p1477a.p1480c.AbstractC20728e;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.bytedance.tiktok.proxy.AbstractC22876d;
import com.bytedance.tiktok.proxy.AbstractC22878f;
import com.bytedance.tiktok.proxy.AbstractC22880h;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxCheckBox;
import com.bytedance.tux.p1710c.C23008e;
import com.bytedance.tux.p1710c.C23009f;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p2082ss.android.ugc.aweme.comment.model.Comment;
import com.p2082ss.android.ugc.aweme.p2316ap.C33521a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3171b.C55058a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3171b.C55059b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55076b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55082e;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55172ad;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55213i;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55232u;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.p3184b.C55191a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.base.Widget;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.C55327b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.DialogC55319a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.p3223b.C55732c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3220a.C55708a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3220a.C55712b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3233a.C55940a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3234b.p3235a.AbstractC55948b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3234b.p3236b.C55949a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3234b.p3236b.C55956g;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3234b.p3236b.C55957h;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.p3238a.p3239a.C55967b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.p3238a.p3239a.C55968c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.p3241ui.p3242a.C55974b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.p3241ui.p3243b.C55977a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.p3241ui.view.C56034a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.p3241ui.view.C56036b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.viewmodel.AbstractC56081a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.viewmodel.SharePanelAndroidViewModel;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.viewmodel.SharePanelViewModel;
import com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56220e;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56251d;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56256i;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import com.p2082ss.android.ugc.aweme.p3070im.service.share.p3264a.AbstractC56263a;
import com.p2082ss.android.ugc.aweme.p3070im.service.share.p3264a.AbstractC56266c;
import com.p2082ss.android.ugc.aweme.p3070im.service.share.p3265b.C56269b;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.share.improve.pkg.CommentSharePackage;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.aweme.social.p3914a.C74710e;
import com.p2082ss.android.ugc.aweme.social.p3916c.C74721a;
import com.p2082ss.android.ugc.aweme.social.p3916c.C74722b;
import com.p2082ss.android.ugc.aweme.social.widget.C74743a;
import com.p2082ss.android.ugc.aweme.social.widget.card.AbstractC74782d;
import com.p2082ss.android.ugc.aweme.social.widget.card.C74787i;
import com.p2082ss.android.ugc.aweme.upvote.publish.AbstractC79925a;
import com.p2082ss.android.ugc.aweme.upvote.service.C80034a;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89599cu;
import kotlinx.coroutines.C89624i;
import kotlinx.coroutines.internal.C89632e;
import kotlinx.coroutines.internal.C89652o;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.widget.SharePanelWidget */
public final class SharePanelWidget extends Widget implements AbstractC12846h, AbstractC33974au, AbstractC55948b, AbstractC56081a {

    /* renamed from: m */
    public static final C56044a f127797m = new C56044a((byte) 0);

    /* renamed from: a */
    public final Context f127798a;

    /* renamed from: b */
    public SharePanelViewModel f127799b;

    /* renamed from: c */
    public RecyclerView f127800c;

    /* renamed from: d */
    public C55974b f127801d;

    /* renamed from: e */
    public View f127802e;

    /* renamed from: f */
    DmtEditText f127803f;

    /* renamed from: g */
    public C56055a f127804g;

    /* renamed from: h */
    public C56036b f127805h;

    /* renamed from: i */
    public AbstractC74782d f127806i;

    /* renamed from: j */
    public boolean f127807j;

    /* renamed from: k */
    public final C56269b f127808k;

    /* renamed from: l */
    public final AbstractC56266c f127809l;

    /* renamed from: n */
    private RemoteImageView f127810n;

    /* renamed from: o */
    private TuxButton f127811o;

    /* renamed from: p */
    private LinearLayout f127812p;

    /* renamed from: q */
    private TuxIconView f127813q;

    /* renamed from: r */
    private C55968c f127814r;

    /* renamed from: s */
    private boolean f127815s;

    /* renamed from: t */
    private boolean f127816t;

    /* renamed from: u */
    private boolean f127817u;

    static {
        Covode.recordClassIndex(65840);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3234b.p3235a.AbstractC55948b
    /* renamed from: b */
    public final void mo92817b(boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3234b.p3235a.AbstractC55948b
    /* renamed from: c */
    public final void mo92818c(boolean z) {
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public final boolean getHasSubscribedForReused() {
        return false;
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public final AbstractC1204m getHostLifecycleOwner() {
        return null;
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public final AbstractC22876d getReceiverForHostVM() {
        return null;
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.base.Widget
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.widget.SharePanelWidget$a */
    public static final class C56044a {
        static {
            Covode.recordClassIndex(65841);
        }

        private C56044a() {
        }

        public /* synthetic */ C56044a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.tiktok.proxy.AbstractC22878f
    public final AbstractC1204m getActualLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public final AbstractC22878f getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // com.bytedance.tiktok.proxy.AbstractC22880h
    public final AbstractC22876d getActualReceiver() {
        return this;
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public final AbstractC22880h<AbstractC22876d> getActualReceiverHolder() {
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0141, code lost:
        if (r21 != false) goto L_0x0143;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01cb  */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.viewmodel.AbstractC56081a
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo92896a(com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact r20, boolean r21) {
        /*
        // Method dump skipped, instructions count: 548
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.p3241ui.widget.SharePanelWidget.mo92896a(com.ss.android.ugc.aweme.im.service.model.IMContact, boolean):boolean");
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3234b.p3235a.AbstractC55948b
    /* renamed from: a */
    public final void mo92816a(boolean z) {
        SharePanelViewModel sharePanelViewModel = this.f127799b;
        if (sharePanelViewModel == null) {
            C89219l.m154710a("viewModel");
        }
        sharePanelViewModel.f127871b = z;
        C55974b bVar = this.f127801d;
        if (bVar == null) {
            C89219l.m154710a("headAdapter");
        }
        bVar.notifyDataSetChanged();
        mo92905c();
    }

    /* renamed from: a */
    public final void mo92903a(List<? extends User> list, boolean z) {
        AbstractC74782d dVar = this.f127806i;
        C56049f fVar = new C56049f(this, z);
        if (dVar != null) {
            dVar.mo117839a(list);
            dVar.mo117837a(fVar);
        } else {
            ActivityC0945e a = C33521a.m68685a(this.f127798a);
            String string = this.f127808k.f128359k.f155492i.getString("enter_from");
            if (string == null) {
                string = "";
            }
            C89219l.m154716b(string, "");
            dVar = C74787i.f168102a.mo117804a(new C74743a(a, null, string, null, 10), C74710e.m131167a());
            dVar.mo117839a(list);
            dVar.mo117837a(fVar);
            dVar.mo117838a(new C56048e(dVar, this, list, fVar));
            this.f127806i = dVar;
        }
        dVar.mo117841b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.widget.SharePanelWidget$f */
    public static final class C56049f extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ SharePanelWidget f127828a;

        /* renamed from: b */
        final /* synthetic */ boolean f127829b;

        static {
            Covode.recordClassIndex(65846);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56049f(SharePanelWidget sharePanelWidget, boolean z) {
            super(0);
            this.f127828a = sharePanelWidget;
            this.f127829b = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            AbstractC74782d dVar;
            if (this.f127829b) {
                AbstractC81915c.m141874a(new C56251d((byte) 0));
            }
            if (this.f127828a.f127807j && (dVar = this.f127828a.f127806i) != null) {
                dVar.mo117843d();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.widget.SharePanelWidget$j */
    static final class C56053j extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ SharePanelWidget f127837a;

        static {
            Covode.recordClassIndex(65850);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56053j(SharePanelWidget sharePanelWidget) {
            super(0);
            this.f127837a = sharePanelWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f127837a.f127809l.mo90147a("chat_merge", this.f127837a.f127808k.f128359k);
            return C89391z.f203057a;
        }
    }

    /* renamed from: d */
    static int m101910d() {
        C56256i iMSetting;
        AbstractC56220e b = C55076b.m100723b();
        if (b == null || (iMSetting = b.getIMSetting()) == null) {
            return 10;
        }
        return iMSetting.f128311c;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.base.Widget
    /* renamed from: a */
    public final void mo92300a() {
        super.mo92300a();
        AbstractC74782d dVar = this.f127806i;
        if (dVar != null && dVar.mo117840a()) {
            dVar.mo117843d();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo92908e() {
        String string = this.f127798a.getString(R.string.ci4, Integer.valueOf(m101910d()));
        C89219l.m154716b(string, "");
        Context context = this.f127798a;
        Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
        new C23144b((Activity) context).mo37635a(string).mo37637b();
    }

    /* renamed from: b */
    public final void mo92904b() {
        C1213t<Boolean> a;
        SharePanelViewModel sharePanelViewModel = this.f127799b;
        if (sharePanelViewModel == null) {
            C89219l.m154710a("viewModel");
        }
        boolean z = false;
        if (!sharePanelViewModel.mo92938b().isEmpty() || this.f127816t) {
            View view = this.f127802e;
            if (view == null) {
                C89219l.m154710a("editLayout");
            }
            view.setVisibility(0);
            C56036b bVar = this.f127805h;
            if (bVar != null) {
                bVar.setVisibility(0);
            }
            RemoteImageView remoteImageView = this.f127810n;
            if (remoteImageView == null) {
                C89219l.m154710a("shareCover");
            }
            DialogC55319a.m101128a(remoteImageView, this.f127808k.f128359k, (Boolean) false);
            SharePackage sharePackage = this.f127808k.f128359k;
            View view2 = this.f127802e;
            if (view2 == null) {
                C89219l.m154710a("editLayout");
            }
            C55977a.m101851a(sharePackage, view2);
        } else {
            View view3 = this.f127802e;
            if (view3 == null) {
                C89219l.m154710a("editLayout");
            }
            view3.setVisibility(8);
            C56036b bVar2 = this.f127805h;
            if (bVar2 != null) {
                bVar2.setVisibility(8);
            }
            DmtEditText dmtEditText = this.f127803f;
            if (dmtEditText == null) {
                C89219l.m154710a("editText");
            }
            KeyboardUtils.m70897c(dmtEditText);
        }
        SharePanelAndroidViewModel a2 = SharePanelAndroidViewModel.C56069a.m101961a(this.f127798a);
        if (a2 != null && (a = a2.mo92934a()) != null) {
            View view4 = this.f127802e;
            if (view4 == null) {
                C89219l.m154710a("editLayout");
            }
            if (view4.getVisibility() == 0) {
                z = true;
            }
            a.setValue(Boolean.valueOf(z));
        }
    }

    /* renamed from: c */
    public final void mo92905c() {
        String sb;
        SharePanelViewModel sharePanelViewModel = this.f127799b;
        if (sharePanelViewModel == null) {
            C89219l.m154710a("viewModel");
        }
        if (!sharePanelViewModel.f127872c) {
            View findViewById = this.f127808k.f128356e.findViewById(R.id.dyf);
            SharePanelViewModel sharePanelViewModel2 = this.f127799b;
            if (sharePanelViewModel2 == null) {
                C89219l.m154710a("viewModel");
            }
            boolean z = false;
            if (!sharePanelViewModel2.mo92938b().isEmpty() || this.f127816t) {
                C89219l.m154716b(findViewById, "");
                findViewById.setVisibility(8);
                TuxButton tuxButton = this.f127811o;
                if (tuxButton == null) {
                    C89219l.m154710a("sendTv");
                }
                tuxButton.setVisibility(0);
                TuxButton tuxButton2 = this.f127811o;
                if (tuxButton2 == null) {
                    C89219l.m154710a("sendTv");
                }
                SharePanelViewModel sharePanelViewModel3 = this.f127799b;
                if (sharePanelViewModel3 == null) {
                    C89219l.m154710a("viewModel");
                }
                if (sharePanelViewModel3.mo92938b().size() != 0) {
                    z = true;
                }
                tuxButton2.setEnabled(z);
                TuxButton tuxButton3 = this.f127811o;
                if (tuxButton3 == null) {
                    C89219l.m154710a("sendTv");
                }
                SharePanelViewModel sharePanelViewModel4 = this.f127799b;
                if (sharePanelViewModel4 == null) {
                    C89219l.m154710a("viewModel");
                }
                if (sharePanelViewModel4.mo92938b().size() <= 1) {
                    TuxButton tuxButton4 = this.f127811o;
                    if (tuxButton4 == null) {
                        C89219l.m154710a("sendTv");
                    }
                    sb = tuxButton4.getResources().getString(R.string.ch4);
                } else {
                    C56055a aVar = this.f127804g;
                    if (aVar == null || !aVar.f127842b) {
                        StringBuilder sb2 = new StringBuilder();
                        TuxButton tuxButton5 = this.f127811o;
                        if (tuxButton5 == null) {
                            C89219l.m154710a("sendTv");
                        }
                        StringBuilder append = sb2.append(tuxButton5.getResources().getString(R.string.fic)).append('(');
                        SharePanelViewModel sharePanelViewModel5 = this.f127799b;
                        if (sharePanelViewModel5 == null) {
                            C89219l.m154710a("viewModel");
                        }
                        sb = append.append(sharePanelViewModel5.mo92938b().size()).append(')').toString();
                    } else {
                        sb = this.f127798a.getString(R.string.c61);
                    }
                }
                tuxButton3.setText(sb);
                return;
            }
            C89219l.m154716b(findViewById, "");
            findViewById.setVisibility(0);
            TuxButton tuxButton6 = this.f127811o;
            if (tuxButton6 == null) {
                C89219l.m154710a("sendTv");
            }
            tuxButton6.setVisibility(8);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.widget.SharePanelWidget$d */
    public static final class C56047d implements AbstractC56263a {

        /* renamed from: a */
        final /* synthetic */ SharePanelWidget f127823a;

        static {
            Covode.recordClassIndex(65844);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C56047d(SharePanelWidget sharePanelWidget) {
            this.f127823a = sharePanelWidget;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.service.share.p3264a.AbstractC56263a
        /* renamed from: a */
        public final void mo92900a(SharePackage sharePackage) {
            C89219l.m154721d(sharePackage, "");
            this.f127823a.f127809l.mo90151c(sharePackage);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.service.share.p3264a.AbstractC56263a
        /* renamed from: b */
        public final void mo92901b(SharePackage sharePackage) {
            C89219l.m154721d(sharePackage, "");
            this.f127823a.f127809l.mo90150b(sharePackage);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C55974b m101909a(SharePanelWidget sharePanelWidget) {
        C55974b bVar = sharePanelWidget.f127801d;
        if (bVar == null) {
            C89219l.m154710a("headAdapter");
        }
        return bVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.viewmodel.AbstractC56081a
    /* renamed from: b */
    public final void mo92897b(List<? extends IMContact> list) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(list, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.widget.SharePanelWidget$c */
    static final class C56046c extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f127819a;

        /* renamed from: b */
        final /* synthetic */ List f127820b;

        /* renamed from: c */
        final /* synthetic */ SharePanelWidget f127821c;

        /* renamed from: d */
        final /* synthetic */ boolean f127822d;

        static {
            Covode.recordClassIndex(65843);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56046c(List list, AbstractC89124d dVar, SharePanelWidget sharePanelWidget, boolean z) {
            super(2, dVar);
            this.f127820b = list;
            this.f127821c = sharePanelWidget;
            this.f127822d = z;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C56046c(this.f127820b, dVar, this.f127821c, this.f127822d);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C56046c) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            if (this.f127819a == 0) {
                C89382r.m154942a(obj);
                this.f127821c.mo92903a(this.f127820b, true);
                return C89391z.f203057a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.widget.SharePanelWidget$b */
    static final class C56045b extends AbstractC89220m implements AbstractC89172b<C19638h, C89391z> {

        /* renamed from: a */
        final /* synthetic */ SharePanelWidget f127818a;

        static {
            Covode.recordClassIndex(65842);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56045b(SharePanelWidget sharePanelWidget) {
            super(1);
            this.f127818a = sharePanelWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C19638h hVar) {
            C19638h hVar2 = hVar;
            this.f127818a.mo92907d(false);
            if (hVar2 != null) {
                this.f127818a.f127808k.f128359k.f155492i.putBoolean("is_new_group", true);
                this.f127818a.mo92906c(C89070n.m154524c(C55082e.m100743b(hVar2)));
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.widget.SharePanelWidget$g */
    static final class C56050g extends AbstractC89220m implements AbstractC89172b<C23008e, C89391z> {

        /* renamed from: a */
        public static final C56050g f127830a = new C56050g();

        static {
            Covode.recordClassIndex(65847);
        }

        C56050g() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23008e eVar) {
            C23008e eVar2 = eVar;
            C89219l.m154721d(eVar2, "");
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            eVar2.f54464c = Float.valueOf(TypedValue.applyDimension(1, 4.0f, system.getDisplayMetrics()));
            eVar2.f54463b = Integer.valueOf((int) R.attr.w);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.widget.SharePanelWidget$h */
    public static final class C56051h extends AbstractC20728e {

        /* renamed from: a */
        final /* synthetic */ SharePanelWidget f127831a;

        /* renamed from: b */
        final /* synthetic */ String f127832b;

        /* renamed from: c */
        final /* synthetic */ String f127833c;

        /* renamed from: d */
        final /* synthetic */ String f127834d;

        /* renamed from: e */
        final /* synthetic */ TextView f127835e;

        static {
            Covode.recordClassIndex(65848);
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20737n
        /* renamed from: a */
        public final void mo34166a(Throwable th) {
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20737n
        /* renamed from: a */
        public final void mo34165a(Bitmap bitmap) {
            Context context = this.f127831a.f127798a;
            String str = this.f127832b;
            String str2 = this.f127833c;
            String str3 = this.f127834d;
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            SpannableStringBuilder a = CommentSharePackage.C69213a.m122323a(context, str, str2, str3, bitmap, C89241a.m154730a(TypedValue.applyDimension(1, 16.0f, system.getDisplayMetrics())));
            TextView textView = this.f127835e;
            C89219l.m154716b(textView, "");
            textView.setText(a);
        }

        C56051h(SharePanelWidget sharePanelWidget, String str, String str2, String str3, TextView textView) {
            this.f127831a = sharePanelWidget;
            this.f127832b = str;
            this.f127833c = str2;
            this.f127834d = str3;
            this.f127835e = textView;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.widget.SharePanelWidget$k */
    public static final class C56054k implements AbstractC79925a {

        /* renamed from: a */
        final /* synthetic */ SharePanelWidget f127838a;

        /* renamed from: b */
        final /* synthetic */ String f127839b;

        static {
            Covode.recordClassIndex(65851);
        }

        @Override // com.p2082ss.android.ugc.aweme.upvote.publish.AbstractC79925a
        /* renamed from: a */
        public final void mo92910a(String str) {
            C89219l.m154721d(str, "");
            if (C89219l.m154714a((Object) str, (Object) this.f127839b) && SharePanelWidget.m101909a(this.f127838a).getItemCount() > 0) {
                SharePanelWidget.m101909a(this.f127838a).notifyItemChanged(0);
            }
        }

        C56054k(SharePanelWidget sharePanelWidget, String str) {
            this.f127838a = sharePanelWidget;
            this.f127839b = str;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.widget.SharePanelWidget$e */
    public static final class C56048e extends AbstractC89220m implements AbstractC89172b<List<? extends IMUser>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC74782d f127824a;

        /* renamed from: b */
        final /* synthetic */ SharePanelWidget f127825b;

        /* renamed from: c */
        final /* synthetic */ List f127826c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89171a f127827d;

        static {
            Covode.recordClassIndex(65845);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56048e(AbstractC74782d dVar, SharePanelWidget sharePanelWidget, List list, AbstractC89171a aVar) {
            super(1);
            this.f127824a = dVar;
            this.f127825b = sharePanelWidget;
            this.f127826c = list;
            this.f127827d = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(List<? extends IMUser> list) {
            String str;
            List<? extends IMUser> list2 = list;
            C89219l.m154721d(list2, "");
            this.f127825b.f127808k.f128359k.f155492i.putBoolean("show_tips_until_cancel", false);
            SharePanelWidget sharePanelWidget = this.f127825b;
            SharePackage sharePackage = sharePanelWidget.f127808k.f128359k;
            sharePackage.f155492i.putString("is_share_pop_up", "1");
            DmtEditText dmtEditText = sharePanelWidget.f127803f;
            if (dmtEditText == null) {
                C89219l.m154710a("editText");
            }
            KeyboardUtils.m70897c(dmtEditText);
            if (!sharePanelWidget.f127807j) {
                sharePanelWidget.f127809l.mo90144a();
            }
            DmtEditText dmtEditText2 = sharePanelWidget.f127803f;
            if (dmtEditText2 == null) {
                C89219l.m154710a("editText");
            }
            Editable text = dmtEditText2.getText();
            if (text != null) {
                str = text.toString();
            } else {
                str = null;
            }
            C55949a.m101803a((List<IMContact>) list2, str, sharePackage, C55058a.m100681a());
            C55712b.m101459a(sharePackage, str, C89070n.m154585g((Collection) list2));
            this.f127824a.mo117842c();
            this.f127824a.mo117843d();
            return C89391z.f203057a;
        }
    }

    /* renamed from: d */
    public final void mo92907d(boolean z) {
        SharePanelViewModel sharePanelViewModel = this.f127799b;
        if (sharePanelViewModel == null) {
            C89219l.m154710a("viewModel");
        }
        sharePanelViewModel.f127872c = z;
        C55974b bVar = this.f127801d;
        if (bVar == null) {
            C89219l.m154710a("headAdapter");
        }
        bVar.notifyDataSetChanged();
        TuxButton tuxButton = this.f127811o;
        if (tuxButton == null) {
            C89219l.m154710a("sendTv");
        }
        tuxButton.setLoading(z);
        if (z) {
            TuxButton tuxButton2 = this.f127811o;
            if (tuxButton2 == null) {
                C89219l.m154710a("sendTv");
            }
            tuxButton2.setBackgroundResource(R.color.bh);
            return;
        }
        C56055a aVar = this.f127804g;
        if (aVar != null) {
            aVar.f127843c = false;
        }
        TuxButton tuxButton3 = this.f127811o;
        if (tuxButton3 == null) {
            C89219l.m154710a("sendTv");
        }
        tuxButton3.setBackgroundResource(R.drawable.aqz);
        mo92905c();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.widget.SharePanelWidget$i */
    static final class View$OnClickListenerC56052i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SharePanelWidget f127836a;

        static {
            Covode.recordClassIndex(65849);
        }

        View$OnClickListenerC56052i(SharePanelWidget sharePanelWidget) {
            this.f127836a = sharePanelWidget;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            SharePanelViewModel sharePanelViewModel = this.f127836a.f127799b;
            if (sharePanelViewModel == null) {
                C89219l.m154710a("viewModel");
            }
            if (!sharePanelViewModel.f127872c && !C55232u.m101003a(view, 500)) {
                SharePanelWidget sharePanelWidget = this.f127836a;
                if (!sharePanelWidget.f127809l.mo90149a(sharePanelWidget.f127808k.f128359k)) {
                    C56244a.m102185a("SharePanelWidget", "cancel share by callback");
                    return;
                }
                SharePanelViewModel sharePanelViewModel2 = sharePanelWidget.f127799b;
                if (sharePanelViewModel2 == null) {
                    C89219l.m154710a("viewModel");
                }
                List<IMContact> g = C89070n.m154585g((Collection) sharePanelViewModel2.mo92941e());
                boolean z = !g.isEmpty();
                SharePanelViewModel sharePanelViewModel3 = sharePanelWidget.f127799b;
                if (sharePanelViewModel3 == null) {
                    C89219l.m154710a("viewModel");
                }
                SharePackage sharePackage = sharePanelViewModel3.f127873d;
                String str = sharePackage != null ? sharePackage.f155487d : null;
                if (!(!C89219l.m154714a((Object) str, (Object) "aweme"))) {
                    Set<IMContact> b = sharePanelViewModel3.mo92938b();
                    ArrayList arrayList = new ArrayList();
                    for (T t : b) {
                        if (t instanceof C74721a) {
                            arrayList.add(t);
                        }
                    }
                    List<C74721a> a = C89070n.m154553a((Iterable) arrayList, (Comparator) SharePanelViewModel.C56074c.f127890a);
                    if (!a.isEmpty() && a != null) {
                        ArrayList arrayList2 = new ArrayList(C89070n.m154526a((Iterable) a, 10));
                        for (C74721a aVar : a) {
                            arrayList2.add(C74722b.m131180a(aVar));
                        }
                        ArrayList arrayList3 = arrayList2;
                        if (!arrayList3.isEmpty()) {
                            if (z) {
                                sharePanelWidget.f127808k.f128359k.f155492i.putBoolean("show_tips_until_cancel", true);
                                AbstractC89568bz unused = C89624i.m155555a(new C89632e(C89599cu.m155531a().plus(C89652o.f203399a)), null, null, new C56046c(arrayList3, null, sharePanelWidget, z), 3);
                            } else {
                                sharePanelWidget.mo92903a((List<? extends User>) arrayList3, false);
                            }
                        }
                    }
                }
                if (!g.isEmpty()) {
                    DmtEditText dmtEditText = sharePanelWidget.f127803f;
                    if (dmtEditText == null) {
                        C89219l.m154710a("editText");
                    }
                    Editable text = dmtEditText.getText();
                    if (text == null || text.length() <= 6000) {
                        C56055a aVar2 = sharePanelWidget.f127804g;
                        if (aVar2 == null || !aVar2.f127842b) {
                            C56055a aVar3 = sharePanelWidget.f127804g;
                            if (aVar3 == null || !aVar3.f127842b) {
                                SharePanelViewModel sharePanelViewModel4 = sharePanelWidget.f127799b;
                                if (sharePanelViewModel4 == null) {
                                    C89219l.m154710a("viewModel");
                                }
                                if (sharePanelViewModel4.mo92938b().size() >= SharePanelWidget.m101910d()) {
                                    sharePanelWidget.mo92908e();
                                    return;
                                }
                            }
                            sharePanelWidget.mo92906c(g);
                            return;
                        }
                        C56055a aVar4 = sharePanelWidget.f127804g;
                        if (aVar4 != null) {
                            Boolean valueOf = Boolean.valueOf(aVar4.mo92914a(new C56045b(sharePanelWidget)));
                            if (valueOf.booleanValue()) {
                                valueOf.booleanValue();
                                sharePanelWidget.mo92907d(true);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    Context context = sharePanelWidget.f127798a;
                    Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
                    new C23144b((Activity) context).mo37640e(R.string.cey).mo37637b();
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo92906c(List<IMContact> list) {
        SharePackage sharePackage = this.f127808k.f128359k;
        sharePackage.f155492i.putInt("friends_shared_cnt", C55191a.m100904a(list));
        String str = null;
        C55940a.m101783a(sharePackage, (BaseContent) null, list.size());
        String a = C55058a.m100681a();
        C55956g.m101813a(a, sharePackage, list);
        DmtEditText dmtEditText = this.f127803f;
        if (dmtEditText == null) {
            C89219l.m154710a("editText");
        }
        KeyboardUtils.m70897c(dmtEditText);
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
        Bundle bundle = this.f127808k.f128359k.f155492i;
        bundle.putString("shareIdList", substring);
        bundle.putInt("chat_cnt", size);
        bundle.putInt("group_chat_cnt", list.size() - size);
        this.f127807j = true;
        AbstractC56266c cVar = this.f127809l;
        list.size();
        cVar.mo90151c(sharePackage);
        DmtEditText dmtEditText2 = this.f127803f;
        if (dmtEditText2 == null) {
            C89219l.m154710a("editText");
        }
        Editable text = dmtEditText2.getText();
        C55949a.m101803a(list, text != null ? text.toString() : null, sharePackage, a);
        DmtEditText dmtEditText3 = this.f127803f;
        if (dmtEditText3 == null) {
            C89219l.m154710a("editText");
        }
        Editable text2 = dmtEditText3.getText();
        if (text2 != null) {
            str = text2.toString();
        }
        C55712b.m101459a(sharePackage, str, C89070n.m154585g((Collection) list));
        if (C89219l.m154714a((Object) "live_event", (Object) sharePackage.f155487d)) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                C55708a.m101454a(C55708a.f127082a, "livesdk_live_event_share", sharePackage, it.next());
            }
        }
        if (C89219l.m154714a((Object) sharePackage.f155487d, (Object) UGCMonitor.EVENT_COMMENT)) {
            C55059b.m100694b("enter_from", "comment_panel");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.viewmodel.AbstractC56081a
    /* renamed from: a */
    public final void mo92894a(IMContact iMContact) {
        C89219l.m154721d(iMContact, "");
        C89219l.m154721d(iMContact, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.viewmodel.AbstractC56081a
    /* renamed from: a */
    public final void mo92895a(List<? extends IMContact> list) {
        Integer num;
        C89219l.m154721d(list, "");
        StringBuilder sb = new StringBuilder("updatePanelHead: ");
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        C56244a.m102191c("SharePanelWidget", sb.append(num).toString());
        if (list == null || list.isEmpty()) {
            C55957h.m101815a(false);
            this.f127808k.f128352a.setVisibility(8);
            return;
        }
        C55957h.m101815a(true);
        C55974b bVar = this.f127801d;
        if (bVar == null) {
            C89219l.m154710a("headAdapter");
        }
        bVar.mo92843a(list);
        C55940a.m101782a(this.f127808k.f128359k);
    }

    public SharePanelWidget(C56269b bVar, AbstractC56266c cVar) {
        UrlModel urlModel;
        String str;
        User user;
        User user2;
        Bundle bundle;
        int i;
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(cVar, "");
        MethodCollector.m26663i(3770);
        this.f127808k = bVar;
        this.f127809l = cVar;
        Context context = bVar.f128358j;
        this.f127798a = context;
        this.f127816t = C89219l.m154714a((Object) bVar.f128359k.f155487d, (Object) UGCMonitor.EVENT_COMMENT);
        this.f127817u = C89219l.m154714a((Object) bVar.f128359k.f155487d, (Object) UGCMonitor.EVENT_COMMENT);
        C55957h.f127604a = true;
        boolean z = false;
        this.f127815s = bVar.f128359k.f155492i.getBoolean("is_share_live", false);
        create();
        this.f127799b = SharePanelViewModel.C56071a.m101975a(bVar.f128359k, this, C89086z.INSTANCE, C55732c.EnumC55734b.NORMAL, 0, 16);
        AbstractC1196i lifecycle = getLifecycle();
        SharePanelViewModel sharePanelViewModel = this.f127799b;
        if (sharePanelViewModel == null) {
            C89219l.m154710a("viewModel");
        }
        lifecycle.mo4012a(sharePanelViewModel);
        C56034a aVar = new C56034a(context, (byte) 0);
        aVar.setWidget(this);
        bVar.f128352a.addView(aVar);
        View findViewById = aVar.findViewById(R.id.dgl);
        C89219l.m154716b(findViewById, "");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        this.f127800c = recyclerView;
        if (recyclerView == null) {
            C89219l.m154710a("headRecyclerView");
        }
        recyclerView.mo4402a(new C55327b(C34728n.m70946a(12.0d), C34728n.m70946a(6.0d), C34728n.m70946a(26.0d)));
        SharePanelViewModel sharePanelViewModel2 = this.f127799b;
        if (sharePanelViewModel2 == null) {
            C89219l.m154710a("viewModel");
        }
        sharePanelViewModel2.f127870a = this.f127815s;
        SharePanelViewModel sharePanelViewModel3 = this.f127799b;
        if (sharePanelViewModel3 == null) {
            C89219l.m154710a("viewModel");
        }
        this.f127801d = new C55974b(sharePanelViewModel3);
        RecyclerView recyclerView2 = this.f127800c;
        if (recyclerView2 == null) {
            C89219l.m154710a("headRecyclerView");
        }
        C55974b bVar2 = this.f127801d;
        if (bVar2 == null) {
            C89219l.m154710a("headAdapter");
        }
        recyclerView2.setAdapter(bVar2);
        RecyclerView recyclerView3 = this.f127800c;
        if (recyclerView3 == null) {
            C89219l.m154710a("headRecyclerView");
        }
        recyclerView3.setLayoutManager(new LinearLayoutManager(0, false));
        View findViewById2 = aVar.findViewById(R.id.c14);
        C89219l.m154716b(findViewById2, "");
        this.f127813q = (TuxIconView) findViewById2;
        SharePanelViewModel sharePanelViewModel4 = this.f127799b;
        if (sharePanelViewModel4 == null) {
            C89219l.m154710a("viewModel");
        }
        SharePackage sharePackage = sharePanelViewModel4.f127873d;
        if (!(sharePackage == null || (bundle = sharePackage.f155492i) == null)) {
            String string = bundle.getString("author_user_name", null);
            int i2 = bundle.getInt("share_im_limit_tip_type", -1);
            if (i2 > 0 && !TextUtils.isEmpty(string)) {
                C56036b bVar3 = new C56036b(context, (byte) 0);
                bVar3.setWidget(this);
                ((FrameLayout) bVar.f128356e.findViewById(R.id.dyh)).addView(bVar3);
                ViewGroup.LayoutParams layoutParams = bVar3.getLayoutParams();
                if (layoutParams != null) {
                    ((FrameLayout.LayoutParams) layoutParams).topMargin = (int) C13628n.m24520b(context, 5.0f);
                    TuxIconView tuxIconView = (TuxIconView) bVar3.mo92888a(R.id.eib);
                    C89219l.m154716b(tuxIconView, "");
                    tuxIconView.setVisibility(0);
                    if (this.f127817u) {
                        i = 2;
                    } else {
                        i = 1;
                    }
                    C89219l.m154716b(string, "");
                    C55968c cVar2 = new C55968c(string, i2, i);
                    this.f127814r = cVar2;
                    bVar3.mo92889a(cVar2);
                    bVar3.setVisibility(8);
                    this.f127805h = bVar3;
                } else {
                    NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    MethodCollector.m26664o(3770);
                    throw nullPointerException;
                }
            }
        }
        C1764a.m5927a(LayoutInflater.from(context), R.layout.a7g, bVar.f128354c, true);
        View findViewById3 = bVar.f128354c.findViewById(R.id.dvf);
        C89219l.m154716b(findViewById3, "");
        this.f127812p = (LinearLayout) findViewById3;
        View findViewById4 = bVar.f128354c.findViewById(R.id.dv_);
        C89219l.m154716b(findViewById4, "");
        TuxButton tuxButton = (TuxButton) findViewById4;
        this.f127811o = tuxButton;
        if (tuxButton == null) {
            C89219l.m154710a("sendTv");
        }
        tuxButton.setOnClickListener(new View$OnClickListenerC56052i(this));
        if (C55213i.m100955a()) {
            View findViewById5 = bVar.f128354c.findViewById(R.id.bc6);
            C89219l.m154716b(findViewById5, "");
            View findViewById6 = bVar.f128354c.findViewById(R.id.a4l);
            C89219l.m154716b(findViewById6, "");
            C56055a aVar2 = new C56055a(new C55967b((LinearLayout) findViewById5, (TuxCheckBox) findViewById6), bVar.f128359k, this);
            aVar2.mo92917c();
            this.f127804g = aVar2;
        }
        C1764a.m5927a(LayoutInflater.from(context), R.layout.a7f, bVar.f128353b, true);
        ViewGroup viewGroup = bVar.f128353b;
        View findViewById7 = viewGroup.findViewById(R.id.cmw);
        C89219l.m154716b(findViewById7, "");
        this.f127802e = findViewById7;
        View findViewById8 = viewGroup.findViewById(R.id.cmv);
        C89219l.m154716b(findViewById8, "");
        this.f127803f = (DmtEditText) findViewById8;
        View findViewById9 = viewGroup.findViewById(R.id.cmu);
        C89219l.m154716b(findViewById9, "");
        this.f127810n = (RemoteImageView) findViewById9;
        DmtEditText dmtEditText = this.f127803f;
        if (dmtEditText == null) {
            C89219l.m154710a("editText");
        }
        InputFilter[] inputFilterArr = new InputFilter[1];
        DmtEditText dmtEditText2 = this.f127803f;
        if (dmtEditText2 == null) {
            C89219l.m154710a("editText");
        }
        inputFilterArr[0] = new C55172ad(dmtEditText2);
        dmtEditText.setFilters(inputFilterArr);
        if (this.f127816t) {
            C56036b bVar4 = this.f127805h;
            if (bVar4 != null) {
                bVar4.setVisibility(0);
            }
            View view = this.f127802e;
            if (view == null) {
                C89219l.m154710a("editLayout");
            }
            view.setVisibility(0);
            DmtEditText dmtEditText3 = this.f127803f;
            if (dmtEditText3 == null) {
                C89219l.m154710a("editText");
            }
            dmtEditText3.setVisibility(0);
            LinearLayout linearLayout = this.f127812p;
            if (linearLayout == null) {
                C89219l.m154710a("sendContainer");
            }
            View findViewById10 = linearLayout.findViewById(R.id.dyd);
            if (findViewById10 != null) {
                findViewById10.setVisibility(8);
            }
            LinearLayout linearLayout2 = this.f127812p;
            if (linearLayout2 == null) {
                C89219l.m154710a("sendContainer");
            }
            View findViewById11 = linearLayout2.findViewById(R.id.bc6);
            if (findViewById11 != null) {
                findViewById11.setVisibility(8);
            }
            View findViewById12 = bVar.f128356e.findViewById(R.id.dyf);
            C89219l.m154716b(findViewById12, "");
            findViewById12.setVisibility(8);
            TuxButton tuxButton2 = this.f127811o;
            if (tuxButton2 == null) {
                C89219l.m154710a("sendTv");
            }
            tuxButton2.setVisibility(0);
            TuxButton tuxButton3 = this.f127811o;
            if (tuxButton3 == null) {
                C89219l.m154710a("sendTv");
            }
            TuxButton tuxButton4 = this.f127811o;
            if (tuxButton4 == null) {
                C89219l.m154710a("sendTv");
            }
            tuxButton3.setText(tuxButton4.getResources().getString(R.string.ch4));
            TuxButton tuxButton5 = this.f127811o;
            if (tuxButton5 == null) {
                C89219l.m154710a("sendTv");
            }
            tuxButton5.setEnabled(false);
        }
        if (this.f127817u) {
            RemoteImageView remoteImageView = this.f127810n;
            if (remoteImageView == null) {
                C89219l.m154710a("shareCover");
            }
            remoteImageView.setVisibility(8);
            View view2 = this.f127802e;
            if (view2 == null) {
                C89219l.m154710a("editLayout");
            }
            TextView textView = (TextView) view2.findViewById(R.id.cmt);
            C89219l.m154716b(textView, "");
            textView.setVisibility(0);
            C23008e a = C23009f.m43397a(C56050g.f127830a);
            Context context2 = textView.getContext();
            C89219l.m154716b(context2, "");
            textView.setBackground(a.mo37389a(context2));
            SharePackage sharePackage2 = bVar.f128359k;
            if (sharePackage2 != null) {
                CommentSharePackage commentSharePackage = (CommentSharePackage) sharePackage2;
                Comment comment = commentSharePackage.f154714a;
                String str2 = (comment == null || (user2 = comment.getUser()) == null || (str2 = user2.getNickname()) == null) ? "" : str2;
                Comment comment2 = commentSharePackage.f154714a;
                String str3 = (comment2 == null || (str3 = comment2.getText()) == null) ? "" : str3;
                Comment comment3 = commentSharePackage.f154714a;
                String str4 = (comment3 == null || (str4 = comment3.getReplyToUserName()) == null) ? "" : str4;
                Comment comment4 = commentSharePackage.f154714a;
                if (comment4 == null || (user = comment4.getUser()) == null) {
                    urlModel = null;
                } else {
                    urlModel = user.getAvatarThumb();
                }
                if (str2.length() == 0 || str3.length() == 0 || urlModel == null) {
                    StringBuilder sb = new StringBuilder("Share data error, [");
                    Comment comment5 = commentSharePackage.f154714a;
                    C56244a.m102193e("SharePanelWidget", sb.append((comment5 == null || (str = comment5.getCid()) == null) ? "" : str).append("] creatorName:").append(str2).append(" comment:").append(str3).append(" avatarIsNull:").append(urlModel == null ? true : z).toString());
                }
                Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), 2131232818);
                C89219l.m154716b(decodeResource, "");
                Resources system = Resources.getSystem();
                C89219l.m154709a((Object) system, "");
                textView.setText(CommentSharePackage.C69213a.m122323a(context, str2, str4, str3, decodeResource, C89241a.m154730a(TypedValue.applyDimension(1, 16.0f, system.getDisplayMetrics()))));
                C20766v a2 = C20761r.m39060a(C34735v.m70965a(urlModel));
                a2.f49105b = context;
                a2.mo34179a("CommentShare").mo34182a(new C56051h(this, str2, str4, str3, textView));
            } else {
                NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.share.improve.pkg.CommentSharePackage");
                MethodCollector.m26664o(3770);
                throw nullPointerException2;
            }
        }
        SharePanelViewModel sharePanelViewModel5 = this.f127799b;
        if (sharePanelViewModel5 == null) {
            C89219l.m154710a("viewModel");
        }
        if (sharePanelViewModel5.mo92942f()) {
            String string2 = bVar.f128359k.f155492i.getString("aid");
            string2 = string2 == null ? "" : string2;
            C89219l.m154716b(string2, "");
            C80034a.f179347a.mo123478a(this, new C56054k(this, string2));
        }
        SharePanelViewModel sharePanelViewModel6 = this.f127799b;
        if (sharePanelViewModel6 == null) {
            C89219l.m154710a("viewModel");
        }
        sharePanelViewModel6.mo92940d();
        MethodCollector.m26664o(3770);
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    /* renamed from: a */
    public final <S extends AbstractC12853j> void mo20508a(AssemViewModel<S> assemViewModel, C12854k<S> kVar, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89183m<? super AbstractC22876d, ? super S, C89391z> mVar) {
        C89219l.m154721d(assemViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(mVar, "");
        AbstractC12846h.C12847a.m23092a(this, assemViewModel, kVar, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    /* renamed from: b */
    public final <S extends AbstractC12853j, A> void mo20515b(AssemViewModel<S> assemViewModel, AbstractC89290k<S, ? extends A> kVar, C12854k<C12793o<A>> kVar2, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89183m<? super AbstractC22876d, ? super A, C89391z> mVar) {
        C89219l.m154721d(assemViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(mVar, "");
        AbstractC12846h.C12847a.m23097b(this, assemViewModel, kVar, kVar2, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    /* renamed from: a */
    public final <S extends AbstractC12853j, A> void mo20509a(AssemViewModel<S> assemViewModel, AbstractC89290k<S, ? extends A> kVar, C12854k<C12793o<A>> kVar2, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89183m<? super AbstractC22876d, ? super A, C89391z> mVar) {
        C89219l.m154721d(assemViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(mVar, "");
        AbstractC12846h.C12847a.m23093a(this, assemViewModel, kVar, kVar2, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    /* renamed from: a */
    public final <S extends AbstractC12853j, A, B> void mo20510a(AssemViewModel<S> assemViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, C12854k<C12794p<A, B>> kVar3, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89187q<? super AbstractC22876d, ? super A, ? super B, C89391z> qVar) {
        C89219l.m154721d(assemViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(qVar, "");
        AbstractC12846h.C12847a.m23094a(this, assemViewModel, kVar, kVar2, kVar3, bVar, qVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    /* renamed from: a */
    public final <S extends AbstractC12853j, A, B, C> void mo20511a(AssemViewModel<S> assemViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, C12854k<C12795q<A, B, C>> kVar4, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89188r<? super AbstractC22876d, ? super A, ? super B, ? super C, C89391z> rVar) {
        C89219l.m154721d(assemViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(kVar4, "");
        C89219l.m154721d(rVar, "");
        AbstractC12846h.C12847a.m23095a(this, assemViewModel, kVar, kVar2, kVar3, kVar4, bVar, rVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    /* renamed from: a */
    public final <S extends AbstractC12853j, A, B, C, D> void mo20512a(AssemViewModel<S> assemViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, AbstractC89290k<S, ? extends D> kVar4, C12854k<C12796r<A, B, C, D>> kVar5, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89189s<? super AbstractC22876d, ? super A, ? super B, ? super C, ? super D, C89391z> sVar) {
        C89219l.m154721d(assemViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(kVar4, "");
        C89219l.m154721d(kVar5, "");
        C89219l.m154721d(sVar, "");
        AbstractC12846h.C12847a.m23096a(this, assemViewModel, kVar, kVar2, kVar3, kVar4, kVar5, bVar, sVar);
    }
}
