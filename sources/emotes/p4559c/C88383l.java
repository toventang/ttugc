package emotes.p4559c;

import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.core.p218f.C3941k;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import emotes.p4557a.AbstractC88363c;
import p4550e.p4553c.AbstractC88336a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: emotes.c.l */
public final class C88383l extends AbstractC88371b<EmoteModel> {

    /* renamed from: a */
    public AbstractC88336a f200647a;

    /* renamed from: b */
    public AbstractC88363c f200648b;

    /* renamed from: c */
    private final HSImageView f200649c;

    static {
        Covode.recordClassIndex(104423);
    }

    /* renamed from: emotes.c.l$a */
    static final class View$OnClickListenerC88384a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C88383l f200650a;

        /* renamed from: b */
        final /* synthetic */ EmoteModel f200651b;

        static {
            Covode.recordClassIndex(104424);
        }

        View$OnClickListenerC88384a(C88383l lVar, EmoteModel emoteModel) {
            this.f200650a = lVar;
            this.f200651b = emoteModel;
        }

        public final void onClick(View view) {
            AbstractC88336a aVar;
            if (!this.f200651b.f8731k && (aVar = this.f200650a.f200647a) != null) {
                aVar.mo142854a(this.f200651b);
            }
        }
    }

    /* renamed from: emotes.c.l$b */
    static final class View$OnTouchListenerC88385b implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ C88383l f200652a;

        /* renamed from: b */
        final /* synthetic */ EmoteModel f200653b;

        /* renamed from: c */
        final /* synthetic */ int f200654c;

        static {
            Covode.recordClassIndex(104425);
        }

        View$OnTouchListenerC88385b(C88383l lVar, EmoteModel emoteModel, int i) {
            this.f200652a = lVar;
            this.f200653b = emoteModel;
            this.f200654c = i;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            AbstractC88363c cVar;
            if (this.f200653b.f8731k || (cVar = this.f200652a.f200648b) == null) {
                return false;
            }
            C89219l.m154716b(view, "");
            C89219l.m154716b(motionEvent, "");
            return cVar.mo142865a(view, motionEvent, this.f200654c, this.f200653b);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
    @Override // emotes.p4559c.AbstractC88371b
    /* renamed from: a */
    public final /* synthetic */ void mo142876a(EmoteModel emoteModel, int i) {
        EmoteModel emoteModel2 = emoteModel;
        C89219l.m154721d(emoteModel2, "");
        if (emoteModel2.f8728h != null) {
            C3941k.m9601a(this.f200649c, emoteModel2.f8728h);
        }
        if (emoteModel2.f8731k || !emoteModel2.f8732l) {
            this.f200649c.setColorFilter((ColorFilter) null);
        } else {
            this.f200649c.setColorFilter(Color.parseColor("#57ffffff"), PorterDuff.Mode.SRC_ATOP);
        }
        this.itemView.setOnClickListener(new View$OnClickListenerC88384a(this, emoteModel2));
        this.itemView.setOnTouchListener(new View$OnTouchListenerC88385b(this, emoteModel2, i));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C88383l(View view, AbstractC88336a aVar, AbstractC88363c cVar) {
        super(view);
        C89219l.m154721d(view, "");
        this.f200647a = aVar;
        this.f200648b = cVar;
        View findViewById = view.findViewById(R.id.bv_);
        C89219l.m154716b(findViewById, "");
        this.f200649c = (HSImageView) findViewById;
    }
}
