package com.bytedance.android.livesdk.chatroom.p499ui.p501b;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.model.C9537au;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.b.e */
public final class C7786e extends RecyclerView.ViewHolder {

    /* renamed from: a */
    final HSImageView f19311a;

    static {
        Covode.recordClassIndex(8581);
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.b.e$a */
    static final class View$OnClickListenerC7787a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f19312a;

        /* renamed from: b */
        final /* synthetic */ C9537au f19313b;

        static {
            Covode.recordClassIndex(8582);
        }

        View$OnClickListenerC7787a(AbstractC89172b bVar, C9537au auVar) {
            this.f19312a = bVar;
            this.f19313b = auVar;
        }

        public final void onClick(View view) {
            this.f19312a.invoke(this.f19313b);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7786e(View view) {
        super(view);
        C89219l.m154721d(view, "");
        View findViewById = view.findViewById(R.id.bm8);
        C89219l.m154716b(findViewById, "");
        this.f19311a = (HSImageView) findViewById;
    }
}
