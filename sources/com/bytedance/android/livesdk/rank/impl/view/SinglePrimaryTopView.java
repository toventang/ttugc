package com.bytedance.android.livesdk.rank.impl.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.C1764a;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.p218f.C3941k;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.chatroom.p492g.C7577g;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.rank.api.EnumC10345i;
import com.bytedance.android.livesdk.rank.impl.api.model.Rank;
import com.bytedance.android.livesdk.rank.impl.p611d.C10387b;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdk.widget.ComboView;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

public final class SinglePrimaryTopView extends LinearLayout {

    /* renamed from: a */
    private HashMap f25516a;

    static {
        Covode.recordClassIndex(12152);
    }

    public SinglePrimaryTopView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: a */
    private View m19151a(int i) {
        if (this.f25516a == null) {
            this.f25516a = new HashMap();
        }
        View view = (View) this.f25516a.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f25516a.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.view.SinglePrimaryTopView$a */
    static final class View$OnClickListenerC10568a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f25517a;

        /* renamed from: b */
        final /* synthetic */ Rank f25518b;

        static {
            Covode.recordClassIndex(12153);
        }

        View$OnClickListenerC10568a(AbstractC89172b bVar, Rank rank) {
            this.f25517a = bVar;
            this.f25518b = rank;
        }

        public final void onClick(View view) {
            this.f25517a.invoke(this.f25518b);
        }
    }

    private /* synthetic */ SinglePrimaryTopView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    private SinglePrimaryTopView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(718);
        C1764a.m5927a(LayoutInflater.from(context), R.layout.bd1, this, true);
        setGravity(81);
        MethodCollector.m26664o(718);
    }

    /* renamed from: a */
    public final void mo17485a(String str, DataChannel dataChannel, Rank rank, boolean z, boolean z2, AbstractC89172b<? super Rank, C89391z> bVar) {
        float f;
        float f2;
        String scoreDescription;
        long j;
        Room room;
        C89219l.m154721d(str, "");
        C89219l.m154721d(bVar, "");
        if (rank != null) {
            Context context = getContext();
            if (z) {
                f = 56.0f;
            } else {
                f = 48.0f;
            }
            int b = (int) C13628n.m24520b(context, f);
            ImageView imageView = (ImageView) m19151a(R.id.f__);
            C89219l.m154716b(imageView, "");
            ImageView imageView2 = (ImageView) m19151a(R.id.f__);
            C89219l.m154716b(imageView2, "");
            ViewGroup.LayoutParams layoutParams = imageView2.getLayoutParams();
            layoutParams.width = b;
            layoutParams.height = b;
            imageView.setLayoutParams(layoutParams);
            View a = m19151a(R.id.cif);
            C89219l.m154716b(a, "");
            View a2 = m19151a(R.id.cif);
            C89219l.m154716b(a2, "");
            ViewGroup.LayoutParams layoutParams2 = a2.getLayoutParams();
            layoutParams2.width = b;
            layoutParams2.height = b;
            a.setLayoutParams(layoutParams2);
            HSImageView hSImageView = (HSImageView) m19151a(R.id.bss);
            C89219l.m154716b(hSImageView, "");
            HSImageView hSImageView2 = (HSImageView) m19151a(R.id.bss);
            C89219l.m154716b(hSImageView2, "");
            ViewGroup.LayoutParams layoutParams3 = hSImageView2.getLayoutParams();
            Context context2 = getContext();
            if (z) {
                f2 = 7.0f;
            } else {
                f2 = 6.0f;
            }
            layoutParams3.width = b + ((int) C13628n.m24520b(context2, f2));
            layoutParams3.height = layoutParams3.width;
            hSImageView.setLayoutParams(layoutParams3);
            LiveTextView liveTextView = (LiveTextView) m19151a(R.id.fab);
            C89219l.m154716b(liveTextView, "");
            if (C89219l.m154714a((Object) str, (Object) EnumC10345i.HOURLY_RANK.getRankName())) {
                if (dataChannel == null || (room = (Room) dataChannel.mo28318b(C9093de.class)) == null) {
                    j = 0;
                } else {
                    j = room.getOwnerUserId();
                }
                scoreDescription = C10387b.m18895a().mo17278a(j, rank.getScore(), rank.getScoreDescription());
            } else {
                scoreDescription = rank.getScoreDescription();
            }
            liveTextView.setText(scoreDescription);
            LiveTextView liveTextView2 = (LiveTextView) m19151a(R.id.fa1);
            C89219l.m154716b(liveTextView2, "");
            liveTextView2.setText(rank.getUser().displayId);
            if (!z2) {
                C11279p.m20002a((TextView) m19151a(R.id.fa1), (int) R.color.xm);
                C11279p.m20002a((TextView) m19151a(R.id.fab), (int) R.color.xl);
            }
            ImageModel avatarThumb = rank.getUser().getAvatarThumb();
            ImageView imageView3 = (ImageView) m19151a(R.id.f__);
            C89219l.m154716b(imageView3, "");
            int width = imageView3.getWidth();
            ImageView imageView4 = (ImageView) m19151a(R.id.f__);
            C89219l.m154716b(imageView4, "");
            C7577g.m15571a((ImageView) m19151a(R.id.f__), avatarThumb, width, imageView4.getHeight(), 2131234742);
            if (rank.getRoomId() > 0) {
                C3941k.m9600a((HSImageView) m19151a(R.id.bss), 2131234853);
                C3941k.m9607a((HSImageView) m19151a(R.id.by4), "tiktok_live_basic_resource", "ttlive_item_rank_top_on_going_hd.webp");
            } else {
                C13628n.m24510a(m19151a(R.id.by4), 8);
                HSImageView hSImageView3 = (HSImageView) m19151a(R.id.bss);
                C89219l.m154716b(hSImageView3, "");
                hSImageView3.setVisibility(8);
            }
            setOnClickListener(new View$OnClickListenerC10568a(bVar, rank));
            if (z2 && rank.getRank() == 1 && rank.getComboBadge() != null && rank.getComboCount() > 1) {
                ComboView comboView = (ComboView) m19151a(R.id.a8e);
                C89219l.m154716b(comboView, "");
                comboView.setVisibility(0);
                ((ComboView) m19151a(R.id.a8e)).mo18155a(rank.getComboBadge(), rank.getComboCount());
            }
        }
    }
}
