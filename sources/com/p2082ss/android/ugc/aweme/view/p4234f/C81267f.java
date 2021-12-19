package com.p2082ss.android.ugc.aweme.view.p4234f;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.DialogInterface$OnCancelListenerC0944d;
import androidx.lifecycle.AbstractC1204m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
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
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.lighten.p1477a.EnumC20767w;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.status.loading.TuxDualBallView;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2379ui.SmartAvatarImageView;
import com.p2082ss.android.ugc.aweme.common.C39082ag;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.C39165u;
import com.p2082ss.android.ugc.aweme.model.C60140b;
import com.p2082ss.android.ugc.aweme.model.C60141c;
import com.p2082ss.android.ugc.aweme.model.C60143e;
import com.p2082ss.android.ugc.aweme.model.C60145g;
import com.p2082ss.android.ugc.aweme.model.C60157q;
import com.p2082ss.android.ugc.aweme.model.C60159r;
import com.p2082ss.android.ugc.aweme.view.p4229a.AbstractC81121b;
import com.p2082ss.android.ugc.aweme.view.p4229a.C81118a;
import com.p2082ss.android.ugc.aweme.viewModel.ProfileNaviCreatorState;
import com.p2082ss.android.ugc.aweme.viewModel.ProfileNaviCreatorViewModel;
import com.p2082ss.android.ugc.aweme.views.RoundedFrameLayout;
import com.p2082ss.android.ugc.trill.R;
import java.io.File;
import java.util.UUID;
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

/* renamed from: com.ss.android.ugc.aweme.view.f.f */
public final class C81267f extends DialogInterface$OnCancelListenerC0944d implements AbstractC20527q, AbstractC81121b {

    /* renamed from: a */
    public Runnable f181578a;

    /* renamed from: b */
    public Handler f181579b = new Handler();

    /* renamed from: c */
    public final String f181580c;

    /* renamed from: d */
    public final AbstractC81268a f181581d;

    /* renamed from: e */
    private Handler f181582e = new Handler();

    /* renamed from: f */
    private final AbstractC89244h f181583f = C89250i.m154773a((AbstractC89171a) new C81269b(this));

    /* renamed from: g */
    private final AbstractC89244h f181584g = C89250i.m154773a((AbstractC89171a) new C81276i(this));

    /* renamed from: h */
    private SparseArray f181585h;

    /* renamed from: com.ss.android.ugc.aweme.view.f.f$a */
    public interface AbstractC81268a {
        static {
            Covode.recordClassIndex(94598);
        }

        /* renamed from: n */
        void mo124746n();

        /* renamed from: o */
        void mo124747o();

        /* renamed from: p */
        void mo124748p();
    }

    static {
        Covode.recordClassIndex(94597);
    }

    /* renamed from: c */
    private final C60145g m141014c() {
        return (C60145g) this.f181584g.getValue();
    }

    /* renamed from: a */
    public final ProfileNaviCreatorViewModel mo124751a() {
        return (ProfileNaviCreatorViewModel) this.f181583f.getValue();
    }

    /* renamed from: b */
    public final View mo124753b(int i) {
        if (this.f181585h == null) {
            this.f181585h = new SparseArray();
        }
        View view = (View) this.f181585h.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f181585h.put(i, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
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

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.view.f.f$c */
    public static final class RunnableC81270c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C81267f f181587a;

        static {
            Covode.recordClassIndex(94600);
        }

        RunnableC81270c(C81267f fVar) {
            this.f181587a = fVar;
        }

        public final void run() {
            this.f181587a.mo124752a(0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.view.f.f$j */
    static final class RunnableC81277j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C81267f f181595a;

        static {
            Covode.recordClassIndex(94607);
        }

        RunnableC81277j(C81267f fVar) {
            this.f181595a = fVar;
        }

        public final void run() {
            this.f181595a.f181581d.mo124748p();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.view.f.f$d */
    public static final class RunnableC81271d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C81267f f181588a;

        /* renamed from: b */
        final /* synthetic */ int f181589b;

        static {
            Covode.recordClassIndex(94601);
        }

        RunnableC81271d(C81267f fVar, int i) {
            this.f181588a = fVar;
            this.f181589b = i;
        }

        public final void run() {
            this.f181588a.mo124752a(this.f181589b + 1);
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f181585h;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.f181582e.removeCallbacksAndMessages(null);
        this.f181581d.mo124747o();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f181581d.mo124746n();
    }

    /* renamed from: com.ss.android.ugc.aweme.view.f.f$b */
    static final class C81269b extends AbstractC89220m implements AbstractC89171a<ProfileNaviCreatorViewModel> {

        /* renamed from: a */
        final /* synthetic */ C81267f f181586a;

        static {
            Covode.recordClassIndex(94599);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81269b(C81267f fVar) {
            super(0);
            this.f181586a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ProfileNaviCreatorViewModel invoke() {
            JediViewModel a = C20531t.m38716a(this.f181586a.requireActivity()).mo33800a(ProfileNaviCreatorViewModel.class);
            C89219l.m154716b(a, "");
            return a;
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d
    public final void dismiss() {
        this.f181579b.removeCallbacksAndMessages(null);
        m141012a(false);
        ProfileNaviCreatorViewModel a = mo124751a();
        a.mo33690d(ProfileNaviCreatorViewModel.C81306f.f181640a);
        a.mo33690d(ProfileNaviCreatorViewModel.C81307g.f181641a);
        this.f181581d.mo124747o();
        super.dismiss();
    }

    /* renamed from: com.ss.android.ugc.aweme.view.f.f$i */
    static final class C81276i extends AbstractC89220m implements AbstractC89171a<C60145g> {

        /* renamed from: a */
        final /* synthetic */ C81267f f181594a;

        static {
            Covode.recordClassIndex(94606);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81276i(C81267f fVar) {
            super(0);
            this.f181594a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C60145g invoke() {
            String str;
            C81267f fVar = this.f181594a;
            String[] strArr = {"#FFB4FE", "#8A73FE", "#A5E6FF", "#8EFF8E", "#FFFD8E", "#FF9C68", "#FF858F", "#333333", "#B3B3B3", "#FFFFFF"};
            C60145g gVar = new C60145g();
            fVar.mo124751a();
            C60157q qVar = C60159r.f137138a;
            if (qVar == null || (str = qVar.f137133b) == null) {
                return gVar;
            }
            int i = 0;
            do {
                String str2 = strArr[i];
                C60143e eVar = new C60143e(UUID.randomUUID().toString());
                eVar.f137085a = str2;
                gVar.f137090a.add(eVar);
                if (C89219l.m154714a((Object) str, (Object) str2)) {
                    gVar.f137091b = eVar;
                }
                i++;
            } while (i < 10);
            return gVar;
        }
    }

    /* renamed from: b */
    public final void mo124754b() {
        mo124751a();
        C60141c cVar = C60159r.f137141d;
        if (cVar == null || cVar.f137084b == null) {
            m141012a(true);
            this.f181578a = new RunnableC81270c(this);
            return;
        }
        mo124752a(0);
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, 16974122);
        setCancelable(false);
    }

    /* renamed from: b */
    private final void m141013b(C60143e eVar) {
        String str = eVar.f137085a;
        if (str != null && str.length() != 0) {
            ProfileNaviCreatorViewModel a = mo124751a();
            String str2 = eVar.f137085a;
            if (str2 == null) {
                C89219l.m154715b();
            }
            a.mo124797a(str2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.view.f.f$f */
    static final class View$OnClickListenerC81273f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C81267f f181591a;

        static {
            Covode.recordClassIndex(94603);
        }

        View$OnClickListenerC81273f(C81267f fVar) {
            this.f181591a = fVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f181591a.f181581d.mo124747o();
            C39162r.m79460a("cancel_edit_set_avatar_profile", new C33744d().f79943a);
            this.f181591a.dismiss();
            ProfileNaviCreatorViewModel a = this.f181591a.mo124751a();
            a.mo33690d(ProfileNaviCreatorViewModel.C81310j.f181648a);
            a.mo33690d(ProfileNaviCreatorViewModel.C81311k.f181649a);
        }
    }

    /* renamed from: a */
    private final void m141012a(boolean z) {
        if (z) {
            CardView cardView = (CardView) mo124753b(R.id.d90);
            C89219l.m154716b(cardView, "");
            cardView.setVisibility(0);
            ((TuxDualBallView) mo124753b(R.id.d8z)).mo37884b();
            return;
        }
        ((TuxDualBallView) mo124753b(R.id.d8z)).mo37885c();
        CardView cardView2 = (CardView) mo124753b(R.id.d90);
        C89219l.m154716b(cardView2, "");
        cardView2.setVisibility(8);
    }

    /* renamed from: a */
    public final void mo124752a(int i) {
        this.f181582e.removeCallbacksAndMessages(null);
        if (i > 3) {
            dismiss();
            return;
        }
        mo124751a();
        if (C60140b.m109602a()) {
            dismiss();
        } else {
            this.f181582e.postDelayed(new RunnableC81271d(this, i), 3000);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.view.p4229a.AbstractC81121b
    /* renamed from: a */
    public final void mo124587a(C60143e eVar) {
        C89219l.m154721d(eVar, "");
        m141014c().f137091b = eVar;
        RecyclerView recyclerView = (RecyclerView) mo124753b(R.id.d8s);
        C89219l.m154716b(recyclerView, "");
        RecyclerView.AbstractC1350a adapter = recyclerView.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        m141013b(eVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.view.f.f$e */
    static final class View$OnClickListenerC81272e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C81267f f181590a;

        static {
            Covode.recordClassIndex(94602);
        }

        View$OnClickListenerC81272e(C81267f fVar) {
            this.f181590a = fVar;
        }

        public final void onClick(View view) {
            File a;
            int i;
            C60157q qVar;
            MethodCollector.m26663i(3671);
            ClickAgent.onClick(view);
            C39162r.m79460a("submit_set_avatar_profile", new C33744d().f79943a);
            ProfileNaviCreatorViewModel a2 = this.f181590a.mo124751a();
            String profileImageBackgroundColor = ((ProfileNaviCreatorState) a2.aB_()).getProfileImageBackgroundColor();
            if (!(profileImageBackgroundColor == null || (qVar = C60159r.f137138a) == null)) {
                qVar.mo97832a(profileImageBackgroundColor);
                a2.mo124802j();
            }
            C81267f fVar = this.f181590a;
            ProfileNaviCreatorViewModel a3 = fVar.mo124751a();
            a3.mo33690d(ProfileNaviCreatorViewModel.C81312l.f181650a);
            a3.mo33690d(ProfileNaviCreatorViewModel.C81313m.f181651a);
            fVar.f181579b.postDelayed(new RunnableC81277j(fVar), 6000);
            C81267f fVar2 = this.f181590a;
            RoundedFrameLayout roundedFrameLayout = (RoundedFrameLayout) fVar2.mo124753b(R.id.d8v);
            C89219l.m154716b(roundedFrameLayout, "");
            int width = roundedFrameLayout.getWidth();
            RoundedFrameLayout roundedFrameLayout2 = (RoundedFrameLayout) fVar2.mo124753b(R.id.d8v);
            C89219l.m154716b(roundedFrameLayout2, "");
            Bitmap createBitmap = Bitmap.createBitmap(width, roundedFrameLayout2.getHeight(), Bitmap.Config.ARGB_8888);
            C89219l.m154716b(createBitmap, "");
            Canvas canvas = new Canvas(createBitmap);
            RoundedFrameLayout roundedFrameLayout3 = (RoundedFrameLayout) fVar2.mo124753b(R.id.d8v);
            if (roundedFrameLayout3 == null) {
                C89219l.m154715b();
            }
            roundedFrameLayout3.draw(canvas);
            if (!(createBitmap == null || (a = C39165u.m79471a(fVar2.getContext(), createBitmap)) == null)) {
                SmartAvatarImageView smartAvatarImageView = new SmartAvatarImageView(fVar2.getContext());
                Context context = fVar2.getContext();
                if (context != null) {
                    C89219l.m154716b(context, "");
                    i = (int) C39082ag.C39083a.m79347a(context, 52.0f);
                } else {
                    i = 0;
                }
                C20766v a4 = C20761r.m39059a(a);
                a4.f49092E = smartAvatarImageView;
                a4.mo34186c();
                if (fVar2.getContext() != null) {
                    C17197a.C17200a b = new C17197a.C17200a(fVar2.getContext()).mo27189a(R.string.a17).mo27194b(R.string.a15);
                    b.f41067M = true;
                    C17197a a5 = b.mo27190a(R.string.a14, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC81278k(fVar2, a, smartAvatarImageView, i), false).mo27195b(R.string.a16, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC81279l(fVar2, a, smartAvatarImageView, i), false).mo27191a(smartAvatarImageView, i, i).mo27193a();
                    C39162r.m79460a("show_set_avatar_profile_confirmation_popup", new C33744d().f79943a);
                    a5.mo27185c();
                }
            }
            MethodCollector.m26664o(3671);
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20527q.C20528a.m38714a(vm1, bVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.view.f.f$g */
    static final class C81274g extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C81267f f181592a;

        static {
            Covode.recordClassIndex(94604);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81274g(C81267f fVar) {
            super(2);
            this.f181592a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, String str) {
            String str2 = str;
            C89219l.m154721d(iVar, "");
            if (str2 != null) {
                ((RoundedFrameLayout) this.f181592a.mo124753b(R.id.d8v)).setBackgroundColor(Color.parseColor(str2));
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.view.f.f$l */
    static final class DialogInterface$OnClickListenerC81279l implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C81267f f181600a;

        /* renamed from: b */
        final /* synthetic */ File f181601b;

        /* renamed from: c */
        final /* synthetic */ SmartAvatarImageView f181602c;

        /* renamed from: d */
        final /* synthetic */ int f181603d;

        static {
            Covode.recordClassIndex(94609);
        }

        DialogInterface$OnClickListenerC81279l(C81267f fVar, File file, SmartAvatarImageView smartAvatarImageView, int i) {
            this.f181600a = fVar;
            this.f181601b = file;
            this.f181602c = smartAvatarImageView;
            this.f181603d = i;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C39162r.m79460a("deny_set_avatar_profile", new C33744d().f79943a);
            this.f181600a.mo124754b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.view.f.f$h */
    static final class C81275h extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C81267f f181593a;

        static {
            Covode.recordClassIndex(94605);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81275h(C81267f fVar) {
            super(2);
            this.f181593a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(iVar, "");
            if (booleanValue) {
                this.f181593a.f181579b.removeCallbacksAndMessages(null);
                Runnable runnable = this.f181593a.f181578a;
                if (runnable != null) {
                    runnable.run();
                }
                this.f181593a.f181578a = null;
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.view.f.f$k */
    static final class DialogInterface$OnClickListenerC81278k implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C81267f f181596a;

        /* renamed from: b */
        final /* synthetic */ File f181597b;

        /* renamed from: c */
        final /* synthetic */ SmartAvatarImageView f181598c;

        /* renamed from: d */
        final /* synthetic */ int f181599d;

        static {
            Covode.recordClassIndex(94608);
        }

        DialogInterface$OnClickListenerC81278k(C81267f fVar, File file, SmartAvatarImageView smartAvatarImageView, int i) {
            this.f181596a = fVar;
            this.f181597b = file;
            this.f181598c = smartAvatarImageView;
            this.f181599d = i;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            String str = this.f181596a.f181580c;
            C89219l.m154721d(str, "");
            C39162r.m79460a("confirm_set_avatar_profile", new C33744d().mo59983a("enter_from", str).f79943a);
            ProfileNaviCreatorViewModel a = this.f181596a.mo124751a();
            File file = this.f181597b;
            C89219l.m154721d(file, "");
            a.mo33690d(ProfileNaviCreatorViewModel.C81318r.f181657a);
            C60159r.f137140c = new C60141c(file);
            ProfileNaviCreatorViewModel.C81300a.m141044a(file, ProfileNaviCreatorViewModel.C81319s.f181658a);
            ProfileNaviCreatorViewModel.m141034i();
            this.f181596a.mo124754b();
        }
    }

    public C81267f(String str, AbstractC81268a aVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(aVar, "");
        this.f181580c = str;
        this.f181581d = aVar;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        UrlModel urlModel;
        MethodCollector.m26663i(4896);
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        AbstractC88412b unused = selectSubscribe(mo124751a(), C81280g.f181604a, new C20370ah(), new C81274g(this));
        AbstractC88412b unused2 = selectSubscribe(mo124751a(), C81281h.f181605a, new C20370ah(), new C81275h(this));
        if (!(getContext() == null || getFragmentManager() == null)) {
            RecyclerView recyclerView = (RecyclerView) mo124753b(R.id.d8s);
            C89219l.m154716b(recyclerView, "");
            getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
            RecyclerView recyclerView2 = (RecyclerView) mo124753b(R.id.d8s);
            C89219l.m154716b(recyclerView2, "");
            recyclerView2.setAdapter(new C81118a(m141014c(), this));
            C60143e eVar = m141014c().f137091b;
            if (eVar != null) {
                m141013b(eVar);
            }
        }
        mo124751a();
        if (ProfileNaviCreatorViewModel.m141033b() != null) {
            SmartImageView smartImageView = (SmartImageView) mo124753b(R.id.d8y);
            mo124751a();
            File b = ProfileNaviCreatorViewModel.m141033b();
            if (b == null) {
                C89219l.m154715b();
            }
            smartImageView.setImageBitmap(BitmapFactory.decodeFile(b.getAbsolutePath()));
        } else {
            mo124751a();
            C60157q qVar = C60159r.f137138a;
            if (!(qVar == null || (urlModel = qVar.f137136e) == null)) {
                C20766v a = C20761r.m39060a(C34735v.m70965a(urlModel));
                a.f49092E = (SmartImageView) mo124753b(R.id.d8y);
                a.f49125v = EnumC20767w.CENTER_INSIDE;
                a.mo34186c();
            }
        }
        ((TuxButton) mo124753b(R.id.d8w)).setOnClickListener(new View$OnClickListenerC81272e(this));
        ((TuxIconView) mo124753b(R.id.d8q)).setOnClickListener(new View$OnClickListenerC81273f(this));
        MethodCollector.m26664o(4896);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.ap0, viewGroup, false);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af> AbstractC88412b subscribe(JediViewModel<S> jediViewModel, C20370ah<S> ahVar, AbstractC89183m<? super AbstractC20477i, ? super S, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20527q.C20528a.m38708a(this, jediViewModel, ahVar, mVar);
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
