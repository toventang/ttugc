package com.bytedance.android.live.liveinteract.cohost.p279ui.p284e;

import android.graphics.Color;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.liveinteract.cohost.p279ui.p283d.C4706e;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5713h;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;
import p4628j.p4629a.p4630a.AbstractC89396c;

/* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.e.e */
public final class C4731e extends AbstractC89396c<C4706e, C4734c> {

    /* renamed from: a */
    public final AbstractC4733b f12469a;

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.e.e$b */
    public interface AbstractC4733b {
        static {
            Covode.recordClassIndex(5310);
        }

        /* renamed from: f */
        void mo10421f();

        /* renamed from: g */
        void mo10422g();
    }

    static {
        Covode.recordClassIndex(5308);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.e.e$c */
    public final class C4734c extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final AbstractC89244h f12472a;

        /* renamed from: b */
        final /* synthetic */ C4731e f12473b;

        /* renamed from: c */
        private final AbstractC89244h f12474c;

        static {
            Covode.recordClassIndex(5311);
        }

        /* renamed from: a */
        public final LiveTextView mo10466a() {
            return (LiveTextView) this.f12474c.getValue();
        }

        /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.e.e$c$a */
        static final class C4735a extends AbstractC89220m implements AbstractC89171a<AppCompatImageView> {

            /* renamed from: a */
            final /* synthetic */ View f12475a;

            static {
                Covode.recordClassIndex(5312);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4735a(View view) {
                super(0);
                this.f12475a = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ AppCompatImageView invoke() {
                return this.f12475a.findViewById(R.id.bj4);
            }
        }

        /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.e.e$c$b */
        static final class C4736b extends AbstractC89220m implements AbstractC89171a<LiveTextView> {

            /* renamed from: a */
            final /* synthetic */ View f12476a;

            static {
                Covode.recordClassIndex(5313);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4736b(View view) {
                super(0);
                this.f12476a = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ LiveTextView invoke() {
                return this.f12476a.findViewById(R.id.f51);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4734c(C4731e eVar, View view) {
            super(view);
            C89219l.m154721d(view, "");
            this.f12473b = eVar;
            this.f12472a = C89250i.m154773a((AbstractC89171a) new C4735a(view));
            this.f12474c = C89250i.m154773a((AbstractC89171a) new C4736b(view));
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.e.e$d */
    static final class View$OnClickListenerC4737d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C4731e f12477a;

        static {
            Covode.recordClassIndex(5314);
        }

        View$OnClickListenerC4737d(C4731e eVar) {
            this.f12477a = eVar;
        }

        public final void onClick(View view) {
            this.f12477a.f12469a.mo10421f();
        }
    }

    public C4731e(AbstractC4733b bVar) {
        C89219l.m154721d(bVar, "");
        this.f12469a = bVar;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.e.e$a */
    public final class C4732a extends ClickableSpan {

        /* renamed from: a */
        public final View f12470a;

        /* renamed from: b */
        final /* synthetic */ C4731e f12471b;

        static {
            Covode.recordClassIndex(5309);
        }

        public final void onClick(View view) {
            C89219l.m154721d(view, "");
            C5713h.m12520a(true, "list_view");
            this.f12471b.f12469a.mo10422g();
            this.f12471b.f12469a.mo10421f();
        }

        public final void updateDrawState(TextPaint textPaint) {
            C89219l.m154721d(textPaint, "");
            super.updateDrawState(textPaint);
            textPaint.setColor(Color.parseColor("#FE2C55"));
            textPaint.setUnderlineText(false);
            textPaint.setFakeBoldText(true);
        }

        public C4732a(C4731e eVar, View view) {
            C89219l.m154721d(view, "");
            this.f12471b = eVar;
            this.f12470a = view;
        }
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // p4628j.p4629a.p4630a.AbstractC89396c
    /* renamed from: a */
    public final /* synthetic */ C4734c mo10368a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.ba7, viewGroup, false);
        C89219l.m154716b(a, "");
        return new C4734c(this, a);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, java.lang.Object] */
    @Override // p4628j.p4629a.p4630a.AbstractC89396c
    /* renamed from: a */
    public final /* synthetic */ void mo10140a(C4734c cVar, C4706e eVar) {
        C4734c cVar2 = cVar;
        C4706e eVar2 = eVar;
        C89219l.m154721d(cVar2, "");
        C89219l.m154721d(eVar2, "");
        ((AppCompatImageView) cVar2.f12472a.getValue()).setOnClickListener(new View$OnClickListenerC4737d(this));
        SpannableString spannableString = new SpannableString(eVar2.f12435a + "\n" + eVar2.f12436b);
        int a = C89361p.m154888a((CharSequence) spannableString, eVar2.f12436b, 0, false, 6);
        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#161823")), 0, a, 33);
        View view = cVar2.itemView;
        C89219l.m154716b(view, "");
        spannableString.setSpan(new C4732a(this, view), a, spannableString.length(), 33);
        cVar2.mo10466a().setText(spannableString);
        cVar2.mo10466a().setMovementMethod(LinkMovementMethod.getInstance());
    }
}
