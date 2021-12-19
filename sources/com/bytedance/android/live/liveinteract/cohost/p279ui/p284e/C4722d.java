package com.bytedance.android.live.liveinteract.cohost.p279ui.p284e;

import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.design.widget.LiveButton;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.liveinteract.cohost.p263a.p268e.C4592a;
import com.bytedance.android.live.liveinteract.cohost.p263a.p268e.C4595b;
import com.bytedance.android.live.liveinteract.cohost.p279ui.p283d.C4705d;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4628j.p4629a.p4630a.AbstractC89396c;

/* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.e.d */
public final class C4722d extends AbstractC89396c<C4705d, C4724b> {

    /* renamed from: a */
    public final AbstractC4723a f12456a;

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.e.d$a */
    public interface AbstractC4723a {
        static {
            Covode.recordClassIndex(5300);
        }

        /* renamed from: a */
        boolean mo10372a();
    }

    static {
        Covode.recordClassIndex(5299);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.e.d$b */
    public final class C4724b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final AbstractC89244h f12457a;

        /* renamed from: b */
        final AbstractC89244h f12458b;

        /* renamed from: c */
        final /* synthetic */ C4722d f12459c;

        /* renamed from: d */
        private final AbstractC89244h f12460d;

        /* renamed from: e */
        private final AbstractC89244h f12461e;

        /* renamed from: f */
        private final AbstractC89244h f12462f;

        static {
            Covode.recordClassIndex(5301);
        }

        /* renamed from: a */
        public final ImageView mo10460a() {
            return (ImageView) this.f12460d.getValue();
        }

        /* renamed from: b */
        public final LiveButton mo10461b() {
            return (LiveButton) this.f12461e.getValue();
        }

        /* renamed from: c */
        public final View mo10462c() {
            return (View) this.f12462f.getValue();
        }

        /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.e.d$b$a */
        static final class C4725a extends AbstractC89220m implements AbstractC89171a<ImageView> {

            /* renamed from: a */
            final /* synthetic */ View f12463a;

            static {
                Covode.recordClassIndex(5302);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4725a(View view) {
                super(0);
                this.f12463a = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ ImageView invoke() {
                return this.f12463a.findViewById(R.id.byr);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.e.d$b$b */
        static final class C4726b extends AbstractC89220m implements AbstractC89171a<LiveButton> {

            /* renamed from: a */
            final /* synthetic */ View f12464a;

            static {
                Covode.recordClassIndex(5303);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4726b(View view) {
                super(0);
                this.f12464a = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ LiveButton invoke() {
                return this.f12464a.findViewById(R.id.wk);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.e.d$b$c */
        static final class C4727c extends AbstractC89220m implements AbstractC89171a<LiveTextView> {

            /* renamed from: a */
            final /* synthetic */ View f12465a;

            static {
                Covode.recordClassIndex(5304);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4727c(View view) {
                super(0);
                this.f12465a = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ LiveTextView invoke() {
                return this.f12465a.findViewById(R.id.f21);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.e.d$b$d */
        static final class C4728d extends AbstractC89220m implements AbstractC89171a<View> {

            /* renamed from: a */
            final /* synthetic */ View f12466a;

            static {
                Covode.recordClassIndex(5305);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4728d(View view) {
                super(0);
                this.f12466a = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ View invoke() {
                return this.f12466a.findViewById(R.id.ff7);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.e.d$b$e */
        static final class C4729e extends AbstractC89220m implements AbstractC89171a<LiveTextView> {

            /* renamed from: a */
            final /* synthetic */ View f12467a;

            static {
                Covode.recordClassIndex(5306);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4729e(View view) {
                super(0);
                this.f12467a = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ LiveTextView invoke() {
                return this.f12467a.findViewById(R.id.f22);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4724b(C4722d dVar, View view) {
            super(view);
            C89219l.m154721d(view, "");
            this.f12459c = dVar;
            this.f12460d = C89250i.m154773a((AbstractC89171a) new C4725a(view));
            this.f12457a = C89250i.m154773a((AbstractC89171a) new C4729e(view));
            this.f12458b = C89250i.m154773a((AbstractC89171a) new C4727c(view));
            this.f12461e = C89250i.m154773a((AbstractC89171a) new C4726b(view));
            this.f12462f = C89250i.m154773a((AbstractC89171a) new C4728d(view));
        }
    }

    public C4722d(AbstractC4723a aVar) {
        C89219l.m154721d(aVar, "");
        this.f12456a = aVar;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.e.d$c */
    static final class View$OnClickListenerC4730c implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC4730c f12468a = new View$OnClickListenerC4730c();

        static {
            Covode.recordClassIndex(5307);
        }

        View$OnClickListenerC4730c() {
        }

        public final void onClick(View view) {
            C11226ao.m19883a(C3966y.m9669e(), C3966y.m9657a((int) R.string.dsn), 0);
        }
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // p4628j.p4629a.p4630a.AbstractC89396c
    /* renamed from: a */
    public final /* synthetic */ C4724b mo10368a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        MethodCollector.m26663i(5599);
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.b_y, viewGroup, false);
        C89219l.m154716b(a, "");
        C4724b bVar = new C4724b(this, a);
        bVar.mo10460a().setScaleType(ImageView.ScaleType.MATRIX);
        int c = C3966y.m9664c();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(C3966y.m9655a(), 2131234226, options);
        float f = (((float) c) * 1.0f) / ((float) options.outWidth);
        Matrix matrix = new Matrix();
        matrix.setScale(f, f);
        bVar.mo10460a().setImageMatrix(matrix);
        bVar.mo10461b().setMaxWidth(Integer.MAX_VALUE);
        bVar.mo10462c().setOnClickListener(View$OnClickListenerC4730c.f12468a);
        MethodCollector.m26664o(5599);
        return bVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, java.lang.Object] */
    @Override // p4628j.p4629a.p4630a.AbstractC89396c
    /* renamed from: a */
    public final /* synthetic */ void mo10140a(C4724b bVar, C4705d dVar) {
        C4724b bVar2 = bVar;
        C4705d dVar2 = dVar;
        C89219l.m154721d(bVar2, "");
        C89219l.m154721d(dVar2, "");
        ((LiveTextView) bVar2.f12457a.getValue()).setText(dVar2.f12434a.f18903a);
        ((LiveTextView) bVar2.f12458b.getValue()).setText(dVar2.f12434a.f18904b);
        bVar2.mo10462c().setVisibility(8);
        C4592a.m10698a(bVar2.mo10461b(), dVar2.f12434a);
        C4592a.m10697a(bVar2.mo10461b(), this.f12456a);
        if (!bVar2.mo10461b().isEnabled() && C4595b.m10702b()) {
            bVar2.mo10462c().setVisibility(0);
        }
    }
}
