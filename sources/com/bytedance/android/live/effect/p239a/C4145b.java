package com.bytedance.android.live.effect.p239a;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.C1764a;
import com.bytedance.android.live.effect.p242c.C4199e;
import com.bytedance.android.livesdk.p643ui.C10935a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.effect.a.b */
public final class C4145b extends C10935a {

    /* renamed from: a */
    public static final C4146a f11581a = new C4146a((byte) 0);

    /* renamed from: b */
    private HashMap f11582b;

    static {
        Covode.recordClassIndex(4712);
    }

    /* renamed from: com.bytedance.android.live.effect.a.b$a */
    public static final class C4146a {
        static {
            Covode.recordClassIndex(4713);
        }

        private C4146a() {
        }

        public /* synthetic */ C4146a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f11582b;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        getChildFragmentManager().mo3552a().mo3453a(R.id.b1v, new C4199e()).mo3478e();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.b8z, viewGroup, false);
    }
}
