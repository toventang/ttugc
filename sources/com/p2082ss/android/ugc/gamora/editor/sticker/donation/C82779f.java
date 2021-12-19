package com.p2082ss.android.ugc.gamora.editor.sticker.donation;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.DialogInterface$OnCancelListenerC0944d;
import androidx.lifecycle.AbstractC1204m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.searchbar.AbstractC17248b;
import com.bytedance.ies.dmt.p1194ui.searchbar.SearchBar;
import com.bytedance.ies.dmt.p1194ui.widget.C17273d;
import com.bytedance.ies.dmt.p1194ui.widget.DmtEditText;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p1194ui.widget.MtEmptyView;
import com.bytedance.jedi.arch.AbstractC20362a;
import com.bytedance.jedi.arch.AbstractC20367ae;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.AbstractC20477i;
import com.bytedance.jedi.arch.AbstractC20527q;
import com.bytedance.jedi.arch.AbstractC20534v;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.C20373ak;
import com.bytedance.jedi.arch.C20374al;
import com.bytedance.jedi.arch.C20375am;
import com.bytedance.jedi.arch.C20376an;
import com.bytedance.jedi.arch.C20531t;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.shortvideo.p3858s.C72829c;
import com.p2082ss.android.ugc.aweme.utils.C80322d;
import com.p2082ss.android.ugc.aweme.widgetcompat.RemoteImageView;
import com.p2082ss.android.ugc.gamora.editor.sticker.donation.C82726a;
import com.p2082ss.android.ugc.gamora.editor.sticker.donation.p4287a.AbstractC82733a;
import com.p2082ss.android.ugc.gamora.editor.sticker.donation.p4287a.C82737c;
import com.p2082ss.android.ugc.gamora.editor.sticker.donation.p4288b.C82746a;
import com.p2082ss.android.ugc.gamora.editor.sticker.donation.p4289c.AbstractC82771b;
import com.p2082ss.android.ugc.gamora.editor.sticker.donation.p4289c.C82774e;
import com.p2082ss.android.ugc.gamora.editor.sticker.donation.viewmodel.C82809a;
import com.p2082ss.android.ugc.gamora.editor.sticker.donation.viewmodel.OrganizationListViewModel;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.view.p4363b.AbstractC84926c;
import com.p2082ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.HashMap;
import org.json.JSONObject;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89290k;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.f */
public final class C82779f extends DialogInterface$OnCancelListenerC0944d implements AbstractC17248b, AbstractC20527q, AbstractC82733a {

    /* renamed from: b */
    public static final C82780a f185044b = new C82780a((byte) 0);

    /* renamed from: a */
    public AbstractC82792i f185045a;

    /* renamed from: c */
    private boolean f185046c;

    /* renamed from: d */
    private final AbstractC89244h f185047d = C89250i.m154773a((AbstractC89171a) new C82786g(this));

    /* renamed from: e */
    private final AbstractC89244h f185048e = C89250i.m154773a((AbstractC89171a) new C82785f(this));

    /* renamed from: f */
    private final AbstractC89244h f185049f = C89250i.m154773a((AbstractC89171a) new C82788i(this));

    /* renamed from: g */
    private final AbstractC89244h f185050g = C89250i.m154773a((AbstractC89171a) new C82787h(this));

    /* renamed from: h */
    private AbstractC82771b f185051h;

    /* renamed from: i */
    private HashMap f185052i;

    static {
        Covode.recordClassIndex(96629);
    }

    /* renamed from: a */
    public final View mo127838a(int i) {
        if (this.f185052i == null) {
            this.f185052i = new HashMap();
        }
        View view = (View) this.f185052i.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f185052i.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: c */
    public final C82745b mo127839c() {
        return (C82745b) this.f185047d.getValue();
    }

    /* renamed from: d */
    public final C82737c mo127840d() {
        return (C82737c) this.f185048e.getValue();
    }

    /* renamed from: e */
    public final OrganizationListViewModel mo127841e() {
        return (OrganizationListViewModel) this.f185049f.getValue();
    }

    /* renamed from: f */
    public final C82793j mo127842f() {
        return (C82793j) this.f185050g.getValue();
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.f$a */
    public static final class C82780a {
        static {
            Covode.recordClassIndex(96630);
        }

        private C82780a() {
        }

        public /* synthetic */ C82780a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20534v
    public final AbstractC1204m getLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final AbstractC20534v getLifecycleOwnerHolder() {
        return this;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20367ae
    public final /* bridge */ /* synthetic */ AbstractC20477i getReceiver() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final AbstractC20367ae<AbstractC20477i> getReceiverHolder() {
        return this;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.f$f */
    static final class C82785f extends AbstractC89220m implements AbstractC89171a<C82737c> {

        /* renamed from: a */
        final /* synthetic */ C82779f f185057a;

        static {
            Covode.recordClassIndex(96635);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82785f(C82779f fVar) {
            super(0);
            this.f185057a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C82737c invoke() {
            C82779f fVar = this.f185057a;
            return new C82737c(fVar, fVar.mo127839c());
        }
    }

    /* renamed from: i */
    public final String mo127845i() {
        if (mo127839c() == null) {
            return "personal_homepage";
        }
        return "video_edit_page";
    }

    /* renamed from: j */
    public final String mo127846j() {
        if (mo127839c() == null) {
            return "click_profile_nonprofit";
        }
        return "click_sticker";
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f185052i;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.f$c */
    static final class C82782c implements AbstractC84926c.AbstractC84928a {

        /* renamed from: a */
        final /* synthetic */ C82779f f185054a;

        static {
            Covode.recordClassIndex(96632);
        }

        C82782c(C82779f fVar) {
            this.f185054a = fVar;
        }

        @Override // com.p2082ss.android.ugc.tools.view.p4363b.AbstractC84926c.AbstractC84928a
        /* renamed from: a */
        public final void mo112467a() {
            OrganizationListViewModel e = this.f185054a.mo127841e();
            if (e.f185069b == 1) {
                e.mo33687b_(new OrganizationListViewModel.C82807h(e));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.f$g */
    static final class C82786g extends AbstractC89220m implements AbstractC89171a<C82745b> {

        /* renamed from: a */
        final /* synthetic */ C82779f f185058a;

        static {
            Covode.recordClassIndex(96636);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82786g(C82779f fVar) {
            super(0);
            this.f185058a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C82745b invoke() {
            Serializable serializable;
            Bundle arguments = this.f185058a.getArguments();
            if (arguments != null) {
                serializable = arguments.getSerializable("mob_params");
            } else {
                serializable = null;
            }
            if (!(serializable instanceof C82745b)) {
                return null;
            }
            return serializable;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.f$i */
    static final class C82788i extends AbstractC89220m implements AbstractC89171a<OrganizationListViewModel> {

        /* renamed from: a */
        final /* synthetic */ C82779f f185060a;

        static {
            Covode.recordClassIndex(96638);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82788i(C82779f fVar) {
            super(0);
            this.f185060a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ OrganizationListViewModel invoke() {
            JediViewModel a = C20531t.m38716a(this.f185060a.requireActivity()).mo33800a(OrganizationListViewModel.class);
            C89219l.m154716b(a, "");
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.f$j */
    static final class RunnableC82789j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C82779f f185061a;

        static {
            Covode.recordClassIndex(96639);
        }

        RunnableC82789j(C82779f fVar) {
            this.f185061a = fVar;
        }

        public final void run() {
            Window window;
            Dialog dialog = this.f185061a.getDialog();
            if (dialog != null && (window = dialog.getWindow()) != null) {
                window.setWindowAnimations(R.style.v7);
            }
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        View view = getView();
        if (view != null) {
            view.postDelayed(new RunnableC82789j(this), 50);
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public final void onStop() {
        Dialog dialog;
        Window window;
        if (!(this.f185046c || (dialog = getDialog()) == null || (window = dialog.getWindow()) == null)) {
            window.setWindowAnimations(0);
        }
        super.onStop();
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.f$h */
    static final class C82787h extends AbstractC89220m implements AbstractC89171a<C82793j> {

        /* renamed from: a */
        final /* synthetic */ C82779f f185059a;

        static {
            Covode.recordClassIndex(96637);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82787h(C82779f fVar) {
            super(0);
            this.f185059a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C82793j invoke() {
            String str;
            Context context = this.f185059a.getContext();
            String str2 = null;
            if (context == null) {
                return null;
            }
            C89219l.m154716b(context, "");
            C82745b c = this.f185059a.mo127839c();
            if (c != null) {
                str = c.getShootWay();
            } else {
                str = null;
            }
            C82745b c2 = this.f185059a.mo127839c();
            if (c2 != null) {
                str2 = c2.getCreationId();
            }
            return new C82793j(context, str, str2);
        }
    }

    @Override // com.bytedance.ies.dmt.p1194ui.searchbar.AbstractC17248b
    /* renamed from: b */
    public final void mo27297b() {
        String i = mo127845i();
        String j = mo127846j();
        C89219l.m154721d(i, "");
        C89219l.m154721d(j, "");
        C39162r.m79460a("clear_search_bar", new C84425b().mo129406a("enter_from", i).mo129406a("search_type", "ngo_list").mo129406a("user_id", C82746a.m142901a()).mo129406a("enter_method", j).f188764a);
    }

    /* renamed from: g */
    public final void mo127843g() {
        LinearLayout linearLayout = (LinearLayout) mo127838a(R.id.cdv);
        C89219l.m154716b(linearLayout, "");
        linearLayout.setVisibility(8);
        Context context = getContext();
        if (context == null) {
            return;
        }
        if (C72829c.m128602a(context)) {
            mo127841e().mo127858a();
        } else {
            ((DmtStatusView) mo127838a(R.id.ap1)).mo27387h();
        }
    }

    /* renamed from: h */
    public final void mo127844h() {
        mo127841e().mo127860b();
        mo127840d().mo129692c();
        SearchBar searchBar = (SearchBar) mo127838a(R.id.dsx);
        if (searchBar != null) {
            searchBar.mo27284b();
        }
        LinearLayout linearLayout = (LinearLayout) mo127838a(R.id.cdv);
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
    }

    @Override // com.bytedance.ies.dmt.p1194ui.searchbar.AbstractC17248b
    /* renamed from: a */
    public final void mo27294a() {
        String i = mo127845i();
        String j = mo127846j();
        C89219l.m154721d(i, "");
        C89219l.m154721d(j, "");
        C39162r.m79460a("cancel_search_bar", new C84425b().mo129406a("enter_from", i).mo129406a("search_type", "ngo_list").mo129406a("user_id", C82746a.m142901a()).mo129406a("enter_method", j).f188764a);
        mo127843g();
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.f$e */
    static final class View$OnClickListenerC82784e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C82779f f185056a;

        static {
            Covode.recordClassIndex(96634);
        }

        View$OnClickListenerC82784e(C82779f fVar) {
            this.f185056a = fVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f185056a.mo127843g();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, R.style.y_);
        AbstractC88412b unused = selectSubscribe(mo127841e(), C82790g.f185062a, new C20370ah(), new C82783d(this));
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f185046c = true;
        AbstractC82792i iVar = this.f185045a;
        if (iVar != null) {
            iVar.mo79550a();
        }
        mo127844h();
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        C89219l.m154716b(onCreateDialog, "");
        AbstractC82792i iVar = this.f185045a;
        if (iVar != null) {
            iVar.mo79552b();
        }
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            window.setWindowAnimations(R.style.v7);
        }
        onCreateDialog.setCanceledOnTouchOutside(false);
        return onCreateDialog;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.f$b */
    static final class View$OnClickListenerC82781b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C82779f f185053a;

        static {
            Covode.recordClassIndex(96631);
        }

        View$OnClickListenerC82781b(C82779f fVar) {
            this.f185053a = fVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            String i = this.f185053a.mo127845i();
            String j = this.f185053a.mo127846j();
            C89219l.m154721d(i, "");
            C89219l.m154721d(j, "");
            C39162r.m79460a("close_search_bar", new C84425b().mo129406a("enter_from", i).mo129406a("search_type", "ngo_list").mo129406a("user_id", C82746a.m142901a()).mo129406a("enter_method", j).f188764a);
            this.f185053a.mo127844h();
            this.f185053a.dismiss();
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.donation.p4287a.AbstractC82733a
    /* renamed from: b */
    public final void mo127730b(AbstractC82771b bVar) {
        C89219l.m154721d(bVar, "");
        this.f185051h = bVar;
        Bundle bundle = new Bundle();
        bundle.putString("url", bVar.getDetailUrl());
        bundle.putString("title", getString(R.string.baa));
        bundle.putString("enter_from", "org_detail_page");
        startActivityForResult(SmartRouter.buildRoute(getContext(), "aweme://donation/web/page").withParam(bundle).buildIntent(), 12580);
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.sticker.donation.p4287a.AbstractC82733a
    /* renamed from: a */
    public final void mo127729a(AbstractC82771b bVar) {
        C89219l.m154721d(bVar, "");
        if (bVar instanceof C82774e) {
            String i = mo127845i();
            String j = mo127846j();
            String donateLink = bVar.getDonateLink();
            if (donateLink == null) {
                C89219l.m154715b();
            }
            C89219l.m154721d(i, "");
            C89219l.m154721d(j, "");
            C89219l.m154721d(donateLink, "");
            C39162r.m79460a("click_search_bar_result", new C84425b().mo129406a("enter_from", i).mo129406a("search_type", "ngo_list").mo129406a("user_id", C82746a.m142901a()).mo129406a("enter_method", j).mo129406a("link", donateLink).mo129406a("link_type", "nonprofit").f188764a);
        }
        AbstractC82792i iVar = this.f185045a;
        if (iVar != null) {
            iVar.mo79551a(bVar);
        }
        ((SearchBar) mo127838a(R.id.dsx)).mo27283a();
        dismiss();
    }

    @Override // com.bytedance.ies.dmt.p1194ui.searchbar.AbstractC17248b
    /* renamed from: a */
    public final void mo27295a(String str) {
        if (mo127838a(R.id.cdv) != null) {
            LinearLayout linearLayout = (LinearLayout) mo127838a(R.id.cdv);
            C89219l.m154716b(linearLayout, "");
            linearLayout.setVisibility(8);
            if (str != null && str.length() != 0) {
                Context context = getContext();
                if (context == null) {
                    return;
                }
                if (C72829c.m128602a(context)) {
                    OrganizationListViewModel e = mo127841e();
                    if (!str.equals(e.f185071d)) {
                        e.mo127862g();
                        e.f185071d = str;
                        e.mo127861b(false);
                    } else if (e.f185069b == 1) {
                        e.mo127861b(true);
                    }
                } else {
                    ((DmtStatusView) mo127838a(R.id.ap1)).mo27387h();
                }
            } else if (((DmtEditText) ((SearchBar) mo127838a(R.id.dsx)).mo27282a(R.id.ax7)).hasFocus()) {
                mo127840d().mo129692c();
            }
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20527q.C20528a.m38714a(vm1, bVar);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.f$d */
    static final class C82783d extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, C82809a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82779f f185055a;

        static {
            Covode.recordClassIndex(96633);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82783d(C82779f fVar) {
            super(2);
            this.f185055a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0061, code lost:
            if (r0 != null) goto L_0x0063;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0067, code lost:
            if (r3 == null) goto L_0x0069;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0069, code lost:
            r3 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x006a, code lost:
            r1 = r1 + r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0082, code lost:
            if (android.text.TextUtils.isEmpty(r1) != false) goto L_0x0159;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0084, code lost:
            r8 = new android.text.SpannableString(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x008d, code lost:
            if (android.text.TextUtils.isEmpty(r3) != false) goto L_0x00a2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x008f, code lost:
            r8.setSpan(new android.text.style.StyleSpan(1), p4600h.p4622m.C89361p.m154888a((java.lang.CharSequence) r1, r3, 0, false, 6), r1.length(), 17);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a2, code lost:
            r0 = (android.widget.LinearLayout) r7.mo127838a(com.p2082ss.android.ugc.trill.R.id.cdq);
            p4600h.p4611f.p4613b.C89219l.m154716b(r0, r2);
            r0.setVisibility(0);
            r0 = (com.bytedance.tux.input.TuxTextView) r7.mo127838a(com.p2082ss.android.ugc.trill.R.id.eza);
            p4600h.p4611f.p4613b.C89219l.m154716b(r0, r2);
            r0.setText(r8);
            ((com.p2082ss.android.ugc.aweme.widgetcompat.RemoteImageView) r7.mo127838a(com.p2082ss.android.ugc.trill.R.id.c0g)).setImageResource(2131230970);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:0x0159, code lost:
            r1 = (android.widget.LinearLayout) r7.mo127838a(com.p2082ss.android.ugc.trill.R.id.cdq);
            p4600h.p4611f.p4613b.C89219l.m154716b(r1, r2);
            r1.setVisibility(8);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:69:0x019d, code lost:
            if (r0 == null) goto L_0x019f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:79:0x01b7, code lost:
            if (r1 == null) goto L_0x01b9;
         */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ p4600h.C89391z invoke(com.bytedance.jedi.arch.AbstractC20477i r11, com.p2082ss.android.ugc.gamora.editor.sticker.donation.viewmodel.C82809a r12) {
            /*
            // Method dump skipped, instructions count: 507
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.editor.sticker.donation.C82779f.C82783d.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        Context context = getContext();
        if (context != null) {
            C89219l.m154716b(context, "");
            ((TuxTextView) mo127838a(R.id.f63)).setTuxFont(33);
            RecyclerView recyclerView = (RecyclerView) mo127838a(R.id.dgw);
            C89219l.m154716b(recyclerView, "");
            recyclerView.setLayoutManager(new LinearLayoutManager());
            mo127840d().mo129702d(true);
            RecyclerView recyclerView2 = (RecyclerView) mo127838a(R.id.dgw);
            C89219l.m154716b(recyclerView2, "");
            recyclerView2.setAdapter(mo127840d());
            SearchBar searchBar = (SearchBar) mo127838a(R.id.dsx);
            C89219l.m154716b(searchBar, "");
            searchBar.setVisibility(0);
            ((SearchBar) mo127838a(R.id.dsx)).setSearchBarEventHandler(this);
            String string = getString(R.string.bal);
            C89219l.m154716b(string, "");
            String string2 = getString(R.string.bak, string);
            C89219l.m154716b(string2, "");
            SpannableString spannableString = new SpannableString(string2);
            if (C89361p.m154888a((CharSequence) string2, string, 0, false, 6) != -1) {
                spannableString.setSpan(mo127842f(), C89361p.m154888a((CharSequence) string2, string, 0, false, 6), string2.length(), 18);
            }
            TuxTextView tuxTextView = (TuxTextView) mo127838a(R.id.f1f);
            C89219l.m154716b(tuxTextView, "");
            tuxTextView.setMovementMethod(LinkMovementMethod.getInstance());
            TuxTextView tuxTextView2 = (TuxTextView) mo127838a(R.id.f1f);
            C89219l.m154716b(tuxTextView2, "");
            tuxTextView2.setText(spannableString);
            TuxTextView tuxTextView3 = (TuxTextView) mo127838a(R.id.f1f);
            C89219l.m154716b(tuxTextView3, "");
            tuxTextView3.setHighlightColor(0);
            TuxTextView tuxTextView4 = (TuxTextView) mo127838a(R.id.f1f);
            C89219l.m154716b(tuxTextView4, "");
            tuxTextView4.setVisibility(8);
            ActivityC0945e activity = getActivity();
            if (activity == null) {
                C89219l.m154715b();
            }
            MtEmptyView a = MtEmptyView.m31926a(activity);
            ActivityC0945e activity2 = getActivity();
            if (activity2 == null) {
                C89219l.m154715b();
            }
            a.setStatus(new C17273d.C17274a(activity2).f41365a);
            ((DmtStatusView) mo127838a(R.id.ap1)).setBuilder(DmtStatusView.C17269a.m31905a(getActivity()).mo27397a().mo27400a(2131232924, R.string.gzs, R.string.gzr, R.string.gzy, new View$OnClickListenerC82784e(this)).mo27406b(a));
            ((RemoteImageView) mo127838a(R.id.bu5)).setOnClickListener(new View$OnClickListenerC82781b(this));
            mo127840d().f189769o = new C82782c(this);
            mo127843g();
        }
    }

    @Override // com.bytedance.ies.dmt.p1194ui.searchbar.AbstractC17248b
    /* renamed from: a */
    public final void mo27296a(boolean z, String str) {
        if (!z) {
            return;
        }
        if (str == null || str.length() == 0) {
            String i = mo127845i();
            String j = mo127846j();
            C89219l.m154721d(i, "");
            C89219l.m154721d(j, "");
            C39162r.m79460a("enter_search_bar", new C84425b().mo129406a("enter_from", i).mo129406a("search_type", "ngo_list").mo129406a("user_id", C82746a.m142901a()).mo129406a("enter_method", j).f188764a);
            mo127840d().mo129692c();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.yb, viewGroup, false);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af> AbstractC88412b subscribe(JediViewModel<S> jediViewModel, C20370ah<S> ahVar, AbstractC89183m<? super AbstractC20477i, ? super S, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20527q.C20528a.m38708a(this, jediViewModel, ahVar, mVar);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        AbstractC82771b bVar;
        String str;
        String str2;
        String str3;
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 12580 && (bVar = this.f185051h) != null) {
            dismiss();
            AbstractC82792i iVar = this.f185045a;
            if (iVar != null) {
                iVar.mo79551a(bVar);
            }
            C82745b c = mo127839c();
            String str4 = null;
            if (c != null) {
                str = c.getShootWay();
            } else {
                str = null;
            }
            C82745b c2 = mo127839c();
            if (c2 != null) {
                str2 = c2.getCreationId();
            } else {
                str2 = null;
            }
            String name = bVar.getName();
            C82745b c3 = mo127839c();
            if (c3 != null) {
                str3 = c3.getContentSource();
            } else {
                str3 = null;
            }
            C82745b c4 = mo127839c();
            if (c4 != null) {
                str4 = c4.getContentType();
            }
            JSONObject jSONObject = new JSONObject();
            C82726a.m142892a(jSONObject, new C82726a.C82728b(str, str2, name, str3, str4));
            C80322d.m139252a("add_donation_sticker", jSONObject);
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20527q.C20528a.m38709a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, C20370ah<C20374al<A, B>> ahVar, AbstractC89187q<? super AbstractC20477i, ? super A, ? super B, C89391z> qVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(qVar, "");
        return AbstractC20527q.C20528a.m38711a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, T> AbstractC88412b asyncSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends AbstractC20362a<? extends T>> kVar, C20370ah<C20373ak<AbstractC20362a<T>>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super Throwable, C89391z> mVar, AbstractC89172b<? super AbstractC20477i, C89391z> bVar, AbstractC89183m<? super AbstractC20477i, ? super T, C89391z> mVar2) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        return AbstractC20527q.C20528a.m38710a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B, C> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, C20370ah<C20375am<A, B, C>> ahVar, AbstractC89188r<? super AbstractC20477i, ? super A, ? super B, ? super C, C89391z> rVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(rVar, "");
        return AbstractC20527q.C20528a.m38712a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B, C, D> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, AbstractC89290k<S, ? extends D> kVar4, C20370ah<C20376an<A, B, C, D>> ahVar, AbstractC89189s<? super AbstractC20477i, ? super A, ? super B, ? super C, ? super D, C89391z> sVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(kVar4, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(sVar, "");
        return AbstractC20527q.C20528a.m38713a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}
