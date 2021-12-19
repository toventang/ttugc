package p4550e.p4555e;

import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.base.model.emoji.C2972a;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4550e.p4553c.AbstractC88336a;

/* renamed from: e.e.d */
public final class C88342d extends AbstractC88339a {

    /* renamed from: a */
    AbstractC88336a f200541a;

    /* renamed from: b */
    private final TextView f200542b;

    static {
        Covode.recordClassIndex(104381);
    }

    @Override // p4550e.p4555e.AbstractC88339a
    /* renamed from: a */
    public final void mo142857a(AbstractC88336a aVar) {
        this.f200541a = aVar;
    }

    public C88342d(View view) {
        super(view);
        this.f200542b = (TextView) view.findViewById(R.id.f98);
    }

    @Override // p4550e.p4555e.AbstractC88339a
    /* renamed from: a */
    public final void mo142856a(C2972a aVar) {
        if (aVar != null) {
            if (!C13627m.m24498a(aVar.f8734a)) {
                this.f200542b.setText(aVar.f8734a);
            }
            this.itemView.setOnClickListener(new View$OnClickListenerC88343e(this, aVar));
        }
    }
}
