package emotes.p4559c;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import emotes.p4557a.AbstractC88363c;
import p4550e.p4553c.AbstractC88336a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: emotes.c.k */
public final class C88382k extends AbstractC88370a<EmoteModel, C88383l> {

    /* renamed from: a */
    public int f200644a;

    /* renamed from: b */
    public AbstractC88336a f200645b;

    /* renamed from: c */
    public AbstractC88363c f200646c;

    static {
        Covode.recordClassIndex(104422);
    }

    @Override // p4628j.p4629a.p4630a.AbstractC89396c
    /* renamed from: a */
    public final /* synthetic */ RecyclerView.ViewHolder mo10368a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.b_r, viewGroup, false);
        C89219l.m154716b(a, "");
        C88383l lVar = new C88383l(a, this.f200645b, this.f200646c);
        View view = lVar.itemView;
        C89219l.m154716b(view, "");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = this.f200644a;
        layoutParams.width = this.f200644a;
        View view2 = lVar.itemView;
        C89219l.m154716b(view2, "");
        view2.setLayoutParams(layoutParams);
        return lVar;
    }

    public C88382k(int i, AbstractC88336a aVar, AbstractC88363c cVar) {
        this.f200644a = i;
        this.f200645b = aVar;
        this.f200646c = cVar;
    }
}
