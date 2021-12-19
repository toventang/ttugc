package com.p2082ss.android.ugc.aweme.music.p3465b;

import android.content.Context;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.p1200f.C17235c;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageView;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f;
import com.p2082ss.android.ugc.aweme.music.model.MusicOwnerInfo;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.services.MainServiceImpl;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.music.b.e */
public final class C60719e extends AbstractC39060f<MusicOwnerInfo> {

    /* renamed from: a */
    public AbstractC60720a f137968a;

    /* renamed from: com.ss.android.ugc.aweme.music.b.e$a */
    public interface AbstractC60720a {
        static {
            Covode.recordClassIndex(71276);
        }

        /* renamed from: a */
        void mo98145a(int i);
    }

    static {
        Covode.recordClassIndex(71275);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public final RecyclerView.ViewHolder mo60184a(ViewGroup viewGroup, int i) {
        Context context;
        if (viewGroup != null) {
            context = viewGroup.getContext();
        } else {
            context = null;
        }
        View a = C1764a.m5927a(LayoutInflater.from(context), R.layout.al6, viewGroup, false);
        C89219l.m154716b(a, "");
        return new C60721b(this, a);
    }

    /* renamed from: com.ss.android.ugc.aweme.music.b.e$b */
    public final class C60721b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final AvatarImageView f137969a;

        /* renamed from: b */
        public final TextView f137970b;

        /* renamed from: c */
        public final TextView f137971c;

        /* renamed from: d */
        public final ImageView f137972d;

        /* renamed from: e */
        public final ImageView f137973e;

        /* renamed from: f */
        final /* synthetic */ C60719e f137974f;

        static {
            Covode.recordClassIndex(71277);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60721b(C60719e eVar, final View view) {
            super(view);
            C89219l.m154721d(view, "");
            this.f137974f = eVar;
            View findViewById = view.findViewById(R.id.cnz);
            C89219l.m154716b(findViewById, "");
            this.f137969a = (AvatarImageView) findViewById;
            View findViewById2 = view.findViewById(R.id.co4);
            C89219l.m154716b(findViewById2, "");
            TextView textView = (TextView) findViewById2;
            this.f137970b = textView;
            TextPaint paint = textView.getPaint();
            C89219l.m154716b(paint, "");
            paint.setFakeBoldText(true);
            View findViewById3 = view.findViewById(R.id.co5);
            C89219l.m154716b(findViewById3, "");
            this.f137971c = (TextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.co0);
            C89219l.m154716b(findViewById4, "");
            this.f137972d = (ImageView) findViewById4;
            View findViewById5 = view.findViewById(R.id.cos);
            C89219l.m154716b(findViewById5, "");
            this.f137973e = (ImageView) findViewById5;
            C17235c.m31810a(view, 0.5f);
            view.setOnClickListener(new View.OnClickListener(this) {
                /* class com.p2082ss.android.ugc.aweme.music.p3465b.C60719e.C60721b.View$OnClickListenerC607221 */

                /* renamed from: a */
                final /* synthetic */ C60721b f137975a;

                static {
                    Covode.recordClassIndex(71278);
                }

                {
                    this.f137975a = r1;
                }

                public final void onClick(View view) {
                    AbstractC60720a aVar;
                    ClickAgent.onClick(view);
                    if (this.f137975a.f137974f.f137968a != null && !C58001a.m104815a(view, 1200) && (aVar = this.f137975a.f137974f.f137968a) != null) {
                        aVar.mo98145a(this.f137975a.getLayoutPosition());
                    }
                }
            });
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public final void mo60186a(RecyclerView.ViewHolder viewHolder, int i) {
        if (viewHolder instanceof C60721b) {
            C60721b bVar = (C60721b) viewHolder;
            List e = mo63369e();
            C89219l.m154716b(e, "");
            C89219l.m154721d(e, "");
            MusicOwnerInfo musicOwnerInfo = (MusicOwnerInfo) e.get(i);
            bVar.f137969a.mo61254a(musicOwnerInfo.getAvatar());
            C34577e.m70596a(bVar.f137969a, musicOwnerInfo.getAvatar(), bVar.f137969a.getControllerListener());
            if (MainServiceImpl.createIMainServicebyMonsterPlugin(false).shouldChangeToHandle("Sound")) {
                bVar.f137970b.setText(musicOwnerInfo.getNickName());
                bVar.f137971c.setText(musicOwnerInfo.getHandle());
                bVar.f137973e.setVisibility(8);
                bVar.f137972d.setVisibility(8);
                if (musicOwnerInfo.getVerified()) {
                    bVar.f137973e.setImageResource(2131232493);
                    bVar.f137973e.setVisibility(0);
                    return;
                }
                return;
            }
            bVar.f137970b.setText(musicOwnerInfo.getNickName());
            bVar.f137971c.setText("@" + musicOwnerInfo.getHandle());
            bVar.f137972d.setVisibility(8);
            if (musicOwnerInfo.getVerified()) {
                bVar.f137972d.setImageResource(2131232493);
                bVar.f137972d.setVisibility(0);
            }
        }
    }
}
