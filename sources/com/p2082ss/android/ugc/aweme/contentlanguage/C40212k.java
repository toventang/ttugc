package com.p2082ss.android.ugc.aweme.contentlanguage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.contentlanguage.k */
public final class C40212k extends RecyclerView.ViewHolder {

    /* renamed from: a */
    private final AbstractC89244h f94405a;

    /* renamed from: b */
    private final AbstractC89244h f94406b;

    /* renamed from: c */
    private final AbstractC89244h f94407c;

    /* renamed from: d */
    private final AbstractC89244h f94408d;

    /* renamed from: e */
    private final AbstractC89244h f94409e;

    static {
        Covode.recordClassIndex(48007);
    }

    /* renamed from: a */
    public final TuxTextView mo69413a() {
        return (TuxTextView) this.f94405a.getValue();
    }

    /* renamed from: b */
    public final TuxTextView mo69414b() {
        return (TuxTextView) this.f94406b.getValue();
    }

    /* renamed from: c */
    public final RemoteImageView mo69415c() {
        return (RemoteImageView) this.f94407c.getValue();
    }

    /* renamed from: d */
    public final ImageView mo69416d() {
        return (ImageView) this.f94408d.getValue();
    }

    /* renamed from: e */
    public final View mo69417e() {
        return (View) this.f94409e.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.contentlanguage.k$a */
    static final class C40213a extends AbstractC89220m implements AbstractC89171a<FrameLayout> {

        /* renamed from: a */
        final /* synthetic */ View f94410a;

        static {
            Covode.recordClassIndex(48008);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40213a(View view) {
            super(0);
            this.f94410a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ FrameLayout invoke() {
            return this.f94410a.findViewById(R.id.c38);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.contentlanguage.k$b */
    static final class C40214b extends AbstractC89220m implements AbstractC89171a<RemoteImageView> {

        /* renamed from: a */
        final /* synthetic */ View f94411a;

        static {
            Covode.recordClassIndex(48009);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40214b(View view) {
            super(0);
            this.f94411a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ RemoteImageView invoke() {
            return this.f94411a.findViewById(R.id.bh1);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.contentlanguage.k$c */
    static final class C40215c extends AbstractC89220m implements AbstractC89171a<ImageView> {

        /* renamed from: a */
        final /* synthetic */ View f94412a;

        static {
            Covode.recordClassIndex(48010);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40215c(View view) {
            super(0);
            this.f94412a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ImageView invoke() {
            return this.f94412a.findViewById(R.id.bm6);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.contentlanguage.k$d */
    static final class C40216d extends AbstractC89220m implements AbstractC89171a<TuxTextView> {

        /* renamed from: a */
        final /* synthetic */ View f94413a;

        static {
            Covode.recordClassIndex(48011);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40216d(View view) {
            super(0);
            this.f94413a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxTextView invoke() {
            return this.f94413a.findViewById(R.id.avg);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.contentlanguage.k$e */
    static final class C40217e extends AbstractC89220m implements AbstractC89171a<TuxTextView> {

        /* renamed from: a */
        final /* synthetic */ View f94414a;

        static {
            Covode.recordClassIndex(48012);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40217e(View view) {
            super(0);
            this.f94414a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxTextView invoke() {
            return this.f94414a.findViewById(R.id.cgb);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.contentlanguage.k$f */
    public static final class C40218f extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C40212k f94415a;

        static {
            Covode.recordClassIndex(48013);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C40218f(C40212k kVar) {
            this.f94415a = kVar;
        }

        public final void onAnimationEnd(Animator animator) {
            this.f94415a.mo69415c().setVisibility(8);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.contentlanguage.k$g */
    public static final class C40219g extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C40212k f94416a;

        static {
            Covode.recordClassIndex(48014);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C40219g(C40212k kVar) {
            this.f94416a = kVar;
        }

        public final void onAnimationEnd(Animator animator) {
            this.f94416a.mo69416d().setVisibility(8);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C40212k(View view) {
        super(view);
        C89219l.m154721d(view, "");
        this.f94405a = C89250i.m154773a((AbstractC89171a) new C40217e(view));
        this.f94406b = C89250i.m154773a((AbstractC89171a) new C40216d(view));
        this.f94407c = C89250i.m154773a((AbstractC89171a) new C40214b(view));
        this.f94408d = C89250i.m154773a((AbstractC89171a) new C40215c(view));
        this.f94409e = C89250i.m154773a((AbstractC89171a) new C40213a(view));
    }
}
