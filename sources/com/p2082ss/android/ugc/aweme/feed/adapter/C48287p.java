package com.p2082ss.android.ugc.aweme.feed.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p084a.p088b.C1870c;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.LongPressLayout;
import com.p2082ss.android.ugc.aweme.story.C77260g;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.p */
public final class C48287p {

    /* renamed from: a */
    static final AbstractC89172b<C48154an, View> f111908a = C48291d.f111915a;

    /* renamed from: b */
    static final AbstractC89172b<C48186ax, Boolean> f111909b = C48288a.f111912a;

    /* renamed from: c */
    static final AbstractC89172b<C48154an, View> f111910c = C48289b.f111913a;

    /* renamed from: d */
    static final AbstractC89172b<C48154an, View> f111911d = C48290c.f111914a;

    static {
        Covode.recordClassIndex(57029);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.p$a */
    static final class C48288a extends AbstractC89220m implements AbstractC89172b<C48186ax, Boolean> {

        /* renamed from: a */
        public static final C48288a f111912a = new C48288a();

        static {
            Covode.recordClassIndex(57030);
        }

        C48288a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(C48186ax axVar) {
            C89219l.m154721d(axVar, "");
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.p$b */
    static final class C48289b extends AbstractC89220m implements AbstractC89172b<C48154an, View> {

        /* renamed from: a */
        public static final C48289b f111913a = new C48289b();

        static {
            Covode.recordClassIndex(57031);
        }

        C48289b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ View invoke(C48154an anVar) {
            C48154an anVar2 = anVar;
            C89219l.m154721d(anVar2, "");
            System.currentTimeMillis();
            Context context = anVar2.f111539b;
            Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
            View a = C1870c.m6045a((Activity) context, C77260g.f173332a.mo120149b());
            System.currentTimeMillis();
            C89219l.m154716b(a, "");
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.p$c */
    static final class C48290c extends AbstractC89220m implements AbstractC89172b<C48154an, View> {

        /* renamed from: a */
        public static final C48290c f111914a = new C48290c();

        static {
            Covode.recordClassIndex(57032);
        }

        C48290c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ View invoke(C48154an anVar) {
            C48154an anVar2 = anVar;
            C89219l.m154721d(anVar2, "");
            System.currentTimeMillis();
            Context context = anVar2.f111539b;
            Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
            View a = C1870c.m6045a((Activity) context, C77260g.f173332a.mo120153c());
            System.currentTimeMillis();
            C89219l.m154716b(a, "");
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.p$d */
    static final class C48291d extends AbstractC89220m implements AbstractC89172b<C48154an, View> {

        /* renamed from: a */
        public static final C48291d f111915a = new C48291d();

        static {
            Covode.recordClassIndex(57033);
        }

        C48291d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ View invoke(C48154an anVar) {
            C48154an anVar2 = anVar;
            C89219l.m154721d(anVar2, "");
            System.currentTimeMillis();
            Context context = anVar2.f111539b;
            Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
            View a = C1870c.m6045a((Activity) context, (int) R.layout.s_);
            System.currentTimeMillis();
            C89219l.m154716b(a, "");
            return a;
        }
    }

    /* renamed from: a */
    public static final void m91725a(AbstractC48149ai aiVar, View.OnTouchListener onTouchListener, LongPressLayout.AbstractC50014a aVar) {
        if (aiVar instanceof AbstractC48234cd) {
            AbstractC48234cd cdVar = (AbstractC48234cd) aiVar;
            cdVar.mo80160a(onTouchListener);
            cdVar.mo80162a(aVar);
        }
    }
}
