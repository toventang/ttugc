package emotes.p4559c;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import emotes.p4557a.AbstractC88364d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: emotes.c.c */
public final class C88372c extends AbstractC88370a<C88374e, C88375f> {

    /* renamed from: a */
    private final AbstractC88364d f200620a;

    static {
        Covode.recordClassIndex(104412);
    }

    public C88372c(AbstractC88364d dVar) {
        C89219l.m154721d(dVar, "");
        this.f200620a = dVar;
    }

    @Override // p4628j.p4629a.p4630a.AbstractC89396c
    /* renamed from: a */
    public final /* synthetic */ RecyclerView.ViewHolder mo10368a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.b9q, viewGroup, false);
        C89219l.m154716b(a, "");
        return new C88375f(a, this.f200620a);
    }
}
