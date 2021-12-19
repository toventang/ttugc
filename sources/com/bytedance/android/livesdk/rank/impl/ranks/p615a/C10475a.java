package com.bytedance.android.livesdk.rank.impl.ranks.p615a;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.AbstractC0976n;
import androidx.fragment.app.DialogInterface$OnCancelListenerC0944d;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.livesdk.AbstractC11293v;
import com.bytedance.android.livesdk.p561j.C9076co;
import com.bytedance.android.livesdk.rank.api.EnumC10345i;
import com.bytedance.android.livesdk.rank.impl.C10411f;
import com.bytedance.android.livesdk.rank.impl.C10471h;
import com.bytedance.android.livesdk.rank.impl.api.model.EnumC10367d;
import com.bytedance.android.livesdk.rank.impl.ranks.p615a.C10480b;
import com.bytedance.android.livesdk.utils.C11221ak;
import com.bytedance.android.livesdk.utils.C11227ap;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.rank.impl.ranks.a.a */
public final class C10475a extends AbstractC11293v {

    /* renamed from: a */
    public static final C10476a f25219a = new C10476a((byte) 0);

    /* renamed from: b */
    private boolean f25220b;

    /* renamed from: c */
    private long f25221c;

    /* renamed from: d */
    private long f25222d;

    /* renamed from: e */
    private ArrayList<Integer> f25223e;

    /* renamed from: f */
    private int f25224f = EnumC10345i.HOURLY_RANK.getType();

    /* renamed from: g */
    private C10480b f25225g;

    /* renamed from: h */
    private C10480b f25226h;

    /* renamed from: i */
    private Fragment f25227i;

    /* renamed from: j */
    private final C11221ak.EnumC11222a f25228j = C11221ak.EnumC11222a.PANEL_HOURLY;

    /* renamed from: k */
    private HashMap f25229k;

    static {
        Covode.recordClassIndex(12050);
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: a */
    public final void mo8165a() {
        HashMap hashMap = this.f25229k;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: a_ */
    public final View mo8166a_(int i) {
        if (this.f25229k == null) {
            this.f25229k = new HashMap();
        }
        View view = (View) this.f25229k.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f25229k.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo8165a();
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.ranks.a.a$a */
    public static final class C10476a {
        static {
            Covode.recordClassIndex(12051);
        }

        private C10476a() {
        }

        public /* synthetic */ C10476a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: c_ */
    public final C11221ak.EnumC11222a mo9928c_() {
        return this.f25228j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.rank.impl.ranks.a.a$b */
    public static final /* synthetic */ class C10477b extends C89217j implements AbstractC89171a<C89391z> {
        static {
            Covode.recordClassIndex(12052);
        }

        C10477b(C10475a aVar) {
            super(0, aVar, C10475a.class, "dismiss", "dismiss()V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            ((DialogInterface$OnCancelListenerC0944d) this.receiver).dismiss();
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.rank.impl.ranks.a.a$c */
    public static final /* synthetic */ class C10478c extends C89217j implements AbstractC89171a<C89391z> {
        static {
            Covode.recordClassIndex(12053);
        }

        C10478c(C10475a aVar) {
            super(0, aVar, C10475a.class, "dismiss", "dismiss()V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            ((DialogInterface$OnCancelListenerC0944d) this.receiver).dismiss();
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: b */
    public final AbstractC11293v.C11295b mo8355b() {
        Boolean bool;
        int i;
        int i2;
        int i3;
        int d;
        DataChannel dataChannel = this.f27010p;
        if (dataChannel != null) {
            bool = (Boolean) dataChannel.mo28318b(C9076co.class);
        } else {
            bool = null;
        }
        this.f25220b = C11279p.m20027d(bool);
        if (this.f25220b) {
            i = R.layout.b72;
        } else {
            i = R.layout.b73;
        }
        AbstractC11293v.C11295b bVar = new AbstractC11293v.C11295b(i);
        if (this.f25220b) {
            i2 = R.style.a28;
        } else {
            i2 = R.style.a29;
        }
        bVar.f27015b = i2;
        if (this.f25220b) {
            i3 = 80;
        } else {
            i3 = 5;
        }
        bVar.f27020g = i3;
        bVar.f27019f = 0.0f;
        int i4 = -1;
        if (this.f25220b) {
            d = -1;
        } else {
            d = C3966y.m9667d(R.dimen.wl);
        }
        bVar.f27021h = d;
        if (this.f25220b) {
            i4 = (C11227ap.m19886a(getContext()) * 480) / 375;
        }
        bVar.f27022i = i4;
        return bVar;
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.ranks.a.a$d */
    static final class C10479d extends AbstractC89220m implements AbstractC89172b<Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C10475a f25230a;

        static {
            Covode.recordClassIndex(12054);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10479d(C10475a aVar) {
            super(1);
            this.f25230a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Integer num) {
            int intValue = num.intValue();
            DataChannel dataChannel = this.f25230a.f27010p;
            if (dataChannel != null) {
                dataChannel.mo28311a(C10411f.class, (Object) true);
            }
            this.f25230a.mo17315a(intValue, true);
            return C89391z.f203057a;
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int value;
        Integer num;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f25221c = arguments.getLong("arg_anchor_id");
            this.f25222d = arguments.getLong("arg_room_id");
            this.f25224f = arguments.getInt("first_show_rank_type");
            ArrayList<Integer> integerArrayList = arguments.getIntegerArrayList("rank_types");
            if (integerArrayList == null) {
                integerArrayList = (ArrayList) C89070n.m154524c(Integer.valueOf(EnumC10345i.HOURLY_RANK.getType()));
            }
            this.f25223e = integerArrayList;
        }
        DataChannel dataChannel = this.f27010p;
        if (dataChannel != null) {
            dataChannel.mo28309a((AbstractC1204m) this, C10471h.class, (AbstractC89172b) new C10479d(this));
        }
        DataChannel dataChannel2 = this.f27010p;
        if (dataChannel2 == null || (num = (Integer) dataChannel2.mo28318b(C10471h.class)) == null) {
            value = EnumC10367d.UNKNOWN.getValue();
        } else {
            value = num.intValue();
        }
        mo17315a(value, false);
        DataChannel dataChannel3 = this.f27010p;
        if (dataChannel3 != null) {
            dataChannel3.mo28311a(C10411f.class, (Object) false);
        }
    }

    /* renamed from: a */
    public final void mo17315a(int i, boolean z) {
        C10480b bVar;
        boolean z2;
        if (i == EnumC10367d.ANCHOR.getValue()) {
            if (this.f25226h == null) {
                long j = this.f25221c;
                long j2 = this.f25222d;
                ArrayList<Integer> arrayList = this.f25223e;
                if (arrayList == null) {
                    C89219l.m154710a("mRankTypes");
                }
                this.f25226h = C10480b.C10481a.m19006a(j, j2, arrayList, this.f25224f, i, new C10477b(this));
            }
            bVar = this.f25226h;
        } else {
            if (this.f25225g == null) {
                long j3 = this.f25221c;
                long j4 = this.f25222d;
                ArrayList<Integer> arrayList2 = this.f25223e;
                if (arrayList2 == null) {
                    C89219l.m154710a("mRankTypes");
                }
                this.f25225g = C10480b.C10481a.m19006a(j3, j4, arrayList2, this.f25224f, i, new C10478c(this));
            }
            bVar = this.f25225g;
        }
        if (bVar == null) {
            C89219l.m154715b();
        }
        this.f25227i = bVar;
        if (i == EnumC10367d.ANCHOR.getValue()) {
            z2 = true;
        } else {
            z2 = false;
        }
        AbstractC0976n a = getChildFragmentManager().mo3552a();
        if (z) {
            if (z2) {
                a.mo3451a(R.anim.er, R.anim.en);
            } else {
                a.mo3451a(R.anim.em, R.anim.es);
            }
        }
        Fragment fragment = this.f25227i;
        if (fragment != null) {
            a.mo3469b(R.id.b82, fragment).mo3467b();
        }
    }
}
