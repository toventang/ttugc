package com.bytedance.android.livesdk.hashtag;

import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.design.widget.LiveRadioButton;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.livesdk.model.GameTag;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p425aa.C6519c;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6805b;
import com.bytedance.android.livesdk.p452ao.C6806c;
import com.bytedance.android.livesdk.p561j.C9023aq;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.util.rxutils.C11191f;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;
import java.util.Map;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.hashtag.l */
public final class C8967l extends RecyclerView.ViewHolder {

    /* renamed from: a */
    final ImageView f22070a;

    /* renamed from: b */
    final LiveTextView f22071b;

    /* renamed from: c */
    final LiveRadioButton f22072c;

    static {
        Covode.recordClassIndex(9859);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8967l(View view) {
        super(view);
        C89219l.m154721d(view, "");
        View findViewById = view.findViewById(R.id.eep);
        C89219l.m154716b(findViewById, "");
        this.f22070a = (ImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.eel);
        C89219l.m154716b(findViewById2, "");
        this.f22071b = (LiveTextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.eeu);
        C89219l.m154716b(findViewById3, "");
        this.f22072c = (LiveRadioButton) findViewById3;
    }

    /* renamed from: com.bytedance.android.livesdk.hashtag.l$a */
    static final class View$OnClickListenerC8968a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LiveRadioButton f22073a;

        /* renamed from: b */
        final /* synthetic */ boolean f22074b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89171a f22075c;

        /* renamed from: d */
        final /* synthetic */ DataChannel f22076d;

        /* renamed from: e */
        final /* synthetic */ Hashtag f22077e;

        /* renamed from: f */
        final /* synthetic */ AbstractC89172b f22078f;

        static {
            Covode.recordClassIndex(9860);
        }

        View$OnClickListenerC8968a(LiveRadioButton liveRadioButton, boolean z, AbstractC89171a aVar, DataChannel dataChannel, Hashtag hashtag, AbstractC89172b bVar) {
            this.f22073a = liveRadioButton;
            this.f22074b = z;
            this.f22075c = aVar;
            this.f22076d = dataChannel;
            this.f22077e = hashtag;
            this.f22078f = bVar;
        }

        public final void onClick(View view) {
            Room room;
            long j;
            Long l;
            Long l2;
            if (this.f22074b) {
                this.f22073a.setChecked(true);
                this.f22075c.invoke();
                DataChannel dataChannel = this.f22076d;
                if (dataChannel != null) {
                    dataChannel.mo28315b(C9023aq.class, this.f22077e);
                }
                this.f22078f.invoke(this.f22077e);
                return;
            }
            DataChannel dataChannel2 = this.f22076d;
            Long l3 = null;
            if (dataChannel2 != null) {
                room = (Room) dataChannel2.mo28318b(C9093de.class);
            } else {
                room = null;
            }
            C6805b<Map<String, String>> bVar = AbstractC6804a.f17017cM;
            C89219l.m154716b(bVar, "");
            GameTag a = GameTag.C9511a.m17802a(bVar.mo13066a());
            if (a == null || (l2 = a.f23082id) == null) {
                j = 0;
            } else {
                j = l2.longValue();
            }
            HashtagApi hashtagApi = (HashtagApi) C5805e.m12718a().mo11572a(HashtagApi.class);
            if (room != null) {
                l = Long.valueOf(room.getId());
                l3 = Long.valueOf(room.getOwnerUserId());
            } else {
                l = null;
            }
            hashtagApi.setHashtag(l, l3, this.f22077e.f23083id, Long.valueOf(j)).mo143271a(new C11191f()).mo143254a(new AbstractC88433f(this) {
                /* class com.bytedance.android.livesdk.hashtag.C8967l.View$OnClickListenerC8968a.C89691 */

                /* renamed from: a */
                final /* synthetic */ View$OnClickListenerC8968a f22079a;

                static {
                    Covode.recordClassIndex(9861);
                }

                {
                    this.f22079a = r1;
                }

                @Override // p4560f.p4561a.p4567d.AbstractC88433f
                public final /* synthetic */ void accept(Object obj) {
                    this.f22079a.f22073a.setChecked(true);
                    this.f22079a.f22075c.invoke();
                    DataChannel dataChannel = this.f22079a.f22076d;
                    if (dataChannel != null) {
                        dataChannel.mo28315b(C9023aq.class, this.f22079a.f22077e);
                    }
                    C6805b<Long> bVar = AbstractC6804a.f17049cw;
                    C89219l.m154716b(bVar, "");
                    C6806c.m14603a(bVar, this.f22079a.f22077e.f23083id);
                    C6805b<String> bVar2 = AbstractC6804a.f17050cx;
                    C89219l.m154716b(bVar2, "");
                    C6806c.m14603a(bVar2, this.f22079a.f22077e.title);
                    this.f22079a.f22078f.invoke(this.f22079a.f22077e);
                    C6519c.m13965a(C6501b.C6502a.m13948a("livesdk_anchor_more_topic_choose").mo12643a(this.f22079a.f22076d).mo12654b("live_take"), this.f22079a.f22076d).mo12655b();
                }
            }, new AbstractC88433f(this) {
                /* class com.bytedance.android.livesdk.hashtag.C8967l.View$OnClickListenerC8968a.C89702 */

                /* renamed from: a */
                final /* synthetic */ View$OnClickListenerC8968a f22080a;

                static {
                    Covode.recordClassIndex(9862);
                }

                {
                    this.f22080a = r1;
                }

                @Override // p4560f.p4561a.p4567d.AbstractC88433f
                public final /* synthetic */ void accept(Object obj) {
                    C3854a.m9453a(6, "HashtagAnchorDialog", "failed to set topics!");
                    this.f22080a.f22078f.invoke(this.f22080a.f22077e);
                }
            });
        }
    }
}
