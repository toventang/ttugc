package com.bytedance.android.livesdk.chatroom.p499ui.p501b;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.widget.StateLayout;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.live.p209c.C3809d;
import com.bytedance.android.livesdk.AbstractC11293v;
import com.bytedance.android.livesdk.chatroom.api.DecorationApi;
import com.bytedance.android.livesdk.chatroom.model.C7695o;
import com.bytedance.android.livesdk.chatroom.p488c.C7369ab;
import com.bytedance.android.livesdk.model.C9537au;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.util.rxutils.C11191f;
import com.bytedance.android.livesdk.util.rxutils.C11195i;
import com.bytedance.android.livesdk.util.rxutils.p651b.EnumC11186b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.b.a */
public final class C7778a extends AbstractC11293v {

    /* renamed from: b */
    public static final C7779a f19299b = new C7779a((byte) 0);

    /* renamed from: a */
    C7785d f19300a;

    /* renamed from: c */
    private AbstractC89172b<? super C9537au, C89391z> f19301c = new C7782d(this);

    /* renamed from: d */
    private HashMap f19302d;

    static {
        Covode.recordClassIndex(8573);
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: a */
    public final void mo8165a() {
        HashMap hashMap = this.f19302d;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: a_ */
    public final View mo8166a_(int i) {
        if (this.f19302d == null) {
            this.f19302d = new HashMap();
        }
        View view = (View) this.f19302d.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f19302d.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo8165a();
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.b.a$a */
    public static final class C7779a {
        static {
            Covode.recordClassIndex(8574);
        }

        private C7779a() {
        }

        public /* synthetic */ C7779a(byte b) {
            this();
        }
    }

    /* renamed from: d */
    private static boolean m15843d() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: b */
    public final AbstractC11293v.C11295b mo8355b() {
        AbstractC11293v.C11295b bVar = new AbstractC11293v.C11295b(R.layout.b6x);
        bVar.f27020g = 80;
        bVar.f27023j = 50;
        return bVar;
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.b.a$c */
    static final class C7781c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C7778a f19304a;

        static {
            Covode.recordClassIndex(8576);
        }

        C7781c(C7778a aVar) {
            this.f19304a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            ((StateLayout) this.f19304a.mo8166a_(R.id.e9d)).mo9406a("ERROR");
            C3854a.m9453a(6, "LiveStickerPropsDialog", "failed to fetch stickers!");
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.b.a$b */
    static final class C7780b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C7778a f19303a;

        static {
            Covode.recordClassIndex(8575);
        }

        C7780b(C7778a aVar) {
            this.f19303a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C7778a aVar = this.f19303a;
            Object obj2 = ((C5832d) obj).data;
            C89219l.m154716b(obj2, "");
            C7695o oVar = (C7695o) obj2;
            ((StateLayout) aVar.mo8166a_(R.id.e9d)).mo9406a("CONTENT");
            C7785d dVar = aVar.f19300a;
            if (dVar == null) {
                C89219l.m154710a("mAdapter");
            }
            List<? extends C9537au> list = oVar.f19075b;
            if (list != null) {
                dVar.f19309a.addAll(list);
            }
            dVar.notifyDataSetChanged();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.b.a$d */
    static final class C7782d extends AbstractC89220m implements AbstractC89172b<C9537au, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C7778a f19305a;

        static {
            Covode.recordClassIndex(8577);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7782d(C7778a aVar) {
            super(1);
            this.f19305a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C9537au auVar) {
            C9537au auVar2;
            C9537au auVar3 = auVar;
            C89219l.m154721d(auVar3, "");
            C6779a.m14563a().mo13053a(new C7369ab(auVar3));
            DataChannel dataChannel = this.f19305a.f27010p;
            DataChannel dataChannel2 = this.f19305a.f27010p;
            if (dataChannel2 != null) {
                auVar2 = (C9537au) dataChannel2.mo28318b(C3809d.class);
            } else {
                auVar2 = null;
            }
            C7784c.m15847a(dataChannel, auVar2);
            C7784c.f19306a = SystemClock.elapsedRealtime();
            DataChannel dataChannel3 = this.f19305a.f27010p;
            if (dataChannel3 != null) {
                dataChannel3.mo28311a(C3809d.class, auVar3);
            }
            int i = auVar3.f23165g;
            if (i == 1) {
                C6501b.C6502a.m13948a("livesdk_live_character_prop_select").mo12643a(this.f19305a.f27010p).mo12646a("prop_id", auVar3.f23166h).mo12651a("words", auVar3.f23162d).mo12655b();
            } else if (i == 2) {
                C6501b.C6502a.m13948a("livesdk_live_picture_prop_select").mo12643a(this.f19305a.f27010p).mo12646a("prop_id", auVar3.f23166h).mo12655b();
            }
            this.f19305a.dismiss();
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        this.f19300a = new C7785d(this.f19301c);
        RecyclerView recyclerView = (RecyclerView) mo8166a_(R.id.da_);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new GridLayoutManager(4));
        C7785d dVar = this.f19300a;
        if (dVar == null) {
            C89219l.m154710a("mAdapter");
        }
        recyclerView.setAdapter(dVar);
        recyclerView.mo4402a(new C7783b());
        ((StateLayout) mo8166a_(R.id.e9d)).mo9406a("LOADING");
        getContext();
        if (!C58029j.f132253e || !C58029j.m104846b() || C58029j.m104847c()) {
            C58029j.f132253e = m15843d();
        }
        if (!C58029j.f132253e) {
            ((StateLayout) mo8166a_(R.id.e9d)).mo9406a("OFFLINE");
        } else {
            ((DecorationApi) C5805e.m12718a().mo11572a(DecorationApi.class)).fetchStickerList().mo143271a(new C11191f()).mo143271a(C11195i.m19838a(this, EnumC11186b.DESTROY)).mo143254a(new C7780b(this), new C7781c(this));
        }
    }
}
