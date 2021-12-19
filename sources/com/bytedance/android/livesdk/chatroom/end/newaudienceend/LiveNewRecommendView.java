package com.bytedance.android.livesdk.chatroom.end.newaudienceend;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.p253j.AbstractC4367a;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.chatroom.p492g.C7577g;
import com.bytedance.android.livesdk.utils.C11210ad;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

public class LiveNewRecommendView extends FrameLayout {

    /* renamed from: a */
    Context f18707a;

    /* renamed from: b */
    DataChannel f18708b;

    /* renamed from: c */
    List<View> f18709c = new ArrayList(4);

    /* renamed from: d */
    AbstractC7531a f18710d;

    /* renamed from: e */
    View f18711e;

    /* renamed from: f */
    private View.OnClickListener f18712f = new View$OnClickListenerC7552n(this);

    /* renamed from: com.bytedance.android.livesdk.chatroom.end.newaudienceend.LiveNewRecommendView$a */
    public interface AbstractC7531a {
        static {
            Covode.recordClassIndex(8304);
        }

        /* renamed from: e */
        void mo13785e();
    }

    static {
        Covode.recordClassIndex(8303);
    }

    /* renamed from: a */
    private void m15500a() {
        List<View> list = this.f18709c;
        if (list != null && list.size() == 4) {
            for (View view : this.f18709c) {
                view.setOnClickListener(this.f18712f);
            }
        }
    }

    public void setDataChannel(DataChannel dataChannel) {
        this.f18708b = dataChannel;
    }

    public void setIView(AbstractC7531a aVar) {
        this.f18710d = aVar;
    }

    public LiveNewRecommendView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(3485);
        this.f18707a = context;
        LayoutInflater.from(context).inflate(R.layout.bes, this);
        this.f18709c.add(findViewById(R.id.bqi));
        this.f18709c.add(findViewById(R.id.bqj));
        this.f18709c.add(findViewById(R.id.bqk));
        this.f18709c.add(findViewById(R.id.bql));
        this.f18711e = findViewById(R.id.amc);
        m15500a();
        MethodCollector.m26664o(3485);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo13782a(List<Room> list, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            View view = this.f18709c.get(i2);
            view.setVisibility(0);
            HSImageView hSImageView = (HSImageView) view.findViewById(R.id.dn2);
            ImageModel cover = list.get(i2).getCover();
            if (!((cover == null && (list.get(i2).getOwner() == null || (cover = list.get(i2).getOwner().getAvatarMedium()) == null)) || hSImageView == null)) {
                C7577g.m15575b(hSImageView, cover);
            }
            LiveTextView liveTextView = (LiveTextView) view.findViewById(R.id.dna);
            String title = list.get(i2).getTitle();
            if (title == null || title.length() == 0) {
                liveTextView.setVisibility(8);
            } else {
                liveTextView.setText(title);
            }
            LiveTextView liveTextView2 = (LiveTextView) view.findViewById(R.id.j7);
            String displayId = list.get(i2).getOwner().getDisplayId();
            if (displayId == null || displayId.length() == 0) {
                liveTextView2.setVisibility(8);
            } else {
                liveTextView2.setText(displayId);
            }
            ((LiveTextView) view.findViewById(R.id.dn1)).setText(C11210ad.m19867a((long) list.get(i2).getUserCount()));
            view.setOnClickListener(new View$OnClickListenerC7553o(this, list, i2));
            long followStatus = list.get(i2).getOwner().getFollowInfo().getFollowStatus();
            if (followStatus == 1 || followStatus == 2) {
                view.findViewById(R.id.b7g).setVisibility(0);
                if (C3966y.m9672g()) {
                    view.findViewById(R.id.b7g).setBackgroundResource(R.drawable.bsl);
                }
                if (C3966y.m9672g()) {
                    view.findViewById(R.id.cb4).setBackgroundResource(R.drawable.bst);
                } else {
                    view.findViewById(R.id.cb4).setBackgroundResource(R.drawable.bss);
                }
            }
            AbstractC4367a aVar = (AbstractC4367a) C6193a.m13435a(AbstractC4367a.class);
            if (aVar != null && aVar.isMicRoomForRoom(list.get(i2))) {
                if (followStatus == 1 || followStatus == 2) {
                    ((TextView) view.findViewById(R.id.cb4)).setText(R.string.e50);
                } else {
                    ((TextView) view.findViewById(R.id.cb4)).setText(R.string.ebr);
                }
                if (!(list.get(i2).officialChannelInfo == null || list.get(i2).officialChannelInfo.f23136a == null)) {
                    liveTextView.setText(list.get(i2).officialChannelInfo.f23137b);
                    liveTextView2.setText(list.get(i2).officialChannelInfo.f23136a.getDisplayId());
                }
            }
            view.setTag(list.get(i2));
            C7541h.m15520a(list.get(i2), this.f18708b);
        }
    }
}
