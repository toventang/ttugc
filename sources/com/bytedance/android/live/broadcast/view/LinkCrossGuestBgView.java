package com.bytedance.android.live.broadcast.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.C1764a;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.liveinteract.api.AbstractC4409b;
import com.bytedance.android.live.liveinteract.api.C4398al;
import com.bytedance.android.live.liveinteract.api.C4450t;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.p408u.C6203g;
import com.bytedance.android.livesdk.chatroom.p488c.C7398o;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p084a.p088b.C1862a;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

public final class LinkCrossGuestBgView extends FrameLayout {

    /* renamed from: a */
    private DataChannel f10339a;

    /* renamed from: b */
    private HashMap f10340b;

    static {
        Covode.recordClassIndex(4254);
    }

    public LinkCrossGuestBgView(Context context) {
        this(context, (AttributeSet) null, 6);
    }

    public LinkCrossGuestBgView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    /* renamed from: a */
    private View m9247a(int i) {
        if (this.f10340b == null) {
            this.f10340b = new HashMap();
        }
        View view = (View) this.f10340b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f10340b.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final DataChannel getDataChannel() {
        return this.f10339a;
    }

    public final void setDataChannel(DataChannel dataChannel) {
        this.f10339a = dataChannel;
    }

    public final void setTipText(String str) {
        C89219l.m154721d(str, "");
        LiveTextView liveTextView = (LiveTextView) m9247a(R.id.f60);
        C89219l.m154716b(liveTextView, "");
        liveTextView.setText(str);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private /* synthetic */ LinkCrossGuestBgView(Context context, AttributeSet attributeSet, int i) {
        this(context, (i & 2) != 0 ? null : attributeSet, (byte) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private LinkCrossGuestBgView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(8036);
        if (C6203g.m13470c()) {
            C1862a.m6032a(context, R.layout.be8, this, true);
        } else {
            C1764a.m5927a(LayoutInflater.from(context), R.layout.be8, this, true);
        }
        ((LiveTextView) m9247a(R.id.f60)).mo9623a(R.style.tr);
        ((LinearLayout) m9247a(R.id.a0y)).setOnClickListener(new View.OnClickListener(this) {
            /* class com.bytedance.android.live.broadcast.view.LinkCrossGuestBgView.View$OnClickListenerC37391 */

            /* renamed from: a */
            final /* synthetic */ LinkCrossGuestBgView f10341a;

            static {
                Covode.recordClassIndex(4255);
            }

            {
                this.f10341a = r1;
            }

            public final void onClick(View view) {
                DataChannel dataChannel;
                DataChannel dataChannel2 = this.f10341a.getDataChannel();
                if (dataChannel2 != null) {
                    dataChannel2.mo28320c(C4398al.class, "");
                }
                AbstractC2953a a = C6193a.m13435a(AbstractC4409b.class);
                C89219l.m154716b(a, "");
                if (!((AbstractC4409b) a).isInRandomLinkMic() && (dataChannel = this.f10341a.getDataChannel()) != null) {
                    dataChannel.mo28320c(C4450t.class, new C7398o(1));
                }
            }
        });
        MethodCollector.m26664o(8036);
    }
}
