package com.p2082ss.android.ugc.aweme.story.edit.business.shared.p4037d;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.shortvideo.C71812ep;
import com.p2082ss.android.ugc.aweme.story.base.widget.RoundCornerImageView;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.d.a */
public final class C76951a extends RecyclerView.ViewHolder {

    /* renamed from: b */
    public static final int f172657b = C71812ep.m126783a(28.0d, C63247i.f143610a);

    /* renamed from: c */
    public static final int f172658c = C71812ep.m126783a(40.0d, C63247i.f143610a);

    /* renamed from: d */
    public static final C76953a f172659d = new C76953a((byte) 0);

    /* renamed from: a */
    public final AbstractC89172b<Integer, C89391z> f172660a;

    /* renamed from: e */
    private final AbstractC89244h f172661e;

    /* renamed from: f */
    private final AbstractC89244h f172662f;

    /* renamed from: g */
    private final AbstractC89244h f172663g;

    /* renamed from: a */
    public final RoundCornerImageView mo120512a() {
        return (RoundCornerImageView) this.f172661e.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.d.a$a */
    public static final class C76953a {
        static {
            Covode.recordClassIndex(89949);
        }

        private C76953a() {
        }

        public /* synthetic */ C76953a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.d.a$c */
    static final class C76955c extends AbstractC89220m implements AbstractC89171a<RoundCornerImageView> {

        /* renamed from: a */
        final /* synthetic */ View f172666a;

        static {
            Covode.recordClassIndex(89951);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76955c(View view) {
            super(0);
            this.f172666a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ RoundCornerImageView invoke() {
            return this.f172666a.findViewById(R.id.buj);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.d.a$d */
    static final class C76956d extends AbstractC89220m implements AbstractC89171a<View> {

        /* renamed from: a */
        final /* synthetic */ View f172667a;

        static {
            Covode.recordClassIndex(89952);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76956d(View view) {
            super(0);
            this.f172667a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ View invoke() {
            return this.f172667a.findViewById(R.id.bt9);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.d.a$e */
    static final class C76957e extends AbstractC89220m implements AbstractC89171a<View> {

        /* renamed from: a */
        final /* synthetic */ View f172668a;

        static {
            Covode.recordClassIndex(89953);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76957e(View view) {
            super(0);
            this.f172668a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ View invoke() {
            return this.f172668a.findViewById(R.id.bta);
        }
    }

    static {
        Covode.recordClassIndex(89947);
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.d.a$b */
    static final class C76954b extends AbstractC89220m implements AbstractC89172b<Bitmap, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C76951a f172665a;

        static {
            Covode.recordClassIndex(89950);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76954b(C76951a aVar) {
            super(1);
            this.f172665a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Bitmap bitmap) {
            Bitmap bitmap2 = bitmap;
            if (bitmap2 != null) {
                this.f172665a.mo120512a().setScaleType(ImageView.ScaleType.CENTER_CROP);
                this.f172665a.mo120512a().setImageBitmap(bitmap2);
            } else {
                this.f172665a.mo120512a().setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                this.f172665a.mo120512a().setImageResource(2131233933);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo120513a(boolean z) {
        int i;
        View view = (View) this.f172662f.getValue();
        int i2 = 0;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
        View view2 = (View) this.f172663g.getValue();
        if (z) {
            i2 = 8;
        }
        view2.setVisibility(i2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.b<? super java.lang.Integer, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C76951a(View view, AbstractC89172b<? super Integer, C89391z> bVar) {
        super(view);
        C89219l.m154721d(view, "");
        C89219l.m154721d(bVar, "");
        this.f172660a = bVar;
        this.f172661e = C89250i.m154773a((AbstractC89171a) new C76955c(view));
        this.f172662f = C89250i.m154773a((AbstractC89171a) new C76956d(view));
        this.f172663g = C89250i.m154773a((AbstractC89171a) new C76957e(view));
        view.setOnClickListener(new View.OnClickListener(this) {
            /* class com.p2082ss.android.ugc.aweme.story.edit.business.shared.p4037d.C76951a.View$OnClickListenerC769521 */

            /* renamed from: a */
            final /* synthetic */ C76951a f172664a;

            static {
                Covode.recordClassIndex(89948);
            }

            {
                this.f172664a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                this.f172664a.f172660a.invoke(Integer.valueOf(this.f172664a.getAdapterPosition()));
            }
        });
    }
}
