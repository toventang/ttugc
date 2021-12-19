package com.bytedance.android.live.liveinteract.cohost.p279ui.p284e;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.liveinteract.cohost.p279ui.p283d.C4702a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89376n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4628j.p4629a.p4630a.AbstractC89396c;

/* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.e.a */
public final class C4708a extends AbstractC89396c<C4702a, C4712d> {

    /* renamed from: b */
    public static EnumC4711c f12438b = EnumC4711c.SHRINK;

    /* renamed from: c */
    public static final C4709a f12439c = new C4709a((byte) 0);

    /* renamed from: a */
    public final AbstractC4710b f12440a;

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.e.a$b */
    public interface AbstractC4710b {
        static {
            Covode.recordClassIndex(5287);
        }

        /* renamed from: h */
        void mo10423h();
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.e.a$c */
    public enum EnumC4711c {
        EXTENSION,
        SHRINK;

        static {
            Covode.recordClassIndex(5288);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.e.a$a */
    public static final class C4709a {
        static {
            Covode.recordClassIndex(5286);
        }

        private C4709a() {
        }

        public /* synthetic */ C4709a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.e.a$d */
    public final class C4712d extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ C4708a f12442a;

        /* renamed from: b */
        private final AbstractC89244h f12443b;

        /* renamed from: c */
        private final AbstractC89244h f12444c;

        static {
            Covode.recordClassIndex(5289);
        }

        /* renamed from: a */
        public final LiveTextView mo10456a() {
            return (LiveTextView) this.f12443b.getValue();
        }

        /* renamed from: b */
        public final AppCompatImageView mo10457b() {
            return (AppCompatImageView) this.f12444c.getValue();
        }

        /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.e.a$d$a */
        static final class C4713a extends AbstractC89220m implements AbstractC89171a<LiveTextView> {

            /* renamed from: a */
            final /* synthetic */ View f12445a;

            static {
                Covode.recordClassIndex(5290);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4713a(View view) {
                super(0);
                this.f12445a = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ LiveTextView invoke() {
                return this.f12445a.findViewById(R.id.exb);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.e.a$d$b */
        static final class C4714b extends AbstractC89220m implements AbstractC89171a<AppCompatImageView> {

            /* renamed from: a */
            final /* synthetic */ View f12446a;

            static {
                Covode.recordClassIndex(5291);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4714b(View view) {
                super(0);
                this.f12446a = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ AppCompatImageView invoke() {
                return this.f12446a.findViewById(R.id.bwv);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4712d(C4708a aVar, View view) {
            super(view);
            C89219l.m154721d(view, "");
            this.f12442a = aVar;
            this.f12443b = C89250i.m154773a((AbstractC89171a) new C4713a(view));
            this.f12444c = C89250i.m154773a((AbstractC89171a) new C4714b(view));
        }
    }

    static {
        Covode.recordClassIndex(5285);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.e.a$e */
    public static final class View$OnClickListenerC4715e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C4708a f12447a;

        /* renamed from: b */
        final /* synthetic */ C4712d f12448b;

        static {
            Covode.recordClassIndex(5292);
        }

        View$OnClickListenerC4715e(C4708a aVar, C4712d dVar) {
            this.f12447a = aVar;
            this.f12448b = dVar;
        }

        public final void onClick(View view) {
            this.f12447a.f12440a.mo10423h();
            this.f12447a.mo10455a(this.f12448b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.e.a$f */
    public static final class View$OnClickListenerC4716f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C4708a f12449a;

        /* renamed from: b */
        final /* synthetic */ C4712d f12450b;

        static {
            Covode.recordClassIndex(5293);
        }

        View$OnClickListenerC4716f(C4708a aVar, C4712d dVar) {
            this.f12449a = aVar;
            this.f12450b = dVar;
        }

        public final void onClick(View view) {
            this.f12449a.f12440a.mo10423h();
            this.f12449a.mo10455a(this.f12450b);
        }
    }

    public C4708a(AbstractC4710b bVar) {
        C89219l.m154721d(bVar, "");
        this.f12440a = bVar;
    }

    /* renamed from: b */
    private final void m10844b(C4712d dVar) {
        dVar.mo10456a().setText(C3966y.m9657a((int) R.string.e4p));
        dVar.mo10457b().setImageResource(2131234830);
        dVar.itemView.setOnClickListener(new View$OnClickListenerC4716f(this, dVar));
    }

    /* renamed from: c */
    private final void m10845c(C4712d dVar) {
        dVar.mo10456a().setText(C3966y.m9657a((int) R.string.e4o));
        dVar.mo10457b().setImageResource(2131234828);
        dVar.itemView.setOnClickListener(new View$OnClickListenerC4715e(this, dVar));
    }

    /* renamed from: a */
    public final void mo10455a(C4712d dVar) {
        EnumC4711c cVar;
        int i = C4718b.f12452b[f12438b.ordinal()];
        if (i == 1) {
            m10845c(dVar);
            cVar = EnumC4711c.EXTENSION;
        } else if (i == 2) {
            m10844b(dVar);
            cVar = EnumC4711c.SHRINK;
        } else {
            throw new C89376n();
        }
        f12438b = cVar;
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // p4628j.p4629a.p4630a.AbstractC89396c
    /* renamed from: a */
    public final /* synthetic */ C4712d mo10368a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.ba_, viewGroup, false);
        C89219l.m154716b(a, "");
        return new C4712d(this, a);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, java.lang.Object] */
    @Override // p4628j.p4629a.p4630a.AbstractC89396c
    /* renamed from: a */
    public final /* synthetic */ void mo10140a(C4712d dVar, C4702a aVar) {
        C4712d dVar2 = dVar;
        C89219l.m154721d(dVar2, "");
        C89219l.m154721d(aVar, "");
        int i = C4718b.f12451a[f12438b.ordinal()];
        if (i == 1) {
            m10844b(dVar2);
        } else if (i == 2) {
            m10845c(dVar2);
        }
    }
}
