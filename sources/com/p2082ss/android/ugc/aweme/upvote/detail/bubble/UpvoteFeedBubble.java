package com.p2082ss.android.ugc.aweme.upvote.detail.bubble;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.extensions.C12793o;
import com.bytedance.assem.arch.extensions.C12794p;
import com.bytedance.assem.arch.extensions.C12795q;
import com.bytedance.assem.arch.extensions.C12796r;
import com.bytedance.assem.arch.viewModel.AbstractC12818f;
import com.bytedance.assem.arch.viewModel.AbstractC12846h;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.C12815c;
import com.bytedance.assem.arch.viewModel.C12854k;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.assem.p793a.C12642a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hox.Hox;
import com.bytedance.hox.p1106a.AbstractC15497d;
import com.bytedance.tiktok.proxy.AbstractC22876d;
import com.bytedance.tiktok.proxy.AbstractC22878f;
import com.bytedance.tiktok.proxy.AbstractC22880h;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.tux.sheet.sheet.C23226a;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.upvote.UpvoteReason;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.upvote.detail.AbstractC79752c;
import com.p2082ss.android.ugc.aweme.upvote.detail.C79722b;
import com.p2082ss.android.ugc.aweme.upvote.detail.C79788d;
import com.p2082ss.android.ugc.aweme.upvote.detail.UpvoteListViewModel;
import com.p2082ss.android.ugc.aweme.upvote.detail.panel.DialogInterface$OnDismissListenerC79847e;
import com.p2082ss.android.ugc.aweme.upvote.event.C79899b;
import com.p2082ss.android.ugc.aweme.upvote.p4187a.AbstractC79704a;
import com.p2082ss.android.ugc.aweme.upvote.p4188b.C79706b;
import com.p2082ss.android.ugc.aweme.upvote.p4189c.C79711e;
import com.p2082ss.android.ugc.aweme.upvote.publish.C80022g;
import com.p2082ss.android.ugc.aweme.upvote.publish.UpvotePublishVM;
import com.p2082ss.android.ugc.aweme.utils.ActivityStack;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.upvote.detail.bubble.UpvoteFeedBubble */
public final class UpvoteFeedBubble implements AbstractC12846h, AbstractC15497d, AbstractC33974au, AbstractC79704a {

    /* renamed from: a */
    public final FrameLayout f178895a;

    /* renamed from: b */
    public final AbstractC1204m f178896b;

    /* renamed from: c */
    private final AbstractC89244h f178897c = C89250i.m154773a((AbstractC89171a) new C79734h(this));

    /* renamed from: d */
    private final AbstractC89244h f178898d = C89250i.m154773a((AbstractC89171a) new C79731e(this));

    /* renamed from: e */
    private boolean f178899e;

    /* renamed from: f */
    private boolean f178900f;

    /* renamed from: g */
    private DialogInterface$OnDismissListenerC79847e f178901g;

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.bubble.UpvoteFeedBubble$a */
    public static final class C79727a extends AbstractC89220m implements AbstractC89172b<C80022g, C80022g> {
        public static final C79727a INSTANCE = new C79727a();

        static {
            Covode.recordClassIndex(92950);
        }

        public C79727a() {
            super(1);
        }

        public final C80022g invoke(C80022g gVar) {
            C89219l.m154719c(gVar, "");
            return gVar;
        }
    }

    static {
        Covode.recordClassIndex(92949);
    }

    /* renamed from: a */
    public final UpvoteListViewModel mo123326a() {
        return (UpvoteListViewModel) this.f178897c.getValue();
    }

    /* renamed from: b */
    public final C79736a mo123327b() {
        return (C79736a) this.f178898d.getValue();
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

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_RESUME) {
            onResume();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_PAUSE) {
            onPause();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.bubble.UpvoteFeedBubble$c */
    public static final class C79729c extends AbstractC89220m implements AbstractC89171a<AbstractC1204m> {

        /* renamed from: a */
        final /* synthetic */ AbstractC1204m f178902a;

        static {
            Covode.recordClassIndex(92952);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C79729c(AbstractC1204m mVar) {
            super(0);
            this.f178902a = mVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC1204m invoke() {
            return this.f178902a;
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

    @Override // com.p2082ss.android.ugc.aweme.upvote.p4187a.AbstractC79704a
    /* renamed from: a */
    public final void mo123245a(boolean z) {
        if (this.f178899e) {
            if (z) {
                C79736a.m138578a(mo123327b(), false, true);
            } else {
                mo123327b().mo123334a(true);
                String str = mo123326a().f178881b;
                if (str != null) {
                    C89219l.m154721d(str, "");
                    C79711e b = C79722b.m138559b(str);
                    if (b != null && b.getUpvotes().size() > 20) {
                        C79722b.m138558a(str, C79711e.copy$default(b, b.getUpvotes().subList(0, 20), 20, true, 0, null, 24, null), true);
                    }
                }
            }
            mo123326a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.bubble.UpvoteFeedBubble$b */
    public static final class C79728b extends AbstractC89220m implements AbstractC89171a<C12874b<C80022g>> {
        public static final C79728b INSTANCE = new C79728b();

        static {
            Covode.recordClassIndex(92951);
        }

        public C79728b() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C80022g> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.bubble.UpvoteFeedBubble$d */
    public static final class C79730d extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C79730d INSTANCE = new C79730d();

        static {
            Covode.recordClassIndex(92953);
        }

        public C79730d() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_PAUSE)
    public final void onPause() {
        mo123327b().mo123337d();
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_RESUME)
    public final void onResume() {
        mo123327b().mo123338e();
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.bubble.UpvoteFeedBubble$e */
    static final class C79731e extends AbstractC89220m implements AbstractC89171a<C79736a> {

        /* renamed from: a */
        final /* synthetic */ UpvoteFeedBubble f178903a;

        static {
            Covode.recordClassIndex(92954);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79731e(UpvoteFeedBubble upvoteFeedBubble) {
            super(0);
            this.f178903a = upvoteFeedBubble;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C79736a invoke() {
            return new C79736a(this.f178903a.f178895a, this.f178903a.mo123326a());
        }
    }

    @Override // androidx.lifecycle.AbstractC1204m
    public final AbstractC1196i getLifecycle() {
        AbstractC1196i lifecycle = this.f178896b.getLifecycle();
        C89219l.m154716b(lifecycle, "");
        return lifecycle;
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.bubble.UpvoteFeedBubble$h */
    static final class C79734h extends AbstractC89220m implements AbstractC89171a<UpvoteListViewModel> {

        /* renamed from: a */
        final /* synthetic */ UpvoteFeedBubble f178906a;

        static {
            Covode.recordClassIndex(92957);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79734h(UpvoteFeedBubble upvoteFeedBubble) {
            super(0);
            this.f178906a = upvoteFeedBubble;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ UpvoteListViewModel invoke() {
            UpvoteListViewModel a = UpvoteListViewModel.C79719a.m138552a(this.f178906a.f178896b);
            a.mo123317a().observe(this.f178906a.f178896b, new C79735a(this));
            return a;
        }

        /* renamed from: com.ss.android.ugc.aweme.upvote.detail.bubble.UpvoteFeedBubble$h$a */
        static final class C79735a<T> implements AbstractC1214u {

            /* renamed from: a */
            final /* synthetic */ C79734h f178907a;

            static {
                Covode.recordClassIndex(92958);
            }

            C79735a(C79734h hVar) {
                this.f178907a = hVar;
            }

            @Override // androidx.lifecycle.AbstractC1214u
            public final /* synthetic */ void onChanged(Object obj) {
                UpvoteFeedBubble upvoteFeedBubble = this.f178907a.f178906a;
                if (upvoteFeedBubble.mo123326a().mo123322c()) {
                    upvoteFeedBubble.f178895a.setVisibility(8);
                    return;
                }
                upvoteFeedBubble.mo123328c();
                C79736a.m138578a(upvoteFeedBubble.mo123327b(), true, false);
                upvoteFeedBubble.f178895a.setVisibility(0);
            }
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void onDestroy() {
        Context context = this.f178895a.getContext();
        if (!(context instanceof ActivityC0945e)) {
            context = null;
        }
        ActivityC0945e eVar = (ActivityC0945e) context;
        if (eVar != null) {
            Hox.C15490a.m28529a(eVar).mo25212b("For You", this);
            this.f178900f = false;
        }
    }

    /* renamed from: c */
    public final void mo123328c() {
        Context context = this.f178895a.getContext();
        if (!(context instanceof ActivityC0945e)) {
            context = null;
        }
        ActivityC0945e eVar = (ActivityC0945e) context;
        if (eVar != null && !this.f178900f) {
            Hox.C15490a.m28529a(eVar).mo25209a("For You", this);
            this.f178900f = true;
        }
    }

    @Override // com.bytedance.hox.p1106a.AbstractC15497d
    /* renamed from: a */
    public final void mo25223a(Bundle bundle) {
        C89219l.m154721d(bundle, "");
        mo123327b().mo123338e();
    }

    @Override // com.bytedance.hox.p1106a.AbstractC15497d
    /* renamed from: b */
    public final void mo25224b(Bundle bundle) {
        C89219l.m154721d(bundle, "");
        mo123327b().mo123337d();
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.bubble.UpvoteFeedBubble$g */
    static final class C79733g extends AbstractC89220m implements AbstractC89172b<View, C89391z> {

        /* renamed from: a */
        final /* synthetic */ UpvoteFeedBubble f178905a;

        static {
            Covode.recordClassIndex(92956);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79733g(UpvoteFeedBubble upvoteFeedBubble) {
            super(1);
            this.f178905a = upvoteFeedBubble;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(View view) {
            String str;
            Long l;
            String str2;
            View view2 = view;
            C89219l.m154721d(view2, "");
            if (!C58001a.m104815a(view2, 1200)) {
                UpvoteFeedBubble upvoteFeedBubble = this.f178905a;
                boolean b = upvoteFeedBubble.mo123326a().mo123321b();
                C89378p[] pVarArr = new C89378p[4];
                C79899b bVar = upvoteFeedBubble.mo123326a().f178883d;
                if (bVar != null) {
                    str = bVar.f179145a;
                } else {
                    str = null;
                }
                pVarArr[0] = C89387v.m154943a(str, "enter_from");
                C79711e value = upvoteFeedBubble.mo123326a().mo123317a().getValue();
                if (value != null) {
                    l = Long.valueOf(value.getTotal());
                } else {
                    l = null;
                }
                pVarArr[1] = C89387v.m154943a(l, "recommend_cnt");
                String str3 = "0";
                if (b) {
                    str2 = str3;
                } else {
                    str2 = "1";
                }
                pVarArr[2] = C89387v.m154943a(str2, "with_repost_button");
                if (b) {
                    str3 = "1";
                }
                pVarArr[3] = C89387v.m154943a(str3, "is_self");
                C39162r.m79462a("recommend_entrance_click", pVarArr);
                this.f178905a.mo123243a((String) null);
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.upvote.p4187a.AbstractC79704a
    /* renamed from: a */
    public final void mo123243a(String str) {
        String str2;
        AbstractC0952i supportFragmentManager;
        int i;
        if (this.f178899e && (str2 = mo123326a().f178881b) != null && !UpvoteListViewModel.f178878e) {
            UpvoteListViewModel.f178878e = true;
            String str3 = mo123326a().f178882c;
            DialogInterface$OnDismissListenerC79847e eVar = this.f178901g;
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            Activity validTopActivity = ActivityStack.getValidTopActivity();
            DialogInterface$OnDismissListenerC79847e eVar2 = null;
            if (!(validTopActivity instanceof ActivityC0945e)) {
                validTopActivity = null;
            }
            ActivityC0945e eVar3 = (ActivityC0945e) validTopActivity;
            if (!(eVar3 == null || (supportFragmentManager = eVar3.getSupportFragmentManager()) == null)) {
                if (eVar != null) {
                    Bundle arguments = eVar.getArguments();
                    if (arguments != null) {
                        arguments.putBoolean("is_first_time_open", false);
                    }
                } else {
                    eVar = new DialogInterface$OnDismissListenerC79847e();
                    Bundle bundle = new Bundle();
                    bundle.putString("aid", str2);
                    bundle.putString("vm", str3);
                    bundle.putString("upvote_id", str);
                    bundle.putBoolean("is_first_time_open", true);
                    eVar.setArguments(bundle);
                }
                Resources resources = eVar3.getResources();
                C89219l.m154709a((Object) resources, "");
                DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                if (displayMetrics != null) {
                    i = displayMetrics.heightPixels;
                } else {
                    i = 0;
                }
                C23226a.C23227a c = new C23226a.C23227a().mo37812a(2).mo37819a(false).mo37817a((Fragment) eVar).mo37822b(false).mo37823c();
                double d = (double) i;
                Double.isNaN(d);
                Double.isNaN(d);
                c.mo37813a((int) (0.5d * d), (int) (d * 0.73d)).mo37815a((DialogInterface.OnDismissListener) eVar).f55057a.show(supportFragmentManager, "UpvoteDetailPanelFragment");
                eVar2 = eVar;
            }
            this.f178901g = eVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.bubble.UpvoteFeedBubble$f */
    static final class C79732f extends AbstractC89220m implements AbstractC89183m<AbstractC22876d, C12776a<? extends C89378p<? extends Integer, ? extends String>>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ UpvoteFeedBubble f178904a;

        static {
            Covode.recordClassIndex(92955);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79732f(UpvoteFeedBubble upvoteFeedBubble) {
            super(2);
            this.f178904a = upvoteFeedBubble;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC22876d dVar, C12776a<? extends C89378p<? extends Integer, ? extends String>> aVar) {
            T t;
            C12776a<? extends C89378p<? extends Integer, ? extends String>> aVar2 = aVar;
            C89219l.m154721d(dVar, "");
            if (!(aVar2 == null || (t = aVar2.f31085a) == null || !C89219l.m154714a(t.component2(), (Object) this.f178904a.mo123326a().f178881b))) {
                this.f178904a.mo123328c();
                C79736a.m138578a(this.f178904a.mo123327b(), false, true);
            }
            return C89391z.f203057a;
        }
    }

    public UpvoteFeedBubble(FrameLayout frameLayout, AbstractC1204m mVar) {
        C89219l.m154721d(frameLayout, "");
        C89219l.m154721d(mVar, "");
        this.f178895a = frameLayout;
        this.f178896b = mVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.upvote.p4187a.AbstractC79704a
    /* renamed from: a */
    public final void mo123244a(String str, boolean z, C79899b bVar) {
        C79711e eVar;
        UpvoteReason a;
        C89219l.m154721d(bVar, "");
        if (!this.f178899e) {
            C79736a b = mo123327b();
            C79733g gVar = new C79733g(this);
            C89219l.m154721d(gVar, "");
            b.f178911b = gVar;
            AbstractC1196i lifecycle = this.f178896b.getLifecycle();
            C89219l.m154716b(lifecycle, "");
            if (lifecycle.mo4011a() != AbstractC1196i.EnumC1199b.DESTROYED) {
                AbstractC12818f.C12819a.m23063a(this, (AssemViewModel) new C12642a(C89204ab.m154669a(UpvotePublishVM.class), null, C79728b.INSTANCE, new C79729c(this.f178896b), C79730d.INSTANCE, C79727a.INSTANCE, null, null).getValue(), C79751c.f178939a, (C12854k) null, new C79732f(this), 6);
            }
            this.f178896b.getLifecycle().mo4012a(this);
            this.f178899e = true;
        }
        if (!C89219l.m154714a((Object) mo123326a().f178881b, (Object) str)) {
            this.f178895a.setVisibility(8);
            if (!z) {
                new C23144b(this.f178895a).mo37640e(((Number) C79706b.m138537a(Integer.valueOf((int) R.string.f6o), Integer.valueOf((int) R.string.fay))).intValue()).mo37637b();
                return;
            }
            UpvoteListViewModel a2 = mo123326a();
            C89219l.m154721d(bVar, "");
            String str2 = a2.f178881b;
            if (str2 != null) {
                C79788d.m138617a(str2, a2);
            }
            a2.f178881b = str;
            a2.f178883d = bVar;
            String str3 = a2.f178881b;
            if (str3 != null) {
                C89219l.m154721d(str3, "");
                C89219l.m154721d(a2, "");
                List<AbstractC79752c> list = C79788d.m138614a().get(str3);
                if (list == null) {
                    list = new ArrayList<>();
                }
                if (!list.contains(a2)) {
                    list.add(a2);
                }
                C79788d.m138614a().put(str3, list);
                eVar = C79722b.m138559b(str3);
                if (eVar == null && (a = C79722b.m138555a(str3)) != null) {
                    C79788d.m138616a(str3, a, 0, "", null);
                }
            } else {
                eVar = null;
            }
            a2.mo123318a(eVar);
            this.f178901g = null;
        }
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
