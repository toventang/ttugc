package com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3865a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.widget.AbstractC34766g;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3871g.C72939a;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a.a */
public final class C72882a extends AbstractC34766g<User> {
    static {
        Covode.recordClassIndex(85574);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.widget.AbstractC34766g
    /* renamed from: b */
    public final RecyclerView.ViewHolder mo61482b(ViewGroup viewGroup, int i) {
        if (viewGroup == null) {
            C89219l.m154715b();
        }
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.bjh, viewGroup, false);
        C89219l.m154716b(a, "");
        return new C72939a(a);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.widget.AbstractC34766g
    /* renamed from: b */
    public final void mo61483b(RecyclerView.ViewHolder viewHolder, int i) {
        Objects.requireNonNull(viewHolder, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.vh.PollUserViewHolder");
        C72939a aVar = (C72939a) viewHolder;
        Object obj = mo63369e().get(i);
        C89219l.m154716b(obj, "");
        User user = (User) obj;
        C89219l.m154721d(user, "");
        C34577e.m70592a(aVar.f163664a, user.getAvatarMedium());
        aVar.f163665b.setText(C80580in.m139677a(user, true));
        aVar.f163664a.setOnClickListener(new C72939a.View$OnClickListenerC72940a(aVar, user));
        aVar.f163665b.setOnClickListener(new C72939a.View$OnClickListenerC72941b(aVar, user));
    }
}
