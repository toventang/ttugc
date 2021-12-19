package p4550e.p4555e;

import android.view.View;
import com.bytedance.android.live.base.model.emoji.C2972a;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4550e.p4553c.AbstractC88336a;

/* renamed from: e.e.b */
public final class C88340b extends AbstractC88339a {

    /* renamed from: a */
    AbstractC88336a f200537a;

    /* renamed from: b */
    private final HSImageView f200538b;

    static {
        Covode.recordClassIndex(104379);
    }

    @Override // p4550e.p4555e.AbstractC88339a
    /* renamed from: a */
    public final void mo142857a(AbstractC88336a aVar) {
        this.f200537a = aVar;
    }

    public C88340b(View view) {
        super(view);
        this.f200538b = (HSImageView) view.findViewById(R.id.au9);
    }

    @Override // p4550e.p4555e.AbstractC88339a
    /* renamed from: a */
    public final void mo142856a(C2972a aVar) {
        if (aVar != null) {
            if (aVar.f8739f != 0) {
                this.f200538b.setImageResource(aVar.f8739f);
            }
            this.itemView.setOnClickListener(new View$OnClickListenerC88341c(this, aVar));
        }
    }
}
