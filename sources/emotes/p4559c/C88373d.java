package emotes.p4559c;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: emotes.c.d */
public final class C88373d extends AbstractC88370a<C88379h, C88380i> {

    /* renamed from: a */
    private final EmoteModel f200621a;

    static {
        Covode.recordClassIndex(104413);
    }

    public C88373d(EmoteModel emoteModel) {
        C89219l.m154721d(emoteModel, "");
        this.f200621a = emoteModel;
    }

    @Override // p4628j.p4629a.p4630a.AbstractC89396c
    /* renamed from: a */
    public final /* synthetic */ RecyclerView.ViewHolder mo10368a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.b9r, viewGroup, false);
        C89219l.m154716b(a, "");
        return new C88380i(a, this.f200621a);
    }
}
