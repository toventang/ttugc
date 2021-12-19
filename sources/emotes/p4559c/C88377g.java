package emotes.p4559c;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.C4049d;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.design.widget.LiveButton;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.chatroom.p492g.C7577g;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdk.widget.VHeadView;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.p2082ss.android.ugc.trill.R;
import emotes.p4557a.AbstractC88364d;
import emotes.p4558b.C88366a;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: emotes.c.g */
public final class C88377g extends AbstractC88371b<C88379h> {

    /* renamed from: a */
    public final AbstractC88364d f200628a;

    /* renamed from: b */
    private final LiveTextView f200629b;

    /* renamed from: c */
    private final VHeadView f200630c;

    /* renamed from: d */
    private final LiveTextView f200631d;

    /* renamed from: e */
    private final LiveTextView f200632e;

    /* renamed from: f */
    private final LiveButton f200633f;

    static {
        Covode.recordClassIndex(104417);
    }

    /* renamed from: emotes.c.g$a */
    static final class View$OnClickListenerC88378a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C88377g f200634a;

        static {
            Covode.recordClassIndex(104418);
        }

        View$OnClickListenerC88378a(C88377g gVar) {
            this.f200634a = gVar;
        }

        public final void onClick(View view) {
            this.f200634a.f200628a.mo142861a("emote_bar");
            C88366a.m153563b("emote_bar");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C88377g(View view, AbstractC88364d dVar) {
        super(view);
        C89219l.m154721d(view, "");
        C89219l.m154721d(dVar, "");
        this.f200628a = dVar;
        View findViewById = view.findViewById(R.id.ewc);
        C89219l.m154716b(findViewById, "");
        this.f200629b = (LiveTextView) findViewById;
        View findViewById2 = view.findViewById(R.id.bwc);
        C89219l.m154716b(findViewById2, "");
        this.f200630c = (VHeadView) findViewById2;
        View findViewById3 = view.findViewById(R.id.f6t);
        C89219l.m154716b(findViewById3, "");
        this.f200631d = (LiveTextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.ev2);
        C89219l.m154716b(findViewById4, "");
        this.f200632e = (LiveTextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.z1);
        C89219l.m154716b(findViewById5, "");
        this.f200633f = (LiveButton) findViewById5;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
    @Override // emotes.p4559c.AbstractC88371b
    /* renamed from: a */
    public final /* synthetic */ void mo142876a(C88379h hVar, int i) {
        int i2;
        int i3;
        C88379h hVar2 = hVar;
        C89219l.m154721d(hVar2, "");
        Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        if (room != null) {
            VHeadView vHeadView = this.f200630c;
            User owner = room.getOwner();
            C89219l.m154716b(owner, "");
            C7577g.m15571a(vHeadView, owner.getAvatarThumb(), this.f200630c.getWidth(), this.f200630c.getHeight(), 2131234441);
            ViewGroup.LayoutParams layoutParams = this.f200629b.getLayoutParams();
            layoutParams.width = C3966y.m9664c();
            this.f200629b.setLayoutParams(layoutParams);
            this.f200631d.setText(room.getOwner().displayId);
            LiveTextView liveTextView = this.f200632e;
            Context context = liveTextView.getContext();
            C89219l.m154716b(context, "");
            Resources resources = context.getResources();
            List list = (List) DataChannelGlobal.f42558d.mo28324b(C4049d.class);
            if (list != null) {
                i2 = list.size();
            } else {
                i2 = 0;
            }
            Object[] objArr = new Object[2];
            objArr[0] = room.getOwner().displayId;
            List list2 = (List) DataChannelGlobal.f42558d.mo28324b(C4049d.class);
            if (list2 != null) {
                i3 = list2.size();
            } else {
                i3 = 0;
            }
            objArr[1] = Integer.valueOf(i3);
            liveTextView.setText(resources.getQuantityString(R.plurals.gj, i2, objArr));
            if (!hVar2.f200636b) {
                this.f200633f.setEnabled(true);
                this.f200633f.setVisibility(0);
            }
            if (!hVar2.f200635a) {
                this.f200629b.setVisibility(0);
                this.f200633f.setEnabled(false);
            } else {
                this.f200629b.setVisibility(8);
                this.f200633f.setEnabled(true);
            }
            this.f200633f.setOnClickListener(new View$OnClickListenerC88378a(this));
        }
    }
}
