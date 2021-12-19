package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.p3108b.p3110b.p3112b;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.emoji.emojichoose.C46502d;
import com.p2082ss.android.ugc.aweme.emoji.emojichoose.C46514m;
import com.p2082ss.android.ugc.aweme.emoji.emojichoose.C46517n;
import com.p2082ss.android.ugc.aweme.emoji.emojichoose.model.C46516b;
import com.p2082ss.android.ugc.aweme.emoji.p2897b.AbstractC46451e;
import com.p2082ss.android.ugc.aweme.emoji.p2897b.AbstractC46452f;
import com.p2082ss.android.ugc.aweme.emoji.p2897b.AbstractC46453g;
import com.p2082ss.android.ugc.aweme.emoji.p2899d.AbstractC46463c;
import com.p2082ss.android.ugc.aweme.emoji.p2904g.C46534a;
import com.p2082ss.android.ugc.aweme.emoji.systembigemoji.AbstractC46626d;
import com.p2082ss.android.ugc.aweme.emoji.systembigemoji.C46616a;
import com.p2082ss.android.ugc.aweme.emoji.systembigemoji.C46621b;
import com.p2082ss.android.ugc.aweme.emoji.systembigemoji.C46625c;
import com.p2082ss.android.ugc.aweme.emoji.views.SwipeControlledViewPager;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.base.AbstractC54142b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.base.AbstractView$OnClickListenerC54146d;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.base.InputViewDelegate;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.p3108b.p3110b.p3111a.C54092a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.p3108b.p3110b.p3111a.C54094b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3177h.p3178a.C55127a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3177h.p3178a.C55139j;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3177h.p3178a.C55140k;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import com.p2082ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.C89517an;
import kotlinx.coroutines.CoroutineExceptionHandler;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4603c.AbstractC89097a;
import p4600h.p4603c.AbstractC89127f;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.b.b.b.a */
public final class C54101a extends AbstractC46451e implements AbstractC46453g, AbstractC46463c, AbstractC46626d {

    /* renamed from: c */
    final LinearLayoutManager f123971c;

    /* renamed from: d */
    final AbstractC89244h f123972d;

    /* renamed from: e */
    public final C46517n f123973e;

    /* renamed from: f */
    int f123974f;

    /* renamed from: g */
    public final AbstractC54142b f123975g;

    /* renamed from: h */
    private final AbstractC89516am f123976h;

    /* renamed from: i */
    private final AbstractC89244h f123977i;

    /* renamed from: j */
    private final AbstractC89244h f123978j;

    /* renamed from: k */
    private final AbstractC89244h f123979k;

    /* renamed from: l */
    private final AbstractC89244h f123980l;

    /* renamed from: o */
    private final C46502d f123981o;

    static {
        Covode.recordClassIndex(63778);
    }

    /* renamed from: j */
    private SwipeControlledViewPager m99290j() {
        return (SwipeControlledViewPager) this.f123978j.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.p2897b.AbstractC46453g
    /* renamed from: a */
    public final C46514m mo78983a() {
        return null;
    }

    /* renamed from: c */
    public final Button mo91180c() {
        return (Button) this.f123977i.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final RecyclerView mo91181d() {
        return (RecyclerView) this.f123979k.getValue();
    }

    /* renamed from: e */
    public final ImageView mo91182e() {
        return (ImageView) this.f123980l.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.p2897b.AbstractC46453g
    /* renamed from: b */
    public final C46517n mo78985b() {
        return this.f123973e;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.b.b.b.a$b */
    public static final class C54104b {

        /* renamed from: a */
        private final C46502d f123983a = new C46502d();

        /* renamed from: b */
        private final AbstractC54142b f123984b;

        /* renamed from: c */
        private final ViewGroup f123985c;

        static {
            Covode.recordClassIndex(63781);
        }

        /* renamed from: e */
        public final C54104b mo91191e() {
            this.f123983a.f108385g = 1;
            return this;
        }

        /* renamed from: g */
        public final C54101a mo91193g() {
            return new C54101a(this.f123984b, this.f123983a, this.f123985c, (byte) 0);
        }

        /* renamed from: a */
        public final C54104b mo91187a() {
            this.f123983a.f108379a = true;
            this.f123983a.f108386h.add(1);
            return this;
        }

        /* renamed from: b */
        public final C54104b mo91188b() {
            this.f123983a.f108383e = true;
            this.f123983a.f108386h.add(5);
            return this;
        }

        /* renamed from: c */
        public final C54104b mo91189c() {
            this.f123983a.f108380b = true;
            this.f123983a.f108386h.add(3);
            return this;
        }

        /* renamed from: d */
        public final C54104b mo91190d() {
            this.f123983a.f108381c = true;
            this.f123983a.f108386h.add(4);
            return this;
        }

        /* renamed from: f */
        public final C54104b mo91192f() {
            this.f123983a.f108382d = true;
            this.f123983a.f108386h.add(2);
            return this;
        }

        public C54104b(AbstractC54142b bVar, ViewGroup viewGroup) {
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(viewGroup, "");
            this.f123984b = bVar;
            this.f123985c = viewGroup;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.b.b.b.a$c */
    static final class C54105c extends AbstractC89220m implements AbstractC89171a<SwipeControlledViewPager> {

        /* renamed from: a */
        final /* synthetic */ C54101a f123986a;

        static {
            Covode.recordClassIndex(63782);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54105c(C54101a aVar) {
            super(0);
            this.f123986a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SwipeControlledViewPager invoke() {
            return this.f123986a.f108227b.findViewById(R.id.auc);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.b.b.b.a$d */
    static final class C54106d extends AbstractC89220m implements AbstractC89171a<Button> {

        /* renamed from: a */
        final /* synthetic */ C54101a f123987a;

        static {
            Covode.recordClassIndex(63783);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54106d(C54101a aVar) {
            super(0);
            this.f123987a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Button invoke() {
            return this.f123987a.f108227b.findViewById(R.id.auf);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.b.b.b.a$e */
    static final class C54107e extends AbstractC89220m implements AbstractC89171a<ImageView> {

        /* renamed from: a */
        final /* synthetic */ C54101a f123988a;

        static {
            Covode.recordClassIndex(63784);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54107e(C54101a aVar) {
            super(0);
            this.f123988a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ImageView invoke() {
            return this.f123988a.f108227b.findViewById(R.id.aui);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.b.b.b.a$f */
    static final class C54108f extends AbstractC89220m implements AbstractC89171a<RecyclerView> {

        /* renamed from: a */
        final /* synthetic */ C54101a f123989a;

        static {
            Covode.recordClassIndex(63785);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54108f(C54101a aVar) {
            super(0);
            this.f123989a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ RecyclerView invoke() {
            return this.f123989a.f108227b.findViewById(R.id.aun);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.b.b.b.a$h */
    static final class C54110h extends AbstractC89220m implements AbstractC89171a<InputViewDelegate> {

        /* renamed from: a */
        final /* synthetic */ C54101a f123991a;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f123992b;

        static {
            Covode.recordClassIndex(63787);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54110h(C54101a aVar, ViewGroup viewGroup) {
            super(0);
            this.f123991a = aVar;
            this.f123992b = viewGroup;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ InputViewDelegate invoke() {
            AbstractC54142b bVar = this.f123991a.f123975g;
            this.f123992b.getContext();
            return new InputViewDelegate(bVar);
        }
    }

    /* renamed from: f */
    public final void mo91183f() {
        if (!C46616a.m89982b()) {
            this.f123973e.mo79058a();
            m99291k();
        }
    }

    /* renamed from: k */
    private final void m99291k() {
        SwipeControlledViewPager j = m99290j();
        C89219l.m154716b(j, "");
        PagerAdapter adapter = j.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    /* renamed from: g */
    public final void mo91184g() {
        if (this.f123981o.f108381c) {
            C89219l.m154721d(this, "");
        }
        if (this.f123981o.f108382d) {
            C46616a.m89979a(this);
        }
        C89517an.m155450b(this.f123976h);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo91185h() {
        long i = mo91186i();
        AbstractC46452f fVar = this.f123973e.f108449a;
        if (i > 0) {
            C89219l.m154716b(fVar, "");
            if (fVar.mo78974i()) {
                C55127a.f126154a.mo92037a(new C55140k(i), new C55139j());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final long mo91186i() {
        AbstractC46452f fVar = this.f123973e.f108449a;
        if (fVar.mo78975j() != 2) {
            return -1;
        }
        Objects.requireNonNull(fVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.emoji.systembigemoji.EmojiType");
        C46625c cVar = (C46625c) fVar;
        if (cVar.f108729d == null) {
            return -1;
        }
        C46516b bVar = cVar.f108729d;
        C89219l.m154716b(bVar, "");
        return bVar.getId();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.b.b.b.a$a */
    public static final class C54103a extends AbstractC89097a implements CoroutineExceptionHandler {
        static {
            Covode.recordClassIndex(63780);
        }

        public C54103a(AbstractC89127f.AbstractC89132c cVar) {
            super(cVar);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public final void handleException(AbstractC89127f fVar, Throwable th) {
            if (!(th instanceof CancellationException)) {
                C56244a.m102188a(th);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.b.b.b.a$g */
    public static final class C54109g implements AbstractView$OnClickListenerC54146d {

        /* renamed from: a */
        final /* synthetic */ C54101a f123990a;

        static {
            Covode.recordClassIndex(63786);
        }

        public final boolean onLongClick(View view) {
            return false;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C54109g(C54101a aVar) {
            this.f123990a = aVar;
        }

        public final void onClick(View view) {
            if (C89219l.m154714a(view, this.f123990a.mo91180c())) {
                ((InputViewDelegate) this.f123990a.f123972d.getValue()).mo91249q();
            }
        }
    }

    /* renamed from: a */
    public final void mo91178a(View.OnClickListener onClickListener) {
        mo91182e().setOnClickListener(onClickListener);
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.systembigemoji.AbstractC46626d
    /* renamed from: a */
    public final void mo79230a(LinkedHashMap<C46516b, List<C46534a>> linkedHashMap) {
        mo91183f();
    }

    @Override // com.p2082ss.android.ugc.aweme.emoji.p2897b.AbstractC46453g
    /* renamed from: a */
    public final void mo78984a(int i) {
        this.f123973e.mo79059a(i);
        m99290j().setCurrentItem(this.f123973e.f108451c, false);
    }

    /* renamed from: a */
    public final void mo91179a(boolean z) {
        Button c = mo91180c();
        C89219l.m154716b(c, "");
        c.setEnabled(z);
        if (z) {
            Button c2 = mo91180c();
            Button c3 = mo91180c();
            C89219l.m154716b(c3, "");
            Context context = c3.getContext();
            C89219l.m154716b(context, "");
            c2.setTextColor(context.getResources().getColor(R.color.t));
            return;
        }
        Button c4 = mo91180c();
        Button c5 = mo91180c();
        C89219l.m154716b(c5, "");
        Context context2 = c5.getContext();
        C89219l.m154716b(context2, "");
        c4.setTextColor(context2.getResources().getColor(R.color.c2));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.emoji.g.a> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p2082ss.android.ugc.aweme.emoji.systembigemoji.AbstractC46626d
    /* renamed from: a */
    public final void mo79229a(C46516b bVar, List<? extends C46534a> list) {
        C89219l.m154721d(bVar, "");
        if (!C13603b.m24435a((Collection) list)) {
            int c = this.f123973e.mo79062c();
            for (int i = 0; i < c; i++) {
                AbstractC46452f b = this.f123973e.mo79061b(i);
                if (b.mo78975j() == 2) {
                    Objects.requireNonNull(b, "null cannot be cast to non-null type com.ss.android.ugc.aweme.emoji.systembigemoji.EmojiType");
                    C46625c cVar = (C46625c) b;
                    if (C89219l.m154714a(cVar.f108729d, bVar)) {
                        cVar.f108728c = list;
                        C46517n nVar = this.f123973e;
                        nVar.mo79059a(nVar.f108451c);
                        m99291k();
                        m99290j().setCurrentItem(this.f123973e.f108451c, false);
                        mo91185h();
                        return;
                    }
                }
            }
        }
    }

    private C54101a(AbstractC54142b bVar, C46502d dVar, ViewGroup viewGroup) {
        super(viewGroup, R.layout.yx);
        this.f123975g = bVar;
        this.f123981o = dVar;
        this.f108227b.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0, false);
        this.f123971c = linearLayoutManager;
        this.f123976h = C89517an.m155448a(new C54103a(CoroutineExceptionHandler.f203145c));
        this.f123972d = C89250i.m154773a((AbstractC89171a) new C54110h(this, viewGroup));
        this.f123977i = C89250i.m154773a((AbstractC89171a) new C54106d(this));
        this.f123978j = C89250i.m154773a((AbstractC89171a) new C54105c(this));
        this.f123979k = C89250i.m154773a((AbstractC89171a) new C54108f(this));
        this.f123980l = C89250i.m154773a((AbstractC89171a) new C54107e(this));
        this.f123973e = new C46517n(dVar);
        SwipeControlledViewPager j = m99290j();
        C89219l.m154716b(j, "");
        SwipeControlledViewPager j2 = m99290j();
        C89219l.m154716b(j2, "");
        j.setAdapter(new C54092a(bVar, j2, this));
        RecyclerView d = mo91181d();
        C89219l.m154716b(d, "");
        d.setLayoutManager(linearLayoutManager);
        RecyclerView d2 = mo91181d();
        C89219l.m154716b(d2, "");
        d2.setAdapter(new C54094b(this));
        m99290j().addOnPageChangeListener(new ViewPager.C1582h(this) {
            /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.p3108b.p3110b.p3112b.C54101a.C541021 */

            /* renamed from: a */
            final /* synthetic */ C54101a f123982a;

            static {
                Covode.recordClassIndex(63779);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f123982a = r1;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:17:0x005f, code lost:
                if (r1.getLeft() < 0) goto L_0x0061;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:53:0x0158, code lost:
                if (r1 > r0.getWidth()) goto L_0x0061;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:54:0x015c, code lost:
                if (r6 == false) goto L_0x006c;
             */
            @Override // androidx.viewpager.widget.ViewPager.C1582h, androidx.viewpager.widget.ViewPager.AbstractC1579e
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onPageSelected(int r10) {
                /*
                // Method dump skipped, instructions count: 352
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.p3108b.p3110b.p3112b.C54101a.C541021.onPageSelected(int):void");
            }
        });
        if (!dVar.f108381c) {
            View findViewById = this.f108227b.findViewById(R.id.c3z);
            C89219l.m154716b(findViewById, "");
            findViewById.setVisibility(8);
        }
        m99291k();
        mo91180c().setOnClickListener(new C54109g(this));
        mo79269a(mo91180c());
        if (dVar.f108381c) {
            C89219l.m154721d(this, "");
        }
        if (dVar.f108382d) {
            C89219l.m154721d(this, "");
            if (!C46616a.f108704b.contains(this)) {
                C46616a.f108704b.add(this);
            }
            if (C46621b.f108717b.f108734d) {
                C46616a.m89980a(false);
            }
        }
    }

    public /* synthetic */ C54101a(AbstractC54142b bVar, C46502d dVar, ViewGroup viewGroup, byte b) {
        this(bVar, dVar, viewGroup);
    }
}
