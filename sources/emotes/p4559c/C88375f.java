package emotes.p4559c;

import android.view.View;
import com.bytedance.android.live.design.widget.LiveButton;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import emotes.p4557a.AbstractC88364d;
import emotes.p4558b.C88366a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: emotes.c.f */
public final class C88375f extends AbstractC88371b<C88374e> {

    /* renamed from: a */
    public final AbstractC88364d f200624a;

    /* renamed from: b */
    private final LiveButton f200625b;

    /* renamed from: c */
    private final LiveTextView f200626c;

    static {
        Covode.recordClassIndex(104415);
    }

    /* renamed from: emotes.c.f$a */
    static final class View$OnClickListenerC88376a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C88375f f200627a;

        static {
            Covode.recordClassIndex(104416);
        }

        View$OnClickListenerC88376a(C88375f fVar) {
            this.f200627a = fVar;
        }

        public final void onClick(View view) {
            this.f200627a.f200624a.mo142861a("emote_preview");
            C88366a.m153563b("emote_preview");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C88375f(View view, AbstractC88364d dVar) {
        super(view);
        C89219l.m154721d(view, "");
        C89219l.m154721d(dVar, "");
        this.f200624a = dVar;
        View findViewById = view.findViewById(R.id.z1);
        C89219l.m154716b(findViewById, "");
        this.f200625b = (LiveButton) findViewById;
        View findViewById2 = view.findViewById(R.id.ewc);
        C89219l.m154716b(findViewById2, "");
        this.f200626c = (LiveTextView) findViewById2;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
    @Override // emotes.p4559c.AbstractC88371b
    /* renamed from: a */
    public final /* synthetic */ void mo142876a(C88374e eVar, int i) {
        C88374e eVar2 = eVar;
        C89219l.m154721d(eVar2, "");
        this.f200625b.setVisibility(0);
        if (!eVar2.f200622a) {
            this.f200625b.setEnabled(false);
            this.f200626c.setVisibility(0);
        } else {
            this.f200625b.setEnabled(true);
            this.f200626c.setVisibility(8);
        }
        if (eVar2.f200623b) {
            this.f200625b.setVisibility(8);
            this.f200626c.setVisibility(8);
        } else {
            C88366a.m153561a("emote_preview");
        }
        this.f200625b.setOnClickListener(new View$OnClickListenerC88376a(this));
    }
}
