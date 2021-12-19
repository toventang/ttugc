package com.bytedance.android.livesdk.chatroom.end;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.android.live.base.model.user.AbstractC2994b;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.p172a.p173a.p175b.C2912a;
import com.bytedance.android.livesdk.chatroom.end.C7523g;
import com.bytedance.android.livesdk.model.C9540ax;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p450an.C6782a;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p456as.C6873g;
import com.bytedance.android.livesdk.p456as.C6876j;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdk.widget.VHeadView;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.p686b.C11688a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p4560f.p4561a.AbstractC88406ae;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;

public class TopFansLayout extends LinearLayout implements C7523g.AbstractC7525a, AbstractC33974au {

    /* renamed from: a */
    List<C9540ax> f18632a;

    /* renamed from: b */
    public List<C7510b> f18633b = new ArrayList();

    /* renamed from: c */
    public final C88411a f18634c = new C88411a();

    /* renamed from: d */
    Activity f18635d;

    /* renamed from: e */
    Fragment f18636e;

    /* renamed from: f */
    public Room f18637f;

    /* renamed from: g */
    View.OnClickListener f18638g;

    /* renamed from: h */
    public C7523g f18639h;

    /* renamed from: i */
    public String f18640i;

    /* renamed from: j */
    public View f18641j = null;

    /* renamed from: k */
    public boolean f18642k = true;

    /* renamed from: l */
    View.OnClickListener f18643l = new View.OnClickListener() {
        /* class com.bytedance.android.livesdk.chatroom.end.TopFansLayout.View$OnClickListenerC75073 */

        static {
            Covode.recordClassIndex(8279);
        }

        public final void onClick(View view) {
            C9540ax axVar;
            User user;
            if (view.getId() == R.id.bvr && (user = (axVar = (C9540ax) view.getTag(R.id.epo)).f23188b) != null) {
                TopFansLayout.this.f18641j = view;
                if (!C11115u.m19743a().mo17915b().mo13165e()) {
                    AbstractC6872f b = C11115u.m19743a().mo17915b();
                    Context context = TopFansLayout.this.getContext();
                    C6876j.C6877a a = C6876j.m14732a();
                    a.f17232a = C6782a.m14569a();
                    a.f17233b = C6782a.m14570b();
                    a.f17236e = "live_detail";
                    a.f17237f = "follow";
                    a.f17235d = "live";
                    a.f17234c = 1;
                    b.mo13149a(context, a.mo13173a()).mo143062b(new C6873g<AbstractC2994b>() {
                        /* class com.bytedance.android.livesdk.chatroom.end.TopFansLayout.View$OnClickListenerC75073.C75081 */

                        static {
                            Covode.recordClassIndex(8280);
                        }

                        @Override // p4560f.p4561a.AbstractC88986z, com.bytedance.android.livesdk.p456as.C6873g, p4560f.p4561a.AbstractC88406ae
                        public final void onSubscribe(AbstractC88412b bVar) {
                            super.onSubscribe(bVar);
                            TopFansLayout.this.f18634c.mo142945a(bVar);
                        }
                    });
                    return;
                }
                TopFansLayout.this.f18639h.mo13777a(user.getId(), TopFansLayout.this.f18637f, TopFansLayout.this.f18640i, TopFansLayout.this);
                TopFansLayout.m15464a("pm_live_take_anchor_follow_audience", axVar);
            }
        }
    };

    /* renamed from: m */
    private AbstractC7509a f18644m;

    /* renamed from: n */
    private DataChannel f18645n;

    /* renamed from: com.bytedance.android.livesdk.chatroom.end.TopFansLayout$a */
    public interface AbstractC7509a {
        static {
            Covode.recordClassIndex(8281);
        }
    }

    static {
        Covode.recordClassIndex(8276);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public void onDestroy() {
        this.f18634c.mo142944a();
        this.f18639h.f18694a.mo142944a();
    }

    /* renamed from: a */
    public final void mo13759a() {
        for (C7510b bVar : this.f18633b) {
            final User user = ((C9540ax) bVar.f18653c.getTag(R.id.epo)).f23188b;
            C11115u.m19743a().mo17915b().mo13160b(user.getId()).mo116431a_(new AbstractC88406ae<AbstractC2994b>() {
                /* class com.bytedance.android.livesdk.chatroom.end.TopFansLayout.C75062 */

                static {
                    Covode.recordClassIndex(8278);
                }

                @Override // p4560f.p4561a.AbstractC88406ae
                public final void onError(Throwable th) {
                }

                @Override // p4560f.p4561a.AbstractC88406ae
                public final void onSubscribe(AbstractC88412b bVar) {
                    TopFansLayout.this.f18634c.mo142945a(bVar);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4560f.p4561a.AbstractC88406ae
                public final /* synthetic */ void onSuccess(AbstractC2994b bVar) {
                    if (!TopFansLayout.this.f18633b.isEmpty()) {
                        for (C7510b bVar2 : TopFansLayout.this.f18633b) {
                            C9540ax axVar = (C9540ax) bVar2.f18653c.getTag(R.id.epo);
                            User user = axVar.f23188b;
                            if (user != null && user.getId() == user.getId()) {
                                axVar.f23188b = User.from(user);
                                bVar2.f18653c.setTag(R.id.epo, axVar);
                                bVar2.f18651a.setTag(R.id.epo, axVar);
                                if (user.getId() == C11115u.m19743a().mo17915b().mo13161c() || user.isFollowing() || !TopFansLayout.this.f18642k) {
                                    bVar2.f18651a.setVisibility(8);
                                    return;
                                } else {
                                    bVar2.f18651a.setVisibility(0);
                                    return;
                                }
                            }
                        }
                    }
                }
            });
        }
    }

    public void setDataChannel(DataChannel dataChannel) {
        this.f18645n = dataChannel;
    }

    public void setFollowVisible(boolean z) {
        this.f18642k = z;
    }

    public void setTopFansCallBack(AbstractC7509a aVar) {
        this.f18644m = aVar;
    }

    @Override // com.bytedance.android.livesdk.chatroom.end.C7523g.AbstractC7525a
    /* renamed from: a */
    public final void mo13760a(C11688a aVar) {
        if (this.f18635d != null) {
            View view = this.f18641j;
            if (view != null && view.getVisibility() == 0) {
                this.f18641j.setVisibility(8);
            }
            C11226ao.m19882a(this.f18635d, (int) R.string.gno);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.end.TopFansLayout$b */
    static class C7510b {

        /* renamed from: a */
        public View f18651a;

        /* renamed from: b */
        public View f18652b;

        /* renamed from: c */
        public VHeadView f18653c;

        /* renamed from: d */
        public TextView f18654d;

        /* renamed from: e */
        public TextView f18655e;

        static {
            Covode.recordClassIndex(8282);
        }

        private C7510b(View view) {
            this.f18652b = view;
            this.f18651a = view.findViewById(R.id.bvr);
            this.f18653c = (VHeadView) view.findViewById(R.id.bdw);
            this.f18654d = (TextView) view.findViewById(R.id.em_);
            this.f18655e = (TextView) view.findViewById(R.id.em9);
        }

        /* synthetic */ C7510b(View view, byte b) {
            this(view);
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.end.C7523g.AbstractC7525a
    /* renamed from: a */
    public final void mo13761a(Throwable th) {
        Activity activity = this.f18635d;
        if (activity != null && th != null) {
            if (th instanceof C2912a) {
                C11226ao.m19883a(activity, ((C2912a) th).getPrompt(), 0);
            } else {
                C11226ao.m19882a(activity, (int) R.string.gnn);
            }
        }
    }

    public TopFansLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(3730);
        MethodCollector.m26664o(3730);
    }

    /* renamed from: a */
    public static void m15464a(String str, C9540ax axVar) {
        String str2;
        if (!TextUtils.isEmpty(str) && axVar != null) {
            if (axVar.f23189c == 1) {
                str2 = "no.1";
            } else if (axVar.f23189c == 2) {
                str2 = "no.2";
            } else {
                str2 = "no.3";
            }
            HashMap hashMap = new HashMap();
            hashMap.put("event_belong", "live_take");
            hashMap.put("event_type", "click");
            hashMap.put("event_page", "anchor_live_ending");
            hashMap.put("people", str2);
            C6501b.C6502a.m13948a(str).mo12652a((Map<String, String>) hashMap).mo12655b();
        }
    }
}
