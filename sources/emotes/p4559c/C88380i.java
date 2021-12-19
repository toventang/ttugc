package emotes.p4559c;

import android.view.View;
import com.bytedance.android.live.C4049d;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p218f.C3941k;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.chatroom.p492g.C7577g;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdk.widget.VHeadView;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: emotes.c.i */
public final class C88380i extends AbstractC88371b<C88379h> {

    /* renamed from: a */
    private final VHeadView f200637a;

    /* renamed from: b */
    private final LiveTextView f200638b;

    /* renamed from: c */
    private final LiveTextView f200639c;

    /* renamed from: d */
    private final LiveTextView f200640d;

    /* renamed from: e */
    private final HSImageView f200641e;

    /* renamed from: f */
    private final EmoteModel f200642f;

    static {
        Covode.recordClassIndex(104420);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C88380i(View view, EmoteModel emoteModel) {
        super(view);
        C89219l.m154721d(view, "");
        C89219l.m154721d(emoteModel, "");
        this.f200642f = emoteModel;
        View findViewById = view.findViewById(R.id.bsf);
        C89219l.m154716b(findViewById, "");
        this.f200637a = (VHeadView) findViewById;
        View findViewById2 = view.findViewById(R.id.es7);
        C89219l.m154716b(findViewById2, "");
        this.f200638b = (LiveTextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.f4u);
        C89219l.m154716b(findViewById3, "");
        this.f200639c = (LiveTextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.ev0);
        C89219l.m154716b(findViewById4, "");
        this.f200640d = (LiveTextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.bv_);
        C89219l.m154716b(findViewById5, "");
        this.f200641e = (HSImageView) findViewById5;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
    @Override // emotes.p4559c.AbstractC88371b
    /* renamed from: a */
    public final /* synthetic */ void mo142876a(C88379h hVar, int i) {
        C89219l.m154721d(hVar, "");
        Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        if (room != null) {
            VHeadView vHeadView = this.f200637a;
            User owner = room.getOwner();
            C89219l.m154716b(owner, "");
            C7577g.m15571a(vHeadView, owner.getAvatarThumb(), this.f200637a.getWidth(), this.f200637a.getHeight(), 2131234441);
            int i2 = 0;
            this.f200638b.setText(C3966y.m9660a((int) R.string.ekw, room.getOwner().displayId));
            LiveTextView liveTextView = this.f200640d;
            Object[] objArr = new Object[2];
            objArr[0] = room.getOwner().displayId;
            List list = (List) DataChannelGlobal.f42558d.mo28324b(C4049d.class);
            if (list != null) {
                i2 = list.size();
            }
            objArr[1] = Integer.valueOf(i2);
            liveTextView.setText(C3966y.m9660a((int) R.string.ekv, objArr));
            if (this.f200642f.f8728h != null) {
                C3941k.m9601a(this.f200641e, this.f200642f.f8728h);
            }
        }
    }
}
