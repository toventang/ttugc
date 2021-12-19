package com.bytedance.android.livesdk.hashtag;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.hashtag.j */
public final class C8964j extends RecyclerView.ViewHolder {

    /* renamed from: a */
    final HSImageView f22062a;

    /* renamed from: b */
    final LiveTextView f22063b;

    /* renamed from: c */
    final LiveTextView f22064c;

    /* renamed from: d */
    final View f22065d;

    /* renamed from: e */
    final View f22066e;

    static {
        Covode.recordClassIndex(9856);
    }

    /* renamed from: com.bytedance.android.livesdk.hashtag.j$a */
    static final class View$OnClickListenerC8965a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Room f22067a;

        /* renamed from: b */
        final /* synthetic */ C8964j f22068b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89172b f22069c;

        static {
            Covode.recordClassIndex(9857);
        }

        View$OnClickListenerC8965a(Room room, C8964j jVar, AbstractC89172b bVar) {
            this.f22067a = room;
            this.f22068b = jVar;
            this.f22069c = bVar;
        }

        public final void onClick(View view) {
            this.f22069c.invoke(this.f22067a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8964j(View view) {
        super(view);
        C89219l.m154721d(view, "");
        View findViewById = view.findViewById(R.id.ca_);
        C89219l.m154716b(findViewById, "");
        this.f22062a = (HSImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.b0l);
        C89219l.m154716b(findViewById2, "");
        this.f22063b = (LiveTextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.md);
        C89219l.m154716b(findViewById3, "");
        this.f22064c = (LiveTextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.ciq);
        C89219l.m154716b(findViewById4, "");
        this.f22065d = findViewById4;
        View findViewById5 = view.findViewById(R.id.cih);
        C89219l.m154716b(findViewById5, "");
        this.f22066e = findViewById5;
    }
}
